package com.nic.mparivahan.RC.Model;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class Response {
    private final NrvDetails nrvDetails;
    private final String statusCode;
    private final String statusDesc;

    public Response(NrvDetails nrvDetails2, String str, String str2) {
        l.f(nrvDetails2, "nrvDetails");
        l.f(str, "statusCode");
        l.f(str2, "statusDesc");
        this.nrvDetails = nrvDetails2;
        this.statusCode = str;
        this.statusDesc = str2;
    }

    public static /* synthetic */ Response copy$default(Response response, NrvDetails nrvDetails2, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            nrvDetails2 = response.nrvDetails;
        }
        if ((i10 & 2) != 0) {
            str = response.statusCode;
        }
        if ((i10 & 4) != 0) {
            str2 = response.statusDesc;
        }
        return response.copy(nrvDetails2, str, str2);
    }

    public final NrvDetails component1() {
        return this.nrvDetails;
    }

    public final String component2() {
        return this.statusCode;
    }

    public final String component3() {
        return this.statusDesc;
    }

    public final Response copy(NrvDetails nrvDetails2, String str, String str2) {
        l.f(nrvDetails2, "nrvDetails");
        l.f(str, "statusCode");
        l.f(str2, "statusDesc");
        return new Response(nrvDetails2, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Response)) {
            return false;
        }
        Response response = (Response) obj;
        return l.a(this.nrvDetails, response.nrvDetails) && l.a(this.statusCode, response.statusCode) && l.a(this.statusDesc, response.statusDesc);
    }

    public final NrvDetails getNrvDetails() {
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
        return "Response(nrvDetails=" + this.nrvDetails + ", statusCode=" + this.statusCode + ", statusDesc=" + this.statusDesc + ')';
    }
}
