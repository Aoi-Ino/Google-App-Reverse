package com.nic.mparivahan.VahanServices.VahanViewModel;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class SaveSlotAppointmentRequest {
    private final String appl_no;
    private final String appointment_dt;
    private final String appt_id;
    private final String book_status;
    private final String count_reschedule;
    private final String counter_id;
    private final String day_of_week;
    private final String fit_officer;
    private final int mobile_no;
    private final String new_appl_no;
    private final String new_appointment_dt;
    private final String off_cd;
    private final String old_appointment_dt;
    private final String op_date;
    private final Object op_date_release;
    private final Object op_dateas_date;
    private final String owner_name;
    private final String paymemt_status;
    private final String regn_no;
    private final String service_descr;
    private final String service_id;
    private final String shift_day_of_week;
    private final String shift_slot_id;
    private final String slot_id;
    private final String state_cd;
    private final String vch_catg;
    private final String vh_class;
    private final String vh_class_desc;

    public SaveSlotAppointmentRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, int i10, String str16, Object obj, Object obj2, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25) {
        String str26 = str;
        String str27 = str2;
        String str28 = str3;
        String str29 = str4;
        String str30 = str5;
        String str31 = str6;
        String str32 = str7;
        String str33 = str8;
        String str34 = str9;
        String str35 = str10;
        String str36 = str11;
        String str37 = str12;
        String str38 = str13;
        String str39 = str14;
        String str40 = str16;
        l.f(str26, "state_cd");
        l.f(str27, "off_cd");
        l.f(str28, "appt_id");
        l.f(str29, "day_of_week");
        l.f(str30, "slot_id");
        l.f(str31, "service_id");
        l.f(str32, "counter_id");
        l.f(str33, "appl_no");
        l.f(str34, "regn_no");
        l.f(str35, "appointment_dt");
        l.f(str36, "op_date");
        l.f(str37, "count_reschedule");
        l.f(str38, "book_status");
        l.f(str39, "service_descr");
        l.f(str15, "fit_officer");
        l.f(str16, "paymemt_status");
        l.f(obj, "op_dateas_date");
        l.f(obj2, "op_date_release");
        l.f(str17, "new_appl_no");
        l.f(str18, "new_appointment_dt");
        l.f(str19, "vh_class");
        l.f(str20, "vch_catg");
        l.f(str21, "owner_name");
        l.f(str22, "vh_class_desc");
        l.f(str23, "old_appointment_dt");
        l.f(str24, "shift_day_of_week");
        l.f(str25, "shift_slot_id");
        this.state_cd = str26;
        this.off_cd = str27;
        this.appt_id = str28;
        this.day_of_week = str29;
        this.slot_id = str30;
        this.service_id = str31;
        this.counter_id = str32;
        this.appl_no = str33;
        this.regn_no = str34;
        this.appointment_dt = str35;
        this.op_date = str36;
        this.count_reschedule = str37;
        this.book_status = str38;
        this.service_descr = str39;
        this.fit_officer = str15;
        this.mobile_no = i10;
        this.paymemt_status = str16;
        this.op_dateas_date = obj;
        this.op_date_release = obj2;
        this.new_appl_no = str17;
        this.new_appointment_dt = str18;
        this.vh_class = str19;
        this.vch_catg = str20;
        this.owner_name = str21;
        this.vh_class_desc = str22;
        this.old_appointment_dt = str23;
        this.shift_day_of_week = str24;
        this.shift_slot_id = str25;
    }

    private final String component1() {
        return this.state_cd;
    }

    private final String component10() {
        return this.appointment_dt;
    }

    private final String component11() {
        return this.op_date;
    }

    private final String component12() {
        return this.count_reschedule;
    }

    private final String component13() {
        return this.book_status;
    }

    private final String component14() {
        return this.service_descr;
    }

    private final String component15() {
        return this.fit_officer;
    }

    private final int component16() {
        return this.mobile_no;
    }

    private final String component17() {
        return this.paymemt_status;
    }

    private final Object component18() {
        return this.op_dateas_date;
    }

    private final Object component19() {
        return this.op_date_release;
    }

    private final String component2() {
        return this.off_cd;
    }

    private final String component20() {
        return this.new_appl_no;
    }

    private final String component21() {
        return this.new_appointment_dt;
    }

    private final String component22() {
        return this.vh_class;
    }

    private final String component23() {
        return this.vch_catg;
    }

    private final String component24() {
        return this.owner_name;
    }

    private final String component25() {
        return this.vh_class_desc;
    }

    private final String component26() {
        return this.old_appointment_dt;
    }

    private final String component27() {
        return this.shift_day_of_week;
    }

    private final String component28() {
        return this.shift_slot_id;
    }

    private final String component3() {
        return this.appt_id;
    }

    private final String component4() {
        return this.day_of_week;
    }

    private final String component5() {
        return this.slot_id;
    }

    private final String component6() {
        return this.service_id;
    }

    private final String component7() {
        return this.counter_id;
    }

    private final String component8() {
        return this.appl_no;
    }

    private final String component9() {
        return this.regn_no;
    }

    public static /* synthetic */ SaveSlotAppointmentRequest copy$default(SaveSlotAppointmentRequest saveSlotAppointmentRequest, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, int i10, String str16, Object obj, Object obj2, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, int i11, Object obj3) {
        SaveSlotAppointmentRequest saveSlotAppointmentRequest2 = saveSlotAppointmentRequest;
        int i12 = i11;
        return saveSlotAppointmentRequest.copy((i12 & 1) != 0 ? saveSlotAppointmentRequest2.state_cd : str, (i12 & 2) != 0 ? saveSlotAppointmentRequest2.off_cd : str2, (i12 & 4) != 0 ? saveSlotAppointmentRequest2.appt_id : str3, (i12 & 8) != 0 ? saveSlotAppointmentRequest2.day_of_week : str4, (i12 & 16) != 0 ? saveSlotAppointmentRequest2.slot_id : str5, (i12 & 32) != 0 ? saveSlotAppointmentRequest2.service_id : str6, (i12 & 64) != 0 ? saveSlotAppointmentRequest2.counter_id : str7, (i12 & 128) != 0 ? saveSlotAppointmentRequest2.appl_no : str8, (i12 & 256) != 0 ? saveSlotAppointmentRequest2.regn_no : str9, (i12 & 512) != 0 ? saveSlotAppointmentRequest2.appointment_dt : str10, (i12 & 1024) != 0 ? saveSlotAppointmentRequest2.op_date : str11, (i12 & 2048) != 0 ? saveSlotAppointmentRequest2.count_reschedule : str12, (i12 & 4096) != 0 ? saveSlotAppointmentRequest2.book_status : str13, (i12 & 8192) != 0 ? saveSlotAppointmentRequest2.service_descr : str14, (i12 & 16384) != 0 ? saveSlotAppointmentRequest2.fit_officer : str15, (i12 & 32768) != 0 ? saveSlotAppointmentRequest2.mobile_no : i10, (i12 & 65536) != 0 ? saveSlotAppointmentRequest2.paymemt_status : str16, (i12 & 131072) != 0 ? saveSlotAppointmentRequest2.op_dateas_date : obj, (i12 & 262144) != 0 ? saveSlotAppointmentRequest2.op_date_release : obj2, (i12 & 524288) != 0 ? saveSlotAppointmentRequest2.new_appl_no : str17, (i12 & 1048576) != 0 ? saveSlotAppointmentRequest2.new_appointment_dt : str18, (i12 & 2097152) != 0 ? saveSlotAppointmentRequest2.vh_class : str19, (i12 & 4194304) != 0 ? saveSlotAppointmentRequest2.vch_catg : str20, (i12 & 8388608) != 0 ? saveSlotAppointmentRequest2.owner_name : str21, (i12 & 16777216) != 0 ? saveSlotAppointmentRequest2.vh_class_desc : str22, (i12 & 33554432) != 0 ? saveSlotAppointmentRequest2.old_appointment_dt : str23, (i12 & 67108864) != 0 ? saveSlotAppointmentRequest2.shift_day_of_week : str24, (i12 & 134217728) != 0 ? saveSlotAppointmentRequest2.shift_slot_id : str25);
    }

    public final SaveSlotAppointmentRequest copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, int i10, String str16, Object obj, Object obj2, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25) {
        String str26 = str;
        l.f(str26, "state_cd");
        l.f(str2, "off_cd");
        l.f(str3, "appt_id");
        l.f(str4, "day_of_week");
        l.f(str5, "slot_id");
        l.f(str6, "service_id");
        l.f(str7, "counter_id");
        l.f(str8, "appl_no");
        l.f(str9, "regn_no");
        l.f(str10, "appointment_dt");
        l.f(str11, "op_date");
        l.f(str12, "count_reschedule");
        l.f(str13, "book_status");
        l.f(str14, "service_descr");
        l.f(str15, "fit_officer");
        l.f(str16, "paymemt_status");
        l.f(obj, "op_dateas_date");
        l.f(obj2, "op_date_release");
        l.f(str17, "new_appl_no");
        l.f(str18, "new_appointment_dt");
        l.f(str19, "vh_class");
        l.f(str20, "vch_catg");
        l.f(str21, "owner_name");
        l.f(str22, "vh_class_desc");
        l.f(str23, "old_appointment_dt");
        l.f(str24, "shift_day_of_week");
        l.f(str25, "shift_slot_id");
        return new SaveSlotAppointmentRequest(str26, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, i10, str16, obj, obj2, str17, str18, str19, str20, str21, str22, str23, str24, str25);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SaveSlotAppointmentRequest)) {
            return false;
        }
        SaveSlotAppointmentRequest saveSlotAppointmentRequest = (SaveSlotAppointmentRequest) obj;
        return l.a(this.state_cd, saveSlotAppointmentRequest.state_cd) && l.a(this.off_cd, saveSlotAppointmentRequest.off_cd) && l.a(this.appt_id, saveSlotAppointmentRequest.appt_id) && l.a(this.day_of_week, saveSlotAppointmentRequest.day_of_week) && l.a(this.slot_id, saveSlotAppointmentRequest.slot_id) && l.a(this.service_id, saveSlotAppointmentRequest.service_id) && l.a(this.counter_id, saveSlotAppointmentRequest.counter_id) && l.a(this.appl_no, saveSlotAppointmentRequest.appl_no) && l.a(this.regn_no, saveSlotAppointmentRequest.regn_no) && l.a(this.appointment_dt, saveSlotAppointmentRequest.appointment_dt) && l.a(this.op_date, saveSlotAppointmentRequest.op_date) && l.a(this.count_reschedule, saveSlotAppointmentRequest.count_reschedule) && l.a(this.book_status, saveSlotAppointmentRequest.book_status) && l.a(this.service_descr, saveSlotAppointmentRequest.service_descr) && l.a(this.fit_officer, saveSlotAppointmentRequest.fit_officer) && this.mobile_no == saveSlotAppointmentRequest.mobile_no && l.a(this.paymemt_status, saveSlotAppointmentRequest.paymemt_status) && l.a(this.op_dateas_date, saveSlotAppointmentRequest.op_dateas_date) && l.a(this.op_date_release, saveSlotAppointmentRequest.op_date_release) && l.a(this.new_appl_no, saveSlotAppointmentRequest.new_appl_no) && l.a(this.new_appointment_dt, saveSlotAppointmentRequest.new_appointment_dt) && l.a(this.vh_class, saveSlotAppointmentRequest.vh_class) && l.a(this.vch_catg, saveSlotAppointmentRequest.vch_catg) && l.a(this.owner_name, saveSlotAppointmentRequest.owner_name) && l.a(this.vh_class_desc, saveSlotAppointmentRequest.vh_class_desc) && l.a(this.old_appointment_dt, saveSlotAppointmentRequest.old_appointment_dt) && l.a(this.shift_day_of_week, saveSlotAppointmentRequest.shift_day_of_week) && l.a(this.shift_slot_id, saveSlotAppointmentRequest.shift_slot_id);
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((this.state_cd.hashCode() * 31) + this.off_cd.hashCode()) * 31) + this.appt_id.hashCode()) * 31) + this.day_of_week.hashCode()) * 31) + this.slot_id.hashCode()) * 31) + this.service_id.hashCode()) * 31) + this.counter_id.hashCode()) * 31) + this.appl_no.hashCode()) * 31) + this.regn_no.hashCode()) * 31) + this.appointment_dt.hashCode()) * 31) + this.op_date.hashCode()) * 31) + this.count_reschedule.hashCode()) * 31) + this.book_status.hashCode()) * 31) + this.service_descr.hashCode()) * 31) + this.fit_officer.hashCode()) * 31) + Integer.hashCode(this.mobile_no)) * 31) + this.paymemt_status.hashCode()) * 31) + this.op_dateas_date.hashCode()) * 31) + this.op_date_release.hashCode()) * 31) + this.new_appl_no.hashCode()) * 31) + this.new_appointment_dt.hashCode()) * 31) + this.vh_class.hashCode()) * 31) + this.vch_catg.hashCode()) * 31) + this.owner_name.hashCode()) * 31) + this.vh_class_desc.hashCode()) * 31) + this.old_appointment_dt.hashCode()) * 31) + this.shift_day_of_week.hashCode()) * 31) + this.shift_slot_id.hashCode();
    }

    public String toString() {
        return "SaveSlotAppointmentRequest(state_cd=" + this.state_cd + ", off_cd=" + this.off_cd + ", appt_id=" + this.appt_id + ", day_of_week=" + this.day_of_week + ", slot_id=" + this.slot_id + ", service_id=" + this.service_id + ", counter_id=" + this.counter_id + ", appl_no=" + this.appl_no + ", regn_no=" + this.regn_no + ", appointment_dt=" + this.appointment_dt + ", op_date=" + this.op_date + ", count_reschedule=" + this.count_reschedule + ", book_status=" + this.book_status + ", service_descr=" + this.service_descr + ", fit_officer=" + this.fit_officer + ", mobile_no=" + this.mobile_no + ", paymemt_status=" + this.paymemt_status + ", op_dateas_date=" + this.op_dateas_date + ", op_date_release=" + this.op_date_release + ", new_appl_no=" + this.new_appl_no + ", new_appointment_dt=" + this.new_appointment_dt + ", vh_class=" + this.vh_class + ", vch_catg=" + this.vch_catg + ", owner_name=" + this.owner_name + ", vh_class_desc=" + this.vh_class_desc + ", old_appointment_dt=" + this.old_appointment_dt + ", shift_day_of_week=" + this.shift_day_of_week + ", shift_slot_id=" + this.shift_slot_id + ')';
    }
}
