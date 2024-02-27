package com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.TOSaveToDraftModel;

import androidx.annotation.Keep;
import cm.l;
import java.io.Serializable;

@Keep
public final class Data implements Serializable {
    private final String applNo;
    private final String authMode;
    private final String chassisNo;
    private final String currentAddress1;
    private final String currentAddress2;
    private final String currentAddress3;
    private final Integer currentDistrict;
    private final Integer currentPinCode;
    private final String currentState;
    private final String emailId;
    private final String fatherName;
    private final String garageAddress;
    private final Boolean isRetainSwap;
    private final String movedOn;
    private final Integer officeCode;
    private final String openDate;
    private final Integer ownerCategory;
    private final Integer ownerCode;
    private final String ownerFrom;
    private final String ownerName;
    private final int ownerSerial;
    private final String panNo;
    private final String permanentAddress1;
    private final String permanentAddress2;
    private final String permanentAddress3;
    private final Integer permanentDistrict;
    private final Integer permanentPinCode;
    private final String permanentState;
    private final Integer purposeCode;
    private final String reason;
    private final String regnNo;
    private final Long saleAmmount;
    private final String saleDate;
    private final String services;
    private final String stateCode;
    private final String transferDate;

    public Data(String str, String str2, String str3, String str4, String str5, String str6, Integer num, Integer num2, String str7, String str8, String str9, String str10, Boolean bool, String str11, Integer num3, String str12, Integer num4, Integer num5, String str13, String str14, int i10, String str15, String str16, String str17, String str18, Integer num6, Integer num7, String str19, Integer num8, String str20, String str21, Long l10, String str22, String str23, String str24, String str25) {
        this.applNo = str;
        this.authMode = str2;
        this.chassisNo = str3;
        this.currentAddress1 = str4;
        this.currentAddress2 = str5;
        this.currentAddress3 = str6;
        this.currentDistrict = num;
        this.currentPinCode = num2;
        this.currentState = str7;
        this.emailId = str8;
        this.fatherName = str9;
        this.garageAddress = str10;
        this.isRetainSwap = bool;
        this.movedOn = str11;
        this.officeCode = num3;
        this.openDate = str12;
        this.ownerCategory = num4;
        this.ownerCode = num5;
        this.ownerFrom = str13;
        this.ownerName = str14;
        this.ownerSerial = i10;
        this.panNo = str15;
        this.permanentAddress1 = str16;
        this.permanentAddress2 = str17;
        this.permanentAddress3 = str18;
        this.permanentDistrict = num6;
        this.permanentPinCode = num7;
        this.permanentState = str19;
        this.purposeCode = num8;
        this.reason = str20;
        this.regnNo = str21;
        this.saleAmmount = l10;
        this.saleDate = str22;
        this.services = str23;
        this.stateCode = str24;
        this.transferDate = str25;
    }

    public static /* synthetic */ Data copy$default(Data data, String str, String str2, String str3, String str4, String str5, String str6, Integer num, Integer num2, String str7, String str8, String str9, String str10, Boolean bool, String str11, Integer num3, String str12, Integer num4, Integer num5, String str13, String str14, int i10, String str15, String str16, String str17, String str18, Integer num6, Integer num7, String str19, Integer num8, String str20, String str21, Long l10, String str22, String str23, String str24, String str25, int i11, int i12, Object obj) {
        Data data2 = data;
        int i13 = i11;
        return data.copy((i13 & 1) != 0 ? data2.applNo : str, (i13 & 2) != 0 ? data2.authMode : str2, (i13 & 4) != 0 ? data2.chassisNo : str3, (i13 & 8) != 0 ? data2.currentAddress1 : str4, (i13 & 16) != 0 ? data2.currentAddress2 : str5, (i13 & 32) != 0 ? data2.currentAddress3 : str6, (i13 & 64) != 0 ? data2.currentDistrict : num, (i13 & 128) != 0 ? data2.currentPinCode : num2, (i13 & 256) != 0 ? data2.currentState : str7, (i13 & 512) != 0 ? data2.emailId : str8, (i13 & 1024) != 0 ? data2.fatherName : str9, (i13 & 2048) != 0 ? data2.garageAddress : str10, (i13 & 4096) != 0 ? data2.isRetainSwap : bool, (i13 & 8192) != 0 ? data2.movedOn : str11, (i13 & 16384) != 0 ? data2.officeCode : num3, (i13 & 32768) != 0 ? data2.openDate : str12, (i13 & 65536) != 0 ? data2.ownerCategory : num4, (i13 & 131072) != 0 ? data2.ownerCode : num5, (i13 & 262144) != 0 ? data2.ownerFrom : str13, (i13 & 524288) != 0 ? data2.ownerName : str14, (i13 & 1048576) != 0 ? data2.ownerSerial : i10, (i13 & 2097152) != 0 ? data2.panNo : str15, (i13 & 4194304) != 0 ? data2.permanentAddress1 : str16, (i13 & 8388608) != 0 ? data2.permanentAddress2 : str17, (i13 & 16777216) != 0 ? data2.permanentAddress3 : str18, (i13 & 33554432) != 0 ? data2.permanentDistrict : num6, (i13 & 67108864) != 0 ? data2.permanentPinCode : num7, (i13 & 134217728) != 0 ? data2.permanentState : str19, (i13 & 268435456) != 0 ? data2.purposeCode : num8, (i13 & 536870912) != 0 ? data2.reason : str20, (i13 & 1073741824) != 0 ? data2.regnNo : str21, (i13 & Integer.MIN_VALUE) != 0 ? data2.saleAmmount : l10, (i12 & 1) != 0 ? data2.saleDate : str22, (i12 & 2) != 0 ? data2.services : str23, (i12 & 4) != 0 ? data2.stateCode : str24, (i12 & 8) != 0 ? data2.transferDate : str25);
    }

