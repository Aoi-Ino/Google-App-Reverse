package qm;

import bm.p;

public abstract class d {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final h0 f30807a = new h0("CLOSED");

    public static final e b(e eVar) {
        while (true) {
            Object a10 = eVar.f();
            if (a10 == f30807a) {
                return eVar;
            }
            e eVar2 = (e) a10;
            if (eVar2 != null) {
                eVar = eVar2;
            } else if (eVar.j()) {
                return eVar;
            }
        }
    }

    public static final Object c(e0 e0Var, long j10, p pVar) {
        while (true) {
            if (e0Var.f30812g >= j10 && !e0Var.h()) {
                return f0.a(e0Var);
            }
            Object a10 = e0Var.f();
            if (a10 == f30807a) {
                return f0.a(f30807a);
            }
            e0 e0Var2 = (e0) ((e) a10);
            if (e0Var2 == null) {
                e0Var2 = (e0) pVar.h(Long.valueOf(e0Var.f30812g + 1), e0Var);
                if (e0Var.l(e0Var2)) {
                    if (e0Var.h()) {
                        e0Var.k();
                    }
                }
            }
            e0Var = e0Var2;
        }
    }
}
