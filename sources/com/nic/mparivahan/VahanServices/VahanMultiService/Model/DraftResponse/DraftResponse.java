package com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftResponse;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class DraftResponse {
    private final ApiMessage apiMessage;
    private final Data data;

    public DraftResponse(ApiMessage apiMessage2, Data data2) {
        this.apiMessage = apiMessage2;
        this.data = data2;
    }

    public static /* synthetic */ DraftResponse copy$default(DraftResponse draftResponse, ApiMessage apiMessage2, Data data2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            apiMessage2 = draftResponse.apiMessage;
        }
        if ((i10 & 2) != 0) {
            data2 = draftResponse.data;
        }
        return draftResponse.copy(apiMessage2, data2);
    }

    public final ApiMessage component1() {
        return this.apiMessage;
    }

    public final Data component2() {
        return this.data;
    }

    public final DraftResponse copy(ApiMessage apiMessage2, Data data2) {
        return new DraftResponse(apiMessage2, data2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DraftResponse)) {
            return false;
        }
        DraftResponse draftResponse = (DraftResponse) obj;
        return l.a(this.apiMessage, draftResponse.apiMessage) && l.a(this.data, draftResponse.data);
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
        return "DraftResponse(apiMessage=" + this.apiMessage + ", data=" + this.data + ')';
    }
}
