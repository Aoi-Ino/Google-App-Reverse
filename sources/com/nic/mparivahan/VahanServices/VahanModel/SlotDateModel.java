package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class SlotDateModel {
    private int color;
    private DateSlotModel dateSlotModel;
    private String text;

    public SlotDateModel(int i10, String str, DateSlotModel dateSlotModel2) {
        l.f(str, "text");
        l.f(dateSlotModel2, "dateSlotModel");
        this.color = i10;
        this.text = str;
        this.dateSlotModel = dateSlotModel2;
    }

    public final int getColor() {
        return this.color;
    }

    public final DateSlotModel getDateSlotModel() {
        return this.dateSlotModel;
    }

    public final String getText() {
        return this.text;
    }

    public final void setColor(int i10) {
        this.color = i10;
    }

    public final void setDateSlotModel(DateSlotModel dateSlotModel2) {
        this.dateSlotModel = dateSlotModel2;
    }

    public final void setText(String str) {
        l.f(str, "<set-?>");
        this.text = str;
    }
}
