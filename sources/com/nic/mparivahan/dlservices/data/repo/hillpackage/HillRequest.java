package com.nic.mparivahan.dlservices.data.repo.hillpackage;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;

@Keep
public final class HillRequest {
    @c("agentId")
    private String agentId;
    @c("agentIpAddress")
    private String agentIpAddress;
    @c("agentPwd")
    private String agentPwd;
    @c("agentServiceName")
    private String agentServiceName;
    @c("applcatgDLserReq")
    private String applcatgDLserReq;
    @c("declaringcheck")
    private String declaringcheck;
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
    @c("hillcertificate")
    private String hillcertificate;
    @c("hilldrivingschool")
    private String hilldrivingschool;
    @c("hillissby")
    private String hillissby;
    @c("hillissueDate")
    private String hillissueDate;
    @c("hillvalidFrom")
    private String hillvalidFrom;
    @c("hillvalidTo")
    private String hillvalidTo;
    @c("mobileNumber")
    private String mobileNumber;
    @c("rtoCodeDLTr")
    private String rtoCodeDLTr;
    @c("selectedDLSerList")
    private HillSelectedList selectedDLSerList;
    @c("willtoDonateOrgans")
    private String willtoDonateOrgans;

    public HillRequest() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (HillSelectedList) null, (String) null, (String) null, (String) null, (String) null, 8388607, (g) null);
    }

    public static /* synthetic */ HillRequest copy$default(HillRequest hillRequest, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, HillSelectedList hillSelectedList, String str19, String str20, String str21, String str22, int i10, Object obj) {
        HillRequest hillRequest2 = hillRequest;
        int i11 = i10;
        return hillRequest.copy((i11 & 1) != 0 ? hillRequest2.dlno : str, (i11 & 2) != 0 ? hillRequest2.dob : str2, (i11 & 4) != 0 ? hillRequest2.rtoCodeDLTr : str3, (i11 & 8) != 0 ? hillRequest2.applcatgDLserReq : str4, (i11 & 16) != 0 ? hillRequest2.dlHolderAltMobMum : str5, (i11 & 32) != 0 ? hillRequest2.willtoDonateOrgans : str6, (i11 & 64) != 0 ? hillRequest2.mobileNumber : str7, (i11 & 128) != 0 ? hillRequest2.declaringcheck : str8, (i11 & 256) != 0 ? hillRequest2.hillcertificate : str9, (i11 & 512) != 0 ? hillRequest2.hillissueDate : str10, (i11 & 1024) != 0 ? hillRequest2.hillvalidFrom : str11, (i11 & 2048) != 0 ? hillRequest2.hillvalidTo : str12, (i11 & 4096) != 0 ? hillRequest2.hilldrivingschool : str13, (i11 & 8192) != 0 ? hillRequest2.hillissby : str14, (i11 & 16384) != 0 ? hillRequest2.agentId : str15, (i11 & 32768) != 0 ? hillRequest2.agentIpAddress : str16, (i11 & 65536) != 0 ? hillRequest2.agentPwd : str17, (i11 & 131072) != 0 ? hillRequest2.agentServiceName : str18, (i11 & 262144) != 0 ? hillRequest2.selectedDLSerList : hillSelectedList, (i11 & 524288) != 0 ? hillRequest2.eKYCId : str19, (i11 & 1048576) != 0 ? hillRequest2.eKYCOpted : str20, (i11 & 2097152) != 0 ? hillRequest2.eKYCapplicantPhoto : str21, (i11 & 4194304) != 0 ? hillRequest2.eKYCGender : str22);
    }

    public final String component1() {
        return this.dlno;
    }

    public final String component10() {
        return this.hillissueDate;
    }

    public final String component11() {
        return this.hillvalidFrom;
    }

    public final String component12() {
        return this.hillvalidTo;
    }

    public final String component13() {
        return this.hilldrivingschool;
    }

    public final String component14() {
        return this.hillissby;
    }

    public final String component15() {
        return this.agentId;
    }

    public final String component16() {
        return this.agentIpAddress;
    }

    public final String component17() {
        return this.agentPwd;
    }

    public final String component18() {
        return this.agentServiceName;
    }

    public final HillSelectedList component19() {
        return this.selectedDLSerList;
    }

    public final String component2() {
        return this.dob;
    }

    public final String component20() {
        return this.eKYCId;
    }

    public final String component21() {
        return this.eKYCOpted;
    }

    public final String component22() {
        return this.eKYCapplicantPhoto;
    }

    public final String component23() {
        return this.eKYCGender;
    }

    public final String component3() {
        return this.rtoCodeDLTr;
    }

    public final String component4() {
        return this.applcatgDLserReq;
    }

    public final String component5() {
        return this.dlHolderAltMobMum;
    }

    public final String component6() {
        return this.willtoDonateOrgans;
    }

    public final String component7() {
        return this.mobileNumber;
    }

    public final String component8() {
        return this.declaringcheck;
    }

    public final String component9() {
        return this.hillcertificate;
    }

    public final HillRequest copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, HillSelectedList hillSelectedList, String str19, String str20, String str21, String str22) {
        return new HillRequest(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, hillSelectedList, str19, str20, str21, str22);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HillRequest)) {
            return false;
        }
        HillRequest hillRequest = (HillRequest) obj;
        return l.a(this.dlno, hillRequest.dlno) && l.a(this.dob, hillRequest.dob) && l.a(this.rtoCodeDLTr, hillRequest.rtoCodeDLTr) && l.a(this.applcatgDLserReq, hillRequest.applcatgDLserReq) && l.a(this.dlHolderAltMobMum, hillRequest.dlHolderAltMobMum) && l.a(this.willtoDonateOrgans, hillRequest.willtoDonateOrgans) && l.a(this.mobileNumber, hillRequest.mobileNumber) && l.a(this.declaringcheck, hillRequest.declaringcheck) && l.a(this.hillcertificate, hillRequest.hillcertificate) && l.a(this.hillissueDate, hillRequest.hillissueDate) && l.a(this.hillvalidFrom, hillRequest.hillvalidFrom) && l.a(this.hillvalidTo, hillRequest.hillvalidTo) && l.a(this.hilldrivingschool, hillRequest.hilldrivingschool) && l.a(this.hillissby, hillRequest.hillissby) && l.a(this.agentId, hillRequest.agentId) && l.a(this.agentIpAddress, hillRequest.agentIpAddress) && l.a(this.agentPwd, hillRequest.agentPwd) && l.a(this.agentServiceName, hillRequest.agentServiceName) && l.a(this.selectedDLSerList, hillRequest.selectedDLSerList) && l.a(this.eKYCId, hillRequest.eKYCId) && l.a(this.eKYCOpted, hillRequest.eKYCOpted) && l.a(this.eKYCapplicantPhoto, hillRequest.eKYCapplicantPhoto) && l.a(this.eKYCGender, hillRequest.eKYCGender);
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

    public final String getApplcatgDLserReq() {
        return this.applcatgDLserReq;
    }

    public final String getDeclaringcheck() {
        return this.declaringcheck;
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

    public final String getHillcertificate() {
        return this.hillcertificate;
    }

    public final String getHilldrivingschool() {
        return this.hilldrivingschool;
    }

    public final String getHillissby() {
        return this.hillissby;
    }

    public final String getHillissueDate() {
        return this.hillissueDate;
    }

    public final String getHillvalidFrom() {
        return this.hillvalidFrom;
    }

    public final String getHillvalidTo() {
        return this.hillvalidTo;
    }

    public final String getMobileNumber() {
        return this.mobileNumber;
    }

    public final String getRtoCodeDLTr() {
        return this.rtoCodeDLTr;
    }

    public final HillSelectedList getSelectedDLSerList() {
        return this.selectedDLSerList;
    }

    public final String getWilltoDonateOrgans() {
        return this.willtoDonateOrgans;
    }

    public int hashCode() {
        String str = this.dlno;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.dob;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.rtoCodeDLTr;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.applcatgDLserReq;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.dlHolderAltMobMum;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.willtoDonateOrgans;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.mobileNumber;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.declaringcheck;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.hillcertificate;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.hillissueDate;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.hillvalidFrom;
        int hashCode11 = (hashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.hillvalidTo;
        int hashCode12 = (hashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.hilldrivingschool;
        int hashCode13 = (hashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.hillissby;
        int hashCode14 = (hashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.agentId;
        int hashCode15 = (hashCode14 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.agentIpAddress;
        int hashCode16 = (hashCode15 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.agentPwd;
        int hashCode17 = (hashCode16 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.agentServiceName;
        int hashCode18 = (hashCode17 + (str18 == null ? 0 : str18.hashCode())) * 31;
        HillSelectedList hillSelectedList = this.selectedDLSerList;
        int hashCode19 = (hashCode18 + (hillSelectedList == null ? 0 : hillSelectedList.hashCode())) * 31;
        String str19 = this.eKYCId;
        int hashCode20 = (hashCode19 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.eKYCOpted;
        int hashCode21 = (hashCode20 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.eKYCapplicantPhoto;
        int hashCode22 = (hashCode21 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.eKYCGender;
        if (str22 != null) {
            i10 = str22.hashCode();
        }
        return hashCode22 + i10;
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

    public final void setApplcatgDLserReq(String str) {
        this.applcatgDLserReq = str;
    }

    public final void setDeclaringcheck(String str) {
        this.declaringcheck = str;
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

    public final void setHillcertificate(String str) {
        this.hillcertificate = str;
    }

    public final void setHilldrivingschool(String str) {
        this.hilldrivingschool = str;
    }

    public final void setHillissby(String str) {
        this.hillissby = str;
    }

    public final void setHillissueDate(String str) {
        this.hillissueDate = str;
    }

    public final void setHillvalidFrom(String str) {
        this.hillvalidFrom = str;
    }

    public final void setHillvalidTo(String str) {
        this.hillvalidTo = str;
    }

    public final void setMobileNumber(String str) {
        this.mobileNumber = str;
    }

    public final void setRtoCodeDLTr(String str) {
        this.rtoCodeDLTr = str;
    }

    public final void setSelectedDLSerList(HillSelectedList hillSelectedList) {
        this.selectedDLSerList = hillSelectedList;
    }

    public final void setWilltoDonateOrgans(String str) {
        this.willtoDonateOrgans = str;
    }

    public String toString() {
        return "HillRequest(dlno=" + this.dlno + ", dob=" + this.dob + ", rtoCodeDLTr=" + this.rtoCodeDLTr + ", applcatgDLserReq=" + this.applcatgDLserReq + ", dlHolderAltMobMum=" + this.dlHolderAltMobMum + ", willtoDonateOrgans=" + this.willtoDonateOrgans + ", mobileNumber=" + this.mobileNumber + ", declaringcheck=" + this.declaringcheck + ", hillcertificate=" + this.hillcertificate + ", hillissueDate=" + this.hillissueDate + ", hillvalidFrom=" + this.hillvalidFrom + ", hillvalidTo=" + this.hillvalidTo + ", hilldrivingschool=" + this.hilldrivingschool + ", hillissby=" + this.hillissby + ", agentId=" + this.agentId + ", agentIpAddress=" + this.agentIpAddress + ", agentPwd=" + this.agentPwd + ", agentServiceName=" + this.agentServiceName + ", selectedDLSerList=" + this.selectedDLSerList + ", eKYCId=" + this.eKYCId + ", eKYCOpted=" + this.eKYCOpted + ", eKYCapplicantPhoto=" + this.eKYCapplicantPhoto + ", eKYCGender=" + this.eKYCGender + ')';
    }

    public HillRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, HillSelectedList hillSelectedList, String str19, String str20, String str21, String str22) {
        this.dlno = str;
        this.dob = str2;
        this.rtoCodeDLTr = str3;
        this.applcatgDLserReq = str4;
        this.dlHolderAltMobMum = str5;
        this.willtoDonateOrgans = str6;
        this.mobileNumber = str7;
        this.declaringcheck = str8;
        this.hillcertificate = str9;
        this.hillissueDate = str10;
        this.hillvalidFrom = str11;
        this.hillvalidTo = str12;
        this.hilldrivingschool = str13;
        this.hillissby = str14;
        this.agentId = str15;
        this.agentIpAddress = str16;
        this.agentPwd = str17;
        this.agentServiceName = str18;
        this.selectedDLSerList = hillSelectedList;
        this.eKYCId = str19;
        this.eKYCOpted = str20;
        this.eKYCapplicantPhoto = str21;
        this.eKYCGender = str22;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ HillRequest(java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, java.lang.String r36, java.lang.String r37, java.lang.String r38, java.lang.String r39, java.lang.String r40, java.lang.String r41, java.lang.String r42, com.nic.mparivahan.dlservices.data.repo.hillpackage.HillSelectedList r43, java.lang.String r44, java.lang.String r45, java.lang.String r46, java.lang.String r47, int r48, cm.g r49) {
        /*
            r24 = this;
            r0 = r48
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0008
            r1 = 0
            goto L_0x000a
        L_0x0008:
            r1 = r25
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = 0
            goto L_0x0012
        L_0x0010:
            r3 = r26
        L_0x0012:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0018
            r4 = 0
            goto L_0x001a
        L_0x0018:
            r4 = r27
        L_0x001a:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0020
            r5 = 0
            goto L_0x0022
        L_0x0020:
            r5 = r28
        L_0x0022:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0028
            r6 = 0
            goto L_0x002a
        L_0x0028:
            r6 = r29
        L_0x002a:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0030
            r7 = 0
            goto L_0x0032
        L_0x0030:
            r7 = r30
        L_0x0032:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0038
            r8 = 0
            goto L_0x003a
        L_0x0038:
            r8 = r31
        L_0x003a:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0040
            r9 = 0
            goto L_0x0042
        L_0x0040:
            r9 = r32
        L_0x0042:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0048
            r10 = 0
            goto L_0x004a
        L_0x0048:
            r10 = r33
        L_0x004a:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x0050
            r11 = 0
            goto L_0x0052
        L_0x0050:
            r11 = r34
        L_0x0052:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x0058
            r12 = 0
            goto L_0x005a
        L_0x0058:
            r12 = r35
        L_0x005a:
            r13 = r0 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L_0x0060
            r13 = 0
            goto L_0x0062
        L_0x0060:
            r13 = r36
        L_0x0062:
            r14 = r0 & 4096(0x1000, float:5.74E-42)
            if (r14 == 0) goto L_0x0068
            r14 = 0
            goto L_0x006a
        L_0x0068:
            r14 = r37
        L_0x006a:
            r15 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r15 == 0) goto L_0x0070
            r15 = 0
            goto L_0x0072
        L_0x0070:
            r15 = r38
        L_0x0072:
            r2 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r2 == 0) goto L_0x0078
            r2 = 0
            goto L_0x007a
        L_0x0078:
            r2 = r39
        L_0x007a:
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r0 & r16
            if (r16 == 0) goto L_0x0084
            r16 = 0
            goto L_0x0086
        L_0x0084:
            r16 = r40
        L_0x0086:
            r17 = 65536(0x10000, float:9.18355E-41)
            r17 = r0 & r17
            if (r17 == 0) goto L_0x008f
            r17 = 0
            goto L_0x0091
        L_0x008f:
            r17 = r41
        L_0x0091:
            r18 = 131072(0x20000, float:1.83671E-40)
            r18 = r0 & r18
            if (r18 == 0) goto L_0x009a
            r18 = 0
            goto L_0x009c
        L_0x009a:
            r18 = r42
        L_0x009c:
            r19 = 262144(0x40000, float:3.67342E-40)
            r19 = r0 & r19
            if (r19 == 0) goto L_0x00a5
            r19 = 0
            goto L_0x00a7
        L_0x00a5:
            r19 = r43
        L_0x00a7:
            r20 = 524288(0x80000, float:7.34684E-40)
            r20 = r0 & r20
            if (r20 == 0) goto L_0x00b0
            r20 = 0
            goto L_0x00b2
        L_0x00b0:
            r20 = r44
        L_0x00b2:
            r21 = 1048576(0x100000, float:1.469368E-39)
            r21 = r0 & r21
            if (r21 == 0) goto L_0x00bb
            r21 = 0
            goto L_0x00bd
        L_0x00bb:
            r21 = r45
        L_0x00bd:
            r22 = 2097152(0x200000, float:2.938736E-39)
            r22 = r0 & r22
            if (r22 == 0) goto L_0x00c6
            r22 = 0
            goto L_0x00c8
        L_0x00c6:
            r22 = r46
        L_0x00c8:
            r23 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r23
            if (r0 == 0) goto L_0x00d0
            r0 = 0
            goto L_0x00d2
        L_0x00d0:
            r0 = r47
        L_0x00d2:
            r25 = r24
            r26 = r1
            r27 = r3
            r28 = r4
            r29 = r5
            r30 = r6
            r31 = r7
            r32 = r8
            r33 = r9
            r34 = r10
            r35 = r11
            r36 = r12
            r37 = r13
            r38 = r14
            r39 = r15
            r40 = r2
            r41 = r16
            r42 = r17
            r43 = r18
            r44 = r19
            r45 = r20
            r46 = r21
            r47 = r22
            r48 = r0
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.dlservices.data.repo.hillpackage.HillRequest.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.nic.mparivahan.dlservices.data.repo.hillpackage.HillSelectedList, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, cm.g):void");
    }
}
