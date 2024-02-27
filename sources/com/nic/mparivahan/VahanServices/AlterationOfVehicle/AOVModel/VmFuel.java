package com.nic.mparivahan.VahanServices.AlterationOfVehicle.AOVModel;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class VmFuel {
    private final int code;
    private final String descr;

    public VmFuel(int i10, String str) {
        l.f(str, "descr");
        this.code = i10;
        this.descr = str;
    }

    public static /* synthetic */ VmFuel copy$default(VmFuel vmFuel, int i10, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = vmFuel.code;
        }
        if ((i11 & 2) != 0) {
            str = vmFuel.descr;
        }
        return vmFuel.copy(i10, str);
    }

    public final int component1() {
        return this.code;
    }

    public final String component2() {
        return this.descr;
    }

    public final VmFuel copy(int i10, String str) {
        l.f(str, "descr");
        return new VmFuel(i10, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VmFuel)) {
            return false;
        }
        VmFuel vmFuel = (VmFuel) obj;
        return this.code == vmFuel.code && l.a(this.descr, vmFuel.descr);
    }

    public final int getCode() {
        return this.code;
    }

    public final String getDescr() {
        return this.descr;
    }

    public int hashCode() {
        return (Integer.hashCode(this.code) * 31) + this.descr.hashCode();
    }

    public String toString() {
        return "VmFuel(code=" + this.code + ", descr=" + this.descr + ')';
    }
}
