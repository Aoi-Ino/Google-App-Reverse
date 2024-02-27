package com.nic.mparivahan.dlservices.data.model;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;
import java.io.Serializable;
import java.util.List;

@Keep
public final class DlSubmitResult implements Serializable {
    @c("ReqStatus")
    private final String ReqStatus;
    @c("Result")
    private final List<ResultItemSubmit> Result;
    @c("status_code")
    private final String statusCode;
    @c("status_desc")
    private final String statusDesc;

    public DlSubmitResult() {
        this((String) null, (String) null, (List) null, (String) null, 15, (g) null);
    }

    public static /* synthetic */ DlSubmitResult copy$default(DlSubmitResult dlSubmitResult, String str, String str2, List<ResultItemSubmit> list, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = dlSubmitResult.statusCode;
        }
        if ((i10 & 2) != 0) {
            str2 = dlSubmitResult.statusDesc;
        }
        if ((i10 & 4) != 0) {
            list = dlSubmitResult.Result;
        }
        if ((i10 & 8) != 0) {
            str3 = dlSubmitResult.ReqStatus;
        }
        return dlSubmitResult.copy(str, str2, list, str3);
    }

    public final String component1() {
        return this.statusCode;
    }

    public final String component2() {
        return this.statusDesc;
    }

    public final List<ResultItemSubmit> component3() {
        return this.Result;
    }

    public final String component4() {
        return this.ReqStatus;
    }

    public final DlSubmitResult copy(String str, String str2, List<ResultItemSubmit> list, String str3) {
        return new DlSubmitResult(str, str2, list, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DlSubmitResult)) {
            return false;
        }
        DlSubmitResult dlSubmitResult = (DlSubmitResult) obj;
        return l.a(this.statusCode, dlSubmitResult.statusCode) && l.a(this.statusDesc, dlSubmitResult.statusDesc) && l.a(this.Result, dlSubmitResult.Result) && l.a(this.ReqStatus, dlSubmitResult.ReqStatus);
    }

    public final String getReqStatus() {
        return this.ReqStatus;
    }

    public final List<ResultItemSubmit> getResult() {
        return this.Result;
    }

    public final String getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public int hashCode() {
        String str = this.statusCode;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.statusDesc;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<ResultItemSubmit> list = this.Result;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.ReqStatus;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        return hashCode3 + i10;
    }

    public String toString() {
        return "DlSubmitResult(statusCode=" + this.statusCode + ", statusDesc=" + this.statusDesc + ", Result=" + this.Result + ", ReqStatus=" + this.ReqStatus + ')';
    }

    public DlSubmitResult(String str, String str2, List<ResultItemSubmit> list, String str3) {
        this.statusCode = str;
        this.statusDesc = str2;
        this.Result = list;
        this.ReqStatus = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DlSubmitResult(String str, String str2, List list, String str3, int i10, g gVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : list, (i10 & 8) != 0 ? null : str3);
    }
}
