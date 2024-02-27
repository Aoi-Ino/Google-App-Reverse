package com.nic.mparivahan.dlservices.ui.dms;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;
import java.util.List;

@Keep
public final class GetCustomRequest {
    @c("applNo")
    private final String applNo;
    @c("stateCode")
    private final String stateCode;
    @c("transCode")
    private final List<Integer> transCode;

    public GetCustomRequest() {
        this((String) null, (String) null, (List) null, 7, (g) null);
    }

    public static /* synthetic */ GetCustomRequest copy$default(GetCustomRequest getCustomRequest, String str, String str2, List<Integer> list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = getCustomRequest.applNo;
        }
        if ((i10 & 2) != 0) {
            str2 = getCustomRequest.stateCode;
        }
        if ((i10 & 4) != 0) {
            list = getCustomRequest.transCode;
        }
        return getCustomRequest.copy(str, str2, list);
    }

    public final String component1() {
        return this.applNo;
    }

    public final String component2() {
        return this.stateCode;
    }

    public final List<Integer> component3() {
        return this.transCode;
    }

    public final GetCustomRequest copy(String str, String str2, List<Integer> list) {
        return new GetCustomRequest(str, str2, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetCustomRequest)) {
            return false;
        }
        GetCustomRequest getCustomRequest = (GetCustomRequest) obj;
        return l.a(this.applNo, getCustomRequest.applNo) && l.a(this.stateCode, getCustomRequest.stateCode) && l.a(this.transCode, getCustomRequest.transCode);
    }

    public final String getApplNo() {
        return this.applNo;
    }

    public final String getStateCode() {
        return this.stateCode;
    }

    public final List<Integer> getTransCode() {
        return this.transCode;
    }

    public int hashCode() {
        String str = this.applNo;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.stateCode;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<Integer> list = this.transCode;
        if (list != null) {
            i10 = list.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        return "GetCustomRequest(applNo=" + this.applNo + ", stateCode=" + this.stateCode + ", transCode=" + this.transCode + ')';
    }

    public GetCustomRequest(String str, String str2, List<Integer> list) {
        this.applNo = str;
        this.stateCode = str2;
        this.transCode = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GetCustomRequest(String str, String str2, List list, int i10, g gVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : list);
    }
}
