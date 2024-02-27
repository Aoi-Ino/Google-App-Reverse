package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class ApplStatusDetailsListModel {
    private final String statusDesc;

    public ApplStatusDetailsListModel(String str) {
        l.f(str, "statusDesc");
        this.statusDesc = str;
    }

    public static /* synthetic */ ApplStatusDetailsListModel copy$default(ApplStatusDetailsListModel applStatusDetailsListModel, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = applStatusDetailsListModel.statusDesc;
        }
        return applStatusDetailsListModel.copy(str);
    }

    public final String component1() {
        return this.statusDesc;
    }

    public final ApplStatusDetailsListModel copy(String str) {
        l.f(str, "statusDesc");
        return new ApplStatusDetailsListModel(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ApplStatusDetailsListModel) && l.a(this.statusDesc, ((ApplStatusDetailsListModel) obj).statusDesc);
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public int hashCode() {
        return this.statusDesc.hashCode();
    }

    public String toString() {
        return "ApplStatusDetailsListModel(statusDesc=" + this.statusDesc + ')';
    }
}
