package om;

import cm.l;
import kotlin.coroutines.jvm.internal.h;
import lm.k;
import lm.m;
import lm.r0;
import pl.p;
import pl.x;
import qm.h0;
import tl.d;

public class q extends pm.a implements l, d {

    /* renamed from: d  reason: collision with root package name */
    private final int f30174d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final int f30175e;

    /* renamed from: f  reason: collision with root package name */
    private final nm.a f30176f;

    /* renamed from: g  reason: collision with root package name */
    private Object[] f30177g;

    /* renamed from: h  reason: collision with root package name */
    private long f30178h;

    /* renamed from: i  reason: collision with root package name */
    private long f30179i;

    /* renamed from: j  reason: collision with root package name */
    private int f30180j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public int f30181k;

    private static final class a implements r0 {

        /* renamed from: e  reason: collision with root package name */
        public final q f30182e;

        /* renamed from: f  reason: collision with root package name */
        public long f30183f;

        /* renamed from: g  reason: collision with root package name */
        public final Object f30184g;

        /* renamed from: h  reason: collision with root package name */
        public final d f30185h;

        public a(q qVar, long j10, Object obj, d dVar) {
            this.f30182e = qVar;
            this.f30183f = j10;
            this.f30184g = obj;
            this.f30185h = dVar;
        }

        public void b() {
            this.f30182e.w(this);
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f30186a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                nm.a[] r0 = nm.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                nm.a r1 = nm.a.SUSPEND     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                nm.a r1 = nm.a.DROP_LATEST     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                nm.a r1 = nm.a.DROP_OLDEST     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f30186a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: om.q.b.<clinit>():void");
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: e  reason: collision with root package name */
        Object f30187e;

        /* renamed from: f  reason: collision with root package name */
        Object f30188f;

        /* renamed from: g  reason: collision with root package name */
        Object f30189g;

        /* renamed from: h  reason: collision with root package name */
        Object f30190h;

        /* renamed from: i  reason: collision with root package name */
        /* synthetic */ Object f30191i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ q f30192j;

        /* renamed from: k  reason: collision with root package name */
        int f30193k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(q qVar, d dVar) {
            super(dVar);
            this.f30192j = qVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f30191i = obj;
            this.f30193k |= Integer.MIN_VALUE;
            return q.y(this.f30192j, (e) null, this);
        }
    }

    public q(int i10, int i11, nm.a aVar) {
        this.f30174d = i10;
        this.f30175e = i11;
        this.f30176f = aVar;
    }

    private final void C() {
        Object[] objArr = this.f30177g;
        l.c(objArr);
        r.f(objArr, I(), (Object) null);
        this.f30180j--;
        long I = I() + 1;
        if (this.f30178h < I) {
            this.f30178h = I;
        }
        if (this.f30179i < I) {
            z(I);
        }
    }

    static /* synthetic */ Object D(q qVar, Object obj, d dVar) {
        if (qVar.b(obj)) {
            return x.f30437a;
        }
        Object E = qVar.E(obj, dVar);
        return E == d.c() ? E : x.f30437a;
    }

