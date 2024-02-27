package com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class SellerResponse {
    private final ApiMessage apiMessage;
    private final Data data;

    public SellerResponse(ApiMessage apiMessage2, Data data2) {
        this.apiMessage = apiMessage2;
        this.data = data2;
    }

    public static /* synthetic */ SellerResponse copy$default(SellerResponse sellerResponse, ApiMessage apiMessage2, Data data2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            apiMessage2 = sellerResponse.apiMessage;
        }
        if ((i10 & 2) != 0) {
            data2 = sellerResponse.data;
        }
        return sellerResponse.copy(apiMessage2, data2);
    }

    public final ApiMessage component1() {
        return this.apiMessage;
    }

    public final Data component2() {
        return this.data;
    }

    public final SellerResponse copy(ApiMessage apiMessage2, Data data2) {
        return new SellerResponse(apiMessage2, data2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SellerResponse)) {
            return false;
        }
        SellerResponse sellerResponse = (SellerResponse) obj;
        return l.a(this.apiMessage, sellerResponse.apiMessage) && l.a(this.data, sellerResponse.data);
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
        return "SellerResponse(apiMessage=" + this.apiMessage + ", data=" + this.data + ')';
    }
}
