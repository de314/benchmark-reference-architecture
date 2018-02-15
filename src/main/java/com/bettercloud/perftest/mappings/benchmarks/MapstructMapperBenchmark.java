package com.bettercloud.perftest.mappings.benchmarks;

import com.bettercloud.perftest.mappings.mappers.MappingService;
import com.bettercloud.perftest.mappings.mappers.MapstructMappingService;

public class MapstructMapperBenchmark extends AbstractMapperServiceBenchmark {

    private static final MappingService mappingService = MapstructMappingService.INSTANCE;

    @Override
    protected MappingService getMapperService() {
        return mappingService;
    }
}
