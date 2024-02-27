package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.appcompat.widget.LinearLayoutCompat;
import q4.k;

public abstract class e extends LinearLayoutCompat {

    /* renamed from: t  reason: collision with root package name */
    private Drawable f6128t;

    /* renamed from: u  reason: collision with root package name */
    private final Rect f6129u = new Rect();

    /* renamed from: v  reason: collision with root package name */
    private final Rect f6130v = new Rect();

    /* renamed from: w  reason: collision with root package name */
    private int f6131w = 119;

    /* renamed from: x  reason: collision with root package name */
    protected boolean f6132x = true;

    /* renamed from: y  reason: collision with root package name */
    boolean f6133y = false;

    public e(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        TypedArray i11 = r.i(context, attributeSet, k.Y1, i10, 0, new int[0]);
        this.f6131w = i11.getInt(k.f14970a2, this.f6131w);
        Drawable drawable = i11.getDrawable(k.Z1);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f6132x = i11.getBoolean(k.f14980b2, true);
        i11.recycle();
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f6128t;
        if (drawable != null) {
            if (this.f6133y) {
                this.f6133y = false;
                Rect rect = this.f6129u;
                Rect rect2 = this.f6130v;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f6132x) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f6131w, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    public void drawableHotspotChanged(float f10, float f11) {
        super.drawableHotspotChanged(f10, f11);
        Drawable drawable = this.f6128t;
        if (drawable != null) {
            drawable.setHotspot(f10, f11);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f6128t;
        if (drawable != null && drawable.isStateful()) {
            this.f6128t.setState(getDrawableState());
        }
    }

    public Drawable getForeground() {
        return this.f6128t;
    }

    public int getForegroundGravity() {
        return this.f6131w;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f6128t;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f6133y = z10 | this.f6133y;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f6133y = true;
    }

    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f6128t;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
                unscheduleDrawable(this.f6128t);
            }
            this.f6128t = drawable;
            this.f6133y = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f6131w == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    public void setForegroundGravity(int i10) {
        if (this.f6131w != i10) {
            if ((8388615 & i10) == 0) {
                i10 |= 8388611;
            }
            if ((i10 & 112) == 0) {
                i10 |= 48;
            }
            this.f6131w = i10;
            if (i10 == 119 && this.f6128t != null) {
                this.f6128t.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f6128t;
    }
}
