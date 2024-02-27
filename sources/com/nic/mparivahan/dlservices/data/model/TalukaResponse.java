package com.nic.mparivahan.dlservices.data.model;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;
import java.util.List;

@Keep
public final class TalukaResponse {
    @c("status_code")
    private final String statusCode;
    @c("status_desc")
    private final String statusDesc;
    @c("SubDistrictMaster")
    private final List<TalukaMasterItem> takulaMaster;

    public TalukaResponse() {
        this((String) null, (String) null, (List) null, 7, (g) null);
    }

    public static /* synthetic */ TalukaResponse copy$default(TalukaResponse talukaResponse, String str, String str2, List<TalukaMasterItem> list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = talukaResponse.statusCode;
        }
        if ((i10 & 2) != 0) {
            str2 = talukaResponse.statusDesc;
        }
        if ((i10 & 4) != 0) {
            list = talukaResponse.takulaMaster;
        }
        return talukaResponse.copy(str, str2, list);
    }

    public final String component1() {
        return this.statusCode;
    }

    public final String component2() {
        return this.statusDesc;
    }

    public final List<TalukaMasterItem> component3() {
        return this.takulaMaster;
    }

    public final TalukaResponse copy(String str, String str2, List<TalukaMasterItem> list) {
        return new TalukaResponse(str, str2, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TalukaResponse)) {
            return false;
        }
        TalukaResponse talukaResponse = (TalukaResponse) obj;
        return l.a(this.statusCode, talukaResponse.statusCode) && l.a(this.statusDesc, talukaResponse.statusDesc) && l.a(this.takulaMaster, talukaResponse.takulaMaster);
    }

    public final String getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public final List<TalukaMasterItem> getTakulaMaster() {
        return this.takulaMaster;
    }

    public int hashCode() {
        String str = this.statusCode;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.statusDesc;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<TalukaMasterItem> list = this.takulaMaster;
        if (list != null) {
            i10 = list.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        return "TalukaResponse(statusCode=" + this.statusCode + ", statusDesc=" + this.statusDesc + ", takulaMaster=" + this.takulaMaster + ')';
    }

    public TalukaResponse(String str, String str2, List<TalukaMasterItem> list) {
        this.statusCode = str;
        this.statusDesc = str2;
        this.takulaMaster = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TalukaResponse(String str, String str2, List list, int i10, g gVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : list);
    }
}
