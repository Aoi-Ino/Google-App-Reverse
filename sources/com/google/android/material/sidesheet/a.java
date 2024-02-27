package com.google.android.material.sidesheet;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

final class a extends c {

    /* renamed from: a  reason: collision with root package name */
    final SideSheetBehavior f6273a;

    a(SideSheetBehavior sideSheetBehavior) {
        this.f6273a = sideSheetBehavior;
    }

    /* access modifiers changed from: package-private */
    public int a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.leftMargin;
    }

    /* access modifiers changed from: package-private */
    public float b(int i10) {
        float e10 = (float) e();
        return (((float) i10) - e10) / (((float) d()) - e10);
    }

    /* access modifiers changed from: package-private */
    public int c(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.leftMargin;
    }

    /* access modifiers changed from: package-private */
    public int d() {
        return Math.max(0, this.f6273a.m0() + this.f6273a.k0());
    }

    /* access modifiers changed from: package-private */
    public int e() {
        return (-this.f6273a.d0()) - this.f6273a.k0();
    }

    /* access modifiers changed from: package-private */
    public int f() {
        return this.f6273a.k0();
    }

    /* access modifiers changed from: package-private */
    public int g() {
        return -this.f6273a.d0();
    }

    /* access modifiers changed from: package-private */
    public int h(View view) {
        return view.getRight() + this.f6273a.k0();
    }

    public int i(CoordinatorLayout coordinatorLayout) {
        return coordinatorLayout.getLeft();
    }

    /* access modifiers changed from: package-private */
    public int j() {
        return 1;
    }

    /* access modifiers changed from: package-private */
    public boolean k(float f10) {
        return f10 > 0.0f;
    }

    /* access modifiers changed from: package-private */
    public boolean l(View view) {
        return view.getRight() < (d() - e()) / 2;
    }

    /* access modifiers changed from: package-private */
    public boolean m(float f10, float f11) {
        return d.a(f10, f11) && Math.abs(f10) > ((float) this.f6273a.o0());
    }

    /* access modifiers changed from: package-private */
    public boolean n(View view, float f10) {
        return Math.abs(((float) view.getLeft()) + (f10 * this.f6273a.i0())) > this.f6273a.j0();
    }

    /* access modifiers changed from: package-private */
    public void o(ViewGroup.MarginLayoutParams marginLayoutParams, int i10) {
        marginLayoutParams.leftMargin = i10;
    }

    /* access modifiers changed from: package-private */
    public void p(ViewGroup.MarginLayoutParams marginLayoutParams, int i10, int i11) {
        if (i10 <= this.f6273a.n0()) {
            marginLayoutParams.leftMargin = i11;
        }
    }
}
