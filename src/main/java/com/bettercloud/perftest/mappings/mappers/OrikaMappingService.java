package com.bettercloud.perftest.mappings.mappers;

import com.bettercloud.perftest.mappings.models.*;
import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.impl.DefaultMapperFactory;

public class OrikaMappingService implements MappingService {

    private static final MapperFacade pojoMapper;

    static {
        DefaultMapperFactory factory = new DefaultMapperFactory.Builder().build();

        factory.classMap(SimpleDTO.class, Simple.class)
                .byDefault()
                .register();

        factory.classMap(SmallDTO.class, Small.class)
                .field("first_name", "firstName")
                .field("last_name", "lastName")
                .byDefault()
                .register();

        factory.classMap(LargeDTO.class, Large.class)
                .field("prop_String1", "propString1")
                .field("prop_String2", "propString2")
                .field("prop_String3", "propString3")
                .field("prop_String4", "propString4")
                .field("prop_String5", "propString5")
                .field("prop_String6", "propString6")
                .field("prop_String7", "propString7")
                .field("prop_Int1", "propInt1")
                .field("prop_Int2", "propInt2")
                .field("prop_Int3", "propInt3")
                .field("prop_Int4", "propInt4")
                .field("prop_Int5", "propInt5")
                .field("prop_Int6", "propInt6")
                .field("prop_Int7", "propInt7")
                .field("prop_Bool1", "propBool1")
                .field("prop_Bool2", "propBool2")
                .field("prop_Bool3", "propBool3")
                .field("prop_Bool4", "propBool4")
                .field("prop_Bool5", "propBool5")
                .field("prop_Bool6", "propBool6")
                .field("prop_Bool7", "propBool7")
                .field("prop_Uuid1", "propUuid1")
                .field("prop_Uuid2", "propUuid2")
                .field("prop_Uuid3", "propUuid3")
                .field("prop_Uuid4", "propUuid4")
                .field("prop_Uuid5", "propUuid5")
                .field("prop_Uuid6", "propUuid6")
                .field("prop_Uuid7", "propUuid7")
                .field("prop_Date1", "propDate1")
                .field("prop_Date2", "propDate2")
                .field("prop_Date3", "propDate3")
                .field("prop_Date4", "propDate4")
                .field("prop_Date5", "propDate5")
                .field("prop_Date6", "propDate6")
                .field("prop_Date7", "propDate7")
                .byDefault()
                .register();

        factory.classMap(Large.class, LargeEntity.class)
                .byDefault()
                .register();

        factory.classMap(PublicAntipattern.class, PublicAntipatternEntity.class)
                .byDefault()
                .register();

        pojoMapper = factory.getMapperFacade();
    }

    @Override
    public Simple dtoToSimple(SimpleDTO dto) {
        return pojoMapper.map(dto, Simple.class);
    }

    @Override
    public Small dtoToSmall(SmallDTO dto) {
        return pojoMapper.map(dto, Small.class);
    }

    @Override
    public Large dtoToLarge(LargeDTO dto) {
        return pojoMapper.map(dto, Large.class);
    }

    @Override
    public LargeEntity largeToEntity(Large large) {
        return pojoMapper.map(large, LargeEntity.class);
    }

    @Override
    public PublicAntipatternEntity antipatternToEntity(PublicAntipattern antipattern) {
        return pojoMapper.map(antipattern, PublicAntipatternEntity.class);
    }
}
