package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class NocDownload {
    private final ApiMessage apiMessage;
    private final String data;

    public NocDownload(ApiMessage apiMessage2, String str) {
        this.apiMessage = apiMessage2;
        this.data = str;
    }

    public static /* synthetic */ NocDownload copy$default(NocDownload nocDownload, ApiMessage apiMessage2, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            apiMessage2 = nocDownload.apiMessage;
        }
        if ((i10 & 2) != 0) {
            str = nocDownload.data;
        }
        return nocDownload.copy(apiMessage2, str);
    }

    public final ApiMessage component1() {
        return this.apiMessage;
    }

    public final String component2() {
        return this.data;
    }

    public final NocDownload copy(ApiMessage apiMessage2, String str) {
        return new NocDownload(apiMessage2, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NocDownload)) {
            return false;
        }
        NocDownload nocDownload = (NocDownload) obj;
        return l.a(this.apiMessage, nocDownload.apiMessage) && l.a(this.data, nocDownload.data);
    }

    public final ApiMessage getApiMessage() {
        return this.apiMessage;
    }

    public final String getData() {
        return this.data;
    }

    public int hashCode() {
        ApiMessage apiMessage2 = this.apiMessage;
        int i10 = 0;
        int hashCode = (apiMessage2 == null ? 0 : apiMessage2.hashCode()) * 31;
        String str = this.data;
        if (str != null) {
            i10 = str.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        return "NocDownload(apiMessage=" + this.apiMessage + ", data=" + this.data + ')';
    }
}
