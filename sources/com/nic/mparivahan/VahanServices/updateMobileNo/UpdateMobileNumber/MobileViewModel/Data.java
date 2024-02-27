package com.nic.mparivahan.VahanServices.updateMobileNo.UpdateMobileNumber.MobileViewModel;

import androidx.annotation.Keep;
import cm.l;
import java.io.Serializable;

@Keep
public final class Data implements Serializable {
    private final String applNo;
    private final String authMode;
    private final String mobileNo;
    private final int officeCode;
    private final String openDate;
    private final int purposeCode;
    private final String regnNo;
    private final String stateCode;

    public Data(String str, String str2, String str3, int i10, String str4, int i11, String str5, String str6) {
        this.applNo = str;
        this.authMode = str2;
        this.mobileNo = str3;
        this.officeCode = i10;
        this.openDate = str4;
        this.purposeCode = i11;
        this.regnNo = str5;
        this.stateCode = str6;
    }

    public static /* synthetic */ Data copy$default(Data data, String str, String str2, String str3, int i10, String str4, int i11, String str5, String str6, int i12, Object obj) {
        Data data2 = data;
        int i13 = i12;
        return data.copy((i13 & 1) != 0 ? data2.applNo : str, (i13 & 2) != 0 ? data2.authMode : str2, (i13 & 4) != 0 ? data2.mobileNo : str3, (i13 & 8) != 0 ? data2.officeCode : i10, (i13 & 16) != 0 ? data2.openDate : str4, (i13 & 32) != 0 ? data2.purposeCode : i11, (i13 & 64) != 0 ? data2.regnNo : str5, (i13 & 128) != 0 ? data2.stateCode : str6);
    }

    public final String component1() {
        return this.applNo;
    }

    public final String component2() {
        return this.authMode;
    }

    public final String component3() {
        return this.mobileNo;
    }

    public final int component4() {
        return this.officeCode;
    }

    public final String component5() {
        return this.openDate;
    }

    public final int component6() {
        return this.purposeCode;
    }

    public final String component7() {
        return this.regnNo;
    }

    public final String component8() {
        return this.stateCode;
    }

    public final Data copy(String str, String str2, String str3, int i10, String str4, int i11, String str5, String str6) {
        return new Data(str, str2, str3, i10, str4, i11, str5, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Data)) {
            return false;
        }
        Data data = (Data) obj;
        return l.a(this.applNo, data.applNo) && l.a(this.authMode, data.authMode) && l.a(this.mobileNo, data.mobileNo) && this.officeCode == data.officeCode && l.a(this.openDate, data.openDate) && this.purposeCode == data.purposeCode && l.a(this.regnNo, data.regnNo) && l.a(this.stateCode, data.stateCode);
    }

    public final String getApplNo() {
        return this.applNo;
    }

    public final String getAuthMode() {
        return this.authMode;
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
        String str3 = this.mobileNo;
        int hashCode3 = (((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + Integer.hashCode(this.officeCode)) * 31;
        String str4 = this.openDate;
        int hashCode4 = (((hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + Integer.hashCode(this.purposeCode)) * 31;
        String str5 = this.regnNo;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.stateCode;
        if (str6 != null) {
            i10 = str6.hashCode();
        }
        return hashCode5 + i10;
    }

    public String toString() {
        return "Data(applNo=" + this.applNo + ", authMode=" + this.authMode + ", mobileNo=" + this.mobileNo + ", officeCode=" + this.officeCode + ", openDate=" + this.openDate + ", purposeCode=" + this.purposeCode + ", regnNo=" + this.regnNo + ", stateCode=" + this.stateCode + ')';
    }
}
