package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.c0;
import androidx.core.view.k1;
import androidx.core.view.m0;
import q4.j;
import q4.k;

public abstract class l extends FrameLayout {

    /* renamed from: e  reason: collision with root package name */
    Drawable f6169e;

    /* renamed from: f  reason: collision with root package name */
    Rect f6170f;

    /* renamed from: g  reason: collision with root package name */
    private Rect f6171g = new Rect();

    /* renamed from: h  reason: collision with root package name */
    private boolean f6172h = true;

    /* renamed from: i  reason: collision with root package name */
    private boolean f6173i = true;

    /* renamed from: j  reason: collision with root package name */
    private boolean f6174j = true;

    /* renamed from: k  reason: collision with root package name */
    private boolean f6175k = true;

    class a implements c0 {
        a() {
        }

        public k1 a(View view, k1 k1Var) {
            l lVar = l.this;
            if (lVar.f6170f == null) {
                lVar.f6170f = new Rect();
            }
            l.this.f6170f.set(k1Var.j(), k1Var.l(), k1Var.k(), k1Var.i());
            l.this.e(k1Var);
            l.this.setWillNotDraw(!k1Var.m() || l.this.f6169e == null);
            m0.h0(l.this);
            return k1Var.c();
        }
    }

    public l(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        TypedArray i11 = r.i(context, attributeSet, k.f15185w5, i10, j.Widget_Design_ScrimInsetsFrameLayout, new int[0]);
        this.f6169e = i11.getDrawable(k.f15194x5);
        i11.recycle();
        setWillNotDraw(true);
        m0.F0(this, new a());
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f6170f != null && this.f6169e != null) {
            int save = canvas.save();
            canvas.translate((float) getScrollX(), (float) getScrollY());
            if (this.f6172h) {
                this.f6171g.set(0, 0, width, this.f6170f.top);
                this.f6169e.setBounds(this.f6171g);
                this.f6169e.draw(canvas);
            }
            if (this.f6173i) {
                this.f6171g.set(0, height - this.f6170f.bottom, width, height);
                this.f6169e.setBounds(this.f6171g);
                this.f6169e.draw(canvas);
            }
            if (this.f6174j) {
                Rect rect = this.f6171g;
                Rect rect2 = this.f6170f;
                rect.set(0, rect2.top, rect2.left, height - rect2.bottom);
                this.f6169e.setBounds(this.f6171g);
                this.f6169e.draw(canvas);
            }
            if (this.f6175k) {
                Rect rect3 = this.f6171g;
                Rect rect4 = this.f6170f;
                rect3.set(width - rect4.right, rect4.top, width, height - rect4.bottom);
                this.f6169e.setBounds(this.f6171g);
                this.f6169e.draw(canvas);
            }
            canvas.restoreToCount(save);
        }
    }

    /* access modifiers changed from: protected */
    public abstract void e(k1 k1Var);

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.f6169e;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.f6169e;
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback) null);
        }
    }

    public void setDrawBottomInsetForeground(boolean z10) {
        this.f6173i = z10;
    }

    public void setDrawLeftInsetForeground(boolean z10) {
        this.f6174j = z10;
    }

    public void setDrawRightInsetForeground(boolean z10) {
        this.f6175k = z10;
    }

    public void setDrawTopInsetForeground(boolean z10) {
        this.f6172h = z10;
    }

    public void setScrimInsetForeground(Drawable drawable) {
        this.f6169e = drawable;
    }
}
