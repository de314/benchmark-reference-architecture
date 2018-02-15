package com.bettercloud.perftest.mappings.benchmarks;

import com.bettercloud.perftest.mappings.mappers.MappingService;
import com.bettercloud.perftest.mappings.mappers.OrikaMappingService;
import com.bettercloud.perftest.mappings.models.*;
import org.openjdk.jmh.annotations.*;

import java.util.concurrent.TimeUnit;

@Fork(value = 1, warmups = 1)
@BenchmarkMode({Mode.Throughput})
@Measurement(iterations = 2, time = 2)
@Warmup(iterations = 2, time = 2)
@OutputTimeUnit(TimeUnit.MICROSECONDS)
public abstract class AbstractMapperServiceBenchmark {

    private static final SimpleDTO SIMPLE_DTO = ModelProperties.SIMPLE_DTO;
    private static final SmallDTO SMALL_DTO = ModelProperties.SMALL_DTO;
    private static final LargeDTO LARGE_DTO = ModelProperties.LARGE_DTO;
    private static final Large LARGE = ModelProperties.LARGE_MODEL;
    private static final PublicAntipattern PUBLIC_ANTIPATTERN = ModelProperties.PUBLIC_ANTIPATTERN;

    protected abstract MappingService getMapperService();

    @Benchmark
    public void mapSimple() {
        getMapperService().dtoToSimple(SIMPLE_DTO);
    }

    @Benchmark
    public void mapSmall() {
        getMapperService().dtoToSmall(SMALL_DTO);
    }

    @Benchmark
    public void mapLarge() {
        getMapperService().dtoToLarge(LARGE_DTO);
    }

    @Benchmark
    public void mapLargeEntity() {
        getMapperService().largeToEntity(LARGE);
    }

    @Benchmark
    public void mapPublicAntipattern() {
        getMapperService().antipatternToEntity(PUBLIC_ANTIPATTERN);
    }
}
