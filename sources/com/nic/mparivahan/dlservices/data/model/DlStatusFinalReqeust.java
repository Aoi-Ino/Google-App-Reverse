package com.nic.mparivahan.dlservices.data.model;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class DlStatusFinalReqeust {
    private final String param;
    private final String requestBody;

    public DlStatusFinalReqeust(String str, String str2) {
        l.f(str, "requestBody");
        l.f(str2, "param");
        this.requestBody = str;
        this.param = str2;
    }

    public static /* synthetic */ DlStatusFinalReqeust copy$default(DlStatusFinalReqeust dlStatusFinalReqeust, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = dlStatusFinalReqeust.requestBody;
        }
        if ((i10 & 2) != 0) {
            str2 = dlStatusFinalReqeust.param;
        }
        return dlStatusFinalReqeust.copy(str, str2);
    }

    public final String component1() {
        return this.requestBody;
    }

    public final String component2() {
        return this.param;
    }

    public final DlStatusFinalReqeust copy(String str, String str2) {
        l.f(str, "requestBody");
        l.f(str2, "param");
        return new DlStatusFinalReqeust(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DlStatusFinalReqeust)) {
            return false;
        }
        DlStatusFinalReqeust dlStatusFinalReqeust = (DlStatusFinalReqeust) obj;
        return l.a(this.requestBody, dlStatusFinalReqeust.requestBody) && l.a(this.param, dlStatusFinalReqeust.param);
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
        return "DlStatusFinalReqeust(requestBody=" + this.requestBody + ", param=" + this.param + ')';
    }
}
