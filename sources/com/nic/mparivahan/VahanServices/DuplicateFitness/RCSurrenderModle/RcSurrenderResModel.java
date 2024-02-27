package com.nic.mparivahan.VahanServices.DuplicateFitness.RCSurrenderModle;

import androidx.annotation.Keep;
import cm.l;
import java.io.Serializable;

@Keep
public final class RcSurrenderResModel implements Serializable {
    private final ApiMessage apiMessage;
    private final Data data;

    public RcSurrenderResModel(ApiMessage apiMessage2, Data data2) {
        l.f(apiMessage2, "apiMessage");
        l.f(data2, "data");
        this.apiMessage = apiMessage2;
        this.data = data2;
    }

    public static /* synthetic */ RcSurrenderResModel copy$default(RcSurrenderResModel rcSurrenderResModel, ApiMessage apiMessage2, Data data2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            apiMessage2 = rcSurrenderResModel.apiMessage;
        }
        if ((i10 & 2) != 0) {
            data2 = rcSurrenderResModel.data;
        }
        return rcSurrenderResModel.copy(apiMessage2, data2);
    }

    public final ApiMessage component1() {
        return this.apiMessage;
    }

    public final Data component2() {
        return this.data;
    }

    public final RcSurrenderResModel copy(ApiMessage apiMessage2, Data data2) {
        l.f(apiMessage2, "apiMessage");
        l.f(data2, "data");
        return new RcSurrenderResModel(apiMessage2, data2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RcSurrenderResModel)) {
            return false;
        }
        RcSurrenderResModel rcSurrenderResModel = (RcSurrenderResModel) obj;
        return l.a(this.apiMessage, rcSurrenderResModel.apiMessage) && l.a(this.data, rcSurrenderResModel.data);
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
        return "RcSurrenderResModel(apiMessage=" + this.apiMessage + ", data=" + this.data + ')';
    }
}
