package com.nic.mparivahan.Sarathithreeservices.model;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;
import java.io.Serializable;

@Keep
public final class ReasonMast implements Serializable {
    @c("rmCheckUsertoken")
    private final Object rmCheckUsertoken;
    @c("rmReasonCode")
    private final Integer rmReasonCode;
    @c("rmReasonDesc")
    private final String rmReasonDesc;
    @c("rmTokenId")
    private final Object rmTokenId;
    @c("rmUserId")
    private final Integer rmUserId;

    public ReasonMast() {
        this((Integer) null, (Object) null, (String) null, (Object) null, (Integer) null, 31, (g) null);
    }

    public static /* synthetic */ ReasonMast copy$default(ReasonMast reasonMast, Integer num, Object obj, String str, Object obj2, Integer num2, int i10, Object obj3) {
        if ((i10 & 1) != 0) {
            num = reasonMast.rmReasonCode;
        }
        if ((i10 & 2) != 0) {
            obj = reasonMast.rmCheckUsertoken;
        }
        Object obj4 = obj;
        if ((i10 & 4) != 0) {
            str = reasonMast.rmReasonDesc;
        }
        String str2 = str;
        if ((i10 & 8) != 0) {
            obj2 = reasonMast.rmTokenId;
        }
        Object obj5 = obj2;
        if ((i10 & 16) != 0) {
            num2 = reasonMast.rmUserId;
        }
        return reasonMast.copy(num, obj4, str2, obj5, num2);
    }

    public final Integer component1() {
        return this.rmReasonCode;
    }

    public final Object component2() {
        return this.rmCheckUsertoken;
    }

    public final String component3() {
        return this.rmReasonDesc;
    }

    public final Object component4() {
        return this.rmTokenId;
    }

    public final Integer component5() {
        return this.rmUserId;
    }

    public final ReasonMast copy(Integer num, Object obj, String str, Object obj2, Integer num2) {
        return new ReasonMast(num, obj, str, obj2, num2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReasonMast)) {
            return false;
        }
        ReasonMast reasonMast = (ReasonMast) obj;
        return l.a(this.rmReasonCode, reasonMast.rmReasonCode) && l.a(this.rmCheckUsertoken, reasonMast.rmCheckUsertoken) && l.a(this.rmReasonDesc, reasonMast.rmReasonDesc) && l.a(this.rmTokenId, reasonMast.rmTokenId) && l.a(this.rmUserId, reasonMast.rmUserId);
    }

    public final Object getRmCheckUsertoken() {
        return this.rmCheckUsertoken;
    }

    public final Integer getRmReasonCode() {
        return this.rmReasonCode;
    }

    public final String getRmReasonDesc() {
        return this.rmReasonDesc;
    }

    public final Object getRmTokenId() {
        return this.rmTokenId;
    }

    public final Integer getRmUserId() {
        return this.rmUserId;
    }

    public int hashCode() {
        Integer num = this.rmReasonCode;
        int i10 = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Object obj = this.rmCheckUsertoken;
        int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        String str = this.rmReasonDesc;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Object obj2 = this.rmTokenId;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Integer num2 = this.rmUserId;
        if (num2 != null) {
            i10 = num2.hashCode();
        }
        return hashCode4 + i10;
    }

    public String toString() {
        return "ReasonMast(rmReasonCode=" + this.rmReasonCode + ", rmCheckUsertoken=" + this.rmCheckUsertoken + ", rmReasonDesc=" + this.rmReasonDesc + ", rmTokenId=" + this.rmTokenId + ", rmUserId=" + this.rmUserId + ')';
    }

    public ReasonMast(Integer num, Object obj, String str, Object obj2, Integer num2) {
        this.rmReasonCode = num;
        this.rmCheckUsertoken = obj;
        this.rmReasonDesc = str;
        this.rmTokenId = obj2;
        this.rmUserId = num2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ReasonMast(java.lang.Integer r5, java.lang.Object r6, java.lang.String r7, java.lang.Object r8, java.lang.Integer r9, int r10, cm.g r11) {
        /*
            r4 = this;
            r11 = r10 & 1
            r0 = 0
            if (r11 == 0) goto L_0x0007
            r11 = r0
            goto L_0x0008
        L_0x0007:
            r11 = r5
        L_0x0008:
            r5 = r10 & 2
            if (r5 == 0) goto L_0x000e
            r1 = r0
            goto L_0x000f
        L_0x000e:
            r1 = r6
        L_0x000f:
            r5 = r10 & 4
            if (r5 == 0) goto L_0x0015
            r2 = r0
            goto L_0x0016
        L_0x0015:
            r2 = r7
        L_0x0016:
            r5 = r10 & 8
            if (r5 == 0) goto L_0x001c
            r3 = r0
            goto L_0x001d
        L_0x001c:
            r3 = r8
        L_0x001d:
            r5 = r10 & 16
            if (r5 == 0) goto L_0x0023
            r10 = r0
            goto L_0x0024
        L_0x0023:
            r10 = r9
        L_0x0024:
            r5 = r4
            r6 = r11
            r7 = r1
            r8 = r2
            r9 = r3
            r5.<init>(r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.Sarathithreeservices.model.ReasonMast.<init>(java.lang.Integer, java.lang.Object, java.lang.String, java.lang.Object, java.lang.Integer, int, cm.g):void");
    }
}
