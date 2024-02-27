package com.nic.mparivahan.DLServicesAuth.Model;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class ServiceCheckPojo {
    private final String Result;
    private final String allowed;
    private final String status_code;
    private final String status_desc;

    public ServiceCheckPojo(String str, String str2, String str3, String str4) {
        l.f(str, "Result");
        l.f(str2, "allowed");
        l.f(str3, "status_code");
        l.f(str4, "status_desc");
        this.Result = str;
        this.allowed = str2;
        this.status_code = str3;
        this.status_desc = str4;
    }

    public static /* synthetic */ ServiceCheckPojo copy$default(ServiceCheckPojo serviceCheckPojo, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = serviceCheckPojo.Result;
        }
        if ((i10 & 2) != 0) {
            str2 = serviceCheckPojo.allowed;
        }
        if ((i10 & 4) != 0) {
            str3 = serviceCheckPojo.status_code;
        }
        if ((i10 & 8) != 0) {
            str4 = serviceCheckPojo.status_desc;
        }
        return serviceCheckPojo.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.Result;
    }

    public final String component2() {
        return this.allowed;
    }

    public final String component3() {
        return this.status_code;
    }

    public final String component4() {
        return this.status_desc;
    }

    public final ServiceCheckPojo copy(String str, String str2, String str3, String str4) {
        l.f(str, "Result");
        l.f(str2, "allowed");
        l.f(str3, "status_code");
        l.f(str4, "status_desc");
        return new ServiceCheckPojo(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServiceCheckPojo)) {
            return false;
        }
        ServiceCheckPojo serviceCheckPojo = (ServiceCheckPojo) obj;
        return l.a(this.Result, serviceCheckPojo.Result) && l.a(this.allowed, serviceCheckPojo.allowed) && l.a(this.status_code, serviceCheckPojo.status_code) && l.a(this.status_desc, serviceCheckPojo.status_desc);
    }

    public final String getAllowed() {
        return this.allowed;
    }

    public final String getResult() {
        return this.Result;
    }

    public final String getStatus_code() {
        return this.status_code;
    }

    public final String getStatus_desc() {
        return this.status_desc;
    }

    public int hashCode() {
        return (((((this.Result.hashCode() * 31) + this.allowed.hashCode()) * 31) + this.status_code.hashCode()) * 31) + this.status_desc.hashCode();
    }

    public String toString() {
        return "ServiceCheckPojo(Result=" + this.Result + ", allowed=" + this.allowed + ", status_code=" + this.status_code + ", status_desc=" + this.status_desc + ')';
    }
}
