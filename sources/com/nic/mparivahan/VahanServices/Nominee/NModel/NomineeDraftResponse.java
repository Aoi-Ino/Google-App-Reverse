package com.nic.mparivahan.VahanServices.Nominee.NModel;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class NomineeDraftResponse {
    private final ApiMessageX apiMessage;
    private final DataX data;

    public NomineeDraftResponse(ApiMessageX apiMessageX, DataX dataX) {
        this.apiMessage = apiMessageX;
        this.data = dataX;
    }

    public static /* synthetic */ NomineeDraftResponse copy$default(NomineeDraftResponse nomineeDraftResponse, ApiMessageX apiMessageX, DataX dataX, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            apiMessageX = nomineeDraftResponse.apiMessage;
        }
        if ((i10 & 2) != 0) {
            dataX = nomineeDraftResponse.data;
        }
        return nomineeDraftResponse.copy(apiMessageX, dataX);
    }

    public final ApiMessageX component1() {
        return this.apiMessage;
    }

    public final DataX component2() {
        return this.data;
    }

    public final NomineeDraftResponse copy(ApiMessageX apiMessageX, DataX dataX) {
        return new NomineeDraftResponse(apiMessageX, dataX);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NomineeDraftResponse)) {
            return false;
        }
        NomineeDraftResponse nomineeDraftResponse = (NomineeDraftResponse) obj;
        return l.a(this.apiMessage, nomineeDraftResponse.apiMessage) && l.a(this.data, nomineeDraftResponse.data);
    }

    public final ApiMessageX getApiMessage() {
        return this.apiMessage;
    }

    public final DataX getData() {
        return this.data;
    }

    public int hashCode() {
        ApiMessageX apiMessageX = this.apiMessage;
        int i10 = 0;
        int hashCode = (apiMessageX == null ? 0 : apiMessageX.hashCode()) * 31;
        DataX dataX = this.data;
        if (dataX != null) {
            i10 = dataX.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        return "NomineeDraftResponse(apiMessage=" + this.apiMessage + ", data=" + this.data + ')';
    }
}
