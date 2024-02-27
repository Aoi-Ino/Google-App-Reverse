package com.nic.mparivahan.dlservices.ui.acknow;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;

@Keep
public final class Veclass {
    @c("veBadgeIssue")
    private final Object veBadgeIssue;
    @c("veCatg")
    private final Object veCatg;
    @c("veCheckUsertoken")
    private final Object veCheckUsertoken;
    @c("veCovabbrv")
    private final String veCovabbrv;
    @c("veCovcd")
    private final Integer veCovcd;
    @c("veCovdesc")
    private final String veCovdesc;
    @c("veDisplayOrder")
    private final Object veDisplayOrder;
    @c("veDlIssueable")
    private final Object veDlIssueable;
    @c("veIdpcovgrdCd")
    private final Object veIdpcovgrdCd;
    @c("veLlIssueable")
    private final Object veLlIssueable;
    @c("veMaxAgeDl")
    private final Object veMaxAgeDl;
    @c("veMaxAgeLl")
    private final Object veMaxAgeLl;
    @c("veMinAgeDl")
    private final Object veMinAgeDl;
    @c("veMinAgeLl")
    private final Object veMinAgeLl;
    @c("veNoWheels")
    private final Object veNoWheels;
    @c("veProirity")
    private final Object veProirity;
    @c("veRelaxMaxDl")
    private final Object veRelaxMaxDl;
    @c("veRelaxMaxLl")
    private final Object veRelaxMaxLl;
    @c("veRelaxMinDl")
    private final Object veRelaxMinDl;
    @c("veRelaxMinLl")
    private final Object veRelaxMinLl;
    @c("veShortdesc")
    private final String veShortdesc;
    @c("veTokenId")
    private final Object veTokenId;
    @c("veUserId")
    private final Integer veUserId;

    public Veclass() {
        this((Object) null, (Object) null, (Integer) null, (Object) null, (Object) null, (String) null, (Object) null, (Object) null, (Integer) null, (Object) null, (Object) null, (Object) null, (Object) null, (Object) null, (Object) null, (Object) null, (Object) null, (Object) null, (Object) null, (Object) null, (String) null, (String) null, (Object) null, 8388607, (g) null);
    }

    public static /* synthetic */ Veclass copy$default(Veclass veclass, Object obj, Object obj2, Integer num, Object obj3, Object obj4, String str, Object obj5, Object obj6, Integer num2, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, String str2, String str3, Object obj18, int i10, Object obj19) {
        Veclass veclass2 = veclass;
        int i11 = i10;
        return veclass.copy((i11 & 1) != 0 ? veclass2.veMinAgeLl : obj, (i11 & 2) != 0 ? veclass2.veBadgeIssue : obj2, (i11 & 4) != 0 ? veclass2.veCovcd : num, (i11 & 8) != 0 ? veclass2.veIdpcovgrdCd : obj3, (i11 & 16) != 0 ? veclass2.veProirity : obj4, (i11 & 32) != 0 ? veclass2.veShortdesc : str, (i11 & 64) != 0 ? veclass2.veRelaxMinLl : obj5, (i11 & 128) != 0 ? veclass2.veRelaxMaxDl : obj6, (i11 & 256) != 0 ? veclass2.veUserId : num2, (i11 & 512) != 0 ? veclass2.veDisplayOrder : obj7, (i11 & 1024) != 0 ? veclass2.veMaxAgeDl : obj8, (i11 & 2048) != 0 ? veclass2.veCatg : obj9, (i11 & 4096) != 0 ? veclass2.veRelaxMinDl : obj10, (i11 & 8192) != 0 ? veclass2.veRelaxMaxLl : obj11, (i11 & 16384) != 0 ? veclass2.veDlIssueable : obj12, (i11 & 32768) != 0 ? veclass2.veNoWheels : obj13, (i11 & 65536) != 0 ? veclass2.veTokenId : obj14, (i11 & 131072) != 0 ? veclass2.veMaxAgeLl : obj15, (i11 & 262144) != 0 ? veclass2.veLlIssueable : obj16, (i11 & 524288) != 0 ? veclass2.veCheckUsertoken : obj17, (i11 & 1048576) != 0 ? veclass2.veCovdesc : str2, (i11 & 2097152) != 0 ? veclass2.veCovabbrv : str3, (i11 & 4194304) != 0 ? veclass2.veMinAgeDl : obj18);
    }

