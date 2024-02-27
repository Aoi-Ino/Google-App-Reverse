package com.nic.mparivahan.dlservices.data.model;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;
import java.io.Serializable;

@Keep
public final class ApplFlowStatusListItem implements Serializable {
    @c("acCd")
    private final Integer acCd;
    @c("acDesc")
    private final String acDesc;
    @c("flowSlno")
    private final Integer flowSlno;
    @c("status")
    private final String status;
    @c("trCd")
    private final Integer trCd;
    @c("trName")
    private final String trName;

    public ApplFlowStatusListItem() {
        this((String) null, (Integer) null, (String) null, (Integer) null, (String) null, (Integer) null, 63, (g) null);
    }

    public static /* synthetic */ ApplFlowStatusListItem copy$default(ApplFlowStatusListItem applFlowStatusListItem, String str, Integer num, String str2, Integer num2, String str3, Integer num3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = applFlowStatusListItem.trName;
        }
        if ((i10 & 2) != 0) {
            num = applFlowStatusListItem.trCd;
        }
        Integer num4 = num;
        if ((i10 & 4) != 0) {
            str2 = applFlowStatusListItem.acDesc;
        }
        String str4 = str2;
        if ((i10 & 8) != 0) {
            num2 = applFlowStatusListItem.acCd;
        }
        Integer num5 = num2;
        if ((i10 & 16) != 0) {
            str3 = applFlowStatusListItem.status;
        }
        String str5 = str3;
        if ((i10 & 32) != 0) {
            num3 = applFlowStatusListItem.flowSlno;
        }
        return applFlowStatusListItem.copy(str, num4, str4, num5, str5, num3);
    }

    public final String component1() {
        return this.trName;
    }

    public final Integer component2() {
        return this.trCd;
    }

    public final String component3() {
        return this.acDesc;
    }

    public final Integer component4() {
        return this.acCd;
    }

    public final String component5() {
        return this.status;
    }

    public final Integer component6() {
        return this.flowSlno;
    }

    public final ApplFlowStatusListItem copy(String str, Integer num, String str2, Integer num2, String str3, Integer num3) {
        return new ApplFlowStatusListItem(str, num, str2, num2, str3, num3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApplFlowStatusListItem)) {
            return false;
        }
        ApplFlowStatusListItem applFlowStatusListItem = (ApplFlowStatusListItem) obj;
        return l.a(this.trName, applFlowStatusListItem.trName) && l.a(this.trCd, applFlowStatusListItem.trCd) && l.a(this.acDesc, applFlowStatusListItem.acDesc) && l.a(this.acCd, applFlowStatusListItem.acCd) && l.a(this.status, applFlowStatusListItem.status) && l.a(this.flowSlno, applFlowStatusListItem.flowSlno);
    }

    public final Integer getAcCd() {
        return this.acCd;
    }

    public final String getAcDesc() {
        return this.acDesc;
    }

    public final Integer getFlowSlno() {
        return this.flowSlno;
    }

    public final String getStatus() {
        return this.status;
    }

    public final Integer getTrCd() {
        return this.trCd;
    }

    public final String getTrName() {
        return this.trName;
    }

    public int hashCode() {
        String str = this.trName;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.trCd;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.acDesc;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.acCd;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.status;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num3 = this.flowSlno;
        if (num3 != null) {
            i10 = num3.hashCode();
        }
        return hashCode5 + i10;
    }

    public String toString() {
        return "ApplFlowStatusListItem(trName=" + this.trName + ", trCd=" + this.trCd + ", acDesc=" + this.acDesc + ", acCd=" + this.acCd + ", status=" + this.status + ", flowSlno=" + this.flowSlno + ')';
    }

    public ApplFlowStatusListItem(String str, Integer num, String str2, Integer num2, String str3, Integer num3) {
        this.trName = str;
        this.trCd = num;
        this.acDesc = str2;
        this.acCd = num2;
        this.status = str3;
        this.flowSlno = num3;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ApplFlowStatusListItem(java.lang.String r6, java.lang.Integer r7, java.lang.String r8, java.lang.Integer r9, java.lang.String r10, java.lang.Integer r11, int r12, cm.g r13) {
        /*
            r5 = this;
            r13 = r12 & 1
            r0 = 0
            if (r13 == 0) goto L_0x0007
            r13 = r0
            goto L_0x0008
        L_0x0007:
            r13 = r6
        L_0x0008:
            r6 = r12 & 2
            if (r6 == 0) goto L_0x000e
            r1 = r0
            goto L_0x000f
        L_0x000e:
            r1 = r7
        L_0x000f:
            r6 = r12 & 4
            if (r6 == 0) goto L_0x0015
            r2 = r0
            goto L_0x0016
        L_0x0015:
            r2 = r8
        L_0x0016:
            r6 = r12 & 8
            if (r6 == 0) goto L_0x001c
            r3 = r0
            goto L_0x001d
        L_0x001c:
            r3 = r9
        L_0x001d:
            r6 = r12 & 16
            if (r6 == 0) goto L_0x0023
            r4 = r0
            goto L_0x0024
        L_0x0023:
            r4 = r10
        L_0x0024:
            r6 = r12 & 32
            if (r6 == 0) goto L_0x002a
            r12 = r0
            goto L_0x002b
        L_0x002a:
            r12 = r11
        L_0x002b:
            r6 = r5
            r7 = r13
            r8 = r1
            r9 = r2
            r10 = r3
            r11 = r4
            r6.<init>(r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.dlservices.data.model.ApplFlowStatusListItem.<init>(java.lang.String, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.String, java.lang.Integer, int, cm.g):void");
    }
}
