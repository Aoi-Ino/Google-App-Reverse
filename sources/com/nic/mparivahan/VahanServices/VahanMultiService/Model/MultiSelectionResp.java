package com.nic.mparivahan.VahanServices.VahanMultiService.Model;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class MultiSelectionResp {
    private final ApiMessage apiMessage;
    private final Object data;

    public MultiSelectionResp(ApiMessage apiMessage2, Object obj) {
        this.apiMessage = apiMessage2;
        this.data = obj;
    }

    public static /* synthetic */ MultiSelectionResp copy$default(MultiSelectionResp multiSelectionResp, ApiMessage apiMessage2, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            apiMessage2 = multiSelectionResp.apiMessage;
        }
        if ((i10 & 2) != 0) {
            obj = multiSelectionResp.data;
        }
        return multiSelectionResp.copy(apiMessage2, obj);
    }

    public final ApiMessage component1() {
        return this.apiMessage;
    }

    public final Object component2() {
        return this.data;
    }

    public final MultiSelectionResp copy(ApiMessage apiMessage2, Object obj) {
        return new MultiSelectionResp(apiMessage2, obj);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MultiSelectionResp)) {
            return false;
        }
        MultiSelectionResp multiSelectionResp = (MultiSelectionResp) obj;
        return l.a(this.apiMessage, multiSelectionResp.apiMessage) && l.a(this.data, multiSelectionResp.data);
    }

    public final ApiMessage getApiMessage() {
        return this.apiMessage;
    }

    public final Object getData() {
        return this.data;
    }

    public int hashCode() {
        ApiMessage apiMessage2 = this.apiMessage;
        int i10 = 0;
        int hashCode = (apiMessage2 == null ? 0 : apiMessage2.hashCode()) * 31;
        Object obj = this.data;
        if (obj != null) {
            i10 = obj.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        return "MultiSelectionResp(apiMessage=" + this.apiMessage + ", data=" + this.data + ')';
    }
}
