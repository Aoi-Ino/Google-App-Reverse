package androidx.core.net;

import android.net.ConnectivityManager;

public abstract class a {

    /* renamed from: androidx.core.net.a$a  reason: collision with other inner class name */
    static class C0031a {
        static boolean a(ConnectivityManager connectivityManager) {
            return connectivityManager.isActiveNetworkMetered();
        }
    }

    public static boolean a(ConnectivityManager connectivityManager) {
        return C0031a.a(connectivityManager);
    }
}
