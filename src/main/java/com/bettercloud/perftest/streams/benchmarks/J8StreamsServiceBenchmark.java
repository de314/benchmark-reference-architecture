package com.bettercloud.perftest.streams.benchmarks;

import com.bettercloud.perftest.streams.services.DataProcessor;
import com.bettercloud.perftest.streams.services.InlineDataProcessor;
import com.bettercloud.perftest.streams.services.J8StreamsDataProcessor;

public class J8StreamsServiceBenchmark extends AbstractStreamsServiceBenchmark {

    private static final DataProcessor processor = new J8StreamsDataProcessor();

    @Override
    protected DataProcessor getDataProcessor() {
        return processor;
    }
}
