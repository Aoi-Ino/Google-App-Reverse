package com.nic.mparivahan.dlservices.data.model;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class DlStatusRequest {
    private String applDob;
    private String applNumber;

    public DlStatusRequest(String str, String str2) {
        this.applNumber = str;
        this.applDob = str2;
    }

    public static /* synthetic */ DlStatusRequest copy$default(DlStatusRequest dlStatusRequest, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = dlStatusRequest.applNumber;
        }
        if ((i10 & 2) != 0) {
            str2 = dlStatusRequest.applDob;
        }
        return dlStatusRequest.copy(str, str2);
    }

    public final String component1() {
        return this.applNumber;
    }

    public final String component2() {
        return this.applDob;
    }

    public final DlStatusRequest copy(String str, String str2) {
        return new DlStatusRequest(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DlStatusRequest)) {
            return false;
        }
        DlStatusRequest dlStatusRequest = (DlStatusRequest) obj;
        return l.a(this.applNumber, dlStatusRequest.applNumber) && l.a(this.applDob, dlStatusRequest.applDob);
    }

    public final String getApplDob() {
        return this.applDob;
    }

    public final String getApplNumber() {
        return this.applNumber;
    }

    public int hashCode() {
        String str = this.applNumber;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.applDob;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return hashCode + i10;
    }

    public final void setApplDob(String str) {
        this.applDob = str;
    }

    public final void setApplNumber(String str) {
        this.applNumber = str;
    }

    public String toString() {
        return "DlStatusRequest(applNumber=" + this.applNumber + ", applDob=" + this.applDob + ')';
    }
}
