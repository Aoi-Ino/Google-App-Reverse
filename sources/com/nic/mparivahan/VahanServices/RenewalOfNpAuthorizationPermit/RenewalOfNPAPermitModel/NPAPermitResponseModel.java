package com.nic.mparivahan.VahanServices.RenewalOfNpAuthorizationPermit.RenewalOfNPAPermitModel;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class NPAPermitResponseModel {
    private final ApiMessage apiMessage;
    private final Data data;

    public NPAPermitResponseModel(ApiMessage apiMessage2, Data data2) {
        l.f(apiMessage2, "apiMessage");
        l.f(data2, "data");
        this.apiMessage = apiMessage2;
        this.data = data2;
    }

    public static /* synthetic */ NPAPermitResponseModel copy$default(NPAPermitResponseModel nPAPermitResponseModel, ApiMessage apiMessage2, Data data2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            apiMessage2 = nPAPermitResponseModel.apiMessage;
        }
        if ((i10 & 2) != 0) {
            data2 = nPAPermitResponseModel.data;
        }
        return nPAPermitResponseModel.copy(apiMessage2, data2);
    }

    public final ApiMessage component1() {
        return this.apiMessage;
    }

    public final Data component2() {
        return this.data;
    }

    public final NPAPermitResponseModel copy(ApiMessage apiMessage2, Data data2) {
        l.f(apiMessage2, "apiMessage");
        l.f(data2, "data");
        return new NPAPermitResponseModel(apiMessage2, data2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NPAPermitResponseModel)) {
            return false;
        }
        NPAPermitResponseModel nPAPermitResponseModel = (NPAPermitResponseModel) obj;
        return l.a(this.apiMessage, nPAPermitResponseModel.apiMessage) && l.a(this.data, nPAPermitResponseModel.data);
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
        return "NPAPermitResponseModel(apiMessage=" + this.apiMessage + ", data=" + this.data + ')';
    }
}
