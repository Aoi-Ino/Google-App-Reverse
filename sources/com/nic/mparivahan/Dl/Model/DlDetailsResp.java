package com.nic.mparivahan.Dl.Model;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class DlDetailsResp {
    private final Dlresponse dlresponse;
    private final String statusCode;
    private final String statusDesc;

    public DlDetailsResp(Dlresponse dlresponse2, String str, String str2) {
        l.f(dlresponse2, "dlresponse");
        l.f(str, "statusCode");
        l.f(str2, "statusDesc");
        this.dlresponse = dlresponse2;
        this.statusCode = str;
        this.statusDesc = str2;
    }

    public static /* synthetic */ DlDetailsResp copy$default(DlDetailsResp dlDetailsResp, Dlresponse dlresponse2, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            dlresponse2 = dlDetailsResp.dlresponse;
        }
        if ((i10 & 2) != 0) {
            str = dlDetailsResp.statusCode;
        }
        if ((i10 & 4) != 0) {
            str2 = dlDetailsResp.statusDesc;
        }
        return dlDetailsResp.copy(dlresponse2, str, str2);
    }

    public final Dlresponse component1() {
        return this.dlresponse;
    }

    public final String component2() {
        return this.statusCode;
    }

    public final String component3() {
        return this.statusDesc;
    }

    public final DlDetailsResp copy(Dlresponse dlresponse2, String str, String str2) {
        l.f(dlresponse2, "dlresponse");
        l.f(str, "statusCode");
        l.f(str2, "statusDesc");
        return new DlDetailsResp(dlresponse2, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DlDetailsResp)) {
            return false;
        }
        DlDetailsResp dlDetailsResp = (DlDetailsResp) obj;
        return l.a(this.dlresponse, dlDetailsResp.dlresponse) && l.a(this.statusCode, dlDetailsResp.statusCode) && l.a(this.statusDesc, dlDetailsResp.statusDesc);
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
        return (((this.dlresponse.hashCode() * 31) + this.statusCode.hashCode()) * 31) + this.statusDesc.hashCode();
    }

    public String toString() {
        return "DlDetailsResp(dlresponse=" + this.dlresponse + ", statusCode=" + this.statusCode + ", statusDesc=" + this.statusDesc + ')';
    }
}
