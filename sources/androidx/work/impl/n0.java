package androidx.work.impl;

import androidx.work.WorkerParameters;
import cm.l;

public interface n0 {
    void a(a0 a0Var, WorkerParameters.a aVar);

    void b(a0 a0Var) {
        l.f(a0Var, "workSpecId");
        a(a0Var, (WorkerParameters.a) null);
    }

    void c(a0 a0Var, int i10);

    void d(a0 a0Var, int i10) {
        l.f(a0Var, "workSpecId");
        c(a0Var, i10);
    }

    void e(a0 a0Var) {
        l.f(a0Var, "workSpecId");
        c(a0Var, -512);
    }
}
