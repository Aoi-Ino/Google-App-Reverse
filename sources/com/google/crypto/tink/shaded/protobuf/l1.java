package com.google.crypto.tink.shaded.protobuf;

class l1 extends j1 {
    l1() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public k1 g(Object obj) {
        return ((x) obj).unknownFields;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public int h(k1 k1Var) {
        return k1Var.f();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public int i(k1 k1Var) {
        return k1Var.g();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public k1 k(k1 k1Var, k1 k1Var2) {
        return k1Var2.equals(k1.e()) ? k1Var : k1.k(k1Var, k1Var2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public k1 n() {
        return k1.l();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public void o(Object obj, k1 k1Var) {
        p(obj, k1Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public void p(Object obj, k1 k1Var) {
        ((x) obj).unknownFields = k1Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public k1 r(k1 k1Var) {
        k1Var.j();
        return k1Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public void s(k1 k1Var, q1 q1Var) {
        k1Var.o(q1Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public void t(k1 k1Var, q1 q1Var) {
        k1Var.q(q1Var);
    }

    /* access modifiers changed from: package-private */
    public void j(Object obj) {
        g(obj).j();
    }

    /* access modifiers changed from: package-private */
    public boolean q(c1 c1Var) {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void a(k1 k1Var, int i10, int i11) {
        k1Var.n(p1.c(i10, 5), Integer.valueOf(i11));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void b(k1 k1Var, int i10, long j10) {
        k1Var.n(p1.c(i10, 1), Long.valueOf(j10));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void c(k1 k1Var, int i10, k1 k1Var2) {
        k1Var.n(p1.c(i10, 3), k1Var2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void d(k1 k1Var, int i10, h hVar) {
        k1Var.n(p1.c(i10, 2), hVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public void e(k1 k1Var, int i10, long j10) {
        k1Var.n(p1.c(i10, 0), Long.valueOf(j10));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public k1 f(Object obj) {
        k1 A = g(obj);
        if (A != k1.e()) {
            return A;
        }
        k1 l10 = k1.l();
        p(obj, l10);
        return l10;
    }
}
