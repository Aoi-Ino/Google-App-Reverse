package en;

import cm.g;
import dn.c;
import dn.j;
import en.l;
import java.util.List;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

public final class i implements m {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final l.a f23069a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final b f23070b = new b((g) null);

    public static final class a implements l.a {
        a() {
        }

        public boolean a(SSLSocket sSLSocket) {
            cm.l.f(sSLSocket, "sslSocket");
            return c.f22919f.b() && (sSLSocket instanceof BCSSLSocket);
        }

        public m b(SSLSocket sSLSocket) {
            cm.l.f(sSLSocket, "sslSocket");
            return new i();
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(g gVar) {
            this();
        }

        public final l.a a() {
            return i.f23069a;
        }
    }

    public boolean a(SSLSocket sSLSocket) {
        cm.l.f(sSLSocket, "sslSocket");
        return sSLSocket instanceof BCSSLSocket;
    }

    public String b(SSLSocket sSLSocket) {
        cm.l.f(sSLSocket, "sslSocket");
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol != null && (applicationProtocol.hashCode() != 0 || !applicationProtocol.equals(""))) {
            return applicationProtocol;
        }
        return null;
    }

    public boolean c() {
        return c.f22919f.b();
    }

    public void d(SSLSocket sSLSocket, String str, List list) {
        cm.l.f(sSLSocket, "sslSocket");
        cm.l.f(list, "protocols");
        if (a(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            cm.l.e(parameters, "sslParameters");
            Object[] array = j.f22941c.b(list).toArray(new String[0]);
            if (array != null) {
                parameters.setApplicationProtocols((String[]) array);
                bCSSLSocket.setParameters(parameters);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }
}
