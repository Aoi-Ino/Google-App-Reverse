package com.nic.mparivahan.dlservices.data.model.idp;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;
import java.util.List;

@Keep
public final class GetNationsToApplyForResponse {
    @c("NationsMaster")
    private final List<GetNationsCodeItem> nationsMaster;
    @c("status_code")
    private final String statusCode;
    @c("status_desc")
    private final String statusDesc;

    public GetNationsToApplyForResponse() {
        this((String) null, (String) null, (List) null, 7, (g) null);
    }

    public static /* synthetic */ GetNationsToApplyForResponse copy$default(GetNationsToApplyForResponse getNationsToApplyForResponse, String str, String str2, List<GetNationsCodeItem> list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = getNationsToApplyForResponse.statusCode;
        }
        if ((i10 & 2) != 0) {
            str2 = getNationsToApplyForResponse.statusDesc;
        }
        if ((i10 & 4) != 0) {
            list = getNationsToApplyForResponse.nationsMaster;
        }
        return getNationsToApplyForResponse.copy(str, str2, list);
    }

    public final String component1() {
        return this.statusCode;
    }

    public final String component2() {
        return this.statusDesc;
    }

    public final List<GetNationsCodeItem> component3() {
        return this.nationsMaster;
    }

    public final GetNationsToApplyForResponse copy(String str, String str2, List<GetNationsCodeItem> list) {
        return new GetNationsToApplyForResponse(str, str2, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetNationsToApplyForResponse)) {
            return false;
        }
        GetNationsToApplyForResponse getNationsToApplyForResponse = (GetNationsToApplyForResponse) obj;
        return l.a(this.statusCode, getNationsToApplyForResponse.statusCode) && l.a(this.statusDesc, getNationsToApplyForResponse.statusDesc) && l.a(this.nationsMaster, getNationsToApplyForResponse.nationsMaster);
    }

    public final List<GetNationsCodeItem> getNationsMaster() {
        return this.nationsMaster;
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
        List<GetNationsCodeItem> list = this.nationsMaster;
        if (list != null) {
            i10 = list.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        return "GetNationsToApplyForResponse(statusCode=" + this.statusCode + ", statusDesc=" + this.statusDesc + ", nationsMaster=" + this.nationsMaster + ')';
    }

    public GetNationsToApplyForResponse(String str, String str2, List<GetNationsCodeItem> list) {
        this.statusCode = str;
        this.statusDesc = str2;
        this.nationsMaster = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GetNationsToApplyForResponse(String str, String str2, List list, int i10, g gVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : list);
    }
}
