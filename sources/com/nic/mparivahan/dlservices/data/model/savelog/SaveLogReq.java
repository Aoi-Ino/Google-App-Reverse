package com.nic.mparivahan.dlservices.data.model.savelog;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;

@Keep
public final class SaveLogReq {
    @c("sarlogAadhar4")
    private Integer sarlogAadhar4;
    @c("sarlogApplCat")
    private String sarlogApplCat;
    @c("sarlogApplDate")
    private String sarlogApplDate;
    @c("sarlogApplNo")
    private Integer sarlogApplNo;
    @c("sarlogCtzId")
    private Integer sarlogCtzId;
    @c("sarlogDlDob")
    private String sarlogDlDob;
    @c("sarlogDlNumber")
    private String sarlogDlNumber;
    @c("sarlog_eKYC")
    private String sarlogEKYC;
    @c("sarlog_eSign")
    private String sarlogESign;
    @c("sarlogGender")
    private String sarlogGender;
    @c("sarlogMobileNo")
    private String sarlogMobileNo;
    @c("sarlogOrgDonor")
    private Boolean sarlogOrgDonor;
    @c("sarlogPurCd")
    private Integer sarlogPurCd;
    @c("sarlogRtoCd")
    private String sarlogRtoCd;
    @c("sarlogStateCd")
    private String sarlogStateCd;

    public SaveLogReq() {
        this((String) null, (String) null, (Integer) null, (String) null, (Integer) null, (String) null, (Integer) null, (Boolean) null, (String) null, (String) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, 32767, (g) null);
    }

    public static /* synthetic */ SaveLogReq copy$default(SaveLogReq saveLogReq, String str, String str2, Integer num, String str3, Integer num2, String str4, Integer num3, Boolean bool, String str5, String str6, Integer num4, String str7, String str8, String str9, String str10, int i10, Object obj) {
        SaveLogReq saveLogReq2 = saveLogReq;
        int i11 = i10;
        return saveLogReq.copy((i11 & 1) != 0 ? saveLogReq2.sarlogDlDob : str, (i11 & 2) != 0 ? saveLogReq2.sarlogMobileNo : str2, (i11 & 4) != 0 ? saveLogReq2.sarlogCtzId : num, (i11 & 8) != 0 ? saveLogReq2.sarlogEKYC : str3, (i11 & 16) != 0 ? saveLogReq2.sarlogAadhar4 : num2, (i11 & 32) != 0 ? saveLogReq2.sarlogApplDate : str4, (i11 & 64) != 0 ? saveLogReq2.sarlogPurCd : num3, (i11 & 128) != 0 ? saveLogReq2.sarlogOrgDonor : bool, (i11 & 256) != 0 ? saveLogReq2.sarlogGender : str5, (i11 & 512) != 0 ? saveLogReq2.sarlogRtoCd : str6, (i11 & 1024) != 0 ? saveLogReq2.sarlogApplNo : num4, (i11 & 2048) != 0 ? saveLogReq2.sarlogStateCd : str7, (i11 & 4096) != 0 ? saveLogReq2.sarlogDlNumber : str8, (i11 & 8192) != 0 ? saveLogReq2.sarlogESign : str9, (i11 & 16384) != 0 ? saveLogReq2.sarlogApplCat : str10);
    }

    public final String component1() {
        return this.sarlogDlDob;
    }

    public final String component10() {
        return this.sarlogRtoCd;
    }

    public final Integer component11() {
        return this.sarlogApplNo;
    }

    public final String component12() {
        return this.sarlogStateCd;
    }

    public final String component13() {
        return this.sarlogDlNumber;
    }

    public final String component14() {
        return this.sarlogESign;
    }

    public final String component15() {
        return this.sarlogApplCat;
    }

    public final String component2() {
        return this.sarlogMobileNo;
    }

    public final Integer component3() {
        return this.sarlogCtzId;
    }

    public final String component4() {
        return this.sarlogEKYC;
    }

    public final Integer component5() {
        return this.sarlogAadhar4;
    }

    public final String component6() {
        return this.sarlogApplDate;
    }

    public final Integer component7() {
        return this.sarlogPurCd;
    }

    public final Boolean component8() {
        return this.sarlogOrgDonor;
    }

    public final String component9() {
        return this.sarlogGender;
    }

