package com.nic.mparivahan.VahanServices.eSign.ModelEsign;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class esignModel {
    private final ApiMessage apiMessage;
    private final String data;

    public esignModel(ApiMessage apiMessage2, String str) {
        l.f(apiMessage2, "apiMessage");
        l.f(str, "data");
        this.apiMessage = apiMessage2;
        this.data = str;
    }

    public static /* synthetic */ esignModel copy$default(esignModel esignmodel, ApiMessage apiMessage2, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            apiMessage2 = esignmodel.apiMessage;
        }
        if ((i10 & 2) != 0) {
            str = esignmodel.data;
        }
        return esignmodel.copy(apiMessage2, str);
    }

    public final ApiMessage component1() {
        return this.apiMessage;
    }

    public final String component2() {
        return this.data;
    }

    public final esignModel copy(ApiMessage apiMessage2, String str) {
        l.f(apiMessage2, "apiMessage");
        l.f(str, "data");
        return new esignModel(apiMessage2, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof esignModel)) {
            return false;
        }
        esignModel esignmodel = (esignModel) obj;
        return l.a(this.apiMessage, esignmodel.apiMessage) && l.a(this.data, esignmodel.data);
    }

    public final ApiMessage getApiMessage() {
        return this.apiMessage;
    }

    public final String getData() {
        return this.data;
    }

    public int hashCode() {
        return (this.apiMessage.hashCode() * 31) + this.data.hashCode();
    }

    public String toString() {
        return "esignModel(apiMessage=" + this.apiMessage + ", data=" + this.data + ')';
    }
}
