package hn;

import cm.g;
import cm.l;
import dn.j;
import in.e;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import um.b0;
import um.c0;
import um.d0;
import um.e0;
import um.u;
import um.w;
import um.x;

public final class a implements w {

    /* renamed from: a  reason: collision with root package name */
    private volatile Set f24181a;

    /* renamed from: b  reason: collision with root package name */
    private volatile C0302a f24182b;

    /* renamed from: c  reason: collision with root package name */
    private final b f24183c;

    /* renamed from: hn.a$a  reason: collision with other inner class name */
    public enum C0302a {
        NONE,
        BASIC,
        HEADERS,
        BODY
    }

    public interface b {

        /* renamed from: a  reason: collision with root package name */
        public static final b f24189a = new C0303a.C0304a();

        /* renamed from: b  reason: collision with root package name */
        public static final C0303a f24190b = new C0303a((g) null);

        /* renamed from: hn.a$b$a  reason: collision with other inner class name */
        public static final class C0303a {

            /* renamed from: hn.a$b$a$a  reason: collision with other inner class name */
            private static final class C0304a implements b {
                public void a(String str) {
                    l.f(str, "message");
                    j.k(j.f22941c.g(), str, 0, (Throwable) null, 6, (Object) null);
                }
            }

            private C0303a() {
            }

            public /* synthetic */ C0303a(g gVar) {
                this();
            }
        }

        void a(String str);
    }

    public a() {
        this((b) null, 1, (g) null);
    }

    private final boolean b(u uVar) {
        String l10 = uVar.l("Content-Encoding");
        return l10 != null && !p.o(l10, "identity", true) && !p.o(l10, "gzip", true);
    }

    private final void c(u uVar, int i10) {
        String s10 = this.f24181a.contains(uVar.n(i10)) ? "██" : uVar.s(i10);
        b bVar = this.f24183c;
        bVar.a(uVar.n(i10) + ": " + s10);
    }

