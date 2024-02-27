package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.core.graphics.drawable.a;
import androidx.core.view.m0;
import f.j;

class w extends r {

    /* renamed from: d  reason: collision with root package name */
    private final SeekBar f1557d;

    /* renamed from: e  reason: collision with root package name */
    private Drawable f1558e;

    /* renamed from: f  reason: collision with root package name */
    private ColorStateList f1559f = null;

    /* renamed from: g  reason: collision with root package name */
    private PorterDuff.Mode f1560g = null;

    /* renamed from: h  reason: collision with root package name */
    private boolean f1561h = false;

    /* renamed from: i  reason: collision with root package name */
    private boolean f1562i = false;

    w(SeekBar seekBar) {
        super(seekBar);
        this.f1557d = seekBar;
    }

    private void f() {
        Drawable drawable = this.f1558e;
        if (drawable == null) {
            return;
        }
        if (this.f1561h || this.f1562i) {
            Drawable r10 = a.r(drawable.mutate());
            this.f1558e = r10;
            if (this.f1561h) {
                a.o(r10, this.f1559f);
            }
            if (this.f1562i) {
                a.p(this.f1558e, this.f1560g);
            }
            if (this.f1558e.isStateful()) {
                this.f1558e.setState(this.f1557d.getDrawableState());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void c(AttributeSet attributeSet, int i10) {
        super.c(attributeSet, i10);
        Context context = this.f1557d.getContext();
        int[] iArr = j.T;
        v0 v10 = v0.v(context, attributeSet, iArr, i10, 0);
        SeekBar seekBar = this.f1557d;
        m0.o0(seekBar, seekBar.getContext(), iArr, attributeSet, v10.r(), i10, 0);
        Drawable h10 = v10.h(j.U);
        if (h10 != null) {
            this.f1557d.setThumb(h10);
        }
        j(v10.g(j.V));
        int i11 = j.X;
        if (v10.s(i11)) {
            this.f1560g = f0.d(v10.k(i11, -1), this.f1560g);
            this.f1562i = true;
        }
        int i12 = j.W;
        if (v10.s(i12)) {
            this.f1559f = v10.c(i12);
            this.f1561h = true;
        }
        v10.w();
        f();
    }

    /* access modifiers changed from: package-private */
    public void g(Canvas canvas) {
        if (this.f1558e != null) {
            int max = this.f1557d.getMax();
            int i10 = 1;
            if (max > 1) {
                int intrinsicWidth = this.f1558e.getIntrinsicWidth();
                int intrinsicHeight = this.f1558e.getIntrinsicHeight();
                int i11 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                if (intrinsicHeight >= 0) {
                    i10 = intrinsicHeight / 2;
                }
                this.f1558e.setBounds(-i11, -i10, i11, i10);
                float width = ((float) ((this.f1557d.getWidth() - this.f1557d.getPaddingLeft()) - this.f1557d.getPaddingRight())) / ((float) max);
                int save = canvas.save();
                canvas.translate((float) this.f1557d.getPaddingLeft(), (float) (this.f1557d.getHeight() / 2));
                for (int i12 = 0; i12 <= max; i12++) {
                    this.f1558e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void h() {
        Drawable drawable = this.f1558e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f1557d.getDrawableState())) {
            this.f1557d.invalidateDrawable(drawable);
        }
    }

    /* access modifiers changed from: package-private */
    public void i() {
        Drawable drawable = this.f1558e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* access modifiers changed from: package-private */
    public void j(Drawable drawable) {
        Drawable drawable2 = this.f1558e;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f1558e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f1557d);
            a.m(drawable, m0.B(this.f1557d));
            if (drawable.isStateful()) {
                drawable.setState(this.f1557d.getDrawableState());
            }
            f();
        }
        this.f1557d.invalidate();
    }
}
