package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.core.view.m0;
import androidx.recyclerview.widget.RecyclerView;

class d extends RecyclerView.o implements RecyclerView.s {
    private static final int[] D = {16842919};
    private static final int[] E = new int[0];
    int A;
    private final Runnable B;
    private final RecyclerView.t C;

    /* renamed from: a  reason: collision with root package name */
    private final int f3829a;

    /* renamed from: b  reason: collision with root package name */
    private final int f3830b;

    /* renamed from: c  reason: collision with root package name */
    final StateListDrawable f3831c;

    /* renamed from: d  reason: collision with root package name */
    final Drawable f3832d;

    /* renamed from: e  reason: collision with root package name */
    private final int f3833e;

    /* renamed from: f  reason: collision with root package name */
    private final int f3834f;

    /* renamed from: g  reason: collision with root package name */
    private final StateListDrawable f3835g;

    /* renamed from: h  reason: collision with root package name */
    private final Drawable f3836h;

    /* renamed from: i  reason: collision with root package name */
    private final int f3837i;

    /* renamed from: j  reason: collision with root package name */
    private final int f3838j;

    /* renamed from: k  reason: collision with root package name */
    int f3839k;

    /* renamed from: l  reason: collision with root package name */
    int f3840l;

    /* renamed from: m  reason: collision with root package name */
    float f3841m;

    /* renamed from: n  reason: collision with root package name */
    int f3842n;

    /* renamed from: o  reason: collision with root package name */
    int f3843o;

    /* renamed from: p  reason: collision with root package name */
    float f3844p;

    /* renamed from: q  reason: collision with root package name */
    private int f3845q = 0;

    /* renamed from: r  reason: collision with root package name */
    private int f3846r = 0;

    /* renamed from: s  reason: collision with root package name */
    private RecyclerView f3847s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f3848t = false;

    /* renamed from: u  reason: collision with root package name */
    private boolean f3849u = false;

    /* renamed from: v  reason: collision with root package name */
    private int f3850v = 0;

    /* renamed from: w  reason: collision with root package name */
    private int f3851w = 0;

    /* renamed from: x  reason: collision with root package name */
    private final int[] f3852x = new int[2];

    /* renamed from: y  reason: collision with root package name */
    private final int[] f3853y = new int[2];

    /* renamed from: z  reason: collision with root package name */
    final ValueAnimator f3854z;

    class a implements Runnable {
        a() {
        }

        public void run() {
            d.this.q(500);
        }
    }

    class b extends RecyclerView.t {
        b() {
        }

        public void b(RecyclerView recyclerView, int i10, int i11) {
            d.this.B(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    }

    private class c extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        private boolean f3857a = false;

        c() {
        }

        public void onAnimationCancel(Animator animator) {
            this.f3857a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (this.f3857a) {
                this.f3857a = false;
            } else if (((Float) d.this.f3854z.getAnimatedValue()).floatValue() == 0.0f) {
                d dVar = d.this;
                dVar.A = 0;
                dVar.y(0);
            } else {
                d dVar2 = d.this;
                dVar2.A = 2;
                dVar2.v();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.d$d  reason: collision with other inner class name */
    private class C0067d implements ValueAnimator.AnimatorUpdateListener {
        C0067d() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            d.this.f3831c.setAlpha(floatValue);
            d.this.f3832d.setAlpha(floatValue);
            d.this.v();
        }
    }

    d(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i10, int i11, int i12) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.f3854z = ofFloat;
        this.A = 0;
        this.B = new a();
        this.C = new b();
        this.f3831c = stateListDrawable;
        this.f3832d = drawable;
        this.f3835g = stateListDrawable2;
        this.f3836h = drawable2;
        this.f3833e = Math.max(i10, stateListDrawable.getIntrinsicWidth());
        this.f3834f = Math.max(i10, drawable.getIntrinsicWidth());
        this.f3837i = Math.max(i10, stateListDrawable2.getIntrinsicWidth());
        this.f3838j = Math.max(i10, drawable2.getIntrinsicWidth());
        this.f3829a = i11;
        this.f3830b = i12;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new c());
        ofFloat.addUpdateListener(new C0067d());
        j(recyclerView);
    }

    private void C(float f10) {
        int[] p10 = p();
        float max = Math.max((float) p10[0], Math.min((float) p10[1], f10));
        if (Math.abs(((float) this.f3840l) - max) >= 2.0f) {
            int x10 = x(this.f3841m, max, p10, this.f3847s.computeVerticalScrollRange(), this.f3847s.computeVerticalScrollOffset(), this.f3846r);
            if (x10 != 0) {
                this.f3847s.scrollBy(0, x10);
            }
            this.f3841m = max;
        }
    }

