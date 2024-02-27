package androidx.core.os;

import android.os.CancellationSignal;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    private boolean f2417a;

    /* renamed from: b  reason: collision with root package name */
    private b f2418b;

    /* renamed from: c  reason: collision with root package name */
    private Object f2419c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f2420d;

    static class a {
        static void a(Object obj) {
            ((CancellationSignal) obj).cancel();
        }

        static CancellationSignal b() {
            return new CancellationSignal();
        }
    }

    public interface b {
        void a();
    }

    private void d() {
        while (this.f2420d) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0014, code lost:
        if (r0 == null) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r0.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x001c, code lost:
        if (r1 == null) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x001e, code lost:
        androidx.core.os.e.a.a(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0022, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r3.f2420d = false;
        notifyAll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0029, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x002d, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r3.f2420d = false;
        notifyAll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0033, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0034, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a() {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f2417a     // Catch:{ all -> 0x0007 }
            if (r0 == 0) goto L_0x0009
            monitor-exit(r3)     // Catch:{ all -> 0x0007 }
            return
        L_0x0007:
            r0 = move-exception
            goto L_0x0038
        L_0x0009:
            r0 = 1
            r3.f2417a = r0     // Catch:{ all -> 0x0007 }
            r3.f2420d = r0     // Catch:{ all -> 0x0007 }
            androidx.core.os.e$b r0 = r3.f2418b     // Catch:{ all -> 0x0007 }
            java.lang.Object r1 = r3.f2419c     // Catch:{ all -> 0x0007 }
            monitor-exit(r3)     // Catch:{ all -> 0x0007 }
            r2 = 0
            if (r0 == 0) goto L_0x001c
            r0.a()     // Catch:{ all -> 0x001a }
            goto L_0x001c
        L_0x001a:
            r0 = move-exception
            goto L_0x0022
        L_0x001c:
            if (r1 == 0) goto L_0x002d
            androidx.core.os.e.a.a(r1)     // Catch:{ all -> 0x001a }
            goto L_0x002d
        L_0x0022:
            monitor-enter(r3)
            r3.f2420d = r2     // Catch:{ all -> 0x002a }
            r3.notifyAll()     // Catch:{ all -> 0x002a }
            monitor-exit(r3)     // Catch:{ all -> 0x002a }
            throw r0
        L_0x002a:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x002a }
            throw r0
        L_0x002d:
            monitor-enter(r3)
            r3.f2420d = r2     // Catch:{ all -> 0x0035 }
            r3.notifyAll()     // Catch:{ all -> 0x0035 }
            monitor-exit(r3)     // Catch:{ all -> 0x0035 }
            return
        L_0x0035:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0035 }
            throw r0
        L_0x0038:
            monitor-exit(r3)     // Catch:{ all -> 0x0007 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.os.e.a():void");
    }

    public Object b() {
        Object obj;
        synchronized (this) {
            try {
                if (this.f2419c == null) {
                    CancellationSignal b10 = a.b();
                    this.f2419c = b10;
                    if (this.f2417a) {
                        a.a(b10);
                    }
                }
                obj = this.f2419c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return obj;
    }

    public void c(b bVar) {
        synchronized (this) {
            try {
                d();
                if (this.f2418b != bVar) {
                    this.f2418b = bVar;
                    if (this.f2417a) {
                        if (bVar != null) {
                            bVar.a();
                        }
                    }
                }
            } finally {
            }
        }
    }
}
