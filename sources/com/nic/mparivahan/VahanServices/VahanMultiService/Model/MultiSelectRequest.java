package com.nic.mparivahan.VahanServices.VahanMultiService.Model;

import androidx.annotation.Keep;
import cm.l;
import java.util.ArrayList;

@Keep
public final class MultiSelectRequest {
    private final String applNo;
    private final int officeCode;
    private final String openDate;
    private final ArrayList<String> purposeCode;
    private final String regnNo;
    private final String stateCode;

    public MultiSelectRequest(String str, int i10, String str2, ArrayList<String> arrayList, String str3, String str4) {
        l.f(str, "applNo");
        l.f(str2, "openDate");
        l.f(arrayList, "purposeCode");
        l.f(str3, "regnNo");
        l.f(str4, "stateCode");
        this.applNo = str;
        this.officeCode = i10;
        this.openDate = str2;
        this.purposeCode = arrayList;
        this.regnNo = str3;
        this.stateCode = str4;
    }

    public static /* synthetic */ MultiSelectRequest copy$default(MultiSelectRequest multiSelectRequest, String str, int i10, String str2, ArrayList<String> arrayList, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = multiSelectRequest.applNo;
        }
        if ((i11 & 2) != 0) {
            i10 = multiSelectRequest.officeCode;
        }
        int i12 = i10;
        if ((i11 & 4) != 0) {
            str2 = multiSelectRequest.openDate;
        }
        String str5 = str2;
        if ((i11 & 8) != 0) {
            arrayList = multiSelectRequest.purposeCode;
        }
        ArrayList<String> arrayList2 = arrayList;
        if ((i11 & 16) != 0) {
            str3 = multiSelectRequest.regnNo;
        }
        String str6 = str3;
        if ((i11 & 32) != 0) {
            str4 = multiSelectRequest.stateCode;
        }
        return multiSelectRequest.copy(str, i12, str5, arrayList2, str6, str4);
    }

    public final String component1() {
        return this.applNo;
    }

    public final int component2() {
        return this.officeCode;
    }

    public final String component3() {
        return this.openDate;
    }

    public final ArrayList<String> component4() {
        return this.purposeCode;
    }

    public final String component5() {
        return this.regnNo;
    }

    public final String component6() {
        return this.stateCode;
    }

    public final MultiSelectRequest copy(String str, int i10, String str2, ArrayList<String> arrayList, String str3, String str4) {
        l.f(str, "applNo");
        l.f(str2, "openDate");
        l.f(arrayList, "purposeCode");
        l.f(str3, "regnNo");
        l.f(str4, "stateCode");
        return new MultiSelectRequest(str, i10, str2, arrayList, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MultiSelectRequest)) {
            return false;
        }
        MultiSelectRequest multiSelectRequest = (MultiSelectRequest) obj;
        return l.a(this.applNo, multiSelectRequest.applNo) && this.officeCode == multiSelectRequest.officeCode && l.a(this.openDate, multiSelectRequest.openDate) && l.a(this.purposeCode, multiSelectRequest.purposeCode) && l.a(this.regnNo, multiSelectRequest.regnNo) && l.a(this.stateCode, multiSelectRequest.stateCode);
    }

    public final String getApplNo() {
        return this.applNo;
    }

    public final int getOfficeCode() {
        return this.officeCode;
    }

    public final String getOpenDate() {
        return this.openDate;
    }

    public final ArrayList<String> getPurposeCode() {
        return this.purposeCode;
    }

    public final String getRegnNo() {
        return this.regnNo;
    }

    public final String getStateCode() {
        return this.stateCode;
    }

    public int hashCode() {
        return (((((((((this.applNo.hashCode() * 31) + Integer.hashCode(this.officeCode)) * 31) + this.openDate.hashCode()) * 31) + this.purposeCode.hashCode()) * 31) + this.regnNo.hashCode()) * 31) + this.stateCode.hashCode();
    }

    public String toString() {
        return "MultiSelectRequest(applNo=" + this.applNo + ", officeCode=" + this.officeCode + ", openDate=" + this.openDate + ", purposeCode=" + this.purposeCode + ", regnNo=" + this.regnNo + ", stateCode=" + this.stateCode + ')';
    }
}
