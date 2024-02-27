package com.nic.mparivahan.dlservices.data.model;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class DlRequestForEligibility {
    private String applNumber;
    private String dob;
    private String stateCd;

    public DlRequestForEligibility(String str) {
        l.f(str, "applNumber");
        this.applNumber = str;
        this.dob = "";
        this.stateCd = "";
    }

    public static /* synthetic */ DlRequestForEligibility copy$default(DlRequestForEligibility dlRequestForEligibility, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = dlRequestForEligibility.applNumber;
        }
        return dlRequestForEligibility.copy(str);
    }

    public final String component1() {
        return this.applNumber;
    }

    public final DlRequestForEligibility copy(String str) {
        l.f(str, "applNumber");
        return new DlRequestForEligibility(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DlRequestForEligibility) && l.a(this.applNumber, ((DlRequestForEligibility) obj).applNumber);
    }

    public final String getApplNumber() {
        return this.applNumber;
    }

    public final String getDob() {
        return this.dob;
    }

    public final String getStateCd() {
        return this.stateCd;
    }

    public int hashCode() {
        return this.applNumber.hashCode();
    }

    public final void setApplNumber(String str) {
        l.f(str, "<set-?>");
        this.applNumber = str;
    }

    public final void setDob(String str) {
        l.f(str, "<set-?>");
        this.dob = str;
    }

    public final void setStateCd(String str) {
        l.f(str, "<set-?>");
        this.stateCd = str;
    }

    public String toString() {
        return "{\"dlNumber\"=\"" + this.applNumber + "\", \"dob\"=\"" + this.dob + "\", \"rtoCd\"=\"" + this.stateCd + "\" }";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public DlRequestForEligibility(String str, String str2, String str3) {
        this(str);
        l.f(str, "applNumber");
        l.f(str2, "dob");
        l.f(str3, "stateCd");
        this.dob = str2;
        this.stateCd = str3;
    }
}
