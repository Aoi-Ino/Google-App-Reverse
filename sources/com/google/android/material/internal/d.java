package com.google.android.material.internal;

import android.content.Context;
import android.os.Build;
import android.view.Window;
import androidx.core.view.w0;
import x4.a;

public abstract class d {
    public static void a(Window window, boolean z10, Integer num, Integer num2) {
        boolean z11 = false;
        boolean z12 = num == null || num.intValue() == 0;
        if (num2 == null || num2.intValue() == 0) {
            z11 = true;
        }
        if (z12 || z11) {
            int b10 = a.b(window.getContext(), 16842801, -16777216);
            if (z12) {
                num = Integer.valueOf(b10);
            }
            if (z11) {
                num2 = Integer.valueOf(b10);
            }
        }
        w0.b(window, !z10);
        int c10 = c(window.getContext(), z10);
        int b11 = b(window.getContext(), z10);
        window.setStatusBarColor(c10);
        window.setNavigationBarColor(b11);
        f(window, d(c10, a.h(num.intValue())));
        e(window, d(b11, a.h(num2.intValue())));
    }

    private static int b(Context context, boolean z10) {
        if (z10 && Build.VERSION.SDK_INT < 27) {
            return androidx.core.graphics.a.k(a.b(context, 16843858, -16777216), 128);
        }
        if (z10) {
            return 0;
        }
        return a.b(context, 16843858, -16777216);
    }

    private static int c(Context context, boolean z10) {
        if (z10) {
            return 0;
        }
        return a.b(context, 16843857, -16777216);
    }

    private static boolean d(int i10, boolean z10) {
        return a.h(i10) || (i10 == 0 && z10);
    }

    public static void e(Window window, boolean z10) {
        w0.a(window, window.getDecorView()).a(z10);
    }

    public static void f(Window window, boolean z10) {
        w0.a(window, window.getDecorView()).b(z10);
    }
}
