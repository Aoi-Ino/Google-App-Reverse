package u1;

import androidx.work.impl.workers.ConstraintTrackingWorker;
import lm.k1;

public final /* synthetic */ class b implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ k1 f16879e;

    public /* synthetic */ b(k1 k1Var) {
        this.f16879e = k1Var;
    }

    public final void run() {
        ConstraintTrackingWorker.t(this.f16879e);
    }
}
