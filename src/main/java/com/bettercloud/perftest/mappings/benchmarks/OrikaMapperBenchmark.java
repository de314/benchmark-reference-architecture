package com.bettercloud.perftest.mappings.benchmarks;

import com.bettercloud.perftest.mappings.mappers.MappingService;
import com.bettercloud.perftest.mappings.mappers.MapstructMappingService;
import com.bettercloud.perftest.mappings.mappers.OrikaMappingService;
import com.bettercloud.perftest.mappings.models.*;
import org.openjdk.jmh.annotations.*;

import java.util.concurrent.TimeUnit;

public class OrikaMapperBenchmark extends AbstractMapperServiceBenchmark {

    private static final MappingService mappingService = new OrikaMappingService();

    @Override
    protected MappingService getMapperService() {
        return mappingService;
    }
}
