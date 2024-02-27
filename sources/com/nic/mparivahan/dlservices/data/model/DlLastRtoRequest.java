package com.nic.mparivahan.dlservices.data.model;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class DlLastRtoRequest {
    private final String param;
    private final String requestBody;

    public DlLastRtoRequest(String str, String str2) {
        l.f(str, "requestBody");
        l.f(str2, "param");
        this.requestBody = str;
        this.param = str2;
    }

    public static /* synthetic */ DlLastRtoRequest copy$default(DlLastRtoRequest dlLastRtoRequest, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = dlLastRtoRequest.requestBody;
        }
        if ((i10 & 2) != 0) {
            str2 = dlLastRtoRequest.param;
        }
        return dlLastRtoRequest.copy(str, str2);
    }

    public final String component1() {
        return this.requestBody;
    }

    public final String component2() {
        return this.param;
    }

    public final DlLastRtoRequest copy(String str, String str2) {
        l.f(str, "requestBody");
        l.f(str2, "param");
        return new DlLastRtoRequest(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DlLastRtoRequest)) {
            return false;
        }
        DlLastRtoRequest dlLastRtoRequest = (DlLastRtoRequest) obj;
        return l.a(this.requestBody, dlLastRtoRequest.requestBody) && l.a(this.param, dlLastRtoRequest.param);
    }

    public final String getParam() {
        return this.param;
    }

    public final String getRequestBody() {
        return this.requestBody;
    }

    public int hashCode() {
        return (this.requestBody.hashCode() * 31) + this.param.hashCode();
    }

    public String toString() {
        return "DlLastRtoRequest(requestBody=" + this.requestBody + ", param=" + this.param + ')';
    }
}
