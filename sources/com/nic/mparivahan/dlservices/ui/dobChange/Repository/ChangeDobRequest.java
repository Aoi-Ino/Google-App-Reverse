package com.nic.mparivahan.dlservices.ui.dobChange.Repository;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;

@Keep
public final class ChangeDobRequest {
    @c("agentId")
    private String agentId;
    @c("agentIpAddress")
    private String agentIpAddress;
    @c("agentPwd")
    private String agentPwd;
    @c("agentServiceName")
    private String agentServiceName;
    @c("applDateOfBirth")
    private String applDateOfBirth;
    @c("applcatgDLserReq")
    private String applcatgDLserReq;
    @c("codobDlReasonCode")
    private String codobDlReasonCode;
    @c("codobDlReasonName")
    private String codobDlReasonName;
    @c("dlHolderAltMobMum")
    private String dlHolderAltMobMum;
    @c("dlno")
    private String dlno;
    @c("dob")
    private String dob;
    @c("eKYCGender")
    private String eKYCGender;
    @c("eKYCId")
    private String eKYCId;
    @c("eKYCOpted")
    private String eKYCOpted;
    @c("eKYCapplicantPhoto")
    private String eKYCapplicantPhoto;
    @c("mobileNumber")
    private String mobileNumber;
    @c("rtoCodeDLTr")
    private String rtoCodeDLTr;
    @c("selectedDLSerList")
    private ChangeOfDobSelectedServiceList selectedDLSerList;
    @c("willtoDonateOrgans")
    private String willtoDonateOrgans;

