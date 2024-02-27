package y0;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.CancellationSignal;
import android.util.Log;
import cm.g;
import cm.l;
import d1.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import pl.x;

public class o {

    /* renamed from: q  reason: collision with root package name */
    public static final a f18339q = new a((g) null);

    /* renamed from: r  reason: collision with root package name */
    private static final String[] f18340r = {"UPDATE", "DELETE", "INSERT"};

    /* renamed from: a  reason: collision with root package name */
    private final u f18341a;

    /* renamed from: b  reason: collision with root package name */
    private final Map f18342b;

    /* renamed from: c  reason: collision with root package name */
    private final Map f18343c;

    /* renamed from: d  reason: collision with root package name */
    private final Map f18344d;

    /* renamed from: e  reason: collision with root package name */
    private final String[] f18345e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public c f18346f;

    /* renamed from: g  reason: collision with root package name */
    private final AtomicBoolean f18347g = new AtomicBoolean(false);

    /* renamed from: h  reason: collision with root package name */
    private volatile boolean f18348h;

    /* renamed from: i  reason: collision with root package name */
    private volatile k f18349i;

    /* renamed from: j  reason: collision with root package name */
    private final b f18350j;

    /* renamed from: k  reason: collision with root package name */
    private final m f18351k;

    /* renamed from: l  reason: collision with root package name */
    private final k.b f18352l;

    /* renamed from: m  reason: collision with root package name */
    private r f18353m;

    /* renamed from: n  reason: collision with root package name */
    private final Object f18354n;

    /* renamed from: o  reason: collision with root package name */
    private final Object f18355o;

    /* renamed from: p  reason: collision with root package name */
    public final Runnable f18356p;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final void a(d1.g gVar) {
            l.f(gVar, "database");
            if (gVar.d0()) {
                gVar.l0();
            } else {
                gVar.j();
            }
        }

