package com.bettercloud.perftest.streams.services;

public interface DataProcessor {

    void init();

    DataService getDataService();

    void setDataService(DataService dataService);

    void process(Iterable<Object> data);

    void destroy();
}
