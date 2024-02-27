package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;
import java.util.ArrayList;
import java.util.List;

@Keep
public final class SlotDetails {
    @c("date")
    private String date;
    @c("label")
    private String label;
    @c("slots")
    private List<Slots> slots;

    public SlotDetails() {
        this((String) null, (String) null, (List) null, 7, (g) null);
    }

    public static /* synthetic */ SlotDetails copy$default(SlotDetails slotDetails, String str, String str2, List<Slots> list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = slotDetails.date;
        }
        if ((i10 & 2) != 0) {
            str2 = slotDetails.label;
        }
        if ((i10 & 4) != 0) {
            list = slotDetails.slots;
        }
        return slotDetails.copy(str, str2, list);
    }

    public final String component1() {
        return this.date;
    }

    public final String component2() {
        return this.label;
    }

    public final List<Slots> component3() {
        return this.slots;
    }

    public final SlotDetails copy(String str, String str2, List<Slots> list) {
        l.f(list, "slots");
        return new SlotDetails(str, str2, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SlotDetails)) {
            return false;
        }
        SlotDetails slotDetails = (SlotDetails) obj;
        return l.a(this.date, slotDetails.date) && l.a(this.label, slotDetails.label) && l.a(this.slots, slotDetails.slots);
    }

    public final String getDate() {
        return this.date;
    }

    public final String getLabel() {
        return this.label;
    }

    public final List<Slots> getSlots() {
        return this.slots;
    }

    public int hashCode() {
        String str = this.date;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.label;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return ((hashCode + i10) * 31) + this.slots.hashCode();
    }

    public final void setDate(String str) {
        this.date = str;
    }

    public final void setLabel(String str) {
        this.label = str;
    }

    public final void setSlots(List<Slots> list) {
        l.f(list, "<set-?>");
        this.slots = list;
    }

    public String toString() {
        return "SlotDetails(date=" + this.date + ", label=" + this.label + ", slots=" + this.slots + ')';
    }

    public SlotDetails(String str, String str2, List<Slots> list) {
        l.f(list, "slots");
        this.date = str;
        this.label = str2;
        this.slots = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SlotDetails(String str, String str2, List list, int i10, g gVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? new ArrayList() : list);
    }
}
