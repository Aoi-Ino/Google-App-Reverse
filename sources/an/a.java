package an;

import cm.l;
import in.o;
import java.util.List;
import um.b0;
import um.c0;
import um.d0;
import um.e0;
import um.m;
import um.n;
import um.w;
import um.x;
import vm.b;

public final class a implements w {

    /* renamed from: a  reason: collision with root package name */
    private final n f19388a;

    public a(n nVar) {
        l.f(nVar, "cookieJar");
        this.f19388a = nVar;
    }

    private final String b(List list) {
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        for (Object next : list) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                q.r();
            }
            m mVar = (m) next;
            if (i10 > 0) {
                sb2.append("; ");
            }
            sb2.append(mVar.e());
            sb2.append('=');
            sb2.append(mVar.g());
            i10 = i11;
        }
        String sb3 = sb2.toString();
        l.e(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public d0 a(w.a aVar) {
        e0 c10;
        l.f(aVar, "chain");
        b0 request = aVar.request();
        b0.a h10 = request.h();
        c0 a10 = request.a();
        if (a10 != null) {
            x contentType = a10.contentType();
            if (contentType != null) {
                h10.c("Content-Type", contentType.toString());
            }
            long contentLength = a10.contentLength();
            if (contentLength != -1) {
                h10.c("Content-Length", String.valueOf(contentLength));
                h10.f("Transfer-Encoding");
            } else {
                h10.c("Transfer-Encoding", "chunked");
                h10.f("Content-Length");
            }
        }
        boolean z10 = false;
        if (request.d("Host") == null) {
            h10.c("Host", b.N(request.j(), false, 1, (Object) null));
        }
        if (request.d("Connection") == null) {
            h10.c("Connection", "Keep-Alive");
        }
        if (request.d("Accept-Encoding") == null && request.d("Range") == null) {
            h10.c("Accept-Encoding", "gzip");
            z10 = true;
        }
        List b10 = this.f19388a.b(request.j());
        if (!b10.isEmpty()) {
            h10.c("Cookie", b(b10));
        }
        if (request.d("User-Agent") == null) {
            h10.c("User-Agent", "okhttp/4.9.2");
        }
        d0 a11 = aVar.a(h10.b());
        e.f(this.f19388a, request.j(), a11.y());
        d0.a r10 = a11.R().r(request);
        if (z10 && p.o("gzip", d0.s(a11, "Content-Encoding", (String) null, 2, (Object) null), true) && e.b(a11) && (c10 = a11.c()) != null) {
            in.l lVar = new in.l(c10.source());
            r10.k(a11.y().o().g("Content-Encoding").g("Content-Length").e());
            r10.b(new h(d0.s(a11, "Content-Type", (String) null, 2, (Object) null), -1, o.b(lVar)));
        }
        return r10.c();
    }
}
