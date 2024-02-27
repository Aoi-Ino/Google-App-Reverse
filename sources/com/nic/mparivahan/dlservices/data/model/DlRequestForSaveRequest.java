package com.nic.mparivahan.dlservices.data.model;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;

@Keep
public final class DlRequestForSaveRequest {
    @c("applcatgDLserReq")
    private String applcatgDLserReq;
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
    @c("selectedDLSerList")
    private DlRenewalSerList mDlRenewalSerList;
    @c("mobileNumber")
    private String mobileNumber;
    @c("rtoCodeDLTr")
    private String rtoCodeDLTr;

    public DlRequestForSaveRequest() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (DlRenewalSerList) null, (String) null, (String) null, (String) null, (String) null, 1023, (g) null);
    }

    public static /* synthetic */ DlRequestForSaveRequest copy$default(DlRequestForSaveRequest dlRequestForSaveRequest, String str, String str2, String str3, String str4, String str5, DlRenewalSerList dlRenewalSerList, String str6, String str7, String str8, String str9, int i10, Object obj) {
        DlRequestForSaveRequest dlRequestForSaveRequest2 = dlRequestForSaveRequest;
        int i11 = i10;
        return dlRequestForSaveRequest.copy((i11 & 1) != 0 ? dlRequestForSaveRequest2.rtoCodeDLTr : str, (i11 & 2) != 0 ? dlRequestForSaveRequest2.dlno : str2, (i11 & 4) != 0 ? dlRequestForSaveRequest2.dob : str3, (i11 & 8) != 0 ? dlRequestForSaveRequest2.applcatgDLserReq : str4, (i11 & 16) != 0 ? dlRequestForSaveRequest2.mobileNumber : str5, (i11 & 32) != 0 ? dlRequestForSaveRequest2.mDlRenewalSerList : dlRenewalSerList, (i11 & 64) != 0 ? dlRequestForSaveRequest2.eKYCId : str6, (i11 & 128) != 0 ? dlRequestForSaveRequest2.eKYCOpted : str7, (i11 & 256) != 0 ? dlRequestForSaveRequest2.eKYCapplicantPhoto : str8, (i11 & 512) != 0 ? dlRequestForSaveRequest2.eKYCGender : str9);
    }

    public final String component1() {
        return this.rtoCodeDLTr;
    }

    public final String component10() {
        return this.eKYCGender;
    }

    public final String component2() {
        return this.dlno;
    }

    public final String component3() {
        return this.dob;
    }

    public final String component4() {
        return this.applcatgDLserReq;
    }

    public final String component5() {
        return this.mobileNumber;
    }

    public final DlRenewalSerList component6() {
        return this.mDlRenewalSerList;
    }

    public final String component7() {
        return this.eKYCId;
    }

    public final String component8() {
        return this.eKYCOpted;
    }

    public final String component9() {
        return this.eKYCapplicantPhoto;
    }

    public final DlRequestForSaveRequest copy(String str, String str2, String str3, String str4, String str5, DlRenewalSerList dlRenewalSerList, String str6, String str7, String str8, String str9) {
        return new DlRequestForSaveRequest(str, str2, str3, str4, str5, dlRenewalSerList, str6, str7, str8, str9);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DlRequestForSaveRequest)) {
            return false;
        }
        DlRequestForSaveRequest dlRequestForSaveRequest = (DlRequestForSaveRequest) obj;
        return l.a(this.rtoCodeDLTr, dlRequestForSaveRequest.rtoCodeDLTr) && l.a(this.dlno, dlRequestForSaveRequest.dlno) && l.a(this.dob, dlRequestForSaveRequest.dob) && l.a(this.applcatgDLserReq, dlRequestForSaveRequest.applcatgDLserReq) && l.a(this.mobileNumber, dlRequestForSaveRequest.mobileNumber) && l.a(this.mDlRenewalSerList, dlRequestForSaveRequest.mDlRenewalSerList) && l.a(this.eKYCId, dlRequestForSaveRequest.eKYCId) && l.a(this.eKYCOpted, dlRequestForSaveRequest.eKYCOpted) && l.a(this.eKYCapplicantPhoto, dlRequestForSaveRequest.eKYCapplicantPhoto) && l.a(this.eKYCGender, dlRequestForSaveRequest.eKYCGender);
    }

    public final String getApplcatgDLserReq() {
        return this.applcatgDLserReq;
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

    public final DlRenewalSerList getMDlRenewalSerList() {
        return this.mDlRenewalSerList;
    }

    public final String getMobileNumber() {
        return this.mobileNumber;
    }

    public final String getRtoCodeDLTr() {
        return this.rtoCodeDLTr;
    }

    public int hashCode() {
        String str = this.rtoCodeDLTr;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.dlno;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.dob;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.applcatgDLserReq;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.mobileNumber;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        DlRenewalSerList dlRenewalSerList = this.mDlRenewalSerList;
        int hashCode6 = (hashCode5 + (dlRenewalSerList == null ? 0 : dlRenewalSerList.hashCode())) * 31;
        String str6 = this.eKYCId;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.eKYCOpted;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.eKYCapplicantPhoto;
        int hashCode9 = (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.eKYCGender;
        if (str9 != null) {
            i10 = str9.hashCode();
        }
        return hashCode9 + i10;
    }

    public final void setApplcatgDLserReq(String str) {
        this.applcatgDLserReq = str;
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

    public final void setMDlRenewalSerList(DlRenewalSerList dlRenewalSerList) {
        this.mDlRenewalSerList = dlRenewalSerList;
    }

    public final void setMobileNumber(String str) {
        this.mobileNumber = str;
    }

    public final void setRtoCodeDLTr(String str) {
        this.rtoCodeDLTr = str;
    }

    public String toString() {
        return "DlRequestForSaveRequest(rtoCodeDLTr=" + this.rtoCodeDLTr + ", dlno=" + this.dlno + ", dob=" + this.dob + ", applcatgDLserReq=" + this.applcatgDLserReq + ", mobileNumber=" + this.mobileNumber + ", mDlRenewalSerList=" + this.mDlRenewalSerList + ", eKYCId=" + this.eKYCId + ", eKYCOpted=" + this.eKYCOpted + ", eKYCapplicantPhoto=" + this.eKYCapplicantPhoto + ", eKYCGender=" + this.eKYCGender + ')';
    }

    public DlRequestForSaveRequest(String str, String str2, String str3, String str4, String str5, DlRenewalSerList dlRenewalSerList, String str6, String str7, String str8, String str9) {
        this.rtoCodeDLTr = str;
        this.dlno = str2;
        this.dob = str3;
        this.applcatgDLserReq = str4;
        this.mobileNumber = str5;
        this.mDlRenewalSerList = dlRenewalSerList;
        this.eKYCId = str6;
        this.eKYCOpted = str7;
        this.eKYCapplicantPhoto = str8;
        this.eKYCGender = str9;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ DlRequestForSaveRequest(java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, com.nic.mparivahan.dlservices.data.model.DlRenewalSerList r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, int r22, cm.g r23) {
        /*
            r11 = this;
            r0 = r22
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r12
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = r2
            goto L_0x0011
        L_0x0010:
            r3 = r13
        L_0x0011:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0017
            r4 = r2
            goto L_0x0018
        L_0x0017:
            r4 = r14
        L_0x0018:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x001e
            r5 = r2
            goto L_0x001f
        L_0x001e:
            r5 = r15
        L_0x001f:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0025
            r6 = r2
            goto L_0x0027
        L_0x0025:
            r6 = r16
        L_0x0027:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x002d
            r7 = r2
            goto L_0x002f
        L_0x002d:
            r7 = r17
        L_0x002f:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0035
            r8 = r2
            goto L_0x0037
        L_0x0035:
            r8 = r18
        L_0x0037:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x003d
            r9 = r2
            goto L_0x003f
        L_0x003d:
            r9 = r19
        L_0x003f:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0045
            r10 = r2
            goto L_0x0047
        L_0x0045:
            r10 = r20
        L_0x0047:
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x004c
            goto L_0x004e
        L_0x004c:
            r2 = r21
        L_0x004e:
            r12 = r11
            r13 = r1
            r14 = r3
            r15 = r4
            r16 = r5
            r17 = r6
            r18 = r7
            r19 = r8
            r20 = r9
            r21 = r10
            r22 = r2
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.dlservices.data.model.DlRequestForSaveRequest.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.nic.mparivahan.dlservices.data.model.DlRenewalSerList, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, cm.g):void");
    }
}
