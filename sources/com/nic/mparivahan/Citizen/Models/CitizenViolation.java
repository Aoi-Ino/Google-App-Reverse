package com.nic.mparivahan.Citizen.Models;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class CitizenViolation {
    private final long violCitizenId;
    private final int violDistId;
    private final String violGaddr;
    private final String violLatitude;
    private final String violLocation;
    private final String violLongitude;
    private final int violOffenceId;
    private final int violRecordId;
    private final String violRegnNo;
    private final String violRemarks;
    private final String violStateCd;
    private final int violStatus;
    private final String violSubmittedAt;
    private final String violUpdatedAt;
    private final String violUpdatedBy;

    public CitizenViolation(long j10, int i10, String str, String str2, String str3, String str4, int i11, int i12, String str5, String str6, String str7, int i13, String str8, String str9, String str10) {
        String str11 = str;
        String str12 = str2;
        String str13 = str3;
        String str14 = str4;
        String str15 = str5;
        String str16 = str6;
        String str17 = str7;
        String str18 = str8;
        String str19 = str9;
        String str20 = str10;
        l.f(str11, "violGaddr");
        l.f(str12, "violLatitude");
        l.f(str13, "violLocation");
        l.f(str14, "violLongitude");
        l.f(str15, "violRegnNo");
        l.f(str16, "violRemarks");
        l.f(str17, "violStateCd");
        l.f(str18, "violSubmittedAt");
        l.f(str19, "violUpdatedAt");
        l.f(str20, "violUpdatedBy");
        this.violCitizenId = j10;
        this.violDistId = i10;
        this.violGaddr = str11;
        this.violLatitude = str12;
        this.violLocation = str13;
        this.violLongitude = str14;
        this.violOffenceId = i11;
        this.violRecordId = i12;
        this.violRegnNo = str15;
        this.violRemarks = str16;
        this.violStateCd = str17;
        this.violStatus = i13;
        this.violSubmittedAt = str18;
        this.violUpdatedAt = str19;
        this.violUpdatedBy = str20;
    }

    public static /* synthetic */ CitizenViolation copy$default(CitizenViolation citizenViolation, long j10, int i10, String str, String str2, String str3, String str4, int i11, int i12, String str5, String str6, String str7, int i13, String str8, String str9, String str10, int i14, Object obj) {
        CitizenViolation citizenViolation2 = citizenViolation;
        int i15 = i14;
        return citizenViolation.copy((i15 & 1) != 0 ? citizenViolation2.violCitizenId : j10, (i15 & 2) != 0 ? citizenViolation2.violDistId : i10, (i15 & 4) != 0 ? citizenViolation2.violGaddr : str, (i15 & 8) != 0 ? citizenViolation2.violLatitude : str2, (i15 & 16) != 0 ? citizenViolation2.violLocation : str3, (i15 & 32) != 0 ? citizenViolation2.violLongitude : str4, (i15 & 64) != 0 ? citizenViolation2.violOffenceId : i11, (i15 & 128) != 0 ? citizenViolation2.violRecordId : i12, (i15 & 256) != 0 ? citizenViolation2.violRegnNo : str5, (i15 & 512) != 0 ? citizenViolation2.violRemarks : str6, (i15 & 1024) != 0 ? citizenViolation2.violStateCd : str7, (i15 & 2048) != 0 ? citizenViolation2.violStatus : i13, (i15 & 4096) != 0 ? citizenViolation2.violSubmittedAt : str8, (i15 & 8192) != 0 ? citizenViolation2.violUpdatedAt : str9, (i15 & 16384) != 0 ? citizenViolation2.violUpdatedBy : str10);
    }

    public final long component1() {
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

    public final String component15() {
        return this.violUpdatedBy;
    }

    public final int component2() {
        return this.violDistId;
    }

    public final String component3() {
        return this.violGaddr;
    }

    public final String component4() {
        return this.violLatitude;
    }

    public final String component5() {
        return this.violLocation;
    }

    public final String component6() {
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

    public final CitizenViolation copy(long j10, int i10, String str, String str2, String str3, String str4, int i11, int i12, String str5, String str6, String str7, int i13, String str8, String str9, String str10) {
        long j11 = j10;
        l.f(str, "violGaddr");
        l.f(str2, "violLatitude");
        l.f(str3, "violLocation");
        l.f(str4, "violLongitude");
        l.f(str5, "violRegnNo");
        l.f(str6, "violRemarks");
        l.f(str7, "violStateCd");
        l.f(str8, "violSubmittedAt");
        l.f(str9, "violUpdatedAt");
        l.f(str10, "violUpdatedBy");
        return new CitizenViolation(j10, i10, str, str2, str3, str4, i11, i12, str5, str6, str7, i13, str8, str9, str10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CitizenViolation)) {
            return false;
        }
        CitizenViolation citizenViolation = (CitizenViolation) obj;
        return this.violCitizenId == citizenViolation.violCitizenId && this.violDistId == citizenViolation.violDistId && l.a(this.violGaddr, citizenViolation.violGaddr) && l.a(this.violLatitude, citizenViolation.violLatitude) && l.a(this.violLocation, citizenViolation.violLocation) && l.a(this.violLongitude, citizenViolation.violLongitude) && this.violOffenceId == citizenViolation.violOffenceId && this.violRecordId == citizenViolation.violRecordId && l.a(this.violRegnNo, citizenViolation.violRegnNo) && l.a(this.violRemarks, citizenViolation.violRemarks) && l.a(this.violStateCd, citizenViolation.violStateCd) && this.violStatus == citizenViolation.violStatus && l.a(this.violSubmittedAt, citizenViolation.violSubmittedAt) && l.a(this.violUpdatedAt, citizenViolation.violUpdatedAt) && l.a(this.violUpdatedBy, citizenViolation.violUpdatedBy);
    }

    public final long getViolCitizenId() {
        return this.violCitizenId;
    }

    public final int getViolDistId() {
        return this.violDistId;
    }

    public final String getViolGaddr() {
        return this.violGaddr;
    }

    public final String getViolLatitude() {
        return this.violLatitude;
    }

    public final String getViolLocation() {
        return this.violLocation;
    }

    public final String getViolLongitude() {
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

    public final String getViolUpdatedBy() {
        return this.violUpdatedBy;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((Long.hashCode(this.violCitizenId) * 31) + Integer.hashCode(this.violDistId)) * 31) + this.violGaddr.hashCode()) * 31) + this.violLatitude.hashCode()) * 31) + this.violLocation.hashCode()) * 31) + this.violLongitude.hashCode()) * 31) + Integer.hashCode(this.violOffenceId)) * 31) + Integer.hashCode(this.violRecordId)) * 31) + this.violRegnNo.hashCode()) * 31) + this.violRemarks.hashCode()) * 31) + this.violStateCd.hashCode()) * 31) + Integer.hashCode(this.violStatus)) * 31) + this.violSubmittedAt.hashCode()) * 31) + this.violUpdatedAt.hashCode()) * 31) + this.violUpdatedBy.hashCode();
    }

    public String toString() {
        return "CitizenViolation(violCitizenId=" + this.violCitizenId + ", violDistId=" + this.violDistId + ", violGaddr=" + this.violGaddr + ", violLatitude=" + this.violLatitude + ", violLocation=" + this.violLocation + ", violLongitude=" + this.violLongitude + ", violOffenceId=" + this.violOffenceId + ", violRecordId=" + this.violRecordId + ", violRegnNo=" + this.violRegnNo + ", violRemarks=" + this.violRemarks + ", violStateCd=" + this.violStateCd + ", violStatus=" + this.violStatus + ", violSubmittedAt=" + this.violSubmittedAt + ", violUpdatedAt=" + this.violUpdatedAt + ", violUpdatedBy=" + this.violUpdatedBy + ')';
    }
}
