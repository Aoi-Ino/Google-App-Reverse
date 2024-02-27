package com.google.android.material.snackbar;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.accessibility.y;
import androidx.core.view.c0;
import androidx.core.view.k1;
import androidx.core.view.m0;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.internal.u;
import com.google.android.material.internal.w;
import com.google.android.material.snackbar.d;
import java.util.List;

public abstract class BaseTransientBottomBar {
    private static final TimeInterpolator A = r4.a.f15582a;
    private static final TimeInterpolator B = r4.a.f15585d;
    static final Handler C = new Handler(Looper.getMainLooper(), new h());
    /* access modifiers changed from: private */
    public static final boolean D = false;
    private static final int[] E = {q4.b.snackbarStyle};
    /* access modifiers changed from: private */
    public static final String F = BaseTransientBottomBar.class.getSimpleName();

    /* renamed from: z  reason: collision with root package name */
    private static final TimeInterpolator f6276z = r4.a.f15583b;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final int f6277a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final int f6278b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final int f6279c;

    /* renamed from: d  reason: collision with root package name */
    private final TimeInterpolator f6280d;

    /* renamed from: e  reason: collision with root package name */
    private final TimeInterpolator f6281e;

    /* renamed from: f  reason: collision with root package name */
    private final TimeInterpolator f6282f;

    /* renamed from: g  reason: collision with root package name */
    private final ViewGroup f6283g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final Context f6284h;

    /* renamed from: i  reason: collision with root package name */
    protected final r f6285i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public final a f6286j;

    /* renamed from: k  reason: collision with root package name */
    private int f6287k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f6288l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f6289m = false;

    /* renamed from: n  reason: collision with root package name */
    private final Runnable f6290n = new i();
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public int f6291o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public int f6292p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public int f6293q;

    /* renamed from: r  reason: collision with root package name */
    private int f6294r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public int f6295s;
    /* access modifiers changed from: private */

    /* renamed from: t  reason: collision with root package name */
    public int f6296t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f6297u;

    /* renamed from: v  reason: collision with root package name */
    private List f6298v;

    /* renamed from: w  reason: collision with root package name */
    private Behavior f6299w;

    /* renamed from: x  reason: collision with root package name */
    private final AccessibilityManager f6300x;

    /* renamed from: y  reason: collision with root package name */
    d.b f6301y = new l();

    public static class Behavior extends SwipeDismissBehavior<View> {

        /* renamed from: p  reason: collision with root package name */
        private final q f6302p = new q(this);

        /* access modifiers changed from: private */
        public void U(BaseTransientBottomBar baseTransientBottomBar) {
            this.f6302p.c(baseTransientBottomBar);
        }

        public boolean J(View view) {
            return this.f6302p.a(view);
        }

        public boolean o(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            this.f6302p.b(coordinatorLayout, view, motionEvent);
            return super.o(coordinatorLayout, view, motionEvent);
        }
    }

    class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f6303a;

