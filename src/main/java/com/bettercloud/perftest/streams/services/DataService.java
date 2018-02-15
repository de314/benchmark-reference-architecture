package com.bettercloud.perftest.streams.services;

import java.util.Collection;

public interface DataService {

    void reset(long seed);

    void process(Object datum);

    void processBatch(Collection data);
}
