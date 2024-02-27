package s1;

import android.net.ConnectivityManager;
import cm.l;

public abstract class o {
    public static final void a(ConnectivityManager connectivityManager, ConnectivityManager.NetworkCallback networkCallback) {
        l.f(connectivityManager, "<this>");
        l.f(networkCallback, "networkCallback");
        connectivityManager.registerDefaultNetworkCallback(networkCallback);
    }
}
