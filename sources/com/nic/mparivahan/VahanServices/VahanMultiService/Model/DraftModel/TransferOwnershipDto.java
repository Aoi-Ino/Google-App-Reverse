package com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel;

import androidx.annotation.Keep;
import cm.l;
import java.io.Serializable;

@Keep
public final class TransferOwnershipDto implements Serializable {
    private final String applNo;
    private final String authMode;
    private final String chassisNo;
    private final String currentAddress1;
    private final String currentAddress2;
    private final String currentAddress3;
    private final String currentDistrict;
    private final int currentPinCode;
    private final String currentState;
    private final String emailId;
    private final String fatherName;
    private final String garageAddress;
    private final boolean isRetainSwap;
    private final String movedOn;
    private final int officeCode;
    private final String openDate;
    private final int ownerCategory;
    private final int ownerCode;
    private final String ownerFrom;
    private final String ownerName;
    private final int ownerSerial;
    private final String panNo;
    private final String permanentAddress1;
    private final String permanentAddress2;
    private final String permanentAddress3;
    private final String permanentDistrict;
    private final int permanentPinCode;
    private final String permanentState;
    private final int purposeCode;
    private final String reason;
    private final String regnNo;
    private final long saleAmmount;
    private final String saleDate;
    private final String services;
    private final String stateCode;
    private final String transferDate;

    public TransferOwnershipDto(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i10, String str8, String str9, String str10, String str11, boolean z10, String str12, int i11, String str13, int i12, int i13, String str14, String str15, int i14, String str16, String str17, String str18, String str19, String str20, int i15, String str21, int i16, String str22, String str23, long j10, String str24, String str25, String str26, String str27) {
        String str28 = str2;
        String str29 = str3;
        String str30 = str4;
        String str31 = str5;
        String str32 = str6;
        String str33 = str7;
        String str34 = str8;
        String str35 = str9;
        String str36 = str10;
        String str37 = str11;
        String str38 = str12;
        String str39 = str13;
        String str40 = str14;
        String str41 = str15;
        String str42 = str17;
        l.f(str28, "authMode");
        l.f(str29, "chassisNo");
        l.f(str30, "currentAddress1");
        l.f(str31, "currentAddress2");
        l.f(str32, "currentAddress3");
        l.f(str33, "currentDistrict");
        l.f(str34, "currentState");
        l.f(str35, "emailId");
        l.f(str36, "fatherName");
        l.f(str37, "garageAddress");
        l.f(str38, "movedOn");
        l.f(str39, "openDate");
        l.f(str40, "ownerFrom");
        l.f(str41, "ownerName");
        l.f(str16, "panNo");
        l.f(str17, "permanentAddress1");
        l.f(str18, "permanentAddress2");
        l.f(str19, "permanentAddress3");
        l.f(str21, "permanentState");
        l.f(str22, "reason");
        l.f(str23, "regnNo");
        l.f(str24, "saleDate");
        l.f(str25, "services");
        l.f(str26, "stateCode");
        l.f(str27, "transferDate");
        this.applNo = str;
        this.authMode = str28;
        this.chassisNo = str29;
        this.currentAddress1 = str30;
        this.currentAddress2 = str31;
        this.currentAddress3 = str32;
        this.currentDistrict = str33;
        this.currentPinCode = i10;
        this.currentState = str34;
        this.emailId = str35;
        this.fatherName = str36;
        this.garageAddress = str37;
        this.isRetainSwap = z10;
        this.movedOn = str38;
        this.officeCode = i11;
        this.openDate = str39;
        this.ownerCategory = i12;
        this.ownerCode = i13;
        this.ownerFrom = str40;
        this.ownerName = str41;
        this.ownerSerial = i14;
        this.panNo = str16;
        this.permanentAddress1 = str17;
        this.permanentAddress2 = str18;
        this.permanentAddress3 = str19;
        this.permanentDistrict = str20;
        this.permanentPinCode = i15;
        this.permanentState = str21;
        this.purposeCode = i16;
        this.reason = str22;
        this.regnNo = str23;
        this.saleAmmount = j10;
        this.saleDate = str24;
        this.services = str25;
        this.stateCode = str26;
        this.transferDate = str27;
    }