        a(int i10) {
            this.f6303a = i10;
        }

        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.P(this.f6303a);
        }
    }

    class b implements ValueAnimator.AnimatorUpdateListener {
        b() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            BaseTransientBottomBar.this.f6285i.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    class c implements ValueAnimator.AnimatorUpdateListener {
        c() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            BaseTransientBottomBar.this.f6285i.setScaleX(floatValue);
            BaseTransientBottomBar.this.f6285i.setScaleY(floatValue);
        }
    }

    class d extends AnimatorListenerAdapter {
        d() {
        }

        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.Q();
        }

        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.f6286j.a(BaseTransientBottomBar.this.f6279c - BaseTransientBottomBar.this.f6277a, BaseTransientBottomBar.this.f6277a);
        }
    }

    class e implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        private int f6308a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f6309b;

        e(int i10) {
            this.f6309b = i10;
            this.f6308a = i10;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (BaseTransientBottomBar.D) {
                m0.b0(BaseTransientBottomBar.this.f6285i, intValue - this.f6308a);
            } else {
                BaseTransientBottomBar.this.f6285i.setTranslationY((float) intValue);
            }
            this.f6308a = intValue;
        }
    }

    class f extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f6311a;

        f(int i10) {
            this.f6311a = i10;
        }

        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.P(this.f6311a);
        }

        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.f6286j.b(0, BaseTransientBottomBar.this.f6278b);
        }
    }

    class g implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        private int f6313a = 0;

        g() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (BaseTransientBottomBar.D) {
                m0.b0(BaseTransientBottomBar.this.f6285i, intValue - this.f6313a);
            } else {
                BaseTransientBottomBar.this.f6285i.setTranslationY((float) intValue);
            }
            this.f6313a = intValue;
        }
    }

    class h implements Handler.Callback {
        h() {
        }

        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 0) {
                ((BaseTransientBottomBar) message.obj).X();
                return true;
            } else if (i10 != 1) {
                return false;
            } else {
                ((BaseTransientBottomBar) message.obj).J(message.arg1);
                return true;
            }
        }
    }

    class i implements Runnable {
        i() {
        }

        public void run() {
            BaseTransientBottomBar baseTransientBottomBar = BaseTransientBottomBar.this;
            if (baseTransientBottomBar.f6285i != null && baseTransientBottomBar.f6284h != null) {
                int height = (w.a(BaseTransientBottomBar.this.f6284h).height() - BaseTransientBottomBar.this.H()) + ((int) BaseTransientBottomBar.this.f6285i.getTranslationY());
                if (height >= BaseTransientBottomBar.this.f6295s) {
                    BaseTransientBottomBar baseTransientBottomBar2 = BaseTransientBottomBar.this;
                    int unused = baseTransientBottomBar2.f6296t = baseTransientBottomBar2.f6295s;
                    return;
                }
                ViewGroup.LayoutParams layoutParams = BaseTransientBottomBar.this.f6285i.getLayoutParams();
                if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                    Log.w(BaseTransientBottomBar.F, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                    return;
                }
                BaseTransientBottomBar baseTransientBottomBar3 = BaseTransientBottomBar.this;
                int unused2 = baseTransientBottomBar3.f6296t = baseTransientBottomBar3.f6295s;
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += BaseTransientBottomBar.this.f6295s - height;
                BaseTransientBottomBar.this.f6285i.requestLayout();
            }
        }
    }

    class j implements c0 {
        j() {
        }

        public k1 a(View view, k1 k1Var) {
            int unused = BaseTransientBottomBar.this.f6291o = k1Var.i();
            int unused2 = BaseTransientBottomBar.this.f6292p = k1Var.j();
            int unused3 = BaseTransientBottomBar.this.f6293q = k1Var.k();
            BaseTransientBottomBar.this.d0();
            return k1Var;
        }
    }

    class k extends androidx.core.view.a {
        k() {
        }

        public void g(View view, y yVar) {
            super.g(view, yVar);
            yVar.a(1048576);
            yVar.r0(true);
        }

        public boolean j(View view, int i10, Bundle bundle) {
            if (i10 != 1048576) {
                return super.j(view, i10, bundle);
            }
            BaseTransientBottomBar.this.x();
            return true;
        }
    }

    class l implements d.b {
        l() {
        }

        public void a() {
            Handler handler = BaseTransientBottomBar.C;
            handler.sendMessage(handler.obtainMessage(0, BaseTransientBottomBar.this));
        }

        public void b(int i10) {
            Handler handler = BaseTransientBottomBar.C;
            handler.sendMessage(handler.obtainMessage(1, i10, 0, BaseTransientBottomBar.this));
        }
    }

    class m implements Runnable {
        m() {
        }

        public void run() {
            BaseTransientBottomBar.this.P(3);
        }
    }

    class n implements SwipeDismissBehavior.c {
        n() {
        }

        public void a(View view) {
            if (view.getParent() != null) {
                view.setVisibility(8);
            }
            BaseTransientBottomBar.this.y(0);
        }

        public void b(int i10) {
            if (i10 == 0) {
                d.c().k(BaseTransientBottomBar.this.f6301y);
            } else if (i10 == 1 || i10 == 2) {
                d.c().j(BaseTransientBottomBar.this.f6301y);
            }
        }
    }

    class o implements Runnable {
        o() {
        }

        public void run() {
            r rVar = BaseTransientBottomBar.this.f6285i;
            if (rVar != null) {
                if (rVar.getParent() != null) {
                    BaseTransientBottomBar.this.f6285i.setVisibility(0);
                }
                if (BaseTransientBottomBar.this.f6285i.getAnimationMode() == 1) {
                    BaseTransientBottomBar.this.Z();
                } else {
                    BaseTransientBottomBar.this.b0();
                }
            }
        }
    }

    class p extends AnimatorListenerAdapter {
        p() {
        }

        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.Q();
        }
    }

    public static class q {

        /* renamed from: a  reason: collision with root package name */
        private d.b f6323a;

        public q(SwipeDismissBehavior swipeDismissBehavior) {
            swipeDismissBehavior.Q(0.1f);
            swipeDismissBehavior.O(0.6f);
            swipeDismissBehavior.R(0);
        }

        public boolean a(View view) {
            return view instanceof r;
        }

        public void b(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    d.c().k(this.f6323a);
                }
            } else if (coordinatorLayout.B(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                d.c().j(this.f6323a);
            }
        }

        public void c(BaseTransientBottomBar baseTransientBottomBar) {
            this.f6323a = baseTransientBottomBar.f6301y;
        }
    }

    protected static class r extends FrameLayout {

        /* renamed from: p  reason: collision with root package name */
        private static final View.OnTouchListener f6324p = new a();

        /* renamed from: e  reason: collision with root package name */
        private BaseTransientBottomBar f6325e;

        /* renamed from: f  reason: collision with root package name */
        i5.k f6326f;

        /* renamed from: g  reason: collision with root package name */
        private int f6327g;

        /* renamed from: h  reason: collision with root package name */
        private final float f6328h;

        /* renamed from: i  reason: collision with root package name */
        private final float f6329i;

        /* renamed from: j  reason: collision with root package name */
        private final int f6330j;

        /* renamed from: k  reason: collision with root package name */
        private final int f6331k;

        /* renamed from: l  reason: collision with root package name */
        private ColorStateList f6332l;

        /* renamed from: m  reason: collision with root package name */
        private PorterDuff.Mode f6333m;
        /* access modifiers changed from: private */

        /* renamed from: n  reason: collision with root package name */
        public Rect f6334n;

        /* renamed from: o  reason: collision with root package name */
        private boolean f6335o;

        class a implements View.OnTouchListener {
            a() {
            }

            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        protected r(Context context, AttributeSet attributeSet) {
            super(m5.a.c(context, attributeSet, 0, 0), attributeSet);
            Context context2 = getContext();
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, q4.k.W5);
            int i10 = q4.k.f15004d6;
            if (obtainStyledAttributes.hasValue(i10)) {
                m0.y0(this, (float) obtainStyledAttributes.getDimensionPixelSize(i10, 0));
            }
            this.f6327g = obtainStyledAttributes.getInt(q4.k.Z5, 0);
            if (obtainStyledAttributes.hasValue(q4.k.f15024f6) || obtainStyledAttributes.hasValue(q4.k.f15034g6)) {
                this.f6326f = i5.k.e(context2, attributeSet, 0, 0).m();
            }
            this.f6328h = obtainStyledAttributes.getFloat(q4.k.f14974a6, 1.0f);
            setBackgroundTintList(f5.c.a(context2, obtainStyledAttributes, q4.k.f14984b6));
            setBackgroundTintMode(u.i(obtainStyledAttributes.getInt(q4.k.f14994c6, -1), PorterDuff.Mode.SRC_IN));
            this.f6329i = obtainStyledAttributes.getFloat(q4.k.Y5, 1.0f);
            this.f6330j = obtainStyledAttributes.getDimensionPixelSize(q4.k.X5, -1);
            this.f6331k = obtainStyledAttributes.getDimensionPixelSize(q4.k.f15014e6, -1);
            obtainStyledAttributes.recycle();
            setOnTouchListener(f6324p);
            setFocusable(true);
            if (getBackground() == null) {
                m0.u0(this, d());
            }
        }

        private Drawable d() {
            int k10 = x4.a.k(this, q4.b.colorSurface, q4.b.colorOnSurface, getBackgroundOverlayColorAlpha());
            i5.k kVar = this.f6326f;
            Drawable j10 = kVar != null ? BaseTransientBottomBar.w(k10, kVar) : BaseTransientBottomBar.v(k10, getResources());
            ColorStateList colorStateList = this.f6332l;
            Drawable r10 = androidx.core.graphics.drawable.a.r(j10);
            if (colorStateList != null) {
                androidx.core.graphics.drawable.a.o(r10, this.f6332l);
            }
            return r10;
        }

        private void e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            this.f6334n = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }

        /* access modifiers changed from: private */
        public void setBaseTransientBottomBar(BaseTransientBottomBar baseTransientBottomBar) {
            this.f6325e = baseTransientBottomBar;
        }

        /* access modifiers changed from: package-private */
        public void c(ViewGroup viewGroup) {
            this.f6335o = true;
            viewGroup.addView(this);
            this.f6335o = false;
        }

        /* access modifiers changed from: package-private */
        public float getActionTextColorAlpha() {
            return this.f6329i;
        }

        /* access modifiers changed from: package-private */
        public int getAnimationMode() {
            return this.f6327g;
        }

        /* access modifiers changed from: package-private */
        public float getBackgroundOverlayColorAlpha() {
            return this.f6328h;
        }

        /* access modifiers changed from: package-private */
        public int getMaxInlineActionWidth() {
            return this.f6331k;
        }

        /* access modifiers changed from: package-private */
        public int getMaxWidth() {
            return this.f6330j;
        }

        /* access modifiers changed from: protected */
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            BaseTransientBottomBar baseTransientBottomBar = this.f6325e;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.M();
            }
            m0.n0(this);
        }

        /* access modifiers changed from: protected */
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            BaseTransientBottomBar baseTransientBottomBar = this.f6325e;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.N();
            }
        }

        /* access modifiers changed from: protected */
        public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
            super.onLayout(z10, i10, i11, i12, i13);
            BaseTransientBottomBar baseTransientBottomBar = this.f6325e;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.O();
            }
        }

        /* access modifiers changed from: protected */
        public void onMeasure(int i10, int i11) {
            int i12;
            super.onMeasure(i10, i11);
            if (this.f6330j > 0 && getMeasuredWidth() > (i12 = this.f6330j)) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), i11);
            }
        }

        /* access modifiers changed from: package-private */
        public void setAnimationMode(int i10) {
            this.f6327g = i10;
        }

        public void setBackground(Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        public void setBackgroundDrawable(Drawable drawable) {
            if (!(drawable == null || this.f6332l == null)) {
                drawable = androidx.core.graphics.drawable.a.r(drawable.mutate());
                androidx.core.graphics.drawable.a.o(drawable, this.f6332l);
                androidx.core.graphics.drawable.a.p(drawable, this.f6333m);
            }
            super.setBackgroundDrawable(drawable);
        }

        public void setBackgroundTintList(ColorStateList colorStateList) {
            this.f6332l = colorStateList;
            if (getBackground() != null) {
                Drawable r10 = androidx.core.graphics.drawable.a.r(getBackground().mutate());
                androidx.core.graphics.drawable.a.o(r10, colorStateList);
                androidx.core.graphics.drawable.a.p(r10, this.f6333m);
                if (r10 != getBackground()) {
                    super.setBackgroundDrawable(r10);
                }
            }
        }

        public void setBackgroundTintMode(PorterDuff.Mode mode) {
            this.f6333m = mode;
            if (getBackground() != null) {
                Drawable r10 = androidx.core.graphics.drawable.a.r(getBackground().mutate());
                androidx.core.graphics.drawable.a.p(r10, mode);
                if (r10 != getBackground()) {
                    super.setBackgroundDrawable(r10);
                }
            }
        }

        public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
            if (!this.f6335o && (layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                e((ViewGroup.MarginLayoutParams) layoutParams);
                BaseTransientBottomBar baseTransientBottomBar = this.f6325e;
                if (baseTransientBottomBar != null) {
                    baseTransientBottomBar.d0();
                }
            }
        }

        public void setOnClickListener(View.OnClickListener onClickListener) {
            setOnTouchListener(onClickListener != null ? null : f6324p);
            super.setOnClickListener(onClickListener);
        }
    }

    protected BaseTransientBottomBar(Context context, ViewGroup viewGroup, View view, a aVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null parent");
        } else if (view == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        } else if (aVar != null) {
            this.f6283g = viewGroup;
            this.f6286j = aVar;
            this.f6284h = context;
            com.google.android.material.internal.r.a(context);
            r rVar = (r) LayoutInflater.from(context).inflate(E(), viewGroup, false);
            this.f6285i = rVar;
            rVar.setBaseTransientBottomBar(this);
            if (view instanceof SnackbarContentLayout) {
                SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) view;
                snackbarContentLayout.c(rVar.getActionTextColorAlpha());
                snackbarContentLayout.setMaxInlineActionWidth(rVar.getMaxInlineActionWidth());
            }
            rVar.addView(view);
            m0.s0(rVar, 1);
            m0.B0(rVar, 1);
            m0.z0(rVar, true);
            m0.F0(rVar, new j());
            m0.q0(rVar, new k());
            this.f6300x = (AccessibilityManager) context.getSystemService("accessibility");
            int i10 = q4.b.motionDurationLong2;
            this.f6279c = d5.h.f(context, i10, 250);
            this.f6277a = d5.h.f(context, i10, 150);
            this.f6278b = d5.h.f(context, q4.b.motionDurationMedium1, 75);
            int i11 = q4.b.motionEasingEmphasizedInterpolator;
            this.f6280d = d5.h.g(context, i11, A);
            this.f6282f = d5.h.g(context, i11, B);
            this.f6281e = d5.h.g(context, i11, f6276z);
        } else {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
    }

    private ValueAnimator D(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(this.f6282f);
        ofFloat.addUpdateListener(new c());
        return ofFloat;
    }

    private int F() {
        int height = this.f6285i.getHeight();
        ViewGroup.LayoutParams layoutParams = this.f6285i.getLayoutParams();
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? height + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : height;
    }

    /* access modifiers changed from: private */
    public int H() {
        int[] iArr = new int[2];
        this.f6285i.getLocationInWindow(iArr);
        return iArr[1] + this.f6285i.getHeight();
    }

    private boolean L() {
        ViewGroup.LayoutParams layoutParams = this.f6285i.getLayoutParams();
        return (layoutParams instanceof CoordinatorLayout.f) && (((CoordinatorLayout.f) layoutParams).f() instanceof SwipeDismissBehavior);
    }

    private void R() {
        this.f6294r = u();
        d0();
    }

    private void T(CoordinatorLayout.f fVar) {
        SwipeDismissBehavior swipeDismissBehavior = this.f6299w;
        if (swipeDismissBehavior == null) {
            swipeDismissBehavior = C();
        }
        if (swipeDismissBehavior instanceof Behavior) {
            ((Behavior) swipeDismissBehavior).U(this);
        }
        swipeDismissBehavior.P(new n());
        fVar.o(swipeDismissBehavior);
        if (A() == null) {
            fVar.f2176g = 80;
        }
    }

    private boolean V() {
        return this.f6295s > 0 && !this.f6288l && L();
    }

    private void Y() {
        if (U()) {
            s();
            return;
        }
        if (this.f6285i.getParent() != null) {
            this.f6285i.setVisibility(0);
        }
        Q();
    }

    /* access modifiers changed from: private */
    public void Z() {
        ValueAnimator z10 = z(0.0f, 1.0f);
        ValueAnimator D2 = D(0.8f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{z10, D2});
        animatorSet.setDuration((long) this.f6277a);
        animatorSet.addListener(new p());
        animatorSet.start();
    }

    private void a0(int i10) {
        ValueAnimator z10 = z(1.0f, 0.0f);
        z10.setDuration((long) this.f6278b);
        z10.addListener(new a(i10));
        z10.start();
    }

    /* access modifiers changed from: private */
    public void b0() {
        int F2 = F();
        if (D) {
            m0.b0(this.f6285i, F2);
        } else {
            this.f6285i.setTranslationY((float) F2);
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(new int[]{F2, 0});
        valueAnimator.setInterpolator(this.f6281e);
        valueAnimator.setDuration((long) this.f6279c);
        valueAnimator.addListener(new d());
        valueAnimator.addUpdateListener(new e(F2));
        valueAnimator.start();
    }

    private void c0(int i10) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(new int[]{0, F()});
        valueAnimator.setInterpolator(this.f6281e);
        valueAnimator.setDuration((long) this.f6279c);
        valueAnimator.addListener(new f(i10));
        valueAnimator.addUpdateListener(new g());
        valueAnimator.start();
    }

    /* access modifiers changed from: private */
    public void d0() {
        String str;
        String str2;
        ViewGroup.LayoutParams layoutParams = this.f6285i.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            str = F;
            str2 = "Unable to update margins because layout params are not MarginLayoutParams";
        } else if (this.f6285i.f6334n == null) {
            str = F;
            str2 = "Unable to update margins because original view margins are not set";
        } else if (this.f6285i.getParent() != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int i10 = this.f6285i.f6334n.bottom + (A() != null ? this.f6294r : this.f6291o);
            int i11 = this.f6285i.f6334n.left + this.f6292p;
            int i12 = this.f6285i.f6334n.right + this.f6293q;
            int i13 = this.f6285i.f6334n.top;
            boolean z10 = (marginLayoutParams.bottomMargin == i10 && marginLayoutParams.leftMargin == i11 && marginLayoutParams.rightMargin == i12 && marginLayoutParams.topMargin == i13) ? false : true;
            if (z10) {
                marginLayoutParams.bottomMargin = i10;
                marginLayoutParams.leftMargin = i11;
                marginLayoutParams.rightMargin = i12;
                marginLayoutParams.topMargin = i13;
                this.f6285i.requestLayout();
            }
            if ((z10 || this.f6296t != this.f6295s) && Build.VERSION.SDK_INT >= 29 && V()) {
                this.f6285i.removeCallbacks(this.f6290n);
                this.f6285i.post(this.f6290n);
                return;
            }
            return;
        } else {
            return;
        }
        Log.w(str, str2);
    }

    private void t(int i10) {
        if (this.f6285i.getAnimationMode() == 1) {
            a0(i10);
        } else {
            c0(i10);
        }
    }

    private int u() {
        if (A() == null) {
            return 0;
        }
        int[] iArr = new int[2];
        A().getLocationOnScreen(iArr);
        int i10 = iArr[1];
        int[] iArr2 = new int[2];
        this.f6283g.getLocationOnScreen(iArr2);
        return (iArr2[1] + this.f6283g.getHeight()) - i10;
    }

    /* access modifiers changed from: private */
    public static GradientDrawable v(int i10, Resources resources) {
        float dimension = resources.getDimension(q4.d.mtrl_snackbar_background_corner_radius);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(dimension);
        gradientDrawable.setColor(i10);
        return gradientDrawable;
    }

    /* access modifiers changed from: private */
    public static i5.g w(int i10, i5.k kVar) {
        i5.g gVar = new i5.g(kVar);
        gVar.W(ColorStateList.valueOf(i10));
        return gVar;
    }

    private ValueAnimator z(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(this.f6280d);
        ofFloat.addUpdateListener(new b());
        return ofFloat;
    }

    public View A() {
        return null;
    }

    public int B() {
        return this.f6287k;
    }

    /* access modifiers changed from: protected */
    public SwipeDismissBehavior C() {
        return new Behavior();
    }

    /* access modifiers changed from: protected */
    public int E() {
        return I() ? q4.h.mtrl_layout_snackbar : q4.h.design_layout_snackbar;
    }

    public View G() {
        return this.f6285i;
    }

    /* access modifiers changed from: protected */
    public boolean I() {
        TypedArray obtainStyledAttributes = this.f6284h.obtainStyledAttributes(E);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId != -1;
    }

    /* access modifiers changed from: package-private */
    public final void J(int i10) {
        if (!U() || this.f6285i.getVisibility() != 0) {
            P(i10);
        } else {
            t(i10);
        }
    }

    public boolean K() {
        return d.c().e(this.f6301y);
    }

    /* access modifiers changed from: package-private */
    public void M() {
        WindowInsets rootWindowInsets;
        if (Build.VERSION.SDK_INT >= 29 && (rootWindowInsets = this.f6285i.getRootWindowInsets()) != null) {
            this.f6295s = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
            d0();
        }
    }

    /* access modifiers changed from: package-private */
    public void N() {
        if (K()) {
            C.post(new m());
        }
    }

    /* access modifiers changed from: package-private */
    public void O() {
        if (this.f6297u) {
            Y();
            this.f6297u = false;
        }
    }

    /* access modifiers changed from: package-private */
    public void P(int i10) {
        int size;
        d.c().h(this.f6301y);
        List list = this.f6298v;
        if (list == null || list.size() - 1 < 0) {
            ViewParent parent = this.f6285i.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f6285i);
                return;
            }
            return;
        }
        android.support.v4.media.session.b.a(this.f6298v.get(size));
        throw null;
    }

    /* access modifiers changed from: package-private */
    public void Q() {
        int size;
        d.c().i(this.f6301y);
        List list = this.f6298v;
        if (list != null && list.size() - 1 >= 0) {
            android.support.v4.media.session.b.a(this.f6298v.get(size));
            throw null;
        }
    }

    public BaseTransientBottomBar S(int i10) {
        this.f6287k = i10;
        return this;
    }

    /* access modifiers changed from: package-private */
    public boolean U() {
        AccessibilityManager accessibilityManager = this.f6300x;
        if (accessibilityManager == null) {
            return true;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1);
        return enabledAccessibilityServiceList != null && enabledAccessibilityServiceList.isEmpty();
    }

    public void W() {
        d.c().m(B(), this.f6301y);
    }

    /* access modifiers changed from: package-private */
    public final void X() {
        if (this.f6285i.getParent() == null) {
            ViewGroup.LayoutParams layoutParams = this.f6285i.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.f) {
                T((CoordinatorLayout.f) layoutParams);
            }
            this.f6285i.c(this.f6283g);
            R();
            this.f6285i.setVisibility(4);
        }
        if (m0.U(this.f6285i)) {
            Y();
        } else {
            this.f6297u = true;
        }
    }

    /* access modifiers changed from: package-private */
    public void s() {
        this.f6285i.post(new o());
    }

    public void x() {
        y(3);
    }

    /* access modifiers changed from: protected */
    public void y(int i10) {
        d.c().b(this.f6301y, i10);
    }
}
