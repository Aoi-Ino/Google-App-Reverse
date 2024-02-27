package com.nic.mparivahan.dlservices.data.model.duplicatedl;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;
import java.util.List;

@Keep
public final class GetLastRtoDuplicateDlResponse {
    @c("ReqStatus")
    private final String reqStatus;
    @c("Result")
    private final List<DlDublResultItem> result;
    @c("status_code")
    private final String statusCode;
    @c("status_desc")
    private final String statusDesc;

    public GetLastRtoDuplicateDlResponse() {
        this((String) null, (String) null, (String) null, (List) null, 15, (g) null);
    }

    public static /* synthetic */ GetLastRtoDuplicateDlResponse copy$default(GetLastRtoDuplicateDlResponse getLastRtoDuplicateDlResponse, String str, String str2, String str3, List<DlDublResultItem> list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = getLastRtoDuplicateDlResponse.statusCode;
        }
        if ((i10 & 2) != 0) {
            str2 = getLastRtoDuplicateDlResponse.statusDesc;
        }
        if ((i10 & 4) != 0) {
            str3 = getLastRtoDuplicateDlResponse.reqStatus;
        }
        if ((i10 & 8) != 0) {
            list = getLastRtoDuplicateDlResponse.result;
        }
        return getLastRtoDuplicateDlResponse.copy(str, str2, str3, list);
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

    public final List<DlDublResultItem> component4() {
        return this.result;
    }

    public final GetLastRtoDuplicateDlResponse copy(String str, String str2, String str3, List<DlDublResultItem> list) {
        return new GetLastRtoDuplicateDlResponse(str, str2, str3, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetLastRtoDuplicateDlResponse)) {
            return false;
        }
        GetLastRtoDuplicateDlResponse getLastRtoDuplicateDlResponse = (GetLastRtoDuplicateDlResponse) obj;
        return l.a(this.statusCode, getLastRtoDuplicateDlResponse.statusCode) && l.a(this.statusDesc, getLastRtoDuplicateDlResponse.statusDesc) && l.a(this.reqStatus, getLastRtoDuplicateDlResponse.reqStatus) && l.a(this.result, getLastRtoDuplicateDlResponse.result);
    }

    public final String getReqStatus() {
        return this.reqStatus;
    }

    public final List<DlDublResultItem> getResult() {
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
        List<DlDublResultItem> list = this.result;
        if (list != null) {
            i10 = list.hashCode();
        }
        return hashCode3 + i10;
    }

    public String toString() {
        return "GetLastRtoDuplicateDlResponse(statusCode=" + this.statusCode + ", statusDesc=" + this.statusDesc + ", reqStatus=" + this.reqStatus + ", result=" + this.result + ')';
    }

    public GetLastRtoDuplicateDlResponse(String str, String str2, String str3, List<DlDublResultItem> list) {
        this.statusCode = str;
        this.statusDesc = str2;
        this.reqStatus = str3;
        this.result = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GetLastRtoDuplicateDlResponse(String str, String str2, String str3, List list, int i10, g gVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : list);
    }
}
