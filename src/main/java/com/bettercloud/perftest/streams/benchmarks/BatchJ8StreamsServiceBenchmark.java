package com.bettercloud.perftest.streams.benchmarks;

import com.bettercloud.perftest.streams.services.BatchJ8StreamsDataProcessor;
import com.bettercloud.perftest.streams.services.DataProcessor;

public class BatchJ8StreamsServiceBenchmark extends AbstractStreamsServiceBenchmark {

    private static final DataProcessor processor = new BatchJ8StreamsDataProcessor();

    @Override
    protected DataProcessor getDataProcessor() {
        return processor;
    }
}
