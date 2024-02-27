package ym;

import cm.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import pl.x;
import vm.b;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    private boolean f33067a;

    /* renamed from: b  reason: collision with root package name */
    private a f33068b;

    /* renamed from: c  reason: collision with root package name */
    private final List f33069c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private boolean f33070d;

    /* renamed from: e  reason: collision with root package name */
    private final e f33071e;

    /* renamed from: f  reason: collision with root package name */
    private final String f33072f;

    public d(e eVar, String str) {
        l.f(eVar, "taskRunner");
        l.f(str, "name");
        this.f33071e = eVar;
        this.f33072f = str;
    }

    public static /* synthetic */ void j(d dVar, a aVar, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        dVar.i(aVar, j10);
    }

    public final void a() {
        if (!b.f32404h || !Thread.holdsLock(this)) {
            synchronized (this.f33071e) {
                try {
                    if (b()) {
                        this.f33071e.h(this);
                    }
                    x xVar = x.f30437a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return;
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

    public final boolean b() {
        a aVar = this.f33068b;
        if (aVar != null) {
            l.c(aVar);
            if (aVar.a()) {
                this.f33070d = true;
            }
        }
        boolean z10 = false;
        for (int size = this.f33069c.size() - 1; size >= 0; size--) {
            if (((a) this.f33069c.get(size)).a()) {
                a aVar2 = (a) this.f33069c.get(size);
                if (e.f33075j.a().isLoggable(Level.FINE)) {
                    b.c(aVar2, this, "canceled");
                }
                this.f33069c.remove(size);
                z10 = true;
            }
        }
        return z10;
    }

    public final a c() {
        return this.f33068b;
    }

    public final boolean d() {
        return this.f33070d;
    }

    public final List e() {
        return this.f33069c;
    }

    public final String f() {
        return this.f33072f;
    }

    public final boolean g() {
        return this.f33067a;
    }

    public final e h() {
        return this.f33071e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0029, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void i(ym.a r3, long r4) {
        /*
            r2 = this;
            java.lang.String r0 = "task"
            cm.l.f(r3, r0)
            ym.e r0 = r2.f33071e
            monitor-enter(r0)
            boolean r1 = r2.f33067a     // Catch:{ all -> 0x0026 }
            if (r1 == 0) goto L_0x0043
            boolean r4 = r3.a()     // Catch:{ all -> 0x0026 }
            if (r4 == 0) goto L_0x002a
            ym.e$b r4 = ym.e.f33075j     // Catch:{ all -> 0x0026 }
            java.util.logging.Logger r4 = r4.a()     // Catch:{ all -> 0x0026 }
            java.util.logging.Level r5 = java.util.logging.Level.FINE     // Catch:{ all -> 0x0026 }
            boolean r4 = r4.isLoggable(r5)     // Catch:{ all -> 0x0026 }
            if (r4 == 0) goto L_0x0028
            java.lang.String r4 = "schedule canceled (queue is shutdown)"
            ym.b.c(r3, r2, r4)     // Catch:{ all -> 0x0026 }
            goto L_0x0028
        L_0x0026:
            r3 = move-exception
            goto L_0x0053
        L_0x0028:
            monitor-exit(r0)
            return
        L_0x002a:
            ym.e$b r4 = ym.e.f33075j     // Catch:{ all -> 0x0026 }
            java.util.logging.Logger r4 = r4.a()     // Catch:{ all -> 0x0026 }
            java.util.logging.Level r5 = java.util.logging.Level.FINE     // Catch:{ all -> 0x0026 }
            boolean r4 = r4.isLoggable(r5)     // Catch:{ all -> 0x0026 }
            if (r4 == 0) goto L_0x003d
            java.lang.String r4 = "schedule failed (queue is shutdown)"
            ym.b.c(r3, r2, r4)     // Catch:{ all -> 0x0026 }
        L_0x003d:
            java.util.concurrent.RejectedExecutionException r3 = new java.util.concurrent.RejectedExecutionException     // Catch:{ all -> 0x0026 }
            r3.<init>()     // Catch:{ all -> 0x0026 }
            throw r3     // Catch:{ all -> 0x0026 }
        L_0x0043:
            r1 = 0
            boolean r3 = r2.k(r3, r4, r1)     // Catch:{ all -> 0x0026 }
            if (r3 == 0) goto L_0x004f
            ym.e r3 = r2.f33071e     // Catch:{ all -> 0x0026 }
            r3.h(r2)     // Catch:{ all -> 0x0026 }
        L_0x004f:
            pl.x r3 = pl.x.f30437a     // Catch:{ all -> 0x0026 }
            monitor-exit(r0)
            return
        L_0x0053:
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ym.d.i(ym.a, long):void");
    }

    public final boolean k(a aVar, long j10, boolean z10) {
        StringBuilder sb2;
        String str;
        l.f(aVar, "task");
        aVar.e(this);
        long b10 = this.f33071e.g().b();
        long j11 = b10 + j10;
        int indexOf = this.f33069c.indexOf(aVar);
        if (indexOf != -1) {
            if (aVar.c() <= j11) {
                if (e.f33075j.a().isLoggable(Level.FINE)) {
                    b.c(aVar, this, "already scheduled");
                }
                return false;
            }
            this.f33069c.remove(indexOf);
        }
        aVar.g(j11);
        if (e.f33075j.a().isLoggable(Level.FINE)) {
            if (z10) {
                sb2 = new StringBuilder();
                str = "run again after ";
            } else {
                sb2 = new StringBuilder();
                str = "scheduled after ";
            }
            sb2.append(str);
            sb2.append(b.b(j11 - b10));
            b.c(aVar, this, sb2.toString());
        }
        Iterator it = this.f33069c.iterator();
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                i10 = -1;
                break;
            } else if (((a) it.next()).c() - b10 > j10) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 == -1) {
            i10 = this.f33069c.size();
        }
        this.f33069c.add(i10, aVar);
        return i10 == 0;
    }

    public final void l(a aVar) {
        this.f33068b = aVar;
    }

    public final void m(boolean z10) {
        this.f33070d = z10;
    }

    public final void n() {
        if (!b.f32404h || !Thread.holdsLock(this)) {
            synchronized (this.f33071e) {
                try {
                    this.f33067a = true;
                    if (b()) {
                        this.f33071e.h(this);
                    }
                    x xVar = x.f30437a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return;
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

    public String toString() {
        return this.f33072f;
    }
}
