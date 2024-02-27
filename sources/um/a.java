package um;

import cm.l;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import um.v;
import vm.b;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final v f31880a;

    /* renamed from: b  reason: collision with root package name */
    private final List f31881b;

    /* renamed from: c  reason: collision with root package name */
    private final List f31882c;

    /* renamed from: d  reason: collision with root package name */
    private final q f31883d;

    /* renamed from: e  reason: collision with root package name */
    private final SocketFactory f31884e;

    /* renamed from: f  reason: collision with root package name */
    private final SSLSocketFactory f31885f;

    /* renamed from: g  reason: collision with root package name */
    private final HostnameVerifier f31886g;

    /* renamed from: h  reason: collision with root package name */
    private final g f31887h;

    /* renamed from: i  reason: collision with root package name */
    private final b f31888i;

    /* renamed from: j  reason: collision with root package name */
    private final Proxy f31889j;

    /* renamed from: k  reason: collision with root package name */
    private final ProxySelector f31890k;

    public a(String str, int i10, q qVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, g gVar, b bVar, Proxy proxy, List list, List list2, ProxySelector proxySelector) {
        l.f(str, "uriHost");
        l.f(qVar, "dns");
        l.f(socketFactory, "socketFactory");
        l.f(bVar, "proxyAuthenticator");
        l.f(list, "protocols");
        l.f(list2, "connectionSpecs");
        l.f(proxySelector, "proxySelector");
        this.f31883d = qVar;
        this.f31884e = socketFactory;
        this.f31885f = sSLSocketFactory;
        this.f31886g = hostnameVerifier;
        this.f31887h = gVar;
        this.f31888i = bVar;
        this.f31889j = proxy;
        this.f31890k = proxySelector;
        this.f31880a = new v.a().q(sSLSocketFactory != null ? "https" : "http").g(str).m(i10).c();
        this.f31881b = b.O(list);
        this.f31882c = b.O(list2);
    }

    public final g a() {
        return this.f31887h;
    }

    public final List b() {
        return this.f31882c;
    }

    public final q c() {
        return this.f31883d;
    }

    public final boolean d(a aVar) {
        l.f(aVar, "that");
        return l.a(this.f31883d, aVar.f31883d) && l.a(this.f31888i, aVar.f31888i) && l.a(this.f31881b, aVar.f31881b) && l.a(this.f31882c, aVar.f31882c) && l.a(this.f31890k, aVar.f31890k) && l.a(this.f31889j, aVar.f31889j) && l.a(this.f31885f, aVar.f31885f) && l.a(this.f31886g, aVar.f31886g) && l.a(this.f31887h, aVar.f31887h) && this.f31880a.n() == aVar.f31880a.n();
    }

    public final HostnameVerifier e() {
        return this.f31886g;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            return l.a(this.f31880a, aVar.f31880a) && d(aVar);
        }
    }

    public final List f() {
        return this.f31881b;
    }

    public final Proxy g() {
        return this.f31889j;
    }

    public final b h() {
        return this.f31888i;
    }

    public int hashCode() {
        return ((((((((((((((((((527 + this.f31880a.hashCode()) * 31) + this.f31883d.hashCode()) * 31) + this.f31888i.hashCode()) * 31) + this.f31881b.hashCode()) * 31) + this.f31882c.hashCode()) * 31) + this.f31890k.hashCode()) * 31) + Objects.hashCode(this.f31889j)) * 31) + Objects.hashCode(this.f31885f)) * 31) + Objects.hashCode(this.f31886g)) * 31) + Objects.hashCode(this.f31887h);
    }

    public final ProxySelector i() {
        return this.f31890k;
    }

    public final SocketFactory j() {
        return this.f31884e;
    }

    public final SSLSocketFactory k() {
        return this.f31885f;
    }

    public final v l() {
        return this.f31880a;
    }

    public String toString() {
        StringBuilder sb2;
        Object obj;
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Address{");
        sb3.append(this.f31880a.i());
        sb3.append(':');
        sb3.append(this.f31880a.n());
        sb3.append(", ");
        if (this.f31889j != null) {
            sb2 = new StringBuilder();
            sb2.append("proxy=");
            obj = this.f31889j;
        } else {
            sb2 = new StringBuilder();
            sb2.append("proxySelector=");
            obj = this.f31890k;
        }
        sb2.append(obj);
        sb3.append(sb2.toString());
        sb3.append("}");
        return sb3.toString();
    }
}
