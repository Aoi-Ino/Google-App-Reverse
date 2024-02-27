package com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.ErrorRes;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class ErrorResponse {
    private final ApiMessage apiMessage;
    private final Data data;

    public ErrorResponse(ApiMessage apiMessage2, Data data2) {
        this.apiMessage = apiMessage2;
        this.data = data2;
    }

    public static /* synthetic */ ErrorResponse copy$default(ErrorResponse errorResponse, ApiMessage apiMessage2, Data data2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            apiMessage2 = errorResponse.apiMessage;
        }
        if ((i10 & 2) != 0) {
            data2 = errorResponse.data;
        }
        return errorResponse.copy(apiMessage2, data2);
    }

    public final ApiMessage component1() {
        return this.apiMessage;
    }

    public final Data component2() {
        return this.data;
    }

    public final ErrorResponse copy(ApiMessage apiMessage2, Data data2) {
        return new ErrorResponse(apiMessage2, data2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ErrorResponse)) {
            return false;
        }
        ErrorResponse errorResponse = (ErrorResponse) obj;
        return l.a(this.apiMessage, errorResponse.apiMessage) && l.a(this.data, errorResponse.data);
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
        return "ErrorResponse(apiMessage=" + this.apiMessage + ", data=" + this.data + ')';
    }
}
