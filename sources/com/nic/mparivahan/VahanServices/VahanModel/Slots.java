package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;

@Keep
public final class Slots {
    @c("avalableSeats")
    private Integer avalableSeats;
    @c("hflag")
    private Boolean hflag;
    @c("qaflag")
    private Boolean qaflag;
    @c("qcflag")
    private Boolean qcflag;
    @c("slotNo")
    private Integer slotNo;
    @c("timeForDisp")
    private String timeForDisp;

    public Slots() {
        this((String) null, (Integer) null, (Boolean) null, (Boolean) null, (Integer) null, (Boolean) null, 63, (g) null);
    }

    public static /* synthetic */ Slots copy$default(Slots slots, String str, Integer num, Boolean bool, Boolean bool2, Integer num2, Boolean bool3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = slots.timeForDisp;
        }
        if ((i10 & 2) != 0) {
            num = slots.avalableSeats;
        }
        Integer num3 = num;
        if ((i10 & 4) != 0) {
            bool = slots.qaflag;
        }
        Boolean bool4 = bool;
        if ((i10 & 8) != 0) {
            bool2 = slots.qcflag;
        }
        Boolean bool5 = bool2;
        if ((i10 & 16) != 0) {
            num2 = slots.slotNo;
        }
        Integer num4 = num2;
        if ((i10 & 32) != 0) {
            bool3 = slots.hflag;
        }
        return slots.copy(str, num3, bool4, bool5, num4, bool3);
    }

    public final String component1() {
        return this.timeForDisp;
    }

    public final Integer component2() {
        return this.avalableSeats;
    }

    public final Boolean component3() {
        return this.qaflag;
    }

    public final Boolean component4() {
        return this.qcflag;
    }

    public final Integer component5() {
        return this.slotNo;
    }

    public final Boolean component6() {
        return this.hflag;
    }

    public final Slots copy(String str, Integer num, Boolean bool, Boolean bool2, Integer num2, Boolean bool3) {
        return new Slots(str, num, bool, bool2, num2, bool3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Slots)) {
            return false;
        }
        Slots slots = (Slots) obj;
        return l.a(this.timeForDisp, slots.timeForDisp) && l.a(this.avalableSeats, slots.avalableSeats) && l.a(this.qaflag, slots.qaflag) && l.a(this.qcflag, slots.qcflag) && l.a(this.slotNo, slots.slotNo) && l.a(this.hflag, slots.hflag);
    }

    public final Integer getAvalableSeats() {
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

    public final Integer getSlotNo() {
        return this.slotNo;
    }

    public final String getTimeForDisp() {
        return this.timeForDisp;
    }

    public int hashCode() {
        String str = this.timeForDisp;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.avalableSeats;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.qaflag;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.qcflag;
        int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num2 = this.slotNo;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool3 = this.hflag;
        if (bool3 != null) {
            i10 = bool3.hashCode();
        }
        return hashCode5 + i10;
    }

    public final void setAvalableSeats(Integer num) {
        this.avalableSeats = num;
    }

    public final void setHflag(Boolean bool) {
        this.hflag = bool;
    }

    public final void setQaflag(Boolean bool) {
        this.qaflag = bool;
    }

    public final void setQcflag(Boolean bool) {
        this.qcflag = bool;
    }

    public final void setSlotNo(Integer num) {
        this.slotNo = num;
    }

    public final void setTimeForDisp(String str) {
        this.timeForDisp = str;
    }

    public String toString() {
        return "Slots(timeForDisp=" + this.timeForDisp + ", avalableSeats=" + this.avalableSeats + ", qaflag=" + this.qaflag + ", qcflag=" + this.qcflag + ", slotNo=" + this.slotNo + ", hflag=" + this.hflag + ')';
    }

    public Slots(String str, Integer num, Boolean bool, Boolean bool2, Integer num2, Boolean bool3) {
        this.timeForDisp = str;
        this.avalableSeats = num;
        this.qaflag = bool;
        this.qcflag = bool2;
        this.slotNo = num2;
        this.hflag = bool3;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ Slots(java.lang.String r6, java.lang.Integer r7, java.lang.Boolean r8, java.lang.Boolean r9, java.lang.Integer r10, java.lang.Boolean r11, int r12, cm.g r13) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.VahanServices.VahanModel.Slots.<init>(java.lang.String, java.lang.Integer, java.lang.Boolean, java.lang.Boolean, java.lang.Integer, java.lang.Boolean, int, cm.g):void");
    }
}
