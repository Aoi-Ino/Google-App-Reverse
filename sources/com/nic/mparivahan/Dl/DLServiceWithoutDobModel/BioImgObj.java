package com.nic.mparivahan.Dl.DLServiceWithoutDobModel;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class BioImgObj {
    private final Object biDlno;
    private final Object biEndorsedt;
    private final Object biEndorsementNo;
    private final Object biEndorsetime;
    private final Object biLeftThumb;
    private final Object biLeftThumbDate;
    private final Object biLminutia;
    private final Object biLtm19794;
    private final Object biMinutiaCapturedThumb;
    private final String biPhoto;
    private final Object biPhotoDate;
    private final String biRightThumb;
    private final Object biRightThumbDate;
    private final Object biRminutia;
    private final Object biRtm19794;
    private final Object biSignDate;
    private final String biSignature;
    private final Object biTokenId;
    private final int biusid;

    public BioImgObj(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, String str, Object obj10, String str2, Object obj11, Object obj12, Object obj13, Object obj14, String str3, Object obj15, int i10) {
        Object obj16 = obj;
        Object obj17 = obj2;
        Object obj18 = obj3;
        Object obj19 = obj4;
        Object obj20 = obj5;
        Object obj21 = obj6;
        Object obj22 = obj7;
        Object obj23 = obj8;
        Object obj24 = obj9;
        String str4 = str;
        Object obj25 = obj10;
        String str5 = str2;
        Object obj26 = obj11;
        Object obj27 = obj12;
        Object obj28 = obj14;
        l.f(obj16, "biDlno");
        l.f(obj17, "biEndorsedt");
        l.f(obj18, "biEndorsementNo");
        l.f(obj19, "biEndorsetime");
        l.f(obj20, "biLeftThumb");
        l.f(obj21, "biLeftThumbDate");
        l.f(obj22, "biLminutia");
        l.f(obj23, "biLtm19794");
        l.f(obj24, "biMinutiaCapturedThumb");
        l.f(str4, "biPhoto");
        l.f(obj25, "biPhotoDate");
        l.f(str5, "biRightThumb");
        l.f(obj26, "biRightThumbDate");
        l.f(obj27, "biRminutia");
        l.f(obj13, "biRtm19794");
        l.f(obj14, "biSignDate");
        l.f(str3, "biSignature");
        l.f(obj15, "biTokenId");
        this.biDlno = obj16;
        this.biEndorsedt = obj17;
        this.biEndorsementNo = obj18;
        this.biEndorsetime = obj19;
        this.biLeftThumb = obj20;
        this.biLeftThumbDate = obj21;
        this.biLminutia = obj22;
        this.biLtm19794 = obj23;
        this.biMinutiaCapturedThumb = obj24;
        this.biPhoto = str4;
        this.biPhotoDate = obj25;
        this.biRightThumb = str5;
        this.biRightThumbDate = obj26;
        this.biRminutia = obj27;
        this.biRtm19794 = obj13;
        this.biSignDate = obj14;
        this.biSignature = str3;
        this.biTokenId = obj15;
        this.biusid = i10;
    }

    public static /* synthetic */ BioImgObj copy$default(BioImgObj bioImgObj, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, String str, Object obj10, String str2, Object obj11, Object obj12, Object obj13, Object obj14, String str3, Object obj15, int i10, int i11, Object obj16) {
        BioImgObj bioImgObj2 = bioImgObj;
        int i12 = i11;
        return bioImgObj.copy((i12 & 1) != 0 ? bioImgObj2.biDlno : obj, (i12 & 2) != 0 ? bioImgObj2.biEndorsedt : obj2, (i12 & 4) != 0 ? bioImgObj2.biEndorsementNo : obj3, (i12 & 8) != 0 ? bioImgObj2.biEndorsetime : obj4, (i12 & 16) != 0 ? bioImgObj2.biLeftThumb : obj5, (i12 & 32) != 0 ? bioImgObj2.biLeftThumbDate : obj6, (i12 & 64) != 0 ? bioImgObj2.biLminutia : obj7, (i12 & 128) != 0 ? bioImgObj2.biLtm19794 : obj8, (i12 & 256) != 0 ? bioImgObj2.biMinutiaCapturedThumb : obj9, (i12 & 512) != 0 ? bioImgObj2.biPhoto : str, (i12 & 1024) != 0 ? bioImgObj2.biPhotoDate : obj10, (i12 & 2048) != 0 ? bioImgObj2.biRightThumb : str2, (i12 & 4096) != 0 ? bioImgObj2.biRightThumbDate : obj11, (i12 & 8192) != 0 ? bioImgObj2.biRminutia : obj12, (i12 & 16384) != 0 ? bioImgObj2.biRtm19794 : obj13, (i12 & 32768) != 0 ? bioImgObj2.biSignDate : obj14, (i12 & 65536) != 0 ? bioImgObj2.biSignature : str3, (i12 & 131072) != 0 ? bioImgObj2.biTokenId : obj15, (i12 & 262144) != 0 ? bioImgObj2.biusid : i10);
    }

    public final Object component1() {
        return this.biDlno;
    }

    public final String component10() {
        return this.biPhoto;
    }

    public final Object component11() {
        return this.biPhotoDate;
    }

    public final String component12() {
        return this.biRightThumb;
    }

    public final Object component13() {
        return this.biRightThumbDate;
    }

    public final Object component14() {
        return this.biRminutia;
    }

    public final Object component15() {
        return this.biRtm19794;
    }

    public final Object component16() {
        return this.biSignDate;
    }

    public final String component17() {
        return this.biSignature;
    }

    public final Object component18() {
        return this.biTokenId;
    }

    public final int component19() {
        return this.biusid;
    }

    public final Object component2() {
        return this.biEndorsedt;
    }

    public final Object component3() {
        return this.biEndorsementNo;
    }

    public final Object component4() {
        return this.biEndorsetime;
    }

    public final Object component5() {
        return this.biLeftThumb;
    }

    public final Object component6() {
        return this.biLeftThumbDate;
    }

    public final Object component7() {
        return this.biLminutia;
    }

    public final Object component8() {
        return this.biLtm19794;
    }

    public final Object component9() {
        return this.biMinutiaCapturedThumb;
    }

    public final BioImgObj copy(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, String str, Object obj10, String str2, Object obj11, Object obj12, Object obj13, Object obj14, String str3, Object obj15, int i10) {
        Object obj16 = obj;
        l.f(obj16, "biDlno");
        l.f(obj2, "biEndorsedt");
        l.f(obj3, "biEndorsementNo");
        l.f(obj4, "biEndorsetime");
        l.f(obj5, "biLeftThumb");
        l.f(obj6, "biLeftThumbDate");
        l.f(obj7, "biLminutia");
        l.f(obj8, "biLtm19794");
        l.f(obj9, "biMinutiaCapturedThumb");
        l.f(str, "biPhoto");
        l.f(obj10, "biPhotoDate");
        l.f(str2, "biRightThumb");
        l.f(obj11, "biRightThumbDate");
        l.f(obj12, "biRminutia");
        l.f(obj13, "biRtm19794");
        l.f(obj14, "biSignDate");
        l.f(str3, "biSignature");
        l.f(obj15, "biTokenId");
        return new BioImgObj(obj16, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, str, obj10, str2, obj11, obj12, obj13, obj14, str3, obj15, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BioImgObj)) {
            return false;
        }
        BioImgObj bioImgObj = (BioImgObj) obj;
        return l.a(this.biDlno, bioImgObj.biDlno) && l.a(this.biEndorsedt, bioImgObj.biEndorsedt) && l.a(this.biEndorsementNo, bioImgObj.biEndorsementNo) && l.a(this.biEndorsetime, bioImgObj.biEndorsetime) && l.a(this.biLeftThumb, bioImgObj.biLeftThumb) && l.a(this.biLeftThumbDate, bioImgObj.biLeftThumbDate) && l.a(this.biLminutia, bioImgObj.biLminutia) && l.a(this.biLtm19794, bioImgObj.biLtm19794) && l.a(this.biMinutiaCapturedThumb, bioImgObj.biMinutiaCapturedThumb) && l.a(this.biPhoto, bioImgObj.biPhoto) && l.a(this.biPhotoDate, bioImgObj.biPhotoDate) && l.a(this.biRightThumb, bioImgObj.biRightThumb) && l.a(this.biRightThumbDate, bioImgObj.biRightThumbDate) && l.a(this.biRminutia, bioImgObj.biRminutia) && l.a(this.biRtm19794, bioImgObj.biRtm19794) && l.a(this.biSignDate, bioImgObj.biSignDate) && l.a(this.biSignature, bioImgObj.biSignature) && l.a(this.biTokenId, bioImgObj.biTokenId) && this.biusid == bioImgObj.biusid;
    }

    public final Object getBiDlno() {
        return this.biDlno;
    }

    public final Object getBiEndorsedt() {
        return this.biEndorsedt;
    }

    public final Object getBiEndorsementNo() {
        return this.biEndorsementNo;
    }

    public final Object getBiEndorsetime() {
        return this.biEndorsetime;
    }

    public final Object getBiLeftThumb() {
        return this.biLeftThumb;
    }

    public final Object getBiLeftThumbDate() {
        return this.biLeftThumbDate;
    }

    public final Object getBiLminutia() {
        return this.biLminutia;
    }

    public final Object getBiLtm19794() {
        return this.biLtm19794;
    }

    public final Object getBiMinutiaCapturedThumb() {
        return this.biMinutiaCapturedThumb;
    }

    public final String getBiPhoto() {
        return this.biPhoto;
    }

    public final Object getBiPhotoDate() {
        return this.biPhotoDate;
    }

    public final String getBiRightThumb() {
        return this.biRightThumb;
    }

    public final Object getBiRightThumbDate() {
        return this.biRightThumbDate;
    }

    public final Object getBiRminutia() {
        return this.biRminutia;
    }

    public final Object getBiRtm19794() {
        return this.biRtm19794;
    }

    public final Object getBiSignDate() {
        return this.biSignDate;
    }

    public final String getBiSignature() {
        return this.biSignature;
    }

    public final Object getBiTokenId() {
        return this.biTokenId;
    }

    public final int getBiusid() {
        return this.biusid;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((this.biDlno.hashCode() * 31) + this.biEndorsedt.hashCode()) * 31) + this.biEndorsementNo.hashCode()) * 31) + this.biEndorsetime.hashCode()) * 31) + this.biLeftThumb.hashCode()) * 31) + this.biLeftThumbDate.hashCode()) * 31) + this.biLminutia.hashCode()) * 31) + this.biLtm19794.hashCode()) * 31) + this.biMinutiaCapturedThumb.hashCode()) * 31) + this.biPhoto.hashCode()) * 31) + this.biPhotoDate.hashCode()) * 31) + this.biRightThumb.hashCode()) * 31) + this.biRightThumbDate.hashCode()) * 31) + this.biRminutia.hashCode()) * 31) + this.biRtm19794.hashCode()) * 31) + this.biSignDate.hashCode()) * 31) + this.biSignature.hashCode()) * 31) + this.biTokenId.hashCode()) * 31) + Integer.hashCode(this.biusid);
    }

    public String toString() {
        return "BioImgObj(biDlno=" + this.biDlno + ", biEndorsedt=" + this.biEndorsedt + ", biEndorsementNo=" + this.biEndorsementNo + ", biEndorsetime=" + this.biEndorsetime + ", biLeftThumb=" + this.biLeftThumb + ", biLeftThumbDate=" + this.biLeftThumbDate + ", biLminutia=" + this.biLminutia + ", biLtm19794=" + this.biLtm19794 + ", biMinutiaCapturedThumb=" + this.biMinutiaCapturedThumb + ", biPhoto=" + this.biPhoto + ", biPhotoDate=" + this.biPhotoDate + ", biRightThumb=" + this.biRightThumb + ", biRightThumbDate=" + this.biRightThumbDate + ", biRminutia=" + this.biRminutia + ", biRtm19794=" + this.biRtm19794 + ", biSignDate=" + this.biSignDate + ", biSignature=" + this.biSignature + ", biTokenId=" + this.biTokenId + ", biusid=" + this.biusid + ')';
    }
}
