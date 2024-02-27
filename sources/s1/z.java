package s1;

import android.content.Context;
import android.os.Build;
import androidx.work.impl.utils.futures.c;
import m1.g;
import m1.h;
import m1.m;
import r1.u;
import t1.b;

public class z implements Runnable {

    /* renamed from: k  reason: collision with root package name */
    static final String f15868k = m.i("WorkForegroundRunnable");

    /* renamed from: e  reason: collision with root package name */
    final c f15869e = c.t();

    /* renamed from: f  reason: collision with root package name */
    final Context f15870f;

    /* renamed from: g  reason: collision with root package name */
    final u f15871g;

    /* renamed from: h  reason: collision with root package name */
    final androidx.work.c f15872h;

    /* renamed from: i  reason: collision with root package name */
    final h f15873i;

    /* renamed from: j  reason: collision with root package name */
    final b f15874j;

    class a implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ c f15875e;

        a(c cVar) {
            this.f15875e = cVar;
        }

        public void run() {
            if (!z.this.f15869e.isCancelled()) {
                try {
                    g gVar = (g) this.f15875e.get();
                    if (gVar != null) {
                        m e10 = m.e();
                        String str = z.f15868k;
                        e10.a(str, "Updating notification for " + z.this.f15871g.f15479c);
                        z zVar = z.this;
                        zVar.f15869e.r(zVar.f15873i.a(zVar.f15870f, zVar.f15872h.e(), gVar));
                        return;
                    }
                    throw new IllegalStateException("Worker was marked important (" + z.this.f15871g.f15479c + ") but did not provide ForegroundInfo");
                } catch (Throwable th2) {
                    z.this.f15869e.q(th2);
                }
            }
        }
    }

    public z(Context context, u uVar, androidx.work.c cVar, h hVar, b bVar) {
        this.f15870f = context;
        this.f15871g = uVar;
        this.f15872h = cVar;
        this.f15873i = hVar;
        this.f15874j = bVar;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(c cVar) {
        if (!this.f15869e.isCancelled()) {
            cVar.r(this.f15872h.d());
        } else {
            cVar.cancel(true);
        }
    }

    public x5.a b() {
        return this.f15869e;
    }

    public void run() {
        if (!this.f15871g.f15493q || Build.VERSION.SDK_INT >= 31) {
            this.f15869e.p((Object) null);
            return;
        }
        c t10 = c.t();
        this.f15874j.a().execute(new y(this, t10));
        t10.a(new a(t10), this.f15874j.a());
    }
}
