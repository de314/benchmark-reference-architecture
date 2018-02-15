package com.bettercloud.perftest.streams.benchmarks;

import com.bettercloud.perftest.streams.services.BatchedDataProcessor;
import com.bettercloud.perftest.streams.services.DataProcessor;
import com.bettercloud.perftest.streams.services.InlineDataProcessor;

public class BatchStreamsServiceBenchmark extends AbstractStreamsServiceBenchmark {

    private static final DataProcessor processor = new BatchedDataProcessor();

    @Override
    protected DataProcessor getDataProcessor() {
        return processor;
    }
}
