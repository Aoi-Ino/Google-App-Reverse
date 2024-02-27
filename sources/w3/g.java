package w3;

import android.content.Context;
import android.content.pm.PackageManager;

public abstract class g {

    /* renamed from: a  reason: collision with root package name */
    private static Boolean f17862a;

    /* renamed from: b  reason: collision with root package name */
    private static Boolean f17863b;

    /* renamed from: c  reason: collision with root package name */
    private static Boolean f17864c;

    /* renamed from: d  reason: collision with root package name */
    private static Boolean f17865d;

    public static boolean a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f17865d == null) {
            boolean z10 = false;
            if (j.g() && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                z10 = true;
            }
            f17865d = Boolean.valueOf(z10);
        }
        return f17865d.booleanValue();
    }

    public static boolean b(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f17862a == null) {
            boolean z10 = false;
            if (j.d() && packageManager.hasSystemFeature("android.hardware.type.watch")) {
                z10 = true;
            }
            f17862a = Boolean.valueOf(z10);
        }
        return f17862a.booleanValue();
    }

    public static boolean c(Context context) {
        if (b(context) && !j.f()) {
            return true;
        }
        if (d(context)) {
            return !j.g() || j.j();
        }
        return false;
    }

    public static boolean d(Context context) {
        if (f17863b == null) {
            boolean z10 = false;
            if (j.e() && context.getPackageManager().hasSystemFeature("cn.google")) {
                z10 = true;
            }
            f17863b = Boolean.valueOf(z10);
        }
        return f17863b.booleanValue();
    }

    public static boolean e(Context context) {
        if (f17864c == null) {
            boolean z10 = true;
            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.iot") && !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                z10 = false;
            }
            f17864c = Boolean.valueOf(z10);
        }
        return f17864c.booleanValue();
    }
}
