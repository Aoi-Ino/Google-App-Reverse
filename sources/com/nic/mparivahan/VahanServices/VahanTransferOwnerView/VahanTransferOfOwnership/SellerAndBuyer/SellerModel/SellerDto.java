package com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class SellerDto {
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
    private final int ownerCode;
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
    private final int saleAmmount;
    private final String saleDate;
    private final String services;
    private final String stateCode;
    private final String transferDate;

    public SellerDto(String str, String str2, String str3, String str4, String str5, String str6, int i10, int i11, String str7, String str8, String str9, String str10, boolean z10, String str11, String str12, int i12, String str13, int i13, int i14, String str14, String str15, int i15, String str16, String str17, String str18, String str19, int i16, int i17, String str20, int i18, String str21, String str22, int i19, String str23, String str24, String str25, String str26) {
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
        this.ownerCode = i14;
        this.ownerFrom = str14;
        this.ownerName = str15;
        this.ownerSerial = i15;
        this.panNo = str16;
        this.permanentAddress1 = str17;
        this.permanentAddress2 = str18;
        this.permanentAddress3 = str19;
        this.permanentDistrict = i16;
        this.permanentPinCode = i17;
        this.permanentState = str20;
        this.purposeCode = i18;
        this.reason = str21;
        this.regnNo = str22;
        this.saleAmmount = i19;
        this.saleDate = str23;
        this.services = str24;
        this.stateCode = str25;
        this.transferDate = str26;
    }

    public static /* synthetic */ SellerDto copy$default(SellerDto sellerDto, String str, String str2, String str3, String str4, String str5, String str6, int i10, int i11, String str7, String str8, String str9, String str10, boolean z10, String str11, String str12, int i12, String str13, int i13, int i14, String str14, String str15, int i15, String str16, String str17, String str18, String str19, int i16, int i17, String str20, int i18, String str21, String str22, int i19, String str23, String str24, String str25, String str26, int i20, int i21, Object obj) {
        SellerDto sellerDto2 = sellerDto;
        int i22 = i20;
        return sellerDto.copy((i22 & 1) != 0 ? sellerDto2.applNo : str, (i22 & 2) != 0 ? sellerDto2.authMode : str2, (i22 & 4) != 0 ? sellerDto2.chassisNo : str3, (i22 & 8) != 0 ? sellerDto2.currentAddress1 : str4, (i22 & 16) != 0 ? sellerDto2.currentAddress2 : str5, (i22 & 32) != 0 ? sellerDto2.currentAddress3 : str6, (i22 & 64) != 0 ? sellerDto2.currentDistrict : i10, (i22 & 128) != 0 ? sellerDto2.currentPinCode : i11, (i22 & 256) != 0 ? sellerDto2.currentState : str7, (i22 & 512) != 0 ? sellerDto2.emailId : str8, (i22 & 1024) != 0 ? sellerDto2.fatherName : str9, (i22 & 2048) != 0 ? sellerDto2.garageAddress : str10, (i22 & 4096) != 0 ? sellerDto2.isRetainSwap : z10, (i22 & 8192) != 0 ? sellerDto2.mobileNo : str11, (i22 & 16384) != 0 ? sellerDto2.movedOn : str12, (i22 & 32768) != 0 ? sellerDto2.officeCode : i12, (i22 & 65536) != 0 ? sellerDto2.openDate : str13, (i22 & 131072) != 0 ? sellerDto2.ownerCategory : i13, (i22 & 262144) != 0 ? sellerDto2.ownerCode : i14, (i22 & 524288) != 0 ? sellerDto2.ownerFrom : str14, (i22 & 1048576) != 0 ? sellerDto2.ownerName : str15, (i22 & 2097152) != 0 ? sellerDto2.ownerSerial : i15, (i22 & 4194304) != 0 ? sellerDto2.panNo : str16, (i22 & 8388608) != 0 ? sellerDto2.permanentAddress1 : str17, (i22 & 16777216) != 0 ? sellerDto2.permanentAddress2 : str18, (i22 & 33554432) != 0 ? sellerDto2.permanentAddress3 : str19, (i22 & 67108864) != 0 ? sellerDto2.permanentDistrict : i16, (i22 & 134217728) != 0 ? sellerDto2.permanentPinCode : i17, (i22 & 268435456) != 0 ? sellerDto2.permanentState : str20, (i22 & 536870912) != 0 ? sellerDto2.purposeCode : i18, (i22 & 1073741824) != 0 ? sellerDto2.reason : str21, (i22 & Integer.MIN_VALUE) != 0 ? sellerDto2.regnNo : str22, (i21 & 1) != 0 ? sellerDto2.saleAmmount : i19, (i21 & 2) != 0 ? sellerDto2.saleDate : str23, (i21 & 4) != 0 ? sellerDto2.services : str24, (i21 & 8) != 0 ? sellerDto2.stateCode : str25, (i21 & 16) != 0 ? sellerDto2.transferDate : str26);
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

    public final int component19() {
        return this.ownerCode;
    }

    public final String component2() {
        return this.authMode;
    }

    public final String component20() {
        return this.ownerFrom;
    }

    public final String component21() {
        return this.ownerName;
    }

    public final int component22() {
        return this.ownerSerial;
    }

    public final String component23() {
        return this.panNo;
    }

    public final String component24() {
        return this.permanentAddress1;
    }

    public final String component25() {
        return this.permanentAddress2;
    }

    public final String component26() {
        return this.permanentAddress3;
    }

    public final int component27() {
        return this.permanentDistrict;
    }

    public final int component28() {
        return this.permanentPinCode;
    }

    public final String component29() {
        return this.permanentState;
    }

    public final String component3() {
        return this.chassisNo;
    }

    public final int component30() {
        return this.purposeCode;
    }

    public final String component31() {
        return this.reason;
    }

    public final String component32() {
        return this.regnNo;
    }

    public final int component33() {
        return this.saleAmmount;
    }

    public final String component34() {
        return this.saleDate;
    }

    public final String component35() {
        return this.services;
    }

    public final String component36() {
        return this.stateCode;
    }

    public final String component37() {
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

    public final SellerDto copy(String str, String str2, String str3, String str4, String str5, String str6, int i10, int i11, String str7, String str8, String str9, String str10, boolean z10, String str11, String str12, int i12, String str13, int i13, int i14, String str14, String str15, int i15, String str16, String str17, String str18, String str19, int i16, int i17, String str20, int i18, String str21, String str22, int i19, String str23, String str24, String str25, String str26) {
        return new SellerDto(str, str2, str3, str4, str5, str6, i10, i11, str7, str8, str9, str10, z10, str11, str12, i12, str13, i13, i14, str14, str15, i15, str16, str17, str18, str19, i16, i17, str20, i18, str21, str22, i19, str23, str24, str25, str26);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SellerDto)) {
            return false;
        }
        SellerDto sellerDto = (SellerDto) obj;
        return l.a(this.applNo, sellerDto.applNo) && l.a(this.authMode, sellerDto.authMode) && l.a(this.chassisNo, sellerDto.chassisNo) && l.a(this.currentAddress1, sellerDto.currentAddress1) && l.a(this.currentAddress2, sellerDto.currentAddress2) && l.a(this.currentAddress3, sellerDto.currentAddress3) && this.currentDistrict == sellerDto.currentDistrict && this.currentPinCode == sellerDto.currentPinCode && l.a(this.currentState, sellerDto.currentState) && l.a(this.emailId, sellerDto.emailId) && l.a(this.fatherName, sellerDto.fatherName) && l.a(this.garageAddress, sellerDto.garageAddress) && this.isRetainSwap == sellerDto.isRetainSwap && l.a(this.mobileNo, sellerDto.mobileNo) && l.a(this.movedOn, sellerDto.movedOn) && this.officeCode == sellerDto.officeCode && l.a(this.openDate, sellerDto.openDate) && this.ownerCategory == sellerDto.ownerCategory && this.ownerCode == sellerDto.ownerCode && l.a(this.ownerFrom, sellerDto.ownerFrom) && l.a(this.ownerName, sellerDto.ownerName) && this.ownerSerial == sellerDto.ownerSerial && l.a(this.panNo, sellerDto.panNo) && l.a(this.permanentAddress1, sellerDto.permanentAddress1) && l.a(this.permanentAddress2, sellerDto.permanentAddress2) && l.a(this.permanentAddress3, sellerDto.permanentAddress3) && this.permanentDistrict == sellerDto.permanentDistrict && this.permanentPinCode == sellerDto.permanentPinCode && l.a(this.permanentState, sellerDto.permanentState) && this.purposeCode == sellerDto.purposeCode && l.a(this.reason, sellerDto.reason) && l.a(this.regnNo, sellerDto.regnNo) && this.saleAmmount == sellerDto.saleAmmount && l.a(this.saleDate, sellerDto.saleDate) && l.a(this.services, sellerDto.services) && l.a(this.stateCode, sellerDto.stateCode) && l.a(this.transferDate, sellerDto.transferDate);
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

    public final int getSaleAmmount() {
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
        int hashCode13 = (((((hashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31) + Integer.hashCode(this.ownerCategory)) * 31) + Integer.hashCode(this.ownerCode)) * 31;
        String str14 = this.ownerFrom;
        int hashCode14 = (hashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.ownerName;
        int hashCode15 = (((hashCode14 + (str15 == null ? 0 : str15.hashCode())) * 31) + Integer.hashCode(this.ownerSerial)) * 31;
        String str16 = this.panNo;
        int hashCode16 = (hashCode15 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.permanentAddress1;
        int hashCode17 = (hashCode16 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.permanentAddress2;
        int hashCode18 = (hashCode17 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.permanentAddress3;
        int hashCode19 = (((((hashCode18 + (str19 == null ? 0 : str19.hashCode())) * 31) + Integer.hashCode(this.permanentDistrict)) * 31) + Integer.hashCode(this.permanentPinCode)) * 31;
        String str20 = this.permanentState;
        int hashCode20 = (((hashCode19 + (str20 == null ? 0 : str20.hashCode())) * 31) + Integer.hashCode(this.purposeCode)) * 31;
        String str21 = this.reason;
        int hashCode21 = (hashCode20 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.regnNo;
        int hashCode22 = (((hashCode21 + (str22 == null ? 0 : str22.hashCode())) * 31) + Integer.hashCode(this.saleAmmount)) * 31;
        String str23 = this.saleDate;
        int hashCode23 = (hashCode22 + (str23 == null ? 0 : str23.hashCode())) * 31;
        String str24 = this.services;
        int hashCode24 = (hashCode23 + (str24 == null ? 0 : str24.hashCode())) * 31;
        String str25 = this.stateCode;
        int hashCode25 = (hashCode24 + (str25 == null ? 0 : str25.hashCode())) * 31;
        String str26 = this.transferDate;
        if (str26 != null) {
            i10 = str26.hashCode();
        }
        return hashCode25 + i10;
    }

    public final boolean isRetainSwap() {
        return this.isRetainSwap;
    }

    public String toString() {
        return "SellerDto(applNo=" + this.applNo + ", authMode=" + this.authMode + ", chassisNo=" + this.chassisNo + ", currentAddress1=" + this.currentAddress1 + ", currentAddress2=" + this.currentAddress2 + ", currentAddress3=" + this.currentAddress3 + ", currentDistrict=" + this.currentDistrict + ", currentPinCode=" + this.currentPinCode + ", currentState=" + this.currentState + ", emailId=" + this.emailId + ", fatherName=" + this.fatherName + ", garageAddress=" + this.garageAddress + ", isRetainSwap=" + this.isRetainSwap + ", mobileNo=" + this.mobileNo + ", movedOn=" + this.movedOn + ", officeCode=" + this.officeCode + ", openDate=" + this.openDate + ", ownerCategory=" + this.ownerCategory + ", ownerCode=" + this.ownerCode + ", ownerFrom=" + this.ownerFrom + ", ownerName=" + this.ownerName + ", ownerSerial=" + this.ownerSerial + ", panNo=" + this.panNo + ", permanentAddress1=" + this.permanentAddress1 + ", permanentAddress2=" + this.permanentAddress2 + ", permanentAddress3=" + this.permanentAddress3 + ", permanentDistrict=" + this.permanentDistrict + ", permanentPinCode=" + this.permanentPinCode + ", permanentState=" + this.permanentState + ", purposeCode=" + this.purposeCode + ", reason=" + this.reason + ", regnNo=" + this.regnNo + ", saleAmmount=" + this.saleAmmount + ", saleDate=" + this.saleDate + ", services=" + this.services + ", stateCode=" + this.stateCode + ", transferDate=" + this.transferDate + ')';
    }
}
