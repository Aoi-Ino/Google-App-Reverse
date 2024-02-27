package com.nic.mparivahan.Dl.Model;

import androidx.annotation.Keep;
import cm.l;
import java.io.Serializable;

@Keep
public final class BioImgObjX implements Serializable {
    private final int bdDevId;
    private final long biApplno;
    private final String biBioCapturedDt;
    private final String biBioId;
    private final int biConfirmCapture;
    private final String biDigest;
    private final String biEndorsedt;
    private final String biEndorsetime;
    private final String biPhoto;
    private final String biPhotoDate;
    private final String biSignDate;
    private final String biSignature;
    private final int biTokenId;
    private final int biusid;

    public BioImgObjX(int i10, long j10, String str, String str2, int i11, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i12, int i13) {
        String str10 = str;
        String str11 = str2;
        String str12 = str3;
        String str13 = str4;
        String str14 = str5;
        String str15 = str6;
        String str16 = str7;
        String str17 = str8;
        String str18 = str9;
        l.f(str10, "biBioCapturedDt");
        l.f(str11, "biBioId");
        l.f(str12, "biDigest");
        l.f(str13, "biEndorsedt");
        l.f(str14, "biEndorsetime");
        l.f(str15, "biPhoto");
        l.f(str16, "biPhotoDate");
        l.f(str17, "biSignDate");
        l.f(str18, "biSignature");
        this.bdDevId = i10;
        this.biApplno = j10;
        this.biBioCapturedDt = str10;
        this.biBioId = str11;
        this.biConfirmCapture = i11;
        this.biDigest = str12;
        this.biEndorsedt = str13;
        this.biEndorsetime = str14;
        this.biPhoto = str15;
        this.biPhotoDate = str16;
        this.biSignDate = str17;
        this.biSignature = str18;
        this.biTokenId = i12;
        this.biusid = i13;
    }

    public static /* synthetic */ BioImgObjX copy$default(BioImgObjX bioImgObjX, int i10, long j10, String str, String str2, int i11, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i12, int i13, int i14, Object obj) {
        BioImgObjX bioImgObjX2 = bioImgObjX;
        int i15 = i14;
        return bioImgObjX.copy((i15 & 1) != 0 ? bioImgObjX2.bdDevId : i10, (i15 & 2) != 0 ? bioImgObjX2.biApplno : j10, (i15 & 4) != 0 ? bioImgObjX2.biBioCapturedDt : str, (i15 & 8) != 0 ? bioImgObjX2.biBioId : str2, (i15 & 16) != 0 ? bioImgObjX2.biConfirmCapture : i11, (i15 & 32) != 0 ? bioImgObjX2.biDigest : str3, (i15 & 64) != 0 ? bioImgObjX2.biEndorsedt : str4, (i15 & 128) != 0 ? bioImgObjX2.biEndorsetime : str5, (i15 & 256) != 0 ? bioImgObjX2.biPhoto : str6, (i15 & 512) != 0 ? bioImgObjX2.biPhotoDate : str7, (i15 & 1024) != 0 ? bioImgObjX2.biSignDate : str8, (i15 & 2048) != 0 ? bioImgObjX2.biSignature : str9, (i15 & 4096) != 0 ? bioImgObjX2.biTokenId : i12, (i15 & 8192) != 0 ? bioImgObjX2.biusid : i13);
    }

    public final int component1() {
        return this.bdDevId;
    }

    public final String component10() {
        return this.biPhotoDate;
    }

    public final String component11() {
        return this.biSignDate;
    }

    public final String component12() {
        return this.biSignature;
    }

    public final int component13() {
        return this.biTokenId;
    }

    public final int component14() {
        return this.biusid;
    }

    public final long component2() {
        return this.biApplno;
    }

    public final String component3() {
        return this.biBioCapturedDt;
    }

    public final String component4() {
        return this.biBioId;
    }

    public final int component5() {
        return this.biConfirmCapture;
    }

    public final String component6() {
        return this.biDigest;
    }

    public final String component7() {
        return this.biEndorsedt;
    }

    public final String component8() {
        return this.biEndorsetime;
    }

    public final String component9() {
        return this.biPhoto;
    }

