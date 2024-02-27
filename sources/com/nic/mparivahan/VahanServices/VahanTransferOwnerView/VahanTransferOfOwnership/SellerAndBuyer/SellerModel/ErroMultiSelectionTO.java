package com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel;

import androidx.annotation.Keep;
import cm.l;
import com.nic.mparivahan.VahanEkyc.Wrapper.EkycResponse.Data;
import com.nic.mparivahan.VahanServices.VahanMultiService.ErroModel.ApiMessage;

@Keep
public final class ErroMultiSelectionTO {
    private final ApiMessage apiMessage;
    private final Data data;

    public ErroMultiSelectionTO(ApiMessage apiMessage2, Data data2) {
        this.apiMessage = apiMessage2;
        this.data = data2;
    }

    public static /* synthetic */ ErroMultiSelectionTO copy$default(ErroMultiSelectionTO erroMultiSelectionTO, ApiMessage apiMessage2, Data data2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            apiMessage2 = erroMultiSelectionTO.apiMessage;
        }
        if ((i10 & 2) != 0) {
            data2 = erroMultiSelectionTO.data;
        }
        return erroMultiSelectionTO.copy(apiMessage2, data2);
    }

    public final ApiMessage component1() {
        return this.apiMessage;
    }

    public final Data component2() {
        return this.data;
    }

    public final ErroMultiSelectionTO copy(ApiMessage apiMessage2, Data data2) {
        return new ErroMultiSelectionTO(apiMessage2, data2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ErroMultiSelectionTO)) {
            return false;
        }
        ErroMultiSelectionTO erroMultiSelectionTO = (ErroMultiSelectionTO) obj;
        return l.a(this.apiMessage, erroMultiSelectionTO.apiMessage) && l.a(this.data, erroMultiSelectionTO.data);
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
        return "ErroMultiSelectionTO(apiMessage=" + this.apiMessage + ", data=" + this.data + ')';
    }
}