    public final Object component1() {
        return this.veMinAgeLl;
    }

    public final Object component10() {
        return this.veDisplayOrder;
    }

    public final Object component11() {
        return this.veMaxAgeDl;
    }

    public final Object component12() {
        return this.veCatg;
    }

    public final Object component13() {
        return this.veRelaxMinDl;
    }

    public final Object component14() {
        return this.veRelaxMaxLl;
    }

    public final Object component15() {
        return this.veDlIssueable;
    }

    public final Object component16() {
        return this.veNoWheels;
    }

    public final Object component17() {
        return this.veTokenId;
    }

    public final Object component18() {
        return this.veMaxAgeLl;
    }

    public final Object component19() {
        return this.veLlIssueable;
    }

    public final Object component2() {
        return this.veBadgeIssue;
    }

    public final Object component20() {
        return this.veCheckUsertoken;
    }

    public final String component21() {
        return this.veCovdesc;
    }

    public final String component22() {
        return this.veCovabbrv;
    }

    public final Object component23() {
        return this.veMinAgeDl;
    }

    public final Integer component3() {
        return this.veCovcd;
    }

    public final Object component4() {
        return this.veIdpcovgrdCd;
    }

    public final Object component5() {
        return this.veProirity;
    }

    public final String component6() {
        return this.veShortdesc;
    }

    public final Object component7() {
        return this.veRelaxMinLl;
    }

    public final Object component8() {
        return this.veRelaxMaxDl;
    }

    public final Integer component9() {
        return this.veUserId;
    }

