package com.bettercloud.perftest.mappings.mappers;

import com.bettercloud.perftest.mappings.models.*;

public interface MappingService {

    Simple dtoToSimple(SimpleDTO dto);

    Small dtoToSmall(SmallDTO dto);

    Large dtoToLarge(LargeDTO dto);

    LargeEntity largeToEntity(Large large);

    PublicAntipatternEntity antipatternToEntity(PublicAntipattern antipattern);
}
