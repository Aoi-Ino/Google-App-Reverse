package com.nic.mparivahan.Sarathithreeservices.model.app_status;

import androidx.annotation.Keep;
import cm.l;
import java.util.List;

@Keep
public final class GetAppStatusMain {
    private final List<ApplStatusDetail> ApplStatus_Details;
    private final String status_code;
    private final String status_desc;

    public GetAppStatusMain(List<ApplStatusDetail> list, String str, String str2) {
        l.f(list, "ApplStatus_Details");
        l.f(str, "status_code");
        l.f(str2, "status_desc");
        this.ApplStatus_Details = list;
        this.status_code = str;
        this.status_desc = str2;
    }

    public static /* synthetic */ GetAppStatusMain copy$default(GetAppStatusMain getAppStatusMain, List<ApplStatusDetail> list, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = getAppStatusMain.ApplStatus_Details;
        }
        if ((i10 & 2) != 0) {
            str = getAppStatusMain.status_code;
        }
        if ((i10 & 4) != 0) {
            str2 = getAppStatusMain.status_desc;
        }
        return getAppStatusMain.copy(list, str, str2);
    }

    public final List<ApplStatusDetail> component1() {
        return this.ApplStatus_Details;
    }

    public final String component2() {
        return this.status_code;
    }

    public final String component3() {
        return this.status_desc;
    }

    public final GetAppStatusMain copy(List<ApplStatusDetail> list, String str, String str2) {
        l.f(list, "ApplStatus_Details");
        l.f(str, "status_code");
        l.f(str2, "status_desc");
        return new GetAppStatusMain(list, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetAppStatusMain)) {
            return false;
        }
        GetAppStatusMain getAppStatusMain = (GetAppStatusMain) obj;
        return l.a(this.ApplStatus_Details, getAppStatusMain.ApplStatus_Details) && l.a(this.status_code, getAppStatusMain.status_code) && l.a(this.status_desc, getAppStatusMain.status_desc);
    }

    public final List<ApplStatusDetail> getApplStatus_Details() {
        return this.ApplStatus_Details;
    }

    public final String getStatus_code() {
        return this.status_code;
    }

    public final String getStatus_desc() {
        return this.status_desc;
    }

    public int hashCode() {
        return (((this.ApplStatus_Details.hashCode() * 31) + this.status_code.hashCode()) * 31) + this.status_desc.hashCode();
    }

    public String toString() {
        return "GetAppStatusMain(ApplStatus_Details=" + this.ApplStatus_Details + ", status_code=" + this.status_code + ", status_desc=" + this.status_desc + ')';
    }
}
