package com.nic.mparivahan.dlservices.data.model.duplicatedl;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;

@Keep
public final class LMV {
    @c("covIssueAuthCode")
    private final String covIssueAuthCode;
    @c("covabbrv")
    private final String covabbrv;
    @c("covdesc")
    private final String covdesc;
    @c("dcCovStatus")
    private final String dcCovStatus;
    @c("dcCovcd")
    private final String dcCovcd;
    @c("dcIssRtocode")
    private final String dcIssRtocode;
    @c("dcIssuedt")
    private final String dcIssuedt;
    @c("dcReflicNo")
    private final String dcReflicNo;
    @c("olaName")
    private final String olaName;
    @c("vecatg")
    private final String vecatg;

    public LMV() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 1023, (g) null);
    }

    public static /* synthetic */ LMV copy$default(LMV lmv, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i10, Object obj) {
        LMV lmv2 = lmv;
        int i11 = i10;
        return lmv.copy((i11 & 1) != 0 ? lmv2.covabbrv : str, (i11 & 2) != 0 ? lmv2.olaName : str2, (i11 & 4) != 0 ? lmv2.dcIssuedt : str3, (i11 & 8) != 0 ? lmv2.dcCovStatus : str4, (i11 & 16) != 0 ? lmv2.dcIssRtocode : str5, (i11 & 32) != 0 ? lmv2.vecatg : str6, (i11 & 64) != 0 ? lmv2.covIssueAuthCode : str7, (i11 & 128) != 0 ? lmv2.covdesc : str8, (i11 & 256) != 0 ? lmv2.dcReflicNo : str9, (i11 & 512) != 0 ? lmv2.dcCovcd : str10);
    }

    public final String component1() {
        return this.covabbrv;
    }

    public final String component10() {
        return this.dcCovcd;
    }

    public final String component2() {
        return this.olaName;
    }

    public final String component3() {
        return this.dcIssuedt;
    }

    public final String component4() {
        return this.dcCovStatus;
    }

    public final String component5() {
        return this.dcIssRtocode;
    }

    public final String component6() {
        return this.vecatg;
    }

    public final String component7() {
        return this.covIssueAuthCode;
    }

    public final String component8() {
        return this.covdesc;
    }

    public final String component9() {
        return this.dcReflicNo;
    }

    public final LMV copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        return new LMV(str, str2, str3, str4, str5, str6, str7, str8, str9, str10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LMV)) {
            return false;
        }
        LMV lmv = (LMV) obj;
        return l.a(this.covabbrv, lmv.covabbrv) && l.a(this.olaName, lmv.olaName) && l.a(this.dcIssuedt, lmv.dcIssuedt) && l.a(this.dcCovStatus, lmv.dcCovStatus) && l.a(this.dcIssRtocode, lmv.dcIssRtocode) && l.a(this.vecatg, lmv.vecatg) && l.a(this.covIssueAuthCode, lmv.covIssueAuthCode) && l.a(this.covdesc, lmv.covdesc) && l.a(this.dcReflicNo, lmv.dcReflicNo) && l.a(this.dcCovcd, lmv.dcCovcd);
    }

    public final String getCovIssueAuthCode() {
        return this.covIssueAuthCode;
    }

    public final String getCovabbrv() {
        return this.covabbrv;
    }

    public final String getCovdesc() {
        return this.covdesc;
    }

    public final String getDcCovStatus() {
        return this.dcCovStatus;
    }

    public final String getDcCovcd() {
        return this.dcCovcd;
    }

    public final String getDcIssRtocode() {
        return this.dcIssRtocode;
    }

    public final String getDcIssuedt() {
        return this.dcIssuedt;
    }

    public final String getDcReflicNo() {
        return this.dcReflicNo;
    }

    public final String getOlaName() {
        return this.olaName;
    }

    public final String getVecatg() {
        return this.vecatg;
    }

    public int hashCode() {
        String str = this.covabbrv;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.olaName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.dcIssuedt;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.dcCovStatus;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.dcIssRtocode;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.vecatg;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.covIssueAuthCode;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.covdesc;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.dcReflicNo;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.dcCovcd;
        if (str10 != null) {
            i10 = str10.hashCode();
        }
        return hashCode9 + i10;
    }

    public String toString() {
        return "LMV(covabbrv=" + this.covabbrv + ", olaName=" + this.olaName + ", dcIssuedt=" + this.dcIssuedt + ", dcCovStatus=" + this.dcCovStatus + ", dcIssRtocode=" + this.dcIssRtocode + ", vecatg=" + this.vecatg + ", covIssueAuthCode=" + this.covIssueAuthCode + ", covdesc=" + this.covdesc + ", dcReflicNo=" + this.dcReflicNo + ", dcCovcd=" + this.dcCovcd + ')';
    }

    public LMV(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        this.covabbrv = str;
        this.olaName = str2;
        this.dcIssuedt = str3;
        this.dcCovStatus = str4;
        this.dcIssRtocode = str5;
        this.vecatg = str6;
        this.covIssueAuthCode = str7;
        this.covdesc = str8;
        this.dcReflicNo = str9;
        this.dcCovcd = str10;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ LMV(java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, int r22, cm.g r23) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.dlservices.data.model.duplicatedl.LMV.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, cm.g):void");
    }
}
