package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class VahanValidateError {
    private final String errorDesc;
    private final int errorcode;

    public VahanValidateError(int i10, String str) {
        l.f(str, "errorDesc");
        this.errorcode = i10;
        this.errorDesc = str;
    }

    public static /* synthetic */ VahanValidateError copy$default(VahanValidateError vahanValidateError, int i10, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = vahanValidateError.errorcode;
        }
        if ((i11 & 2) != 0) {
            str = vahanValidateError.errorDesc;
        }
        return vahanValidateError.copy(i10, str);
    }

    public final int component1() {
        return this.errorcode;
    }

    public final String component2() {
        return this.errorDesc;
    }

    public final VahanValidateError copy(int i10, String str) {
        l.f(str, "errorDesc");
        return new VahanValidateError(i10, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VahanValidateError)) {
            return false;
        }
        VahanValidateError vahanValidateError = (VahanValidateError) obj;
        return this.errorcode == vahanValidateError.errorcode && l.a(this.errorDesc, vahanValidateError.errorDesc);
    }

    public final String getErrorDesc() {
        return this.errorDesc;
    }

    public final int getErrorcode() {
        return this.errorcode;
    }

    public int hashCode() {
        return (Integer.hashCode(this.errorcode) * 31) + this.errorDesc.hashCode();
    }

    public String toString() {
        return "VahanValidateError(errorcode=" + this.errorcode + ", errorDesc=" + this.errorDesc + ')';
    }
}
