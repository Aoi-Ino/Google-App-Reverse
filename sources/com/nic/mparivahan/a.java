package com.nic.mparivahan;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import cm.g;
import cm.l;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final C0121a f9624a = new C0121a((g) null);

    /* renamed from: com.nic.mparivahan.a$a  reason: collision with other inner class name */
    public static final class C0121a {
        private C0121a() {
        }

        public /* synthetic */ C0121a(g gVar) {
            this();
        }

        public final boolean a(Context context) {
            NetworkCapabilities networkCapabilities;
            l.f(context, "context");
            Object systemService = context.getSystemService("connectivity");
            l.d(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) {
                return false;
            }
            return networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(0);
        }
    }
}
