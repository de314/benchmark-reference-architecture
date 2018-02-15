package com.bettercloud.perftest.streams.services;

import lombok.Data;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

@Data
public class LatencyDataService implements DataService {

    private final long maxLatency;
    private final long minLatency;
    private final long latencySpread;
    private final double batchOptimizationRatio;
    private final boolean noop;
    private Random rand;
    private AtomicLong accumulatedLatency;

    public LatencyDataService(long maxLatency, long minLatency, double batchOptimizationRatio, boolean noop) {
        this.maxLatency = maxLatency;
        this.minLatency = minLatency;
        this.noop = noop;
        this.latencySpread = maxLatency - minLatency;
        this.batchOptimizationRatio = batchOptimizationRatio;
        this.accumulatedLatency = new AtomicLong(0L);

        reset(0L);
    }

    @Override
    public void reset(long seed) {
        rand = new Random(seed);
        accumulatedLatency.set(0L);
    }

    private long getRandomLatency() {
        return (long) (rand.nextDouble() * latencySpread + minLatency);
    }

    @Override
    public void process(Object datum) {
        long randomLatency = getRandomLatency();
        accumulatedLatency.addAndGet(randomLatency);
        if (!noop) {
            try {
                Thread.sleep(randomLatency);
            } catch (InterruptedException e) { }
        }
    }

    private long getRandomLatency(int batchSize) {
        return (long) (getRandomLatency() * batchSize * batchOptimizationRatio);
    }

    @Override
    public void processBatch(Collection data) {
        long randomLatency = getRandomLatency(data.size());
        accumulatedLatency.addAndGet(randomLatency);
        if (!noop) {
            try {
                Thread.sleep(randomLatency);
            } catch (InterruptedException e) { }
        }
    }




    // TESTING
    public static void main(String[] args) {
        LatencyDataService processor = new LatencyDataService(10, 1, 0.5, true);

        for (int iters = 0; iters < 5; iters++) {
            long startTime = System.currentTimeMillis();
            for (int i = 0; i < 100; i++) {
                processor.process(null);
            }
            long duration = System.currentTimeMillis() - startTime;
            System.out.println("duration = " + duration);
            System.out.println("accumulated latency = " + processor.getAccumulatedLatency().get());
            processor.reset(0L);
        }


        List<String> data = Arrays.asList(new String[10]);
        for (int iters = 0; iters < 5; iters++) {
            long startTime = System.currentTimeMillis();
            for (int i = 0; i < 10; i++) {
                processor.processBatch(data);
            }
            long duration = System.currentTimeMillis() - startTime;
            System.out.println("duration = " + duration);
            System.out.println("accumulated latency = " + processor.getAccumulatedLatency().get());
            processor.reset(0L);
        }
    }
}
