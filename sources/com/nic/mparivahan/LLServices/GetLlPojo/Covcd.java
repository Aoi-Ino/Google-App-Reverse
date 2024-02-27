package com.nic.mparivahan.LLServices.GetLlPojo;

import androidx.annotation.Keep;
import cm.l;
import java.io.Serializable;

@Keep
public final class Covcd implements Serializable {
    private final String dschoolCovCode;
    private final String dschoolCovName;

    public Covcd(String str, String str2) {
        l.f(str, "dschoolCovCode");
        l.f(str2, "dschoolCovName");
        this.dschoolCovCode = str;
        this.dschoolCovName = str2;
    }

    public static /* synthetic */ Covcd copy$default(Covcd covcd, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = covcd.dschoolCovCode;
        }
        if ((i10 & 2) != 0) {
            str2 = covcd.dschoolCovName;
        }
        return covcd.copy(str, str2);
    }

    public final String component1() {
        return this.dschoolCovCode;
    }

    public final String component2() {
        return this.dschoolCovName;
    }

    public final Covcd copy(String str, String str2) {
        l.f(str, "dschoolCovCode");
        l.f(str2, "dschoolCovName");
        return new Covcd(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Covcd)) {
            return false;
        }
        Covcd covcd = (Covcd) obj;
        return l.a(this.dschoolCovCode, covcd.dschoolCovCode) && l.a(this.dschoolCovName, covcd.dschoolCovName);
    }

    public final String getDschoolCovCode() {
        return this.dschoolCovCode;
    }

    public final String getDschoolCovName() {
        return this.dschoolCovName;
    }

    public int hashCode() {
        return (this.dschoolCovCode.hashCode() * 31) + this.dschoolCovName.hashCode();
    }

    public String toString() {
        return "Covcd(dschoolCovCode=" + this.dschoolCovCode + ", dschoolCovName=" + this.dschoolCovName + ')';
    }
}
