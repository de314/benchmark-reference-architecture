package com.bettercloud.perftest.streams.services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BatchedDataProcessor extends AbstractDataProcessor {

    public static final int BATCH_SIZE = 25;

    @Override
    public void process(Iterable<Object> data) {
        List<Object> batch = new ArrayList<>(BATCH_SIZE);
        Iterator<Object> it = data.iterator();
        while (it.hasNext()) {
            batch.clear();
            for (int i = 0; i < BATCH_SIZE && it.hasNext(); i++) {
                batch.add(it.next());
            }
            getDataService().processBatch(batch);
        }
    }
}
