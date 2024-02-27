package s1;

import androidx.work.impl.a0;
import cm.l;
import m1.m;

public final class u implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    private final androidx.work.impl.u f15859e;

    /* renamed from: f  reason: collision with root package name */
    private final a0 f15860f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f15861g;

    /* renamed from: h  reason: collision with root package name */
    private final int f15862h;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public u(androidx.work.impl.u uVar, a0 a0Var, boolean z10) {
        this(uVar, a0Var, z10, -512);
        l.f(uVar, "processor");
        l.f(a0Var, "token");
    }

    public void run() {
        boolean v10 = this.f15861g ? this.f15859e.v(this.f15860f, this.f15862h) : this.f15859e.w(this.f15860f, this.f15862h);
        m e10 = m.e();
        String i10 = m.i("StopWorkRunnable");
        e10.a(i10, "StopWorkRunnable for " + this.f15860f.a().b() + "; Processor.stopWork = " + v10);
    }

    public u(androidx.work.impl.u uVar, a0 a0Var, boolean z10, int i10) {
        l.f(uVar, "processor");
        l.f(a0Var, "token");
        this.f15859e = uVar;
        this.f15860f = a0Var;
        this.f15861g = z10;
        this.f15862h = i10;
    }
}
