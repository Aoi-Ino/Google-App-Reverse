package androidx.work.impl.utils.futures;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class a implements x5.a {

    /* renamed from: h  reason: collision with root package name */
    static final boolean f4337h = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: i  reason: collision with root package name */
    private static final Logger f4338i;

    /* renamed from: j  reason: collision with root package name */
    static final b f4339j;

    /* renamed from: k  reason: collision with root package name */
    private static final Object f4340k = new Object();

    /* renamed from: e  reason: collision with root package name */
    volatile Object f4341e;

    /* renamed from: f  reason: collision with root package name */
    volatile e f4342f;

    /* renamed from: g  reason: collision with root package name */
    volatile i f4343g;

    private static abstract class b {
        private b() {
        }

        /* access modifiers changed from: package-private */
        public abstract boolean a(a aVar, e eVar, e eVar2);

        /* access modifiers changed from: package-private */
        public abstract boolean b(a aVar, Object obj, Object obj2);

        /* access modifiers changed from: package-private */
        public abstract boolean c(a aVar, i iVar, i iVar2);

        /* access modifiers changed from: package-private */
        public abstract void d(i iVar, i iVar2);

        /* access modifiers changed from: package-private */
        public abstract void e(i iVar, Thread thread);
    }

    private static final class c {

        /* renamed from: c  reason: collision with root package name */
        static final c f4344c;

        /* renamed from: d  reason: collision with root package name */
        static final c f4345d;

        /* renamed from: a  reason: collision with root package name */
        final boolean f4346a;

        /* renamed from: b  reason: collision with root package name */
        final Throwable f4347b;

        static {
            if (a.f4337h) {
                f4345d = null;
                f4344c = null;
                return;
            }
            f4345d = new c(false, (Throwable) null);
            f4344c = new c(true, (Throwable) null);
        }

        c(boolean z10, Throwable th2) {
            this.f4346a = z10;
            this.f4347b = th2;
        }
    }

    private static final class d {

        /* renamed from: b  reason: collision with root package name */
        static final d f4348b = new d(new C0076a("Failure occurred while trying to finish a future."));

        /* renamed from: a  reason: collision with root package name */
        final Throwable f4349a;

        /* renamed from: androidx.work.impl.utils.futures.a$d$a  reason: collision with other inner class name */
        class C0076a extends Throwable {
            C0076a(String str) {
                super(str);
            }

            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        d(Throwable th2) {
            this.f4349a = (Throwable) a.e(th2);
        }
    }

    private static final class e {

        /* renamed from: d  reason: collision with root package name */
        static final e f4350d = new e((Runnable) null, (Executor) null);

        /* renamed from: a  reason: collision with root package name */
        final Runnable f4351a;

        /* renamed from: b  reason: collision with root package name */
        final Executor f4352b;

        /* renamed from: c  reason: collision with root package name */
        e f4353c;

        e(Runnable runnable, Executor executor) {
            this.f4351a = runnable;
            this.f4352b = executor;
        }
    }

    private static final class f extends b {

        /* renamed from: a  reason: collision with root package name */
        final AtomicReferenceFieldUpdater f4354a;

        /* renamed from: b  reason: collision with root package name */
        final AtomicReferenceFieldUpdater f4355b;

        /* renamed from: c  reason: collision with root package name */
        final AtomicReferenceFieldUpdater f4356c;

        /* renamed from: d  reason: collision with root package name */
        final AtomicReferenceFieldUpdater f4357d;

        /* renamed from: e  reason: collision with root package name */
        final AtomicReferenceFieldUpdater f4358e;

        f(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            super();
            this.f4354a = atomicReferenceFieldUpdater;
            this.f4355b = atomicReferenceFieldUpdater2;
            this.f4356c = atomicReferenceFieldUpdater3;
            this.f4357d = atomicReferenceFieldUpdater4;
            this.f4358e = atomicReferenceFieldUpdater5;
        }

        /* access modifiers changed from: package-private */
        public boolean a(a aVar, e eVar, e eVar2) {
            return androidx.concurrent.futures.b.a(this.f4357d, aVar, eVar, eVar2);
        }

        /* access modifiers changed from: package-private */
        public boolean b(a aVar, Object obj, Object obj2) {
            return androidx.concurrent.futures.b.a(this.f4358e, aVar, obj, obj2);
        }

        /* access modifiers changed from: package-private */
        public boolean c(a aVar, i iVar, i iVar2) {
            return androidx.concurrent.futures.b.a(this.f4356c, aVar, iVar, iVar2);
        }

        /* access modifiers changed from: package-private */
        public void d(i iVar, i iVar2) {
            this.f4355b.lazySet(iVar, iVar2);
        }

        /* access modifiers changed from: package-private */
        public void e(i iVar, Thread thread) {
            this.f4354a.lazySet(iVar, thread);
        }
    }

    private static final class g implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        final a f4359e;

        /* renamed from: f  reason: collision with root package name */
        final x5.a f4360f;

        g(a aVar, x5.a aVar2) {
            this.f4359e = aVar;
            this.f4360f = aVar2;
        }

        public void run() {
            if (this.f4359e.f4341e == this) {
                if (a.f4339j.b(this.f4359e, this, a.j(this.f4360f))) {
                    a.g(this.f4359e);
                }
            }
        }
    }

    private static final class h extends b {
        h() {
            super();
        }

        /* access modifiers changed from: package-private */
        public boolean a(a aVar, e eVar, e eVar2) {
            synchronized (aVar) {
                try {
                    if (aVar.f4342f != eVar) {
                        return false;
                    }
                    aVar.f4342f = eVar2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public boolean b(a aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                try {
                    if (aVar.f4341e != obj) {
                        return false;
                    }
                    aVar.f4341e = obj2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public boolean c(a aVar, i iVar, i iVar2) {
            synchronized (aVar) {
                try {
                    if (aVar.f4343g != iVar) {
                        return false;
                    }
                    aVar.f4343g = iVar2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void d(i iVar, i iVar2) {
            iVar.f4363b = iVar2;
        }

        /* access modifiers changed from: package-private */
        public void e(i iVar, Thread thread) {
            iVar.f4362a = thread;
        }
    }

    private static final class i {

        /* renamed from: c  reason: collision with root package name */
        static final i f4361c = new i(false);

        /* renamed from: a  reason: collision with root package name */
        volatile Thread f4362a;

        /* renamed from: b  reason: collision with root package name */
        volatile i f4363b;

        i() {
            a.f4339j.e(this, Thread.currentThread());
        }

        i(boolean z10) {
        }

        /* access modifiers changed from: package-private */
        public void a(i iVar) {
            a.f4339j.d(this, iVar);
        }

        /* access modifiers changed from: package-private */
        public void b() {
            Thread thread = this.f4362a;
            if (thread != null) {
                this.f4362a = null;
                LockSupport.unpark(thread);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: androidx.work.impl.utils.futures.a$f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: androidx.work.impl.utils.futures.a$h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: androidx.work.impl.utils.futures.a$f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: androidx.work.impl.utils.futures.a$f} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.Class<androidx.work.impl.utils.futures.a$i> r0 = androidx.work.impl.utils.futures.a.i.class
            java.lang.String r1 = "guava.concurrent.generate_cancellation_cause"
            java.lang.String r2 = "false"
            java.lang.String r1 = java.lang.System.getProperty(r1, r2)
            boolean r1 = java.lang.Boolean.parseBoolean(r1)
            f4337h = r1
            java.lang.Class<androidx.work.impl.utils.futures.a> r1 = androidx.work.impl.utils.futures.a.class
            java.lang.String r2 = r1.getName()
            java.util.logging.Logger r2 = java.util.logging.Logger.getLogger(r2)
            f4338i = r2
            androidx.work.impl.utils.futures.a$f r2 = new androidx.work.impl.utils.futures.a$f     // Catch:{ all -> 0x0048 }
            java.lang.Class<java.lang.Thread> r3 = java.lang.Thread.class
            java.lang.String r4 = "a"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r3, r4)     // Catch:{ all -> 0x0048 }
            java.lang.String r3 = "b"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r0, r3)     // Catch:{ all -> 0x0048 }
            java.lang.String r3 = "g"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r0, r3)     // Catch:{ all -> 0x0048 }
            java.lang.Class<androidx.work.impl.utils.futures.a$e> r0 = androidx.work.impl.utils.futures.a.e.class
            java.lang.String r3 = "f"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r0, r3)     // Catch:{ all -> 0x0048 }
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r3 = "e"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r8 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r0, r3)     // Catch:{ all -> 0x0048 }
            r3 = r2
            r3.<init>(r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0048 }
            r0 = 0
            goto L_0x004e
        L_0x0048:
            r0 = move-exception
            androidx.work.impl.utils.futures.a$h r2 = new androidx.work.impl.utils.futures.a$h
            r2.<init>()
        L_0x004e:
            f4339j = r2
            if (r0 == 0) goto L_0x005b
            java.util.logging.Logger r1 = f4338i
            java.util.logging.Level r2 = java.util.logging.Level.SEVERE
            java.lang.String r3 = "SafeAtomicHelper is broken!"
            r1.log(r2, r3, r0)
        L_0x005b:
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            f4340k = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.utils.futures.a.<clinit>():void");
    }

    protected a() {
    }

    private void b(StringBuilder sb2) {
        String str = "]";
        try {
            Object k10 = k(this);
            sb2.append("SUCCESS, result=[");
            sb2.append(s(k10));
            sb2.append(str);
            return;
        } catch (ExecutionException e10) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e10.getCause());
        } catch (CancellationException unused) {
            str = "CANCELLED";
        } catch (RuntimeException e11) {
            sb2.append("UNKNOWN, cause=[");
            sb2.append(e11.getClass());
            str = " thrown from get()]";
        }
        sb2.append(str);
    }

    private static CancellationException d(String str, Throwable th2) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th2);
        return cancellationException;
    }

    static Object e(Object obj) {
        obj.getClass();
        return obj;
    }

    private e f(e eVar) {
        e eVar2;
        do {
            eVar2 = this.f4342f;
        } while (!f4339j.a(this, eVar2, e.f4350d));
        e eVar3 = eVar2;
        e eVar4 = eVar;
        e eVar5 = eVar3;
        while (eVar5 != null) {
            e eVar6 = eVar5.f4353c;
            eVar5.f4353c = eVar4;
            eVar4 = eVar5;
            eVar5 = eVar6;
        }
        return eVar4;
    }

    static void g(a aVar) {
        e eVar = null;
        while (true) {
            aVar.n();
            aVar.c();
            e f10 = aVar.f(eVar);
            while (true) {
                if (f10 != null) {
                    eVar = f10.f4353c;
                    Runnable runnable = f10.f4351a;
                    if (runnable instanceof g) {
                        g gVar = (g) runnable;
                        aVar = gVar.f4359e;
                        if (aVar.f4341e == gVar) {
                            if (f4339j.b(aVar, gVar, j(gVar.f4360f))) {
                            }
                        } else {
                            continue;
                        }
                    } else {
                        h(runnable, f10.f4352b);
                    }
                    f10 = eVar;
                } else {
                    return;
                }
            }
        }
    }

    private static void h(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            Logger logger = f4338i;
            Level level = Level.SEVERE;
            logger.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, e10);
        }
    }

    private Object i(Object obj) {
        if (obj instanceof c) {
            throw d("Task was cancelled.", ((c) obj).f4347b);
        } else if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f4349a);
        } else if (obj == f4340k) {
            return null;
        } else {
            return obj;
        }
    }

    static Object j(x5.a aVar) {
        if (aVar instanceof a) {
            Object obj = ((a) aVar).f4341e;
            if (!(obj instanceof c)) {
                return obj;
            }
            c cVar = (c) obj;
            if (cVar.f4346a) {
                return cVar.f4347b != null ? new c(false, cVar.f4347b) : c.f4345d;
            }
            return obj;
        }
        boolean isCancelled = aVar.isCancelled();
        if ((!f4337h) && isCancelled) {
            return c.f4345d;
        }
        try {
            Object k10 = k(aVar);
            return k10 == null ? f4340k : k10;
        } catch (ExecutionException e10) {
            return new d(e10.getCause());
        } catch (CancellationException e11) {
            if (isCancelled) {
                return new c(false, e11);
            }
            return new d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + aVar, e11));
        } catch (Throwable th2) {
            return new d(th2);
        }
    }

    private static Object k(Future future) {
        Object obj;
        boolean z10 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th2) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    private void n() {
        i iVar;
        do {
            iVar = this.f4343g;
        } while (!f4339j.c(this, iVar, i.f4361c));
        while (iVar != null) {
            iVar.b();
            iVar = iVar.f4363b;
        }
    }

    private void o(i iVar) {
        iVar.f4362a = null;
        while (true) {
            i iVar2 = this.f4343g;
            if (iVar2 != i.f4361c) {
                i iVar3 = null;
                while (iVar2 != null) {
                    i iVar4 = iVar2.f4363b;
                    if (iVar2.f4362a != null) {
                        iVar3 = iVar2;
                    } else if (iVar3 != null) {
                        iVar3.f4363b = iVar4;
                        if (iVar3.f4362a == null) {
                        }
                    } else if (!f4339j.c(this, iVar2, iVar4)) {
                    }
                    iVar2 = iVar4;
                }
                return;
            }
            return;
        }
    }

    private String s(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    public final void a(Runnable runnable, Executor executor) {
        e(runnable);
        e(executor);
        e eVar = this.f4342f;
        if (eVar != e.f4350d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f4353c = eVar;
                if (!f4339j.a(this, eVar, eVar2)) {
                    eVar = this.f4342f;
                } else {
                    return;
                }
            } while (eVar != e.f4350d);
        }
        h(runnable, executor);
    }

    /* access modifiers changed from: protected */
    public void c() {
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [java.util.concurrent.Future, x5.a] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean cancel(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f4341e
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0008
            r3 = r1
            goto L_0x0009
        L_0x0008:
            r3 = r2
        L_0x0009:
            boolean r4 = r0 instanceof androidx.work.impl.utils.futures.a.g
            r3 = r3 | r4
            if (r3 == 0) goto L_0x0061
            boolean r3 = f4337h
            if (r3 == 0) goto L_0x001f
            androidx.work.impl.utils.futures.a$c r3 = new androidx.work.impl.utils.futures.a$c
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r3.<init>(r8, r4)
            goto L_0x0026
        L_0x001f:
            if (r8 == 0) goto L_0x0024
            androidx.work.impl.utils.futures.a$c r3 = androidx.work.impl.utils.futures.a.c.f4344c
            goto L_0x0026
        L_0x0024:
            androidx.work.impl.utils.futures.a$c r3 = androidx.work.impl.utils.futures.a.c.f4345d
        L_0x0026:
            r4 = r7
            r5 = r2
        L_0x0028:
            androidx.work.impl.utils.futures.a$b r6 = f4339j
            boolean r6 = r6.b(r4, r0, r3)
            if (r6 == 0) goto L_0x0059
            if (r8 == 0) goto L_0x0035
            r4.l()
        L_0x0035:
            g(r4)
            boolean r4 = r0 instanceof androidx.work.impl.utils.futures.a.g
            if (r4 == 0) goto L_0x0062
            androidx.work.impl.utils.futures.a$g r0 = (androidx.work.impl.utils.futures.a.g) r0
            x5.a r0 = r0.f4360f
            boolean r4 = r0 instanceof androidx.work.impl.utils.futures.a
            if (r4 == 0) goto L_0x0055
            r4 = r0
            androidx.work.impl.utils.futures.a r4 = (androidx.work.impl.utils.futures.a) r4
            java.lang.Object r0 = r4.f4341e
            if (r0 != 0) goto L_0x004d
            r5 = r1
            goto L_0x004e
        L_0x004d:
            r5 = r2
        L_0x004e:
            boolean r6 = r0 instanceof androidx.work.impl.utils.futures.a.g
            r5 = r5 | r6
            if (r5 == 0) goto L_0x0062
            r5 = r1
            goto L_0x0028
        L_0x0055:
            r0.cancel(r8)
            goto L_0x0062
        L_0x0059:
            java.lang.Object r0 = r4.f4341e
            boolean r6 = r0 instanceof androidx.work.impl.utils.futures.a.g
            if (r6 != 0) goto L_0x0028
            r1 = r5
            goto L_0x0062
        L_0x0061:
            r1 = r2
        L_0x0062:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.utils.futures.a.cancel(boolean):boolean");
    }

    public final Object get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f4341e;
            if ((obj2 != null) && (!(obj2 instanceof g))) {
                return i(obj2);
            }
            i iVar = this.f4343g;
            if (iVar != i.f4361c) {
                i iVar2 = new i();
                do {
                    iVar2.a(iVar);
                    if (f4339j.c(this, iVar, iVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f4341e;
                            } else {
                                o(iVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof g))));
                        return i(obj);
                    }
                    iVar = this.f4343g;
                } while (iVar != i.f4361c);
            }
            return i(this.f4341e);
        }
        throw new InterruptedException();
    }

    public final boolean isCancelled() {
        return this.f4341e instanceof c;
    }

    public final boolean isDone() {
        Object obj = this.f4341e;
        return (!(obj instanceof g)) & (obj != null);
    }

    /* access modifiers changed from: protected */
    public void l() {
    }

    /* access modifiers changed from: protected */
    public String m() {
        Object obj = this.f4341e;
        if (obj instanceof g) {
            return "setFuture=[" + s(((g) obj).f4360f) + "]";
        } else if (!(this instanceof ScheduledFuture)) {
            return null;
        } else {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        }
    }

    /* access modifiers changed from: protected */
    public boolean p(Object obj) {
        if (obj == null) {
            obj = f4340k;
        }
        if (!f4339j.b(this, (Object) null, obj)) {
            return false;
        }
        g(this);
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean q(Throwable th2) {
        if (!f4339j.b(this, (Object) null, new d((Throwable) e(th2)))) {
            return false;
        }
        g(this);
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean r(x5.a aVar) {
        g gVar;
        d dVar;
        e(aVar);
        Object obj = this.f4341e;
        if (obj == null) {
            if (aVar.isDone()) {
                if (!f4339j.b(this, (Object) null, j(aVar))) {
                    return false;
                }
                g(this);
                return true;
            }
            gVar = new g(this, aVar);
            if (f4339j.b(this, (Object) null, gVar)) {
                try {
                    aVar.a(gVar, b.INSTANCE);
                } catch (Throwable unused) {
                    dVar = d.f4348b;
                }
                return true;
            }
            obj = this.f4341e;
        }
        if (obj instanceof c) {
            aVar.cancel(((c) obj).f4346a);
        }
        return false;
        f4339j.b(this, gVar, dVar);
        return true;
    }

    public String toString() {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (isCancelled()) {
            str2 = "CANCELLED";
        } else {
            if (!isDone()) {
                try {
                    str = m();
                } catch (RuntimeException e10) {
                    str = "Exception thrown from implementation: " + e10.getClass();
                }
                if (str != null && !str.isEmpty()) {
                    sb2.append("PENDING, info=[");
                    sb2.append(str);
                    sb2.append("]");
                    sb2.append("]");
                    return sb2.toString();
                } else if (!isDone()) {
                    str2 = "PENDING";
                }
            }
            b(sb2);
            sb2.append("]");
            return sb2.toString();
        }
        sb2.append(str2);
        sb2.append("]");
        return sb2.toString();
    }

    public final Object get(long j10, TimeUnit timeUnit) {
        long j11 = j10;
        TimeUnit timeUnit2 = timeUnit;
        long nanos = timeUnit2.toNanos(j11);
        if (!Thread.interrupted()) {
            Object obj = this.f4341e;
            if ((obj != null) && (!(obj instanceof g))) {
                return i(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0;
            if (nanos >= 1000) {
                i iVar = this.f4343g;
                if (iVar != i.f4361c) {
                    i iVar2 = new i();
                    do {
                        iVar2.a(iVar);
                        if (f4339j.c(this, iVar, iVar2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f4341e;
                                    if ((obj2 != null) && (!(obj2 instanceof g))) {
                                        return i(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    o(iVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            o(iVar2);
                        } else {
                            iVar = this.f4343g;
                        }
                    } while (iVar != i.f4361c);
                }
                return i(this.f4341e);
            }
            while (nanos > 0) {
                Object obj3 = this.f4341e;
                if ((obj3 != null) && (!(obj3 instanceof g))) {
                    return i(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String aVar = toString();
            String obj4 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = obj4.toLowerCase(locale);
            String str = "Waited " + j11 + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String str2 = str + " (plus ";
                long j12 = -nanos;
                long convert = timeUnit2.convert(j12, TimeUnit.NANOSECONDS);
                long nanos2 = j12 - timeUnit2.toNanos(convert);
                int i10 = (convert > 0 ? 1 : (convert == 0 ? 0 : -1));
                boolean z10 = i10 == 0 || nanos2 > 1000;
                if (i10 > 0) {
                    String str3 = str2 + convert + " " + lowerCase;
                    if (z10) {
                        str3 = str3 + ",";
                    }
                    str2 = str3 + " ";
                }
                if (z10) {
                    str2 = str2 + nanos2 + " nanoseconds ";
                }
                str = str2 + "delay)";
            }
            if (isDone()) {
                throw new TimeoutException(str + " but future completed as timeout expired");
            }
            throw new TimeoutException(str + " for " + aVar);
        }
        throw new InterruptedException();
    }
}
