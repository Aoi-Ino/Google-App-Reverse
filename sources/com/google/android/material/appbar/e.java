package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.k1;
import androidx.core.view.m0;
import androidx.core.view.o;
import java.util.List;
import y.a;

abstract class e extends f {

    /* renamed from: h  reason: collision with root package name */
    final Rect f5544h = new Rect();

    /* renamed from: i  reason: collision with root package name */
    final Rect f5545i = new Rect();

    /* renamed from: j  reason: collision with root package name */
    private int f5546j = 0;

    /* renamed from: k  reason: collision with root package name */
    private int f5547k;

    public e() {
    }

    private static int R(int i10) {
        if (i10 == 0) {
            return 8388659;
        }
        return i10;
    }

    /* access modifiers changed from: protected */
    public void J(CoordinatorLayout coordinatorLayout, View view, int i10) {
        int i11;
        View L = L(coordinatorLayout.r(view));
        if (L != null) {
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
            Rect rect = this.f5544h;
            rect.set(coordinatorLayout.getPaddingLeft() + fVar.leftMargin, L.getBottom() + fVar.topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - fVar.rightMargin, ((coordinatorLayout.getHeight() + L.getBottom()) - coordinatorLayout.getPaddingBottom()) - fVar.bottomMargin);
            k1 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null && m0.y(coordinatorLayout) && !m0.y(view)) {
                rect.left += lastWindowInsets.j();
                rect.right -= lastWindowInsets.k();
            }
            Rect rect2 = this.f5545i;
            o.a(R(fVar.f2172c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i10);
            int M = M(L);
            view.layout(rect2.left, rect2.top - M, rect2.right, rect2.bottom - M);
            i11 = rect2.top - L.getBottom();
        } else {
            super.J(coordinatorLayout, view, i10);
            i11 = 0;
        }
        this.f5546j = i11;
    }

    /* access modifiers changed from: package-private */
    public abstract View L(List list);

    /* access modifiers changed from: package-private */
    public final int M(View view) {
        if (this.f5547k == 0) {
            return 0;
        }
        float N = N(view);
        int i10 = this.f5547k;
        return a.b((int) (N * ((float) i10)), 0, i10);
    }

    /* access modifiers changed from: package-private */
    public abstract float N(View view);

    public final int O() {
        return this.f5547k;
    }

    /* access modifiers changed from: package-private */
    public int P(View view) {
        return view.getMeasuredHeight();
    }

    /* access modifiers changed from: package-private */
    public final int Q() {
        return this.f5546j;
    }

    public final void S(int i10) {
        this.f5547k = i10;
    }

    /* access modifiers changed from: protected */
    public boolean T() {
        return false;
    }

    public boolean q(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int i13) {
        View L;
        k1 lastWindowInsets;
        int i14 = view.getLayoutParams().height;
        if ((i14 != -1 && i14 != -2) || (L = L(coordinatorLayout.r(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i12);
        if (size <= 0) {
            size = coordinatorLayout.getHeight();
        } else if (m0.y(L) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
            size += lastWindowInsets.l() + lastWindowInsets.i();
        }
        int P = size + P(L);
        int measuredHeight = L.getMeasuredHeight();
        if (T()) {
            view.setTranslationY((float) (-measuredHeight));
        } else {
            view.setTranslationY(0.0f);
            P -= measuredHeight;
        }
        coordinatorLayout.J(view, i10, i11, View.MeasureSpec.makeMeasureSpec(P, i14 == -1 ? 1073741824 : Integer.MIN_VALUE), i13);
        return true;
    }

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
