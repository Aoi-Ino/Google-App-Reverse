package com.nic.mparivahan.dlservices.data.model;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class DlRto {
    private String param;
    private String requestBody;

    public DlRto(String str, String str2) {
        this.requestBody = str;
        this.param = str2;
    }

    public static /* synthetic */ DlRto copy$default(DlRto dlRto, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = dlRto.requestBody;
        }
        if ((i10 & 2) != 0) {
            str2 = dlRto.param;
        }
        return dlRto.copy(str, str2);
    }

    public final String component1() {
        return this.requestBody;
    }

    public final String component2() {
        return this.param;
    }

    public final DlRto copy(String str, String str2) {
        return new DlRto(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DlRto)) {
            return false;
        }
        DlRto dlRto = (DlRto) obj;
        return l.a(this.requestBody, dlRto.requestBody) && l.a(this.param, dlRto.param);
    }

    public final String getParam() {
        return this.param;
    }

    public final String getRequestBody() {
        return this.requestBody;
    }

    public int hashCode() {
        String str = this.requestBody;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.param;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return hashCode + i10;
    }

    public final void setParam(String str) {
        this.param = str;
    }

    public final void setRequestBody(String str) {
        this.requestBody = str;
    }

    public String toString() {
        return "DlRto(requestBody=" + this.requestBody + ", param=" + this.param + ')';
    }
}
