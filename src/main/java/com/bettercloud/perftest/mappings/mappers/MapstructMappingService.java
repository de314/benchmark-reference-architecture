package com.bettercloud.perftest.mappings.mappers;

import com.bettercloud.perftest.mappings.models.*;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface MapstructMappingService extends MappingService {

    MapstructMappingService INSTANCE = Mappers.getMapper(MapstructMappingService.class);

    @Override
    Simple dtoToSimple(SimpleDTO dto);

    @Override
    @Mapping(source = "first_name", target = "firstName")
    @Mapping(source = "last_name", target = "lastName")
    Small dtoToSmall(SmallDTO dto);

    @Override
    @Mapping(source = "prop_String1", target = "propString1")
    @Mapping(source = "prop_String2", target = "propString2")
    @Mapping(source = "prop_String3", target = "propString3")
    @Mapping(source = "prop_String4", target = "propString4")
    @Mapping(source = "prop_String5", target = "propString5")
    @Mapping(source = "prop_String6", target = "propString6")
    @Mapping(source = "prop_String7", target = "propString7")
    @Mapping(source = "prop_Int1", target = "propInt1")
    @Mapping(source = "prop_Int2", target = "propInt2")
    @Mapping(source = "prop_Int3", target = "propInt3")
    @Mapping(source = "prop_Int4", target = "propInt4")
    @Mapping(source = "prop_Int5", target = "propInt5")
    @Mapping(source = "prop_Int6", target = "propInt6")
    @Mapping(source = "prop_Int7", target = "propInt7")
    @Mapping(source = "prop_Bool1", target = "propBool1")
    @Mapping(source = "prop_Bool2", target = "propBool2")
    @Mapping(source = "prop_Bool3", target = "propBool3")
    @Mapping(source = "prop_Bool4", target = "propBool4")
    @Mapping(source = "prop_Bool5", target = "propBool5")
    @Mapping(source = "prop_Bool6", target = "propBool6")
    @Mapping(source = "prop_Bool7", target = "propBool7")
    @Mapping(source = "prop_Uuid1", target = "propUuid1")
    @Mapping(source = "prop_Uuid2", target = "propUuid2")
    @Mapping(source = "prop_Uuid3", target = "propUuid3")
    @Mapping(source = "prop_Uuid4", target = "propUuid4")
    @Mapping(source = "prop_Uuid5", target = "propUuid5")
    @Mapping(source = "prop_Uuid6", target = "propUuid6")
    @Mapping(source = "prop_Uuid7", target = "propUuid7")
    @Mapping(source = "prop_Date1", target = "propDate1")
    @Mapping(source = "prop_Date2", target = "propDate2")
    @Mapping(source = "prop_Date3", target = "propDate3")
    @Mapping(source = "prop_Date4", target = "propDate4")
    @Mapping(source = "prop_Date5", target = "propDate5")
    @Mapping(source = "prop_Date6", target = "propDate6")
    @Mapping(source = "prop_Date7", target = "propDate7")
    Large dtoToLarge(LargeDTO dto);

    @Override
    LargeEntity largeToEntity(Large large);

    @Override
    PublicAntipatternEntity antipatternToEntity(PublicAntipattern antipattern);
}
