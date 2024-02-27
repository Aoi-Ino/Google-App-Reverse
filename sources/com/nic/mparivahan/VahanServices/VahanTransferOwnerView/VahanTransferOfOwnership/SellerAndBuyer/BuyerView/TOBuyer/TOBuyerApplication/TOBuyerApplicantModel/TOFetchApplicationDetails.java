package com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.TOBuyerApplication.TOBuyerApplicantModel;

import androidx.annotation.Keep;
import cm.l;
import java.io.Serializable;

@Keep
public final class TOFetchApplicationDetails implements Serializable {
    private final ApiMessageX apiMessage;
    private final DataX data;

    public TOFetchApplicationDetails(ApiMessageX apiMessageX, DataX dataX) {
        this.apiMessage = apiMessageX;
        this.data = dataX;
    }

    public static /* synthetic */ TOFetchApplicationDetails copy$default(TOFetchApplicationDetails tOFetchApplicationDetails, ApiMessageX apiMessageX, DataX dataX, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            apiMessageX = tOFetchApplicationDetails.apiMessage;
        }
        if ((i10 & 2) != 0) {
            dataX = tOFetchApplicationDetails.data;
        }
        return tOFetchApplicationDetails.copy(apiMessageX, dataX);
    }

    public final ApiMessageX component1() {
        return this.apiMessage;
    }

    public final DataX component2() {
        return this.data;
    }

    public final TOFetchApplicationDetails copy(ApiMessageX apiMessageX, DataX dataX) {
        return new TOFetchApplicationDetails(apiMessageX, dataX);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TOFetchApplicationDetails)) {
            return false;
        }
        TOFetchApplicationDetails tOFetchApplicationDetails = (TOFetchApplicationDetails) obj;
        return l.a(this.apiMessage, tOFetchApplicationDetails.apiMessage) && l.a(this.data, tOFetchApplicationDetails.data);
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
        return "TOFetchApplicationDetails(apiMessage=" + this.apiMessage + ", data=" + this.data + ')';
    }
}
