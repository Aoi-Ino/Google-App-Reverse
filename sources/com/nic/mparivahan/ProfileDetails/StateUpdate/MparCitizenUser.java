package com.nic.mparivahan.ProfileDetails.StateUpdate;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class MparCitizenUser {
    private final String ctzCreatedAt;
    private final String ctzDispName;
    private final String ctzEmail;
    private final Object ctzImage;
    private final String ctzMobile;
    private final boolean ctzMpinStatus;
    private final long ctzRecordId;
    private final String ctzStateCd;
    private final int ctzStatus;
    private final String ctzUpdatedAt;

    public MparCitizenUser(String str, String str2, String str3, Object obj, String str4, boolean z10, long j10, String str5, int i10, String str6) {
        l.f(str, "ctzCreatedAt");
        l.f(str2, "ctzDispName");
        l.f(str3, "ctzEmail");
        l.f(obj, "ctzImage");
        l.f(str4, "ctzMobile");
        l.f(str5, "ctzStateCd");
        l.f(str6, "ctzUpdatedAt");
        this.ctzCreatedAt = str;
        this.ctzDispName = str2;
        this.ctzEmail = str3;
        this.ctzImage = obj;
        this.ctzMobile = str4;
        this.ctzMpinStatus = z10;
        this.ctzRecordId = j10;
        this.ctzStateCd = str5;
        this.ctzStatus = i10;
        this.ctzUpdatedAt = str6;
    }

    public static /* synthetic */ MparCitizenUser copy$default(MparCitizenUser mparCitizenUser, String str, String str2, String str3, Object obj, String str4, boolean z10, long j10, String str5, int i10, String str6, int i11, Object obj2) {
        MparCitizenUser mparCitizenUser2 = mparCitizenUser;
        int i12 = i11;
        return mparCitizenUser.copy((i12 & 1) != 0 ? mparCitizenUser2.ctzCreatedAt : str, (i12 & 2) != 0 ? mparCitizenUser2.ctzDispName : str2, (i12 & 4) != 0 ? mparCitizenUser2.ctzEmail : str3, (i12 & 8) != 0 ? mparCitizenUser2.ctzImage : obj, (i12 & 16) != 0 ? mparCitizenUser2.ctzMobile : str4, (i12 & 32) != 0 ? mparCitizenUser2.ctzMpinStatus : z10, (i12 & 64) != 0 ? mparCitizenUser2.ctzRecordId : j10, (i12 & 128) != 0 ? mparCitizenUser2.ctzStateCd : str5, (i12 & 256) != 0 ? mparCitizenUser2.ctzStatus : i10, (i12 & 512) != 0 ? mparCitizenUser2.ctzUpdatedAt : str6);
    }

    public final String component1() {
        return this.ctzCreatedAt;
    }

    public final String component10() {
        return this.ctzUpdatedAt;
    }

    public final String component2() {
        return this.ctzDispName;
    }

    public final String component3() {
        return this.ctzEmail;
    }

    public final Object component4() {
        return this.ctzImage;
    }

    public final String component5() {
        return this.ctzMobile;
    }

    public final boolean component6() {
        return this.ctzMpinStatus;
    }

    public final long component7() {
        return this.ctzRecordId;
    }

    public final String component8() {
        return this.ctzStateCd;
    }

    public final int component9() {
        return this.ctzStatus;
    }

    public final MparCitizenUser copy(String str, String str2, String str3, Object obj, String str4, boolean z10, long j10, String str5, int i10, String str6) {
        l.f(str, "ctzCreatedAt");
        l.f(str2, "ctzDispName");
        String str7 = str3;
        l.f(str7, "ctzEmail");
        Object obj2 = obj;
        l.f(obj2, "ctzImage");
        String str8 = str4;
        l.f(str8, "ctzMobile");
        String str9 = str5;
        l.f(str9, "ctzStateCd");
        String str10 = str6;
        l.f(str10, "ctzUpdatedAt");
        return new MparCitizenUser(str, str2, str7, obj2, str8, z10, j10, str9, i10, str10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MparCitizenUser)) {
            return false;
        }
        MparCitizenUser mparCitizenUser = (MparCitizenUser) obj;
        return l.a(this.ctzCreatedAt, mparCitizenUser.ctzCreatedAt) && l.a(this.ctzDispName, mparCitizenUser.ctzDispName) && l.a(this.ctzEmail, mparCitizenUser.ctzEmail) && l.a(this.ctzImage, mparCitizenUser.ctzImage) && l.a(this.ctzMobile, mparCitizenUser.ctzMobile) && this.ctzMpinStatus == mparCitizenUser.ctzMpinStatus && this.ctzRecordId == mparCitizenUser.ctzRecordId && l.a(this.ctzStateCd, mparCitizenUser.ctzStateCd) && this.ctzStatus == mparCitizenUser.ctzStatus && l.a(this.ctzUpdatedAt, mparCitizenUser.ctzUpdatedAt);
    }

    public final String getCtzCreatedAt() {
        return this.ctzCreatedAt;
    }

    public final String getCtzDispName() {
        return this.ctzDispName;
    }

    public final String getCtzEmail() {
        return this.ctzEmail;
    }

    public final Object getCtzImage() {
        return this.ctzImage;
    }

    public final String getCtzMobile() {
        return this.ctzMobile;
    }

    public final boolean getCtzMpinStatus() {
        return this.ctzMpinStatus;
    }

    public final long getCtzRecordId() {
        return this.ctzRecordId;
    }

    public final String getCtzStateCd() {
        return this.ctzStateCd;
    }

    public final int getCtzStatus() {
        return this.ctzStatus;
    }

    public final String getCtzUpdatedAt() {
        return this.ctzUpdatedAt;
    }

    public int hashCode() {
        int hashCode = ((((((((this.ctzCreatedAt.hashCode() * 31) + this.ctzDispName.hashCode()) * 31) + this.ctzEmail.hashCode()) * 31) + this.ctzImage.hashCode()) * 31) + this.ctzMobile.hashCode()) * 31;
        boolean z10 = this.ctzMpinStatus;
        if (z10) {
            z10 = true;
        }
        return ((((((((hashCode + (z10 ? 1 : 0)) * 31) + Long.hashCode(this.ctzRecordId)) * 31) + this.ctzStateCd.hashCode()) * 31) + Integer.hashCode(this.ctzStatus)) * 31) + this.ctzUpdatedAt.hashCode();
    }

    public String toString() {
        return "MparCitizenUser(ctzCreatedAt=" + this.ctzCreatedAt + ", ctzDispName=" + this.ctzDispName + ", ctzEmail=" + this.ctzEmail + ", ctzImage=" + this.ctzImage + ", ctzMobile=" + this.ctzMobile + ", ctzMpinStatus=" + this.ctzMpinStatus + ", ctzRecordId=" + this.ctzRecordId + ", ctzStateCd=" + this.ctzStateCd + ", ctzStatus=" + this.ctzStatus + ", ctzUpdatedAt=" + this.ctzUpdatedAt + ')';
    }
}
