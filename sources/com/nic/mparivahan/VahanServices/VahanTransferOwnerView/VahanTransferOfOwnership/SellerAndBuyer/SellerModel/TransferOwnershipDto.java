package com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel;

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
    private final int currentDistrict;
    private final int currentPinCode;
    private final String currentState;
    private final String emailId;
    private final String fatherName;
    private final String garageAddress;
    private final boolean isRetainSwap;
    private final String mobileNo;
    private final String movedOn;
    private final int officeCode;
    private final String openDate;
    private final int ownerCategory;
    private final String ownerCategoryDesc;
    private final int ownerCode;
    private final String ownerCodeDesc;
    private final String ownerFrom;
    private final String ownerName;
    private final int ownerSerial;
    private final String panNo;
    private final String permanentAddress1;
    private final String permanentAddress2;
    private final String permanentAddress3;
    private final int permanentDistrict;
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

    public TransferOwnershipDto(String str, String str2, String str3, String str4, String str5, String str6, int i10, int i11, String str7, String str8, String str9, String str10, boolean z10, String str11, String str12, int i12, String str13, int i13, String str14, int i14, String str15, String str16, String str17, int i15, String str18, String str19, String str20, String str21, int i16, int i17, String str22, int i18, String str23, String str24, long j10, String str25, String str26, String str27, String str28) {
        this.applNo = str;
        this.authMode = str2;
        this.chassisNo = str3;
        this.currentAddress1 = str4;
        this.currentAddress2 = str5;
        this.currentAddress3 = str6;
        this.currentDistrict = i10;
        this.currentPinCode = i11;
        this.currentState = str7;
        this.emailId = str8;
        this.fatherName = str9;
        this.garageAddress = str10;
        this.isRetainSwap = z10;
        this.mobileNo = str11;
        this.movedOn = str12;
        this.officeCode = i12;
        this.openDate = str13;
        this.ownerCategory = i13;
        this.ownerCategoryDesc = str14;
        this.ownerCode = i14;
        this.ownerCodeDesc = str15;
        this.ownerFrom = str16;
        this.ownerName = str17;
        this.ownerSerial = i15;
        this.panNo = str18;
        this.permanentAddress1 = str19;
        this.permanentAddress2 = str20;
        this.permanentAddress3 = str21;
        this.permanentDistrict = i16;
        this.permanentPinCode = i17;
        this.permanentState = str22;
        this.purposeCode = i18;
        this.reason = str23;
        this.regnNo = str24;
        this.saleAmmount = j10;
        this.saleDate = str25;
        this.services = str26;
        this.stateCode = str27;
        this.transferDate = str28;
    }

    public static /* synthetic */ TransferOwnershipDto copy$default(TransferOwnershipDto transferOwnershipDto, String str, String str2, String str3, String str4, String str5, String str6, int i10, int i11, String str7, String str8, String str9, String str10, boolean z10, String str11, String str12, int i12, String str13, int i13, String str14, int i14, String str15, String str16, String str17, int i15, String str18, String str19, String str20, String str21, int i16, int i17, String str22, int i18, String str23, String str24, long j10, String str25, String str26, String str27, String str28, int i19, int i20, Object obj) {
        TransferOwnershipDto transferOwnershipDto2 = transferOwnershipDto;
        int i21 = i19;
        return transferOwnershipDto.copy((i21 & 1) != 0 ? transferOwnershipDto2.applNo : str, (i21 & 2) != 0 ? transferOwnershipDto2.authMode : str2, (i21 & 4) != 0 ? transferOwnershipDto2.chassisNo : str3, (i21 & 8) != 0 ? transferOwnershipDto2.currentAddress1 : str4, (i21 & 16) != 0 ? transferOwnershipDto2.currentAddress2 : str5, (i21 & 32) != 0 ? transferOwnershipDto2.currentAddress3 : str6, (i21 & 64) != 0 ? transferOwnershipDto2.currentDistrict : i10, (i21 & 128) != 0 ? transferOwnershipDto2.currentPinCode : i11, (i21 & 256) != 0 ? transferOwnershipDto2.currentState : str7, (i21 & 512) != 0 ? transferOwnershipDto2.emailId : str8, (i21 & 1024) != 0 ? transferOwnershipDto2.fatherName : str9, (i21 & 2048) != 0 ? transferOwnershipDto2.garageAddress : str10, (i21 & 4096) != 0 ? transferOwnershipDto2.isRetainSwap : z10, (i21 & 8192) != 0 ? transferOwnershipDto2.mobileNo : str11, (i21 & 16384) != 0 ? transferOwnershipDto2.movedOn : str12, (i21 & 32768) != 0 ? transferOwnershipDto2.officeCode : i12, (i21 & 65536) != 0 ? transferOwnershipDto2.openDate : str13, (i21 & 131072) != 0 ? transferOwnershipDto2.ownerCategory : i13, (i21 & 262144) != 0 ? transferOwnershipDto2.ownerCategoryDesc : str14, (i21 & 524288) != 0 ? transferOwnershipDto2.ownerCode : i14, (i21 & 1048576) != 0 ? transferOwnershipDto2.ownerCodeDesc : str15, (i21 & 2097152) != 0 ? transferOwnershipDto2.ownerFrom : str16, (i21 & 4194304) != 0 ? transferOwnershipDto2.ownerName : str17, (i21 & 8388608) != 0 ? transferOwnershipDto2.ownerSerial : i15, (i21 & 16777216) != 0 ? transferOwnershipDto2.panNo : str18, (i21 & 33554432) != 0 ? transferOwnershipDto2.permanentAddress1 : str19, (i21 & 67108864) != 0 ? transferOwnershipDto2.permanentAddress2 : str20, (i21 & 134217728) != 0 ? transferOwnershipDto2.permanentAddress3 : str21, (i21 & 268435456) != 0 ? transferOwnershipDto2.permanentDistrict : i16, (i21 & 536870912) != 0 ? transferOwnershipDto2.permanentPinCode : i17, (i21 & 1073741824) != 0 ? transferOwnershipDto2.permanentState : str22, (i21 & Integer.MIN_VALUE) != 0 ? transferOwnershipDto2.purposeCode : i18, (i20 & 1) != 0 ? transferOwnershipDto2.reason : str23, (i20 & 2) != 0 ? transferOwnershipDto2.regnNo : str24, (i20 & 4) != 0 ? transferOwnershipDto2.saleAmmount : j10, (i20 & 8) != 0 ? transferOwnershipDto2.saleDate : str25, (i20 & 16) != 0 ? transferOwnershipDto2.services : str26, (i20 & 32) != 0 ? transferOwnershipDto2.stateCode : str27, (i20 & 64) != 0 ? transferOwnershipDto2.transferDate : str28);
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
        return this.mobileNo;
    }

    public final String component15() {
        return this.movedOn;
    }

    public final int component16() {
        return this.officeCode;
    }

    public final String component17() {
        return this.openDate;
    }

    public final int component18() {
        return this.ownerCategory;
    }

    public final String component19() {
        return this.ownerCategoryDesc;
    }

    public final String component2() {
        return this.authMode;
    }

    public final int component20() {
        return this.ownerCode;
    }

    public final String component21() {
        return this.ownerCodeDesc;
    }

    public final String component22() {
        return this.ownerFrom;
    }

    public final String component23() {
        return this.ownerName;
    }

    public final int component24() {
        return this.ownerSerial;
    }

    public final String component25() {
        return this.panNo;
    }

    public final String component26() {
        return this.permanentAddress1;
    }

    public final String component27() {
        return this.permanentAddress2;
    }

    public final String component28() {
        return this.permanentAddress3;
    }

    public final int component29() {
        return this.permanentDistrict;
    }

    public final String component3() {
        return this.chassisNo;
    }

    public final int component30() {
        return this.permanentPinCode;
    }

    public final String component31() {
        return this.permanentState;
    }

    public final int component32() {
        return this.purposeCode;
    }

    public final String component33() {
        return this.reason;
    }

    public final String component34() {
        return this.regnNo;
    }

    public final long component35() {
        return this.saleAmmount;
    }

    public final String component36() {
        return this.saleDate;
    }

    public final String component37() {
        return this.services;
    }

    public final String component38() {
        return this.stateCode;
    }

    public final String component39() {
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

    public final int component7() {
        return this.currentDistrict;
    }

    public final int component8() {
        return this.currentPinCode;
    }

    public final String component9() {
        return this.currentState;
    }

    public final TransferOwnershipDto copy(String str, String str2, String str3, String str4, String str5, String str6, int i10, int i11, String str7, String str8, String str9, String str10, boolean z10, String str11, String str12, int i12, String str13, int i13, String str14, int i14, String str15, String str16, String str17, int i15, String str18, String str19, String str20, String str21, int i16, int i17, String str22, int i18, String str23, String str24, long j10, String str25, String str26, String str27, String str28) {
        return new TransferOwnershipDto(str, str2, str3, str4, str5, str6, i10, i11, str7, str8, str9, str10, z10, str11, str12, i12, str13, i13, str14, i14, str15, str16, str17, i15, str18, str19, str20, str21, i16, i17, str22, i18, str23, str24, j10, str25, str26, str27, str28);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransferOwnershipDto)) {
            return false;
        }
        TransferOwnershipDto transferOwnershipDto = (TransferOwnershipDto) obj;
        return l.a(this.applNo, transferOwnershipDto.applNo) && l.a(this.authMode, transferOwnershipDto.authMode) && l.a(this.chassisNo, transferOwnershipDto.chassisNo) && l.a(this.currentAddress1, transferOwnershipDto.currentAddress1) && l.a(this.currentAddress2, transferOwnershipDto.currentAddress2) && l.a(this.currentAddress3, transferOwnershipDto.currentAddress3) && this.currentDistrict == transferOwnershipDto.currentDistrict && this.currentPinCode == transferOwnershipDto.currentPinCode && l.a(this.currentState, transferOwnershipDto.currentState) && l.a(this.emailId, transferOwnershipDto.emailId) && l.a(this.fatherName, transferOwnershipDto.fatherName) && l.a(this.garageAddress, transferOwnershipDto.garageAddress) && this.isRetainSwap == transferOwnershipDto.isRetainSwap && l.a(this.mobileNo, transferOwnershipDto.mobileNo) && l.a(this.movedOn, transferOwnershipDto.movedOn) && this.officeCode == transferOwnershipDto.officeCode && l.a(this.openDate, transferOwnershipDto.openDate) && this.ownerCategory == transferOwnershipDto.ownerCategory && l.a(this.ownerCategoryDesc, transferOwnershipDto.ownerCategoryDesc) && this.ownerCode == transferOwnershipDto.ownerCode && l.a(this.ownerCodeDesc, transferOwnershipDto.ownerCodeDesc) && l.a(this.ownerFrom, transferOwnershipDto.ownerFrom) && l.a(this.ownerName, transferOwnershipDto.ownerName) && this.ownerSerial == transferOwnershipDto.ownerSerial && l.a(this.panNo, transferOwnershipDto.panNo) && l.a(this.permanentAddress1, transferOwnershipDto.permanentAddress1) && l.a(this.permanentAddress2, transferOwnershipDto.permanentAddress2) && l.a(this.permanentAddress3, transferOwnershipDto.permanentAddress3) && this.permanentDistrict == transferOwnershipDto.permanentDistrict && this.permanentPinCode == transferOwnershipDto.permanentPinCode && l.a(this.permanentState, transferOwnershipDto.permanentState) && this.purposeCode == transferOwnershipDto.purposeCode && l.a(this.reason, transferOwnershipDto.reason) && l.a(this.regnNo, transferOwnershipDto.regnNo) && this.saleAmmount == transferOwnershipDto.saleAmmount && l.a(this.saleDate, transferOwnershipDto.saleDate) && l.a(this.services, transferOwnershipDto.services) && l.a(this.stateCode, transferOwnershipDto.stateCode) && l.a(this.transferDate, transferOwnershipDto.transferDate);
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

    public final int getCurrentDistrict() {
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

    public final String getMobileNo() {
        return this.mobileNo;
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

    public final String getOwnerCategoryDesc() {
        return this.ownerCategoryDesc;
    }

    public final int getOwnerCode() {
        return this.ownerCode;
    }

    public final String getOwnerCodeDesc() {
        return this.ownerCodeDesc;
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

    public final int getPermanentDistrict() {
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
        int hashCode6 = (((((hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31) + Integer.hashCode(this.currentDistrict)) * 31) + Integer.hashCode(this.currentPinCode)) * 31;
        String str7 = this.currentState;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.emailId;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.fatherName;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.garageAddress;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        boolean z10 = this.isRetainSwap;
        if (z10) {
            z10 = true;
        }
        int i11 = (hashCode10 + (z10 ? 1 : 0)) * 31;
        String str11 = this.mobileNo;
        int hashCode11 = (i11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.movedOn;
        int hashCode12 = (((hashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31) + Integer.hashCode(this.officeCode)) * 31;
        String str13 = this.openDate;
        int hashCode13 = (((hashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31) + Integer.hashCode(this.ownerCategory)) * 31;
        String str14 = this.ownerCategoryDesc;
        int hashCode14 = (((hashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31) + Integer.hashCode(this.ownerCode)) * 31;
        String str15 = this.ownerCodeDesc;
        int hashCode15 = (hashCode14 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.ownerFrom;
        int hashCode16 = (hashCode15 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.ownerName;
        int hashCode17 = (((hashCode16 + (str17 == null ? 0 : str17.hashCode())) * 31) + Integer.hashCode(this.ownerSerial)) * 31;
        String str18 = this.panNo;
        int hashCode18 = (hashCode17 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.permanentAddress1;
        int hashCode19 = (hashCode18 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.permanentAddress2;
        int hashCode20 = (hashCode19 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.permanentAddress3;
        int hashCode21 = (((((hashCode20 + (str21 == null ? 0 : str21.hashCode())) * 31) + Integer.hashCode(this.permanentDistrict)) * 31) + Integer.hashCode(this.permanentPinCode)) * 31;
        String str22 = this.permanentState;
        int hashCode22 = (((hashCode21 + (str22 == null ? 0 : str22.hashCode())) * 31) + Integer.hashCode(this.purposeCode)) * 31;
        String str23 = this.reason;
        int hashCode23 = (hashCode22 + (str23 == null ? 0 : str23.hashCode())) * 31;
        String str24 = this.regnNo;
        int hashCode24 = (((hashCode23 + (str24 == null ? 0 : str24.hashCode())) * 31) + Long.hashCode(this.saleAmmount)) * 31;
        String str25 = this.saleDate;
        int hashCode25 = (hashCode24 + (str25 == null ? 0 : str25.hashCode())) * 31;
        String str26 = this.services;
        int hashCode26 = (hashCode25 + (str26 == null ? 0 : str26.hashCode())) * 31;
        String str27 = this.stateCode;
        int hashCode27 = (hashCode26 + (str27 == null ? 0 : str27.hashCode())) * 31;
        String str28 = this.transferDate;
        if (str28 != null) {
            i10 = str28.hashCode();
        }
        return hashCode27 + i10;
    }

    public final boolean isRetainSwap() {
        return this.isRetainSwap;
    }

    public String toString() {
        return "TransferOwnershipDto(applNo=" + this.applNo + ", authMode=" + this.authMode + ", chassisNo=" + this.chassisNo + ", currentAddress1=" + this.currentAddress1 + ", currentAddress2=" + this.currentAddress2 + ", currentAddress3=" + this.currentAddress3 + ", currentDistrict=" + this.currentDistrict + ", currentPinCode=" + this.currentPinCode + ", currentState=" + this.currentState + ", emailId=" + this.emailId + ", fatherName=" + this.fatherName + ", garageAddress=" + this.garageAddress + ", isRetainSwap=" + this.isRetainSwap + ", mobileNo=" + this.mobileNo + ", movedOn=" + this.movedOn + ", officeCode=" + this.officeCode + ", openDate=" + this.openDate + ", ownerCategory=" + this.ownerCategory + ", ownerCategoryDesc=" + this.ownerCategoryDesc + ", ownerCode=" + this.ownerCode + ", ownerCodeDesc=" + this.ownerCodeDesc + ", ownerFrom=" + this.ownerFrom + ", ownerName=" + this.ownerName + ", ownerSerial=" + this.ownerSerial + ", panNo=" + this.panNo + ", permanentAddress1=" + this.permanentAddress1 + ", permanentAddress2=" + this.permanentAddress2 + ", permanentAddress3=" + this.permanentAddress3 + ", permanentDistrict=" + this.permanentDistrict + ", permanentPinCode=" + this.permanentPinCode + ", permanentState=" + this.permanentState + ", purposeCode=" + this.purposeCode + ", reason=" + this.reason + ", regnNo=" + this.regnNo + ", saleAmmount=" + this.saleAmmount + ", saleDate=" + this.saleDate + ", services=" + this.services + ", stateCode=" + this.stateCode + ", transferDate=" + this.transferDate + ')';
    }
}
