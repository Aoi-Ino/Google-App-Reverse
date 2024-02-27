package androidx.concurrent.futures;

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
    static final boolean f1648h = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: i  reason: collision with root package name */
    private static final Logger f1649i;

    /* renamed from: j  reason: collision with root package name */
    static final b f1650j;

    /* renamed from: k  reason: collision with root package name */
    private static final Object f1651k = new Object();

    /* renamed from: e  reason: collision with root package name */
    volatile Object f1652e;

    /* renamed from: f  reason: collision with root package name */
    volatile e f1653f;

    /* renamed from: g  reason: collision with root package name */
    volatile h f1654g;

    private static abstract class b {
        private b() {
        }

        /* access modifiers changed from: package-private */
        public abstract boolean a(a aVar, e eVar, e eVar2);

        /* access modifiers changed from: package-private */
        public abstract boolean b(a aVar, Object obj, Object obj2);

        /* access modifiers changed from: package-private */
        public abstract boolean c(a aVar, h hVar, h hVar2);

        /* access modifiers changed from: package-private */
        public abstract void d(h hVar, h hVar2);

        /* access modifiers changed from: package-private */
        public abstract void e(h hVar, Thread thread);
    }

    private static final class c {

        /* renamed from: c  reason: collision with root package name */
        static final c f1655c;

        /* renamed from: d  reason: collision with root package name */
        static final c f1656d;

        /* renamed from: a  reason: collision with root package name */
        final boolean f1657a;

        /* renamed from: b  reason: collision with root package name */
        final Throwable f1658b;

        static {
            if (a.f1648h) {
                f1656d = null;
                f1655c = null;
                return;
            }
            f1656d = new c(false, (Throwable) null);
            f1655c = new c(true, (Throwable) null);
        }

        c(boolean z10, Throwable th2) {
            this.f1657a = z10;
            this.f1658b = th2;
        }
    }

    private static final class d {

        /* renamed from: b  reason: collision with root package name */
        static final d f1659b = new d(new C0019a("Failure occurred while trying to finish a future."));

        /* renamed from: a  reason: collision with root package name */
        final Throwable f1660a;

        /* renamed from: androidx.concurrent.futures.a$d$a  reason: collision with other inner class name */
        class C0019a extends Throwable {
            C0019a(String str) {
                super(str);
            }

            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        d(Throwable th2) {
            this.f1660a = (Throwable) a.e(th2);
        }
    }

    private static final class e {

        /* renamed from: d  reason: collision with root package name */
        static final e f1661d = new e((Runnable) null, (Executor) null);

        /* renamed from: a  reason: collision with root package name */
        final Runnable f1662a;

        /* renamed from: b  reason: collision with root package name */
        final Executor f1663b;

        /* renamed from: c  reason: collision with root package name */
        e f1664c;

        e(Runnable runnable, Executor executor) {
            this.f1662a = runnable;
            this.f1663b = executor;
        }
    }

    private static final class f extends b {

        /* renamed from: a  reason: collision with root package name */
        final AtomicReferenceFieldUpdater f1665a;

        /* renamed from: b  reason: collision with root package name */
        final AtomicReferenceFieldUpdater f1666b;

        /* renamed from: c  reason: collision with root package name */
        final AtomicReferenceFieldUpdater f1667c;

        /* renamed from: d  reason: collision with root package name */
        final AtomicReferenceFieldUpdater f1668d;

        /* renamed from: e  reason: collision with root package name */
        final AtomicReferenceFieldUpdater f1669e;

        f(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            super();
            this.f1665a = atomicReferenceFieldUpdater;
            this.f1666b = atomicReferenceFieldUpdater2;
            this.f1667c = atomicReferenceFieldUpdater3;
            this.f1668d = atomicReferenceFieldUpdater4;
            this.f1669e = atomicReferenceFieldUpdater5;
        }

        /* access modifiers changed from: package-private */
        public boolean a(a aVar, e eVar, e eVar2) {
            return b.a(this.f1668d, aVar, eVar, eVar2);
        }

        /* access modifiers changed from: package-private */
        public boolean b(a aVar, Object obj, Object obj2) {
            return b.a(this.f1669e, aVar, obj, obj2);
        }

        /* access modifiers changed from: package-private */
        public boolean c(a aVar, h hVar, h hVar2) {
            return b.a(this.f1667c, aVar, hVar, hVar2);
        }

        /* access modifiers changed from: package-private */
        public void d(h hVar, h hVar2) {
            this.f1666b.lazySet(hVar, hVar2);
        }

        /* access modifiers changed from: package-private */
        public void e(h hVar, Thread thread) {
            this.f1665a.lazySet(hVar, thread);
        }
    }

    private static final class g extends b {
        g() {
            super();
        }

        /* access modifiers changed from: package-private */
        public boolean a(a aVar, e eVar, e eVar2) {
            synchronized (aVar) {
                try {
                    if (aVar.f1653f != eVar) {
                        return false;
                    }
                    aVar.f1653f = eVar2;
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
                    if (aVar.f1652e != obj) {
                        return false;
                    }
                    aVar.f1652e = obj2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public boolean c(a aVar, h hVar, h hVar2) {
            synchronized (aVar) {
                try {
                    if (aVar.f1654g != hVar) {
                        return false;
                    }
                    aVar.f1654g = hVar2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void d(h hVar, h hVar2) {
            hVar.f1672b = hVar2;
        }

        /* access modifiers changed from: package-private */
        public void e(h hVar, Thread thread) {
            hVar.f1671a = thread;
        }
    }

    private static final class h {

        /* renamed from: c  reason: collision with root package name */
        static final h f1670c = new h(false);

        /* renamed from: a  reason: collision with root package name */
        volatile Thread f1671a;

        /* renamed from: b  reason: collision with root package name */
        volatile h f1672b;

        h() {
            a.f1650j.e(this, Thread.currentThread());
        }

        h(boolean z10) {
        }

        /* access modifiers changed from: package-private */
        public void a(h hVar) {
            a.f1650j.d(this, hVar);
        }

        /* access modifiers changed from: package-private */
        public void b() {
            Thread thread = this.f1671a;
            if (thread != null) {
                this.f1671a = null;
                LockSupport.unpark(thread);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: androidx.concurrent.futures.a$f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: androidx.concurrent.futures.a$g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: androidx.concurrent.futures.a$f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: androidx.concurrent.futures.a$f} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.Class<androidx.concurrent.futures.a$h> r0 = androidx.concurrent.futures.a.h.class
            java.lang.String r1 = "guava.concurrent.generate_cancellation_cause"
            java.lang.String r2 = "false"
            java.lang.String r1 = java.lang.System.getProperty(r1, r2)
            boolean r1 = java.lang.Boolean.parseBoolean(r1)
            f1648h = r1
            java.lang.Class<androidx.concurrent.futures.a> r1 = androidx.concurrent.futures.a.class
            java.lang.String r2 = r1.getName()
            java.util.logging.Logger r2 = java.util.logging.Logger.getLogger(r2)
            f1649i = r2
            androidx.concurrent.futures.a$f r2 = new androidx.concurrent.futures.a$f     // Catch:{ all -> 0x0048 }
            java.lang.Class<java.lang.Thread> r3 = java.lang.Thread.class
            java.lang.String r4 = "a"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r3, r4)     // Catch:{ all -> 0x0048 }
            java.lang.String r3 = "b"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r0, r3)     // Catch:{ all -> 0x0048 }
            java.lang.String r3 = "g"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r0, r3)     // Catch:{ all -> 0x0048 }
            java.lang.Class<androidx.concurrent.futures.a$e> r0 = androidx.concurrent.futures.a.e.class
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
            androidx.concurrent.futures.a$g r2 = new androidx.concurrent.futures.a$g
            r2.<init>()
        L_0x004e:
            f1650j = r2
            if (r0 == 0) goto L_0x005b
            java.util.logging.Logger r1 = f1649i
            java.util.logging.Level r2 = java.util.logging.Level.SEVERE
            java.lang.String r3 = "SafeAtomicHelper is broken!"
            r1.log(r2, r3, r0)
        L_0x005b:
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            f1651k = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.concurrent.futures.a.<clinit>():void");
    }

    protected a() {
    }

    private void b(StringBuilder sb2) {
        String str = "]";
        try {
            Object j10 = j(this);
            sb2.append("SUCCESS, result=[");
            sb2.append(q(j10));
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
            eVar2 = this.f1653f;
        } while (!f1650j.a(this, eVar2, e.f1661d));
        e eVar3 = eVar2;
        e eVar4 = eVar;
        e eVar5 = eVar3;
        while (eVar5 != null) {
            e eVar6 = eVar5.f1664c;
            eVar5.f1664c = eVar4;
            eVar4 = eVar5;
            eVar5 = eVar6;
        }
        return eVar4;
    }

    static void g(a aVar) {
        aVar.m();
        aVar.c();
        e f10 = aVar.f((e) null);
        while (f10 != null) {
            e eVar = f10.f1664c;
            h(f10.f1662a, f10.f1663b);
            f10 = eVar;
        }
    }

    private static void h(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            Logger logger = f1649i;
            Level level = Level.SEVERE;
            logger.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, e10);
        }
    }

    private Object i(Object obj) {
        if (obj instanceof c) {
            throw d("Task was cancelled.", ((c) obj).f1658b);
        } else if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f1660a);
        } else if (obj == f1651k) {
            return null;
        } else {
            return obj;
        }
    }

    static Object j(Future future) {
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

    private void m() {
        h hVar;
        do {
            hVar = this.f1654g;
        } while (!f1650j.c(this, hVar, h.f1670c));
        while (hVar != null) {
            hVar.b();
            hVar = hVar.f1672b;
        }
    }

    private void n(h hVar) {
        hVar.f1671a = null;
        while (true) {
            h hVar2 = this.f1654g;
            if (hVar2 != h.f1670c) {
                h hVar3 = null;
                while (hVar2 != null) {
                    h hVar4 = hVar2.f1672b;
                    if (hVar2.f1671a != null) {
                        hVar3 = hVar2;
                    } else if (hVar3 != null) {
                        hVar3.f1672b = hVar4;
                        if (hVar3.f1671a == null) {
                        }
                    } else if (!f1650j.c(this, hVar2, hVar4)) {
                    }
                    hVar2 = hVar4;
                }
                return;
            }
            return;
        }
    }

    private String q(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    public final void a(Runnable runnable, Executor executor) {
        e(runnable);
        e(executor);
        e eVar = this.f1653f;
        if (eVar != e.f1661d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f1664c = eVar;
                if (!f1650j.a(this, eVar, eVar2)) {
                    eVar = this.f1653f;
                } else {
                    return;
                }
            } while (eVar != e.f1661d);
        }
        h(runnable, executor);
    }

    /* access modifiers changed from: protected */
    public void c() {
    }

    public final boolean cancel(boolean z10) {
        Object obj = this.f1652e;
        if (obj == null) {
            if (f1650j.b(this, obj, f1648h ? new c(z10, new CancellationException("Future.cancel() was called.")) : z10 ? c.f1655c : c.f1656d)) {
                if (z10) {
                    k();
                }
                g(this);
                return true;
            }
        }
        return false;
    }

    public final Object get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f1652e;
            if ((obj2 != null) && true) {
                return i(obj2);
            }
            h hVar = this.f1654g;
            if (hVar != h.f1670c) {
                h hVar2 = new h();
                do {
                    hVar2.a(hVar);
                    if (f1650j.c(this, hVar, hVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f1652e;
                            } else {
                                n(hVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & true));
                        return i(obj);
                    }
                    hVar = this.f1654g;
                } while (hVar != h.f1670c);
            }
            return i(this.f1652e);
        }
        throw new InterruptedException();
    }

    public final boolean isCancelled() {
        return this.f1652e instanceof c;
    }

    public final boolean isDone() {
        return (this.f1652e != null) & true;
    }

    /* access modifiers changed from: protected */
    public void k() {
    }

    /* access modifiers changed from: protected */
    public String l() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    /* access modifiers changed from: protected */
    public boolean o(Object obj) {
        if (obj == null) {
            obj = f1651k;
        }
        if (!f1650j.b(this, (Object) null, obj)) {
            return false;
        }
        g(this);
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean p(Throwable th2) {
        if (!f1650j.b(this, (Object) null, new d((Throwable) e(th2)))) {
            return false;
        }
        g(this);
        return true;
    }

    /* access modifiers changed from: protected */
    public final boolean r() {
        Object obj = this.f1652e;
        return (obj instanceof c) && ((c) obj).f1657a;
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
                    str = l();
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
            Object obj = this.f1652e;
            if ((obj != null) && true) {
                return i(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0;
            if (nanos >= 1000) {
                h hVar = this.f1654g;
                if (hVar != h.f1670c) {
                    h hVar2 = new h();
                    do {
                        hVar2.a(hVar);
                        if (f1650j.c(this, hVar, hVar2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f1652e;
                                    if ((obj2 != null) && true) {
                                        return i(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    n(hVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            n(hVar2);
                        } else {
                            hVar = this.f1654g;
                        }
                    } while (hVar != h.f1670c);
                }
                return i(this.f1652e);
            }
            while (nanos > 0) {
                Object obj3 = this.f1652e;
                if ((obj3 != null) && true) {
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
