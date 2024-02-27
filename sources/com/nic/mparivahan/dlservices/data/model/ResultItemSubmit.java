package com.nic.mparivahan.dlservices.data.model;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;
import java.io.Serializable;

@Keep
public final class ResultItemSubmit implements Serializable {
    @c("applicantAddress")
    private final String applicantAddress;
    @c("applicantGender")
    private final String applicantGender;
    @c("applicantname")
    private final String applicantname;
    @c("applicationDate")
    private final String applicationDate;
    @c("applicationNo")
    private final String applicationNo;
    @c("barCode")
    private final String barCode;
    @c("bioBloodGroupname")
    private final String bioBloodGroupname;
    @c("bloodGroup")
    private final String bloodGroup;
    @c("dLCOVNames")
    private final String dLCOVNames;
    @c("dateofBirth")
    private final String dateofBirth;
    @c("dlno")
    private final String dlno;
    @c("documentaryProofsRequired")
    private final String documentaryProofsRequired;
    @c("fatherName")
    private final String fatherName;
    @c("isFaceless")
    private final String isFaceless;
    @c("llReqforRetestMsg")
    private final String llReqforRetestMsg;
    @c("NTValidities")
    private final String nTValidities;
    @c("note1")
    private final String note1;
    @c("note2")
    private final String note2;
    @c("note3")
    private final String note3;
    @c("note4")
    private final String note4;
    @c("referenceLink")
    private final String referenceLink;
    @c("rtoLocation")
    private final String rtoLocation;
    @c("servicesRequested")
    private final ServicesRequested servicesRequested;
    @c("smsConfirmation")
    private final String smsConfirmation;
    @c("TRValidities")
    private final String tRValidities;

