package com.nic.mparivahan.dlservices.ui.slots.model;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;

@Keep
public final class SlotsInstRequest {
    @c("applNo")
    private final String applNo;
    @c("campcd")
    private final String campcd;
    @c("campid")
    private final String campid;
    @c("rtocd")
    private final String rtocd;
    @c("slotDate")
    private final String slotDate;
    @c("slotNo")
    private final String slotNo;

    public SlotsInstRequest() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 63, (g) null);
    }

    public static /* synthetic */ SlotsInstRequest copy$default(SlotsInstRequest slotsInstRequest, String str, String str2, String str3, String str4, String str5, String str6, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = slotsInstRequest.rtocd;
        }
        if ((i10 & 2) != 0) {
            str2 = slotsInstRequest.campid;
        }
        String str7 = str2;
        if ((i10 & 4) != 0) {
            str3 = slotsInstRequest.applNo;
        }
        String str8 = str3;
        if ((i10 & 8) != 0) {
            str4 = slotsInstRequest.slotDate;
        }
        String str9 = str4;
        if ((i10 & 16) != 0) {
            str5 = slotsInstRequest.campcd;
        }
        String str10 = str5;
        if ((i10 & 32) != 0) {
            str6 = slotsInstRequest.slotNo;
        }
        return slotsInstRequest.copy(str, str7, str8, str9, str10, str6);
    }

    public final String component1() {
        return this.rtocd;
    }

    public final String component2() {
        return this.campid;
    }

    public final String component3() {
        return this.applNo;
    }

    public final String component4() {
        return this.slotDate;
    }

    public final String component5() {
        return this.campcd;
    }

    public final String component6() {
        return this.slotNo;
    }

    public final SlotsInstRequest copy(String str, String str2, String str3, String str4, String str5, String str6) {
        return new SlotsInstRequest(str, str2, str3, str4, str5, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SlotsInstRequest)) {
            return false;
        }
        SlotsInstRequest slotsInstRequest = (SlotsInstRequest) obj;
        return l.a(this.rtocd, slotsInstRequest.rtocd) && l.a(this.campid, slotsInstRequest.campid) && l.a(this.applNo, slotsInstRequest.applNo) && l.a(this.slotDate, slotsInstRequest.slotDate) && l.a(this.campcd, slotsInstRequest.campcd) && l.a(this.slotNo, slotsInstRequest.slotNo);
    }

    public final String getApplNo() {
        return this.applNo;
    }

    public final String getCampcd() {
        return this.campcd;
    }

    public final String getCampid() {
        return this.campid;
    }

    public final String getRtocd() {
        return this.rtocd;
    }

    public final String getSlotDate() {
        return this.slotDate;
    }

    public final String getSlotNo() {
        return this.slotNo;
    }

    public int hashCode() {
        String str = this.rtocd;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.campid;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.applNo;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.slotDate;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.campcd;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.slotNo;
        if (str6 != null) {
            i10 = str6.hashCode();
        }
        return hashCode5 + i10;
    }

    public String toString() {
        return "SlotsInstRequest(rtocd=" + this.rtocd + ", campid=" + this.campid + ", applNo=" + this.applNo + ", slotDate=" + this.slotDate + ", campcd=" + this.campcd + ", slotNo=" + this.slotNo + ')';
    }

    public SlotsInstRequest(String str, String str2, String str3, String str4, String str5, String str6) {
        this.rtocd = str;
        this.campid = str2;
        this.applNo = str3;
        this.slotDate = str4;
        this.campcd = str5;
        this.slotNo = str6;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ SlotsInstRequest(java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, int r12, cm.g r13) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.dlservices.ui.slots.model.SlotsInstRequest.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, cm.g):void");
    }
}
