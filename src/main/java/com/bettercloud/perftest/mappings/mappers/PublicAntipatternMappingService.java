package com.bettercloud.perftest.mappings.mappers;

import com.bettercloud.perftest.mappings.models.*;
import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.impl.DefaultMapperFactory;

public class PublicAntipatternMappingService implements MappingService {

    @Override
    public Simple dtoToSimple(SimpleDTO dto) {
        Simple simple = new Simple();
        simple.setFirstName(dto.getFirstName());
        simple.setLastName(dto.getLastName());
        return simple;
    }

    @Override
    public Small dtoToSmall(SmallDTO dto) {
        Small small = new Small();
        small.setFirstName(dto.getFirst_name());
        small.setLastName(dto.getLast_name());
        return small;
    }

    @Override
    public Large dtoToLarge(LargeDTO dto) {
        Large large = new Large();
        large.setPropString1(dto.getProp_String1());
        large.setPropString2(dto.getProp_String2());
        large.setPropString3(dto.getProp_String3());
        large.setPropString4(dto.getProp_String4());
        large.setPropString5(dto.getProp_String5());
        large.setPropString6(dto.getProp_String6());
        large.setPropString7(dto.getProp_String7());
        large.setPropInt1(dto.getProp_Int1());
        large.setPropInt2(dto.getProp_Int2());
        large.setPropInt3(dto.getProp_Int3());
        large.setPropInt4(dto.getProp_Int4());
        large.setPropInt5(dto.getProp_Int5());
        large.setPropInt6(dto.getProp_Int6());
        large.setPropInt7(dto.getProp_Int7());
        large.setPropBool1(dto.isProp_Bool1());
        large.setPropBool2(dto.isProp_Bool2());
        large.setPropBool3(dto.isProp_Bool3());
        large.setPropBool4(dto.isProp_Bool4());
        large.setPropBool5(dto.isProp_Bool5());
        large.setPropBool6(dto.isProp_Bool6());
        large.setPropBool7(dto.isProp_Bool7());
        large.setPropUuid1(dto.getProp_Uuid1());
        large.setPropUuid2(dto.getProp_Uuid2());
        large.setPropUuid3(dto.getProp_Uuid3());
        large.setPropUuid4(dto.getProp_Uuid4());
        large.setPropUuid5(dto.getProp_Uuid5());
        large.setPropUuid6(dto.getProp_Uuid6());
        large.setPropUuid7(dto.getProp_Uuid7());
        large.setPropDate1(dto.getProp_Date1());
        large.setPropDate2(dto.getProp_Date2());
        large.setPropDate3(dto.getProp_Date3());
        large.setPropDate4(dto.getProp_Date4());
        large.setPropDate5(dto.getProp_Date5());
        large.setPropDate6(dto.getProp_Date6());
        large.setPropDate7(dto.getProp_Date7());
        return large;
    }

    @Override
    public LargeEntity largeToEntity(Large large) {
        LargeEntity entity = new LargeEntity();
        entity.setPropString1(large.getPropString1());
        entity.setPropString2(large.getPropString2());
        entity.setPropString3(large.getPropString3());
        entity.setPropString4(large.getPropString4());
        entity.setPropString5(large.getPropString5());
        entity.setPropString6(large.getPropString6());
        entity.setPropString7(large.getPropString7());
        entity.setPropInt1(large.getPropInt1());
        entity.setPropInt2(large.getPropInt2());
        entity.setPropInt3(large.getPropInt3());
        entity.setPropInt4(large.getPropInt4());
        entity.setPropInt5(large.getPropInt5());
        entity.setPropInt6(large.getPropInt6());
        entity.setPropInt7(large.getPropInt7());
        entity.setPropBool1(large.isPropBool1());
        entity.setPropBool2(large.isPropBool2());
        entity.setPropBool3(large.isPropBool3());
        entity.setPropBool4(large.isPropBool4());
        entity.setPropBool5(large.isPropBool5());
        entity.setPropBool6(large.isPropBool6());
        entity.setPropBool7(large.isPropBool7());
        entity.setPropUuid1(large.getPropUuid1());
        entity.setPropUuid2(large.getPropUuid2());
        entity.setPropUuid3(large.getPropUuid3());
        entity.setPropUuid4(large.getPropUuid4());
        entity.setPropUuid5(large.getPropUuid5());
        entity.setPropUuid6(large.getPropUuid6());
        entity.setPropUuid7(large.getPropUuid7());
        entity.setPropDate1(large.getPropDate1());
        entity.setPropDate2(large.getPropDate2());
        entity.setPropDate3(large.getPropDate3());
        entity.setPropDate4(large.getPropDate4());
        entity.setPropDate5(large.getPropDate5());
        entity.setPropDate6(large.getPropDate6());
        entity.setPropDate7(large.getPropDate7());
        return entity;
    }

    @Override
    public PublicAntipatternEntity antipatternToEntity(PublicAntipattern antipattern) {
        PublicAntipatternEntity entity = new PublicAntipatternEntity();
        entity.myString = antipattern.myString;
        entity.myInt = antipattern.myInt;
        entity.myBool = antipattern.myBool;
        entity.myUuid = antipattern.myUuid;
        entity.myDate = antipattern.myDate;
        return entity;
    }
}
