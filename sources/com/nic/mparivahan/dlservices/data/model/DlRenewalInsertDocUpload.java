package com.nic.mparivahan.dlservices.data.model;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class DlRenewalInsertDocUpload {
    private String applicationNumber;
    private String stateCode;

    public DlRenewalInsertDocUpload(String str, String str2) {
        l.f(str, "applicationNumber");
        l.f(str2, "stateCode");
        this.applicationNumber = str;
        this.stateCode = str2;
    }

    public static /* synthetic */ DlRenewalInsertDocUpload copy$default(DlRenewalInsertDocUpload dlRenewalInsertDocUpload, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = dlRenewalInsertDocUpload.applicationNumber;
        }
        if ((i10 & 2) != 0) {
            str2 = dlRenewalInsertDocUpload.stateCode;
        }
        return dlRenewalInsertDocUpload.copy(str, str2);
    }

    public final String component1() {
        return this.applicationNumber;
    }

    public final String component2() {
        return this.stateCode;
    }

    public final DlRenewalInsertDocUpload copy(String str, String str2) {
        l.f(str, "applicationNumber");
        l.f(str2, "stateCode");
        return new DlRenewalInsertDocUpload(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DlRenewalInsertDocUpload)) {
            return false;
        }
        DlRenewalInsertDocUpload dlRenewalInsertDocUpload = (DlRenewalInsertDocUpload) obj;
        return l.a(this.applicationNumber, dlRenewalInsertDocUpload.applicationNumber) && l.a(this.stateCode, dlRenewalInsertDocUpload.stateCode);
    }

    public final String getApplicationNumber() {
        return this.applicationNumber;
    }

    public final String getStateCode() {
        return this.stateCode;
    }

    public int hashCode() {
        return (this.applicationNumber.hashCode() * 31) + this.stateCode.hashCode();
    }

    public final void setApplicationNumber(String str) {
        l.f(str, "<set-?>");
        this.applicationNumber = str;
    }

    public final void setStateCode(String str) {
        l.f(str, "<set-?>");
        this.stateCode = str;
    }

    public String toString() {
        return "DlRenewalInsertDocUpload(applicationNumber=" + this.applicationNumber + ", stateCode=" + this.stateCode + ')';
    }
}
