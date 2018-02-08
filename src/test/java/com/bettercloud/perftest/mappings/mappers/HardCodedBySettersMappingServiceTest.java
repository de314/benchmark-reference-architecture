package com.bettercloud.perftest.mappings.mappers;

public class HardCodedBySettersMappingServiceTest extends AbstractMappingServiceTest {

    @Override
    protected MappingService getMappingService() {
        return new HardCodedBySettersMappingService();
    }
}