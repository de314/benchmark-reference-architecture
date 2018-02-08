package com.bettercloud.perftest.mappings.mappers;

public class OrikaMappingServiceTest extends AbstractMappingServiceTest {

    @Override
    protected MappingService getMappingService() {
        return new OrikaMappingService();
    }
}