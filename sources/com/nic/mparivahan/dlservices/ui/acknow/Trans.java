package com.nic.mparivahan.dlservices.ui.acknow;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;

@Keep
public final class Trans {
    @c("feeCovwise")
    private final String feeCovwise;
    @c("servicable")
    private final String servicable;
    @c("trAbbrv")
    private final String trAbbrv;
    @c("trActionType")
    private final String trActionType;
    @c("trCd")
    private final Integer trCd;
    @c("trCdNr")
    private final Integer trCdNr;
    @c("trCovapplicable")
    private final String trCovapplicable;
    @c("trEndcd")
    private final String trEndcd;
    @c("trEndtype")
    private final String trEndtype;
    @c("trFlowApplicable")
    private final String trFlowApplicable;
    @c("trHoa")
    private final String trHoa;
    @c("trLicType")
    private final String trLicType;
    @c("trName")
    private final String trName;
    @c("trPrntSeperate")
    private final String trPrntSeperate;
    @c("trScope")
    private final String trScope;
    @c("trTokenId")
    private final Object trTokenId;
    @c("trUserId")
    private final Integer trUserId;

    public Trans() {
        this((String) null, (String) null, (Object) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (Integer) null, (String) null, 131071, (g) null);
    }

    public static /* synthetic */ Trans copy$default(Trans trans, String str, String str2, Object obj, Integer num, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, Integer num2, Integer num3, String str13, int i10, Object obj2) {
        Trans trans2 = trans;
        int i11 = i10;
        return trans.copy((i11 & 1) != 0 ? trans2.trEndcd : str, (i11 & 2) != 0 ? trans2.trActionType : str2, (i11 & 4) != 0 ? trans2.trTokenId : obj, (i11 & 8) != 0 ? trans2.trCd : num, (i11 & 16) != 0 ? trans2.trCovapplicable : str3, (i11 & 32) != 0 ? trans2.trLicType : str4, (i11 & 64) != 0 ? trans2.trHoa : str5, (i11 & 128) != 0 ? trans2.trScope : str6, (i11 & 256) != 0 ? trans2.trPrntSeperate : str7, (i11 & 512) != 0 ? trans2.feeCovwise : str8, (i11 & 1024) != 0 ? trans2.trName : str9, (i11 & 2048) != 0 ? trans2.trEndtype : str10, (i11 & 4096) != 0 ? trans2.trAbbrv : str11, (i11 & 8192) != 0 ? trans2.servicable : str12, (i11 & 16384) != 0 ? trans2.trUserId : num2, (i11 & 32768) != 0 ? trans2.trCdNr : num3, (i11 & 65536) != 0 ? trans2.trFlowApplicable : str13);
    }

    public final String component1() {
        return this.trEndcd;
    }

    public final String component10() {
        return this.feeCovwise;
    }

    public final String component11() {
        return this.trName;
    }

    public final String component12() {
        return this.trEndtype;
    }

    public final String component13() {
        return this.trAbbrv;
    }

    public final String component14() {
        return this.servicable;
    }

    public final Integer component15() {
        return this.trUserId;
    }

    public final Integer component16() {
        return this.trCdNr;
    }

    public final String component17() {
        return this.trFlowApplicable;
    }

    public final String component2() {
        return this.trActionType;
    }

    public final Object component3() {
        return this.trTokenId;
    }

    public final Integer component4() {
        return this.trCd;
    }

    public final String component5() {
        return this.trCovapplicable;
    }

    public final String component6() {
        return this.trLicType;
    }

    public final String component7() {
        return this.trHoa;
    }

    public final String component8() {
        return this.trScope;
    }

    public final String component9() {
        return this.trPrntSeperate;
    }

