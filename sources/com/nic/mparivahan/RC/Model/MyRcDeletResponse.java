package com.nic.mparivahan.RC.Model;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class MyRcDeletResponse {
    private final String statusCode;
    private final String statusDesc;

    public MyRcDeletResponse(String str, String str2) {
        l.f(str, "statusCode");
        l.f(str2, "statusDesc");
        this.statusCode = str;
        this.statusDesc = str2;
    }

    public static /* synthetic */ MyRcDeletResponse copy$default(MyRcDeletResponse myRcDeletResponse, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = myRcDeletResponse.statusCode;
        }
        if ((i10 & 2) != 0) {
            str2 = myRcDeletResponse.statusDesc;
        }
        return myRcDeletResponse.copy(str, str2);
    }

    public final String component1() {
        return this.statusCode;
    }

    public final String component2() {
        return this.statusDesc;
    }

    public final MyRcDeletResponse copy(String str, String str2) {
        l.f(str, "statusCode");
        l.f(str2, "statusDesc");
        return new MyRcDeletResponse(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MyRcDeletResponse)) {
            return false;
        }
        MyRcDeletResponse myRcDeletResponse = (MyRcDeletResponse) obj;
        return l.a(this.statusCode, myRcDeletResponse.statusCode) && l.a(this.statusDesc, myRcDeletResponse.statusDesc);
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
        return "MyRcDeletResponse(statusCode=" + this.statusCode + ", statusDesc=" + this.statusDesc + ')';
    }
}
