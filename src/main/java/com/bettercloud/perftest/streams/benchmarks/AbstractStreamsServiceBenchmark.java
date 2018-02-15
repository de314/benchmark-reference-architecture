package com.bettercloud.perftest.streams.benchmarks;

import com.bettercloud.perftest.streams.services.DataProcessor;
import com.bettercloud.perftest.streams.services.DataService;
import com.bettercloud.perftest.streams.services.LatencyDataService;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.TearDown;
import org.openjdk.jmh.annotations.Warmup;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

@Fork(value = 0, warmups = 0)
@BenchmarkMode({Mode.Throughput})
@Measurement(iterations = 5, time = 10)
@Warmup(iterations = 1, time = 1)
@OutputTimeUnit(TimeUnit.SECONDS)
public abstract class AbstractStreamsServiceBenchmark {

    private static final Iterable SMALL_DATA = Arrays.asList(new String[10]);
    private static final Iterable MEDIUM_DATA = Arrays.asList(new String[250]);
    private static final Iterable LARGE_DATA = Arrays.asList(new String[2718]);
    private static final DataService FAST_DATA_SERVICE = new LatencyDataService(10, 2, 0.1, false);
    private static final DataService SLOW_DATA_SERVICE = new LatencyDataService(250, 33, 0.5, false);

    protected abstract DataProcessor getDataProcessor();

    @Setup
    public void setup() {
        FAST_DATA_SERVICE.reset(0L);
        SLOW_DATA_SERVICE.reset(0L);
        getDataProcessor().init();
    }

    @Benchmark
    public void streamSmall_fast() {
        getDataProcessor().setDataService(FAST_DATA_SERVICE);
        getDataProcessor().process(SMALL_DATA);
    }

    @Benchmark
    public void streamSmall_slow() {
        getDataProcessor().setDataService(SLOW_DATA_SERVICE);
        getDataProcessor().process(SMALL_DATA);
    }

    @Benchmark
    public void streamMedium_fast() {
        getDataProcessor().setDataService(FAST_DATA_SERVICE);
        getDataProcessor().process(MEDIUM_DATA);
    }

    @Benchmark
    public void streamLarge_fast() {
        getDataProcessor().setDataService(FAST_DATA_SERVICE);
        getDataProcessor().process(LARGE_DATA);
    }

    @TearDown
    public void tearDown() {
        getDataProcessor().destroy();
    }
}
