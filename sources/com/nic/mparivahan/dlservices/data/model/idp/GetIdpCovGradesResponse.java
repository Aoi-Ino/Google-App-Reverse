package com.nic.mparivahan.dlservices.data.model.idp;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;
import java.util.List;

@Keep
public final class GetIdpCovGradesResponse {
    @c("Idpcovgrades")
    private final List<IdpcovgradesItem> idpcovgrades;
    @c("status_code")
    private final String statusCode;
    @c("status_desc")
    private final String statusDesc;

    public GetIdpCovGradesResponse() {
        this((String) null, (String) null, (List) null, 7, (g) null);
    }

    public static /* synthetic */ GetIdpCovGradesResponse copy$default(GetIdpCovGradesResponse getIdpCovGradesResponse, String str, String str2, List<IdpcovgradesItem> list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = getIdpCovGradesResponse.statusCode;
        }
        if ((i10 & 2) != 0) {
            str2 = getIdpCovGradesResponse.statusDesc;
        }
        if ((i10 & 4) != 0) {
            list = getIdpCovGradesResponse.idpcovgrades;
        }
        return getIdpCovGradesResponse.copy(str, str2, list);
    }

    public final String component1() {
        return this.statusCode;
    }

    public final String component2() {
        return this.statusDesc;
    }

    public final List<IdpcovgradesItem> component3() {
        return this.idpcovgrades;
    }

    public final GetIdpCovGradesResponse copy(String str, String str2, List<IdpcovgradesItem> list) {
        return new GetIdpCovGradesResponse(str, str2, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetIdpCovGradesResponse)) {
            return false;
        }
        GetIdpCovGradesResponse getIdpCovGradesResponse = (GetIdpCovGradesResponse) obj;
        return l.a(this.statusCode, getIdpCovGradesResponse.statusCode) && l.a(this.statusDesc, getIdpCovGradesResponse.statusDesc) && l.a(this.idpcovgrades, getIdpCovGradesResponse.idpcovgrades);
    }

    public final List<IdpcovgradesItem> getIdpcovgrades() {
        return this.idpcovgrades;
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
        List<IdpcovgradesItem> list = this.idpcovgrades;
        if (list != null) {
            i10 = list.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        return "GetIdpCovGradesResponse(statusCode=" + this.statusCode + ", statusDesc=" + this.statusDesc + ", idpcovgrades=" + this.idpcovgrades + ')';
    }

    public GetIdpCovGradesResponse(String str, String str2, List<IdpcovgradesItem> list) {
        this.statusCode = str;
        this.statusDesc = str2;
        this.idpcovgrades = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GetIdpCovGradesResponse(String str, String str2, List list, int i10, g gVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : list);
    }
}
