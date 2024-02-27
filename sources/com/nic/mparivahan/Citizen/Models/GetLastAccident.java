package com.nic.mparivahan.Citizen.Models;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class GetLastAccident {
    private final MparCitizenAccidentX mparCitizenAccident;
    private final String statusCode;
    private final String statusDesc;

    public GetLastAccident(MparCitizenAccidentX mparCitizenAccidentX, String str, String str2) {
        l.f(mparCitizenAccidentX, "mparCitizenAccident");
        l.f(str, "statusCode");
        l.f(str2, "statusDesc");
        this.mparCitizenAccident = mparCitizenAccidentX;
        this.statusCode = str;
        this.statusDesc = str2;
    }

    public static /* synthetic */ GetLastAccident copy$default(GetLastAccident getLastAccident, MparCitizenAccidentX mparCitizenAccidentX, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            mparCitizenAccidentX = getLastAccident.mparCitizenAccident;
        }
        if ((i10 & 2) != 0) {
            str = getLastAccident.statusCode;
        }
        if ((i10 & 4) != 0) {
            str2 = getLastAccident.statusDesc;
        }
        return getLastAccident.copy(mparCitizenAccidentX, str, str2);
    }

    public final MparCitizenAccidentX component1() {
        return this.mparCitizenAccident;
    }

    public final String component2() {
        return this.statusCode;
    }

    public final String component3() {
        return this.statusDesc;
    }

    public final GetLastAccident copy(MparCitizenAccidentX mparCitizenAccidentX, String str, String str2) {
        l.f(mparCitizenAccidentX, "mparCitizenAccident");
        l.f(str, "statusCode");
        l.f(str2, "statusDesc");
        return new GetLastAccident(mparCitizenAccidentX, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetLastAccident)) {
            return false;
        }
        GetLastAccident getLastAccident = (GetLastAccident) obj;
        return l.a(this.mparCitizenAccident, getLastAccident.mparCitizenAccident) && l.a(this.statusCode, getLastAccident.statusCode) && l.a(this.statusDesc, getLastAccident.statusDesc);
    }

    public final MparCitizenAccidentX getMparCitizenAccident() {
        return this.mparCitizenAccident;
    }

    public final String getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public int hashCode() {
        return (((this.mparCitizenAccident.hashCode() * 31) + this.statusCode.hashCode()) * 31) + this.statusDesc.hashCode();
    }

    public String toString() {
        return "GetLastAccident(mparCitizenAccident=" + this.mparCitizenAccident + ", statusCode=" + this.statusCode + ", statusDesc=" + this.statusDesc + ')';
    }
}
