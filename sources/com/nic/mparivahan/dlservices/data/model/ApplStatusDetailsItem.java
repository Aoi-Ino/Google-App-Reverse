package com.nic.mparivahan.dlservices.data.model;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

@Keep
public final class ApplStatusDetailsItem implements Serializable {
    @c("applFlowStatusList")
    private final List<ApplFlowStatusListItem> applFlowStatusList;
    @c("applName")
    private final String applName;
    @c("applno")
    private final String applno;
    @c("applpendStatus")
    private final String applpendStatus;
    @c("dob")
    private final String dob;
    @c("gender")
    private final String gender;
    @c("isApsubStgsInorder")
    private final String isApsubStgsInorder;
    @c("reqObjlst")
    private final String[][] reqObjlst;
    @c("rtoCd")
    private final String rtoCd;
    @c("rtoName")
    private final String rtoName;
    @c("swdName")
    private final String swdName;

    public ApplStatusDetailsItem() {
        this((String) null, (String[][]) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, 2047, (g) null);
    }

    public static /* synthetic */ ApplStatusDetailsItem copy$default(ApplStatusDetailsItem applStatusDetailsItem, String str, String[][] strArr, String str2, String str3, String str4, String str5, String str6, String str7, List list, String str8, String str9, int i10, Object obj) {
        ApplStatusDetailsItem applStatusDetailsItem2 = applStatusDetailsItem;
        int i11 = i10;
        return applStatusDetailsItem.copy((i11 & 1) != 0 ? applStatusDetailsItem2.rtoName : str, (i11 & 2) != 0 ? applStatusDetailsItem2.reqObjlst : strArr, (i11 & 4) != 0 ? applStatusDetailsItem2.rtoCd : str2, (i11 & 8) != 0 ? applStatusDetailsItem2.gender : str3, (i11 & 16) != 0 ? applStatusDetailsItem2.dob : str4, (i11 & 32) != 0 ? applStatusDetailsItem2.applName : str5, (i11 & 64) != 0 ? applStatusDetailsItem2.applno : str6, (i11 & 128) != 0 ? applStatusDetailsItem2.swdName : str7, (i11 & 256) != 0 ? applStatusDetailsItem2.applFlowStatusList : list, (i11 & 512) != 0 ? applStatusDetailsItem2.applpendStatus : str8, (i11 & 1024) != 0 ? applStatusDetailsItem2.isApsubStgsInorder : str9);
    }

    public final String component1() {
        return this.rtoName;
    }

    public final String component10() {
        return this.applpendStatus;
    }

    public final String component11() {
        return this.isApsubStgsInorder;
    }

    public final String[][] component2() {
        return this.reqObjlst;
    }

    public final String component3() {
        return this.rtoCd;
    }

    public final String component4() {
        return this.gender;
    }

    public final String component5() {
        return this.dob;
    }

    public final String component6() {
        return this.applName;
    }

    public final String component7() {
        return this.applno;
    }

    public final String component8() {
        return this.swdName;
    }

    public final List<ApplFlowStatusListItem> component9() {
        return this.applFlowStatusList;
    }

