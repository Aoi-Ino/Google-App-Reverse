package um;

import cm.l;
import java.net.InetSocketAddress;
import java.net.Proxy;

public final class f0 {

    /* renamed from: a  reason: collision with root package name */
    private final a f31980a;

    /* renamed from: b  reason: collision with root package name */
    private final Proxy f31981b;

    /* renamed from: c  reason: collision with root package name */
    private final InetSocketAddress f31982c;

    public f0(a aVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        l.f(aVar, "address");
        l.f(proxy, "proxy");
        l.f(inetSocketAddress, "socketAddress");
        this.f31980a = aVar;
        this.f31981b = proxy;
        this.f31982c = inetSocketAddress;
    }

    public final a a() {
        return this.f31980a;
    }

    public final Proxy b() {
        return this.f31981b;
    }

    public final boolean c() {
        return this.f31980a.k() != null && this.f31981b.type() == Proxy.Type.HTTP;
    }

    public final InetSocketAddress d() {
        return this.f31982c;
    }

    public boolean equals(Object obj) {
        if (obj instanceof f0) {
            f0 f0Var = (f0) obj;
            return l.a(f0Var.f31980a, this.f31980a) && l.a(f0Var.f31981b, this.f31981b) && l.a(f0Var.f31982c, this.f31982c);
        }
    }

    public int hashCode() {
        return ((((527 + this.f31980a.hashCode()) * 31) + this.f31981b.hashCode()) * 31) + this.f31982c.hashCode();
    }

    public String toString() {
        return "Route{" + this.f31982c + '}';
    }
}
