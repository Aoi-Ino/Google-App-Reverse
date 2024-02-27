package androidx.work;

import android.content.Context;
import androidx.work.c;
import androidx.work.impl.utils.futures.c;
import m1.g;

public abstract class Worker extends c {

    /* renamed from: i  reason: collision with root package name */
    c f4054i;

    class a implements Runnable {
        a() {
        }

        public void run() {
            try {
                Worker.this.f4054i.p(Worker.this.p());
            } catch (Throwable th2) {
                Worker.this.f4054i.q(th2);
            }
        }
    }

    class b implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ c f4056e;

        b(c cVar) {
            this.f4056e = cVar;
        }

        public void run() {
            try {
                this.f4056e.p(Worker.this.q());
            } catch (Throwable th2) {
                this.f4056e.q(th2);
            }
        }
    }

    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public x5.a d() {
        c t10 = c.t();
        c().execute(new b(t10));
        return t10;
    }

    public final x5.a n() {
        this.f4054i = c.t();
        c().execute(new a());
        return this.f4054i;
    }

    public abstract c.a p();

    public g q() {
        throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for \n `getForegroundInfo()`");
    }
}
