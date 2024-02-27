package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

abstract class f extends CoordinatorLayout.c {

    /* renamed from: e  reason: collision with root package name */
    private g f5548e;

    /* renamed from: f  reason: collision with root package name */
    private int f5549f = 0;

    /* renamed from: g  reason: collision with root package name */
    private int f5550g = 0;

    public f() {
    }

    public int I() {
        g gVar = this.f5548e;
        if (gVar != null) {
            return gVar.b();
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public void J(CoordinatorLayout coordinatorLayout, View view, int i10) {
        coordinatorLayout.I(view, i10);
    }

    public boolean K(int i10) {
        g gVar = this.f5548e;
        if (gVar != null) {
            return gVar.e(i10);
        }
        this.f5549f = i10;
        return false;
    }

    public boolean p(CoordinatorLayout coordinatorLayout, View view, int i10) {
        J(coordinatorLayout, view, i10);
        if (this.f5548e == null) {
            this.f5548e = new g(view);
        }
        this.f5548e.c();
        this.f5548e.a();
        int i11 = this.f5549f;
        if (i11 != 0) {
            this.f5548e.e(i11);
            this.f5549f = 0;
        }
        int i12 = this.f5550g;
        if (i12 == 0) {
            return true;
        }
        this.f5548e.d(i12);
        this.f5550g = 0;
        return true;
    }

    public f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
