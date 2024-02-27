package com.nic.mparivahan.Citizen.Models;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class MparCitizenAccidentX {
    private final int accdCitizenId;
    private final int accdDistId;
    private final String accdGaddr;
    private final double accdLatitude;
    private final String accdLocation;
    private final double accdLongitude;
    private final int accdRecordId;
    private final String accdRegnNo;
    private final String accdRemarks;
    private final String accdStateCd;
    private final int accdStatus;
    private final String accdSubmittedAt;
    private final String accdUpdatedAt;
    private final String accdUpdatedBy;

    public MparCitizenAccidentX(int i10, int i11, String str, double d10, String str2, double d11, int i12, String str3, String str4, String str5, int i13, String str6, String str7, String str8) {
        String str9 = str2;
        String str10 = str3;
        String str11 = str4;
        String str12 = str5;
        String str13 = str6;
        String str14 = str7;
        String str15 = str8;
        l.f(str, "accdGaddr");
        l.f(str9, "accdLocation");
        l.f(str10, "accdRegnNo");
        l.f(str11, "accdRemarks");
        l.f(str12, "accdStateCd");
        l.f(str13, "accdSubmittedAt");
        l.f(str14, "accdUpdatedAt");
        l.f(str15, "accdUpdatedBy");
        this.accdCitizenId = i10;
        this.accdDistId = i11;
        this.accdGaddr = str;
        this.accdLatitude = d10;
        this.accdLocation = str9;
        this.accdLongitude = d11;
        this.accdRecordId = i12;
        this.accdRegnNo = str10;
        this.accdRemarks = str11;
        this.accdStateCd = str12;
        this.accdStatus = i13;
        this.accdSubmittedAt = str13;
        this.accdUpdatedAt = str14;
        this.accdUpdatedBy = str15;
    }

    public static /* synthetic */ MparCitizenAccidentX copy$default(MparCitizenAccidentX mparCitizenAccidentX, int i10, int i11, String str, double d10, String str2, double d11, int i12, String str3, String str4, String str5, int i13, String str6, String str7, String str8, int i14, Object obj) {
        MparCitizenAccidentX mparCitizenAccidentX2 = mparCitizenAccidentX;
        int i15 = i14;
        return mparCitizenAccidentX.copy((i15 & 1) != 0 ? mparCitizenAccidentX2.accdCitizenId : i10, (i15 & 2) != 0 ? mparCitizenAccidentX2.accdDistId : i11, (i15 & 4) != 0 ? mparCitizenAccidentX2.accdGaddr : str, (i15 & 8) != 0 ? mparCitizenAccidentX2.accdLatitude : d10, (i15 & 16) != 0 ? mparCitizenAccidentX2.accdLocation : str2, (i15 & 32) != 0 ? mparCitizenAccidentX2.accdLongitude : d11, (i15 & 64) != 0 ? mparCitizenAccidentX2.accdRecordId : i12, (i15 & 128) != 0 ? mparCitizenAccidentX2.accdRegnNo : str3, (i15 & 256) != 0 ? mparCitizenAccidentX2.accdRemarks : str4, (i15 & 512) != 0 ? mparCitizenAccidentX2.accdStateCd : str5, (i15 & 1024) != 0 ? mparCitizenAccidentX2.accdStatus : i13, (i15 & 2048) != 0 ? mparCitizenAccidentX2.accdSubmittedAt : str6, (i15 & 4096) != 0 ? mparCitizenAccidentX2.accdUpdatedAt : str7, (i15 & 8192) != 0 ? mparCitizenAccidentX2.accdUpdatedBy : str8);
    }

    public final int component1() {
        return this.accdCitizenId;
    }

    public final String component10() {
        return this.accdStateCd;
    }

    public final int component11() {
        return this.accdStatus;
    }

    public final String component12() {
        return this.accdSubmittedAt;
    }

    public final String component13() {
        return this.accdUpdatedAt;
    }

    public final String component14() {
        return this.accdUpdatedBy;
    }

    public final int component2() {
        return this.accdDistId;
    }

    public final String component3() {
        return this.accdGaddr;
    }

    public final double component4() {
        return this.accdLatitude;
    }

    public final String component5() {
        return this.accdLocation;
    }

    public final double component6() {
        return this.accdLongitude;
    }

    public final int component7() {
        return this.accdRecordId;
    }

    public final String component8() {
        return this.accdRegnNo;
    }

    public final String component9() {
        return this.accdRemarks;
    }

    public final MparCitizenAccidentX copy(int i10, int i11, String str, double d10, String str2, double d11, int i12, String str3, String str4, String str5, int i13, String str6, String str7, String str8) {
        int i14 = i10;
        l.f(str, "accdGaddr");
        l.f(str2, "accdLocation");
        l.f(str3, "accdRegnNo");
        l.f(str4, "accdRemarks");
        l.f(str5, "accdStateCd");
        l.f(str6, "accdSubmittedAt");
        l.f(str7, "accdUpdatedAt");
        l.f(str8, "accdUpdatedBy");
        return new MparCitizenAccidentX(i10, i11, str, d10, str2, d11, i12, str3, str4, str5, i13, str6, str7, str8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MparCitizenAccidentX)) {
            return false;
        }
        MparCitizenAccidentX mparCitizenAccidentX = (MparCitizenAccidentX) obj;
        return this.accdCitizenId == mparCitizenAccidentX.accdCitizenId && this.accdDistId == mparCitizenAccidentX.accdDistId && l.a(this.accdGaddr, mparCitizenAccidentX.accdGaddr) && Double.compare(this.accdLatitude, mparCitizenAccidentX.accdLatitude) == 0 && l.a(this.accdLocation, mparCitizenAccidentX.accdLocation) && Double.compare(this.accdLongitude, mparCitizenAccidentX.accdLongitude) == 0 && this.accdRecordId == mparCitizenAccidentX.accdRecordId && l.a(this.accdRegnNo, mparCitizenAccidentX.accdRegnNo) && l.a(this.accdRemarks, mparCitizenAccidentX.accdRemarks) && l.a(this.accdStateCd, mparCitizenAccidentX.accdStateCd) && this.accdStatus == mparCitizenAccidentX.accdStatus && l.a(this.accdSubmittedAt, mparCitizenAccidentX.accdSubmittedAt) && l.a(this.accdUpdatedAt, mparCitizenAccidentX.accdUpdatedAt) && l.a(this.accdUpdatedBy, mparCitizenAccidentX.accdUpdatedBy);
    }

    public final int getAccdCitizenId() {
        return this.accdCitizenId;
    }

    public final int getAccdDistId() {
        return this.accdDistId;
    }

    public final String getAccdGaddr() {
        return this.accdGaddr;
    }

    public final double getAccdLatitude() {
        return this.accdLatitude;
    }

    public final String getAccdLocation() {
        return this.accdLocation;
    }

    public final double getAccdLongitude() {
        return this.accdLongitude;
    }

    public final int getAccdRecordId() {
        return this.accdRecordId;
    }

    public final String getAccdRegnNo() {
        return this.accdRegnNo;
    }

    public final String getAccdRemarks() {
        return this.accdRemarks;
    }

    public final String getAccdStateCd() {
        return this.accdStateCd;
    }

    public final int getAccdStatus() {
        return this.accdStatus;
    }

    public final String getAccdSubmittedAt() {
        return this.accdSubmittedAt;
    }

    public final String getAccdUpdatedAt() {
        return this.accdUpdatedAt;
    }

    public final String getAccdUpdatedBy() {
        return this.accdUpdatedBy;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((Integer.hashCode(this.accdCitizenId) * 31) + Integer.hashCode(this.accdDistId)) * 31) + this.accdGaddr.hashCode()) * 31) + Double.hashCode(this.accdLatitude)) * 31) + this.accdLocation.hashCode()) * 31) + Double.hashCode(this.accdLongitude)) * 31) + Integer.hashCode(this.accdRecordId)) * 31) + this.accdRegnNo.hashCode()) * 31) + this.accdRemarks.hashCode()) * 31) + this.accdStateCd.hashCode()) * 31) + Integer.hashCode(this.accdStatus)) * 31) + this.accdSubmittedAt.hashCode()) * 31) + this.accdUpdatedAt.hashCode()) * 31) + this.accdUpdatedBy.hashCode();
    }

    public String toString() {
        return "MparCitizenAccidentX(accdCitizenId=" + this.accdCitizenId + ", accdDistId=" + this.accdDistId + ", accdGaddr=" + this.accdGaddr + ", accdLatitude=" + this.accdLatitude + ", accdLocation=" + this.accdLocation + ", accdLongitude=" + this.accdLongitude + ", accdRecordId=" + this.accdRecordId + ", accdRegnNo=" + this.accdRegnNo + ", accdRemarks=" + this.accdRemarks + ", accdStateCd=" + this.accdStateCd + ", accdStatus=" + this.accdStatus + ", accdSubmittedAt=" + this.accdSubmittedAt + ", accdUpdatedAt=" + this.accdUpdatedAt + ", accdUpdatedBy=" + this.accdUpdatedBy + ')';
    }
}
