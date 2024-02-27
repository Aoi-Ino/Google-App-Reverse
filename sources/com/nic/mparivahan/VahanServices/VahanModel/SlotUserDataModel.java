package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import cm.l;
import java.util.ArrayList;

@Keep
public final class SlotUserDataModel {
    private final ArrayList<String> alreadyBookedDates;
    private final String appl_no;
    private final ArrayList<String> availableDates;
    private final ArrayList<String> holidayDeclareDates;
    private final String off_cd;
    private final SlotOwnerData owner_dobj;
    private final String pur_cd;
    private final String regn_no;
    private final ArrayList<String> sel_services;
    private final String state_cd;

    public SlotUserDataModel(String str, String str2, String str3, String str4, String str5, SlotOwnerData slotOwnerData, ArrayList<String> arrayList, ArrayList<String> arrayList2, ArrayList<String> arrayList3, ArrayList<String> arrayList4) {
        l.f(str, "regn_no");
        l.f(str2, "appl_no");
        l.f(str3, "state_cd");
        l.f(str4, "off_cd");
        l.f(str5, "pur_cd");
        l.f(slotOwnerData, "owner_dobj");
        l.f(arrayList, "sel_services");
        l.f(arrayList2, "availableDates");
        l.f(arrayList3, "alreadyBookedDates");
        l.f(arrayList4, "holidayDeclareDates");
        this.regn_no = str;
        this.appl_no = str2;
        this.state_cd = str3;
        this.off_cd = str4;
        this.pur_cd = str5;
        this.owner_dobj = slotOwnerData;
        this.sel_services = arrayList;
        this.availableDates = arrayList2;
        this.alreadyBookedDates = arrayList3;
        this.holidayDeclareDates = arrayList4;
    }

    public static /* synthetic */ SlotUserDataModel copy$default(SlotUserDataModel slotUserDataModel, String str, String str2, String str3, String str4, String str5, SlotOwnerData slotOwnerData, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, int i10, Object obj) {
        SlotUserDataModel slotUserDataModel2 = slotUserDataModel;
        int i11 = i10;
        return slotUserDataModel.copy((i11 & 1) != 0 ? slotUserDataModel2.regn_no : str, (i11 & 2) != 0 ? slotUserDataModel2.appl_no : str2, (i11 & 4) != 0 ? slotUserDataModel2.state_cd : str3, (i11 & 8) != 0 ? slotUserDataModel2.off_cd : str4, (i11 & 16) != 0 ? slotUserDataModel2.pur_cd : str5, (i11 & 32) != 0 ? slotUserDataModel2.owner_dobj : slotOwnerData, (i11 & 64) != 0 ? slotUserDataModel2.sel_services : arrayList, (i11 & 128) != 0 ? slotUserDataModel2.availableDates : arrayList2, (i11 & 256) != 0 ? slotUserDataModel2.alreadyBookedDates : arrayList3, (i11 & 512) != 0 ? slotUserDataModel2.holidayDeclareDates : arrayList4);
    }

    public final String component1() {
        return this.regn_no;
    }

    public final ArrayList<String> component10() {
        return this.holidayDeclareDates;
    }

    public final String component2() {
        return this.appl_no;
    }

    public final String component3() {
        return this.state_cd;
    }

    public final String component4() {
        return this.off_cd;
    }

    public final String component5() {
        return this.pur_cd;
    }

    public final SlotOwnerData component6() {
        return this.owner_dobj;
    }

    public final ArrayList<String> component7() {
        return this.sel_services;
    }

    public final ArrayList<String> component8() {
        return this.availableDates;
    }

    public final ArrayList<String> component9() {
        return this.alreadyBookedDates;
    }

    public final SlotUserDataModel copy(String str, String str2, String str3, String str4, String str5, SlotOwnerData slotOwnerData, ArrayList<String> arrayList, ArrayList<String> arrayList2, ArrayList<String> arrayList3, ArrayList<String> arrayList4) {
        l.f(str, "regn_no");
        l.f(str2, "appl_no");
        l.f(str3, "state_cd");
        String str6 = str4;
        l.f(str6, "off_cd");
        String str7 = str5;
        l.f(str7, "pur_cd");
        SlotOwnerData slotOwnerData2 = slotOwnerData;
        l.f(slotOwnerData2, "owner_dobj");
        ArrayList<String> arrayList5 = arrayList;
        l.f(arrayList5, "sel_services");
        ArrayList<String> arrayList6 = arrayList2;
        l.f(arrayList6, "availableDates");
        ArrayList<String> arrayList7 = arrayList3;
        l.f(arrayList7, "alreadyBookedDates");
        ArrayList<String> arrayList8 = arrayList4;
        l.f(arrayList8, "holidayDeclareDates");
        return new SlotUserDataModel(str, str2, str3, str6, str7, slotOwnerData2, arrayList5, arrayList6, arrayList7, arrayList8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SlotUserDataModel)) {
            return false;
        }
        SlotUserDataModel slotUserDataModel = (SlotUserDataModel) obj;
        return l.a(this.regn_no, slotUserDataModel.regn_no) && l.a(this.appl_no, slotUserDataModel.appl_no) && l.a(this.state_cd, slotUserDataModel.state_cd) && l.a(this.off_cd, slotUserDataModel.off_cd) && l.a(this.pur_cd, slotUserDataModel.pur_cd) && l.a(this.owner_dobj, slotUserDataModel.owner_dobj) && l.a(this.sel_services, slotUserDataModel.sel_services) && l.a(this.availableDates, slotUserDataModel.availableDates) && l.a(this.alreadyBookedDates, slotUserDataModel.alreadyBookedDates) && l.a(this.holidayDeclareDates, slotUserDataModel.holidayDeclareDates);
    }

    public final ArrayList<String> getAlreadyBookedDates() {
        return this.alreadyBookedDates;
    }

    public final String getAppl_no() {
        return this.appl_no;
    }

    public final ArrayList<String> getAvailableDates() {
        return this.availableDates;
    }

    public final ArrayList<String> getHolidayDeclareDates() {
        return this.holidayDeclareDates;
    }

    public final String getOff_cd() {
        return this.off_cd;
    }

    public final SlotOwnerData getOwner_dobj() {
        return this.owner_dobj;
    }

    public final String getPur_cd() {
        return this.pur_cd;
    }

    public final String getRegn_no() {
        return this.regn_no;
    }

    public final ArrayList<String> getSel_services() {
        return this.sel_services;
    }

    public final String getState_cd() {
        return this.state_cd;
    }

    public int hashCode() {
        return (((((((((((((((((this.regn_no.hashCode() * 31) + this.appl_no.hashCode()) * 31) + this.state_cd.hashCode()) * 31) + this.off_cd.hashCode()) * 31) + this.pur_cd.hashCode()) * 31) + this.owner_dobj.hashCode()) * 31) + this.sel_services.hashCode()) * 31) + this.availableDates.hashCode()) * 31) + this.alreadyBookedDates.hashCode()) * 31) + this.holidayDeclareDates.hashCode();
    }

    public String toString() {
        return "SlotUserDataModel(regn_no=" + this.regn_no + ", appl_no=" + this.appl_no + ", state_cd=" + this.state_cd + ", off_cd=" + this.off_cd + ", pur_cd=" + this.pur_cd + ", owner_dobj=" + this.owner_dobj + ", sel_services=" + this.sel_services + ", availableDates=" + this.availableDates + ", alreadyBookedDates=" + this.alreadyBookedDates + ", holidayDeclareDates=" + this.holidayDeclareDates + ')';
    }
}
