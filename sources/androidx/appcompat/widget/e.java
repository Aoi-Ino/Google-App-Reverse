package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.view.m0;
import f.j;

class e {

    /* renamed from: a  reason: collision with root package name */
    private final View f1360a;

    /* renamed from: b  reason: collision with root package name */
    private final j f1361b;

    /* renamed from: c  reason: collision with root package name */
    private int f1362c = -1;

    /* renamed from: d  reason: collision with root package name */
    private t0 f1363d;

    /* renamed from: e  reason: collision with root package name */
    private t0 f1364e;

    /* renamed from: f  reason: collision with root package name */
    private t0 f1365f;

    e(View view) {
        this.f1360a = view;
        this.f1361b = j.b();
    }

    private boolean a(Drawable drawable) {
        if (this.f1365f == null) {
            this.f1365f = new t0();
        }
        t0 t0Var = this.f1365f;
        t0Var.a();
        ColorStateList s10 = m0.s(this.f1360a);
        if (s10 != null) {
            t0Var.f1551d = true;
            t0Var.f1548a = s10;
        }
        PorterDuff.Mode t10 = m0.t(this.f1360a);
        if (t10 != null) {
            t0Var.f1550c = true;
            t0Var.f1549b = t10;
        }
        if (!t0Var.f1551d && !t0Var.f1550c) {
            return false;
        }
        j.i(drawable, t0Var, this.f1360a.getDrawableState());
        return true;
    }

    private boolean k() {
        return this.f1363d != null;
    }

    /* access modifiers changed from: package-private */
    public void b() {
        Drawable background = this.f1360a.getBackground();
        if (background == null) {
            return;
        }
        if (!k() || !a(background)) {
            t0 t0Var = this.f1364e;
            if (t0Var != null) {
                j.i(background, t0Var, this.f1360a.getDrawableState());
                return;
            }
            t0 t0Var2 = this.f1363d;
            if (t0Var2 != null) {
                j.i(background, t0Var2, this.f1360a.getDrawableState());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public ColorStateList c() {
        t0 t0Var = this.f1364e;
        if (t0Var != null) {
            return t0Var.f1548a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public PorterDuff.Mode d() {
        t0 t0Var = this.f1364e;
        if (t0Var != null) {
            return t0Var.f1549b;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void e(AttributeSet attributeSet, int i10) {
        Context context = this.f1360a.getContext();
        int[] iArr = j.D3;
        v0 v10 = v0.v(context, attributeSet, iArr, i10, 0);
        View view = this.f1360a;
        m0.o0(view, view.getContext(), iArr, attributeSet, v10.r(), i10, 0);
        try {
            int i11 = j.E3;
            if (v10.s(i11)) {
                this.f1362c = v10.n(i11, -1);
                ColorStateList f10 = this.f1361b.f(this.f1360a.getContext(), this.f1362c);
                if (f10 != null) {
                    h(f10);
                }
            }
            int i12 = j.F3;
            if (v10.s(i12)) {
                m0.v0(this.f1360a, v10.c(i12));
            }
            int i13 = j.G3;
            if (v10.s(i13)) {
                m0.w0(this.f1360a, f0.d(v10.k(i13, -1), (PorterDuff.Mode) null));
            }
            v10.w();
        } catch (Throwable th2) {
            v10.w();
            throw th2;
        }
    }

    /* access modifiers changed from: package-private */
    public void f(Drawable drawable) {
        this.f1362c = -1;
        h((ColorStateList) null);
        b();
    }

    /* access modifiers changed from: package-private */
    public void g(int i10) {
        this.f1362c = i10;
        j jVar = this.f1361b;
        h(jVar != null ? jVar.f(this.f1360a.getContext(), i10) : null);
        b();
    }

    /* access modifiers changed from: package-private */
    public void h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f1363d == null) {
                this.f1363d = new t0();
            }
            t0 t0Var = this.f1363d;
            t0Var.f1548a = colorStateList;
            t0Var.f1551d = true;
        } else {
            this.f1363d = null;
        }
        b();
    }

    /* access modifiers changed from: package-private */
    public void i(ColorStateList colorStateList) {
        if (this.f1364e == null) {
            this.f1364e = new t0();
        }
        t0 t0Var = this.f1364e;
        t0Var.f1548a = colorStateList;
        t0Var.f1551d = true;
        b();
    }

    /* access modifiers changed from: package-private */
    public void j(PorterDuff.Mode mode) {
        if (this.f1364e == null) {
            this.f1364e = new t0();
        }
        t0 t0Var = this.f1364e;
        t0Var.f1549b = mode;
        t0Var.f1550c = true;
        b();
    }
}
