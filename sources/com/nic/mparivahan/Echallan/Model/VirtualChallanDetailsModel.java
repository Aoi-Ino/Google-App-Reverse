package com.nic.mparivahan.Echallan.Model;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class VirtualChallanDetailsModel {
    private final VirtualChallanResultModel result;
    private final String status;

    public VirtualChallanDetailsModel(String str, VirtualChallanResultModel virtualChallanResultModel) {
        l.f(str, "status");
        l.f(virtualChallanResultModel, "result");
        this.status = str;
        this.result = virtualChallanResultModel;
    }

    public static /* synthetic */ VirtualChallanDetailsModel copy$default(VirtualChallanDetailsModel virtualChallanDetailsModel, String str, VirtualChallanResultModel virtualChallanResultModel, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = virtualChallanDetailsModel.status;
        }
        if ((i10 & 2) != 0) {
            virtualChallanResultModel = virtualChallanDetailsModel.result;
        }
        return virtualChallanDetailsModel.copy(str, virtualChallanResultModel);
    }

    public final String component1() {
        return this.status;
    }

    public final VirtualChallanResultModel component2() {
        return this.result;
    }

    public final VirtualChallanDetailsModel copy(String str, VirtualChallanResultModel virtualChallanResultModel) {
        l.f(str, "status");
        l.f(virtualChallanResultModel, "result");
        return new VirtualChallanDetailsModel(str, virtualChallanResultModel);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VirtualChallanDetailsModel)) {
            return false;
        }
        VirtualChallanDetailsModel virtualChallanDetailsModel = (VirtualChallanDetailsModel) obj;
        return l.a(this.status, virtualChallanDetailsModel.status) && l.a(this.result, virtualChallanDetailsModel.result);
    }

    public final VirtualChallanResultModel getResult() {
        return this.result;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (this.status.hashCode() * 31) + this.result.hashCode();
    }

    public String toString() {
        return "VirtualChallanDetailsModel(status=" + this.status + ", result=" + this.result + ')';
    }
}
