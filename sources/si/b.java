package si;

import android.app.Application;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import cm.g;
import cm.l;

public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public static final a f31257a = new a((g) null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final boolean a(Application application) {
            l.f(application, "app");
            Object systemService = application.getSystemService("connectivity");
            l.d(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                return activeNetworkInfo.isConnectedOrConnecting();
            }
            return false;
        }
    }
}
