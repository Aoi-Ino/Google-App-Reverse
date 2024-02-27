package com.nic.mparivahan.VahanServices.RenewalOfPermit.RPSaveToDraftModel;

import androidx.annotation.Keep;
import cm.l;
import java.io.Serializable;

@Keep
public final class RPSaveToDraftResponse implements Serializable {
    private final ApiMessage apiMessage;
    private final Data data;

    public RPSaveToDraftResponse(ApiMessage apiMessage2, Data data2) {
        l.f(apiMessage2, "apiMessage");
        l.f(data2, "data");
        this.apiMessage = apiMessage2;
        this.data = data2;
    }

    public static /* synthetic */ RPSaveToDraftResponse copy$default(RPSaveToDraftResponse rPSaveToDraftResponse, ApiMessage apiMessage2, Data data2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            apiMessage2 = rPSaveToDraftResponse.apiMessage;
        }
        if ((i10 & 2) != 0) {
            data2 = rPSaveToDraftResponse.data;
        }
        return rPSaveToDraftResponse.copy(apiMessage2, data2);
    }

    public final ApiMessage component1() {
        return this.apiMessage;
    }

    public final Data component2() {
        return this.data;
    }

    public final RPSaveToDraftResponse copy(ApiMessage apiMessage2, Data data2) {
        l.f(apiMessage2, "apiMessage");
        l.f(data2, "data");
        return new RPSaveToDraftResponse(apiMessage2, data2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RPSaveToDraftResponse)) {
            return false;
        }
        RPSaveToDraftResponse rPSaveToDraftResponse = (RPSaveToDraftResponse) obj;
        return l.a(this.apiMessage, rPSaveToDraftResponse.apiMessage) && l.a(this.data, rPSaveToDraftResponse.data);
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
        return "RPSaveToDraftResponse(apiMessage=" + this.apiMessage + ", data=" + this.data + ')';
    }
}
