package com.nic.mparivahan.VahanServices.VahanViewModel;

import androidx.annotation.Keep;
import cm.l;
import java.util.ArrayList;

@Keep
public final class SlotAppointmentRequest {
    private final String appl_no;
    private final String book_dt;
    private final String off_cd;
    private final String regn_no;
    private final ArrayList<String> sel_services;
    private final String state_cd;

    public SlotAppointmentRequest(String str, String str2, String str3, String str4, String str5, ArrayList<String> arrayList) {
        l.f(str, "regn_no");
        l.f(str2, "appl_no");
        l.f(str3, "state_cd");
        l.f(str4, "off_cd");
        l.f(str5, "book_dt");
        l.f(arrayList, "sel_services");
        this.regn_no = str;
        this.appl_no = str2;
        this.state_cd = str3;
        this.off_cd = str4;
        this.book_dt = str5;
        this.sel_services = arrayList;
    }

    private final String component1() {
        return this.regn_no;
    }

    private final String component2() {
        return this.appl_no;
    }

    private final String component3() {
        return this.state_cd;
    }

    private final String component4() {
        return this.off_cd;
    }

    private final String component5() {
        return this.book_dt;
    }

    private final ArrayList<String> component6() {
        return this.sel_services;
    }

    public static /* synthetic */ SlotAppointmentRequest copy$default(SlotAppointmentRequest slotAppointmentRequest, String str, String str2, String str3, String str4, String str5, ArrayList<String> arrayList, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = slotAppointmentRequest.regn_no;
        }
        if ((i10 & 2) != 0) {
            str2 = slotAppointmentRequest.appl_no;
        }
        String str6 = str2;
        if ((i10 & 4) != 0) {
            str3 = slotAppointmentRequest.state_cd;
        }
        String str7 = str3;
        if ((i10 & 8) != 0) {
            str4 = slotAppointmentRequest.off_cd;
        }
        String str8 = str4;
        if ((i10 & 16) != 0) {
            str5 = slotAppointmentRequest.book_dt;
        }
        String str9 = str5;
        if ((i10 & 32) != 0) {
            arrayList = slotAppointmentRequest.sel_services;
        }
        return slotAppointmentRequest.copy(str, str6, str7, str8, str9, arrayList);
    }

    public final SlotAppointmentRequest copy(String str, String str2, String str3, String str4, String str5, ArrayList<String> arrayList) {
        l.f(str, "regn_no");
        l.f(str2, "appl_no");
        l.f(str3, "state_cd");
        l.f(str4, "off_cd");
        l.f(str5, "book_dt");
        l.f(arrayList, "sel_services");
        return new SlotAppointmentRequest(str, str2, str3, str4, str5, arrayList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SlotAppointmentRequest)) {
            return false;
        }
        SlotAppointmentRequest slotAppointmentRequest = (SlotAppointmentRequest) obj;
        return l.a(this.regn_no, slotAppointmentRequest.regn_no) && l.a(this.appl_no, slotAppointmentRequest.appl_no) && l.a(this.state_cd, slotAppointmentRequest.state_cd) && l.a(this.off_cd, slotAppointmentRequest.off_cd) && l.a(this.book_dt, slotAppointmentRequest.book_dt) && l.a(this.sel_services, slotAppointmentRequest.sel_services);
    }

    public int hashCode() {
        return (((((((((this.regn_no.hashCode() * 31) + this.appl_no.hashCode()) * 31) + this.state_cd.hashCode()) * 31) + this.off_cd.hashCode()) * 31) + this.book_dt.hashCode()) * 31) + this.sel_services.hashCode();
    }

    public String toString() {
        return "SlotAppointmentRequest(regn_no=" + this.regn_no + ", appl_no=" + this.appl_no + ", state_cd=" + this.state_cd + ", off_cd=" + this.off_cd + ", book_dt=" + this.book_dt + ", sel_services=" + this.sel_services + ')';
    }
}
