package com.nic.mparivahan.Sarathithreeservices.model;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;
import java.io.Serializable;

@Keep
public final class TransReqItem implements Serializable {
    @c("reasonMast")
    private final ReasonMast reasonMast;
    @c("trApplno")
    private final Object trApplno;
    @c("trCheckUsertoken")
    private final Object trCheckUsertoken;
    @c("trDigest")
    private final String trDigest;
    @c("trEntrydt")
    private final String trEntrydt;
    @c("trLlNo")
    private final Object trLlNo;
    @c("trRefLicno")
    private final String trRefLicno;
    @c("trRefLictype")
    private final String trRefLictype;
    @c("trRefLicvalidDt")
    private final String trRefLicvalidDt;
    @c("trServiceWitdraw")
    private final Object trServiceWitdraw;
    @c("trSlNo")
    private final Integer trSlNo;
    @c("trStatus")
    private final Object trStatus;
    @c("trTokenId")
    private final Integer trTokenId;
    @c("trTrCd")
    private final Integer trTrCd;
    @c("trUserId")
    private final Integer trUserId;
    @c("trVehRegNo")
    private final Object trVehRegNo;
    @c("trVisitNo")
    private final Integer trVisitNo;
    @c("trans")
    private final Trans trans;
    @c("veclass")
    private final Veclass veclass;

    public TransReqItem() {
        this((String) null, (Object) null, (Object) null, (Integer) null, (String) null, (Integer) null, (String) null, (Object) null, (Object) null, (String) null, (ReasonMast) null, (String) null, (Veclass) null, (Object) null, (Integer) null, (Object) null, (Integer) null, (Integer) null, (Trans) null, 524287, (g) null);
    }

    public static /* synthetic */ TransReqItem copy$default(TransReqItem transReqItem, String str, Object obj, Object obj2, Integer num, String str2, Integer num2, String str3, Object obj3, Object obj4, String str4, ReasonMast reasonMast2, String str5, Veclass veclass2, Object obj5, Integer num3, Object obj6, Integer num4, Integer num5, Trans trans2, int i10, Object obj7) {
        TransReqItem transReqItem2 = transReqItem;
        int i11 = i10;
        return transReqItem.copy((i11 & 1) != 0 ? transReqItem2.trRefLicvalidDt : str, (i11 & 2) != 0 ? transReqItem2.trLlNo : obj, (i11 & 4) != 0 ? transReqItem2.trCheckUsertoken : obj2, (i11 & 8) != 0 ? transReqItem2.trSlNo : num, (i11 & 16) != 0 ? transReqItem2.trEntrydt : str2, (i11 & 32) != 0 ? transReqItem2.trTokenId : num2, (i11 & 64) != 0 ? transReqItem2.trRefLictype : str3, (i11 & 128) != 0 ? transReqItem2.trStatus : obj3, (i11 & 256) != 0 ? transReqItem2.trApplno : obj4, (i11 & 512) != 0 ? transReqItem2.trDigest : str4, (i11 & 1024) != 0 ? transReqItem2.reasonMast : reasonMast2, (i11 & 2048) != 0 ? transReqItem2.trRefLicno : str5, (i11 & 4096) != 0 ? transReqItem2.veclass : veclass2, (i11 & 8192) != 0 ? transReqItem2.trServiceWitdraw : obj5, (i11 & 16384) != 0 ? transReqItem2.trUserId : num3, (i11 & 32768) != 0 ? transReqItem2.trVehRegNo : obj6, (i11 & 65536) != 0 ? transReqItem2.trTrCd : num4, (i11 & 131072) != 0 ? transReqItem2.trVisitNo : num5, (i11 & 262144) != 0 ? transReqItem2.trans : trans2);
    }

    public final String component1() {
        return this.trRefLicvalidDt;
    }

    public final String component10() {
        return this.trDigest;
    }

    public final ReasonMast component11() {
        return this.reasonMast;
    }

    public final String component12() {
        return this.trRefLicno;
    }

    public final Veclass component13() {
        return this.veclass;
    }

    public final Object component14() {
        return this.trServiceWitdraw;
    }

    public final Integer component15() {
        return this.trUserId;
    }

    public final Object component16() {
        return this.trVehRegNo;
    }

    public final Integer component17() {
        return this.trTrCd;
    }

    public final Integer component18() {
        return this.trVisitNo;
    }

    public final Trans component19() {
        return this.trans;
    }

