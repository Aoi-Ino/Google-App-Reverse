package com.google.android.material.carousel;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

abstract class c {

    /* renamed from: a  reason: collision with root package name */
    final int f5778a;

    class a extends c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CarouselLayoutManager f5779b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(int i10, CarouselLayoutManager carouselLayoutManager) {
            super(i10, (a) null);
            this.f5779b = carouselLayoutManager;
        }

        public float d(RecyclerView.q qVar) {
            return (float) (qVar.topMargin + qVar.bottomMargin);
        }

        /* access modifiers changed from: package-private */
        public int e() {
            return this.f5779b.b0();
        }

        /* access modifiers changed from: package-private */
        public int f() {
            return e();
        }

        /* access modifiers changed from: package-private */
        public int g() {
            return this.f5779b.j0();
        }

        /* access modifiers changed from: package-private */
        public int h() {
            return this.f5779b.u0() - this.f5779b.k0();
        }

        /* access modifiers changed from: package-private */
        public int i() {
            return j();
        }

        /* access modifiers changed from: package-private */
        public int j() {
            return 0;
        }

        public void k(View view, int i10, int i11) {
            this.f5779b.F0(view, g(), i10, h(), i11);
        }

        public void l(View view, Rect rect, float f10, float f11) {
            view.offsetTopAndBottom((int) (f11 - (((float) rect.top) + f10)));
        }
    }

    class b extends c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CarouselLayoutManager f5780b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(int i10, CarouselLayoutManager carouselLayoutManager) {
            super(i10, (a) null);
            this.f5780b = carouselLayoutManager;
        }

        public float d(RecyclerView.q qVar) {
            return (float) (qVar.rightMargin + qVar.leftMargin);
        }

        /* access modifiers changed from: package-private */
        public int e() {
            return this.f5780b.b0() - this.f5780b.h0();
        }

        /* access modifiers changed from: package-private */
        public int f() {
            return this.f5780b.E2() ? g() : h();
        }

        /* access modifiers changed from: package-private */
        public int g() {
            return 0;
        }

        /* access modifiers changed from: package-private */
        public int h() {
            return this.f5780b.u0();
        }

        /* access modifiers changed from: package-private */
        public int i() {
            return this.f5780b.E2() ? h() : g();
        }

        /* access modifiers changed from: package-private */
        public int j() {
            return this.f5780b.m0();
        }

        public void k(View view, int i10, int i11) {
            this.f5780b.F0(view, i10, j(), i11, e());
        }

        public void l(View view, Rect rect, float f10, float f11) {
            view.offsetLeftAndRight((int) (f11 - (((float) rect.left) + f10)));
        }
    }

    private c(int i10) {
        this.f5778a = i10;
    }

    private static c a(CarouselLayoutManager carouselLayoutManager) {
        return new b(0, carouselLayoutManager);
    }

    static c b(CarouselLayoutManager carouselLayoutManager, int i10) {
        if (i10 == 0) {
            return a(carouselLayoutManager);
        }
        if (i10 == 1) {
            return c(carouselLayoutManager);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    private static c c(CarouselLayoutManager carouselLayoutManager) {
        return new a(1, carouselLayoutManager);
    }

    /* access modifiers changed from: package-private */
    public abstract float d(RecyclerView.q qVar);

    /* access modifiers changed from: package-private */
    public abstract int e();

    /* access modifiers changed from: package-private */
    public abstract int f();

    /* access modifiers changed from: package-private */
    public abstract int g();

    /* access modifiers changed from: package-private */
    public abstract int h();

    /* access modifiers changed from: package-private */
    public abstract int i();

    /* access modifiers changed from: package-private */
    public abstract int j();

    /* access modifiers changed from: package-private */
    public abstract void k(View view, int i10, int i11);

    /* access modifiers changed from: package-private */
    public abstract void l(View view, Rect rect, float f10, float f11);

    /* synthetic */ c(int i10, a aVar) {
        this(i10);
    }
}
