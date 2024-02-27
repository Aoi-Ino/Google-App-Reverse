package com.nic.mparivahan.dlservices.data.model;

import androidx.annotation.Keep;
import cm.l;
import java.io.Serializable;

@Keep
public final class DlAddress implements Serializable {
    private String district;
    private String houseNo;
    private String location;
    private String pinCode;
    private String state;
    private String street;
    private String subDistrict;
    private String villageOrTown;

    public DlAddress(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        l.f(str7, "state");
        this.houseNo = str;
        this.street = str2;
        this.location = str3;
        this.villageOrTown = str4;
        this.subDistrict = str5;
        this.district = str6;
        this.state = str7;
        this.pinCode = str8;
    }

    public static /* synthetic */ DlAddress copy$default(DlAddress dlAddress, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i10, Object obj) {
        DlAddress dlAddress2 = dlAddress;
        int i11 = i10;
        return dlAddress.copy((i11 & 1) != 0 ? dlAddress2.houseNo : str, (i11 & 2) != 0 ? dlAddress2.street : str2, (i11 & 4) != 0 ? dlAddress2.location : str3, (i11 & 8) != 0 ? dlAddress2.villageOrTown : str4, (i11 & 16) != 0 ? dlAddress2.subDistrict : str5, (i11 & 32) != 0 ? dlAddress2.district : str6, (i11 & 64) != 0 ? dlAddress2.state : str7, (i11 & 128) != 0 ? dlAddress2.pinCode : str8);
    }

    public final String component1() {
        return this.houseNo;
    }

    public final String component2() {
        return this.street;
    }

    public final String component3() {
        return this.location;
    }

    public final String component4() {
        return this.villageOrTown;
    }

    public final String component5() {
        return this.subDistrict;
    }

    public final String component6() {
        return this.district;
    }

    public final String component7() {
        return this.state;
    }

    public final String component8() {
        return this.pinCode;
    }

    public final DlAddress copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        String str9 = str7;
        l.f(str9, "state");
        return new DlAddress(str, str2, str3, str4, str5, str6, str9, str8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DlAddress)) {
            return false;
        }
        DlAddress dlAddress = (DlAddress) obj;
        return l.a(this.houseNo, dlAddress.houseNo) && l.a(this.street, dlAddress.street) && l.a(this.location, dlAddress.location) && l.a(this.villageOrTown, dlAddress.villageOrTown) && l.a(this.subDistrict, dlAddress.subDistrict) && l.a(this.district, dlAddress.district) && l.a(this.state, dlAddress.state) && l.a(this.pinCode, dlAddress.pinCode);
    }

    public final String getDistrict() {
        return this.district;
    }

    public final String getHouseNo() {
        return this.houseNo;
    }

    public final String getLocation() {
        return this.location;
    }

    public final String getPinCode() {
        return this.pinCode;
    }

    public final String getState() {
        return this.state;
    }

    public final String getStreet() {
        return this.street;
    }

    public final String getSubDistrict() {
        return this.subDistrict;
    }

    public final String getVillageOrTown() {
        return this.villageOrTown;
    }

    public int hashCode() {
        String str = this.houseNo;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.street;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.location;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.villageOrTown;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.subDistrict;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.district;
        int hashCode6 = (((hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31) + this.state.hashCode()) * 31;
        String str7 = this.pinCode;
        if (str7 != null) {
            i10 = str7.hashCode();
        }
        return hashCode6 + i10;
    }

    public final void setDistrict(String str) {
        this.district = str;
    }

    public final void setHouseNo(String str) {
        this.houseNo = str;
    }

    public final void setLocation(String str) {
        this.location = str;
    }

    public final void setPinCode(String str) {
        this.pinCode = str;
    }

    public final void setState(String str) {
        l.f(str, "<set-?>");
        this.state = str;
    }

    public final void setStreet(String str) {
        this.street = str;
    }

    public final void setSubDistrict(String str) {
        this.subDistrict = str;
    }

    public final void setVillageOrTown(String str) {
        this.villageOrTown = str;
    }

    public String toString() {
        return "DlAddress(houseNo=" + this.houseNo + ", street=" + this.street + ", location=" + this.location + ", villageOrTown=" + this.villageOrTown + ", subDistrict=" + this.subDistrict + ", district=" + this.district + ", state=" + this.state + ", pinCode=" + this.pinCode + ')';
    }
}
