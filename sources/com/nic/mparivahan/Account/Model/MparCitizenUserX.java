package com.nic.mparivahan.Account.Model;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class MparCitizenUserX {
    private final String ctzCreatedAt;
    private final String ctzDispName;
    private final String ctzEmail;
    private final String ctzImage;
    private final String ctzMobile;
    private final boolean ctzMpinStatus;
    private final long ctzRecordId;
    private final String ctzStateCd;
    private final int ctzStatus;
    private final String ctzToken;
    private final String ctzTokenAt;
    private final String ctzUpdatedAt;

    public MparCitizenUserX(String str, String str2, String str3, String str4, String str5, boolean z10, long j10, String str6, int i10, String str7, String str8, String str9) {
        l.f(str, "ctzCreatedAt");
        l.f(str2, "ctzDispName");
        l.f(str3, "ctzEmail");
        l.f(str4, "ctzImage");
        l.f(str5, "ctzMobile");
        l.f(str6, "ctzStateCd");
        l.f(str7, "ctzToken");
        l.f(str8, "ctzTokenAt");
        l.f(str9, "ctzUpdatedAt");
        this.ctzCreatedAt = str;
        this.ctzDispName = str2;
        this.ctzEmail = str3;
        this.ctzImage = str4;
        this.ctzMobile = str5;
        this.ctzMpinStatus = z10;
        this.ctzRecordId = j10;
        this.ctzStateCd = str6;
        this.ctzStatus = i10;
        this.ctzToken = str7;
        this.ctzTokenAt = str8;
        this.ctzUpdatedAt = str9;
    }

    public static /* synthetic */ MparCitizenUserX copy$default(MparCitizenUserX mparCitizenUserX, String str, String str2, String str3, String str4, String str5, boolean z10, long j10, String str6, int i10, String str7, String str8, String str9, int i11, Object obj) {
        MparCitizenUserX mparCitizenUserX2 = mparCitizenUserX;
        int i12 = i11;
        return mparCitizenUserX.copy((i12 & 1) != 0 ? mparCitizenUserX2.ctzCreatedAt : str, (i12 & 2) != 0 ? mparCitizenUserX2.ctzDispName : str2, (i12 & 4) != 0 ? mparCitizenUserX2.ctzEmail : str3, (i12 & 8) != 0 ? mparCitizenUserX2.ctzImage : str4, (i12 & 16) != 0 ? mparCitizenUserX2.ctzMobile : str5, (i12 & 32) != 0 ? mparCitizenUserX2.ctzMpinStatus : z10, (i12 & 64) != 0 ? mparCitizenUserX2.ctzRecordId : j10, (i12 & 128) != 0 ? mparCitizenUserX2.ctzStateCd : str6, (i12 & 256) != 0 ? mparCitizenUserX2.ctzStatus : i10, (i12 & 512) != 0 ? mparCitizenUserX2.ctzToken : str7, (i12 & 1024) != 0 ? mparCitizenUserX2.ctzTokenAt : str8, (i12 & 2048) != 0 ? mparCitizenUserX2.ctzUpdatedAt : str9);
    }

    public final String component1() {
        return this.ctzCreatedAt;
    }

    public final String component10() {
        return this.ctzToken;
    }

    public final String component11() {
        return this.ctzTokenAt;
    }

    public final String component12() {
        return this.ctzUpdatedAt;
    }

    public final String component2() {
        return this.ctzDispName;
    }

    public final String component3() {
        return this.ctzEmail;
    }

    public final String component4() {
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

    public final MparCitizenUserX copy(String str, String str2, String str3, String str4, String str5, boolean z10, long j10, String str6, int i10, String str7, String str8, String str9) {
        String str10 = str;
        l.f(str10, "ctzCreatedAt");
        String str11 = str2;
        l.f(str11, "ctzDispName");
        String str12 = str3;
        l.f(str12, "ctzEmail");
        String str13 = str4;
        l.f(str13, "ctzImage");
        String str14 = str5;
        l.f(str14, "ctzMobile");
        String str15 = str6;
        l.f(str15, "ctzStateCd");
        String str16 = str7;
        l.f(str16, "ctzToken");
        String str17 = str8;
        l.f(str17, "ctzTokenAt");
        String str18 = str9;
        l.f(str18, "ctzUpdatedAt");
        return new MparCitizenUserX(str10, str11, str12, str13, str14, z10, j10, str15, i10, str16, str17, str18);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MparCitizenUserX)) {
            return false;
        }
        MparCitizenUserX mparCitizenUserX = (MparCitizenUserX) obj;
        return l.a(this.ctzCreatedAt, mparCitizenUserX.ctzCreatedAt) && l.a(this.ctzDispName, mparCitizenUserX.ctzDispName) && l.a(this.ctzEmail, mparCitizenUserX.ctzEmail) && l.a(this.ctzImage, mparCitizenUserX.ctzImage) && l.a(this.ctzMobile, mparCitizenUserX.ctzMobile) && this.ctzMpinStatus == mparCitizenUserX.ctzMpinStatus && this.ctzRecordId == mparCitizenUserX.ctzRecordId && l.a(this.ctzStateCd, mparCitizenUserX.ctzStateCd) && this.ctzStatus == mparCitizenUserX.ctzStatus && l.a(this.ctzToken, mparCitizenUserX.ctzToken) && l.a(this.ctzTokenAt, mparCitizenUserX.ctzTokenAt) && l.a(this.ctzUpdatedAt, mparCitizenUserX.ctzUpdatedAt);
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

    public final String getCtzImage() {
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

    public final String getCtzToken() {
        return this.ctzToken;
    }

    public final String getCtzTokenAt() {
        return this.ctzTokenAt;
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
        return ((((((((((((hashCode + (z10 ? 1 : 0)) * 31) + Long.hashCode(this.ctzRecordId)) * 31) + this.ctzStateCd.hashCode()) * 31) + Integer.hashCode(this.ctzStatus)) * 31) + this.ctzToken.hashCode()) * 31) + this.ctzTokenAt.hashCode()) * 31) + this.ctzUpdatedAt.hashCode();
    }

    public String toString() {
        return "MparCitizenUserX(ctzCreatedAt=" + this.ctzCreatedAt + ", ctzDispName=" + this.ctzDispName + ", ctzEmail=" + this.ctzEmail + ", ctzImage=" + this.ctzImage + ", ctzMobile=" + this.ctzMobile + ", ctzMpinStatus=" + this.ctzMpinStatus + ", ctzRecordId=" + this.ctzRecordId + ", ctzStateCd=" + this.ctzStateCd + ", ctzStatus=" + this.ctzStatus + ", ctzToken=" + this.ctzToken + ", ctzTokenAt=" + this.ctzTokenAt + ", ctzUpdatedAt=" + this.ctzUpdatedAt + ')';
    }
}
