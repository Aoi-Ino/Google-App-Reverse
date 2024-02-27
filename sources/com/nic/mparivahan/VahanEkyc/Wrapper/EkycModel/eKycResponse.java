package com.nic.mparivahan.VahanEkyc.Wrapper.EkycModel;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class eKycResponse {
    private final ApiMessage apiMessage;
    private final Data data;

    public eKycResponse(ApiMessage apiMessage2, Data data2) {
        this.apiMessage = apiMessage2;
        this.data = data2;
    }

    public static /* synthetic */ eKycResponse copy$default(eKycResponse ekycresponse, ApiMessage apiMessage2, Data data2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            apiMessage2 = ekycresponse.apiMessage;
        }
        if ((i10 & 2) != 0) {
            data2 = ekycresponse.data;
        }
        return ekycresponse.copy(apiMessage2, data2);
    }

    public final ApiMessage component1() {
        return this.apiMessage;
    }

    public final Data component2() {
        return this.data;
    }

    public final eKycResponse copy(ApiMessage apiMessage2, Data data2) {
        return new eKycResponse(apiMessage2, data2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eKycResponse)) {
            return false;
        }
        eKycResponse ekycresponse = (eKycResponse) obj;
        return l.a(this.apiMessage, ekycresponse.apiMessage) && l.a(this.data, ekycresponse.data);
    }

    public final ApiMessage getApiMessage() {
        return this.apiMessage;
    }

    public final Data getData() {
        return this.data;
    }

    public int hashCode() {
        ApiMessage apiMessage2 = this.apiMessage;
        int i10 = 0;
        int hashCode = (apiMessage2 == null ? 0 : apiMessage2.hashCode()) * 31;
        Data data2 = this.data;
        if (data2 != null) {
            i10 = data2.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        return "eKycResponse(apiMessage=" + this.apiMessage + ", data=" + this.data + ')';
    }
}
