package s1;

import java.util.HashMap;
import java.util.Map;
import m1.m;
import m1.u;

public class c0 {

    /* renamed from: e  reason: collision with root package name */
    private static final String f15835e = m.i("WorkTimer");

    /* renamed from: a  reason: collision with root package name */
    final u f15836a;

    /* renamed from: b  reason: collision with root package name */
    final Map f15837b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    final Map f15838c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    final Object f15839d = new Object();

    public interface a {
        void a(r1.m mVar);
    }

    public static class b implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        private final c0 f15840e;

        /* renamed from: f  reason: collision with root package name */
        private final r1.m f15841f;

        b(c0 c0Var, r1.m mVar) {
            this.f15840e = c0Var;
            this.f15841f = mVar;
        }

        public void run() {
            synchronized (this.f15840e.f15839d) {
                try {
                    if (((b) this.f15840e.f15837b.remove(this.f15841f)) != null) {
                        a aVar = (a) this.f15840e.f15838c.remove(this.f15841f);
                        if (aVar != null) {
                            aVar.a(this.f15841f);
                        }
                    } else {
                        m.e().a("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", new Object[]{this.f15841f}));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public c0(u uVar) {
        this.f15836a = uVar;
    }

    public void a(r1.m mVar, long j10, a aVar) {
        synchronized (this.f15839d) {
            m e10 = m.e();
            String str = f15835e;
            e10.a(str, "Starting timer for " + mVar);
            b(mVar);
            b bVar = new b(this, mVar);
            this.f15837b.put(mVar, bVar);
            this.f15838c.put(mVar, aVar);
            this.f15836a.a(j10, bVar);
        }
    }

    public void b(r1.m mVar) {
        synchronized (this.f15839d) {
            try {
                if (((b) this.f15837b.remove(mVar)) != null) {
                    m e10 = m.e();
                    String str = f15835e;
                    e10.a(str, "Stopping timer for " + mVar);
                    this.f15838c.remove(mVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
