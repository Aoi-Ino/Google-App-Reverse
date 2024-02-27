package lm;

import bm.p;
import cm.g;
import cm.l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.jvm.internal.h;
import lm.k1;
import pl.x;
import qm.a0;
import qm.r;
import qm.s;
import tl.g;

public class r1 implements k1, r, z1 {

    /* renamed from: e  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f24994e;

    /* renamed from: f  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f24995f;
    private volatile Object _parentHandle;
    private volatile Object _state;

    private static final class a extends k {

        /* renamed from: m  reason: collision with root package name */
        private final r1 f24996m;

        public a(tl.d dVar, r1 r1Var) {
            super(dVar, 1);
            this.f24996m = r1Var;
        }

        /* access modifiers changed from: protected */
        public String F() {
            return "AwaitContinuation";
        }

        public Throwable s(k1 k1Var) {
            Throwable e10;
            Object a02 = this.f24996m.a0();
            if (!(a02 instanceof c) || (e10 = ((c) a02).e()) == null) {
                return a02 instanceof u ? ((u) a02).f25023a : k1Var.c0();
            }
            return e10;
        }
    }

    private static final class b extends q1 {

        /* renamed from: i  reason: collision with root package name */
        private final r1 f24997i;

        /* renamed from: j  reason: collision with root package name */
        private final c f24998j;

        /* renamed from: k  reason: collision with root package name */
        private final q f24999k;

        /* renamed from: l  reason: collision with root package name */
        private final Object f25000l;

        public b(r1 r1Var, c cVar, q qVar, Object obj) {
            this.f24997i = r1Var;
            this.f24998j = cVar;
            this.f24999k = qVar;
            this.f25000l = obj;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            x((Throwable) obj);
            return x.f30437a;
        }

        public void x(Throwable th2) {
            this.f24997i.M(this.f24998j, this.f24999k, this.f25000l);
        }
    }

    private static final class c implements f1 {

        /* renamed from: f  reason: collision with root package name */
        private static final AtomicIntegerFieldUpdater f25001f;

        /* renamed from: g  reason: collision with root package name */
        private static final AtomicReferenceFieldUpdater f25002g;

        /* renamed from: h  reason: collision with root package name */
        private static final AtomicReferenceFieldUpdater f25003h;
        private volatile Object _exceptionsHolder;
        private volatile int _isCompleting;
        private volatile Object _rootCause;

        /* renamed from: e  reason: collision with root package name */
        private final w1 f25004e;

        static {
            Class<c> cls = c.class;
            f25001f = AtomicIntegerFieldUpdater.newUpdater(cls, "_isCompleting");
            Class<Object> cls2 = Object.class;
            f25002g = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_rootCause");
            f25003h = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_exceptionsHolder");
        }

        public c(w1 w1Var, boolean z10, Throwable th2) {
            this.f25004e = w1Var;
            this._isCompleting = z10 ? 1 : 0;
            this._rootCause = th2;
        }

        private final ArrayList b() {
            return new ArrayList(4);
        }

        private final Object d() {
            return f25003h.get(this);
        }

        private final void l(Object obj) {
            f25003h.set(this, obj);
        }

        public final void a(Throwable th2) {
            Throwable e10 = e();
            if (e10 == null) {
                m(th2);
            } else if (th2 != e10) {
                Object d10 = d();
                if (d10 == null) {
                    l(th2);
                } else if (d10 instanceof Throwable) {
                    if (th2 != d10) {
                        ArrayList b10 = b();
                        b10.add(d10);
                        b10.add(th2);
                        l(b10);
                    }
                } else if (d10 instanceof ArrayList) {
                    ((ArrayList) d10).add(th2);
                } else {
                    throw new IllegalStateException(("State is " + d10).toString());
                }
            }
        }

        public boolean c() {
            return e() == null;
        }

        public final Throwable e() {
            return (Throwable) f25002g.get(this);
        }

        public w1 f() {
            return this.f25004e;
        }

        public final boolean g() {
            return e() != null;
        }

        public final boolean h() {
            return f25001f.get(this) != 0;
        }

        public final boolean i() {
            return d() == s1.f25012e;
        }

        public final List j(Throwable th2) {
            ArrayList arrayList;
            Object d10 = d();
            if (d10 == null) {
                arrayList = b();
            } else if (d10 instanceof Throwable) {
                ArrayList b10 = b();
                b10.add(d10);
                arrayList = b10;
            } else if (d10 instanceof ArrayList) {
                arrayList = (ArrayList) d10;
            } else {
                throw new IllegalStateException(("State is " + d10).toString());
            }
            Throwable e10 = e();
            if (e10 != null) {
                arrayList.add(0, e10);
            }
            if (th2 != null && !l.a(th2, e10)) {
                arrayList.add(th2);
            }
            l(s1.f25012e);
            return arrayList;
        }

        public final void k(boolean z10) {
            f25001f.set(this, z10 ? 1 : 0);
        }

        public final void m(Throwable th2) {
            f25002g.set(this, th2);
        }

        public String toString() {
            return "Finishing[cancelling=" + g() + ", completing=" + h() + ", rootCause=" + e() + ", exceptions=" + d() + ", list=" + f() + ']';
        }
    }

    public static final class d extends s.a {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ r1 f25005d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Object f25006e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(s sVar, r1 r1Var, Object obj) {
            super(sVar);
            this.f25005d = r1Var;
            this.f25006e = obj;
        }

        /* renamed from: f */
        public Object d(s sVar) {
            if (this.f25005d.a0() == this.f25006e) {
                return null;
            }
            return r.a();
        }
    }

    static {
        Class<r1> cls = r1.class;
        Class<Object> cls2 = Object.class;
        f24994e = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_state");
        f24995f = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_parentHandle");
    }

    public r1(boolean z10) {
        this._state = z10 ? s1.f25014g : s1.f25013f;
    }

    private final Object B(tl.d dVar) {
        a aVar = new a(c.b(dVar), this);
        aVar.y();
        m.a(aVar, o(new a2(aVar)));
        Object v10 = aVar.v();
        if (v10 == d.c()) {
            h.c(dVar);
        }
        return v10;
    }

    public static /* synthetic */ CancellationException B0(r1 r1Var, Throwable th2, String str, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                str = null;
            }
            return r1Var.A0(th2, str);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
    }

    private final boolean D0(f1 f1Var, Object obj) {
        if (!androidx.concurrent.futures.b.a(f24994e, this, f1Var, s1.g(obj))) {
            return false;
        }
        r0((Throwable) null);
        s0(obj);
        L(f1Var, obj);
        return true;
    }

    private final boolean E0(f1 f1Var, Throwable th2) {
        w1 V = V(f1Var);
        if (V == null) {
            return false;
        }
        if (!androidx.concurrent.futures.b.a(f24994e, this, f1Var, new c(V, false, th2))) {
            return false;
        }
        p0(V, th2);
        return true;
    }

    private final Object F0(Object obj, Object obj2) {
        if (!(obj instanceof f1)) {
            return s1.f25008a;
        }
        if (((obj instanceof t0) || (obj instanceof q1)) && !(obj instanceof q) && !(obj2 instanceof u)) {
            return D0((f1) obj, obj2) ? obj2 : s1.f25010c;
        }
        return G0((f1) obj, obj2);
    }

    private final Object G(Object obj) {
        Object F0;
        do {
            Object a02 = a0();
            if (!(a02 instanceof f1) || ((a02 instanceof c) && ((c) a02).h())) {
                return s1.f25008a;
            }
            F0 = F0(a02, new u(N(obj), false, 2, (g) null));
        } while (F0 == s1.f25010c);
        return F0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x006e, code lost:
        if (r2 == null) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0070, code lost:
        p0(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0073, code lost:
        r8 = P(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0077, code lost:
        if (r8 == null) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x007d, code lost:
        if (H0(r1, r8, r9) == false) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0081, code lost:
        return lm.s1.f25009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0086, code lost:
        return O(r1, r9);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Object G0(lm.f1 r8, java.lang.Object r9) {
        /*
            r7 = this;
            lm.w1 r0 = r7.V(r8)
            if (r0 != 0) goto L_0x000b
            qm.h0 r8 = lm.s1.f25010c
            return r8
        L_0x000b:
            boolean r1 = r8 instanceof lm.r1.c
            r2 = 0
            if (r1 == 0) goto L_0x0014
            r1 = r8
            lm.r1$c r1 = (lm.r1.c) r1
            goto L_0x0015
        L_0x0014:
            r1 = r2
        L_0x0015:
            r3 = 0
            if (r1 != 0) goto L_0x001d
            lm.r1$c r1 = new lm.r1$c
            r1.<init>(r0, r3, r2)
        L_0x001d:
            cm.u r3 = new cm.u
            r3.<init>()
            monitor-enter(r1)
            boolean r4 = r1.h()     // Catch:{ all -> 0x002f }
            if (r4 == 0) goto L_0x0031
            qm.h0 r8 = lm.s1.f25008a     // Catch:{ all -> 0x002f }
            monitor-exit(r1)
            return r8
        L_0x002f:
            r8 = move-exception
            goto L_0x0087
        L_0x0031:
            r4 = 1
            r1.k(r4)     // Catch:{ all -> 0x002f }
            if (r1 == r8) goto L_0x0045
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = f24994e     // Catch:{ all -> 0x002f }
            boolean r5 = androidx.concurrent.futures.b.a(r5, r7, r8, r1)     // Catch:{ all -> 0x002f }
            if (r5 != 0) goto L_0x0045
            qm.h0 r8 = lm.s1.f25010c     // Catch:{ all -> 0x002f }
            monitor-exit(r1)
            return r8
        L_0x0045:
            boolean r5 = r1.g()     // Catch:{ all -> 0x002f }
            boolean r6 = r9 instanceof lm.u     // Catch:{ all -> 0x002f }
            if (r6 == 0) goto L_0x0051
            r6 = r9
            lm.u r6 = (lm.u) r6     // Catch:{ all -> 0x002f }
            goto L_0x0052
        L_0x0051:
            r6 = r2
        L_0x0052:
            if (r6 == 0) goto L_0x0059
            java.lang.Throwable r6 = r6.f25023a     // Catch:{ all -> 0x002f }
            r1.a(r6)     // Catch:{ all -> 0x002f }
        L_0x0059:
            java.lang.Throwable r6 = r1.e()     // Catch:{ all -> 0x002f }
            r4 = r4 ^ r5
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch:{ all -> 0x002f }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x002f }
            if (r4 == 0) goto L_0x0069
            r2 = r6
        L_0x0069:
            r3.f20234e = r2     // Catch:{ all -> 0x002f }
            pl.x r3 = pl.x.f30437a     // Catch:{ all -> 0x002f }
            monitor-exit(r1)
            if (r2 == 0) goto L_0x0073
            r7.p0(r0, r2)
        L_0x0073:
            lm.q r8 = r7.P(r8)
            if (r8 == 0) goto L_0x0082
            boolean r8 = r7.H0(r1, r8, r9)
            if (r8 == 0) goto L_0x0082
            qm.h0 r8 = lm.s1.f25009b
            return r8
        L_0x0082:
            java.lang.Object r8 = r7.O(r1, r9)
            return r8
        L_0x0087:
            monitor-exit(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: lm.r1.G0(lm.f1, java.lang.Object):java.lang.Object");
    }

    private final boolean H0(c cVar, q qVar, Object obj) {
        while (k1.a.d(qVar.f24988i, false, false, new b(this, cVar, qVar, obj), 1, (Object) null) == x1.f25033e) {
            qVar = o0(qVar);
            if (qVar == null) {
                return false;
            }
        }
        return true;
    }

    private final boolean I(Throwable th2) {
        if (h0()) {
            return true;
        }
        boolean z10 = th2 instanceof CancellationException;
        p W = W();
        if (W == null || W == x1.f25033e) {
            return z10;
        }
        return W.e(th2) || z10;
    }

    private final void L(f1 f1Var, Object obj) {
        p W = W();
        if (W != null) {
            W.b();
            x0(x1.f25033e);
        }
        Throwable th2 = null;
        u uVar = obj instanceof u ? (u) obj : null;
        if (uVar != null) {
            th2 = uVar.f25023a;
        }
        if (f1Var instanceof q1) {
            try {
                ((q1) f1Var).x(th2);
            } catch (Throwable th3) {
                d0(new x("Exception in completion handler " + f1Var + " for " + this, th3));
            }
        } else {
            w1 f10 = f1Var.f();
            if (f10 != null) {
                q0(f10, th2);
            }
        }
    }

    /* access modifiers changed from: private */
    public final void M(c cVar, q qVar, Object obj) {
        q o02 = o0(qVar);
        if (o02 == null || !H0(cVar, o02, obj)) {
            z(O(cVar, obj));
        }
    }

    private final Throwable N(Object obj) {
        if (obj != null && !(obj instanceof Throwable)) {
            l.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
            return ((z1) obj).Z();
        }
        Throwable th2 = (Throwable) obj;
        return th2 == null ? new l1(J(), (Throwable) null, this) : th2;
    }

    private final Object O(c cVar, Object obj) {
        boolean g10;
        Throwable S;
        u uVar = obj instanceof u ? (u) obj : null;
        Throwable th2 = uVar != null ? uVar.f25023a : null;
        synchronized (cVar) {
            g10 = cVar.g();
            List j10 = cVar.j(th2);
            S = S(cVar, j10);
            if (S != null) {
                x(S, j10);
            }
        }
        if (!(S == null || S == th2)) {
            obj = new u(S, false, 2, (g) null);
        }
        if (S != null && (I(S) || b0(S))) {
            l.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            ((u) obj).b();
        }
        if (!g10) {
            r0(S);
        }
        s0(obj);
        androidx.concurrent.futures.b.a(f24994e, this, cVar, s1.g(obj));
        L(cVar, obj);
        return obj;
    }

    private final q P(f1 f1Var) {
        q qVar = f1Var instanceof q ? (q) f1Var : null;
        if (qVar != null) {
            return qVar;
        }
        w1 f10 = f1Var.f();
        if (f10 != null) {
            return o0(f10);
        }
        return null;
    }

    private final Throwable Q(Object obj) {
        u uVar = obj instanceof u ? (u) obj : null;
        if (uVar != null) {
            return uVar.f25023a;
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.Throwable} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Throwable S(lm.r1.c r4, java.util.List r5) {
        /*
            r3 = this;
            boolean r0 = r5.isEmpty()
            r1 = 0
            if (r0 == 0) goto L_0x0018
            boolean r4 = r4.g()
            if (r4 == 0) goto L_0x0017
            lm.l1 r4 = new lm.l1
            java.lang.String r5 = r3.J()
            r4.<init>(r5, r1, r3)
            return r4
        L_0x0017:
            return r1
        L_0x0018:
            r4 = r5
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L_0x001f:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0033
            java.lang.Object r0 = r4.next()
            r2 = r0
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            boolean r2 = r2 instanceof java.util.concurrent.CancellationException
            r2 = r2 ^ 1
            if (r2 == 0) goto L_0x001f
            r1 = r0
        L_0x0033:
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            if (r1 == 0) goto L_0x0038
            return r1
        L_0x0038:
            r4 = 0
            java.lang.Object r4 = r5.get(r4)
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: lm.r1.S(lm.r1$c, java.util.List):java.lang.Throwable");
    }

    private final w1 V(f1 f1Var) {
        w1 f10 = f1Var.f();
        if (f10 != null) {
            return f10;
        }
        if (f1Var instanceof t0) {
            return new w1();
        }
        if (f1Var instanceof q1) {
            v0((q1) f1Var);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + f1Var).toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0040, code lost:
        if (r0 == null) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0042, code lost:
        p0(((lm.r1.c) r2).f(), r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004f, code lost:
        return lm.s1.a();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Object k0(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 0
            r1 = r0
        L_0x0002:
            java.lang.Object r2 = r6.a0()
            boolean r3 = r2 instanceof lm.r1.c
            if (r3 == 0) goto L_0x0052
            monitor-enter(r2)
            r3 = r2
            lm.r1$c r3 = (lm.r1.c) r3     // Catch:{ all -> 0x001a }
            boolean r3 = r3.i()     // Catch:{ all -> 0x001a }
            if (r3 == 0) goto L_0x001c
            qm.h0 r7 = lm.s1.f25011d     // Catch:{ all -> 0x001a }
            monitor-exit(r2)
            return r7
        L_0x001a:
            r7 = move-exception
            goto L_0x0050
        L_0x001c:
            r3 = r2
            lm.r1$c r3 = (lm.r1.c) r3     // Catch:{ all -> 0x001a }
            boolean r3 = r3.g()     // Catch:{ all -> 0x001a }
            if (r7 != 0) goto L_0x0027
            if (r3 != 0) goto L_0x0033
        L_0x0027:
            if (r1 != 0) goto L_0x002d
            java.lang.Throwable r1 = r6.N(r7)     // Catch:{ all -> 0x001a }
        L_0x002d:
            r7 = r2
            lm.r1$c r7 = (lm.r1.c) r7     // Catch:{ all -> 0x001a }
            r7.a(r1)     // Catch:{ all -> 0x001a }
        L_0x0033:
            r7 = r2
            lm.r1$c r7 = (lm.r1.c) r7     // Catch:{ all -> 0x001a }
            java.lang.Throwable r7 = r7.e()     // Catch:{ all -> 0x001a }
            r1 = r3 ^ 1
            if (r1 == 0) goto L_0x003f
            r0 = r7
        L_0x003f:
            monitor-exit(r2)
            if (r0 == 0) goto L_0x004b
            lm.r1$c r2 = (lm.r1.c) r2
            lm.w1 r7 = r2.f()
            r6.p0(r7, r0)
        L_0x004b:
            qm.h0 r7 = lm.s1.f25008a
            return r7
        L_0x0050:
            monitor-exit(r2)
            throw r7
        L_0x0052:
            boolean r3 = r2 instanceof lm.f1
            if (r3 == 0) goto L_0x00a3
            if (r1 != 0) goto L_0x005c
            java.lang.Throwable r1 = r6.N(r7)
        L_0x005c:
            r3 = r2
            lm.f1 r3 = (lm.f1) r3
            boolean r4 = r3.c()
            if (r4 == 0) goto L_0x0070
            boolean r2 = r6.E0(r3, r1)
            if (r2 == 0) goto L_0x0002
            qm.h0 r7 = lm.s1.f25008a
            return r7
        L_0x0070:
            lm.u r3 = new lm.u
            r4 = 0
            r5 = 2
            r3.<init>(r1, r4, r5, r0)
            java.lang.Object r3 = r6.F0(r2, r3)
            qm.h0 r4 = lm.s1.f25008a
            if (r3 == r4) goto L_0x0088
            qm.h0 r2 = lm.s1.f25010c
            if (r3 == r2) goto L_0x0002
            return r3
        L_0x0088:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Cannot happen in "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        L_0x00a3:
            qm.h0 r7 = lm.s1.f25011d
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: lm.r1.k0(java.lang.Object):java.lang.Object");
    }

    private final q1 m0(bm.l lVar, boolean z10) {
        q1 q1Var = null;
        if (z10) {
            if (lVar instanceof m1) {
                q1Var = (m1) lVar;
            }
            if (q1Var == null) {
                q1Var = new i1(lVar);
            }
        } else {
            if (lVar instanceof q1) {
                q1Var = (q1) lVar;
            }
            if (q1Var == null) {
                q1Var = new j1(lVar);
            }
        }
        q1Var.z(this);
        return q1Var;
    }

    private final q o0(s sVar) {
        while (sVar.s()) {
            sVar = sVar.r();
        }
        while (true) {
            sVar = sVar.q();
            if (!sVar.s()) {
                if (sVar instanceof q) {
                    return (q) sVar;
                }
                if (sVar instanceof w1) {
                    return null;
                }
            }
        }
    }

    private final void p0(w1 w1Var, Throwable th2) {
        r0(th2);
        Object p10 = w1Var.p();
        l.d(p10, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        x xVar = null;
        for (s sVar = (s) p10; !l.a(sVar, w1Var); sVar = sVar.q()) {
            if (sVar instanceof m1) {
                q1 q1Var = (q1) sVar;
                try {
                    q1Var.x(th2);
                } catch (Throwable th3) {
                    if (xVar != null) {
                        b.a(xVar, th3);
                    } else {
                        xVar = new x("Exception in completion handler " + q1Var + " for " + this, th3);
                        x xVar2 = x.f30437a;
                    }
                }
            }
        }
        if (xVar != null) {
            d0(xVar);
        }
        I(th2);
    }

    private final void q0(w1 w1Var, Throwable th2) {
        Object p10 = w1Var.p();
        l.d(p10, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        x xVar = null;
        for (s sVar = (s) p10; !l.a(sVar, w1Var); sVar = sVar.q()) {
            if (sVar instanceof q1) {
                q1 q1Var = (q1) sVar;
                try {
                    q1Var.x(th2);
                } catch (Throwable th3) {
                    if (xVar != null) {
                        b.a(xVar, th3);
                    } else {
                        xVar = new x("Exception in completion handler " + q1Var + " for " + this, th3);
                        x xVar2 = x.f30437a;
                    }
                }
            }
        }
        if (xVar != null) {
            d0(xVar);
        }
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [lm.e1] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void u0(lm.t0 r3) {
        /*
            r2 = this;
            lm.w1 r0 = new lm.w1
            r0.<init>()
            boolean r1 = r3.c()
            if (r1 == 0) goto L_0x000c
            goto L_0x0012
        L_0x000c:
            lm.e1 r1 = new lm.e1
            r1.<init>(r0)
            r0 = r1
        L_0x0012:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f24994e
            androidx.concurrent.futures.b.a(r1, r2, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lm.r1.u0(lm.t0):void");
    }

    private final void v0(q1 q1Var) {
        q1Var.k(new w1());
        androidx.concurrent.futures.b.a(f24994e, this, q1Var, q1Var.q());
    }

    private final boolean w(Object obj, w1 w1Var, q1 q1Var) {
        int w10;
        d dVar = new d(q1Var, this, obj);
        do {
            w10 = w1Var.r().w(q1Var, w1Var, dVar);
            if (w10 == 1) {
                return true;
            }
        } while (w10 != 2);
        return false;
    }

    private final void x(Throwable th2, List list) {
        if (list.size() > 1) {
            Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Throwable th3 = (Throwable) it.next();
                if (th3 != th2 && th3 != th2 && !(th3 instanceof CancellationException) && newSetFromMap.add(th3)) {
                    b.a(th2, th3);
                }
            }
        }
    }

    private final int y0(Object obj) {
        if (obj instanceof t0) {
            if (((t0) obj).c()) {
                return 0;
            }
            if (!androidx.concurrent.futures.b.a(f24994e, this, obj, s1.f25014g)) {
                return -1;
            }
            t0();
            return 1;
        } else if (!(obj instanceof e1)) {
            return 0;
        } else {
            if (!androidx.concurrent.futures.b.a(f24994e, this, obj, ((e1) obj).f())) {
                return -1;
            }
            t0();
            return 1;
        }
    }

    private final String z0(Object obj) {
        if (!(obj instanceof c)) {
            return obj instanceof f1 ? ((f1) obj).c() ? "Active" : "New" : obj instanceof u ? "Cancelled" : "Completed";
        }
        c cVar = (c) obj;
        if (cVar.g()) {
            return "Cancelling";
        }
        return cVar.h() ? "Completing" : "Active";
    }

    /* access modifiers changed from: protected */
    public final Object A(tl.d dVar) {
        Object a02;
        do {
            a02 = a0();
            if (!(a02 instanceof f1)) {
                if (!(a02 instanceof u)) {
                    return s1.h(a02);
                }
                throw ((u) a02).f25023a;
            }
        } while (y0(a02) < 0);
        return B(dVar);
    }

    /* access modifiers changed from: protected */
    public final CancellationException A0(Throwable th2, String str) {
        CancellationException cancellationException = th2 instanceof CancellationException ? (CancellationException) th2 : null;
        if (cancellationException == null) {
            if (str == null) {
                str = J();
            }
            cancellationException = new l1(str, th2, this);
        }
        return cancellationException;
    }

    public final boolean C(Throwable th2) {
        return D(th2);
    }

    public final String C0() {
        return n0() + '{' + z0(a0()) + '}';
    }

    public final boolean D(Object obj) {
        Object a10 = s1.f25008a;
        if (U() && (a10 = G(obj)) == s1.f25009b) {
            return true;
        }
        if (a10 == s1.f25008a) {
            a10 = k0(obj);
        }
        if (a10 == s1.f25008a || a10 == s1.f25009b) {
            return true;
        }
        if (a10 == s1.f25011d) {
            return false;
        }
        z(a10);
        return true;
    }

    public void F(Throwable th2) {
        D(th2);
    }

    /* access modifiers changed from: protected */
    public String J() {
        return "Job was cancelled";
    }

    public boolean K(Throwable th2) {
        if (th2 instanceof CancellationException) {
            return true;
        }
        return D(th2) && T();
    }

    public final void R(z1 z1Var) {
        D(z1Var);
    }

    public boolean T() {
        return true;
    }

    public boolean U() {
        return false;
    }

    public final p W() {
        return (p) f24995f.get(this);
    }

    public Object X(Object obj, p pVar) {
        return k1.a.b(this, obj, pVar);
    }

    public CancellationException Z() {
        Throwable th2;
        Object a02 = a0();
        CancellationException cancellationException = null;
        if (a02 instanceof c) {
            th2 = ((c) a02).e();
        } else if (a02 instanceof u) {
            th2 = ((u) a02).f25023a;
        } else if (!(a02 instanceof f1)) {
            th2 = null;
        } else {
            throw new IllegalStateException(("Cannot be cancelling child in this state: " + a02).toString());
        }
        if (th2 instanceof CancellationException) {
            cancellationException = (CancellationException) th2;
        }
        if (cancellationException != null) {
            return cancellationException;
        }
        return new l1("Parent job is " + z0(a02), th2, this);
    }

    public final Object a0() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f24994e;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof a0)) {
                return obj;
            }
            ((a0) obj).a(this);
        }
    }

    /* access modifiers changed from: protected */
    public boolean b0(Throwable th2) {
        return false;
    }

    public boolean c() {
        Object a02 = a0();
        return (a02 instanceof f1) && ((f1) a02).c();
    }

    public final CancellationException c0() {
        Object a02 = a0();
        if (a02 instanceof c) {
            Throwable e10 = ((c) a02).e();
            if (e10 != null) {
                CancellationException A0 = A0(e10, h0.a(this) + " is cancelling");
                if (A0 != null) {
                    return A0;
                }
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        } else if (a02 instanceof f1) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        } else if (a02 instanceof u) {
            return B0(this, ((u) a02).f25023a, (String) null, 1, (Object) null);
        } else {
            return new l1(h0.a(this) + " has completed normally", (Throwable) null, this);
        }
    }

    public void d0(Throwable th2) {
        throw th2;
    }

    public void e(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new l1(J(), (Throwable) null, this);
        }
        F(cancellationException);
    }

    /* access modifiers changed from: protected */
    public final void e0(k1 k1Var) {
        if (k1Var == null) {
            x0(x1.f25033e);
            return;
        }
        k1Var.start();
        p i02 = k1Var.i0(this);
        x0(i02);
        if (g0()) {
            i02.b();
            x0(x1.f25033e);
        }
    }

    public g.b f(g.c cVar) {
        return k1.a.c(this, cVar);
    }

    public final boolean f0() {
        Object a02 = a0();
        return (a02 instanceof u) || ((a02 instanceof c) && ((c) a02).g());
    }

    public tl.g g(g.c cVar) {
        return k1.a.e(this, cVar);
    }

    public final boolean g0() {
        return !(a0() instanceof f1);
    }

    public final g.c getKey() {
        return k1.f24977b;
    }

    /* access modifiers changed from: protected */
    public boolean h0() {
        return false;
    }

    public final p i0(r rVar) {
        r0 d10 = k1.a.d(this, true, false, new q(rVar), 2, (Object) null);
        l.d(d10, "null cannot be cast to non-null type kotlinx.coroutines.ChildHandle");
        return (p) d10;
    }

    public final r0 j0(boolean z10, boolean z11, bm.l lVar) {
        q1 m02 = m0(lVar, z10);
        while (true) {
            Object a02 = a0();
            if (a02 instanceof t0) {
                t0 t0Var = (t0) a02;
                if (!t0Var.c()) {
                    u0(t0Var);
                } else if (androidx.concurrent.futures.b.a(f24994e, this, a02, m02)) {
                    return m02;
                }
            } else {
                Throwable th2 = null;
                if (a02 instanceof f1) {
                    w1 f10 = ((f1) a02).f();
                    if (f10 == null) {
                        l.d(a02, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                        v0((q1) a02);
                    } else {
                        r0 r0Var = x1.f25033e;
                        if (z10 && (a02 instanceof c)) {
                            synchronized (a02) {
                                try {
                                    th2 = ((c) a02).e();
                                    if (th2 != null) {
                                        if ((lVar instanceof q) && !((c) a02).h()) {
                                        }
                                        x xVar = x.f30437a;
                                    }
                                    if (w(a02, f10, m02)) {
                                        if (th2 == null) {
                                            return m02;
                                        }
                                        r0Var = m02;
                                        x xVar2 = x.f30437a;
                                    }
                                } catch (Throwable th3) {
                                    throw th3;
                                }
                            }
                        }
                        if (th2 != null) {
                            if (z11) {
                                lVar.invoke(th2);
                            }
                            return r0Var;
                        } else if (w(a02, f10, m02)) {
                            return m02;
                        }
                    }
                } else {
                    if (z11) {
                        u uVar = a02 instanceof u ? (u) a02 : null;
                        if (uVar != null) {
                            th2 = uVar.f25023a;
                        }
                        lVar.invoke(th2);
                    }
                    return x1.f25033e;
                }
            }
        }
    }

    public tl.g l(tl.g gVar) {
        return k1.a.f(this, gVar);
    }

    public final Object l0(Object obj) {
        Object F0;
        do {
            F0 = F0(a0(), obj);
            if (F0 == s1.f25008a) {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + obj, Q(obj));
            }
        } while (F0 == s1.f25010c);
        return F0;
    }

    public String n0() {
        return h0.a(this);
    }

    public final r0 o(bm.l lVar) {
        return j0(false, true, lVar);
    }

    /* access modifiers changed from: protected */
    public void r0(Throwable th2) {
    }

    /* access modifiers changed from: protected */
    public void s0(Object obj) {
    }

    public final boolean start() {
        int y02;
        do {
            y02 = y0(a0());
            if (y02 == 0) {
                return false;
            }
        } while (y02 != 1);
        return true;
    }

    /* access modifiers changed from: protected */
    public void t0() {
    }

    public String toString() {
        return C0() + '@' + h0.b(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void w0(lm.q1 r4) {
        /*
            r3 = this;
        L_0x0000:
            java.lang.Object r0 = r3.a0()
            boolean r1 = r0 instanceof lm.q1
            if (r1 == 0) goto L_0x0018
            if (r0 == r4) goto L_0x000b
            return
        L_0x000b:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f24994e
            lm.t0 r2 = lm.s1.f25014g
            boolean r0 = androidx.concurrent.futures.b.a(r1, r3, r0, r2)
            if (r0 == 0) goto L_0x0000
            return
        L_0x0018:
            boolean r1 = r0 instanceof lm.f1
            if (r1 == 0) goto L_0x0027
            lm.f1 r0 = (lm.f1) r0
            lm.w1 r0 = r0.f()
            if (r0 == 0) goto L_0x0027
            r4.t()
        L_0x0027:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lm.r1.w0(lm.q1):void");
    }

    public final void x0(p pVar) {
        f24995f.set(this, pVar);
    }

    /* access modifiers changed from: protected */
    public void z(Object obj) {
    }
}
