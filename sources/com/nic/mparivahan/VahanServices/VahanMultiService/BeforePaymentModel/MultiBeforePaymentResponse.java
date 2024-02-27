package com.nic.mparivahan.VahanServices.VahanMultiService.BeforePaymentModel;

import androidx.annotation.Keep;
import cm.l;
import java.io.Serializable;

@Keep
public final class MultiBeforePaymentResponse implements Serializable {
    private final String returnUrl;

    public MultiBeforePaymentResponse(String str) {
        l.f(str, "returnUrl");
        this.returnUrl = str;
    }

    public static /* synthetic */ MultiBeforePaymentResponse copy$default(MultiBeforePaymentResponse multiBeforePaymentResponse, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = multiBeforePaymentResponse.returnUrl;
        }
        return multiBeforePaymentResponse.copy(str);
    }

    public final String component1() {
        return this.returnUrl;
    }

    public final MultiBeforePaymentResponse copy(String str) {
        l.f(str, "returnUrl");
        return new MultiBeforePaymentResponse(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MultiBeforePaymentResponse) && l.a(this.returnUrl, ((MultiBeforePaymentResponse) obj).returnUrl);
    }

    public final String getReturnUrl() {
        return this.returnUrl;
    }

    public int hashCode() {
        return this.returnUrl.hashCode();
    }

    public String toString() {
        return "MultiBeforePaymentResponse(returnUrl=" + this.returnUrl + ')';
    }
}
