package com.google.crypto.tink.shaded.protobuf;

abstract class j1 {
    j1() {
    }

    /* access modifiers changed from: package-private */
    public abstract void a(Object obj, int i10, int i11);

    /* access modifiers changed from: package-private */
    public abstract void b(Object obj, int i10, long j10);

    /* access modifiers changed from: package-private */
    public abstract void c(Object obj, int i10, Object obj2);

    /* access modifiers changed from: package-private */
    public abstract void d(Object obj, int i10, h hVar);

    /* access modifiers changed from: package-private */
    public abstract void e(Object obj, int i10, long j10);

    /* access modifiers changed from: package-private */
    public abstract Object f(Object obj);

    /* access modifiers changed from: package-private */
    public abstract Object g(Object obj);

    /* access modifiers changed from: package-private */
    public abstract int h(Object obj);

    /* access modifiers changed from: package-private */
    public abstract int i(Object obj);

    /* access modifiers changed from: package-private */
    public abstract void j(Object obj);

    /* access modifiers changed from: package-private */
    public abstract Object k(Object obj, Object obj2);

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP:0: B:0:0x0000->B:3:0x000d, LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void l(java.lang.Object r3, com.google.crypto.tink.shaded.protobuf.c1 r4) {
        /*
            r2 = this;
        L_0x0000:
            int r0 = r4.r()
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == r1) goto L_0x000f
            boolean r0 = r2.m(r3, r4)
            if (r0 != 0) goto L_0x0000
        L_0x000f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.j1.l(java.lang.Object, com.google.crypto.tink.shaded.protobuf.c1):void");
    }

    /* access modifiers changed from: package-private */
    public final boolean m(Object obj, c1 c1Var) {
        int e10 = c1Var.e();
        int a10 = p1.a(e10);
        int b10 = p1.b(e10);
        if (b10 == 0) {
            e(obj, a10, c1Var.I());
            return true;
        } else if (b10 == 1) {
            b(obj, a10, c1Var.h());
            return true;
        } else if (b10 == 2) {
            d(obj, a10, c1Var.w());
            return true;
        } else if (b10 == 3) {
            Object n10 = n();
            int c10 = p1.c(a10, 4);
            l(n10, c1Var);
            if (c10 == c1Var.e()) {
                c(obj, a10, r(n10));
                return true;
            }
            throw a0.a();
        } else if (b10 == 4) {
            return false;
        } else {
            if (b10 == 5) {
                a(obj, a10, c1Var.p());
                return true;
            }
            throw a0.d();
        }
    }

    /* access modifiers changed from: package-private */
    public abstract Object n();

    /* access modifiers changed from: package-private */
    public abstract void o(Object obj, Object obj2);

    /* access modifiers changed from: package-private */
    public abstract void p(Object obj, Object obj2);

    /* access modifiers changed from: package-private */
    public abstract boolean q(c1 c1Var);

    /* access modifiers changed from: package-private */
    public abstract Object r(Object obj);

    /* access modifiers changed from: package-private */
    public abstract void s(Object obj, q1 q1Var);

    /* access modifiers changed from: package-private */
    public abstract void t(Object obj, q1 q1Var);
}
