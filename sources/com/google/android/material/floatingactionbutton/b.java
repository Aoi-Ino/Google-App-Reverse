package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.core.view.m0;
import i5.n;
import java.util.ArrayList;
import java.util.Iterator;

abstract class b {
    static final TimeInterpolator D = r4.a.f15584c;
    private static final int E = q4.b.motionDurationLong2;
    private static final int F = q4.b.motionEasingEmphasizedInterpolator;
    private static final int G = q4.b.motionDurationMedium1;
    private static final int H = q4.b.motionEasingEmphasizedAccelerateInterpolator;
    static final int[] I = {16842919, 16842910};
    static final int[] J = {16843623, 16842908, 16842910};
    static final int[] K = {16842908, 16842910};
    static final int[] L = {16843623, 16842910};
    static final int[] M = {16842910};
    static final int[] N = new int[0];
    private final RectF A = new RectF();
    private final Matrix B = new Matrix();
    private ViewTreeObserver.OnPreDrawListener C;

    /* renamed from: a  reason: collision with root package name */
    i5.k f6012a;

    /* renamed from: b  reason: collision with root package name */
    i5.g f6013b;

    /* renamed from: c  reason: collision with root package name */
    Drawable f6014c;

    /* renamed from: d  reason: collision with root package name */
    a f6015d;

    /* renamed from: e  reason: collision with root package name */
    Drawable f6016e;

    /* renamed from: f  reason: collision with root package name */
    boolean f6017f;

    /* renamed from: g  reason: collision with root package name */
    boolean f6018g = true;

    /* renamed from: h  reason: collision with root package name */
    float f6019h;

    /* renamed from: i  reason: collision with root package name */
    float f6020i;

    /* renamed from: j  reason: collision with root package name */
    float f6021j;

    /* renamed from: k  reason: collision with root package name */
    int f6022k;

    /* renamed from: l  reason: collision with root package name */
    private final com.google.android.material.internal.m f6023l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public Animator f6024m;

    /* renamed from: n  reason: collision with root package name */
    private r4.f f6025n;

    /* renamed from: o  reason: collision with root package name */
    private r4.f f6026o;

    /* renamed from: p  reason: collision with root package name */
    private float f6027p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public float f6028q = 1.0f;

    /* renamed from: r  reason: collision with root package name */
    private int f6029r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public int f6030s = 0;

    /* renamed from: t  reason: collision with root package name */
    private ArrayList f6031t;

    /* renamed from: u  reason: collision with root package name */
    private ArrayList f6032u;

    /* renamed from: v  reason: collision with root package name */
    private ArrayList f6033v;

    /* renamed from: w  reason: collision with root package name */
    final FloatingActionButton f6034w;

    /* renamed from: x  reason: collision with root package name */
    final h5.b f6035x;

    /* renamed from: y  reason: collision with root package name */
    private final Rect f6036y = new Rect();

    /* renamed from: z  reason: collision with root package name */
    private final RectF f6037z = new RectF();

    class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        private boolean f6038a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f6039b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ k f6040c;

        a(boolean z10, k kVar) {
            this.f6039b = z10;
        }

        public void onAnimationCancel(Animator animator) {
            this.f6038a = true;
        }

        public void onAnimationEnd(Animator animator) {
            int unused = b.this.f6030s = 0;
            Animator unused2 = b.this.f6024m = null;
            if (!this.f6038a) {
                FloatingActionButton floatingActionButton = b.this.f6034w;
                boolean z10 = this.f6039b;
                floatingActionButton.b(z10 ? 8 : 4, z10);
                k kVar = this.f6040c;
                if (kVar != null) {
                    kVar.b();
                }
            }
        }

        public void onAnimationStart(Animator animator) {
            b.this.f6034w.b(0, this.f6039b);
            int unused = b.this.f6030s = 1;
            Animator unused2 = b.this.f6024m = animator;
            this.f6038a = false;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.b$b  reason: collision with other inner class name */
    class C0102b extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f6042a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k f6043b;

        C0102b(boolean z10, k kVar) {
            this.f6042a = z10;
        }

        public void onAnimationEnd(Animator animator) {
            int unused = b.this.f6030s = 0;
            Animator unused2 = b.this.f6024m = null;
            k kVar = this.f6043b;
            if (kVar != null) {
                kVar.a();
            }
        }

        public void onAnimationStart(Animator animator) {
            b.this.f6034w.b(0, this.f6042a);
            int unused = b.this.f6030s = 2;
            Animator unused2 = b.this.f6024m = animator;
        }
    }