    public final SaveLogReq copy(String str, String str2, Integer num, String str3, Integer num2, String str4, Integer num3, Boolean bool, String str5, String str6, Integer num4, String str7, String str8, String str9, String str10) {
        return new SaveLogReq(str, str2, num, str3, num2, str4, num3, bool, str5, str6, num4, str7, str8, str9, str10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SaveLogReq)) {
            return false;
        }
        SaveLogReq saveLogReq = (SaveLogReq) obj;
        return l.a(this.sarlogDlDob, saveLogReq.sarlogDlDob) && l.a(this.sarlogMobileNo, saveLogReq.sarlogMobileNo) && l.a(this.sarlogCtzId, saveLogReq.sarlogCtzId) && l.a(this.sarlogEKYC, saveLogReq.sarlogEKYC) && l.a(this.sarlogAadhar4, saveLogReq.sarlogAadhar4) && l.a(this.sarlogApplDate, saveLogReq.sarlogApplDate) && l.a(this.sarlogPurCd, saveLogReq.sarlogPurCd) && l.a(this.sarlogOrgDonor, saveLogReq.sarlogOrgDonor) && l.a(this.sarlogGender, saveLogReq.sarlogGender) && l.a(this.sarlogRtoCd, saveLogReq.sarlogRtoCd) && l.a(this.sarlogApplNo, saveLogReq.sarlogApplNo) && l.a(this.sarlogStateCd, saveLogReq.sarlogStateCd) && l.a(this.sarlogDlNumber, saveLogReq.sarlogDlNumber) && l.a(this.sarlogESign, saveLogReq.sarlogESign) && l.a(this.sarlogApplCat, saveLogReq.sarlogApplCat);
    }

    public final Integer getSarlogAadhar4() {
        return this.sarlogAadhar4;
    }

    public final String getSarlogApplCat() {
        return this.sarlogApplCat;
    }

    public final String getSarlogApplDate() {
        return this.sarlogApplDate;
    }

    public final Integer getSarlogApplNo() {
        return this.sarlogApplNo;
    }

    public final Integer getSarlogCtzId() {
        return this.sarlogCtzId;
    }

    public final String getSarlogDlDob() {
        return this.sarlogDlDob;
    }

    public final String getSarlogDlNumber() {
        return this.sarlogDlNumber;
    }

    public final String getSarlogEKYC() {
        return this.sarlogEKYC;
    }

    public final String getSarlogESign() {
        return this.sarlogESign;
    }

    public final String getSarlogGender() {
        return this.sarlogGender;
    }

    public final String getSarlogMobileNo() {
        return this.sarlogMobileNo;
    }

    public final Boolean getSarlogOrgDonor() {
        return this.sarlogOrgDonor;
    }

    public final Integer getSarlogPurCd() {
        return this.sarlogPurCd;
    }

    public final String getSarlogRtoCd() {
        return this.sarlogRtoCd;
    }

    public final String getSarlogStateCd() {
        return this.sarlogStateCd;
    }

    public int hashCode() {
        String str = this.sarlogDlDob;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.sarlogMobileNo;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.sarlogCtzId;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.sarlogEKYC;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num2 = this.sarlogAadhar4;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str4 = this.sarlogApplDate;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num3 = this.sarlogPurCd;
        int hashCode7 = (hashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Boolean bool = this.sarlogOrgDonor;
        int hashCode8 = (hashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str5 = this.sarlogGender;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.sarlogRtoCd;
        int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num4 = this.sarlogApplNo;
        int hashCode11 = (hashCode10 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str7 = this.sarlogStateCd;
        int hashCode12 = (hashCode11 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.sarlogDlNumber;
        int hashCode13 = (hashCode12 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.sarlogESign;
        int hashCode14 = (hashCode13 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.sarlogApplCat;
        if (str10 != null) {
            i10 = str10.hashCode();
        }
        return hashCode14 + i10;
    }

    public final void setSarlogAadhar4(Integer num) {
        this.sarlogAadhar4 = num;
    }

    public final void setSarlogApplCat(String str) {
        this.sarlogApplCat = str;
    }

    public final void setSarlogApplDate(String str) {
        this.sarlogApplDate = str;
    }

    public final void setSarlogApplNo(Integer num) {
        this.sarlogApplNo = num;
    }

    public final void setSarlogCtzId(Integer num) {
        this.sarlogCtzId = num;
    }

    public final void setSarlogDlDob(String str) {
        this.sarlogDlDob = str;
    }

    public final void setSarlogDlNumber(String str) {
        this.sarlogDlNumber = str;
    }

    public final void setSarlogEKYC(String str) {
        this.sarlogEKYC = str;
    }

    public final void setSarlogESign(String str) {
        this.sarlogESign = str;
    }

    public final void setSarlogGender(String str) {
        this.sarlogGender = str;
    }

    public final void setSarlogMobileNo(String str) {
        this.sarlogMobileNo = str;
    }

    public final void setSarlogOrgDonor(Boolean bool) {
        this.sarlogOrgDonor = bool;
    }

    public final void setSarlogPurCd(Integer num) {
        this.sarlogPurCd = num;
    }

    public final void setSarlogRtoCd(String str) {
        this.sarlogRtoCd = str;
    }

    public final void setSarlogStateCd(String str) {
        this.sarlogStateCd = str;
    }

    public String toString() {
        return "SaveLogReq(sarlogDlDob=" + this.sarlogDlDob + ", sarlogMobileNo=" + this.sarlogMobileNo + ", sarlogCtzId=" + this.sarlogCtzId + ", sarlogEKYC=" + this.sarlogEKYC + ", sarlogAadhar4=" + this.sarlogAadhar4 + ", sarlogApplDate=" + this.sarlogApplDate + ", sarlogPurCd=" + this.sarlogPurCd + ", sarlogOrgDonor=" + this.sarlogOrgDonor + ", sarlogGender=" + this.sarlogGender + ", sarlogRtoCd=" + this.sarlogRtoCd + ", sarlogApplNo=" + this.sarlogApplNo + ", sarlogStateCd=" + this.sarlogStateCd + ", sarlogDlNumber=" + this.sarlogDlNumber + ", sarlogESign=" + this.sarlogESign + ", sarlogApplCat=" + this.sarlogApplCat + ')';
    }

    public SaveLogReq(String str, String str2, Integer num, String str3, Integer num2, String str4, Integer num3, Boolean bool, String str5, String str6, Integer num4, String str7, String str8, String str9, String str10) {
        this.sarlogDlDob = str;
        this.sarlogMobileNo = str2;
        this.sarlogCtzId = num;
        this.sarlogEKYC = str3;
        this.sarlogAadhar4 = num2;
        this.sarlogApplDate = str4;
        this.sarlogPurCd = num3;
        this.sarlogOrgDonor = bool;
        this.sarlogGender = str5;
        this.sarlogRtoCd = str6;
        this.sarlogApplNo = num4;
        this.sarlogStateCd = str7;
        this.sarlogDlNumber = str8;
        this.sarlogESign = str9;
        this.sarlogApplCat = str10;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ SaveLogReq(java.lang.String r17, java.lang.String r18, java.lang.Integer r19, java.lang.String r20, java.lang.Integer r21, java.lang.String r22, java.lang.Integer r23, java.lang.Boolean r24, java.lang.String r25, java.lang.String r26, java.lang.Integer r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, int r32, cm.g r33) {
        /*
            r16 = this;
            r0 = r32
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000b
        L_0x0009:
            r1 = r17
        L_0x000b:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0011
            r3 = r2
            goto L_0x0013
        L_0x0011:
            r3 = r18
        L_0x0013:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0019
            r4 = r2
            goto L_0x001b
        L_0x0019:
            r4 = r19
        L_0x001b:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0021
            r5 = r2
            goto L_0x0023
        L_0x0021:
            r5 = r20
        L_0x0023:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0029
            r6 = r2
            goto L_0x002b
        L_0x0029:
            r6 = r21
        L_0x002b:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0031
            r7 = r2
            goto L_0x0033
        L_0x0031:
            r7 = r22
        L_0x0033:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0039
            r8 = r2
            goto L_0x003b
        L_0x0039:
            r8 = r23
        L_0x003b:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0041
            r9 = r2
            goto L_0x0043
        L_0x0041:
            r9 = r24
        L_0x0043:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0049
            r10 = r2
            goto L_0x004b
        L_0x0049:
            r10 = r25
        L_0x004b:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x0051
            r11 = r2
            goto L_0x0053
        L_0x0051:
            r11 = r26
        L_0x0053:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x0059
            r12 = r2
            goto L_0x005b
        L_0x0059:
            r12 = r27
        L_0x005b:
            r13 = r0 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L_0x0061
            r13 = r2
            goto L_0x0063
        L_0x0061:
            r13 = r28
        L_0x0063:
            r14 = r0 & 4096(0x1000, float:5.74E-42)
            if (r14 == 0) goto L_0x0069
            r14 = r2
            goto L_0x006b
        L_0x0069:
            r14 = r29
        L_0x006b:
            r15 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r15 == 0) goto L_0x0071
            r15 = r2
            goto L_0x0073
        L_0x0071:
            r15 = r30
        L_0x0073:
            r0 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x0078
            goto L_0x007a
        L_0x0078:
            r2 = r31
        L_0x007a:
            r17 = r16
            r18 = r1
            r19 = r3
            r20 = r4
            r21 = r5
            r22 = r6
            r23 = r7
            r24 = r8
            r25 = r9
            r26 = r10
            r27 = r11
            r28 = r12
            r29 = r13
            r30 = r14
            r31 = r15
            r32 = r2
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.dlservices.data.model.savelog.SaveLogReq.<init>(java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, cm.g):void");
    }
}
