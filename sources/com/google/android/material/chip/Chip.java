package com.google.android.material.chip;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.f;
import androidx.core.view.accessibility.y;
import androidx.core.view.m0;
import com.google.android.material.chip.a;
import com.google.android.material.internal.g;
import com.google.android.material.internal.r;
import com.google.android.material.internal.u;
import f5.d;
import i5.h;
import i5.n;
import java.util.List;
import q4.i;
import q4.j;
import q4.k;

public class Chip extends f implements a.C0098a, n, Checkable {
    private static final int A = j.Widget_MaterialComponents_Chip_Action;
    /* access modifiers changed from: private */
    public static final Rect B = new Rect();
    private static final int[] C = {16842913};
    private static final int[] D = {16842911};
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public a f5810i;

    /* renamed from: j  reason: collision with root package name */
    private InsetDrawable f5811j;

    /* renamed from: k  reason: collision with root package name */
    private RippleDrawable f5812k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public View.OnClickListener f5813l;

    /* renamed from: m  reason: collision with root package name */
    private CompoundButton.OnCheckedChangeListener f5814m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f5815n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f5816o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f5817p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public boolean f5818q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f5819r;

    /* renamed from: s  reason: collision with root package name */
    private int f5820s;

    /* renamed from: t  reason: collision with root package name */
    private int f5821t;

    /* renamed from: u  reason: collision with root package name */
    private CharSequence f5822u;

    /* renamed from: v  reason: collision with root package name */
    private final c f5823v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f5824w;

    /* renamed from: x  reason: collision with root package name */
    private final Rect f5825x;

    /* renamed from: y  reason: collision with root package name */
    private final RectF f5826y;

    /* renamed from: z  reason: collision with root package name */
    private final f5.f f5827z;

    class a extends f5.f {
        a() {
        }

        public void a(int i10) {
        }

        public void b(Typeface typeface, boolean z10) {
            Chip chip = Chip.this;
            chip.setText(chip.f5810i.L2() ? Chip.this.f5810i.g1() : Chip.this.getText());
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }
    }

    class b extends ViewOutlineProvider {
        b() {
        }

        public void getOutline(View view, Outline outline) {
            if (Chip.this.f5810i != null) {
                Chip.this.f5810i.getOutline(outline);
            } else {
                outline.setAlpha(0.0f);
            }
        }
    }

    private class c extends c0.a {
        c(Chip chip) {
            super(chip);
        }

        /* access modifiers changed from: protected */
        public int B(float f10, float f11) {
            return (!Chip.this.n() || !Chip.this.getCloseIconTouchBounds().contains(f10, f11)) ? 0 : 1;
        }

        /* access modifiers changed from: protected */
        public void C(List list) {
            list.add(0);
            if (Chip.this.n() && Chip.this.s() && Chip.this.f5813l != null) {
                list.add(1);
            }
        }

        /* access modifiers changed from: protected */
        public boolean J(int i10, int i11, Bundle bundle) {
            if (i11 != 16) {
                return false;
            }
            if (i10 == 0) {
                return Chip.this.performClick();
            }
            if (i10 == 1) {
                return Chip.this.u();
            }
            return false;
        }

        /* access modifiers changed from: protected */
        public void M(y yVar) {
            yVar.k0(Chip.this.r());
            yVar.n0(Chip.this.isClickable());
            yVar.m0(Chip.this.getAccessibilityClassName());
            yVar.L0(Chip.this.getText());
        }

        /* access modifiers changed from: protected */
        public void N(int i10, y yVar) {
            CharSequence charSequence = "";
            if (i10 == 1) {
                CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
                if (closeIconContentDescription == null) {
                    CharSequence text = Chip.this.getText();
                    Context context = Chip.this.getContext();
                    int i11 = i.mtrl_chip_close_icon_content_description;
                    Object[] objArr = new Object[1];
                    if (!TextUtils.isEmpty(text)) {
                        charSequence = text;
                    }
                    objArr[0] = charSequence;
                    closeIconContentDescription = context.getString(i11, objArr).trim();
                }
                yVar.q0(closeIconContentDescription);
                yVar.i0(Chip.this.getCloseIconTouchBoundsInt());
                yVar.b(y.a.f2538i);
                yVar.s0(Chip.this.isEnabled());
                return;
            }
            yVar.q0(charSequence);
            yVar.i0(Chip.B);
        }

