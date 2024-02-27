package pm;

import bm.p;
import bm.q;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.jvm.internal.l;
import lm.d0;
import nm.u;
import om.d;
import pl.x;

public abstract class e {

    static final class a extends l implements p {

        /* renamed from: f  reason: collision with root package name */
        Object f30454f;

        /* renamed from: g  reason: collision with root package name */
        Object f30455g;

        /* renamed from: h  reason: collision with root package name */
        int f30456h;

        /* renamed from: i  reason: collision with root package name */
        int f30457i;

        /* renamed from: j  reason: collision with root package name */
        int f30458j;

        /* renamed from: k  reason: collision with root package name */
        private /* synthetic */ Object f30459k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ d[] f30460l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ bm.a f30461m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ q f30462n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ om.e f30463o;

        /* renamed from: pm.e$a$a  reason: collision with other inner class name */
        static final class C0334a extends l implements p {

            /* renamed from: f  reason: collision with root package name */
            int f30464f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ d[] f30465g;

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ int f30466h;

            /* renamed from: i  reason: collision with root package name */
            final /* synthetic */ AtomicInteger f30467i;

            /* renamed from: j  reason: collision with root package name */
            final /* synthetic */ nm.d f30468j;

            /* renamed from: pm.e$a$a$a  reason: collision with other inner class name */
            static final class C0335a implements om.e {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ nm.d f30469a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ int f30470b;

                /* renamed from: pm.e$a$a$a$a  reason: collision with other inner class name */
                static final class C0336a extends kotlin.coroutines.jvm.internal.d {

                    /* renamed from: e  reason: collision with root package name */
                    /* synthetic */ Object f30471e;

                    /* renamed from: f  reason: collision with root package name */
                    final /* synthetic */ C0335a f30472f;

                    /* renamed from: g  reason: collision with root package name */
                    int f30473g;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    C0336a(C0335a aVar, tl.d dVar) {
                        super(dVar);
                        this.f30472f = aVar;
                    }

                    public final Object invokeSuspend(Object obj) {
                        this.f30471e = obj;
                        this.f30473g |= Integer.MIN_VALUE;
                        return this.f30472f.c((Object) null, this);
                    }
                }

                C0335a(nm.d dVar, int i10) {
                    this.f30469a = dVar;
                    this.f30470b = i10;
                }

