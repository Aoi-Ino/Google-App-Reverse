package com.nic.mparivahan.Citizen.Models;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class GetLastViolation {
    private final CitizenViolation citizenViolation;
    private final String statusCode;
    private final String statusDesc;

    public GetLastViolation(CitizenViolation citizenViolation2, String str, String str2) {
        l.f(citizenViolation2, "citizenViolation");
        l.f(str, "statusCode");
        l.f(str2, "statusDesc");
        this.citizenViolation = citizenViolation2;
        this.statusCode = str;
        this.statusDesc = str2;
    }

    public static /* synthetic */ GetLastViolation copy$default(GetLastViolation getLastViolation, CitizenViolation citizenViolation2, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            citizenViolation2 = getLastViolation.citizenViolation;
        }
        if ((i10 & 2) != 0) {
            str = getLastViolation.statusCode;
        }
        if ((i10 & 4) != 0) {
            str2 = getLastViolation.statusDesc;
        }
        return getLastViolation.copy(citizenViolation2, str, str2);
    }

    public final CitizenViolation component1() {
        return this.citizenViolation;
    }

    public final String component2() {
        return this.statusCode;
    }

    public final String component3() {
        return this.statusDesc;
    }

    public final GetLastViolation copy(CitizenViolation citizenViolation2, String str, String str2) {
        l.f(citizenViolation2, "citizenViolation");
        l.f(str, "statusCode");
        l.f(str2, "statusDesc");
        return new GetLastViolation(citizenViolation2, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetLastViolation)) {
            return false;
        }
        GetLastViolation getLastViolation = (GetLastViolation) obj;
        return l.a(this.citizenViolation, getLastViolation.citizenViolation) && l.a(this.statusCode, getLastViolation.statusCode) && l.a(this.statusDesc, getLastViolation.statusDesc);
    }

    public final CitizenViolation getCitizenViolation() {
        return this.citizenViolation;
    }

    public final String getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public int hashCode() {
        return (((this.citizenViolation.hashCode() * 31) + this.statusCode.hashCode()) * 31) + this.statusDesc.hashCode();
    }

    public String toString() {
        return "GetLastViolation(citizenViolation=" + this.citizenViolation + ", statusCode=" + this.statusCode + ", statusDesc=" + this.statusDesc + ')';
    }
}
