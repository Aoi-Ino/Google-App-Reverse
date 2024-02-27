package com.nic.mparivahan.dlservices.data.model;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;
import java.util.List;

@Keep
public final class StateCustomDetailsDto {
    @c("customSt")
    private final List<CustomStItem> customSt;
    @c("status_code")
    private final String statusCode;
    @c("status_desc")
    private final String statusDesc;

    public StateCustomDetailsDto() {
        this((String) null, (List) null, (String) null, 7, (g) null);
    }

    public static /* synthetic */ StateCustomDetailsDto copy$default(StateCustomDetailsDto stateCustomDetailsDto, String str, List<CustomStItem> list, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = stateCustomDetailsDto.statusCode;
        }
        if ((i10 & 2) != 0) {
            list = stateCustomDetailsDto.customSt;
        }
        if ((i10 & 4) != 0) {
            str2 = stateCustomDetailsDto.statusDesc;
        }
        return stateCustomDetailsDto.copy(str, list, str2);
    }

    public final String component1() {
        return this.statusCode;
    }

    public final List<CustomStItem> component2() {
        return this.customSt;
    }

    public final String component3() {
        return this.statusDesc;
    }

    public final StateCustomDetailsDto copy(String str, List<CustomStItem> list, String str2) {
        return new StateCustomDetailsDto(str, list, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StateCustomDetailsDto)) {
            return false;
        }
        StateCustomDetailsDto stateCustomDetailsDto = (StateCustomDetailsDto) obj;
        return l.a(this.statusCode, stateCustomDetailsDto.statusCode) && l.a(this.customSt, stateCustomDetailsDto.customSt) && l.a(this.statusDesc, stateCustomDetailsDto.statusDesc);
    }

    public final List<CustomStItem> getCustomSt() {
        return this.customSt;
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
        List<CustomStItem> list = this.customSt;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.statusDesc;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        return "StateCustomDetailsDto(statusCode=" + this.statusCode + ", customSt=" + this.customSt + ", statusDesc=" + this.statusDesc + ')';
    }

    public StateCustomDetailsDto(String str, List<CustomStItem> list, String str2) {
        this.statusCode = str;
        this.customSt = list;
        this.statusDesc = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StateCustomDetailsDto(String str, List list, String str2, int i10, g gVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : list, (i10 & 4) != 0 ? null : str2);
    }
}
