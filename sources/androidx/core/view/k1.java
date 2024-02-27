package androidx.core.view;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

public class k1 {

    /* renamed from: b  reason: collision with root package name */
    public static final k1 f2597b = (Build.VERSION.SDK_INT >= 30 ? k.f2627q : l.f2628b);

    /* renamed from: a  reason: collision with root package name */
    private final l f2598a;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        private static Field f2599a;

        /* renamed from: b  reason: collision with root package name */
        private static Field f2600b;

        /* renamed from: c  reason: collision with root package name */
        private static Field f2601c;

        /* renamed from: d  reason: collision with root package name */
        private static boolean f2602d = true;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                f2599a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                f2600b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                f2601c = declaredField3;
                declaredField3.setAccessible(true);
            } catch (ReflectiveOperationException e10) {
                Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e10.getMessage(), e10);
            }
        }

        public static k1 a(View view) {
            if (f2602d && view.isAttachedToWindow()) {
                try {
                    Object obj = f2599a.get(view.getRootView());
                    if (obj != null) {
                        Rect rect = (Rect) f2600b.get(obj);
                        Rect rect2 = (Rect) f2601c.get(obj);
                        if (!(rect == null || rect2 == null)) {
                            k1 a10 = new b().c(androidx.core.graphics.f.c(rect)).d(androidx.core.graphics.f.c(rect2)).a();
                            a10.t(a10);
                            a10.d(view.getRootView());
                            return a10;
                        }
                    }
                } catch (IllegalAccessException e10) {
                    Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e10.getMessage(), e10);
                }
            }
            return null;
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final f f2603a;

        public b() {
            int i10 = Build.VERSION.SDK_INT;
            this.f2603a = i10 >= 30 ? new e() : i10 >= 29 ? new d() : new c();
        }

        public k1 a() {
            return this.f2603a.b();
        }

        public b b(int i10, androidx.core.graphics.f fVar) {
            this.f2603a.c(i10, fVar);
            return this;
        }

        public b c(androidx.core.graphics.f fVar) {
            this.f2603a.e(fVar);
            return this;
        }

        public b d(androidx.core.graphics.f fVar) {
            this.f2603a.g(fVar);
            return this;
        }

        public b(k1 k1Var) {
            int i10 = Build.VERSION.SDK_INT;
            this.f2603a = i10 >= 30 ? new e(k1Var) : i10 >= 29 ? new d(k1Var) : new c(k1Var);
        }
    }

    private static class c extends f {

        /* renamed from: e  reason: collision with root package name */
        private static Field f2604e = null;

        /* renamed from: f  reason: collision with root package name */
        private static boolean f2605f = false;

        /* renamed from: g  reason: collision with root package name */
        private static Constructor f2606g = null;

        /* renamed from: h  reason: collision with root package name */
        private static boolean f2607h = false;

        /* renamed from: c  reason: collision with root package name */
        private WindowInsets f2608c;

        /* renamed from: d  reason: collision with root package name */
        private androidx.core.graphics.f f2609d;

        c() {
            this.f2608c = i();
        }

        private static WindowInsets i() {
            Class<WindowInsets> cls = WindowInsets.class;
            if (!f2605f) {
                try {
                    f2604e = cls.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e10) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e10);
                }
                f2605f = true;
            }
            Field field = f2604e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get((Object) null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e11) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e11);
                }
            }
            if (!f2607h) {
                try {
                    f2606g = cls.getConstructor(new Class[]{Rect.class});
                } catch (ReflectiveOperationException e12) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e12);
                }
                f2607h = true;
            }
            Constructor constructor = f2606g;
            if (constructor != null) {
                try {
                    return (WindowInsets) constructor.newInstance(new Object[]{new Rect()});
                } catch (ReflectiveOperationException e13) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e13);
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public k1 b() {
            a();
            k1 w10 = k1.w(this.f2608c);
            w10.r(this.f2612b);
            w10.u(this.f2609d);
            return w10;
        }

        /* access modifiers changed from: package-private */
        public void e(androidx.core.graphics.f fVar) {
            this.f2609d = fVar;
        }

        /* access modifiers changed from: package-private */
        public void g(androidx.core.graphics.f fVar) {
            WindowInsets windowInsets = this.f2608c;
            if (windowInsets != null) {
                this.f2608c = windowInsets.replaceSystemWindowInsets(fVar.f2373a, fVar.f2374b, fVar.f2375c, fVar.f2376d);
            }
        }

        c(k1 k1Var) {
            super(k1Var);
            this.f2608c = k1Var.v();
        }
    }

    private static class d extends f {

        /* renamed from: c  reason: collision with root package name */
        final WindowInsets.Builder f2610c;

        d() {
            this.f2610c = r1.a();
        }

        /* access modifiers changed from: package-private */
        public k1 b() {
            a();
            k1 w10 = k1.w(this.f2610c.build());
            w10.r(this.f2612b);
            return w10;
        }

        /* access modifiers changed from: package-private */
        public void d(androidx.core.graphics.f fVar) {
            WindowInsets.Builder unused = this.f2610c.setMandatorySystemGestureInsets(fVar.e());
        }

        /* access modifiers changed from: package-private */
        public void e(androidx.core.graphics.f fVar) {
            WindowInsets.Builder unused = this.f2610c.setStableInsets(fVar.e());
        }

        /* access modifiers changed from: package-private */
        public void f(androidx.core.graphics.f fVar) {
            WindowInsets.Builder unused = this.f2610c.setSystemGestureInsets(fVar.e());
        }

        /* access modifiers changed from: package-private */
        public void g(androidx.core.graphics.f fVar) {
            WindowInsets.Builder unused = this.f2610c.setSystemWindowInsets(fVar.e());
        }

        /* access modifiers changed from: package-private */
        public void h(androidx.core.graphics.f fVar) {
            WindowInsets.Builder unused = this.f2610c.setTappableElementInsets(fVar.e());
        }

        d(k1 k1Var) {
            super(k1Var);
            WindowInsets v10 = k1Var.v();
            this.f2610c = v10 != null ? s1.a(v10) : r1.a();
        }
    }

    private static class e extends d {
        e() {
        }

        /* access modifiers changed from: package-private */
        public void c(int i10, androidx.core.graphics.f fVar) {
            WindowInsets.Builder unused = this.f2610c.setInsets(n.a(i10), fVar.e());
        }

        e(k1 k1Var) {
            super(k1Var);
        }
    }

    private static class f {

        /* renamed from: a  reason: collision with root package name */
        private final k1 f2611a;

        /* renamed from: b  reason: collision with root package name */
        androidx.core.graphics.f[] f2612b;

        f() {
            this(new k1((k1) null));
        }

        /* access modifiers changed from: protected */
        public final void a() {
            androidx.core.graphics.f[] fVarArr = this.f2612b;
            if (fVarArr != null) {
                androidx.core.graphics.f fVar = fVarArr[m.b(1)];
                androidx.core.graphics.f fVar2 = this.f2612b[m.b(2)];
                if (fVar2 == null) {
                    fVar2 = this.f2611a.f(2);
                }
                if (fVar == null) {
                    fVar = this.f2611a.f(1);
                }
                g(androidx.core.graphics.f.a(fVar, fVar2));
                androidx.core.graphics.f fVar3 = this.f2612b[m.b(16)];
                if (fVar3 != null) {
                    f(fVar3);
                }
                androidx.core.graphics.f fVar4 = this.f2612b[m.b(32)];
                if (fVar4 != null) {
                    d(fVar4);
                }
                androidx.core.graphics.f fVar5 = this.f2612b[m.b(64)];
                if (fVar5 != null) {
                    h(fVar5);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public abstract k1 b();

        /* access modifiers changed from: package-private */
        public void c(int i10, androidx.core.graphics.f fVar) {
            if (this.f2612b == null) {
                this.f2612b = new androidx.core.graphics.f[9];
            }
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    this.f2612b[m.b(i11)] = fVar;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void d(androidx.core.graphics.f fVar) {
        }

        /* access modifiers changed from: package-private */
        public abstract void e(androidx.core.graphics.f fVar);

        /* access modifiers changed from: package-private */
        public void f(androidx.core.graphics.f fVar) {
        }

        /* access modifiers changed from: package-private */
        public abstract void g(androidx.core.graphics.f fVar);

        /* access modifiers changed from: package-private */
        public void h(androidx.core.graphics.f fVar) {
        }

        f(k1 k1Var) {
            this.f2611a = k1Var;
        }
    }

    private static class g extends l {

        /* renamed from: h  reason: collision with root package name */
        private static boolean f2613h = false;

        /* renamed from: i  reason: collision with root package name */
        private static Method f2614i;

        /* renamed from: j  reason: collision with root package name */
        private static Class f2615j;

        /* renamed from: k  reason: collision with root package name */
        private static Field f2616k;

        /* renamed from: l  reason: collision with root package name */
        private static Field f2617l;

        /* renamed from: c  reason: collision with root package name */
        final WindowInsets f2618c;

        /* renamed from: d  reason: collision with root package name */
        private androidx.core.graphics.f[] f2619d;

        /* renamed from: e  reason: collision with root package name */
        private androidx.core.graphics.f f2620e;

        /* renamed from: f  reason: collision with root package name */
        private k1 f2621f;

        /* renamed from: g  reason: collision with root package name */
        androidx.core.graphics.f f2622g;

        g(k1 k1Var, WindowInsets windowInsets) {
            super(k1Var);
            this.f2620e = null;
            this.f2618c = windowInsets;
        }

        @SuppressLint({"WrongConstant"})
        private androidx.core.graphics.f t(int i10, boolean z10) {
            androidx.core.graphics.f fVar = androidx.core.graphics.f.f2372e;
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    fVar = androidx.core.graphics.f.a(fVar, u(i11, z10));
                }
            }
            return fVar;
        }

        private androidx.core.graphics.f v() {
            k1 k1Var = this.f2621f;
            return k1Var != null ? k1Var.g() : androidx.core.graphics.f.f2372e;
        }

        private androidx.core.graphics.f w(View view) {
            if (Build.VERSION.SDK_INT < 30) {
                if (!f2613h) {
                    x();
                }
                Method method = f2614i;
                if (!(method == null || f2615j == null || f2616k == null)) {
                    try {
                        Object invoke = method.invoke(view, new Object[0]);
                        if (invoke == null) {
                            Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                            return null;
                        }
                        Rect rect = (Rect) f2616k.get(f2617l.get(invoke));
                        if (rect != null) {
                            return androidx.core.graphics.f.c(rect);
                        }
                        return null;
                    } catch (ReflectiveOperationException e10) {
                        Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e10.getMessage(), e10);
                    }
                }
                return null;
            }
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }

        @SuppressLint({"PrivateApi"})
        private static void x() {
            try {
                f2614i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f2615j = cls;
                f2616k = cls.getDeclaredField("mVisibleInsets");
                f2617l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f2616k.setAccessible(true);
                f2617l.setAccessible(true);
            } catch (ReflectiveOperationException e10) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e10.getMessage(), e10);
            }
            f2613h = true;
        }

        /* access modifiers changed from: package-private */
        public void d(View view) {
            androidx.core.graphics.f w10 = w(view);
            if (w10 == null) {
                w10 = androidx.core.graphics.f.f2372e;
            }
            q(w10);
        }

        /* access modifiers changed from: package-private */
        public void e(k1 k1Var) {
            k1Var.t(this.f2621f);
            k1Var.s(this.f2622g);
        }

        public boolean equals(Object obj) {
            if (!super.equals(obj)) {
                return false;
            }
            return Objects.equals(this.f2622g, ((g) obj).f2622g);
        }

        public androidx.core.graphics.f g(int i10) {
            return t(i10, false);
        }

        /* access modifiers changed from: package-private */
        public final androidx.core.graphics.f k() {
            if (this.f2620e == null) {
                this.f2620e = androidx.core.graphics.f.b(this.f2618c.getSystemWindowInsetLeft(), this.f2618c.getSystemWindowInsetTop(), this.f2618c.getSystemWindowInsetRight(), this.f2618c.getSystemWindowInsetBottom());
            }
            return this.f2620e;
        }

        /* access modifiers changed from: package-private */
        public k1 m(int i10, int i11, int i12, int i13) {
            b bVar = new b(k1.w(this.f2618c));
            bVar.d(k1.o(k(), i10, i11, i12, i13));
            bVar.c(k1.o(i(), i10, i11, i12, i13));
            return bVar.a();
        }

        /* access modifiers changed from: package-private */
        public boolean o() {
            return this.f2618c.isRound();
        }

        public void p(androidx.core.graphics.f[] fVarArr) {
            this.f2619d = fVarArr;
        }

        /* access modifiers changed from: package-private */
        public void q(androidx.core.graphics.f fVar) {
            this.f2622g = fVar;
        }

        /* access modifiers changed from: package-private */
        public void r(k1 k1Var) {
            this.f2621f = k1Var;
        }

        /* access modifiers changed from: protected */
        public androidx.core.graphics.f u(int i10, boolean z10) {
            int i11;
            if (i10 == 1) {
                return z10 ? androidx.core.graphics.f.b(0, Math.max(v().f2374b, k().f2374b), 0, 0) : androidx.core.graphics.f.b(0, k().f2374b, 0, 0);
            }
            androidx.core.graphics.f fVar = null;
            if (i10 != 2) {
                if (i10 == 8) {
                    androidx.core.graphics.f[] fVarArr = this.f2619d;
                    if (fVarArr != null) {
                        fVar = fVarArr[m.b(8)];
                    }
                    if (fVar != null) {
                        return fVar;
                    }
                    androidx.core.graphics.f k10 = k();
                    androidx.core.graphics.f v10 = v();
                    int i12 = k10.f2376d;
                    if (i12 > v10.f2376d) {
                        return androidx.core.graphics.f.b(0, 0, 0, i12);
                    }
                    androidx.core.graphics.f fVar2 = this.f2622g;
                    return (fVar2 == null || fVar2.equals(androidx.core.graphics.f.f2372e) || (i11 = this.f2622g.f2376d) <= v10.f2376d) ? androidx.core.graphics.f.f2372e : androidx.core.graphics.f.b(0, 0, 0, i11);
                } else if (i10 == 16) {
                    return j();
                } else {
                    if (i10 == 32) {
                        return h();
                    }
                    if (i10 == 64) {
                        return l();
                    }
                    if (i10 != 128) {
                        return androidx.core.graphics.f.f2372e;
                    }
                    k1 k1Var = this.f2621f;
                    n e10 = k1Var != null ? k1Var.e() : f();
                    return e10 != null ? androidx.core.graphics.f.b(e10.b(), e10.d(), e10.c(), e10.a()) : androidx.core.graphics.f.f2372e;
                }
            } else if (z10) {
                androidx.core.graphics.f v11 = v();
                androidx.core.graphics.f i13 = i();
                return androidx.core.graphics.f.b(Math.max(v11.f2373a, i13.f2373a), 0, Math.max(v11.f2375c, i13.f2375c), Math.max(v11.f2376d, i13.f2376d));
            } else {
                androidx.core.graphics.f k11 = k();
                k1 k1Var2 = this.f2621f;
                if (k1Var2 != null) {
                    fVar = k1Var2.g();
                }
                int i14 = k11.f2376d;
                if (fVar != null) {
                    i14 = Math.min(i14, fVar.f2376d);
                }
                return androidx.core.graphics.f.b(k11.f2373a, 0, k11.f2375c, i14);
            }
        }

        g(k1 k1Var, g gVar) {
            this(k1Var, new WindowInsets(gVar.f2618c));
        }
    }

    private static class h extends g {

        /* renamed from: m  reason: collision with root package name */
        private androidx.core.graphics.f f2623m = null;

        h(k1 k1Var, WindowInsets windowInsets) {
            super(k1Var, windowInsets);
        }

        /* access modifiers changed from: package-private */
        public k1 b() {
            return k1.w(this.f2618c.consumeStableInsets());
        }

        /* access modifiers changed from: package-private */
        public k1 c() {
            return k1.w(this.f2618c.consumeSystemWindowInsets());
        }

        /* access modifiers changed from: package-private */
        public final androidx.core.graphics.f i() {
            if (this.f2623m == null) {
                this.f2623m = androidx.core.graphics.f.b(this.f2618c.getStableInsetLeft(), this.f2618c.getStableInsetTop(), this.f2618c.getStableInsetRight(), this.f2618c.getStableInsetBottom());
            }
            return this.f2623m;
        }

        /* access modifiers changed from: package-private */
        public boolean n() {
            return this.f2618c.isConsumed();
        }

        public void s(androidx.core.graphics.f fVar) {
            this.f2623m = fVar;
        }

        h(k1 k1Var, h hVar) {
            super(k1Var, (g) hVar);
            this.f2623m = hVar.f2623m;
        }
    }

    private static class i extends h {
        i(k1 k1Var, WindowInsets windowInsets) {
            super(k1Var, windowInsets);
        }

        /* access modifiers changed from: package-private */
        public k1 a() {
            return k1.w(this.f2618c.consumeDisplayCutout());
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return Objects.equals(this.f2618c, iVar.f2618c) && Objects.equals(this.f2622g, iVar.f2622g);
        }

        /* access modifiers changed from: package-private */
        public n f() {
            return n.e(this.f2618c.getDisplayCutout());
        }

        public int hashCode() {
            return this.f2618c.hashCode();
        }

        i(k1 k1Var, i iVar) {
            super(k1Var, (h) iVar);
        }
    }

    private static class j extends i {

        /* renamed from: n  reason: collision with root package name */
        private androidx.core.graphics.f f2624n = null;

        /* renamed from: o  reason: collision with root package name */
        private androidx.core.graphics.f f2625o = null;

        /* renamed from: p  reason: collision with root package name */
        private androidx.core.graphics.f f2626p = null;

        j(k1 k1Var, WindowInsets windowInsets) {
            super(k1Var, windowInsets);
        }

        /* access modifiers changed from: package-private */
        public androidx.core.graphics.f h() {
            if (this.f2625o == null) {
                this.f2625o = androidx.core.graphics.f.d(this.f2618c.getMandatorySystemGestureInsets());
            }
            return this.f2625o;
        }

        /* access modifiers changed from: package-private */
        public androidx.core.graphics.f j() {
            if (this.f2624n == null) {
                this.f2624n = androidx.core.graphics.f.d(this.f2618c.getSystemGestureInsets());
            }
            return this.f2624n;
        }

        /* access modifiers changed from: package-private */
        public androidx.core.graphics.f l() {
            if (this.f2626p == null) {
                this.f2626p = androidx.core.graphics.f.d(this.f2618c.getTappableElementInsets());
            }
            return this.f2626p;
        }

        /* access modifiers changed from: package-private */
        public k1 m(int i10, int i11, int i12, int i13) {
            return k1.w(this.f2618c.inset(i10, i11, i12, i13));
        }

        public void s(androidx.core.graphics.f fVar) {
        }

        j(k1 k1Var, j jVar) {
            super(k1Var, (i) jVar);
        }
    }

    private static class k extends j {

        /* renamed from: q  reason: collision with root package name */
        static final k1 f2627q = k1.w(WindowInsets.CONSUMED);

        k(k1 k1Var, WindowInsets windowInsets) {
            super(k1Var, windowInsets);
        }

        /* access modifiers changed from: package-private */
        public final void d(View view) {
        }

        public androidx.core.graphics.f g(int i10) {
            return androidx.core.graphics.f.d(this.f2618c.getInsets(n.a(i10)));
        }

        k(k1 k1Var, k kVar) {
            super(k1Var, (j) kVar);
        }
    }

    private static class l {

        /* renamed from: b  reason: collision with root package name */
        static final k1 f2628b = new b().a().a().b().c();

        /* renamed from: a  reason: collision with root package name */
        final k1 f2629a;

        l(k1 k1Var) {
            this.f2629a = k1Var;
        }

        /* access modifiers changed from: package-private */
        public k1 a() {
            return this.f2629a;
        }

        /* access modifiers changed from: package-private */
        public k1 b() {
            return this.f2629a;
        }

        /* access modifiers changed from: package-private */
        public k1 c() {
            return this.f2629a;
        }

        /* access modifiers changed from: package-private */
        public void d(View view) {
        }

        /* access modifiers changed from: package-private */
        public void e(k1 k1Var) {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return o() == lVar.o() && n() == lVar.n() && androidx.core.util.c.a(k(), lVar.k()) && androidx.core.util.c.a(i(), lVar.i()) && androidx.core.util.c.a(f(), lVar.f());
        }

        /* access modifiers changed from: package-private */
        public n f() {
            return null;
        }

        /* access modifiers changed from: package-private */
        public androidx.core.graphics.f g(int i10) {
            return androidx.core.graphics.f.f2372e;
        }

        /* access modifiers changed from: package-private */
        public androidx.core.graphics.f h() {
            return k();
        }

        public int hashCode() {
            return androidx.core.util.c.b(Boolean.valueOf(o()), Boolean.valueOf(n()), k(), i(), f());
        }

        /* access modifiers changed from: package-private */
        public androidx.core.graphics.f i() {
            return androidx.core.graphics.f.f2372e;
        }

        /* access modifiers changed from: package-private */
        public androidx.core.graphics.f j() {
            return k();
        }

        /* access modifiers changed from: package-private */
        public androidx.core.graphics.f k() {
            return androidx.core.graphics.f.f2372e;
        }

        /* access modifiers changed from: package-private */
        public androidx.core.graphics.f l() {
            return k();
        }

        /* access modifiers changed from: package-private */
        public k1 m(int i10, int i11, int i12, int i13) {
            return f2628b;
        }

        /* access modifiers changed from: package-private */
        public boolean n() {
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean o() {
            return false;
        }

        public void p(androidx.core.graphics.f[] fVarArr) {
        }

        /* access modifiers changed from: package-private */
        public void q(androidx.core.graphics.f fVar) {
        }

        /* access modifiers changed from: package-private */
        public void r(k1 k1Var) {
        }

        public void s(androidx.core.graphics.f fVar) {
        }
    }

    public static final class m {
        public static int a() {
            return 8;
        }

        static int b(int i10) {
            if (i10 == 1) {
                return 0;
            }
            if (i10 == 2) {
                return 1;
            }
            if (i10 == 4) {
                return 2;
            }
            if (i10 == 8) {
                return 3;
            }
            if (i10 == 16) {
                return 4;
            }
            if (i10 == 32) {
                return 5;
            }
            if (i10 == 64) {
                return 6;
            }
            if (i10 == 128) {
                return 7;
            }
            if (i10 == 256) {
                return 8;
            }
            throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i10);
        }

        public static int c() {
            return 32;
        }

        public static int d() {
            return 7;
        }
    }

    private static final class n {
        static int a(int i10) {
            int a10;
            int i11 = 0;
            for (int i12 = 1; i12 <= 256; i12 <<= 1) {
                if ((i10 & i12) != 0) {
                    if (i12 == 1) {
                        a10 = WindowInsets.Type.statusBars();
                    } else if (i12 == 2) {
                        a10 = WindowInsets.Type.navigationBars();
                    } else if (i12 == 4) {
                        a10 = WindowInsets.Type.captionBar();
                    } else if (i12 == 8) {
                        a10 = WindowInsets.Type.ime();
                    } else if (i12 == 16) {
                        a10 = WindowInsets.Type.systemGestures();
                    } else if (i12 == 32) {
                        a10 = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i12 == 64) {
                        a10 = WindowInsets.Type.tappableElement();
                    } else if (i12 == 128) {
                        a10 = WindowInsets.Type.displayCutout();
                    }
                    i11 |= a10;
                }
            }
            return i11;
        }
    }

    private k1(WindowInsets windowInsets) {
        int i10 = Build.VERSION.SDK_INT;
        this.f2598a = i10 >= 30 ? new k(this, windowInsets) : i10 >= 29 ? new j(this, windowInsets) : i10 >= 28 ? new i(this, windowInsets) : new h(this, windowInsets);
    }

    static androidx.core.graphics.f o(androidx.core.graphics.f fVar, int i10, int i11, int i12, int i13) {
        int max = Math.max(0, fVar.f2373a - i10);
        int max2 = Math.max(0, fVar.f2374b - i11);
        int max3 = Math.max(0, fVar.f2375c - i12);
        int max4 = Math.max(0, fVar.f2376d - i13);
        return (max == i10 && max2 == i11 && max3 == i12 && max4 == i13) ? fVar : androidx.core.graphics.f.b(max, max2, max3, max4);
    }

    public static k1 w(WindowInsets windowInsets) {
        return x(windowInsets, (View) null);
    }

    public static k1 x(WindowInsets windowInsets, View view) {
        k1 k1Var = new k1((WindowInsets) androidx.core.util.g.g(windowInsets));
        if (view != null && m0.T(view)) {
            k1Var.t(m0.I(view));
            k1Var.d(view.getRootView());
        }
        return k1Var;
    }

    public k1 a() {
        return this.f2598a.a();
    }

    public k1 b() {
        return this.f2598a.b();
    }

    public k1 c() {
        return this.f2598a.c();
    }

    /* access modifiers changed from: package-private */
    public void d(View view) {
        this.f2598a.d(view);
    }

    public n e() {
        return this.f2598a.f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k1)) {
            return false;
        }
        return androidx.core.util.c.a(this.f2598a, ((k1) obj).f2598a);
    }

    public androidx.core.graphics.f f(int i10) {
        return this.f2598a.g(i10);
    }

    public androidx.core.graphics.f g() {
        return this.f2598a.i();
    }

    public androidx.core.graphics.f h() {
        return this.f2598a.j();
    }

    public int hashCode() {
        l lVar = this.f2598a;
        if (lVar == null) {
            return 0;
        }
        return lVar.hashCode();
    }

    public int i() {
        return this.f2598a.k().f2376d;
    }

    public int j() {
        return this.f2598a.k().f2373a;
    }

    public int k() {
        return this.f2598a.k().f2375c;
    }

    public int l() {
        return this.f2598a.k().f2374b;
    }

    public boolean m() {
        return !this.f2598a.k().equals(androidx.core.graphics.f.f2372e);
    }

    public k1 n(int i10, int i11, int i12, int i13) {
        return this.f2598a.m(i10, i11, i12, i13);
    }

    public boolean p() {
        return this.f2598a.n();
    }

    public k1 q(int i10, int i11, int i12, int i13) {
        return new b(this).d(androidx.core.graphics.f.b(i10, i11, i12, i13)).a();
    }

    /* access modifiers changed from: package-private */
    public void r(androidx.core.graphics.f[] fVarArr) {
        this.f2598a.p(fVarArr);
    }

    /* access modifiers changed from: package-private */
    public void s(androidx.core.graphics.f fVar) {
        this.f2598a.q(fVar);
    }

    /* access modifiers changed from: package-private */
    public void t(k1 k1Var) {
        this.f2598a.r(k1Var);
    }

    /* access modifiers changed from: package-private */
    public void u(androidx.core.graphics.f fVar) {
        this.f2598a.s(fVar);
    }

    public WindowInsets v() {
        l lVar = this.f2598a;
        if (lVar instanceof g) {
            return ((g) lVar).f2618c;
        }
        return null;
    }

    public k1(k1 k1Var) {
        if (k1Var != null) {
            l lVar = k1Var.f2598a;
            int i10 = Build.VERSION.SDK_INT;
            this.f2598a = (i10 < 30 || !(lVar instanceof k)) ? (i10 < 29 || !(lVar instanceof j)) ? (i10 < 28 || !(lVar instanceof i)) ? lVar instanceof h ? new h(this, (h) lVar) : lVar instanceof g ? new g(this, (g) lVar) : new l(this) : new i(this, (i) lVar) : new j(this, (j) lVar) : new k(this, (k) lVar);
            lVar.e(this);
            return;
        }
        this.f2598a = new l(this);
    }
}
