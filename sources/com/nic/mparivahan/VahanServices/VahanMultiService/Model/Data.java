package com.nic.mparivahan.VahanServices.VahanMultiService.Model;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class Data {
    private final AllowedPurposeCode allowedPurposeCode;

    public Data(AllowedPurposeCode allowedPurposeCode2) {
        l.f(allowedPurposeCode2, "allowedPurposeCode");
        this.allowedPurposeCode = allowedPurposeCode2;
    }

    public static /* synthetic */ Data copy$default(Data data, AllowedPurposeCode allowedPurposeCode2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            allowedPurposeCode2 = data.allowedPurposeCode;
        }
        return data.copy(allowedPurposeCode2);
    }

    public final AllowedPurposeCode component1() {
        return this.allowedPurposeCode;
    }

    public final Data copy(AllowedPurposeCode allowedPurposeCode2) {
        l.f(allowedPurposeCode2, "allowedPurposeCode");
        return new Data(allowedPurposeCode2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Data) && l.a(this.allowedPurposeCode, ((Data) obj).allowedPurposeCode);
    }

    public final AllowedPurposeCode getAllowedPurposeCode() {
        return this.allowedPurposeCode;
    }

    public int hashCode() {
        return this.allowedPurposeCode.hashCode();
    }

    public String toString() {
        return "Data(allowedPurposeCode=" + this.allowedPurposeCode + ')';
    }
}
