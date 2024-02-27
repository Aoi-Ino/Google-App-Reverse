package com.nic.mparivahan.LLServices.GetLlPojo;

import androidx.annotation.Keep;
import cm.l;
import java.io.Serializable;

@Keep
public final class CheckCov implements Serializable {
    private final String covAbbrDesc;
    private final String covCode;

    public CheckCov(String str, String str2) {
        l.f(str, "covAbbrDesc");
        l.f(str2, "covCode");
        this.covAbbrDesc = str;
        this.covCode = str2;
    }

    public static /* synthetic */ CheckCov copy$default(CheckCov checkCov, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = checkCov.covAbbrDesc;
        }
        if ((i10 & 2) != 0) {
            str2 = checkCov.covCode;
        }
        return checkCov.copy(str, str2);
    }

    public final String component1() {
        return this.covAbbrDesc;
    }

    public final String component2() {
        return this.covCode;
    }

    public final CheckCov copy(String str, String str2) {
        l.f(str, "covAbbrDesc");
        l.f(str2, "covCode");
        return new CheckCov(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckCov)) {
            return false;
        }
        CheckCov checkCov = (CheckCov) obj;
        return l.a(this.covAbbrDesc, checkCov.covAbbrDesc) && l.a(this.covCode, checkCov.covCode);
    }

    public final String getCovAbbrDesc() {
        return this.covAbbrDesc;
    }

    public final String getCovCode() {
        return this.covCode;
    }

    public int hashCode() {
        return (this.covAbbrDesc.hashCode() * 31) + this.covCode.hashCode();
    }

    public String toString() {
        return "CheckCov(covAbbrDesc=" + this.covAbbrDesc + ", covCode=" + this.covCode + ')';
    }
}
