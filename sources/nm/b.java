package nm;

import bm.l;
import bm.q;
import cm.y;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.jvm.internal.h;
import lm.j;
import lm.j2;
import lm.k;
import lm.m;
import pl.p;
import pl.x;
import qm.e;
import qm.e0;
import qm.f0;
import qm.g0;
import qm.h0;
import qm.q0;
import qm.z;

public class b implements d {
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static final AtomicLongFieldUpdater f29904h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public static final AtomicLongFieldUpdater f29905i;

    /* renamed from: j  reason: collision with root package name */
    private static final AtomicLongFieldUpdater f29906j;

    /* renamed from: k  reason: collision with root package name */
    private static final AtomicLongFieldUpdater f29907k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f29908l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f29909m;

    /* renamed from: n  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f29910n;

    /* renamed from: o  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f29911o;

    /* renamed from: p  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f29912p;
    private volatile Object _closeCause;
    private volatile long bufferEnd;
    private volatile Object bufferEndSegment;
    private volatile Object closeHandler;
    private volatile long completedExpandBuffersAndPauseFlag;

    /* renamed from: e  reason: collision with root package name */
    private final int f29913e;

    /* renamed from: f  reason: collision with root package name */
    public final l f29914f;

    /* renamed from: g  reason: collision with root package name */
    private final q f29915g;
    private volatile Object receiveSegment;
    private volatile long receivers;
    private volatile Object sendSegment;
    private volatile long sendersAndCloseStatus;

    private final class a implements f, j2 {
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public Object f29916e = c.f29947p;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public k f29917f;

        public a() {
        }

        private final Object f(j jVar, int i10, long j10, tl.d dVar) {
            Boolean a10;
            b bVar = b.this;
            k b10 = m.b(c.b(dVar));
            try {
                this.f29917f = b10;
                Object w10 = bVar.C0(jVar, i10, j10, this);
                if (w10 == c.f29944m) {
                    bVar.n0(this, jVar, i10);
                } else {
                    l lVar = null;
                    if (w10 == c.f29946o) {
                        if (j10 < bVar.Q()) {
                            jVar.b();
                        }
                        j jVar2 = (j) b.f29909m.get(bVar);
                        while (true) {
                            if (bVar.X()) {
                                h();
                                break;
                            }
                            long andIncrement = b.f29905i.getAndIncrement(bVar);
                            int i11 = c.f29933b;
                            long j11 = andIncrement / ((long) i11);
                            int i12 = (int) (andIncrement % ((long) i11));
                            if (jVar2.f30812g != j11) {
                                j c10 = bVar.J(j11, jVar2);
                                if (c10 != null) {
                                    jVar2 = c10;
                                }
                            }
                            Object w11 = bVar.C0(jVar2, i12, andIncrement, this);
                            if (w11 == c.f29944m) {
                                bVar.n0(this, jVar2, i12);
                                break;
                            } else if (w11 == c.f29946o) {
                                if (andIncrement < bVar.Q()) {
                                    jVar2.b();
                                }
                            } else if (w11 != c.f29945n) {
                                jVar2.b();
                                this.f29916e = w11;
                                this.f29917f = null;
                                a10 = kotlin.coroutines.jvm.internal.b.a(true);
                                l lVar2 = bVar.f29914f;
                                if (lVar2 != null) {
                                    lVar = z.a(lVar2, w11, b10.getContext());
                                }
                            } else {
                                throw new IllegalStateException("unexpected".toString());
                            }
                        }
                    } else {
                        jVar.b();
                        this.f29916e = w10;
                        this.f29917f = null;
                        a10 = kotlin.coroutines.jvm.internal.b.a(true);
                        l lVar3 = bVar.f29914f;
                        if (lVar3 != null) {
                            lVar = z.a(lVar3, w10, b10.getContext());
                        }
                    }
                    b10.J(a10, lVar);
                }
                Object v10 = b10.v();
                if (v10 == d.c()) {
                    h.c(dVar);
                }
                return v10;
            } catch (Throwable th2) {
                b10.H();
                throw th2;
            }
        }

        private final boolean g() {
            this.f29916e = c.z();
            Throwable M = b.this.M();
            if (M == null) {
                return false;
            }
            throw g0.a(M);
        }

        /* access modifiers changed from: private */
        public final void h() {
            Object a10;
            k kVar = this.f29917f;
            cm.l.c(kVar);
            this.f29917f = null;
            this.f29916e = c.z();
            Throwable M = b.this.M();
            if (M == null) {
                p.a aVar = p.f30426e;
                a10 = Boolean.FALSE;
            } else {
                p.a aVar2 = p.f30426e;
                a10 = pl.q.a(M);
            }
            kVar.resumeWith(p.a(a10));
        }

        public void a(e0 e0Var, int i10) {
            k kVar = this.f29917f;
            if (kVar != null) {
                kVar.a(e0Var, i10);
            }
        }

        public Object b(tl.d dVar) {
            boolean g10;
            j jVar;
            b bVar = b.this;
            j jVar2 = (j) b.f29909m.get(bVar);
            while (true) {
                if (bVar.X()) {
                    g10 = g();
                    break;
                }
                long andIncrement = b.f29905i.getAndIncrement(bVar);
                int i10 = c.f29933b;
                long j10 = andIncrement / ((long) i10);
                int i11 = (int) (andIncrement % ((long) i10));
                if (jVar2.f30812g != j10) {
                    j c10 = bVar.J(j10, jVar2);
                    if (c10 == null) {
                        continue;
                    } else {
                        jVar = c10;
                    }
                } else {
                    jVar = jVar2;
                }
                Object w10 = bVar.C0(jVar, i11, andIncrement, (Object) null);
                if (w10 == c.f29944m) {
                    throw new IllegalStateException("unreachable".toString());
                } else if (w10 == c.f29946o) {
                    if (andIncrement < bVar.Q()) {
                        jVar.b();
                    }
                    jVar2 = jVar;
                } else if (w10 == c.f29945n) {
                    return f(jVar, i11, andIncrement, dVar);
                } else {
                    jVar.b();
                    this.f29916e = w10;
                    g10 = true;
                }
            }
            return kotlin.coroutines.jvm.internal.b.a(g10);
        }

        public final boolean i(Object obj) {
            k kVar = this.f29917f;
            cm.l.c(kVar);
            l lVar = null;
            this.f29917f = null;
            this.f29916e = obj;
            Boolean bool = Boolean.TRUE;
            l lVar2 = b.this.f29914f;
            if (lVar2 != null) {
                lVar = z.a(lVar2, obj, kVar.getContext());
            }
            return c.B(kVar, bool, lVar);
        }

        public final void j() {
            Object a10;
            k kVar = this.f29917f;
            cm.l.c(kVar);
            this.f29917f = null;
            this.f29916e = c.z();
            Throwable M = b.this.M();
            if (M == null) {
                p.a aVar = p.f30426e;
                a10 = Boolean.FALSE;
            } else {
                p.a aVar2 = p.f30426e;
                a10 = pl.q.a(M);
            }
            kVar.resumeWith(p.a(a10));
        }

        public Object next() {
            Object obj = this.f29916e;
            if (obj != c.f29947p) {
                this.f29916e = c.f29947p;
                if (obj != c.z()) {
                    return obj;
                }
                throw g0.a(b.this.N());
            }
            throw new IllegalStateException("`hasNext()` has not been invoked".toString());
        }
    }

    /* renamed from: nm.b$b  reason: collision with other inner class name */
    static final class C0326b extends cm.m implements q {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ b f29919e;

        /* renamed from: nm.b$b$a */
        static final class a extends cm.m implements l {

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ Object f29920e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ b f29921f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(Object obj, b bVar, tm.a aVar) {
                super(1);
                this.f29920e = obj;
                this.f29921f = bVar;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return x.f30437a;
            }

            public final void invoke(Throwable th2) {
                if (this.f29920e != c.z()) {
                    l lVar = this.f29921f.f29914f;
                    throw null;
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0326b(b bVar) {
            super(3);
            this.f29919e = bVar;
        }

        public final l b(tm.a aVar, Object obj, Object obj2) {
            return new a(obj2, this.f29919e, aVar);
        }

        public /* bridge */ /* synthetic */ Object g(Object obj, Object obj2, Object obj3) {
            android.support.v4.media.session.b.a(obj);
            return b((tm.a) null, obj2, obj3);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f29922e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ b f29923f;

        /* renamed from: g  reason: collision with root package name */
        int f29924g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(b bVar, tl.d dVar) {
            super(dVar);
            this.f29923f = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f29922e = obj;
            this.f29924g |= Integer.MIN_VALUE;
            Object p02 = b.p0(this.f29923f, this);
            return p02 == d.c() ? p02 : h.b(p02);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: e  reason: collision with root package name */
        Object f29925e;

        /* renamed from: f  reason: collision with root package name */
        Object f29926f;

        /* renamed from: g  reason: collision with root package name */
        int f29927g;

        /* renamed from: h  reason: collision with root package name */
        long f29928h;

        /* renamed from: i  reason: collision with root package name */
        /* synthetic */ Object f29929i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ b f29930j;

        /* renamed from: k  reason: collision with root package name */
        int f29931k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(b bVar, tl.d dVar) {
            super(dVar);
            this.f29930j = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f29929i = obj;
            this.f29931k |= Integer.MIN_VALUE;
            Object v10 = this.f29930j.q0((j) null, 0, 0, this);
            return v10 == d.c() ? v10 : h.b(v10);
        }
    }

    static {
        Class<b> cls = b.class;
        f29904h = AtomicLongFieldUpdater.newUpdater(cls, "sendersAndCloseStatus");
        f29905i = AtomicLongFieldUpdater.newUpdater(cls, "receivers");
        f29906j = AtomicLongFieldUpdater.newUpdater(cls, "bufferEnd");
        f29907k = AtomicLongFieldUpdater.newUpdater(cls, "completedExpandBuffersAndPauseFlag");
        Class<Object> cls2 = Object.class;
        f29908l = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "sendSegment");
        f29909m = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "receiveSegment");
        f29910n = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "bufferEndSegment");
        f29911o = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_closeCause");
        f29912p = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "closeHandler");
    }