    public ResultItemSubmit() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (ServicesRequested) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 33554431, (g) null);
    }

    public static /* synthetic */ ResultItemSubmit copy$default(ResultItemSubmit resultItemSubmit, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, ServicesRequested servicesRequested2, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, int i10, Object obj) {
        ResultItemSubmit resultItemSubmit2 = resultItemSubmit;
        int i11 = i10;
        return resultItemSubmit.copy((i11 & 1) != 0 ? resultItemSubmit2.fatherName : str, (i11 & 2) != 0 ? resultItemSubmit2.dateofBirth : str2, (i11 & 4) != 0 ? resultItemSubmit2.note2 : str3, (i11 & 8) != 0 ? resultItemSubmit2.nTValidities : str4, (i11 & 16) != 0 ? resultItemSubmit2.note3 : str5, (i11 & 32) != 0 ? resultItemSubmit2.note4 : str6, (i11 & 64) != 0 ? resultItemSubmit2.applicationNo : str7, (i11 & 128) != 0 ? resultItemSubmit2.applicantAddress : str8, (i11 & 256) != 0 ? resultItemSubmit2.dlno : str9, (i11 & 512) != 0 ? resultItemSubmit2.referenceLink : str10, (i11 & 1024) != 0 ? resultItemSubmit2.barCode : str11, (i11 & 2048) != 0 ? resultItemSubmit2.applicantGender : str12, (i11 & 4096) != 0 ? resultItemSubmit2.servicesRequested : servicesRequested2, (i11 & 8192) != 0 ? resultItemSubmit2.dLCOVNames : str13, (i11 & 16384) != 0 ? resultItemSubmit2.documentaryProofsRequired : str14, (i11 & 32768) != 0 ? resultItemSubmit2.rtoLocation : str15, (i11 & 65536) != 0 ? resultItemSubmit2.applicantname : str16, (i11 & 131072) != 0 ? resultItemSubmit2.note1 : str17, (i11 & 262144) != 0 ? resultItemSubmit2.tRValidities : str18, (i11 & 524288) != 0 ? resultItemSubmit2.smsConfirmation : str19, (i11 & 1048576) != 0 ? resultItemSubmit2.bioBloodGroupname : str20, (i11 & 2097152) != 0 ? resultItemSubmit2.bloodGroup : str21, (i11 & 4194304) != 0 ? resultItemSubmit2.applicationDate : str22, (i11 & 8388608) != 0 ? resultItemSubmit2.isFaceless : str23, (i11 & 16777216) != 0 ? resultItemSubmit2.llReqforRetestMsg : str24);
    }

    public final String component1() {
        return this.fatherName;
    }

    public final String component10() {
        return this.referenceLink;
    }

    public final String component11() {
        return this.barCode;
    }

    public final String component12() {
        return this.applicantGender;
    }

    public final ServicesRequested component13() {
        return this.servicesRequested;
    }

    public final String component14() {
        return this.dLCOVNames;
    }

    public final String component15() {
        return this.documentaryProofsRequired;
    }

    public final String component16() {
        return this.rtoLocation;
    }

    public final String component17() {
        return this.applicantname;
    }

    public final String component18() {
        return this.note1;
    }

    public final String component19() {
        return this.tRValidities;
    }

    public final String component2() {
        return this.dateofBirth;
    }

    public final String component20() {
        return this.smsConfirmation;
    }

    public final String component21() {
        return this.bioBloodGroupname;
    }

    public final String component22() {
        return this.bloodGroup;
    }

    public final String component23() {
        return this.applicationDate;
    }

    public final String component24() {
        return this.isFaceless;
    }

    public final String component25() {
        return this.llReqforRetestMsg;
    }

    public final String component3() {
        return this.note2;
    }

    public final String component4() {
        return this.nTValidities;
    }

    public final String component5() {
        return this.note3;
    }

    public final String component6() {
        return this.note4;
    }

    public final String component7() {
        return this.applicationNo;
    }

    public final String component8() {
        return this.applicantAddress;
    }

    public final String component9() {
        return this.dlno;
    }

    public final ResultItemSubmit copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, ServicesRequested servicesRequested2, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24) {
        String str25 = str;
        l.f(str25, "fatherName");
        l.f(str2, "dateofBirth");
        l.f(str4, "nTValidities");
        l.f(str12, "applicantGender");
        l.f(str16, "applicantname");
        l.f(str18, "tRValidities");
        l.f(str19, "smsConfirmation");
        l.f(str20, "bioBloodGroupname");
        l.f(str21, "bloodGroup");
        l.f(str22, "applicationDate");
        return new ResultItemSubmit(str25, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, servicesRequested2, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultItemSubmit)) {
            return false;
        }
        ResultItemSubmit resultItemSubmit = (ResultItemSubmit) obj;
        return l.a(this.fatherName, resultItemSubmit.fatherName) && l.a(this.dateofBirth, resultItemSubmit.dateofBirth) && l.a(this.note2, resultItemSubmit.note2) && l.a(this.nTValidities, resultItemSubmit.nTValidities) && l.a(this.note3, resultItemSubmit.note3) && l.a(this.note4, resultItemSubmit.note4) && l.a(this.applicationNo, resultItemSubmit.applicationNo) && l.a(this.applicantAddress, resultItemSubmit.applicantAddress) && l.a(this.dlno, resultItemSubmit.dlno) && l.a(this.referenceLink, resultItemSubmit.referenceLink) && l.a(this.barCode, resultItemSubmit.barCode) && l.a(this.applicantGender, resultItemSubmit.applicantGender) && l.a(this.servicesRequested, resultItemSubmit.servicesRequested) && l.a(this.dLCOVNames, resultItemSubmit.dLCOVNames) && l.a(this.documentaryProofsRequired, resultItemSubmit.documentaryProofsRequired) && l.a(this.rtoLocation, resultItemSubmit.rtoLocation) && l.a(this.applicantname, resultItemSubmit.applicantname) && l.a(this.note1, resultItemSubmit.note1) && l.a(this.tRValidities, resultItemSubmit.tRValidities) && l.a(this.smsConfirmation, resultItemSubmit.smsConfirmation) && l.a(this.bioBloodGroupname, resultItemSubmit.bioBloodGroupname) && l.a(this.bloodGroup, resultItemSubmit.bloodGroup) && l.a(this.applicationDate, resultItemSubmit.applicationDate) && l.a(this.isFaceless, resultItemSubmit.isFaceless) && l.a(this.llReqforRetestMsg, resultItemSubmit.llReqforRetestMsg);
    }

    public final String getApplicantAddress() {
        return this.applicantAddress;
    }

    public final String getApplicantGender() {
        return this.applicantGender;
    }

    public final String getApplicantname() {
        return this.applicantname;
    }

    public final String getApplicationDate() {
        return this.applicationDate;
    }

    public final String getApplicationNo() {
        return this.applicationNo;
    }

    public final String getBarCode() {
        return this.barCode;
    }

    public final String getBioBloodGroupname() {
        return this.bioBloodGroupname;
    }

    public final String getBloodGroup() {
        return this.bloodGroup;
    }

    public final String getDLCOVNames() {
        return this.dLCOVNames;
    }

    public final String getDateofBirth() {
        return this.dateofBirth;
    }

    public final String getDlno() {
        return this.dlno;
    }

    public final String getDocumentaryProofsRequired() {
        return this.documentaryProofsRequired;
    }

    public final String getFatherName() {
        return this.fatherName;
    }

    public final String getLlReqforRetestMsg() {
        return this.llReqforRetestMsg;
    }

    public final String getNTValidities() {
        return this.nTValidities;
    }

    public final String getNote1() {
        return this.note1;
    }

    public final String getNote2() {
        return this.note2;
    }

    public final String getNote3() {
        return this.note3;
    }

    public final String getNote4() {
        return this.note4;
    }

    public final String getReferenceLink() {
        return this.referenceLink;
    }

    public final String getRtoLocation() {
        return this.rtoLocation;
    }

    public final ServicesRequested getServicesRequested() {
        return this.servicesRequested;
    }

    public final String getSmsConfirmation() {
        return this.smsConfirmation;
    }

    public final String getTRValidities() {
        return this.tRValidities;
    }

    public int hashCode() {
        int hashCode = ((this.fatherName.hashCode() * 31) + this.dateofBirth.hashCode()) * 31;
        String str = this.note2;
        int i10 = 0;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.nTValidities.hashCode()) * 31;
        String str2 = this.note3;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.note4;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.applicationNo;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.applicantAddress;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.dlno;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.referenceLink;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.barCode;
        int hashCode9 = (((hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31) + this.applicantGender.hashCode()) * 31;
        ServicesRequested servicesRequested2 = this.servicesRequested;
        int hashCode10 = (hashCode9 + (servicesRequested2 == null ? 0 : servicesRequested2.hashCode())) * 31;
        String str9 = this.dLCOVNames;
        int hashCode11 = (hashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.documentaryProofsRequired;
        int hashCode12 = (hashCode11 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.rtoLocation;
        int hashCode13 = (((hashCode12 + (str11 == null ? 0 : str11.hashCode())) * 31) + this.applicantname.hashCode()) * 31;
        String str12 = this.note1;
        int hashCode14 = (((((((((((hashCode13 + (str12 == null ? 0 : str12.hashCode())) * 31) + this.tRValidities.hashCode()) * 31) + this.smsConfirmation.hashCode()) * 31) + this.bioBloodGroupname.hashCode()) * 31) + this.bloodGroup.hashCode()) * 31) + this.applicationDate.hashCode()) * 31;
        String str13 = this.isFaceless;
        int hashCode15 = (hashCode14 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.llReqforRetestMsg;
        if (str14 != null) {
            i10 = str14.hashCode();
        }
        return hashCode15 + i10;
    }

    public final String isFaceless() {
        return this.isFaceless;
    }

    public String toString() {
        return "ResultItemSubmit(fatherName=" + this.fatherName + ", dateofBirth=" + this.dateofBirth + ", note2=" + this.note2 + ", nTValidities=" + this.nTValidities + ", note3=" + this.note3 + ", note4=" + this.note4 + ", applicationNo=" + this.applicationNo + ", applicantAddress=" + this.applicantAddress + ", dlno=" + this.dlno + ", referenceLink=" + this.referenceLink + ", barCode=" + this.barCode + ", applicantGender=" + this.applicantGender + ", servicesRequested=" + this.servicesRequested + ", dLCOVNames=" + this.dLCOVNames + ", documentaryProofsRequired=" + this.documentaryProofsRequired + ", rtoLocation=" + this.rtoLocation + ", applicantname=" + this.applicantname + ", note1=" + this.note1 + ", tRValidities=" + this.tRValidities + ", smsConfirmation=" + this.smsConfirmation + ", bioBloodGroupname=" + this.bioBloodGroupname + ", bloodGroup=" + this.bloodGroup + ", applicationDate=" + this.applicationDate + ", isFaceless=" + this.isFaceless + ", llReqforRetestMsg=" + this.llReqforRetestMsg + ')';
    }

    public ResultItemSubmit(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, ServicesRequested servicesRequested2, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24) {
        String str25 = str4;
        String str26 = str12;
        String str27 = str16;
        String str28 = str18;
        String str29 = str19;
        String str30 = str20;
        String str31 = str21;
        String str32 = str22;
        l.f(str, "fatherName");
        l.f(str2, "dateofBirth");
        l.f(str25, "nTValidities");
        l.f(str26, "applicantGender");
        l.f(str27, "applicantname");
        l.f(str28, "tRValidities");
        l.f(str29, "smsConfirmation");
        l.f(str30, "bioBloodGroupname");
        l.f(str31, "bloodGroup");
        l.f(str32, "applicationDate");
        this.fatherName = str;
        this.dateofBirth = str2;
        this.note2 = str3;
        this.nTValidities = str25;
        this.note3 = str5;
        this.note4 = str6;
        this.applicationNo = str7;
        this.applicantAddress = str8;
        this.dlno = str9;
        this.referenceLink = str10;
        this.barCode = str11;
        this.applicantGender = str26;
        this.servicesRequested = servicesRequested2;
        this.dLCOVNames = str13;
        this.documentaryProofsRequired = str14;
        this.rtoLocation = str15;
        this.applicantname = str27;
        this.note1 = str17;
        this.tRValidities = str28;
        this.smsConfirmation = str29;
        this.bioBloodGroupname = str30;
        this.bloodGroup = str31;
        this.applicationDate = str32;
        this.isFaceless = str23;
        this.llReqforRetestMsg = str24;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ResultItemSubmit(java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, java.lang.String r36, java.lang.String r37, java.lang.String r38, com.nic.mparivahan.dlservices.data.model.ServicesRequested r39, java.lang.String r40, java.lang.String r41, java.lang.String r42, java.lang.String r43, java.lang.String r44, java.lang.String r45, java.lang.String r46, java.lang.String r47, java.lang.String r48, java.lang.String r49, java.lang.String r50, java.lang.String r51, int r52, cm.g r53) {
        /*
            r26 = this;
            r0 = r52
            r1 = r0 & 1
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x000a
            r1 = r2
            goto L_0x000c
        L_0x000a:
            r1 = r27
        L_0x000c:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0012
            r3 = r2
            goto L_0x0014
        L_0x0012:
            r3 = r28
        L_0x0014:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x001a
            r4 = 0
            goto L_0x001c
        L_0x001a:
            r4 = r29
        L_0x001c:
            r6 = r0 & 8
            if (r6 == 0) goto L_0x0022
            r6 = r2
            goto L_0x0024
        L_0x0022:
            r6 = r30
        L_0x0024:
            r7 = r0 & 16
            if (r7 == 0) goto L_0x002a
            r7 = 0
            goto L_0x002c
        L_0x002a:
            r7 = r31
        L_0x002c:
            r8 = r0 & 32
            if (r8 == 0) goto L_0x0032
            r8 = 0
            goto L_0x0034
        L_0x0032:
            r8 = r32
        L_0x0034:
            r9 = r0 & 64
            if (r9 == 0) goto L_0x003a
            r9 = 0
            goto L_0x003c
        L_0x003a:
            r9 = r33
        L_0x003c:
            r10 = r0 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L_0x0042
            r10 = 0
            goto L_0x0044
        L_0x0042:
            r10 = r34
        L_0x0044:
            r11 = r0 & 256(0x100, float:3.59E-43)
            if (r11 == 0) goto L_0x004a
            r11 = 0
            goto L_0x004c
        L_0x004a:
            r11 = r35
        L_0x004c:
            r12 = r0 & 512(0x200, float:7.175E-43)
            if (r12 == 0) goto L_0x0052
            r12 = 0
            goto L_0x0054
        L_0x0052:
            r12 = r36
        L_0x0054:
            r13 = r0 & 1024(0x400, float:1.435E-42)
            if (r13 == 0) goto L_0x005a
            r13 = 0
            goto L_0x005c
        L_0x005a:
            r13 = r37
        L_0x005c:
            r14 = r0 & 2048(0x800, float:2.87E-42)
            if (r14 == 0) goto L_0x0062
            r14 = r2
            goto L_0x0064
        L_0x0062:
            r14 = r38
        L_0x0064:
            r15 = r0 & 4096(0x1000, float:5.74E-42)
            if (r15 == 0) goto L_0x006a
            r15 = 0
            goto L_0x006c
        L_0x006a:
            r15 = r39
        L_0x006c:
            r5 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r5 == 0) goto L_0x0072
            r5 = 0
            goto L_0x0074
        L_0x0072:
            r5 = r40
        L_0x0074:
            r53 = r2
            r2 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r2 == 0) goto L_0x007c
            r2 = 0
            goto L_0x007e
        L_0x007c:
            r2 = r41
        L_0x007e:
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r0 & r16
            if (r16 == 0) goto L_0x0088
            r16 = 0
            goto L_0x008a
        L_0x0088:
            r16 = r42
        L_0x008a:
            r17 = 65536(0x10000, float:9.18355E-41)
            r17 = r0 & r17
            if (r17 == 0) goto L_0x0093
            r17 = r53
            goto L_0x0095
        L_0x0093:
            r17 = r43
        L_0x0095:
            r18 = 131072(0x20000, float:1.83671E-40)
            r18 = r0 & r18
            if (r18 == 0) goto L_0x009e
            r18 = 0
            goto L_0x00a0
        L_0x009e:
            r18 = r44
        L_0x00a0:
            r19 = 262144(0x40000, float:3.67342E-40)
            r19 = r0 & r19
            if (r19 == 0) goto L_0x00a9
            r19 = r53
            goto L_0x00ab
        L_0x00a9:
            r19 = r45
        L_0x00ab:
            r20 = 524288(0x80000, float:7.34684E-40)
            r20 = r0 & r20
            if (r20 == 0) goto L_0x00b4
            r20 = r53
            goto L_0x00b6
        L_0x00b4:
            r20 = r46
        L_0x00b6:
            r21 = 1048576(0x100000, float:1.469368E-39)
            r21 = r0 & r21
            if (r21 == 0) goto L_0x00bf
            r21 = r53
            goto L_0x00c1
        L_0x00bf:
            r21 = r47
        L_0x00c1:
            r22 = 2097152(0x200000, float:2.938736E-39)
            r22 = r0 & r22
            if (r22 == 0) goto L_0x00ca
            r22 = r53
            goto L_0x00cc
        L_0x00ca:
            r22 = r48
        L_0x00cc:
            r23 = 4194304(0x400000, float:5.877472E-39)
            r23 = r0 & r23
            if (r23 == 0) goto L_0x00d5
            r23 = r53
            goto L_0x00d7
        L_0x00d5:
            r23 = r49
        L_0x00d7:
            r24 = 8388608(0x800000, float:1.17549435E-38)
            r24 = r0 & r24
            if (r24 == 0) goto L_0x00e0
            r24 = 0
            goto L_0x00e2
        L_0x00e0:
            r24 = r50
        L_0x00e2:
            r25 = 16777216(0x1000000, float:2.3509887E-38)
            r0 = r0 & r25
            if (r0 == 0) goto L_0x00ea
            r0 = 0
            goto L_0x00ec
        L_0x00ea:
            r0 = r51
        L_0x00ec:
            r27 = r26
            r28 = r1
            r29 = r3
            r30 = r4
            r31 = r6
            r32 = r7
            r33 = r8
            r34 = r9
            r35 = r10
            r36 = r11
            r37 = r12
            r38 = r13
            r39 = r14
            r40 = r15
            r41 = r5
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
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.dlservices.data.model.ResultItemSubmit.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.nic.mparivahan.dlservices.data.model.ServicesRequested, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, cm.g):void");
    }
}
