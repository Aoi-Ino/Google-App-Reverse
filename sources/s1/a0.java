package s1;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.futures.c;
import java.util.UUID;
import m1.g;
import m1.h;
import m1.m;
import r1.u;
import r1.v;
import r1.x;
import t1.b;

public class a0 implements h {

    /* renamed from: d  reason: collision with root package name */
    private static final String f15814d = m.i("WMFgUpdater");

    /* renamed from: a  reason: collision with root package name */
    private final b f15815a;

    /* renamed from: b  reason: collision with root package name */
    final androidx.work.impl.foreground.a f15816b;

    /* renamed from: c  reason: collision with root package name */
    final v f15817c;

    class a implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ c f15818e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ UUID f15819f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ g f15820g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Context f15821h;

        a(c cVar, UUID uuid, g gVar, Context context) {
            this.f15818e = cVar;
            this.f15819f = uuid;
            this.f15820g = gVar;
            this.f15821h = context;
        }

        public void run() {
            try {
                if (!this.f15818e.isCancelled()) {
                    String uuid = this.f15819f.toString();
                    u m10 = a0.this.f15817c.m(uuid);
                    if (m10 == null || m10.f15478b.b()) {
                        throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                    }
                    a0.this.f15816b.a(uuid, this.f15820g);
                    this.f15821h.startService(androidx.work.impl.foreground.b.d(this.f15821h, x.a(m10), this.f15820g));
                }
                this.f15818e.p((Object) null);
            } catch (Throwable th2) {
                this.f15818e.q(th2);
            }
        }
    }

    public a0(WorkDatabase workDatabase, androidx.work.impl.foreground.a aVar, b bVar) {
        this.f15816b = aVar;
        this.f15815a = bVar;
        this.f15817c = workDatabase.H();
    }

    public x5.a a(Context context, UUID uuid, g gVar) {
        c t10 = c.t();
        this.f15815a.c(new a(t10, uuid, gVar, context));
        return t10;
    }
}
