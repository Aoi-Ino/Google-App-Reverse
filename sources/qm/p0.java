package qm;

import cm.l;
import lm.e2;
import tl.g;

final class p0 {

    /* renamed from: a  reason: collision with root package name */
    public final g f30845a;

    /* renamed from: b  reason: collision with root package name */
    private final Object[] f30846b;

    /* renamed from: c  reason: collision with root package name */
    private final e2[] f30847c;

    /* renamed from: d  reason: collision with root package name */
    private int f30848d;

    public p0(g gVar, int i10) {
        this.f30845a = gVar;
        this.f30846b = new Object[i10];
        this.f30847c = new e2[i10];
    }

    public final void a(e2 e2Var, Object obj) {
        Object[] objArr = this.f30846b;
        int i10 = this.f30848d;
        objArr[i10] = obj;
        e2[] e2VarArr = this.f30847c;
        this.f30848d = i10 + 1;
        l.d(e2Var, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        e2VarArr[i10] = e2Var;
    }

    public final void b(g gVar) {
        int length = this.f30847c.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                e2 e2Var = this.f30847c[length];
                l.c(e2Var);
                e2Var.s(gVar, this.f30846b[length]);
                if (i10 >= 0) {
                    length = i10;
                } else {
                    return;
                }
            }
        }
    }
}
