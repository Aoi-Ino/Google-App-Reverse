package com.google.android.material.appbar;

import android.view.View;
import androidx.core.view.m0;

class g {

    /* renamed from: a  reason: collision with root package name */
    private final View f5551a;

    /* renamed from: b  reason: collision with root package name */
    private int f5552b;

    /* renamed from: c  reason: collision with root package name */
    private int f5553c;

    /* renamed from: d  reason: collision with root package name */
    private int f5554d;

    /* renamed from: e  reason: collision with root package name */
    private int f5555e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f5556f = true;

    /* renamed from: g  reason: collision with root package name */
    private boolean f5557g = true;

    public g(View view) {
        this.f5551a = view;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        View view = this.f5551a;
        m0.b0(view, this.f5554d - (view.getTop() - this.f5552b));
        View view2 = this.f5551a;
        m0.a0(view2, this.f5555e - (view2.getLeft() - this.f5553c));
    }

    public int b() {
        return this.f5554d;
    }

    /* access modifiers changed from: package-private */
    public void c() {
        this.f5552b = this.f5551a.getTop();
        this.f5553c = this.f5551a.getLeft();
    }

    public boolean d(int i10) {
        if (!this.f5557g || this.f5555e == i10) {
            return false;
        }
        this.f5555e = i10;
        a();
        return true;
    }

    public boolean e(int i10) {
        if (!this.f5556f || this.f5554d == i10) {
            return false;
        }
        this.f5554d = i10;
        a();
        return true;
    }
}
