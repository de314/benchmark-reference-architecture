package com.bettercloud.perftest.streams.services;

import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.StreamSupport;

public class J8StreamsDataProcessor extends AbstractDataProcessor {

    @Override
    public void process(Iterable<Object> data) {
        StreamSupport.stream(
                Spliterators.spliteratorUnknownSize(data.iterator(), Spliterator.ORDERED),
                false
        ).forEach(datum -> getDataService().process(datum));
    }
}
