package p3;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import s3.j1;
import w3.g;
import y3.d;

public class j {

    /* renamed from: a  reason: collision with root package name */
    public static final int f14645a = m.f14649a;

    /* renamed from: b  reason: collision with root package name */
    private static final j f14646b = new j();

    j() {
    }

    public static j e() {
        return f14646b;
    }

    public Intent a(Context context, int i10, String str) {
        if (i10 == 1 || i10 == 2) {
            if (context != null && g.c(context)) {
                return j1.a();
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("gcore_");
            sb2.append(f14645a);
            sb2.append("-");
            if (!TextUtils.isEmpty(str)) {
                sb2.append(str);
            }
            sb2.append("-");
            if (context != null) {
                sb2.append(context.getPackageName());
            }
            sb2.append("-");
            if (context != null) {
                try {
                    sb2.append(d.a(context).d(context.getPackageName(), 0).versionCode);
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
            return j1.b("com.google.android.gms", sb2.toString());
        } else if (i10 != 3) {
            return null;
        } else {
            return j1.c("com.google.android.gms");
        }
    }

    public PendingIntent b(Context context, int i10, int i11) {
        return c(context, i10, i11, (String) null);
    }

    public PendingIntent c(Context context, int i10, int i11, String str) {
        Intent a10 = a(context, i10, str);
        if (a10 == null) {
            return null;
        }
        return PendingIntent.getActivity(context, i11, a10, d4.d.f9746a | 134217728);
    }

    public String d(int i10) {
        return m.a(i10);
    }

    public int f(Context context) {
        return g(context, f14645a);
    }

    public int g(Context context, int i10) {
        int d10 = m.d(context, i10);
        if (m.e(context, d10)) {
            return 18;
        }
        return d10;
    }

    public boolean h(Context context, String str) {
        return m.h(context, str);
    }

    public boolean i(int i10) {
        return m.g(i10);
    }
}
