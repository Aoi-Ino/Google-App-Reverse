package dn;

import android.os.Build;
import android.security.NetworkSecurityPolicy;
import cm.g;
import en.c;
import en.d;
import en.h;
import en.i;
import en.k;
import en.l;
import en.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

public final class a extends j {
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final boolean f22909e = (j.f22941c.h() && Build.VERSION.SDK_INT >= 29);

    /* renamed from: f  reason: collision with root package name */
    public static final C0284a f22910f = new C0284a((g) null);

    /* renamed from: d  reason: collision with root package name */
    private final List f22911d;

    /* renamed from: dn.a$a  reason: collision with other inner class name */
    public static final class C0284a {
        private C0284a() {
        }

        public /* synthetic */ C0284a(g gVar) {
            this();
        }

        public final j a() {
            if (b()) {
                return new a();
            }
            return null;
        }

        public final boolean b() {
            return a.f22909e;
        }
    }

    public a() {
        m[] mVarArr = {c.f23053a.a(), new l(h.f23062g.d()), new l(k.f23076b.a()), new l(i.f23070b.a())};
        ArrayList arrayList = new ArrayList();
        for (Object next : q.m(mVarArr)) {
            if (((m) next).c()) {
                arrayList.add(next);
            }
        }
        this.f22911d = arrayList;
    }

    public gn.c c(X509TrustManager x509TrustManager) {
        cm.l.f(x509TrustManager, "trustManager");
        d a10 = d.f23054d.a(x509TrustManager);
        return a10 != null ? a10 : super.c(x509TrustManager);
    }

    public void e(SSLSocket sSLSocket, String str, List list) {
        Object obj;
        cm.l.f(sSLSocket, "sslSocket");
        cm.l.f(list, "protocols");
        Iterator it = this.f22911d.iterator();
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

    public String g(SSLSocket sSLSocket) {
        Object obj;
        cm.l.f(sSLSocket, "sslSocket");
        Iterator it = this.f22911d.iterator();
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

    public boolean i(String str) {
        cm.l.f(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }
}
