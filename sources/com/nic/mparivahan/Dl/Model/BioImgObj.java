package com.nic.mparivahan.Dl.Model;

import androidx.annotation.Keep;
import cm.l;
import java.io.Serializable;

@Keep
public final class BioImgObj implements Serializable {
    private final String bdDevId;
    private final String biApplno;
    private final Object biBioCapturedDt;
    private final String biBioId;
    private final Object biConfirmCapture;
    private final Object biDigest;
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
    private final Object biRightThumb;
    private final Object biRightThumbDate;
    private final Object biRminutia;
    private final Object biRtm19794;
    private final Object biSignDate;
    private final String biSignature;
    private final Object biTokenId;
    private final String biusid;

    public BioImgObj(String str, String str2, Object obj, String str3, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, String str4, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18, String str5, Object obj19, String str6) {
        String str7 = str;
        String str8 = str2;
        Object obj20 = obj;
        String str9 = str3;
        Object obj21 = obj2;
        Object obj22 = obj3;
        Object obj23 = obj4;
        Object obj24 = obj5;
        Object obj25 = obj6;
        Object obj26 = obj7;
        Object obj27 = obj8;
        Object obj28 = obj9;
        Object obj29 = obj10;
        Object obj30 = obj11;
        Object obj31 = obj13;
        l.f(str7, "bdDevId");
        l.f(str8, "biApplno");
        l.f(obj20, "biBioCapturedDt");
        l.f(str9, "biBioId");
        l.f(obj21, "biConfirmCapture");
        l.f(obj22, "biDigest");
        l.f(obj23, "biDlno");
        l.f(obj24, "biEndorsedt");
        l.f(obj25, "biEndorsementNo");
        l.f(obj26, "biEndorsetime");
        l.f(obj27, "biLeftThumb");
        l.f(obj28, "biLeftThumbDate");
        l.f(obj29, "biLminutia");
        l.f(obj30, "biLtm19794");
        l.f(obj12, "biMinutiaCapturedThumb");
        l.f(obj13, "biPhotoDate");
        l.f(obj14, "biRightThumb");
        l.f(obj15, "biRightThumbDate");
        l.f(obj16, "biRminutia");
        l.f(obj17, "biRtm19794");
        l.f(obj18, "biSignDate");
        l.f(str5, "biSignature");
        l.f(obj19, "biTokenId");
        l.f(str6, "biusid");
        this.bdDevId = str7;
        this.biApplno = str8;
        this.biBioCapturedDt = obj20;
        this.biBioId = str9;
        this.biConfirmCapture = obj21;
        this.biDigest = obj22;
        this.biDlno = obj23;
        this.biEndorsedt = obj24;
        this.biEndorsementNo = obj25;
        this.biEndorsetime = obj26;
        this.biLeftThumb = obj27;
        this.biLeftThumbDate = obj28;
        this.biLminutia = obj29;
        this.biLtm19794 = obj30;
        this.biMinutiaCapturedThumb = obj12;
        this.biPhoto = str4;
        this.biPhotoDate = obj13;
        this.biRightThumb = obj14;
        this.biRightThumbDate = obj15;
        this.biRminutia = obj16;
        this.biRtm19794 = obj17;
        this.biSignDate = obj18;
        this.biSignature = str5;
        this.biTokenId = obj19;
        this.biusid = str6;
    }

    public static /* synthetic */ BioImgObj copy$default(BioImgObj bioImgObj, String str, String str2, Object obj, String str3, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, String str4, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18, String str5, Object obj19, String str6, int i10, Object obj20) {
        BioImgObj bioImgObj2 = bioImgObj;
        int i11 = i10;
        return bioImgObj.copy((i11 & 1) != 0 ? bioImgObj2.bdDevId : str, (i11 & 2) != 0 ? bioImgObj2.biApplno : str2, (i11 & 4) != 0 ? bioImgObj2.biBioCapturedDt : obj, (i11 & 8) != 0 ? bioImgObj2.biBioId : str3, (i11 & 16) != 0 ? bioImgObj2.biConfirmCapture : obj2, (i11 & 32) != 0 ? bioImgObj2.biDigest : obj3, (i11 & 64) != 0 ? bioImgObj2.biDlno : obj4, (i11 & 128) != 0 ? bioImgObj2.biEndorsedt : obj5, (i11 & 256) != 0 ? bioImgObj2.biEndorsementNo : obj6, (i11 & 512) != 0 ? bioImgObj2.biEndorsetime : obj7, (i11 & 1024) != 0 ? bioImgObj2.biLeftThumb : obj8, (i11 & 2048) != 0 ? bioImgObj2.biLeftThumbDate : obj9, (i11 & 4096) != 0 ? bioImgObj2.biLminutia : obj10, (i11 & 8192) != 0 ? bioImgObj2.biLtm19794 : obj11, (i11 & 16384) != 0 ? bioImgObj2.biMinutiaCapturedThumb : obj12, (i11 & 32768) != 0 ? bioImgObj2.biPhoto : str4, (i11 & 65536) != 0 ? bioImgObj2.biPhotoDate : obj13, (i11 & 131072) != 0 ? bioImgObj2.biRightThumb : obj14, (i11 & 262144) != 0 ? bioImgObj2.biRightThumbDate : obj15, (i11 & 524288) != 0 ? bioImgObj2.biRminutia : obj16, (i11 & 1048576) != 0 ? bioImgObj2.biRtm19794 : obj17, (i11 & 2097152) != 0 ? bioImgObj2.biSignDate : obj18, (i11 & 4194304) != 0 ? bioImgObj2.biSignature : str5, (i11 & 8388608) != 0 ? bioImgObj2.biTokenId : obj19, (i11 & 16777216) != 0 ? bioImgObj2.biusid : str6);
    }