    public final BioImgObjX copy(int i10, long j10, String str, String str2, int i11, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i12, int i13) {
        String str10 = str;
        l.f(str10, "biBioCapturedDt");
        String str11 = str2;
        l.f(str11, "biBioId");
        String str12 = str3;
        l.f(str12, "biDigest");
        String str13 = str4;
        l.f(str13, "biEndorsedt");
        String str14 = str5;
        l.f(str14, "biEndorsetime");
        String str15 = str6;
        l.f(str15, "biPhoto");
        String str16 = str7;
        l.f(str16, "biPhotoDate");
        String str17 = str8;
        l.f(str17, "biSignDate");
        String str18 = str9;
        l.f(str18, "biSignature");
        return new BioImgObjX(i10, j10, str10, str11, i11, str12, str13, str14, str15, str16, str17, str18, i12, i13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BioImgObjX)) {
            return false;
        }
        BioImgObjX bioImgObjX = (BioImgObjX) obj;
        return this.bdDevId == bioImgObjX.bdDevId && this.biApplno == bioImgObjX.biApplno && l.a(this.biBioCapturedDt, bioImgObjX.biBioCapturedDt) && l.a(this.biBioId, bioImgObjX.biBioId) && this.biConfirmCapture == bioImgObjX.biConfirmCapture && l.a(this.biDigest, bioImgObjX.biDigest) && l.a(this.biEndorsedt, bioImgObjX.biEndorsedt) && l.a(this.biEndorsetime, bioImgObjX.biEndorsetime) && l.a(this.biPhoto, bioImgObjX.biPhoto) && l.a(this.biPhotoDate, bioImgObjX.biPhotoDate) && l.a(this.biSignDate, bioImgObjX.biSignDate) && l.a(this.biSignature, bioImgObjX.biSignature) && this.biTokenId == bioImgObjX.biTokenId && this.biusid == bioImgObjX.biusid;
    }

    public final int getBdDevId() {
        return this.bdDevId;
    }

    public final long getBiApplno() {
        return this.biApplno;
    }

    public final String getBiBioCapturedDt() {
        return this.biBioCapturedDt;
    }

    public final String getBiBioId() {
        return this.biBioId;
    }

    public final int getBiConfirmCapture() {
        return this.biConfirmCapture;
    }

    public final String getBiDigest() {
        return this.biDigest;
    }

    public final String getBiEndorsedt() {
        return this.biEndorsedt;
    }

    public final String getBiEndorsetime() {
        return this.biEndorsetime;
    }

    public final String getBiPhoto() {
        return this.biPhoto;
    }

    public final String getBiPhotoDate() {
        return this.biPhotoDate;
    }

    public final String getBiSignDate() {
        return this.biSignDate;
    }

    public final String getBiSignature() {
        return this.biSignature;
    }

    public final int getBiTokenId() {
        return this.biTokenId;
    }

    public final int getBiusid() {
        return this.biusid;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((Integer.hashCode(this.bdDevId) * 31) + Long.hashCode(this.biApplno)) * 31) + this.biBioCapturedDt.hashCode()) * 31) + this.biBioId.hashCode()) * 31) + Integer.hashCode(this.biConfirmCapture)) * 31) + this.biDigest.hashCode()) * 31) + this.biEndorsedt.hashCode()) * 31) + this.biEndorsetime.hashCode()) * 31) + this.biPhoto.hashCode()) * 31) + this.biPhotoDate.hashCode()) * 31) + this.biSignDate.hashCode()) * 31) + this.biSignature.hashCode()) * 31) + Integer.hashCode(this.biTokenId)) * 31) + Integer.hashCode(this.biusid);
    }

    public String toString() {
        return "BioImgObjX(bdDevId=" + this.bdDevId + ", biApplno=" + this.biApplno + ", biBioCapturedDt=" + this.biBioCapturedDt + ", biBioId=" + this.biBioId + ", biConfirmCapture=" + this.biConfirmCapture + ", biDigest=" + this.biDigest + ", biEndorsedt=" + this.biEndorsedt + ", biEndorsetime=" + this.biEndorsetime + ", biPhoto=" + this.biPhoto + ", biPhotoDate=" + this.biPhotoDate + ", biSignDate=" + this.biSignDate + ", biSignature=" + this.biSignature + ", biTokenId=" + this.biTokenId + ", biusid=" + this.biusid + ')';
    }
}
