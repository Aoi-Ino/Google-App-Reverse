package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.core.view.m0;

public abstract class a implements View.OnTouchListener {

    /* renamed from: v  reason: collision with root package name */
    private static final int f2729v = ViewConfiguration.getTapTimeout();

    /* renamed from: e  reason: collision with root package name */
    final C0044a f2730e = new C0044a();

    /* renamed from: f  reason: collision with root package name */
    private final Interpolator f2731f = new AccelerateInterpolator();

    /* renamed from: g  reason: collision with root package name */
    final View f2732g;

    /* renamed from: h  reason: collision with root package name */
    private Runnable f2733h;

    /* renamed from: i  reason: collision with root package name */
    private float[] f2734i = {0.0f, 0.0f};

    /* renamed from: j  reason: collision with root package name */
    private float[] f2735j = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: k  reason: collision with root package name */
    private int f2736k;

    /* renamed from: l  reason: collision with root package name */
    private int f2737l;

    /* renamed from: m  reason: collision with root package name */
    private float[] f2738m = {0.0f, 0.0f};

    /* renamed from: n  reason: collision with root package name */
    private float[] f2739n = {0.0f, 0.0f};

    /* renamed from: o  reason: collision with root package name */
    private float[] f2740o = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: p  reason: collision with root package name */
    private boolean f2741p;

    /* renamed from: q  reason: collision with root package name */
    boolean f2742q;

    /* renamed from: r  reason: collision with root package name */
    boolean f2743r;

    /* renamed from: s  reason: collision with root package name */
    boolean f2744s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f2745t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f2746u;

    /* renamed from: androidx.core.widget.a$a  reason: collision with other inner class name */
    private static class C0044a {

        /* renamed from: a  reason: collision with root package name */
        private int f2747a;

        /* renamed from: b  reason: collision with root package name */
        private int f2748b;

        /* renamed from: c  reason: collision with root package name */
        private float f2749c;

        /* renamed from: d  reason: collision with root package name */
        private float f2750d;

        /* renamed from: e  reason: collision with root package name */
        private long f2751e = Long.MIN_VALUE;

        /* renamed from: f  reason: collision with root package name */
        private long f2752f = 0;

        /* renamed from: g  reason: collision with root package name */
        private int f2753g = 0;

        /* renamed from: h  reason: collision with root package name */
        private int f2754h = 0;

        /* renamed from: i  reason: collision with root package name */
        private long f2755i = -1;

        /* renamed from: j  reason: collision with root package name */
        private float f2756j;

        /* renamed from: k  reason: collision with root package name */
        private int f2757k;

        C0044a() {
        }

        private float e(long j10) {
            long j11 = this.f2751e;
            if (j10 < j11) {
                return 0.0f;
            }
            long j12 = this.f2755i;
            if (j12 < 0 || j10 < j12) {
                return a.e(((float) (j10 - j11)) / ((float) this.f2747a), 0.0f, 1.0f) * 0.5f;
            }
            float f10 = this.f2756j;
            return (1.0f - f10) + (f10 * a.e(((float) (j10 - j12)) / ((float) this.f2757k), 0.0f, 1.0f));
        }

        private float g(float f10) {
            return (-4.0f * f10 * f10) + (f10 * 4.0f);
        }

        public void a() {
            if (this.f2752f != 0) {
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                float g10 = g(e(currentAnimationTimeMillis));
                this.f2752f = currentAnimationTimeMillis;
                float f10 = ((float) (currentAnimationTimeMillis - this.f2752f)) * g10;
                this.f2753g = (int) (this.f2749c * f10);
                this.f2754h = (int) (f10 * this.f2750d);
                return;
            }
            throw new RuntimeException("Cannot compute scroll delta before calling start()");
        }

        public int b() {
            return this.f2753g;
        }

        public int c() {
            return this.f2754h;
        }

        public int d() {
            float f10 = this.f2749c;
            return (int) (f10 / Math.abs(f10));
        }

        public int f() {
            float f10 = this.f2750d;
            return (int) (f10 / Math.abs(f10));
        }

        public boolean h() {
            return this.f2755i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f2755i + ((long) this.f2757k);
        }

        public void i() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f2757k = a.f((int) (currentAnimationTimeMillis - this.f2751e), 0, this.f2748b);
            this.f2756j = e(currentAnimationTimeMillis);
            this.f2755i = currentAnimationTimeMillis;
        }

        public void j(int i10) {
            this.f2748b = i10;
        }

        public void k(int i10) {
            this.f2747a = i10;
        }

        public void l(float f10, float f11) {
            this.f2749c = f10;
            this.f2750d = f11;
        }