    public final String component1() {
        return this.bdDevId;
    }

    public final Object component10() {
        return this.biEndorsetime;
    }

    public final Object component11() {
        return this.biLeftThumb;
    }

    public final Object component12() {
        return this.biLeftThumbDate;
    }

    public final Object component13() {
        return this.biLminutia;
    }

    public final Object component14() {
        return this.biLtm19794;
    }

    public final Object component15() {
        return this.biMinutiaCapturedThumb;
    }

    public final String component16() {
        return this.biPhoto;
    }

    public final Object component17() {
        return this.biPhotoDate;
    }

    public final Object component18() {
        return this.biRightThumb;
    }

    public final Object component19() {
        return this.biRightThumbDate;
    }

    public final String component2() {
        return this.biApplno;
    }

    public final Object component20() {
        return this.biRminutia;
    }

    public final Object component21() {
        return this.biRtm19794;
    }

    public final Object component22() {
        return this.biSignDate;
    }

    public final String component23() {
        return this.biSignature;
    }

    public final Object component24() {
        return this.biTokenId;
    }

    public final String component25() {
        return this.biusid;
    }

    public final Object component3() {
        return this.biBioCapturedDt;
    }

    public final String component4() {
        return this.biBioId;
    }

    public final Object component5() {
        return this.biConfirmCapture;
    }

    public final Object component6() {
        return this.biDigest;
    }

    public final Object component7() {
        return this.biDlno;
    }

    public final Object component8() {
        return this.biEndorsedt;
    }

    public final Object component9() {
        return this.biEndorsementNo;
    }

