package com.bettercloud.perftest.streams.benchmarks;

import com.bettercloud.perftest.streams.services.BatchedDataProcessor;
import com.bettercloud.perftest.streams.services.DataProcessor;
import com.bettercloud.perftest.streams.services.ParallelBatchJ8StreamsDataProcessor;

public class ParallelBatchJ8StreamsServiceBenchmark extends AbstractStreamsServiceBenchmark {

    private static final DataProcessor processor = new ParallelBatchJ8StreamsDataProcessor();

    @Override
    protected DataProcessor getDataProcessor() {
        return processor;
    }
}
