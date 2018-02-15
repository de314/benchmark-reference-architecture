package com.bettercloud.perftest.streams.benchmarks;

import com.bettercloud.perftest.streams.services.DataProcessor;
import com.bettercloud.perftest.streams.services.InlineDataProcessor;

public class InlineStreamsServiceBenchmark extends AbstractStreamsServiceBenchmark {

    private static final DataProcessor processor = new InlineDataProcessor();

    @Override
    protected DataProcessor getDataProcessor() {
        return processor;
    }
}
