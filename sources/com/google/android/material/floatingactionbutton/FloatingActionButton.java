package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.o;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.util.g;
import androidx.core.view.m0;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.b;
import com.google.android.material.internal.c;
import com.google.android.material.internal.v;
import i5.n;
import java.util.List;
import q4.d;
import q4.j;
import q4.k;
import r4.f;

public class FloatingActionButton extends v implements b5.a, n, CoordinatorLayout.b {

    /* renamed from: v  reason: collision with root package name */
    private static final int f5975v = j.Widget_Design_FloatingActionButton;

    /* renamed from: f  reason: collision with root package name */
    private ColorStateList f5976f;

    /* renamed from: g  reason: collision with root package name */
    private PorterDuff.Mode f5977g;

    /* renamed from: h  reason: collision with root package name */
    private ColorStateList f5978h;

    /* renamed from: i  reason: collision with root package name */
    private PorterDuff.Mode f5979i;

    /* renamed from: j  reason: collision with root package name */
    private ColorStateList f5980j;

    /* renamed from: k  reason: collision with root package name */
    private int f5981k;

    /* renamed from: l  reason: collision with root package name */
    private int f5982l;

    /* renamed from: m  reason: collision with root package name */
    private int f5983m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public int f5984n;

    /* renamed from: o  reason: collision with root package name */
    private int f5985o;

    /* renamed from: p  reason: collision with root package name */
    boolean f5986p;

    /* renamed from: q  reason: collision with root package name */
    final Rect f5987q;

    /* renamed from: r  reason: collision with root package name */
    private final Rect f5988r;

    /* renamed from: s  reason: collision with root package name */
    private final o f5989s;

    /* renamed from: t  reason: collision with root package name */
    private final b5.b f5990t;

    /* renamed from: u  reason: collision with root package name */
    private b f5991u;

    protected static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.c {

        /* renamed from: e  reason: collision with root package name */
        private Rect f5992e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f5993f;

        public BaseBehavior() {
            this.f5993f = true;
        }

        private static boolean J(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.f) {
                return ((CoordinatorLayout.f) layoutParams).f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        private void K(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton) {
            Rect rect = floatingActionButton.f5987q;
            if (rect != null && rect.centerX() > 0 && rect.centerY() > 0) {
                CoordinatorLayout.f fVar = (CoordinatorLayout.f) floatingActionButton.getLayoutParams();
                int i10 = 0;
                int i11 = floatingActionButton.getRight() >= coordinatorLayout.getWidth() - fVar.rightMargin ? rect.right : floatingActionButton.getLeft() <= fVar.leftMargin ? -rect.left : 0;
                if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - fVar.bottomMargin) {
                    i10 = rect.bottom;
                } else if (floatingActionButton.getTop() <= fVar.topMargin) {
                    i10 = -rect.top;
                }
                if (i10 != 0) {
                    m0.b0(floatingActionButton, i10);
                }
                if (i11 != 0) {
                    m0.a0(floatingActionButton, i11);
                }
            }
        }

        private boolean N(View view, FloatingActionButton floatingActionButton) {
            return this.f5993f && ((CoordinatorLayout.f) floatingActionButton.getLayoutParams()).e() == view.getId() && floatingActionButton.getUserSetVisibility() == 0;
        }

        private boolean O(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!N(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.f5992e == null) {
                this.f5992e = new Rect();
            }
            Rect rect = this.f5992e;
            c.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.i((a) null, false);
                return true;
            }
            floatingActionButton.l((a) null, false);
            return true;
        }

