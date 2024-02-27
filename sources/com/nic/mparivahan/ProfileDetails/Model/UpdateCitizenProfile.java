package com.nic.mparivahan.ProfileDetails.Model;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class UpdateCitizenProfile {
    private final MparCitizenProfile mparCitizenProfile;
    private final String statusCode;
    private final String statusDesc;

    public UpdateCitizenProfile(String str, String str2, MparCitizenProfile mparCitizenProfile2) {
        l.f(str, "statusCode");
        l.f(str2, "statusDesc");
        l.f(mparCitizenProfile2, "mparCitizenProfile");
        this.statusCode = str;
        this.statusDesc = str2;
        this.mparCitizenProfile = mparCitizenProfile2;
    }

    public static /* synthetic */ UpdateCitizenProfile copy$default(UpdateCitizenProfile updateCitizenProfile, String str, String str2, MparCitizenProfile mparCitizenProfile2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = updateCitizenProfile.statusCode;
        }
        if ((i10 & 2) != 0) {
            str2 = updateCitizenProfile.statusDesc;
        }
        if ((i10 & 4) != 0) {
            mparCitizenProfile2 = updateCitizenProfile.mparCitizenProfile;
        }
        return updateCitizenProfile.copy(str, str2, mparCitizenProfile2);
    }

    public final String component1() {
        return this.statusCode;
    }

    public final String component2() {
        return this.statusDesc;
    }

    public final MparCitizenProfile component3() {
        return this.mparCitizenProfile;
    }

    public final UpdateCitizenProfile copy(String str, String str2, MparCitizenProfile mparCitizenProfile2) {
        l.f(str, "statusCode");
        l.f(str2, "statusDesc");
        l.f(mparCitizenProfile2, "mparCitizenProfile");
        return new UpdateCitizenProfile(str, str2, mparCitizenProfile2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdateCitizenProfile)) {
            return false;
        }
        UpdateCitizenProfile updateCitizenProfile = (UpdateCitizenProfile) obj;
        return l.a(this.statusCode, updateCitizenProfile.statusCode) && l.a(this.statusDesc, updateCitizenProfile.statusDesc) && l.a(this.mparCitizenProfile, updateCitizenProfile.mparCitizenProfile);
    }

    public final MparCitizenProfile getMparCitizenProfile() {
        return this.mparCitizenProfile;
    }

    public final String getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public int hashCode() {
        return (((this.statusCode.hashCode() * 31) + this.statusDesc.hashCode()) * 31) + this.mparCitizenProfile.hashCode();
    }

    public String toString() {
        return "UpdateCitizenProfile(statusCode=" + this.statusCode + ", statusDesc=" + this.statusDesc + ", mparCitizenProfile=" + this.mparCitizenProfile + ')';
    }
}
