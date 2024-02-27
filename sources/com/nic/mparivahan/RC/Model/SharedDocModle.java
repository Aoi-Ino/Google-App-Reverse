package com.nic.mparivahan.RC.Model;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class SharedDocModle {
    private final String statusCode;
    private final String statusDesc;

    public SharedDocModle(String str, String str2) {
        l.f(str, "statusCode");
        l.f(str2, "statusDesc");
        this.statusCode = str;
        this.statusDesc = str2;
    }

    public static /* synthetic */ SharedDocModle copy$default(SharedDocModle sharedDocModle, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = sharedDocModle.statusCode;
        }
        if ((i10 & 2) != 0) {
            str2 = sharedDocModle.statusDesc;
        }
        return sharedDocModle.copy(str, str2);
    }

    public final String component1() {
        return this.statusCode;
    }

    public final String component2() {
        return this.statusDesc;
    }

    public final SharedDocModle copy(String str, String str2) {
        l.f(str, "statusCode");
        l.f(str2, "statusDesc");
        return new SharedDocModle(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SharedDocModle)) {
            return false;
        }
        SharedDocModle sharedDocModle = (SharedDocModle) obj;
        return l.a(this.statusCode, sharedDocModle.statusCode) && l.a(this.statusDesc, sharedDocModle.statusDesc);
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
        return "SharedDocModle(statusCode=" + this.statusCode + ", statusDesc=" + this.statusDesc + ')';
    }
}
