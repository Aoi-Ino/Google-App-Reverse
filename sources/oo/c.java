package oo;

import java.io.Serializable;

class c implements Serializable, Cloneable {

    /* renamed from: e  reason: collision with root package name */
    private u f30227e;

    /* renamed from: f  reason: collision with root package name */
    private final int f30228f;

    /* renamed from: g  reason: collision with root package name */
    private int f30229g;

    /* renamed from: h  reason: collision with root package name */
    private int f30230h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f30231i = false;

    /* renamed from: j  reason: collision with root package name */
    private boolean f30232j = false;

    c(int i10) {
        this.f30228f = i10;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public c clone() {
        c cVar = new c(this.f30228f);
        cVar.f30227e = this.f30227e;
        cVar.f30229g = this.f30229g;
        cVar.f30230h = this.f30230h;
        cVar.f30231i = this.f30231i;
        cVar.f30232j = this.f30232j;
        return cVar;
    }

    /* access modifiers changed from: package-private */
    public int b() {
        if (!this.f30231i || this.f30232j) {
            return Integer.MAX_VALUE;
        }
        return this.f30229g;
    }

    /* access modifiers changed from: package-private */
    public int c() {
        return this.f30230h;
    }

    public u d() {
        return this.f30227e;
    }

    /* access modifiers changed from: package-private */
    public void e(int i10) {
        this.f30227e = null;
        this.f30229g = this.f30228f;
        this.f30230h = i10;
        this.f30231i = true;
        this.f30232j = false;
    }

    /* access modifiers changed from: package-private */
    public boolean f() {
        return this.f30232j;
    }

    /* access modifiers changed from: package-private */
    public boolean g() {
        return this.f30231i;
    }

    /* access modifiers changed from: package-private */
    public void h(u uVar) {
        this.f30227e = uVar;
        int a10 = uVar.a();
        this.f30229g = a10;
        if (a10 == this.f30228f) {
            this.f30232j = true;
        }
    }

    /* JADX WARNING: type inference failed for: r7v17, types: [oo.o] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void i(java.util.Stack r5, oo.k r6, byte[] r7, byte[] r8, oo.j r9) {
        /*
            r4 = this;
            if (r9 == 0) goto L_0x021e
            boolean r0 = r4.f30232j
            if (r0 != 0) goto L_0x0216
            boolean r0 = r4.f30231i
            if (r0 == 0) goto L_0x0216
            oo.j$b r0 = new oo.j$b
            r0.<init>()
            int r1 = r9.b()
            oo.o$a r0 = r0.g(r1)
            oo.j$b r0 = (oo.j.b) r0
            long r1 = r9.c()
            oo.o$a r0 = r0.h(r1)
            oo.j$b r0 = (oo.j.b) r0
            int r1 = r4.f30230h
            oo.j$b r0 = r0.p(r1)
            int r1 = r9.e()
            oo.j$b r0 = r0.n(r1)
            int r1 = r9.f()
            oo.j$b r0 = r0.o(r1)
            int r9 = r9.a()
            oo.o$a r9 = r0.f(r9)
            oo.j$b r9 = (oo.j.b) r9
            oo.o r9 = r9.l()
            oo.j r9 = (oo.j) r9
            oo.i$b r0 = new oo.i$b
            r0.<init>()
            int r1 = r9.b()
            oo.o$a r0 = r0.g(r1)
            oo.i$b r0 = (oo.i.b) r0
            long r1 = r9.c()
            oo.o$a r0 = r0.h(r1)
            oo.i$b r0 = (oo.i.b) r0
            int r1 = r4.f30230h
            oo.i$b r0 = r0.n(r1)
            oo.o r0 = r0.l()
            oo.i r0 = (oo.i) r0
            oo.g$b r1 = new oo.g$b
            r1.<init>()
            int r2 = r9.b()
            oo.o$a r1 = r1.g(r2)
            oo.g$b r1 = (oo.g.b) r1
            long r2 = r9.c()
            oo.o$a r1 = r1.h(r2)
            oo.g$b r1 = (oo.g.b) r1
            int r2 = r4.f30230h
            oo.g$b r1 = r1.n(r2)
            oo.o r1 = r1.k()
            oo.g r1 = (oo.g) r1
            byte[] r8 = r6.g(r8, r9)
            r6.h(r8, r7)
            oo.n r7 = r6.e(r9)
            oo.u r7 = oo.v.a(r6, r7, r0)
        L_0x00a2:
            boolean r8 = r5.isEmpty()
            r9 = 1
            if (r8 != 0) goto L_0x0159
            java.lang.Object r8 = r5.peek()
            oo.u r8 = (oo.u) r8
            int r8 = r8.a()
            int r0 = r7.a()
            if (r8 != r0) goto L_0x0159
            java.lang.Object r8 = r5.peek()
            oo.u r8 = (oo.u) r8
            int r8 = r8.a()
            int r0 = r4.f30228f
            if (r8 == r0) goto L_0x0159
            oo.g$b r8 = new oo.g$b
            r8.<init>()
            int r0 = r1.b()
            oo.o$a r8 = r8.g(r0)
            oo.g$b r8 = (oo.g.b) r8
            long r2 = r1.c()
            oo.o$a r8 = r8.h(r2)
            oo.g$b r8 = (oo.g.b) r8
            int r0 = r1.e()
            oo.g$b r8 = r8.m(r0)
            int r0 = r1.f()
            int r0 = r0 - r9
            int r0 = r0 / 2
            oo.g$b r8 = r8.n(r0)
            int r0 = r1.a()
            oo.o$a r8 = r8.f(r0)
            oo.g$b r8 = (oo.g.b) r8
            oo.o r8 = r8.k()
            oo.g r8 = (oo.g) r8
            java.lang.Object r0 = r5.pop()
            oo.u r0 = (oo.u) r0
            oo.u r7 = oo.v.b(r6, r0, r7, r8)
            oo.u r0 = new oo.u
            int r1 = r7.a()
            int r1 = r1 + r9
            byte[] r7 = r7.b()
            r0.<init>(r1, r7)
            oo.g$b r7 = new oo.g$b
            r7.<init>()
            int r1 = r8.b()
            oo.o$a r7 = r7.g(r1)
            oo.g$b r7 = (oo.g.b) r7
            long r1 = r8.c()
            oo.o$a r7 = r7.h(r1)
            oo.g$b r7 = (oo.g.b) r7
            int r1 = r8.e()
            int r1 = r1 + r9
            oo.g$b r7 = r7.m(r1)
            int r9 = r8.f()
            oo.g$b r7 = r7.n(r9)
            int r8 = r8.a()
            oo.o$a r7 = r7.f(r8)
            oo.g$b r7 = (oo.g.b) r7
            oo.o r7 = r7.k()
            r1 = r7
            oo.g r1 = (oo.g) r1
            r7 = r0
            goto L_0x00a2
        L_0x0159:
            oo.u r8 = r4.f30227e
            if (r8 != 0) goto L_0x0161
            r4.f30227e = r7
            goto L_0x01fd
        L_0x0161:
            int r8 = r8.a()
            int r0 = r7.a()
            if (r8 != r0) goto L_0x01fa
            oo.g$b r5 = new oo.g$b
            r5.<init>()
            int r8 = r1.b()
            oo.o$a r5 = r5.g(r8)
            oo.g$b r5 = (oo.g.b) r5
            long r2 = r1.c()
            oo.o$a r5 = r5.h(r2)
            oo.g$b r5 = (oo.g.b) r5
            int r8 = r1.e()
            oo.g$b r5 = r5.m(r8)
            int r8 = r1.f()
            int r8 = r8 - r9
            int r8 = r8 / 2
            oo.g$b r5 = r5.n(r8)
            int r8 = r1.a()
            oo.o$a r5 = r5.f(r8)
            oo.g$b r5 = (oo.g.b) r5
            oo.o r5 = r5.k()
            oo.g r5 = (oo.g) r5
            oo.u r8 = r4.f30227e
            oo.u r6 = oo.v.b(r6, r8, r7, r5)
            oo.u r7 = new oo.u
            oo.u r8 = r4.f30227e
            int r8 = r8.a()
            int r8 = r8 + r9
            byte[] r6 = r6.b()
            r7.<init>(r8, r6)
            r4.f30227e = r7
            oo.g$b r6 = new oo.g$b
            r6.<init>()
            int r8 = r5.b()
            oo.o$a r6 = r6.g(r8)
            oo.g$b r6 = (oo.g.b) r6
            long r0 = r5.c()
            oo.o$a r6 = r6.h(r0)
            oo.g$b r6 = (oo.g.b) r6
            int r8 = r5.e()
            int r8 = r8 + r9
            oo.g$b r6 = r6.m(r8)
            int r8 = r5.f()
            oo.g$b r6 = r6.n(r8)
            int r5 = r5.a()
            oo.o$a r5 = r6.f(r5)
            oo.g$b r5 = (oo.g.b) r5
            oo.o r5 = r5.k()
            oo.g r5 = (oo.g) r5
            goto L_0x01fd
        L_0x01fa:
            r5.push(r7)
        L_0x01fd:
            oo.u r5 = r4.f30227e
            int r5 = r5.a()
            int r6 = r4.f30228f
            if (r5 != r6) goto L_0x020a
            r4.f30232j = r9
            goto L_0x0215
        L_0x020a:
            int r5 = r7.a()
            r4.f30229g = r5
            int r5 = r4.f30230h
            int r5 = r5 + r9
            r4.f30230h = r5
        L_0x0215:
            return
        L_0x0216:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "finished or not initialized"
            r5.<init>(r6)
            throw r5
        L_0x021e:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r6 = "otsHashAddress == null"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: oo.c.i(java.util.Stack, oo.k, byte[], byte[], oo.j):void");
    }
}
