package com.nic.mparivahan.VahanServices.Model;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class VtTaxEntityByid {
    private final int off_cd;
    private final int pur_cd;
    private final String rcpt_no;
    private final String state_cd;

    public VtTaxEntityByid(int i10, int i11, String str, String str2) {
        l.f(str, "rcpt_no");
        l.f(str2, "state_cd");
        this.off_cd = i10;
        this.pur_cd = i11;
        this.rcpt_no = str;
        this.state_cd = str2;
    }

    public static /* synthetic */ VtTaxEntityByid copy$default(VtTaxEntityByid vtTaxEntityByid, int i10, int i11, String str, String str2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = vtTaxEntityByid.off_cd;
        }
        if ((i12 & 2) != 0) {
            i11 = vtTaxEntityByid.pur_cd;
        }
        if ((i12 & 4) != 0) {
            str = vtTaxEntityByid.rcpt_no;
        }
        if ((i12 & 8) != 0) {
            str2 = vtTaxEntityByid.state_cd;
        }
        return vtTaxEntityByid.copy(i10, i11, str, str2);
    }

    public final int component1() {
        return this.off_cd;
    }

    public final int component2() {
        return this.pur_cd;
    }

    public final String component3() {
        return this.rcpt_no;
    }

    public final String component4() {
        return this.state_cd;
    }

    public final VtTaxEntityByid copy(int i10, int i11, String str, String str2) {
        l.f(str, "rcpt_no");
        l.f(str2, "state_cd");
        return new VtTaxEntityByid(i10, i11, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VtTaxEntityByid)) {
            return false;
        }
        VtTaxEntityByid vtTaxEntityByid = (VtTaxEntityByid) obj;
        return this.off_cd == vtTaxEntityByid.off_cd && this.pur_cd == vtTaxEntityByid.pur_cd && l.a(this.rcpt_no, vtTaxEntityByid.rcpt_no) && l.a(this.state_cd, vtTaxEntityByid.state_cd);
    }

    public final int getOff_cd() {
        return this.off_cd;
    }

    public final int getPur_cd() {
        return this.pur_cd;
    }

    public final String getRcpt_no() {
        return this.rcpt_no;
    }

    public final String getState_cd() {
        return this.state_cd;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.off_cd) * 31) + Integer.hashCode(this.pur_cd)) * 31) + this.rcpt_no.hashCode()) * 31) + this.state_cd.hashCode();
    }

    public String toString() {
        return "VtTaxEntityByid(off_cd=" + this.off_cd + ", pur_cd=" + this.pur_cd + ", rcpt_no=" + this.rcpt_no + ", state_cd=" + this.state_cd + ')';
    }
}