    public d0 a(w.a aVar) {
        String str;
        String str2;
        char c10;
        String str3;
        String str4;
        String str5;
        b bVar;
        String str6;
        Charset charset;
        String str7;
        Throwable th2;
        b bVar2;
        StringBuilder sb2;
        String g10;
        b bVar3;
        String str8;
        Charset charset2;
        StringBuilder sb3;
        w.a aVar2 = aVar;
        l.f(aVar2, "chain");
        C0302a aVar3 = this.f24182b;
        b0 request = aVar.request();
        if (aVar3 == C0302a.NONE) {
            return aVar2.a(request);
        }
        boolean z10 = aVar3 == C0302a.BODY;
        boolean z11 = z10 || aVar3 == C0302a.HEADERS;
        c0 a10 = request.a();
        um.j b10 = aVar.b();
        StringBuilder sb4 = new StringBuilder();
        sb4.append("--> ");
        sb4.append(request.g());
        sb4.append(' ');
        sb4.append(request.j());
        if (b10 != null) {
            str = " " + b10.a();
        } else {
            str = "";
        }
        sb4.append(str);
        String sb5 = sb4.toString();
        if (!z11 && a10 != null) {
            sb5 = sb5 + " (" + a10.contentLength() + "-byte body)";
        }
        this.f24183c.a(sb5);
        if (z11) {
            u e10 = request.e();
            if (a10 != null) {
                x contentType = a10.contentType();
                if (contentType != null && e10.l("Content-Type") == null) {
                    this.f24183c.a("Content-Type: " + contentType);
                }
                if (a10.contentLength() != -1 && e10.l("Content-Length") == null) {
                    this.f24183c.a("Content-Length: " + a10.contentLength());
                }
            }
            int size = e10.size();
            for (int i10 = 0; i10 < size; i10++) {
                c(e10, i10);
            }
            if (!z10 || a10 == null) {
                bVar2 = this.f24183c;
                sb2 = new StringBuilder();
                sb2.append("--> END ");
                g10 = request.g();
            } else if (b(request.e())) {
                bVar2 = this.f24183c;
                sb2 = new StringBuilder();
                sb2.append("--> END ");
                sb2.append(request.g());
                g10 = " (encoded body omitted)";
            } else if (a10.isDuplex()) {
                bVar2 = this.f24183c;
                sb2 = new StringBuilder();
                sb2.append("--> END ");
                sb2.append(request.g());
                g10 = " (duplex request body omitted)";
            } else if (a10.isOneShot()) {
                bVar2 = this.f24183c;
                sb2 = new StringBuilder();
                sb2.append("--> END ");
                sb2.append(request.g());
                g10 = " (one-shot body omitted)";
            } else {
                e eVar = new e();
                a10.writeTo(eVar);
                x contentType2 = a10.contentType();
                if (contentType2 == null || (charset2 = contentType2.c(StandardCharsets.UTF_8)) == null) {
                    charset2 = StandardCharsets.UTF_8;
                    l.e(charset2, "UTF_8");
                }
                this.f24183c.a("");
                if (b.a(eVar)) {
                    this.f24183c.a(eVar.y0(charset2));
                    bVar3 = this.f24183c;
                    sb3 = new StringBuilder();
                    sb3.append("--> END ");
                    sb3.append(request.g());
                    sb3.append(" (");
                    sb3.append(a10.contentLength());
                    sb3.append("-byte body)");
                } else {
                    bVar3 = this.f24183c;
                    sb3 = new StringBuilder();
                    sb3.append("--> END ");
                    sb3.append(request.g());
                    sb3.append(" (binary ");
                    sb3.append(a10.contentLength());
                    sb3.append("-byte body omitted)");
                }
                str8 = sb3.toString();
                bVar3.a(str8);
            }
            sb2.append(g10);
            str8 = sb2.toString();
            bVar3.a(str8);
        }
        long nanoTime = System.nanoTime();
        try {
            d0 a11 = aVar2.a(request);
            long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime);
            e0 c11 = a11.c();
            l.c(c11);
            long contentLength = c11.contentLength();
            if (contentLength != -1) {
                str2 = contentLength + "-byte";
            } else {
                str2 = "unknown-length";
            }
            b bVar4 = this.f24183c;
            String str9 = "-byte body)";
            StringBuilder sb6 = new StringBuilder();
            long j10 = contentLength;
            sb6.append("<-- ");
            sb6.append(a11.h());
            if (a11.E().length() == 0) {
                str3 = "-byte body omitted)";
                str4 = "";
                c10 = ' ';
            } else {
                String E = a11.E();
                StringBuilder sb7 = new StringBuilder();
                str3 = "-byte body omitted)";
                c10 = ' ';
                sb7.append(String.valueOf(' '));
                sb7.append(E);
                str4 = sb7.toString();
            }
            sb6.append(str4);
            sb6.append(c10);
            sb6.append(a11.c0().j());
            sb6.append(" (");
            sb6.append(millis);
            sb6.append("ms");
            if (!z11) {
                str5 = ", " + str2 + " body";
            } else {
                str5 = "";
            }
            sb6.append(str5);
            sb6.append(')');
            bVar4.a(sb6.toString());
            if (z11) {
                u y10 = a11.y();
                int size2 = y10.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    c(y10, i11);
                }
                if (!z10 || !an.e.b(a11)) {
                    bVar = this.f24183c;
                    str6 = "<-- END HTTP";
                } else if (b(a11.y())) {
                    bVar = this.f24183c;
                    str6 = "<-- END HTTP (encoded body omitted)";
                } else {
                    in.g source = c11.source();
                    source.A(Long.MAX_VALUE);
                    e d10 = source.d();
                    Long l10 = null;
                    if (p.o("gzip", y10.l("Content-Encoding"), true)) {
                        Long valueOf = Long.valueOf(d10.H0());
                        in.l lVar = new in.l(d10.clone());
                        try {
                            d10 = new e();
                            d10.q0(lVar);
                            zl.b.a(lVar, (Throwable) null);
                            l10 = valueOf;
                        } catch (Throwable th3) {
                            Throwable th4 = th3;
                            zl.b.a(lVar, th2);
                            throw th4;
                        }
                    }
                    x contentType3 = c11.contentType();
                    if (contentType3 == null || (charset = contentType3.c(StandardCharsets.UTF_8)) == null) {
                        charset = StandardCharsets.UTF_8;
                        l.e(charset, "UTF_8");
                    }
                    if (!b.a(d10)) {
                        this.f24183c.a("");
                        this.f24183c.a("<-- END HTTP (binary " + d10.H0() + str3);
                        return a11;
                    }
                    if (j10 != 0) {
                        this.f24183c.a("");
                        this.f24183c.a(d10.clone().y0(charset));
                    }
                    b bVar5 = this.f24183c;
                    if (l10 != null) {
                        str7 = "<-- END HTTP (" + d10.H0() + "-byte, " + l10 + "-gzipped-byte body)";
                    } else {
                        str7 = "<-- END HTTP (" + d10.H0() + str9;
                    }
                    bVar5.a(str7);
                }
                bVar.a(str6);
            }
            return a11;
        } catch (Exception e11) {
            Exception exc = e11;
            this.f24183c.a("<-- HTTP FAILED: " + exc);
            throw exc;
        }
    }

    public final a d(C0302a aVar) {
        l.f(aVar, "level");
        this.f24182b = aVar;
        return this;
    }

    public a(b bVar) {
        l.f(bVar, "logger");
        this.f24183c = bVar;
        this.f24181a = q0.d();
        this.f24182b = C0302a.NONE;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(b bVar, int i10, g gVar) {
        this((i10 & 1) != 0 ? b.f24189a : bVar);
    }
}
