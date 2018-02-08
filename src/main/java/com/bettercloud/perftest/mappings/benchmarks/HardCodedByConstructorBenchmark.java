package com.bettercloud.perftest.mappings.benchmarks;

import com.bettercloud.perftest.mappings.mappers.HardCodedByConstructorMappingService;
import com.bettercloud.perftest.mappings.mappers.MappingService;

public class HardCodedByConstructorBenchmark extends AbstractMapperServiceBenchmark {

    private static final MappingService mappingService = new HardCodedByConstructorMappingService();

    @Override
    protected MappingService getMapperService() {
        return mappingService;
    }
}
