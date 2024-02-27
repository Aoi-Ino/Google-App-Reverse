package com.nic.mparivahan.LLServices.GetLlPojo;

import androidx.annotation.Keep;
import cm.l;
import java.io.Serializable;
import java.util.List;

@Keep
public final class GetllData implements Serializable {
    private final List<LLDetail> LLDetails;
    private final String status_code;
    private final String status_desc;

    public GetllData(List<LLDetail> list, String str, String str2) {
        l.f(list, "LLDetails");
        l.f(str, "status_code");
        l.f(str2, "status_desc");
        this.LLDetails = list;
        this.status_code = str;
        this.status_desc = str2;
    }

    public static /* synthetic */ GetllData copy$default(GetllData getllData, List<LLDetail> list, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = getllData.LLDetails;
        }
        if ((i10 & 2) != 0) {
            str = getllData.status_code;
        }
        if ((i10 & 4) != 0) {
            str2 = getllData.status_desc;
        }
        return getllData.copy(list, str, str2);
    }

    public final List<LLDetail> component1() {
        return this.LLDetails;
    }

    public final String component2() {
        return this.status_code;
    }

    public final String component3() {
        return this.status_desc;
    }

    public final GetllData copy(List<LLDetail> list, String str, String str2) {
        l.f(list, "LLDetails");
        l.f(str, "status_code");
        l.f(str2, "status_desc");
        return new GetllData(list, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetllData)) {
            return false;
        }
        GetllData getllData = (GetllData) obj;
        return l.a(this.LLDetails, getllData.LLDetails) && l.a(this.status_code, getllData.status_code) && l.a(this.status_desc, getllData.status_desc);
    }

    public final List<LLDetail> getLLDetails() {
        return this.LLDetails;
    }

    public final String getStatus_code() {
        return this.status_code;
    }

    public final String getStatus_desc() {
        return this.status_desc;
    }

    public int hashCode() {
        return (((this.LLDetails.hashCode() * 31) + this.status_code.hashCode()) * 31) + this.status_desc.hashCode();
    }

    public String toString() {
        return "GetllData(LLDetails=" + this.LLDetails + ", status_code=" + this.status_code + ", status_desc=" + this.status_desc + ')';
    }
}
