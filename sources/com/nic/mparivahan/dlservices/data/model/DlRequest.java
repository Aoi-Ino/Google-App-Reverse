package com.nic.mparivahan.dlservices.data.model;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class DlRequest {
    private String dlno;
    private String dob;

    public DlRequest(String str, String str2) {
        l.f(str, "dlno");
        l.f(str2, "dob");
        this.dlno = str;
        this.dob = str2;
    }

    public static /* synthetic */ DlRequest copy$default(DlRequest dlRequest, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = dlRequest.dlno;
        }
        if ((i10 & 2) != 0) {
            str2 = dlRequest.dob;
        }
        return dlRequest.copy(str, str2);
    }

    public final String component1() {
        return this.dlno;
    }

    public final String component2() {
        return this.dob;
    }

    public final DlRequest copy(String str, String str2) {
        l.f(str, "dlno");
        l.f(str2, "dob");
        return new DlRequest(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DlRequest)) {
            return false;
        }
        DlRequest dlRequest = (DlRequest) obj;
        return l.a(this.dlno, dlRequest.dlno) && l.a(this.dob, dlRequest.dob);
    }

    public final String getDlno() {
        return this.dlno;
    }

    public final String getDob() {
        return this.dob;
    }

    public int hashCode() {
        return (this.dlno.hashCode() * 31) + this.dob.hashCode();
    }

    public final void setDlno(String str) {
        l.f(str, "<set-?>");
        this.dlno = str;
    }

    public final void setDob(String str) {
        l.f(str, "<set-?>");
        this.dob = str;
    }

    public String toString() {
        return "DlRequest(dlno=" + this.dlno + ", dob=" + this.dob + ')';
    }
}
