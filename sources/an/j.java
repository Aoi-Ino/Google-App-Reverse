package an;

import cm.g;
import cm.l;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import km.f;
import um.b0;
import um.c0;
import um.d0;
import um.v;
import um.w;
import um.z;
import vm.b;
import zm.e;

public final class j implements w {

    /* renamed from: b  reason: collision with root package name */
    public static final a f19409b = new a((g) null);

    /* renamed from: a  reason: collision with root package name */
    private final z f19410a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    public j(z zVar) {
        l.f(zVar, "client");
        this.f19410a = zVar;
    }

    private final b0 b(d0 d0Var, String str) {
        String s10;
        v q10;
        c0 c0Var = null;
        if (!this.f19410a.r() || (s10 = d0.s(d0Var, "Location", (String) null, 2, (Object) null)) == null || (q10 = d0Var.c0().j().q(s10)) == null) {
            return null;
        }
        if (!l.a(q10.r(), d0Var.c0().j().r()) && !this.f19410a.t()) {
            return null;
        }
        b0.a h10 = d0Var.c0().h();
        if (f.a(str)) {
            int h11 = d0Var.h();
            f fVar = f.f19395a;
            boolean z10 = fVar.c(str) || h11 == 308 || h11 == 307;
            if (fVar.b(str) && h11 != 308 && h11 != 307) {
                str = "GET";
            } else if (z10) {
                c0Var = d0Var.c0().a();
            }
            h10.e(str, c0Var);
            if (!z10) {
                h10.f("Transfer-Encoding");
                h10.f("Content-Length");
                h10.f("Content-Type");
            }
        }
        if (!b.g(d0Var.c0().j(), q10)) {
            h10.f("Authorization");
        }
        return h10.i(q10).b();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r1 = r7.h();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final um.b0 c(um.d0 r6, zm.c r7) {
        /*
            r5 = this;
            r0 = 0
            if (r7 == 0) goto L_0x000e
            zm.f r1 = r7.h()
            if (r1 == 0) goto L_0x000e
            um.f0 r1 = r1.A()
            goto L_0x000f
        L_0x000e:
            r1 = r0
        L_0x000f:
            int r2 = r6.h()
            um.b0 r3 = r6.c0()
            java.lang.String r3 = r3.g()
            r4 = 307(0x133, float:4.3E-43)
            if (r2 == r4) goto L_0x00df
            r4 = 308(0x134, float:4.32E-43)
            if (r2 == r4) goto L_0x00df
            r4 = 401(0x191, float:5.62E-43)
            if (r2 == r4) goto L_0x00d4
            r4 = 421(0x1a5, float:5.9E-43)
            if (r2 == r4) goto L_0x00ad
            r7 = 503(0x1f7, float:7.05E-43)
            if (r2 == r7) goto L_0x0091
            r7 = 407(0x197, float:5.7E-43)
            if (r2 == r7) goto L_0x006f
            r7 = 408(0x198, float:5.72E-43)
            if (r2 == r7) goto L_0x003b
            switch(r2) {
                case 300: goto L_0x00df;
                case 301: goto L_0x00df;
                case 302: goto L_0x00df;
                case 303: goto L_0x00df;
                default: goto L_0x003a;
            }
        L_0x003a:
            return r0
        L_0x003b:
            um.z r1 = r5.f19410a
            boolean r1 = r1.I()
            if (r1 != 0) goto L_0x0044
            return r0
        L_0x0044:
            um.b0 r1 = r6.c0()
            um.c0 r1 = r1.a()
            if (r1 == 0) goto L_0x0055
            boolean r1 = r1.isOneShot()
            if (r1 == 0) goto L_0x0055
            return r0
        L_0x0055:
            um.d0 r1 = r6.X()
            if (r1 == 0) goto L_0x0062
            int r1 = r1.h()
            if (r1 != r7) goto L_0x0062
            return r0
        L_0x0062:
            r7 = 0
            int r7 = r5.g(r6, r7)
            if (r7 <= 0) goto L_0x006a
            return r0
        L_0x006a:
            um.b0 r6 = r6.c0()
            return r6
        L_0x006f:
            cm.l.c(r1)
            java.net.Proxy r7 = r1.b()
            java.net.Proxy$Type r7 = r7.type()
            java.net.Proxy$Type r0 = java.net.Proxy.Type.HTTP
            if (r7 != r0) goto L_0x0089
            um.z r7 = r5.f19410a
            um.b r7 = r7.D()
            um.b0 r6 = r7.a(r1, r6)
            return r6
        L_0x0089:
            java.net.ProtocolException r6 = new java.net.ProtocolException
            java.lang.String r7 = "Received HTTP_PROXY_AUTH (407) code while not using proxy"
            r6.<init>(r7)
            throw r6
        L_0x0091:
            um.d0 r1 = r6.X()
            if (r1 == 0) goto L_0x009e
            int r1 = r1.h()
            if (r1 != r7) goto L_0x009e
            return r0
        L_0x009e:
            r7 = 2147483647(0x7fffffff, float:NaN)
            int r7 = r5.g(r6, r7)
            if (r7 != 0) goto L_0x00ac
            um.b0 r6 = r6.c0()
            return r6
        L_0x00ac:
            return r0
        L_0x00ad:
            um.b0 r1 = r6.c0()
            um.c0 r1 = r1.a()
            if (r1 == 0) goto L_0x00be
            boolean r1 = r1.isOneShot()
            if (r1 == 0) goto L_0x00be
            return r0
        L_0x00be:
            if (r7 == 0) goto L_0x00d3
            boolean r1 = r7.k()
            if (r1 != 0) goto L_0x00c7
            goto L_0x00d3
        L_0x00c7:
            zm.f r7 = r7.h()
            r7.y()
            um.b0 r6 = r6.c0()
            return r6
        L_0x00d3:
            return r0
        L_0x00d4:
            um.z r7 = r5.f19410a
            um.b r7 = r7.d()
            um.b0 r6 = r7.a(r1, r6)
            return r6
        L_0x00df:
            um.b0 r6 = r5.b(r6, r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: an.j.c(um.d0, zm.c):um.b0");
    }

    private final boolean d(IOException iOException, boolean z10) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        return iOException instanceof InterruptedIOException ? (iOException instanceof SocketTimeoutException) && !z10 : (!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException);
    }

    private final boolean e(IOException iOException, e eVar, b0 b0Var, boolean z10) {
        if (!this.f19410a.I()) {
            return false;
        }
        return (!z10 || !f(iOException, b0Var)) && d(iOException, z10) && eVar.A();
    }

    private final boolean f(IOException iOException, b0 b0Var) {
        c0 a10 = b0Var.a();
        return (a10 != null && a10.isOneShot()) || (iOException instanceof FileNotFoundException);
    }

    private final int g(d0 d0Var, int i10) {
        String s10 = d0.s(d0Var, "Retry-After", (String) null, 2, (Object) null);
        if (s10 == null) {
            return i10;
        }
        if (!new f("\\d+").a(s10)) {
            return Integer.MAX_VALUE;
        }
        Integer valueOf = Integer.valueOf(s10);
        l.e(valueOf, "Integer.valueOf(header)");
        return valueOf.intValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r0 = r0.R().o(r7.R().b((um.e0) null).c()).c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0040, code lost:
        r7 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0045, code lost:
        r0 = r1.q();
        r6 = c(r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004d, code lost:
        if (r6 != null) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004f, code lost:
        if (r0 == null) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0055, code lost:
        if (r0.l() == false) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0057, code lost:
        r1.F();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005a, code lost:
        r1.i(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005d, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r0 = r6.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0062, code lost:
        if (r0 == null) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0068, code lost:
        if (r0.isOneShot() == false) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006a, code lost:
        r1.i(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006d, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r0 = r7.c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0072, code lost:
        if (r0 == null) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0074, code lost:
        vm.b.j(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0077, code lost:
        r8 = r8 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007b, code lost:
        if (r8 > 20) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0098, code lost:
        throw new java.net.ProtocolException("Too many follow-up requests: " + r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0026, code lost:
        if (r7 == null) goto L_0x0040;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public um.d0 a(um.w.a r11) {
        /*
            r10 = this;
            java.lang.String r0 = "chain"
            cm.l.f(r11, r0)
            an.g r11 = (an.g) r11
            um.b0 r0 = r11.i()
            zm.e r1 = r11.e()
            java.util.List r2 = ql.q.i()
            r3 = 0
            r4 = 0
            r5 = 1
            r8 = r3
            r7 = r4
        L_0x0018:
            r6 = r5
        L_0x0019:
            r1.h(r0, r6)
            boolean r6 = r1.isCanceled()     // Catch:{ all -> 0x0042 }
            if (r6 != 0) goto L_0x00cf
            um.d0 r0 = r11.a(r0)     // Catch:{ j -> 0x00b4, IOException -> 0x0099 }
            if (r7 == 0) goto L_0x0040
            um.d0$a r0 = r0.R()     // Catch:{ all -> 0x0042 }
            um.d0$a r6 = r7.R()     // Catch:{ all -> 0x0042 }
            um.d0$a r6 = r6.b(r4)     // Catch:{ all -> 0x0042 }
            um.d0 r6 = r6.c()     // Catch:{ all -> 0x0042 }
            um.d0$a r0 = r0.o(r6)     // Catch:{ all -> 0x0042 }
            um.d0 r0 = r0.c()     // Catch:{ all -> 0x0042 }
        L_0x0040:
            r7 = r0
            goto L_0x0045
        L_0x0042:
            r11 = move-exception
            goto L_0x00d7
        L_0x0045:
            zm.c r0 = r1.q()     // Catch:{ all -> 0x0042 }
            um.b0 r6 = r10.c(r7, r0)     // Catch:{ all -> 0x0042 }
            if (r6 != 0) goto L_0x005e
            if (r0 == 0) goto L_0x005a
            boolean r11 = r0.l()     // Catch:{ all -> 0x0042 }
            if (r11 == 0) goto L_0x005a
            r1.F()     // Catch:{ all -> 0x0042 }
        L_0x005a:
            r1.i(r3)
            return r7
        L_0x005e:
            um.c0 r0 = r6.a()     // Catch:{ all -> 0x0042 }
            if (r0 == 0) goto L_0x006e
            boolean r0 = r0.isOneShot()     // Catch:{ all -> 0x0042 }
            if (r0 == 0) goto L_0x006e
            r1.i(r3)
            return r7
        L_0x006e:
            um.e0 r0 = r7.c()     // Catch:{ all -> 0x0042 }
            if (r0 == 0) goto L_0x0077
            vm.b.j(r0)     // Catch:{ all -> 0x0042 }
        L_0x0077:
            int r8 = r8 + 1
            r0 = 20
            if (r8 > r0) goto L_0x0082
            r1.i(r5)
            r0 = r6
            goto L_0x0018
        L_0x0082:
            java.net.ProtocolException r11 = new java.net.ProtocolException     // Catch:{ all -> 0x0042 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0042 }
            r0.<init>()     // Catch:{ all -> 0x0042 }
            java.lang.String r2 = "Too many follow-up requests: "
            r0.append(r2)     // Catch:{ all -> 0x0042 }
            r0.append(r8)     // Catch:{ all -> 0x0042 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0042 }
            r11.<init>(r0)     // Catch:{ all -> 0x0042 }
            throw r11     // Catch:{ all -> 0x0042 }
        L_0x0099:
            r6 = move-exception
            boolean r9 = r6 instanceof cn.a     // Catch:{ all -> 0x0042 }
            r9 = r9 ^ r5
            boolean r9 = r10.e(r6, r1, r0, r9)     // Catch:{ all -> 0x0042 }
            if (r9 == 0) goto L_0x00af
            java.util.Collection r2 = (java.util.Collection) r2     // Catch:{ all -> 0x0042 }
        L_0x00a5:
            java.util.List r2 = ql.y.j0(r2, r6)     // Catch:{ all -> 0x0042 }
            r1.i(r5)
            r6 = r3
            goto L_0x0019
        L_0x00af:
            java.lang.Throwable r11 = vm.b.U(r6, r2)     // Catch:{ all -> 0x0042 }
            throw r11     // Catch:{ all -> 0x0042 }
        L_0x00b4:
            r6 = move-exception
            java.io.IOException r9 = r6.c()     // Catch:{ all -> 0x0042 }
            boolean r9 = r10.e(r9, r1, r0, r3)     // Catch:{ all -> 0x0042 }
            if (r9 == 0) goto L_0x00c6
            java.util.Collection r2 = (java.util.Collection) r2     // Catch:{ all -> 0x0042 }
            java.io.IOException r6 = r6.b()     // Catch:{ all -> 0x0042 }
            goto L_0x00a5
        L_0x00c6:
            java.io.IOException r11 = r6.b()     // Catch:{ all -> 0x0042 }
            java.lang.Throwable r11 = vm.b.U(r11, r2)     // Catch:{ all -> 0x0042 }
            throw r11     // Catch:{ all -> 0x0042 }
        L_0x00cf:
            java.io.IOException r11 = new java.io.IOException     // Catch:{ all -> 0x0042 }
            java.lang.String r0 = "Canceled"
            r11.<init>(r0)     // Catch:{ all -> 0x0042 }
            throw r11     // Catch:{ all -> 0x0042 }
        L_0x00d7:
            r1.i(r5)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: an.j.a(um.w$a):um.d0");
    }
}