    public final ApplStatusDetailsItem copy(String str, String[][] strArr, String str2, String str3, String str4, String str5, String str6, String str7, List<ApplFlowStatusListItem> list, String str8, String str9) {
        l.f(strArr, "reqObjlst");
        return new ApplStatusDetailsItem(str, strArr, str2, str3, str4, str5, str6, str7, list, str8, str9);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApplStatusDetailsItem)) {
            return false;
        }
        ApplStatusDetailsItem applStatusDetailsItem = (ApplStatusDetailsItem) obj;
        return l.a(this.rtoName, applStatusDetailsItem.rtoName) && l.a(this.reqObjlst, applStatusDetailsItem.reqObjlst) && l.a(this.rtoCd, applStatusDetailsItem.rtoCd) && l.a(this.gender, applStatusDetailsItem.gender) && l.a(this.dob, applStatusDetailsItem.dob) && l.a(this.applName, applStatusDetailsItem.applName) && l.a(this.applno, applStatusDetailsItem.applno) && l.a(this.swdName, applStatusDetailsItem.swdName) && l.a(this.applFlowStatusList, applStatusDetailsItem.applFlowStatusList) && l.a(this.applpendStatus, applStatusDetailsItem.applpendStatus) && l.a(this.isApsubStgsInorder, applStatusDetailsItem.isApsubStgsInorder);
    }

    public final List<ApplFlowStatusListItem> getApplFlowStatusList() {
        return this.applFlowStatusList;
    }

    public final String getApplName() {
        return this.applName;
    }

    public final String getApplno() {
        return this.applno;
    }

    public final String getApplpendStatus() {
        return this.applpendStatus;
    }

    public final String getDob() {
        return this.dob;
    }

    public final String getGender() {
        return this.gender;
    }

    public final String[][] getReqObjlst() {
        return this.reqObjlst;
    }

    public final String getRtoCd() {
        return this.rtoCd;
    }

    public final String getRtoName() {
        return this.rtoName;
    }

    public final String getSwdName() {
        return this.swdName;
    }

    public int hashCode() {
        String str = this.rtoName;
        int i10 = 0;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.reqObjlst)) * 31;
        String str2 = this.rtoCd;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.gender;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.dob;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.applName;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.applno;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.swdName;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        List<ApplFlowStatusListItem> list = this.applFlowStatusList;
        int hashCode8 = (hashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        String str8 = this.applpendStatus;
        int hashCode9 = (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.isApsubStgsInorder;
        if (str9 != null) {
            i10 = str9.hashCode();
        }
        return hashCode9 + i10;
    }

    public final String isApsubStgsInorder() {
        return this.isApsubStgsInorder;
    }

    public String toString() {
        return "ApplStatusDetailsItem(rtoName=" + this.rtoName + ", reqObjlst=" + Arrays.toString(this.reqObjlst) + ", rtoCd=" + this.rtoCd + ", gender=" + this.gender + ", dob=" + this.dob + ", applName=" + this.applName + ", applno=" + this.applno + ", swdName=" + this.swdName + ", applFlowStatusList=" + this.applFlowStatusList + ", applpendStatus=" + this.applpendStatus + ", isApsubStgsInorder=" + this.isApsubStgsInorder + ')';
    }

    public ApplStatusDetailsItem(String str, String[][] strArr, String str2, String str3, String str4, String str5, String str6, String str7, List<ApplFlowStatusListItem> list, String str8, String str9) {
        l.f(strArr, "reqObjlst");
        this.rtoName = str;
        this.reqObjlst = strArr;
        this.rtoCd = str2;
        this.gender = str3;
        this.dob = str4;
        this.applName = str5;
        this.applno = str6;
        this.swdName = str7;
        this.applFlowStatusList = list;
        this.applpendStatus = str8;
        this.isApsubStgsInorder = str9;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ApplStatusDetailsItem(java.lang.String r13, java.lang.String[][] r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.util.List r21, java.lang.String r22, java.lang.String r23, int r24, cm.g r25) {
        /*
            r12 = this;
            r0 = r24
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r13
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0012
            r3 = 0
            java.lang.String[][] r3 = new java.lang.String[r3][]
            goto L_0x0013
        L_0x0012:
            r3 = r14
        L_0x0013:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0019
            r4 = r2
            goto L_0x001a
        L_0x0019:
            r4 = r15
        L_0x001a:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0020
            r5 = r2
            goto L_0x0022
        L_0x0020:
            r5 = r16
        L_0x0022:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0028
            r6 = r2
            goto L_0x002a
        L_0x0028:
            r6 = r17
        L_0x002a:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0030
            r7 = r2
            goto L_0x0032
        L_0x0030:
            r7 = r18
        L_0x0032:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0038
            r8 = r2
            goto L_0x003a
        L_0x0038:
            r8 = r19
        L_0x003a:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0040
            r9 = r2
            goto L_0x0042
        L_0x0040:
            r9 = r20
        L_0x0042:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0048
            r10 = r2
            goto L_0x004a
        L_0x0048:
            r10 = r21
        L_0x004a:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x0050
            r11 = r2
            goto L_0x0052
        L_0x0050:
            r11 = r22
        L_0x0052:
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x0057
            goto L_0x0059
        L_0x0057:
            r2 = r23
        L_0x0059:
            r13 = r12
            r14 = r1
            r15 = r3
            r16 = r4
            r17 = r5
            r18 = r6
            r19 = r7
            r20 = r8
            r21 = r9
            r22 = r10
            r23 = r11
            r24 = r2
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.dlservices.data.model.ApplStatusDetailsItem.<init>(java.lang.String, java.lang.String[][], java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, int, cm.g):void");
    }
}
