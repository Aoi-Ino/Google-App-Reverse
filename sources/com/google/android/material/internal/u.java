package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import androidx.core.view.c0;
import androidx.core.view.j2;
import androidx.core.view.k1;
import androidx.core.view.m0;
import z4.e;

public abstract class u {

    class a implements c0 {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f6211a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f6212b;

        a(c cVar, d dVar) {
            this.f6211a = cVar;
            this.f6212b = dVar;
        }

        public k1 a(View view, k1 k1Var) {
            return this.f6211a.a(view, k1Var, new d(this.f6212b));
        }
    }

    class b implements View.OnAttachStateChangeListener {
        b() {
        }

        public void onViewAttachedToWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
            m0.n0(view);
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    public interface c {
        k1 a(View view, k1 k1Var, d dVar);
    }

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public int f6213a;

        /* renamed from: b  reason: collision with root package name */
        public int f6214b;

        /* renamed from: c  reason: collision with root package name */
        public int f6215c;

        /* renamed from: d  reason: collision with root package name */
        public int f6216d;

        public d(int i10, int i11, int i12, int i13) {
            this.f6213a = i10;
            this.f6214b = i11;
            this.f6215c = i12;
            this.f6216d = i13;
        }

        public d(d dVar) {
            this.f6213a = dVar.f6213a;
            this.f6214b = dVar.f6214b;
            this.f6215c = dVar.f6215c;
            this.f6216d = dVar.f6216d;
        }
    }

    public static void b(View view, c cVar) {
        m0.F0(view, new a(cVar, new d(m0.G(view), view.getPaddingTop(), m0.F(view), view.getPaddingBottom())));
        j(view);
    }

    public static float c(Context context, int i10) {
        return TypedValue.applyDimension(1, (float) i10, context.getResources().getDisplayMetrics());
    }

    public static Integer d(View view) {
        ColorStateList f10 = e.f(view.getBackground());
        if (f10 != null) {
            return Integer.valueOf(f10.getDefaultColor());
        }
        return null;
    }

    private static InputMethodManager e(View view) {
        return (InputMethodManager) androidx.core.content.a.j(view.getContext(), InputMethodManager.class);
    }

    public static float f(View view) {
        float f10 = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            f10 += m0.w((View) parent);
        }
        return f10;
    }

    public static boolean g(View view) {
        return m0.B(view) == 1;
    }

    public static PorterDuff.Mode i(int i10, PorterDuff.Mode mode) {
        if (i10 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i10 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i10 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i10) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static void j(View view) {
        if (m0.T(view)) {
            m0.n0(view);
        } else {
            view.addOnAttachStateChangeListener(new b());
        }
    }

    public static void k(View view, boolean z10) {
        view.requestFocus();
        view.post(new t(view, z10));
    }

    public static void l(View view, boolean z10) {
        j2 L;
        if (!z10 || (L = m0.L(view)) == null) {
            e(view).showSoftInput(view, 1);
        } else {
            L.c(k1.m.a());
        }
    }
}
