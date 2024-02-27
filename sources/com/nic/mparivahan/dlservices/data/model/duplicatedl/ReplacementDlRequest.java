package com.nic.mparivahan.dlservices.data.model.duplicatedl;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;

@Keep
public final class ReplacementDlRequest {
    @c("agentId")
    private String agentId;
    @c("agentIpAddress")
    private String agentIpAddress;
    @c("agentPwd")
    private String agentPwd;
    @c("agentServiceName")
    private String agentServiceName;
    @c("dlHolderAltMobMum")
    private String dlHolderAltMobMum;
    @c("dlno")
    private String dlno;
    @c("dob")
    private String dob;
    @c("dupDlReasonCode")
    private Integer dupDlReasonCode;
    @c("dupDlReasonName")
    private String dupDlReasonName;
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
    private ReplacementSelectedDLSerList selectedDLSerList;
    @c("willtoDonateOrgans")
    private String willtoDonateOrgans;

    public ReplacementDlRequest() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (ReplacementSelectedDLSerList) null, (String) null, (String) null, (String) null, (String) null, 131071, (g) null);
    }

    public static /* synthetic */ ReplacementDlRequest copy$default(ReplacementDlRequest replacementDlRequest, String str, String str2, String str3, String str4, String str5, String str6, Integer num, String str7, String str8, String str9, String str10, String str11, ReplacementSelectedDLSerList replacementSelectedDLSerList, String str12, String str13, String str14, String str15, int i10, Object obj) {
        ReplacementDlRequest replacementDlRequest2 = replacementDlRequest;
        int i11 = i10;
        return replacementDlRequest.copy((i11 & 1) != 0 ? replacementDlRequest2.rtoCodeDLTr : str, (i11 & 2) != 0 ? replacementDlRequest2.willtoDonateOrgans : str2, (i11 & 4) != 0 ? replacementDlRequest2.agentId : str3, (i11 & 8) != 0 ? replacementDlRequest2.agentIpAddress : str4, (i11 & 16) != 0 ? replacementDlRequest2.dupDlReasonName : str5, (i11 & 32) != 0 ? replacementDlRequest2.agentServiceName : str6, (i11 & 64) != 0 ? replacementDlRequest2.dupDlReasonCode : num, (i11 & 128) != 0 ? replacementDlRequest2.dlno : str7, (i11 & 256) != 0 ? replacementDlRequest2.dob : str8, (i11 & 512) != 0 ? replacementDlRequest2.agentPwd : str9, (i11 & 1024) != 0 ? replacementDlRequest2.dlHolderAltMobMum : str10, (i11 & 2048) != 0 ? replacementDlRequest2.mobileNumber : str11, (i11 & 4096) != 0 ? replacementDlRequest2.selectedDLSerList : replacementSelectedDLSerList, (i11 & 8192) != 0 ? replacementDlRequest2.eKYCId : str12, (i11 & 16384) != 0 ? replacementDlRequest2.eKYCOpted : str13, (i11 & 32768) != 0 ? replacementDlRequest2.eKYCapplicantPhoto : str14, (i11 & 65536) != 0 ? replacementDlRequest2.eKYCGender : str15);
    }

    public final String component1() {
        return this.rtoCodeDLTr;
    }

    public final String component10() {
        return this.agentPwd;
    }

    public final String component11() {
        return this.dlHolderAltMobMum;
    }

    public final String component12() {
        return this.mobileNumber;
    }

    public final ReplacementSelectedDLSerList component13() {
        return this.selectedDLSerList;
    }

    public final String component14() {
        return this.eKYCId;
    }

    public final String component15() {
        return this.eKYCOpted;
    }

    public final String component16() {
        return this.eKYCapplicantPhoto;
    }

    public final String component17() {
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
        return this.dupDlReasonName;
    }

    public final String component6() {
        return this.agentServiceName;
    }

    public final Integer component7() {
        return this.dupDlReasonCode;
    }

    public final String component8() {
        return this.dlno;
    }

    public final String component9() {
        return this.dob;
    }

    public final ReplacementDlRequest copy(String str, String str2, String str3, String str4, String str5, String str6, Integer num, String str7, String str8, String str9, String str10, String str11, ReplacementSelectedDLSerList replacementSelectedDLSerList, String str12, String str13, String str14, String str15) {
        return new ReplacementDlRequest(str, str2, str3, str4, str5, str6, num, str7, str8, str9, str10, str11, replacementSelectedDLSerList, str12, str13, str14, str15);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReplacementDlRequest)) {
            return false;
        }
        ReplacementDlRequest replacementDlRequest = (ReplacementDlRequest) obj;
        return l.a(this.rtoCodeDLTr, replacementDlRequest.rtoCodeDLTr) && l.a(this.willtoDonateOrgans, replacementDlRequest.willtoDonateOrgans) && l.a(this.agentId, replacementDlRequest.agentId) && l.a(this.agentIpAddress, replacementDlRequest.agentIpAddress) && l.a(this.dupDlReasonName, replacementDlRequest.dupDlReasonName) && l.a(this.agentServiceName, replacementDlRequest.agentServiceName) && l.a(this.dupDlReasonCode, replacementDlRequest.dupDlReasonCode) && l.a(this.dlno, replacementDlRequest.dlno) && l.a(this.dob, replacementDlRequest.dob) && l.a(this.agentPwd, replacementDlRequest.agentPwd) && l.a(this.dlHolderAltMobMum, replacementDlRequest.dlHolderAltMobMum) && l.a(this.mobileNumber, replacementDlRequest.mobileNumber) && l.a(this.selectedDLSerList, replacementDlRequest.selectedDLSerList) && l.a(this.eKYCId, replacementDlRequest.eKYCId) && l.a(this.eKYCOpted, replacementDlRequest.eKYCOpted) && l.a(this.eKYCapplicantPhoto, replacementDlRequest.eKYCapplicantPhoto) && l.a(this.eKYCGender, replacementDlRequest.eKYCGender);
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

    public final String getDlHolderAltMobMum() {
        return this.dlHolderAltMobMum;
    }

    public final String getDlno() {
        return this.dlno;
    }

    public final String getDob() {
        return this.dob;
    }

    public final Integer getDupDlReasonCode() {
        return this.dupDlReasonCode;
    }

    public final String getDupDlReasonName() {
        return this.dupDlReasonName;
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

    public final ReplacementSelectedDLSerList getSelectedDLSerList() {
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
        String str5 = this.dupDlReasonName;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.agentServiceName;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num = this.dupDlReasonCode;
        int hashCode7 = (hashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        String str7 = this.dlno;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.dob;
        int hashCode9 = (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.agentPwd;
        int hashCode10 = (hashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.dlHolderAltMobMum;
        int hashCode11 = (hashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.mobileNumber;
        int hashCode12 = (hashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        ReplacementSelectedDLSerList replacementSelectedDLSerList = this.selectedDLSerList;
        int hashCode13 = (hashCode12 + (replacementSelectedDLSerList == null ? 0 : replacementSelectedDLSerList.hashCode())) * 31;
        String str12 = this.eKYCId;
        int hashCode14 = (hashCode13 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.eKYCOpted;
        int hashCode15 = (hashCode14 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.eKYCapplicantPhoto;
        int hashCode16 = (hashCode15 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.eKYCGender;
        if (str15 != null) {
            i10 = str15.hashCode();
        }
        return hashCode16 + i10;
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

    public final void setDlHolderAltMobMum(String str) {
        this.dlHolderAltMobMum = str;
    }

    public final void setDlno(String str) {
        this.dlno = str;
    }

    public final void setDob(String str) {
        this.dob = str;
    }

    public final void setDupDlReasonCode(Integer num) {
        this.dupDlReasonCode = num;
    }

    public final void setDupDlReasonName(String str) {
        this.dupDlReasonName = str;
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

    public final void setSelectedDLSerList(ReplacementSelectedDLSerList replacementSelectedDLSerList) {
        this.selectedDLSerList = replacementSelectedDLSerList;
    }

    public final void setWilltoDonateOrgans(String str) {
        this.willtoDonateOrgans = str;
    }

    public String toString() {
        return "ReplacementDlRequest(rtoCodeDLTr=" + this.rtoCodeDLTr + ", willtoDonateOrgans=" + this.willtoDonateOrgans + ", agentId=" + this.agentId + ", agentIpAddress=" + this.agentIpAddress + ", dupDlReasonName=" + this.dupDlReasonName + ", agentServiceName=" + this.agentServiceName + ", dupDlReasonCode=" + this.dupDlReasonCode + ", dlno=" + this.dlno + ", dob=" + this.dob + ", agentPwd=" + this.agentPwd + ", dlHolderAltMobMum=" + this.dlHolderAltMobMum + ", mobileNumber=" + this.mobileNumber + ", selectedDLSerList=" + this.selectedDLSerList + ", eKYCId=" + this.eKYCId + ", eKYCOpted=" + this.eKYCOpted + ", eKYCapplicantPhoto=" + this.eKYCapplicantPhoto + ", eKYCGender=" + this.eKYCGender + ')';
    }

    public ReplacementDlRequest(String str, String str2, String str3, String str4, String str5, String str6, Integer num, String str7, String str8, String str9, String str10, String str11, ReplacementSelectedDLSerList replacementSelectedDLSerList, String str12, String str13, String str14, String str15) {
        this.rtoCodeDLTr = str;
        this.willtoDonateOrgans = str2;
        this.agentId = str3;
        this.agentIpAddress = str4;
        this.dupDlReasonName = str5;
        this.agentServiceName = str6;
        this.dupDlReasonCode = num;
        this.dlno = str7;
        this.dob = str8;
        this.agentPwd = str9;
        this.dlHolderAltMobMum = str10;
        this.mobileNumber = str11;
        this.selectedDLSerList = replacementSelectedDLSerList;
        this.eKYCId = str12;
        this.eKYCOpted = str13;
        this.eKYCapplicantPhoto = str14;
        this.eKYCGender = str15;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ReplacementDlRequest(java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.Integer r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, com.nic.mparivahan.dlservices.data.model.duplicatedl.ReplacementSelectedDLSerList r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, int r36, cm.g r37) {
        /*
            r18 = this;
            r0 = r36
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0008
            r1 = 0
            goto L_0x000a
        L_0x0008:
            r1 = r19
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = 0
            goto L_0x0012
        L_0x0010:
            r3 = r20
        L_0x0012:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0018
            r4 = 0
            goto L_0x001a
        L_0x0018:
            r4 = r21
        L_0x001a:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0020
            r5 = 0
            goto L_0x0022
        L_0x0020:
            r5 = r22
        L_0x0022:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0028
            r6 = 0
            goto L_0x002a
        L_0x0028:
            r6 = r23
        L_0x002a:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0030
            r7 = 0
            goto L_0x0032
        L_0x0030:
            r7 = r24
        L_0x0032:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0038
            r8 = 0
            goto L_0x003a
        L_0x0038:
            r8 = r25
        L_0x003a:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0040
            r9 = 0
            goto L_0x0042
        L_0x0040:
            r9 = r26
        L_0x0042:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0048
            r10 = 0
            goto L_0x004a
        L_0x0048:
            r10 = r27
        L_0x004a:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x0050
            r11 = 0
            goto L_0x0052
        L_0x0050:
            r11 = r28
        L_0x0052:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x0058
            r12 = 0
            goto L_0x005a
        L_0x0058:
            r12 = r29
        L_0x005a:
            r13 = r0 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L_0x0060
            r13 = 0
            goto L_0x0062
        L_0x0060:
            r13 = r30
        L_0x0062:
            r14 = r0 & 4096(0x1000, float:5.74E-42)
            if (r14 == 0) goto L_0x0068
            r14 = 0
            goto L_0x006a
        L_0x0068:
            r14 = r31
        L_0x006a:
            r15 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r15 == 0) goto L_0x0070
            r15 = 0
            goto L_0x0072
        L_0x0070:
            r15 = r32
        L_0x0072:
            r2 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r2 == 0) goto L_0x0078
            r2 = 0
            goto L_0x007a
        L_0x0078:
            r2 = r33
        L_0x007a:
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r0 & r16
            if (r16 == 0) goto L_0x0084
            r16 = 0
            goto L_0x0086
        L_0x0084:
            r16 = r34
        L_0x0086:
            r17 = 65536(0x10000, float:9.18355E-41)
            r0 = r0 & r17
            if (r0 == 0) goto L_0x008e
            r0 = 0
            goto L_0x0090
        L_0x008e:
            r0 = r35
        L_0x0090:
            r19 = r18
            r20 = r1
            r21 = r3
            r22 = r4
            r23 = r5
            r24 = r6
            r25 = r7
            r26 = r8
            r27 = r9
            r28 = r10
            r29 = r11
            r30 = r12
            r31 = r13
            r32 = r14
            r33 = r15
            r34 = r2
            r35 = r16
            r36 = r0
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.dlservices.data.model.duplicatedl.ReplacementDlRequest.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.nic.mparivahan.dlservices.data.model.duplicatedl.ReplacementSelectedDLSerList, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, cm.g):void");
    }
}
