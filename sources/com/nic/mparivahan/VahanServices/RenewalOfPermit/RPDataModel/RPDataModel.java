package com.nic.mparivahan.VahanServices.RenewalOfPermit.RPDataModel;

import androidx.annotation.Keep;
import cm.l;
import java.io.Serializable;

@Keep
public final class RPDataModel implements Serializable {
    private final ApiMessage apiMessage;
    private final Data data;

    public RPDataModel(ApiMessage apiMessage2, Data data2) {
        this.apiMessage = apiMessage2;
        this.data = data2;
    }

    public static /* synthetic */ RPDataModel copy$default(RPDataModel rPDataModel, ApiMessage apiMessage2, Data data2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            apiMessage2 = rPDataModel.apiMessage;
        }
        if ((i10 & 2) != 0) {
            data2 = rPDataModel.data;
        }
        return rPDataModel.copy(apiMessage2, data2);
    }

    public final ApiMessage component1() {
        return this.apiMessage;
    }

    public final Data component2() {
        return this.data;
    }

    public final RPDataModel copy(ApiMessage apiMessage2, Data data2) {
        return new RPDataModel(apiMessage2, data2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RPDataModel)) {
            return false;
        }
        RPDataModel rPDataModel = (RPDataModel) obj;
        return l.a(this.apiMessage, rPDataModel.apiMessage) && l.a(this.data, rPDataModel.data);
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
        return "RPDataModel(apiMessage=" + this.apiMessage + ", data=" + this.data + ')';
    }
}
