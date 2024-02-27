package x4;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import f5.b;

public abstract class a {
    public static int a(int i10, int i11) {
        return androidx.core.graphics.a.k(i10, (Color.alpha(i10) * i11) / 255);
    }

    public static int b(Context context, int i10, int i11) {
        Integer f10 = f(context, i10);
        return f10 != null ? f10.intValue() : i11;
    }

    public static int c(Context context, int i10, String str) {
        return l(context, b.e(context, i10, str));
    }

    public static int d(View view, int i10) {
        return l(view.getContext(), b.f(view, i10));
    }

    public static int e(View view, int i10, int i11) {
        return b(view.getContext(), i10, i11);
    }

    public static Integer f(Context context, int i10) {
        TypedValue a10 = b.a(context, i10);
        if (a10 != null) {
            return Integer.valueOf(l(context, a10));
        }
        return null;
    }

    public static ColorStateList g(Context context, int i10) {
        TypedValue a10 = b.a(context, i10);
        if (a10 == null) {
            return null;
        }
        int i11 = a10.resourceId;
        if (i11 != 0) {
            return androidx.core.content.a.d(context, i11);
        }
        int i12 = a10.data;
        if (i12 != 0) {
            return ColorStateList.valueOf(i12);
        }
        return null;
    }

    public static boolean h(int i10) {
        return i10 != 0 && androidx.core.graphics.a.d(i10) > 0.5d;
    }

    public static int i(int i10, int i11) {
        return androidx.core.graphics.a.g(i11, i10);
    }

    public static int j(int i10, int i11, float f10) {
        return i(i10, androidx.core.graphics.a.k(i11, Math.round(((float) Color.alpha(i11)) * f10)));
    }

    public static int k(View view, int i10, int i11, float f10) {
        return j(d(view, i10), d(view, i11), f10);
    }

    private static int l(Context context, TypedValue typedValue) {
        int i10 = typedValue.resourceId;
        return i10 != 0 ? androidx.core.content.a.c(context, i10) : typedValue.data;
    }
}
