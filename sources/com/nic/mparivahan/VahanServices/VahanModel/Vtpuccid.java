package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class Vtpuccid {
    private final String off_cd;
    private final String regn_no;
    private final String state_cd;

    public Vtpuccid(String str, String str2, String str3) {
        l.f(str, "off_cd");
        l.f(str2, "regn_no");
        l.f(str3, "state_cd");
        this.off_cd = str;
        this.regn_no = str2;
        this.state_cd = str3;
    }

    public static /* synthetic */ Vtpuccid copy$default(Vtpuccid vtpuccid, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = vtpuccid.off_cd;
        }
        if ((i10 & 2) != 0) {
            str2 = vtpuccid.regn_no;
        }
        if ((i10 & 4) != 0) {
            str3 = vtpuccid.state_cd;
        }
        return vtpuccid.copy(str, str2, str3);
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

    public final Vtpuccid copy(String str, String str2, String str3) {
        l.f(str, "off_cd");
        l.f(str2, "regn_no");
        l.f(str3, "state_cd");
        return new Vtpuccid(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Vtpuccid)) {
            return false;
        }
        Vtpuccid vtpuccid = (Vtpuccid) obj;
        return l.a(this.off_cd, vtpuccid.off_cd) && l.a(this.regn_no, vtpuccid.regn_no) && l.a(this.state_cd, vtpuccid.state_cd);
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
        return "Vtpuccid(off_cd=" + this.off_cd + ", regn_no=" + this.regn_no + ", state_cd=" + this.state_cd + ')';
    }
}
