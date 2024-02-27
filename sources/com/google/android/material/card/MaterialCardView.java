package com.google.android.material.card;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import androidx.cardview.widget.CardView;
import i5.h;
import i5.k;
import i5.n;
import q4.b;
import q4.j;

public class MaterialCardView extends CardView implements Checkable, n {

    /* renamed from: r  reason: collision with root package name */
    private static final int[] f5717r = {16842911};

    /* renamed from: s  reason: collision with root package name */
    private static final int[] f5718s = {16842912};

    /* renamed from: t  reason: collision with root package name */
    private static final int[] f5719t = {b.state_dragged};

    /* renamed from: u  reason: collision with root package name */
    private static final int f5720u = j.Widget_MaterialComponents_CardView;

    /* renamed from: n  reason: collision with root package name */
    private final b f5721n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f5722o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f5723p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f5724q;

    public interface a {
    }

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.materialCardViewStyle);
    }

    private void d() {
        if (Build.VERSION.SDK_INT > 26) {
            this.f5721n.k();
        }
    }

    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.f5721n.l().getBounds());
        return rectF;
    }

    public boolean e() {
        b bVar = this.f5721n;
        return bVar != null && bVar.F();
    }

    public boolean f() {
        return this.f5724q;
    }

    /* access modifiers changed from: package-private */
    public void g(int i10, int i11, int i12, int i13) {
        super.b(i10, i11, i12, i13);
    }

    public ColorStateList getCardBackgroundColor() {
        return this.f5721n.m();
    }

    public ColorStateList getCardForegroundColor() {
        return this.f5721n.n();
    }

    /* access modifiers changed from: package-private */
    public float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        return this.f5721n.o();
    }

    public int getCheckedIconGravity() {
        return this.f5721n.p();
    }

    public int getCheckedIconMargin() {
        return this.f5721n.q();
    }

    public int getCheckedIconSize() {
        return this.f5721n.r();
    }

    public ColorStateList getCheckedIconTint() {
        return this.f5721n.s();
    }

    public int getContentPaddingBottom() {
        return this.f5721n.C().bottom;
    }

    public int getContentPaddingLeft() {
        return this.f5721n.C().left;
    }

    public int getContentPaddingRight() {
        return this.f5721n.C().right;
    }

    public int getContentPaddingTop() {
        return this.f5721n.C().top;
    }

    public float getProgress() {
        return this.f5721n.w();
    }

    public float getRadius() {
        return this.f5721n.u();
    }

    public ColorStateList getRippleColor() {
        return this.f5721n.x();
    }

    public k getShapeAppearanceModel() {
        return this.f5721n.y();
    }

    @Deprecated
    public int getStrokeColor() {
        return this.f5721n.z();
    }

    public ColorStateList getStrokeColorStateList() {
        return this.f5721n.A();
    }

    public int getStrokeWidth() {
        return this.f5721n.B();
    }

    public boolean isChecked() {
        return this.f5723p;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f5721n.g0();
        h.f(this, this.f5721n.l());
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 3);
        if (e()) {
            View.mergeDrawableStates(onCreateDrawableState, f5717r);
        }
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f5718s);
        }
        if (f()) {
            View.mergeDrawableStates(onCreateDrawableState, f5719t);
        }
        return onCreateDrawableState;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(isChecked());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        accessibilityNodeInfo.setCheckable(e());
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(isChecked());
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f5721n.K(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (this.f5722o) {
            if (!this.f5721n.E()) {
                Log.i("MaterialCardView", "Setting a custom background is not supported.");
                this.f5721n.L(true);
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    /* access modifiers changed from: package-private */
    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setCardBackgroundColor(int i10) {
        this.f5721n.M(ColorStateList.valueOf(i10));
    }

    public void setCardElevation(float f10) {
        super.setCardElevation(f10);
        this.f5721n.i0();
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        this.f5721n.N(colorStateList);
    }

    public void setCheckable(boolean z10) {
        this.f5721n.O(z10);
    }

    public void setChecked(boolean z10) {
        if (this.f5723p != z10) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.f5721n.R(drawable);
    }

    public void setCheckedIconGravity(int i10) {
        if (this.f5721n.p() != i10) {
            this.f5721n.S(i10);
        }
    }

    public void setCheckedIconMargin(int i10) {
        this.f5721n.T(i10);
    }

    public void setCheckedIconMarginResource(int i10) {
        if (i10 != -1) {
            this.f5721n.T(getResources().getDimensionPixelSize(i10));
        }
    }

    public void setCheckedIconResource(int i10) {
        this.f5721n.R(g.a.b(getContext(), i10));
    }

    public void setCheckedIconSize(int i10) {
        this.f5721n.U(i10);
    }

    public void setCheckedIconSizeResource(int i10) {
        if (i10 != 0) {
            this.f5721n.U(getResources().getDimensionPixelSize(i10));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        this.f5721n.V(colorStateList);
    }

    public void setClickable(boolean z10) {
        super.setClickable(z10);
        b bVar = this.f5721n;
        if (bVar != null) {
            bVar.g0();
        }
    }

    public void setDragged(boolean z10) {
        if (this.f5724q != z10) {
            this.f5724q = z10;
            refreshDrawableState();
            d();
            invalidate();
        }
    }

    public void setMaxCardElevation(float f10) {
        super.setMaxCardElevation(f10);
        this.f5721n.k0();
    }

    public void setOnCheckedChangeListener(a aVar) {
    }

    public void setPreventCornerOverlap(boolean z10) {
        super.setPreventCornerOverlap(z10);
        this.f5721n.k0();
        this.f5721n.h0();
    }

    public void setProgress(float f10) {
        this.f5721n.X(f10);
    }

    public void setRadius(float f10) {
        super.setRadius(f10);
        this.f5721n.W(f10);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        this.f5721n.Y(colorStateList);
    }

    public void setRippleColorResource(int i10) {
        this.f5721n.Y(g.a.a(getContext(), i10));
    }

    public void setShapeAppearanceModel(k kVar) {
        setClipToOutline(kVar.u(getBoundsAsRectF()));
        this.f5721n.Z(kVar);
    }

    public void setStrokeColor(int i10) {
        setStrokeColor(ColorStateList.valueOf(i10));
    }

    public void setStrokeWidth(int i10) {
        this.f5721n.b0(i10);
        invalidate();
    }

    public void setUseCompatPadding(boolean z10) {
        super.setUseCompatPadding(z10);
        this.f5721n.k0();
        this.f5721n.h0();
    }

    public void toggle() {
        if (e() && isEnabled()) {
            this.f5723p = !this.f5723p;
            refreshDrawableState();
            d();
            this.f5721n.Q(this.f5723p, true);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MaterialCardView(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r6 = f5720u
            android.content.Context r8 = m5.a.c(r8, r9, r10, r6)
            r7.<init>(r8, r9, r10)
            r8 = 0
            r7.f5723p = r8
            r7.f5724q = r8
            r0 = 1
            r7.f5722o = r0
            android.content.Context r0 = r7.getContext()
            int[] r2 = q4.k.f15192x3
            int[] r5 = new int[r8]
            r1 = r9
            r3 = r10
            r4 = r6
            android.content.res.TypedArray r8 = com.google.android.material.internal.r.i(r0, r1, r2, r3, r4, r5)
            com.google.android.material.card.b r0 = new com.google.android.material.card.b
            r0.<init>(r7, r9, r10, r6)
            r7.f5721n = r0
            android.content.res.ColorStateList r9 = super.getCardBackgroundColor()
            r0.M(r9)
            int r9 = super.getContentPaddingLeft()
            int r10 = super.getContentPaddingTop()
            int r1 = super.getContentPaddingRight()
            int r2 = super.getContentPaddingBottom()
            r0.c0(r9, r10, r1, r2)
            r0.J(r8)
            r8.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.card.MaterialCardView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.f5721n.M(colorStateList);
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.f5721n.a0(colorStateList);
        invalidate();
    }
}
