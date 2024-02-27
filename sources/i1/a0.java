package i1;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import androidx.core.view.m0;

abstract class a0 {

    /* renamed from: a  reason: collision with root package name */
    private static final m0 f12102a = (Build.VERSION.SDK_INT >= 29 ? new l0() : new k0());

    /* renamed from: b  reason: collision with root package name */
    static final Property f12103b = new a(Float.class, "translationAlpha");

    /* renamed from: c  reason: collision with root package name */
    static final Property f12104c = new b(Rect.class, "clipBounds");

    class a extends Property {
        a(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf(a0.c(view));
        }

        /* renamed from: b */
        public void set(View view, Float f10) {
            a0.g(view, f10.floatValue());
        }
    }

    class b extends Property {
        b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Rect get(View view) {
            return m0.u(view);
        }

        /* renamed from: b */
        public void set(View view, Rect rect) {
            m0.x0(view, rect);
        }
    }

    static void a(View view) {
        f12102a.a(view);
    }

    static z b(View view) {
        return new y(view);
    }

    static float c(View view) {
        return f12102a.b(view);
    }

    static p0 d(View view) {
        return new o0(view);
    }

    static void e(View view) {
        f12102a.c(view);
    }

    static void f(View view, int i10, int i11, int i12, int i13) {
        f12102a.d(view, i10, i11, i12, i13);
    }

    static void g(View view, float f10) {
        f12102a.e(view, f10);
    }

    static void h(View view, int i10) {
        f12102a.f(view, i10);
    }

    static void i(View view, Matrix matrix) {
        f12102a.g(view, matrix);
    }

    static void j(View view, Matrix matrix) {
        f12102a.h(view, matrix);
    }
}
