package com.nic.mparivahan.LLServices.GetLlPojo;

import androidx.annotation.Keep;
import cm.l;
import java.io.Serializable;

@Keep
public final class PresCity implements Serializable {
    private final String presVillCode;
    private final String presVillName;

    public PresCity(String str, String str2) {
        l.f(str, "presVillCode");
        l.f(str2, "presVillName");
        this.presVillCode = str;
        this.presVillName = str2;
    }

    public static /* synthetic */ PresCity copy$default(PresCity presCity, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = presCity.presVillCode;
        }
        if ((i10 & 2) != 0) {
            str2 = presCity.presVillName;
        }
        return presCity.copy(str, str2);
    }

    public final String component1() {
        return this.presVillCode;
    }

    public final String component2() {
        return this.presVillName;
    }

    public final PresCity copy(String str, String str2) {
        l.f(str, "presVillCode");
        l.f(str2, "presVillName");
        return new PresCity(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PresCity)) {
            return false;
        }
        PresCity presCity = (PresCity) obj;
        return l.a(this.presVillCode, presCity.presVillCode) && l.a(this.presVillName, presCity.presVillName);
    }

    public final String getPresVillCode() {
        return this.presVillCode;
    }

    public final String getPresVillName() {
        return this.presVillName;
    }

    public int hashCode() {
        return (this.presVillCode.hashCode() * 31) + this.presVillName.hashCode();
    }

    public String toString() {
        return "PresCity(presVillCode=" + this.presVillCode + ", presVillName=" + this.presVillName + ')';
    }
}
