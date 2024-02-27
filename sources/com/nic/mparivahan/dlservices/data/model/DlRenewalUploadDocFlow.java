package com.nic.mparivahan.dlservices.data.model;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class DlRenewalUploadDocFlow {
    private int acCode;
    private String acStatus;
    private String applNo;
    private String rtoCode;
    private String stateCode;
    private String transCode;

    public DlRenewalUploadDocFlow(String str, String str2, String str3, String str4, int i10, String str5) {
        l.f(str, "applNo");
        l.f(str2, "transCode");
        l.f(str3, "stateCode");
        l.f(str4, "rtoCode");
        l.f(str5, "acStatus");
        this.applNo = str;
        this.transCode = str2;
        this.stateCode = str3;
        this.rtoCode = str4;
        this.acCode = i10;
        this.acStatus = str5;
    }

    public static /* synthetic */ DlRenewalUploadDocFlow copy$default(DlRenewalUploadDocFlow dlRenewalUploadDocFlow, String str, String str2, String str3, String str4, int i10, String str5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = dlRenewalUploadDocFlow.applNo;
        }
        if ((i11 & 2) != 0) {
            str2 = dlRenewalUploadDocFlow.transCode;
        }
        String str6 = str2;
        if ((i11 & 4) != 0) {
            str3 = dlRenewalUploadDocFlow.stateCode;
        }
        String str7 = str3;
        if ((i11 & 8) != 0) {
            str4 = dlRenewalUploadDocFlow.rtoCode;
        }
        String str8 = str4;
        if ((i11 & 16) != 0) {
            i10 = dlRenewalUploadDocFlow.acCode;
        }
        int i12 = i10;
        if ((i11 & 32) != 0) {
            str5 = dlRenewalUploadDocFlow.acStatus;
        }
        return dlRenewalUploadDocFlow.copy(str, str6, str7, str8, i12, str5);
    }

    public final String component1() {
        return this.applNo;
    }

    public final String component2() {
        return this.transCode;
    }

    public final String component3() {
        return this.stateCode;
    }

    public final String component4() {
        return this.rtoCode;
    }

    public final int component5() {
        return this.acCode;
    }

    public final String component6() {
        return this.acStatus;
    }

    public final DlRenewalUploadDocFlow copy(String str, String str2, String str3, String str4, int i10, String str5) {
        l.f(str, "applNo");
        l.f(str2, "transCode");
        l.f(str3, "stateCode");
        l.f(str4, "rtoCode");
        l.f(str5, "acStatus");
        return new DlRenewalUploadDocFlow(str, str2, str3, str4, i10, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DlRenewalUploadDocFlow)) {
            return false;
        }
        DlRenewalUploadDocFlow dlRenewalUploadDocFlow = (DlRenewalUploadDocFlow) obj;
        return l.a(this.applNo, dlRenewalUploadDocFlow.applNo) && l.a(this.transCode, dlRenewalUploadDocFlow.transCode) && l.a(this.stateCode, dlRenewalUploadDocFlow.stateCode) && l.a(this.rtoCode, dlRenewalUploadDocFlow.rtoCode) && this.acCode == dlRenewalUploadDocFlow.acCode && l.a(this.acStatus, dlRenewalUploadDocFlow.acStatus);
    }

    public final int getAcCode() {
        return this.acCode;
    }

    public final String getAcStatus() {
        return this.acStatus;
    }

    public final String getApplNo() {
        return this.applNo;
    }

    public final String getRtoCode() {
        return this.rtoCode;
    }

    public final String getStateCode() {
        return this.stateCode;
    }

    public final String getTransCode() {
        return this.transCode;
    }

    public int hashCode() {
        return (((((((((this.applNo.hashCode() * 31) + this.transCode.hashCode()) * 31) + this.stateCode.hashCode()) * 31) + this.rtoCode.hashCode()) * 31) + Integer.hashCode(this.acCode)) * 31) + this.acStatus.hashCode();
    }

    public final void setAcCode(int i10) {
        this.acCode = i10;
    }

    public final void setAcStatus(String str) {
        l.f(str, "<set-?>");
        this.acStatus = str;
    }

    public final void setApplNo(String str) {
        l.f(str, "<set-?>");
        this.applNo = str;
    }

    public final void setRtoCode(String str) {
        l.f(str, "<set-?>");
        this.rtoCode = str;
    }

    public final void setStateCode(String str) {
        l.f(str, "<set-?>");
        this.stateCode = str;
    }

    public final void setTransCode(String str) {
        l.f(str, "<set-?>");
        this.transCode = str;
    }

    public String toString() {
        return "{\"applNo\":\"" + this.applNo + "\", \"transCode\":\"" + this.transCode + "\", \"stateCode\":\"" + this.stateCode + "\", \"acCode\":\"" + this.acCode + "\", \"rtoCode\":\"" + this.rtoCode + "\", \"acStatus\":\"" + this.acStatus + "\"}";
    }
}
