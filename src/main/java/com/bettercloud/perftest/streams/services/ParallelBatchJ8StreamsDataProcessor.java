package com.bettercloud.perftest.streams.services;

import java.util.Spliterator;
import java.util.Spliterators;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import static com.bettercloud.perftest.streams.services.BatchedDataProcessor.BATCH_SIZE;

public class ParallelBatchJ8StreamsDataProcessor extends AbstractDataProcessor {

    @Override
    public void process(Iterable<Object> data) {
        AtomicInteger offset = new AtomicInteger(0);
        Stream<Object> dataStream = StreamSupport.stream(
                Spliterators.spliteratorUnknownSize(data.iterator(), Spliterator.ORDERED),
                false
        );
        dataStream.collect(Collectors.groupingBy(datum -> offset.getAndIncrement() / BATCH_SIZE))
                .values()
                .parallelStream()
                .forEach(batch -> getDataService().processBatch(batch));
    }
}