    public final Object component2() {
        return this.trLlNo;
    }

    public final Object component3() {
        return this.trCheckUsertoken;
    }

    public final Integer component4() {
        return this.trSlNo;
    }

    public final String component5() {
        return this.trEntrydt;
    }

    public final Integer component6() {
        return this.trTokenId;
    }

    public final String component7() {
        return this.trRefLictype;
    }

    public final Object component8() {
        return this.trStatus;
    }

    public final Object component9() {
        return this.trApplno;
    }

    public final TransReqItem copy(String str, Object obj, Object obj2, Integer num, String str2, Integer num2, String str3, Object obj3, Object obj4, String str4, ReasonMast reasonMast2, String str5, Veclass veclass2, Object obj5, Integer num3, Object obj6, Integer num4, Integer num5, Trans trans2) {
        return new TransReqItem(str, obj, obj2, num, str2, num2, str3, obj3, obj4, str4, reasonMast2, str5, veclass2, obj5, num3, obj6, num4, num5, trans2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransReqItem)) {
            return false;
        }
        TransReqItem transReqItem = (TransReqItem) obj;
        return l.a(this.trRefLicvalidDt, transReqItem.trRefLicvalidDt) && l.a(this.trLlNo, transReqItem.trLlNo) && l.a(this.trCheckUsertoken, transReqItem.trCheckUsertoken) && l.a(this.trSlNo, transReqItem.trSlNo) && l.a(this.trEntrydt, transReqItem.trEntrydt) && l.a(this.trTokenId, transReqItem.trTokenId) && l.a(this.trRefLictype, transReqItem.trRefLictype) && l.a(this.trStatus, transReqItem.trStatus) && l.a(this.trApplno, transReqItem.trApplno) && l.a(this.trDigest, transReqItem.trDigest) && l.a(this.reasonMast, transReqItem.reasonMast) && l.a(this.trRefLicno, transReqItem.trRefLicno) && l.a(this.veclass, transReqItem.veclass) && l.a(this.trServiceWitdraw, transReqItem.trServiceWitdraw) && l.a(this.trUserId, transReqItem.trUserId) && l.a(this.trVehRegNo, transReqItem.trVehRegNo) && l.a(this.trTrCd, transReqItem.trTrCd) && l.a(this.trVisitNo, transReqItem.trVisitNo) && l.a(this.trans, transReqItem.trans);
    }

    public final ReasonMast getReasonMast() {
        return this.reasonMast;
    }

    public final Object getTrApplno() {
        return this.trApplno;
    }

    public final Object getTrCheckUsertoken() {
        return this.trCheckUsertoken;
    }

    public final String getTrDigest() {
        return this.trDigest;
    }

    public final String getTrEntrydt() {
        return this.trEntrydt;
    }

    public final Object getTrLlNo() {
        return this.trLlNo;
    }

    public final String getTrRefLicno() {
        return this.trRefLicno;
    }

    public final String getTrRefLictype() {
        return this.trRefLictype;
    }

    public final String getTrRefLicvalidDt() {
        return this.trRefLicvalidDt;
    }

    public final Object getTrServiceWitdraw() {
        return this.trServiceWitdraw;
    }

    public final Integer getTrSlNo() {
        return this.trSlNo;
    }

    public final Object getTrStatus() {
        return this.trStatus;
    }

    public final Integer getTrTokenId() {
        return this.trTokenId;
    }

    public final Integer getTrTrCd() {
        return this.trTrCd;
    }

    public final Integer getTrUserId() {
        return this.trUserId;
    }

    public final Object getTrVehRegNo() {
        return this.trVehRegNo;
    }

    public final Integer getTrVisitNo() {
        return this.trVisitNo;
    }

    public final Trans getTrans() {
        return this.trans;
    }

    public final Veclass getVeclass() {
        return this.veclass;
    }

    public int hashCode() {
        String str = this.trRefLicvalidDt;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Object obj = this.trLlNo;
        int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.trCheckUsertoken;
        int hashCode3 = (hashCode2 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Integer num = this.trSlNo;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.trEntrydt;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.trTokenId;
        int hashCode6 = (hashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.trRefLictype;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Object obj3 = this.trStatus;
        int hashCode8 = (hashCode7 + (obj3 == null ? 0 : obj3.hashCode())) * 31;
        Object obj4 = this.trApplno;
        int hashCode9 = (hashCode8 + (obj4 == null ? 0 : obj4.hashCode())) * 31;
        String str4 = this.trDigest;
        int hashCode10 = (hashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
        ReasonMast reasonMast2 = this.reasonMast;
        int hashCode11 = (hashCode10 + (reasonMast2 == null ? 0 : reasonMast2.hashCode())) * 31;
        String str5 = this.trRefLicno;
        int hashCode12 = (hashCode11 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Veclass veclass2 = this.veclass;
        int hashCode13 = (hashCode12 + (veclass2 == null ? 0 : veclass2.hashCode())) * 31;
        Object obj5 = this.trServiceWitdraw;
        int hashCode14 = (hashCode13 + (obj5 == null ? 0 : obj5.hashCode())) * 31;
        Integer num3 = this.trUserId;
        int hashCode15 = (hashCode14 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Object obj6 = this.trVehRegNo;
        int hashCode16 = (hashCode15 + (obj6 == null ? 0 : obj6.hashCode())) * 31;
        Integer num4 = this.trTrCd;
        int hashCode17 = (hashCode16 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.trVisitNo;
        int hashCode18 = (hashCode17 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Trans trans2 = this.trans;
        if (trans2 != null) {
            i10 = trans2.hashCode();
        }
        return hashCode18 + i10;
    }

    public String toString() {
        return "TransReqItem(trRefLicvalidDt=" + this.trRefLicvalidDt + ", trLlNo=" + this.trLlNo + ", trCheckUsertoken=" + this.trCheckUsertoken + ", trSlNo=" + this.trSlNo + ", trEntrydt=" + this.trEntrydt + ", trTokenId=" + this.trTokenId + ", trRefLictype=" + this.trRefLictype + ", trStatus=" + this.trStatus + ", trApplno=" + this.trApplno + ", trDigest=" + this.trDigest + ", reasonMast=" + this.reasonMast + ", trRefLicno=" + this.trRefLicno + ", veclass=" + this.veclass + ", trServiceWitdraw=" + this.trServiceWitdraw + ", trUserId=" + this.trUserId + ", trVehRegNo=" + this.trVehRegNo + ", trTrCd=" + this.trTrCd + ", trVisitNo=" + this.trVisitNo + ", trans=" + this.trans + ')';
    }

    public TransReqItem(String str, Object obj, Object obj2, Integer num, String str2, Integer num2, String str3, Object obj3, Object obj4, String str4, ReasonMast reasonMast2, String str5, Veclass veclass2, Object obj5, Integer num3, Object obj6, Integer num4, Integer num5, Trans trans2) {
        this.trRefLicvalidDt = str;
        this.trLlNo = obj;
        this.trCheckUsertoken = obj2;
        this.trSlNo = num;
        this.trEntrydt = str2;
        this.trTokenId = num2;
        this.trRefLictype = str3;
        this.trStatus = obj3;
        this.trApplno = obj4;
        this.trDigest = str4;
        this.reasonMast = reasonMast2;
        this.trRefLicno = str5;
        this.veclass = veclass2;
        this.trServiceWitdraw = obj5;
        this.trUserId = num3;
        this.trVehRegNo = obj6;
        this.trTrCd = num4;
        this.trVisitNo = num5;
        this.trans = trans2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ TransReqItem(java.lang.String r21, java.lang.Object r22, java.lang.Object r23, java.lang.Integer r24, java.lang.String r25, java.lang.Integer r26, java.lang.String r27, java.lang.Object r28, java.lang.Object r29, java.lang.String r30, com.nic.mparivahan.Sarathithreeservices.model.ReasonMast r31, java.lang.String r32, com.nic.mparivahan.Sarathithreeservices.model.Veclass r33, java.lang.Object r34, java.lang.Integer r35, java.lang.Object r36, java.lang.Integer r37, java.lang.Integer r38, com.nic.mparivahan.Sarathithreeservices.model.Trans r39, int r40, cm.g r41) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.Sarathithreeservices.model.TransReqItem.<init>(java.lang.String, java.lang.Object, java.lang.Object, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.String, java.lang.Object, java.lang.Object, java.lang.String, com.nic.mparivahan.Sarathithreeservices.model.ReasonMast, java.lang.String, com.nic.mparivahan.Sarathithreeservices.model.Veclass, java.lang.Object, java.lang.Integer, java.lang.Object, java.lang.Integer, java.lang.Integer, com.nic.mparivahan.Sarathithreeservices.model.Trans, int, cm.g):void");
    }
}
