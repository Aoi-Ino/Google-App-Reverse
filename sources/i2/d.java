package i2;

import e2.j;
import h2.b;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import k2.a;

public class d {

    /* renamed from: a  reason: collision with root package name */
    private final a f12243a;

    /* renamed from: b  reason: collision with root package name */
    private long f12244b;

    /* renamed from: c  reason: collision with root package name */
    private long f12245c;

    /* renamed from: d  reason: collision with root package name */
    private InputStream f12246d;

    /* renamed from: e  reason: collision with root package name */
    private j2.a f12247e;

    /* renamed from: f  reason: collision with root package name */
    private b f12248f;

    /* renamed from: g  reason: collision with root package name */
    private long f12249g;

    /* renamed from: h  reason: collision with root package name */
    private int f12250h;

    /* renamed from: i  reason: collision with root package name */
    private String f12251i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f12252j;

    /* renamed from: k  reason: collision with root package name */
    private String f12253k;

    private d(a aVar) {
        this.f12243a = aVar;
    }

    private boolean a(g2.d dVar) {
        if (this.f12250h != 416 && !h(dVar)) {
            return false;
        }
        if (dVar != null) {
            j();
        }
        f();
        this.f12243a.A(0);
        this.f12243a.E(0);
        b c10 = a.d().c();
        this.f12248f = c10;
        c10.s(this.f12243a);
        b c11 = l2.a.c(this.f12248f, this.f12243a);
        this.f12248f = c11;
        this.f12250h = c11.B();
        return true;
    }

