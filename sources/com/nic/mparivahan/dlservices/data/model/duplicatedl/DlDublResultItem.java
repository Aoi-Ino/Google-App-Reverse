package com.nic.mparivahan.dlservices.data.model.duplicatedl;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;

@Keep
public final class DlDublResultItem {
    @c("apdTempAdd1")
    private final String apdTempAdd1;
    @c("apdTempAdd2")
    private final String apdTempAdd2;
    @c("apdTempAdd3")
    private final String apdTempAdd3;
    @c("apdTempPin")
    private final Integer apdTempPin;
    @c("applDateOfBirth")
    private final String applDateOfBirth;
    @c("applFullName")
    private final String applFullName;
    @c("biPhotoBase64")
    private final String biPhotoBase64;
    @c("biSignatureBase64")
    private final String biSignatureBase64;
    @c("bloodGroup")
    private final String bloodGroup;
    @c("DLCOVList")
    private final DLCOVList dLCOVList;
    @c("dlNtValdfrDt")
    private final String dlNtValdfrDt;
    @c("dlNtValdtoDt")
    private final String dlNtValdtoDt;
    @c("dlno")
    private final String dlno;
    @c("gender")
    private final String gender;
    @c("lastEndRTO")
    private final String lastEndRTO;
    @c("lastEndState")
    private final String lastEndState;
    @c("relLastName")
    private final String relLastName;
    @c("relMiddleName")
    private final String relMiddleName;
    @c("relationType")
    private final String relationType;
    @c("rtoCode")
    private final String rtoCode;
    @c("stCode")
    private final String stCode;

