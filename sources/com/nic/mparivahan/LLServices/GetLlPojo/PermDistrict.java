package com.nic.mparivahan.LLServices.GetLlPojo;

import androidx.annotation.Keep;
import cm.l;
import java.io.Serializable;

@Keep
public final class PermDistrict implements Serializable {
    private final String permDistCode;
    private final String permDistName;

    public PermDistrict(String str, String str2) {
        l.f(str, "permDistCode");
        l.f(str2, "permDistName");
        this.permDistCode = str;
        this.permDistName = str2;
    }

    public static /* synthetic */ PermDistrict copy$default(PermDistrict permDistrict, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = permDistrict.permDistCode;
        }
        if ((i10 & 2) != 0) {
            str2 = permDistrict.permDistName;
        }
        return permDistrict.copy(str, str2);
    }

    public final String component1() {
        return this.permDistCode;
    }

    public final String component2() {
        return this.permDistName;
    }

    public final PermDistrict copy(String str, String str2) {
        l.f(str, "permDistCode");
        l.f(str2, "permDistName");
        return new PermDistrict(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PermDistrict)) {
            return false;
        }
        PermDistrict permDistrict = (PermDistrict) obj;
        return l.a(this.permDistCode, permDistrict.permDistCode) && l.a(this.permDistName, permDistrict.permDistName);
    }

    public final String getPermDistCode() {
        return this.permDistCode;
    }

    public final String getPermDistName() {
        return this.permDistName;
    }

    public int hashCode() {
        return (this.permDistCode.hashCode() * 31) + this.permDistName.hashCode();
    }

    public String toString() {
        return "PermDistrict(permDistCode=" + this.permDistCode + ", permDistName=" + this.permDistName + ')';
    }
}