    public static /* synthetic */ TransferOwnershipDto copy$default(TransferOwnershipDto transferOwnershipDto, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i10, String str8, String str9, String str10, String str11, boolean z10, String str12, int i11, String str13, int i12, int i13, String str14, String str15, int i14, String str16, String str17, String str18, String str19, String str20, int i15, String str21, int i16, String str22, String str23, long j10, String str24, String str25, String str26, String str27, int i17, int i18, Object obj) {
        TransferOwnershipDto transferOwnershipDto2 = transferOwnershipDto;
        int i19 = i17;
        return transferOwnershipDto.copy((i19 & 1) != 0 ? transferOwnershipDto2.applNo : str, (i19 & 2) != 0 ? transferOwnershipDto2.authMode : str2, (i19 & 4) != 0 ? transferOwnershipDto2.chassisNo : str3, (i19 & 8) != 0 ? transferOwnershipDto2.currentAddress1 : str4, (i19 & 16) != 0 ? transferOwnershipDto2.currentAddress2 : str5, (i19 & 32) != 0 ? transferOwnershipDto2.currentAddress3 : str6, (i19 & 64) != 0 ? transferOwnershipDto2.currentDistrict : str7, (i19 & 128) != 0 ? transferOwnershipDto2.currentPinCode : i10, (i19 & 256) != 0 ? transferOwnershipDto2.currentState : str8, (i19 & 512) != 0 ? transferOwnershipDto2.emailId : str9, (i19 & 1024) != 0 ? transferOwnershipDto2.fatherName : str10, (i19 & 2048) != 0 ? transferOwnershipDto2.garageAddress : str11, (i19 & 4096) != 0 ? transferOwnershipDto2.isRetainSwap : z10, (i19 & 8192) != 0 ? transferOwnershipDto2.movedOn : str12, (i19 & 16384) != 0 ? transferOwnershipDto2.officeCode : i11, (i19 & 32768) != 0 ? transferOwnershipDto2.openDate : str13, (i19 & 65536) != 0 ? transferOwnershipDto2.ownerCategory : i12, (i19 & 131072) != 0 ? transferOwnershipDto2.ownerCode : i13, (i19 & 262144) != 0 ? transferOwnershipDto2.ownerFrom : str14, (i19 & 524288) != 0 ? transferOwnershipDto2.ownerName : str15, (i19 & 1048576) != 0 ? transferOwnershipDto2.ownerSerial : i14, (i19 & 2097152) != 0 ? transferOwnershipDto2.panNo : str16, (i19 & 4194304) != 0 ? transferOwnershipDto2.permanentAddress1 : str17, (i19 & 8388608) != 0 ? transferOwnershipDto2.permanentAddress2 : str18, (i19 & 16777216) != 0 ? transferOwnershipDto2.permanentAddress3 : str19, (i19 & 33554432) != 0 ? transferOwnershipDto2.permanentDistrict : str20, (i19 & 67108864) != 0 ? transferOwnershipDto2.permanentPinCode : i15, (i19 & 134217728) != 0 ? transferOwnershipDto2.permanentState : str21, (i19 & 268435456) != 0 ? transferOwnershipDto2.purposeCode : i16, (i19 & 536870912) != 0 ? transferOwnershipDto2.reason : str22, (i19 & 1073741824) != 0 ? transferOwnershipDto2.regnNo : str23, (i19 & Integer.MIN_VALUE) != 0 ? transferOwnershipDto2.saleAmmount : j10, (i18 & 1) != 0 ? transferOwnershipDto2.saleDate : str24, (i18 & 2) != 0 ? transferOwnershipDto2.services : str25, (i18 & 4) != 0 ? transferOwnershipDto2.stateCode : str26, (i18 & 8) != 0 ? transferOwnershipDto2.transferDate : str27);
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

    public final boolean component13() {
        return this.isRetainSwap;
    }

    public final String component14() {
        return this.movedOn;
    }

    public final int component15() {
        return this.officeCode;
    }

    public final String component16() {
        return this.openDate;
    }

    public final int component17() {
        return this.ownerCategory;
    }

    public final int component18() {
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

    public final String component26() {
        return this.permanentDistrict;
    }

    public final int component27() {
        return this.permanentPinCode;
    }

    public final String component28() {
        return this.permanentState;
    }

    public final int component29() {
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

    public final long component32() {
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

    public final String component7() {
        return this.currentDistrict;
    }

    public final int component8() {
        return this.currentPinCode;
    }

    public final String component9() {
        return this.currentState;
    }

    public final TransferOwnershipDto copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i10, String str8, String str9, String str10, String str11, boolean z10, String str12, int i11, String str13, int i12, int i13, String str14, String str15, int i14, String str16, String str17, String str18, String str19, String str20, int i15, String str21, int i16, String str22, String str23, long j10, String str24, String str25, String str26, String str27) {
        String str28 = str;
        l.f(str2, "authMode");
        l.f(str3, "chassisNo");
        l.f(str4, "currentAddress1");
        l.f(str5, "currentAddress2");
        l.f(str6, "currentAddress3");
        l.f(str7, "currentDistrict");
        l.f(str8, "currentState");
        l.f(str9, "emailId");
        l.f(str10, "fatherName");
        l.f(str11, "garageAddress");
        l.f(str12, "movedOn");
        l.f(str13, "openDate");
        l.f(str14, "ownerFrom");
        l.f(str15, "ownerName");
        l.f(str16, "panNo");
        l.f(str17, "permanentAddress1");
        l.f(str18, "permanentAddress2");
        l.f(str19, "permanentAddress3");
        l.f(str21, "permanentState");
        l.f(str22, "reason");
        l.f(str23, "regnNo");
        l.f(str24, "saleDate");
        l.f(str25, "services");
        l.f(str26, "stateCode");
        l.f(str27, "transferDate");
        return new TransferOwnershipDto(str, str2, str3, str4, str5, str6, str7, i10, str8, str9, str10, str11, z10, str12, i11, str13, i12, i13, str14, str15, i14, str16, str17, str18, str19, str20, i15, str21, i16, str22, str23, j10, str24, str25, str26, str27);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransferOwnershipDto)) {
            return false;
        }
        TransferOwnershipDto transferOwnershipDto = (TransferOwnershipDto) obj;
        return l.a(this.applNo, transferOwnershipDto.applNo) && l.a(this.authMode, transferOwnershipDto.authMode) && l.a(this.chassisNo, transferOwnershipDto.chassisNo) && l.a(this.currentAddress1, transferOwnershipDto.currentAddress1) && l.a(this.currentAddress2, transferOwnershipDto.currentAddress2) && l.a(this.currentAddress3, transferOwnershipDto.currentAddress3) && l.a(this.currentDistrict, transferOwnershipDto.currentDistrict) && this.currentPinCode == transferOwnershipDto.currentPinCode && l.a(this.currentState, transferOwnershipDto.currentState) && l.a(this.emailId, transferOwnershipDto.emailId) && l.a(this.fatherName, transferOwnershipDto.fatherName) && l.a(this.garageAddress, transferOwnershipDto.garageAddress) && this.isRetainSwap == transferOwnershipDto.isRetainSwap && l.a(this.movedOn, transferOwnershipDto.movedOn) && this.officeCode == transferOwnershipDto.officeCode && l.a(this.openDate, transferOwnershipDto.openDate) && this.ownerCategory == transferOwnershipDto.ownerCategory && this.ownerCode == transferOwnershipDto.ownerCode && l.a(this.ownerFrom, transferOwnershipDto.ownerFrom) && l.a(this.ownerName, transferOwnershipDto.ownerName) && this.ownerSerial == transferOwnershipDto.ownerSerial && l.a(this.panNo, transferOwnershipDto.panNo) && l.a(this.permanentAddress1, transferOwnershipDto.permanentAddress1) && l.a(this.permanentAddress2, transferOwnershipDto.permanentAddress2) && l.a(this.permanentAddress3, transferOwnershipDto.permanentAddress3) && l.a(this.permanentDistrict, transferOwnershipDto.permanentDistrict) && this.permanentPinCode == transferOwnershipDto.permanentPinCode && l.a(this.permanentState, transferOwnershipDto.permanentState) && this.purposeCode == transferOwnershipDto.purposeCode && l.a(this.reason, transferOwnershipDto.reason) && l.a(this.regnNo, transferOwnershipDto.regnNo) && this.saleAmmount == transferOwnershipDto.saleAmmount && l.a(this.saleDate, transferOwnershipDto.saleDate) && l.a(this.services, transferOwnershipDto.services) && l.a(this.stateCode, transferOwnershipDto.stateCode) && l.a(this.transferDate, transferOwnershipDto.transferDate);
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

    public final String getCurrentDistrict() {
        return this.currentDistrict;
    }

    public final int getCurrentPinCode() {
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

    public final int getOfficeCode() {
        return this.officeCode;
    }

    public final String getOpenDate() {
        return this.openDate;
    }

    public final int getOwnerCategory() {
        return this.ownerCategory;
    }

    public final int getOwnerCode() {
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

    public final String getPermanentDistrict() {
        return this.permanentDistrict;
    }

    public final int getPermanentPinCode() {
        return this.permanentPinCode;
    }

    public final String getPermanentState() {
        return this.permanentState;
    }

    public final int getPurposeCode() {
        return this.purposeCode;
    }

    public final String getReason() {
        return this.reason;
    }

    public final String getRegnNo() {
        return this.regnNo;
    }

    public final long getSaleAmmount() {
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
        int hashCode = (((((((((((((((((((((((str == null ? 0 : str.hashCode()) * 31) + this.authMode.hashCode()) * 31) + this.chassisNo.hashCode()) * 31) + this.currentAddress1.hashCode()) * 31) + this.currentAddress2.hashCode()) * 31) + this.currentAddress3.hashCode()) * 31) + this.currentDistrict.hashCode()) * 31) + Integer.hashCode(this.currentPinCode)) * 31) + this.currentState.hashCode()) * 31) + this.emailId.hashCode()) * 31) + this.fatherName.hashCode()) * 31) + this.garageAddress.hashCode()) * 31;
        boolean z10 = this.isRetainSwap;
        if (z10) {
            z10 = true;
        }
        int hashCode2 = (((((((((((((((((((((((((hashCode + (z10 ? 1 : 0)) * 31) + this.movedOn.hashCode()) * 31) + Integer.hashCode(this.officeCode)) * 31) + this.openDate.hashCode()) * 31) + Integer.hashCode(this.ownerCategory)) * 31) + Integer.hashCode(this.ownerCode)) * 31) + this.ownerFrom.hashCode()) * 31) + this.ownerName.hashCode()) * 31) + Integer.hashCode(this.ownerSerial)) * 31) + this.panNo.hashCode()) * 31) + this.permanentAddress1.hashCode()) * 31) + this.permanentAddress2.hashCode()) * 31) + this.permanentAddress3.hashCode()) * 31;
        String str2 = this.permanentDistrict;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return ((((((((((((((((((((hashCode2 + i10) * 31) + Integer.hashCode(this.permanentPinCode)) * 31) + this.permanentState.hashCode()) * 31) + Integer.hashCode(this.purposeCode)) * 31) + this.reason.hashCode()) * 31) + this.regnNo.hashCode()) * 31) + Long.hashCode(this.saleAmmount)) * 31) + this.saleDate.hashCode()) * 31) + this.services.hashCode()) * 31) + this.stateCode.hashCode()) * 31) + this.transferDate.hashCode();
    }

    public final boolean isRetainSwap() {
        return this.isRetainSwap;
    }

    public String toString() {
        return "TransferOwnershipDto(applNo=" + this.applNo + ", authMode=" + this.authMode + ", chassisNo=" + this.chassisNo + ", currentAddress1=" + this.currentAddress1 + ", currentAddress2=" + this.currentAddress2 + ", currentAddress3=" + this.currentAddress3 + ", currentDistrict=" + this.currentDistrict + ", currentPinCode=" + this.currentPinCode + ", currentState=" + this.currentState + ", emailId=" + this.emailId + ", fatherName=" + this.fatherName + ", garageAddress=" + this.garageAddress + ", isRetainSwap=" + this.isRetainSwap + ", movedOn=" + this.movedOn + ", officeCode=" + this.officeCode + ", openDate=" + this.openDate + ", ownerCategory=" + this.ownerCategory + ", ownerCode=" + this.ownerCode + ", ownerFrom=" + this.ownerFrom + ", ownerName=" + this.ownerName + ", ownerSerial=" + this.ownerSerial + ", panNo=" + this.panNo + ", permanentAddress1=" + this.permanentAddress1 + ", permanentAddress2=" + this.permanentAddress2 + ", permanentAddress3=" + this.permanentAddress3 + ", permanentDistrict=" + this.permanentDistrict + ", permanentPinCode=" + this.permanentPinCode + ", permanentState=" + this.permanentState + ", purposeCode=" + this.purposeCode + ", reason=" + this.reason + ", regnNo=" + this.regnNo + ", saleAmmount=" + this.saleAmmount + ", saleDate=" + this.saleDate + ", services=" + this.services + ", stateCode=" + this.stateCode + ", transferDate=" + this.transferDate + ')';
    }
}
