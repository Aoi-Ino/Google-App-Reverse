package com.nic.mparivahan.dlservices.ui.dms;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;

@Keep
public final class GetDocProofRequest {
    @c("docCode")
    private final String docCode;
    @c("stateCode")
    private final String stateCode;

    public GetDocProofRequest() {
        this((String) null, (String) null, 3, (g) null);
    }

    public static /* synthetic */ GetDocProofRequest copy$default(GetDocProofRequest getDocProofRequest, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = getDocProofRequest.docCode;
        }
        if ((i10 & 2) != 0) {
            str2 = getDocProofRequest.stateCode;
        }
        return getDocProofRequest.copy(str, str2);
    }

    public final String component1() {
        return this.docCode;
    }

    public final String component2() {
        return this.stateCode;
    }

    public final GetDocProofRequest copy(String str, String str2) {
        return new GetDocProofRequest(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetDocProofRequest)) {
            return false;
        }
        GetDocProofRequest getDocProofRequest = (GetDocProofRequest) obj;
        return l.a(this.docCode, getDocProofRequest.docCode) && l.a(this.stateCode, getDocProofRequest.stateCode);
    }

    public final String getDocCode() {
        return this.docCode;
    }

    public final String getStateCode() {
        return this.stateCode;
    }

    public int hashCode() {
        String str = this.docCode;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.stateCode;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        return "GetDocProofRequest(docCode=" + this.docCode + ", stateCode=" + this.stateCode + ')';
    }

    public GetDocProofRequest(String str, String str2) {
        this.docCode = str;
        this.stateCode = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GetDocProofRequest(String str, String str2, int i10, g gVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2);
    }
}
