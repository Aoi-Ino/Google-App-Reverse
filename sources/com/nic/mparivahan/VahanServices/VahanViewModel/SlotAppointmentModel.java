package com.nic.mparivahan.VahanServices.VahanViewModel;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class SlotAppointmentModel {
    private final String avail_seats;
    private final String day_ofWeek;
    private final String selectApptDate;
    private final boolean selectCase;
    private final String slot;
    private final String slot__service_Id;
    private final int slot_id;
    private final String slot_service_descr;
    private final String total_seat;

    public SlotAppointmentModel(int i10, String str, String str2, String str3, String str4, String str5, boolean z10, String str6, String str7) {
        l.f(str, "slot");
        l.f(str2, "total_seat");
        l.f(str3, "avail_seats");
        l.f(str4, "slot__service_Id");
        l.f(str5, "slot_service_descr");
        l.f(str6, "selectApptDate");
        l.f(str7, "day_ofWeek");
        this.slot_id = i10;
        this.slot = str;
        this.total_seat = str2;
        this.avail_seats = str3;
        this.slot__service_Id = str4;
        this.slot_service_descr = str5;
        this.selectCase = z10;
        this.selectApptDate = str6;
        this.day_ofWeek = str7;
    }

    public static /* synthetic */ SlotAppointmentModel copy$default(SlotAppointmentModel slotAppointmentModel, int i10, String str, String str2, String str3, String str4, String str5, boolean z10, String str6, String str7, int i11, Object obj) {
        SlotAppointmentModel slotAppointmentModel2 = slotAppointmentModel;
        int i12 = i11;
        return slotAppointmentModel.copy((i12 & 1) != 0 ? slotAppointmentModel2.slot_id : i10, (i12 & 2) != 0 ? slotAppointmentModel2.slot : str, (i12 & 4) != 0 ? slotAppointmentModel2.total_seat : str2, (i12 & 8) != 0 ? slotAppointmentModel2.avail_seats : str3, (i12 & 16) != 0 ? slotAppointmentModel2.slot__service_Id : str4, (i12 & 32) != 0 ? slotAppointmentModel2.slot_service_descr : str5, (i12 & 64) != 0 ? slotAppointmentModel2.selectCase : z10, (i12 & 128) != 0 ? slotAppointmentModel2.selectApptDate : str6, (i12 & 256) != 0 ? slotAppointmentModel2.day_ofWeek : str7);
    }

    public final int component1() {
        return this.slot_id;
    }

    public final String component2() {
        return this.slot;
    }

    public final String component3() {
        return this.total_seat;
    }

    public final String component4() {
        return this.avail_seats;
    }

    public final String component5() {
        return this.slot__service_Id;
    }

    public final String component6() {
        return this.slot_service_descr;
    }

    public final boolean component7() {
        return this.selectCase;
    }

    public final String component8() {
        return this.selectApptDate;
    }

    public final String component9() {
        return this.day_ofWeek;
    }

    public final SlotAppointmentModel copy(int i10, String str, String str2, String str3, String str4, String str5, boolean z10, String str6, String str7) {
        l.f(str, "slot");
        l.f(str2, "total_seat");
        l.f(str3, "avail_seats");
        String str8 = str4;
        l.f(str8, "slot__service_Id");
        String str9 = str5;
        l.f(str9, "slot_service_descr");
        String str10 = str6;
        l.f(str10, "selectApptDate");
        String str11 = str7;
        l.f(str11, "day_ofWeek");
        return new SlotAppointmentModel(i10, str, str2, str3, str8, str9, z10, str10, str11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SlotAppointmentModel)) {
            return false;
        }
        SlotAppointmentModel slotAppointmentModel = (SlotAppointmentModel) obj;
        return this.slot_id == slotAppointmentModel.slot_id && l.a(this.slot, slotAppointmentModel.slot) && l.a(this.total_seat, slotAppointmentModel.total_seat) && l.a(this.avail_seats, slotAppointmentModel.avail_seats) && l.a(this.slot__service_Id, slotAppointmentModel.slot__service_Id) && l.a(this.slot_service_descr, slotAppointmentModel.slot_service_descr) && this.selectCase == slotAppointmentModel.selectCase && l.a(this.selectApptDate, slotAppointmentModel.selectApptDate) && l.a(this.day_ofWeek, slotAppointmentModel.day_ofWeek);
    }

    public final String getAvail_seats() {
        return this.avail_seats;
    }

    public final String getDay_ofWeek() {
        return this.day_ofWeek;
    }

    public final String getSelectApptDate() {
        return this.selectApptDate;
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

    public int hashCode() {
        int hashCode = ((((((((((Integer.hashCode(this.slot_id) * 31) + this.slot.hashCode()) * 31) + this.total_seat.hashCode()) * 31) + this.avail_seats.hashCode()) * 31) + this.slot__service_Id.hashCode()) * 31) + this.slot_service_descr.hashCode()) * 31;
        boolean z10 = this.selectCase;
        if (z10) {
            z10 = true;
        }
        return ((((hashCode + (z10 ? 1 : 0)) * 31) + this.selectApptDate.hashCode()) * 31) + this.day_ofWeek.hashCode();
    }

    public String toString() {
        return "SlotAppointmentModel(slot_id=" + this.slot_id + ", slot=" + this.slot + ", total_seat=" + this.total_seat + ", avail_seats=" + this.avail_seats + ", slot__service_Id=" + this.slot__service_Id + ", slot_service_descr=" + this.slot_service_descr + ", selectCase=" + this.selectCase + ", selectApptDate=" + this.selectApptDate + ", day_ofWeek=" + this.day_ofWeek + ')';
    }
}