    public final Veclass copy(Object obj, Object obj2, Integer num, Object obj3, Object obj4, String str, Object obj5, Object obj6, Integer num2, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, String str2, String str3, Object obj18) {
        return new Veclass(obj, obj2, num, obj3, obj4, str, obj5, obj6, num2, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, str2, str3, obj18);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Veclass)) {
            return false;
        }
        Veclass veclass = (Veclass) obj;
        return l.a(this.veMinAgeLl, veclass.veMinAgeLl) && l.a(this.veBadgeIssue, veclass.veBadgeIssue) && l.a(this.veCovcd, veclass.veCovcd) && l.a(this.veIdpcovgrdCd, veclass.veIdpcovgrdCd) && l.a(this.veProirity, veclass.veProirity) && l.a(this.veShortdesc, veclass.veShortdesc) && l.a(this.veRelaxMinLl, veclass.veRelaxMinLl) && l.a(this.veRelaxMaxDl, veclass.veRelaxMaxDl) && l.a(this.veUserId, veclass.veUserId) && l.a(this.veDisplayOrder, veclass.veDisplayOrder) && l.a(this.veMaxAgeDl, veclass.veMaxAgeDl) && l.a(this.veCatg, veclass.veCatg) && l.a(this.veRelaxMinDl, veclass.veRelaxMinDl) && l.a(this.veRelaxMaxLl, veclass.veRelaxMaxLl) && l.a(this.veDlIssueable, veclass.veDlIssueable) && l.a(this.veNoWheels, veclass.veNoWheels) && l.a(this.veTokenId, veclass.veTokenId) && l.a(this.veMaxAgeLl, veclass.veMaxAgeLl) && l.a(this.veLlIssueable, veclass.veLlIssueable) && l.a(this.veCheckUsertoken, veclass.veCheckUsertoken) && l.a(this.veCovdesc, veclass.veCovdesc) && l.a(this.veCovabbrv, veclass.veCovabbrv) && l.a(this.veMinAgeDl, veclass.veMinAgeDl);
    }

    public final Object getVeBadgeIssue() {
        return this.veBadgeIssue;
    }

    public final Object getVeCatg() {
        return this.veCatg;
    }

    public final Object getVeCheckUsertoken() {
        return this.veCheckUsertoken;
    }

    public final String getVeCovabbrv() {
        return this.veCovabbrv;
    }

    public final Integer getVeCovcd() {
        return this.veCovcd;
    }

    public final String getVeCovdesc() {
        return this.veCovdesc;
    }

    public final Object getVeDisplayOrder() {
        return this.veDisplayOrder;
    }

    public final Object getVeDlIssueable() {
        return this.veDlIssueable;
    }

    public final Object getVeIdpcovgrdCd() {
        return this.veIdpcovgrdCd;
    }

    public final Object getVeLlIssueable() {
        return this.veLlIssueable;
    }

    public final Object getVeMaxAgeDl() {
        return this.veMaxAgeDl;
    }

    public final Object getVeMaxAgeLl() {
        return this.veMaxAgeLl;
    }

    public final Object getVeMinAgeDl() {
        return this.veMinAgeDl;
    }

    public final Object getVeMinAgeLl() {
        return this.veMinAgeLl;
    }

    public final Object getVeNoWheels() {
        return this.veNoWheels;
    }

    public final Object getVeProirity() {
        return this.veProirity;
    }

    public final Object getVeRelaxMaxDl() {
        return this.veRelaxMaxDl;
    }

    public final Object getVeRelaxMaxLl() {
        return this.veRelaxMaxLl;
    }

    public final Object getVeRelaxMinDl() {
        return this.veRelaxMinDl;
    }

    public final Object getVeRelaxMinLl() {
        return this.veRelaxMinLl;
    }

    public final String getVeShortdesc() {
        return this.veShortdesc;
    }

    public final Object getVeTokenId() {
        return this.veTokenId;
    }

    public final Integer getVeUserId() {
        return this.veUserId;
    }

    public int hashCode() {
        Object obj = this.veMinAgeLl;
        int i10 = 0;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.veBadgeIssue;
        int hashCode2 = (hashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Integer num = this.veCovcd;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Object obj3 = this.veIdpcovgrdCd;
        int hashCode4 = (hashCode3 + (obj3 == null ? 0 : obj3.hashCode())) * 31;
        Object obj4 = this.veProirity;
        int hashCode5 = (hashCode4 + (obj4 == null ? 0 : obj4.hashCode())) * 31;
        String str = this.veShortdesc;
        int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        Object obj5 = this.veRelaxMinLl;
        int hashCode7 = (hashCode6 + (obj5 == null ? 0 : obj5.hashCode())) * 31;
        Object obj6 = this.veRelaxMaxDl;
        int hashCode8 = (hashCode7 + (obj6 == null ? 0 : obj6.hashCode())) * 31;
        Integer num2 = this.veUserId;
        int hashCode9 = (hashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Object obj7 = this.veDisplayOrder;
        int hashCode10 = (hashCode9 + (obj7 == null ? 0 : obj7.hashCode())) * 31;
        Object obj8 = this.veMaxAgeDl;
        int hashCode11 = (hashCode10 + (obj8 == null ? 0 : obj8.hashCode())) * 31;
        Object obj9 = this.veCatg;
        int hashCode12 = (hashCode11 + (obj9 == null ? 0 : obj9.hashCode())) * 31;
        Object obj10 = this.veRelaxMinDl;
        int hashCode13 = (hashCode12 + (obj10 == null ? 0 : obj10.hashCode())) * 31;
        Object obj11 = this.veRelaxMaxLl;
        int hashCode14 = (hashCode13 + (obj11 == null ? 0 : obj11.hashCode())) * 31;
        Object obj12 = this.veDlIssueable;
        int hashCode15 = (hashCode14 + (obj12 == null ? 0 : obj12.hashCode())) * 31;
        Object obj13 = this.veNoWheels;
        int hashCode16 = (hashCode15 + (obj13 == null ? 0 : obj13.hashCode())) * 31;
        Object obj14 = this.veTokenId;
        int hashCode17 = (hashCode16 + (obj14 == null ? 0 : obj14.hashCode())) * 31;
        Object obj15 = this.veMaxAgeLl;
        int hashCode18 = (hashCode17 + (obj15 == null ? 0 : obj15.hashCode())) * 31;
        Object obj16 = this.veLlIssueable;
        int hashCode19 = (hashCode18 + (obj16 == null ? 0 : obj16.hashCode())) * 31;
        Object obj17 = this.veCheckUsertoken;
        int hashCode20 = (hashCode19 + (obj17 == null ? 0 : obj17.hashCode())) * 31;
        String str2 = this.veCovdesc;
        int hashCode21 = (hashCode20 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.veCovabbrv;
        int hashCode22 = (hashCode21 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Object obj18 = this.veMinAgeDl;
        if (obj18 != null) {
            i10 = obj18.hashCode();
        }
        return hashCode22 + i10;
    }

    public String toString() {
        return "Veclass(veMinAgeLl=" + this.veMinAgeLl + ", veBadgeIssue=" + this.veBadgeIssue + ", veCovcd=" + this.veCovcd + ", veIdpcovgrdCd=" + this.veIdpcovgrdCd + ", veProirity=" + this.veProirity + ", veShortdesc=" + this.veShortdesc + ", veRelaxMinLl=" + this.veRelaxMinLl + ", veRelaxMaxDl=" + this.veRelaxMaxDl + ", veUserId=" + this.veUserId + ", veDisplayOrder=" + this.veDisplayOrder + ", veMaxAgeDl=" + this.veMaxAgeDl + ", veCatg=" + this.veCatg + ", veRelaxMinDl=" + this.veRelaxMinDl + ", veRelaxMaxLl=" + this.veRelaxMaxLl + ", veDlIssueable=" + this.veDlIssueable + ", veNoWheels=" + this.veNoWheels + ", veTokenId=" + this.veTokenId + ", veMaxAgeLl=" + this.veMaxAgeLl + ", veLlIssueable=" + this.veLlIssueable + ", veCheckUsertoken=" + this.veCheckUsertoken + ", veCovdesc=" + this.veCovdesc + ", veCovabbrv=" + this.veCovabbrv + ", veMinAgeDl=" + this.veMinAgeDl + ')';
    }

    public Veclass(Object obj, Object obj2, Integer num, Object obj3, Object obj4, String str, Object obj5, Object obj6, Integer num2, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, String str2, String str3, Object obj18) {
        this.veMinAgeLl = obj;
        this.veBadgeIssue = obj2;
        this.veCovcd = num;
        this.veIdpcovgrdCd = obj3;
        this.veProirity = obj4;
        this.veShortdesc = str;
        this.veRelaxMinLl = obj5;
        this.veRelaxMaxDl = obj6;
        this.veUserId = num2;
        this.veDisplayOrder = obj7;
        this.veMaxAgeDl = obj8;
        this.veCatg = obj9;
        this.veRelaxMinDl = obj10;
        this.veRelaxMaxLl = obj11;
        this.veDlIssueable = obj12;
        this.veNoWheels = obj13;
        this.veTokenId = obj14;
        this.veMaxAgeLl = obj15;
        this.veLlIssueable = obj16;
        this.veCheckUsertoken = obj17;
        this.veCovdesc = str2;
        this.veCovabbrv = str3;
        this.veMinAgeDl = obj18;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ Veclass(java.lang.Object r25, java.lang.Object r26, java.lang.Integer r27, java.lang.Object r28, java.lang.Object r29, java.lang.String r30, java.lang.Object r31, java.lang.Object r32, java.lang.Integer r33, java.lang.Object r34, java.lang.Object r35, java.lang.Object r36, java.lang.Object r37, java.lang.Object r38, java.lang.Object r39, java.lang.Object r40, java.lang.Object r41, java.lang.Object r42, java.lang.Object r43, java.lang.Object r44, java.lang.String r45, java.lang.String r46, java.lang.Object r47, int r48, cm.g r49) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.dlservices.ui.acknow.Veclass.<init>(java.lang.Object, java.lang.Object, java.lang.Integer, java.lang.Object, java.lang.Object, java.lang.String, java.lang.Object, java.lang.Object, java.lang.Integer, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.String, java.lang.String, java.lang.Object, int, cm.g):void");
    }
}