        private boolean P(View view, FloatingActionButton floatingActionButton) {
            if (!N(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((CoordinatorLayout.f) floatingActionButton.getLayoutParams()).topMargin) {
                floatingActionButton.i((a) null, false);
                return true;
            }
            floatingActionButton.l((a) null, false);
            return true;
        }

        /* renamed from: I */
        public boolean f(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            Rect rect2 = floatingActionButton.f5987q;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        /* renamed from: L */
        public boolean l(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                O(coordinatorLayout, (AppBarLayout) view, floatingActionButton);
                return false;
            } else if (!J(view)) {
                return false;
            } else {
                P(view, floatingActionButton);
                return false;
            }
        }

        /* renamed from: M */
        public boolean p(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i10) {
            List r10 = coordinatorLayout.r(floatingActionButton);
            int size = r10.size();
            for (int i11 = 0; i11 < size; i11++) {
                View view = (View) r10.get(i11);
                if (!(view instanceof AppBarLayout)) {
                    if (J(view) && P(view, floatingActionButton)) {
                        break;
                    }
                } else if (O(coordinatorLayout, (AppBarLayout) view, floatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.I(floatingActionButton, i10);
            K(coordinatorLayout, floatingActionButton);
            return true;
        }

        public void k(CoordinatorLayout.f fVar) {
            if (fVar.f2177h == 0) {
                fVar.f2177h = 80;
            }
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.T1);
            this.f5993f = obtainStyledAttributes.getBoolean(k.U1, true);
            obtainStyledAttributes.recycle();
        }
    }

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public /* bridge */ /* synthetic */ boolean I(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            return super.f(coordinatorLayout, floatingActionButton, rect);
        }

        public /* bridge */ /* synthetic */ boolean L(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            return super.l(coordinatorLayout, floatingActionButton, view);
        }

        public /* bridge */ /* synthetic */ boolean M(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i10) {
            return super.p(coordinatorLayout, floatingActionButton, i10);
        }

        public /* bridge */ /* synthetic */ void k(CoordinatorLayout.f fVar) {
            super.k(fVar);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static abstract class a {
    }

    private class b implements h5.b {
        b() {
        }

        public void a(int i10, int i11, int i12, int i13) {
            FloatingActionButton.this.f5987q.set(i10, i11, i12, i13);
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            floatingActionButton.setPadding(i10 + floatingActionButton.f5984n, i11 + FloatingActionButton.this.f5984n, i12 + FloatingActionButton.this.f5984n, i13 + FloatingActionButton.this.f5984n);
        }

        public void b(Drawable drawable) {
            if (drawable != null) {
                FloatingActionButton.super.setBackgroundDrawable(drawable);
            }
        }

        public boolean c() {
            return FloatingActionButton.this.f5986p;
        }
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, q4.b.floatingActionButtonStyle);
    }

    private b e() {
        return new c(this, new b());
    }

    private int g(int i10) {
        int i11 = this.f5983m;
        if (i11 != 0) {
            return i11;
        }
        Resources resources = getResources();
        if (i10 == -1) {
            return Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? g(1) : g(0);
        }
        return resources.getDimensionPixelSize(i10 != 1 ? d.design_fab_size_normal : d.design_fab_size_mini);
    }

    private b getImpl() {
        if (this.f5991u == null) {
            this.f5991u = e();
        }
        return this.f5991u;
    }

    private void h(Rect rect) {
        f(rect);
        int i10 = -this.f5991u.s();
        rect.inset(i10, i10);
    }

    private void j(Rect rect) {
        int i10 = rect.left;
        Rect rect2 = this.f5987q;
        rect.left = i10 + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    private void k() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            ColorStateList colorStateList = this.f5978h;
            if (colorStateList == null) {
                androidx.core.graphics.drawable.a.c(drawable);
                return;
            }
            int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
            PorterDuff.Mode mode = this.f5979i;
            if (mode == null) {
                mode = PorterDuff.Mode.SRC_IN;
            }
            drawable.mutate().setColorFilter(androidx.appcompat.widget.j.e(colorForState, mode));
        }
    }

    private b.k m(a aVar) {
        return null;
    }

    public boolean a() {
        return this.f5990t.c();
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().B(getDrawableState());
    }

    public void f(Rect rect) {
        rect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
        j(rect);
    }

    public ColorStateList getBackgroundTintList() {
        return this.f5976f;
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f5977g;
    }

    public CoordinatorLayout.c getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().j();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().m();
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().p();
    }

    public Drawable getContentBackground() {
        return getImpl().i();
    }

    public int getCustomSize() {
        return this.f5983m;
    }

    public int getExpandedComponentIdHint() {
        return this.f5990t.b();
    }

    public f getHideMotionSpec() {
        return getImpl().l();
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f5980j;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.f5980j;
    }

    public i5.k getShapeAppearanceModel() {
        return (i5.k) g.g(getImpl().q());
    }

    public f getShowMotionSpec() {
        return getImpl().r();
    }

    public int getSize() {
        return this.f5982l;
    }

