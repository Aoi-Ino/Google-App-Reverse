package com.nic.mparivahan.VahanServices.Model;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class VTHypthEntityByid {
    private final int off_cd;
    private final String regn_no;
    private final int sr_no;
    private final String state_cd;

    public VTHypthEntityByid(int i10, String str, int i11, String str2) {
        l.f(str, "regn_no");
        l.f(str2, "state_cd");
        this.off_cd = i10;
        this.regn_no = str;
        this.sr_no = i11;
        this.state_cd = str2;
    }

    public static /* synthetic */ VTHypthEntityByid copy$default(VTHypthEntityByid vTHypthEntityByid, int i10, String str, int i11, String str2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = vTHypthEntityByid.off_cd;
        }
        if ((i12 & 2) != 0) {
            str = vTHypthEntityByid.regn_no;
        }
        if ((i12 & 4) != 0) {
            i11 = vTHypthEntityByid.sr_no;
        }
        if ((i12 & 8) != 0) {
            str2 = vTHypthEntityByid.state_cd;
        }
        return vTHypthEntityByid.copy(i10, str, i11, str2);
    }

    public final int component1() {
        return this.off_cd;
    }

    public final String component2() {
        return this.regn_no;
    }

    public final int component3() {
        return this.sr_no;
    }

    public final String component4() {
        return this.state_cd;
    }

    public final VTHypthEntityByid copy(int i10, String str, int i11, String str2) {
        l.f(str, "regn_no");
        l.f(str2, "state_cd");
        return new VTHypthEntityByid(i10, str, i11, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VTHypthEntityByid)) {
            return false;
        }
        VTHypthEntityByid vTHypthEntityByid = (VTHypthEntityByid) obj;
        return this.off_cd == vTHypthEntityByid.off_cd && l.a(this.regn_no, vTHypthEntityByid.regn_no) && this.sr_no == vTHypthEntityByid.sr_no && l.a(this.state_cd, vTHypthEntityByid.state_cd);
    }

    public final int getOff_cd() {
        return this.off_cd;
    }

    public final String getRegn_no() {
        return this.regn_no;
    }

    public final int getSr_no() {
        return this.sr_no;
    }

    public final String getState_cd() {
        return this.state_cd;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.off_cd) * 31) + this.regn_no.hashCode()) * 31) + Integer.hashCode(this.sr_no)) * 31) + this.state_cd.hashCode();
    }

    public String toString() {
        return "VTHypthEntityByid(off_cd=" + this.off_cd + ", regn_no=" + this.regn_no + ", sr_no=" + this.sr_no + ", state_cd=" + this.state_cd + ')';
    }
}
