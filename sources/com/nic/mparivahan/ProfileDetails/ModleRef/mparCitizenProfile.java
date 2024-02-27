package com.nic.mparivahan.ProfileDetails.ModleRef;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class mparCitizenProfile {
    private final String cpBloodGrp;
    private final String cpCreatedAt;
    private final int cpCtzId;
    private final String cpDob;
    private final String cpGender;
    private final int cpHeight;
    private final int cpRecordId;
    private final String cpUpdatedAt;
    private final int cpWeight;

    public mparCitizenProfile(String str, String str2, int i10, String str3, String str4, int i11, int i12, String str5, int i13) {
        l.f(str, "cpBloodGrp");
        l.f(str2, "cpCreatedAt");
        l.f(str3, "cpDob");
        l.f(str4, "cpGender");
        l.f(str5, "cpUpdatedAt");
        this.cpBloodGrp = str;
        this.cpCreatedAt = str2;
        this.cpCtzId = i10;
        this.cpDob = str3;
        this.cpGender = str4;
        this.cpHeight = i11;
        this.cpRecordId = i12;
        this.cpUpdatedAt = str5;
        this.cpWeight = i13;
    }

    public static /* synthetic */ mparCitizenProfile copy$default(mparCitizenProfile mparcitizenprofile, String str, String str2, int i10, String str3, String str4, int i11, int i12, String str5, int i13, int i14, Object obj) {
        mparCitizenProfile mparcitizenprofile2 = mparcitizenprofile;
        int i15 = i14;
        return mparcitizenprofile.copy((i15 & 1) != 0 ? mparcitizenprofile2.cpBloodGrp : str, (i15 & 2) != 0 ? mparcitizenprofile2.cpCreatedAt : str2, (i15 & 4) != 0 ? mparcitizenprofile2.cpCtzId : i10, (i15 & 8) != 0 ? mparcitizenprofile2.cpDob : str3, (i15 & 16) != 0 ? mparcitizenprofile2.cpGender : str4, (i15 & 32) != 0 ? mparcitizenprofile2.cpHeight : i11, (i15 & 64) != 0 ? mparcitizenprofile2.cpRecordId : i12, (i15 & 128) != 0 ? mparcitizenprofile2.cpUpdatedAt : str5, (i15 & 256) != 0 ? mparcitizenprofile2.cpWeight : i13);
    }

    public final String component1() {
        return this.cpBloodGrp;
    }

    public final String component2() {
        return this.cpCreatedAt;
    }

    public final int component3() {
        return this.cpCtzId;
    }

    public final String component4() {
        return this.cpDob;
    }

    public final String component5() {
        return this.cpGender;
    }

    public final int component6() {
        return this.cpHeight;
    }

    public final int component7() {
        return this.cpRecordId;
    }

    public final String component8() {
        return this.cpUpdatedAt;
    }

    public final int component9() {
        return this.cpWeight;
    }

    public final mparCitizenProfile copy(String str, String str2, int i10, String str3, String str4, int i11, int i12, String str5, int i13) {
        l.f(str, "cpBloodGrp");
        l.f(str2, "cpCreatedAt");
        l.f(str3, "cpDob");
        String str6 = str4;
        l.f(str6, "cpGender");
        String str7 = str5;
        l.f(str7, "cpUpdatedAt");
        return new mparCitizenProfile(str, str2, i10, str3, str6, i11, i12, str7, i13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mparCitizenProfile)) {
            return false;
        }
        mparCitizenProfile mparcitizenprofile = (mparCitizenProfile) obj;
        return l.a(this.cpBloodGrp, mparcitizenprofile.cpBloodGrp) && l.a(this.cpCreatedAt, mparcitizenprofile.cpCreatedAt) && this.cpCtzId == mparcitizenprofile.cpCtzId && l.a(this.cpDob, mparcitizenprofile.cpDob) && l.a(this.cpGender, mparcitizenprofile.cpGender) && this.cpHeight == mparcitizenprofile.cpHeight && this.cpRecordId == mparcitizenprofile.cpRecordId && l.a(this.cpUpdatedAt, mparcitizenprofile.cpUpdatedAt) && this.cpWeight == mparcitizenprofile.cpWeight;
    }

    public final String getCpBloodGrp() {
        return this.cpBloodGrp;
    }

    public final String getCpCreatedAt() {
        return this.cpCreatedAt;
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

    public final String getCpUpdatedAt() {
        return this.cpUpdatedAt;
    }

    public final int getCpWeight() {
        return this.cpWeight;
    }

    public int hashCode() {
        return (((((((((((((((this.cpBloodGrp.hashCode() * 31) + this.cpCreatedAt.hashCode()) * 31) + Integer.hashCode(this.cpCtzId)) * 31) + this.cpDob.hashCode()) * 31) + this.cpGender.hashCode()) * 31) + Integer.hashCode(this.cpHeight)) * 31) + Integer.hashCode(this.cpRecordId)) * 31) + this.cpUpdatedAt.hashCode()) * 31) + Integer.hashCode(this.cpWeight);
    }

    public String toString() {
        return "mparCitizenProfile(cpBloodGrp=" + this.cpBloodGrp + ", cpCreatedAt=" + this.cpCreatedAt + ", cpCtzId=" + this.cpCtzId + ", cpDob=" + this.cpDob + ", cpGender=" + this.cpGender + ", cpHeight=" + this.cpHeight + ", cpRecordId=" + this.cpRecordId + ", cpUpdatedAt=" + this.cpUpdatedAt + ", cpWeight=" + this.cpWeight + ')';
    }
}
