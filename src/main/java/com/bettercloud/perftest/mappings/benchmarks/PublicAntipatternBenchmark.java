package com.bettercloud.perftest.mappings.benchmarks;

import com.bettercloud.perftest.mappings.mappers.MappingService;
import com.bettercloud.perftest.mappings.mappers.OrikaMappingService;
import com.bettercloud.perftest.mappings.mappers.PublicAntipatternMappingService;
import com.bettercloud.perftest.mappings.models.*;
import org.openjdk.jmh.annotations.*;

import java.util.concurrent.TimeUnit;

public class PublicAntipatternBenchmark extends AbstractMapperServiceBenchmark {

    private static final MappingService mappingService = new PublicAntipatternMappingService();

    @Override
    protected MappingService getMapperService() {
        return mappingService;
    }
}
