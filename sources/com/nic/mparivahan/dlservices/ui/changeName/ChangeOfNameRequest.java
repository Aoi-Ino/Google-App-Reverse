package com.nic.mparivahan.dlservices.ui.changeName;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;

@Keep
public final class ChangeOfNameRequest {
    @c("agentId")
    private String agentId;
    @c("agentIpAddress")
    private String agentIpAddress;
    @c("agentPwd")
    private String agentPwd;
    @c("agentServiceName")
    private String agentServiceName;
    @c("applFirstName")
    private String applFirstName;
    @c("applLastName")
    private String applLastName;
    @c("applcatgDLserReq")
    private String applcatgDLserReq;
    @c("conDlReasonCode")
    private Integer conDlReasonCode;
    @c("conDlReasonName")
    private String conDlReasonName;
    @c("conEffdate")
    private String conEffdate;
    @c("dlHolderAltMobMum")
    private String dlHolderAltMobMum;
    @c("dlHolderNaturalName")
    private String dlHolderNaturalName;
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
    @c("relFirstName")
    private String relFirstName;
    @c("relLastName")
    private String relLastName;
    @c("relationType")
    private String relationType;
    @c("rtoCodeDLTr")
    private String rtoCodeDLTr;
    @c("selectedDLSerList")
    private ChangeNameDLSerList selectedDLSerList;
    @c("willtoDonateOrgans")
    private String willtoDonateOrgans;

