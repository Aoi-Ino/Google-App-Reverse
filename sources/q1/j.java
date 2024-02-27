package q1;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import cm.l;
import m1.m;
import o1.c;
import s1.o;
import t1.b;

public final class j extends h {
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final ConnectivityManager f14927f;

    /* renamed from: g  reason: collision with root package name */
    private final a f14928g = new a(this);

    public static final class a extends ConnectivityManager.NetworkCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f14929a;

        a(j jVar) {
            this.f14929a = jVar;
        }

        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            l.f(network, "network");
            l.f(networkCapabilities, "capabilities");
            m e10 = m.e();
            String b10 = k.f14930a;
            e10.a(b10, "Network capabilities changed: " + networkCapabilities);
            j jVar = this.f14929a;
            jVar.g(k.c(jVar.f14927f));
        }

        public void onLost(Network network) {
            l.f(network, "network");
            m.e().a(k.f14930a, "Network connection lost");
            j jVar = this.f14929a;
            jVar.g(k.c(jVar.f14927f));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(Context context, b bVar) {
        super(context, bVar);
        l.f(context, "context");
        l.f(bVar, "taskExecutor");
        Object systemService = d().getSystemService("connectivity");
        l.d(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.f14927f = (ConnectivityManager) systemService;
    }

    public void h() {
        try {
            m.e().a(k.f14930a, "Registering network callback");
            o.a(this.f14927f, this.f14928g);
        } catch (IllegalArgumentException | SecurityException e10) {
            m.e().d(k.f14930a, "Received exception while registering network callback", e10);
        }
    }

    public void i() {
        try {
            m.e().a(k.f14930a, "Unregistering network callback");
            s1.m.c(this.f14927f, this.f14928g);
        } catch (IllegalArgumentException | SecurityException e10) {
            m.e().d(k.f14930a, "Received exception while unregistering network callback", e10);
        }
    }

    /* renamed from: k */
    public c e() {
        return k.c(this.f14927f);
    }
}
