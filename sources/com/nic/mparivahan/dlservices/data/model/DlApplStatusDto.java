package com.nic.mparivahan.dlservices.data.model;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;
import java.io.Serializable;
import java.util.List;

@Keep
public final class DlApplStatusDto implements Serializable {
    @c("ApplStatus_Details")
    private final List<ApplStatusDetailsItem> applStatusDetails;
    @c("status_code")
    private final String statusCode;
    @c("status_desc")
    private final String statusDesc;

    public DlApplStatusDto() {
        this((String) null, (String) null, (List) null, 7, (g) null);
    }

    public static /* synthetic */ DlApplStatusDto copy$default(DlApplStatusDto dlApplStatusDto, String str, String str2, List<ApplStatusDetailsItem> list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = dlApplStatusDto.statusCode;
        }
        if ((i10 & 2) != 0) {
            str2 = dlApplStatusDto.statusDesc;
        }
        if ((i10 & 4) != 0) {
            list = dlApplStatusDto.applStatusDetails;
        }
        return dlApplStatusDto.copy(str, str2, list);
    }

    public final String component1() {
        return this.statusCode;
    }

    public final String component2() {
        return this.statusDesc;
    }

    public final List<ApplStatusDetailsItem> component3() {
        return this.applStatusDetails;
    }

    public final DlApplStatusDto copy(String str, String str2, List<ApplStatusDetailsItem> list) {
        return new DlApplStatusDto(str, str2, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DlApplStatusDto)) {
            return false;
        }
        DlApplStatusDto dlApplStatusDto = (DlApplStatusDto) obj;
        return l.a(this.statusCode, dlApplStatusDto.statusCode) && l.a(this.statusDesc, dlApplStatusDto.statusDesc) && l.a(this.applStatusDetails, dlApplStatusDto.applStatusDetails);
    }

    public final List<ApplStatusDetailsItem> getApplStatusDetails() {
        return this.applStatusDetails;
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
        List<ApplStatusDetailsItem> list = this.applStatusDetails;
        if (list != null) {
            i10 = list.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        return "DlApplStatusDto(statusCode=" + this.statusCode + ", statusDesc=" + this.statusDesc + ", applStatusDetails=" + this.applStatusDetails + ')';
    }

    public DlApplStatusDto(String str, String str2, List<ApplStatusDetailsItem> list) {
        this.statusCode = str;
        this.statusDesc = str2;
        this.applStatusDetails = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DlApplStatusDto(String str, String str2, List list, int i10, g gVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : list);
    }
}
