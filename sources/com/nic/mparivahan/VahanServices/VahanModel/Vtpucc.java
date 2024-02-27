package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class Vtpucc {
    private final String pucc_from;
    private final String pucc_no;
    private final String pucc_upto;

    public Vtpucc(String str, String str2, String str3) {
        this.pucc_from = str;
        this.pucc_no = str2;
        this.pucc_upto = str3;
    }

    public static /* synthetic */ Vtpucc copy$default(Vtpucc vtpucc, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = vtpucc.pucc_from;
        }
        if ((i10 & 2) != 0) {
            str2 = vtpucc.pucc_no;
        }
        if ((i10 & 4) != 0) {
            str3 = vtpucc.pucc_upto;
        }
        return vtpucc.copy(str, str2, str3);
    }

    public final String component1() {
        return this.pucc_from;
    }

    public final String component2() {
        return this.pucc_no;
    }

    public final String component3() {
        return this.pucc_upto;
    }

    public final Vtpucc copy(String str, String str2, String str3) {
        return new Vtpucc(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Vtpucc)) {
            return false;
        }
        Vtpucc vtpucc = (Vtpucc) obj;
        return l.a(this.pucc_from, vtpucc.pucc_from) && l.a(this.pucc_no, vtpucc.pucc_no) && l.a(this.pucc_upto, vtpucc.pucc_upto);
    }

    public final String getPucc_from() {
        return this.pucc_from;
    }

    public final String getPucc_no() {
        return this.pucc_no;
    }

    public final String getPucc_upto() {
        return this.pucc_upto;
    }

    public int hashCode() {
        String str = this.pucc_from;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.pucc_no;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.pucc_upto;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        return "Vtpucc(pucc_from=" + this.pucc_from + ", pucc_no=" + this.pucc_no + ", pucc_upto=" + this.pucc_upto + ')';
    }
}
