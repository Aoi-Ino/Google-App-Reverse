package k6;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import v6.a;
import v6.b;
import v6.c;
import v6.d;

class u implements d, c {

    /* renamed from: a  reason: collision with root package name */
    private final Map f13010a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private Queue f13011b = new ArrayDeque();

    /* renamed from: c  reason: collision with root package name */
    private final Executor f13012c;

    u(Executor executor) {
        this.f13012c = executor;
    }

    private synchronized Set d(a aVar) {
        throw null;
    }

    public void a(Class cls, b bVar) {
        g(cls, this.f13012c, bVar);
    }

    /* access modifiers changed from: package-private */
    public void c() {
        Queue<Object> queue;
        synchronized (this) {
            try {
                queue = this.f13011b;
                if (queue != null) {
                    this.f13011b = null;
                } else {
                    queue = null;
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        if (queue != null) {
            for (Object a10 : queue) {
                android.support.v4.media.session.b.a(a10);
                f((a) null);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0010, code lost:
        r0 = d(r5).iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001c, code lost:
        if (r0.hasNext() == false) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001e, code lost:
        r1 = (java.util.Map.Entry) r0.next();
        ((java.util.concurrent.Executor) r1.getValue()).execute(new k6.t(r1, r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0033, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void f(v6.a r5) {
        /*
            r4 = this;
            k6.c0.b(r5)
            monitor-enter(r4)
            java.util.Queue r0 = r4.f13011b     // Catch:{ all -> 0x000d }
            if (r0 == 0) goto L_0x000f
            r0.add(r5)     // Catch:{ all -> 0x000d }
            monitor-exit(r4)     // Catch:{ all -> 0x000d }
            return
        L_0x000d:
            r5 = move-exception
            goto L_0x0034
        L_0x000f:
            monitor-exit(r4)     // Catch:{ all -> 0x000d }
            java.util.Set r0 = r4.d(r5)
            java.util.Iterator r0 = r0.iterator()
        L_0x0018:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0033
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            java.util.concurrent.Executor r2 = (java.util.concurrent.Executor) r2
            k6.t r3 = new k6.t
            r3.<init>(r1, r5)
            r2.execute(r3)
            goto L_0x0018
        L_0x0033:
            return
        L_0x0034:
            monitor-exit(r4)     // Catch:{ all -> 0x000d }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: k6.u.f(v6.a):void");
    }

    public synchronized void g(Class cls, Executor executor, b bVar) {
        try {
            c0.b(cls);
            c0.b(bVar);
            c0.b(executor);
            if (!this.f13010a.containsKey(cls)) {
                this.f13010a.put(cls, new ConcurrentHashMap());
            }
            ((ConcurrentHashMap) this.f13010a.get(cls)).put(bVar, executor);
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
