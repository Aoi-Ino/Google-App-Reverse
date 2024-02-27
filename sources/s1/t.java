package s1;

import androidx.work.WorkerParameters;
import androidx.work.impl.a0;
import androidx.work.impl.u;
import cm.l;

public final class t implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    private final u f15856e;

    /* renamed from: f  reason: collision with root package name */
    private final a0 f15857f;

    /* renamed from: g  reason: collision with root package name */
    private final WorkerParameters.a f15858g;

    public t(u uVar, a0 a0Var, WorkerParameters.a aVar) {
        l.f(uVar, "processor");
        l.f(a0Var, "startStopToken");
        this.f15856e = uVar;
        this.f15857f = a0Var;
        this.f15858g = aVar;
    }

    public void run() {
        this.f15856e.s(this.f15857f, this.f15858g);
    }
}
