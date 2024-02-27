package gn;

import cm.g;
import cm.l;
import dn.j;
import java.util.List;
import javax.net.ssl.X509TrustManager;

public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public static final a f23996a = new a((g) null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final c a(X509TrustManager x509TrustManager) {
            l.f(x509TrustManager, "trustManager");
            return j.f22941c.g().c(x509TrustManager);
        }
    }

    public abstract List a(List list, String str);
}
