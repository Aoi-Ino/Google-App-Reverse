package com.nic.mparivahan.Checkpost.CheckPostModel;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class VpDetails {
    private final String bankCode;
    private final String paymentMode;

    public VpDetails(String str, String str2) {
        l.f(str, "bankCode");
        l.f(str2, "paymentMode");
        this.bankCode = str;
        this.paymentMode = str2;
    }

    public static /* synthetic */ VpDetails copy$default(VpDetails vpDetails, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = vpDetails.bankCode;
        }
        if ((i10 & 2) != 0) {
            str2 = vpDetails.paymentMode;
        }
        return vpDetails.copy(str, str2);
    }

    public final String component1() {
        return this.bankCode;
    }

    public final String component2() {
        return this.paymentMode;
    }

    public final VpDetails copy(String str, String str2) {
        l.f(str, "bankCode");
        l.f(str2, "paymentMode");
        return new VpDetails(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VpDetails)) {
            return false;
        }
        VpDetails vpDetails = (VpDetails) obj;
        return l.a(this.bankCode, vpDetails.bankCode) && l.a(this.paymentMode, vpDetails.paymentMode);
    }

    public final String getBankCode() {
        return this.bankCode;
    }

    public final String getPaymentMode() {
        return this.paymentMode;
    }

    public int hashCode() {
        return (this.bankCode.hashCode() * 31) + this.paymentMode.hashCode();
    }

    public String toString() {
        return "VpDetails(bankCode=" + this.bankCode + ", paymentMode=" + this.paymentMode + ')';
    }
}
