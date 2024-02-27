package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.c;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.p0;
import cm.l;
import java.util.List;
import java.util.concurrent.TimeUnit;
import m1.m;
import r1.j;
import r1.o;
import r1.v;
import r1.z;
import u1.e;

public final class DiagnosticsWorker extends Worker {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        l.f(context, "context");
        l.f(workerParameters, "parameters");
    }

    public c.a p() {
        p0 i10 = p0.i(a());
        l.e(i10, "getInstance(applicationContext)");
        WorkDatabase n10 = i10.n();
        l.e(n10, "workManager.workDatabase");
        v H = n10.H();
        o F = n10.F();
        z I = n10.I();
        j E = n10.E();
        List j10 = H.j(i10.g().a().a() - TimeUnit.DAYS.toMillis(1));
        List c10 = H.c();
        List x10 = H.x(200);
        if (!j10.isEmpty()) {
            m.e().f(e.f16883a, "Recently completed work:\n\n");
            m.e().f(e.f16883a, e.d(F, I, E, j10));
        }
        if (!c10.isEmpty()) {
            m.e().f(e.f16883a, "Running work:\n\n");
            m.e().f(e.f16883a, e.d(F, I, E, c10));
        }
        if (!x10.isEmpty()) {
            m.e().f(e.f16883a, "Enqueued work:\n\n");
            m.e().f(e.f16883a, e.d(F, I, E, x10));
        }
        c.a c11 = c.a.c();
        l.e(c11, "success()");
        return c11;
    }
}
