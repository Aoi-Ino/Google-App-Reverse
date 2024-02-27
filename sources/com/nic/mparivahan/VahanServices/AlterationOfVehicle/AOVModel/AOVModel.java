package com.nic.mparivahan.VahanServices.AlterationOfVehicle.AOVModel;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class AOVModel {
    private final ApiMessage apiMessage;
    private final Data data;

    public AOVModel(ApiMessage apiMessage2, Data data2) {
        l.f(apiMessage2, "apiMessage");
        l.f(data2, "data");
        this.apiMessage = apiMessage2;
        this.data = data2;
    }

    public static /* synthetic */ AOVModel copy$default(AOVModel aOVModel, ApiMessage apiMessage2, Data data2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            apiMessage2 = aOVModel.apiMessage;
        }
        if ((i10 & 2) != 0) {
            data2 = aOVModel.data;
        }
        return aOVModel.copy(apiMessage2, data2);
    }

    public final ApiMessage component1() {
        return this.apiMessage;
    }

    public final Data component2() {
        return this.data;
    }

    public final AOVModel copy(ApiMessage apiMessage2, Data data2) {
        l.f(apiMessage2, "apiMessage");
        l.f(data2, "data");
        return new AOVModel(apiMessage2, data2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AOVModel)) {
            return false;
        }
        AOVModel aOVModel = (AOVModel) obj;
        return l.a(this.apiMessage, aOVModel.apiMessage) && l.a(this.data, aOVModel.data);
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
        return "AOVModel(apiMessage=" + this.apiMessage + ", data=" + this.data + ')';
    }
}
