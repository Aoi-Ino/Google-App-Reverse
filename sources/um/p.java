package um;

import cm.l;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import pl.x;
import vm.b;
import zm.e;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    private int f32105a = 64;

    /* renamed from: b  reason: collision with root package name */
    private int f32106b = 5;

    /* renamed from: c  reason: collision with root package name */
    private Runnable f32107c;

    /* renamed from: d  reason: collision with root package name */
    private ExecutorService f32108d;

    /* renamed from: e  reason: collision with root package name */
    private final ArrayDeque f32109e = new ArrayDeque();

    /* renamed from: f  reason: collision with root package name */
    private final ArrayDeque f32110f = new ArrayDeque();

    /* renamed from: g  reason: collision with root package name */
    private final ArrayDeque f32111g = new ArrayDeque();

    private final e.a e(String str) {
        Iterator it = this.f32110f.iterator();
        while (it.hasNext()) {
            e.a aVar = (e.a) it.next();
            if (l.a(aVar.d(), str)) {
                return aVar;
            }
        }
        Iterator it2 = this.f32109e.iterator();
        while (it2.hasNext()) {
            e.a aVar2 = (e.a) it2.next();
            if (l.a(aVar2.d(), str)) {
                return aVar2;
            }
        }
        return null;
    }

    private final void f(Deque deque, Object obj) {
        Runnable runnable;
        synchronized (this) {
            if (deque.remove(obj)) {
                runnable = this.f32107c;
                x xVar = x.f30437a;
            } else {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        if (!i() && runnable != null) {
            runnable.run();
        }
    }

    private final boolean i() {
        int i10;
        boolean z10;
        if (!b.f32404h || !Thread.holdsLock(this)) {
            ArrayList arrayList = new ArrayList();
            synchronized (this) {
                try {
                    Iterator it = this.f32109e.iterator();
                    l.e(it, "readyAsyncCalls.iterator()");
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        e.a aVar = (e.a) it.next();
                        if (this.f32110f.size() >= this.f32105a) {
                            break;
                        } else if (aVar.c().get() < this.f32106b) {
                            it.remove();
                            aVar.c().incrementAndGet();
                            l.e(aVar, "asyncCall");
                            arrayList.add(aVar);
                            this.f32110f.add(aVar);
                        }
                    }
                    z10 = j() > 0;
                    x xVar = x.f30437a;
                } finally {
                }
            }
            int size = arrayList.size();
            for (i10 = 0; i10 < size; i10++) {
                ((e.a) arrayList.get(i10)).a(d());
            }
            return z10;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Thread ");
        Thread currentThread = Thread.currentThread();
        l.e(currentThread, "Thread.currentThread()");
        sb2.append(currentThread.getName());
        sb2.append(" MUST NOT hold lock on ");
        sb2.append(this);
        throw new AssertionError(sb2.toString());
    }

    public final synchronized void a() {
        try {
            Iterator it = this.f32109e.iterator();
            while (it.hasNext()) {
                ((e.a) it.next()).b().cancel();
            }
            Iterator it2 = this.f32110f.iterator();
            while (it2.hasNext()) {
                ((e.a) it2.next()).b().cancel();
            }
            Iterator it3 = this.f32111g.iterator();
            while (it3.hasNext()) {
                ((e) it3.next()).cancel();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void b(e.a aVar) {
        e.a e10;
        l.f(aVar, "call");
        synchronized (this) {
            try {
                this.f32109e.add(aVar);
                if (!aVar.b().p() && (e10 = e(aVar.d())) != null) {
                    aVar.e(e10);
                }
                x xVar = x.f30437a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        i();
    }

    public final synchronized void c(e eVar) {
        l.f(eVar, "call");
        this.f32111g.add(eVar);
    }

    public final synchronized ExecutorService d() {
        ExecutorService executorService;
        try {
            if (this.f32108d == null) {
                TimeUnit timeUnit = TimeUnit.SECONDS;
                SynchronousQueue synchronousQueue = new SynchronousQueue();
                this.f32108d = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, timeUnit, synchronousQueue, b.J(b.f32405i + " Dispatcher", false));
            }
            executorService = this.f32108d;
            l.c(executorService);
        } catch (Throwable th2) {
            throw th2;
        }
        return executorService;
    }

    public final void g(e.a aVar) {
        l.f(aVar, "call");
        aVar.c().decrementAndGet();
        f(this.f32110f, aVar);
    }

    public final void h(e eVar) {
        l.f(eVar, "call");
        f(this.f32111g, eVar);
    }

    public final synchronized int j() {
        return this.f32110f.size() + this.f32111g.size();
    }
}
