package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import androidx.core.graphics.f;
import androidx.core.view.k1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public final class x0 {

    /* renamed from: a  reason: collision with root package name */
    private e f2668a;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final f f2669a;

        /* renamed from: b  reason: collision with root package name */
        private final f f2670b;

        private a(WindowInsetsAnimation.Bounds bounds) {
            this.f2669a = d.g(bounds);
            this.f2670b = d.f(bounds);
        }

        public static a d(WindowInsetsAnimation.Bounds bounds) {
            return new a(bounds);
        }

        public f a() {
            return this.f2669a;
        }

        public f b() {
            return this.f2670b;
        }

        public WindowInsetsAnimation.Bounds c() {
            return d.e(this);
        }

        public String toString() {
            return "Bounds{lower=" + this.f2669a + " upper=" + this.f2670b + "}";
        }

        public a(f fVar, f fVar2) {
            this.f2669a = fVar;
            this.f2670b = fVar2;
        }
    }

    public static abstract class b {

        /* renamed from: a  reason: collision with root package name */
        WindowInsets f2671a;

        /* renamed from: b  reason: collision with root package name */
        private final int f2672b;

        public b(int i10) {
            this.f2672b = i10;
        }

        public final int a() {
            return this.f2672b;
        }

        public abstract void b(x0 x0Var);

        public abstract void c(x0 x0Var);

        public abstract k1 d(k1 k1Var, List list);

        public abstract a e(x0 x0Var, a aVar);
    }

    private static class c extends e {

        /* renamed from: e  reason: collision with root package name */
        private static final Interpolator f2673e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

        /* renamed from: f  reason: collision with root package name */
        private static final Interpolator f2674f = new p0.a();

        /* renamed from: g  reason: collision with root package name */
        private static final Interpolator f2675g = new DecelerateInterpolator();

        private static class a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a  reason: collision with root package name */
            final b f2676a;

            /* renamed from: b  reason: collision with root package name */
            private k1 f2677b;

            /* renamed from: androidx.core.view.x0$c$a$a  reason: collision with other inner class name */
            class C0042a implements ValueAnimator.AnimatorUpdateListener {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ x0 f2678a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ k1 f2679b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ k1 f2680c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ int f2681d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ View f2682e;

                C0042a(x0 x0Var, k1 k1Var, k1 k1Var2, int i10, View view) {
                    this.f2678a = x0Var;
                    this.f2679b = k1Var;
                    this.f2680c = k1Var2;
                    this.f2681d = i10;
                    this.f2682e = view;
                }

                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f2678a.e(valueAnimator.getAnimatedFraction());
                    c.k(this.f2682e, c.o(this.f2679b, this.f2680c, this.f2678a.b(), this.f2681d), Collections.singletonList(this.f2678a));
                }
            }

            class b extends AnimatorListenerAdapter {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ x0 f2684a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ View f2685b;

                b(x0 x0Var, View view) {
                    this.f2684a = x0Var;
                    this.f2685b = view;
                }

                public void onAnimationEnd(Animator animator) {
                    this.f2684a.e(1.0f);
                    c.i(this.f2685b, this.f2684a);
                }
            }

            /* renamed from: androidx.core.view.x0$c$a$c  reason: collision with other inner class name */
            class C0043c implements Runnable {

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ View f2687e;

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ x0 f2688f;

                /* renamed from: g  reason: collision with root package name */
                final /* synthetic */ a f2689g;

                /* renamed from: h  reason: collision with root package name */
                final /* synthetic */ ValueAnimator f2690h;

                C0043c(View view, x0 x0Var, a aVar, ValueAnimator valueAnimator) {
                    this.f2687e = view;
                    this.f2688f = x0Var;
                    this.f2689g = aVar;
                    this.f2690h = valueAnimator;
                }

                public void run() {
                    c.l(this.f2687e, this.f2688f, this.f2689g);
                    this.f2690h.start();
                }
            }

            a(View view, b bVar) {
                this.f2676a = bVar;
                k1 I = m0.I(view);
                this.f2677b = I != null ? new k1.b(I).a() : null;
            }

            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                View view2 = view;
                WindowInsets windowInsets2 = windowInsets;
                if (!view.isLaidOut()) {
                    this.f2677b = k1.x(windowInsets2, view2);
                } else {
                    k1 x10 = k1.x(windowInsets2, view2);
                    if (this.f2677b == null) {
                        this.f2677b = m0.I(view);
                    }
                    if (this.f2677b != null) {
                        b n10 = c.n(view);
                        if (n10 != null && Objects.equals(n10.f2671a, windowInsets2)) {
                            return c.m(view, windowInsets);
                        }
                        int e10 = c.e(x10, this.f2677b);
                        if (e10 == 0) {
                            return c.m(view, windowInsets);
                        }
                        k1 k1Var = this.f2677b;
                        x0 x0Var = new x0(e10, c.g(e10, x10, k1Var), 160);
                        x0Var.e(0.0f);
                        ValueAnimator duration = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f}).setDuration(x0Var.a());
                        a f10 = c.f(x10, k1Var, e10);
                        c.j(view2, x0Var, windowInsets2, false);
                        duration.addUpdateListener(new C0042a(x0Var, x10, k1Var, e10, view));
                        duration.addListener(new b(x0Var, view2));
                        f0.a(view2, new C0043c(view, x0Var, f10, duration));
                    }
                    this.f2677b = x10;
                }
                return c.m(view, windowInsets);
            }
        }

        c(int i10, Interpolator interpolator, long j10) {
            super(i10, interpolator, j10);
        }

        static int e(k1 k1Var, k1 k1Var2) {
            int i10 = 0;
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if (!k1Var.f(i11).equals(k1Var2.f(i11))) {
                    i10 |= i11;
                }
            }
            return i10;
        }

        static a f(k1 k1Var, k1 k1Var2, int i10) {
            f f10 = k1Var.f(i10);
            f f11 = k1Var2.f(i10);
            return new a(f.b(Math.min(f10.f2373a, f11.f2373a), Math.min(f10.f2374b, f11.f2374b), Math.min(f10.f2375c, f11.f2375c), Math.min(f10.f2376d, f11.f2376d)), f.b(Math.max(f10.f2373a, f11.f2373a), Math.max(f10.f2374b, f11.f2374b), Math.max(f10.f2375c, f11.f2375c), Math.max(f10.f2376d, f11.f2376d)));
        }

        static Interpolator g(int i10, k1 k1Var, k1 k1Var2) {
            if ((i10 & 8) != 0) {
                return k1Var.f(k1.m.a()).f2376d > k1Var2.f(k1.m.a()).f2376d ? f2673e : f2674f;
            }
            return f2675g;
        }

        private static View.OnApplyWindowInsetsListener h(View view, b bVar) {
            return new a(view, bVar);
        }

        static void i(View view, x0 x0Var) {
            b n10 = n(view);
            if (n10 != null) {
                n10.b(x0Var);
                if (n10.a() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    i(viewGroup.getChildAt(i10), x0Var);
                }
            }
        }

        static void j(View view, x0 x0Var, WindowInsets windowInsets, boolean z10) {
            b n10 = n(view);
            if (n10 != null) {
                n10.f2671a = windowInsets;
                if (!z10) {
                    n10.c(x0Var);
                    z10 = n10.a() == 0;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    j(viewGroup.getChildAt(i10), x0Var, windowInsets, z10);
                }
            }
        }

        static void k(View view, k1 k1Var, List list) {
            b n10 = n(view);
            if (n10 != null) {
                k1Var = n10.d(k1Var, list);
                if (n10.a() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    k(viewGroup.getChildAt(i10), k1Var, list);
                }
            }
        }

        static void l(View view, x0 x0Var, a aVar) {
            b n10 = n(view);
            if (n10 != null) {
                n10.e(x0Var, aVar);
                if (n10.a() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    l(viewGroup.getChildAt(i10), x0Var, aVar);
                }
            }
        }

        static WindowInsets m(View view, WindowInsets windowInsets) {
            return view.getTag(w.c.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }

        static b n(View view) {
            Object tag = view.getTag(w.c.tag_window_insets_animation_callback);
            if (tag instanceof a) {
                return ((a) tag).f2676a;
            }
            return null;
        }

        static k1 o(k1 k1Var, k1 k1Var2, float f10, int i10) {
            f o10;
            k1.b bVar = new k1.b(k1Var);
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i10 & i11) == 0) {
                    o10 = k1Var.f(i11);
                } else {
                    f f11 = k1Var.f(i11);
                    f f12 = k1Var2.f(i11);
                    float f13 = 1.0f - f10;
                    o10 = k1.o(f11, (int) (((double) (((float) (f11.f2373a - f12.f2373a)) * f13)) + 0.5d), (int) (((double) (((float) (f11.f2374b - f12.f2374b)) * f13)) + 0.5d), (int) (((double) (((float) (f11.f2375c - f12.f2375c)) * f13)) + 0.5d), (int) (((double) (((float) (f11.f2376d - f12.f2376d)) * f13)) + 0.5d));
                }
                bVar.b(i11, o10);
            }
            return bVar.a();
        }

        static void p(View view, b bVar) {
            Object tag = view.getTag(w.c.tag_on_apply_window_listener);
            if (bVar == null) {
                view.setTag(w.c.tag_window_insets_animation_callback, (Object) null);
                if (tag == null) {
                    view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) null);
                    return;
                }
                return;
            }
            View.OnApplyWindowInsetsListener h10 = h(view, bVar);
            view.setTag(w.c.tag_window_insets_animation_callback, h10);
            if (tag == null) {
                view.setOnApplyWindowInsetsListener(h10);
            }
        }
    }

    private static class d extends e {

        /* renamed from: e  reason: collision with root package name */
        private final WindowInsetsAnimation f2692e;

        private static class a extends WindowInsetsAnimation$Callback {

            /* renamed from: a  reason: collision with root package name */
            private final b f2693a;

            /* renamed from: b  reason: collision with root package name */
            private List f2694b;

            /* renamed from: c  reason: collision with root package name */
            private ArrayList f2695c;

            /* renamed from: d  reason: collision with root package name */
            private final HashMap f2696d = new HashMap();

            a(b bVar) {
                super(bVar.a());
                this.f2693a = bVar;
            }

            private x0 a(WindowInsetsAnimation windowInsetsAnimation) {
                x0 x0Var = (x0) this.f2696d.get(windowInsetsAnimation);
                if (x0Var != null) {
                    return x0Var;
                }
                x0 f10 = x0.f(windowInsetsAnimation);
                this.f2696d.put(windowInsetsAnimation, f10);
                return f10;
            }

            public void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
                this.f2693a.b(a(windowInsetsAnimation));
                this.f2696d.remove(windowInsetsAnimation);
            }

            public void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
                this.f2693a.c(a(windowInsetsAnimation));
            }

            public WindowInsets onProgress(WindowInsets windowInsets, List list) {
                ArrayList arrayList = this.f2695c;
                if (arrayList == null) {
                    ArrayList arrayList2 = new ArrayList(list.size());
                    this.f2695c = arrayList2;
                    this.f2694b = Collections.unmodifiableList(arrayList2);
                } else {
                    arrayList.clear();
                }
                for (int size = list.size() - 1; size >= 0; size--) {
                    WindowInsetsAnimation a10 = i1.a(list.get(size));
                    x0 a11 = a(a10);
                    a11.e(a10.getFraction());
                    this.f2695c.add(a11);
                }
                return this.f2693a.d(k1.w(windowInsets), this.f2694b).v();
            }

            public WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
                return this.f2693a.e(a(windowInsetsAnimation), a.d(bounds)).c();
            }
        }

        d(int i10, Interpolator interpolator, long j10) {
            this(d1.a(i10, interpolator, j10));
        }

        public static WindowInsetsAnimation.Bounds e(a aVar) {
            f1.a();
            return e1.a(aVar.a().e(), aVar.b().e());
        }

        public static f f(WindowInsetsAnimation.Bounds bounds) {
            return f.d(bounds.getUpperBound());
        }

        public static f g(WindowInsetsAnimation.Bounds bounds) {
            return f.d(bounds.getLowerBound());
        }

        public static void h(View view, b bVar) {
            view.setWindowInsetsAnimationCallback(bVar != null ? new a(bVar) : null);
        }

        public long a() {
            return this.f2692e.getDurationMillis();
        }

        public float b() {
            return this.f2692e.getInterpolatedFraction();
        }

        public int c() {
            return this.f2692e.getTypeMask();
        }

        public void d(float f10) {
            this.f2692e.setFraction(f10);
        }

        d(WindowInsetsAnimation windowInsetsAnimation) {
            super(0, (Interpolator) null, 0);
            this.f2692e = windowInsetsAnimation;
        }
    }

    private static class e {

        /* renamed from: a  reason: collision with root package name */
        private final int f2697a;

        /* renamed from: b  reason: collision with root package name */
        private float f2698b;

        /* renamed from: c  reason: collision with root package name */
        private final Interpolator f2699c;

        /* renamed from: d  reason: collision with root package name */
        private final long f2700d;

        e(int i10, Interpolator interpolator, long j10) {
            this.f2697a = i10;
            this.f2699c = interpolator;
            this.f2700d = j10;
        }

        public long a() {
            return this.f2700d;
        }

        public float b() {
            Interpolator interpolator = this.f2699c;
            return interpolator != null ? interpolator.getInterpolation(this.f2698b) : this.f2698b;
        }

        public int c() {
            return this.f2697a;
        }

        public void d(float f10) {
            this.f2698b = f10;
        }
    }

    public x0(int i10, Interpolator interpolator, long j10) {
        this.f2668a = Build.VERSION.SDK_INT >= 30 ? new d(i10, interpolator, j10) : new c(i10, interpolator, j10);
    }

    static void d(View view, b bVar) {
        if (Build.VERSION.SDK_INT >= 30) {
            d.h(view, bVar);
        } else {
            c.p(view, bVar);
        }
    }

    static x0 f(WindowInsetsAnimation windowInsetsAnimation) {
        return new x0(windowInsetsAnimation);
    }

    public long a() {
        return this.f2668a.a();
    }

    public float b() {
        return this.f2668a.b();
    }

    public int c() {
        return this.f2668a.c();
    }

    public void e(float f10) {
        this.f2668a.d(f10);
    }

    private x0(WindowInsetsAnimation windowInsetsAnimation) {
        this(0, (Interpolator) null, 0);
        if (Build.VERSION.SDK_INT >= 30) {
            this.f2668a = new d(windowInsetsAnimation);
        }
    }
}
