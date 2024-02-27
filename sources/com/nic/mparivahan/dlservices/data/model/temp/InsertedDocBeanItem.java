package com.nic.mparivahan.dlservices.data.model.temp;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;

@Keep
public final class InsertedDocBeanItem {
    @c("contactNo")
    private final String contactNo;
    @c("docCode")
    private final Integer docCode;
    @c("docName")
    private final String docName;
    @c("docNo")
    private final String docNo;
    @c("docStatus")
    private final String docStatus;
    @c("docURL")
    private final String docURL;
    @c("docseqNo")
    private final Integer docseqNo;
    @c("fileNmae")
    private final String fileNmae;
    @c("issueAuthDesg")
    private final String issueAuthDesg;
    @c("issueDate")
    private final String issueDate;
    @c("proofCode")
    private final Integer proofCode;
    @c("proofName")
    private final String proofName;
    @c("putUpCase")
    private boolean putUpCase;
    @c("remarks")
    private final String remarks;
    @c("reuploaded")
    private final String reuploaded;
    @c("row")
    private final Object row;
    @c("verifyStatus")
    private final String verifyStatus;

    public InsertedDocBeanItem() {
        this((Integer) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (String) null, (String) null, (String) null, (Object) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, 131071, (g) null);
    }

    public static /* synthetic */ InsertedDocBeanItem copy$default(InsertedDocBeanItem insertedDocBeanItem, Integer num, Integer num2, String str, String str2, String str3, String str4, Integer num3, String str5, String str6, String str7, Object obj, String str8, boolean z10, String str9, String str10, String str11, String str12, int i10, Object obj2) {
        InsertedDocBeanItem insertedDocBeanItem2 = insertedDocBeanItem;
        int i11 = i10;
        return insertedDocBeanItem.copy((i11 & 1) != 0 ? insertedDocBeanItem2.proofCode : num, (i11 & 2) != 0 ? insertedDocBeanItem2.docCode : num2, (i11 & 4) != 0 ? insertedDocBeanItem2.docNo : str, (i11 & 8) != 0 ? insertedDocBeanItem2.docName : str2, (i11 & 16) != 0 ? insertedDocBeanItem2.docStatus : str3, (i11 & 32) != 0 ? insertedDocBeanItem2.verifyStatus : str4, (i11 & 64) != 0 ? insertedDocBeanItem2.docseqNo : num3, (i11 & 128) != 0 ? insertedDocBeanItem2.docURL : str5, (i11 & 256) != 0 ? insertedDocBeanItem2.proofName : str6, (i11 & 512) != 0 ? insertedDocBeanItem2.fileNmae : str7, (i11 & 1024) != 0 ? insertedDocBeanItem2.row : obj, (i11 & 2048) != 0 ? insertedDocBeanItem2.issueDate : str8, (i11 & 4096) != 0 ? insertedDocBeanItem2.putUpCase : z10, (i11 & 8192) != 0 ? insertedDocBeanItem2.remarks : str9, (i11 & 16384) != 0 ? insertedDocBeanItem2.contactNo : str10, (i11 & 32768) != 0 ? insertedDocBeanItem2.issueAuthDesg : str11, (i11 & 65536) != 0 ? insertedDocBeanItem2.reuploaded : str12);
    }

    public final Integer component1() {
        return this.proofCode;
    }

    public final String component10() {
        return this.fileNmae;
    }

    public final Object component11() {
        return this.row;
    }

    public final String component12() {
        return this.issueDate;
    }

    public final boolean component13() {
        return this.putUpCase;
    }

    public final String component14() {
        return this.remarks;
    }

    public final String component15() {
        return this.contactNo;
    }

    public final String component16() {
        return this.issueAuthDesg;
    }

    public final String component17() {
        return this.reuploaded;
    }

    public final Integer component2() {
        return this.docCode;
    }

    public final String component3() {
        return this.docNo;
    }

    public final String component4() {
        return this.docName;
    }

    public final String component5() {
        return this.docStatus;
    }

    public final String component6() {
        return this.verifyStatus;
    }

    public final Integer component7() {
        return this.docseqNo;
    }

    public final String component8() {
        return this.docURL;
    }

    public final String component9() {
        return this.proofName;
    }

