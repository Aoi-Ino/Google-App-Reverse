package com.nic.mparivahan.dlservices.ui.dms.uploadmodel;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;

@Keep
public final class UploadDocsBeanItem {
    @c("applNo")
    private String applNo;
    @c("contactNo")
    private String contactNo;
    @c("docCode")
    private String docCode;
    @c("docNo")
    private String docNo;
    @c("docUpStatus")
    private String docUpStatus;
    @c("fileName")
    private String fileName;
    @c("fileToUpload")
    private String fileToUpload;
    @c("folderName")
    private String folderName;
    @c("forMultiple")
    private Boolean forMultiple;
    @c("isTemp")
    private Boolean isTemp;
    @c("issueDate")
    private String issueDate;
    @c("issuerDesg")
    private String issuerDesg;
    @c("proofCode")
    private String proofCode;
    @c("rtoCode")
    private String rtoCode;
    @c("savedInDMS")
    private Boolean savedInDMS;
    @c("stateCode")
    private String stateCode;
    @c("transCode")
    private String transCode;

    public UploadDocsBeanItem() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (Boolean) null, (Boolean) null, (String) null, (String) null, (String) null, (String) null, (String) null, 131071, (g) null);
    }

    public static /* synthetic */ UploadDocsBeanItem copy$default(UploadDocsBeanItem uploadDocsBeanItem, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Boolean bool, Boolean bool2, Boolean bool3, String str10, String str11, String str12, String str13, String str14, int i10, Object obj) {
        UploadDocsBeanItem uploadDocsBeanItem2 = uploadDocsBeanItem;
        int i11 = i10;
        return uploadDocsBeanItem.copy((i11 & 1) != 0 ? uploadDocsBeanItem2.proofCode : str, (i11 & 2) != 0 ? uploadDocsBeanItem2.fileName : str2, (i11 & 4) != 0 ? uploadDocsBeanItem2.applNo : str3, (i11 & 8) != 0 ? uploadDocsBeanItem2.fileToUpload : str4, (i11 & 16) != 0 ? uploadDocsBeanItem2.docCode : str5, (i11 & 32) != 0 ? uploadDocsBeanItem2.docNo : str6, (i11 & 64) != 0 ? uploadDocsBeanItem2.rtoCode : str7, (i11 & 128) != 0 ? uploadDocsBeanItem2.docUpStatus : str8, (i11 & 256) != 0 ? uploadDocsBeanItem2.issuerDesg : str9, (i11 & 512) != 0 ? uploadDocsBeanItem2.savedInDMS : bool, (i11 & 1024) != 0 ? uploadDocsBeanItem2.isTemp : bool2, (i11 & 2048) != 0 ? uploadDocsBeanItem2.forMultiple : bool3, (i11 & 4096) != 0 ? uploadDocsBeanItem2.stateCode : str10, (i11 & 8192) != 0 ? uploadDocsBeanItem2.transCode : str11, (i11 & 16384) != 0 ? uploadDocsBeanItem2.folderName : str12, (i11 & 32768) != 0 ? uploadDocsBeanItem2.issueDate : str13, (i11 & 65536) != 0 ? uploadDocsBeanItem2.contactNo : str14);
    }

    public final String component1() {
        return this.proofCode;
    }

    public final Boolean component10() {
        return this.savedInDMS;
    }

    public final Boolean component11() {
        return this.isTemp;
    }

    public final Boolean component12() {
        return this.forMultiple;
    }

    public final String component13() {
        return this.stateCode;
    }

    public final String component14() {
        return this.transCode;
    }

    public final String component15() {
        return this.folderName;
    }

    public final String component16() {
        return this.issueDate;
    }

    public final String component17() {
        return this.contactNo;
    }

    public final String component2() {
        return this.fileName;
    }

    public final String component3() {
        return this.applNo;
    }

    public final String component4() {
        return this.fileToUpload;
    }

    public final String component5() {
        return this.docCode;
    }

    public final String component6() {
        return this.docNo;
    }

    public final String component7() {
        return this.rtoCode;
    }

    public final String component8() {
        return this.docUpStatus;
    }

    public final String component9() {
        return this.issuerDesg;
    }

    public final UploadDocsBeanItem copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Boolean bool, Boolean bool2, Boolean bool3, String str10, String str11, String str12, String str13, String str14) {
        return new UploadDocsBeanItem(str, str2, str3, str4, str5, str6, str7, str8, str9, bool, bool2, bool3, str10, str11, str12, str13, str14);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UploadDocsBeanItem)) {
            return false;
        }
        UploadDocsBeanItem uploadDocsBeanItem = (UploadDocsBeanItem) obj;
        return l.a(this.proofCode, uploadDocsBeanItem.proofCode) && l.a(this.fileName, uploadDocsBeanItem.fileName) && l.a(this.applNo, uploadDocsBeanItem.applNo) && l.a(this.fileToUpload, uploadDocsBeanItem.fileToUpload) && l.a(this.docCode, uploadDocsBeanItem.docCode) && l.a(this.docNo, uploadDocsBeanItem.docNo) && l.a(this.rtoCode, uploadDocsBeanItem.rtoCode) && l.a(this.docUpStatus, uploadDocsBeanItem.docUpStatus) && l.a(this.issuerDesg, uploadDocsBeanItem.issuerDesg) && l.a(this.savedInDMS, uploadDocsBeanItem.savedInDMS) && l.a(this.isTemp, uploadDocsBeanItem.isTemp) && l.a(this.forMultiple, uploadDocsBeanItem.forMultiple) && l.a(this.stateCode, uploadDocsBeanItem.stateCode) && l.a(this.transCode, uploadDocsBeanItem.transCode) && l.a(this.folderName, uploadDocsBeanItem.folderName) && l.a(this.issueDate, uploadDocsBeanItem.issueDate) && l.a(this.contactNo, uploadDocsBeanItem.contactNo);
    }

    public final String getApplNo() {
        return this.applNo;
    }

    public final String getContactNo() {
        return this.contactNo;
    }

    public final String getDocCode() {
        return this.docCode;
    }

    public final String getDocNo() {
        return this.docNo;
    }

    public final String getDocUpStatus() {
        return this.docUpStatus;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final String getFileToUpload() {
        return this.fileToUpload;
    }

    public final String getFolderName() {
        return this.folderName;
    }

    public final Boolean getForMultiple() {
        return this.forMultiple;
    }

    public final String getIssueDate() {
        return this.issueDate;
    }

    public final String getIssuerDesg() {
        return this.issuerDesg;
    }

    public final String getProofCode() {
        return this.proofCode;
    }

    public final String getRtoCode() {
        return this.rtoCode;
    }

    public final Boolean getSavedInDMS() {
        return this.savedInDMS;
    }

    public final String getStateCode() {
        return this.stateCode;
    }

    public final String getTransCode() {
        return this.transCode;
    }

    public int hashCode() {
        String str = this.proofCode;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.fileName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.applNo;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.fileToUpload;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.docCode;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.docNo;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.rtoCode;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.docUpStatus;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.issuerDesg;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Boolean bool = this.savedInDMS;
        int hashCode10 = (hashCode9 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isTemp;
        int hashCode11 = (hashCode10 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.forMultiple;
        int hashCode12 = (hashCode11 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str10 = this.stateCode;
        int hashCode13 = (hashCode12 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.transCode;
        int hashCode14 = (hashCode13 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.folderName;
        int hashCode15 = (hashCode14 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.issueDate;
        int hashCode16 = (hashCode15 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.contactNo;
        if (str14 != null) {
            i10 = str14.hashCode();
        }
        return hashCode16 + i10;
    }

    public final Boolean isTemp() {
        return this.isTemp;
    }

    public final void setApplNo(String str) {
        this.applNo = str;
    }

    public final void setContactNo(String str) {
        this.contactNo = str;
    }

    public final void setDocCode(String str) {
        this.docCode = str;
    }

    public final void setDocNo(String str) {
        this.docNo = str;
    }

    public final void setDocUpStatus(String str) {
        this.docUpStatus = str;
    }

    public final void setFileName(String str) {
        this.fileName = str;
    }

    public final void setFileToUpload(String str) {
        this.fileToUpload = str;
    }

    public final void setFolderName(String str) {
        this.folderName = str;
    }

    public final void setForMultiple(Boolean bool) {
        this.forMultiple = bool;
    }

    public final void setIssueDate(String str) {
        this.issueDate = str;
    }

    public final void setIssuerDesg(String str) {
        this.issuerDesg = str;
    }

    public final void setProofCode(String str) {
        this.proofCode = str;
    }

    public final void setRtoCode(String str) {
        this.rtoCode = str;
    }

    public final void setSavedInDMS(Boolean bool) {
        this.savedInDMS = bool;
    }

    public final void setStateCode(String str) {
        this.stateCode = str;
    }

    public final void setTemp(Boolean bool) {
        this.isTemp = bool;
    }

    public final void setTransCode(String str) {
        this.transCode = str;
    }

    public String toString() {
        return "UploadDocsBeanItem(proofCode=" + this.proofCode + ", fileName=" + this.fileName + ", applNo=" + this.applNo + ", fileToUpload=" + this.fileToUpload + ", docCode=" + this.docCode + ", docNo=" + this.docNo + ", rtoCode=" + this.rtoCode + ", docUpStatus=" + this.docUpStatus + ", issuerDesg=" + this.issuerDesg + ", savedInDMS=" + this.savedInDMS + ", isTemp=" + this.isTemp + ", forMultiple=" + this.forMultiple + ", stateCode=" + this.stateCode + ", transCode=" + this.transCode + ", folderName=" + this.folderName + ", issueDate=" + this.issueDate + ", contactNo=" + this.contactNo + ')';
    }

    public UploadDocsBeanItem(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Boolean bool, Boolean bool2, Boolean bool3, String str10, String str11, String str12, String str13, String str14) {
        this.proofCode = str;
        this.fileName = str2;
        this.applNo = str3;
        this.fileToUpload = str4;
        this.docCode = str5;
        this.docNo = str6;
        this.rtoCode = str7;
        this.docUpStatus = str8;
        this.issuerDesg = str9;
        this.savedInDMS = bool;
        this.isTemp = bool2;
        this.forMultiple = bool3;
        this.stateCode = str10;
        this.transCode = str11;
        this.folderName = str12;
        this.issueDate = str13;
        this.contactNo = str14;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ UploadDocsBeanItem(java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.Boolean r28, java.lang.Boolean r29, java.lang.Boolean r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, int r36, cm.g r37) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.dlservices.ui.dms.uploadmodel.UploadDocsBeanItem.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, cm.g):void");
    }
}
