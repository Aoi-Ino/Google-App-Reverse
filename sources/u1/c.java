package u1;

import androidx.work.impl.workers.ConstraintTrackingWorker;
import x5.a;

public final /* synthetic */ class c implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ ConstraintTrackingWorker f16880e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ a f16881f;

    public /* synthetic */ c(ConstraintTrackingWorker constraintTrackingWorker, a aVar) {
        this.f16880e = constraintTrackingWorker;
        this.f16881f = aVar;
    }

    public final void run() {
        ConstraintTrackingWorker.u(this.f16880e, this.f16881f);
    }
}
