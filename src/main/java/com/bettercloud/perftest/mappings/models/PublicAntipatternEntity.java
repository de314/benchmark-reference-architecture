package com.bettercloud.perftest.mappings.models;

import java.util.Date;
import java.util.Objects;
import java.util.UUID;

public class PublicAntipatternEntity {

    public String myString;
    public int myInt;
    public boolean myBool;
    public UUID myUuid;
    public Date myDate;

    public PublicAntipatternEntity() {}

    public PublicAntipatternEntity(String myString, int myInt, boolean myBool, UUID myUuid, Date myDate) {
        this.myString = myString;
        this.myInt = myInt;
        this.myBool = myBool;
        this.myUuid = myUuid;
        this.myDate = myDate;
    }

    public String getMyString() {
        return myString;
    }

    public void setMyString(String myString) {
        this.myString = myString;
    }

    public int getMyInt() {
        return myInt;
    }

    public void setMyInt(int myInt) {
        this.myInt = myInt;
    }

    public boolean isMyBool() {
        return myBool;
    }

    public void setMyBool(boolean myBool) {
        this.myBool = myBool;
    }

    public UUID getMyUuid() {
        return myUuid;
    }

    public void setMyUuid(UUID myUuid) {
        this.myUuid = myUuid;
    }

    public Date getMyDate() {
        return myDate;
    }

    public void setMyDate(Date myDate) {
        this.myDate = myDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PublicAntipatternEntity that = (PublicAntipatternEntity) o;
        return myInt == that.myInt &&
                myBool == that.myBool &&
                Objects.equals(myString, that.myString) &&
                Objects.equals(myUuid, that.myUuid) &&
                Objects.equals(myDate, that.myDate);
    }

    @Override
    public int hashCode() {

        return Objects.hash(myString, myInt, myBool, myUuid, myDate);
    }

    @Override
    public String toString() {
        return "PublicAntipatternEntity{" +
                "myString='" + myString + '\'' +
                ", myInt=" + myInt +
                ", myBool=" + myBool +
                ", myUuid=" + myUuid +
                ", myDate=" + myDate +
                '}';
    }
}
