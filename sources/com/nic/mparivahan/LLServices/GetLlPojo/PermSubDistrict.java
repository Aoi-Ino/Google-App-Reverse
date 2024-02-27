package com.nic.mparivahan.LLServices.GetLlPojo;

import androidx.annotation.Keep;
import cm.l;
import java.io.Serializable;

@Keep
public final class PermSubDistrict implements Serializable {
    private final String permSubDistCode;
    private final String permSubDistName;

    public PermSubDistrict(String str, String str2) {
        l.f(str, "permSubDistCode");
        l.f(str2, "permSubDistName");
        this.permSubDistCode = str;
        this.permSubDistName = str2;
    }

    public static /* synthetic */ PermSubDistrict copy$default(PermSubDistrict permSubDistrict, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = permSubDistrict.permSubDistCode;
        }
        if ((i10 & 2) != 0) {
            str2 = permSubDistrict.permSubDistName;
        }
        return permSubDistrict.copy(str, str2);
    }

    public final String component1() {
        return this.permSubDistCode;
    }

    public final String component2() {
        return this.permSubDistName;
    }

    public final PermSubDistrict copy(String str, String str2) {
        l.f(str, "permSubDistCode");
        l.f(str2, "permSubDistName");
        return new PermSubDistrict(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PermSubDistrict)) {
            return false;
        }
        PermSubDistrict permSubDistrict = (PermSubDistrict) obj;
        return l.a(this.permSubDistCode, permSubDistrict.permSubDistCode) && l.a(this.permSubDistName, permSubDistrict.permSubDistName);
    }

    public final String getPermSubDistCode() {
        return this.permSubDistCode;
    }

    public final String getPermSubDistName() {
        return this.permSubDistName;
    }

    public int hashCode() {
        return (this.permSubDistCode.hashCode() * 31) + this.permSubDistName.hashCode();
    }

    public String toString() {
        return "PermSubDistrict(permSubDistCode=" + this.permSubDistCode + ", permSubDistName=" + this.permSubDistName + ')';
    }
}
