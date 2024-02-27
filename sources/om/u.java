package om;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.jvm.internal.d;
import pl.x;
import pm.h;
import qm.h0;

final class u extends pm.a implements m, d {

    /* renamed from: e  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f30197e = AtomicReferenceFieldUpdater.newUpdater(u.class, Object.class, "_state");
    private volatile Object _state;

    /* renamed from: d  reason: collision with root package name */
    private int f30198d;

    static final class a extends d {

        /* renamed from: e  reason: collision with root package name */
        Object f30199e;

        /* renamed from: f  reason: collision with root package name */
        Object f30200f;

        /* renamed from: g  reason: collision with root package name */
        Object f30201g;

        /* renamed from: h  reason: collision with root package name */
        Object f30202h;

        /* renamed from: i  reason: collision with root package name */
        Object f30203i;

        /* renamed from: j  reason: collision with root package name */
        /* synthetic */ Object f30204j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ u f30205k;

        /* renamed from: l  reason: collision with root package name */
        int f30206l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(u uVar, tl.d dVar) {
            super(dVar);
            this.f30205k = uVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f30204j = obj;
            this.f30206l |= Integer.MIN_VALUE;
            return this.f30205k.a((e) null, this);
        }
    }

    public u(Object obj) {
        this._state = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0030, code lost:
        r8 = (om.w[]) r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0032, code lost:
        if (r8 == null) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0034, code lost:
        r0 = r8.length;
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0036, code lost:
        if (r3 >= r0) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0038, code lost:
        r4 = r8[r3];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003a, code lost:
        if (r4 == null) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x003c, code lost:
        r4.g();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x003f, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0042, code lost:
        monitor-enter(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r8 = r6.f30198d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0045, code lost:
        if (r8 != r7) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0047, code lost:
        r6.f30198d = r7 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x004a, code lost:
        monitor-exit(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x004b, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        r7 = k();
        r0 = pl.x.f30437a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0054, code lost:
        monitor-exit(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0055, code lost:
        r5 = r8;
        r8 = r7;
        r7 = r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean n(java.lang.Object r7, java.lang.Object r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f30197e     // Catch:{ all -> 0x0012 }
            java.lang.Object r1 = r0.get(r6)     // Catch:{ all -> 0x0012 }
            r2 = 0
            if (r7 == 0) goto L_0x0014
            boolean r7 = cm.l.a(r1, r7)     // Catch:{ all -> 0x0012 }
            if (r7 != 0) goto L_0x0014
            monitor-exit(r6)
            return r2
        L_0x0012:
            r7 = move-exception
            goto L_0x0061
        L_0x0014:
            boolean r7 = cm.l.a(r1, r8)     // Catch:{ all -> 0x0012 }
            r1 = 1
            if (r7 == 0) goto L_0x001d
            monitor-exit(r6)
            return r1
        L_0x001d:
            r0.set(r6, r8)     // Catch:{ all -> 0x0012 }
            int r7 = r6.f30198d     // Catch:{ all -> 0x0012 }
            r8 = r7 & 1
            if (r8 != 0) goto L_0x005b
            int r7 = r7 + r1
            r6.f30198d = r7     // Catch:{ all -> 0x0012 }
            pm.c[] r8 = r6.k()     // Catch:{ all -> 0x0012 }
            pl.x r0 = pl.x.f30437a     // Catch:{ all -> 0x0012 }
            monitor-exit(r6)
        L_0x0030:
            om.w[] r8 = (om.w[]) r8
            if (r8 == 0) goto L_0x0042
            int r0 = r8.length
            r3 = r2
        L_0x0036:
            if (r3 >= r0) goto L_0x0042
            r4 = r8[r3]
            if (r4 == 0) goto L_0x003f
            r4.g()
        L_0x003f:
            int r3 = r3 + 1
            goto L_0x0036
        L_0x0042:
            monitor-enter(r6)
            int r8 = r6.f30198d     // Catch:{ all -> 0x004c }
            if (r8 != r7) goto L_0x004e
            int r7 = r7 + r1
            r6.f30198d = r7     // Catch:{ all -> 0x004c }
            monitor-exit(r6)
            return r1
        L_0x004c:
            r7 = move-exception
            goto L_0x0059
        L_0x004e:
            pm.c[] r7 = r6.k()     // Catch:{ all -> 0x004c }
            pl.x r0 = pl.x.f30437a     // Catch:{ all -> 0x004c }
            monitor-exit(r6)
            r5 = r8
            r8 = r7
            r7 = r5
            goto L_0x0030
        L_0x0059:
            monitor-exit(r6)
            throw r7
        L_0x005b:
            int r7 = r7 + 2
            r6.f30198d = r7     // Catch:{ all -> 0x0012 }
            monitor-exit(r6)
            return r1
        L_0x0061:
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: om.u.n(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: om.w} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: om.u} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0097 A[Catch:{ all -> 0x0042 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a6 A[Catch:{ all -> 0x0042 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a8 A[Catch:{ all -> 0x0042 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00bb A[Catch:{ all -> 0x0042 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00bc A[Catch:{ all -> 0x0042 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00c3 A[Catch:{ all -> 0x0042 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(om.e r11, tl.d r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof om.u.a
            if (r0 == 0) goto L_0x0013
            r0 = r12
            om.u$a r0 = (om.u.a) r0
            int r1 = r0.f30206l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f30206l = r1
            goto L_0x0018
        L_0x0013:
            om.u$a r0 = new om.u$a
            r0.<init>(r10, r12)
        L_0x0018:
            java.lang.Object r12 = r0.f30204j
            java.lang.Object r1 = ul.d.c()
            int r2 = r0.f30206l
            r3 = 0
            r4 = 3
            r5 = 2
            if (r2 == 0) goto L_0x0075
            r11 = 1
            if (r2 == r11) goto L_0x0063
            if (r2 == r5) goto L_0x004d
            if (r2 != r4) goto L_0x0045
            java.lang.Object r11 = r0.f30203i
            java.lang.Object r2 = r0.f30202h
            lm.k1 r2 = (lm.k1) r2
            java.lang.Object r6 = r0.f30201g
            om.w r6 = (om.w) r6
            java.lang.Object r7 = r0.f30200f
            om.e r7 = (om.e) r7
            java.lang.Object r8 = r0.f30199e
            om.u r8 = (om.u) r8
            pl.q.b(r12)     // Catch:{ all -> 0x0042 }
            goto L_0x008f
        L_0x0042:
            r11 = move-exception
            goto L_0x00d6
        L_0x0045:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x004d:
            java.lang.Object r11 = r0.f30203i
            java.lang.Object r2 = r0.f30202h
            lm.k1 r2 = (lm.k1) r2
            java.lang.Object r6 = r0.f30201g
            om.w r6 = (om.w) r6
            java.lang.Object r7 = r0.f30200f
            om.e r7 = (om.e) r7
            java.lang.Object r8 = r0.f30199e
            om.u r8 = (om.u) r8
            pl.q.b(r12)     // Catch:{ all -> 0x0042 }
            goto L_0x00bd
        L_0x0063:
            java.lang.Object r11 = r0.f30201g
            r6 = r11
            om.w r6 = (om.w) r6
            java.lang.Object r11 = r0.f30200f
            om.e r11 = (om.e) r11
            java.lang.Object r2 = r0.f30199e
            r8 = r2
            om.u r8 = (om.u) r8
            pl.q.b(r12)     // Catch:{ all -> 0x0042 }
            goto L_0x0080
        L_0x0075:
            pl.q.b(r12)
            pm.c r12 = r10.f()
            om.w r12 = (om.w) r12
            r8 = r10
            r6 = r12
        L_0x0080:
            tl.g r12 = r0.getContext()     // Catch:{ all -> 0x0042 }
            lm.k1$b r2 = lm.k1.f24977b     // Catch:{ all -> 0x0042 }
            tl.g$b r12 = r12.f(r2)     // Catch:{ all -> 0x0042 }
            lm.k1 r12 = (lm.k1) r12     // Catch:{ all -> 0x0042 }
            r7 = r11
            r2 = r12
            r11 = r3
        L_0x008f:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r12 = f30197e     // Catch:{ all -> 0x0042 }
            java.lang.Object r12 = r12.get(r8)     // Catch:{ all -> 0x0042 }
            if (r2 == 0) goto L_0x009a
            lm.o1.e(r2)     // Catch:{ all -> 0x0042 }
        L_0x009a:
            if (r11 == 0) goto L_0x00a2
            boolean r9 = cm.l.a(r11, r12)     // Catch:{ all -> 0x0042 }
            if (r9 != 0) goto L_0x00bd
        L_0x00a2:
            qm.h0 r11 = pm.h.f30474a     // Catch:{ all -> 0x0042 }
            if (r12 != r11) goto L_0x00a8
            r11 = r3
            goto L_0x00a9
        L_0x00a8:
            r11 = r12
        L_0x00a9:
            r0.f30199e = r8     // Catch:{ all -> 0x0042 }
            r0.f30200f = r7     // Catch:{ all -> 0x0042 }
            r0.f30201g = r6     // Catch:{ all -> 0x0042 }
            r0.f30202h = r2     // Catch:{ all -> 0x0042 }
            r0.f30203i = r12     // Catch:{ all -> 0x0042 }
            r0.f30206l = r5     // Catch:{ all -> 0x0042 }
            java.lang.Object r11 = r7.c(r11, r0)     // Catch:{ all -> 0x0042 }
            if (r11 != r1) goto L_0x00bc
            return r1
        L_0x00bc:
            r11 = r12
        L_0x00bd:
            boolean r12 = r6.h()     // Catch:{ all -> 0x0042 }
            if (r12 != 0) goto L_0x008f
            r0.f30199e = r8     // Catch:{ all -> 0x0042 }
            r0.f30200f = r7     // Catch:{ all -> 0x0042 }
            r0.f30201g = r6     // Catch:{ all -> 0x0042 }
            r0.f30202h = r2     // Catch:{ all -> 0x0042 }
            r0.f30203i = r11     // Catch:{ all -> 0x0042 }
            r0.f30206l = r4     // Catch:{ all -> 0x0042 }
            java.lang.Object r12 = r6.e(r0)     // Catch:{ all -> 0x0042 }
            if (r12 != r1) goto L_0x008f
            return r1
        L_0x00d6:
            r8.i(r6)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: om.u.a(om.e, tl.d):java.lang.Object");
    }

    public boolean b(Object obj) {
        setValue(obj);
        return true;
    }

    public Object c(Object obj, tl.d dVar) {
        setValue(obj);
        return x.f30437a;
    }

    public Object getValue() {
        h0 h0Var = h.f30474a;
        Object obj = f30197e.get(this);
        if (obj == h0Var) {
            return null;
        }
        return obj;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public w g() {
        return new w();
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public w[] h(int i10) {
        return new w[i10];
    }

    public void setValue(Object obj) {
        if (obj == null) {
            obj = h.f30474a;
        }
        n((Object) null, obj);
    }
}
