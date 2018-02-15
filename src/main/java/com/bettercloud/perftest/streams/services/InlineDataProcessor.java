package com.bettercloud.perftest.streams.services;

public class InlineDataProcessor extends AbstractDataProcessor {

    @Override
    public void process(Iterable<Object> data) {
        for (Object datum : data) {
            getDataService().process(datum);
        }
    }
}
