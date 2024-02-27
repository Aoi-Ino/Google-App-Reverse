package qm;

import cm.g;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public final class u {

    /* renamed from: e  reason: collision with root package name */
    public static final a f30856e = new a((g) null);

    /* renamed from: f  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f30857f;

    /* renamed from: g  reason: collision with root package name */
    private static final AtomicLongFieldUpdater f30858g;

    /* renamed from: h  reason: collision with root package name */
    public static final h0 f30859h = new h0("REMOVE_FROZEN");
    private volatile Object _next;
    private volatile long _state;

    /* renamed from: a  reason: collision with root package name */
    private final int f30860a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f30861b;

    /* renamed from: c  reason: collision with root package name */
    private final int f30862c;

    /* renamed from: d  reason: collision with root package name */
    private final AtomicReferenceArray f30863d;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final int a(long j10) {
            return (j10 & 2305843009213693952L) != 0 ? 2 : 1;
        }

        public final long b(long j10, int i10) {
            return d(j10, 1073741823) | ((long) i10);
        }

        public final long c(long j10, int i10) {
            return d(j10, 1152921503533105152L) | (((long) i10) << 30);
        }

        public final long d(long j10, long j11) {
            return j10 & (~j11);
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f30864a;

        public b(int i10) {
            this.f30864a = i10;
        }
    }

    static {
        Class<u> cls = u.class;
        f30857f = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "_next");
        f30858g = AtomicLongFieldUpdater.newUpdater(cls, "_state");
    }

    public u(int i10, boolean z10) {
        this.f30860a = i10;
        this.f30861b = z10;
        int i11 = i10 - 1;
        this.f30862c = i11;
        this.f30863d = new AtomicReferenceArray(i10);
        if (i11 > 1073741823) {
            throw new IllegalStateException("Check failed.".toString());
        } else if ((i10 & i11) != 0) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    private final u b(long j10) {
        u uVar = new u(this.f30860a * 2, this.f30861b);
        int i10 = (int) (1073741823 & j10);
        int i11 = (int) ((1152921503533105152L & j10) >> 30);
        while (true) {
            int i12 = this.f30862c;
            if ((i10 & i12) != (i11 & i12)) {
                Object obj = this.f30863d.get(i12 & i10);
                if (obj == null) {
                    obj = new b(i10);
                }
                uVar.f30863d.set(uVar.f30862c & i10, obj);
                i10++;
            } else {
                f30858g.set(uVar, f30856e.d(j10, 1152921504606846976L));
                return uVar;
            }
        }
    }

    private final u c(long j10) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f30857f;
        while (true) {
            u uVar = (u) atomicReferenceFieldUpdater.get(this);
            if (uVar != null) {
                return uVar;
            }
            androidx.concurrent.futures.b.a(f30857f, this, (Object) null, b(j10));
        }
    }

    private final u e(int i10, Object obj) {
        Object obj2 = this.f30863d.get(this.f30862c & i10);
        if (!(obj2 instanceof b) || ((b) obj2).f30864a != i10) {
            return null;
        }
        this.f30863d.set(i10 & this.f30862c, obj);
        return this;
    }

    private final long h() {
        long j10;
        long j11;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f30858g;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            if ((j10 & 1152921504606846976L) != 0) {
                return j10;
            }
            j11 = j10 | 1152921504606846976L;
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, j11));
        return j11;
    }

    private final u k(int i10, int i11) {
        long j10;
        int i12;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f30858g;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            i12 = (int) (1073741823 & j10);
            if ((1152921504606846976L & j10) != 0) {
                return i();
            }
        } while (!f30858g.compareAndSet(this, j10, f30856e.b(j10, i11)));
        this.f30863d.set(this.f30862c & i12, (Object) null);
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x006a A[LOOP:1: B:20:0x006a->B:23:0x007f, LOOP_START, PHI: r0 
      PHI: (r0v3 qm.u) = (r0v2 qm.u), (r0v5 qm.u) binds: [B:19:0x0062, B:23:0x007f] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(java.lang.Object r13) {
        /*
            r12 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = f30858g
        L_0x0002:
            long r3 = r0.get(r12)
            r1 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r1 = r1 & r3
            r7 = 0
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 == 0) goto L_0x0016
            qm.u$a r13 = f30856e
            int r13 = r13.a(r3)
            return r13
        L_0x0016:
            r1 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r1 = r1 & r3
            int r1 = (int) r1
            r5 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r5 = r5 & r3
            r2 = 30
            long r5 = r5 >> r2
            int r9 = (int) r5
            int r10 = r12.f30862c
            int r2 = r9 + 2
            r2 = r2 & r10
            r5 = r1 & r10
            r6 = 1
            if (r2 != r5) goto L_0x0030
            return r6
        L_0x0030:
            boolean r2 = r12.f30861b
            r5 = 1073741823(0x3fffffff, float:1.9999999)
            if (r2 != 0) goto L_0x004f
            java.util.concurrent.atomic.AtomicReferenceArray r2 = r12.f30863d
            r11 = r9 & r10
            java.lang.Object r2 = r2.get(r11)
            if (r2 == 0) goto L_0x004f
            int r2 = r12.f30860a
            r3 = 1024(0x400, float:1.435E-42)
            if (r2 < r3) goto L_0x004e
            int r9 = r9 - r1
            r1 = r9 & r5
            int r2 = r2 >> 1
            if (r1 <= r2) goto L_0x0002
        L_0x004e:
            return r6
        L_0x004f:
            int r1 = r9 + 1
            r1 = r1 & r5
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = f30858g
            qm.u$a r5 = f30856e
            long r5 = r5.c(r3, r1)
            r1 = r2
            r2 = r12
            boolean r1 = r1.compareAndSet(r2, r3, r5)
            if (r1 == 0) goto L_0x0002
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r12.f30863d
            r1 = r9 & r10
            r0.set(r1, r13)
            r0 = r12
        L_0x006a:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = f30858g
            long r1 = r1.get(r0)
            r3 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r1 = r1 & r3
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 == 0) goto L_0x0081
            qm.u r0 = r0.i()
            qm.u r0 = r0.e(r9, r13)
            if (r0 != 0) goto L_0x006a
        L_0x0081:
            r13 = 0
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: qm.u.a(java.lang.Object):int");
    }

    public final boolean d() {
        long j10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f30858g;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            if ((j10 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j10) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, j10 | 2305843009213693952L));
        return true;
    }

    public final int f() {
        long j10 = f30858g.get(this);
        return (((int) ((j10 & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j10))) & 1073741823;
    }

    public final boolean g() {
        long j10 = f30858g.get(this);
        return ((int) (1073741823 & j10)) == ((int) ((j10 & 1152921503533105152L) >> 30));
    }

    public final u i() {
        return c(h());
    }

    public final Object j() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f30858g;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            if ((1152921504606846976L & j10) != 0) {
                return f30859h;
            }
            int i10 = (int) (1073741823 & j10);
            int i11 = this.f30862c;
            if ((((int) ((1152921503533105152L & j10) >> 30)) & i11) == (i10 & i11)) {
                return null;
            }
            Object obj = this.f30863d.get(i11 & i10);
            if (obj == null) {
                if (this.f30861b) {
                    return null;
                }
            } else if (obj instanceof b) {
                return null;
            } else {
                int i12 = (i10 + 1) & 1073741823;
                if (f30858g.compareAndSet(this, j10, f30856e.b(j10, i12))) {
                    this.f30863d.set(this.f30862c & i10, (Object) null);
                    return obj;
                } else if (this.f30861b) {
                    u uVar = this;
                    do {
                        uVar = uVar.k(i10, i12);
                    } while (uVar != null);
                    return obj;
                }
            }
        }
    }
}