    public ChangeOfNameRequest() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (ChangeNameDLSerList) null, (String) null, (String) null, (String) null, (String) null, 33554431, (g) null);
    }

    public static /* synthetic */ ChangeOfNameRequest copy$default(ChangeOfNameRequest changeOfNameRequest, String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, ChangeNameDLSerList changeNameDLSerList, String str20, String str21, String str22, String str23, int i10, Object obj) {
        ChangeOfNameRequest changeOfNameRequest2 = changeOfNameRequest;
        int i11 = i10;
        return changeOfNameRequest.copy((i11 & 1) != 0 ? changeOfNameRequest2.applcatgDLserReq : str, (i11 & 2) != 0 ? changeOfNameRequest2.dlHolderAltMobMum : str2, (i11 & 4) != 0 ? changeOfNameRequest2.dlno : str3, (i11 & 8) != 0 ? changeOfNameRequest2.dob : str4, (i11 & 16) != 0 ? changeOfNameRequest2.rtoCodeDLTr : str5, (i11 & 32) != 0 ? changeOfNameRequest2.willtoDonateOrgans : str6, (i11 & 64) != 0 ? changeOfNameRequest2.relationType : str7, (i11 & 128) != 0 ? changeOfNameRequest2.conDlReasonCode : num, (i11 & 256) != 0 ? changeOfNameRequest2.conDlReasonName : str8, (i11 & 512) != 0 ? changeOfNameRequest2.dlHolderNaturalName : str9, (i11 & 1024) != 0 ? changeOfNameRequest2.conEffdate : str10, (i11 & 2048) != 0 ? changeOfNameRequest2.applFirstName : str11, (i11 & 4096) != 0 ? changeOfNameRequest2.applLastName : str12, (i11 & 8192) != 0 ? changeOfNameRequest2.relFirstName : str13, (i11 & 16384) != 0 ? changeOfNameRequest2.relLastName : str14, (i11 & 32768) != 0 ? changeOfNameRequest2.mobileNumber : str15, (i11 & 65536) != 0 ? changeOfNameRequest2.agentId : str16, (i11 & 131072) != 0 ? changeOfNameRequest2.agentPwd : str17, (i11 & 262144) != 0 ? changeOfNameRequest2.agentIpAddress : str18, (i11 & 524288) != 0 ? changeOfNameRequest2.agentServiceName : str19, (i11 & 1048576) != 0 ? changeOfNameRequest2.selectedDLSerList : changeNameDLSerList, (i11 & 2097152) != 0 ? changeOfNameRequest2.eKYCId : str20, (i11 & 4194304) != 0 ? changeOfNameRequest2.eKYCOpted : str21, (i11 & 8388608) != 0 ? changeOfNameRequest2.eKYCapplicantPhoto : str22, (i11 & 16777216) != 0 ? changeOfNameRequest2.eKYCGender : str23);
    }

    public final String component1() {
        return this.applcatgDLserReq;
    }

    public final String component10() {
        return this.dlHolderNaturalName;
    }

    public final String component11() {
        return this.conEffdate;
    }

    public final String component12() {
        return this.applFirstName;
    }

    public final String component13() {
        return this.applLastName;
    }

    public final String component14() {
        return this.relFirstName;
    }

    public final String component15() {
        return this.relLastName;
    }

    public final String component16() {
        return this.mobileNumber;
    }

    public final String component17() {
        return this.agentId;
    }

    public final String component18() {
        return this.agentPwd;
    }

    public final String component19() {
        return this.agentIpAddress;
    }

    public final String component2() {
        return this.dlHolderAltMobMum;
    }

    public final String component20() {
        return this.agentServiceName;
    }

    public final ChangeNameDLSerList component21() {
        return this.selectedDLSerList;
    }

    public final String component22() {
        return this.eKYCId;
    }

    public final String component23() {
        return this.eKYCOpted;
    }

    public final String component24() {
        return this.eKYCapplicantPhoto;
    }

    public final String component25() {
        return this.eKYCGender;
    }

    public final String component3() {
        return this.dlno;
    }

    public final String component4() {
        return this.dob;
    }

    public final String component5() {
        return this.rtoCodeDLTr;
    }

    public final String component6() {
        return this.willtoDonateOrgans;
    }

    public final String component7() {
        return this.relationType;
    }

    public final Integer component8() {
        return this.conDlReasonCode;
    }

    public final String component9() {
        return this.conDlReasonName;
    }

    public final ChangeOfNameRequest copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, ChangeNameDLSerList changeNameDLSerList, String str20, String str21, String str22, String str23) {
        return new ChangeOfNameRequest(str, str2, str3, str4, str5, str6, str7, num, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, changeNameDLSerList, str20, str21, str22, str23);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChangeOfNameRequest)) {
            return false;
        }
        ChangeOfNameRequest changeOfNameRequest = (ChangeOfNameRequest) obj;
        return l.a(this.applcatgDLserReq, changeOfNameRequest.applcatgDLserReq) && l.a(this.dlHolderAltMobMum, changeOfNameRequest.dlHolderAltMobMum) && l.a(this.dlno, changeOfNameRequest.dlno) && l.a(this.dob, changeOfNameRequest.dob) && l.a(this.rtoCodeDLTr, changeOfNameRequest.rtoCodeDLTr) && l.a(this.willtoDonateOrgans, changeOfNameRequest.willtoDonateOrgans) && l.a(this.relationType, changeOfNameRequest.relationType) && l.a(this.conDlReasonCode, changeOfNameRequest.conDlReasonCode) && l.a(this.conDlReasonName, changeOfNameRequest.conDlReasonName) && l.a(this.dlHolderNaturalName, changeOfNameRequest.dlHolderNaturalName) && l.a(this.conEffdate, changeOfNameRequest.conEffdate) && l.a(this.applFirstName, changeOfNameRequest.applFirstName) && l.a(this.applLastName, changeOfNameRequest.applLastName) && l.a(this.relFirstName, changeOfNameRequest.relFirstName) && l.a(this.relLastName, changeOfNameRequest.relLastName) && l.a(this.mobileNumber, changeOfNameRequest.mobileNumber) && l.a(this.agentId, changeOfNameRequest.agentId) && l.a(this.agentPwd, changeOfNameRequest.agentPwd) && l.a(this.agentIpAddress, changeOfNameRequest.agentIpAddress) && l.a(this.agentServiceName, changeOfNameRequest.agentServiceName) && l.a(this.selectedDLSerList, changeOfNameRequest.selectedDLSerList) && l.a(this.eKYCId, changeOfNameRequest.eKYCId) && l.a(this.eKYCOpted, changeOfNameRequest.eKYCOpted) && l.a(this.eKYCapplicantPhoto, changeOfNameRequest.eKYCapplicantPhoto) && l.a(this.eKYCGender, changeOfNameRequest.eKYCGender);
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

    public final String getApplFirstName() {
        return this.applFirstName;
    }

    public final String getApplLastName() {
        return this.applLastName;
    }

    public final String getApplcatgDLserReq() {
        return this.applcatgDLserReq;
    }

    public final Integer getConDlReasonCode() {
        return this.conDlReasonCode;
    }

    public final String getConDlReasonName() {
        return this.conDlReasonName;
    }

    public final String getConEffdate() {
        return this.conEffdate;
    }

    public final String getDlHolderAltMobMum() {
        return this.dlHolderAltMobMum;
    }

    public final String getDlHolderNaturalName() {
        return this.dlHolderNaturalName;
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

    public final String getRelFirstName() {
        return this.relFirstName;
    }

    public final String getRelLastName() {
        return this.relLastName;
    }

    public final String getRelationType() {
        return this.relationType;
    }

    public final String getRtoCodeDLTr() {
        return this.rtoCodeDLTr;
    }

    public final ChangeNameDLSerList getSelectedDLSerList() {
        return this.selectedDLSerList;
    }

    public final String getWilltoDonateOrgans() {
        return this.willtoDonateOrgans;
    }

    public int hashCode() {
        String str = this.applcatgDLserReq;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.dlHolderAltMobMum;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.dlno;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.dob;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.rtoCodeDLTr;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.willtoDonateOrgans;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.relationType;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Integer num = this.conDlReasonCode;
        int hashCode8 = (hashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        String str8 = this.conDlReasonName;
        int hashCode9 = (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.dlHolderNaturalName;
        int hashCode10 = (hashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.conEffdate;
        int hashCode11 = (hashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.applFirstName;
        int hashCode12 = (hashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.applLastName;
        int hashCode13 = (hashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.relFirstName;
        int hashCode14 = (hashCode13 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.relLastName;
        int hashCode15 = (hashCode14 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.mobileNumber;
        int hashCode16 = (hashCode15 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.agentId;
        int hashCode17 = (hashCode16 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.agentPwd;
        int hashCode18 = (hashCode17 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.agentIpAddress;
        int hashCode19 = (hashCode18 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.agentServiceName;
        int hashCode20 = (hashCode19 + (str19 == null ? 0 : str19.hashCode())) * 31;
        ChangeNameDLSerList changeNameDLSerList = this.selectedDLSerList;
        int hashCode21 = (hashCode20 + (changeNameDLSerList == null ? 0 : changeNameDLSerList.hashCode())) * 31;
        String str20 = this.eKYCId;
        int hashCode22 = (hashCode21 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.eKYCOpted;
        int hashCode23 = (hashCode22 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.eKYCapplicantPhoto;
        int hashCode24 = (hashCode23 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.eKYCGender;
        if (str23 != null) {
            i10 = str23.hashCode();
        }
        return hashCode24 + i10;
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

    public final void setApplFirstName(String str) {
        this.applFirstName = str;
    }

    public final void setApplLastName(String str) {
        this.applLastName = str;
    }

    public final void setApplcatgDLserReq(String str) {
        this.applcatgDLserReq = str;
    }

    public final void setConDlReasonCode(Integer num) {
        this.conDlReasonCode = num;
    }

    public final void setConDlReasonName(String str) {
        this.conDlReasonName = str;
    }

    public final void setConEffdate(String str) {
        this.conEffdate = str;
    }

    public final void setDlHolderAltMobMum(String str) {
        this.dlHolderAltMobMum = str;
    }

    public final void setDlHolderNaturalName(String str) {
        this.dlHolderNaturalName = str;
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

    public final void setRelFirstName(String str) {
        this.relFirstName = str;
    }

    public final void setRelLastName(String str) {
        this.relLastName = str;
    }

    public final void setRelationType(String str) {
        this.relationType = str;
    }

    public final void setRtoCodeDLTr(String str) {
        this.rtoCodeDLTr = str;
    }

    public final void setSelectedDLSerList(ChangeNameDLSerList changeNameDLSerList) {
        this.selectedDLSerList = changeNameDLSerList;
    }

    public final void setWilltoDonateOrgans(String str) {
        this.willtoDonateOrgans = str;
    }

    public String toString() {
        return "ChangeOfNameRequest(applcatgDLserReq=" + this.applcatgDLserReq + ", dlHolderAltMobMum=" + this.dlHolderAltMobMum + ", dlno=" + this.dlno + ", dob=" + this.dob + ", rtoCodeDLTr=" + this.rtoCodeDLTr + ", willtoDonateOrgans=" + this.willtoDonateOrgans + ", relationType=" + this.relationType + ", conDlReasonCode=" + this.conDlReasonCode + ", conDlReasonName=" + this.conDlReasonName + ", dlHolderNaturalName=" + this.dlHolderNaturalName + ", conEffdate=" + this.conEffdate + ", applFirstName=" + this.applFirstName + ", applLastName=" + this.applLastName + ", relFirstName=" + this.relFirstName + ", relLastName=" + this.relLastName + ", mobileNumber=" + this.mobileNumber + ", agentId=" + this.agentId + ", agentPwd=" + this.agentPwd + ", agentIpAddress=" + this.agentIpAddress + ", agentServiceName=" + this.agentServiceName + ", selectedDLSerList=" + this.selectedDLSerList + ", eKYCId=" + this.eKYCId + ", eKYCOpted=" + this.eKYCOpted + ", eKYCapplicantPhoto=" + this.eKYCapplicantPhoto + ", eKYCGender=" + this.eKYCGender + ')';
    }

    public ChangeOfNameRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, ChangeNameDLSerList changeNameDLSerList, String str20, String str21, String str22, String str23) {
        this.applcatgDLserReq = str;
        this.dlHolderAltMobMum = str2;
        this.dlno = str3;
        this.dob = str4;
        this.rtoCodeDLTr = str5;
        this.willtoDonateOrgans = str6;
        this.relationType = str7;
        this.conDlReasonCode = num;
        this.conDlReasonName = str8;
        this.dlHolderNaturalName = str9;
        this.conEffdate = str10;
        this.applFirstName = str11;
        this.applLastName = str12;
        this.relFirstName = str13;
        this.relLastName = str14;
        this.mobileNumber = str15;
        this.agentId = str16;
        this.agentPwd = str17;
        this.agentIpAddress = str18;
        this.agentServiceName = str19;
        this.selectedDLSerList = changeNameDLSerList;
        this.eKYCId = str20;
        this.eKYCOpted = str21;
        this.eKYCapplicantPhoto = str22;
        this.eKYCGender = str23;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ChangeOfNameRequest(java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, java.lang.Integer r34, java.lang.String r35, java.lang.String r36, java.lang.String r37, java.lang.String r38, java.lang.String r39, java.lang.String r40, java.lang.String r41, java.lang.String r42, java.lang.String r43, java.lang.String r44, java.lang.String r45, java.lang.String r46, com.nic.mparivahan.dlservices.ui.changeName.ChangeNameDLSerList r47, java.lang.String r48, java.lang.String r49, java.lang.String r50, java.lang.String r51, int r52, cm.g r53) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.dlservices.ui.changeName.ChangeOfNameRequest.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.nic.mparivahan.dlservices.ui.changeName.ChangeNameDLSerList, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, cm.g):void");
    }
}
