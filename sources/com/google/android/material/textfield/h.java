package com.google.android.material.textfield;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import i5.g;
import i5.k;

abstract class h extends g {
    b D;

    private static class c extends h {
        c(b bVar) {
            super(bVar);
        }

        /* access modifiers changed from: protected */
        public void r(Canvas canvas) {
            if (this.D.f6433w.isEmpty()) {
                super.r(canvas);
                return;
            }
            canvas.save();
            if (Build.VERSION.SDK_INT >= 26) {
                boolean unused = canvas.clipOutRect(this.D.f6433w);
            } else {
                canvas.clipRect(this.D.f6433w, Region.Op.DIFFERENCE);
            }
            super.r(canvas);
            canvas.restore();
        }
    }

    private h(b bVar) {
        super((g.c) bVar);
        this.D = bVar;
    }

    /* access modifiers changed from: private */
    public static h k0(b bVar) {
        return new c(bVar);
    }

    static h l0(k kVar) {
        if (kVar == null) {
            kVar = new k();
        }
        return k0(new b(kVar, new RectF()));
    }

    /* access modifiers changed from: package-private */
    public boolean m0() {
        return !this.D.f6433w.isEmpty();
    }

    public Drawable mutate() {
        this.D = new b(this.D);
        return this;
    }

    /* access modifiers changed from: package-private */
    public void n0() {
        o0(0.0f, 0.0f, 0.0f, 0.0f);
    }

    /* access modifiers changed from: package-private */
    public void o0(float f10, float f11, float f12, float f13) {
        if (f10 != this.D.f6433w.left || f11 != this.D.f6433w.top || f12 != this.D.f6433w.right || f13 != this.D.f6433w.bottom) {
            this.D.f6433w.set(f10, f11, f12, f13);
            invalidateSelf();
        }
    }

    /* access modifiers changed from: package-private */
    public void p0(RectF rectF) {
        o0(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    private static final class b extends g.c {
        /* access modifiers changed from: private */

        /* renamed from: w  reason: collision with root package name */
        public final RectF f6433w;

        private b(b bVar) {
            super(bVar);
            this.f6433w = bVar.f6433w;
        }

        public Drawable newDrawable() {
            h j02 = h.k0(this);
            j02.invalidateSelf();
            return j02;
        }

        private b(k kVar, RectF rectF) {
            super(kVar, (a5.a) null);
            this.f6433w = rectF;
        }
    }
}