    private void k() {
        this.f3847s.removeCallbacks(this.B);
    }

    private void l() {
        this.f3847s.Y0(this);
        this.f3847s.Z0(this);
        this.f3847s.a1(this.C);
        k();
    }

    private void m(Canvas canvas) {
        int i10 = this.f3846r;
        int i11 = this.f3837i;
        int i12 = i10 - i11;
        int i13 = this.f3843o;
        int i14 = this.f3842n;
        int i15 = i13 - (i14 / 2);
        this.f3835g.setBounds(0, 0, i14, i11);
        this.f3836h.setBounds(0, 0, this.f3845q, this.f3838j);
        canvas.translate(0.0f, (float) i12);
        this.f3836h.draw(canvas);
        canvas.translate((float) i15, 0.0f);
        this.f3835g.draw(canvas);
        canvas.translate((float) (-i15), (float) (-i12));
    }

    private void n(Canvas canvas) {
        int i10 = this.f3845q;
        int i11 = this.f3833e;
        int i12 = i10 - i11;
        int i13 = this.f3840l;
        int i14 = this.f3839k;
        int i15 = i13 - (i14 / 2);
        this.f3831c.setBounds(0, 0, i11, i14);
        this.f3832d.setBounds(0, 0, this.f3834f, this.f3846r);
        if (s()) {
            this.f3832d.draw(canvas);
            canvas.translate((float) this.f3833e, (float) i15);
            canvas.scale(-1.0f, 1.0f);
            this.f3831c.draw(canvas);
            canvas.scale(-1.0f, 1.0f);
            i12 = this.f3833e;
        } else {
            canvas.translate((float) i12, 0.0f);
            this.f3832d.draw(canvas);
            canvas.translate(0.0f, (float) i15);
            this.f3831c.draw(canvas);
        }
        canvas.translate((float) (-i12), (float) (-i15));
    }

    private int[] o() {
        int[] iArr = this.f3853y;
        int i10 = this.f3830b;
        iArr[0] = i10;
        iArr[1] = this.f3845q - i10;
        return iArr;
    }

    private int[] p() {
        int[] iArr = this.f3852x;
        int i10 = this.f3830b;
        iArr[0] = i10;
        iArr[1] = this.f3846r - i10;
        return iArr;
    }

    private void r(float f10) {
        int[] o10 = o();
        float max = Math.max((float) o10[0], Math.min((float) o10[1], f10));
        if (Math.abs(((float) this.f3843o) - max) >= 2.0f) {
            int x10 = x(this.f3844p, max, o10, this.f3847s.computeHorizontalScrollRange(), this.f3847s.computeHorizontalScrollOffset(), this.f3845q);
            if (x10 != 0) {
                this.f3847s.scrollBy(x10, 0);
            }
            this.f3844p = max;
        }
    }

    private boolean s() {
        return m0.B(this.f3847s) == 1;
    }

    private void w(int i10) {
        k();
        this.f3847s.postDelayed(this.B, (long) i10);
    }

    private int x(float f10, float f11, int[] iArr, int i10, int i11, int i12) {
        int i13 = iArr[1] - iArr[0];
        if (i13 == 0) {
            return 0;
        }
        int i14 = i10 - i12;
        int i15 = (int) (((f11 - f10) / ((float) i13)) * ((float) i14));
        int i16 = i11 + i15;
        if (i16 >= i14 || i16 < 0) {
            return 0;
        }
        return i15;
    }

    private void z() {
        this.f3847s.h(this);
        this.f3847s.j(this);
        this.f3847s.k(this.C);
    }

