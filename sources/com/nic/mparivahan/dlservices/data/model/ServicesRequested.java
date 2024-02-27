package com.nic.mparivahan.dlservices.data.model;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;
import java.io.Serializable;

@Keep
public final class ServicesRequested implements Serializable {
    @c("513")
    private final String jsonMember513;
    @c("514")
    private final String jsonMember514;
    @c("515")
    private final String jsonMember515;
    @c("516")
    private final String jsonMember516;
    @c("523")
    private final String jsonMember523;
    @c("524")
    private final String jsonMember524;
    @c("525")
    private final String jsonMember525;
    @c("526")
    private final String jsonMember526;
    @c("537")
    private final String jsonMember537;
    @c("548")
    private final String jsonMember548;

    public ServicesRequested() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 1023, (g) null);
    }

    public static /* synthetic */ ServicesRequested copy$default(ServicesRequested servicesRequested, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i10, Object obj) {
        ServicesRequested servicesRequested2 = servicesRequested;
        int i11 = i10;
        return servicesRequested.copy((i11 & 1) != 0 ? servicesRequested2.jsonMember514 : str, (i11 & 2) != 0 ? servicesRequested2.jsonMember513 : str2, (i11 & 4) != 0 ? servicesRequested2.jsonMember515 : str3, (i11 & 8) != 0 ? servicesRequested2.jsonMember516 : str4, (i11 & 16) != 0 ? servicesRequested2.jsonMember523 : str5, (i11 & 32) != 0 ? servicesRequested2.jsonMember524 : str6, (i11 & 64) != 0 ? servicesRequested2.jsonMember548 : str7, (i11 & 128) != 0 ? servicesRequested2.jsonMember525 : str8, (i11 & 256) != 0 ? servicesRequested2.jsonMember537 : str9, (i11 & 512) != 0 ? servicesRequested2.jsonMember526 : str10);
    }

    public final String component1() {
        return this.jsonMember514;
    }

    public final String component10() {
        return this.jsonMember526;
    }

    public final String component2() {
        return this.jsonMember513;
    }

    public final String component3() {
        return this.jsonMember515;
    }

    public final String component4() {
        return this.jsonMember516;
    }

    public final String component5() {
        return this.jsonMember523;
    }

    public final String component6() {
        return this.jsonMember524;
    }

    public final String component7() {
        return this.jsonMember548;
    }

    public final String component8() {
        return this.jsonMember525;
    }

    public final String component9() {
        return this.jsonMember537;
    }

    public final ServicesRequested copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        return new ServicesRequested(str, str2, str3, str4, str5, str6, str7, str8, str9, str10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServicesRequested)) {
            return false;
        }
        ServicesRequested servicesRequested = (ServicesRequested) obj;
        return l.a(this.jsonMember514, servicesRequested.jsonMember514) && l.a(this.jsonMember513, servicesRequested.jsonMember513) && l.a(this.jsonMember515, servicesRequested.jsonMember515) && l.a(this.jsonMember516, servicesRequested.jsonMember516) && l.a(this.jsonMember523, servicesRequested.jsonMember523) && l.a(this.jsonMember524, servicesRequested.jsonMember524) && l.a(this.jsonMember548, servicesRequested.jsonMember548) && l.a(this.jsonMember525, servicesRequested.jsonMember525) && l.a(this.jsonMember537, servicesRequested.jsonMember537) && l.a(this.jsonMember526, servicesRequested.jsonMember526);
    }

    public final String getJsonMember513() {
        return this.jsonMember513;
    }

    public final String getJsonMember514() {
        return this.jsonMember514;
    }

    public final String getJsonMember515() {
        return this.jsonMember515;
    }

    public final String getJsonMember516() {
        return this.jsonMember516;
    }

    public final String getJsonMember523() {
        return this.jsonMember523;
    }

    public final String getJsonMember524() {
        return this.jsonMember524;
    }

    public final String getJsonMember525() {
        return this.jsonMember525;
    }

    public final String getJsonMember526() {
        return this.jsonMember526;
    }

    public final String getJsonMember537() {
        return this.jsonMember537;
    }

    public final String getJsonMember548() {
        return this.jsonMember548;
    }

    public int hashCode() {
        String str = this.jsonMember514;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.jsonMember513;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.jsonMember515;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.jsonMember516;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.jsonMember523;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.jsonMember524;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.jsonMember548;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.jsonMember525;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.jsonMember537;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.jsonMember526;
        if (str10 != null) {
            i10 = str10.hashCode();
        }
        return hashCode9 + i10;
    }

    public String toString() {
        return "ServicesRequested(jsonMember514=" + this.jsonMember514 + ", jsonMember513=" + this.jsonMember513 + ", jsonMember515=" + this.jsonMember515 + ", jsonMember516=" + this.jsonMember516 + ", jsonMember523=" + this.jsonMember523 + ", jsonMember524=" + this.jsonMember524 + ", jsonMember548=" + this.jsonMember548 + ", jsonMember525=" + this.jsonMember525 + ", jsonMember537=" + this.jsonMember537 + ", jsonMember526=" + this.jsonMember526 + ')';
    }

    public ServicesRequested(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        this.jsonMember514 = str;
        this.jsonMember513 = str2;
        this.jsonMember515 = str3;
        this.jsonMember516 = str4;
        this.jsonMember523 = str5;
        this.jsonMember524 = str6;
        this.jsonMember548 = str7;
        this.jsonMember525 = str8;
        this.jsonMember537 = str9;
        this.jsonMember526 = str10;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ServicesRequested(java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, int r22, cm.g r23) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.dlservices.data.model.ServicesRequested.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, cm.g):void");
    }
}
