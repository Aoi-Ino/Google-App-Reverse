package com.nic.mparivahan.Tax.Model;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class Errormodel {
    private final String errorDesc;
    private final int errorcode;

    public Errormodel(String str, int i10) {
        l.f(str, "errorDesc");
        this.errorDesc = str;
        this.errorcode = i10;
    }

    public static /* synthetic */ Errormodel copy$default(Errormodel errormodel, String str, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = errormodel.errorDesc;
        }
        if ((i11 & 2) != 0) {
            i10 = errormodel.errorcode;
        }
        return errormodel.copy(str, i10);
    }

    public final String component1() {
        return this.errorDesc;
    }

    public final int component2() {
        return this.errorcode;
    }

    public final Errormodel copy(String str, int i10) {
        l.f(str, "errorDesc");
        return new Errormodel(str, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Errormodel)) {
            return false;
        }
        Errormodel errormodel = (Errormodel) obj;
        return l.a(this.errorDesc, errormodel.errorDesc) && this.errorcode == errormodel.errorcode;
    }

    public final String getErrorDesc() {
        return this.errorDesc;
    }

    public final int getErrorcode() {
        return this.errorcode;
    }

    public int hashCode() {
        return (this.errorDesc.hashCode() * 31) + Integer.hashCode(this.errorcode);
    }

    public String toString() {
        return "Errormodel(errorDesc=" + this.errorDesc + ", errorcode=" + this.errorcode + ')';
    }
}
