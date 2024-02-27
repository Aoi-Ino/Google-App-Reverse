package com.nic.mparivahan.dlservices.data.model;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class DlStatusResponse {
    private final String param;
    private final String responseBody;

    public DlStatusResponse(String str, String str2) {
        this.responseBody = str;
        this.param = str2;
    }

    public static /* synthetic */ DlStatusResponse copy$default(DlStatusResponse dlStatusResponse, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = dlStatusResponse.responseBody;
        }
        if ((i10 & 2) != 0) {
            str2 = dlStatusResponse.param;
        }
        return dlStatusResponse.copy(str, str2);
    }

    public final String component1() {
        return this.responseBody;
    }

    public final String component2() {
        return this.param;
    }

    public final DlStatusResponse copy(String str, String str2) {
        return new DlStatusResponse(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DlStatusResponse)) {
            return false;
        }
        DlStatusResponse dlStatusResponse = (DlStatusResponse) obj;
        return l.a(this.responseBody, dlStatusResponse.responseBody) && l.a(this.param, dlStatusResponse.param);
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
        return "DlStatusResponse(responseBody=" + this.responseBody + ", param=" + this.param + ')';
    }
}
