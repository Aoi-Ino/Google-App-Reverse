package qm;

import cm.l;
import cm.p;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import lm.h0;

public class s {
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f30850e;

    /* renamed from: f  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f30851f;

    /* renamed from: g  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f30852g;
    private volatile Object _next = this;
    private volatile Object _prev = this;
    private volatile Object _removedRef;

    public static abstract class a extends b {

        /* renamed from: b  reason: collision with root package name */
        public final s f30853b;

        /* renamed from: c  reason: collision with root package name */
        public s f30854c;

        public a(s sVar) {
            this.f30853b = sVar;
        }

        /* renamed from: e */
        public void b(s sVar, Object obj) {
            boolean z10 = obj == null;
            s sVar2 = z10 ? this.f30853b : this.f30854c;
            if (sVar2 != null && androidx.concurrent.futures.b.a(s.f30850e, sVar, this, sVar2) && z10) {
                s sVar3 = this.f30853b;
                s sVar4 = this.f30854c;
                l.c(sVar4);
                sVar3.n(sVar4);
            }
        }
    }

    /* synthetic */ class b extends p {
        b(Object obj) {
            super(obj, h0.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1);
        }

        public Object get() {
            return h0.a(this.f20212f);
        }
    }

    static {
        Class<s> cls = s.class;
        Class<Object> cls2 = Object.class;
        f30850e = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_next");
        f30851f = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_prev");
        f30852g = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_removedRef");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: qm.s} */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0042, code lost:
        if (androidx.concurrent.futures.b.a(r4, r3, r2, ((qm.b0) r5).f30805a) != false) goto L_0x0045;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final qm.s l(qm.a0 r9) {
        /*
            r8 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f30851f
            java.lang.Object r0 = r0.get(r8)
            qm.s r0 = (qm.s) r0
            r1 = 0
            r2 = r0
        L_0x000a:
            r3 = r1
        L_0x000b:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = f30850e
            java.lang.Object r5 = r4.get(r2)
            if (r5 != r8) goto L_0x0020
            if (r0 != r2) goto L_0x0016
            return r2
        L_0x0016:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f30851f
            boolean r0 = androidx.concurrent.futures.b.a(r1, r8, r0, r2)
            if (r0 != 0) goto L_0x001f
            goto L_0x0000
        L_0x001f:
            return r2
        L_0x0020:
            boolean r6 = r8.s()
            if (r6 == 0) goto L_0x0027
            return r1
        L_0x0027:
            if (r5 != r9) goto L_0x002a
            return r2
        L_0x002a:
            boolean r6 = r5 instanceof qm.a0
            if (r6 == 0) goto L_0x0034
            qm.a0 r5 = (qm.a0) r5
            r5.a(r2)
            goto L_0x0000
        L_0x0034:
            boolean r6 = r5 instanceof qm.b0
            if (r6 == 0) goto L_0x0050
            if (r3 == 0) goto L_0x0047
            qm.b0 r5 = (qm.b0) r5
            qm.s r5 = r5.f30805a
            boolean r2 = androidx.concurrent.futures.b.a(r4, r3, r2, r5)
            if (r2 != 0) goto L_0x0045
            goto L_0x0000
        L_0x0045:
            r2 = r3
            goto L_0x000a
        L_0x0047:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = f30851f
            java.lang.Object r2 = r4.get(r2)
            qm.s r2 = (qm.s) r2
            goto L_0x000b
        L_0x0050:
            java.lang.String r3 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            cm.l.d(r5, r3)
            r3 = r5
            qm.s r3 = (qm.s) r3
            r7 = r3
            r3 = r2
            r2 = r7
            goto L_0x000b
        */
        throw new UnsupportedOperationException("Method not decompiled: qm.s.l(qm.a0):qm.s");
    }

    private final s m(s sVar) {
        while (sVar.s()) {
            sVar = (s) f30851f.get(sVar);
        }
        return sVar;
    }

    /* access modifiers changed from: private */
    public final void n(s sVar) {
        s sVar2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f30851f;
        do {
            sVar2 = (s) atomicReferenceFieldUpdater.get(sVar);
            if (p() != sVar) {
                return;
            }
        } while (!androidx.concurrent.futures.b.a(f30851f, sVar, sVar2, this));
        if (s()) {
            sVar.l((a0) null);
        }
    }

    private final b0 v() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f30852g;
        b0 b0Var = (b0) atomicReferenceFieldUpdater.get(this);
        if (b0Var != null) {
            return b0Var;
        }
        b0 b0Var2 = new b0(this);
        atomicReferenceFieldUpdater.lazySet(this, b0Var2);
        return b0Var2;
    }

    public final boolean k(s sVar) {
        f30851f.lazySet(sVar, this);
        f30850e.lazySet(sVar, this);
        while (p() == this) {
            if (androidx.concurrent.futures.b.a(f30850e, this, this, sVar)) {
                sVar.n(this);
                return true;
            }
        }
        return false;
    }

    public final Object p() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f30850e;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof a0)) {
                return obj;
            }
            ((a0) obj).a(this);
        }
    }

    public final s q() {
        return r.b(p());
    }

    public final s r() {
        s l10 = l((a0) null);
        return l10 == null ? m((s) f30851f.get(this)) : l10;
    }

    public boolean s() {
        return p() instanceof b0;
    }

    public boolean t() {
        return u() == null;
    }

    public String toString() {
        return new b(this) + '@' + h0.b(this);
    }

    public final s u() {
        Object p10;
        s sVar;
        do {
            p10 = p();
            if (p10 instanceof b0) {
                return ((b0) p10).f30805a;
            }
            if (p10 == this) {
                return (s) p10;
            }
            l.d(p10, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            sVar = (s) p10;
        } while (!androidx.concurrent.futures.b.a(f30850e, this, p10, sVar.v()));
        sVar.l((a0) null);
        return null;
    }

    public final int w(s sVar, s sVar2, a aVar) {
        f30851f.lazySet(sVar, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f30850e;
        atomicReferenceFieldUpdater.lazySet(sVar, sVar2);
        aVar.f30854c = sVar2;
        if (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, sVar2, aVar)) {
            return 0;
        }
        return aVar.a(this) == null ? 1 : 2;
    }
}
