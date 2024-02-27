package com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.TOBuyer.TOBuyerApplication.TOBuyerSaveToDraftAAdhar.TOSaveToDraftModelAadhar;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class TOSaveToDraftBuyerAadharResponse {
    private final ApiMessage apiMessage;
    private final Data data;

    public TOSaveToDraftBuyerAadharResponse(ApiMessage apiMessage2, Data data2) {
        this.apiMessage = apiMessage2;
        this.data = data2;
    }

    public static /* synthetic */ TOSaveToDraftBuyerAadharResponse copy$default(TOSaveToDraftBuyerAadharResponse tOSaveToDraftBuyerAadharResponse, ApiMessage apiMessage2, Data data2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            apiMessage2 = tOSaveToDraftBuyerAadharResponse.apiMessage;
        }
        if ((i10 & 2) != 0) {
            data2 = tOSaveToDraftBuyerAadharResponse.data;
        }
        return tOSaveToDraftBuyerAadharResponse.copy(apiMessage2, data2);
    }

    public final ApiMessage component1() {
        return this.apiMessage;
    }

    public final Data component2() {
        return this.data;
    }

    public final TOSaveToDraftBuyerAadharResponse copy(ApiMessage apiMessage2, Data data2) {
        return new TOSaveToDraftBuyerAadharResponse(apiMessage2, data2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TOSaveToDraftBuyerAadharResponse)) {
            return false;
        }
        TOSaveToDraftBuyerAadharResponse tOSaveToDraftBuyerAadharResponse = (TOSaveToDraftBuyerAadharResponse) obj;
        return l.a(this.apiMessage, tOSaveToDraftBuyerAadharResponse.apiMessage) && l.a(this.data, tOSaveToDraftBuyerAadharResponse.data);
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
        return "TOSaveToDraftBuyerAadharResponse(apiMessage=" + this.apiMessage + ", data=" + this.data + ')';
    }
}