    public b(int i10, l lVar) {
        this.f29913e = i10;
        this.f29914f = lVar;
        if (i10 >= 0) {
            this.bufferEnd = c.A(i10);
            this.completedExpandBuffersAndPauseFlag = L();
            j jVar = new j(0, (j) null, this, 3);
            this.sendSegment = jVar;
            this.receiveSegment = jVar;
            if (b0()) {
                jVar = c.f29932a;
                cm.l.d(jVar, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
            }
            this.bufferEndSegment = jVar;
            this.f29915g = lVar != null ? new C0326b(this) : null;
            this._closeCause = c.f29950s;
            return;
        }
        throw new IllegalArgumentException(("Invalid channel capacity: " + i10 + ", should be >=0").toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0039, code lost:
        r0 = qm.n.c(r0, r4);
        r9.x(r3, true);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A(nm.j r9, long r10) {
        /*
            r8 = this;
            r0 = 0
            r1 = 1
            java.lang.Object r0 = qm.n.b(r0, r1, r0)
        L_0x0006:
            r2 = -1
            if (r9 == 0) goto L_0x0067
            int r3 = nm.c.f29933b
            int r3 = r3 - r1
        L_0x000c:
            if (r2 >= r3) goto L_0x0060
            long r4 = r9.f30812g
            int r6 = nm.c.f29933b
            long r6 = (long) r6
            long r4 = r4 * r6
            long r6 = (long) r3
            long r4 = r4 + r6
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 < 0) goto L_0x0067
        L_0x001a:
            java.lang.Object r4 = r9.w(r3)
            if (r4 == 0) goto L_0x0050
            qm.h0 r5 = nm.c.f29936e
            if (r4 != r5) goto L_0x0027
            goto L_0x0050
        L_0x0027:
            boolean r5 = r4 instanceof nm.v
            if (r5 == 0) goto L_0x0041
            qm.h0 r5 = nm.c.z()
            boolean r5 = r9.r(r3, r4, r5)
            if (r5 == 0) goto L_0x001a
            nm.v r4 = (nm.v) r4
            lm.j2 r4 = r4.f29970a
        L_0x0039:
            java.lang.Object r0 = qm.n.c(r0, r4)
            r9.x(r3, r1)
            goto L_0x005d
        L_0x0041:
            boolean r5 = r4 instanceof lm.j2
            if (r5 == 0) goto L_0x005d
            qm.h0 r5 = nm.c.z()
            boolean r5 = r9.r(r3, r4, r5)
            if (r5 == 0) goto L_0x001a
            goto L_0x0039
        L_0x0050:
            qm.h0 r5 = nm.c.z()
            boolean r4 = r9.r(r3, r4, r5)
            if (r4 == 0) goto L_0x001a
            r9.p()
        L_0x005d:
            int r3 = r3 + -1
            goto L_0x000c
        L_0x0060:
            qm.e r9 = r9.g()
            nm.j r9 = (nm.j) r9
            goto L_0x0006
        L_0x0067:
            if (r0 == 0) goto L_0x008d
            boolean r9 = r0 instanceof java.util.ArrayList
            if (r9 != 0) goto L_0x0073
            lm.j2 r0 = (lm.j2) r0
            r8.s0(r0)
            goto L_0x008d
        L_0x0073:
            java.lang.String r9 = "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }"
            cm.l.d(r0, r9)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r9 = r0.size()
            int r9 = r9 - r1
        L_0x007f:
            if (r2 >= r9) goto L_0x008d
            java.lang.Object r10 = r0.get(r9)
            lm.j2 r10 = (lm.j2) r10
            r8.s0(r10)
            int r9 = r9 + -1
            goto L_0x007f
        L_0x008d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nm.b.A(nm.j, long):void");
    }

    private final boolean A0(j jVar, int i10, long j10) {
        Object w10 = jVar.w(i10);
        if (!(w10 instanceof j2) || j10 < f29905i.get(this) || !jVar.r(i10, w10, c.f29938g)) {
            return B0(jVar, i10, j10);
        }
        if (z0(w10, jVar, i10)) {
            jVar.A(i10, c.f29935d);
            return true;
        }
        jVar.A(i10, c.f29941j);
        jVar.x(i10, false);
        return false;
    }

    private final j B() {
        j jVar = f29910n.get(this);
        j jVar2 = (j) f29908l.get(this);
        if (jVar2.f30812g > ((j) jVar).f30812g) {
            jVar = jVar2;
        }
        j jVar3 = (j) f29909m.get(this);
        if (jVar3.f30812g > ((j) jVar).f30812g) {
            jVar = jVar3;
        }
        return (j) qm.d.b((e) jVar);
    }

    private final boolean B0(j jVar, int i10, long j10) {
        while (true) {
            Object w10 = jVar.w(i10);
            if (w10 instanceof j2) {
                if (j10 < f29905i.get(this)) {
                    if (jVar.r(i10, w10, new v((j2) w10))) {
                        return true;
                    }
                } else if (jVar.r(i10, w10, c.f29938g)) {
                    if (z0(w10, jVar, i10)) {
                        jVar.A(i10, c.f29935d);
                        return true;
                    }
                    jVar.A(i10, c.f29941j);
                    jVar.x(i10, false);
                    return false;
                }
            } else if (w10 == c.f29941j) {
                return false;
            } else {
                if (w10 == null) {
                    if (jVar.r(i10, w10, c.f29936e)) {
                        return true;
                    }
                } else if (w10 == c.f29935d || w10 == c.f29939h || w10 == c.f29940i || w10 == c.f29942k || w10 == c.z()) {
                    return true;
                } else {
                    if (w10 != c.f29937f) {
                        throw new IllegalStateException(("Unexpected cell state: " + w10).toString());
                    }
                }
            }
        }
        return true;
    }

    /* access modifiers changed from: private */
    public final Object C0(j jVar, int i10, long j10, Object obj) {
        Object w10 = jVar.w(i10);
        if (w10 == null) {
            if (j10 >= (f29904h.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return c.f29945n;
                }
                if (jVar.r(i10, w10, obj)) {
                    H();
                    return c.f29944m;
                }
            }
        } else if (w10 == c.f29935d && jVar.r(i10, w10, c.f29940i)) {
            H();
            return jVar.y(i10);
        }
        return D0(jVar, i10, j10, obj);
    }

    private final void D(long j10) {
        r0(E(j10));
    }

    private final Object D0(j jVar, int i10, long j10, Object obj) {
        while (true) {
            Object w10 = jVar.w(i10);
            if (w10 == null || w10 == c.f29936e) {
                if (j10 < (f29904h.get(this) & 1152921504606846975L)) {
                    if (jVar.r(i10, w10, c.f29939h)) {
                        H();
                        return c.f29946o;
                    }
                } else if (obj == null) {
                    return c.f29945n;
                } else {
                    if (jVar.r(i10, w10, obj)) {
                        H();
                        return c.f29944m;
                    }
                }
            } else if (w10 == c.f29935d) {
                if (jVar.r(i10, w10, c.f29940i)) {
                    H();
                    return jVar.y(i10);
                }
            } else if (w10 == c.f29941j) {
                return c.f29946o;
            } else {
                if (w10 == c.f29939h) {
                    return c.f29946o;
                }
                if (w10 == c.z()) {
                    H();
                    return c.f29946o;
                } else if (w10 != c.f29938g && jVar.r(i10, w10, c.f29937f)) {
                    boolean z10 = w10 instanceof v;
                    if (z10) {
                        w10 = ((v) w10).f29970a;
                    }
                    if (z0(w10, jVar, i10)) {
                        jVar.A(i10, c.f29940i);
                        H();
                        return jVar.y(i10);
                    }
                    jVar.A(i10, c.f29941j);
                    jVar.x(i10, false);
                    if (z10) {
                        H();
                    }
                    return c.f29946o;
                }
            }
        }
    }

    private final j E(long j10) {
        j B = B();
        if (a0()) {
            long c02 = c0(B);
            if (c02 != -1) {
                G(c02);
            }
        }
        A(B, j10);
        return B;
    }

    /* access modifiers changed from: private */
    public final int E0(j jVar, int i10, Object obj, long j10, Object obj2, boolean z10) {
        jVar.B(i10, obj);
        if (z10) {
            return F0(jVar, i10, obj, j10, obj2, z10);
        }
        Object w10 = jVar.w(i10);
        if (w10 == null) {
            if (y(j10)) {
                if (jVar.r(i10, (Object) null, c.f29935d)) {
                    return 1;
                }
            } else if (obj2 == null) {
                return 3;
            } else {
                if (jVar.r(i10, (Object) null, obj2)) {
                    return 2;
                }
            }
        } else if (w10 instanceof j2) {
            jVar.s(i10);
            if (y0(w10, obj)) {
                jVar.A(i10, c.f29940i);
                l0();
                return 0;
            }
            if (jVar.t(i10, c.f29942k) != c.f29942k) {
                jVar.x(i10, true);
            }
            return 5;
        }
        return F0(jVar, i10, obj, j10, obj2, z10);
    }

    private final void F() {
        p();
    }

    private final int F0(j jVar, int i10, Object obj, long j10, Object obj2, boolean z10) {
        while (true) {
            Object w10 = jVar.w(i10);
            if (w10 == null) {
                if (!y(j10) || z10) {
                    if (z10) {
                        if (jVar.r(i10, (Object) null, c.f29941j)) {
                            jVar.x(i10, false);
                            return 4;
                        }
                    } else if (obj2 == null) {
                        return 3;
                    } else {
                        if (jVar.r(i10, (Object) null, obj2)) {
                            return 2;
                        }
                    }
                } else if (jVar.r(i10, (Object) null, c.f29935d)) {
                    return 1;
                }
            } else if (w10 == c.f29936e) {
                if (jVar.r(i10, w10, c.f29935d)) {
                    return 1;
                }
            } else if (w10 == c.f29942k) {
                jVar.s(i10);
                return 5;
            } else if (w10 == c.f29939h) {
                jVar.s(i10);
                return 5;
            } else {
                h0 z11 = c.z();
                jVar.s(i10);
                if (w10 == z11) {
                    F();
                    return 4;
                }
                if (w10 instanceof v) {
                    w10 = ((v) w10).f29970a;
                }
                if (y0(w10, obj)) {
                    jVar.A(i10, c.f29940i);
                    l0();
                    return 0;
                }
                if (jVar.t(i10, c.f29942k) != c.f29942k) {
                    jVar.x(i10, true);
                }
                return 5;
            }
        }
    }

    private final void G0(long j10) {
        long j11;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f29905i;
        do {
            j11 = atomicLongFieldUpdater.get(this);
            if (j11 >= j10 || f29905i.compareAndSet(this, j11, j10)) {
            }
            j11 = atomicLongFieldUpdater.get(this);
            return;
        } while (f29905i.compareAndSet(this, j11, j10));
    }

    private final void H() {
        if (!b0()) {
            j jVar = (j) f29910n.get(this);
            while (true) {
                long andIncrement = f29906j.getAndIncrement(this);
                int i10 = c.f29933b;
                long j10 = andIncrement / ((long) i10);
                int i11 = (Q() > andIncrement ? 1 : (Q() == andIncrement ? 0 : -1));
                long j11 = jVar.f30812g;
                if (i11 <= 0) {
                    if (j11 < j10 && jVar.e() != null) {
                        g0(j10, jVar);
                    }
                    T(this, 0, 1, (Object) null);
                    return;
                }
                if (j11 != j10) {
                    j I = I(j10, jVar, andIncrement);
                    if (I == null) {
                        continue;
                    } else {
                        jVar = I;
                    }
                }
                boolean A0 = A0(jVar, (int) (andIncrement % ((long) i10)), andIncrement);
                T(this, 0, 1, (Object) null);
                if (A0) {
                    return;
                }
            }
        }
    }

    private final void H0(long j10) {
        long j11;
        long j12;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f29904h;
        do {
            j11 = atomicLongFieldUpdater.get(this);
            j12 = 1152921504606846975L & j11;
            if (j12 < j10) {
            } else {
                return;
            }
        } while (!f29904h.compareAndSet(this, j11, c.w(j12, (int) (j11 >> 60))));
    }

    private final j I(long j10, j jVar, long j11) {
        Object c10;
        long j12 = j10;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f29910n;
        bm.p pVar = (bm.p) c.y();
        j jVar2 = jVar;
        loop0:
        while (true) {
            c10 = qm.d.c(jVar2, j12, pVar);
            if (f0.c(c10)) {
                break;
            }
            e0 b10 = f0.b(c10);
            while (true) {
                e0 e0Var = (e0) atomicReferenceFieldUpdater.get(this);
                if (e0Var.f30812g >= b10.f30812g) {
                    break loop0;
                } else if (b10.q()) {
                    if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, e0Var, b10)) {
                        if (e0Var.m()) {
                            e0Var.k();
                        }
                    } else if (b10.m()) {
                        b10.k();
                    }
                }
            }
        }
        if (f0.c(c10)) {
            F();
            g0(j10, jVar);
        } else {
            j jVar3 = (j) f0.b(c10);
            long j13 = jVar3.f30812g;
            if (j13 <= j12) {
                return jVar3;
            }
            AtomicLongFieldUpdater atomicLongFieldUpdater = f29906j;
            int i10 = c.f29933b;
            if (atomicLongFieldUpdater.compareAndSet(this, j11 + 1, ((long) i10) * j13)) {
                S((jVar3.f30812g * ((long) i10)) - j11);
                return null;
            }
        }
        T(this, 0, 1, (Object) null);
        return null;
    }

    /* access modifiers changed from: private */
    public final j J(long j10, j jVar) {
        Object c10;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f29909m;
        bm.p pVar = (bm.p) c.y();
        loop0:
        while (true) {
            c10 = qm.d.c(jVar, j10, pVar);
            if (f0.c(c10)) {
                break;
            }
            e0 b10 = f0.b(c10);
            while (true) {
                e0 e0Var = (e0) atomicReferenceFieldUpdater.get(this);
                if (e0Var.f30812g >= b10.f30812g) {
                    break loop0;
                } else if (b10.q()) {
                    if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, e0Var, b10)) {
                        if (e0Var.m()) {
                            e0Var.k();
                        }
                    } else if (b10.m()) {
                        b10.k();
                    }
                }
            }
        }
        if (f0.c(c10)) {
            F();
            if (jVar.f30812g * ((long) c.f29933b) >= Q()) {
                return null;
            }
        } else {
            jVar = (j) f0.b(c10);
            if (!b0() && j10 <= L() / ((long) c.f29933b)) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f29910n;
                while (true) {
                    e0 e0Var2 = (e0) atomicReferenceFieldUpdater2.get(this);
                    if (e0Var2.f30812g >= jVar.f30812g || !jVar.q()) {
                        break;
                    } else if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater2, this, e0Var2, jVar)) {
                        if (e0Var2.m()) {
                            e0Var2.k();
                        }
                    } else if (jVar.m()) {
                        jVar.k();
                    }
                }
            }
            long j11 = jVar.f30812g;
            if (j11 <= j10) {
                return jVar;
            }
            int i10 = c.f29933b;
            G0(j11 * ((long) i10));
            if (jVar.f30812g * ((long) i10) >= Q()) {
                return null;
            }
        }
        jVar.b();
        return null;
    }

    /* access modifiers changed from: private */
    public final j K(long j10, j jVar) {
        Object c10;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f29908l;
        bm.p pVar = (bm.p) c.y();
        loop0:
        while (true) {
            c10 = qm.d.c(jVar, j10, pVar);
            if (f0.c(c10)) {
                break;
            }
            e0 b10 = f0.b(c10);
            while (true) {
                e0 e0Var = (e0) atomicReferenceFieldUpdater.get(this);
                if (e0Var.f30812g >= b10.f30812g) {
                    break loop0;
                } else if (b10.q()) {
                    if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, e0Var, b10)) {
                        if (e0Var.m()) {
                            e0Var.k();
                        }
                    } else if (b10.m()) {
                        b10.k();
                    }
                }
            }
        }
        if (f0.c(c10)) {
            F();
            if (jVar.f30812g * ((long) c.f29933b) >= O()) {
                return null;
            }
        } else {
            jVar = (j) f0.b(c10);
            long j11 = jVar.f30812g;
            if (j11 <= j10) {
                return jVar;
            }
            int i10 = c.f29933b;
            H0(j11 * ((long) i10));
            if (jVar.f30812g * ((long) i10) >= O()) {
                return null;
            }
        }
        jVar.b();
        return null;
    }

    private final long L() {
        return f29906j.get(this);
    }

    /* access modifiers changed from: private */
    public final Throwable N() {
        Throwable M = M();
        return M == null ? new m("Channel was closed") : M;
    }

    private final void S(long j10) {
        if ((f29907k.addAndGet(this, j10) & 4611686018427387904L) != 0) {
            do {
            } while ((f29907k.get(this) & 4611686018427387904L) != 0);
        }
    }

    static /* synthetic */ void T(b bVar, long j10, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                j10 = 1;
            }
            bVar.S(j10);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incCompletedExpandBufferAttempts");
    }

    private final void U() {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f29912p;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
        } while (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, obj, obj == null ? c.f29948q : c.f29949r));
        if (obj != null) {
            l lVar = (l) y.d(obj, 1);
            ((l) obj).invoke(M());
        }
    }

    private final boolean V(j jVar, int i10, long j10) {
        Object w10;
        do {
            w10 = jVar.w(i10);
            if (w10 != null && w10 != c.f29936e) {
                if (w10 == c.f29935d) {
                    return true;
                }
                if (w10 == c.f29941j || w10 == c.z() || w10 == c.f29940i || w10 == c.f29939h) {
                    return false;
                }
                if (w10 == c.f29938g) {
                    return true;
                }
                return w10 != c.f29937f && j10 == O();
            }
        } while (!jVar.r(i10, w10, c.f29939h));
        H();
        return false;
    }

    private final boolean W(long j10, boolean z10) {
        int i10 = (int) (j10 >> 60);
        if (i10 == 0 || i10 == 1) {
            return false;
        }
        if (i10 == 2) {
            E(j10 & 1152921504606846975L);
            if (z10 && R()) {
                return false;
            }
        } else if (i10 == 3) {
            D(j10 & 1152921504606846975L);
        } else {
            throw new IllegalStateException(("unexpected close status: " + i10).toString());
        }
        return true;
    }

    private final boolean Y(long j10) {
        return W(j10, true);
    }

    /* access modifiers changed from: private */
    public final boolean Z(long j10) {
        return W(j10, false);
    }

    private final boolean b0() {
        long L = L();
        return L == 0 || L == Long.MAX_VALUE;
    }

    private final long c0(j jVar) {
        do {
            int i10 = c.f29933b;
            while (true) {
                i10--;
                if (-1 < i10) {
                    long j10 = (jVar.f30812g * ((long) c.f29933b)) + ((long) i10);
                    if (j10 < O()) {
                        return -1;
                    }
                    while (true) {
                        Object w10 = jVar.w(i10);
                        if (w10 == null || w10 == c.f29936e) {
                            if (jVar.r(i10, w10, c.z())) {
                                jVar.p();
                                break;
                            }
                        } else if (w10 == c.f29935d) {
                            return j10;
                        }
                    }
                } else {
                    jVar = (j) jVar.g();
                }
            }
        } while (jVar != null);
        return -1;
    }

    private final void d0() {
        long j10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f29904h;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            if (((int) (j10 >> 60)) == 0) {
            } else {
                return;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, c.w(1152921504606846975L & j10, 1)));
    }

    private final void e0() {
        long j10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f29904h;
        do {
            j10 = atomicLongFieldUpdater.get(this);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, c.w(1152921504606846975L & j10, 3)));
    }

    private final void f0() {
        long j10;
        long j11;
        int i10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f29904h;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            int i11 = (int) (j10 >> 60);
            if (i11 == 0) {
                j11 = j10 & 1152921504606846975L;
                i10 = 2;
            } else if (i11 == 1) {
                j11 = j10 & 1152921504606846975L;
                i10 = 3;
            } else {
                return;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, c.w(j11, i10)));
    }

    private final void g0(long j10, j jVar) {
        j jVar2;
        j jVar3;
        while (jVar.f30812g < j10 && (jVar3 = (j) jVar.e()) != null) {
            jVar = jVar3;
        }
        while (true) {
            if (!jVar.h() || (jVar2 = (j) jVar.e()) == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f29910n;
                while (true) {
                    e0 e0Var = (e0) atomicReferenceFieldUpdater.get(this);
                    if (e0Var.f30812g < jVar.f30812g) {
                        if (!jVar.q()) {
                            continue;
                            break;
                        } else if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, e0Var, jVar)) {
                            if (e0Var.m()) {
                                e0Var.k();
                                return;
                            }
                            return;
                        } else if (jVar.m()) {
                            jVar.k();
                        }
                    } else {
                        return;
                    }
                }
            } else {
                jVar = jVar2;
            }
        }
    }

    /* access modifiers changed from: private */
    public final void i0(j jVar) {
        p.a aVar = p.f30426e;
        jVar.resumeWith(p.a(h.b(h.f29956b.a(M()))));
    }

    private final Object j0(Object obj, tl.d dVar) {
        Throwable P;
        k kVar = new k(c.b(dVar), 1);
        kVar.y();
        l lVar = this.f29914f;
        if (lVar == null || (P = z.d(lVar, obj, (q0) null, 2, (Object) null)) == null) {
            P = P();
        } else {
            b.a(P, P());
        }
        p.a aVar = p.f30426e;
        kVar.resumeWith(p.a(pl.q.a(P)));
        Object v10 = kVar.v();
        if (v10 == d.c()) {
            h.c(dVar);
        }
        return v10 == d.c() ? v10 : x.f30437a;
    }

    /* access modifiers changed from: private */
    public final void k0(Object obj, j jVar) {
        l lVar = this.f29914f;
        if (lVar != null) {
            z.b(lVar, obj, jVar.getContext());
        }
        Throwable P = P();
        p.a aVar = p.f30426e;
        jVar.resumeWith(p.a(pl.q.a(P)));
    }

    /* access modifiers changed from: private */
    public final void n0(j2 j2Var, j jVar, int i10) {
        m0();
        j2Var.a(jVar, i10);
    }

    /* access modifiers changed from: private */
    public final void o0(j2 j2Var, j jVar, int i10) {
        j2Var.a(jVar, i10 + c.f29933b);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ java.lang.Object p0(nm.b r14, tl.d r15) {
        /*
            boolean r0 = r15 instanceof nm.b.c
            if (r0 == 0) goto L_0x0014
            r0 = r15
            nm.b$c r0 = (nm.b.c) r0
            int r1 = r0.f29924g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0014
            int r1 = r1 - r2
            r0.f29924g = r1
        L_0x0012:
            r6 = r0
            goto L_0x001a
        L_0x0014:
            nm.b$c r0 = new nm.b$c
            r0.<init>(r14, r15)
            goto L_0x0012
        L_0x001a:
            java.lang.Object r15 = r6.f29922e
            java.lang.Object r0 = ul.d.c()
            int r1 = r6.f29924g
            r2 = 1
            if (r1 == 0) goto L_0x003a
            if (r1 != r2) goto L_0x0032
            pl.q.b(r15)
            nm.h r15 = (nm.h) r15
            java.lang.Object r14 = r15.k()
            goto L_0x00b7
        L_0x0032:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L_0x003a:
            pl.q.b(r15)
            r15 = 0
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f29909m
            java.lang.Object r1 = r1.get(r14)
            nm.j r1 = (nm.j) r1
        L_0x0048:
            boolean r3 = r14.X()
            if (r3 == 0) goto L_0x005a
            nm.h$b r15 = nm.h.f29956b
            java.lang.Throwable r14 = r14.M()
            java.lang.Object r14 = r15.a(r14)
            goto L_0x00b7
        L_0x005a:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = f29905i
            long r4 = r3.getAndIncrement(r14)
            int r3 = nm.c.f29933b
            long r7 = (long) r3
            long r7 = r4 / r7
            long r9 = (long) r3
            long r9 = r4 % r9
            int r3 = (int) r9
            long r9 = r1.f30812g
            int r9 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r9 == 0) goto L_0x007a
            nm.j r7 = r14.J(r7, r1)
            if (r7 != 0) goto L_0x0078
            goto L_0x0048
        L_0x0078:
            r13 = r7
            goto L_0x007b
        L_0x007a:
            r13 = r1
        L_0x007b:
            r7 = r14
            r8 = r13
            r9 = r3
            r10 = r4
            r12 = r15
            java.lang.Object r1 = r7.C0(r8, r9, r10, r12)
            qm.h0 r7 = nm.c.f29944m
            if (r1 == r7) goto L_0x00b8
            qm.h0 r7 = nm.c.f29946o
            if (r1 != r7) goto L_0x009d
            long r7 = r14.Q()
            int r1 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r1 >= 0) goto L_0x009b
            r13.b()
        L_0x009b:
            r1 = r13
            goto L_0x0048
        L_0x009d:
            qm.h0 r15 = nm.c.f29945n
            if (r1 != r15) goto L_0x00ae
            r6.f29924g = r2
            r1 = r14
            r2 = r13
            java.lang.Object r14 = r1.q0(r2, r3, r4, r6)
            if (r14 != r0) goto L_0x00b7
            return r0
        L_0x00ae:
            r13.b()
            nm.h$b r14 = nm.h.f29956b
            java.lang.Object r14 = r14.c(r1)
        L_0x00b7:
            return r14
        L_0x00b8:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "unexpected"
            java.lang.String r15 = r15.toString()
            r14.<init>(r15)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: nm.b.p0(nm.b, tl.d):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object q0(nm.j r11, int r12, long r13, tl.d r15) {
        /*
            r10 = this;
            boolean r0 = r15 instanceof nm.b.d
            if (r0 == 0) goto L_0x0013
            r0 = r15
            nm.b$d r0 = (nm.b.d) r0
            int r1 = r0.f29931k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f29931k = r1
            goto L_0x0018
        L_0x0013:
            nm.b$d r0 = new nm.b$d
            r0.<init>(r10, r15)
        L_0x0018:
            java.lang.Object r15 = r0.f29929i
            java.lang.Object r1 = ul.d.c()
            int r2 = r0.f29931k
            r3 = 1
            if (r2 == 0) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            java.lang.Object r11 = r0.f29926f
            nm.j r11 = (nm.j) r11
            java.lang.Object r11 = r0.f29925e
            nm.b r11 = (nm.b) r11
            pl.q.b(r15)
            goto L_0x0134
        L_0x0032:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x003a:
            pl.q.b(r15)
            r0.f29925e = r10
            r0.f29926f = r11
            r0.f29927g = r12
            r0.f29928h = r13
            r0.f29931k = r3
            tl.d r15 = ul.c.b(r0)
            lm.k r15 = lm.m.b(r15)
            nm.s r8 = new nm.s     // Catch:{ all -> 0x006d }
            java.lang.String r2 = "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuationImpl<kotlinx.coroutines.channels.ChannelResult<E of kotlinx.coroutines.channels.BufferedChannel.receiveCatchingOnNoWaiterSuspend_GKJJFZk$lambda$35>>"
            cm.l.d(r15, r2)     // Catch:{ all -> 0x006d }
            r8.<init>(r15)     // Catch:{ all -> 0x006d }
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r7 = r8
            java.lang.Object r2 = r2.C0(r3, r4, r5, r7)     // Catch:{ all -> 0x006d }
            qm.h0 r3 = nm.c.f29944m     // Catch:{ all -> 0x006d }
            if (r2 != r3) goto L_0x0070
            r10.n0(r8, r11, r12)     // Catch:{ all -> 0x006d }
            goto L_0x0124
        L_0x006d:
            r11 = move-exception
            goto L_0x013b
        L_0x0070:
            qm.h0 r12 = nm.c.f29946o     // Catch:{ all -> 0x006d }
            r9 = 0
            if (r2 != r12) goto L_0x010a
            long r2 = r10.Q()     // Catch:{ all -> 0x006d }
            int r12 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r12 >= 0) goto L_0x0082
            r11.b()     // Catch:{ all -> 0x006d }
        L_0x0082:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r11 = f29909m     // Catch:{ all -> 0x006d }
            java.lang.Object r11 = r11.get(r10)     // Catch:{ all -> 0x006d }
            nm.j r11 = (nm.j) r11     // Catch:{ all -> 0x006d }
        L_0x008c:
            boolean r12 = r10.X()     // Catch:{ all -> 0x006d }
            if (r12 == 0) goto L_0x0097
            r10.i0(r15)     // Catch:{ all -> 0x006d }
            goto L_0x0124
        L_0x0097:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r12 = f29905i     // Catch:{ all -> 0x006d }
            long r12 = r12.getAndIncrement(r10)     // Catch:{ all -> 0x006d }
            int r14 = nm.c.f29933b     // Catch:{ all -> 0x006d }
            long r2 = (long) r14     // Catch:{ all -> 0x006d }
            long r2 = r12 / r2
            long r4 = (long) r14     // Catch:{ all -> 0x006d }
            long r4 = r12 % r4
            int r14 = (int) r4     // Catch:{ all -> 0x006d }
            long r4 = r11.f30812g     // Catch:{ all -> 0x006d }
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x00b6
            nm.j r2 = r10.J(r2, r11)     // Catch:{ all -> 0x006d }
            if (r2 != 0) goto L_0x00b5
            goto L_0x008c
        L_0x00b5:
            r11 = r2
        L_0x00b6:
            r2 = r10
            r3 = r11
            r4 = r14
            r5 = r12
            r7 = r8
            java.lang.Object r2 = r2.C0(r3, r4, r5, r7)     // Catch:{ all -> 0x006d }
            qm.h0 r3 = nm.c.f29944m     // Catch:{ all -> 0x006d }
            if (r2 != r3) goto L_0x00c9
            r10.n0(r8, r11, r14)     // Catch:{ all -> 0x006d }
            goto L_0x0124
        L_0x00c9:
            qm.h0 r14 = nm.c.f29946o     // Catch:{ all -> 0x006d }
            if (r2 != r14) goto L_0x00db
            long r2 = r10.Q()     // Catch:{ all -> 0x006d }
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 >= 0) goto L_0x008c
            r11.b()     // Catch:{ all -> 0x006d }
            goto L_0x008c
        L_0x00db:
            qm.h0 r12 = nm.c.f29945n     // Catch:{ all -> 0x006d }
            if (r2 == r12) goto L_0x00fe
            r11.b()     // Catch:{ all -> 0x006d }
            nm.h$b r11 = nm.h.f29956b     // Catch:{ all -> 0x006d }
            java.lang.Object r11 = r11.c(r2)     // Catch:{ all -> 0x006d }
            nm.h r11 = nm.h.b(r11)     // Catch:{ all -> 0x006d }
            bm.l r12 = r10.f29914f     // Catch:{ all -> 0x006d }
            if (r12 == 0) goto L_0x00fa
            tl.g r13 = r15.getContext()     // Catch:{ all -> 0x006d }
            bm.l r9 = qm.z.a(r12, r2, r13)     // Catch:{ all -> 0x006d }
        L_0x00fa:
            r15.J(r11, r9)     // Catch:{ all -> 0x006d }
            goto L_0x0124
        L_0x00fe:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException     // Catch:{ all -> 0x006d }
            java.lang.String r12 = "unexpected"
            java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x006d }
            r11.<init>(r12)     // Catch:{ all -> 0x006d }
            throw r11     // Catch:{ all -> 0x006d }
        L_0x010a:
            r11.b()     // Catch:{ all -> 0x006d }
            nm.h$b r11 = nm.h.f29956b     // Catch:{ all -> 0x006d }
            java.lang.Object r11 = r11.c(r2)     // Catch:{ all -> 0x006d }
            nm.h r11 = nm.h.b(r11)     // Catch:{ all -> 0x006d }
            bm.l r12 = r10.f29914f     // Catch:{ all -> 0x006d }
            if (r12 == 0) goto L_0x00fa
            tl.g r13 = r15.getContext()     // Catch:{ all -> 0x006d }
            bm.l r9 = qm.z.a(r12, r2, r13)     // Catch:{ all -> 0x006d }
            goto L_0x00fa
        L_0x0124:
            java.lang.Object r15 = r15.v()
            java.lang.Object r11 = ul.d.c()
            if (r15 != r11) goto L_0x0131
            kotlin.coroutines.jvm.internal.h.c(r0)
        L_0x0131:
            if (r15 != r1) goto L_0x0134
            return r1
        L_0x0134:
            nm.h r15 = (nm.h) r15
            java.lang.Object r11 = r15.k()
            return r11
        L_0x013b:
            r15.H()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: nm.b.q0(nm.j, int, long, tl.d):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00aa, code lost:
        r12 = (nm.j) r12.g();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void r0(nm.j r12) {
        /*
            r11 = this;
            bm.l r0 = r11.f29914f
            r1 = 0
            r2 = 1
            java.lang.Object r3 = qm.n.b(r1, r2, r1)
        L_0x0008:
            int r4 = nm.c.f29933b
            int r4 = r4 - r2
        L_0x000b:
            r5 = -1
            if (r5 >= r4) goto L_0x00aa
            long r6 = r12.f30812g
            int r8 = nm.c.f29933b
            long r8 = (long) r8
            long r6 = r6 * r8
            long r8 = (long) r4
            long r6 = r6 + r8
        L_0x0016:
            java.lang.Object r8 = r12.w(r4)
            qm.h0 r9 = nm.c.f29940i
            if (r8 == r9) goto L_0x00b2
            qm.h0 r9 = nm.c.f29935d
            if (r8 != r9) goto L_0x0047
            long r9 = r11.O()
            int r9 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r9 < 0) goto L_0x00b2
            qm.h0 r9 = nm.c.z()
            boolean r8 = r12.r(r4, r8, r9)
            if (r8 == 0) goto L_0x0016
            if (r0 == 0) goto L_0x0040
            java.lang.Object r5 = r12.v(r4)
            qm.q0 r1 = qm.z.c(r0, r5, r1)
        L_0x0040:
            r12.s(r4)
        L_0x0043:
            r12.p()
            goto L_0x00a6
        L_0x0047:
            qm.h0 r9 = nm.c.f29936e
            if (r8 == r9) goto L_0x009b
            if (r8 != 0) goto L_0x0050
            goto L_0x009b
        L_0x0050:
            boolean r9 = r8 instanceof lm.j2
            if (r9 != 0) goto L_0x006d
            boolean r9 = r8 instanceof nm.v
            if (r9 == 0) goto L_0x0059
            goto L_0x006d
        L_0x0059:
            qm.h0 r9 = nm.c.f29938g
            if (r8 == r9) goto L_0x00b2
            qm.h0 r9 = nm.c.f29937f
            if (r8 != r9) goto L_0x0066
            goto L_0x00b2
        L_0x0066:
            qm.h0 r9 = nm.c.f29938g
            if (r8 == r9) goto L_0x0016
            goto L_0x00a6
        L_0x006d:
            long r9 = r11.O()
            int r9 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r9 < 0) goto L_0x00b2
            boolean r9 = r8 instanceof nm.v
            if (r9 == 0) goto L_0x007f
            r9 = r8
            nm.v r9 = (nm.v) r9
            lm.j2 r9 = r9.f29970a
            goto L_0x0082
        L_0x007f:
            r9 = r8
            lm.j2 r9 = (lm.j2) r9
        L_0x0082:
            qm.h0 r10 = nm.c.z()
            boolean r8 = r12.r(r4, r8, r10)
            if (r8 == 0) goto L_0x0016
            if (r0 == 0) goto L_0x0096
            java.lang.Object r5 = r12.v(r4)
            qm.q0 r1 = qm.z.c(r0, r5, r1)
        L_0x0096:
            java.lang.Object r3 = qm.n.c(r3, r9)
            goto L_0x0040
        L_0x009b:
            qm.h0 r9 = nm.c.z()
            boolean r8 = r12.r(r4, r8, r9)
            if (r8 == 0) goto L_0x0016
            goto L_0x0043
        L_0x00a6:
            int r4 = r4 + -1
            goto L_0x000b
        L_0x00aa:
            qm.e r12 = r12.g()
            nm.j r12 = (nm.j) r12
            if (r12 != 0) goto L_0x0008
        L_0x00b2:
            if (r3 == 0) goto L_0x00d8
            boolean r12 = r3 instanceof java.util.ArrayList
            if (r12 != 0) goto L_0x00be
            lm.j2 r3 = (lm.j2) r3
            r11.t0(r3)
            goto L_0x00d8
        L_0x00be:
            java.lang.String r12 = "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }"
            cm.l.d(r3, r12)
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r12 = r3.size()
            int r12 = r12 - r2
        L_0x00ca:
            if (r5 >= r12) goto L_0x00d8
            java.lang.Object r0 = r3.get(r12)
            lm.j2 r0 = (lm.j2) r0
            r11.t0(r0)
            int r12 = r12 + -1
            goto L_0x00ca
        L_0x00d8:
            if (r1 != 0) goto L_0x00db
            return
        L_0x00db:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: nm.b.r0(nm.j):void");
    }

    private final void s0(j2 j2Var) {
        u0(j2Var, true);
    }

    private final void t0(j2 j2Var) {
        u0(j2Var, false);
    }

    private final void u0(j2 j2Var, boolean z10) {
        tl.d dVar;
        Object b10;
        if (j2Var instanceof j) {
            dVar = (tl.d) j2Var;
            p.a aVar = p.f30426e;
            b10 = pl.q.a(z10 ? N() : P());
        } else if (j2Var instanceof s) {
            dVar = ((s) j2Var).f29969e;
            p.a aVar2 = p.f30426e;
            b10 = h.b(h.f29956b.a(M()));
        } else if (j2Var instanceof a) {
            ((a) j2Var).j();
            return;
        } else {
            throw new IllegalStateException(("Unexpected waiter: " + j2Var).toString());
        }
        dVar.resumeWith(p.a(b10));
    }

    static /* synthetic */ Object v0(b bVar, Object obj, tl.d dVar) {
        j jVar;
        b bVar2 = bVar;
        j jVar2 = (j) f29908l.get(bVar);
        while (true) {
            long andIncrement = f29904h.getAndIncrement(bVar);
            long j10 = andIncrement & 1152921504606846975L;
            boolean o10 = bVar.Z(andIncrement);
            int i10 = c.f29933b;
            long j11 = j10 / ((long) i10);
            int i11 = (int) (j10 % ((long) i10));
            if (jVar2.f30812g != j11) {
                j f10 = bVar.K(j11, jVar2);
                if (f10 != null) {
                    jVar = f10;
                } else if (o10) {
                    Object j02 = bVar.j0(obj, dVar);
                    if (j02 == d.c()) {
                        return j02;
                    }
                }
            } else {
                jVar = jVar2;
            }
            int x10 = bVar.E0(jVar, i11, obj, j10, (Object) null, o10);
            if (x10 == 0) {
                jVar.b();
                break;
            } else if (x10 == 1) {
                break;
            } else if (x10 != 2) {
                if (x10 == 3) {
                    Object w02 = bVar.w0(jVar, i11, obj, j10, dVar);
                    if (w02 == d.c()) {
                        return w02;
                    }
                } else if (x10 != 4) {
                    if (x10 == 5) {
                        jVar.b();
                    }
                    jVar2 = jVar;
                } else {
                    if (j10 < bVar.O()) {
                        jVar.b();
                    }
                    Object j03 = bVar.j0(obj, dVar);
                    if (j03 == d.c()) {
                        return j03;
                    }
                }
            } else if (o10) {
                jVar.p();
                Object j04 = bVar.j0(obj, dVar);
                if (j04 == d.c()) {
                    return j04;
                }
            }
        }
        return x.f30437a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:61:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0125 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0126  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Object w0(nm.j r21, int r22, java.lang.Object r23, long r24, tl.d r26) {
        /*
            r20 = this;
            r9 = r20
            r0 = r23
            tl.d r1 = ul.c.b(r26)
            lm.k r10 = lm.m.b(r1)
            r8 = 0
            r1 = r20
            r2 = r21
            r3 = r22
            r4 = r23
            r5 = r24
            r7 = r10
            int r1 = r1.E0(r2, r3, r4, r5, r7, r8)     // Catch:{ all -> 0x0068 }
            if (r1 == 0) goto L_0x0104
            r11 = 1
            if (r1 == r11) goto L_0x00fb
            r12 = 2
            if (r1 == r12) goto L_0x00f3
            r13 = 4
            if (r1 == r13) goto L_0x00e6
            java.lang.String r14 = "unexpected"
            r15 = 5
            if (r1 != r15) goto L_0x00dc
            r21.b()     // Catch:{ all -> 0x0068 }
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f29908l     // Catch:{ all -> 0x0068 }
            java.lang.Object r1 = r1.get(r9)     // Catch:{ all -> 0x0068 }
            nm.j r1 = (nm.j) r1     // Catch:{ all -> 0x0068 }
        L_0x0039:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = f29904h     // Catch:{ all -> 0x0068 }
            long r2 = r2.getAndIncrement(r9)     // Catch:{ all -> 0x0068 }
            r4 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r16 = r2 & r4
            boolean r18 = r9.Z(r2)     // Catch:{ all -> 0x0068 }
            int r2 = nm.c.f29933b     // Catch:{ all -> 0x0068 }
            long r3 = (long) r2     // Catch:{ all -> 0x0068 }
            long r3 = r16 / r3
            long r5 = (long) r2     // Catch:{ all -> 0x0068 }
            long r5 = r16 % r5
            int r8 = (int) r5     // Catch:{ all -> 0x0068 }
            long r5 = r1.f30812g     // Catch:{ all -> 0x0068 }
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x006d
            nm.j r2 = r9.K(r3, r1)     // Catch:{ all -> 0x0068 }
            if (r2 != 0) goto L_0x006b
            if (r18 == 0) goto L_0x0039
        L_0x0063:
            r9.k0(r0, r10)     // Catch:{ all -> 0x0068 }
            goto L_0x0112
        L_0x0068:
            r0 = move-exception
            goto L_0x0129
        L_0x006b:
            r7 = r2
            goto L_0x006e
        L_0x006d:
            r7 = r1
        L_0x006e:
            r1 = r20
            r2 = r7
            r3 = r8
            r4 = r23
            r5 = r16
            r21 = r7
            r7 = r10
            r19 = r8
            r8 = r18
            int r1 = r1.E0(r2, r3, r4, r5, r7, r8)     // Catch:{ all -> 0x0068 }
            if (r1 == 0) goto L_0x00ce
            if (r1 == r11) goto L_0x00c2
            if (r1 == r12) goto L_0x00ab
            r2 = 3
            if (r1 == r2) goto L_0x00a1
            if (r1 == r13) goto L_0x0095
            if (r1 == r15) goto L_0x008f
            goto L_0x0092
        L_0x008f:
            r21.b()     // Catch:{ all -> 0x0068 }
        L_0x0092:
            r1 = r21
            goto L_0x0039
        L_0x0095:
            long r1 = r20.O()     // Catch:{ all -> 0x0068 }
            int r1 = (r16 > r1 ? 1 : (r16 == r1 ? 0 : -1))
            if (r1 >= 0) goto L_0x0063
            r21.b()     // Catch:{ all -> 0x0068 }
            goto L_0x0063
        L_0x00a1:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0068 }
            java.lang.String r1 = r14.toString()     // Catch:{ all -> 0x0068 }
            r0.<init>(r1)     // Catch:{ all -> 0x0068 }
            throw r0     // Catch:{ all -> 0x0068 }
        L_0x00ab:
            if (r18 == 0) goto L_0x00b1
            r21.p()     // Catch:{ all -> 0x0068 }
            goto L_0x0063
        L_0x00b1:
            boolean r0 = r10 instanceof lm.j2     // Catch:{ all -> 0x0068 }
            if (r0 == 0) goto L_0x00b7
            r0 = r10
            goto L_0x00b8
        L_0x00b7:
            r0 = 0
        L_0x00b8:
            if (r0 == 0) goto L_0x0112
            r2 = r21
            r1 = r19
            r9.o0(r0, r2, r1)     // Catch:{ all -> 0x0068 }
            goto L_0x0112
        L_0x00c2:
            pl.p$a r0 = pl.p.f30426e     // Catch:{ all -> 0x0068 }
            pl.x r0 = pl.x.f30437a     // Catch:{ all -> 0x0068 }
            java.lang.Object r0 = pl.p.a(r0)     // Catch:{ all -> 0x0068 }
        L_0x00ca:
            r10.resumeWith(r0)     // Catch:{ all -> 0x0068 }
            goto L_0x0112
        L_0x00ce:
            r2 = r21
            r2.b()     // Catch:{ all -> 0x0068 }
            pl.p$a r0 = pl.p.f30426e     // Catch:{ all -> 0x0068 }
            pl.x r0 = pl.x.f30437a     // Catch:{ all -> 0x0068 }
            java.lang.Object r0 = pl.p.a(r0)     // Catch:{ all -> 0x0068 }
            goto L_0x00ca
        L_0x00dc:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0068 }
            java.lang.String r1 = r14.toString()     // Catch:{ all -> 0x0068 }
            r0.<init>(r1)     // Catch:{ all -> 0x0068 }
            throw r0     // Catch:{ all -> 0x0068 }
        L_0x00e6:
            long r1 = r20.O()     // Catch:{ all -> 0x0068 }
            int r1 = (r24 > r1 ? 1 : (r24 == r1 ? 0 : -1))
            if (r1 >= 0) goto L_0x0063
            r21.b()     // Catch:{ all -> 0x0068 }
            goto L_0x0063
        L_0x00f3:
            r0 = r21
            r1 = r22
            r9.o0(r10, r0, r1)     // Catch:{ all -> 0x0068 }
            goto L_0x0112
        L_0x00fb:
            pl.p$a r0 = pl.p.f30426e     // Catch:{ all -> 0x0068 }
            pl.x r0 = pl.x.f30437a     // Catch:{ all -> 0x0068 }
            java.lang.Object r0 = pl.p.a(r0)     // Catch:{ all -> 0x0068 }
            goto L_0x00ca
        L_0x0104:
            r0 = r21
            r21.b()     // Catch:{ all -> 0x0068 }
            pl.p$a r0 = pl.p.f30426e     // Catch:{ all -> 0x0068 }
            pl.x r0 = pl.x.f30437a     // Catch:{ all -> 0x0068 }
            java.lang.Object r0 = pl.p.a(r0)     // Catch:{ all -> 0x0068 }
            goto L_0x00ca
        L_0x0112:
            java.lang.Object r0 = r10.v()
            java.lang.Object r1 = ul.d.c()
            if (r0 != r1) goto L_0x011f
            kotlin.coroutines.jvm.internal.h.c(r26)
        L_0x011f:
            java.lang.Object r1 = ul.d.c()
            if (r0 != r1) goto L_0x0126
            return r0
        L_0x0126:
            pl.x r0 = pl.x.f30437a
            return r0
        L_0x0129:
            r10.H()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: nm.b.w0(nm.j, int, java.lang.Object, long, tl.d):java.lang.Object");
    }

    private final boolean x0(long j10) {
        if (Z(j10)) {
            return false;
        }
        return !y(j10 & 1152921504606846975L);
    }

    private final boolean y(long j10) {
        return j10 < L() || j10 < O() + ((long) this.f29913e);
    }

    private final boolean y0(Object obj, Object obj2) {
        l lVar = null;
        if (obj instanceof s) {
            cm.l.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveCatching<E of kotlinx.coroutines.channels.BufferedChannel>");
            s sVar = (s) obj;
            k kVar = sVar.f29969e;
            h b10 = h.b(h.f29956b.c(obj2));
            l lVar2 = this.f29914f;
            if (lVar2 != null) {
                lVar = z.a(lVar2, obj2, sVar.f29969e.getContext());
            }
            return c.B(kVar, b10, lVar);
        } else if (obj instanceof a) {
            cm.l.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
            return ((a) obj).i(obj2);
        } else if (obj instanceof j) {
            cm.l.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
            j jVar = (j) obj;
            l lVar3 = this.f29914f;
            if (lVar3 != null) {
                lVar = z.a(lVar3, obj2, jVar.getContext());
            }
            return c.B(jVar, obj2, lVar);
        } else {
            throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
        }
    }

    private final boolean z0(Object obj, j jVar, int i10) {
        if (obj instanceof j) {
            cm.l.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return c.C((j) obj, x.f30437a, (l) null, 2, (Object) null);
        }
        throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    /* access modifiers changed from: protected */
    public boolean C(Throwable th2, boolean z10) {
        if (z10) {
            d0();
        }
        boolean a10 = androidx.concurrent.futures.b.a(f29911o, this, c.f29950s, th2);
        if (z10) {
            e0();
        } else {
            f0();
        }
        F();
        h0();
        if (a10) {
            U();
        }
        return a10;
    }

    /* access modifiers changed from: protected */
    public final void G(long j10) {
        q0 d10;
        j jVar = (j) f29909m.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f29905i;
            long j11 = atomicLongFieldUpdater.get(this);
            if (j10 >= Math.max(((long) this.f29913e) + j11, L())) {
                if (atomicLongFieldUpdater.compareAndSet(this, j11, j11 + 1)) {
                    int i10 = c.f29933b;
                    long j12 = j11 / ((long) i10);
                    int i11 = (int) (j11 % ((long) i10));
                    if (jVar.f30812g != j12) {
                        j J = J(j12, jVar);
                        if (J == null) {
                            continue;
                        } else {
                            jVar = J;
                        }
                    }
                    Object C0 = C0(jVar, i11, j11, (Object) null);
                    if (C0 != c.f29946o) {
                        jVar.b();
                        l lVar = this.f29914f;
                        if (!(lVar == null || (d10 = z.d(lVar, C0, (q0) null, 2, (Object) null)) == null)) {
                            throw d10;
                        }
                    } else if (j11 < Q()) {
                        jVar.b();
                    }
                }
            } else {
                return;
            }
        }
    }

    public final void I0(long j10) {
        long j11;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j12;
        if (!b0()) {
            do {
            } while (L() <= j10);
            int g10 = c.f29934c;
            int i10 = 0;
            while (i10 < g10) {
                long L = L();
                if (L != (4611686018427387903L & f29907k.get(this)) || L != L()) {
                    i10++;
                } else {
                    return;
                }
            }
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f29907k;
            do {
                j11 = atomicLongFieldUpdater2.get(this);
            } while (!atomicLongFieldUpdater2.compareAndSet(this, j11, c.v(j11 & 4611686018427387903L, true)));
            while (true) {
                long L2 = L();
                atomicLongFieldUpdater = f29907k;
                long j13 = atomicLongFieldUpdater.get(this);
                long j14 = j13 & 4611686018427387903L;
                boolean z10 = (4611686018427387904L & j13) != 0;
                if (L2 == j14 && L2 == L()) {
                    break;
                } else if (!z10) {
                    atomicLongFieldUpdater.compareAndSet(this, j13, c.v(j14, true));
                }
            }
            do {
                j12 = atomicLongFieldUpdater.get(this);
            } while (!atomicLongFieldUpdater.compareAndSet(this, j12, c.v(j12 & 4611686018427387903L, false)));
        }
    }

    /* access modifiers changed from: protected */
    public final Throwable M() {
        return (Throwable) f29911o.get(this);
    }

    public final long O() {
        return f29905i.get(this);
    }

    /* access modifiers changed from: protected */
    public final Throwable P() {
        Throwable M = M();
        return M == null ? new n("Channel was closed") : M;
    }

    public final long Q() {
        return f29904h.get(this) & 1152921504606846975L;
    }

    public final boolean R() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f29909m;
            j jVar = (j) atomicReferenceFieldUpdater.get(this);
            long O = O();
            if (Q() <= O) {
                return false;
            }
            int i10 = c.f29933b;
            long j10 = O / ((long) i10);
            if (jVar.f30812g == j10 || (jVar = J(j10, jVar)) != null) {
                jVar.b();
                if (V(jVar, (int) (O % ((long) i10)), O)) {
                    return true;
                }
                f29905i.compareAndSet(this, O, O + 1);
            } else if (((j) atomicReferenceFieldUpdater.get(this)).f30812g < j10) {
                return false;
            }
        }
    }

    public boolean X() {
        return Y(f29904h.get(this));
    }

    public boolean a(Throwable th2) {
        return C(th2, false);
    }

    /* access modifiers changed from: protected */
    public boolean a0() {
        return false;
    }

    public Object b(tl.d dVar) {
        return p0(this, dVar);
    }

    public void d(l lVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f29912p;
        if (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, (Object) null, lVar)) {
            do {
                Object obj = atomicReferenceFieldUpdater.get(this);
                if (obj != c.f29948q) {
                    if (obj == c.f29949r) {
                        throw new IllegalStateException("Another handler was already registered and successfully invoked".toString());
                    }
                    throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
                }
            } while (!androidx.concurrent.futures.b.a(f29912p, this, c.f29948q, c.f29949r));
            lVar.invoke(M());
        }
    }

    public final void e(CancellationException cancellationException) {
        z(cancellationException);
    }

    /* access modifiers changed from: protected */
    public void h0() {
    }

    public f iterator() {
        return new a();
    }

    public Object j() {
        j jVar;
        long j10 = f29905i.get(this);
        long j11 = f29904h.get(this);
        if (Y(j11)) {
            return h.f29956b.a(M());
        }
        if (j10 >= (j11 & 1152921504606846975L)) {
            return h.f29956b.b();
        }
        h0 i10 = c.f29942k;
        j jVar2 = (j) f29909m.get(this);
        while (!X()) {
            long andIncrement = f29905i.getAndIncrement(this);
            int i11 = c.f29933b;
            long j12 = andIncrement / ((long) i11);
            int i12 = (int) (andIncrement % ((long) i11));
            if (jVar2.f30812g != j12) {
                j c10 = J(j12, jVar2);
                if (c10 == null) {
                    continue;
                } else {
                    jVar = c10;
                }
            } else {
                jVar = jVar2;
            }
            Object w10 = C0(jVar, i12, andIncrement, i10);
            if (w10 == c.f29944m) {
                j2 j2Var = i10 instanceof j2 ? (j2) i10 : null;
                if (j2Var != null) {
                    n0(j2Var, jVar, i12);
                }
                I0(andIncrement);
                jVar.p();
                return h.f29956b.b();
            } else if (w10 == c.f29946o) {
                if (andIncrement < Q()) {
                    jVar.b();
                }
                jVar2 = jVar;
            } else if (w10 != c.f29945n) {
                jVar.b();
                return h.f29956b.c(w10);
            } else {
                throw new IllegalStateException("unexpected".toString());
            }
        }
        return h.f29956b.a(M());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        return nm.h.f29956b.c(pl.x.f30437a);
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ba A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object k(java.lang.Object r15) {
        /*
            r14 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = f29904h
            long r0 = r0.get(r14)
            boolean r0 = r14.x0(r0)
            if (r0 == 0) goto L_0x0013
            nm.h$b r15 = nm.h.f29956b
            java.lang.Object r15 = r15.b()
            return r15
        L_0x0013:
            qm.h0 r8 = nm.c.f29941j
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f29908l
            java.lang.Object r0 = r0.get(r14)
            nm.j r0 = (nm.j) r0
        L_0x0021:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = f29904h
            long r1 = r1.getAndIncrement(r14)
            r3 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r9 = r1 & r3
            boolean r11 = r14.Z(r1)
            int r1 = nm.c.f29933b
            long r2 = (long) r1
            long r2 = r9 / r2
            long r4 = (long) r1
            long r4 = r9 % r4
            int r12 = (int) r4
            long r4 = r0.f30812g
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x0059
            nm.j r1 = r14.K(r2, r0)
            if (r1 != 0) goto L_0x0057
            if (r11 == 0) goto L_0x0021
        L_0x004b:
            nm.h$b r15 = nm.h.f29956b
            java.lang.Throwable r0 = r14.P()
            java.lang.Object r15 = r15.a(r0)
            goto L_0x00be
        L_0x0057:
            r13 = r1
            goto L_0x005a
        L_0x0059:
            r13 = r0
        L_0x005a:
            r0 = r14
            r1 = r13
            r2 = r12
            r3 = r15
            r4 = r9
            r6 = r8
            r7 = r11
            int r0 = r0.E0(r1, r2, r3, r4, r6, r7)
            if (r0 == 0) goto L_0x00ba
            r1 = 1
            if (r0 == r1) goto L_0x00b1
            r1 = 2
            if (r0 == r1) goto L_0x0094
            r1 = 3
            if (r0 == r1) goto L_0x0088
            r1 = 4
            if (r0 == r1) goto L_0x007c
            r1 = 5
            if (r0 == r1) goto L_0x0077
            goto L_0x007a
        L_0x0077:
            r13.b()
        L_0x007a:
            r0 = r13
            goto L_0x0021
        L_0x007c:
            long r0 = r14.O()
            int r15 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r15 >= 0) goto L_0x004b
            r13.b()
            goto L_0x004b
        L_0x0088:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "unexpected"
            java.lang.String r0 = r0.toString()
            r15.<init>(r0)
            throw r15
        L_0x0094:
            if (r11 == 0) goto L_0x009a
            r13.p()
            goto L_0x004b
        L_0x009a:
            boolean r15 = r8 instanceof lm.j2
            if (r15 == 0) goto L_0x00a1
            lm.j2 r8 = (lm.j2) r8
            goto L_0x00a2
        L_0x00a1:
            r8 = 0
        L_0x00a2:
            if (r8 == 0) goto L_0x00a7
            r14.o0(r8, r13, r12)
        L_0x00a7:
            r13.p()
            nm.h$b r15 = nm.h.f29956b
            java.lang.Object r15 = r15.b()
            goto L_0x00be
        L_0x00b1:
            nm.h$b r15 = nm.h.f29956b
            pl.x r0 = pl.x.f30437a
            java.lang.Object r15 = r15.c(r0)
            goto L_0x00be
        L_0x00ba:
            r13.b()
            goto L_0x00b1
        L_0x00be:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: nm.b.k(java.lang.Object):java.lang.Object");
    }

    /* access modifiers changed from: protected */
    public void l0() {
    }

    public Object m(Object obj, tl.d dVar) {
        return v0(this, obj, dVar);
    }

    /* access modifiers changed from: protected */
    public void m0() {
    }

    public boolean p() {
        return Z(f29904h.get(this));
    }

    /* JADX WARNING: type inference failed for: r2v13, types: [qm.e] */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01b0, code lost:
        r3 = r3.e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01b7, code lost:
        if (r3 != null) goto L_0x01d8;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01dc  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0072  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r16 = this;
            r0 = r16
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = f29904h
            long r2 = r2.get(r0)
            r4 = 60
            long r2 = r2 >> r4
            int r2 = (int) r2
            r3 = 3
            r4 = 2
            if (r2 == r4) goto L_0x001e
            if (r2 == r3) goto L_0x0018
            goto L_0x0021
        L_0x0018:
            java.lang.String r2 = "cancelled,"
        L_0x001a:
            r1.append(r2)
            goto L_0x0021
        L_0x001e:
            java.lang.String r2 = "closed,"
            goto L_0x001a
        L_0x0021:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "capacity="
            r2.append(r5)
            int r5 = r0.f29913e
            r2.append(r5)
            r5 = 44
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            r1.append(r2)
            java.lang.String r2 = "data=["
            r1.append(r2)
            nm.j[] r2 = new nm.j[r3]
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = f29909m
            java.lang.Object r3 = r3.get(r0)
            r6 = 0
            r2[r6] = r3
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = f29908l
            java.lang.Object r3 = r3.get(r0)
            r7 = 1
            r2[r7] = r3
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = f29910n
            java.lang.Object r3 = r3.get(r0)
            r2[r4] = r3
            java.util.List r2 = ql.q.l(r2)
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x006c:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0083
            java.lang.Object r4 = r2.next()
            r8 = r4
            nm.j r8 = (nm.j) r8
            nm.j r9 = nm.c.f29932a
            if (r8 == r9) goto L_0x006c
            r3.add(r4)
            goto L_0x006c
        L_0x0083:
            java.util.Iterator r2 = r3.iterator()
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x01dc
            java.lang.Object r3 = r2.next()
            boolean r4 = r2.hasNext()
            if (r4 != 0) goto L_0x0098
            goto L_0x00b2
        L_0x0098:
            r4 = r3
            nm.j r4 = (nm.j) r4
            long r8 = r4.f30812g
        L_0x009d:
            java.lang.Object r4 = r2.next()
            r10 = r4
            nm.j r10 = (nm.j) r10
            long r10 = r10.f30812g
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 <= 0) goto L_0x00ac
            r3 = r4
            r8 = r10
        L_0x00ac:
            boolean r4 = r2.hasNext()
            if (r4 != 0) goto L_0x009d
        L_0x00b2:
            nm.j r3 = (nm.j) r3
            long r10 = r16.O()
            long r12 = r16.Q()
        L_0x00bc:
            int r2 = nm.c.f29933b
            r4 = r6
        L_0x00bf:
            if (r4 >= r2) goto L_0x01b0
            long r8 = r3.f30812g
            int r14 = nm.c.f29933b
            long r14 = (long) r14
            long r8 = r8 * r14
            long r14 = (long) r4
            long r8 = r8 + r14
            int r14 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r14 < 0) goto L_0x00d1
            int r15 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r15 >= 0) goto L_0x01b9
        L_0x00d1:
            java.lang.Object r15 = r3.w(r4)
            java.lang.Object r6 = r3.v(r4)
            boolean r7 = r15 instanceof lm.j
            if (r7 == 0) goto L_0x00f3
            int r7 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r7 >= 0) goto L_0x00e7
            if (r14 < 0) goto L_0x00e7
            java.lang.String r7 = "receive"
            goto L_0x0178
        L_0x00e7:
            if (r14 >= 0) goto L_0x00ef
            if (r7 < 0) goto L_0x00ef
            java.lang.String r7 = "send"
            goto L_0x0178
        L_0x00ef:
            java.lang.String r7 = "cont"
            goto L_0x0178
        L_0x00f3:
            boolean r7 = r15 instanceof nm.s
            if (r7 == 0) goto L_0x00fb
            java.lang.String r7 = "receiveCatching"
            goto L_0x0178
        L_0x00fb:
            boolean r7 = r15 instanceof nm.v
            if (r7 == 0) goto L_0x0116
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "EB("
            r7.append(r8)
            r7.append(r15)
            r8 = 41
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            goto L_0x0178
        L_0x0116:
            qm.h0 r7 = nm.c.f29937f
            boolean r7 = cm.l.a(r15, r7)
            if (r7 == 0) goto L_0x0121
            goto L_0x012b
        L_0x0121:
            qm.h0 r7 = nm.c.f29938g
            boolean r7 = cm.l.a(r15, r7)
            if (r7 == 0) goto L_0x012e
        L_0x012b:
            java.lang.String r7 = "resuming_sender"
            goto L_0x0178
        L_0x012e:
            if (r15 != 0) goto L_0x0132
            goto L_0x01aa
        L_0x0132:
            qm.h0 r7 = nm.c.f29936e
            boolean r7 = cm.l.a(r15, r7)
            if (r7 == 0) goto L_0x013e
            goto L_0x01aa
        L_0x013e:
            qm.h0 r7 = nm.c.f29940i
            boolean r7 = cm.l.a(r15, r7)
            if (r7 == 0) goto L_0x0149
            goto L_0x01aa
        L_0x0149:
            qm.h0 r7 = nm.c.f29939h
            boolean r7 = cm.l.a(r15, r7)
            if (r7 == 0) goto L_0x0154
            goto L_0x01aa
        L_0x0154:
            qm.h0 r7 = nm.c.f29942k
            boolean r7 = cm.l.a(r15, r7)
            if (r7 == 0) goto L_0x015f
            goto L_0x01aa
        L_0x015f:
            qm.h0 r7 = nm.c.f29941j
            boolean r7 = cm.l.a(r15, r7)
            if (r7 == 0) goto L_0x016a
            goto L_0x01aa
        L_0x016a:
            qm.h0 r7 = nm.c.z()
            boolean r7 = cm.l.a(r15, r7)
            if (r7 != 0) goto L_0x01aa
            java.lang.String r7 = r15.toString()
        L_0x0178:
            if (r6 == 0) goto L_0x019a
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r9 = 40
            r8.append(r9)
            r8.append(r7)
            r8.append(r5)
            r8.append(r6)
            java.lang.String r6 = "),"
            r8.append(r6)
            java.lang.String r6 = r8.toString()
        L_0x0196:
            r1.append(r6)
            goto L_0x01aa
        L_0x019a:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r7)
            r6.append(r5)
            java.lang.String r6 = r6.toString()
            goto L_0x0196
        L_0x01aa:
            int r4 = r4 + 1
            r6 = 0
            r7 = 1
            goto L_0x00bf
        L_0x01b0:
            qm.e r2 = r3.e()
            r3 = r2
            nm.j r3 = (nm.j) r3
            if (r3 != 0) goto L_0x01d8
        L_0x01b9:
            char r2 = km.s.D0(r1)
            if (r2 != r5) goto L_0x01ce
            int r2 = r1.length()
            r4 = 1
            int r2 = r2 - r4
            java.lang.StringBuilder r2 = r1.deleteCharAt(r2)
            java.lang.String r3 = "this.deleteCharAt(index)"
            cm.l.e(r2, r3)
        L_0x01ce:
            java.lang.String r2 = "]"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            return r1
        L_0x01d8:
            r6 = 0
            r7 = 1
            goto L_0x00bc
        L_0x01dc:
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: nm.b.toString():java.lang.String");
    }

    public boolean z(Throwable th2) {
        if (th2 == null) {
            th2 = new CancellationException("Channel was cancelled");
        }
        return C(th2, true);
    }
}