    public final String component1() {
        return this.applNo;
    }

    public final String component10() {
        return this.emailId;
    }

    public final String component11() {
        return this.fatherName;
    }

    public final String component12() {
        return this.garageAddress;
    }

    public final Boolean component13() {
        return this.isRetainSwap;
    }

    public final String component14() {
        return this.movedOn;
    }

    public final Integer component15() {
        return this.officeCode;
    }

    public final String component16() {
        return this.openDate;
    }

    public final Integer component17() {
        return this.ownerCategory;
    }

    public final Integer component18() {
        return this.ownerCode;
    }

    public final String component19() {
        return this.ownerFrom;
    }

    public final String component2() {
        return this.authMode;
    }

    public final String component20() {
        return this.ownerName;
    }

    public final int component21() {
        return this.ownerSerial;
    }

    public final String component22() {
        return this.panNo;
    }

    public final String component23() {
        return this.permanentAddress1;
    }

    public final String component24() {
        return this.permanentAddress2;
    }

    public final String component25() {
        return this.permanentAddress3;
    }

    public final Integer component26() {
        return this.permanentDistrict;
    }

    public final Integer component27() {
        return this.permanentPinCode;
    }

    public final String component28() {
        return this.permanentState;
    }

    public final Integer component29() {
        return this.purposeCode;
    }

    public final String component3() {
        return this.chassisNo;
    }

    public final String component30() {
        return this.reason;
    }

    public final String component31() {
        return this.regnNo;
    }

    public final Long component32() {
        return this.saleAmmount;
    }

    public final String component33() {
        return this.saleDate;
    }

    public final String component34() {
        return this.services;
    }

    public final String component35() {
        return this.stateCode;
    }

    public final String component36() {
        return this.transferDate;
    }

    public final String component4() {
        return this.currentAddress1;
    }

    public final String component5() {
        return this.currentAddress2;
    }

    public final String component6() {
        return this.currentAddress3;
    }

    public final Integer component7() {
        return this.currentDistrict;
    }

    public final Integer component8() {
        return this.currentPinCode;
    }

    public final String component9() {
        return this.currentState;
    }

