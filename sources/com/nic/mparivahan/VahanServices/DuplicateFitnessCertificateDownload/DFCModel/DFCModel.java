package com.nic.mparivahan.VahanServices.DuplicateFitnessCertificateDownload.DFCModel;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class DFCModel {
    private final ApiMessage apiMessage;
    private final String data;

    public DFCModel(ApiMessage apiMessage2, String str) {
        l.f(apiMessage2, "apiMessage");
        l.f(str, "data");
        this.apiMessage = apiMessage2;
        this.data = str;
    }

    public static /* synthetic */ DFCModel copy$default(DFCModel dFCModel, ApiMessage apiMessage2, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            apiMessage2 = dFCModel.apiMessage;
        }
        if ((i10 & 2) != 0) {
            str = dFCModel.data;
        }
        return dFCModel.copy(apiMessage2, str);
    }

    public final ApiMessage component1() {
        return this.apiMessage;
    }

    public final String component2() {
        return this.data;
    }

    public final DFCModel copy(ApiMessage apiMessage2, String str) {
        l.f(apiMessage2, "apiMessage");
        l.f(str, "data");
        return new DFCModel(apiMessage2, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DFCModel)) {
            return false;
        }
        DFCModel dFCModel = (DFCModel) obj;
        return l.a(this.apiMessage, dFCModel.apiMessage) && l.a(this.data, dFCModel.data);
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
        return "DFCModel(apiMessage=" + this.apiMessage + ", data=" + this.data + ')';
    }
}
