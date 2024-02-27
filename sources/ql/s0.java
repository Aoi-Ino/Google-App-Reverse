package ql;

import bm.p;
import cm.l;
import java.util.Iterator;
import jm.i;
import kotlin.coroutines.jvm.internal.k;
import pl.x;
import tl.d;

public abstract class s0 {

    static final class a extends k implements p {

        /* renamed from: f  reason: collision with root package name */
        Object f30785f;

        /* renamed from: g  reason: collision with root package name */
        Object f30786g;

        /* renamed from: h  reason: collision with root package name */
        int f30787h;

        /* renamed from: i  reason: collision with root package name */
        int f30788i;

        /* renamed from: j  reason: collision with root package name */
        private /* synthetic */ Object f30789j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ int f30790k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ int f30791l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ Iterator f30792m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ boolean f30793n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ boolean f30794o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(int i10, int i11, Iterator it, boolean z10, boolean z11, d dVar) {
            super(2, dVar);
            this.f30790k = i10;
            this.f30791l = i11;
            this.f30792m = it;
            this.f30793n = z10;
            this.f30794o = z11;
        }

        /* renamed from: b */
        public final Object h(i iVar, d dVar) {
            return ((a) create(iVar, dVar)).invokeSuspend(x.f30437a);
        }

        public final d create(Object obj, d dVar) {
            a aVar = new a(this.f30790k, this.f30791l, this.f30792m, this.f30793n, this.f30794o, dVar);
            aVar.f30789j = obj;
            return aVar;
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x00ec  */
        /* JADX WARNING: Removed duplicated region for block: B:59:0x012a  */
        /* JADX WARNING: Removed duplicated region for block: B:62:0x0134  */
        /* JADX WARNING: Removed duplicated region for block: B:84:0x0126 A[SYNTHETIC] */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = ul.d.c()
                int r1 = r11.f30788i
                r2 = 5
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                r7 = 0
                if (r1 == 0) goto L_0x005a
                if (r1 == r6) goto L_0x0046
                if (r1 == r5) goto L_0x0041
                if (r1 == r4) goto L_0x002f
                if (r1 == r3) goto L_0x0021
                if (r1 != r2) goto L_0x0019
                goto L_0x0041
            L_0x0019:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L_0x0021:
                java.lang.Object r1 = r11.f30785f
                ql.n0 r1 = (ql.n0) r1
                java.lang.Object r4 = r11.f30789j
                jm.i r4 = (jm.i) r4
                pl.q.b(r12)
                r12 = r11
                goto L_0x014e
            L_0x002f:
                java.lang.Object r1 = r11.f30786g
                java.util.Iterator r1 = (java.util.Iterator) r1
                java.lang.Object r5 = r11.f30785f
                ql.n0 r5 = (ql.n0) r5
                java.lang.Object r8 = r11.f30789j
                jm.i r8 = (jm.i) r8
                pl.q.b(r12)
                r12 = r11
                goto L_0x0120
            L_0x0041:
                pl.q.b(r12)
                goto L_0x016a
            L_0x0046:
                int r1 = r11.f30787h
                java.lang.Object r2 = r11.f30786g
                java.util.Iterator r2 = (java.util.Iterator) r2
                java.lang.Object r3 = r11.f30785f
                java.util.ArrayList r3 = (java.util.ArrayList) r3
                java.lang.Object r4 = r11.f30789j
                jm.i r4 = (jm.i) r4
                pl.q.b(r12)
                r8 = r11
            L_0x0058:
                r12 = r1
                goto L_0x00a9
            L_0x005a:
                pl.q.b(r12)
                java.lang.Object r12 = r11.f30789j
                jm.i r12 = (jm.i) r12
                int r1 = r11.f30790k
                r8 = 1024(0x400, float:1.435E-42)
                int r1 = hm.f.d(r1, r8)
                int r8 = r11.f30791l
                int r9 = r11.f30790k
                int r8 = r8 - r9
                if (r8 < 0) goto L_0x00dd
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>(r1)
                java.util.Iterator r1 = r11.f30792m
                r3 = 0
                r4 = r12
                r12 = r3
                r3 = r2
                r2 = r1
                r1 = r8
                r8 = r11
            L_0x007e:
                boolean r9 = r2.hasNext()
                if (r9 == 0) goto L_0x00bb
                java.lang.Object r9 = r2.next()
                if (r12 <= 0) goto L_0x008d
                int r12 = r12 + -1
                goto L_0x007e
            L_0x008d:
                r3.add(r9)
                int r9 = r3.size()
                int r10 = r8.f30790k
                if (r9 != r10) goto L_0x007e
                r8.f30789j = r4
                r8.f30785f = r3
                r8.f30786g = r2
                r8.f30787h = r1
                r8.f30788i = r6
                java.lang.Object r12 = r4.a(r3, r8)
                if (r12 != r0) goto L_0x0058
                return r0
            L_0x00a9:
                boolean r1 = r8.f30793n
                if (r1 == 0) goto L_0x00b1
                r3.clear()
                goto L_0x00b9
            L_0x00b1:
                java.util.ArrayList r1 = new java.util.ArrayList
                int r3 = r8.f30790k
                r1.<init>(r3)
                r3 = r1
            L_0x00b9:
                r1 = r12
                goto L_0x007e
            L_0x00bb:
                boolean r12 = r3.isEmpty()
                r12 = r12 ^ r6
                if (r12 == 0) goto L_0x016a
                boolean r12 = r8.f30794o
                if (r12 != 0) goto L_0x00ce
                int r12 = r3.size()
                int r1 = r8.f30790k
                if (r12 != r1) goto L_0x016a
            L_0x00ce:
                r8.f30789j = r7
                r8.f30785f = r7
                r8.f30786g = r7
                r8.f30788i = r5
                java.lang.Object r12 = r4.a(r3, r8)
                if (r12 != r0) goto L_0x016a
                return r0
            L_0x00dd:
                ql.n0 r5 = new ql.n0
                r5.<init>(r1)
                java.util.Iterator r1 = r11.f30792m
                r8 = r12
                r12 = r11
            L_0x00e6:
                boolean r9 = r1.hasNext()
                if (r9 == 0) goto L_0x0126
                java.lang.Object r9 = r1.next()
                r5.s(r9)
                boolean r9 = r5.y()
                if (r9 == 0) goto L_0x00e6
                int r9 = r5.size()
                int r10 = r12.f30790k
                if (r9 >= r10) goto L_0x0106
                ql.n0 r5 = r5.v(r10)
                goto L_0x00e6
            L_0x0106:
                boolean r9 = r12.f30793n
                if (r9 == 0) goto L_0x010c
                r9 = r5
                goto L_0x0111
            L_0x010c:
                java.util.ArrayList r9 = new java.util.ArrayList
                r9.<init>(r5)
            L_0x0111:
                r12.f30789j = r8
                r12.f30785f = r5
                r12.f30786g = r1
                r12.f30788i = r4
                java.lang.Object r9 = r8.a(r9, r12)
                if (r9 != r0) goto L_0x0120
                return r0
            L_0x0120:
                int r9 = r12.f30791l
                r5.B(r9)
                goto L_0x00e6
            L_0x0126:
                boolean r1 = r12.f30794o
                if (r1 == 0) goto L_0x016a
                r1 = r5
                r4 = r8
            L_0x012c:
                int r5 = r1.size()
                int r8 = r12.f30791l
                if (r5 <= r8) goto L_0x0154
                boolean r5 = r12.f30793n
                if (r5 == 0) goto L_0x013a
                r5 = r1
                goto L_0x013f
            L_0x013a:
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>(r1)
            L_0x013f:
                r12.f30789j = r4
                r12.f30785f = r1
                r12.f30786g = r7
                r12.f30788i = r3
                java.lang.Object r5 = r4.a(r5, r12)
                if (r5 != r0) goto L_0x014e
                return r0
            L_0x014e:
                int r5 = r12.f30791l
                r1.B(r5)
                goto L_0x012c
            L_0x0154:
                boolean r3 = r1.isEmpty()
                r3 = r3 ^ r6
                if (r3 == 0) goto L_0x016a
                r12.f30789j = r7
                r12.f30785f = r7
                r12.f30786g = r7
                r12.f30788i = r2
                java.lang.Object r12 = r4.a(r1, r12)
                if (r12 != r0) goto L_0x016a
                return r0
            L_0x016a:
                pl.x r12 = pl.x.f30437a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: ql.s0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final void a(int i10, int i11) {
        String str;
        if (i10 <= 0 || i11 <= 0) {
            if (i10 != i11) {
                str = "Both size " + i10 + " and step " + i11 + " must be greater than zero.";
            } else {
                str = "size " + i10 + " must be greater than zero.";
            }
            throw new IllegalArgumentException(str.toString());
        }
    }

    public static final Iterator b(Iterator it, int i10, int i11, boolean z10, boolean z11) {
        l.f(it, "iterator");
        return !it.hasNext() ? z.f30802e : k.a(new a(i10, i11, it, z11, z10, (d) null));
    }
}
