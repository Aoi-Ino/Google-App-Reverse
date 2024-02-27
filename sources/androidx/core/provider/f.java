package androidx.core.provider;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import androidx.core.graphics.i;
import androidx.core.provider.g;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import o.g;

abstract class f {

    /* renamed from: a  reason: collision with root package name */
    static final o.e f2446a = new o.e(16);

    /* renamed from: b  reason: collision with root package name */
    private static final ExecutorService f2447b = h.a("fonts-androidx", 10, 10000);

    /* renamed from: c  reason: collision with root package name */
    static final Object f2448c = new Object();

    /* renamed from: d  reason: collision with root package name */
    static final g f2449d = new g();

    class a implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f2450a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f2451b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ e f2452c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f2453d;

        a(String str, Context context, e eVar, int i10) {
            this.f2450a = str;
            this.f2451b = context;
            this.f2452c = eVar;
            this.f2453d = i10;
        }

        /* renamed from: a */
        public e call() {
            return f.c(this.f2450a, this.f2451b, this.f2452c, this.f2453d);
        }
    }

    class b implements androidx.core.util.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f2454a;

        b(a aVar) {
            this.f2454a = aVar;
        }

        /* renamed from: b */
        public void a(e eVar) {
            if (eVar == null) {
                eVar = new e(-3);
            }
            this.f2454a.b(eVar);
        }
    }

    class c implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f2455a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f2456b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ e f2457c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f2458d;

        c(String str, Context context, e eVar, int i10) {
            this.f2455a = str;
            this.f2456b = context;
            this.f2457c = eVar;
            this.f2458d = i10;
        }

        /* renamed from: a */
        public e call() {
            try {
                return f.c(this.f2455a, this.f2456b, this.f2457c, this.f2458d);
            } catch (Throwable unused) {
                return new e(-3);
            }
        }
    }

    class d implements androidx.core.util.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f2459a;

        d(String str) {
            this.f2459a = str;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0019, code lost:
            r0 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x001e, code lost:
            if (r0 >= r2.size()) goto L_0x002c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0020, code lost:
            ((androidx.core.util.a) r2.get(r0)).a(r5);
            r0 = r0 + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x002c, code lost:
            return;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void a(androidx.core.provider.f.e r5) {
            /*
                r4 = this;
                java.lang.Object r0 = androidx.core.provider.f.f2448c
                monitor-enter(r0)
                o.g r1 = androidx.core.provider.f.f2449d     // Catch:{ all -> 0x0011 }
                java.lang.String r2 = r4.f2459a     // Catch:{ all -> 0x0011 }
                java.lang.Object r2 = r1.get(r2)     // Catch:{ all -> 0x0011 }
                java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch:{ all -> 0x0011 }
                if (r2 != 0) goto L_0x0013
                monitor-exit(r0)     // Catch:{ all -> 0x0011 }
                return
            L_0x0011:
                r5 = move-exception
                goto L_0x002d
            L_0x0013:
                java.lang.String r3 = r4.f2459a     // Catch:{ all -> 0x0011 }
                r1.remove(r3)     // Catch:{ all -> 0x0011 }
                monitor-exit(r0)     // Catch:{ all -> 0x0011 }
                r0 = 0
            L_0x001a:
                int r1 = r2.size()
                if (r0 >= r1) goto L_0x002c
                java.lang.Object r1 = r2.get(r0)
                androidx.core.util.a r1 = (androidx.core.util.a) r1
                r1.a(r5)
                int r0 = r0 + 1
                goto L_0x001a
            L_0x002c:
                return
            L_0x002d:
                monitor-exit(r0)     // Catch:{ all -> 0x0011 }
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.provider.f.d.a(androidx.core.provider.f$e):void");
        }
    }

    static final class e {

        /* renamed from: a  reason: collision with root package name */
        final Typeface f2460a;

        /* renamed from: b  reason: collision with root package name */
        final int f2461b;

        e(int i10) {
            this.f2460a = null;
            this.f2461b = i10;
        }

        /* access modifiers changed from: package-private */
        public boolean a() {
            return this.f2461b == 0;
        }

        e(Typeface typeface) {
            this.f2460a = typeface;
            this.f2461b = 0;
        }
    }

    private static String a(e eVar, int i10) {
        return eVar.d() + "-" + i10;
    }

    private static int b(g.a aVar) {
        int i10 = 1;
        if (aVar.c() != 0) {
            return aVar.c() != 1 ? -3 : -2;
        }
        g.b[] b10 = aVar.b();
        if (!(b10 == null || b10.length == 0)) {
            int length = b10.length;
            i10 = 0;
            int i11 = 0;
            while (i11 < length) {
                int b11 = b10[i11].b();
                if (b11 == 0) {
                    i11++;
                } else if (b11 < 0) {
                    return -3;
                } else {
                    return b11;
                }
            }
        }
        return i10;
    }

    static e c(String str, Context context, e eVar, int i10) {
        o.e eVar2 = f2446a;
        Typeface typeface = (Typeface) eVar2.c(str);
        if (typeface != null) {
            return new e(typeface);
        }
        try {
            g.a e10 = d.e(context, eVar, (CancellationSignal) null);
            int b10 = b(e10);
            if (b10 != 0) {
                return new e(b10);
            }
            Typeface b11 = i.b(context, (CancellationSignal) null, e10.b(), i10);
            if (b11 == null) {
                return new e(-3);
            }
            eVar2.d(str, b11);
            return new e(b11);
        } catch (PackageManager.NameNotFoundException unused) {
            return new e(-1);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003d, code lost:
        r9 = new androidx.core.provider.f.c(r0, r5, r6, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0042, code lost:
        if (r8 != null) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0044, code lost:
        r8 = f2447b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0046, code lost:
        androidx.core.provider.h.b(r8, r9, new androidx.core.provider.f.d(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004e, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static android.graphics.Typeface d(android.content.Context r5, androidx.core.provider.e r6, int r7, java.util.concurrent.Executor r8, androidx.core.provider.a r9) {
        /*
            java.lang.String r0 = a(r6, r7)
            o.e r1 = f2446a
            java.lang.Object r1 = r1.c(r0)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            if (r1 == 0) goto L_0x0017
            androidx.core.provider.f$e r5 = new androidx.core.provider.f$e
            r5.<init>((android.graphics.Typeface) r1)
            r9.b(r5)
            return r1
        L_0x0017:
            androidx.core.provider.f$b r1 = new androidx.core.provider.f$b
            r1.<init>(r9)
            java.lang.Object r9 = f2448c
            monitor-enter(r9)
            o.g r2 = f2449d     // Catch:{ all -> 0x002f }
            java.lang.Object r3 = r2.get(r0)     // Catch:{ all -> 0x002f }
            java.util.ArrayList r3 = (java.util.ArrayList) r3     // Catch:{ all -> 0x002f }
            r4 = 0
            if (r3 == 0) goto L_0x0031
            r3.add(r1)     // Catch:{ all -> 0x002f }
            monitor-exit(r9)     // Catch:{ all -> 0x002f }
            return r4
        L_0x002f:
            r5 = move-exception
            goto L_0x004f
        L_0x0031:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x002f }
            r3.<init>()     // Catch:{ all -> 0x002f }
            r3.add(r1)     // Catch:{ all -> 0x002f }
            r2.put(r0, r3)     // Catch:{ all -> 0x002f }
            monitor-exit(r9)     // Catch:{ all -> 0x002f }
            androidx.core.provider.f$c r9 = new androidx.core.provider.f$c
            r9.<init>(r0, r5, r6, r7)
            if (r8 != 0) goto L_0x0046
            java.util.concurrent.ExecutorService r8 = f2447b
        L_0x0046:
            androidx.core.provider.f$d r5 = new androidx.core.provider.f$d
            r5.<init>(r0)
            androidx.core.provider.h.b(r8, r9, r5)
            return r4
        L_0x004f:
            monitor-exit(r9)     // Catch:{ all -> 0x002f }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.provider.f.d(android.content.Context, androidx.core.provider.e, int, java.util.concurrent.Executor, androidx.core.provider.a):android.graphics.Typeface");
    }

    static Typeface e(Context context, e eVar, a aVar, int i10, int i11) {
        String a10 = a(eVar, i10);
        Typeface typeface = (Typeface) f2446a.c(a10);
        if (typeface != null) {
            aVar.b(new e(typeface));
            return typeface;
        } else if (i11 == -1) {
            e c10 = c(a10, context, eVar, i10);
            aVar.b(c10);
            return c10.f2460a;
        } else {
            try {
                e eVar2 = (e) h.c(f2447b, new a(a10, context, eVar, i10), i11);
                aVar.b(eVar2);
                return eVar2.f2460a;
            } catch (InterruptedException unused) {
                aVar.b(new e(-3));
                return null;
            }
        }
    }
}
