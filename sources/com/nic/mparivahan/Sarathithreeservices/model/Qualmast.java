package com.nic.mparivahan.Sarathithreeservices.model;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;
import java.io.Serializable;

@Keep
public final class Qualmast implements Serializable {
    @c("qmCheckUsertoken")
    private final Object qmCheckUsertoken;
    @c("qmQualcd")
    private final Integer qmQualcd;
    @c("qmQualdesc")
    private final String qmQualdesc;
    @c("qmTokenId")
    private final Object qmTokenId;
    @c("qmUserId")
    private final Integer qmUserId;

    public Qualmast() {
        this((String) null, (Object) null, (Object) null, (Integer) null, (Integer) null, 31, (g) null);
    }

    public static /* synthetic */ Qualmast copy$default(Qualmast qualmast, String str, Object obj, Object obj2, Integer num, Integer num2, int i10, Object obj3) {
        if ((i10 & 1) != 0) {
            str = qualmast.qmQualdesc;
        }
        if ((i10 & 2) != 0) {
            obj = qualmast.qmCheckUsertoken;
        }
        Object obj4 = obj;
        if ((i10 & 4) != 0) {
            obj2 = qualmast.qmTokenId;
        }
        Object obj5 = obj2;
        if ((i10 & 8) != 0) {
            num = qualmast.qmUserId;
        }
        Integer num3 = num;
        if ((i10 & 16) != 0) {
            num2 = qualmast.qmQualcd;
        }
        return qualmast.copy(str, obj4, obj5, num3, num2);
    }

    public final String component1() {
        return this.qmQualdesc;
    }

    public final Object component2() {
        return this.qmCheckUsertoken;
    }

    public final Object component3() {
        return this.qmTokenId;
    }

    public final Integer component4() {
        return this.qmUserId;
    }

    public final Integer component5() {
        return this.qmQualcd;
    }

    public final Qualmast copy(String str, Object obj, Object obj2, Integer num, Integer num2) {
        return new Qualmast(str, obj, obj2, num, num2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Qualmast)) {
            return false;
        }
        Qualmast qualmast = (Qualmast) obj;
        return l.a(this.qmQualdesc, qualmast.qmQualdesc) && l.a(this.qmCheckUsertoken, qualmast.qmCheckUsertoken) && l.a(this.qmTokenId, qualmast.qmTokenId) && l.a(this.qmUserId, qualmast.qmUserId) && l.a(this.qmQualcd, qualmast.qmQualcd);
    }

    public final Object getQmCheckUsertoken() {
        return this.qmCheckUsertoken;
    }

    public final Integer getQmQualcd() {
        return this.qmQualcd;
    }

    public final String getQmQualdesc() {
        return this.qmQualdesc;
    }

    public final Object getQmTokenId() {
        return this.qmTokenId;
    }

    public final Integer getQmUserId() {
        return this.qmUserId;
    }

    public int hashCode() {
        String str = this.qmQualdesc;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Object obj = this.qmCheckUsertoken;
        int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.qmTokenId;
        int hashCode3 = (hashCode2 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Integer num = this.qmUserId;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.qmQualcd;
        if (num2 != null) {
            i10 = num2.hashCode();
        }
        return hashCode4 + i10;
    }

    public String toString() {
        return "Qualmast(qmQualdesc=" + this.qmQualdesc + ", qmCheckUsertoken=" + this.qmCheckUsertoken + ", qmTokenId=" + this.qmTokenId + ", qmUserId=" + this.qmUserId + ", qmQualcd=" + this.qmQualcd + ')';
    }

    public Qualmast(String str, Object obj, Object obj2, Integer num, Integer num2) {
        this.qmQualdesc = str;
        this.qmCheckUsertoken = obj;
        this.qmTokenId = obj2;
        this.qmUserId = num;
        this.qmQualcd = num2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ Qualmast(java.lang.String r5, java.lang.Object r6, java.lang.Object r7, java.lang.Integer r8, java.lang.Integer r9, int r10, cm.g r11) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.Sarathithreeservices.model.Qualmast.<init>(java.lang.String, java.lang.Object, java.lang.Object, java.lang.Integer, java.lang.Integer, int, cm.g):void");
    }
}
