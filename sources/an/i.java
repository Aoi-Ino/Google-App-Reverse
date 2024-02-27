package an;

import cm.l;
import java.net.Proxy;
import um.b0;
import um.v;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final i f19408a = new i();

    private i() {
    }

    private final boolean b(b0 b0Var, Proxy.Type type) {
        return !b0Var.f() && type == Proxy.Type.HTTP;
    }

    public final String a(b0 b0Var, Proxy.Type type) {
        l.f(b0Var, "request");
        l.f(type, "proxyType");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(b0Var.g());
        sb2.append(' ');
        i iVar = f19408a;
        boolean b10 = iVar.b(b0Var, type);
        v j10 = b0Var.j();
        if (b10) {
            sb2.append(j10);
        } else {
            sb2.append(iVar.c(j10));
        }
        sb2.append(" HTTP/1.1");
        String sb3 = sb2.toString();
        l.e(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public final String c(v vVar) {
        l.f(vVar, "url");
        String d10 = vVar.d();
        String f10 = vVar.f();
        if (f10 == null) {
            return d10;
        }
        return d10 + '?' + f10;
    }
}
