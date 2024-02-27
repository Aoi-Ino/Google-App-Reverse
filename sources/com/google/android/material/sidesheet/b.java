package com.google.android.material.sidesheet;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

final class b extends c {

    /* renamed from: a  reason: collision with root package name */
    final SideSheetBehavior f6274a;

    b(SideSheetBehavior sideSheetBehavior) {
        this.f6274a = sideSheetBehavior;
    }

    /* access modifiers changed from: package-private */
    public int a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.rightMargin;
    }

    /* access modifiers changed from: package-private */
    public float b(int i10) {
        float e10 = (float) e();
        return (e10 - ((float) i10)) / (e10 - ((float) d()));
    }

    /* access modifiers changed from: package-private */
    public int c(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.rightMargin;
    }

    /* access modifiers changed from: package-private */
    public int d() {
        return Math.max(0, (e() - this.f6274a.d0()) - this.f6274a.k0());
    }

    /* access modifiers changed from: package-private */
    public int e() {
        return this.f6274a.n0();
    }

    /* access modifiers changed from: package-private */
    public int f() {
        return this.f6274a.n0();
    }

    /* access modifiers changed from: package-private */
    public int g() {
        return d();
    }

    /* access modifiers changed from: package-private */
    public int h(View view) {
        return view.getLeft() - this.f6274a.k0();
    }

    public int i(CoordinatorLayout coordinatorLayout) {
        return coordinatorLayout.getRight();
    }

    /* access modifiers changed from: package-private */
    public int j() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public boolean k(float f10) {
        return f10 < 0.0f;
    }

    /* access modifiers changed from: package-private */
    public boolean l(View view) {
        return view.getLeft() > (e() + d()) / 2;
    }

    /* access modifiers changed from: package-private */
    public boolean m(float f10, float f11) {
        return d.a(f10, f11) && Math.abs(f10) > ((float) this.f6274a.o0());
    }

    /* access modifiers changed from: package-private */
    public boolean n(View view, float f10) {
        return Math.abs(((float) view.getRight()) + (f10 * this.f6274a.i0())) > this.f6274a.j0();
    }

    /* access modifiers changed from: package-private */
    public void o(ViewGroup.MarginLayoutParams marginLayoutParams, int i10) {
        marginLayoutParams.rightMargin = i10;
    }

    /* access modifiers changed from: package-private */
    public void p(ViewGroup.MarginLayoutParams marginLayoutParams, int i10, int i11) {
        int n02 = this.f6274a.n0();
        if (i10 <= n02) {
            marginLayoutParams.rightMargin = n02 - i10;
        }
    }
}
