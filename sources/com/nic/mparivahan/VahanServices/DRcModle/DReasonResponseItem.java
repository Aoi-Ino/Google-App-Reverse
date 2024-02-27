package com.nic.mparivahan.VahanServices.DRcModle;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class DReasonResponseItem {
    private final String reason_desc;
    private final VmServiceReasonEntityById vmServiceReasonEntityById;

    public DReasonResponseItem(String str, VmServiceReasonEntityById vmServiceReasonEntityById2) {
        this.reason_desc = str;
        this.vmServiceReasonEntityById = vmServiceReasonEntityById2;
    }

    public static /* synthetic */ DReasonResponseItem copy$default(DReasonResponseItem dReasonResponseItem, String str, VmServiceReasonEntityById vmServiceReasonEntityById2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = dReasonResponseItem.reason_desc;
        }
        if ((i10 & 2) != 0) {
            vmServiceReasonEntityById2 = dReasonResponseItem.vmServiceReasonEntityById;
        }
        return dReasonResponseItem.copy(str, vmServiceReasonEntityById2);
    }

    public final String component1() {
        return this.reason_desc;
    }

    public final VmServiceReasonEntityById component2() {
        return this.vmServiceReasonEntityById;
    }

    public final DReasonResponseItem copy(String str, VmServiceReasonEntityById vmServiceReasonEntityById2) {
        return new DReasonResponseItem(str, vmServiceReasonEntityById2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DReasonResponseItem)) {
            return false;
        }
        DReasonResponseItem dReasonResponseItem = (DReasonResponseItem) obj;
        return l.a(this.reason_desc, dReasonResponseItem.reason_desc) && l.a(this.vmServiceReasonEntityById, dReasonResponseItem.vmServiceReasonEntityById);
    }

    public final String getReason_desc() {
        return this.reason_desc;
    }

    public final VmServiceReasonEntityById getVmServiceReasonEntityById() {
        return this.vmServiceReasonEntityById;
    }

    public int hashCode() {
        String str = this.reason_desc;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        VmServiceReasonEntityById vmServiceReasonEntityById2 = this.vmServiceReasonEntityById;
        if (vmServiceReasonEntityById2 != null) {
            i10 = vmServiceReasonEntityById2.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        return "DReasonResponseItem(reason_desc=" + this.reason_desc + ", vmServiceReasonEntityById=" + this.vmServiceReasonEntityById + ')';
    }
}
