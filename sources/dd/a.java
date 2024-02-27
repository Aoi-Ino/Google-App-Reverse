package dd;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import cm.g;
import cm.l;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final C0133a f9964a = new C0133a((g) null);

    /* renamed from: dd.a$a  reason: collision with other inner class name */
    public static final class C0133a {
        private C0133a() {
        }

        public /* synthetic */ C0133a(g gVar) {
            this();
        }

        public final boolean a(Context context) {
            l.f(context, "app");
            Object systemService = context.getSystemService("connectivity");
            l.d(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                return activeNetworkInfo.isConnectedOrConnecting();
            }
            return false;
        }
    }
}
