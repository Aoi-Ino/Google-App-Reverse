package u1;

import androidx.work.impl.workers.ConstraintTrackingWorker;

public final /* synthetic */ class a implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ ConstraintTrackingWorker f16878e;

    public /* synthetic */ a(ConstraintTrackingWorker constraintTrackingWorker) {
        this.f16878e = constraintTrackingWorker;
    }

    public final void run() {
        ConstraintTrackingWorker.v(this.f16878e);
    }
}
