package com.nic.mparivahan.dlservices.data.model;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;
import java.util.List;

@Keep
public final class DistResponse {
    @c("DistrictMaster")
    private final List<DistrictsMasterItem> distMaster;
    @c("status_code")
    private final String statusCode;
    @c("status_desc")
    private final String statusDesc;

    public DistResponse() {
        this((String) null, (String) null, (List) null, 7, (g) null);
    }

    public static /* synthetic */ DistResponse copy$default(DistResponse distResponse, String str, String str2, List<DistrictsMasterItem> list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = distResponse.statusCode;
        }
        if ((i10 & 2) != 0) {
            str2 = distResponse.statusDesc;
        }
        if ((i10 & 4) != 0) {
            list = distResponse.distMaster;
        }
        return distResponse.copy(str, str2, list);
    }

    public final String component1() {
        return this.statusCode;
    }

    public final String component2() {
        return this.statusDesc;
    }

    public final List<DistrictsMasterItem> component3() {
        return this.distMaster;
    }

    public final DistResponse copy(String str, String str2, List<DistrictsMasterItem> list) {
        return new DistResponse(str, str2, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DistResponse)) {
            return false;
        }
        DistResponse distResponse = (DistResponse) obj;
        return l.a(this.statusCode, distResponse.statusCode) && l.a(this.statusDesc, distResponse.statusDesc) && l.a(this.distMaster, distResponse.distMaster);
    }

    public final List<DistrictsMasterItem> getDistMaster() {
        return this.distMaster;
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
        List<DistrictsMasterItem> list = this.distMaster;
        if (list != null) {
            i10 = list.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        return "DistResponse(statusCode=" + this.statusCode + ", statusDesc=" + this.statusDesc + ", distMaster=" + this.distMaster + ')';
    }

    public DistResponse(String str, String str2, List<DistrictsMasterItem> list) {
        this.statusCode = str;
        this.statusDesc = str2;
        this.distMaster = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DistResponse(String str, String str2, List list, int i10, g gVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : list);
    }
}
