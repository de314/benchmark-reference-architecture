package com.bettercloud.perftest.streams.benchmarks;

import com.bettercloud.perftest.streams.services.DataProcessor;
import com.bettercloud.perftest.streams.services.J8StreamsDataProcessor;
import com.bettercloud.perftest.streams.services.ParallelJ8StreamsDataProcessor;

public class ParallelJ8StreamsServiceBenchmark extends AbstractStreamsServiceBenchmark {

    private static final DataProcessor processor = new ParallelJ8StreamsDataProcessor();

    @Override
    protected DataProcessor getDataProcessor() {
        return processor;
    }
}
