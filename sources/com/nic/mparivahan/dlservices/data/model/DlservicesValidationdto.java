package com.nic.mparivahan.dlservices.data.model;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;
import java.util.List;

@Keep
public final class DlservicesValidationdto {
    @c("ReqStatus")
    private final String reqStatus;
    @c("Result")
    private final List<ResultItem> result;
    @c("status_code")
    private final String statusCode;
    @c("status_desc")
    private final String statusDesc;

    public DlservicesValidationdto() {
        this((String) null, (String) null, (String) null, (List) null, 15, (g) null);
    }

    public static /* synthetic */ DlservicesValidationdto copy$default(DlservicesValidationdto dlservicesValidationdto, String str, String str2, String str3, List<ResultItem> list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = dlservicesValidationdto.statusCode;
        }
        if ((i10 & 2) != 0) {
            str2 = dlservicesValidationdto.statusDesc;
        }
        if ((i10 & 4) != 0) {
            str3 = dlservicesValidationdto.reqStatus;
        }
        if ((i10 & 8) != 0) {
            list = dlservicesValidationdto.result;
        }
        return dlservicesValidationdto.copy(str, str2, str3, list);
    }

    public final String component1() {
        return this.statusCode;
    }

    public final String component2() {
        return this.statusDesc;
    }

    public final String component3() {
        return this.reqStatus;
    }

    public final List<ResultItem> component4() {
        return this.result;
    }

    public final DlservicesValidationdto copy(String str, String str2, String str3, List<ResultItem> list) {
        return new DlservicesValidationdto(str, str2, str3, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DlservicesValidationdto)) {
            return false;
        }
        DlservicesValidationdto dlservicesValidationdto = (DlservicesValidationdto) obj;
        return l.a(this.statusCode, dlservicesValidationdto.statusCode) && l.a(this.statusDesc, dlservicesValidationdto.statusDesc) && l.a(this.reqStatus, dlservicesValidationdto.reqStatus) && l.a(this.result, dlservicesValidationdto.result);
    }

    public final String getReqStatus() {
        return this.reqStatus;
    }

    public final List<ResultItem> getResult() {
        return this.result;
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
        String str3 = this.reqStatus;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<ResultItem> list = this.result;
        if (list != null) {
            i10 = list.hashCode();
        }
        return hashCode3 + i10;
    }

    public String toString() {
        return "DlservicesValidationdto(statusCode=" + this.statusCode + ", statusDesc=" + this.statusDesc + ", reqStatus=" + this.reqStatus + ", result=" + this.result + ')';
    }

    public DlservicesValidationdto(String str, String str2, String str3, List<ResultItem> list) {
        this.statusCode = str;
        this.statusDesc = str2;
        this.reqStatus = str3;
        this.result = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DlservicesValidationdto(String str, String str2, String str3, List list, int i10, g gVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : list);
    }
}
