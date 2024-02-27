package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;

public abstract class v extends ImageButton {

    /* renamed from: e  reason: collision with root package name */
    private int f6217e = getVisibility();

    public v(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    public final void b(int i10, boolean z10) {
        super.setVisibility(i10);
        if (z10) {
            this.f6217e = i10;
        }
    }

    public final int getUserSetVisibility() {
        return this.f6217e;
    }

    public void setVisibility(int i10) {
        b(i10, true);
    }
}
