package y0;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import android.util.Log;
import cm.l;
import cm.m;
import d1.h;
import d1.j;
import d1.k;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public abstract class u {

    /* renamed from: o  reason: collision with root package name */
    public static final c f18388o = new c((cm.g) null);
    /* access modifiers changed from: protected */

    /* renamed from: a  reason: collision with root package name */
    public volatile d1.g f18389a;

    /* renamed from: b  reason: collision with root package name */
    private Executor f18390b;

    /* renamed from: c  reason: collision with root package name */
    private Executor f18391c;

    /* renamed from: d  reason: collision with root package name */
    private d1.h f18392d;

    /* renamed from: e  reason: collision with root package name */
    private final o f18393e = g();

    /* renamed from: f  reason: collision with root package name */
    private boolean f18394f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f18395g;
    /* access modifiers changed from: protected */

    /* renamed from: h  reason: collision with root package name */
    public List f18396h;

    /* renamed from: i  reason: collision with root package name */
    private Map f18397i = new LinkedHashMap();

    /* renamed from: j  reason: collision with root package name */
    private final ReentrantReadWriteLock f18398j = new ReentrantReadWriteLock();

    /* renamed from: k  reason: collision with root package name */
    private c f18399k;

    /* renamed from: l  reason: collision with root package name */
    private final ThreadLocal f18400l = new ThreadLocal();

    /* renamed from: m  reason: collision with root package name */
    private final Map f18401m;

    /* renamed from: n  reason: collision with root package name */
    private final Map f18402n;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final Context f18403a;

        /* renamed from: b  reason: collision with root package name */
        private final Class f18404b;

        /* renamed from: c  reason: collision with root package name */
        private final String f18405c;

        /* renamed from: d  reason: collision with root package name */
        private final List f18406d = new ArrayList();

        /* renamed from: e  reason: collision with root package name */
        private final List f18407e = new ArrayList();

        /* renamed from: f  reason: collision with root package name */
        private List f18408f = new ArrayList();

        /* renamed from: g  reason: collision with root package name */
        private Executor f18409g;

        /* renamed from: h  reason: collision with root package name */
        private Executor f18410h;

        /* renamed from: i  reason: collision with root package name */
        private h.c f18411i;

        /* renamed from: j  reason: collision with root package name */
        private boolean f18412j;

        /* renamed from: k  reason: collision with root package name */
        private d f18413k = d.AUTOMATIC;

        /* renamed from: l  reason: collision with root package name */
        private Intent f18414l;

        /* renamed from: m  reason: collision with root package name */
        private boolean f18415m = true;

        /* renamed from: n  reason: collision with root package name */
        private boolean f18416n;

        /* renamed from: o  reason: collision with root package name */
        private long f18417o = -1;

        /* renamed from: p  reason: collision with root package name */
        private TimeUnit f18418p;

        /* renamed from: q  reason: collision with root package name */
        private final e f18419q = new e();

        /* renamed from: r  reason: collision with root package name */
        private Set f18420r = new LinkedHashSet();

        /* renamed from: s  reason: collision with root package name */
        private Set f18421s;

        /* renamed from: t  reason: collision with root package name */
        private String f18422t;

        /* renamed from: u  reason: collision with root package name */
        private File f18423u;

        /* renamed from: v  reason: collision with root package name */
        private Callable f18424v;

        public a(Context context, Class cls, String str) {
            l.f(context, "context");
            l.f(cls, "klass");
            this.f18403a = context;
            this.f18404b = cls;
            this.f18405c = str;
        }

        public a a(b bVar) {
            l.f(bVar, "callback");
            this.f18406d.add(bVar);
            return this;
        }

        public a b(z0.b... bVarArr) {
            l.f(bVarArr, "migrations");
            if (this.f18421s == null) {
                this.f18421s = new HashSet();
            }
            for (z0.b bVar : bVarArr) {
                Set set = this.f18421s;
                l.c(set);
                set.add(Integer.valueOf(bVar.f18710a));
                Set set2 = this.f18421s;
                l.c(set2);
                set2.add(Integer.valueOf(bVar.f18711b));
            }
            this.f18419q.b((z0.b[]) Arrays.copyOf(bVarArr, bVarArr.length));
            return this;
        }

        public a c() {
            this.f18412j = true;
            return this;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0026  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x006a  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0073  */
        /* JADX WARNING: Removed duplicated region for block: B:68:0x00fc  */
        /* JADX WARNING: Removed duplicated region for block: B:70:0x0100  */
        /* JADX WARNING: Removed duplicated region for block: B:80:0x0162  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public y0.u d() {
            /*
                r24 = this;
                r0 = r24
                java.util.concurrent.Executor r1 = r0.f18409g
                if (r1 != 0) goto L_0x0013
                java.util.concurrent.Executor r2 = r0.f18410h
                if (r2 != 0) goto L_0x0013
                java.util.concurrent.Executor r1 = j.c.f()
                r0.f18410h = r1
            L_0x0010:
                r0.f18409g = r1
                goto L_0x0021
            L_0x0013:
                if (r1 == 0) goto L_0x001c
                java.util.concurrent.Executor r2 = r0.f18410h
                if (r2 != 0) goto L_0x001c
                r0.f18410h = r1
                goto L_0x0021
            L_0x001c:
                if (r1 != 0) goto L_0x0021
                java.util.concurrent.Executor r1 = r0.f18410h
                goto L_0x0010
            L_0x0021:
                java.util.Set r1 = r0.f18421s
                r2 = 1
                if (r1 == 0) goto L_0x0066
                cm.l.c(r1)
                java.util.Iterator r1 = r1.iterator()
            L_0x002d:
                boolean r3 = r1.hasNext()
                if (r3 == 0) goto L_0x0066
                java.lang.Object r3 = r1.next()
                java.lang.Number r3 = (java.lang.Number) r3
                int r3 = r3.intValue()
                java.util.Set r4 = r0.f18420r
                java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
                boolean r4 = r4.contains(r5)
                r4 = r4 ^ r2
                if (r4 == 0) goto L_0x004b
                goto L_0x002d
            L_0x004b:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: "
                r1.append(r2)
                r1.append(r3)
                java.lang.String r1 = r1.toString()
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r1 = r1.toString()
                r2.<init>(r1)
                throw r2
            L_0x0066:
                d1.h$c r1 = r0.f18411i
                if (r1 != 0) goto L_0x006f
                e1.f r1 = new e1.f
                r1.<init>()
            L_0x006f:
                java.lang.String r3 = "Required value was null."
                if (r1 == 0) goto L_0x00fc
                long r4 = r0.f18417o
                r6 = 0
                int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r4 <= 0) goto L_0x00b5
                java.lang.String r4 = r0.f18405c
                if (r4 == 0) goto L_0x00a9
                y0.c r4 = new y0.c
                long r5 = r0.f18417o
                java.util.concurrent.TimeUnit r7 = r0.f18418p
                if (r7 == 0) goto L_0x009f
                java.util.concurrent.Executor r8 = r0.f18409g
                if (r8 == 0) goto L_0x0095
                r4.<init>(r5, r7, r8)
                y0.e r5 = new y0.e
                r5.<init>(r1, r4)
                r1 = r5
                goto L_0x00b5
            L_0x0095:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = r3.toString()
                r1.<init>(r2)
                throw r1
            L_0x009f:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = r3.toString()
                r1.<init>(r2)
                throw r1
            L_0x00a9:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "Cannot create auto-closing database for an in-memory database."
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            L_0x00b5:
                java.lang.String r4 = r0.f18422t
                if (r4 != 0) goto L_0x00c1
                java.io.File r5 = r0.f18423u
                if (r5 != 0) goto L_0x00c1
                java.util.concurrent.Callable r5 = r0.f18424v
                if (r5 == 0) goto L_0x00e2
            L_0x00c1:
                java.lang.String r5 = r0.f18405c
                if (r5 == 0) goto L_0x00f0
                r5 = 0
                if (r4 != 0) goto L_0x00ca
                r6 = r5
                goto L_0x00cb
            L_0x00ca:
                r6 = r2
            L_0x00cb:
                java.io.File r7 = r0.f18423u
                if (r7 != 0) goto L_0x00d1
                r8 = r5
                goto L_0x00d2
            L_0x00d1:
                r8 = r2
            L_0x00d2:
                java.util.concurrent.Callable r9 = r0.f18424v
                if (r9 != 0) goto L_0x00d7
                goto L_0x00d8
            L_0x00d7:
                r5 = r2
            L_0x00d8:
                int r6 = r6 + r8
                int r6 = r6 + r5
                if (r6 != r2) goto L_0x00e4
                y0.z r2 = new y0.z
                r2.<init>(r4, r7, r9, r1)
                r1 = r2
            L_0x00e2:
                r7 = r1
                goto L_0x00fe
            L_0x00e4:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "More than one of createFromAsset(), createFromInputStream(), and createFromFile() were called on this Builder, but the database can only be created using one of the three configurations."
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            L_0x00f0:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "Cannot create from asset or file for an in-memory database."
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            L_0x00fc:
                r1 = 0
                goto L_0x00e2
            L_0x00fe:
                if (r7 == 0) goto L_0x0162
                y0.f r1 = new y0.f
                android.content.Context r5 = r0.f18403a
                java.lang.String r6 = r0.f18405c
                y0.u$e r8 = r0.f18419q
                java.util.List r9 = r0.f18406d
                boolean r10 = r0.f18412j
                y0.u$d r2 = r0.f18413k
                y0.u$d r11 = r2.c(r5)
                java.util.concurrent.Executor r12 = r0.f18409g
                if (r12 == 0) goto L_0x0158
                java.util.concurrent.Executor r13 = r0.f18410h
                if (r13 == 0) goto L_0x014e
                android.content.Intent r14 = r0.f18414l
                boolean r15 = r0.f18415m
                boolean r2 = r0.f18416n
                r16 = r2
                java.util.Set r2 = r0.f18420r
                r17 = r2
                java.lang.String r2 = r0.f18422t
                r18 = r2
                java.io.File r2 = r0.f18423u
                r19 = r2
                java.util.concurrent.Callable r2 = r0.f18424v
                r20 = r2
                r21 = 0
                java.util.List r2 = r0.f18407e
                r22 = r2
                java.util.List r2 = r0.f18408f
                r23 = r2
                r4 = r1
                r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
                java.lang.Class r2 = r0.f18404b
                java.lang.String r3 = "_Impl"
                java.lang.Object r2 = y0.t.b(r2, r3)
                y0.u r2 = (y0.u) r2
                r2.r(r1)
                return r2
            L_0x014e:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = r3.toString()
                r1.<init>(r2)
                throw r1
            L_0x0158:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = r3.toString()
                r1.<init>(r2)
                throw r1
            L_0x0162:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = r3.toString()
                r1.<init>(r2)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: y0.u.a.d():y0.u");
        }

        public a e() {
            this.f18415m = false;
            this.f18416n = true;
            return this;
        }

        public a f(h.c cVar) {
            this.f18411i = cVar;
            return this;
        }

        public a g(Executor executor) {
            l.f(executor, "executor");
            this.f18409g = executor;
            return this;
        }
    }

    public static abstract class b {
        public void a(d1.g gVar) {
            l.f(gVar, "db");
        }

        public void b(d1.g gVar) {
            l.f(gVar, "db");
        }

        public void c(d1.g gVar) {
            l.f(gVar, "db");
        }
    }

    public static final class c {
        private c() {
        }

        public /* synthetic */ c(cm.g gVar) {
            this();
        }
    }

    public enum d {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING;

        private final boolean b(ActivityManager activityManager) {
            return d1.c.b(activityManager);
        }

        public final d c(Context context) {
            l.f(context, "context");
            if (this != AUTOMATIC) {
                return this;
            }
            Object systemService = context.getSystemService("activity");
            l.d(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            return !b((ActivityManager) systemService) ? WRITE_AHEAD_LOGGING : TRUNCATE;
        }
    }

    public static class e {

        /* renamed from: a  reason: collision with root package name */
        private final Map f18429a = new LinkedHashMap();

        private final void a(z0.b bVar) {
            int i10 = bVar.f18710a;
            int i11 = bVar.f18711b;
            Map map = this.f18429a;
            Integer valueOf = Integer.valueOf(i10);
            Object obj = map.get(valueOf);
            if (obj == null) {
                obj = new TreeMap();
                map.put(valueOf, obj);
            }
            TreeMap treeMap = (TreeMap) obj;
            if (treeMap.containsKey(Integer.valueOf(i11))) {
                Log.w("ROOM", "Overriding migration " + treeMap.get(Integer.valueOf(i11)) + " with " + bVar);
            }
            treeMap.put(Integer.valueOf(i11), bVar);
        }

        private final List e(List list, boolean z10, int i10, int i11) {
            boolean z11;
            Integer num;
            do {
                if (z10) {
                    if (i10 >= i11) {
                        return list;
                    }
                } else if (i10 <= i11) {
                    return list;
                }
                TreeMap treeMap = (TreeMap) this.f18429a.get(Integer.valueOf(i10));
                if (treeMap == null) {
                    return null;
                }
                Iterator it = (z10 ? treeMap.descendingKeySet() : treeMap.keySet()).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z11 = false;
                        continue;
                        break;
                    }
                    num = (Integer) it.next();
                    if (!z10) {
                        l.e(num, "targetVersion");
                        int intValue = num.intValue();
                        if (i11 <= intValue && intValue < i10) {
                            break;
                        }
                    } else {
                        int i12 = i10 + 1;
                        l.e(num, "targetVersion");
                        int intValue2 = num.intValue();
                        if (i12 <= intValue2 && intValue2 <= i11) {
                            break;
                        }
                    }
                }
                Object obj = treeMap.get(num);
                l.c(obj);
                list.add(obj);
                i10 = num.intValue();
                z11 = true;
                continue;
            } while (z11);
            return null;
        }

        public void b(z0.b... bVarArr) {
            l.f(bVarArr, "migrations");
            for (z0.b a10 : bVarArr) {
                a(a10);
            }
        }

        public final boolean c(int i10, int i11) {
            Map f10 = f();
            if (!f10.containsKey(Integer.valueOf(i10))) {
                return false;
            }
            Map map = (Map) f10.get(Integer.valueOf(i10));
            if (map == null) {
                map = i0.g();
            }
            return map.containsKey(Integer.valueOf(i11));
        }

        public List d(int i10, int i11) {
            if (i10 == i11) {
                return q.i();
            }
            return e(new ArrayList(), i11 > i10, i10, i11);
        }

        public Map f() {
            return this.f18429a;
        }
    }

    public static abstract class f {
    }

    static final class g extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ u f18430e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(u uVar) {
            super(1);
            this.f18430e = uVar;
        }

        /* renamed from: b */
        public final Object invoke(d1.g gVar) {
            l.f(gVar, "it");
            this.f18430e.s();
            return null;
        }
    }

    static final class h extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ u f18431e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(u uVar) {
            super(1);
            this.f18431e = uVar;
        }

        /* renamed from: b */
        public final Object invoke(d1.g gVar) {
            l.f(gVar, "it");
            this.f18431e.t();
            return null;
        }
    }

    public u() {
        Map synchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        l.e(synchronizedMap, "synchronizedMap(mutableMapOf())");
        this.f18401m = synchronizedMap;
        this.f18402n = new LinkedHashMap();
    }

    private final Object B(Class cls, d1.h hVar) {
        if (cls.isInstance(hVar)) {
            return hVar;
        }
        if (hVar instanceof g) {
            return B(cls, ((g) hVar).c());
        }
        return null;
    }

    /* access modifiers changed from: private */
    public final void s() {
        c();
        d1.g u02 = m().u0();
        l().t(u02);
        if (u02.d0()) {
            u02.l0();
        } else {
            u02.j();
        }
    }

    /* access modifiers changed from: private */
    public final void t() {
        m().u0().i();
        if (!q()) {
            l().l();
        }
    }

    public static /* synthetic */ Cursor y(u uVar, j jVar, CancellationSignal cancellationSignal, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 2) != 0) {
                cancellationSignal = null;
            }
            return uVar.x(jVar, cancellationSignal);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: query");
    }

    public void A() {
        m().u0().g0();
    }

    public void c() {
        if (!this.f18394f && !(!v())) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.".toString());
        }
    }

    public void d() {
        if (!q() && this.f18400l.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.".toString());
        }
    }

    public void e() {
        c();
        c cVar = this.f18399k;
        if (cVar == null) {
            s();
        } else {
            cVar.g(new g(this));
        }
    }

    public k f(String str) {
        l.f(str, "sql");
        c();
        d();
        return m().u0().D(str);
    }

    /* access modifiers changed from: protected */
    public abstract o g();

    /* access modifiers changed from: protected */
    public abstract d1.h h(f fVar);

    public void i() {
        c cVar = this.f18399k;
        if (cVar == null) {
            t();
        } else {
            cVar.g(new h(this));
        }
    }

    public List j(Map map) {
        l.f(map, "autoMigrationSpecs");
        return q.i();
    }

    public final Lock k() {
        ReentrantReadWriteLock.ReadLock readLock = this.f18398j.readLock();
        l.e(readLock, "readWriteLock.readLock()");
        return readLock;
    }

    public o l() {
        return this.f18393e;
    }

    public d1.h m() {
        d1.h hVar = this.f18392d;
        if (hVar != null) {
            return hVar;
        }
        l.v("internalOpenHelper");
        return null;
    }

    public Executor n() {
        Executor executor = this.f18390b;
        if (executor != null) {
            return executor;
        }
        l.v("internalQueryExecutor");
        return null;
    }

    public Set o() {
        return q0.d();
    }

    /* access modifiers changed from: protected */
    public Map p() {
        return i0.g();
    }

    public boolean q() {
        return m().u0().T();
    }

    public void r(f fVar) {
        boolean z10;
        l.f(fVar, "configuration");
        this.f18392d = h(fVar);
        Set o10 = o();
        BitSet bitSet = new BitSet();
        Iterator it = o10.iterator();
        while (true) {
            int i10 = -1;
            if (it.hasNext()) {
                Class cls = (Class) it.next();
                int size = fVar.f18329r.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i11 = size - 1;
                        if (cls.isAssignableFrom(fVar.f18329r.get(size).getClass())) {
                            bitSet.set(size);
                            i10 = size;
                            break;
                        } else if (i11 < 0) {
                            break;
                        } else {
                            size = i11;
                        }
                    }
                }
                if (i10 >= 0) {
                    this.f18397i.put(cls, fVar.f18329r.get(i10));
                } else {
                    throw new IllegalArgumentException(("A required auto migration spec (" + cls.getCanonicalName() + ") is missing in the database configuration.").toString());
                }
            } else {
                int size2 = fVar.f18329r.size() - 1;
                if (size2 >= 0) {
                    while (true) {
                        int i12 = size2 - 1;
                        if (!bitSet.get(size2)) {
                            throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.".toString());
                        } else if (i12 < 0) {
                            break;
                        } else {
                            size2 = i12;
                        }
                    }
                }
                Iterator it2 = j(this.f18397i).iterator();
                while (true) {
                    z10 = false;
                    if (!it2.hasNext()) {
                        break;
                    }
                    z0.b bVar = (z0.b) it2.next();
                    if (!fVar.f18315d.c(bVar.f18710a, bVar.f18711b)) {
                        fVar.f18315d.b(bVar);
                    }
                }
                y yVar = (y) B(y.class, m());
                if (yVar != null) {
                    yVar.g(fVar);
                }
                d dVar = (d) B(d.class, m());
                if (dVar != null) {
                    this.f18399k = dVar.f18285f;
                    l().o(dVar.f18285f);
                }
                if (fVar.f18318g == d.WRITE_AHEAD_LOGGING) {
                    z10 = true;
                }
                m().setWriteAheadLoggingEnabled(z10);
                this.f18396h = fVar.f18316e;
                this.f18390b = fVar.f18319h;
                this.f18391c = new c0(fVar.f18320i);
                this.f18394f = fVar.f18317f;
                this.f18395g = z10;
                if (fVar.f18321j != null) {
                    if (fVar.f18313b != null) {
                        l().p(fVar.f18312a, fVar.f18313b, fVar.f18321j);
                    } else {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                }
                Map p10 = p();
                BitSet bitSet2 = new BitSet();
                for (Map.Entry entry : p10.entrySet()) {
                    Class cls2 = (Class) entry.getKey();
                    Iterator it3 = ((List) entry.getValue()).iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            Class cls3 = (Class) it3.next();
                            int size3 = fVar.f18328q.size() - 1;
                            if (size3 >= 0) {
                                while (true) {
                                    int i13 = size3 - 1;
                                    if (cls3.isAssignableFrom(fVar.f18328q.get(size3).getClass())) {
                                        bitSet2.set(size3);
                                        break;
                                    } else if (i13 < 0) {
                                        break;
                                    } else {
                                        size3 = i13;
                                    }
                                }
                            }
                            size3 = -1;
                            if (size3 >= 0) {
                                this.f18402n.put(cls3, fVar.f18328q.get(size3));
                            } else {
                                throw new IllegalArgumentException(("A required type converter (" + cls3 + ") for " + cls2.getCanonicalName() + " is missing in the database configuration.").toString());
                            }
                        }
                    }
                }
                int size4 = fVar.f18328q.size() - 1;
                if (size4 >= 0) {
                    while (true) {
                        int i14 = size4 - 1;
                        if (!bitSet2.get(size4)) {
                            throw new IllegalArgumentException("Unexpected type converter " + fVar.f18328q.get(size4) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                        } else if (i14 >= 0) {
                            size4 = i14;
                        } else {
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void u(d1.g gVar) {
        l.f(gVar, "db");
        l().i(gVar);
    }

    public final boolean v() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public boolean w() {
        Boolean bool;
        boolean isOpen;
        c cVar = this.f18399k;
        if (cVar != null) {
            isOpen = cVar.l();
        } else {
            d1.g gVar = this.f18389a;
            if (gVar != null) {
                isOpen = gVar.isOpen();
            } else {
                bool = null;
                return l.a(bool, Boolean.TRUE);
            }
        }
        bool = Boolean.valueOf(isOpen);
        return l.a(bool, Boolean.TRUE);
    }

    public Cursor x(j jVar, CancellationSignal cancellationSignal) {
        l.f(jVar, "query");
        c();
        d();
        return cancellationSignal != null ? m().u0().a0(jVar, cancellationSignal) : m().u0().h0(jVar);
    }

    public Object z(Callable callable) {
        l.f(callable, "body");
        e();
        try {
            Object call = callable.call();
            A();
            return call;
        } finally {
            i();
        }
    }
}