    /* access modifiers changed from: package-private */
    public int getSizeDimension() {
        return g(this.f5982l);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public ColorStateList getSupportImageTintList() {
        return this.f5978h;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f5979i;
    }

    public boolean getUseCompatPadding() {
        return this.f5986p;
    }

    /* access modifiers changed from: package-private */
    public void i(a aVar, boolean z10) {
        getImpl().t(m(aVar), z10);
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().x();
    }

    /* access modifiers changed from: package-private */
    public void l(a aVar, boolean z10) {
        getImpl().Z(m(aVar), z10);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getImpl().y();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().A();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        int sizeDimension = getSizeDimension();
        this.f5984n = (sizeDimension - this.f5985o) / 2;
        getImpl().c0();
        int min = Math.min(View.resolveSize(sizeDimension, i10), View.resolveSize(sizeDimension, i11));
        Rect rect = this.f5987q;
        setMeasuredDimension(rect.left + min + rect.right, min + rect.top + rect.bottom);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof k5.a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        k5.a aVar = (k5.a) parcelable;
        super.onRestoreInstanceState(aVar.c());
        this.f5990t.d((Bundle) g.g((Bundle) aVar.f12943g.get("expandableWidgetHelper")));
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            onSaveInstanceState = new Bundle();
        }
        k5.a aVar = new k5.a(onSaveInstanceState);
        aVar.f12943g.put("expandableWidgetHelper", this.f5990t.e());
        return aVar;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            h(this.f5988r);
            if (!this.f5988r.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBackgroundColor(int i10) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundResource(int i10) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f5976f != colorStateList) {
            this.f5976f = colorStateList;
            getImpl().I(colorStateList);
        }
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f5977g != mode) {
            this.f5977g = mode;
            getImpl().J(mode);
        }
    }

    public void setCompatElevation(float f10) {
        getImpl().K(f10);
    }

    public void setCompatElevationResource(int i10) {
        setCompatElevation(getResources().getDimension(i10));
    }

    public void setCompatHoveredFocusedTranslationZ(float f10) {
        getImpl().N(f10);
    }

    public void setCompatHoveredFocusedTranslationZResource(int i10) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i10));
    }

    public void setCompatPressedTranslationZ(float f10) {
        getImpl().R(f10);
    }

    public void setCompatPressedTranslationZResource(int i10) {
        setCompatPressedTranslationZ(getResources().getDimension(i10));
    }

    public void setCustomSize(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        } else if (i10 != this.f5983m) {
            this.f5983m = i10;
            requestLayout();
        }
    }

    public void setElevation(float f10) {
        super.setElevation(f10);
        getImpl().d0(f10);
    }

    public void setEnsureMinTouchTargetSize(boolean z10) {
        if (z10 != getImpl().k()) {
            getImpl().L(z10);
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i10) {
        this.f5990t.f(i10);
    }

    public void setHideMotionSpec(f fVar) {
        getImpl().M(fVar);
    }

    public void setHideMotionSpecResource(int i10) {
        setHideMotionSpec(f.c(getContext(), i10));
    }

    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            getImpl().b0();
            if (this.f5978h != null) {
                k();
            }
        }
    }

    public void setImageResource(int i10) {
        this.f5989s.i(i10);
        k();
    }

    public void setMaxImageSize(int i10) {
        this.f5985o = i10;
        getImpl().P(i10);
    }

    public void setRippleColor(int i10) {
        setRippleColor(ColorStateList.valueOf(i10));
    }

    public void setScaleX(float f10) {
        super.setScaleX(f10);
        getImpl().F();
    }

    public void setScaleY(float f10) {
        super.setScaleY(f10);
        getImpl().F();
    }

    public void setShadowPaddingEnabled(boolean z10) {
        getImpl().T(z10);
    }

    public void setShapeAppearanceModel(i5.k kVar) {
        getImpl().U(kVar);
    }

    public void setShowMotionSpec(f fVar) {
        getImpl().V(fVar);
    }

    public void setShowMotionSpecResource(int i10) {
        setShowMotionSpec(f.c(getContext(), i10));
    }

    public void setSize(int i10) {
        this.f5983m = 0;
        if (i10 != this.f5982l) {
            this.f5982l = i10;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f5978h != colorStateList) {
            this.f5978h = colorStateList;
            k();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.f5979i != mode) {
            this.f5979i = mode;
            k();
        }
    }

    public void setTranslationX(float f10) {
        super.setTranslationX(f10);
        getImpl().G();
    }

    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        getImpl().G();
    }

    public void setTranslationZ(float f10) {
        super.setTranslationZ(f10);
        getImpl().G();
    }

    public void setUseCompatPadding(boolean z10) {
        if (this.f5986p != z10) {
            this.f5986p = z10;
            getImpl().z();
        }
    }

    public void setVisibility(int i10) {
        super.setVisibility(i10);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public FloatingActionButton(android.content.Context r11, android.util.AttributeSet r12, int r13) {
        /*
            r10 = this;
            int r6 = f5975v
            android.content.Context r11 = m5.a.c(r11, r12, r13, r6)
            r10.<init>(r11, r12, r13)
            android.graphics.Rect r11 = new android.graphics.Rect
            r11.<init>()
            r10.f5987q = r11
            android.graphics.Rect r11 = new android.graphics.Rect
            r11.<init>()
            r10.f5988r = r11
            android.content.Context r11 = r10.getContext()
            int[] r2 = q4.k.D1
            r7 = 0
            int[] r5 = new int[r7]
            r0 = r11
            r1 = r12
            r3 = r13
            r4 = r6
            android.content.res.TypedArray r0 = com.google.android.material.internal.r.i(r0, r1, r2, r3, r4, r5)
            int r1 = q4.k.F1
            android.content.res.ColorStateList r1 = f5.c.a(r11, r0, r1)
            r10.f5976f = r1
            int r1 = q4.k.G1
            r2 = -1
            int r1 = r0.getInt(r1, r2)
            r3 = 0
            android.graphics.PorterDuff$Mode r1 = com.google.android.material.internal.u.i(r1, r3)
            r10.f5977g = r1
            int r1 = q4.k.Q1
            android.content.res.ColorStateList r1 = f5.c.a(r11, r0, r1)
            r10.f5980j = r1
            int r1 = q4.k.L1
            int r1 = r0.getInt(r1, r2)
            r10.f5982l = r1
            int r1 = q4.k.K1
            int r1 = r0.getDimensionPixelSize(r1, r7)
            r10.f5983m = r1
            int r1 = q4.k.H1
            int r1 = r0.getDimensionPixelSize(r1, r7)
            r10.f5981k = r1
            int r1 = q4.k.I1
            r2 = 0
            float r1 = r0.getDimension(r1, r2)
            int r3 = q4.k.N1
            float r3 = r0.getDimension(r3, r2)
            int r4 = q4.k.P1
            float r2 = r0.getDimension(r4, r2)
            int r4 = q4.k.S1
            boolean r4 = r0.getBoolean(r4, r7)
            r10.f5986p = r4
            android.content.res.Resources r4 = r10.getResources()
            int r5 = q4.d.mtrl_fab_min_touch_target
            int r4 = r4.getDimensionPixelSize(r5)
            int r5 = q4.k.O1
            int r5 = r0.getDimensionPixelSize(r5, r7)
            r10.setMaxImageSize(r5)
            int r5 = q4.k.R1
            r4.f r5 = r4.f.b(r11, r0, r5)
            int r8 = q4.k.M1
            r4.f r8 = r4.f.b(r11, r0, r8)
            i5.c r9 = i5.k.f12406m
            i5.k$b r11 = i5.k.g(r11, r12, r13, r6, r9)
            i5.k r11 = r11.m()
            int r6 = q4.k.J1
            boolean r6 = r0.getBoolean(r6, r7)
            int r7 = q4.k.E1
            r9 = 1
            boolean r7 = r0.getBoolean(r7, r9)
            r10.setEnabled(r7)
            r0.recycle()
            androidx.appcompat.widget.o r0 = new androidx.appcompat.widget.o
            r0.<init>(r10)
            r10.f5989s = r0
            r0.g(r12, r13)
            b5.b r12 = new b5.b
            r12.<init>(r10)
            r10.f5990t = r12
            com.google.android.material.floatingactionbutton.b r12 = r10.getImpl()
            r12.U(r11)
            com.google.android.material.floatingactionbutton.b r11 = r10.getImpl()
            android.content.res.ColorStateList r12 = r10.f5976f
            android.graphics.PorterDuff$Mode r13 = r10.f5977g
            android.content.res.ColorStateList r0 = r10.f5980j
            int r7 = r10.f5981k
            r11.u(r12, r13, r0, r7)
            com.google.android.material.floatingactionbutton.b r11 = r10.getImpl()
            r11.Q(r4)
            com.google.android.material.floatingactionbutton.b r11 = r10.getImpl()
            r11.K(r1)
            com.google.android.material.floatingactionbutton.b r11 = r10.getImpl()
            r11.N(r3)
            com.google.android.material.floatingactionbutton.b r11 = r10.getImpl()
            r11.R(r2)
            com.google.android.material.floatingactionbutton.b r11 = r10.getImpl()
            r11.V(r5)
            com.google.android.material.floatingactionbutton.b r11 = r10.getImpl()
            r11.M(r8)
            com.google.android.material.floatingactionbutton.b r11 = r10.getImpl()
            r11.L(r6)
            android.widget.ImageView$ScaleType r11 = android.widget.ImageView.ScaleType.MATRIX
            r10.setScaleType(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.floatingactionbutton.FloatingActionButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.f5980j != colorStateList) {
            this.f5980j = colorStateList;
            getImpl().S(this.f5980j);
        }
    }
}
