package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.core.view.m0;
import androidx.core.widget.e;
import f.j;
import g.a;

public class o {

    /* renamed from: a  reason: collision with root package name */
    private final ImageView f1491a;

    /* renamed from: b  reason: collision with root package name */
    private t0 f1492b;

    /* renamed from: c  reason: collision with root package name */
    private t0 f1493c;

    /* renamed from: d  reason: collision with root package name */
    private t0 f1494d;

    /* renamed from: e  reason: collision with root package name */
    private int f1495e = 0;

    public o(ImageView imageView) {
        this.f1491a = imageView;
    }

    private boolean a(Drawable drawable) {
        if (this.f1494d == null) {
            this.f1494d = new t0();
        }
        t0 t0Var = this.f1494d;
        t0Var.a();
        ColorStateList a10 = e.a(this.f1491a);
        if (a10 != null) {
            t0Var.f1551d = true;
            t0Var.f1548a = a10;
        }
        PorterDuff.Mode b10 = e.b(this.f1491a);
        if (b10 != null) {
            t0Var.f1550c = true;
            t0Var.f1549b = b10;
        }
        if (!t0Var.f1551d && !t0Var.f1550c) {
            return false;
        }
        j.i(drawable, t0Var, this.f1491a.getDrawableState());
        return true;
    }

    private boolean l() {
        return this.f1492b != null;
    }

    /* access modifiers changed from: package-private */
    public void b() {
        if (this.f1491a.getDrawable() != null) {
            this.f1491a.getDrawable().setLevel(this.f1495e);
        }
    }

    /* access modifiers changed from: package-private */
    public void c() {
        Drawable drawable = this.f1491a.getDrawable();
        if (drawable != null) {
            f0.b(drawable);
        }
        if (drawable == null) {
            return;
        }
        if (!l() || !a(drawable)) {
            t0 t0Var = this.f1493c;
            if (t0Var != null) {
                j.i(drawable, t0Var, this.f1491a.getDrawableState());
                return;
            }
            t0 t0Var2 = this.f1492b;
            if (t0Var2 != null) {
                j.i(drawable, t0Var2, this.f1491a.getDrawableState());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public ColorStateList d() {
        t0 t0Var = this.f1493c;
        if (t0Var != null) {
            return t0Var.f1548a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public PorterDuff.Mode e() {
        t0 t0Var = this.f1493c;
        if (t0Var != null) {
            return t0Var.f1549b;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public boolean f() {
        return !(this.f1491a.getBackground() instanceof RippleDrawable);
    }

    public void g(AttributeSet attributeSet, int i10) {
        int n10;
        Context context = this.f1491a.getContext();
        int[] iArr = j.P;
        v0 v10 = v0.v(context, attributeSet, iArr, i10, 0);
        ImageView imageView = this.f1491a;
        m0.o0(imageView, imageView.getContext(), iArr, attributeSet, v10.r(), i10, 0);
        try {
            Drawable drawable = this.f1491a.getDrawable();
            if (!(drawable != null || (n10 = v10.n(j.Q, -1)) == -1 || (drawable = a.b(this.f1491a.getContext(), n10)) == null)) {
                this.f1491a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                f0.b(drawable);
            }
            int i11 = j.R;
            if (v10.s(i11)) {
                e.c(this.f1491a, v10.c(i11));
            }
            int i12 = j.S;
            if (v10.s(i12)) {
                e.d(this.f1491a, f0.d(v10.k(i12, -1), (PorterDuff.Mode) null));
            }
            v10.w();
        } catch (Throwable th2) {
            v10.w();
            throw th2;
        }
    }

    /* access modifiers changed from: package-private */
    public void h(Drawable drawable) {
        this.f1495e = drawable.getLevel();
    }

    public void i(int i10) {
        if (i10 != 0) {
            Drawable b10 = a.b(this.f1491a.getContext(), i10);
            if (b10 != null) {
                f0.b(b10);
            }
            this.f1491a.setImageDrawable(b10);
        } else {
            this.f1491a.setImageDrawable((Drawable) null);
        }
        c();
    }

    /* access modifiers changed from: package-private */
    public void j(ColorStateList colorStateList) {
        if (this.f1493c == null) {
            this.f1493c = new t0();
        }
        t0 t0Var = this.f1493c;
        t0Var.f1548a = colorStateList;
        t0Var.f1551d = true;
        c();
    }

    /* access modifiers changed from: package-private */
    public void k(PorterDuff.Mode mode) {
        if (this.f1493c == null) {
            this.f1493c = new t0();
        }
        t0 t0Var = this.f1493c;
        t0Var.f1549b = mode;
        t0Var.f1550c = true;
        c();
    }
}