    class c extends r4.e {
        c() {
        }

        /* renamed from: a */
        public Matrix evaluate(float f10, Matrix matrix, Matrix matrix2) {
            float unused = b.this.f6028q = f10;
            return super.a(f10, matrix, matrix2);
        }
    }

    class d implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ float f6046a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ float f6047b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ float f6048c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ float f6049d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ float f6050e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ float f6051f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ float f6052g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Matrix f6053h;

        d(float f10, float f11, float f12, float f13, float f14, float f15, float f16, Matrix matrix) {
            this.f6046a = f10;
            this.f6047b = f11;
            this.f6048c = f12;
            this.f6049d = f13;
            this.f6050e = f14;
            this.f6051f = f15;
            this.f6052g = f16;
            this.f6053h = matrix;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            b.this.f6034w.setAlpha(r4.a.b(this.f6046a, this.f6047b, 0.0f, 0.2f, floatValue));
            b.this.f6034w.setScaleX(r4.a.a(this.f6048c, this.f6049d, floatValue));
            b.this.f6034w.setScaleY(r4.a.a(this.f6050e, this.f6049d, floatValue));
            float unused = b.this.f6028q = r4.a.a(this.f6051f, this.f6052g, floatValue);
            b.this.e(r4.a.a(this.f6051f, this.f6052g, floatValue), this.f6053h);
            b.this.f6034w.setImageMatrix(this.f6053h);
        }
    }

    class e implements TypeEvaluator {

        /* renamed from: a  reason: collision with root package name */
        FloatEvaluator f6055a = new FloatEvaluator();

        e() {
        }

        /* renamed from: a */
        public Float evaluate(float f10, Float f11, Float f12) {
            float floatValue = this.f6055a.evaluate(f10, f11, f12).floatValue();
            if (floatValue < 0.1f) {
                floatValue = 0.0f;
            }
            return Float.valueOf(floatValue);
        }
    }

    class f implements ViewTreeObserver.OnPreDrawListener {
        f() {
        }

        public boolean onPreDraw() {
            b.this.E();
            return true;
        }
    }

    private class g extends m {
        g() {
            super(b.this, (a) null);
        }

        /* access modifiers changed from: protected */
        public float a() {
            return 0.0f;
        }
    }

    private class h extends m {
        h() {
            super(b.this, (a) null);
        }

        /* access modifiers changed from: protected */
        public float a() {
            b bVar = b.this;
            return bVar.f6019h + bVar.f6020i;
        }
    }

    private class i extends m {
        i() {
            super(b.this, (a) null);
        }

        /* access modifiers changed from: protected */
        public float a() {
            b bVar = b.this;
            return bVar.f6019h + bVar.f6021j;
        }
    }

    interface j {
        void a();

        void b();
    }

    interface k {
        void a();

        void b();
    }

    private class l extends m {
        l() {
            super(b.this, (a) null);
        }

        /* access modifiers changed from: protected */
        public float a() {
            return b.this.f6019h;
        }
    }

    private abstract class m extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        private boolean f6062a;

        /* renamed from: b  reason: collision with root package name */
        private float f6063b;

        /* renamed from: c  reason: collision with root package name */
        private float f6064c;

        private m() {
        }

        /* access modifiers changed from: protected */
        public abstract float a();

        public void onAnimationEnd(Animator animator) {
            b.this.d0((float) ((int) this.f6064c));
            this.f6062a = false;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (!this.f6062a) {
                i5.g gVar = b.this.f6013b;
                this.f6063b = gVar == null ? 0.0f : gVar.w();
                this.f6064c = a();
                this.f6062a = true;
            }
            b bVar = b.this;
            float f10 = this.f6063b;
            bVar.d0((float) ((int) (f10 + ((this.f6064c - f10) * valueAnimator.getAnimatedFraction()))));
        }

        /* synthetic */ m(b bVar, a aVar) {
            this();
        }
    }

    b(FloatingActionButton floatingActionButton, h5.b bVar) {
        this.f6034w = floatingActionButton;
        this.f6035x = bVar;
        com.google.android.material.internal.m mVar = new com.google.android.material.internal.m();
        this.f6023l = mVar;
        mVar.a(I, h(new i()));
        mVar.a(J, h(new h()));
        mVar.a(K, h(new h()));
        mVar.a(L, h(new h()));
        mVar.a(M, h(new l()));
        mVar.a(N, h(new g()));
        this.f6027p = floatingActionButton.getRotation();
    }

    private boolean X() {
        return m0.U(this.f6034w) && !this.f6034w.isInEditMode();
    }

    /* access modifiers changed from: private */
    public void e(float f10, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.f6034w.getDrawable();
        if (drawable != null && this.f6029r != 0) {
            RectF rectF = this.f6037z;
            RectF rectF2 = this.A;
            rectF.set(0.0f, 0.0f, (float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
            int i10 = this.f6029r;
            rectF2.set(0.0f, 0.0f, (float) i10, (float) i10);
            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            int i11 = this.f6029r;
            matrix.postScale(f10, f10, ((float) i11) / 2.0f, ((float) i11) / 2.0f);
        }
    }

    private void e0(ObjectAnimator objectAnimator) {
        if (Build.VERSION.SDK_INT == 26) {
            objectAnimator.setEvaluator(new e());
        }
    }

    private AnimatorSet f(r4.f fVar, float f10, float f11, float f12) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f6034w, View.ALPHA, new float[]{f10});
        fVar.e("opacity").a(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f6034w, View.SCALE_X, new float[]{f11});
        fVar.e("scale").a(ofFloat2);
        e0(ofFloat2);
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f6034w, View.SCALE_Y, new float[]{f11});
        fVar.e("scale").a(ofFloat3);
        e0(ofFloat3);
        arrayList.add(ofFloat3);
        e(f12, this.B);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this.f6034w, new r4.d(), new c(), new Matrix[]{new Matrix(this.B)});
        fVar.e("iconScale").a(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        r4.b.a(animatorSet, arrayList);
        return animatorSet;
    }

    private AnimatorSet g(float f10, float f11, float f12, int i10, int i11) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.addUpdateListener(new d(this.f6034w.getAlpha(), f10, this.f6034w.getScaleX(), f11, this.f6034w.getScaleY(), this.f6028q, f12, new Matrix(this.B)));
        arrayList.add(ofFloat);
        r4.b.a(animatorSet, arrayList);
        animatorSet.setDuration((long) d5.h.f(this.f6034w.getContext(), i10, this.f6034w.getContext().getResources().getInteger(q4.g.material_motion_duration_long_1)));
        animatorSet.setInterpolator(d5.h.g(this.f6034w.getContext(), i11, r4.a.f15583b));
        return animatorSet;
    }

    private ValueAnimator h(m mVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(D);
        valueAnimator.setDuration(100);
        valueAnimator.addListener(mVar);
        valueAnimator.addUpdateListener(mVar);
        valueAnimator.setFloatValues(new float[]{0.0f, 1.0f});
        return valueAnimator;
    }

    private ViewTreeObserver.OnPreDrawListener n() {
        if (this.C == null) {
            this.C = new f();
        }
        return this.C;
    }

    /* access modifiers changed from: package-private */
    public void A() {
        ViewTreeObserver viewTreeObserver = this.f6034w.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.C;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            this.C = null;
        }
    }

    /* access modifiers changed from: package-private */
    public abstract void B(int[] iArr);

    /* access modifiers changed from: package-private */
    public abstract void C(float f10, float f11, float f12);

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: android.graphics.drawable.Drawable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: android.graphics.drawable.InsetDrawable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: android.graphics.drawable.InsetDrawable} */
    /* JADX WARNING: type inference failed for: r0v3, types: [android.graphics.drawable.Drawable] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void D(android.graphics.Rect r8) {
        /*
            r7 = this;
            android.graphics.drawable.Drawable r0 = r7.f6016e
            java.lang.String r1 = "Didn't initialize content background"
            androidx.core.util.g.h(r0, r1)
            boolean r0 = r7.W()
            if (r0 == 0) goto L_0x0023
            android.graphics.drawable.InsetDrawable r0 = new android.graphics.drawable.InsetDrawable
            android.graphics.drawable.Drawable r2 = r7.f6016e
            int r3 = r8.left
            int r4 = r8.top
            int r5 = r8.right
            int r6 = r8.bottom
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            h5.b r8 = r7.f6035x
        L_0x001f:
            r8.b(r0)
            goto L_0x0028
        L_0x0023:
            h5.b r8 = r7.f6035x
            android.graphics.drawable.Drawable r0 = r7.f6016e
            goto L_0x001f
        L_0x0028:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.floatingactionbutton.b.D(android.graphics.Rect):void");
    }

    /* access modifiers changed from: package-private */
    public void E() {
        float rotation = this.f6034w.getRotation();
        if (this.f6027p != rotation) {
            this.f6027p = rotation;
            a0();
        }
    }

    /* access modifiers changed from: package-private */
    public void F() {
        ArrayList arrayList = this.f6033v;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((j) it.next()).b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void G() {
        ArrayList arrayList = this.f6033v;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((j) it.next()).a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public abstract boolean H();

    /* access modifiers changed from: package-private */
    public void I(ColorStateList colorStateList) {
        i5.g gVar = this.f6013b;
        if (gVar != null) {
            gVar.setTintList(colorStateList);
        }
        a aVar = this.f6015d;
        if (aVar != null) {
            aVar.c(colorStateList);
        }
    }

    /* access modifiers changed from: package-private */
    public void J(PorterDuff.Mode mode) {
        i5.g gVar = this.f6013b;
        if (gVar != null) {
            gVar.setTintMode(mode);
        }
    }

    /* access modifiers changed from: package-private */
    public final void K(float f10) {
        if (this.f6019h != f10) {
            this.f6019h = f10;
            C(f10, this.f6020i, this.f6021j);
        }
    }

    /* access modifiers changed from: package-private */
    public void L(boolean z10) {
        this.f6017f = z10;
    }

    /* access modifiers changed from: package-private */
    public final void M(r4.f fVar) {
        this.f6026o = fVar;
    }

    /* access modifiers changed from: package-private */
    public final void N(float f10) {
        if (this.f6020i != f10) {
            this.f6020i = f10;
            C(this.f6019h, f10, this.f6021j);
        }
    }

    /* access modifiers changed from: package-private */
    public final void O(float f10) {
        this.f6028q = f10;
        Matrix matrix = this.B;
        e(f10, matrix);
        this.f6034w.setImageMatrix(matrix);
    }

    /* access modifiers changed from: package-private */
    public final void P(int i10) {
        if (this.f6029r != i10) {
            this.f6029r = i10;
            b0();
        }
    }

    /* access modifiers changed from: package-private */
    public void Q(int i10) {
        this.f6022k = i10;
    }

    /* access modifiers changed from: package-private */
    public final void R(float f10) {
        if (this.f6021j != f10) {
            this.f6021j = f10;
            C(this.f6019h, this.f6020i, f10);
        }
    }

    /* access modifiers changed from: package-private */
    public void S(ColorStateList colorStateList) {
        Drawable drawable = this.f6014c;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.o(drawable, g5.b.a(colorStateList));
        }
    }

    /* access modifiers changed from: package-private */
    public void T(boolean z10) {
        this.f6018g = z10;
        c0();
    }

    /* access modifiers changed from: package-private */
    public final void U(i5.k kVar) {
        this.f6012a = kVar;
        i5.g gVar = this.f6013b;
        if (gVar != null) {
            gVar.setShapeAppearanceModel(kVar);
        }
        Drawable drawable = this.f6014c;
        if (drawable instanceof n) {
            ((n) drawable).setShapeAppearanceModel(kVar);
        }
        a aVar = this.f6015d;
        if (aVar != null) {
            aVar.f(kVar);
        }
    }

    /* access modifiers changed from: package-private */
    public final void V(r4.f fVar) {
        this.f6025n = fVar;
    }

    /* access modifiers changed from: package-private */
    public abstract boolean W();

    /* access modifiers changed from: package-private */
    public final boolean Y() {
        return !this.f6017f || this.f6034w.getSizeDimension() >= this.f6022k;
    }

    /* access modifiers changed from: package-private */
    public void Z(k kVar, boolean z10) {
        if (!w()) {
            Animator animator = this.f6024m;
            if (animator != null) {
                animator.cancel();
            }
            boolean z11 = this.f6025n == null;
            if (X()) {
                if (this.f6034w.getVisibility() != 0) {
                    float f10 = 0.0f;
                    this.f6034w.setAlpha(0.0f);
                    this.f6034w.setScaleY(z11 ? 0.4f : 0.0f);
                    this.f6034w.setScaleX(z11 ? 0.4f : 0.0f);
                    if (z11) {
                        f10 = 0.4f;
                    }
                    O(f10);
                }
                r4.f fVar = this.f6025n;
                AnimatorSet f11 = fVar != null ? f(fVar, 1.0f, 1.0f, 1.0f) : g(1.0f, 1.0f, 1.0f, E, F);
                f11.addListener(new C0102b(z10, kVar));
                ArrayList arrayList = this.f6031t;
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        f11.addListener((Animator.AnimatorListener) it.next());
                    }
                }
                f11.start();
                return;
            }
            this.f6034w.b(0, z10);
            this.f6034w.setAlpha(1.0f);
            this.f6034w.setScaleY(1.0f);
            this.f6034w.setScaleX(1.0f);
            O(1.0f);
            if (kVar != null) {
                kVar.a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public abstract void a0();

    /* access modifiers changed from: package-private */
    public final void b0() {
        O(this.f6028q);
    }

    /* access modifiers changed from: package-private */
    public final void c0() {
        Rect rect = this.f6036y;
        o(rect);
        D(rect);
        this.f6035x.a(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* access modifiers changed from: package-private */
    public void d0(float f10) {
        i5.g gVar = this.f6013b;
        if (gVar != null) {
            gVar.V(f10);
        }
    }

    /* access modifiers changed from: package-private */
    public final Drawable i() {
        return this.f6016e;
    }

    /* access modifiers changed from: package-private */
    public abstract float j();

    /* access modifiers changed from: package-private */
    public boolean k() {
        return this.f6017f;
    }

    /* access modifiers changed from: package-private */
    public final r4.f l() {
        return this.f6026o;
    }

    /* access modifiers changed from: package-private */
    public float m() {
        return this.f6020i;
    }

    /* access modifiers changed from: package-private */
    public void o(Rect rect) {
        int s10 = s();
        float j10 = this.f6018g ? j() + this.f6021j : 0.0f;
        int max = Math.max(s10, (int) Math.ceil((double) j10));
        int max2 = Math.max(s10, (int) Math.ceil((double) (j10 * 1.5f)));
        rect.set(max, max2, max, max2);
    }

    /* access modifiers changed from: package-private */
    public float p() {
        return this.f6021j;
    }

    /* access modifiers changed from: package-private */
    public final i5.k q() {
        return this.f6012a;
    }

    /* access modifiers changed from: package-private */
    public final r4.f r() {
        return this.f6025n;
    }

    /* access modifiers changed from: package-private */
    public int s() {
        if (this.f6017f) {
            return Math.max((this.f6022k - this.f6034w.getSizeDimension()) / 2, 0);
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public void t(k kVar, boolean z10) {
        if (!v()) {
            Animator animator = this.f6024m;
            if (animator != null) {
                animator.cancel();
            }
            if (X()) {
                r4.f fVar = this.f6026o;
                AnimatorSet f10 = fVar != null ? f(fVar, 0.0f, 0.0f, 0.0f) : g(0.0f, 0.4f, 0.4f, G, H);
                f10.addListener(new a(z10, kVar));
                ArrayList arrayList = this.f6032u;
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        f10.addListener((Animator.AnimatorListener) it.next());
                    }
                }
                f10.start();
                return;
            }
            this.f6034w.b(z10 ? 8 : 4, z10);
            if (kVar != null) {
                kVar.b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public abstract void u(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i10);

    /* access modifiers changed from: package-private */
    public boolean v() {
        return this.f6034w.getVisibility() == 0 ? this.f6030s == 1 : this.f6030s != 2;
    }

    /* access modifiers changed from: package-private */
    public boolean w() {
        return this.f6034w.getVisibility() != 0 ? this.f6030s == 2 : this.f6030s != 1;
    }

    /* access modifiers changed from: package-private */
    public abstract void x();

    /* access modifiers changed from: package-private */
    public void y() {
        i5.g gVar = this.f6013b;
        if (gVar != null) {
            i5.h.f(this.f6034w, gVar);
        }
        if (H()) {
            this.f6034w.getViewTreeObserver().addOnPreDrawListener(n());
        }
    }

    /* access modifiers changed from: package-private */
    public abstract void z();
}