    public DlDublResultItem() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (DLCOVList) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, 2097151, (g) null);
    }

    public static /* synthetic */ DlDublResultItem copy$default(DlDublResultItem dlDublResultItem, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, DLCOVList dLCOVList2, String str15, String str16, String str17, String str18, String str19, Integer num, int i10, Object obj) {
        DlDublResultItem dlDublResultItem2 = dlDublResultItem;
        int i11 = i10;
        return dlDublResultItem.copy((i11 & 1) != 0 ? dlDublResultItem2.relationType : str, (i11 & 2) != 0 ? dlDublResultItem2.biSignatureBase64 : str2, (i11 & 4) != 0 ? dlDublResultItem2.gender : str3, (i11 & 8) != 0 ? dlDublResultItem2.applDateOfBirth : str4, (i11 & 16) != 0 ? dlDublResultItem2.dlno : str5, (i11 & 32) != 0 ? dlDublResultItem2.lastEndState : str6, (i11 & 64) != 0 ? dlDublResultItem2.dlNtValdfrDt : str7, (i11 & 128) != 0 ? dlDublResultItem2.stCode : str8, (i11 & 256) != 0 ? dlDublResultItem2.rtoCode : str9, (i11 & 512) != 0 ? dlDublResultItem2.applFullName : str10, (i11 & 1024) != 0 ? dlDublResultItem2.relMiddleName : str11, (i11 & 2048) != 0 ? dlDublResultItem2.relLastName : str12, (i11 & 4096) != 0 ? dlDublResultItem2.bloodGroup : str13, (i11 & 8192) != 0 ? dlDublResultItem2.lastEndRTO : str14, (i11 & 16384) != 0 ? dlDublResultItem2.dLCOVList : dLCOVList2, (i11 & 32768) != 0 ? dlDublResultItem2.dlNtValdtoDt : str15, (i11 & 65536) != 0 ? dlDublResultItem2.apdTempAdd2 : str16, (i11 & 131072) != 0 ? dlDublResultItem2.apdTempAdd3 : str17, (i11 & 262144) != 0 ? dlDublResultItem2.biPhotoBase64 : str18, (i11 & 524288) != 0 ? dlDublResultItem2.apdTempAdd1 : str19, (i11 & 1048576) != 0 ? dlDublResultItem2.apdTempPin : num);
    }

    public final String component1() {
        return this.relationType;
    }

    public final String component10() {
        return this.applFullName;
    }

    public final String component11() {
        return this.relMiddleName;
    }

    public final String component12() {
        return this.relLastName;
    }

    public final String component13() {
        return this.bloodGroup;
    }

    public final String component14() {
        return this.lastEndRTO;
    }

    public final DLCOVList component15() {
        return this.dLCOVList;
    }

    public final String component16() {
        return this.dlNtValdtoDt;
    }

    public final String component17() {
        return this.apdTempAdd2;
    }

    public final String component18() {
        return this.apdTempAdd3;
    }

    public final String component19() {
        return this.biPhotoBase64;
    }

    public final String component2() {
        return this.biSignatureBase64;
    }

    public final String component20() {
        return this.apdTempAdd1;
    }

    public final Integer component21() {
        return this.apdTempPin;
    }

    public final String component3() {
        return this.gender;
    }

    public final String component4() {
        return this.applDateOfBirth;
    }

    public final String component5() {
        return this.dlno;
    }

    public final String component6() {
        return this.lastEndState;
    }

    public final String component7() {
        return this.dlNtValdfrDt;
    }

    public final String component8() {
        return this.stCode;
    }

    public final String component9() {
        return this.rtoCode;
    }

    public final DlDublResultItem copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, DLCOVList dLCOVList2, String str15, String str16, String str17, String str18, String str19, Integer num) {
        return new DlDublResultItem(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, dLCOVList2, str15, str16, str17, str18, str19, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DlDublResultItem)) {
            return false;
        }
        DlDublResultItem dlDublResultItem = (DlDublResultItem) obj;
        return l.a(this.relationType, dlDublResultItem.relationType) && l.a(this.biSignatureBase64, dlDublResultItem.biSignatureBase64) && l.a(this.gender, dlDublResultItem.gender) && l.a(this.applDateOfBirth, dlDublResultItem.applDateOfBirth) && l.a(this.dlno, dlDublResultItem.dlno) && l.a(this.lastEndState, dlDublResultItem.lastEndState) && l.a(this.dlNtValdfrDt, dlDublResultItem.dlNtValdfrDt) && l.a(this.stCode, dlDublResultItem.stCode) && l.a(this.rtoCode, dlDublResultItem.rtoCode) && l.a(this.applFullName, dlDublResultItem.applFullName) && l.a(this.relMiddleName, dlDublResultItem.relMiddleName) && l.a(this.relLastName, dlDublResultItem.relLastName) && l.a(this.bloodGroup, dlDublResultItem.bloodGroup) && l.a(this.lastEndRTO, dlDublResultItem.lastEndRTO) && l.a(this.dLCOVList, dlDublResultItem.dLCOVList) && l.a(this.dlNtValdtoDt, dlDublResultItem.dlNtValdtoDt) && l.a(this.apdTempAdd2, dlDublResultItem.apdTempAdd2) && l.a(this.apdTempAdd3, dlDublResultItem.apdTempAdd3) && l.a(this.biPhotoBase64, dlDublResultItem.biPhotoBase64) && l.a(this.apdTempAdd1, dlDublResultItem.apdTempAdd1) && l.a(this.apdTempPin, dlDublResultItem.apdTempPin);
    }

    public final String getApdTempAdd1() {
        return this.apdTempAdd1;
    }

    public final String getApdTempAdd2() {
        return this.apdTempAdd2;
    }

    public final String getApdTempAdd3() {
        return this.apdTempAdd3;
    }

    public final Integer getApdTempPin() {
        return this.apdTempPin;
    }

    public final String getApplDateOfBirth() {
        return this.applDateOfBirth;
    }

    public final String getApplFullName() {
        return this.applFullName;
    }

    public final String getBiPhotoBase64() {
        return this.biPhotoBase64;
    }

    public final String getBiSignatureBase64() {
        return this.biSignatureBase64;
    }

    public final String getBloodGroup() {
        return this.bloodGroup;
    }

    public final DLCOVList getDLCOVList() {
        return this.dLCOVList;
    }

    public final String getDlNtValdfrDt() {
        return this.dlNtValdfrDt;
    }

    public final String getDlNtValdtoDt() {
        return this.dlNtValdtoDt;
    }

    public final String getDlno() {
        return this.dlno;
    }

    public final String getGender() {
        return this.gender;
    }

    public final String getLastEndRTO() {
        return this.lastEndRTO;
    }

    public final String getLastEndState() {
        return this.lastEndState;
    }

    public final String getRelLastName() {
        return this.relLastName;
    }

    public final String getRelMiddleName() {
        return this.relMiddleName;
    }

    public final String getRelationType() {
        return this.relationType;
    }

    public final String getRtoCode() {
        return this.rtoCode;
    }

    public final String getStCode() {
        return this.stCode;
    }

    public int hashCode() {
        String str = this.relationType;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.biSignatureBase64;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.gender;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.applDateOfBirth;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.dlno;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.lastEndState;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.dlNtValdfrDt;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.stCode;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.rtoCode;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.applFullName;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.relMiddleName;
        int hashCode11 = (hashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.relLastName;
        int hashCode12 = (hashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.bloodGroup;
        int hashCode13 = (hashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.lastEndRTO;
        int hashCode14 = (hashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
        DLCOVList dLCOVList2 = this.dLCOVList;
        int hashCode15 = (hashCode14 + (dLCOVList2 == null ? 0 : dLCOVList2.hashCode())) * 31;
        String str15 = this.dlNtValdtoDt;
        int hashCode16 = (hashCode15 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.apdTempAdd2;
        int hashCode17 = (hashCode16 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.apdTempAdd3;
        int hashCode18 = (hashCode17 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.biPhotoBase64;
        int hashCode19 = (hashCode18 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.apdTempAdd1;
        int hashCode20 = (hashCode19 + (str19 == null ? 0 : str19.hashCode())) * 31;
        Integer num = this.apdTempPin;
        if (num != null) {
            i10 = num.hashCode();
        }
        return hashCode20 + i10;
    }

    public String toString() {
        return "DlDublResultItem(relationType=" + this.relationType + ", biSignatureBase64=" + this.biSignatureBase64 + ", gender=" + this.gender + ", applDateOfBirth=" + this.applDateOfBirth + ", dlno=" + this.dlno + ", lastEndState=" + this.lastEndState + ", dlNtValdfrDt=" + this.dlNtValdfrDt + ", stCode=" + this.stCode + ", rtoCode=" + this.rtoCode + ", applFullName=" + this.applFullName + ", relMiddleName=" + this.relMiddleName + ", relLastName=" + this.relLastName + ", bloodGroup=" + this.bloodGroup + ", lastEndRTO=" + this.lastEndRTO + ", dLCOVList=" + this.dLCOVList + ", dlNtValdtoDt=" + this.dlNtValdtoDt + ", apdTempAdd2=" + this.apdTempAdd2 + ", apdTempAdd3=" + this.apdTempAdd3 + ", biPhotoBase64=" + this.biPhotoBase64 + ", apdTempAdd1=" + this.apdTempAdd1 + ", apdTempPin=" + this.apdTempPin + ')';
    }

    public DlDublResultItem(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, DLCOVList dLCOVList2, String str15, String str16, String str17, String str18, String str19, Integer num) {
        this.relationType = str;
        this.biSignatureBase64 = str2;
        this.gender = str3;
        this.applDateOfBirth = str4;
        this.dlno = str5;
        this.lastEndState = str6;
        this.dlNtValdfrDt = str7;
        this.stCode = str8;
        this.rtoCode = str9;
        this.applFullName = str10;
        this.relMiddleName = str11;
        this.relLastName = str12;
        this.bloodGroup = str13;
        this.lastEndRTO = str14;
        this.dLCOVList = dLCOVList2;
        this.dlNtValdtoDt = str15;
        this.apdTempAdd2 = str16;
        this.apdTempAdd3 = str17;
        this.biPhotoBase64 = str18;
        this.apdTempAdd1 = str19;
        this.apdTempPin = num;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ DlDublResultItem(java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, java.lang.String r36, com.nic.mparivahan.dlservices.data.model.duplicatedl.DLCOVList r37, java.lang.String r38, java.lang.String r39, java.lang.String r40, java.lang.String r41, java.lang.String r42, java.lang.Integer r43, int r44, cm.g r45) {
        /*
            r22 = this;
            r0 = r44
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0008
            r1 = 0
            goto L_0x000a
        L_0x0008:
            r1 = r23
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = 0
            goto L_0x0012
        L_0x0010:
            r3 = r24
        L_0x0012:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0018
            r4 = 0
            goto L_0x001a
        L_0x0018:
            r4 = r25
        L_0x001a:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0020
            r5 = 0
            goto L_0x0022
        L_0x0020:
            r5 = r26
        L_0x0022:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0028
            r6 = 0
            goto L_0x002a
        L_0x0028:
            r6 = r27
        L_0x002a:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0030
            r7 = 0
            goto L_0x0032
        L_0x0030:
            r7 = r28
        L_0x0032:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0038
            r8 = 0
            goto L_0x003a
        L_0x0038:
            r8 = r29
        L_0x003a:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0040
            r9 = 0
            goto L_0x0042
        L_0x0040:
            r9 = r30
        L_0x0042:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0048
            r10 = 0
            goto L_0x004a
        L_0x0048:
            r10 = r31
        L_0x004a:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x0050
            r11 = 0
            goto L_0x0052
        L_0x0050:
            r11 = r32
        L_0x0052:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x0058
            r12 = 0
            goto L_0x005a
        L_0x0058:
            r12 = r33
        L_0x005a:
            r13 = r0 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L_0x0060
            r13 = 0
            goto L_0x0062
        L_0x0060:
            r13 = r34
        L_0x0062:
            r14 = r0 & 4096(0x1000, float:5.74E-42)
            if (r14 == 0) goto L_0x0068
            r14 = 0
            goto L_0x006a
        L_0x0068:
            r14 = r35
        L_0x006a:
            r15 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r15 == 0) goto L_0x0070
            r15 = 0
            goto L_0x0072
        L_0x0070:
            r15 = r36
        L_0x0072:
            r2 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r2 == 0) goto L_0x0078
            r2 = 0
            goto L_0x007a
        L_0x0078:
            r2 = r37
        L_0x007a:
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r0 & r16
            if (r16 == 0) goto L_0x0084
            r16 = 0
            goto L_0x0086
        L_0x0084:
            r16 = r38
        L_0x0086:
            r17 = 65536(0x10000, float:9.18355E-41)
            r17 = r0 & r17
            if (r17 == 0) goto L_0x008f
            r17 = 0
            goto L_0x0091
        L_0x008f:
            r17 = r39
        L_0x0091:
            r18 = 131072(0x20000, float:1.83671E-40)
            r18 = r0 & r18
            if (r18 == 0) goto L_0x009a
            r18 = 0
            goto L_0x009c
        L_0x009a:
            r18 = r40
        L_0x009c:
            r19 = 262144(0x40000, float:3.67342E-40)
            r19 = r0 & r19
            if (r19 == 0) goto L_0x00a5
            r19 = 0
            goto L_0x00a7
        L_0x00a5:
            r19 = r41
        L_0x00a7:
            r20 = 524288(0x80000, float:7.34684E-40)
            r20 = r0 & r20
            if (r20 == 0) goto L_0x00b0
            r20 = 0
            goto L_0x00b2
        L_0x00b0:
            r20 = r42
        L_0x00b2:
            r21 = 1048576(0x100000, float:1.469368E-39)
            r0 = r0 & r21
            if (r0 == 0) goto L_0x00ba
            r0 = 0
            goto L_0x00bc
        L_0x00ba:
            r0 = r43
        L_0x00bc:
            r23 = r22
            r24 = r1
            r25 = r3
            r26 = r4
            r27 = r5
            r28 = r6
            r29 = r7
            r30 = r8
            r31 = r9
            r32 = r10
            r33 = r11
            r34 = r12
            r35 = r13
            r36 = r14
            r37 = r15
            r38 = r2
            r39 = r16
            r40 = r17
            r41 = r18
            r42 = r19
            r43 = r20
            r44 = r0
            r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.dlservices.data.model.duplicatedl.DlDublResultItem.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.nic.mparivahan.dlservices.data.model.duplicatedl.DLCOVList, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, int, cm.g):void");
    }
}
