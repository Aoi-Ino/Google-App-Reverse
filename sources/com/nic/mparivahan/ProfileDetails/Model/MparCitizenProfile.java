package com.nic.mparivahan.ProfileDetails.Model;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class MparCitizenProfile {
    private final String cpBloodGrp;
    private final int cpCtzId;
    private final String cpDob;
    private final String cpGender;
    private final int cpHeight;
    private final int cpRecordId;
    private final int cpWeight;

    public MparCitizenProfile(String str, int i10, String str2, String str3, int i11, int i12, int i13) {
        l.f(str, "cpBloodGrp");
        l.f(str2, "cpDob");
        l.f(str3, "cpGender");
        this.cpBloodGrp = str;
        this.cpCtzId = i10;
        this.cpDob = str2;
        this.cpGender = str3;
        this.cpHeight = i11;
        this.cpRecordId = i12;
        this.cpWeight = i13;
    }

    public static /* synthetic */ MparCitizenProfile copy$default(MparCitizenProfile mparCitizenProfile, String str, int i10, String str2, String str3, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = mparCitizenProfile.cpBloodGrp;
        }
        if ((i14 & 2) != 0) {
            i10 = mparCitizenProfile.cpCtzId;
        }
        int i15 = i10;
        if ((i14 & 4) != 0) {
            str2 = mparCitizenProfile.cpDob;
        }
        String str4 = str2;
        if ((i14 & 8) != 0) {
            str3 = mparCitizenProfile.cpGender;
        }
        String str5 = str3;
        if ((i14 & 16) != 0) {
            i11 = mparCitizenProfile.cpHeight;
        }
        int i16 = i11;
        if ((i14 & 32) != 0) {
            i12 = mparCitizenProfile.cpRecordId;
        }
        int i17 = i12;
        if ((i14 & 64) != 0) {
            i13 = mparCitizenProfile.cpWeight;
        }
        return mparCitizenProfile.copy(str, i15, str4, str5, i16, i17, i13);
    }

    public final String component1() {
        return this.cpBloodGrp;
    }

    public final int component2() {
        return this.cpCtzId;
    }

    public final String component3() {
        return this.cpDob;
    }

    public final String component4() {
        return this.cpGender;
    }

    public final int component5() {
        return this.cpHeight;
    }

    public final int component6() {
        return this.cpRecordId;
    }

    public final int component7() {
        return this.cpWeight;
    }

    public final MparCitizenProfile copy(String str, int i10, String str2, String str3, int i11, int i12, int i13) {
        l.f(str, "cpBloodGrp");
        l.f(str2, "cpDob");
        l.f(str3, "cpGender");
        return new MparCitizenProfile(str, i10, str2, str3, i11, i12, i13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MparCitizenProfile)) {
            return false;
        }
        MparCitizenProfile mparCitizenProfile = (MparCitizenProfile) obj;
        return l.a(this.cpBloodGrp, mparCitizenProfile.cpBloodGrp) && this.cpCtzId == mparCitizenProfile.cpCtzId && l.a(this.cpDob, mparCitizenProfile.cpDob) && l.a(this.cpGender, mparCitizenProfile.cpGender) && this.cpHeight == mparCitizenProfile.cpHeight && this.cpRecordId == mparCitizenProfile.cpRecordId && this.cpWeight == mparCitizenProfile.cpWeight;
    }

    public final String getCpBloodGrp() {
        return this.cpBloodGrp;
    }

    public final int getCpCtzId() {
        return this.cpCtzId;
    }

    public final String getCpDob() {
        return this.cpDob;
    }

    public final String getCpGender() {
        return this.cpGender;
    }

    public final int getCpHeight() {
        return this.cpHeight;
    }

    public final int getCpRecordId() {
        return this.cpRecordId;
    }

    public final int getCpWeight() {
        return this.cpWeight;
    }

    public int hashCode() {
        return (((((((((((this.cpBloodGrp.hashCode() * 31) + Integer.hashCode(this.cpCtzId)) * 31) + this.cpDob.hashCode()) * 31) + this.cpGender.hashCode()) * 31) + Integer.hashCode(this.cpHeight)) * 31) + Integer.hashCode(this.cpRecordId)) * 31) + Integer.hashCode(this.cpWeight);
    }

    public String toString() {
        return "MparCitizenProfile(cpBloodGrp=" + this.cpBloodGrp + ", cpCtzId=" + this.cpCtzId + ", cpDob=" + this.cpDob + ", cpGender=" + this.cpGender + ", cpHeight=" + this.cpHeight + ", cpRecordId=" + this.cpRecordId + ", cpWeight=" + this.cpWeight + ')';
    }
}
