package com.nic.mparivahan.dlservices.data.model;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;
import java.util.List;

@Keep
public final class VillageOrTownResponse {
    @c("status_code")
    private final String statusCode;
    @c("status_desc")
    private final String statusDesc;
    @c("VillageAndTownMaster")
    private final List<VillageOrTownMasterItem> villageMaster;

    public VillageOrTownResponse() {
        this((String) null, (String) null, (List) null, 7, (g) null);
    }

    public static /* synthetic */ VillageOrTownResponse copy$default(VillageOrTownResponse villageOrTownResponse, String str, String str2, List<VillageOrTownMasterItem> list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = villageOrTownResponse.statusCode;
        }
        if ((i10 & 2) != 0) {
            str2 = villageOrTownResponse.statusDesc;
        }
        if ((i10 & 4) != 0) {
            list = villageOrTownResponse.villageMaster;
        }
        return villageOrTownResponse.copy(str, str2, list);
    }

    public final String component1() {
        return this.statusCode;
    }

    public final String component2() {
        return this.statusDesc;
    }

    public final List<VillageOrTownMasterItem> component3() {
        return this.villageMaster;
    }

    public final VillageOrTownResponse copy(String str, String str2, List<VillageOrTownMasterItem> list) {
        return new VillageOrTownResponse(str, str2, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VillageOrTownResponse)) {
            return false;
        }
        VillageOrTownResponse villageOrTownResponse = (VillageOrTownResponse) obj;
        return l.a(this.statusCode, villageOrTownResponse.statusCode) && l.a(this.statusDesc, villageOrTownResponse.statusDesc) && l.a(this.villageMaster, villageOrTownResponse.villageMaster);
    }

    public final String getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public final List<VillageOrTownMasterItem> getVillageMaster() {
        return this.villageMaster;
    }

    public int hashCode() {
        String str = this.statusCode;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.statusDesc;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<VillageOrTownMasterItem> list = this.villageMaster;
        if (list != null) {
            i10 = list.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        return "VillageOrTownResponse(statusCode=" + this.statusCode + ", statusDesc=" + this.statusDesc + ", villageMaster=" + this.villageMaster + ')';
    }

    public VillageOrTownResponse(String str, String str2, List<VillageOrTownMasterItem> list) {
        this.statusCode = str;
        this.statusDesc = str2;
        this.villageMaster = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ VillageOrTownResponse(String str, String str2, List list, int i10, g gVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : list);
    }
}
