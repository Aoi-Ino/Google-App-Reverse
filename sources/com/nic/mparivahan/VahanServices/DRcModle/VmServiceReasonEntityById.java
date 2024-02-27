package com.nic.mparivahan.VahanServices.DRcModle;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class VmServiceReasonEntityById {
    private final String pur_cd;
    private final String reason_cd;

    public VmServiceReasonEntityById(String str, String str2) {
        l.f(str, "pur_cd");
        l.f(str2, "reason_cd");
        this.pur_cd = str;
        this.reason_cd = str2;
    }

    public static /* synthetic */ VmServiceReasonEntityById copy$default(VmServiceReasonEntityById vmServiceReasonEntityById, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = vmServiceReasonEntityById.pur_cd;
        }
        if ((i10 & 2) != 0) {
            str2 = vmServiceReasonEntityById.reason_cd;
        }
        return vmServiceReasonEntityById.copy(str, str2);
    }

    public final String component1() {
        return this.pur_cd;
    }

    public final String component2() {
        return this.reason_cd;
    }

    public final VmServiceReasonEntityById copy(String str, String str2) {
        l.f(str, "pur_cd");
        l.f(str2, "reason_cd");
        return new VmServiceReasonEntityById(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VmServiceReasonEntityById)) {
            return false;
        }
        VmServiceReasonEntityById vmServiceReasonEntityById = (VmServiceReasonEntityById) obj;
        return l.a(this.pur_cd, vmServiceReasonEntityById.pur_cd) && l.a(this.reason_cd, vmServiceReasonEntityById.reason_cd);
    }

    public final String getPur_cd() {
        return this.pur_cd;
    }

    public final String getReason_cd() {
        return this.reason_cd;
    }

    public int hashCode() {
        return (this.pur_cd.hashCode() * 31) + this.reason_cd.hashCode();
    }

    public String toString() {
        return "VmServiceReasonEntityById(pur_cd=" + this.pur_cd + ", reason_cd=" + this.reason_cd + ')';
    }
}
