package an;

import cm.l;
import in.f;
import in.o;
import java.net.ProtocolException;
import um.b0;
import um.c0;
import um.d0;
import um.e0;
import um.w;
import zm.c;

public final class b implements w {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f19389a;

    public b(boolean z10) {
        this.f19389a = z10;
    }

    public d0 a(w.a aVar) {
        boolean z10;
        d0.a aVar2;
        d0.a R;
        e0 o10;
        l.f(aVar, "chain");
        g gVar = (g) aVar;
        c g10 = gVar.g();
        l.c(g10);
        b0 i10 = gVar.i();
        c0 a10 = i10.a();
        long currentTimeMillis = System.currentTimeMillis();
        g10.t(i10);
        Long l10 = null;
        if (!f.a(i10.g()) || a10 == null) {
            g10.n();
            z10 = true;
            aVar2 = null;
        } else {
            if (p.o("100-continue", i10.d("Expect"), true)) {
                g10.f();
                aVar2 = g10.p(true);
                g10.r();
                z10 = false;
            } else {
                z10 = true;
                aVar2 = null;
            }
            if (aVar2 != null) {
                g10.n();
                if (!g10.h().w()) {
                    g10.m();
                }
            } else if (a10.isDuplex()) {
                g10.f();
                a10.writeTo(o.a(g10.c(i10, true)));
            } else {
                f a11 = o.a(g10.c(i10, false));
                a10.writeTo(a11);
                a11.close();
            }
        }
        if (a10 == null || !a10.isDuplex()) {
            g10.e();
        }
        if (aVar2 == null) {
            aVar2 = g10.p(false);
            l.c(aVar2);
            if (z10) {
                g10.r();
                z10 = false;
            }
        }
        d0 c10 = aVar2.r(i10).i(g10.h().s()).s(currentTimeMillis).q(System.currentTimeMillis()).c();
        int h10 = c10.h();
        if (h10 == 100) {
            d0.a p10 = g10.p(false);
            l.c(p10);
            if (z10) {
                g10.r();
            }
            c10 = p10.r(i10).i(g10.h().s()).s(currentTimeMillis).q(System.currentTimeMillis()).c();
            h10 = c10.h();
        }
        g10.q(c10);
        if (!this.f19389a || h10 != 101) {
            R = c10.R();
            o10 = g10.o(c10);
        } else {
            R = c10.R();
            o10 = vm.b.f32399c;
        }
        d0 c11 = R.b(o10).c();
        if (p.o("close", c11.c0().d("Connection"), true) || p.o("close", d0.s(c11, "Connection", (String) null, 2, (Object) null), true)) {
            g10.m();
        }
        if (h10 == 204 || h10 == 205) {
            e0 c12 = c11.c();
            if ((c12 != null ? c12.contentLength() : -1) > 0) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("HTTP ");
                sb2.append(h10);
                sb2.append(" had non-zero Content-Length: ");
                e0 c13 = c11.c();
                if (c13 != null) {
                    l10 = Long.valueOf(c13.contentLength());
                }
                sb2.append(l10);
                throw new ProtocolException(sb2.toString());
            }
        }
        return c11;
    }
}