    public final Data copy(String str, String str2, String str3, String str4, String str5, String str6, Integer num, Integer num2, String str7, String str8, String str9, String str10, Boolean bool, String str11, Integer num3, String str12, Integer num4, Integer num5, String str13, String str14, int i10, String str15, String str16, String str17, String str18, Integer num6, Integer num7, String str19, Integer num8, String str20, String str21, Long l10, String str22, String str23, String str24, String str25) {
        return new Data(str, str2, str3, str4, str5, str6, num, num2, str7, str8, str9, str10, bool, str11, num3, str12, num4, num5, str13, str14, i10, str15, str16, str17, str18, num6, num7, str19, num8, str20, str21, l10, str22, str23, str24, str25);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Data)) {
            return false;
        }
        Data data = (Data) obj;
        return l.a(this.applNo, data.applNo) && l.a(this.authMode, data.authMode) && l.a(this.chassisNo, data.chassisNo) && l.a(this.currentAddress1, data.currentAddress1) && l.a(this.currentAddress2, data.currentAddress2) && l.a(this.currentAddress3, data.currentAddress3) && l.a(this.currentDistrict, data.currentDistrict) && l.a(this.currentPinCode, data.currentPinCode) && l.a(this.currentState, data.currentState) && l.a(this.emailId, data.emailId) && l.a(this.fatherName, data.fatherName) && l.a(this.garageAddress, data.garageAddress) && l.a(this.isRetainSwap, data.isRetainSwap) && l.a(this.movedOn, data.movedOn) && l.a(this.officeCode, data.officeCode) && l.a(this.openDate, data.openDate) && l.a(this.ownerCategory, data.ownerCategory) && l.a(this.ownerCode, data.ownerCode) && l.a(this.ownerFrom, data.ownerFrom) && l.a(this.ownerName, data.ownerName) && this.ownerSerial == data.ownerSerial && l.a(this.panNo, data.panNo) && l.a(this.permanentAddress1, data.permanentAddress1) && l.a(this.permanentAddress2, data.permanentAddress2) && l.a(this.permanentAddress3, data.permanentAddress3) && l.a(this.permanentDistrict, data.permanentDistrict) && l.a(this.permanentPinCode, data.permanentPinCode) && l.a(this.permanentState, data.permanentState) && l.a(this.purposeCode, data.purposeCode) && l.a(this.reason, data.reason) && l.a(this.regnNo, data.regnNo) && l.a(this.saleAmmount, data.saleAmmount) && l.a(this.saleDate, data.saleDate) && l.a(this.services, data.services) && l.a(this.stateCode, data.stateCode) && l.a(this.transferDate, data.transferDate);
    }

    public final String getApplNo() {
        return this.applNo;
    }

    public final String getAuthMode() {
        return this.authMode;
    }

    public final String getChassisNo() {
        return this.chassisNo;
    }

    public final String getCurrentAddress1() {
        return this.currentAddress1;
    }

    public final String getCurrentAddress2() {
        return this.currentAddress2;
    }

    public final String getCurrentAddress3() {
        return this.currentAddress3;
    }

    public final Integer getCurrentDistrict() {
        return this.currentDistrict;
    }

    public final Integer getCurrentPinCode() {
        return this.currentPinCode;
    }

    public final String getCurrentState() {
        return this.currentState;
    }

    public final String getEmailId() {
        return this.emailId;
    }

    public final String getFatherName() {
        return this.fatherName;
    }

    public final String getGarageAddress() {
        return this.garageAddress;
    }

    public final String getMovedOn() {
        return this.movedOn;
    }

    public final Integer getOfficeCode() {
        return this.officeCode;
    }

    public final String getOpenDate() {
        return this.openDate;
    }

    public final Integer getOwnerCategory() {
        return this.ownerCategory;
    }

    public final Integer getOwnerCode() {
        return this.ownerCode;
    }

    public final String getOwnerFrom() {
        return this.ownerFrom;
    }

    public final String getOwnerName() {
        return this.ownerName;
    }

    public final int getOwnerSerial() {
        return this.ownerSerial;
    }

    public final String getPanNo() {
        return this.panNo;
    }

    public final String getPermanentAddress1() {
        return this.permanentAddress1;
    }

    public final String getPermanentAddress2() {
        return this.permanentAddress2;
    }

    public final String getPermanentAddress3() {
        return this.permanentAddress3;
    }

    public final Integer getPermanentDistrict() {
        return this.permanentDistrict;
    }

    public final Integer getPermanentPinCode() {
        return this.permanentPinCode;
    }

    public final String getPermanentState() {
        return this.permanentState;
    }

    public final Integer getPurposeCode() {
        return this.purposeCode;
    }

    public final String getReason() {
        return this.reason;
    }

    public final String getRegnNo() {
        return this.regnNo;
    }

    public final Long getSaleAmmount() {
        return this.saleAmmount;
    }

    public final String getSaleDate() {
        return this.saleDate;
    }

    public final String getServices() {
        return this.services;
    }

    public final String getStateCode() {
        return this.stateCode;
    }

    public final String getTransferDate() {
        return this.transferDate;
    }

    public int hashCode() {
        String str = this.applNo;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.authMode;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.chassisNo;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.currentAddress1;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.currentAddress2;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.currentAddress3;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num = this.currentDistrict;
        int hashCode7 = (hashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.currentPinCode;
        int hashCode8 = (hashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str7 = this.currentState;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.emailId;
        int hashCode10 = (hashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.fatherName;
        int hashCode11 = (hashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.garageAddress;
        int hashCode12 = (hashCode11 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Boolean bool = this.isRetainSwap;
        int hashCode13 = (hashCode12 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str11 = this.movedOn;
        int hashCode14 = (hashCode13 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Integer num3 = this.officeCode;
        int hashCode15 = (hashCode14 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str12 = this.openDate;
        int hashCode16 = (hashCode15 + (str12 == null ? 0 : str12.hashCode())) * 31;
        Integer num4 = this.ownerCategory;
        int hashCode17 = (hashCode16 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.ownerCode;
        int hashCode18 = (hashCode17 + (num5 == null ? 0 : num5.hashCode())) * 31;
        String str13 = this.ownerFrom;
        int hashCode19 = (hashCode18 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.ownerName;
        int hashCode20 = (((hashCode19 + (str14 == null ? 0 : str14.hashCode())) * 31) + Integer.hashCode(this.ownerSerial)) * 31;
        String str15 = this.panNo;
        int hashCode21 = (hashCode20 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.permanentAddress1;
        int hashCode22 = (hashCode21 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.permanentAddress2;
        int hashCode23 = (hashCode22 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.permanentAddress3;
        int hashCode24 = (hashCode23 + (str18 == null ? 0 : str18.hashCode())) * 31;
        Integer num6 = this.permanentDistrict;
        int hashCode25 = (hashCode24 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.permanentPinCode;
        int hashCode26 = (hashCode25 + (num7 == null ? 0 : num7.hashCode())) * 31;
        String str19 = this.permanentState;
        int hashCode27 = (hashCode26 + (str19 == null ? 0 : str19.hashCode())) * 31;
        Integer num8 = this.purposeCode;
        int hashCode28 = (hashCode27 + (num8 == null ? 0 : num8.hashCode())) * 31;
        String str20 = this.reason;
        int hashCode29 = (hashCode28 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.regnNo;
        int hashCode30 = (hashCode29 + (str21 == null ? 0 : str21.hashCode())) * 31;
        Long l10 = this.saleAmmount;
        int hashCode31 = (hashCode30 + (l10 == null ? 0 : l10.hashCode())) * 31;
        String str22 = this.saleDate;
        int hashCode32 = (hashCode31 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.services;
        int hashCode33 = (hashCode32 + (str23 == null ? 0 : str23.hashCode())) * 31;
        String str24 = this.stateCode;
        int hashCode34 = (hashCode33 + (str24 == null ? 0 : str24.hashCode())) * 31;
        String str25 = this.transferDate;
        if (str25 != null) {
            i10 = str25.hashCode();
        }
        return hashCode34 + i10;
    }

    public final Boolean isRetainSwap() {
        return this.isRetainSwap;
    }

    public String toString() {
        return "Data(applNo=" + this.applNo + ", authMode=" + this.authMode + ", chassisNo=" + this.chassisNo + ", currentAddress1=" + this.currentAddress1 + ", currentAddress2=" + this.currentAddress2 + ", currentAddress3=" + this.currentAddress3 + ", currentDistrict=" + this.currentDistrict + ", currentPinCode=" + this.currentPinCode + ", currentState=" + this.currentState + ", emailId=" + this.emailId + ", fatherName=" + this.fatherName + ", garageAddress=" + this.garageAddress + ", isRetainSwap=" + this.isRetainSwap + ", movedOn=" + this.movedOn + ", officeCode=" + this.officeCode + ", openDate=" + this.openDate + ", ownerCategory=" + this.ownerCategory + ", ownerCode=" + this.ownerCode + ", ownerFrom=" + this.ownerFrom + ", ownerName=" + this.ownerName + ", ownerSerial=" + this.ownerSerial + ", panNo=" + this.panNo + ", permanentAddress1=" + this.permanentAddress1 + ", permanentAddress2=" + this.permanentAddress2 + ", permanentAddress3=" + this.permanentAddress3 + ", permanentDistrict=" + this.permanentDistrict + ", permanentPinCode=" + this.permanentPinCode + ", permanentState=" + this.permanentState + ", purposeCode=" + this.purposeCode + ", reason=" + this.reason + ", regnNo=" + this.regnNo + ", saleAmmount=" + this.saleAmmount + ", saleDate=" + this.saleDate + ", services=" + this.services + ", stateCode=" + this.stateCode + ", transferDate=" + this.transferDate + ')';
    }
}
