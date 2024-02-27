package com.nic.mparivahan.VahanServices.VahanPaymentModel;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class PaymentBeforeUrlResponse {
    private final String returnUrl;

    public PaymentBeforeUrlResponse(String str) {
        l.f(str, "returnUrl");
        this.returnUrl = str;
    }

    public static /* synthetic */ PaymentBeforeUrlResponse copy$default(PaymentBeforeUrlResponse paymentBeforeUrlResponse, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = paymentBeforeUrlResponse.returnUrl;
        }
        return paymentBeforeUrlResponse.copy(str);
    }

    public final String component1() {
        return this.returnUrl;
    }

    public final PaymentBeforeUrlResponse copy(String str) {
        l.f(str, "returnUrl");
        return new PaymentBeforeUrlResponse(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PaymentBeforeUrlResponse) && l.a(this.returnUrl, ((PaymentBeforeUrlResponse) obj).returnUrl);
    }

    public final String getReturnUrl() {
        return this.returnUrl;
    }

    public int hashCode() {
        return this.returnUrl.hashCode();
    }

    public String toString() {
        return "PaymentBeforeUrlResponse(returnUrl=" + this.returnUrl + ')';
    }
}
