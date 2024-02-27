package com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class BuyerDto {
    private final String applNo;
    private final String authMode;
    private final String currentAddress1;
    private final String currentAddress2;
    private final String currentAddress3;
    private final int currentDistrict;
    private final int currentPinCode;
    private final String currentState;
    private final String fatherName;
    private final long mobileNo;
    private final int officeCode;
    private final String openDate;
    private final String ownerName;
    private final String permanentAddress1;
    private final String permanentAddress2;
    private final String permanentAddress3;
    private final int permanentDistrict;
    private final int permanentPinCode;
    private final String permanentState;
    private final int purposeCode;
    private final String regnNo;
    private final String stateCode;

    public BuyerDto(String str, String str2, String str3, String str4, String str5, int i10, int i11, String str6, String str7, long j10, int i12, String str8, String str9, String str10, String str11, String str12, int i13, int i14, String str13, int i15, String str14, String str15) {
        this.applNo = str;
        this.authMode = str2;
        this.currentAddress1 = str3;
        this.currentAddress2 = str4;
        this.currentAddress3 = str5;
        this.currentDistrict = i10;
        this.currentPinCode = i11;
        this.currentState = str6;
        this.fatherName = str7;
        this.mobileNo = j10;
        this.officeCode = i12;
        this.openDate = str8;
        this.ownerName = str9;
        this.permanentAddress1 = str10;
        this.permanentAddress2 = str11;
        this.permanentAddress3 = str12;
        this.permanentDistrict = i13;
        this.permanentPinCode = i14;
        this.permanentState = str13;
        this.purposeCode = i15;
        this.regnNo = str14;
        this.stateCode = str15;
    }

    public static /* synthetic */ BuyerDto copy$default(BuyerDto buyerDto, String str, String str2, String str3, String str4, String str5, int i10, int i11, String str6, String str7, long j10, int i12, String str8, String str9, String str10, String str11, String str12, int i13, int i14, String str13, int i15, String str14, String str15, int i16, Object obj) {
        BuyerDto buyerDto2 = buyerDto;
        int i17 = i16;
        return buyerDto.copy((i17 & 1) != 0 ? buyerDto2.applNo : str, (i17 & 2) != 0 ? buyerDto2.authMode : str2, (i17 & 4) != 0 ? buyerDto2.currentAddress1 : str3, (i17 & 8) != 0 ? buyerDto2.currentAddress2 : str4, (i17 & 16) != 0 ? buyerDto2.currentAddress3 : str5, (i17 & 32) != 0 ? buyerDto2.currentDistrict : i10, (i17 & 64) != 0 ? buyerDto2.currentPinCode : i11, (i17 & 128) != 0 ? buyerDto2.currentState : str6, (i17 & 256) != 0 ? buyerDto2.fatherName : str7, (i17 & 512) != 0 ? buyerDto2.mobileNo : j10, (i17 & 1024) != 0 ? buyerDto2.officeCode : i12, (i17 & 2048) != 0 ? buyerDto2.openDate : str8, (i17 & 4096) != 0 ? buyerDto2.ownerName : str9, (i17 & 8192) != 0 ? buyerDto2.permanentAddress1 : str10, (i17 & 16384) != 0 ? buyerDto2.permanentAddress2 : str11, (i17 & 32768) != 0 ? buyerDto2.permanentAddress3 : str12, (i17 & 65536) != 0 ? buyerDto2.permanentDistrict : i13, (i17 & 131072) != 0 ? buyerDto2.permanentPinCode : i14, (i17 & 262144) != 0 ? buyerDto2.permanentState : str13, (i17 & 524288) != 0 ? buyerDto2.purposeCode : i15, (i17 & 1048576) != 0 ? buyerDto2.regnNo : str14, (i17 & 2097152) != 0 ? buyerDto2.stateCode : str15);
    }

    public final String component1() {
        return this.applNo;
    }

    public final long component10() {
        return this.mobileNo;
    }

    public final int component11() {
        return this.officeCode;
    }

    public final String component12() {
        return this.openDate;
    }

    public final String component13() {
        return this.ownerName;
    }

    public final String component14() {
        return this.permanentAddress1;
    }

    public final String component15() {
        return this.permanentAddress2;
    }

    public final String component16() {
        return this.permanentAddress3;
    }

    public final int component17() {
        return this.permanentDistrict;
    }

    public final int component18() {
        return this.permanentPinCode;
    }

    public final String component19() {
        return this.permanentState;
    }

    public final String component2() {
        return this.authMode;
    }

    public final int component20() {
        return this.purposeCode;
    }

    public final String component21() {
        return this.regnNo;
    }

    public final String component22() {
        return this.stateCode;
    }

    public final String component3() {
        return this.currentAddress1;
    }

    public final String component4() {
        return this.currentAddress2;
    }

    public final String component5() {
        return this.currentAddress3;
    }

    public final int component6() {
        return this.currentDistrict;
    }

    public final int component7() {
        return this.currentPinCode;
    }

    public final String component8() {
        return this.currentState;
    }

    public final String component9() {
        return this.fatherName;
    }

    public final BuyerDto copy(String str, String str2, String str3, String str4, String str5, int i10, int i11, String str6, String str7, long j10, int i12, String str8, String str9, String str10, String str11, String str12, int i13, int i14, String str13, int i15, String str14, String str15) {
        return new BuyerDto(str, str2, str3, str4, str5, i10, i11, str6, str7, j10, i12, str8, str9, str10, str11, str12, i13, i14, str13, i15, str14, str15);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BuyerDto)) {
            return false;
        }
        BuyerDto buyerDto = (BuyerDto) obj;
        return l.a(this.applNo, buyerDto.applNo) && l.a(this.authMode, buyerDto.authMode) && l.a(this.currentAddress1, buyerDto.currentAddress1) && l.a(this.currentAddress2, buyerDto.currentAddress2) && l.a(this.currentAddress3, buyerDto.currentAddress3) && this.currentDistrict == buyerDto.currentDistrict && this.currentPinCode == buyerDto.currentPinCode && l.a(this.currentState, buyerDto.currentState) && l.a(this.fatherName, buyerDto.fatherName) && this.mobileNo == buyerDto.mobileNo && this.officeCode == buyerDto.officeCode && l.a(this.openDate, buyerDto.openDate) && l.a(this.ownerName, buyerDto.ownerName) && l.a(this.permanentAddress1, buyerDto.permanentAddress1) && l.a(this.permanentAddress2, buyerDto.permanentAddress2) && l.a(this.permanentAddress3, buyerDto.permanentAddress3) && this.permanentDistrict == buyerDto.permanentDistrict && this.permanentPinCode == buyerDto.permanentPinCode && l.a(this.permanentState, buyerDto.permanentState) && this.purposeCode == buyerDto.purposeCode && l.a(this.regnNo, buyerDto.regnNo) && l.a(this.stateCode, buyerDto.stateCode);
    }

    public final String getApplNo() {
        return this.applNo;
    }

    public final String getAuthMode() {
        return this.authMode;
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

    public final String getFatherName() {
        return this.fatherName;
    }

    public final long getMobileNo() {
        return this.mobileNo;
    }

    public final int getOfficeCode() {
        return this.officeCode;
    }

    public final String getOpenDate() {
        return this.openDate;
    }

    public final String getOwnerName() {
        return this.ownerName;
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

    public final String getRegnNo() {
        return this.regnNo;
    }

    public final String getStateCode() {
        return this.stateCode;
    }

    public int hashCode() {
        String str = this.applNo;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.authMode;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.currentAddress1;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.currentAddress2;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.currentAddress3;
        int hashCode5 = (((((hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31) + Integer.hashCode(this.currentDistrict)) * 31) + Integer.hashCode(this.currentPinCode)) * 31;
        String str6 = this.currentState;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.fatherName;
        int hashCode7 = (((((hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31) + Long.hashCode(this.mobileNo)) * 31) + Integer.hashCode(this.officeCode)) * 31;
        String str8 = this.openDate;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.ownerName;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.permanentAddress1;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.permanentAddress2;
        int hashCode11 = (hashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.permanentAddress3;
        int hashCode12 = (((((hashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31) + Integer.hashCode(this.permanentDistrict)) * 31) + Integer.hashCode(this.permanentPinCode)) * 31;
        String str13 = this.permanentState;
        int hashCode13 = (((hashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31) + Integer.hashCode(this.purposeCode)) * 31;
        String str14 = this.regnNo;
        int hashCode14 = (hashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.stateCode;
        if (str15 != null) {
            i10 = str15.hashCode();
        }
        return hashCode14 + i10;
    }

    public String toString() {
        return "BuyerDto(applNo=" + this.applNo + ", authMode=" + this.authMode + ", currentAddress1=" + this.currentAddress1 + ", currentAddress2=" + this.currentAddress2 + ", currentAddress3=" + this.currentAddress3 + ", currentDistrict=" + this.currentDistrict + ", currentPinCode=" + this.currentPinCode + ", currentState=" + this.currentState + ", fatherName=" + this.fatherName + ", mobileNo=" + this.mobileNo + ", officeCode=" + this.officeCode + ", openDate=" + this.openDate + ", ownerName=" + this.ownerName + ", permanentAddress1=" + this.permanentAddress1 + ", permanentAddress2=" + this.permanentAddress2 + ", permanentAddress3=" + this.permanentAddress3 + ", permanentDistrict=" + this.permanentDistrict + ", permanentPinCode=" + this.permanentPinCode + ", permanentState=" + this.permanentState + ", purposeCode=" + this.purposeCode + ", regnNo=" + this.regnNo + ", stateCode=" + this.stateCode + ')';
    }
}
