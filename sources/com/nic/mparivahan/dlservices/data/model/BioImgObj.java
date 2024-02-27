package com.nic.mparivahan.dlservices.data.model;

import androidx.annotation.Keep;
import cm.g;
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
    private final String biRightThumb;
    private final Object biRightThumbDate;
    private final Object biRminutia;
    private final Object biRtm19794;
    private final Object biSignDate;
    private final String biSignature;
    private final Object biTokenId;
    private final String biusid;

    public BioImgObj() {
        this((Object) null, (Object) null, (Object) null, (Object) null, (Object) null, (String) null, (Object) null, (String) null, (Object) null, (Object) null, (Object) null, (String) null, (String) null, (Object) null, (Object) null, (Object) null, (String) null, (Object) null, (Object) null, (Object) null, (Object) null, (String) null, (String) null, (Object) null, (Object) null, 33554431, (g) null);
    }

    public static /* synthetic */ BioImgObj copy$default(BioImgObj bioImgObj, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, String str, Object obj6, String str2, Object obj7, Object obj8, Object obj9, String str3, String str4, Object obj10, Object obj11, Object obj12, String str5, Object obj13, Object obj14, Object obj15, Object obj16, String str6, String str7, Object obj17, Object obj18, int i10, Object obj19) {
        BioImgObj bioImgObj2 = bioImgObj;
        int i11 = i10;
        return bioImgObj.copy((i11 & 1) != 0 ? bioImgObj2.biMinutiaCapturedThumb : obj, (i11 & 2) != 0 ? bioImgObj2.biLminutia : obj2, (i11 & 4) != 0 ? bioImgObj2.biDigest : obj3, (i11 & 8) != 0 ? bioImgObj2.biEndorsetime : obj4, (i11 & 16) != 0 ? bioImgObj2.biConfirmCapture : obj5, (i11 & 32) != 0 ? bioImgObj2.biRightThumb : str, (i11 & 64) != 0 ? bioImgObj2.biEndorsementNo : obj6, (i11 & 128) != 0 ? bioImgObj2.biPhoto : str2, (i11 & 256) != 0 ? bioImgObj2.biLeftThumbDate : obj7, (i11 & 512) != 0 ? bioImgObj2.biDlno : obj8, (i11 & 1024) != 0 ? bioImgObj2.biLeftThumb : obj9, (i11 & 2048) != 0 ? bioImgObj2.bdDevId : str3, (i11 & 4096) != 0 ? bioImgObj2.biBioId : str4, (i11 & 8192) != 0 ? bioImgObj2.biSignDate : obj10, (i11 & 16384) != 0 ? bioImgObj2.biLtm19794 : obj11, (i11 & 32768) != 0 ? bioImgObj2.biRtm19794 : obj12, (i11 & 65536) != 0 ? bioImgObj2.biSignature : str5, (i11 & 131072) != 0 ? bioImgObj2.biEndorsedt : obj13, (i11 & 262144) != 0 ? bioImgObj2.biBioCapturedDt : obj14, (i11 & 524288) != 0 ? bioImgObj2.biPhotoDate : obj15, (i11 & 1048576) != 0 ? bioImgObj2.biRminutia : obj16, (i11 & 2097152) != 0 ? bioImgObj2.biApplno : str6, (i11 & 4194304) != 0 ? bioImgObj2.biusid : str7, (i11 & 8388608) != 0 ? bioImgObj2.biRightThumbDate : obj17, (i11 & 16777216) != 0 ? bioImgObj2.biTokenId : obj18);
    }

    public final Object component1() {
        return this.biMinutiaCapturedThumb;
    }

    public final Object component10() {
        return this.biDlno;
    }

    public final Object component11() {
        return this.biLeftThumb;
    }

    public final String component12() {
        return this.bdDevId;
    }

    public final String component13() {
        return this.biBioId;
    }

    public final Object component14() {
        return this.biSignDate;
    }

    public final Object component15() {
        return this.biLtm19794;
    }

    public final Object component16() {
        return this.biRtm19794;
    }

    public final String component17() {
        return this.biSignature;
    }

    public final Object component18() {
        return this.biEndorsedt;
    }

    public final Object component19() {
        return this.biBioCapturedDt;
    }

    public final Object component2() {
        return this.biLminutia;
    }

    public final Object component20() {
        return this.biPhotoDate;
    }

    public final Object component21() {
        return this.biRminutia;
    }

    public final String component22() {
        return this.biApplno;
    }

    public final String component23() {
        return this.biusid;
    }

    public final Object component24() {
        return this.biRightThumbDate;
    }

    public final Object component25() {
        return this.biTokenId;
    }

    public final Object component3() {
        return this.biDigest;
    }

    public final Object component4() {
        return this.biEndorsetime;
    }

    public final Object component5() {
        return this.biConfirmCapture;
    }

    public final String component6() {
        return this.biRightThumb;
    }

    public final Object component7() {
        return this.biEndorsementNo;
    }

    public final String component8() {
        return this.biPhoto;
    }

    public final Object component9() {
        return this.biLeftThumbDate;
    }

    public final BioImgObj copy(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, String str, Object obj6, String str2, Object obj7, Object obj8, Object obj9, String str3, String str4, Object obj10, Object obj11, Object obj12, String str5, Object obj13, Object obj14, Object obj15, Object obj16, String str6, String str7, Object obj17, Object obj18) {
        return new BioImgObj(obj, obj2, obj3, obj4, obj5, str, obj6, str2, obj7, obj8, obj9, str3, str4, obj10, obj11, obj12, str5, obj13, obj14, obj15, obj16, str6, str7, obj17, obj18);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BioImgObj)) {
            return false;
        }
        BioImgObj bioImgObj = (BioImgObj) obj;
        return l.a(this.biMinutiaCapturedThumb, bioImgObj.biMinutiaCapturedThumb) && l.a(this.biLminutia, bioImgObj.biLminutia) && l.a(this.biDigest, bioImgObj.biDigest) && l.a(this.biEndorsetime, bioImgObj.biEndorsetime) && l.a(this.biConfirmCapture, bioImgObj.biConfirmCapture) && l.a(this.biRightThumb, bioImgObj.biRightThumb) && l.a(this.biEndorsementNo, bioImgObj.biEndorsementNo) && l.a(this.biPhoto, bioImgObj.biPhoto) && l.a(this.biLeftThumbDate, bioImgObj.biLeftThumbDate) && l.a(this.biDlno, bioImgObj.biDlno) && l.a(this.biLeftThumb, bioImgObj.biLeftThumb) && l.a(this.bdDevId, bioImgObj.bdDevId) && l.a(this.biBioId, bioImgObj.biBioId) && l.a(this.biSignDate, bioImgObj.biSignDate) && l.a(this.biLtm19794, bioImgObj.biLtm19794) && l.a(this.biRtm19794, bioImgObj.biRtm19794) && l.a(this.biSignature, bioImgObj.biSignature) && l.a(this.biEndorsedt, bioImgObj.biEndorsedt) && l.a(this.biBioCapturedDt, bioImgObj.biBioCapturedDt) && l.a(this.biPhotoDate, bioImgObj.biPhotoDate) && l.a(this.biRminutia, bioImgObj.biRminutia) && l.a(this.biApplno, bioImgObj.biApplno) && l.a(this.biusid, bioImgObj.biusid) && l.a(this.biRightThumbDate, bioImgObj.biRightThumbDate) && l.a(this.biTokenId, bioImgObj.biTokenId);
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

    public final String getBiusid() {
        return this.biusid;
    }

    public int hashCode() {
        Object obj = this.biMinutiaCapturedThumb;
        int i10 = 0;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.biLminutia;
        int hashCode2 = (hashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.biDigest;
        int hashCode3 = (hashCode2 + (obj3 == null ? 0 : obj3.hashCode())) * 31;
        Object obj4 = this.biEndorsetime;
        int hashCode4 = (hashCode3 + (obj4 == null ? 0 : obj4.hashCode())) * 31;
        Object obj5 = this.biConfirmCapture;
        int hashCode5 = (hashCode4 + (obj5 == null ? 0 : obj5.hashCode())) * 31;
        String str = this.biRightThumb;
        int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        Object obj6 = this.biEndorsementNo;
        int hashCode7 = (hashCode6 + (obj6 == null ? 0 : obj6.hashCode())) * 31;
        String str2 = this.biPhoto;
        int hashCode8 = (hashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Object obj7 = this.biLeftThumbDate;
        int hashCode9 = (hashCode8 + (obj7 == null ? 0 : obj7.hashCode())) * 31;
        Object obj8 = this.biDlno;
        int hashCode10 = (hashCode9 + (obj8 == null ? 0 : obj8.hashCode())) * 31;
        Object obj9 = this.biLeftThumb;
        int hashCode11 = (hashCode10 + (obj9 == null ? 0 : obj9.hashCode())) * 31;
        String str3 = this.bdDevId;
        int hashCode12 = (hashCode11 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.biBioId;
        int hashCode13 = (hashCode12 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Object obj10 = this.biSignDate;
        int hashCode14 = (hashCode13 + (obj10 == null ? 0 : obj10.hashCode())) * 31;
        Object obj11 = this.biLtm19794;
        int hashCode15 = (hashCode14 + (obj11 == null ? 0 : obj11.hashCode())) * 31;
        Object obj12 = this.biRtm19794;
        int hashCode16 = (hashCode15 + (obj12 == null ? 0 : obj12.hashCode())) * 31;
        String str5 = this.biSignature;
        int hashCode17 = (hashCode16 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Object obj13 = this.biEndorsedt;
        int hashCode18 = (hashCode17 + (obj13 == null ? 0 : obj13.hashCode())) * 31;
        Object obj14 = this.biBioCapturedDt;
        int hashCode19 = (hashCode18 + (obj14 == null ? 0 : obj14.hashCode())) * 31;
        Object obj15 = this.biPhotoDate;
        int hashCode20 = (hashCode19 + (obj15 == null ? 0 : obj15.hashCode())) * 31;
        Object obj16 = this.biRminutia;
        int hashCode21 = (hashCode20 + (obj16 == null ? 0 : obj16.hashCode())) * 31;
        String str6 = this.biApplno;
        int hashCode22 = (hashCode21 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.biusid;
        int hashCode23 = (hashCode22 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Object obj17 = this.biRightThumbDate;
        int hashCode24 = (hashCode23 + (obj17 == null ? 0 : obj17.hashCode())) * 31;
        Object obj18 = this.biTokenId;
        if (obj18 != null) {
            i10 = obj18.hashCode();
        }
        return hashCode24 + i10;
    }

    public String toString() {
        return "BioImgObj(biMinutiaCapturedThumb=" + this.biMinutiaCapturedThumb + ", biLminutia=" + this.biLminutia + ", biDigest=" + this.biDigest + ", biEndorsetime=" + this.biEndorsetime + ", biConfirmCapture=" + this.biConfirmCapture + ", biRightThumb=" + this.biRightThumb + ", biEndorsementNo=" + this.biEndorsementNo + ", biPhoto=" + this.biPhoto + ", biLeftThumbDate=" + this.biLeftThumbDate + ", biDlno=" + this.biDlno + ", biLeftThumb=" + this.biLeftThumb + ", bdDevId=" + this.bdDevId + ", biBioId=" + this.biBioId + ", biSignDate=" + this.biSignDate + ", biLtm19794=" + this.biLtm19794 + ", biRtm19794=" + this.biRtm19794 + ", biSignature=" + this.biSignature + ", biEndorsedt=" + this.biEndorsedt + ", biBioCapturedDt=" + this.biBioCapturedDt + ", biPhotoDate=" + this.biPhotoDate + ", biRminutia=" + this.biRminutia + ", biApplno=" + this.biApplno + ", biusid=" + this.biusid + ", biRightThumbDate=" + this.biRightThumbDate + ", biTokenId=" + this.biTokenId + ')';
    }

    public BioImgObj(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, String str, Object obj6, String str2, Object obj7, Object obj8, Object obj9, String str3, String str4, Object obj10, Object obj11, Object obj12, String str5, Object obj13, Object obj14, Object obj15, Object obj16, String str6, String str7, Object obj17, Object obj18) {
        this.biMinutiaCapturedThumb = obj;
        this.biLminutia = obj2;
        this.biDigest = obj3;
        this.biEndorsetime = obj4;
        this.biConfirmCapture = obj5;
        this.biRightThumb = str;
        this.biEndorsementNo = obj6;
        this.biPhoto = str2;
        this.biLeftThumbDate = obj7;
        this.biDlno = obj8;
        this.biLeftThumb = obj9;
        this.bdDevId = str3;
        this.biBioId = str4;
        this.biSignDate = obj10;
        this.biLtm19794 = obj11;
        this.biRtm19794 = obj12;
        this.biSignature = str5;
        this.biEndorsedt = obj13;
        this.biBioCapturedDt = obj14;
        this.biPhotoDate = obj15;
        this.biRminutia = obj16;
        this.biApplno = str6;
        this.biusid = str7;
        this.biRightThumbDate = obj17;
        this.biTokenId = obj18;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ BioImgObj(java.lang.Object r27, java.lang.Object r28, java.lang.Object r29, java.lang.Object r30, java.lang.Object r31, java.lang.String r32, java.lang.Object r33, java.lang.String r34, java.lang.Object r35, java.lang.Object r36, java.lang.Object r37, java.lang.String r38, java.lang.String r39, java.lang.Object r40, java.lang.Object r41, java.lang.Object r42, java.lang.String r43, java.lang.Object r44, java.lang.Object r45, java.lang.Object r46, java.lang.Object r47, java.lang.String r48, java.lang.String r49, java.lang.Object r50, java.lang.Object r51, int r52, cm.g r53) {
        /*
            r26 = this;
            r0 = r52
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0008
            r1 = 0
            goto L_0x000a
        L_0x0008:
            r1 = r27
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = 0
            goto L_0x0012
        L_0x0010:
            r3 = r28
        L_0x0012:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0018
            r4 = 0
            goto L_0x001a
        L_0x0018:
            r4 = r29
        L_0x001a:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0020
            r5 = 0
            goto L_0x0022
        L_0x0020:
            r5 = r30
        L_0x0022:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0028
            r6 = 0
            goto L_0x002a
        L_0x0028:
            r6 = r31
        L_0x002a:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0030
            r7 = 0
            goto L_0x0032
        L_0x0030:
            r7 = r32
        L_0x0032:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0038
            r8 = 0
            goto L_0x003a
        L_0x0038:
            r8 = r33
        L_0x003a:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0040
            r9 = 0
            goto L_0x0042
        L_0x0040:
            r9 = r34
        L_0x0042:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0048
            r10 = 0
            goto L_0x004a
        L_0x0048:
            r10 = r35
        L_0x004a:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x0050
            r11 = 0
            goto L_0x0052
        L_0x0050:
            r11 = r36
        L_0x0052:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x0058
            r12 = 0
            goto L_0x005a
        L_0x0058:
            r12 = r37
        L_0x005a:
            r13 = r0 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L_0x0060
            r13 = 0
            goto L_0x0062
        L_0x0060:
            r13 = r38
        L_0x0062:
            r14 = r0 & 4096(0x1000, float:5.74E-42)
            if (r14 == 0) goto L_0x0068
            r14 = 0
            goto L_0x006a
        L_0x0068:
            r14 = r39
        L_0x006a:
            r15 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r15 == 0) goto L_0x0070
            r15 = 0
            goto L_0x0072
        L_0x0070:
            r15 = r40
        L_0x0072:
            r2 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r2 == 0) goto L_0x0078
            r2 = 0
            goto L_0x007a
        L_0x0078:
            r2 = r41
        L_0x007a:
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r0 & r16
            if (r16 == 0) goto L_0x0084
            r16 = 0
            goto L_0x0086
        L_0x0084:
            r16 = r42
        L_0x0086:
            r17 = 65536(0x10000, float:9.18355E-41)
            r17 = r0 & r17
            if (r17 == 0) goto L_0x008f
            r17 = 0
            goto L_0x0091
        L_0x008f:
            r17 = r43
        L_0x0091:
            r18 = 131072(0x20000, float:1.83671E-40)
            r18 = r0 & r18
            if (r18 == 0) goto L_0x009a
            r18 = 0
            goto L_0x009c
        L_0x009a:
            r18 = r44
        L_0x009c:
            r19 = 262144(0x40000, float:3.67342E-40)
            r19 = r0 & r19
            if (r19 == 0) goto L_0x00a5
            r19 = 0
            goto L_0x00a7
        L_0x00a5:
            r19 = r45
        L_0x00a7:
            r20 = 524288(0x80000, float:7.34684E-40)
            r20 = r0 & r20
            if (r20 == 0) goto L_0x00b0
            r20 = 0
            goto L_0x00b2
        L_0x00b0:
            r20 = r46
        L_0x00b2:
            r21 = 1048576(0x100000, float:1.469368E-39)
            r21 = r0 & r21
            if (r21 == 0) goto L_0x00bb
            r21 = 0
            goto L_0x00bd
        L_0x00bb:
            r21 = r47
        L_0x00bd:
            r22 = 2097152(0x200000, float:2.938736E-39)
            r22 = r0 & r22
            if (r22 == 0) goto L_0x00c6
            r22 = 0
            goto L_0x00c8
        L_0x00c6:
            r22 = r48
        L_0x00c8:
            r23 = 4194304(0x400000, float:5.877472E-39)
            r23 = r0 & r23
            if (r23 == 0) goto L_0x00d1
            r23 = 0
            goto L_0x00d3
        L_0x00d1:
            r23 = r49
        L_0x00d3:
            r24 = 8388608(0x800000, float:1.17549435E-38)
            r24 = r0 & r24
            if (r24 == 0) goto L_0x00dc
            r24 = 0
            goto L_0x00de
        L_0x00dc:
            r24 = r50
        L_0x00de:
            r25 = 16777216(0x1000000, float:2.3509887E-38)
            r0 = r0 & r25
            if (r0 == 0) goto L_0x00e6
            r0 = 0
            goto L_0x00e8
        L_0x00e6:
            r0 = r51
        L_0x00e8:
            r27 = r26
            r28 = r1
            r29 = r3
            r30 = r4
            r31 = r5
            r32 = r6
            r33 = r7
            r34 = r8
            r35 = r9
            r36 = r10
            r37 = r11
            r38 = r12
            r39 = r13
            r40 = r14
            r41 = r15
            r42 = r2
            r43 = r16
            r44 = r17
            r45 = r18
            r46 = r19
            r47 = r20
            r48 = r21
            r49 = r22
            r50 = r23
            r51 = r24
            r52 = r0
            r27.<init>(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.dlservices.data.model.BioImgObj.<init>(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.String, java.lang.Object, java.lang.String, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.String, java.lang.String, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.String, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.String, java.lang.String, java.lang.Object, java.lang.Object, int, cm.g):void");
    }
}
