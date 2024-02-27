package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CheckedTextView;
import androidx.core.graphics.drawable.a;
import androidx.core.widget.b;

class h {

    /* renamed from: a  reason: collision with root package name */
    private final CheckedTextView f1408a;

    /* renamed from: b  reason: collision with root package name */
    private ColorStateList f1409b = null;

    /* renamed from: c  reason: collision with root package name */
    private PorterDuff.Mode f1410c = null;

    /* renamed from: d  reason: collision with root package name */
    private boolean f1411d = false;

    /* renamed from: e  reason: collision with root package name */
    private boolean f1412e = false;

    /* renamed from: f  reason: collision with root package name */
    private boolean f1413f;

    h(CheckedTextView checkedTextView) {
        this.f1408a = checkedTextView;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        Drawable a10 = b.a(this.f1408a);
        if (a10 == null) {
            return;
        }
        if (this.f1411d || this.f1412e) {
            Drawable mutate = a.r(a10).mutate();
            if (this.f1411d) {
                a.o(mutate, this.f1409b);
            }
            if (this.f1412e) {
                a.p(mutate, this.f1410c);
            }
            if (mutate.isStateful()) {
                mutate.setState(this.f1408a.getDrawableState());
            }
            this.f1408a.setCheckMarkDrawable(mutate);
        }
    }

    /* access modifiers changed from: package-private */
    public ColorStateList b() {
        return this.f1409b;
    }

    /* access modifiers changed from: package-private */
    public PorterDuff.Mode c() {
        return this.f1410c;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(12:1|2|(2:6|7)|9|10|(1:14)|15|(1:17)|18|(1:20)|21|22) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x003b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d(android.util.AttributeSet r10, int r11) {
        /*
            r9 = this;
            android.widget.CheckedTextView r0 = r9.f1408a
            android.content.Context r0 = r0.getContext()
            int[] r3 = f.j.P0
            r8 = 0
            androidx.appcompat.widget.v0 r0 = androidx.appcompat.widget.v0.v(r0, r10, r3, r11, r8)
            android.widget.CheckedTextView r1 = r9.f1408a
            android.content.Context r2 = r1.getContext()
            android.content.res.TypedArray r5 = r0.r()
            r7 = 0
            r4 = r10
            r6 = r11
            androidx.core.view.m0.o0(r1, r2, r3, r4, r5, r6, r7)
            int r10 = f.j.R0     // Catch:{ all -> 0x0039 }
            boolean r11 = r0.s(r10)     // Catch:{ all -> 0x0039 }
            if (r11 == 0) goto L_0x003b
            int r10 = r0.n(r10, r8)     // Catch:{ all -> 0x0039 }
            if (r10 == 0) goto L_0x003b
            android.widget.CheckedTextView r11 = r9.f1408a     // Catch:{ NotFoundException -> 0x003b }
            android.content.Context r1 = r11.getContext()     // Catch:{ NotFoundException -> 0x003b }
            android.graphics.drawable.Drawable r10 = g.a.b(r1, r10)     // Catch:{ NotFoundException -> 0x003b }
            r11.setCheckMarkDrawable(r10)     // Catch:{ NotFoundException -> 0x003b }
            goto L_0x0056
        L_0x0039:
            r10 = move-exception
            goto L_0x0082
        L_0x003b:
            int r10 = f.j.Q0     // Catch:{ all -> 0x0039 }
            boolean r11 = r0.s(r10)     // Catch:{ all -> 0x0039 }
            if (r11 == 0) goto L_0x0056
            int r10 = r0.n(r10, r8)     // Catch:{ all -> 0x0039 }
            if (r10 == 0) goto L_0x0056
            android.widget.CheckedTextView r11 = r9.f1408a     // Catch:{ all -> 0x0039 }
            android.content.Context r1 = r11.getContext()     // Catch:{ all -> 0x0039 }
            android.graphics.drawable.Drawable r10 = g.a.b(r1, r10)     // Catch:{ all -> 0x0039 }
            r11.setCheckMarkDrawable(r10)     // Catch:{ all -> 0x0039 }
        L_0x0056:
            int r10 = f.j.S0     // Catch:{ all -> 0x0039 }
            boolean r11 = r0.s(r10)     // Catch:{ all -> 0x0039 }
            if (r11 == 0) goto L_0x0067
            android.widget.CheckedTextView r11 = r9.f1408a     // Catch:{ all -> 0x0039 }
            android.content.res.ColorStateList r10 = r0.c(r10)     // Catch:{ all -> 0x0039 }
            androidx.core.widget.b.b(r11, r10)     // Catch:{ all -> 0x0039 }
        L_0x0067:
            int r10 = f.j.T0     // Catch:{ all -> 0x0039 }
            boolean r11 = r0.s(r10)     // Catch:{ all -> 0x0039 }
            if (r11 == 0) goto L_0x007e
            android.widget.CheckedTextView r11 = r9.f1408a     // Catch:{ all -> 0x0039 }
            r1 = -1
            int r10 = r0.k(r10, r1)     // Catch:{ all -> 0x0039 }
            r1 = 0
            android.graphics.PorterDuff$Mode r10 = androidx.appcompat.widget.f0.d(r10, r1)     // Catch:{ all -> 0x0039 }
            androidx.core.widget.b.c(r11, r10)     // Catch:{ all -> 0x0039 }
        L_0x007e:
            r0.w()
            return
        L_0x0082:
            r0.w()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.h.d(android.util.AttributeSet, int):void");
    }

    /* access modifiers changed from: package-private */
    public void e() {
        if (this.f1413f) {
            this.f1413f = false;
            return;
        }
        this.f1413f = true;
        a();
    }

    /* access modifiers changed from: package-private */
    public void f(ColorStateList colorStateList) {
        this.f1409b = colorStateList;
        this.f1411d = true;
        a();
    }

    /* access modifiers changed from: package-private */
    public void g(PorterDuff.Mode mode) {
        this.f1410c = mode;
        this.f1412e = true;
        a();
    }
}
