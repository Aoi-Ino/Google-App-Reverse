package com.nic.mparivahan.dlservices.data.model;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class DlRequestForEligibilityRequest {
    private final String param;
    private final String requestBody;

    public DlRequestForEligibilityRequest(String str, String str2) {
        l.f(str, "requestBody");
        l.f(str2, "param");
        this.requestBody = str;
        this.param = str2;
    }

    public static /* synthetic */ DlRequestForEligibilityRequest copy$default(DlRequestForEligibilityRequest dlRequestForEligibilityRequest, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = dlRequestForEligibilityRequest.requestBody;
        }
        if ((i10 & 2) != 0) {
            str2 = dlRequestForEligibilityRequest.param;
        }
        return dlRequestForEligibilityRequest.copy(str, str2);
    }

    public final String component1() {
        return this.requestBody;
    }

    public final String component2() {
        return this.param;
    }

    public final DlRequestForEligibilityRequest copy(String str, String str2) {
        l.f(str, "requestBody");
        l.f(str2, "param");
        return new DlRequestForEligibilityRequest(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DlRequestForEligibilityRequest)) {
            return false;
        }
        DlRequestForEligibilityRequest dlRequestForEligibilityRequest = (DlRequestForEligibilityRequest) obj;
        return l.a(this.requestBody, dlRequestForEligibilityRequest.requestBody) && l.a(this.param, dlRequestForEligibilityRequest.param);
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
        return "DlRequestForEligibilityRequest(requestBody=" + this.requestBody + ", param=" + this.param + ')';
    }
}
