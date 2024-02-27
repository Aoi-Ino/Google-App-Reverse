package androidx.work.impl;

import androidx.work.WorkerParameters;
import cm.l;
import s1.t;
import s1.u;
import t1.b;

public final class o0 implements n0 {

    /* renamed from: a  reason: collision with root package name */
    private final u f4254a;

    /* renamed from: b  reason: collision with root package name */
    private final b f4255b;

    public o0(u uVar, b bVar) {
        l.f(uVar, "processor");
        l.f(bVar, "workTaskExecutor");
        this.f4254a = uVar;
        this.f4255b = bVar;
    }

    public void a(a0 a0Var, WorkerParameters.a aVar) {
        l.f(a0Var, "workSpecId");
        this.f4255b.c(new t(this.f4254a, a0Var, aVar));
    }

    public void c(a0 a0Var, int i10) {
        l.f(a0Var, "workSpecId");
        this.f4255b.c(new u(this.f4254a, a0Var, false, i10));
    }
}
