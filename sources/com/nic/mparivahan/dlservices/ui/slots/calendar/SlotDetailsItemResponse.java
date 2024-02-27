package com.nic.mparivahan.dlservices.ui.slots.calendar;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;
import java.util.ArrayList;

@Keep
public final class SlotDetailsItemResponse {
    @c("Slot_Details")
    private final ArrayList<SlotDetailsItem> slotDetails;
    @c("status_code")
    private final String statusCode;
    @c("status_desc")
    private final String statusDesc;

    public SlotDetailsItemResponse(String str, String str2, ArrayList<SlotDetailsItem> arrayList) {
        l.f(arrayList, "slotDetails");
        this.statusCode = str;
        this.statusDesc = str2;
        this.slotDetails = arrayList;
    }

    public static /* synthetic */ SlotDetailsItemResponse copy$default(SlotDetailsItemResponse slotDetailsItemResponse, String str, String str2, ArrayList<SlotDetailsItem> arrayList, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = slotDetailsItemResponse.statusCode;
        }
        if ((i10 & 2) != 0) {
            str2 = slotDetailsItemResponse.statusDesc;
        }
        if ((i10 & 4) != 0) {
            arrayList = slotDetailsItemResponse.slotDetails;
        }
        return slotDetailsItemResponse.copy(str, str2, arrayList);
    }

    public final String component1() {
        return this.statusCode;
    }

    public final String component2() {
        return this.statusDesc;
    }

    public final ArrayList<SlotDetailsItem> component3() {
        return this.slotDetails;
    }

    public final SlotDetailsItemResponse copy(String str, String str2, ArrayList<SlotDetailsItem> arrayList) {
        l.f(arrayList, "slotDetails");
        return new SlotDetailsItemResponse(str, str2, arrayList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SlotDetailsItemResponse)) {
            return false;
        }
        SlotDetailsItemResponse slotDetailsItemResponse = (SlotDetailsItemResponse) obj;
        return l.a(this.statusCode, slotDetailsItemResponse.statusCode) && l.a(this.statusDesc, slotDetailsItemResponse.statusDesc) && l.a(this.slotDetails, slotDetailsItemResponse.slotDetails);
    }

    public final ArrayList<SlotDetailsItem> getSlotDetails() {
        return this.slotDetails;
    }

    public final String getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public int hashCode() {
        String str = this.statusCode;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.statusDesc;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return ((hashCode + i10) * 31) + this.slotDetails.hashCode();
    }

    public String toString() {
        return "SlotDetailsItemResponse(statusCode=" + this.statusCode + ", statusDesc=" + this.statusDesc + ", slotDetails=" + this.slotDetails + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SlotDetailsItemResponse(String str, String str2, ArrayList arrayList, int i10, g gVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, arrayList);
    }
}
