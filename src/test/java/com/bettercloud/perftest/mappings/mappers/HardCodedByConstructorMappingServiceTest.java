package com.bettercloud.perftest.mappings.mappers;

public class HardCodedByConstructorMappingServiceTest extends AbstractMappingServiceTest {

    @Override
    protected MappingService getMappingService() {
        return new HardCodedByConstructorMappingService();
    }
}