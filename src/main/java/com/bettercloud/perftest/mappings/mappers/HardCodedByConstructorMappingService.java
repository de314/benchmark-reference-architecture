package com.bettercloud.perftest.mappings.mappers;

import com.bettercloud.perftest.mappings.models.*;

public class HardCodedByConstructorMappingService implements MappingService {

    @Override
    public Simple dtoToSimple(SimpleDTO dto) {
        return new Simple(dto.getFirstName(), dto.getLastName());
    }

    @Override
    public Small dtoToSmall(SmallDTO dto) {
        return new Small(dto.getFirst_name(), dto.getLast_name());
    }

    @Override
    public Large dtoToLarge(LargeDTO dto) {
        return new Large(
                dto.getProp_String1(),
                dto.getProp_String2(),
                dto.getProp_String3(),
                dto.getProp_String4(),
                dto.getProp_String5(),
                dto.getProp_String6(),
                dto.getProp_String7(),
                dto.getProp_Int1(),
                dto.getProp_Int2(),
                dto.getProp_Int3(),
                dto.getProp_Int4(),
                dto.getProp_Int5(),
                dto.getProp_Int6(),
                dto.getProp_Int7(),
                dto.isProp_Bool1(),
                dto.isProp_Bool2(),
                dto.isProp_Bool3(),
                dto.isProp_Bool4(),
                dto.isProp_Bool5(),
                dto.isProp_Bool6(),
                dto.isProp_Bool7(),
                dto.getProp_Uuid1(),
                dto.getProp_Uuid2(),
                dto.getProp_Uuid3(),
                dto.getProp_Uuid4(),
                dto.getProp_Uuid5(),
                dto.getProp_Uuid6(),
                dto.getProp_Uuid7(),
                dto.getProp_Date1(),
                dto.getProp_Date2(),
                dto.getProp_Date3(),
                dto.getProp_Date4(),
                dto.getProp_Date5(),
                dto.getProp_Date6(),
                dto.getProp_Date7()
        );
    }

    @Override
    public LargeEntity largeToEntity(Large large) {
        return new LargeEntity(
                large.getPropString1(),
                large.getPropString2(),
                large.getPropString3(),
                large.getPropString4(),
                large.getPropString5(),
                large.getPropString6(),
                large.getPropString7(),
                large.getPropInt1(),
                large.getPropInt2(),
                large.getPropInt3(),
                large.getPropInt4(),
                large.getPropInt5(),
                large.getPropInt6(),
                large.getPropInt7(),
                large.isPropBool1(),
                large.isPropBool2(),
                large.isPropBool3(),
                large.isPropBool4(),
                large.isPropBool5(),
                large.isPropBool6(),
                large.isPropBool7(),
                large.getPropUuid1(),
                large.getPropUuid2(),
                large.getPropUuid3(),
                large.getPropUuid4(),
                large.getPropUuid5(),
                large.getPropUuid6(),
                large.getPropUuid7(),
                large.getPropDate1(),
                large.getPropDate2(),
                large.getPropDate3(),
                large.getPropDate4(),
                large.getPropDate5(),
                large.getPropDate6(),
                large.getPropDate7()
        );
    }

    @Override
    public PublicAntipatternEntity antipatternToEntity(PublicAntipattern antipattern) {
        return new PublicAntipatternEntity(
                antipattern.getMyString(),
                antipattern.getMyInt(),
                antipattern.isMyBool(),
                antipattern.getMyUuid(),
                antipattern.getMyDate()
        );
    }
}
