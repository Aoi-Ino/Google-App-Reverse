package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class VtpuccidX {
    private final String off_cd;
    private final String regn_no;
    private final String state_cd;

    public VtpuccidX(String str, String str2, String str3) {
        l.f(str, "off_cd");
        l.f(str2, "regn_no");
        l.f(str3, "state_cd");
        this.off_cd = str;
        this.regn_no = str2;
        this.state_cd = str3;
    }

    public static /* synthetic */ VtpuccidX copy$default(VtpuccidX vtpuccidX, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = vtpuccidX.off_cd;
        }
        if ((i10 & 2) != 0) {
            str2 = vtpuccidX.regn_no;
        }
        if ((i10 & 4) != 0) {
            str3 = vtpuccidX.state_cd;
        }
        return vtpuccidX.copy(str, str2, str3);
    }

    public final String component1() {
        return this.off_cd;
    }

    public final String component2() {
        return this.regn_no;
    }

    public final String component3() {
        return this.state_cd;
    }

    public final VtpuccidX copy(String str, String str2, String str3) {
        l.f(str, "off_cd");
        l.f(str2, "regn_no");
        l.f(str3, "state_cd");
        return new VtpuccidX(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VtpuccidX)) {
            return false;
        }
        VtpuccidX vtpuccidX = (VtpuccidX) obj;
        return l.a(this.off_cd, vtpuccidX.off_cd) && l.a(this.regn_no, vtpuccidX.regn_no) && l.a(this.state_cd, vtpuccidX.state_cd);
    }

    public final String getOff_cd() {
        return this.off_cd;
    }

    public final String getRegn_no() {
        return this.regn_no;
    }

    public final String getState_cd() {
        return this.state_cd;
    }

    public int hashCode() {
        return (((this.off_cd.hashCode() * 31) + this.regn_no.hashCode()) * 31) + this.state_cd.hashCode();
    }

    public String toString() {
        return "VtpuccidX(off_cd=" + this.off_cd + ", regn_no=" + this.regn_no + ", state_cd=" + this.state_cd + ')';
    }
}
