package com.nic.mparivahan.LLServices.GetLlPojo;

import androidx.annotation.Keep;
import cm.l;
import java.io.Serializable;

@Keep
public final class PermCity implements Serializable {
    private final String permVillCode;
    private final String permVillName;

    public PermCity(String str, String str2) {
        l.f(str, "permVillCode");
        l.f(str2, "permVillName");
        this.permVillCode = str;
        this.permVillName = str2;
    }

    public static /* synthetic */ PermCity copy$default(PermCity permCity, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = permCity.permVillCode;
        }
        if ((i10 & 2) != 0) {
            str2 = permCity.permVillName;
        }
        return permCity.copy(str, str2);
    }

    public final String component1() {
        return this.permVillCode;
    }

    public final String component2() {
        return this.permVillName;
    }

    public final PermCity copy(String str, String str2) {
        l.f(str, "permVillCode");
        l.f(str2, "permVillName");
        return new PermCity(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PermCity)) {
            return false;
        }
        PermCity permCity = (PermCity) obj;
        return l.a(this.permVillCode, permCity.permVillCode) && l.a(this.permVillName, permCity.permVillName);
    }

    public final String getPermVillCode() {
        return this.permVillCode;
    }

    public final String getPermVillName() {
        return this.permVillName;
    }

    public int hashCode() {
        return (this.permVillCode.hashCode() * 31) + this.permVillName.hashCode();
    }

    public String toString() {
        return "PermCity(permVillCode=" + this.permVillCode + ", permVillName=" + this.permVillName + ')';
    }
}
