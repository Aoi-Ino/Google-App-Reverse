package com.nic.mparivahan.Sos.SModle;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class DeletResult {
    private final String statusCode;
    private final String statusDesc;

    public DeletResult(String str, String str2) {
        l.f(str, "statusCode");
        l.f(str2, "statusDesc");
        this.statusCode = str;
        this.statusDesc = str2;
    }

    public static /* synthetic */ DeletResult copy$default(DeletResult deletResult, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = deletResult.statusCode;
        }
        if ((i10 & 2) != 0) {
            str2 = deletResult.statusDesc;
        }
        return deletResult.copy(str, str2);
    }

    public final String component1() {
        return this.statusCode;
    }

    public final String component2() {
        return this.statusDesc;
    }

    public final DeletResult copy(String str, String str2) {
        l.f(str, "statusCode");
        l.f(str2, "statusDesc");
        return new DeletResult(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeletResult)) {
            return false;
        }
        DeletResult deletResult = (DeletResult) obj;
        return l.a(this.statusCode, deletResult.statusCode) && l.a(this.statusDesc, deletResult.statusDesc);
    }

    public final String getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public int hashCode() {
        return (this.statusCode.hashCode() * 31) + this.statusDesc.hashCode();
    }

    public String toString() {
        return "DeletResult(statusCode=" + this.statusCode + ", statusDesc=" + this.statusDesc + ')';
    }
}
