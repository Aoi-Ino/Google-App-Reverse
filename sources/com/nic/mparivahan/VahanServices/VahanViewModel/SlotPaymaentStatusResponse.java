package com.nic.mparivahan.VahanServices.VahanViewModel;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class SlotPaymaentStatusResponse {
    private final String value;

    public SlotPaymaentStatusResponse(String str) {
        l.f(str, "value");
        this.value = str;
    }

    public static /* synthetic */ SlotPaymaentStatusResponse copy$default(SlotPaymaentStatusResponse slotPaymaentStatusResponse, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = slotPaymaentStatusResponse.value;
        }
        return slotPaymaentStatusResponse.copy(str);
    }

    public final String component1() {
        return this.value;
    }

    public final SlotPaymaentStatusResponse copy(String str) {
        l.f(str, "value");
        return new SlotPaymaentStatusResponse(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SlotPaymaentStatusResponse) && l.a(this.value, ((SlotPaymaentStatusResponse) obj).value);
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    public String toString() {
        return "SlotPaymaentStatusResponse(value=" + this.value + ')';
    }
}
