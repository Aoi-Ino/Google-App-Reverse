package com.nic.mparivahan.dlservices.data.model.idp;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;
import java.util.List;

@Keep
public final class GetNatVisaIssbleForNatCodeResponse {
    @c("NationsMaster")
    private final List<NationsMasterItem> nationsMaster;
    @c("status_code")
    private final String statusCode;
    @c("status_desc")
    private final String statusDesc;

    public GetNatVisaIssbleForNatCodeResponse() {
        this((String) null, (String) null, (List) null, 7, (g) null);
    }

    public static /* synthetic */ GetNatVisaIssbleForNatCodeResponse copy$default(GetNatVisaIssbleForNatCodeResponse getNatVisaIssbleForNatCodeResponse, String str, String str2, List<NationsMasterItem> list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = getNatVisaIssbleForNatCodeResponse.statusCode;
        }
        if ((i10 & 2) != 0) {
            str2 = getNatVisaIssbleForNatCodeResponse.statusDesc;
        }
        if ((i10 & 4) != 0) {
            list = getNatVisaIssbleForNatCodeResponse.nationsMaster;
        }
        return getNatVisaIssbleForNatCodeResponse.copy(str, str2, list);
    }

    public final String component1() {
        return this.statusCode;
    }

    public final String component2() {
        return this.statusDesc;
    }

    public final List<NationsMasterItem> component3() {
        return this.nationsMaster;
    }

    public final GetNatVisaIssbleForNatCodeResponse copy(String str, String str2, List<NationsMasterItem> list) {
        return new GetNatVisaIssbleForNatCodeResponse(str, str2, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetNatVisaIssbleForNatCodeResponse)) {
            return false;
        }
        GetNatVisaIssbleForNatCodeResponse getNatVisaIssbleForNatCodeResponse = (GetNatVisaIssbleForNatCodeResponse) obj;
        return l.a(this.statusCode, getNatVisaIssbleForNatCodeResponse.statusCode) && l.a(this.statusDesc, getNatVisaIssbleForNatCodeResponse.statusDesc) && l.a(this.nationsMaster, getNatVisaIssbleForNatCodeResponse.nationsMaster);
    }

    public final List<NationsMasterItem> getNationsMaster() {
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
        List<NationsMasterItem> list = this.nationsMaster;
        if (list != null) {
            i10 = list.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        return "GetNatVisaIssbleForNatCodeResponse(statusCode=" + this.statusCode + ", statusDesc=" + this.statusDesc + ", nationsMaster=" + this.nationsMaster + ')';
    }

    public GetNatVisaIssbleForNatCodeResponse(String str, String str2, List<NationsMasterItem> list) {
        this.statusCode = str;
        this.statusDesc = str2;
        this.nationsMaster = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GetNatVisaIssbleForNatCodeResponse(String str, String str2, List list, int i10, g gVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : list);
    }
}
