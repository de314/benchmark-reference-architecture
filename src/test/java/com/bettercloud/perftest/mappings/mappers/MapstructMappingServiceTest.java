package com.bettercloud.perftest.mappings.mappers;

public class MapstructMappingServiceTest extends AbstractMappingServiceTest {

    @Override
    protected MappingService getMappingService() {
        return MapstructMappingService.INSTANCE;
    }
}