    public ChangeDobRequest() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (ChangeOfDobSelectedServiceList) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 524287, (g) null);
    }

    public static /* synthetic */ ChangeDobRequest copy$default(ChangeDobRequest changeDobRequest, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, ChangeOfDobSelectedServiceList changeOfDobSelectedServiceList, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, int i10, Object obj) {
        ChangeDobRequest changeDobRequest2 = changeDobRequest;
        int i11 = i10;
        return changeDobRequest.copy((i11 & 1) != 0 ? changeDobRequest2.rtoCodeDLTr : str, (i11 & 2) != 0 ? changeDobRequest2.willtoDonateOrgans : str2, (i11 & 4) != 0 ? changeDobRequest2.agentId : str3, (i11 & 8) != 0 ? changeDobRequest2.agentIpAddress : str4, (i11 & 16) != 0 ? changeDobRequest2.agentServiceName : str5, (i11 & 32) != 0 ? changeDobRequest2.dlno : str6, (i11 & 64) != 0 ? changeDobRequest2.dob : str7, (i11 & 128) != 0 ? changeDobRequest2.agentPwd : str8, (i11 & 256) != 0 ? changeDobRequest2.dlHolderAltMobMum : str9, (i11 & 512) != 0 ? changeDobRequest2.mobileNumber : str10, (i11 & 1024) != 0 ? changeDobRequest2.selectedDLSerList : changeOfDobSelectedServiceList, (i11 & 2048) != 0 ? changeDobRequest2.applcatgDLserReq : str11, (i11 & 4096) != 0 ? changeDobRequest2.applDateOfBirth : str12, (i11 & 8192) != 0 ? changeDobRequest2.codobDlReasonName : str13, (i11 & 16384) != 0 ? changeDobRequest2.codobDlReasonCode : str14, (i11 & 32768) != 0 ? changeDobRequest2.eKYCId : str15, (i11 & 65536) != 0 ? changeDobRequest2.eKYCOpted : str16, (i11 & 131072) != 0 ? changeDobRequest2.eKYCapplicantPhoto : str17, (i11 & 262144) != 0 ? changeDobRequest2.eKYCGender : str18);
    }

    public final String component1() {
        return this.rtoCodeDLTr;
    }

    public final String component10() {
        return this.mobileNumber;
    }

    public final ChangeOfDobSelectedServiceList component11() {
        return this.selectedDLSerList;
    }

    public final String component12() {
        return this.applcatgDLserReq;
    }

    public final String component13() {
        return this.applDateOfBirth;
    }

    public final String component14() {
        return this.codobDlReasonName;
    }

    public final String component15() {
        return this.codobDlReasonCode;
    }

    public final String component16() {
        return this.eKYCId;
    }

    public final String component17() {
        return this.eKYCOpted;
    }

    public final String component18() {
        return this.eKYCapplicantPhoto;
    }

    public final String component19() {
        return this.eKYCGender;
    }

    public final String component2() {
        return this.willtoDonateOrgans;
    }

    public final String component3() {
        return this.agentId;
    }

    public final String component4() {
        return this.agentIpAddress;
    }

    public final String component5() {
        return this.agentServiceName;
    }

    public final String component6() {
        return this.dlno;
    }

    public final String component7() {
        return this.dob;
    }

    public final String component8() {
        return this.agentPwd;
    }

    public final String component9() {
        return this.dlHolderAltMobMum;
    }

    public final ChangeDobRequest copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, ChangeOfDobSelectedServiceList changeOfDobSelectedServiceList, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18) {
        return new ChangeDobRequest(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, changeOfDobSelectedServiceList, str11, str12, str13, str14, str15, str16, str17, str18);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChangeDobRequest)) {
            return false;
        }
        ChangeDobRequest changeDobRequest = (ChangeDobRequest) obj;
        return l.a(this.rtoCodeDLTr, changeDobRequest.rtoCodeDLTr) && l.a(this.willtoDonateOrgans, changeDobRequest.willtoDonateOrgans) && l.a(this.agentId, changeDobRequest.agentId) && l.a(this.agentIpAddress, changeDobRequest.agentIpAddress) && l.a(this.agentServiceName, changeDobRequest.agentServiceName) && l.a(this.dlno, changeDobRequest.dlno) && l.a(this.dob, changeDobRequest.dob) && l.a(this.agentPwd, changeDobRequest.agentPwd) && l.a(this.dlHolderAltMobMum, changeDobRequest.dlHolderAltMobMum) && l.a(this.mobileNumber, changeDobRequest.mobileNumber) && l.a(this.selectedDLSerList, changeDobRequest.selectedDLSerList) && l.a(this.applcatgDLserReq, changeDobRequest.applcatgDLserReq) && l.a(this.applDateOfBirth, changeDobRequest.applDateOfBirth) && l.a(this.codobDlReasonName, changeDobRequest.codobDlReasonName) && l.a(this.codobDlReasonCode, changeDobRequest.codobDlReasonCode) && l.a(this.eKYCId, changeDobRequest.eKYCId) && l.a(this.eKYCOpted, changeDobRequest.eKYCOpted) && l.a(this.eKYCapplicantPhoto, changeDobRequest.eKYCapplicantPhoto) && l.a(this.eKYCGender, changeDobRequest.eKYCGender);
    }

    public final String getAgentId() {
        return this.agentId;
    }

    public final String getAgentIpAddress() {
        return this.agentIpAddress;
    }

    public final String getAgentPwd() {
        return this.agentPwd;
    }

    public final String getAgentServiceName() {
        return this.agentServiceName;
    }

    public final String getApplDateOfBirth() {
        return this.applDateOfBirth;
    }

    public final String getApplcatgDLserReq() {
        return this.applcatgDLserReq;
    }

    public final String getCodobDlReasonCode() {
        return this.codobDlReasonCode;
    }

    public final String getCodobDlReasonName() {
        return this.codobDlReasonName;
    }

    public final String getDlHolderAltMobMum() {
        return this.dlHolderAltMobMum;
    }

    public final String getDlno() {
        return this.dlno;
    }

    public final String getDob() {
        return this.dob;
    }

    public final String getEKYCGender() {
        return this.eKYCGender;
    }

    public final String getEKYCId() {
        return this.eKYCId;
    }

    public final String getEKYCOpted() {
        return this.eKYCOpted;
    }

    public final String getEKYCapplicantPhoto() {
        return this.eKYCapplicantPhoto;
    }

    public final String getMobileNumber() {
        return this.mobileNumber;
    }

    public final String getRtoCodeDLTr() {
        return this.rtoCodeDLTr;
    }

    public final ChangeOfDobSelectedServiceList getSelectedDLSerList() {
        return this.selectedDLSerList;
    }

    public final String getWilltoDonateOrgans() {
        return this.willtoDonateOrgans;
    }

    public int hashCode() {
        String str = this.rtoCodeDLTr;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.willtoDonateOrgans;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.agentId;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.agentIpAddress;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.agentServiceName;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.dlno;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.dob;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.agentPwd;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.dlHolderAltMobMum;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.mobileNumber;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        ChangeOfDobSelectedServiceList changeOfDobSelectedServiceList = this.selectedDLSerList;
        int hashCode11 = (hashCode10 + (changeOfDobSelectedServiceList == null ? 0 : changeOfDobSelectedServiceList.hashCode())) * 31;
        String str11 = this.applcatgDLserReq;
        int hashCode12 = (hashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.applDateOfBirth;
        int hashCode13 = (hashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.codobDlReasonName;
        int hashCode14 = (hashCode13 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.codobDlReasonCode;
        int hashCode15 = (hashCode14 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.eKYCId;
        int hashCode16 = (hashCode15 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.eKYCOpted;
        int hashCode17 = (hashCode16 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.eKYCapplicantPhoto;
        int hashCode18 = (hashCode17 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.eKYCGender;
        if (str18 != null) {
            i10 = str18.hashCode();
        }
        return hashCode18 + i10;
    }

    public final void setAgentId(String str) {
        this.agentId = str;
    }

    public final void setAgentIpAddress(String str) {
        this.agentIpAddress = str;
    }

    public final void setAgentPwd(String str) {
        this.agentPwd = str;
    }

    public final void setAgentServiceName(String str) {
        this.agentServiceName = str;
    }

    public final void setApplDateOfBirth(String str) {
        this.applDateOfBirth = str;
    }

    public final void setApplcatgDLserReq(String str) {
        this.applcatgDLserReq = str;
    }

    public final void setCodobDlReasonCode(String str) {
        this.codobDlReasonCode = str;
    }

    public final void setCodobDlReasonName(String str) {
        this.codobDlReasonName = str;
    }

    public final void setDlHolderAltMobMum(String str) {
        this.dlHolderAltMobMum = str;
    }

    public final void setDlno(String str) {
        this.dlno = str;
    }

    public final void setDob(String str) {
        this.dob = str;
    }

    public final void setEKYCGender(String str) {
        this.eKYCGender = str;
    }

    public final void setEKYCId(String str) {
        this.eKYCId = str;
    }

    public final void setEKYCOpted(String str) {
        this.eKYCOpted = str;
    }

    public final void setEKYCapplicantPhoto(String str) {
        this.eKYCapplicantPhoto = str;
    }

    public final void setMobileNumber(String str) {
        this.mobileNumber = str;
    }

    public final void setRtoCodeDLTr(String str) {
        this.rtoCodeDLTr = str;
    }

    public final void setSelectedDLSerList(ChangeOfDobSelectedServiceList changeOfDobSelectedServiceList) {
        this.selectedDLSerList = changeOfDobSelectedServiceList;
    }

    public final void setWilltoDonateOrgans(String str) {
        this.willtoDonateOrgans = str;
    }

    public String toString() {
        return "ChangeDobRequest(rtoCodeDLTr=" + this.rtoCodeDLTr + ", willtoDonateOrgans=" + this.willtoDonateOrgans + ", agentId=" + this.agentId + ", agentIpAddress=" + this.agentIpAddress + ", agentServiceName=" + this.agentServiceName + ", dlno=" + this.dlno + ", dob=" + this.dob + ", agentPwd=" + this.agentPwd + ", dlHolderAltMobMum=" + this.dlHolderAltMobMum + ", mobileNumber=" + this.mobileNumber + ", selectedDLSerList=" + this.selectedDLSerList + ", applcatgDLserReq=" + this.applcatgDLserReq + ", applDateOfBirth=" + this.applDateOfBirth + ", codobDlReasonName=" + this.codobDlReasonName + ", codobDlReasonCode=" + this.codobDlReasonCode + ", eKYCId=" + this.eKYCId + ", eKYCOpted=" + this.eKYCOpted + ", eKYCapplicantPhoto=" + this.eKYCapplicantPhoto + ", eKYCGender=" + this.eKYCGender + ')';
    }

    public ChangeDobRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, ChangeOfDobSelectedServiceList changeOfDobSelectedServiceList, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18) {
        this.rtoCodeDLTr = str;
        this.willtoDonateOrgans = str2;
        this.agentId = str3;
        this.agentIpAddress = str4;
        this.agentServiceName = str5;
        this.dlno = str6;
        this.dob = str7;
        this.agentPwd = str8;
        this.dlHolderAltMobMum = str9;
        this.mobileNumber = str10;
        this.selectedDLSerList = changeOfDobSelectedServiceList;
        this.applcatgDLserReq = str11;
        this.applDateOfBirth = str12;
        this.codobDlReasonName = str13;
        this.codobDlReasonCode = str14;
        this.eKYCId = str15;
        this.eKYCOpted = str16;
        this.eKYCapplicantPhoto = str17;
        this.eKYCGender = str18;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ChangeDobRequest(java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, com.nic.mparivahan.dlservices.ui.dobChange.Repository.ChangeOfDobSelectedServiceList r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, java.lang.String r36, java.lang.String r37, java.lang.String r38, java.lang.String r39, int r40, cm.g r41) {
        /*
            r20 = this;
            r0 = r40
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0008
            r1 = 0
            goto L_0x000a
        L_0x0008:
            r1 = r21
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = 0
            goto L_0x0012
        L_0x0010:
            r3 = r22
        L_0x0012:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0018
            r4 = 0
            goto L_0x001a
        L_0x0018:
            r4 = r23
        L_0x001a:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0020
            r5 = 0
            goto L_0x0022
        L_0x0020:
            r5 = r24
        L_0x0022:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0028
            r6 = 0
            goto L_0x002a
        L_0x0028:
            r6 = r25
        L_0x002a:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0030
            r7 = 0
            goto L_0x0032
        L_0x0030:
            r7 = r26
        L_0x0032:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0038
            r8 = 0
            goto L_0x003a
        L_0x0038:
            r8 = r27
        L_0x003a:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0040
            r9 = 0
            goto L_0x0042
        L_0x0040:
            r9 = r28
        L_0x0042:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0048
            r10 = 0
            goto L_0x004a
        L_0x0048:
            r10 = r29
        L_0x004a:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x0050
            r11 = 0
            goto L_0x0052
        L_0x0050:
            r11 = r30
        L_0x0052:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x0058
            r12 = 0
            goto L_0x005a
        L_0x0058:
            r12 = r31
        L_0x005a:
            r13 = r0 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L_0x0060
            r13 = 0
            goto L_0x0062
        L_0x0060:
            r13 = r32
        L_0x0062:
            r14 = r0 & 4096(0x1000, float:5.74E-42)
            if (r14 == 0) goto L_0x0068
            r14 = 0
            goto L_0x006a
        L_0x0068:
            r14 = r33
        L_0x006a:
            r15 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r15 == 0) goto L_0x0070
            r15 = 0
            goto L_0x0072
        L_0x0070:
            r15 = r34
        L_0x0072:
            r2 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r2 == 0) goto L_0x0078
            r2 = 0
            goto L_0x007a
        L_0x0078:
            r2 = r35
        L_0x007a:
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r0 & r16
            if (r16 == 0) goto L_0x0084
            r16 = 0
            goto L_0x0086
        L_0x0084:
            r16 = r36
        L_0x0086:
            r17 = 65536(0x10000, float:9.18355E-41)
            r17 = r0 & r17
            if (r17 == 0) goto L_0x008f
            r17 = 0
            goto L_0x0091
        L_0x008f:
            r17 = r37
        L_0x0091:
            r18 = 131072(0x20000, float:1.83671E-40)
            r18 = r0 & r18
            if (r18 == 0) goto L_0x009a
            r18 = 0
            goto L_0x009c
        L_0x009a:
            r18 = r38
        L_0x009c:
            r19 = 262144(0x40000, float:3.67342E-40)
            r0 = r0 & r19
            if (r0 == 0) goto L_0x00a4
            r0 = 0
            goto L_0x00a6
        L_0x00a4:
            r0 = r39
        L_0x00a6:
            r21 = r20
            r22 = r1
            r23 = r3
            r24 = r4
            r25 = r5
            r26 = r6
            r27 = r7
            r28 = r8
            r29 = r9
            r30 = r10
            r31 = r11
            r32 = r12
            r33 = r13
            r34 = r14
            r35 = r15
            r36 = r2
            r37 = r16
            r38 = r17
            r39 = r18
            r40 = r0
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.dlservices.ui.dobChange.Repository.ChangeDobRequest.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.nic.mparivahan.dlservices.ui.dobChange.Repository.ChangeOfDobSelectedServiceList, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, cm.g):void");
    }
}
