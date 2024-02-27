package zm;

import cm.g;
import cm.l;
import cm.m;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
import um.e;
import um.f0;
import um.r;
import um.v;

public final class k {

    /* renamed from: i  reason: collision with root package name */
    public static final a f33313i = new a((g) null);

    /* renamed from: a  reason: collision with root package name */
    private List f33314a = q.i();

    /* renamed from: b  reason: collision with root package name */
    private int f33315b;

    /* renamed from: c  reason: collision with root package name */
    private List f33316c = q.i();

    /* renamed from: d  reason: collision with root package name */
    private final List f33317d = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final um.a f33318e;

    /* renamed from: f  reason: collision with root package name */
    private final i f33319f;

    /* renamed from: g  reason: collision with root package name */
    private final e f33320g;

    /* renamed from: h  reason: collision with root package name */
    private final r f33321h;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final String a(InetSocketAddress inetSocketAddress) {
            String hostName;
            String str;
            l.f(inetSocketAddress, "$this$socketHost");
            InetAddress address = inetSocketAddress.getAddress();
            if (address != null) {
                hostName = address.getHostAddress();
                str = "address.hostAddress";
            } else {
                hostName = inetSocketAddress.getHostName();
                str = "hostName";
            }
            l.e(hostName, str);
            return hostName;
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private int f33322a;

        /* renamed from: b  reason: collision with root package name */
        private final List f33323b;

        public b(List list) {
            l.f(list, "routes");
            this.f33323b = list;
        }

        public final List a() {
            return this.f33323b;
        }

        public final boolean b() {
            return this.f33322a < this.f33323b.size();
        }

        public final f0 c() {
            if (b()) {
                List list = this.f33323b;
                int i10 = this.f33322a;
                this.f33322a = i10 + 1;
                return (f0) list.get(i10);
            }
            throw new NoSuchElementException();
        }
    }

    static final class c extends m implements bm.a {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ k f33324e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Proxy f33325f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ v f33326g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(k kVar, Proxy proxy, v vVar) {
            super(0);
            this.f33324e = kVar;
            this.f33325f = proxy;
            this.f33326g = vVar;
        }

        /* renamed from: b */
        public final List a() {
            Proxy proxy = this.f33325f;
            if (proxy != null) {
                return p.d(proxy);
            }
            URI s10 = this.f33326g.s();
            if (s10.getHost() == null) {
                return vm.b.t(Proxy.NO_PROXY);
            }
            List<Proxy> select = this.f33324e.f33318e.i().select(s10);
            Collection collection = select;
            if (collection != null && !collection.isEmpty()) {
                return vm.b.O(select);
            }
            return vm.b.t(Proxy.NO_PROXY);
        }
    }

    public k(um.a aVar, i iVar, e eVar, r rVar) {
        l.f(aVar, "address");
        l.f(iVar, "routeDatabase");
        l.f(eVar, "call");
        l.f(rVar, "eventListener");
        this.f33318e = aVar;
        this.f33319f = iVar;
        this.f33320g = eVar;
        this.f33321h = rVar;
        g(aVar.l(), aVar.g());
    }

    private final boolean c() {
        return this.f33315b < this.f33314a.size();
    }

    private final Proxy e() {
        if (c()) {
            List list = this.f33314a;
            int i10 = this.f33315b;
            this.f33315b = i10 + 1;
            Proxy proxy = (Proxy) list.get(i10);
            f(proxy);
            return proxy;
        }
        throw new SocketException("No route to " + this.f33318e.l().i() + "; exhausted proxy configurations: " + this.f33314a);
    }

    private final void f(Proxy proxy) {
        String str;
        int i10;
        ArrayList arrayList = new ArrayList();
        this.f33316c = arrayList;
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
            str = this.f33318e.l().i();
            i10 = this.f33318e.l().n();
        } else {
            SocketAddress address = proxy.address();
            if (address instanceof InetSocketAddress) {
                InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                str = f33313i.a(inetSocketAddress);
                i10 = inetSocketAddress.getPort();
            } else {
                throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + address.getClass()).toString());
            }
        }
        if (1 > i10 || 65535 < i10) {
            throw new SocketException("No route to " + str + ':' + i10 + "; port is out of range");
        } else if (proxy.type() == Proxy.Type.SOCKS) {
            arrayList.add(InetSocketAddress.createUnresolved(str, i10));
        } else {
            this.f33321h.m(this.f33320g, str);
            List<InetAddress> a10 = this.f33318e.c().a(str);
            if (!a10.isEmpty()) {
                this.f33321h.l(this.f33320g, str, a10);
                for (InetAddress inetSocketAddress2 : a10) {
                    arrayList.add(new InetSocketAddress(inetSocketAddress2, i10));
                }
                return;
            }
            throw new UnknownHostException(this.f33318e.c() + " returned no addresses for " + str);
        }
    }

    private final void g(v vVar, Proxy proxy) {
        c cVar = new c(this, proxy, vVar);
        this.f33321h.o(this.f33320g, vVar);
        List b10 = cVar.a();
        this.f33314a = b10;
        this.f33315b = 0;
        this.f33321h.n(this.f33320g, vVar, b10);
    }

    public final boolean b() {
        return c() || (this.f33317d.isEmpty() ^ true);
    }

    public final b d() {
        if (b()) {
            ArrayList arrayList = new ArrayList();
            while (c()) {
                Proxy e10 = e();
                for (InetSocketAddress f0Var : this.f33316c) {
                    f0 f0Var2 = new f0(this.f33318e, e10, f0Var);
                    if (this.f33319f.c(f0Var2)) {
                        this.f33317d.add(f0Var2);
                    } else {
                        arrayList.add(f0Var2);
                    }
                }
                if (!arrayList.isEmpty()) {
                    break;
                }
            }
            if (arrayList.isEmpty()) {
                boolean unused = v.v(arrayList, this.f33317d);
                this.f33317d.clear();
            }
            return new b(arrayList);
        }
        throw new NoSuchElementException();
    }
}
