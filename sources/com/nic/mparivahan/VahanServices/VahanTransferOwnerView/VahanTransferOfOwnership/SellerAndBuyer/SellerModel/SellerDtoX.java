package com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class SellerDtoX {
    private final String applNo;
    private final String authMode;
    private final String chassisNo;
    private final String currentAddress1;
    private final String currentAddress2;
    private final String currentAddress3;
    private final Integer currentDistrict;
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
    private final Object ownerCategoryDesc;
    private final int ownerCode;
    private final Object ownerCodeDesc;
    private final Object ownerFrom;
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

    public SellerDtoX(String str, String str2, String str3, String str4, String str5, String str6, Integer num, int i10, String str7, String str8, String str9, String str10, boolean z10, String str11, String str12, int i11, String str13, int i12, Object obj, int i13, Object obj2, Object obj3, String str14, int i14, String str15, String str16, String str17, String str18, int i15, int i16, String str19, int i17, String str20, String str21, int i18, String str22, String str23, String str24, String str25) {
        Object obj4 = obj;
        Object obj5 = obj2;
        Object obj6 = obj3;
        l.f(obj4, "ownerCategoryDesc");
        l.f(obj5, "ownerCodeDesc");
        l.f(obj6, "ownerFrom");
        this.applNo = str;
        this.authMode = str2;
        this.chassisNo = str3;
        this.currentAddress1 = str4;
        this.currentAddress2 = str5;
        this.currentAddress3 = str6;
        this.currentDistrict = num;
        this.currentPinCode = i10;
        this.currentState = str7;
        this.emailId = str8;
        this.fatherName = str9;
        this.garageAddress = str10;
        this.isRetainSwap = z10;
        this.mobileNo = str11;
        this.movedOn = str12;
        this.officeCode = i11;
        this.openDate = str13;
        this.ownerCategory = i12;
        this.ownerCategoryDesc = obj4;
        this.ownerCode = i13;
        this.ownerCodeDesc = obj5;
        this.ownerFrom = obj6;
        this.ownerName = str14;
        this.ownerSerial = i14;
        this.panNo = str15;
        this.permanentAddress1 = str16;
        this.permanentAddress2 = str17;
        this.permanentAddress3 = str18;
        this.permanentDistrict = i15;
        this.permanentPinCode = i16;
        this.permanentState = str19;
        this.purposeCode = i17;
        this.reason = str20;
        this.regnNo = str21;
        this.saleAmmount = i18;
        this.saleDate = str22;
        this.services = str23;
        this.stateCode = str24;
        this.transferDate = str25;
    }

    public static /* synthetic */ SellerDtoX copy$default(SellerDtoX sellerDtoX, String str, String str2, String str3, String str4, String str5, String str6, Integer num, int i10, String str7, String str8, String str9, String str10, boolean z10, String str11, String str12, int i11, String str13, int i12, Object obj, int i13, Object obj2, Object obj3, String str14, int i14, String str15, String str16, String str17, String str18, int i15, int i16, String str19, int i17, String str20, String str21, int i18, String str22, String str23, String str24, String str25, int i19, int i20, Object obj4) {
        SellerDtoX sellerDtoX2 = sellerDtoX;
        int i21 = i19;
        return sellerDtoX.copy((i21 & 1) != 0 ? sellerDtoX2.applNo : str, (i21 & 2) != 0 ? sellerDtoX2.authMode : str2, (i21 & 4) != 0 ? sellerDtoX2.chassisNo : str3, (i21 & 8) != 0 ? sellerDtoX2.currentAddress1 : str4, (i21 & 16) != 0 ? sellerDtoX2.currentAddress2 : str5, (i21 & 32) != 0 ? sellerDtoX2.currentAddress3 : str6, (i21 & 64) != 0 ? sellerDtoX2.currentDistrict : num, (i21 & 128) != 0 ? sellerDtoX2.currentPinCode : i10, (i21 & 256) != 0 ? sellerDtoX2.currentState : str7, (i21 & 512) != 0 ? sellerDtoX2.emailId : str8, (i21 & 1024) != 0 ? sellerDtoX2.fatherName : str9, (i21 & 2048) != 0 ? sellerDtoX2.garageAddress : str10, (i21 & 4096) != 0 ? sellerDtoX2.isRetainSwap : z10, (i21 & 8192) != 0 ? sellerDtoX2.mobileNo : str11, (i21 & 16384) != 0 ? sellerDtoX2.movedOn : str12, (i21 & 32768) != 0 ? sellerDtoX2.officeCode : i11, (i21 & 65536) != 0 ? sellerDtoX2.openDate : str13, (i21 & 131072) != 0 ? sellerDtoX2.ownerCategory : i12, (i21 & 262144) != 0 ? sellerDtoX2.ownerCategoryDesc : obj, (i21 & 524288) != 0 ? sellerDtoX2.ownerCode : i13, (i21 & 1048576) != 0 ? sellerDtoX2.ownerCodeDesc : obj2, (i21 & 2097152) != 0 ? sellerDtoX2.ownerFrom : obj3, (i21 & 4194304) != 0 ? sellerDtoX2.ownerName : str14, (i21 & 8388608) != 0 ? sellerDtoX2.ownerSerial : i14, (i21 & 16777216) != 0 ? sellerDtoX2.panNo : str15, (i21 & 33554432) != 0 ? sellerDtoX2.permanentAddress1 : str16, (i21 & 67108864) != 0 ? sellerDtoX2.permanentAddress2 : str17, (i21 & 134217728) != 0 ? sellerDtoX2.permanentAddress3 : str18, (i21 & 268435456) != 0 ? sellerDtoX2.permanentDistrict : i15, (i21 & 536870912) != 0 ? sellerDtoX2.permanentPinCode : i16, (i21 & 1073741824) != 0 ? sellerDtoX2.permanentState : str19, (i21 & Integer.MIN_VALUE) != 0 ? sellerDtoX2.purposeCode : i17, (i20 & 1) != 0 ? sellerDtoX2.reason : str20, (i20 & 2) != 0 ? sellerDtoX2.regnNo : str21, (i20 & 4) != 0 ? sellerDtoX2.saleAmmount : i18, (i20 & 8) != 0 ? sellerDtoX2.saleDate : str22, (i20 & 16) != 0 ? sellerDtoX2.services : str23, (i20 & 32) != 0 ? sellerDtoX2.stateCode : str24, (i20 & 64) != 0 ? sellerDtoX2.transferDate : str25);
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

    public final Object component19() {
        return this.ownerCategoryDesc;
    }

    public final String component2() {
        return this.authMode;
    }

    public final int component20() {
        return this.ownerCode;
    }

    public final Object component21() {
        return this.ownerCodeDesc;
    }

    public final Object component22() {
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

    public final int component35() {
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

    public final Integer component7() {
        return this.currentDistrict;
    }

    public final int component8() {
        return this.currentPinCode;
    }

    public final String component9() {
        return this.currentState;
    }

    public final SellerDtoX copy(String str, String str2, String str3, String str4, String str5, String str6, Integer num, int i10, String str7, String str8, String str9, String str10, boolean z10, String str11, String str12, int i11, String str13, int i12, Object obj, int i13, Object obj2, Object obj3, String str14, int i14, String str15, String str16, String str17, String str18, int i15, int i16, String str19, int i17, String str20, String str21, int i18, String str22, String str23, String str24, String str25) {
        String str26 = str;
        l.f(obj, "ownerCategoryDesc");
        l.f(obj2, "ownerCodeDesc");
        l.f(obj3, "ownerFrom");
        return new SellerDtoX(str, str2, str3, str4, str5, str6, num, i10, str7, str8, str9, str10, z10, str11, str12, i11, str13, i12, obj, i13, obj2, obj3, str14, i14, str15, str16, str17, str18, i15, i16, str19, i17, str20, str21, i18, str22, str23, str24, str25);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SellerDtoX)) {
            return false;
        }
        SellerDtoX sellerDtoX = (SellerDtoX) obj;
        return l.a(this.applNo, sellerDtoX.applNo) && l.a(this.authMode, sellerDtoX.authMode) && l.a(this.chassisNo, sellerDtoX.chassisNo) && l.a(this.currentAddress1, sellerDtoX.currentAddress1) && l.a(this.currentAddress2, sellerDtoX.currentAddress2) && l.a(this.currentAddress3, sellerDtoX.currentAddress3) && l.a(this.currentDistrict, sellerDtoX.currentDistrict) && this.currentPinCode == sellerDtoX.currentPinCode && l.a(this.currentState, sellerDtoX.currentState) && l.a(this.emailId, sellerDtoX.emailId) && l.a(this.fatherName, sellerDtoX.fatherName) && l.a(this.garageAddress, sellerDtoX.garageAddress) && this.isRetainSwap == sellerDtoX.isRetainSwap && l.a(this.mobileNo, sellerDtoX.mobileNo) && l.a(this.movedOn, sellerDtoX.movedOn) && this.officeCode == sellerDtoX.officeCode && l.a(this.openDate, sellerDtoX.openDate) && this.ownerCategory == sellerDtoX.ownerCategory && l.a(this.ownerCategoryDesc, sellerDtoX.ownerCategoryDesc) && this.ownerCode == sellerDtoX.ownerCode && l.a(this.ownerCodeDesc, sellerDtoX.ownerCodeDesc) && l.a(this.ownerFrom, sellerDtoX.ownerFrom) && l.a(this.ownerName, sellerDtoX.ownerName) && this.ownerSerial == sellerDtoX.ownerSerial && l.a(this.panNo, sellerDtoX.panNo) && l.a(this.permanentAddress1, sellerDtoX.permanentAddress1) && l.a(this.permanentAddress2, sellerDtoX.permanentAddress2) && l.a(this.permanentAddress3, sellerDtoX.permanentAddress3) && this.permanentDistrict == sellerDtoX.permanentDistrict && this.permanentPinCode == sellerDtoX.permanentPinCode && l.a(this.permanentState, sellerDtoX.permanentState) && this.purposeCode == sellerDtoX.purposeCode && l.a(this.reason, sellerDtoX.reason) && l.a(this.regnNo, sellerDtoX.regnNo) && this.saleAmmount == sellerDtoX.saleAmmount && l.a(this.saleDate, sellerDtoX.saleDate) && l.a(this.services, sellerDtoX.services) && l.a(this.stateCode, sellerDtoX.stateCode) && l.a(this.transferDate, sellerDtoX.transferDate);
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

    public final Object getOwnerCategoryDesc() {
        return this.ownerCategoryDesc;
    }

    public final int getOwnerCode() {
        return this.ownerCode;
    }

    public final Object getOwnerCodeDesc() {
        return this.ownerCodeDesc;
    }

    public final Object getOwnerFrom() {
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
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num = this.currentDistrict;
        int hashCode7 = (((hashCode6 + (num == null ? 0 : num.hashCode())) * 31) + Integer.hashCode(this.currentPinCode)) * 31;
        String str7 = this.currentState;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.emailId;
        int hashCode9 = (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.fatherName;
        int hashCode10 = (hashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.garageAddress;
        int hashCode11 = (hashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        boolean z10 = this.isRetainSwap;
        if (z10) {
            z10 = true;
        }
        int i11 = (hashCode11 + (z10 ? 1 : 0)) * 31;
        String str11 = this.mobileNo;
        int hashCode12 = (i11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.movedOn;
        int hashCode13 = (((hashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31) + Integer.hashCode(this.officeCode)) * 31;
        String str13 = this.openDate;
        int hashCode14 = (((((((((((hashCode13 + (str13 == null ? 0 : str13.hashCode())) * 31) + Integer.hashCode(this.ownerCategory)) * 31) + this.ownerCategoryDesc.hashCode()) * 31) + Integer.hashCode(this.ownerCode)) * 31) + this.ownerCodeDesc.hashCode()) * 31) + this.ownerFrom.hashCode()) * 31;
        String str14 = this.ownerName;
        int hashCode15 = (((hashCode14 + (str14 == null ? 0 : str14.hashCode())) * 31) + Integer.hashCode(this.ownerSerial)) * 31;
        String str15 = this.panNo;
        int hashCode16 = (hashCode15 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.permanentAddress1;
        int hashCode17 = (hashCode16 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.permanentAddress2;
        int hashCode18 = (hashCode17 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.permanentAddress3;
        int hashCode19 = (((((hashCode18 + (str18 == null ? 0 : str18.hashCode())) * 31) + Integer.hashCode(this.permanentDistrict)) * 31) + Integer.hashCode(this.permanentPinCode)) * 31;
        String str19 = this.permanentState;
        int hashCode20 = (((hashCode19 + (str19 == null ? 0 : str19.hashCode())) * 31) + Integer.hashCode(this.purposeCode)) * 31;
        String str20 = this.reason;
        int hashCode21 = (hashCode20 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.regnNo;
        int hashCode22 = (((hashCode21 + (str21 == null ? 0 : str21.hashCode())) * 31) + Integer.hashCode(this.saleAmmount)) * 31;
        String str22 = this.saleDate;
        int hashCode23 = (hashCode22 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.services;
        int hashCode24 = (hashCode23 + (str23 == null ? 0 : str23.hashCode())) * 31;
        String str24 = this.stateCode;
        int hashCode25 = (hashCode24 + (str24 == null ? 0 : str24.hashCode())) * 31;
        String str25 = this.transferDate;
        if (str25 != null) {
            i10 = str25.hashCode();
        }
        return hashCode25 + i10;
    }

    public final boolean isRetainSwap() {
        return this.isRetainSwap;
    }

    public String toString() {
        return "SellerDtoX(applNo=" + this.applNo + ", authMode=" + this.authMode + ", chassisNo=" + this.chassisNo + ", currentAddress1=" + this.currentAddress1 + ", currentAddress2=" + this.currentAddress2 + ", currentAddress3=" + this.currentAddress3 + ", currentDistrict=" + this.currentDistrict + ", currentPinCode=" + this.currentPinCode + ", currentState=" + this.currentState + ", emailId=" + this.emailId + ", fatherName=" + this.fatherName + ", garageAddress=" + this.garageAddress + ", isRetainSwap=" + this.isRetainSwap + ", mobileNo=" + this.mobileNo + ", movedOn=" + this.movedOn + ", officeCode=" + this.officeCode + ", openDate=" + this.openDate + ", ownerCategory=" + this.ownerCategory + ", ownerCategoryDesc=" + this.ownerCategoryDesc + ", ownerCode=" + this.ownerCode + ", ownerCodeDesc=" + this.ownerCodeDesc + ", ownerFrom=" + this.ownerFrom + ", ownerName=" + this.ownerName + ", ownerSerial=" + this.ownerSerial + ", panNo=" + this.panNo + ", permanentAddress1=" + this.permanentAddress1 + ", permanentAddress2=" + this.permanentAddress2 + ", permanentAddress3=" + this.permanentAddress3 + ", permanentDistrict=" + this.permanentDistrict + ", permanentPinCode=" + this.permanentPinCode + ", permanentState=" + this.permanentState + ", purposeCode=" + this.purposeCode + ", reason=" + this.reason + ", regnNo=" + this.regnNo + ", saleAmmount=" + this.saleAmmount + ", saleDate=" + this.saleDate + ", services=" + this.services + ", stateCode=" + this.stateCode + ", transferDate=" + this.transferDate + ')';
    }
}
