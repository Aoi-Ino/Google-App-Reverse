package com.nic.mparivahan.LLMainScreen.UpdatedFetchDetails;

import androidx.annotation.Keep;
import cm.l;
import java.io.Serializable;

@Keep
public final class Covobj implements Serializable {
    private final String covAbbr;
    private final int covCd;
    private final String covType;

    public Covobj(String str, int i10, String str2) {
        l.f(str, "covAbbr");
        l.f(str2, "covType");
        this.covAbbr = str;
        this.covCd = i10;
        this.covType = str2;
    }

    public static /* synthetic */ Covobj copy$default(Covobj covobj, String str, int i10, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = covobj.covAbbr;
        }
        if ((i11 & 2) != 0) {
            i10 = covobj.covCd;
        }
        if ((i11 & 4) != 0) {
            str2 = covobj.covType;
        }
        return covobj.copy(str, i10, str2);
    }

    public final String component1() {
        return this.covAbbr;
    }

    public final int component2() {
        return this.covCd;
    }

    public final String component3() {
        return this.covType;
    }

    public final Covobj copy(String str, int i10, String str2) {
        l.f(str, "covAbbr");
        l.f(str2, "covType");
        return new Covobj(str, i10, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Covobj)) {
            return false;
        }
        Covobj covobj = (Covobj) obj;
        return l.a(this.covAbbr, covobj.covAbbr) && this.covCd == covobj.covCd && l.a(this.covType, covobj.covType);
    }

    public final String getCovAbbr() {
        return this.covAbbr;
    }

    public final int getCovCd() {
        return this.covCd;
    }

    public final String getCovType() {
        return this.covType;
    }

    public int hashCode() {
        return (((this.covAbbr.hashCode() * 31) + Integer.hashCode(this.covCd)) * 31) + this.covType.hashCode();
    }

    public String toString() {
        return "Covobj(covAbbr=" + this.covAbbr + ", covCd=" + this.covCd + ", covType=" + this.covType + ')';
    }
}
