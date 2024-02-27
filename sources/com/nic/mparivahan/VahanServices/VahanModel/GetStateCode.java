package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class GetStateCode {
    private final String errorDesc;
    private final String errorcode;
    private final int offCd;
    private final String stateCd;

    public GetStateCode(int i10, String str, String str2, String str3) {
        l.f(str, "stateCd");
        this.offCd = i10;
        this.stateCd = str;
        this.errorcode = str2;
        this.errorDesc = str3;
    }

    public static /* synthetic */ GetStateCode copy$default(GetStateCode getStateCode, int i10, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = getStateCode.offCd;
        }
        if ((i11 & 2) != 0) {
            str = getStateCode.stateCd;
        }
        if ((i11 & 4) != 0) {
            str2 = getStateCode.errorcode;
        }
        if ((i11 & 8) != 0) {
            str3 = getStateCode.errorDesc;
        }
        return getStateCode.copy(i10, str, str2, str3);
    }

    public final int component1() {
        return this.offCd;
    }

    public final String component2() {
        return this.stateCd;
    }

    public final String component3() {
        return this.errorcode;
    }

    public final String component4() {
        return this.errorDesc;
    }

    public final GetStateCode copy(int i10, String str, String str2, String str3) {
        l.f(str, "stateCd");
        return new GetStateCode(i10, str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetStateCode)) {
            return false;
        }
        GetStateCode getStateCode = (GetStateCode) obj;
        return this.offCd == getStateCode.offCd && l.a(this.stateCd, getStateCode.stateCd) && l.a(this.errorcode, getStateCode.errorcode) && l.a(this.errorDesc, getStateCode.errorDesc);
    }

    public final String getErrorDesc() {
        return this.errorDesc;
    }

    public final String getErrorcode() {
        return this.errorcode;
    }

    public final int getOffCd() {
        return this.offCd;
    }

    public final String getStateCd() {
        return this.stateCd;
    }

    public int hashCode() {
        int hashCode = ((Integer.hashCode(this.offCd) * 31) + this.stateCd.hashCode()) * 31;
        String str = this.errorcode;
        int i10 = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.errorDesc;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        return "GetStateCode(offCd=" + this.offCd + ", stateCd=" + this.stateCd + ", errorcode=" + this.errorcode + ", errorDesc=" + this.errorDesc + ')';
    }
}
