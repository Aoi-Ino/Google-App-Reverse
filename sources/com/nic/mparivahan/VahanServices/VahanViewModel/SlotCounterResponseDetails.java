package com.nic.mparivahan.VahanServices.VahanViewModel;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class SlotCounterResponseDetails {
    private final String value;

    public SlotCounterResponseDetails(String str) {
        l.f(str, "value");
        this.value = str;
    }

    public static /* synthetic */ SlotCounterResponseDetails copy$default(SlotCounterResponseDetails slotCounterResponseDetails, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = slotCounterResponseDetails.value;
        }
        return slotCounterResponseDetails.copy(str);
    }

    public final String component1() {
        return this.value;
    }

    public final SlotCounterResponseDetails copy(String str) {
        l.f(str, "value");
        return new SlotCounterResponseDetails(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SlotCounterResponseDetails) && l.a(this.value, ((SlotCounterResponseDetails) obj).value);
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    public String toString() {
        return "SlotCounterResponseDetails(value=" + this.value + ')';
    }
}
