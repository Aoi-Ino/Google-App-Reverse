package com.nic.mparivahan.DLServicesAuth.Wrapper.EkycResponse;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class EkycVerifyResponse {
    private final ApiMessage apiMessage;
    private final Data data;

    public EkycVerifyResponse(ApiMessage apiMessage2, Data data2) {
        this.apiMessage = apiMessage2;
        this.data = data2;
    }

    public static /* synthetic */ EkycVerifyResponse copy$default(EkycVerifyResponse ekycVerifyResponse, ApiMessage apiMessage2, Data data2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            apiMessage2 = ekycVerifyResponse.apiMessage;
        }
        if ((i10 & 2) != 0) {
            data2 = ekycVerifyResponse.data;
        }
        return ekycVerifyResponse.copy(apiMessage2, data2);
    }

    public final ApiMessage component1() {
        return this.apiMessage;
    }

    public final Data component2() {
        return this.data;
    }

    public final EkycVerifyResponse copy(ApiMessage apiMessage2, Data data2) {
        return new EkycVerifyResponse(apiMessage2, data2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EkycVerifyResponse)) {
            return false;
        }
        EkycVerifyResponse ekycVerifyResponse = (EkycVerifyResponse) obj;
        return l.a(this.apiMessage, ekycVerifyResponse.apiMessage) && l.a(this.data, ekycVerifyResponse.data);
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
        return "EkycVerifyResponse(apiMessage=" + this.apiMessage + ", data=" + this.data + ')';
    }
}
