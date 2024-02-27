package com.nic.mparivahan.VahanServices.DuplicateFitness.RCReleaseModel;

import androidx.annotation.Keep;
import cm.l;
import java.io.Serializable;

@Keep
public final class RCReleaseResponse implements Serializable {
    private final ApiMessage apiMessage;
    private final Data data;

    public RCReleaseResponse(ApiMessage apiMessage2, Data data2) {
        this.apiMessage = apiMessage2;
        this.data = data2;
    }

    public static /* synthetic */ RCReleaseResponse copy$default(RCReleaseResponse rCReleaseResponse, ApiMessage apiMessage2, Data data2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            apiMessage2 = rCReleaseResponse.apiMessage;
        }
        if ((i10 & 2) != 0) {
            data2 = rCReleaseResponse.data;
        }
        return rCReleaseResponse.copy(apiMessage2, data2);
    }

    public final ApiMessage component1() {
        return this.apiMessage;
    }

    public final Data component2() {
        return this.data;
    }

    public final RCReleaseResponse copy(ApiMessage apiMessage2, Data data2) {
        return new RCReleaseResponse(apiMessage2, data2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RCReleaseResponse)) {
            return false;
        }
        RCReleaseResponse rCReleaseResponse = (RCReleaseResponse) obj;
        return l.a(this.apiMessage, rCReleaseResponse.apiMessage) && l.a(this.data, rCReleaseResponse.data);
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
        return "RCReleaseResponse(apiMessage=" + this.apiMessage + ", data=" + this.data + ')';
    }
}
