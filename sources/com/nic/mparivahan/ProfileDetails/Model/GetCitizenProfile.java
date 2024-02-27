package com.nic.mparivahan.ProfileDetails.Model;

import androidx.annotation.Keep;
import cm.l;
import java.util.List;

@Keep
public final class GetCitizenProfile {
    private final List<CitizenprofileInfo> citizenprofileInfo;
    private final String statusCode;
    private final String statusDesc;

    public GetCitizenProfile(List<CitizenprofileInfo> list, String str, String str2) {
        l.f(list, "citizenprofileInfo");
        l.f(str, "statusCode");
        l.f(str2, "statusDesc");
        this.citizenprofileInfo = list;
        this.statusCode = str;
        this.statusDesc = str2;
    }

    public static /* synthetic */ GetCitizenProfile copy$default(GetCitizenProfile getCitizenProfile, List<CitizenprofileInfo> list, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = getCitizenProfile.citizenprofileInfo;
        }
        if ((i10 & 2) != 0) {
            str = getCitizenProfile.statusCode;
        }
        if ((i10 & 4) != 0) {
            str2 = getCitizenProfile.statusDesc;
        }
        return getCitizenProfile.copy(list, str, str2);
    }

    public final List<CitizenprofileInfo> component1() {
        return this.citizenprofileInfo;
    }

    public final String component2() {
        return this.statusCode;
    }

    public final String component3() {
        return this.statusDesc;
    }

    public final GetCitizenProfile copy(List<CitizenprofileInfo> list, String str, String str2) {
        l.f(list, "citizenprofileInfo");
        l.f(str, "statusCode");
        l.f(str2, "statusDesc");
        return new GetCitizenProfile(list, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetCitizenProfile)) {
            return false;
        }
        GetCitizenProfile getCitizenProfile = (GetCitizenProfile) obj;
        return l.a(this.citizenprofileInfo, getCitizenProfile.citizenprofileInfo) && l.a(this.statusCode, getCitizenProfile.statusCode) && l.a(this.statusDesc, getCitizenProfile.statusDesc);
    }

    public final List<CitizenprofileInfo> getCitizenprofileInfo() {
        return this.citizenprofileInfo;
    }

    public final String getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public int hashCode() {
        return (((this.citizenprofileInfo.hashCode() * 31) + this.statusCode.hashCode()) * 31) + this.statusDesc.hashCode();
    }

    public String toString() {
        return "GetCitizenProfile(citizenprofileInfo=" + this.citizenprofileInfo + ", statusCode=" + this.statusCode + ", statusDesc=" + this.statusDesc + ')';
    }
}
