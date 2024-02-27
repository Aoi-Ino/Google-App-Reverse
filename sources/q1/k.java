package q1;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import androidx.core.net.a;
import cm.l;
import m1.m;
import o1.c;
import s1.n;
import t1.b;

public abstract class k {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final String f14930a;

    static {
        String i10 = m.i("NetworkStateTracker");
        l.e(i10, "tagWithPrefix(\"NetworkStateTracker\")");
        f14930a = i10;
    }

    public static final h a(Context context, b bVar) {
        l.f(context, "context");
        l.f(bVar, "taskExecutor");
        return new j(context, bVar);
    }

    public static final c c(ConnectivityManager connectivityManager) {
        l.f(connectivityManager, "<this>");
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z10 = false;
        boolean z11 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        boolean d10 = d(connectivityManager);
        boolean a10 = a.a(connectivityManager);
        if (activeNetworkInfo != null && !activeNetworkInfo.isRoaming()) {
            z10 = true;
        }
        return new c(z11, d10, a10, z10);
    }

    public static final boolean d(ConnectivityManager connectivityManager) {
        l.f(connectivityManager, "<this>");
        try {
            NetworkCapabilities a10 = s1.m.a(connectivityManager, n.a(connectivityManager));
            if (a10 != null) {
                return s1.m.b(a10, 16);
            }
            return false;
        } catch (SecurityException e10) {
            m.e().d(f14930a, "Unable to validate active network", e10);
            return false;
        }
    }
}
