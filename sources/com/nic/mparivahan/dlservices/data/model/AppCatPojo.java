package com.nic.mparivahan.dlservices.data.model;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class AppCatPojo {
    private final String appCode;
    private final String appDesc;

    public AppCatPojo(String str, String str2) {
        l.f(str, "appCode");
        l.f(str2, "appDesc");
        this.appCode = str;
        this.appDesc = str2;
    }

    public static /* synthetic */ AppCatPojo copy$default(AppCatPojo appCatPojo, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = appCatPojo.appCode;
        }
        if ((i10 & 2) != 0) {
            str2 = appCatPojo.appDesc;
        }
        return appCatPojo.copy(str, str2);
    }

    public final String component1() {
        return this.appCode;
    }

    public final String component2() {
        return this.appDesc;
    }

    public final AppCatPojo copy(String str, String str2) {
        l.f(str, "appCode");
        l.f(str2, "appDesc");
        return new AppCatPojo(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppCatPojo)) {
            return false;
        }
        AppCatPojo appCatPojo = (AppCatPojo) obj;
        return l.a(this.appCode, appCatPojo.appCode) && l.a(this.appDesc, appCatPojo.appDesc);
    }

    public final String getAppCode() {
        return this.appCode;
    }

    public final String getAppDesc() {
        return this.appDesc;
    }

    public int hashCode() {
        return (this.appCode.hashCode() * 31) + this.appDesc.hashCode();
    }

    public String toString() {
        return "AppCatPojo(appCode=" + this.appCode + ", appDesc=" + this.appDesc + ')';
    }
}
