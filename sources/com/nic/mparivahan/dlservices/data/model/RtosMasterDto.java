package com.nic.mparivahan.dlservices.data.model;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;
import java.util.List;

@Keep
public final class RtosMasterDto {
    @c("RtosMaster")
    private final List<RtosMasterItem> rtosMaster;
    @c("status_code")
    private final String statusCode;
    @c("status_desc")
    private final String statusDesc;

    public RtosMasterDto() {
        this((List) null, (String) null, (String) null, 7, (g) null);
    }

    public static /* synthetic */ RtosMasterDto copy$default(RtosMasterDto rtosMasterDto, List<RtosMasterItem> list, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = rtosMasterDto.rtosMaster;
        }
        if ((i10 & 2) != 0) {
            str = rtosMasterDto.statusCode;
        }
        if ((i10 & 4) != 0) {
            str2 = rtosMasterDto.statusDesc;
        }
        return rtosMasterDto.copy(list, str, str2);
    }

    public final List<RtosMasterItem> component1() {
        return this.rtosMaster;
    }

    public final String component2() {
        return this.statusCode;
    }

    public final String component3() {
        return this.statusDesc;
    }

    public final RtosMasterDto copy(List<RtosMasterItem> list, String str, String str2) {
        return new RtosMasterDto(list, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RtosMasterDto)) {
            return false;
        }
        RtosMasterDto rtosMasterDto = (RtosMasterDto) obj;
        return l.a(this.rtosMaster, rtosMasterDto.rtosMaster) && l.a(this.statusCode, rtosMasterDto.statusCode) && l.a(this.statusDesc, rtosMasterDto.statusDesc);
    }

    public final List<RtosMasterItem> getRtosMaster() {
        return this.rtosMaster;
    }

    public final String getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public int hashCode() {
        List<RtosMasterItem> list = this.rtosMaster;
        int i10 = 0;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.statusCode;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.statusDesc;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        return "RtosMasterDto(rtosMaster=" + this.rtosMaster + ", statusCode=" + this.statusCode + ", statusDesc=" + this.statusDesc + ')';
    }

    public RtosMasterDto(List<RtosMasterItem> list, String str, String str2) {
        this.rtosMaster = list;
        this.statusCode = str;
        this.statusDesc = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RtosMasterDto(List list, String str, String str2, int i10, g gVar) {
        this((i10 & 1) != 0 ? null : list, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : str2);
    }
}
