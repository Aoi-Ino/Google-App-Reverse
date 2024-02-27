package com.nic.mparivahan.RC.Model;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class t {
    private final NrvDetailsX nrvDetails;
    private final String statusCode;
    private final String statusDesc;

    public t(NrvDetailsX nrvDetailsX, String str, String str2) {
        l.f(nrvDetailsX, "nrvDetails");
        l.f(str, "statusCode");
        l.f(str2, "statusDesc");
        this.nrvDetails = nrvDetailsX;
        this.statusCode = str;
        this.statusDesc = str2;
    }

    public static /* synthetic */ t copy$default(t tVar, NrvDetailsX nrvDetailsX, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            nrvDetailsX = tVar.nrvDetails;
        }
        if ((i10 & 2) != 0) {
            str = tVar.statusCode;
        }
        if ((i10 & 4) != 0) {
            str2 = tVar.statusDesc;
        }
        return tVar.copy(nrvDetailsX, str, str2);
    }

    public final NrvDetailsX component1() {
        return this.nrvDetails;
    }

    public final String component2() {
        return this.statusCode;
    }

    public final String component3() {
        return this.statusDesc;
    }

    public final t copy(NrvDetailsX nrvDetailsX, String str, String str2) {
        l.f(nrvDetailsX, "nrvDetails");
        l.f(str, "statusCode");
        l.f(str2, "statusDesc");
        return new t(nrvDetailsX, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return l.a(this.nrvDetails, tVar.nrvDetails) && l.a(this.statusCode, tVar.statusCode) && l.a(this.statusDesc, tVar.statusDesc);
    }

    public final NrvDetailsX getNrvDetails() {
        return this.nrvDetails;
    }

    public final String getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public int hashCode() {
        return (((this.nrvDetails.hashCode() * 31) + this.statusCode.hashCode()) * 31) + this.statusDesc.hashCode();
    }

    public String toString() {
        return "t(nrvDetails=" + this.nrvDetails + ", statusCode=" + this.statusCode + ", statusDesc=" + this.statusDesc + ')';
    }
}
