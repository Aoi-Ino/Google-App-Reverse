package com.nic.mparivahan.DLServicesAuth.eKyc.NewService.NewServPojo;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class EkycImplState {
    private final String ekycIsRtoCode;
    private final String ekycIsStCode;
    private final String ekycIsStatus;
    private final int ekycIsTrcd;

    public EkycImplState(String str, String str2, String str3, int i10) {
        l.f(str, "ekycIsRtoCode");
        l.f(str2, "ekycIsStCode");
        l.f(str3, "ekycIsStatus");
        this.ekycIsRtoCode = str;
        this.ekycIsStCode = str2;
        this.ekycIsStatus = str3;
        this.ekycIsTrcd = i10;
    }

    public static /* synthetic */ EkycImplState copy$default(EkycImplState ekycImplState, String str, String str2, String str3, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = ekycImplState.ekycIsRtoCode;
        }
        if ((i11 & 2) != 0) {
            str2 = ekycImplState.ekycIsStCode;
        }
        if ((i11 & 4) != 0) {
            str3 = ekycImplState.ekycIsStatus;
        }
        if ((i11 & 8) != 0) {
            i10 = ekycImplState.ekycIsTrcd;
        }
        return ekycImplState.copy(str, str2, str3, i10);
    }

    public final String component1() {
        return this.ekycIsRtoCode;
    }

    public final String component2() {
        return this.ekycIsStCode;
    }

    public final String component3() {
        return this.ekycIsStatus;
    }

    public final int component4() {
        return this.ekycIsTrcd;
    }

    public final EkycImplState copy(String str, String str2, String str3, int i10) {
        l.f(str, "ekycIsRtoCode");
        l.f(str2, "ekycIsStCode");
        l.f(str3, "ekycIsStatus");
        return new EkycImplState(str, str2, str3, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EkycImplState)) {
            return false;
        }
        EkycImplState ekycImplState = (EkycImplState) obj;
        return l.a(this.ekycIsRtoCode, ekycImplState.ekycIsRtoCode) && l.a(this.ekycIsStCode, ekycImplState.ekycIsStCode) && l.a(this.ekycIsStatus, ekycImplState.ekycIsStatus) && this.ekycIsTrcd == ekycImplState.ekycIsTrcd;
    }

    public final String getEkycIsRtoCode() {
        return this.ekycIsRtoCode;
    }

    public final String getEkycIsStCode() {
        return this.ekycIsStCode;
    }

    public final String getEkycIsStatus() {
        return this.ekycIsStatus;
    }

    public final int getEkycIsTrcd() {
        return this.ekycIsTrcd;
    }

    public int hashCode() {
        return (((((this.ekycIsRtoCode.hashCode() * 31) + this.ekycIsStCode.hashCode()) * 31) + this.ekycIsStatus.hashCode()) * 31) + Integer.hashCode(this.ekycIsTrcd);
    }

    public String toString() {
        return "EkycImplState(ekycIsRtoCode=" + this.ekycIsRtoCode + ", ekycIsStCode=" + this.ekycIsStCode + ", ekycIsStatus=" + this.ekycIsStatus + ", ekycIsTrcd=" + this.ekycIsTrcd + ')';
    }
}
