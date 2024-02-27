package dn;

import android.os.Build;
import android.security.NetworkSecurityPolicy;
import cm.g;
import cm.l;
import en.d;
import en.h;
import en.i;
import en.j;
import en.k;
import en.m;
import en.n;
import gn.c;
import gn.e;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

public final class b extends j {
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final boolean f22912f;

    /* renamed from: g  reason: collision with root package name */
    public static final a f22913g = new a((g) null);

    /* renamed from: d  reason: collision with root package name */
    private final List f22914d;

    /* renamed from: e  reason: collision with root package name */
    private final j f22915e;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final j a() {
            if (b()) {
                return new b();
            }
            return null;
        }

        public final boolean b() {
            return b.f22912f;
        }
    }

    /* renamed from: dn.b$b  reason: collision with other inner class name */
    public static final class C0285b implements e {

        /* renamed from: a  reason: collision with root package name */
        private final X509TrustManager f22916a;

        /* renamed from: b  reason: collision with root package name */
        private final Method f22917b;

        public C0285b(X509TrustManager x509TrustManager, Method method) {
            l.f(x509TrustManager, "trustManager");
            l.f(method, "findByIssuerAndSignatureMethod");
            this.f22916a = x509TrustManager;
            this.f22917b = method;
        }

        public X509Certificate a(X509Certificate x509Certificate) {
            l.f(x509Certificate, "cert");
            try {
                Object invoke = this.f22917b.invoke(this.f22916a, new Object[]{x509Certificate});
                if (invoke != null) {
                    return ((TrustAnchor) invoke).getTrustedCert();
                }
                throw new NullPointerException("null cannot be cast to non-null type java.security.cert.TrustAnchor");
            } catch (IllegalAccessException e10) {
                throw new AssertionError("unable to get issues and signature", e10);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0285b)) {
                return false;
            }
            C0285b bVar = (C0285b) obj;
            return l.a(this.f22916a, bVar.f22916a) && l.a(this.f22917b, bVar.f22917b);
        }

        public int hashCode() {
            X509TrustManager x509TrustManager = this.f22916a;
            int i10 = 0;
            int hashCode = (x509TrustManager != null ? x509TrustManager.hashCode() : 0) * 31;
            Method method = this.f22917b;
            if (method != null) {
                i10 = method.hashCode();
            }
            return hashCode + i10;
        }

        public String toString() {
            return "CustomTrustRootIndex(trustManager=" + this.f22916a + ", findByIssuerAndSignatureMethod=" + this.f22917b + ")";
        }
    }

    static {
        boolean z10 = false;
        if (j.f22941c.h() && Build.VERSION.SDK_INT < 30) {
            z10 = true;
        }
        f22912f = z10;
    }

    public b() {
        m[] mVarArr = {n.a.b(n.f23079j, (String) null, 1, (Object) null), new en.l(h.f23062g.d()), new en.l(k.f23076b.a()), new en.l(i.f23070b.a())};
        ArrayList arrayList = new ArrayList();
        for (Object next : q.m(mVarArr)) {
            if (((m) next).c()) {
                arrayList.add(next);
            }
        }
        this.f22914d = arrayList;
        this.f22915e = j.f23071d.a();
    }

    public c c(X509TrustManager x509TrustManager) {
        l.f(x509TrustManager, "trustManager");
        d a10 = d.f23054d.a(x509TrustManager);
        return a10 != null ? a10 : super.c(x509TrustManager);
    }

    public e d(X509TrustManager x509TrustManager) {
        l.f(x509TrustManager, "trustManager");
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", new Class[]{X509Certificate.class});
            l.e(declaredMethod, "method");
            declaredMethod.setAccessible(true);
            return new C0285b(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.d(x509TrustManager);
        }
    }

    public void e(SSLSocket sSLSocket, String str, List list) {
        Object obj;
        l.f(sSLSocket, "sslSocket");
        l.f(list, "protocols");
        Iterator it = this.f22914d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((m) obj).a(sSLSocket)) {
                break;
            }
        }
        m mVar = (m) obj;
        if (mVar != null) {
            mVar.d(sSLSocket, str, list);
        }
    }

    public void f(Socket socket, InetSocketAddress inetSocketAddress, int i10) {
        l.f(socket, "socket");
        l.f(inetSocketAddress, "address");
        try {
            socket.connect(inetSocketAddress, i10);
        } catch (ClassCastException e10) {
            if (Build.VERSION.SDK_INT == 26) {
                throw new IOException("Exception in connect", e10);
            }
            throw e10;
        }
    }

    public String g(SSLSocket sSLSocket) {
        Object obj;
        l.f(sSLSocket, "sslSocket");
        Iterator it = this.f22914d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((m) obj).a(sSLSocket)) {
                break;
            }
        }
        m mVar = (m) obj;
        if (mVar != null) {
            return mVar.b(sSLSocket);
        }
        return null;
    }

    public Object h(String str) {
        l.f(str, "closer");
        return this.f22915e.a(str);
    }

    public boolean i(String str) {
        l.f(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    public void l(String str, Object obj) {
        l.f(str, "message");
        if (!this.f22915e.b(obj)) {
            j.k(this, str, 5, (Throwable) null, 4, (Object) null);
        }
    }
}
