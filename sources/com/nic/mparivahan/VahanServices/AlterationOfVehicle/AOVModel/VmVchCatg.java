package com.nic.mparivahan.VahanServices.AlterationOfVehicle.AOVModel;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class VmVchCatg {
    private final String catg;
    private final String catgDesc;

    public VmVchCatg(String str, String str2) {
        l.f(str, "catg");
        l.f(str2, "catgDesc");
        this.catg = str;
        this.catgDesc = str2;
    }

    public static /* synthetic */ VmVchCatg copy$default(VmVchCatg vmVchCatg, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = vmVchCatg.catg;
        }
        if ((i10 & 2) != 0) {
            str2 = vmVchCatg.catgDesc;
        }
        return vmVchCatg.copy(str, str2);
    }

    public final String component1() {
        return this.catg;
    }

    public final String component2() {
        return this.catgDesc;
    }

    public final VmVchCatg copy(String str, String str2) {
        l.f(str, "catg");
        l.f(str2, "catgDesc");
        return new VmVchCatg(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VmVchCatg)) {
            return false;
        }
        VmVchCatg vmVchCatg = (VmVchCatg) obj;
        return l.a(this.catg, vmVchCatg.catg) && l.a(this.catgDesc, vmVchCatg.catgDesc);
    }

    public final String getCatg() {
        return this.catg;
    }

    public final String getCatgDesc() {
        return this.catgDesc;
    }

    public int hashCode() {
        return (this.catg.hashCode() * 31) + this.catgDesc.hashCode();
    }

    public String toString() {
        return "VmVchCatg(catg=" + this.catg + ", catgDesc=" + this.catgDesc + ')';
    }
}
