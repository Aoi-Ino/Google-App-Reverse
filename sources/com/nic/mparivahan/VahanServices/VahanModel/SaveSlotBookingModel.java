package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class SaveSlotBookingModel {
    private final String value;

    public SaveSlotBookingModel(String str) {
        this.value = str;
    }

    public static /* synthetic */ SaveSlotBookingModel copy$default(SaveSlotBookingModel saveSlotBookingModel, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = saveSlotBookingModel.value;
        }
        return saveSlotBookingModel.copy(str);
    }

    public final String component1() {
        return this.value;
    }

    public final SaveSlotBookingModel copy(String str) {
        return new SaveSlotBookingModel(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SaveSlotBookingModel) && l.a(this.value, ((SaveSlotBookingModel) obj).value);
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        String str = this.value;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return "SaveSlotBookingModel(value=" + this.value + ')';
    }
}
