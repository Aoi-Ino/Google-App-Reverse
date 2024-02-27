package com.nic.mparivahan.VahanServices.VahanViewModel;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class SlotAppointmentErrorModel {
    private final String errorDesc;
    private final int errorcode;

    public SlotAppointmentErrorModel(int i10, String str) {
        l.f(str, "errorDesc");
        this.errorcode = i10;
        this.errorDesc = str;
    }

    public static /* synthetic */ SlotAppointmentErrorModel copy$default(SlotAppointmentErrorModel slotAppointmentErrorModel, int i10, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = slotAppointmentErrorModel.errorcode;
        }
        if ((i11 & 2) != 0) {
            str = slotAppointmentErrorModel.errorDesc;
        }
        return slotAppointmentErrorModel.copy(i10, str);
    }

    public final int component1() {
        return this.errorcode;
    }

    public final String component2() {
        return this.errorDesc;
    }

    public final SlotAppointmentErrorModel copy(int i10, String str) {
        l.f(str, "errorDesc");
        return new SlotAppointmentErrorModel(i10, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SlotAppointmentErrorModel)) {
            return false;
        }
        SlotAppointmentErrorModel slotAppointmentErrorModel = (SlotAppointmentErrorModel) obj;
        return this.errorcode == slotAppointmentErrorModel.errorcode && l.a(this.errorDesc, slotAppointmentErrorModel.errorDesc);
    }

    public final String getErrorDesc() {
        return this.errorDesc;
    }

    public final int getErrorcode() {
        return this.errorcode;
    }

    public int hashCode() {
        return (Integer.hashCode(this.errorcode) * 31) + this.errorDesc.hashCode();
    }

    public String toString() {
        return "SlotAppointmentErrorModel(errorcode=" + this.errorcode + ", errorDesc=" + this.errorDesc + ')';
    }
}
