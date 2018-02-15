package com.bettercloud.perftest.streams.benchmarks;

import com.bettercloud.perftest.streams.services.BatchedDataProcessor;
import com.bettercloud.perftest.streams.services.DataProcessor;
import com.bettercloud.perftest.streams.services.ParallelBatchDataProcessor;

public class ParallelBatchStreamsServiceBenchmark extends AbstractStreamsServiceBenchmark {

    private static final DataProcessor processor = new ParallelBatchDataProcessor();

    @Override
    protected DataProcessor getDataProcessor() {
        return processor;
    }
}
