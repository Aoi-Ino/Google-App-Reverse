package com.nic.mparivahan.dlservices.ui.slots.calendar;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;

@Keep
public final class SlotDetailsItem {
    @c("avalableSeats")
    private final int avalableSeats;
    @c("hflag")
    private final Boolean hflag;
    @c("qaflag")
    private final Boolean qaflag;
    @c("qcflag")
    private final Boolean qcflag;
    @c("quotadt")
    private final String quotadt;
    @c("rtoCode")
    private final String rtoCode;
    @c("slotNo")
    private final Integer slotNo;
    @c("timeForDisp")
    private final String timeForDisp;

    public SlotDetailsItem() {
        this((String) null, (String) null, 0, (Boolean) null, (Boolean) null, (Integer) null, (Boolean) null, (String) null, 255, (g) null);
    }

    public static /* synthetic */ SlotDetailsItem copy$default(SlotDetailsItem slotDetailsItem, String str, String str2, int i10, Boolean bool, Boolean bool2, Integer num, Boolean bool3, String str3, int i11, Object obj) {
        SlotDetailsItem slotDetailsItem2 = slotDetailsItem;
        int i12 = i11;
        return slotDetailsItem.copy((i12 & 1) != 0 ? slotDetailsItem2.quotadt : str, (i12 & 2) != 0 ? slotDetailsItem2.timeForDisp : str2, (i12 & 4) != 0 ? slotDetailsItem2.avalableSeats : i10, (i12 & 8) != 0 ? slotDetailsItem2.qaflag : bool, (i12 & 16) != 0 ? slotDetailsItem2.qcflag : bool2, (i12 & 32) != 0 ? slotDetailsItem2.slotNo : num, (i12 & 64) != 0 ? slotDetailsItem2.hflag : bool3, (i12 & 128) != 0 ? slotDetailsItem2.rtoCode : str3);
    }

    public final String component1() {
        return this.quotadt;
    }

    public final String component2() {
        return this.timeForDisp;
    }

    public final int component3() {
        return this.avalableSeats;
    }

    public final Boolean component4() {
        return this.qaflag;
    }

    public final Boolean component5() {
        return this.qcflag;
    }

    public final Integer component6() {
        return this.slotNo;
    }

    public final Boolean component7() {
        return this.hflag;
    }

    public final String component8() {
        return this.rtoCode;
    }

    public final SlotDetailsItem copy(String str, String str2, int i10, Boolean bool, Boolean bool2, Integer num, Boolean bool3, String str3) {
        return new SlotDetailsItem(str, str2, i10, bool, bool2, num, bool3, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SlotDetailsItem)) {
            return false;
        }
        SlotDetailsItem slotDetailsItem = (SlotDetailsItem) obj;
        return l.a(this.quotadt, slotDetailsItem.quotadt) && l.a(this.timeForDisp, slotDetailsItem.timeForDisp) && this.avalableSeats == slotDetailsItem.avalableSeats && l.a(this.qaflag, slotDetailsItem.qaflag) && l.a(this.qcflag, slotDetailsItem.qcflag) && l.a(this.slotNo, slotDetailsItem.slotNo) && l.a(this.hflag, slotDetailsItem.hflag) && l.a(this.rtoCode, slotDetailsItem.rtoCode);
    }

    public final int getAvalableSeats() {
        return this.avalableSeats;
    }

    public final Boolean getHflag() {
        return this.hflag;
    }

    public final Boolean getQaflag() {
        return this.qaflag;
    }

    public final Boolean getQcflag() {
        return this.qcflag;
    }

    public final String getQuotadt() {
        return this.quotadt;
    }

    public final String getRtoCode() {
        return this.rtoCode;
    }

    public final Integer getSlotNo() {
        return this.slotNo;
    }

    public final String getTimeForDisp() {
        return this.timeForDisp;
    }

    public int hashCode() {
        String str = this.quotadt;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.timeForDisp;
        int hashCode2 = (((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + Integer.hashCode(this.avalableSeats)) * 31;
        Boolean bool = this.qaflag;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.qcflag;
        int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num = this.slotNo;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool3 = this.hflag;
        int hashCode6 = (hashCode5 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str3 = this.rtoCode;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        return hashCode6 + i10;
    }

    public String toString() {
        return "SlotDetailsItem(quotadt=" + this.quotadt + ", timeForDisp=" + this.timeForDisp + ", avalableSeats=" + this.avalableSeats + ", qaflag=" + this.qaflag + ", qcflag=" + this.qcflag + ", slotNo=" + this.slotNo + ", hflag=" + this.hflag + ", rtoCode=" + this.rtoCode + ')';
    }

    public SlotDetailsItem(String str, String str2, int i10, Boolean bool, Boolean bool2, Integer num, Boolean bool3, String str3) {
        this.quotadt = str;
        this.timeForDisp = str2;
        this.avalableSeats = i10;
        this.qaflag = bool;
        this.qcflag = bool2;
        this.slotNo = num;
        this.hflag = bool3;
        this.rtoCode = str3;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ SlotDetailsItem(java.lang.String r10, java.lang.String r11, int r12, java.lang.Boolean r13, java.lang.Boolean r14, java.lang.Integer r15, java.lang.Boolean r16, java.lang.String r17, int r18, cm.g r19) {
        /*
            r9 = this;
            r0 = r18
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r10
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = r2
            goto L_0x0011
        L_0x0010:
            r3 = r11
        L_0x0011:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0017
            r4 = 0
            goto L_0x0018
        L_0x0017:
            r4 = r12
        L_0x0018:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x001e
            r5 = r2
            goto L_0x001f
        L_0x001e:
            r5 = r13
        L_0x001f:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0025
            r6 = r2
            goto L_0x0026
        L_0x0025:
            r6 = r14
        L_0x0026:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x002c
            r7 = r2
            goto L_0x002d
        L_0x002c:
            r7 = r15
        L_0x002d:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0033
            r8 = r2
            goto L_0x0035
        L_0x0033:
            r8 = r16
        L_0x0035:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x003a
            goto L_0x003c
        L_0x003a:
            r2 = r17
        L_0x003c:
            r10 = r9
            r11 = r1
            r12 = r3
            r13 = r4
            r14 = r5
            r15 = r6
            r16 = r7
            r17 = r8
            r18 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.dlservices.ui.slots.calendar.SlotDetailsItem.<init>(java.lang.String, java.lang.String, int, java.lang.Boolean, java.lang.Boolean, java.lang.Integer, java.lang.Boolean, java.lang.String, int, cm.g):void");
    }
}