        public final String b(String str, String str2) {
            l.f(str, "tableName");
            l.f(str2, "triggerType");
            return "`room_table_modification_trigger_" + str + '_' + str2 + '`';
        }
    }

    public static final class b {

        /* renamed from: e  reason: collision with root package name */
        public static final a f18357e = new a((g) null);

        /* renamed from: a  reason: collision with root package name */
        private final long[] f18358a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean[] f18359b;

        /* renamed from: c  reason: collision with root package name */
        private final int[] f18360c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f18361d;

        public static final class a {
            private a() {
            }

            public /* synthetic */ a(g gVar) {
                this();
            }
        }

        public b(int i10) {
            this.f18358a = new long[i10];
            this.f18359b = new boolean[i10];
            this.f18360c = new int[i10];
        }

        public final int[] a() {
            synchronized (this) {
                try {
                    if (!this.f18361d) {
                        return null;
                    }
                    long[] jArr = this.f18358a;
                    int length = jArr.length;
                    int i10 = 0;
                    int i11 = 0;
                    while (i10 < length) {
                        int i12 = i11 + 1;
                        int i13 = 1;
                        boolean z10 = jArr[i10] > 0;
                        boolean[] zArr = this.f18359b;
                        if (z10 != zArr[i11]) {
                            int[] iArr = this.f18360c;
                            if (!z10) {
                                i13 = 2;
                            }
                            iArr[i11] = i13;
                        } else {
                            this.f18360c[i11] = 0;
                        }
                        zArr[i11] = z10;
                        i10++;
                        i11 = i12;
                    }
                    this.f18361d = false;
                    int[] iArr2 = (int[]) this.f18360c.clone();
                    return iArr2;
                } finally {
                }
            }
        }

        public final boolean b(int... iArr) {
            boolean z10;
            l.f(iArr, "tableIds");
            synchronized (this) {
                try {
                    z10 = false;
                    for (int i10 : iArr) {
                        long[] jArr = this.f18358a;
                        long j10 = jArr[i10];
                        jArr[i10] = 1 + j10;
                        if (j10 == 0) {
                            z10 = true;
                            this.f18361d = true;
                        }
                    }
                    x xVar = x.f30437a;
                } finally {
                }
            }
            return z10;
        }

        public final boolean c(int... iArr) {
            boolean z10;
            l.f(iArr, "tableIds");
            synchronized (this) {
                try {
                    z10 = false;
                    for (int i10 : iArr) {
                        long[] jArr = this.f18358a;
                        long j10 = jArr[i10];
                        jArr[i10] = j10 - 1;
                        if (j10 == 1) {
                            z10 = true;
                            this.f18361d = true;
                        }
                    }
                    x xVar = x.f30437a;
                } finally {
                }
            }
            return z10;
        }

        public final void d() {
            synchronized (this) {
                Arrays.fill(this.f18359b, false);
                this.f18361d = true;
                x xVar = x.f30437a;
            }
        }
    }

    public static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        private final String[] f18362a;

        public c(String[] strArr) {
            l.f(strArr, "tables");
            this.f18362a = strArr;
        }

        public final String[] a() {
            return this.f18362a;
        }

        public abstract boolean b();

        public abstract void c(Set set);
    }

    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        private final c f18363a;

        /* renamed from: b  reason: collision with root package name */
        private final int[] f18364b;

        /* renamed from: c  reason: collision with root package name */
        private final String[] f18365c;

        /* renamed from: d  reason: collision with root package name */
        private final Set f18366d;

        public d(c cVar, int[] iArr, String[] strArr) {
            l.f(cVar, "observer");
            l.f(iArr, "tableIds");
            l.f(strArr, "tableNames");
            this.f18363a = cVar;
            this.f18364b = iArr;
            this.f18365c = strArr;
            this.f18366d = (strArr.length == 0) ^ true ? p0.c(strArr[0]) : q0.d();
            if (iArr.length != strArr.length) {
                throw new IllegalStateException("Check failed.".toString());
            }
        }

        public final int[] a() {
            return this.f18364b;
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x0050  */
        /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(java.util.Set r9) {
            /*
                r8 = this;
                java.lang.String r0 = "invalidatedTablesIds"
                cm.l.f(r9, r0)
                int[] r0 = r8.f18364b
                int r1 = r0.length
                r2 = 1
                if (r1 == 0) goto L_0x0045
                r3 = 0
                if (r1 == r2) goto L_0x0036
                java.util.Set r0 = ql.p0.b()
                int[] r1 = r8.f18364b
                int r4 = r1.length
                r5 = r3
            L_0x0016:
                if (r3 >= r4) goto L_0x0031
                r6 = r1[r3]
                int r7 = r5 + 1
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                boolean r6 = r9.contains(r6)
                if (r6 == 0) goto L_0x002d
                java.lang.String[] r6 = r8.f18365c
                r5 = r6[r5]
                r0.add(r5)
            L_0x002d:
                int r3 = r3 + 1
                r5 = r7
                goto L_0x0016
            L_0x0031:
                java.util.Set r9 = ql.p0.a(r0)
                goto L_0x0049
            L_0x0036:
                r0 = r0[r3]
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                boolean r9 = r9.contains(r0)
                if (r9 == 0) goto L_0x0045
                java.util.Set r9 = r8.f18366d
                goto L_0x0049
            L_0x0045:
                java.util.Set r9 = ql.q0.d()
            L_0x0049:
                boolean r0 = r9.isEmpty()
                r0 = r0 ^ r2
                if (r0 == 0) goto L_0x0055
                y0.o$c r0 = r8.f18363a
                r0.c(r9)
            L_0x0055:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: y0.o.d.b(java.util.Set):void");
        }

        /* JADX WARNING: Removed duplicated region for block: B:23:0x0055  */
        /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void c(java.lang.String[] r12) {
            /*
                r11 = this;
                java.lang.String r0 = "tables"
                cm.l.f(r12, r0)
                java.lang.String[] r0 = r11.f18365c
                int r0 = r0.length
                r1 = 1
                if (r0 == 0) goto L_0x004a
                r2 = 0
                if (r0 == r1) goto L_0x0034
                java.util.Set r0 = ql.p0.b()
                int r3 = r12.length
                r4 = r2
            L_0x0014:
                if (r4 >= r3) goto L_0x002f
                r5 = r12[r4]
                java.lang.String[] r6 = r11.f18365c
                int r7 = r6.length
                r8 = r2
            L_0x001c:
                if (r8 >= r7) goto L_0x002c
                r9 = r6[r8]
                boolean r10 = km.p.o(r9, r5, r1)
                if (r10 == 0) goto L_0x0029
                r0.add(r9)
            L_0x0029:
                int r8 = r8 + 1
                goto L_0x001c
            L_0x002c:
                int r4 = r4 + 1
                goto L_0x0014
            L_0x002f:
                java.util.Set r12 = ql.p0.a(r0)
                goto L_0x004e
            L_0x0034:
                int r0 = r12.length
                r3 = r2
            L_0x0036:
                if (r3 >= r0) goto L_0x004a
                r4 = r12[r3]
                java.lang.String[] r5 = r11.f18365c
                r5 = r5[r2]
                boolean r4 = km.p.o(r4, r5, r1)
                if (r4 == 0) goto L_0x0047
                java.util.Set r12 = r11.f18366d
                goto L_0x004e
            L_0x0047:
                int r3 = r3 + 1
                goto L_0x0036
            L_0x004a:
                java.util.Set r12 = ql.q0.d()
            L_0x004e:
                boolean r0 = r12.isEmpty()
                r0 = r0 ^ r1
                if (r0 == 0) goto L_0x005a
                y0.o$c r0 = r11.f18363a
                r0.c(r12)
            L_0x005a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: y0.o.d.c(java.lang.String[]):void");
        }
    }

    public static final class e implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ o f18367e;

        e(o oVar) {
            this.f18367e = oVar;
        }

        private final Set a() {
            o oVar = this.f18367e;
            Set b10 = p0.b();
            Cursor y10 = u.y(oVar.e(), new d1.a("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"), (CancellationSignal) null, 2, (Object) null);
            while (y10.moveToNext()) {
                try {
                    b10.add(Integer.valueOf(y10.getInt(0)));
                } catch (Throwable th2) {
                    zl.b.a(y10, th);
                    throw th2;
                }
            }
            x xVar = x.f30437a;
            zl.b.a(y10, (Throwable) null);
            Set a10 = p0.a(b10);
            if (!a10.isEmpty()) {
                if (this.f18367e.d() != null) {
                    k d10 = this.f18367e.d();
                    if (d10 != null) {
                        d10.C();
                    } else {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                } else {
                    throw new IllegalStateException("Required value was null.".toString());
                }
            }
            return a10;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0080, code lost:
            if (r0 != null) goto L_0x0082;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0082, code lost:
            r0.e();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a6, code lost:
            if (r0 == null) goto L_0x00c0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x00bd, code lost:
            if (r0 == null) goto L_0x00c0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c5, code lost:
            if ((!r3.isEmpty()) == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x00c7, code lost:
            r0 = r5.f18367e.f();
            r1 = r5.f18367e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:0x00cf, code lost:
            monitor-enter(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
            r1 = r1.f().iterator();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:0x00dc, code lost:
            if (r1.hasNext() == false) goto L_0x00f0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:0x00de, code lost:
            ((y0.o.d) ((java.util.Map.Entry) r1.next()).getValue()).b(r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:0x00ee, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:56:0x00f0, code lost:
            r1 = pl.x.f30437a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:57:0x00f2, code lost:
            monitor-exit(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:0x00f5, code lost:
            throw r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r5 = this;
                y0.o r0 = r5.f18367e
                y0.u r0 = r0.e()
                java.util.concurrent.locks.Lock r0 = r0.k()
                r0.lock()
                r1 = 1
                y0.o r2 = r5.f18367e     // Catch:{ IllegalStateException -> 0x008b, SQLiteException -> 0x0089 }
                boolean r2 = r2.c()     // Catch:{ IllegalStateException -> 0x008b, SQLiteException -> 0x0089 }
                if (r2 != 0) goto L_0x0025
                r0.unlock()
                y0.o r0 = r5.f18367e
                y0.c r0 = r0.f18346f
                if (r0 == 0) goto L_0x0024
                r0.e()
            L_0x0024:
                return
            L_0x0025:
                y0.o r2 = r5.f18367e     // Catch:{ IllegalStateException -> 0x008b, SQLiteException -> 0x0089 }
                java.util.concurrent.atomic.AtomicBoolean r2 = r2.g()     // Catch:{ IllegalStateException -> 0x008b, SQLiteException -> 0x0089 }
                r3 = 0
                boolean r2 = r2.compareAndSet(r1, r3)     // Catch:{ IllegalStateException -> 0x008b, SQLiteException -> 0x0089 }
                if (r2 != 0) goto L_0x0041
                r0.unlock()
                y0.o r0 = r5.f18367e
                y0.c r0 = r0.f18346f
                if (r0 == 0) goto L_0x0040
                r0.e()
            L_0x0040:
                return
            L_0x0041:
                y0.o r2 = r5.f18367e     // Catch:{ IllegalStateException -> 0x008b, SQLiteException -> 0x0089 }
                y0.u r2 = r2.e()     // Catch:{ IllegalStateException -> 0x008b, SQLiteException -> 0x0089 }
                boolean r2 = r2.q()     // Catch:{ IllegalStateException -> 0x008b, SQLiteException -> 0x0089 }
                if (r2 == 0) goto L_0x005c
                r0.unlock()
                y0.o r0 = r5.f18367e
                y0.c r0 = r0.f18346f
                if (r0 == 0) goto L_0x005b
                r0.e()
            L_0x005b:
                return
            L_0x005c:
                y0.o r2 = r5.f18367e     // Catch:{ IllegalStateException -> 0x008b, SQLiteException -> 0x0089 }
                y0.u r2 = r2.e()     // Catch:{ IllegalStateException -> 0x008b, SQLiteException -> 0x0089 }
                d1.h r2 = r2.m()     // Catch:{ IllegalStateException -> 0x008b, SQLiteException -> 0x0089 }
                d1.g r2 = r2.u0()     // Catch:{ IllegalStateException -> 0x008b, SQLiteException -> 0x0089 }
                r2.l0()     // Catch:{ IllegalStateException -> 0x008b, SQLiteException -> 0x0089 }
                java.util.Set r3 = r5.a()     // Catch:{ all -> 0x008d }
                r2.g0()     // Catch:{ all -> 0x008d }
                r2.i()     // Catch:{ IllegalStateException -> 0x008b, SQLiteException -> 0x0089 }
                r0.unlock()
                y0.o r0 = r5.f18367e
                y0.c r0 = r0.f18346f
                if (r0 == 0) goto L_0x00c0
            L_0x0082:
                r0.e()
                goto L_0x00c0
            L_0x0086:
                r1 = move-exception
                goto L_0x00f7
            L_0x0089:
                r2 = move-exception
                goto L_0x0092
            L_0x008b:
                r2 = move-exception
                goto L_0x00a9
            L_0x008d:
                r3 = move-exception
                r2.i()     // Catch:{ IllegalStateException -> 0x008b, SQLiteException -> 0x0089 }
                throw r3     // Catch:{ IllegalStateException -> 0x008b, SQLiteException -> 0x0089 }
            L_0x0092:
                java.lang.String r3 = "ROOM"
                java.lang.String r4 = "Cannot run invalidation tracker. Is the db closed?"
                android.util.Log.e(r3, r4, r2)     // Catch:{ all -> 0x0086 }
                java.util.Set r3 = ql.q0.d()     // Catch:{ all -> 0x0086 }
                r0.unlock()
                y0.o r0 = r5.f18367e
                y0.c r0 = r0.f18346f
                if (r0 == 0) goto L_0x00c0
                goto L_0x0082
            L_0x00a9:
                java.lang.String r3 = "ROOM"
                java.lang.String r4 = "Cannot run invalidation tracker. Is the db closed?"
                android.util.Log.e(r3, r4, r2)     // Catch:{ all -> 0x0086 }
                java.util.Set r3 = ql.q0.d()     // Catch:{ all -> 0x0086 }
                r0.unlock()
                y0.o r0 = r5.f18367e
                y0.c r0 = r0.f18346f
                if (r0 == 0) goto L_0x00c0
                goto L_0x0082
            L_0x00c0:
                boolean r0 = r3.isEmpty()
                r0 = r0 ^ r1
                if (r0 == 0) goto L_0x00f6
                y0.o r0 = r5.f18367e
                k.b r0 = r0.f()
                y0.o r1 = r5.f18367e
                monitor-enter(r0)
                k.b r1 = r1.f()     // Catch:{ all -> 0x00ee }
                java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x00ee }
            L_0x00d8:
                boolean r2 = r1.hasNext()     // Catch:{ all -> 0x00ee }
                if (r2 == 0) goto L_0x00f0
                java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x00ee }
                java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ all -> 0x00ee }
                java.lang.Object r2 = r2.getValue()     // Catch:{ all -> 0x00ee }
                y0.o$d r2 = (y0.o.d) r2     // Catch:{ all -> 0x00ee }
                r2.b(r3)     // Catch:{ all -> 0x00ee }
                goto L_0x00d8
            L_0x00ee:
                r1 = move-exception
                goto L_0x00f4
            L_0x00f0:
                pl.x r1 = pl.x.f30437a     // Catch:{ all -> 0x00ee }
                monitor-exit(r0)
                goto L_0x00f6
            L_0x00f4:
                monitor-exit(r0)
                throw r1
            L_0x00f6:
                return
            L_0x00f7:
                r0.unlock()
                y0.o r0 = r5.f18367e
                y0.c r0 = r0.f18346f
                if (r0 == 0) goto L_0x0105
                r0.e()
            L_0x0105:
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: y0.o.e.run():void");
        }
    }

    public o(u uVar, Map map, Map map2, String... strArr) {
        String str;
        l.f(uVar, "database");
        l.f(map, "shadowTablesMap");
        l.f(map2, "viewTables");
        l.f(strArr, "tableNames");
        this.f18341a = uVar;
        this.f18342b = map;
        this.f18343c = map2;
        this.f18350j = new b(strArr.length);
        this.f18351k = new m(uVar);
        this.f18352l = new k.b();
        this.f18354n = new Object();
        this.f18355o = new Object();
        this.f18344d = new LinkedHashMap();
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i10 = 0; i10 < length; i10++) {
            String str2 = strArr[i10];
            Locale locale = Locale.US;
            l.e(locale, "US");
            String lowerCase = str2.toLowerCase(locale);
            l.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            this.f18344d.put(lowerCase, Integer.valueOf(i10));
            String str3 = (String) this.f18342b.get(strArr[i10]);
            if (str3 != null) {
                l.e(locale, "US");
                str = str3.toLowerCase(locale);
                l.e(str, "this as java.lang.String).toLowerCase(locale)");
            } else {
                str = null;
            }
            if (str != null) {
                lowerCase = str;
            }
            strArr2[i10] = lowerCase;
        }
        this.f18345e = strArr2;
        for (Map.Entry entry : this.f18342b.entrySet()) {
            Locale locale2 = Locale.US;
            l.e(locale2, "US");
            String lowerCase2 = ((String) entry.getValue()).toLowerCase(locale2);
            l.e(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            if (this.f18344d.containsKey(lowerCase2)) {
                l.e(locale2, "US");
                String lowerCase3 = ((String) entry.getKey()).toLowerCase(locale2);
                l.e(lowerCase3, "this as java.lang.String).toLowerCase(locale)");
                Map map3 = this.f18344d;
                map3.put(lowerCase3, i0.h(map3, lowerCase2));
            }
        }
        this.f18356p = new e(this);
    }

    private final String[] n(String[] strArr) {
        Set b10 = p0.b();
        for (String str : strArr) {
            Map map = this.f18343c;
            Locale locale = Locale.US;
            l.e(locale, "US");
            String lowerCase = str.toLowerCase(locale);
            l.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (map.containsKey(lowerCase)) {
                Map map2 = this.f18343c;
                l.e(locale, "US");
                String lowerCase2 = str.toLowerCase(locale);
                l.e(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                Object obj = map2.get(lowerCase2);
                l.c(obj);
                b10.addAll((Collection) obj);
            } else {
                b10.add(str);
            }
        }
        Object[] array = p0.a(b10).toArray(new String[0]);
        l.d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return (String[]) array;
    }

    private final void q(d1.g gVar, int i10) {
        gVar.w("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i10 + ", 0)");
        String str = this.f18345e[i10];
        for (String str2 : f18340r) {
            String str3 = "CREATE TEMP TRIGGER IF NOT EXISTS " + f18339q.b(str, str2) + " AFTER " + str2 + " ON `" + str + "` BEGIN UPDATE " + "room_table_modification_log" + " SET " + "invalidated" + " = 1" + " WHERE " + "table_id" + " = " + i10 + " AND " + "invalidated" + " = 0" + "; END";
            l.e(str3, "StringBuilder().apply(builderAction).toString()");
            gVar.w(str3);
        }
    }

    private final void r(d1.g gVar, int i10) {
        String str = this.f18345e[i10];
        for (String str2 : f18340r) {
            String str3 = "DROP TRIGGER IF EXISTS " + f18339q.b(str, str2);
            l.e(str3, "StringBuilder().apply(builderAction).toString()");
            gVar.w(str3);
        }
    }

    public void b(c cVar) {
        d dVar;
        l.f(cVar, "observer");
        String[] n10 = n(cVar.a());
        ArrayList arrayList = new ArrayList(n10.length);
        int length = n10.length;
        int i10 = 0;
        while (i10 < length) {
            String str = n10[i10];
            Map map = this.f18344d;
            Locale locale = Locale.US;
            l.e(locale, "US");
            String lowerCase = str.toLowerCase(locale);
            l.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            Integer num = (Integer) map.get(lowerCase);
            if (num != null) {
                arrayList.add(Integer.valueOf(num.intValue()));
                i10++;
            } else {
                throw new IllegalArgumentException("There is no table with name " + str);
            }
        }
        int[] s02 = y.s0(arrayList);
        d dVar2 = new d(cVar, s02, n10);
        synchronized (this.f18352l) {
            dVar = (d) this.f18352l.v(cVar, dVar2);
        }
        if (dVar == null && this.f18350j.b(Arrays.copyOf(s02, s02.length))) {
            s();
        }
    }

    public final boolean c() {
        if (!this.f18341a.w()) {
            return false;
        }
        if (!this.f18348h) {
            this.f18341a.m().u0();
        }
        if (this.f18348h) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    public final k d() {
        return this.f18349i;
    }

    public final u e() {
        return this.f18341a;
    }

    public final k.b f() {
        return this.f18352l;
    }

    public final AtomicBoolean g() {
        return this.f18347g;
    }

    public final Map h() {
        return this.f18344d;
    }

    public final void i(d1.g gVar) {
        l.f(gVar, "database");
        synchronized (this.f18355o) {
            if (this.f18348h) {
                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                return;
            }
            gVar.w("PRAGMA temp_store = MEMORY;");
            gVar.w("PRAGMA recursive_triggers='ON';");
            gVar.w("CREATE TEMP TABLE room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            t(gVar);
            this.f18349i = gVar.D("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1");
            this.f18348h = true;
            x xVar = x.f30437a;
        }
    }

    public final void j(String... strArr) {
        l.f(strArr, "tables");
        synchronized (this.f18352l) {
            try {
                for (Map.Entry entry : this.f18352l) {
                    l.e(entry, "(observer, wrapper)");
                    d dVar = (d) entry.getValue();
                    if (!((c) entry.getKey()).b()) {
                        dVar.c(strArr);
                    }
                }
                x xVar = x.f30437a;
            } finally {
            }
        }
    }

    public final void k() {
        synchronized (this.f18355o) {
            this.f18348h = false;
            this.f18350j.d();
            x xVar = x.f30437a;
        }
    }

    public void l() {
        if (this.f18347g.compareAndSet(false, true)) {
            c cVar = this.f18346f;
            if (cVar != null) {
                cVar.j();
            }
            this.f18341a.n().execute(this.f18356p);
        }
    }

    public void m(c cVar) {
        d dVar;
        l.f(cVar, "observer");
        synchronized (this.f18352l) {
            dVar = (d) this.f18352l.y(cVar);
        }
        if (dVar != null) {
            b bVar = this.f18350j;
            int[] a10 = dVar.a();
            if (bVar.c(Arrays.copyOf(a10, a10.length))) {
                s();
            }
        }
    }

    public final void o(c cVar) {
        l.f(cVar, "autoCloser");
        this.f18346f = cVar;
        cVar.m(new n(this));
    }

    public final void p(Context context, String str, Intent intent) {
        l.f(context, "context");
        l.f(str, "name");
        l.f(intent, "serviceIntent");
        this.f18353m = new r(context, str, intent, this, this.f18341a.n());
    }

    public final void s() {
        if (this.f18341a.w()) {
            t(this.f18341a.m().u0());
        }
    }

    public final void t(d1.g gVar) {
        Lock k10;
        l.f(gVar, "database");
        if (!gVar.T()) {
            try {
                k10 = this.f18341a.k();
                k10.lock();
                synchronized (this.f18354n) {
                    int[] a10 = this.f18350j.a();
                    if (a10 == null) {
                        k10.unlock();
                        return;
                    }
                    f18339q.a(gVar);
                    try {
                        int length = a10.length;
                        int i10 = 0;
                        int i11 = 0;
                        while (i10 < length) {
                            int i12 = a10[i10];
                            int i13 = i11 + 1;
                            if (i12 == 1) {
                                q(gVar, i11);
                            } else if (i12 == 2) {
                                r(gVar, i11);
                            }
                            i10++;
                            i11 = i13;
                        }
                        gVar.g0();
                        gVar.i();
                        x xVar = x.f30437a;
                        k10.unlock();
                    } finally {
                        gVar.i();
                    }
                }
            } catch (SQLiteException | IllegalStateException e10) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e10);
            } catch (Throwable th2) {
                k10.unlock();
                throw th2;
            }
        }
    }
}
