package com.nic.mparivahan.Citizen.Models;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class MparCitizenViolationX {
    private final int violCitizenId;
    private final int violDistId;
    private final String violGaddr;
    private final double violLatitude;
    private final String violLocation;
    private final double violLongitude;
    private final int violOffenceId;
    private final int violRecordId;
    private final String violRegnNo;
    private final String violRemarks;
    private final String violStateCd;
    private final int violStatus;
    private final String violSubmittedAt;
    private final String violUpdatedAt;
    private final Object violUpdatedBy;

    public MparCitizenViolationX(int i10, int i11, String str, double d10, String str2, double d11, int i12, int i13, String str3, String str4, String str5, int i14, String str6, String str7, Object obj) {
        String str8 = str2;
        String str9 = str3;
        String str10 = str4;
        String str11 = str5;
        String str12 = str6;
        String str13 = str7;
        Object obj2 = obj;
        l.f(str, "violGaddr");
        l.f(str8, "violLocation");
        l.f(str9, "violRegnNo");
        l.f(str10, "violRemarks");
        l.f(str11, "violStateCd");
        l.f(str12, "violSubmittedAt");
        l.f(str13, "violUpdatedAt");
        l.f(obj2, "violUpdatedBy");
        this.violCitizenId = i10;
        this.violDistId = i11;
        this.violGaddr = str;
        this.violLatitude = d10;
        this.violLocation = str8;
        this.violLongitude = d11;
        this.violOffenceId = i12;
        this.violRecordId = i13;
        this.violRegnNo = str9;
        this.violRemarks = str10;
        this.violStateCd = str11;
        this.violStatus = i14;
        this.violSubmittedAt = str12;
        this.violUpdatedAt = str13;
        this.violUpdatedBy = obj2;
    }

    public static /* synthetic */ MparCitizenViolationX copy$default(MparCitizenViolationX mparCitizenViolationX, int i10, int i11, String str, double d10, String str2, double d11, int i12, int i13, String str3, String str4, String str5, int i14, String str6, String str7, Object obj, int i15, Object obj2) {
        MparCitizenViolationX mparCitizenViolationX2 = mparCitizenViolationX;
        int i16 = i15;
        return mparCitizenViolationX.copy((i16 & 1) != 0 ? mparCitizenViolationX2.violCitizenId : i10, (i16 & 2) != 0 ? mparCitizenViolationX2.violDistId : i11, (i16 & 4) != 0 ? mparCitizenViolationX2.violGaddr : str, (i16 & 8) != 0 ? mparCitizenViolationX2.violLatitude : d10, (i16 & 16) != 0 ? mparCitizenViolationX2.violLocation : str2, (i16 & 32) != 0 ? mparCitizenViolationX2.violLongitude : d11, (i16 & 64) != 0 ? mparCitizenViolationX2.violOffenceId : i12, (i16 & 128) != 0 ? mparCitizenViolationX2.violRecordId : i13, (i16 & 256) != 0 ? mparCitizenViolationX2.violRegnNo : str3, (i16 & 512) != 0 ? mparCitizenViolationX2.violRemarks : str4, (i16 & 1024) != 0 ? mparCitizenViolationX2.violStateCd : str5, (i16 & 2048) != 0 ? mparCitizenViolationX2.violStatus : i14, (i16 & 4096) != 0 ? mparCitizenViolationX2.violSubmittedAt : str6, (i16 & 8192) != 0 ? mparCitizenViolationX2.violUpdatedAt : str7, (i16 & 16384) != 0 ? mparCitizenViolationX2.violUpdatedBy : obj);
    }

    public final int component1() {
        return this.violCitizenId;
    }

    public final String component10() {
        return this.violRemarks;
    }

    public final String component11() {
        return this.violStateCd;
    }

    public final int component12() {
        return this.violStatus;
    }

    public final String component13() {
        return this.violSubmittedAt;
    }

    public final String component14() {
        return this.violUpdatedAt;
    }

    public final Object component15() {
        return this.violUpdatedBy;
    }

    public final int component2() {
        return this.violDistId;
    }

    public final String component3() {
        return this.violGaddr;
    }

    public final double component4() {
        return this.violLatitude;
    }

    public final String component5() {
        return this.violLocation;
    }

    public final double component6() {
        return this.violLongitude;
    }

    public final int component7() {
        return this.violOffenceId;
    }

    public final int component8() {
        return this.violRecordId;
    }

    public final String component9() {
        return this.violRegnNo;
    }

    public final MparCitizenViolationX copy(int i10, int i11, String str, double d10, String str2, double d11, int i12, int i13, String str3, String str4, String str5, int i14, String str6, String str7, Object obj) {
        int i15 = i10;
        l.f(str, "violGaddr");
        l.f(str2, "violLocation");
        l.f(str3, "violRegnNo");
        l.f(str4, "violRemarks");
        l.f(str5, "violStateCd");
        l.f(str6, "violSubmittedAt");
        l.f(str7, "violUpdatedAt");
        l.f(obj, "violUpdatedBy");
        return new MparCitizenViolationX(i10, i11, str, d10, str2, d11, i12, i13, str3, str4, str5, i14, str6, str7, obj);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MparCitizenViolationX)) {
            return false;
        }
        MparCitizenViolationX mparCitizenViolationX = (MparCitizenViolationX) obj;
        return this.violCitizenId == mparCitizenViolationX.violCitizenId && this.violDistId == mparCitizenViolationX.violDistId && l.a(this.violGaddr, mparCitizenViolationX.violGaddr) && Double.compare(this.violLatitude, mparCitizenViolationX.violLatitude) == 0 && l.a(this.violLocation, mparCitizenViolationX.violLocation) && Double.compare(this.violLongitude, mparCitizenViolationX.violLongitude) == 0 && this.violOffenceId == mparCitizenViolationX.violOffenceId && this.violRecordId == mparCitizenViolationX.violRecordId && l.a(this.violRegnNo, mparCitizenViolationX.violRegnNo) && l.a(this.violRemarks, mparCitizenViolationX.violRemarks) && l.a(this.violStateCd, mparCitizenViolationX.violStateCd) && this.violStatus == mparCitizenViolationX.violStatus && l.a(this.violSubmittedAt, mparCitizenViolationX.violSubmittedAt) && l.a(this.violUpdatedAt, mparCitizenViolationX.violUpdatedAt) && l.a(this.violUpdatedBy, mparCitizenViolationX.violUpdatedBy);
    }

    public final int getViolCitizenId() {
        return this.violCitizenId;
    }

    public final int getViolDistId() {
        return this.violDistId;
    }

    public final String getViolGaddr() {
        return this.violGaddr;
    }

    public final double getViolLatitude() {
        return this.violLatitude;
    }

    public final String getViolLocation() {
        return this.violLocation;
    }

    public final double getViolLongitude() {
        return this.violLongitude;
    }

    public final int getViolOffenceId() {
        return this.violOffenceId;
    }

    public final int getViolRecordId() {
        return this.violRecordId;
    }

    public final String getViolRegnNo() {
        return this.violRegnNo;
    }

    public final String getViolRemarks() {
        return this.violRemarks;
    }

    public final String getViolStateCd() {
        return this.violStateCd;
    }

    public final int getViolStatus() {
        return this.violStatus;
    }

    public final String getViolSubmittedAt() {
        return this.violSubmittedAt;
    }

    public final String getViolUpdatedAt() {
        return this.violUpdatedAt;
    }

    public final Object getViolUpdatedBy() {
        return this.violUpdatedBy;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((Integer.hashCode(this.violCitizenId) * 31) + Integer.hashCode(this.violDistId)) * 31) + this.violGaddr.hashCode()) * 31) + Double.hashCode(this.violLatitude)) * 31) + this.violLocation.hashCode()) * 31) + Double.hashCode(this.violLongitude)) * 31) + Integer.hashCode(this.violOffenceId)) * 31) + Integer.hashCode(this.violRecordId)) * 31) + this.violRegnNo.hashCode()) * 31) + this.violRemarks.hashCode()) * 31) + this.violStateCd.hashCode()) * 31) + Integer.hashCode(this.violStatus)) * 31) + this.violSubmittedAt.hashCode()) * 31) + this.violUpdatedAt.hashCode()) * 31) + this.violUpdatedBy.hashCode();
    }

    public String toString() {
        return "MparCitizenViolationX(violCitizenId=" + this.violCitizenId + ", violDistId=" + this.violDistId + ", violGaddr=" + this.violGaddr + ", violLatitude=" + this.violLatitude + ", violLocation=" + this.violLocation + ", violLongitude=" + this.violLongitude + ", violOffenceId=" + this.violOffenceId + ", violRecordId=" + this.violRecordId + ", violRegnNo=" + this.violRegnNo + ", violRemarks=" + this.violRemarks + ", violStateCd=" + this.violStateCd + ", violStatus=" + this.violStatus + ", violSubmittedAt=" + this.violSubmittedAt + ", violUpdatedAt=" + this.violUpdatedAt + ", violUpdatedBy=" + this.violUpdatedBy + ')';
    }
}
