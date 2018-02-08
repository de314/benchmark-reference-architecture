package com.bettercloud.perftest.mappings.models;

import java.util.Date;
import java.util.UUID;

public class PublicAntipattern {

    public String myString;
    public int myInt;
    public boolean myBool;
    public UUID myUuid;
    public Date myDate;

    public PublicAntipattern() {}

    public PublicAntipattern(String myString, int myInt, boolean myBool, UUID myUuid, Date myDate) {
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
}