                /* JADX WARNING: Removed duplicated region for block: B:14:0x0038  */
                /* JADX WARNING: Removed duplicated region for block: B:19:0x0055 A[RETURN] */
                /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final java.lang.Object c(java.lang.Object r7, tl.d r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof pm.e.a.C0334a.C0335a.C0336a
                        if (r0 == 0) goto L_0x0013
                        r0 = r8
                        pm.e$a$a$a$a r0 = (pm.e.a.C0334a.C0335a.C0336a) r0
                        int r1 = r0.f30473g
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L_0x0013
                        int r1 = r1 - r2
                        r0.f30473g = r1
                        goto L_0x0018
                    L_0x0013:
                        pm.e$a$a$a$a r0 = new pm.e$a$a$a$a
                        r0.<init>(r6, r8)
                    L_0x0018:
                        java.lang.Object r8 = r0.f30471e
                        java.lang.Object r1 = ul.d.c()
                        int r2 = r0.f30473g
                        r3 = 2
                        r4 = 1
                        if (r2 == 0) goto L_0x0038
                        if (r2 == r4) goto L_0x0034
                        if (r2 != r3) goto L_0x002c
                        pl.q.b(r8)
                        goto L_0x0056
                    L_0x002c:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L_0x0034:
                        pl.q.b(r8)
                        goto L_0x004d
                    L_0x0038:
                        pl.q.b(r8)
                        nm.d r8 = r6.f30469a
                        ql.d0 r2 = new ql.d0
                        int r5 = r6.f30470b
                        r2.<init>(r5, r7)
                        r0.f30473g = r4
                        java.lang.Object r7 = r8.m(r2, r0)
                        if (r7 != r1) goto L_0x004d
                        return r1
                    L_0x004d:
                        r0.f30473g = r3
                        java.lang.Object r7 = lm.l2.a(r0)
                        if (r7 != r1) goto L_0x0056
                        return r1
                    L_0x0056:
                        pl.x r7 = pl.x.f30437a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: pm.e.a.C0334a.C0335a.c(java.lang.Object, tl.d):java.lang.Object");
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0334a(d[] dVarArr, int i10, AtomicInteger atomicInteger, nm.d dVar, tl.d dVar2) {
                super(2, dVar2);
                this.f30465g = dVarArr;
                this.f30466h = i10;
                this.f30467i = atomicInteger;
                this.f30468j = dVar;
            }

            /* renamed from: b */
            public final Object h(d0 d0Var, tl.d dVar) {
                return ((C0334a) create(d0Var, dVar)).invokeSuspend(x.f30437a);
            }

            public final tl.d create(Object obj, tl.d dVar) {
                return new C0334a(this.f30465g, this.f30466h, this.f30467i, this.f30468j, dVar);
            }

            public final Object invokeSuspend(Object obj) {
                Object c10 = d.c();
                int i10 = this.f30464f;
                if (i10 == 0) {
                    pl.q.b(obj);
                    d[] dVarArr = this.f30465g;
                    int i11 = this.f30466h;
                    d dVar = dVarArr[i11];
                    C0335a aVar = new C0335a(this.f30468j, i11);
                    this.f30464f = 1;
                    if (dVar.a(aVar, this) == c10) {
                        return c10;
                    }
                } else if (i10 == 1) {
                    try {
                        pl.q.b(obj);
                    } catch (Throwable th2) {
                        if (this.f30467i.decrementAndGet() == 0) {
                            u.a.a(this.f30468j, (Throwable) null, 1, (Object) null);
                        }
                        throw th2;
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                if (this.f30467i.decrementAndGet() == 0) {
                    u.a.a(this.f30468j, (Throwable) null, 1, (Object) null);
                }
                return x.f30437a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(d[] dVarArr, bm.a aVar, q qVar, om.e eVar, tl.d dVar) {
            super(2, dVar);
            this.f30460l = dVarArr;
            this.f30461m = aVar;
            this.f30462n = qVar;
            this.f30463o = eVar;
        }

        /* renamed from: b */
        public final Object h(d0 d0Var, tl.d dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(x.f30437a);
        }

        public final tl.d create(Object obj, tl.d dVar) {
            a aVar = new a(this.f30460l, this.f30461m, this.f30462n, this.f30463o, dVar);
            aVar.f30459k = obj;
            return aVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v2, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v4, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v5, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v5, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v6, resolved type: byte} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x00e6 A[LOOP:1: B:26:0x00e6->B:32:0x0109, LOOP_START, PHI: r6 r10 
          PHI: (r6v2 int) = (r6v1 int), (r6v3 int) binds: [B:23:0x00e1, B:32:0x0109] A[DONT_GENERATE, DONT_INLINE]
          PHI: (r10v3 ql.d0) = (r10v2 ql.d0), (r10v16 ql.d0) binds: [B:23:0x00e1, B:32:0x0109] A[DONT_GENERATE, DONT_INLINE]] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r23) {
            /*
                r22 = this;
                r0 = r22
                java.lang.Object r1 = ul.d.c()
                int r2 = r0.f30458j
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L_0x0072
                if (r2 == r5) goto L_0x0051
                if (r2 == r4) goto L_0x0036
                if (r2 != r3) goto L_0x002e
                int r2 = r0.f30457i
                int r6 = r0.f30456h
                java.lang.Object r7 = r0.f30455g
                byte[] r7 = (byte[]) r7
                java.lang.Object r8 = r0.f30454f
                nm.d r8 = (nm.d) r8
                java.lang.Object r9 = r0.f30459k
                java.lang.Object[] r9 = (java.lang.Object[]) r9
                pl.q.b(r23)
                r21 = r2
                r2 = r7
                r7 = r8
                r13 = r9
                r8 = r0
                goto L_0x015d
            L_0x002e:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x0036:
                int r2 = r0.f30457i
                int r6 = r0.f30456h
                java.lang.Object r7 = r0.f30455g
                byte[] r7 = (byte[]) r7
                java.lang.Object r8 = r0.f30454f
                nm.d r8 = (nm.d) r8
                java.lang.Object r9 = r0.f30459k
                java.lang.Object[] r9 = (java.lang.Object[]) r9
                pl.q.b(r23)
                r21 = r2
                r2 = r7
                r7 = r8
                r13 = r9
                r8 = r0
                goto L_0x00c3
            L_0x0051:
                int r2 = r0.f30457i
                int r6 = r0.f30456h
                java.lang.Object r7 = r0.f30455g
                byte[] r7 = (byte[]) r7
                java.lang.Object r8 = r0.f30454f
                nm.d r8 = (nm.d) r8
                java.lang.Object r9 = r0.f30459k
                java.lang.Object[] r9 = (java.lang.Object[]) r9
                pl.q.b(r23)
                r10 = r23
                nm.h r10 = (nm.h) r10
                java.lang.Object r10 = r10.k()
                r15 = r2
                r2 = r7
                r7 = r8
                r8 = r0
                goto L_0x00db
            L_0x0072:
                pl.q.b(r23)
                java.lang.Object r2 = r0.f30459k
                lm.d0 r2 = (lm.d0) r2
                om.d[] r6 = r0.f30460l
                int r12 = r6.length
                if (r12 != 0) goto L_0x0081
                pl.x r1 = pl.x.f30437a
                return r1
            L_0x0081:
                java.lang.Object[] r13 = new java.lang.Object[r12]
                qm.h0 r7 = pm.h.f30475b
                r8 = 0
                r9 = 0
                r10 = 6
                r11 = 0
                r6 = r13
                ql.l.l(r6, r7, r8, r9, r10, r11)
                r6 = 6
                r7 = 0
                nm.d r20 = nm.g.b(r12, r7, r7, r6, r7)
                java.util.concurrent.atomic.AtomicInteger r11 = new java.util.concurrent.atomic.AtomicInteger
                r11.<init>(r12)
                r21 = 0
                r10 = r21
            L_0x009c:
                if (r10 >= r12) goto L_0x00bd
                r7 = 0
                r8 = 0
                pm.e$a$a r9 = new pm.e$a$a
                om.d[] r15 = r0.f30460l
                r19 = 0
                r14 = r9
                r16 = r10
                r17 = r11
                r18 = r20
                r14.<init>(r15, r16, r17, r18, r19)
                r14 = 3
                r15 = 0
                r6 = r2
                r10 = r14
                r14 = r11
                r11 = r15
                lm.k1 unused = lm.g.d(r6, r7, r8, r9, r10, r11)
                int r10 = r16 + 1
                r11 = r14
                goto L_0x009c
            L_0x00bd:
                byte[] r2 = new byte[r12]
                r8 = r0
                r6 = r12
                r7 = r20
            L_0x00c3:
                int r9 = r21 + 1
                byte r9 = (byte) r9
                r8.f30459k = r13
                r8.f30454f = r7
                r8.f30455g = r2
                r8.f30456h = r6
                r8.f30457i = r9
                r8.f30458j = r5
                java.lang.Object r10 = r7.b(r8)
                if (r10 != r1) goto L_0x00d9
                return r1
            L_0x00d9:
                r15 = r9
                r9 = r13
            L_0x00db:
                java.lang.Object r10 = nm.h.f(r10)
                ql.d0 r10 = (ql.d0) r10
                if (r10 != 0) goto L_0x00e6
                pl.x r1 = pl.x.f30437a
                return r1
            L_0x00e6:
                int r11 = r10.a()
                r12 = r9[r11]
                java.lang.Object r10 = r10.b()
                r9[r11] = r10
                qm.h0 r10 = pm.h.f30475b
                if (r12 != r10) goto L_0x00f8
                int r6 = r6 + -1
            L_0x00f8:
                byte r10 = r2[r11]
                if (r10 == r15) goto L_0x010b
                byte r10 = (byte) r15
                r2[r11] = r10
                java.lang.Object r10 = r7.j()
                java.lang.Object r10 = nm.h.f(r10)
                ql.d0 r10 = (ql.d0) r10
                if (r10 != 0) goto L_0x00e6
            L_0x010b:
                if (r6 != 0) goto L_0x0160
                bm.a r10 = r8.f30461m
                java.lang.Object r10 = r10.a()
                java.lang.Object[] r10 = (java.lang.Object[]) r10
                if (r10 != 0) goto L_0x0132
                bm.q r10 = r8.f30462n
                om.e r11 = r8.f30463o
                r8.f30459k = r9
                r8.f30454f = r7
                r8.f30455g = r2
                r8.f30456h = r6
                r8.f30457i = r15
                r8.f30458j = r4
                java.lang.Object r10 = r10.g(r11, r9, r8)
                if (r10 != r1) goto L_0x012e
                return r1
            L_0x012e:
                r13 = r9
                r21 = r15
                goto L_0x00c3
            L_0x0132:
                r13 = 0
                r14 = 0
                r16 = 0
                r17 = 14
                r18 = 0
                r11 = r9
                r12 = r10
                r4 = r15
                r15 = r16
                r16 = r17
                r17 = r18
                java.lang.Object[] unused = ql.l.g(r11, r12, r13, r14, r15, r16, r17)
                bm.q r11 = r8.f30462n
                om.e r12 = r8.f30463o
                r8.f30459k = r9
                r8.f30454f = r7
                r8.f30455g = r2
                r8.f30456h = r6
                r8.f30457i = r4
                r8.f30458j = r3
                java.lang.Object r10 = r11.g(r12, r10, r8)
                if (r10 != r1) goto L_0x0161
                return r1
            L_0x015d:
                r4 = 2
                goto L_0x00c3
            L_0x0160:
                r4 = r15
            L_0x0161:
                r21 = r4
                r13 = r9
                goto L_0x015d
            */
            throw new UnsupportedOperationException("Method not decompiled: pm.e.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final Object a(om.e eVar, d[] dVarArr, bm.a aVar, q qVar, tl.d dVar) {
        Object a10 = g.a(new a(dVarArr, aVar, qVar, eVar, (tl.d) null), dVar);
        return a10 == d.c() ? a10 : x.f30437a;
    }
}
