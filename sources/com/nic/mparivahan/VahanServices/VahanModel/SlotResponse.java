package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;
import java.util.ArrayList;
import java.util.List;

@Keep
public final class SlotResponse {
    @c("slot_Details")
    private List<SlotDetails> slotDetails;
    @c("status_code")
    private String statusCode;
    @c("status_desc")
    private String statusDesc;

    public SlotResponse() {
        this((String) null, (String) null, (List) null, 7, (g) null);
    }

    public static /* synthetic */ SlotResponse copy$default(SlotResponse slotResponse, String str, String str2, List<SlotDetails> list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = slotResponse.statusCode;
        }
        if ((i10 & 2) != 0) {
            str2 = slotResponse.statusDesc;
        }
        if ((i10 & 4) != 0) {
            list = slotResponse.slotDetails;
        }
        return slotResponse.copy(str, str2, list);
    }

    public final String component1() {
        return this.statusCode;
    }

    public final String component2() {
        return this.statusDesc;
    }

    public final List<SlotDetails> component3() {
        return this.slotDetails;
    }

    public final SlotResponse copy(String str, String str2, List<SlotDetails> list) {
        l.f(list, "slotDetails");
        return new SlotResponse(str, str2, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SlotResponse)) {
            return false;
        }
        SlotResponse slotResponse = (SlotResponse) obj;
        return l.a(this.statusCode, slotResponse.statusCode) && l.a(this.statusDesc, slotResponse.statusDesc) && l.a(this.slotDetails, slotResponse.slotDetails);
    }

    public final List<SlotDetails> getSlotDetails() {
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

    public final void setSlotDetails(List<SlotDetails> list) {
        l.f(list, "<set-?>");
        this.slotDetails = list;
    }

    public final void setStatusCode(String str) {
        this.statusCode = str;
    }

    public final void setStatusDesc(String str) {
        this.statusDesc = str;
    }

    public String toString() {
        return "SlotResponse(statusCode=" + this.statusCode + ", statusDesc=" + this.statusDesc + ", slotDetails=" + this.slotDetails + ')';
    }

    public SlotResponse(String str, String str2, List<SlotDetails> list) {
        l.f(list, "slotDetails");
        this.statusCode = str;
        this.statusDesc = str2;
        this.slotDetails = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SlotResponse(String str, String str2, List list, int i10, g gVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? new ArrayList() : list);
    }
}
