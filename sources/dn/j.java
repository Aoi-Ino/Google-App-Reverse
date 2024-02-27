package dn;

import cm.g;
import cm.l;
import en.e;
import gn.b;
import gn.c;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.Security;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import um.a0;
import um.z;

public class j {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static volatile j f22939a;

    /* renamed from: b  reason: collision with root package name */
    private static final Logger f22940b = Logger.getLogger(z.class.getName());

    /* renamed from: c  reason: collision with root package name */
    public static final a f22941c;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        private final j d() {
            e.f23059c.b();
            j a10 = a.f22910f.a();
            if (a10 != null) {
                return a10;
            }
            j a11 = b.f22913g.a();
            l.c(a11);
            return a11;
        }

        private final j e() {
            i a10;
            c a11;
            d b10;
            if (j() && (b10 = d.f22922f.b()) != null) {
                return b10;
            }
            if (i() && (a11 = c.f22919f.a()) != null) {
                return a11;
            }
            if (k() && (a10 = i.f22937f.a()) != null) {
                return a10;
            }
            h a12 = h.f22935e.a();
            if (a12 != null) {
                return a12;
            }
            j a13 = e.f22925i.a();
            return a13 != null ? a13 : new j();
        }

        /* access modifiers changed from: private */
        public final j f() {
            return h() ? d() : e();
        }

        private final boolean i() {
            Provider provider = Security.getProviders()[0];
            l.e(provider, "Security.getProviders()[0]");
            return l.a("BC", provider.getName());
        }

        private final boolean j() {
            Provider provider = Security.getProviders()[0];
            l.e(provider, "Security.getProviders()[0]");
            return l.a("Conscrypt", provider.getName());
        }

        private final boolean k() {
            Provider provider = Security.getProviders()[0];
            l.e(provider, "Security.getProviders()[0]");
            return l.a("OpenJSSE", provider.getName());
        }

        public final List b(List list) {
            l.f(list, "protocols");
            ArrayList<a0> arrayList = new ArrayList<>();
            for (Object next : list) {
                if (((a0) next) != a0.HTTP_1_0) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList(r.s(arrayList, 10));
            for (a0 a0Var : arrayList) {
                arrayList2.add(a0Var.toString());
            }
            return arrayList2;
        }

        public final byte[] c(List list) {
            l.f(list, "protocols");
            in.e eVar = new in.e();
            for (String str : b(list)) {
                eVar.Q(str.length());
                eVar.r0(str);
            }
            return eVar.M();
        }

        public final j g() {
            return j.f22939a;
        }

        public final boolean h() {
            return l.a("Dalvik", System.getProperty("java.vm.name"));
        }
    }

    static {
        a aVar = new a((g) null);
        f22941c = aVar;
        f22939a = aVar.f();
    }

    public static /* synthetic */ void k(j jVar, String str, int i10, Throwable th2, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 2) != 0) {
                i10 = 4;
            }
            if ((i11 & 4) != 0) {
                th2 = null;
            }
            jVar.j(str, i10, th2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: log");
    }

    public void b(SSLSocket sSLSocket) {
        l.f(sSLSocket, "sslSocket");
    }

    public c c(X509TrustManager x509TrustManager) {
        l.f(x509TrustManager, "trustManager");
        return new gn.a(d(x509TrustManager));
    }

    public gn.e d(X509TrustManager x509TrustManager) {
        l.f(x509TrustManager, "trustManager");
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        l.e(acceptedIssuers, "trustManager.acceptedIssuers");
        return new b((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public void e(SSLSocket sSLSocket, String str, List list) {
        l.f(sSLSocket, "sslSocket");
        l.f(list, "protocols");
    }

    public void f(Socket socket, InetSocketAddress inetSocketAddress, int i10) {
        l.f(socket, "socket");
        l.f(inetSocketAddress, "address");
        socket.connect(inetSocketAddress, i10);
    }

    public String g(SSLSocket sSLSocket) {
        l.f(sSLSocket, "sslSocket");
        return null;
    }

    public Object h(String str) {
        l.f(str, "closer");
        if (f22940b.isLoggable(Level.FINE)) {
            return new Throwable(str);
        }
        return null;
    }

    public boolean i(String str) {
        l.f(str, "hostname");
        return true;
    }

    public void j(String str, int i10, Throwable th2) {
        l.f(str, "message");
        f22940b.log(i10 == 5 ? Level.WARNING : Level.INFO, str, th2);
    }

    public void l(String str, Object obj) {
        l.f(str, "message");
        if (obj == null) {
            str = str + " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);";
        }
        j(str, 5, (Throwable) obj);
    }

    public SSLContext m() {
        SSLContext instance = SSLContext.getInstance("TLS");
        l.e(instance, "SSLContext.getInstance(\"TLS\")");
        return instance;
    }

    public SSLSocketFactory n(X509TrustManager x509TrustManager) {
        l.f(x509TrustManager, "trustManager");
        try {
            SSLContext m10 = m();
            m10.init((KeyManager[]) null, new TrustManager[]{x509TrustManager}, (SecureRandom) null);
            SSLSocketFactory socketFactory = m10.getSocketFactory();
            l.e(socketFactory, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return socketFactory;
        } catch (GeneralSecurityException e10) {
            throw new AssertionError("No System TLS: " + e10, e10);
        }
    }

    public X509TrustManager o() {
        TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        instance.init((KeyStore) null);
        l.e(instance, "factory");
        TrustManager[] trustManagers = instance.getTrustManagers();
        l.c(trustManagers);
        boolean z10 = true;
        if (trustManagers.length != 1 || !(trustManagers[0] instanceof X509TrustManager)) {
            z10 = false;
        }
        if (z10) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager != null) {
                return (X509TrustManager) trustManager;
            }
            throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Unexpected default trust managers: ");
        String arrays = Arrays.toString(trustManagers);
        l.e(arrays, "java.util.Arrays.toString(this)");
        sb2.append(arrays);
        throw new IllegalStateException(sb2.toString().toString());
    }

    public String toString() {
        String simpleName = getClass().getSimpleName();
        l.e(simpleName, "javaClass.simpleName");
        return simpleName;
    }
}
