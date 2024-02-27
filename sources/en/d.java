package en;

import android.net.http.X509TrustManagerExtensions;
import cm.g;
import cm.l;
import gn.c;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;

public final class d extends c {

    /* renamed from: d  reason: collision with root package name */
    public static final a f23054d = new a((g) null);

    /* renamed from: b  reason: collision with root package name */
    private final X509TrustManager f23055b;

    /* renamed from: c  reason: collision with root package name */
    private final X509TrustManagerExtensions f23056c;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final d a(X509TrustManager x509TrustManager) {
            X509TrustManagerExtensions x509TrustManagerExtensions;
            l.f(x509TrustManager, "trustManager");
            try {
                x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
            } catch (IllegalArgumentException unused) {
                x509TrustManagerExtensions = null;
            }
            if (x509TrustManagerExtensions != null) {
                return new d(x509TrustManager, x509TrustManagerExtensions);
            }
            return null;
        }
    }

    public d(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        l.f(x509TrustManager, "trustManager");
        l.f(x509TrustManagerExtensions, "x509TrustManagerExtensions");
        this.f23055b = x509TrustManager;
        this.f23056c = x509TrustManagerExtensions;
    }

    public List a(List list, String str) {
        l.f(list, "chain");
        l.f(str, "hostname");
        Object[] array = list.toArray(new X509Certificate[0]);
        if (array != null) {
            try {
                List<X509Certificate> checkServerTrusted = this.f23056c.checkServerTrusted((X509Certificate[]) array, "RSA", str);
                l.e(checkServerTrusted, "x509TrustManagerExtensio…ficates, \"RSA\", hostname)");
                return checkServerTrusted;
            } catch (CertificateException e10) {
                SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e10.getMessage());
                sSLPeerUnverifiedException.initCause(e10);
                throw sSLPeerUnverifiedException;
            }
        } else {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof d) && ((d) obj).f23055b == this.f23055b;
    }

    public int hashCode() {
        return System.identityHashCode(this.f23055b);
    }
}
