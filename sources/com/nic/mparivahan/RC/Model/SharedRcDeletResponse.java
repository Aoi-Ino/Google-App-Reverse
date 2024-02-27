package com.nic.mparivahan.RC.Model;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class SharedRcDeletResponse {
    private final String statusCode;
    private final String statusDesc;

    public SharedRcDeletResponse(String str, String str2) {
        l.f(str, "statusCode");
        l.f(str2, "statusDesc");
        this.statusCode = str;
        this.statusDesc = str2;
    }

    public static /* synthetic */ SharedRcDeletResponse copy$default(SharedRcDeletResponse sharedRcDeletResponse, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = sharedRcDeletResponse.statusCode;
        }
        if ((i10 & 2) != 0) {
            str2 = sharedRcDeletResponse.statusDesc;
        }
        return sharedRcDeletResponse.copy(str, str2);
    }

    public final String component1() {
        return this.statusCode;
    }

    public final String component2() {
        return this.statusDesc;
    }

    public final SharedRcDeletResponse copy(String str, String str2) {
        l.f(str, "statusCode");
        l.f(str2, "statusDesc");
        return new SharedRcDeletResponse(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SharedRcDeletResponse)) {
            return false;
        }
        SharedRcDeletResponse sharedRcDeletResponse = (SharedRcDeletResponse) obj;
        return l.a(this.statusCode, sharedRcDeletResponse.statusCode) && l.a(this.statusDesc, sharedRcDeletResponse.statusDesc);
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
        return "SharedRcDeletResponse(statusCode=" + this.statusCode + ", statusDesc=" + this.statusDesc + ')';
    }
}
