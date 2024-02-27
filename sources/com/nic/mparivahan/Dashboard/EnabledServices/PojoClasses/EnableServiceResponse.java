package com.nic.mparivahan.Dashboard.EnabledServices.PojoClasses;

import androidx.annotation.Keep;
import cm.l;
import java.util.ArrayList;

@Keep
public final class EnableServiceResponse {
    private final ArrayList<Enabledservice> enabledservice;
    private final String statusCode;
    private final String statusDesc;

    public EnableServiceResponse(ArrayList<Enabledservice> arrayList, String str, String str2) {
        l.f(arrayList, "enabledservice");
        l.f(str, "statusCode");
        l.f(str2, "statusDesc");
        this.enabledservice = arrayList;
        this.statusCode = str;
        this.statusDesc = str2;
    }

    public static /* synthetic */ EnableServiceResponse copy$default(EnableServiceResponse enableServiceResponse, ArrayList<Enabledservice> arrayList, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            arrayList = enableServiceResponse.enabledservice;
        }
        if ((i10 & 2) != 0) {
            str = enableServiceResponse.statusCode;
        }
        if ((i10 & 4) != 0) {
            str2 = enableServiceResponse.statusDesc;
        }
        return enableServiceResponse.copy(arrayList, str, str2);
    }

    public final ArrayList<Enabledservice> component1() {
        return this.enabledservice;
    }

    public final String component2() {
        return this.statusCode;
    }

    public final String component3() {
        return this.statusDesc;
    }

    public final EnableServiceResponse copy(ArrayList<Enabledservice> arrayList, String str, String str2) {
        l.f(arrayList, "enabledservice");
        l.f(str, "statusCode");
        l.f(str2, "statusDesc");
        return new EnableServiceResponse(arrayList, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EnableServiceResponse)) {
            return false;
        }
        EnableServiceResponse enableServiceResponse = (EnableServiceResponse) obj;
        return l.a(this.enabledservice, enableServiceResponse.enabledservice) && l.a(this.statusCode, enableServiceResponse.statusCode) && l.a(this.statusDesc, enableServiceResponse.statusDesc);
    }

    public final ArrayList<Enabledservice> getEnabledservice() {
        return this.enabledservice;
    }

    public final String getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public int hashCode() {
        return (((this.enabledservice.hashCode() * 31) + this.statusCode.hashCode()) * 31) + this.statusDesc.hashCode();
    }

    public String toString() {
        return "EnableServiceResponse(enabledservice=" + this.enabledservice + ", statusCode=" + this.statusCode + ", statusDesc=" + this.statusDesc + ')';
    }
}
