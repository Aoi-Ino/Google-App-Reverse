package zm;

import an.g;
import cm.l;
import cn.n;
import java.io.IOException;
import um.a;
import um.f0;
import um.r;
import um.v;
import um.z;
import vm.b;
import zm.k;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    private k.b f33247a;

    /* renamed from: b  reason: collision with root package name */
    private k f33248b;

    /* renamed from: c  reason: collision with root package name */
    private int f33249c;

    /* renamed from: d  reason: collision with root package name */
    private int f33250d;

    /* renamed from: e  reason: collision with root package name */
    private int f33251e;

    /* renamed from: f  reason: collision with root package name */
    private f0 f33252f;

    /* renamed from: g  reason: collision with root package name */
    private final h f33253g;

    /* renamed from: h  reason: collision with root package name */
    private final a f33254h;

    /* renamed from: i  reason: collision with root package name */
    private final e f33255i;

    /* renamed from: j  reason: collision with root package name */
    private final r f33256j;

    public d(h hVar, a aVar, e eVar, r rVar) {
        l.f(hVar, "connectionPool");
        l.f(aVar, "address");
        l.f(eVar, "call");
        l.f(rVar, "eventListener");
        this.f33253g = hVar;
        this.f33254h = aVar;
        this.f33255i = eVar;
        this.f33256j = rVar;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x013b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final zm.f b(int r15, int r16, int r17, int r18, boolean r19) {
        /*
            r14 = this;
            r1 = r14
            zm.e r0 = r1.f33255i
            boolean r0 = r0.isCanceled()
            if (r0 != 0) goto L_0x0163
            zm.e r0 = r1.f33255i
            zm.f r2 = r0.k()
            r0 = 1
            r3 = 0
            r4 = 0
            if (r2 == 0) goto L_0x0065
            monitor-enter(r2)
            boolean r5 = r2.q()     // Catch:{ all -> 0x0030 }
            if (r5 != 0) goto L_0x0032
            um.f0 r5 = r2.A()     // Catch:{ all -> 0x0030 }
            um.a r5 = r5.a()     // Catch:{ all -> 0x0030 }
            um.v r5 = r5.l()     // Catch:{ all -> 0x0030 }
            boolean r5 = r14.g(r5)     // Catch:{ all -> 0x0030 }
            if (r5 != 0) goto L_0x002e
            goto L_0x0032
        L_0x002e:
            r5 = r4
            goto L_0x0038
        L_0x0030:
            r0 = move-exception
            goto L_0x0063
        L_0x0032:
            zm.e r5 = r1.f33255i     // Catch:{ all -> 0x0030 }
            java.net.Socket r5 = r5.z()     // Catch:{ all -> 0x0030 }
        L_0x0038:
            pl.x r6 = pl.x.f30437a     // Catch:{ all -> 0x0030 }
            monitor-exit(r2)
            zm.e r6 = r1.f33255i
            zm.f r6 = r6.k()
            if (r6 == 0) goto L_0x0056
            if (r5 != 0) goto L_0x0046
            goto L_0x0047
        L_0x0046:
            r0 = r3
        L_0x0047:
            if (r0 == 0) goto L_0x004a
            return r2
        L_0x004a:
            java.lang.String r0 = "Check failed."
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
        L_0x0056:
            if (r5 == 0) goto L_0x005b
            vm.b.k(r5)
        L_0x005b:
            um.r r5 = r1.f33256j
            zm.e r6 = r1.f33255i
            r5.k(r6, r2)
            goto L_0x0065
        L_0x0063:
            monitor-exit(r2)
            throw r0
        L_0x0065:
            r1.f33249c = r3
            r1.f33250d = r3
            r1.f33251e = r3
            zm.h r2 = r1.f33253g
            um.a r5 = r1.f33254h
            zm.e r6 = r1.f33255i
            boolean r2 = r2.a(r5, r6, r4, r3)
            if (r2 == 0) goto L_0x0088
        L_0x0077:
            zm.e r0 = r1.f33255i
            zm.f r0 = r0.k()
            cm.l.c(r0)
        L_0x0080:
            um.r r2 = r1.f33256j
            zm.e r3 = r1.f33255i
            r2.j(r3, r0)
            return r0
        L_0x0088:
            um.f0 r2 = r1.f33252f
            if (r2 == 0) goto L_0x0093
            cm.l.c(r2)
            r1.f33252f = r4
        L_0x0091:
            r5 = r4
            goto L_0x00e8
        L_0x0093:
            zm.k$b r2 = r1.f33247a
            if (r2 == 0) goto L_0x00aa
            cm.l.c(r2)
            boolean r2 = r2.b()
            if (r2 == 0) goto L_0x00aa
            zm.k$b r2 = r1.f33247a
            cm.l.c(r2)
            um.f0 r2 = r2.c()
            goto L_0x0091
        L_0x00aa:
            zm.k r2 = r1.f33248b
            if (r2 != 0) goto L_0x00c5
            zm.k r2 = new zm.k
            um.a r5 = r1.f33254h
            zm.e r6 = r1.f33255i
            um.z r6 = r6.j()
            zm.i r6 = r6.u()
            zm.e r7 = r1.f33255i
            um.r r8 = r1.f33256j
            r2.<init>(r5, r6, r7, r8)
            r1.f33248b = r2
        L_0x00c5:
            zm.k$b r2 = r2.d()
            r1.f33247a = r2
            java.util.List r5 = r2.a()
            zm.e r6 = r1.f33255i
            boolean r6 = r6.isCanceled()
            if (r6 != 0) goto L_0x015b
            zm.h r6 = r1.f33253g
            um.a r7 = r1.f33254h
            zm.e r8 = r1.f33255i
            boolean r3 = r6.a(r7, r8, r5, r3)
            if (r3 == 0) goto L_0x00e4
            goto L_0x0077
        L_0x00e4:
            um.f0 r2 = r2.c()
        L_0x00e8:
            zm.f r3 = new zm.f
            zm.h r6 = r1.f33253g
            r3.<init>(r6, r2)
            zm.e r6 = r1.f33255i
            r6.C(r3)
            zm.e r12 = r1.f33255i     // Catch:{ all -> 0x0154 }
            um.r r13 = r1.f33256j     // Catch:{ all -> 0x0154 }
            r6 = r3
            r7 = r15
            r8 = r16
            r9 = r17
            r10 = r18
            r11 = r19
            r6.g(r7, r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x0154 }
            zm.e r6 = r1.f33255i
            r6.C(r4)
            zm.e r4 = r1.f33255i
            um.z r4 = r4.j()
            zm.i r4 = r4.u()
            um.f0 r6 = r3.A()
            r4.a(r6)
            zm.h r4 = r1.f33253g
            um.a r6 = r1.f33254h
            zm.e r7 = r1.f33255i
            boolean r0 = r4.a(r6, r7, r5, r0)
            if (r0 == 0) goto L_0x013b
            zm.e r0 = r1.f33255i
            zm.f r0 = r0.k()
            cm.l.c(r0)
            r1.f33252f = r2
            java.net.Socket r2 = r3.E()
            vm.b.k(r2)
            goto L_0x0080
        L_0x013b:
            monitor-enter(r3)
            zm.h r0 = r1.f33253g     // Catch:{ all -> 0x0151 }
            r0.e(r3)     // Catch:{ all -> 0x0151 }
            zm.e r0 = r1.f33255i     // Catch:{ all -> 0x0151 }
            r0.c(r3)     // Catch:{ all -> 0x0151 }
            pl.x r0 = pl.x.f30437a     // Catch:{ all -> 0x0151 }
            monitor-exit(r3)
            um.r r0 = r1.f33256j
            zm.e r2 = r1.f33255i
            r0.j(r2, r3)
            return r3
        L_0x0151:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x0154:
            r0 = move-exception
            zm.e r2 = r1.f33255i
            r2.C(r4)
            throw r0
        L_0x015b:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "Canceled"
            r0.<init>(r2)
            throw r0
        L_0x0163:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "Canceled"
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: zm.d.b(int, int, int, int, boolean):zm.f");
    }

    private final f c(int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
        k.b bVar;
        k kVar;
        while (true) {
            f b10 = b(i10, i11, i12, i13, z10);
            if (b10.v(z11)) {
                return b10;
            }
            b10.z();
            if (this.f33252f == null && (bVar = this.f33247a) != null && !bVar.b() && (kVar = this.f33248b) != null && !kVar.b()) {
                throw new IOException("exhausted all routes");
            }
        }
    }

    private final f0 f() {
        f k10;
        if (this.f33249c > 1 || this.f33250d > 1 || this.f33251e > 0 || (k10 = this.f33255i.k()) == null) {
            return null;
        }
        synchronized (k10) {
            if (k10.r() != 0) {
                return null;
            }
            if (!b.g(k10.A().a().l(), this.f33254h.l())) {
                return null;
            }
            f0 A = k10.A();
            return A;
        }
    }

    public final an.d a(z zVar, g gVar) {
        l.f(zVar, "client");
        l.f(gVar, "chain");
        try {
            return c(gVar.f(), gVar.h(), gVar.j(), zVar.z(), zVar.I(), !l.a(gVar.i().g(), "GET")).x(zVar, gVar);
        } catch (j e10) {
            h(e10.c());
            throw e10;
        } catch (IOException e11) {
            h(e11);
            throw new j(e11);
        }
    }

    public final a d() {
        return this.f33254h;
    }

    public final boolean e() {
        k kVar;
        if (this.f33249c == 0 && this.f33250d == 0 && this.f33251e == 0) {
            return false;
        }
        if (this.f33252f != null) {
            return true;
        }
        f0 f10 = f();
        if (f10 != null) {
            this.f33252f = f10;
            return true;
        }
        k.b bVar = this.f33247a;
        if ((bVar == null || !bVar.b()) && (kVar = this.f33248b) != null) {
            return kVar.b();
        }
        return true;
    }

    public final boolean g(v vVar) {
        l.f(vVar, "url");
        v l10 = this.f33254h.l();
        return vVar.n() == l10.n() && l.a(vVar.i(), l10.i());
    }

    public final void h(IOException iOException) {
        l.f(iOException, "e");
        this.f33252f = null;
        if ((iOException instanceof n) && ((n) iOException).f20460e == cn.b.REFUSED_STREAM) {
            this.f33249c++;
        } else if (iOException instanceof cn.a) {
            this.f33250d++;
        } else {
            this.f33251e++;
        }
    }
}
