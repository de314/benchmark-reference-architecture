package com.bettercloud.perftest.streams.services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static com.bettercloud.perftest.streams.services.BatchedDataProcessor.BATCH_SIZE;

public class ParallelInlineDataProcessor extends AbstractDataProcessor {

    private ExecutorService executor;

    @Override
    public void init() {
        this.executor = Executors.newFixedThreadPool(5);
    }

    @Override
    public void process(Iterable<Object> data) {
        List<CompletableFuture> futures = new ArrayList<>();
        Iterator<Object> it = data.iterator();
        while (it.hasNext()) {
            List<Object> batch = new ArrayList<>(BATCH_SIZE);
            for (int i = 0; i < BATCH_SIZE && it.hasNext(); i++) {
                batch.add(it.next());
            }
            final CompletableFuture<Object> future = new CompletableFuture<>();
            futures.add(future);
            executor.execute(() -> {
                getDataService().processBatch(batch);
                future.complete(null);
            });
        }

        CompletableFuture<Void> all = CompletableFuture.allOf(futures.toArray(new CompletableFuture[futures.size()]));
        while (!all.isDone()) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) { }
        }
    }

    @Override
    public void destroy() {
        executor.shutdownNow();
    }
}
