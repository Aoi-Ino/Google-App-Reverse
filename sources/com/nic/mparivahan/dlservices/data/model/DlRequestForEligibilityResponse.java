package com.nic.mparivahan.dlservices.data.model;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class DlRequestForEligibilityResponse {
    private final String param;
    private final String responseBody;

    public DlRequestForEligibilityResponse(String str, String str2) {
        this.responseBody = str;
        this.param = str2;
    }

    public static /* synthetic */ DlRequestForEligibilityResponse copy$default(DlRequestForEligibilityResponse dlRequestForEligibilityResponse, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = dlRequestForEligibilityResponse.responseBody;
        }
        if ((i10 & 2) != 0) {
            str2 = dlRequestForEligibilityResponse.param;
        }
        return dlRequestForEligibilityResponse.copy(str, str2);
    }

    public final String component1() {
        return this.responseBody;
    }

    public final String component2() {
        return this.param;
    }

    public final DlRequestForEligibilityResponse copy(String str, String str2) {
        return new DlRequestForEligibilityResponse(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DlRequestForEligibilityResponse)) {
            return false;
        }
        DlRequestForEligibilityResponse dlRequestForEligibilityResponse = (DlRequestForEligibilityResponse) obj;
        return l.a(this.responseBody, dlRequestForEligibilityResponse.responseBody) && l.a(this.param, dlRequestForEligibilityResponse.param);
    }

    public final String getParam() {
        return this.param;
    }

    public final String getResponseBody() {
        return this.responseBody;
    }

    public int hashCode() {
        String str = this.responseBody;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.param;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        return "DlRequestForEligibilityResponse(responseBody=" + this.responseBody + ", param=" + this.param + ')';
    }
}
