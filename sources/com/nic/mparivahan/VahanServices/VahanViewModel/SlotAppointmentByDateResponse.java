package com.nic.mparivahan.VahanServices.VahanViewModel;

import androidx.annotation.Keep;
import java.util.ArrayList;

@Keep
public final class SlotAppointmentByDateResponse extends ArrayList<SlotAppointmentModel> {
    public /* bridge */ boolean contains(SlotAppointmentModel slotAppointmentModel) {
        return super.contains(slotAppointmentModel);
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    public /* bridge */ int indexOf(SlotAppointmentModel slotAppointmentModel) {
        return super.indexOf(slotAppointmentModel);
    }

    public /* bridge */ int lastIndexOf(SlotAppointmentModel slotAppointmentModel) {
        return super.lastIndexOf(slotAppointmentModel);
    }

    public final /* bridge */ SlotAppointmentModel remove(int i10) {
        return removeAt(i10);
    }

    public /* bridge */ SlotAppointmentModel removeAt(int i10) {
        return (SlotAppointmentModel) super.remove(i10);
    }

    public final /* bridge */ int size() {
        return getSize();
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof SlotAppointmentModel)) {
            return false;
        }
        return contains((SlotAppointmentModel) obj);
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof SlotAppointmentModel)) {
            return -1;
        }
        return indexOf((SlotAppointmentModel) obj);
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof SlotAppointmentModel)) {
            return -1;
        }
        return lastIndexOf((SlotAppointmentModel) obj);
    }

    public /* bridge */ boolean remove(SlotAppointmentModel slotAppointmentModel) {
        return super.remove(slotAppointmentModel);
    }

    public final /* bridge */ boolean remove(Object obj) {
        if (!(obj instanceof SlotAppointmentModel)) {
            return false;
        }
        return remove((SlotAppointmentModel) obj);
    }
}
