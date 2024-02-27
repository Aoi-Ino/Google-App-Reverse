package en;

import java.util.List;
import javax.net.ssl.SSLSocket;

public final class l implements m {

    /* renamed from: a  reason: collision with root package name */
    private m f23077a;

    /* renamed from: b  reason: collision with root package name */
    private final a f23078b;

    public interface a {
        boolean a(SSLSocket sSLSocket);

        m b(SSLSocket sSLSocket);
    }

    public l(a aVar) {
        cm.l.f(aVar, "socketAdapterFactory");
        this.f23078b = aVar;
    }

    private final synchronized m e(SSLSocket sSLSocket) {
        try {
            if (this.f23077a == null && this.f23078b.a(sSLSocket)) {
                this.f23077a = this.f23078b.b(sSLSocket);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f23077a;
    }

    public boolean a(SSLSocket sSLSocket) {
        cm.l.f(sSLSocket, "sslSocket");
        return this.f23078b.a(sSLSocket);
    }

    public String b(SSLSocket sSLSocket) {
        cm.l.f(sSLSocket, "sslSocket");
        m e10 = e(sSLSocket);
        if (e10 != null) {
            return e10.b(sSLSocket);
        }
        return null;
    }

    public boolean c() {
        return true;
    }

    public void d(SSLSocket sSLSocket, String str, List list) {
        cm.l.f(sSLSocket, "sslSocket");
        cm.l.f(list, "protocols");
        m e10 = e(sSLSocket);
        if (e10 != null) {
            e10.d(sSLSocket, str, list);
        }
    }
}
