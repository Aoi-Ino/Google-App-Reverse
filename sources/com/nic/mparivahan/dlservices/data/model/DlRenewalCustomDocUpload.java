package com.nic.mparivahan.dlservices.data.model;

import androidx.annotation.Keep;
import cm.l;
import org.json.JSONArray;

@Keep
public final class DlRenewalCustomDocUpload {
    private String applNo;
    private String stateCode;
    private JSONArray transCode;

    public DlRenewalCustomDocUpload(String str, String str2, JSONArray jSONArray) {
        l.f(str, "applNo");
        l.f(str2, "stateCode");
        l.f(jSONArray, "transCode");
        this.applNo = str;
        this.stateCode = str2;
        this.transCode = jSONArray;
    }

    public static /* synthetic */ DlRenewalCustomDocUpload copy$default(DlRenewalCustomDocUpload dlRenewalCustomDocUpload, String str, String str2, JSONArray jSONArray, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = dlRenewalCustomDocUpload.applNo;
        }
        if ((i10 & 2) != 0) {
            str2 = dlRenewalCustomDocUpload.stateCode;
        }
        if ((i10 & 4) != 0) {
            jSONArray = dlRenewalCustomDocUpload.transCode;
        }
        return dlRenewalCustomDocUpload.copy(str, str2, jSONArray);
    }

    public final String component1() {
        return this.applNo;
    }

    public final String component2() {
        return this.stateCode;
    }

    public final JSONArray component3() {
        return this.transCode;
    }

    public final DlRenewalCustomDocUpload copy(String str, String str2, JSONArray jSONArray) {
        l.f(str, "applNo");
        l.f(str2, "stateCode");
        l.f(jSONArray, "transCode");
        return new DlRenewalCustomDocUpload(str, str2, jSONArray);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DlRenewalCustomDocUpload)) {
            return false;
        }
        DlRenewalCustomDocUpload dlRenewalCustomDocUpload = (DlRenewalCustomDocUpload) obj;
        return l.a(this.applNo, dlRenewalCustomDocUpload.applNo) && l.a(this.stateCode, dlRenewalCustomDocUpload.stateCode) && l.a(this.transCode, dlRenewalCustomDocUpload.transCode);
    }

    public final String getApplNo() {
        return this.applNo;
    }

    public final String getStateCode() {
        return this.stateCode;
    }

    public final JSONArray getTransCode() {
        return this.transCode;
    }

    public int hashCode() {
        return (((this.applNo.hashCode() * 31) + this.stateCode.hashCode()) * 31) + this.transCode.hashCode();
    }

    public final void setApplNo(String str) {
        l.f(str, "<set-?>");
        this.applNo = str;
    }

    public final void setStateCode(String str) {
        l.f(str, "<set-?>");
        this.stateCode = str;
    }

    public final void setTransCode(JSONArray jSONArray) {
        l.f(jSONArray, "<set-?>");
        this.transCode = jSONArray;
    }

    public String toString() {
        return "DlRenewalCustomDocUpload(applNo=" + this.applNo + ", stateCode=" + this.stateCode + ", transCode=" + this.transCode + ')';
    }
}
