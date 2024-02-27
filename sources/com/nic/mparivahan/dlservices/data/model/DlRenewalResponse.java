package com.nic.mparivahan.dlservices.data.model;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import java.io.Serializable;

@Keep
public final class DlRenewalResponse implements Serializable {
    private final Dlresponse dlresponse;
    private final String statusCode;
    private final String statusDesc;

    public DlRenewalResponse() {
        this((String) null, (String) null, (Dlresponse) null, 7, (g) null);
    }

    public static /* synthetic */ DlRenewalResponse copy$default(DlRenewalResponse dlRenewalResponse, String str, String str2, Dlresponse dlresponse2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = dlRenewalResponse.statusDesc;
        }
        if ((i10 & 2) != 0) {
            str2 = dlRenewalResponse.statusCode;
        }
        if ((i10 & 4) != 0) {
            dlresponse2 = dlRenewalResponse.dlresponse;
        }
        return dlRenewalResponse.copy(str, str2, dlresponse2);
    }

    public final String component1() {
        return this.statusDesc;
    }

    public final String component2() {
        return this.statusCode;
    }

    public final Dlresponse component3() {
        return this.dlresponse;
    }

    public final DlRenewalResponse copy(String str, String str2, Dlresponse dlresponse2) {
        return new DlRenewalResponse(str, str2, dlresponse2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DlRenewalResponse)) {
            return false;
        }
        DlRenewalResponse dlRenewalResponse = (DlRenewalResponse) obj;
        return l.a(this.statusDesc, dlRenewalResponse.statusDesc) && l.a(this.statusCode, dlRenewalResponse.statusCode) && l.a(this.dlresponse, dlRenewalResponse.dlresponse);
    }

    public final Dlresponse getDlresponse() {
        return this.dlresponse;
    }

    public final String getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public int hashCode() {
        String str = this.statusDesc;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.statusCode;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Dlresponse dlresponse2 = this.dlresponse;
        if (dlresponse2 != null) {
            i10 = dlresponse2.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        return "DlRenewalResponse(statusDesc=" + this.statusDesc + ", statusCode=" + this.statusCode + ", dlresponse=" + this.dlresponse + ')';
    }

    public DlRenewalResponse(String str, String str2, Dlresponse dlresponse2) {
        this.statusDesc = str;
        this.statusCode = str2;
        this.dlresponse = dlresponse2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DlRenewalResponse(String str, String str2, Dlresponse dlresponse2, int i10, g gVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : dlresponse2);
    }
}
