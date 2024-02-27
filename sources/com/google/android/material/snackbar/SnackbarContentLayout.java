package com.google.android.material.snackbar;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.m0;
import d5.h;
import q4.b;
import q4.d;
import q4.f;
import r4.a;

public class SnackbarContentLayout extends LinearLayout implements a {

    /* renamed from: e  reason: collision with root package name */
    private TextView f6336e;

    /* renamed from: f  reason: collision with root package name */
    private Button f6337f;

    /* renamed from: g  reason: collision with root package name */
    private final TimeInterpolator f6338g;

    /* renamed from: h  reason: collision with root package name */
    private int f6339h;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6338g = h.g(context, b.motionEasingEmphasizedInterpolator, a.f15583b);
    }

    private static void d(View view, int i10, int i11) {
        if (m0.W(view)) {
            m0.G0(view, m0.G(view), i10, m0.F(view), i11);
        } else {
            view.setPadding(view.getPaddingLeft(), i10, view.getPaddingRight(), i11);
        }
    }

    private boolean e(int i10, int i11, int i12) {
        boolean z10;
        if (i10 != getOrientation()) {
            setOrientation(i10);
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f6336e.getPaddingTop() == i11 && this.f6336e.getPaddingBottom() == i12) {
            return z10;
        }
        d(this.f6336e, i11, i12);
        return true;
    }

    public void a(int i10, int i11) {
        this.f6336e.setAlpha(0.0f);
        long j10 = (long) i11;
        long j11 = (long) i10;
        this.f6336e.animate().alpha(1.0f).setDuration(j10).setInterpolator(this.f6338g).setStartDelay(j11).start();
        if (this.f6337f.getVisibility() == 0) {
            this.f6337f.setAlpha(0.0f);
            this.f6337f.animate().alpha(1.0f).setDuration(j10).setInterpolator(this.f6338g).setStartDelay(j11).start();
        }
    }

    public void b(int i10, int i11) {
        this.f6336e.setAlpha(1.0f);
        long j10 = (long) i11;
        long j11 = (long) i10;
        this.f6336e.animate().alpha(0.0f).setDuration(j10).setInterpolator(this.f6338g).setStartDelay(j11).start();
        if (this.f6337f.getVisibility() == 0) {
            this.f6337f.setAlpha(1.0f);
            this.f6337f.animate().alpha(0.0f).setDuration(j10).setInterpolator(this.f6338g).setStartDelay(j11).start();
        }
    }

    /* access modifiers changed from: package-private */
    public void c(float f10) {
        if (f10 != 1.0f) {
            this.f6337f.setTextColor(x4.a.j(x4.a.d(this, b.colorSurface), this.f6337f.getCurrentTextColor(), f10));
        }
    }

    public Button getActionView() {
        return this.f6337f;
    }

    public TextView getMessageView() {
        return this.f6336e;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f6336e = (TextView) findViewById(f.snackbar_text);
        this.f6337f = (Button) findViewById(f.snackbar_action);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (getOrientation() != 1) {
            int dimensionPixelSize = getResources().getDimensionPixelSize(d.design_snackbar_padding_vertical_2lines);
            int dimensionPixelSize2 = getResources().getDimensionPixelSize(d.design_snackbar_padding_vertical);
            Layout layout = this.f6336e.getLayout();
            boolean z10 = layout != null && layout.getLineCount() > 1;
            if (!z10 || this.f6339h <= 0 || this.f6337f.getMeasuredWidth() <= this.f6339h) {
                if (!z10) {
                    dimensionPixelSize = dimensionPixelSize2;
                }
                if (!e(0, dimensionPixelSize, dimensionPixelSize)) {
                    return;
                }
            } else if (!e(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
                return;
            }
            super.onMeasure(i10, i11);
        }
    }

    public void setMaxInlineActionWidth(int i10) {
        this.f6339h = i10;
    }
}
