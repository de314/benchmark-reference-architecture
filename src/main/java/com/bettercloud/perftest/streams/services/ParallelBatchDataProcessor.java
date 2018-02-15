package com.bettercloud.perftest.streams.services;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ParallelBatchDataProcessor extends AbstractDataProcessor {

    private ExecutorService executor;

    @Override
    public void init() {
        this.executor = Executors.newFixedThreadPool(5);
    }

    @Override
    public void process(Iterable<Object> data) {
        List<CompletableFuture> futures = new ArrayList<>();
        for (Object datum : data) {
            final CompletableFuture<Object> future = new CompletableFuture<>();
            futures.add(future);
            executor.execute(() -> {
                getDataService().process(datum);
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
