package com.nic.mparivahan.dlservices.utilities;

import android.app.Activity;
import android.content.Context;
import androidx.core.content.a;
import cm.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f22373a = new b();

    private b() {
    }

    public final boolean a(Context context) {
        l.c(context);
        return a.a(context, "android.permission.CAMERA") == 0;
    }

    public final boolean b(Context context) {
        l.c(context);
        return a.a(context, "android.permission.WRITE_EXTERNAL_STORAGE") == 0 && a.a(context, "android.permission.CAMERA") == 0;
    }

    public final boolean c() {
        return true;
    }

    public final boolean d(Context context) {
        l.c(context);
        return a.a(context, "android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }

    public final void e(Activity activity, int i10) {
        l.c(activity);
        if (androidx.core.app.b.u(activity, "android.permission.WRITE_EXTERNAL_STORAGE") || androidx.core.app.b.u(activity, "android.permission.CAMERA")) {
            androidx.core.app.b.s(activity, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.CAMERA"}, i10);
        } else {
            androidx.core.app.b.s(activity, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.CAMERA"}, i10);
        }
    }

    public final void f(Activity activity, int i10) {
        l.c(activity);
        String[] strArr = {"android.permission.WRITE_EXTERNAL_STORAGE"};
        if (androidx.core.app.b.u(activity, "android.permission.WRITE_EXTERNAL_STORAGE")) {
            androidx.core.app.b.s(activity, strArr, i10);
        } else {
            androidx.core.app.b.s(activity, strArr, i10);
        }
    }
}
