package com.nic.mparivahan.VahanServices.DuplicateFitness.RcCancalltionModle;

import androidx.annotation.Keep;
import cm.l;
import java.io.Serializable;

@Keep
public final class RCCancellationResponse implements Serializable {
    private final ApiMessage apiMessage;
    private final Data data;

    public RCCancellationResponse(ApiMessage apiMessage2, Data data2) {
        l.f(apiMessage2, "apiMessage");
        l.f(data2, "data");
        this.apiMessage = apiMessage2;
        this.data = data2;
    }

    public static /* synthetic */ RCCancellationResponse copy$default(RCCancellationResponse rCCancellationResponse, ApiMessage apiMessage2, Data data2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            apiMessage2 = rCCancellationResponse.apiMessage;
        }
        if ((i10 & 2) != 0) {
            data2 = rCCancellationResponse.data;
        }
        return rCCancellationResponse.copy(apiMessage2, data2);
    }

    public final ApiMessage component1() {
        return this.apiMessage;
    }

    public final Data component2() {
        return this.data;
    }

    public final RCCancellationResponse copy(ApiMessage apiMessage2, Data data2) {
        l.f(apiMessage2, "apiMessage");
        l.f(data2, "data");
        return new RCCancellationResponse(apiMessage2, data2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RCCancellationResponse)) {
            return false;
        }
        RCCancellationResponse rCCancellationResponse = (RCCancellationResponse) obj;
        return l.a(this.apiMessage, rCCancellationResponse.apiMessage) && l.a(this.data, rCCancellationResponse.data);
    }

    public final ApiMessage getApiMessage() {
        return this.apiMessage;
    }

    public final Data getData() {
        return this.data;
    }

    public int hashCode() {
        return (this.apiMessage.hashCode() * 31) + this.data.hashCode();
    }

    public String toString() {
        return "RCCancellationResponse(apiMessage=" + this.apiMessage + ", data=" + this.data + ')';
    }
}
