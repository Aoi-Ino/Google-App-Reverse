package com.google.android.material.datepicker;

import androidx.fragment.app.i;
import java.util.LinkedHashSet;

abstract class q extends i {

    /* renamed from: h0  reason: collision with root package name */
    protected final LinkedHashSet f5962h0 = new LinkedHashSet();

    q() {
    }

    /* access modifiers changed from: package-private */
    public boolean V1(p pVar) {
        return this.f5962h0.add(pVar);
    }

    /* access modifiers changed from: package-private */
    public void W1() {
        this.f5962h0.clear();
    }
}
