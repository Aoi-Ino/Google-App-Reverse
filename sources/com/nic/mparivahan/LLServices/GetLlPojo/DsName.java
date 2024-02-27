package com.nic.mparivahan.LLServices.GetLlPojo;

import androidx.annotation.Keep;
import cm.l;
import java.io.Serializable;

@Keep
public final class DsName implements Serializable {
    private final String dschoolCode;
    private final String dschoolName;

    public DsName(String str, String str2) {
        l.f(str, "dschoolCode");
        l.f(str2, "dschoolName");
        this.dschoolCode = str;
        this.dschoolName = str2;
    }

    public static /* synthetic */ DsName copy$default(DsName dsName, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = dsName.dschoolCode;
        }
        if ((i10 & 2) != 0) {
            str2 = dsName.dschoolName;
        }
        return dsName.copy(str, str2);
    }

    public final String component1() {
        return this.dschoolCode;
    }

    public final String component2() {
        return this.dschoolName;
    }

    public final DsName copy(String str, String str2) {
        l.f(str, "dschoolCode");
        l.f(str2, "dschoolName");
        return new DsName(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DsName)) {
            return false;
        }
        DsName dsName = (DsName) obj;
        return l.a(this.dschoolCode, dsName.dschoolCode) && l.a(this.dschoolName, dsName.dschoolName);
    }

    public final String getDschoolCode() {
        return this.dschoolCode;
    }

    public final String getDschoolName() {
        return this.dschoolName;
    }

    public int hashCode() {
        return (this.dschoolCode.hashCode() * 31) + this.dschoolName.hashCode();
    }

    public String toString() {
        return "DsName(dschoolCode=" + this.dschoolCode + ", dschoolName=" + this.dschoolName + ')';
    }
}
