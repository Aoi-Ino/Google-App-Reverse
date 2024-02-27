package com.nic.mparivahan.Tax.Model;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class BeforeResponse {
    private final String returnUrl;

    public BeforeResponse(String str) {
        l.f(str, "returnUrl");
        this.returnUrl = str;
    }

    public static /* synthetic */ BeforeResponse copy$default(BeforeResponse beforeResponse, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = beforeResponse.returnUrl;
        }
        return beforeResponse.copy(str);
    }

    public final String component1() {
        return this.returnUrl;
    }

    public final BeforeResponse copy(String str) {
        l.f(str, "returnUrl");
        return new BeforeResponse(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BeforeResponse) && l.a(this.returnUrl, ((BeforeResponse) obj).returnUrl);
    }

    public final String getReturnUrl() {
        return this.returnUrl;
    }

    public int hashCode() {
        return this.returnUrl.hashCode();
    }

    public String toString() {
        return "BeforeResponse(returnUrl=" + this.returnUrl + ')';
    }
}
