package com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.TOPurposeData.TOPurposeResponseData;

import androidx.annotation.Keep;
import cm.l;
import java.util.ArrayList;

@Keep
public final class TOPurposeResponseData {
    private final ApiMessage apiMessage;
    private final ArrayList<Data> data;

    public TOPurposeResponseData(ApiMessage apiMessage2, ArrayList<Data> arrayList) {
        this.apiMessage = apiMessage2;
        this.data = arrayList;
    }

    public static /* synthetic */ TOPurposeResponseData copy$default(TOPurposeResponseData tOPurposeResponseData, ApiMessage apiMessage2, ArrayList<Data> arrayList, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            apiMessage2 = tOPurposeResponseData.apiMessage;
        }
        if ((i10 & 2) != 0) {
            arrayList = tOPurposeResponseData.data;
        }
        return tOPurposeResponseData.copy(apiMessage2, arrayList);
    }

    public final ApiMessage component1() {
        return this.apiMessage;
    }

    public final ArrayList<Data> component2() {
        return this.data;
    }

    public final TOPurposeResponseData copy(ApiMessage apiMessage2, ArrayList<Data> arrayList) {
        return new TOPurposeResponseData(apiMessage2, arrayList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TOPurposeResponseData)) {
            return false;
        }
        TOPurposeResponseData tOPurposeResponseData = (TOPurposeResponseData) obj;
        return l.a(this.apiMessage, tOPurposeResponseData.apiMessage) && l.a(this.data, tOPurposeResponseData.data);
    }

    public final ApiMessage getApiMessage() {
        return this.apiMessage;
    }

    public final ArrayList<Data> getData() {
        return this.data;
    }

    public int hashCode() {
        ApiMessage apiMessage2 = this.apiMessage;
        int i10 = 0;
        int hashCode = (apiMessage2 == null ? 0 : apiMessage2.hashCode()) * 31;
        ArrayList<Data> arrayList = this.data;
        if (arrayList != null) {
            i10 = arrayList.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        return "TOPurposeResponseData(apiMessage=" + this.apiMessage + ", data=" + this.data + ')';
    }
}
