package com.bettercloud.perftest.mappings.mappers;

import com.bettercloud.perftest.mappings.models.*;
import org.junit.Test;

import java.util.Date;
import java.util.UUID;

import static com.bettercloud.perftest.mappings.models.ModelProperties.LARGE_MODEL;
import static org.junit.Assert.assertEquals;

public abstract class AbstractMappingServiceTest {

    protected abstract MappingService getMappingService();

    @Test
    public void dtoToSimple() {
        SimpleDTO input = new SimpleDTO("a", "b");
        Simple expected = new Simple("a", "b");

        Simple actual = getMappingService().dtoToSimple(input);

        assertEquals(expected, actual);
    }

    @Test
    public void dtoToSmall() {
        SmallDTO input = new SmallDTO("a", "b");
        Small expected = new Small("a", "b");

        Small actual = getMappingService().dtoToSmall(input);

        assertEquals(expected, actual);
    }

    @Test
    public void dtoToLarge() {
        LargeDTO input = ModelProperties.LARGE_DTO;
        Large expected = LARGE_MODEL;

        Large actual = getMappingService().dtoToLarge(input);

        assertEquals(expected, actual);
    }

    @Test
    public void largeToEntity() {
        Large input = LARGE_MODEL;
        LargeEntity expected = new LargeEntity("1",
                "2",
                "3",
                "4",
                "5",
                "6",
                "7",
                1,
                2,
                3,
                4,
                5,
                6,
                7,
                true,
                false,
                true,
                false,
                true,
                false,
                true,
                UUID.nameUUIDFromBytes("1".getBytes()),
                UUID.nameUUIDFromBytes("2".getBytes()),
                UUID.nameUUIDFromBytes("3".getBytes()),
                UUID.nameUUIDFromBytes("4".getBytes()),
                UUID.nameUUIDFromBytes("5".getBytes()),
                UUID.nameUUIDFromBytes("6".getBytes()),
                UUID.nameUUIDFromBytes("7".getBytes()),
                new Date(0),
                new Date(1),
                new Date(2),
                new Date(3),
                new Date(4),
                new Date(5),
                new Date(6));

        LargeEntity actual = getMappingService().largeToEntity(input);

        assertEquals(expected, actual);
    }

    @Test
    public void antipatternToEntity() {
        PublicAntipattern input = ModelProperties.PUBLIC_ANTIPATTERN;
        PublicAntipatternEntity expected = new PublicAntipatternEntity(
                "a",
                1,
                true,
                UUID.nameUUIDFromBytes("a".getBytes()),
                new Date(0)
        );

        PublicAntipatternEntity actual = getMappingService().antipatternToEntity(input);

        assertEquals(expected, actual);
    }
}