package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class VtpuccX {
    private final long op_dt;
    private final String pucc_centreno;
    private final long pucc_from;
    private final String pucc_no;
    private final long pucc_upto;
    private final VtpuccidX vtpuccid;

    public VtpuccX(long j10, String str, long j11, String str2, long j12, VtpuccidX vtpuccidX) {
        l.f(str, "pucc_centreno");
        l.f(str2, "pucc_no");
        l.f(vtpuccidX, "vtpuccid");
        this.op_dt = j10;
        this.pucc_centreno = str;
        this.pucc_from = j11;
        this.pucc_no = str2;
        this.pucc_upto = j12;
        this.vtpuccid = vtpuccidX;
    }

    public static /* synthetic */ VtpuccX copy$default(VtpuccX vtpuccX, long j10, String str, long j11, String str2, long j12, VtpuccidX vtpuccidX, int i10, Object obj) {
        VtpuccX vtpuccX2 = vtpuccX;
        return vtpuccX.copy((i10 & 1) != 0 ? vtpuccX2.op_dt : j10, (i10 & 2) != 0 ? vtpuccX2.pucc_centreno : str, (i10 & 4) != 0 ? vtpuccX2.pucc_from : j11, (i10 & 8) != 0 ? vtpuccX2.pucc_no : str2, (i10 & 16) != 0 ? vtpuccX2.pucc_upto : j12, (i10 & 32) != 0 ? vtpuccX2.vtpuccid : vtpuccidX);
    }

    public final long component1() {
        return this.op_dt;
    }

    public final String component2() {
        return this.pucc_centreno;
    }

    public final long component3() {
        return this.pucc_from;
    }

    public final String component4() {
        return this.pucc_no;
    }

    public final long component5() {
        return this.pucc_upto;
    }

    public final VtpuccidX component6() {
        return this.vtpuccid;
    }

    public final VtpuccX copy(long j10, String str, long j11, String str2, long j12, VtpuccidX vtpuccidX) {
        l.f(str, "pucc_centreno");
        String str3 = str2;
        l.f(str3, "pucc_no");
        VtpuccidX vtpuccidX2 = vtpuccidX;
        l.f(vtpuccidX2, "vtpuccid");
        return new VtpuccX(j10, str, j11, str3, j12, vtpuccidX2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VtpuccX)) {
            return false;
        }
        VtpuccX vtpuccX = (VtpuccX) obj;
        return this.op_dt == vtpuccX.op_dt && l.a(this.pucc_centreno, vtpuccX.pucc_centreno) && this.pucc_from == vtpuccX.pucc_from && l.a(this.pucc_no, vtpuccX.pucc_no) && this.pucc_upto == vtpuccX.pucc_upto && l.a(this.vtpuccid, vtpuccX.vtpuccid);
    }

    public final long getOp_dt() {
        return this.op_dt;
    }

    public final String getPucc_centreno() {
        return this.pucc_centreno;
    }

    public final long getPucc_from() {
        return this.pucc_from;
    }

    public final String getPucc_no() {
        return this.pucc_no;
    }

    public final long getPucc_upto() {
        return this.pucc_upto;
    }

    public final VtpuccidX getVtpuccid() {
        return this.vtpuccid;
    }

    public int hashCode() {
        return (((((((((Long.hashCode(this.op_dt) * 31) + this.pucc_centreno.hashCode()) * 31) + Long.hashCode(this.pucc_from)) * 31) + this.pucc_no.hashCode()) * 31) + Long.hashCode(this.pucc_upto)) * 31) + this.vtpuccid.hashCode();
    }

    public String toString() {
        return "VtpuccX(op_dt=" + this.op_dt + ", pucc_centreno=" + this.pucc_centreno + ", pucc_from=" + this.pucc_from + ", pucc_no=" + this.pucc_no + ", pucc_upto=" + this.pucc_upto + ", vtpuccid=" + this.vtpuccid + ')';
    }
}
