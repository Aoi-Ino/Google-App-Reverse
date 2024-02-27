package com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel;

import androidx.annotation.Keep;
import cm.l;
import java.io.Serializable;

@Keep
public final class TempDetailsModel implements Serializable {
    private final ApiMessage apiMessage;
    private final Data data;

    public TempDetailsModel(ApiMessage apiMessage2, Data data2) {
        this.apiMessage = apiMessage2;
        this.data = data2;
    }

    public static /* synthetic */ TempDetailsModel copy$default(TempDetailsModel tempDetailsModel, ApiMessage apiMessage2, Data data2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            apiMessage2 = tempDetailsModel.apiMessage;
        }
        if ((i10 & 2) != 0) {
            data2 = tempDetailsModel.data;
        }
        return tempDetailsModel.copy(apiMessage2, data2);
    }

    public final ApiMessage component1() {
        return this.apiMessage;
    }

    public final Data component2() {
        return this.data;
    }

    public final TempDetailsModel copy(ApiMessage apiMessage2, Data data2) {
        return new TempDetailsModel(apiMessage2, data2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TempDetailsModel)) {
            return false;
        }
        TempDetailsModel tempDetailsModel = (TempDetailsModel) obj;
        return l.a(this.apiMessage, tempDetailsModel.apiMessage) && l.a(this.data, tempDetailsModel.data);
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
        return "TempDetailsModel(apiMessage=" + this.apiMessage + ", data=" + this.data + ')';
    }
}
