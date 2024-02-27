package com.nic.mparivahan.dlservices.data.model.duplicatedl;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class GetReasonsTransWiseRequest {
    private String transCode;

    public GetReasonsTransWiseRequest(String str) {
        this.transCode = str;
    }

    public static /* synthetic */ GetReasonsTransWiseRequest copy$default(GetReasonsTransWiseRequest getReasonsTransWiseRequest, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = getReasonsTransWiseRequest.transCode;
        }
        return getReasonsTransWiseRequest.copy(str);
    }

    public final String component1() {
        return this.transCode;
    }

    public final GetReasonsTransWiseRequest copy(String str) {
        return new GetReasonsTransWiseRequest(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetReasonsTransWiseRequest) && l.a(this.transCode, ((GetReasonsTransWiseRequest) obj).transCode);
    }

    public final String getTransCode() {
        return this.transCode;
    }

    public int hashCode() {
        String str = this.transCode;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final void setTransCode(String str) {
        this.transCode = str;
    }

    public String toString() {
        return "GetReasonsTransWiseRequest(transCode=" + this.transCode + ')';
    }
}