    public final Trans copy(String str, String str2, Object obj, Integer num, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, Integer num2, Integer num3, String str13) {
        return new Trans(str, str2, obj, num, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, num2, num3, str13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Trans)) {
            return false;
        }
        Trans trans = (Trans) obj;
        return l.a(this.trEndcd, trans.trEndcd) && l.a(this.trActionType, trans.trActionType) && l.a(this.trTokenId, trans.trTokenId) && l.a(this.trCd, trans.trCd) && l.a(this.trCovapplicable, trans.trCovapplicable) && l.a(this.trLicType, trans.trLicType) && l.a(this.trHoa, trans.trHoa) && l.a(this.trScope, trans.trScope) && l.a(this.trPrntSeperate, trans.trPrntSeperate) && l.a(this.feeCovwise, trans.feeCovwise) && l.a(this.trName, trans.trName) && l.a(this.trEndtype, trans.trEndtype) && l.a(this.trAbbrv, trans.trAbbrv) && l.a(this.servicable, trans.servicable) && l.a(this.trUserId, trans.trUserId) && l.a(this.trCdNr, trans.trCdNr) && l.a(this.trFlowApplicable, trans.trFlowApplicable);
    }

    public final String getFeeCovwise() {
        return this.feeCovwise;
    }

    public final String getServicable() {
        return this.servicable;
    }

    public final String getTrAbbrv() {
        return this.trAbbrv;
    }

    public final String getTrActionType() {
        return this.trActionType;
    }

    public final Integer getTrCd() {
        return this.trCd;
    }

    public final Integer getTrCdNr() {
        return this.trCdNr;
    }

    public final String getTrCovapplicable() {
        return this.trCovapplicable;
    }

    public final String getTrEndcd() {
        return this.trEndcd;
    }

    public final String getTrEndtype() {
        return this.trEndtype;
    }

    public final String getTrFlowApplicable() {
        return this.trFlowApplicable;
    }

    public final String getTrHoa() {
        return this.trHoa;
    }

    public final String getTrLicType() {
        return this.trLicType;
    }

    public final String getTrName() {
        return this.trName;
    }

    public final String getTrPrntSeperate() {
        return this.trPrntSeperate;
    }

    public final String getTrScope() {
        return this.trScope;
    }

    public final Object getTrTokenId() {
        return this.trTokenId;
    }

    public final Integer getTrUserId() {
        return this.trUserId;
    }

    public int hashCode() {
        String str = this.trEndcd;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.trActionType;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Object obj = this.trTokenId;
        int hashCode3 = (hashCode2 + (obj == null ? 0 : obj.hashCode())) * 31;
        Integer num = this.trCd;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.trCovapplicable;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.trLicType;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.trHoa;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.trScope;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.trPrntSeperate;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.feeCovwise;
        int hashCode10 = (hashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.trName;
        int hashCode11 = (hashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.trEndtype;
        int hashCode12 = (hashCode11 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.trAbbrv;
        int hashCode13 = (hashCode12 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.servicable;
        int hashCode14 = (hashCode13 + (str12 == null ? 0 : str12.hashCode())) * 31;
        Integer num2 = this.trUserId;
        int hashCode15 = (hashCode14 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.trCdNr;
        int hashCode16 = (hashCode15 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str13 = this.trFlowApplicable;
        if (str13 != null) {
            i10 = str13.hashCode();
        }
        return hashCode16 + i10;
    }

    public String toString() {
        return "Trans(trEndcd=" + this.trEndcd + ", trActionType=" + this.trActionType + ", trTokenId=" + this.trTokenId + ", trCd=" + this.trCd + ", trCovapplicable=" + this.trCovapplicable + ", trLicType=" + this.trLicType + ", trHoa=" + this.trHoa + ", trScope=" + this.trScope + ", trPrntSeperate=" + this.trPrntSeperate + ", feeCovwise=" + this.feeCovwise + ", trName=" + this.trName + ", trEndtype=" + this.trEndtype + ", trAbbrv=" + this.trAbbrv + ", servicable=" + this.servicable + ", trUserId=" + this.trUserId + ", trCdNr=" + this.trCdNr + ", trFlowApplicable=" + this.trFlowApplicable + ')';
    }

    public Trans(String str, String str2, Object obj, Integer num, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, Integer num2, Integer num3, String str13) {
        this.trEndcd = str;
        this.trActionType = str2;
        this.trTokenId = obj;
        this.trCd = num;
        this.trCovapplicable = str3;
        this.trLicType = str4;
        this.trHoa = str5;
        this.trScope = str6;
        this.trPrntSeperate = str7;
        this.feeCovwise = str8;
        this.trName = str9;
        this.trEndtype = str10;
        this.trAbbrv = str11;
        this.servicable = str12;
        this.trUserId = num2;
        this.trCdNr = num3;
        this.trFlowApplicable = str13;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ Trans(java.lang.String r19, java.lang.String r20, java.lang.Object r21, java.lang.Integer r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, java.lang.Integer r33, java.lang.Integer r34, java.lang.String r35, int r36, cm.g r37) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.dlservices.ui.acknow.Trans.<init>(java.lang.String, java.lang.String, java.lang.Object, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, int, cm.g):void");
    }
}
