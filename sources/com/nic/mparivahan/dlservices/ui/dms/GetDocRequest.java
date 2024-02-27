package com.nic.mparivahan.dlservices.ui.dms;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;

@Keep
public final class GetDocRequest {
    @c("applNo")
    private final String applNo;
    @c("applicantCategory")
    private final String applicantCategory;
    @c("servicecode")
    private final String servicecode;
    @c("stateCode")
    private final String stateCode;

    public GetDocRequest() {
        this((String) null, (String) null, (String) null, (String) null, 15, (g) null);
    }

    public static /* synthetic */ GetDocRequest copy$default(GetDocRequest getDocRequest, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = getDocRequest.servicecode;
        }
        if ((i10 & 2) != 0) {
            str2 = getDocRequest.applNo;
        }
        if ((i10 & 4) != 0) {
            str3 = getDocRequest.stateCode;
        }
        if ((i10 & 8) != 0) {
            str4 = getDocRequest.applicantCategory;
        }
        return getDocRequest.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.servicecode;
    }

    public final String component2() {
        return this.applNo;
    }

    public final String component3() {
        return this.stateCode;
    }

    public final String component4() {
        return this.applicantCategory;
    }

    public final GetDocRequest copy(String str, String str2, String str3, String str4) {
        return new GetDocRequest(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetDocRequest)) {
            return false;
        }
        GetDocRequest getDocRequest = (GetDocRequest) obj;
        return l.a(this.servicecode, getDocRequest.servicecode) && l.a(this.applNo, getDocRequest.applNo) && l.a(this.stateCode, getDocRequest.stateCode) && l.a(this.applicantCategory, getDocRequest.applicantCategory);
    }

    public final String getApplNo() {
        return this.applNo;
    }

    public final String getApplicantCategory() {
        return this.applicantCategory;
    }

    public final String getServicecode() {
        return this.servicecode;
    }

    public final String getStateCode() {
        return this.stateCode;
    }

    public int hashCode() {
        String str = this.servicecode;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.applNo;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.stateCode;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.applicantCategory;
        if (str4 != null) {
            i10 = str4.hashCode();
        }
        return hashCode3 + i10;
    }

    public String toString() {
        return "GetDocRequest(servicecode=" + this.servicecode + ", applNo=" + this.applNo + ", stateCode=" + this.stateCode + ", applicantCategory=" + this.applicantCategory + ')';
    }

    public GetDocRequest(String str, String str2, String str3, String str4) {
        this.servicecode = str;
        this.applNo = str2;
        this.stateCode = str3;
        this.applicantCategory = str4;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GetDocRequest(String str, String str2, String str3, String str4, int i10, g gVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4);
    }
}
