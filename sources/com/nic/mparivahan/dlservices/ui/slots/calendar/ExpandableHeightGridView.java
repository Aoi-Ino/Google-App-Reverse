package com.nic.mparivahan.dlservices.ui.slots.calendar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.GridView;

public final class ExpandableHeightGridView extends GridView {

    /* renamed from: e  reason: collision with root package name */
    private boolean f22372e;

    public ExpandableHeightGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onMeasure(int i10, int i11) {
        if (this.f22372e) {
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
            getLayoutParams().height = getMeasuredHeight();
            return;
        }
        super.onMeasure(i10, i11);
    }

    public final void setExpanded(boolean z10) {
        this.f22372e = z10;
    }
}
