package com.nic.mparivahan.ProfileDetails.ModleRef;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class profiledetails {
    private final mparCitizenProfile mparCitizenProfile;
    private final String statusCode;
    private final String statusDesc;

    public profiledetails(mparCitizenProfile mparcitizenprofile, String str, String str2) {
        l.f(mparcitizenprofile, "mparCitizenProfile");
        l.f(str, "statusCode");
        l.f(str2, "statusDesc");
        this.mparCitizenProfile = mparcitizenprofile;
        this.statusCode = str;
        this.statusDesc = str2;
    }

    public static /* synthetic */ profiledetails copy$default(profiledetails profiledetails, mparCitizenProfile mparcitizenprofile, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            mparcitizenprofile = profiledetails.mparCitizenProfile;
        }
        if ((i10 & 2) != 0) {
            str = profiledetails.statusCode;
        }
        if ((i10 & 4) != 0) {
            str2 = profiledetails.statusDesc;
        }
        return profiledetails.copy(mparcitizenprofile, str, str2);
    }

    public final mparCitizenProfile component1() {
        return this.mparCitizenProfile;
    }

    public final String component2() {
        return this.statusCode;
    }

    public final String component3() {
        return this.statusDesc;
    }

    public final profiledetails copy(mparCitizenProfile mparcitizenprofile, String str, String str2) {
        l.f(mparcitizenprofile, "mparCitizenProfile");
        l.f(str, "statusCode");
        l.f(str2, "statusDesc");
        return new profiledetails(mparcitizenprofile, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof profiledetails)) {
            return false;
        }
        profiledetails profiledetails = (profiledetails) obj;
        return l.a(this.mparCitizenProfile, profiledetails.mparCitizenProfile) && l.a(this.statusCode, profiledetails.statusCode) && l.a(this.statusDesc, profiledetails.statusDesc);
    }

    public final mparCitizenProfile getMparCitizenProfile() {
        return this.mparCitizenProfile;
    }

    public final String getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public int hashCode() {
        return (((this.mparCitizenProfile.hashCode() * 31) + this.statusCode.hashCode()) * 31) + this.statusDesc.hashCode();
    }

    public String toString() {
        return "profiledetails(mparCitizenProfile=" + this.mparCitizenProfile + ", statusCode=" + this.statusCode + ", statusDesc=" + this.statusDesc + ')';
    }
}
