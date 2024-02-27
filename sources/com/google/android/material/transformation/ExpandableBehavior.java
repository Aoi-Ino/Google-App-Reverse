package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.m0;
import java.util.List;

@Deprecated
public abstract class ExpandableBehavior extends CoordinatorLayout.c {
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public int f6583e = 0;

    class a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ View f6584e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f6585f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ b5.a f6586g;

        a(View view, int i10, b5.a aVar) {
            this.f6584e = view;
            this.f6585f = i10;
            this.f6586g = aVar;
        }

        public boolean onPreDraw() {
            this.f6584e.getViewTreeObserver().removeOnPreDrawListener(this);
            if (ExpandableBehavior.this.f6583e == this.f6585f) {
                ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
                b5.a aVar = this.f6586g;
                expandableBehavior.L((View) aVar, this.f6584e, aVar.a(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
    }

    private boolean J(boolean z10) {
        if (!z10) {
            return this.f6583e == 1;
        }
        int i10 = this.f6583e;
        return i10 == 0 || i10 == 2;
    }

    /* access modifiers changed from: protected */
    public b5.a K(CoordinatorLayout coordinatorLayout, View view) {
        List r10 = coordinatorLayout.r(view);
        int size = r10.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view2 = (View) r10.get(i10);
            if (i(coordinatorLayout, view, view2)) {
                return (b5.a) view2;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public abstract boolean L(View view, View view2, boolean z10, boolean z11);

    public abstract boolean i(CoordinatorLayout coordinatorLayout, View view, View view2);

    public boolean l(CoordinatorLayout coordinatorLayout, View view, View view2) {
        b5.a aVar = (b5.a) view2;
        if (!J(aVar.a())) {
            return false;
        }
        this.f6583e = aVar.a() ? 1 : 2;
        return L((View) aVar, view, aVar.a(), true);
    }

    public boolean p(CoordinatorLayout coordinatorLayout, View view, int i10) {
        b5.a K;
        if (m0.U(view) || (K = K(coordinatorLayout, view)) == null || !J(K.a())) {
            return false;
        }
        int i11 = K.a() ? 1 : 2;
        this.f6583e = i11;
        view.getViewTreeObserver().addOnPreDrawListener(new a(view, i11, K));
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
