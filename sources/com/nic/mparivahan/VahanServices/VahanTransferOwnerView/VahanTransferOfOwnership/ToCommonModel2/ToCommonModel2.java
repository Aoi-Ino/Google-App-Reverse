package com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.ToCommonModel2;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class ToCommonModel2 {
    private final ApiMessage apiMessage;
    private final Data data;

    public ToCommonModel2(ApiMessage apiMessage2, Data data2) {
        l.f(apiMessage2, "apiMessage");
        l.f(data2, "data");
        this.apiMessage = apiMessage2;
        this.data = data2;
    }

    public static /* synthetic */ ToCommonModel2 copy$default(ToCommonModel2 toCommonModel2, ApiMessage apiMessage2, Data data2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            apiMessage2 = toCommonModel2.apiMessage;
        }
        if ((i10 & 2) != 0) {
            data2 = toCommonModel2.data;
        }
        return toCommonModel2.copy(apiMessage2, data2);
    }

    public final ApiMessage component1() {
        return this.apiMessage;
    }

    public final Data component2() {
        return this.data;
    }

    public final ToCommonModel2 copy(ApiMessage apiMessage2, Data data2) {
        l.f(apiMessage2, "apiMessage");
        l.f(data2, "data");
        return new ToCommonModel2(apiMessage2, data2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ToCommonModel2)) {
            return false;
        }
        ToCommonModel2 toCommonModel2 = (ToCommonModel2) obj;
        return l.a(this.apiMessage, toCommonModel2.apiMessage) && l.a(this.data, toCommonModel2.data);
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
        return "ToCommonModel2(apiMessage=" + this.apiMessage + ", data=" + this.data + ')';
    }
}
