package com.nic.mparivahan.LLMainScreen.UpdatedFetchDetails;

import androidx.annotation.Keep;
import cm.l;
import java.io.Serializable;

@Keep
public final class RTO implements Serializable {
    private final String RTOCd;
    private final String RTOName;

    public RTO(String str, String str2) {
        l.f(str, "RTOCd");
        l.f(str2, "RTOName");
        this.RTOCd = str;
        this.RTOName = str2;
    }

    public static /* synthetic */ RTO copy$default(RTO rto, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = rto.RTOCd;
        }
        if ((i10 & 2) != 0) {
            str2 = rto.RTOName;
        }
        return rto.copy(str, str2);
    }

    public final String component1() {
        return this.RTOCd;
    }

    public final String component2() {
        return this.RTOName;
    }

    public final RTO copy(String str, String str2) {
        l.f(str, "RTOCd");
        l.f(str2, "RTOName");
        return new RTO(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RTO)) {
            return false;
        }
        RTO rto = (RTO) obj;
        return l.a(this.RTOCd, rto.RTOCd) && l.a(this.RTOName, rto.RTOName);
    }

    public final String getRTOCd() {
        return this.RTOCd;
    }

    public final String getRTOName() {
        return this.RTOName;
    }

    public int hashCode() {
        return (this.RTOCd.hashCode() * 31) + this.RTOName.hashCode();
    }

    public String toString() {
        return "RTO(RTOCd=" + this.RTOCd + ", RTOName=" + this.RTOName + ')';
    }
}
