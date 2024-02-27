package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.drawable.a;
import androidx.core.view.m0;
import com.google.android.material.internal.s;
import i5.g;
import i5.h;
import q4.b;
import q4.j;
import z4.e;

public class MaterialToolbar extends Toolbar {

    /* renamed from: g0  reason: collision with root package name */
    private static final int f5520g0 = j.Widget_MaterialComponents_Toolbar;

    /* renamed from: h0  reason: collision with root package name */
    private static final ImageView.ScaleType[] f5521h0 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* renamed from: b0  reason: collision with root package name */
    private Integer f5522b0;

    /* renamed from: c0  reason: collision with root package name */
    private boolean f5523c0;

    /* renamed from: d0  reason: collision with root package name */
    private boolean f5524d0;

    /* renamed from: e0  reason: collision with root package name */
    private ImageView.ScaleType f5525e0;

    /* renamed from: f0  reason: collision with root package name */
    private Boolean f5526f0;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.f14960d0);
    }

    private Pair U(TextView textView, TextView textView2) {
        int measuredWidth = getMeasuredWidth();
        int i10 = measuredWidth / 2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = measuredWidth - getPaddingRight();
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (!(childAt.getVisibility() == 8 || childAt == textView || childAt == textView2)) {
                if (childAt.getRight() < i10 && childAt.getRight() > paddingLeft) {
                    paddingLeft = childAt.getRight();
                }
                if (childAt.getLeft() > i10 && childAt.getLeft() < paddingRight) {
                    paddingRight = childAt.getLeft();
                }
            }
        }
        return new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
    }

    private void V(Context context) {
        Drawable background = getBackground();
        ColorStateList valueOf = background == null ? ColorStateList.valueOf(0) : e.f(background);
        if (valueOf != null) {
            g gVar = new g();
            gVar.W(valueOf);
            gVar.M(context);
            gVar.V(m0.w(this));
            m0.u0(this, gVar);
        }
    }

    private void W(View view, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = view.getMeasuredWidth();
        int i10 = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i11 = measuredWidth2 + i10;
        int max = Math.max(Math.max(((Integer) pair.first).intValue() - i10, 0), Math.max(i11 - ((Integer) pair.second).intValue(), 0));
        if (max > 0) {
            i10 += max;
            i11 -= max;
            view.measure(View.MeasureSpec.makeMeasureSpec(i11 - i10, 1073741824), view.getMeasuredHeightAndState());
        }
        view.layout(i10, view.getTop(), i11, view.getBottom());
    }

    private void X() {
        if (this.f5523c0 || this.f5524d0) {
            TextView e10 = s.e(this);
            TextView c10 = s.c(this);
            if (e10 != null || c10 != null) {
                Pair U = U(e10, c10);
                if (this.f5523c0 && e10 != null) {
                    W(e10, U);
                }
                if (this.f5524d0 && c10 != null) {
                    W(c10, U);
                }
            }
        }
    }

    private Drawable Y(Drawable drawable) {
        if (drawable == null || this.f5522b0 == null) {
            return drawable;
        }
        Drawable r10 = a.r(drawable.mutate());
        a.n(r10, this.f5522b0.intValue());
        return r10;
    }

    private void Z() {
        ImageView b10 = s.b(this);
        if (b10 != null) {
            Boolean bool = this.f5526f0;
            if (bool != null) {
                b10.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f5525e0;
            if (scaleType != null) {
                b10.setScaleType(scaleType);
            }
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.f5525e0;
    }

    public Integer getNavigationIconTint() {
        return this.f5522b0;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        h.e(this);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        X();
        Z();
    }

    public void setElevation(float f10) {
        super.setElevation(f10);
        h.d(this, f10);
    }

    public void setLogoAdjustViewBounds(boolean z10) {
        Boolean bool = this.f5526f0;
        if (bool == null || bool.booleanValue() != z10) {
            this.f5526f0 = Boolean.valueOf(z10);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.f5525e0 != scaleType) {
            this.f5525e0 = scaleType;
            requestLayout();
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        super.setNavigationIcon(Y(drawable));
    }

    public void setNavigationIconTint(int i10) {
        this.f5522b0 = Integer.valueOf(i10);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z10) {
        if (this.f5524d0 != z10) {
            this.f5524d0 = z10;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z10) {
        if (this.f5523c0 != z10) {
            this.f5523c0 = z10;
            requestLayout();
        }
    }

    public void y(int i10) {
        Menu menu = getMenu();
        boolean z10 = menu instanceof androidx.appcompat.view.menu.g;
        if (z10) {
            ((androidx.appcompat.view.menu.g) menu).h0();
        }
        super.y(i10);
        if (z10) {
            ((androidx.appcompat.view.menu.g) menu).g0();
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MaterialToolbar(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = f5520g0
            android.content.Context r8 = m5.a.c(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            android.content.Context r8 = r7.getContext()
            int[] r2 = q4.k.f15082l4
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = com.google.android.material.internal.r.i(r0, r1, r2, r3, r4, r5)
            int r10 = q4.k.f15112o4
            boolean r0 = r9.hasValue(r10)
            r1 = -1
            if (r0 == 0) goto L_0x0029
            int r10 = r9.getColor(r10, r1)
            r7.setNavigationIconTint(r10)
        L_0x0029:
            int r10 = q4.k.f15130q4
            boolean r10 = r9.getBoolean(r10, r6)
            r7.f5523c0 = r10
            int r10 = q4.k.f15121p4
            boolean r10 = r9.getBoolean(r10, r6)
            r7.f5524d0 = r10
            int r10 = q4.k.f15102n4
            int r10 = r9.getInt(r10, r1)
            if (r10 < 0) goto L_0x004a
            android.widget.ImageView$ScaleType[] r0 = f5521h0
            int r1 = r0.length
            if (r10 >= r1) goto L_0x004a
            r10 = r0[r10]
            r7.f5525e0 = r10
        L_0x004a:
            int r10 = q4.k.f15092m4
            boolean r0 = r9.hasValue(r10)
            if (r0 == 0) goto L_0x005c
            boolean r10 = r9.getBoolean(r10, r6)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r7.f5526f0 = r10
        L_0x005c:
            r9.recycle()
            r7.V(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.MaterialToolbar.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
