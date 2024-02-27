package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class testmodleItem {
    private final String avail_seats;
    private final Object day_ofWeek;
    private final String selectApptDate;
    private final Object selectApptDateDay;
    private final boolean selectCase;
    private final String slot;
    private final String slot__service_Id;
    private final int slot_id;
    private final String slot_service_descr;
    private final String total_seat;
    private final Object veh_class;

    public testmodleItem(String str, Object obj, String str2, Object obj2, boolean z10, String str3, String str4, int i10, String str5, String str6, Object obj3) {
        l.f(str, "avail_seats");
        l.f(obj, "day_ofWeek");
        l.f(str2, "selectApptDate");
        l.f(obj2, "selectApptDateDay");
        l.f(str3, "slot");
        l.f(str4, "slot__service_Id");
        l.f(str5, "slot_service_descr");
        l.f(str6, "total_seat");
        l.f(obj3, "veh_class");
        this.avail_seats = str;
        this.day_ofWeek = obj;
        this.selectApptDate = str2;
        this.selectApptDateDay = obj2;
        this.selectCase = z10;
        this.slot = str3;
        this.slot__service_Id = str4;
        this.slot_id = i10;
        this.slot_service_descr = str5;
        this.total_seat = str6;
        this.veh_class = obj3;
    }

    public static /* synthetic */ testmodleItem copy$default(testmodleItem testmodleitem, String str, Object obj, String str2, Object obj2, boolean z10, String str3, String str4, int i10, String str5, String str6, Object obj3, int i11, Object obj4) {
        testmodleItem testmodleitem2 = testmodleitem;
        int i12 = i11;
        return testmodleitem.copy((i12 & 1) != 0 ? testmodleitem2.avail_seats : str, (i12 & 2) != 0 ? testmodleitem2.day_ofWeek : obj, (i12 & 4) != 0 ? testmodleitem2.selectApptDate : str2, (i12 & 8) != 0 ? testmodleitem2.selectApptDateDay : obj2, (i12 & 16) != 0 ? testmodleitem2.selectCase : z10, (i12 & 32) != 0 ? testmodleitem2.slot : str3, (i12 & 64) != 0 ? testmodleitem2.slot__service_Id : str4, (i12 & 128) != 0 ? testmodleitem2.slot_id : i10, (i12 & 256) != 0 ? testmodleitem2.slot_service_descr : str5, (i12 & 512) != 0 ? testmodleitem2.total_seat : str6, (i12 & 1024) != 0 ? testmodleitem2.veh_class : obj3);
    }

    public final String component1() {
        return this.avail_seats;
    }

    public final String component10() {
        return this.total_seat;
    }

    public final Object component11() {
        return this.veh_class;
    }

    public final Object component2() {
        return this.day_ofWeek;
    }

    public final String component3() {
        return this.selectApptDate;
    }

    public final Object component4() {
        return this.selectApptDateDay;
    }

    public final boolean component5() {
        return this.selectCase;
    }

    public final String component6() {
        return this.slot;
    }

    public final String component7() {
        return this.slot__service_Id;
    }

    public final int component8() {
        return this.slot_id;
    }

    public final String component9() {
        return this.slot_service_descr;
    }

    public final testmodleItem copy(String str, Object obj, String str2, Object obj2, boolean z10, String str3, String str4, int i10, String str5, String str6, Object obj3) {
        l.f(str, "avail_seats");
        l.f(obj, "day_ofWeek");
        String str7 = str2;
        l.f(str7, "selectApptDate");
        Object obj4 = obj2;
        l.f(obj4, "selectApptDateDay");
        String str8 = str3;
        l.f(str8, "slot");
        String str9 = str4;
        l.f(str9, "slot__service_Id");
        String str10 = str5;
        l.f(str10, "slot_service_descr");
        String str11 = str6;
        l.f(str11, "total_seat");
        Object obj5 = obj3;
        l.f(obj5, "veh_class");
        return new testmodleItem(str, obj, str7, obj4, z10, str8, str9, i10, str10, str11, obj5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof testmodleItem)) {
            return false;
        }
        testmodleItem testmodleitem = (testmodleItem) obj;
        return l.a(this.avail_seats, testmodleitem.avail_seats) && l.a(this.day_ofWeek, testmodleitem.day_ofWeek) && l.a(this.selectApptDate, testmodleitem.selectApptDate) && l.a(this.selectApptDateDay, testmodleitem.selectApptDateDay) && this.selectCase == testmodleitem.selectCase && l.a(this.slot, testmodleitem.slot) && l.a(this.slot__service_Id, testmodleitem.slot__service_Id) && this.slot_id == testmodleitem.slot_id && l.a(this.slot_service_descr, testmodleitem.slot_service_descr) && l.a(this.total_seat, testmodleitem.total_seat) && l.a(this.veh_class, testmodleitem.veh_class);
    }

    public final String getAvail_seats() {
        return this.avail_seats;
    }

    public final Object getDay_ofWeek() {
        return this.day_ofWeek;
    }

    public final String getSelectApptDate() {
        return this.selectApptDate;
    }

    public final Object getSelectApptDateDay() {
        return this.selectApptDateDay;
    }

    public final boolean getSelectCase() {
        return this.selectCase;
    }

    public final String getSlot() {
        return this.slot;
    }

    public final String getSlot__service_Id() {
        return this.slot__service_Id;
    }

    public final int getSlot_id() {
        return this.slot_id;
    }

    public final String getSlot_service_descr() {
        return this.slot_service_descr;
    }

    public final String getTotal_seat() {
        return this.total_seat;
    }

    public final Object getVeh_class() {
        return this.veh_class;
    }

    public int hashCode() {
        int hashCode = ((((((this.avail_seats.hashCode() * 31) + this.day_ofWeek.hashCode()) * 31) + this.selectApptDate.hashCode()) * 31) + this.selectApptDateDay.hashCode()) * 31;
        boolean z10 = this.selectCase;
        if (z10) {
            z10 = true;
        }
        return ((((((((((((hashCode + (z10 ? 1 : 0)) * 31) + this.slot.hashCode()) * 31) + this.slot__service_Id.hashCode()) * 31) + Integer.hashCode(this.slot_id)) * 31) + this.slot_service_descr.hashCode()) * 31) + this.total_seat.hashCode()) * 31) + this.veh_class.hashCode();
    }

    public String toString() {
        return "testmodleItem(avail_seats=" + this.avail_seats + ", day_ofWeek=" + this.day_ofWeek + ", selectApptDate=" + this.selectApptDate + ", selectApptDateDay=" + this.selectApptDateDay + ", selectCase=" + this.selectCase + ", slot=" + this.slot + ", slot__service_Id=" + this.slot__service_Id + ", slot_id=" + this.slot_id + ", slot_service_descr=" + this.slot_service_descr + ", total_seat=" + this.total_seat + ", veh_class=" + this.veh_class + ')';
    }
}