    public void A() {
        int i10 = this.A;
        if (i10 != 0) {
            if (i10 == 3) {
                this.f3854z.cancel();
            } else {
                return;
            }
        }
        this.A = 1;
        ValueAnimator valueAnimator = this.f3854z;
        valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f});
        this.f3854z.setDuration(500);
        this.f3854z.setStartDelay(0);
        this.f3854z.start();
    }

    /* access modifiers changed from: package-private */
    public void B(int i10, int i11) {
        int computeVerticalScrollRange = this.f3847s.computeVerticalScrollRange();
        int i12 = this.f3846r;
        this.f3848t = computeVerticalScrollRange - i12 > 0 && i12 >= this.f3829a;
        int computeHorizontalScrollRange = this.f3847s.computeHorizontalScrollRange();
        int i13 = this.f3845q;
        boolean z10 = computeHorizontalScrollRange - i13 > 0 && i13 >= this.f3829a;
        this.f3849u = z10;
        boolean z11 = this.f3848t;
        if (z11 || z10) {
            if (z11) {
                float f10 = (float) i12;
                this.f3840l = (int) ((f10 * (((float) i11) + (f10 / 2.0f))) / ((float) computeVerticalScrollRange));
                this.f3839k = Math.min(i12, (i12 * i12) / computeVerticalScrollRange);
            }
            if (this.f3849u) {
                float f11 = (float) i13;
                this.f3843o = (int) ((f11 * (((float) i10) + (f11 / 2.0f))) / ((float) computeHorizontalScrollRange));
                this.f3842n = Math.min(i13, (i13 * i13) / computeHorizontalScrollRange);
            }
            int i14 = this.f3850v;
            if (i14 == 0 || i14 == 1) {
                y(1);
            }
        } else if (this.f3850v != 0) {
            y(0);
        }
    }

    public boolean a(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i10 = this.f3850v;
        if (i10 == 1) {
            boolean u10 = u(motionEvent.getX(), motionEvent.getY());
            boolean t10 = t(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!u10 && !t10) {
                return false;
            }
            if (t10) {
                this.f3851w = 1;
                this.f3844p = (float) ((int) motionEvent.getX());
            } else if (u10) {
                this.f3851w = 2;
                this.f3841m = (float) ((int) motionEvent.getY());
            }
            y(2);
        } else if (i10 != 2) {
            return false;
        }
        return true;
    }

    public void b(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f3850v != 0) {
            if (motionEvent.getAction() == 0) {
                boolean u10 = u(motionEvent.getX(), motionEvent.getY());
                boolean t10 = t(motionEvent.getX(), motionEvent.getY());
                if (u10 || t10) {
                    if (t10) {
                        this.f3851w = 1;
                        this.f3844p = (float) ((int) motionEvent.getX());
                    } else if (u10) {
                        this.f3851w = 2;
                        this.f3841m = (float) ((int) motionEvent.getY());
                    }
                    y(2);
                }
            } else if (motionEvent.getAction() == 1 && this.f3850v == 2) {
                this.f3841m = 0.0f;
                this.f3844p = 0.0f;
                y(1);
                this.f3851w = 0;
            } else if (motionEvent.getAction() == 2 && this.f3850v == 2) {
                A();
                if (this.f3851w == 1) {
                    r(motionEvent.getX());
                }
                if (this.f3851w == 2) {
                    C(motionEvent.getY());
                }
            }
        }
    }

    public void c(boolean z10) {
    }

    public void i(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        if (this.f3845q != this.f3847s.getWidth() || this.f3846r != this.f3847s.getHeight()) {
            this.f3845q = this.f3847s.getWidth();
            this.f3846r = this.f3847s.getHeight();
            y(0);
        } else if (this.A != 0) {
            if (this.f3848t) {
                n(canvas);
            }
            if (this.f3849u) {
                m(canvas);
            }
        }
    }

    public void j(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f3847s;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                l();
            }
            this.f3847s = recyclerView;
            if (recyclerView != null) {
                z();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void q(int i10) {
        int i11 = this.A;
        if (i11 == 1) {
            this.f3854z.cancel();
        } else if (i11 != 2) {
            return;
        }
        this.A = 3;
        ValueAnimator valueAnimator = this.f3854z;
        valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f});
        this.f3854z.setDuration((long) i10);
        this.f3854z.start();
    }

    /* access modifiers changed from: package-private */
    public boolean t(float f10, float f11) {
        if (f11 >= ((float) (this.f3846r - this.f3837i))) {
            int i10 = this.f3843o;
            int i11 = this.f3842n;
            return f10 >= ((float) (i10 - (i11 / 2))) && f10 <= ((float) (i10 + (i11 / 2)));
        }
    }

    /* access modifiers changed from: package-private */
    public boolean u(float f10, float f11) {
        if (!s() ? f10 >= ((float) (this.f3845q - this.f3833e)) : f10 <= ((float) this.f3833e)) {
            int i10 = this.f3840l;
            int i11 = this.f3839k;
            return f11 >= ((float) (i10 - (i11 / 2))) && f11 <= ((float) (i10 + (i11 / 2)));
        }
    }

    /* access modifiers changed from: package-private */
    public void v() {
        this.f3847s.invalidate();
    }

    /* access modifiers changed from: package-private */
    public void y(int i10) {
        int i11;
        if (i10 == 2 && this.f3850v != 2) {
            this.f3831c.setState(D);
            k();
        }
        if (i10 == 0) {
            v();
        } else {
            A();
        }
        if (this.f3850v != 2 || i10 == 2) {
            if (i10 == 1) {
                i11 = 1500;
            }
            this.f3850v = i10;
        }
        this.f3831c.setState(E);
        i11 = 1200;
        w(i11);
        this.f3850v = i10;
    }
}
