package com.nic.mparivahan.dlservices.data.model;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class DlLastRto {
    private String dlNumber;
    private String dob;

    public DlLastRto(String str, String str2) {
        l.f(str, "dlNumber");
        l.f(str2, "dob");
        this.dlNumber = str;
        this.dob = str2;
    }

    public static /* synthetic */ DlLastRto copy$default(DlLastRto dlLastRto, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = dlLastRto.dlNumber;
        }
        if ((i10 & 2) != 0) {
            str2 = dlLastRto.dob;
        }
        return dlLastRto.copy(str, str2);
    }

    public final String component1() {
        return this.dlNumber;
    }

    public final String component2() {
        return this.dob;
    }

    public final DlLastRto copy(String str, String str2) {
        l.f(str, "dlNumber");
        l.f(str2, "dob");
        return new DlLastRto(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DlLastRto)) {
            return false;
        }
        DlLastRto dlLastRto = (DlLastRto) obj;
        return l.a(this.dlNumber, dlLastRto.dlNumber) && l.a(this.dob, dlLastRto.dob);
    }

    public final String getDlNumber() {
        return this.dlNumber;
    }

    public final String getDob() {
        return this.dob;
    }

    public int hashCode() {
        return (this.dlNumber.hashCode() * 31) + this.dob.hashCode();
    }

    public final void setDlNumber(String str) {
        l.f(str, "<set-?>");
        this.dlNumber = str;
    }

    public final void setDob(String str) {
        l.f(str, "<set-?>");
        this.dob = str;
    }

    public String toString() {
        return "{\"dlNumber\"=\"" + this.dlNumber + "\", \"dob\"=\"" + this.dob + "\" }";
    }
}