    public final InsertedDocBeanItem copy(Integer num, Integer num2, String str, String str2, String str3, String str4, Integer num3, String str5, String str6, String str7, Object obj, String str8, boolean z10, String str9, String str10, String str11, String str12) {
        Integer num4 = num;
        l.f(str, "docNo");
        l.f(str8, "issueDate");
        l.f(str11, "issueAuthDesg");
        return new InsertedDocBeanItem(num, num2, str, str2, str3, str4, num3, str5, str6, str7, obj, str8, z10, str9, str10, str11, str12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InsertedDocBeanItem)) {
            return false;
        }
        InsertedDocBeanItem insertedDocBeanItem = (InsertedDocBeanItem) obj;
        return l.a(this.proofCode, insertedDocBeanItem.proofCode) && l.a(this.docCode, insertedDocBeanItem.docCode) && l.a(this.docNo, insertedDocBeanItem.docNo) && l.a(this.docName, insertedDocBeanItem.docName) && l.a(this.docStatus, insertedDocBeanItem.docStatus) && l.a(this.verifyStatus, insertedDocBeanItem.verifyStatus) && l.a(this.docseqNo, insertedDocBeanItem.docseqNo) && l.a(this.docURL, insertedDocBeanItem.docURL) && l.a(this.proofName, insertedDocBeanItem.proofName) && l.a(this.fileNmae, insertedDocBeanItem.fileNmae) && l.a(this.row, insertedDocBeanItem.row) && l.a(this.issueDate, insertedDocBeanItem.issueDate) && this.putUpCase == insertedDocBeanItem.putUpCase && l.a(this.remarks, insertedDocBeanItem.remarks) && l.a(this.contactNo, insertedDocBeanItem.contactNo) && l.a(this.issueAuthDesg, insertedDocBeanItem.issueAuthDesg) && l.a(this.reuploaded, insertedDocBeanItem.reuploaded);
    }

    public final String getContactNo() {
        return this.contactNo;
    }

    public final Integer getDocCode() {
        return this.docCode;
    }

    public final String getDocName() {
        return this.docName;
    }

    public final String getDocNo() {
        return this.docNo;
    }

    public final String getDocStatus() {
        return this.docStatus;
    }

    public final String getDocURL() {
        return this.docURL;
    }

    public final Integer getDocseqNo() {
        return this.docseqNo;
    }

    public final String getFileNmae() {
        return this.fileNmae;
    }

    public final String getIssueAuthDesg() {
        return this.issueAuthDesg;
    }

    public final String getIssueDate() {
        return this.issueDate;
    }

    public final Integer getProofCode() {
        return this.proofCode;
    }

    public final String getProofName() {
        return this.proofName;
    }

    public final boolean getPutUpCase() {
        return this.putUpCase;
    }

    public final String getRemarks() {
        return this.remarks;
    }

    public final String getReuploaded() {
        return this.reuploaded;
    }

    public final Object getRow() {
        return this.row;
    }

    public final String getVerifyStatus() {
        return this.verifyStatus;
    }

    public int hashCode() {
        Integer num = this.proofCode;
        int i10 = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.docCode;
        int hashCode2 = (((hashCode + (num2 == null ? 0 : num2.hashCode())) * 31) + this.docNo.hashCode()) * 31;
        String str = this.docName;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.docStatus;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.verifyStatus;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num3 = this.docseqNo;
        int hashCode6 = (hashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str4 = this.docURL;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.proofName;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.fileNmae;
        int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Object obj = this.row;
        int hashCode10 = (((hashCode9 + (obj == null ? 0 : obj.hashCode())) * 31) + this.issueDate.hashCode()) * 31;
        boolean z10 = this.putUpCase;
        if (z10) {
            z10 = true;
        }
        int i11 = (hashCode10 + (z10 ? 1 : 0)) * 31;
        String str7 = this.remarks;
        int hashCode11 = (i11 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.contactNo;
        int hashCode12 = (((hashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31) + this.issueAuthDesg.hashCode()) * 31;
        String str9 = this.reuploaded;
        if (str9 != null) {
            i10 = str9.hashCode();
        }
        return hashCode12 + i10;
    }

    public final void setPutUpCase(boolean z10) {
        this.putUpCase = z10;
    }

    public String toString() {
        return "InsertedDocBeanItem(proofCode=" + this.proofCode + ", docCode=" + this.docCode + ", docNo=" + this.docNo + ", docName=" + this.docName + ", docStatus=" + this.docStatus + ", verifyStatus=" + this.verifyStatus + ", docseqNo=" + this.docseqNo + ", docURL=" + this.docURL + ", proofName=" + this.proofName + ", fileNmae=" + this.fileNmae + ", row=" + this.row + ", issueDate=" + this.issueDate + ", putUpCase=" + this.putUpCase + ", remarks=" + this.remarks + ", contactNo=" + this.contactNo + ", issueAuthDesg=" + this.issueAuthDesg + ", reuploaded=" + this.reuploaded + ')';
    }

    public InsertedDocBeanItem(Integer num, Integer num2, String str, String str2, String str3, String str4, Integer num3, String str5, String str6, String str7, Object obj, String str8, boolean z10, String str9, String str10, String str11, String str12) {
        String str13 = str8;
        String str14 = str11;
        l.f(str, "docNo");
        l.f(str13, "issueDate");
        l.f(str14, "issueAuthDesg");
        this.proofCode = num;
        this.docCode = num2;
        this.docNo = str;
        this.docName = str2;
        this.docStatus = str3;
        this.verifyStatus = str4;
        this.docseqNo = num3;
        this.docURL = str5;
        this.proofName = str6;
        this.fileNmae = str7;
        this.row = obj;
        this.issueDate = str13;
        this.putUpCase = z10;
        this.remarks = str9;
        this.contactNo = str10;
        this.issueAuthDesg = str14;
        this.reuploaded = str12;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ InsertedDocBeanItem(java.lang.Integer r19, java.lang.Integer r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.Integer r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.Object r29, java.lang.String r30, boolean r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, int r36, cm.g r37) {
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
            java.lang.String r5 = ""
            if (r4 == 0) goto L_0x001a
            r4 = r5
            goto L_0x001c
        L_0x001a:
            r4 = r21
        L_0x001c:
            r6 = r0 & 8
            if (r6 == 0) goto L_0x0022
            r6 = 0
            goto L_0x0024
        L_0x0022:
            r6 = r22
        L_0x0024:
            r7 = r0 & 16
            if (r7 == 0) goto L_0x002a
            r7 = 0
            goto L_0x002c
        L_0x002a:
            r7 = r23
        L_0x002c:
            r8 = r0 & 32
            if (r8 == 0) goto L_0x0032
            r8 = 0
            goto L_0x0034
        L_0x0032:
            r8 = r24
        L_0x0034:
            r9 = r0 & 64
            if (r9 == 0) goto L_0x003a
            r9 = 0
            goto L_0x003c
        L_0x003a:
            r9 = r25
        L_0x003c:
            r10 = r0 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L_0x0042
            r10 = 0
            goto L_0x0044
        L_0x0042:
            r10 = r26
        L_0x0044:
            r11 = r0 & 256(0x100, float:3.59E-43)
            if (r11 == 0) goto L_0x004a
            r11 = 0
            goto L_0x004c
        L_0x004a:
            r11 = r27
        L_0x004c:
            r12 = r0 & 512(0x200, float:7.175E-43)
            if (r12 == 0) goto L_0x0052
            r12 = 0
            goto L_0x0054
        L_0x0052:
            r12 = r28
        L_0x0054:
            r13 = r0 & 1024(0x400, float:1.435E-42)
            if (r13 == 0) goto L_0x005a
            r13 = 0
            goto L_0x005c
        L_0x005a:
            r13 = r29
        L_0x005c:
            r14 = r0 & 2048(0x800, float:2.87E-42)
            if (r14 == 0) goto L_0x0062
            r14 = r5
            goto L_0x0064
        L_0x0062:
            r14 = r30
        L_0x0064:
            r15 = r0 & 4096(0x1000, float:5.74E-42)
            if (r15 == 0) goto L_0x006a
            r15 = 0
            goto L_0x006c
        L_0x006a:
            r15 = r31
        L_0x006c:
            r2 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r2 == 0) goto L_0x0072
            r2 = 0
            goto L_0x0074
        L_0x0072:
            r2 = r32
        L_0x0074:
            r19 = r5
            r5 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r5 == 0) goto L_0x007c
            r5 = 0
            goto L_0x007e
        L_0x007c:
            r5 = r33
        L_0x007e:
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r0 & r16
            if (r16 == 0) goto L_0x0088
            r16 = r19
            goto L_0x008a
        L_0x0088:
            r16 = r34
        L_0x008a:
            r17 = 65536(0x10000, float:9.18355E-41)
            r0 = r0 & r17
            if (r0 == 0) goto L_0x0092
            r0 = 0
            goto L_0x0094
        L_0x0092:
            r0 = r35
        L_0x0094:
            r19 = r18
            r20 = r1
            r21 = r3
            r22 = r4
            r23 = r6
            r24 = r7
            r25 = r8
            r26 = r9
            r27 = r10
            r28 = r11
            r29 = r12
            r30 = r13
            r31 = r14
            r32 = r15
            r33 = r2
            r34 = r5
            r35 = r16
            r36 = r0
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.dlservices.data.model.temp.InsertedDocBeanItem.<init>(java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.Object, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, cm.g):void");
    }
}
