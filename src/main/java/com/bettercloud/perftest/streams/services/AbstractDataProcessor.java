package com.bettercloud.perftest.streams.services;

import lombok.Getter;
import lombok.Setter;

public abstract class AbstractDataProcessor implements DataProcessor {

    @Getter
    @Setter
    private DataService dataService;

    @Override
    public void init() { }

    @Override
    public void destroy() { }
}
