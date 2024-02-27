package com.nic.mparivahan.VahanServices.VahanViewModel;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class VahanPendingTransBankModel {
    private final String returnUrl;

    public VahanPendingTransBankModel(String str) {
        l.f(str, "returnUrl");
        this.returnUrl = str;
    }

    public static /* synthetic */ VahanPendingTransBankModel copy$default(VahanPendingTransBankModel vahanPendingTransBankModel, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = vahanPendingTransBankModel.returnUrl;
        }
        return vahanPendingTransBankModel.copy(str);
    }

    public final String component1() {
        return this.returnUrl;
    }

    public final VahanPendingTransBankModel copy(String str) {
        l.f(str, "returnUrl");
        return new VahanPendingTransBankModel(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VahanPendingTransBankModel) && l.a(this.returnUrl, ((VahanPendingTransBankModel) obj).returnUrl);
    }

    public final String getReturnUrl() {
        return this.returnUrl;
    }

    public int hashCode() {
        return this.returnUrl.hashCode();
    }

    public String toString() {
        return "VahanPendingTransBankModel(returnUrl=" + this.returnUrl + ')';
    }
}
