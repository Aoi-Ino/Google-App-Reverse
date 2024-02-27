package wm;

import cm.g;
import cm.l;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.SocketAddress;
import java.util.List;
import um.a;
import um.b0;
import um.d0;
import um.f0;
import um.h;
import um.o;
import um.q;
import um.v;

public final class b implements um.b {

    /* renamed from: d  reason: collision with root package name */
    private final q f32652d;

    public b(q qVar) {
        l.f(qVar, "defaultDns");
        this.f32652d = qVar;
    }

    private final InetAddress b(Proxy proxy, v vVar, q qVar) {
        Proxy.Type type = proxy.type();
        if (type != null && a.f32651a[type.ordinal()] == 1) {
            return (InetAddress) y.U(qVar.a(vVar.i()));
        }
        SocketAddress address = proxy.address();
        if (address != null) {
            InetAddress address2 = ((InetSocketAddress) address).getAddress();
            l.e(address2, "(address() as InetSocketAddress).address");
            return address2;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.net.InetSocketAddress");
    }

    public b0 a(f0 f0Var, d0 d0Var) {
        Proxy proxy;
        q qVar;
        PasswordAuthentication passwordAuthentication;
        a a10;
        l.f(d0Var, "response");
        List<h> g10 = d0Var.g();
        b0 c02 = d0Var.c0();
        v j10 = c02.j();
        boolean z10 = d0Var.h() == 407;
        if (f0Var == null || (proxy = f0Var.b()) == null) {
            proxy = Proxy.NO_PROXY;
        }
        for (h hVar : g10) {
            if (p.o("Basic", hVar.c(), true)) {
                if (f0Var == null || (a10 = f0Var.a()) == null || (qVar = a10.c()) == null) {
                    qVar = this.f32652d;
                }
                if (z10) {
                    SocketAddress address = proxy.address();
                    if (address != null) {
                        InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                        String hostName = inetSocketAddress.getHostName();
                        l.e(proxy, "proxy");
                        passwordAuthentication = Authenticator.requestPasswordAuthentication(hostName, b(proxy, j10, qVar), inetSocketAddress.getPort(), j10.r(), hVar.b(), hVar.c(), j10.t(), Authenticator.RequestorType.PROXY);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type java.net.InetSocketAddress");
                    }
                } else {
                    String i10 = j10.i();
                    l.e(proxy, "proxy");
                    passwordAuthentication = Authenticator.requestPasswordAuthentication(i10, b(proxy, j10, qVar), j10.n(), j10.r(), hVar.b(), hVar.c(), j10.t(), Authenticator.RequestorType.SERVER);
                }
                if (passwordAuthentication != null) {
                    String str = z10 ? "Proxy-Authorization" : "Authorization";
                    String userName = passwordAuthentication.getUserName();
                    l.e(userName, "auth.userName");
                    char[] password = passwordAuthentication.getPassword();
                    l.e(password, "auth.password");
                    return c02.h().c(str, o.a(userName, new String(password), hVar.a())).b();
                }
            }
        }
        return null;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(q qVar, int i10, g gVar) {
        this((i10 & 1) != 0 ? q.f32112a : qVar);
    }
}
