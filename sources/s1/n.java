package s1;

import android.net.ConnectivityManager;
import android.net.Network;
import cm.l;

public abstract class n {
    public static final Network a(ConnectivityManager connectivityManager) {
        l.f(connectivityManager, "<this>");
        return connectivityManager.getActiveNetwork();
    }
}