    private void b(j2.a aVar) {
        b bVar = this.f12248f;
        if (bVar != null) {
            try {
                bVar.close();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        InputStream inputStream = this.f12246d;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e11) {
                e11.printStackTrace();
            }
        }
        if (aVar != null) {
            try {
                n(aVar);
            } catch (Exception e12) {
                e12.printStackTrace();
            } catch (Throwable th2) {
                try {
                    aVar.close();
                } catch (IOException e13) {
                    e13.printStackTrace();
                }
                throw th2;
            }
        }
        if (aVar != null) {
            try {
                aVar.close();
            } catch (IOException e14) {
                e14.printStackTrace();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0028 A[SYNTHETIC, Splitter:B:17:0x0028] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x002e A[SYNTHETIC, Splitter:B:23:0x002e] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String c(java.io.InputStream r5) {
        /*
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            if (r5 == 0) goto L_0x0031
            r1 = 0
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ IOException -> 0x002c, all -> 0x0025 }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x002c, all -> 0x0025 }
            r3.<init>(r5)     // Catch:{ IOException -> 0x002c, all -> 0x0025 }
            r2.<init>(r3)     // Catch:{ IOException -> 0x002c, all -> 0x0025 }
        L_0x0012:
            java.lang.String r5 = r2.readLine()     // Catch:{ IOException -> 0x001f, all -> 0x001c }
            if (r5 == 0) goto L_0x0021
            r0.append(r5)     // Catch:{ IOException -> 0x001f, all -> 0x001c }
            goto L_0x0012
        L_0x001c:
            r5 = move-exception
            r1 = r2
            goto L_0x0026
        L_0x001f:
            r1 = r2
            goto L_0x002c
        L_0x0021:
            r2.close()     // Catch:{ IOException | NullPointerException -> 0x0031 }
            goto L_0x0031
        L_0x0025:
            r5 = move-exception
        L_0x0026:
            if (r1 == 0) goto L_0x002b
            r1.close()     // Catch:{ IOException | NullPointerException -> 0x002b }
        L_0x002b:
            throw r5
        L_0x002c:
            if (r1 == 0) goto L_0x0031
            r1.close()     // Catch:{ IOException | NullPointerException -> 0x0031 }
        L_0x0031:
            java.lang.String r5 = r0.toString()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.d.c(java.io.InputStream):java.lang.String");
    }

    static d d(a aVar) {
        return new d(aVar);
    }

    private void e() {
        g2.d dVar = new g2.d();
        dVar.m(this.f12243a.n());
        dVar.p(this.f12243a.y());
        dVar.k(this.f12251i);
        dVar.i(this.f12243a.m());
        dVar.l(this.f12243a.p());
        dVar.j(this.f12243a.o());
        dVar.o(this.f12249g);
        dVar.n(System.currentTimeMillis());
        a.d().b().a(dVar);
    }

    private void f() {
        File file = new File(this.f12253k);
        if (file.exists()) {
            file.delete();
        }
    }

    private g2.d g() {
        return a.d().b().c(this.f12243a.n());
    }

    private boolean h(g2.d dVar) {
        return (this.f12251i == null || dVar == null || dVar.c() == null || dVar.c().equals(this.f12251i)) ? false : true;
    }

    private boolean i() {
        int i10 = this.f12250h;
        return i10 >= 200 && i10 < 300;
    }

    private void j() {
        a.d().b().remove(this.f12243a.n());
    }

    private void l() {
        this.f12243a.w();
        j jVar = j.QUEUED;
    }

    private void m() {
        this.f12252j = this.f12250h == 206;
    }

    private void n(j2.a aVar) {
        try {
            aVar.b();
            if (this.f12252j) {
                a.d().b().b(this.f12243a.n(), this.f12243a.o(), System.currentTimeMillis());
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        }
    }

    private void o(j2.a aVar) {
        long o10 = this.f12243a.o();
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = currentTimeMillis - this.f12244b;
        if (o10 - this.f12245c > 65536 && j10 > 2000) {
            n(aVar);
            this.f12245c = o10;
            this.f12244b = currentTimeMillis;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0205 A[Catch:{ all -> 0x0062 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public e2.i k() {
        /*
            r12 = this;
            e2.i r0 = new e2.i
            r0.<init>()
            k2.a r1 = r12.f12243a
            e2.j r1 = r1.w()
            e2.j r2 = e2.j.CANCELLED
            r3 = 1
            if (r1 != r2) goto L_0x0014
            r0.e(r3)
            return r0
        L_0x0014:
            k2.a r1 = r12.f12243a
            e2.j r1 = r1.w()
            e2.j r4 = e2.j.PAUSED
            if (r1 != r4) goto L_0x0022
            r0.g(r3)
            return r0
        L_0x0022:
            k2.a r1 = r12.f12243a     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            r1.r()     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            k2.a r1 = r12.f12243a     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            java.lang.String r1 = r1.m()     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            k2.a r5 = r12.f12243a     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            java.lang.String r5 = r5.p()     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            java.lang.String r1 = l2.a.d(r1, r5)     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            r12.f12253k = r1     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            java.io.File r1 = new java.io.File     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            java.lang.String r5 = r12.f12253k     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            r1.<init>(r5)     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            g2.d r5 = r12.g()     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            r6 = 0
            r7 = 0
            if (r5 == 0) goto L_0x0079
            boolean r9 = r1.exists()     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            if (r9 == 0) goto L_0x006b
            k2.a r9 = r12.f12243a     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            long r10 = r5.g()     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            r9.E(r10)     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            k2.a r9 = r12.f12243a     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            long r10 = r5.b()     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            r9.A(r10)     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            goto L_0x0079
        L_0x0062:
            r0 = move-exception
            goto L_0x0218
        L_0x0065:
            r1 = move-exception
            goto L_0x0201
        L_0x0068:
            r1 = move-exception
            goto L_0x0201
        L_0x006b:
            r12.j()     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            k2.a r5 = r12.f12243a     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            r5.A(r7)     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            k2.a r5 = r12.f12243a     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            r5.E(r7)     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            r5 = r6
        L_0x0079:
            i2.a r9 = i2.a.d()     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            h2.b r9 = r9.c()     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            r12.f12248f = r9     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            k2.a r10 = r12.f12243a     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            r9.s(r10)     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            k2.a r9 = r12.f12243a     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            e2.j r9 = r9.w()     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            if (r9 != r2) goto L_0x0099
        L_0x0090:
            r0.e(r3)     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
        L_0x0093:
            j2.a r1 = r12.f12247e
            r12.b(r1)
            return r0
        L_0x0099:
            k2.a r9 = r12.f12243a     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            e2.j r9 = r9.w()     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            if (r9 != r4) goto L_0x00a5
        L_0x00a1:
            r0.g(r3)     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            goto L_0x0093
        L_0x00a5:
            h2.b r9 = r12.f12248f     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            k2.a r10 = r12.f12243a     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            h2.b r9 = l2.a.c(r9, r10)     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            r12.f12248f = r9     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            int r9 = r9.B()     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            r12.f12250h = r9     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            h2.b r9 = r12.f12248f     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            java.lang.String r10 = "ETag"
            java.lang.String r9 = r9.E(r10)     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            r12.f12251i = r9     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            boolean r9 = r12.a(r5)     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            if (r9 == 0) goto L_0x00c6
            goto L_0x00c7
        L_0x00c6:
            r6 = r5
        L_0x00c7:
            boolean r5 = r12.i()     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            if (r5 != 0) goto L_0x00f4
            e2.a r1 = new e2.a     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            r1.<init>()     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            r1.e(r3)     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            h2.b r2 = r12.f12248f     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            java.io.InputStream r2 = r2.l()     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            java.lang.String r2 = r12.c(r2)     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            r1.f(r2)     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            h2.b r2 = r12.f12248f     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            java.util.Map r2 = r2.i0()     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            r1.c(r2)     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            int r2 = r12.f12250h     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            r1.d(r2)     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            r0.f(r1)     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            goto L_0x0093
        L_0x00f4:
            r12.m()     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            k2.a r5 = r12.f12243a     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            long r9 = r5.x()     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            r12.f12249g = r9     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            boolean r5 = r12.f12252j     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            if (r5 != 0) goto L_0x0106
            r12.f()     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
        L_0x0106:
            long r9 = r12.f12249g     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            int r5 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r5 != 0) goto L_0x0119
            h2.b r5 = r12.f12248f     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            long r9 = r5.j0()     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            r12.f12249g = r9     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            k2.a r5 = r12.f12243a     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            r5.E(r9)     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
        L_0x0119:
            boolean r5 = r12.f12252j     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            if (r5 == 0) goto L_0x0122
            if (r6 != 0) goto L_0x0122
            r12.e()     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
        L_0x0122:
            k2.a r5 = r12.f12243a     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            e2.j r5 = r5.w()     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            if (r5 != r2) goto L_0x012c
            goto L_0x0090
        L_0x012c:
            k2.a r5 = r12.f12243a     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            e2.j r5 = r5.w()     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            if (r5 != r4) goto L_0x0136
            goto L_0x00a1
        L_0x0136:
            k2.a r5 = r12.f12243a     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            r5.g()     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            h2.b r5 = r12.f12248f     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            java.io.InputStream r5 = r5.o()     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            r12.f12246d = r5     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            r5 = 4096(0x1000, float:5.74E-42)
            byte[] r6 = new byte[r5]     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            boolean r9 = r1.exists()     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            if (r9 != 0) goto L_0x016a
            java.io.File r9 = r1.getParentFile()     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            if (r9 == 0) goto L_0x0167
            java.io.File r9 = r1.getParentFile()     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            boolean r9 = r9.exists()     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            if (r9 != 0) goto L_0x0167
            java.io.File r9 = r1.getParentFile()     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            boolean r9 = r9.mkdirs()     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            if (r9 == 0) goto L_0x016a
        L_0x0167:
            r1.createNewFile()     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
        L_0x016a:
            j2.a r1 = j2.b.d(r1)     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            r12.f12247e = r1     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            boolean r1 = r12.f12252j     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            if (r1 == 0) goto L_0x0189
            k2.a r1 = r12.f12243a     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            long r9 = r1.o()     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r1 == 0) goto L_0x0189
            j2.a r1 = r12.f12247e     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            k2.a r7 = r12.f12243a     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            long r7 = r7.o()     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            r1.c(r7)     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
        L_0x0189:
            k2.a r1 = r12.f12243a     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            e2.j r1 = r1.w()     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            if (r1 != r2) goto L_0x0193
            goto L_0x0090
        L_0x0193:
            k2.a r1 = r12.f12243a     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            e2.j r1 = r1.w()     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            if (r1 != r4) goto L_0x019d
            goto L_0x00a1
        L_0x019d:
            java.io.InputStream r1 = r12.f12246d     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            r2 = 0
            int r1 = r1.read(r6, r2, r5)     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            r4 = -1
            if (r1 != r4) goto L_0x01cc
            k2.a r1 = r12.f12243a     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            java.lang.String r1 = r1.m()     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            k2.a r2 = r12.f12243a     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            java.lang.String r2 = r2.p()     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            java.lang.String r1 = l2.a.b(r1, r2)     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            java.lang.String r2 = r12.f12253k     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            l2.a.g(r2, r1)     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            r0.h(r3)     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            boolean r1 = r12.f12252j     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            if (r1 == 0) goto L_0x01c6
            r12.j()     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
        L_0x01c6:
            j2.a r1 = r12.f12247e
            r12.b(r1)
            goto L_0x0217
        L_0x01cc:
            j2.a r4 = r12.f12247e     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            r4.a(r6, r2, r1)     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            k2.a r2 = r12.f12243a     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            long r7 = r2.o()     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            long r9 = (long) r1     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            long r7 = r7 + r9
            r2.A(r7)     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            r12.l()     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            j2.a r1 = r12.f12247e     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            r12.o(r1)     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            k2.a r1 = r12.f12243a     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            e2.j r1 = r1.w()     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            e2.j r2 = e2.j.CANCELLED     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            if (r1 != r2) goto L_0x01f0
            goto L_0x0090
        L_0x01f0:
            k2.a r1 = r12.f12243a     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            e2.j r1 = r1.w()     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            e2.j r2 = e2.j.PAUSED     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            if (r1 != r2) goto L_0x019d
            j2.a r1 = r12.f12247e     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            r12.n(r1)     // Catch:{ IOException -> 0x0068, IllegalAccessException -> 0x0065 }
            goto L_0x00a1
        L_0x0201:
            boolean r2 = r12.f12252j     // Catch:{ all -> 0x0062 }
            if (r2 != 0) goto L_0x0208
            r12.f()     // Catch:{ all -> 0x0062 }
        L_0x0208:
            e2.a r2 = new e2.a     // Catch:{ all -> 0x0062 }
            r2.<init>()     // Catch:{ all -> 0x0062 }
            r2.a(r3)     // Catch:{ all -> 0x0062 }
            r2.b(r1)     // Catch:{ all -> 0x0062 }
            r0.f(r2)     // Catch:{ all -> 0x0062 }
            goto L_0x01c6
        L_0x0217:
            return r0
        L_0x0218:
            j2.a r1 = r12.f12247e
            r12.b(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.d.k():e2.i");
    }
}
