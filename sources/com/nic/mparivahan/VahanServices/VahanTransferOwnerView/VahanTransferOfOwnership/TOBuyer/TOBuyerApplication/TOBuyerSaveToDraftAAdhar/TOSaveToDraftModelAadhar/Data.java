package com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.TOBuyer.TOBuyerApplication.TOBuyerSaveToDraftAAdhar.TOSaveToDraftModelAadhar;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class Data {
    private final String applNo;
    private final String authMode;
    private final String currentAddress1;
    private final String currentAddress2;
    private final String currentAddress3;
    private final int currentDistrict;
    private final int currentPinCode;
    private final String currentState;
    private final String fatherName;
    private final String mobileNo;
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

    public Data(String str, String str2, String str3, String str4, String str5, int i10, int i11, String str6, String str7, String str8, int i12, String str9, String str10, String str11, String str12, String str13, int i13, int i14, String str14, int i15, String str15, String str16) {
        this.applNo = str;
        this.authMode = str2;
        this.currentAddress1 = str3;
        this.currentAddress2 = str4;
        this.currentAddress3 = str5;
        this.currentDistrict = i10;
        this.currentPinCode = i11;
        this.currentState = str6;
        this.fatherName = str7;
        this.mobileNo = str8;
        this.officeCode = i12;
        this.openDate = str9;
        this.ownerName = str10;
        this.permanentAddress1 = str11;
        this.permanentAddress2 = str12;
        this.permanentAddress3 = str13;
        this.permanentDistrict = i13;
        this.permanentPinCode = i14;
        this.permanentState = str14;
        this.purposeCode = i15;
        this.regnNo = str15;
        this.stateCode = str16;
    }

    public static /* synthetic */ Data copy$default(Data data, String str, String str2, String str3, String str4, String str5, int i10, int i11, String str6, String str7, String str8, int i12, String str9, String str10, String str11, String str12, String str13, int i13, int i14, String str14, int i15, String str15, String str16, int i16, Object obj) {
        Data data2 = data;
        int i17 = i16;
        return data.copy((i17 & 1) != 0 ? data2.applNo : str, (i17 & 2) != 0 ? data2.authMode : str2, (i17 & 4) != 0 ? data2.currentAddress1 : str3, (i17 & 8) != 0 ? data2.currentAddress2 : str4, (i17 & 16) != 0 ? data2.currentAddress3 : str5, (i17 & 32) != 0 ? data2.currentDistrict : i10, (i17 & 64) != 0 ? data2.currentPinCode : i11, (i17 & 128) != 0 ? data2.currentState : str6, (i17 & 256) != 0 ? data2.fatherName : str7, (i17 & 512) != 0 ? data2.mobileNo : str8, (i17 & 1024) != 0 ? data2.officeCode : i12, (i17 & 2048) != 0 ? data2.openDate : str9, (i17 & 4096) != 0 ? data2.ownerName : str10, (i17 & 8192) != 0 ? data2.permanentAddress1 : str11, (i17 & 16384) != 0 ? data2.permanentAddress2 : str12, (i17 & 32768) != 0 ? data2.permanentAddress3 : str13, (i17 & 65536) != 0 ? data2.permanentDistrict : i13, (i17 & 131072) != 0 ? data2.permanentPinCode : i14, (i17 & 262144) != 0 ? data2.permanentState : str14, (i17 & 524288) != 0 ? data2.purposeCode : i15, (i17 & 1048576) != 0 ? data2.regnNo : str15, (i17 & 2097152) != 0 ? data2.stateCode : str16);
    }

    public final String component1() {
        return this.applNo;
    }

    public final String component10() {
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

    public final Data copy(String str, String str2, String str3, String str4, String str5, int i10, int i11, String str6, String str7, String str8, int i12, String str9, String str10, String str11, String str12, String str13, int i13, int i14, String str14, int i15, String str15, String str16) {
        return new Data(str, str2, str3, str4, str5, i10, i11, str6, str7, str8, i12, str9, str10, str11, str12, str13, i13, i14, str14, i15, str15, str16);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Data)) {
            return false;
        }
        Data data = (Data) obj;
        return l.a(this.applNo, data.applNo) && l.a(this.authMode, data.authMode) && l.a(this.currentAddress1, data.currentAddress1) && l.a(this.currentAddress2, data.currentAddress2) && l.a(this.currentAddress3, data.currentAddress3) && this.currentDistrict == data.currentDistrict && this.currentPinCode == data.currentPinCode && l.a(this.currentState, data.currentState) && l.a(this.fatherName, data.fatherName) && l.a(this.mobileNo, data.mobileNo) && this.officeCode == data.officeCode && l.a(this.openDate, data.openDate) && l.a(this.ownerName, data.ownerName) && l.a(this.permanentAddress1, data.permanentAddress1) && l.a(this.permanentAddress2, data.permanentAddress2) && l.a(this.permanentAddress3, data.permanentAddress3) && this.permanentDistrict == data.permanentDistrict && this.permanentPinCode == data.permanentPinCode && l.a(this.permanentState, data.permanentState) && this.purposeCode == data.purposeCode && l.a(this.regnNo, data.regnNo) && l.a(this.stateCode, data.stateCode);
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

    public final String getMobileNo() {
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
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.mobileNo;
        int hashCode8 = (((hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31) + Integer.hashCode(this.officeCode)) * 31;
        String str9 = this.openDate;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.ownerName;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.permanentAddress1;
        int hashCode11 = (hashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.permanentAddress2;
        int hashCode12 = (hashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.permanentAddress3;
        int hashCode13 = (((((hashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31) + Integer.hashCode(this.permanentDistrict)) * 31) + Integer.hashCode(this.permanentPinCode)) * 31;
        String str14 = this.permanentState;
        int hashCode14 = (((hashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31) + Integer.hashCode(this.purposeCode)) * 31;
        String str15 = this.regnNo;
        int hashCode15 = (hashCode14 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.stateCode;
        if (str16 != null) {
            i10 = str16.hashCode();
        }
        return hashCode15 + i10;
    }

    public String toString() {
        return "Data(applNo=" + this.applNo + ", authMode=" + this.authMode + ", currentAddress1=" + this.currentAddress1 + ", currentAddress2=" + this.currentAddress2 + ", currentAddress3=" + this.currentAddress3 + ", currentDistrict=" + this.currentDistrict + ", currentPinCode=" + this.currentPinCode + ", currentState=" + this.currentState + ", fatherName=" + this.fatherName + ", mobileNo=" + this.mobileNo + ", officeCode=" + this.officeCode + ", openDate=" + this.openDate + ", ownerName=" + this.ownerName + ", permanentAddress1=" + this.permanentAddress1 + ", permanentAddress2=" + this.permanentAddress2 + ", permanentAddress3=" + this.permanentAddress3 + ", permanentDistrict=" + this.permanentDistrict + ", permanentPinCode=" + this.permanentPinCode + ", permanentState=" + this.permanentState + ", purposeCode=" + this.purposeCode + ", regnNo=" + this.regnNo + ", stateCode=" + this.stateCode + ')';
    }
}
