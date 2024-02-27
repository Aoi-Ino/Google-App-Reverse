package en;

import android.net.ssl.SSLSockets;
import android.os.Build;
import cm.g;
import cm.l;
import dn.j;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

public final class c implements m {

    /* renamed from: a  reason: collision with root package name */
    public static final a f23053a = new a((g) null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final m a() {
            if (b()) {
                return new c();
            }
            return null;
        }

        public final boolean b() {
            return j.f22941c.h() && Build.VERSION.SDK_INT >= 29;
        }
    }

    public boolean a(SSLSocket sSLSocket) {
        l.f(sSLSocket, "sslSocket");
        return SSLSockets.isSupportedSocket(sSLSocket);
    }

    public String b(SSLSocket sSLSocket) {
        l.f(sSLSocket, "sslSocket");
        String a10 = sSLSocket.getApplicationProtocol();
        if (a10 != null && (a10.hashCode() != 0 || !a10.equals(""))) {
            return a10;
        }
        return null;
    }

    public boolean c() {
        return f23053a.b();
    }

    public void d(SSLSocket sSLSocket, String str, List list) {
        l.f(sSLSocket, "sslSocket");
        l.f(list, "protocols");
        try {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            l.e(sSLParameters, "sslParameters");
            Object[] array = j.f22941c.b(list).toArray(new String[0]);
            if (array != null) {
                sSLParameters.setApplicationProtocols((String[]) array);
                sSLSocket.setSSLParameters(sSLParameters);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (IllegalArgumentException e10) {
            throw new IOException("Android internal error", e10);
        }
    }
}