    public final BioImgObj copy(String str, String str2, Object obj, String str3, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, String str4, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18, String str5, Object obj19, String str6) {
        String str7 = str;
        l.f(str7, "bdDevId");
        l.f(str2, "biApplno");
        l.f(obj, "biBioCapturedDt");
        l.f(str3, "biBioId");
        l.f(obj2, "biConfirmCapture");
        l.f(obj3, "biDigest");
        l.f(obj4, "biDlno");
        l.f(obj5, "biEndorsedt");
        l.f(obj6, "biEndorsementNo");
        l.f(obj7, "biEndorsetime");
        l.f(obj8, "biLeftThumb");
        l.f(obj9, "biLeftThumbDate");
        l.f(obj10, "biLminutia");
        l.f(obj11, "biLtm19794");
        l.f(obj12, "biMinutiaCapturedThumb");
        l.f(obj13, "biPhotoDate");
        l.f(obj14, "biRightThumb");
        l.f(obj15, "biRightThumbDate");
        l.f(obj16, "biRminutia");
        l.f(obj17, "biRtm19794");
        l.f(obj18, "biSignDate");
        l.f(str5, "biSignature");
        l.f(obj19, "biTokenId");
        l.f(str6, "biusid");
        return new BioImgObj(str7, str2, obj, str3, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, str4, obj13, obj14, obj15, obj16, obj17, obj18, str5, obj19, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BioImgObj)) {
            return false;
        }
        BioImgObj bioImgObj = (BioImgObj) obj;
        return l.a(this.bdDevId, bioImgObj.bdDevId) && l.a(this.biApplno, bioImgObj.biApplno) && l.a(this.biBioCapturedDt, bioImgObj.biBioCapturedDt) && l.a(this.biBioId, bioImgObj.biBioId) && l.a(this.biConfirmCapture, bioImgObj.biConfirmCapture) && l.a(this.biDigest, bioImgObj.biDigest) && l.a(this.biDlno, bioImgObj.biDlno) && l.a(this.biEndorsedt, bioImgObj.biEndorsedt) && l.a(this.biEndorsementNo, bioImgObj.biEndorsementNo) && l.a(this.biEndorsetime, bioImgObj.biEndorsetime) && l.a(this.biLeftThumb, bioImgObj.biLeftThumb) && l.a(this.biLeftThumbDate, bioImgObj.biLeftThumbDate) && l.a(this.biLminutia, bioImgObj.biLminutia) && l.a(this.biLtm19794, bioImgObj.biLtm19794) && l.a(this.biMinutiaCapturedThumb, bioImgObj.biMinutiaCapturedThumb) && l.a(this.biPhoto, bioImgObj.biPhoto) && l.a(this.biPhotoDate, bioImgObj.biPhotoDate) && l.a(this.biRightThumb, bioImgObj.biRightThumb) && l.a(this.biRightThumbDate, bioImgObj.biRightThumbDate) && l.a(this.biRminutia, bioImgObj.biRminutia) && l.a(this.biRtm19794, bioImgObj.biRtm19794) && l.a(this.biSignDate, bioImgObj.biSignDate) && l.a(this.biSignature, bioImgObj.biSignature) && l.a(this.biTokenId, bioImgObj.biTokenId) && l.a(this.biusid, bioImgObj.biusid);
    }

    public final String getBdDevId() {
        return this.bdDevId;
    }

    public final String getBiApplno() {
        return this.biApplno;
    }

    public final Object getBiBioCapturedDt() {
        return this.biBioCapturedDt;
    }

    public final String getBiBioId() {
        return this.biBioId;
    }

    public final Object getBiConfirmCapture() {
        return this.biConfirmCapture;
    }

    public final Object getBiDigest() {
        return this.biDigest;
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

    public final Object getBiRightThumb() {
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

    public final String getBiusid() {
        return this.biusid;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((((((((((((this.bdDevId.hashCode() * 31) + this.biApplno.hashCode()) * 31) + this.biBioCapturedDt.hashCode()) * 31) + this.biBioId.hashCode()) * 31) + this.biConfirmCapture.hashCode()) * 31) + this.biDigest.hashCode()) * 31) + this.biDlno.hashCode()) * 31) + this.biEndorsedt.hashCode()) * 31) + this.biEndorsementNo.hashCode()) * 31) + this.biEndorsetime.hashCode()) * 31) + this.biLeftThumb.hashCode()) * 31) + this.biLeftThumbDate.hashCode()) * 31) + this.biLminutia.hashCode()) * 31) + this.biLtm19794.hashCode()) * 31) + this.biMinutiaCapturedThumb.hashCode()) * 31;
        String str = this.biPhoto;
        return ((((((((((((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.biPhotoDate.hashCode()) * 31) + this.biRightThumb.hashCode()) * 31) + this.biRightThumbDate.hashCode()) * 31) + this.biRminutia.hashCode()) * 31) + this.biRtm19794.hashCode()) * 31) + this.biSignDate.hashCode()) * 31) + this.biSignature.hashCode()) * 31) + this.biTokenId.hashCode()) * 31) + this.biusid.hashCode();
    }

    public String toString() {
        return "BioImgObj(bdDevId=" + this.bdDevId + ", biApplno=" + this.biApplno + ", biBioCapturedDt=" + this.biBioCapturedDt + ", biBioId=" + this.biBioId + ", biConfirmCapture=" + this.biConfirmCapture + ", biDigest=" + this.biDigest + ", biDlno=" + this.biDlno + ", biEndorsedt=" + this.biEndorsedt + ", biEndorsementNo=" + this.biEndorsementNo + ", biEndorsetime=" + this.biEndorsetime + ", biLeftThumb=" + this.biLeftThumb + ", biLeftThumbDate=" + this.biLeftThumbDate + ", biLminutia=" + this.biLminutia + ", biLtm19794=" + this.biLtm19794 + ", biMinutiaCapturedThumb=" + this.biMinutiaCapturedThumb + ", biPhoto=" + this.biPhoto + ", biPhotoDate=" + this.biPhotoDate + ", biRightThumb=" + this.biRightThumb + ", biRightThumbDate=" + this.biRightThumbDate + ", biRminutia=" + this.biRminutia + ", biRtm19794=" + this.biRtm19794 + ", biSignDate=" + this.biSignDate + ", biSignature=" + this.biSignature + ", biTokenId=" + this.biTokenId + ", biusid=" + this.biusid + ')';
    }
}
