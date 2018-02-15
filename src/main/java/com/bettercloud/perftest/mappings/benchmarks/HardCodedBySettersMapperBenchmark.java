package com.bettercloud.perftest.mappings.benchmarks;

import com.bettercloud.perftest.mappings.mappers.HardCodedBySettersMappingService;
import com.bettercloud.perftest.mappings.mappers.MappingService;

public class HardCodedBySettersMapperBenchmark extends AbstractMapperServiceBenchmark {

    private static final MappingService mappingService = new HardCodedBySettersMappingService();

    @Override
    protected MappingService getMapperService() {
        return mappingService;
    }
}