        public void m() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f2751e = currentAnimationTimeMillis;
            this.f2755i = -1;
            this.f2752f = currentAnimationTimeMillis;
            this.f2756j = 0.5f;
            this.f2753g = 0;
            this.f2754h = 0;
        }
    }

    private class b implements Runnable {
        b() {
        }

        public void run() {
            a aVar = a.this;
            if (aVar.f2744s) {
                if (aVar.f2742q) {
                    aVar.f2742q = false;
                    aVar.f2730e.m();
                }
                C0044a aVar2 = a.this.f2730e;
                if (aVar2.h() || !a.this.u()) {
                    a.this.f2744s = false;
                    return;
                }
                a aVar3 = a.this;
                if (aVar3.f2743r) {
                    aVar3.f2743r = false;
                    aVar3.c();
                }
                aVar2.a();
                a.this.j(aVar2.b(), aVar2.c());
                m0.i0(a.this.f2732g, this);
            }
        }
    }

    public a(View view) {
        this.f2732g = view;
        float f10 = Resources.getSystem().getDisplayMetrics().density;
        float f11 = (float) ((int) ((1575.0f * f10) + 0.5f));
        o(f11, f11);
        float f12 = (float) ((int) ((f10 * 315.0f) + 0.5f));
        p(f12, f12);
        l(1);
        n(Float.MAX_VALUE, Float.MAX_VALUE);
        s(0.2f, 0.2f);
        t(1.0f, 1.0f);
        k(f2729v);
        r(500);
        q(500);
    }

    private float d(int i10, float f10, float f11, float f12) {
        float h10 = h(this.f2734i[i10], f11, this.f2735j[i10], f10);
        int i11 = (h10 > 0.0f ? 1 : (h10 == 0.0f ? 0 : -1));
        if (i11 == 0) {
            return 0.0f;
        }
        float f13 = this.f2738m[i10];
        float f14 = this.f2739n[i10];
        float f15 = this.f2740o[i10];
        float f16 = f13 * f12;
        return i11 > 0 ? e(h10 * f16, f14, f15) : -e((-h10) * f16, f14, f15);
    }

    static float e(float f10, float f11, float f12) {
        if (f10 > f12) {
            return f12;
        }
        return f10 < f11 ? f11 : f10;
    }

    static int f(int i10, int i11, int i12) {
        if (i10 > i12) {
            return i12;
        }
        return i10 < i11 ? i11 : i10;
    }

    private float g(float f10, float f11) {
        if (f11 == 0.0f) {
            return 0.0f;
        }
        int i10 = this.f2736k;
        if (i10 == 0 || i10 == 1) {
            if (f10 < f11) {
                if (f10 >= 0.0f) {
                    return 1.0f - (f10 / f11);
                }
                return (!this.f2744s || i10 != 1) ? 0.0f : 1.0f;
            }
        } else if (i10 == 2 && f10 < 0.0f) {
            return f10 / (-f11);
        }
    }

    private float h(float f10, float f11, float f12, float f13) {
        float f14;
        float e10 = e(f10 * f11, 0.0f, f12);
        float g10 = g(f11 - f13, e10) - g(f13, e10);
        if (g10 < 0.0f) {
            f14 = -this.f2731f.getInterpolation(-g10);
        } else if (g10 <= 0.0f) {
            return 0.0f;
        } else {
            f14 = this.f2731f.getInterpolation(g10);
        }
        return e(f14, -1.0f, 1.0f);
    }

    private void i() {
        if (this.f2742q) {
            this.f2744s = false;
        } else {
            this.f2730e.i();
        }
    }

    private void v() {
        int i10;
        if (this.f2733h == null) {
            this.f2733h = new b();
        }
        this.f2744s = true;
        this.f2742q = true;
        if (this.f2741p || (i10 = this.f2737l) <= 0) {
            this.f2733h.run();
        } else {
            m0.j0(this.f2732g, this.f2733h, (long) i10);
        }
        this.f2741p = true;
    }

    public abstract boolean a(int i10);

    public abstract boolean b(int i10);

    /* access modifiers changed from: package-private */
    public void c() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f2732g.onTouchEvent(obtain);
        obtain.recycle();
    }

    public abstract void j(int i10, int i11);

    public a k(int i10) {
        this.f2737l = i10;
        return this;
    }

    public a l(int i10) {
        this.f2736k = i10;
        return this;
    }

    public a m(boolean z10) {
        if (this.f2745t && !z10) {
            i();
        }
        this.f2745t = z10;
        return this;
    }

    public a n(float f10, float f11) {
        float[] fArr = this.f2735j;
        fArr[0] = f10;
        fArr[1] = f11;
        return this;
    }

    public a o(float f10, float f11) {
        float[] fArr = this.f2740o;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        if (r0 != 3) goto L_0x0058;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.f2745t
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L_0x001a
            if (r0 == r2) goto L_0x0016
            r3 = 2
            if (r0 == r3) goto L_0x001e
            r6 = 3
            if (r0 == r6) goto L_0x0016
            goto L_0x0058
        L_0x0016:
            r5.i()
            goto L_0x0058
        L_0x001a:
            r5.f2743r = r2
            r5.f2741p = r1
        L_0x001e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f2732g
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.d(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f2732g
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.d(r2, r7, r6, r3)
            androidx.core.widget.a$a r7 = r5.f2730e
            r7.l(r0, r6)
            boolean r6 = r5.f2744s
            if (r6 != 0) goto L_0x0058
            boolean r6 = r5.u()
            if (r6 == 0) goto L_0x0058
            r5.v()
        L_0x0058:
            boolean r6 = r5.f2746u
            if (r6 == 0) goto L_0x0061
            boolean r6 = r5.f2744s
            if (r6 == 0) goto L_0x0061
            r1 = r2
        L_0x0061:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public a p(float f10, float f11) {
        float[] fArr = this.f2739n;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    public a q(int i10) {
        this.f2730e.j(i10);
        return this;
    }

    public a r(int i10) {
        this.f2730e.k(i10);
        return this;
    }

    public a s(float f10, float f11) {
        float[] fArr = this.f2734i;
        fArr[0] = f10;
        fArr[1] = f11;
        return this;
    }

    public a t(float f10, float f11) {
        float[] fArr = this.f2738m;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    /* access modifiers changed from: package-private */
    public boolean u() {
        C0044a aVar = this.f2730e;
        int f10 = aVar.f();
        int d10 = aVar.d();
        return (f10 != 0 && b(f10)) || (d10 != 0 && a(d10));
    }
}