    private final Object E(Object obj, d dVar) {
        d[] dVarArr;
        a aVar;
        k kVar = new k(c.b(dVar), 1);
        kVar.y();
        d[] dVarArr2 = pm.b.f30443a;
        synchronized (this) {
            try {
                if (O(obj)) {
                    p.a aVar2 = p.f30426e;
                    kVar.resumeWith(p.a(x.f30437a));
                    dVarArr = G(dVarArr2);
                    aVar = null;
                } else {
                    a aVar3 = new a(this, ((long) M()) + I(), obj, kVar);
                    F(aVar3);
                    this.f30181k = this.f30181k + 1;
                    if (this.f30175e == 0) {
                        dVarArr2 = G(dVarArr2);
                    }
                    dVarArr = dVarArr2;
                    aVar = aVar3;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (aVar != null) {
            m.a(kVar, aVar);
        }
        for (d dVar2 : dVarArr) {
            if (dVar2 != null) {
                p.a aVar4 = p.f30426e;
                dVar2.resumeWith(p.a(x.f30437a));
            }
        }
        Object v10 = kVar.v();
        if (v10 == d.c()) {
            h.c(dVar);
        }
        return v10 == d.c() ? v10 : x.f30437a;
    }

    /* access modifiers changed from: private */
    public final void F(Object obj) {
        int M = M();
        Object[] objArr = this.f30177g;
        if (objArr == null) {
            objArr = N((Object[]) null, 0, 2);
        } else if (M >= objArr.length) {
            objArr = N(objArr, M, objArr.length * 2);
        }
        r.f(objArr, I() + ((long) M), obj);
    }

    /* JADX WARNING: type inference failed for: r11v6, types: [java.lang.Object[], java.lang.Object] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0044, code lost:
        r11 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0044, code lost:
        r11 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
        r4 = (om.s) r4;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final tl.d[] G(tl.d[] r11) {
        /*
            r10 = this;
            int r0 = r11.length
            int r1 = r10.f30441b
            if (r1 == 0) goto L_0x0047
            pm.c[] r1 = r10.f30440a
            if (r1 == 0) goto L_0x0047
            int r2 = r1.length
            r3 = 0
        L_0x000f:
            if (r3 >= r2) goto L_0x0047
            r4 = r1[r3]
            if (r4 == 0) goto L_0x0044
            om.s r4 = (om.s) r4
            tl.d r5 = r4.f30196b
            if (r5 != 0) goto L_0x001c
            goto L_0x0044
        L_0x001c:
            long r6 = r10.Q(r4)
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 < 0) goto L_0x0044
            int r6 = r11.length
            if (r0 < r6) goto L_0x0039
            int r6 = r11.length
            r7 = 2
            int r6 = r6 * r7
            int r6 = java.lang.Math.max(r7, r6)
            java.lang.Object[] r11 = java.util.Arrays.copyOf(r11, r6)
            java.lang.String r6 = "copyOf(this, newSize)"
            cm.l.e(r11, r6)
        L_0x0039:
            r6 = r11
            tl.d[] r6 = (tl.d[]) r6
            int r7 = r0 + 1
            r6[r0] = r5
            r0 = 0
            r4.f30196b = r0
            r0 = r7
        L_0x0044:
            int r3 = r3 + 1
            goto L_0x000f
        L_0x0047:
            tl.d[] r11 = (tl.d[]) r11
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: om.q.G(tl.d[]):tl.d[]");
    }

    private final long H() {
        return I() + ((long) this.f30180j);
    }

    /* access modifiers changed from: private */
    public final long I() {
        return Math.min(this.f30179i, this.f30178h);
    }

    private final Object J(long j10) {
        Object[] objArr = this.f30177g;
        l.c(objArr);
        Object c10 = r.e(objArr, j10);
        return c10 instanceof a ? ((a) c10).f30184g : c10;
    }

    private final long K() {
        return I() + ((long) this.f30180j) + ((long) this.f30181k);
    }

    private final int L() {
        return (int) ((I() + ((long) this.f30180j)) - this.f30178h);
    }

    /* access modifiers changed from: private */
    public final int M() {
        return this.f30180j + this.f30181k;
    }

    private final Object[] N(Object[] objArr, int i10, int i11) {
        if (i11 > 0) {
            Object[] objArr2 = new Object[i11];
            this.f30177g = objArr2;
            if (objArr == null) {
                return objArr2;
            }
            long I = I();
            for (int i12 = 0; i12 < i10; i12++) {
                long j10 = ((long) i12) + I;
                r.f(objArr2, j10, r.e(objArr, j10));
            }
            return objArr2;
        }
        throw new IllegalStateException("Buffer size overflow".toString());
    }

    /* access modifiers changed from: private */
    public final boolean O(Object obj) {
        if (j() == 0) {
            return P(obj);
        }
        if (this.f30180j >= this.f30175e && this.f30179i <= this.f30178h) {
            int i10 = b.f30186a[this.f30176f.ordinal()];
            if (i10 == 1) {
                return false;
            }
            if (i10 == 2) {
                return true;
            }
        }
        F(obj);
        int i11 = this.f30180j + 1;
        this.f30180j = i11;
        if (i11 > this.f30175e) {
            C();
        }
        if (L() > this.f30174d) {
            S(this.f30178h + 1, this.f30179i, H(), K());
        }
        return true;
    }

    private final boolean P(Object obj) {
        if (this.f30174d == 0) {
            return true;
        }
        F(obj);
        int i10 = this.f30180j + 1;
        this.f30180j = i10;
        if (i10 > this.f30174d) {
            C();
        }
        this.f30179i = I() + ((long) this.f30180j);
        return true;
    }

    /* access modifiers changed from: private */
    public final long Q(s sVar) {
        long j10 = sVar.f30195a;
        if (j10 < H()) {
            return j10;
        }
        if (this.f30175e <= 0 && j10 <= I() && this.f30181k != 0) {
            return j10;
        }
        return -1;
    }

    private final Object R(s sVar) {
        Object obj;
        d[] dVarArr = pm.b.f30443a;
        synchronized (this) {
            try {
                long Q = Q(sVar);
                if (Q < 0) {
                    obj = r.f30194a;
                } else {
                    long j10 = sVar.f30195a;
                    Object J = J(Q);
                    sVar.f30195a = Q + 1;
                    Object obj2 = J;
                    dVarArr = T(j10);
                    obj = obj2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        for (d dVar : dVarArr) {
            if (dVar != null) {
                p.a aVar = p.f30426e;
                dVar.resumeWith(p.a(x.f30437a));
            }
        }
        return obj;
    }

    private final void S(long j10, long j11, long j12, long j13) {
        long min = Math.min(j11, j10);
        for (long I = I(); I < min; I++) {
            Object[] objArr = this.f30177g;
            l.c(objArr);
            r.f(objArr, I, (Object) null);
        }
        this.f30178h = j10;
        this.f30179i = j11;
        this.f30180j = (int) (j12 - min);
        this.f30181k = (int) (j13 - j12);
    }

    private final Object v(s sVar, d dVar) {
        k kVar = new k(c.b(dVar), 1);
        kVar.y();
        synchronized (this) {
            try {
                if (Q(sVar) < 0) {
                    sVar.f30196b = kVar;
                } else {
                    p.a aVar = p.f30426e;
                    kVar.resumeWith(p.a(x.f30437a));
                }
                x xVar = x.f30437a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Object v10 = kVar.v();
        if (v10 == d.c()) {
            h.c(dVar);
        }
        return v10 == d.c() ? v10 : x.f30437a;
    }

    /* access modifiers changed from: private */
    public final void w(a aVar) {
        synchronized (this) {
            if (aVar.f30183f >= I()) {
                Object[] objArr = this.f30177g;
                l.c(objArr);
                if (r.e(objArr, aVar.f30183f) == aVar) {
                    r.f(objArr, aVar.f30183f, r.f30194a);
                    x();
                    x xVar = x.f30437a;
                }
            }
        }
    }

    private final void x() {
        if (this.f30175e != 0 || this.f30181k > 1) {
            Object[] objArr = this.f30177g;
            l.c(objArr);
            while (this.f30181k > 0 && r.e(objArr, (I() + ((long) M())) - 1) == r.f30194a) {
                this.f30181k--;
                r.f(objArr, I() + ((long) M()), (Object) null);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v8, resolved type: om.s} */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00aa A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ab A[EDGE_INSN: B:48:0x00ab->B:38:0x00ab ?: BREAK  , SYNTHETIC] */
    static /* synthetic */ java.lang.Object y(om.q r8, om.e r9, tl.d r10) {
        /*
            boolean r0 = r10 instanceof om.q.c
            if (r0 == 0) goto L_0x0013
            r0 = r10
            om.q$c r0 = (om.q.c) r0
            int r1 = r0.f30193k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f30193k = r1
            goto L_0x0018
        L_0x0013:
            om.q$c r0 = new om.q$c
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.f30191i
            java.lang.Object r1 = ul.d.c()
            int r2 = r0.f30193k
            r3 = 3
            r4 = 2
            if (r2 == 0) goto L_0x0077
            r8 = 1
            if (r2 == r8) goto L_0x0061
            if (r2 == r4) goto L_0x004d
            if (r2 != r3) goto L_0x0045
            java.lang.Object r8 = r0.f30190h
            lm.k1 r8 = (lm.k1) r8
            java.lang.Object r9 = r0.f30189g
            om.s r9 = (om.s) r9
            java.lang.Object r2 = r0.f30188f
            om.e r2 = (om.e) r2
            java.lang.Object r5 = r0.f30187e
            om.q r5 = (om.q) r5
            pl.q.b(r10)     // Catch:{ all -> 0x0042 }
        L_0x003e:
            r10 = r2
            r2 = r8
            r8 = r5
            goto L_0x008f
        L_0x0042:
            r8 = move-exception
            goto L_0x00c4
        L_0x0045:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x004d:
            java.lang.Object r8 = r0.f30190h
            lm.k1 r8 = (lm.k1) r8
            java.lang.Object r9 = r0.f30189g
            om.s r9 = (om.s) r9
            java.lang.Object r2 = r0.f30188f
            om.e r2 = (om.e) r2
            java.lang.Object r5 = r0.f30187e
            om.q r5 = (om.q) r5
            pl.q.b(r10)     // Catch:{ all -> 0x0042 }
            goto L_0x0092
        L_0x0061:
            java.lang.Object r8 = r0.f30189g
            r9 = r8
            om.s r9 = (om.s) r9
            java.lang.Object r8 = r0.f30188f
            om.e r8 = (om.e) r8
            java.lang.Object r2 = r0.f30187e
            om.q r2 = (om.q) r2
            pl.q.b(r10)     // Catch:{ all -> 0x0074 }
            r10 = r8
            r8 = r2
            goto L_0x0083
        L_0x0074:
            r8 = move-exception
            r5 = r2
            goto L_0x00c4
        L_0x0077:
            pl.q.b(r10)
            pm.c r10 = r8.f()
            om.s r10 = (om.s) r10
            r7 = r10
            r10 = r9
            r9 = r7
        L_0x0083:
            tl.g r2 = r0.getContext()     // Catch:{ all -> 0x00c1 }
            lm.k1$b r5 = lm.k1.f24977b     // Catch:{ all -> 0x00c1 }
            tl.g$b r2 = r2.f(r5)     // Catch:{ all -> 0x00c1 }
            lm.k1 r2 = (lm.k1) r2     // Catch:{ all -> 0x00c1 }
        L_0x008f:
            r5 = r8
            r8 = r2
            r2 = r10
        L_0x0092:
            java.lang.Object r10 = r5.R(r9)     // Catch:{ all -> 0x0042 }
            qm.h0 r6 = om.r.f30194a     // Catch:{ all -> 0x0042 }
            if (r10 != r6) goto L_0x00ab
            r0.f30187e = r5     // Catch:{ all -> 0x0042 }
            r0.f30188f = r2     // Catch:{ all -> 0x0042 }
            r0.f30189g = r9     // Catch:{ all -> 0x0042 }
            r0.f30190h = r8     // Catch:{ all -> 0x0042 }
            r0.f30193k = r4     // Catch:{ all -> 0x0042 }
            java.lang.Object r10 = r5.v(r9, r0)     // Catch:{ all -> 0x0042 }
            if (r10 != r1) goto L_0x0092
            return r1
        L_0x00ab:
            if (r8 == 0) goto L_0x00b0
            lm.o1.e(r8)     // Catch:{ all -> 0x0042 }
        L_0x00b0:
            r0.f30187e = r5     // Catch:{ all -> 0x0042 }
            r0.f30188f = r2     // Catch:{ all -> 0x0042 }
            r0.f30189g = r9     // Catch:{ all -> 0x0042 }
            r0.f30190h = r8     // Catch:{ all -> 0x0042 }
            r0.f30193k = r3     // Catch:{ all -> 0x0042 }
            java.lang.Object r10 = r2.c(r10, r0)     // Catch:{ all -> 0x0042 }
            if (r10 != r1) goto L_0x003e
            return r1
        L_0x00c1:
            r10 = move-exception
            r5 = r8
            r8 = r10
        L_0x00c4:
            r5.i(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: om.q.y(om.q, om.e, tl.d):java.lang.Object");
    }

    private final void z(long j10) {
        pm.c[] e10;
        if (!(this.f30441b == 0 || (e10 = this.f30440a) == null)) {
            for (pm.c cVar : e10) {
                if (cVar != null) {
                    s sVar = (s) cVar;
                    long j11 = sVar.f30195a;
                    if (j11 >= 0 && j11 < j10) {
                        sVar.f30195a = j10;
                    }
                }
            }
        }
        this.f30179i = j10;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public s g() {
        return new s();
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public s[] h(int i10) {
        return new s[i10];
    }

    public final d[] T(long j10) {
        long j11;
        long j12;
        long j13;
        pm.c[] e10;
        if (j10 > this.f30179i) {
            return pm.b.f30443a;
        }
        long I = I();
        long j14 = ((long) this.f30180j) + I;
        if (this.f30175e == 0 && this.f30181k > 0) {
            j14++;
        }
        if (!(this.f30441b == 0 || (e10 = this.f30440a) == null)) {
            for (pm.c cVar : e10) {
                if (cVar != null) {
                    long j15 = ((s) cVar).f30195a;
                    if (j15 >= 0 && j15 < j14) {
                        j14 = j15;
                    }
                }
            }
        }
        if (j14 <= this.f30179i) {
            return pm.b.f30443a;
        }
        long H = H();
        int min = j() > 0 ? Math.min(this.f30181k, this.f30175e - ((int) (H - j14))) : this.f30181k;
        d[] dVarArr = pm.b.f30443a;
        long j16 = ((long) this.f30181k) + H;
        if (min > 0) {
            dVarArr = new d[min];
            Object[] objArr = this.f30177g;
            l.c(objArr);
            long j17 = H;
            int i10 = 0;
            while (true) {
                if (H >= j16) {
                    j12 = j14;
                    j11 = j16;
                    break;
                }
                Object c10 = r.e(objArr, H);
                j12 = j14;
                h0 h0Var = r.f30194a;
                if (c10 != h0Var) {
                    l.d(c10, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                    a aVar = (a) c10;
                    int i11 = i10 + 1;
                    j11 = j16;
                    dVarArr[i10] = aVar.f30185h;
                    r.f(objArr, H, h0Var);
                    r.f(objArr, j17, aVar.f30184g);
                    j13 = 1;
                    j17++;
                    if (i11 >= min) {
                        break;
                    }
                    i10 = i11;
                } else {
                    j11 = j16;
                    j13 = 1;
                }
                H += j13;
                j14 = j12;
                j16 = j11;
            }
            H = j17;
        } else {
            j12 = j14;
            j11 = j16;
        }
        int i12 = (int) (H - I);
        long j18 = j() == 0 ? H : j12;
        long max = Math.max(this.f30178h, H - ((long) Math.min(this.f30174d, i12)));
        if (this.f30175e == 0 && max < j11) {
            Object[] objArr2 = this.f30177g;
            l.c(objArr2);
            if (l.a(r.e(objArr2, max), r.f30194a)) {
                H++;
                max++;
            }
        }
        S(max, j18, H, j11);
        x();
        return (dVarArr.length == 0) ^ true ? G(dVarArr) : dVarArr;
    }

    public final long U() {
        long j10 = this.f30178h;
        if (j10 < this.f30179i) {
            this.f30179i = j10;
        }
        return j10;
    }

    public Object a(e eVar, d dVar) {
        return y(this, eVar, dVar);
    }

    public boolean b(Object obj) {
        int i10;
        boolean z10;
        d[] dVarArr = pm.b.f30443a;
        synchronized (this) {
            if (O(obj)) {
                dVarArr = G(dVarArr);
                z10 = true;
            } else {
                z10 = false;
            }
        }
        for (d dVar : dVarArr) {
            if (dVar != null) {
                p.a aVar = p.f30426e;
                dVar.resumeWith(p.a(x.f30437a));
            }
        }
        return z10;
    }

    public Object c(Object obj, d dVar) {
        return D(this, obj, dVar);
    }
}