        /* access modifiers changed from: protected */
        public void O(int i10, boolean z10) {
            if (i10 == 1) {
                boolean unused = Chip.this.f5818q = z10;
                Chip.this.refreshDrawableState();
            }
        }
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, q4.b.chipStyle);
    }

    private void A() {
        this.f5812k = new RippleDrawable(g5.b.a(this.f5810i.e1()), getBackgroundDrawable(), (Drawable) null);
        this.f5810i.K2(false);
        m0.u0(this, this.f5812k);
        B();
    }

    private void B() {
        a aVar;
        if (!TextUtils.isEmpty(getText()) && (aVar = this.f5810i) != null) {
            int I0 = (int) (aVar.I0() + this.f5810i.i1() + this.f5810i.p0());
            int N0 = (int) (this.f5810i.N0() + this.f5810i.j1() + this.f5810i.l0());
            if (this.f5811j != null) {
                Rect rect = new Rect();
                this.f5811j.getPadding(rect);
                N0 += rect.left;
                I0 += rect.right;
            }
            m0.G0(this, N0, getPaddingTop(), I0, getPaddingBottom());
        }
    }

    private void C() {
        TextPaint paint = getPaint();
        a aVar = this.f5810i;
        if (aVar != null) {
            paint.drawableState = aVar.getState();
        }
        d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.n(getContext(), paint, this.f5827z);
        }
    }

    private void D(AttributeSet attributeSet) {
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            } else if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                throw new UnsupportedOperationException("Chip does not support multi-line text");
            } else if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                Log.w("Chip", "Chip text must be vertically center and start aligned");
            }
        }
    }

    /* access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        this.f5826y.setEmpty();
        if (n() && this.f5813l != null) {
            this.f5810i.X0(this.f5826y);
        }
        return this.f5826y;
    }

    /* access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.f5825x.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.f5825x;
    }

    private d getTextAppearance() {
        a aVar = this.f5810i;
        if (aVar != null) {
            return aVar.h1();
        }
        return null;
    }

    private void j(a aVar) {
        aVar.o2(this);
    }

    private int[] k() {
        int isEnabled = isEnabled();
        if (this.f5818q) {
            isEnabled++;
        }
        if (this.f5817p) {
            isEnabled++;
        }
        if (this.f5816o) {
            isEnabled++;
        }
        if (isChecked()) {
            isEnabled++;
        }
        int[] iArr = new int[isEnabled];
        int i10 = 0;
        if (isEnabled()) {
            iArr[0] = 16842910;
            i10 = 1;
        }
        if (this.f5818q) {
            iArr[i10] = 16842908;
            i10++;
        }
        if (this.f5817p) {
            iArr[i10] = 16843623;
            i10++;
        }
        if (this.f5816o) {
            iArr[i10] = 16842919;
            i10++;
        }
        if (isChecked()) {
            iArr[i10] = 16842913;
        }
        return iArr;
    }

    private void m() {
        if (getBackgroundDrawable() == this.f5811j && this.f5810i.getCallback() == null) {
            this.f5810i.setCallback(this.f5811j);
        }
    }

    /* access modifiers changed from: private */
    public boolean n() {
        a aVar = this.f5810i;
        return (aVar == null || aVar.Q0() == null) ? false : true;
    }

    private void o(Context context, AttributeSet attributeSet, int i10) {
        TypedArray i11 = r.i(context, attributeSet, k.f15108o0, i10, A, new int[0]);
        this.f5819r = i11.getBoolean(k.U0, false);
        this.f5821t = (int) Math.ceil((double) i11.getDimension(k.I0, (float) Math.ceil((double) u.c(getContext(), 48))));
        i11.recycle();
    }

    private void p() {
        setOutlineProvider(new b());
    }

    private void q(int i10, int i11, int i12, int i13) {
        this.f5811j = new InsetDrawable(this.f5810i, i10, i11, i12, i13);
    }

    private void setCloseIconHovered(boolean z10) {
        if (this.f5817p != z10) {
            this.f5817p = z10;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z10) {
        if (this.f5816o != z10) {
            this.f5816o = z10;
            refreshDrawableState();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void t(CompoundButton compoundButton, boolean z10) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.f5814m;
        if (onCheckedChangeListener != null) {
            onCheckedChangeListener.onCheckedChanged(compoundButton, z10);
        }
    }

    private void v() {
        if (this.f5811j != null) {
            this.f5811j = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            z();
        }
    }

    private void x(a aVar) {
        if (aVar != null) {
            aVar.o2((a.C0098a) null);
        }
    }

    private void y() {
        boolean z10;
        if (!n() || !s() || this.f5813l == null) {
            m0.q0(this, (androidx.core.view.a) null);
            z10 = false;
        } else {
            m0.q0(this, this.f5823v);
            z10 = true;
        }
        this.f5824w = z10;
    }

    private void z() {
        if (g5.b.f11634a) {
            A();
            return;
        }
        this.f5810i.K2(true);
        m0.u0(this, getBackgroundDrawable());
        B();
        m();
    }

    public void a() {
        l(this.f5821t);
        requestLayout();
        invalidateOutline();
    }

    /* access modifiers changed from: protected */
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return !this.f5824w ? super.dispatchHoverEvent(motionEvent) : this.f5823v.v(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f5824w) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (!this.f5823v.w(keyEvent) || this.f5823v.A() == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        a aVar = this.f5810i;
        if (aVar != null && aVar.o1() && this.f5810i.k2(k())) {
            invalidate();
        }
    }

    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f5822u)) {
            return this.f5822u;
        }
        if (!r()) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        getParent();
        return "android.widget.Button";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f5811j;
        return insetDrawable == null ? this.f5810i : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        a aVar = this.f5810i;
        if (aVar != null) {
            return aVar.E0();
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        a aVar = this.f5810i;
        if (aVar != null) {
            return aVar.F0();
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        a aVar = this.f5810i;
        if (aVar != null) {
            return aVar.G0();
        }
        return null;
    }

    public float getChipCornerRadius() {
        a aVar = this.f5810i;
        if (aVar != null) {
            return Math.max(0.0f, aVar.H0());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f5810i;
    }

    public float getChipEndPadding() {
        a aVar = this.f5810i;
        if (aVar != null) {
            return aVar.I0();
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        a aVar = this.f5810i;
        if (aVar != null) {
            return aVar.J0();
        }
        return null;
    }

    public float getChipIconSize() {
        a aVar = this.f5810i;
        if (aVar != null) {
            return aVar.K0();
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        a aVar = this.f5810i;
        if (aVar != null) {
            return aVar.L0();
        }
        return null;
    }

    public float getChipMinHeight() {
        a aVar = this.f5810i;
        if (aVar != null) {
            return aVar.M0();
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        a aVar = this.f5810i;
        if (aVar != null) {
            return aVar.N0();
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        a aVar = this.f5810i;
        if (aVar != null) {
            return aVar.O0();
        }
        return null;
    }

    public float getChipStrokeWidth() {
        a aVar = this.f5810i;
        if (aVar != null) {
            return aVar.P0();
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        a aVar = this.f5810i;
        if (aVar != null) {
            return aVar.Q0();
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        a aVar = this.f5810i;
        if (aVar != null) {
            return aVar.R0();
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        a aVar = this.f5810i;
        if (aVar != null) {
            return aVar.S0();
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        a aVar = this.f5810i;
        if (aVar != null) {
            return aVar.T0();
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        a aVar = this.f5810i;
        if (aVar != null) {
            return aVar.U0();
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        a aVar = this.f5810i;
        if (aVar != null) {
            return aVar.W0();
        }
        return null;
    }

    public TextUtils.TruncateAt getEllipsize() {
        a aVar = this.f5810i;
        if (aVar != null) {
            return aVar.a1();
        }
        return null;
    }

    public void getFocusedRect(Rect rect) {
        if (!this.f5824w || !(this.f5823v.A() == 1 || this.f5823v.x() == 1)) {
            super.getFocusedRect(rect);
        } else {
            rect.set(getCloseIconTouchBoundsInt());
        }
    }

    public r4.f getHideMotionSpec() {
        a aVar = this.f5810i;
        if (aVar != null) {
            return aVar.b1();
        }
        return null;
    }

    public float getIconEndPadding() {
        a aVar = this.f5810i;
        if (aVar != null) {
            return aVar.c1();
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        a aVar = this.f5810i;
        if (aVar != null) {
            return aVar.d1();
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        a aVar = this.f5810i;
        if (aVar != null) {
            return aVar.e1();
        }
        return null;
    }

    public i5.k getShapeAppearanceModel() {
        return this.f5810i.D();
    }

    public r4.f getShowMotionSpec() {
        a aVar = this.f5810i;
        if (aVar != null) {
            return aVar.f1();
        }
        return null;
    }

    public float getTextEndPadding() {
        a aVar = this.f5810i;
        if (aVar != null) {
            return aVar.i1();
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        a aVar = this.f5810i;
        if (aVar != null) {
            return aVar.j1();
        }
        return 0.0f;
    }

    public boolean l(int i10) {
        this.f5821t = i10;
        int i11 = 0;
        if (!w()) {
            if (this.f5811j != null) {
                v();
            } else {
                z();
            }
            return false;
        }
        int max = Math.max(0, i10 - this.f5810i.getIntrinsicHeight());
        int max2 = Math.max(0, i10 - this.f5810i.getIntrinsicWidth());
        if (max2 > 0 || max > 0) {
            int i12 = max2 > 0 ? max2 / 2 : 0;
            if (max > 0) {
                i11 = max / 2;
            }
            if (this.f5811j != null) {
                Rect rect = new Rect();
                this.f5811j.getPadding(rect);
                if (rect.top == i11 && rect.bottom == i11 && rect.left == i12 && rect.right == i12) {
                    z();
                    return true;
                }
            }
            if (getMinHeight() != i10) {
                setMinHeight(i10);
            }
            if (getMinWidth() != i10) {
                setMinWidth(i10);
            }
            q(i12, i11, i12, i11);
            z();
            return true;
        }
        if (this.f5811j != null) {
            v();
        } else {
            z();
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        h.f(this, this.f5810i);
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, C);
        }
        if (r()) {
            View.mergeDrawableStates(onCreateDrawableState, D);
        }
        return onCreateDrawableState;
    }

    /* access modifiers changed from: protected */
    public void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        if (this.f5824w) {
            this.f5823v.I(z10, i10, rect);
        }
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        boolean contains;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10) {
                contains = false;
            }
            return super.onHoverEvent(motionEvent);
        }
        contains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        setCloseIconHovered(contains);
        return super.onHoverEvent(motionEvent);
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        accessibilityNodeInfo.setCheckable(r());
        accessibilityNodeInfo.setClickable(isClickable());
        getParent();
    }

    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i10) {
        return (!getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) || !isEnabled()) ? super.onResolvePointerIcon(motionEvent, i10) : PointerIcon.getSystemIcon(getContext(), 1002);
    }

    public void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        if (this.f5820s != i10) {
            this.f5820s = i10;
            B();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        if (r0 != 3) goto L_0x0041;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x003b
            if (r0 == r2) goto L_0x002b
            r4 = 2
            if (r0 == r4) goto L_0x0021
            r1 = 3
            if (r0 == r1) goto L_0x0034
            goto L_0x0041
        L_0x0021:
            boolean r0 = r5.f5816o
            if (r0 == 0) goto L_0x0041
            if (r1 != 0) goto L_0x0049
            r5.setCloseIconPressed(r3)
            goto L_0x0049
        L_0x002b:
            boolean r0 = r5.f5816o
            if (r0 == 0) goto L_0x0034
            r5.u()
            r0 = r2
            goto L_0x0035
        L_0x0034:
            r0 = r3
        L_0x0035:
            r5.setCloseIconPressed(r3)
            if (r0 != 0) goto L_0x0049
            goto L_0x0041
        L_0x003b:
            if (r1 == 0) goto L_0x0041
            r5.setCloseIconPressed(r2)
            goto L_0x0049
        L_0x0041:
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L_0x0048
            goto L_0x0049
        L_0x0048:
            r2 = r3
        L_0x0049:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean r() {
        a aVar = this.f5810i;
        return aVar != null && aVar.n1();
    }

    public boolean s() {
        a aVar = this.f5810i;
        return aVar != null && aVar.p1();
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.f5822u = charSequence;
    }

    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f5812k) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    public void setBackgroundColor(int i10) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f5812k) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    public void setBackgroundResource(int i10) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z10) {
        a aVar = this.f5810i;
        if (aVar != null) {
            aVar.w1(z10);
        }
    }

    public void setCheckableResource(int i10) {
        a aVar = this.f5810i;
        if (aVar != null) {
            aVar.x1(i10);
        }
    }

    public void setChecked(boolean z10) {
        a aVar = this.f5810i;
        if (aVar == null) {
            this.f5815n = z10;
        } else if (aVar.n1()) {
            super.setChecked(z10);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        a aVar = this.f5810i;
        if (aVar != null) {
            aVar.y1(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z10) {
        setCheckedIconVisible(z10);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i10) {
        setCheckedIconVisible(i10);
    }

    public void setCheckedIconResource(int i10) {
        a aVar = this.f5810i;
        if (aVar != null) {
            aVar.z1(i10);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        a aVar = this.f5810i;
        if (aVar != null) {
            aVar.A1(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i10) {
        a aVar = this.f5810i;
        if (aVar != null) {
            aVar.B1(i10);
        }
    }

    public void setCheckedIconVisible(int i10) {
        a aVar = this.f5810i;
        if (aVar != null) {
            aVar.C1(i10);
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        a aVar = this.f5810i;
        if (aVar != null) {
            aVar.E1(colorStateList);
        }
    }

    public void setChipBackgroundColorResource(int i10) {
        a aVar = this.f5810i;
        if (aVar != null) {
            aVar.F1(i10);
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f10) {
        a aVar = this.f5810i;
        if (aVar != null) {
            aVar.G1(f10);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i10) {
        a aVar = this.f5810i;
        if (aVar != null) {
            aVar.H1(i10);
        }
    }

    public void setChipDrawable(a aVar) {
        a aVar2 = this.f5810i;
        if (aVar2 != aVar) {
            x(aVar2);
            this.f5810i = aVar;
            aVar.z2(false);
            j(this.f5810i);
            l(this.f5821t);
        }
    }

    public void setChipEndPadding(float f10) {
        a aVar = this.f5810i;
        if (aVar != null) {
            aVar.I1(f10);
        }
    }

    public void setChipEndPaddingResource(int i10) {
        a aVar = this.f5810i;
        if (aVar != null) {
            aVar.J1(i10);
        }
    }

    public void setChipIcon(Drawable drawable) {
        a aVar = this.f5810i;
        if (aVar != null) {
            aVar.K1(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z10) {
        setChipIconVisible(z10);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i10) {
        setChipIconVisible(i10);
    }

    public void setChipIconResource(int i10) {
        a aVar = this.f5810i;
        if (aVar != null) {
            aVar.L1(i10);
        }
    }

    public void setChipIconSize(float f10) {
        a aVar = this.f5810i;
        if (aVar != null) {
            aVar.M1(f10);
        }
    }

    public void setChipIconSizeResource(int i10) {
        a aVar = this.f5810i;
        if (aVar != null) {
            aVar.N1(i10);
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        a aVar = this.f5810i;
        if (aVar != null) {
            aVar.O1(colorStateList);
        }
    }

    public void setChipIconTintResource(int i10) {
        a aVar = this.f5810i;
        if (aVar != null) {
            aVar.P1(i10);
        }
    }

    public void setChipIconVisible(int i10) {
        a aVar = this.f5810i;
        if (aVar != null) {
            aVar.Q1(i10);
        }
    }

    public void setChipMinHeight(float f10) {
        a aVar = this.f5810i;
        if (aVar != null) {
            aVar.S1(f10);
        }
    }

    public void setChipMinHeightResource(int i10) {
        a aVar = this.f5810i;
        if (aVar != null) {
            aVar.T1(i10);
        }
    }

    public void setChipStartPadding(float f10) {
        a aVar = this.f5810i;
        if (aVar != null) {
            aVar.U1(f10);
        }
    }

    public void setChipStartPaddingResource(int i10) {
        a aVar = this.f5810i;
        if (aVar != null) {
            aVar.V1(i10);
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        a aVar = this.f5810i;
        if (aVar != null) {
            aVar.W1(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i10) {
        a aVar = this.f5810i;
        if (aVar != null) {
            aVar.X1(i10);
        }
    }

    public void setChipStrokeWidth(float f10) {
        a aVar = this.f5810i;
        if (aVar != null) {
            aVar.Y1(f10);
        }
    }

    public void setChipStrokeWidthResource(int i10) {
        a aVar = this.f5810i;
        if (aVar != null) {
            aVar.Z1(i10);
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i10) {
        setText(getResources().getString(i10));
    }

    public void setCloseIcon(Drawable drawable) {
        a aVar = this.f5810i;
        if (aVar != null) {
            aVar.b2(drawable);
        }
        y();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        a aVar = this.f5810i;
        if (aVar != null) {
            aVar.c2(charSequence);
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z10) {
        setCloseIconVisible(z10);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i10) {
        setCloseIconVisible(i10);
    }

    public void setCloseIconEndPadding(float f10) {
        a aVar = this.f5810i;
        if (aVar != null) {
            aVar.d2(f10);
        }
    }

    public void setCloseIconEndPaddingResource(int i10) {
        a aVar = this.f5810i;
        if (aVar != null) {
            aVar.e2(i10);
        }
    }

    public void setCloseIconResource(int i10) {
        a aVar = this.f5810i;
        if (aVar != null) {
            aVar.f2(i10);
        }
        y();
    }

    public void setCloseIconSize(float f10) {
        a aVar = this.f5810i;
        if (aVar != null) {
            aVar.g2(f10);
        }
    }

    public void setCloseIconSizeResource(int i10) {
        a aVar = this.f5810i;
        if (aVar != null) {
            aVar.h2(i10);
        }
    }

    public void setCloseIconStartPadding(float f10) {
        a aVar = this.f5810i;
        if (aVar != null) {
            aVar.i2(f10);
        }
    }

    public void setCloseIconStartPaddingResource(int i10) {
        a aVar = this.f5810i;
        if (aVar != null) {
            aVar.j2(i10);
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        a aVar = this.f5810i;
        if (aVar != null) {
            aVar.l2(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i10) {
        a aVar = this.f5810i;
        if (aVar != null) {
            aVar.m2(i10);
        }
    }

    public void setCloseIconVisible(int i10) {
        setCloseIconVisible(getResources().getBoolean(i10));
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        if (i10 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i12 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i10, i11, i12, i13);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        if (i10 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i12 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i10, i11, i12, i13);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setElevation(float f10) {
        super.setElevation(f10);
        a aVar = this.f5810i;
        if (aVar != null) {
            aVar.V(f10);
        }
    }

    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f5810i != null) {
            if (truncateAt != TextUtils.TruncateAt.MARQUEE) {
                super.setEllipsize(truncateAt);
                a aVar = this.f5810i;
                if (aVar != null) {
                    aVar.p2(truncateAt);
                    return;
                }
                return;
            }
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z10) {
        this.f5819r = z10;
        l(this.f5821t);
    }

    public void setGravity(int i10) {
        if (i10 != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i10);
        }
    }

    public void setHideMotionSpec(r4.f fVar) {
        a aVar = this.f5810i;
        if (aVar != null) {
            aVar.q2(fVar);
        }
    }

    public void setHideMotionSpecResource(int i10) {
        a aVar = this.f5810i;
        if (aVar != null) {
            aVar.r2(i10);
        }
    }

    public void setIconEndPadding(float f10) {
        a aVar = this.f5810i;
        if (aVar != null) {
            aVar.s2(f10);
        }
    }

    public void setIconEndPaddingResource(int i10) {
        a aVar = this.f5810i;
        if (aVar != null) {
            aVar.t2(i10);
        }
    }

    public void setIconStartPadding(float f10) {
        a aVar = this.f5810i;
        if (aVar != null) {
            aVar.u2(f10);
        }
    }

    public void setIconStartPaddingResource(int i10) {
        a aVar = this.f5810i;
        if (aVar != null) {
            aVar.v2(i10);
        }
    }

    public void setInternalOnCheckedChangeListener(g gVar) {
    }

    public void setLayoutDirection(int i10) {
        if (this.f5810i != null) {
            super.setLayoutDirection(i10);
        }
    }

    public void setLines(int i10) {
        if (i10 <= 1) {
            super.setLines(i10);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxLines(int i10) {
        if (i10 <= 1) {
            super.setMaxLines(i10);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxWidth(int i10) {
        super.setMaxWidth(i10);
        a aVar = this.f5810i;
        if (aVar != null) {
            aVar.w2(i10);
        }
    }

    public void setMinLines(int i10) {
        if (i10 <= 1) {
            super.setMinLines(i10);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f5814m = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f5813l = onClickListener;
        y();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        a aVar = this.f5810i;
        if (aVar != null) {
            aVar.x2(colorStateList);
        }
        if (!this.f5810i.l1()) {
            A();
        }
    }

    public void setRippleColorResource(int i10) {
        a aVar = this.f5810i;
        if (aVar != null) {
            aVar.y2(i10);
            if (!this.f5810i.l1()) {
                A();
            }
        }
    }

    public void setShapeAppearanceModel(i5.k kVar) {
        this.f5810i.setShapeAppearanceModel(kVar);
    }

    public void setShowMotionSpec(r4.f fVar) {
        a aVar = this.f5810i;
        if (aVar != null) {
            aVar.A2(fVar);
        }
    }

    public void setShowMotionSpecResource(int i10) {
        a aVar = this.f5810i;
        if (aVar != null) {
            aVar.B2(i10);
        }
    }

    public void setSingleLine(boolean z10) {
        if (z10) {
            super.setSingleLine(z10);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        a aVar = this.f5810i;
        if (aVar != null) {
            if (charSequence == null) {
                charSequence = "";
            }
            super.setText(aVar.L2() ? null : charSequence, bufferType);
            a aVar2 = this.f5810i;
            if (aVar2 != null) {
                aVar2.C2(charSequence);
            }
        }
    }

    public void setTextAppearance(int i10) {
        super.setTextAppearance(i10);
        a aVar = this.f5810i;
        if (aVar != null) {
            aVar.E2(i10);
        }
        C();
    }

    public void setTextAppearanceResource(int i10) {
        setTextAppearance(getContext(), i10);
    }

    public void setTextEndPadding(float f10) {
        a aVar = this.f5810i;
        if (aVar != null) {
            aVar.F2(f10);
        }
    }

    public void setTextEndPaddingResource(int i10) {
        a aVar = this.f5810i;
        if (aVar != null) {
            aVar.G2(i10);
        }
    }

    public void setTextSize(int i10, float f10) {
        super.setTextSize(i10, f10);
        a aVar = this.f5810i;
        if (aVar != null) {
            aVar.H2(TypedValue.applyDimension(i10, f10, getResources().getDisplayMetrics()));
        }
        C();
    }

    public void setTextStartPadding(float f10) {
        a aVar = this.f5810i;
        if (aVar != null) {
            aVar.I2(f10);
        }
    }

    public void setTextStartPaddingResource(int i10) {
        a aVar = this.f5810i;
        if (aVar != null) {
            aVar.J2(i10);
        }
    }

    public boolean u() {
        boolean z10 = false;
        playSoundEffect(0);
        View.OnClickListener onClickListener = this.f5813l;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z10 = true;
        }
        if (this.f5824w) {
            this.f5823v.U(1, 1);
        }
        return z10;
    }

    public boolean w() {
        return this.f5819r;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Chip(android.content.Context r7, android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r4 = A
            android.content.Context r7 = m5.a.c(r7, r8, r9, r4)
            r6.<init>(r7, r8, r9)
            android.graphics.Rect r7 = new android.graphics.Rect
            r7.<init>()
            r6.f5825x = r7
            android.graphics.RectF r7 = new android.graphics.RectF
            r7.<init>()
            r6.f5826y = r7
            com.google.android.material.chip.Chip$a r7 = new com.google.android.material.chip.Chip$a
            r7.<init>()
            r6.f5827z = r7
            android.content.Context r0 = r6.getContext()
            r6.D(r8)
            com.google.android.material.chip.a r7 = com.google.android.material.chip.a.u0(r0, r8, r9, r4)
            r6.o(r0, r8, r9)
            r6.setChipDrawable(r7)
            float r1 = androidx.core.view.m0.w(r6)
            r7.V(r1)
            int[] r2 = q4.k.f15108o0
            r1 = 0
            int[] r5 = new int[r1]
            r1 = r8
            r3 = r9
            android.content.res.TypedArray r8 = com.google.android.material.internal.r.i(r0, r1, r2, r3, r4, r5)
            int r9 = q4.k.Z0
            boolean r9 = r8.hasValue(r9)
            r8.recycle()
            com.google.android.material.chip.Chip$c r8 = new com.google.android.material.chip.Chip$c
            r8.<init>(r6)
            r6.f5823v = r8
            r6.y()
            if (r9 != 0) goto L_0x0059
            r6.p()
        L_0x0059:
            boolean r8 = r6.f5815n
            r6.setChecked(r8)
            java.lang.CharSequence r8 = r7.g1()
            r6.setText(r8)
            android.text.TextUtils$TruncateAt r7 = r7.a1()
            r6.setEllipsize(r7)
            r6.C()
            com.google.android.material.chip.a r7 = r6.f5810i
            boolean r7 = r7.L2()
            if (r7 != 0) goto L_0x007e
            r7 = 1
            r6.setLines(r7)
            r6.setHorizontallyScrolling(r7)
        L_0x007e:
            r7 = 8388627(0x800013, float:1.175497E-38)
            r6.setGravity(r7)
            r6.B()
            boolean r7 = r6.w()
            if (r7 == 0) goto L_0x0092
            int r7 = r6.f5821t
            r6.setMinHeight(r7)
        L_0x0092:
            int r7 = androidx.core.view.m0.B(r6)
            r6.f5820s = r7
            w4.a r7 = new w4.a
            r7.<init>(r6)
            super.setOnCheckedChangeListener(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setCheckedIconVisible(boolean z10) {
        a aVar = this.f5810i;
        if (aVar != null) {
            aVar.D1(z10);
        }
    }

    public void setChipIconVisible(boolean z10) {
        a aVar = this.f5810i;
        if (aVar != null) {
            aVar.R1(z10);
        }
    }

    public void setCloseIconVisible(boolean z10) {
        a aVar = this.f5810i;
        if (aVar != null) {
            aVar.n2(z10);
        }
        y();
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
    }

    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        a aVar = this.f5810i;
        if (aVar != null) {
            aVar.E2(i10);
        }
        C();
    }

    public void setTextAppearance(d dVar) {
        a aVar = this.f5810i;
        if (aVar != null) {
            aVar.D2(dVar);
        }
        C();
    }
}
