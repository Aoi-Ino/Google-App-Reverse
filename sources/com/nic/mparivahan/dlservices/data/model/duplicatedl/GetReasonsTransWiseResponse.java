package com.nic.mparivahan.dlservices.data.model.duplicatedl;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;
import java.util.List;

@Keep
public final class GetReasonsTransWiseResponse {
    @c("ReasonsMaster")
    private final List<ReasonsMasterItem> reasonsMaster;
    @c("status_code")
    private final String statusCode;
    @c("status_desc")
    private final String statusDesc;

    public GetReasonsTransWiseResponse() {
        this((String) null, (String) null, (List) null, 7, (g) null);
    }

    public static /* synthetic */ GetReasonsTransWiseResponse copy$default(GetReasonsTransWiseResponse getReasonsTransWiseResponse, String str, String str2, List<ReasonsMasterItem> list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = getReasonsTransWiseResponse.statusCode;
        }
        if ((i10 & 2) != 0) {
            str2 = getReasonsTransWiseResponse.statusDesc;
        }
        if ((i10 & 4) != 0) {
            list = getReasonsTransWiseResponse.reasonsMaster;
        }
        return getReasonsTransWiseResponse.copy(str, str2, list);
    }

    public final String component1() {
        return this.statusCode;
    }

    public final String component2() {
        return this.statusDesc;
    }

    public final List<ReasonsMasterItem> component3() {
        return this.reasonsMaster;
    }

    public final GetReasonsTransWiseResponse copy(String str, String str2, List<ReasonsMasterItem> list) {
        return new GetReasonsTransWiseResponse(str, str2, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetReasonsTransWiseResponse)) {
            return false;
        }
        GetReasonsTransWiseResponse getReasonsTransWiseResponse = (GetReasonsTransWiseResponse) obj;
        return l.a(this.statusCode, getReasonsTransWiseResponse.statusCode) && l.a(this.statusDesc, getReasonsTransWiseResponse.statusDesc) && l.a(this.reasonsMaster, getReasonsTransWiseResponse.reasonsMaster);
    }

    public final List<ReasonsMasterItem> getReasonsMaster() {
        return this.reasonsMaster;
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
        List<ReasonsMasterItem> list = this.reasonsMaster;
        if (list != null) {
            i10 = list.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        return "GetReasonsTransWiseResponse(statusCode=" + this.statusCode + ", statusDesc=" + this.statusDesc + ", reasonsMaster=" + this.reasonsMaster + ')';
    }

    public GetReasonsTransWiseResponse(String str, String str2, List<ReasonsMasterItem> list) {
        this.statusCode = str;
        this.statusDesc = str2;
        this.reasonsMaster = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GetReasonsTransWiseResponse(String str, String str2, List list, int i10, g gVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : list);
    }
}
