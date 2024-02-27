package en;

import cm.g;
import dn.d;
import dn.j;
import en.l;
import java.util.List;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

public final class k implements m {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final l.a f23075a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final b f23076b = new b((g) null);

    public static final class a implements l.a {
        a() {
        }

        public boolean a(SSLSocket sSLSocket) {
            cm.l.f(sSLSocket, "sslSocket");
            return d.f22922f.c() && Conscrypt.isConscrypt(sSLSocket);
        }

        public m b(SSLSocket sSLSocket) {
            cm.l.f(sSLSocket, "sslSocket");
            return new k();
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(g gVar) {
            this();
        }

        public final l.a a() {
            return k.f23075a;
        }
    }

    public boolean a(SSLSocket sSLSocket) {
        cm.l.f(sSLSocket, "sslSocket");
        return Conscrypt.isConscrypt(sSLSocket);
    }

    public String b(SSLSocket sSLSocket) {
        cm.l.f(sSLSocket, "sslSocket");
        if (a(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    public boolean c() {
        return d.f22922f.c();
    }

    public void d(SSLSocket sSLSocket, String str, List list) {
        cm.l.f(sSLSocket, "sslSocket");
        cm.l.f(list, "protocols");
        if (a(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            Object[] array = j.f22941c.b(list).toArray(new String[0]);
            if (array != null) {
                Conscrypt.setApplicationProtocols(sSLSocket, (String[]) array);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }
}
