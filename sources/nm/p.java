package nm;

import bm.l;
import cm.m;
import kotlin.coroutines.jvm.internal.d;
import lm.d0;
import lm.f0;
import lm.j;
import lm.z;
import pl.p;
import pl.x;
import tl.g;
import tl.h;

public abstract class p {

    static final class a extends d {

        /* renamed from: e  reason: collision with root package name */
        Object f29964e;

        /* renamed from: f  reason: collision with root package name */
        Object f29965f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f29966g;

        /* renamed from: h  reason: collision with root package name */
        int f29967h;

        a(tl.d dVar) {
            super(dVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f29966g = obj;
            this.f29967h |= Integer.MIN_VALUE;
            return p.a((r) null, (bm.a) null, this);
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ j f29968e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(j jVar) {
            super(1);
            this.f29968e = jVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return x.f30437a;
        }

        public final void invoke(Throwable th2) {
            j jVar = this.f29968e;
            p.a aVar = pl.p.f30426e;
            jVar.resumeWith(pl.p.a(x.f30437a));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: bm.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(nm.r r4, bm.a r5, tl.d r6) {
        /*
            boolean r0 = r6 instanceof nm.p.a
            if (r0 == 0) goto L_0x0013
            r0 = r6
            nm.p$a r0 = (nm.p.a) r0
            int r1 = r0.f29967h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f29967h = r1
            goto L_0x0018
        L_0x0013:
            nm.p$a r0 = new nm.p$a
            r0.<init>(r6)
        L_0x0018:
            java.lang.Object r6 = r0.f29966g
            java.lang.Object r1 = ul.d.c()
            int r2 = r0.f29967h
            r3 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 != r3) goto L_0x0034
            java.lang.Object r4 = r0.f29965f
            r5 = r4
            bm.a r5 = (bm.a) r5
            java.lang.Object r4 = r0.f29964e
            nm.r r4 = (nm.r) r4
            pl.q.b(r6)     // Catch:{ all -> 0x0032 }
            goto L_0x0075
        L_0x0032:
            r4 = move-exception
            goto L_0x007b
        L_0x0034:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x003c:
            pl.q.b(r6)
            tl.g r6 = r0.getContext()
            lm.k1$b r2 = lm.k1.f24977b
            tl.g$b r6 = r6.f(r2)
            if (r6 != r4) goto L_0x007f
            r0.f29964e = r4     // Catch:{ all -> 0x0032 }
            r0.f29965f = r5     // Catch:{ all -> 0x0032 }
            r0.f29967h = r3     // Catch:{ all -> 0x0032 }
            lm.k r6 = new lm.k     // Catch:{ all -> 0x0032 }
            tl.d r2 = ul.c.b(r0)     // Catch:{ all -> 0x0032 }
            r6.<init>(r2, r3)     // Catch:{ all -> 0x0032 }
            r6.y()     // Catch:{ all -> 0x0032 }
            nm.p$b r2 = new nm.p$b     // Catch:{ all -> 0x0032 }
            r2.<init>(r6)     // Catch:{ all -> 0x0032 }
            r4.d(r2)     // Catch:{ all -> 0x0032 }
            java.lang.Object r4 = r6.v()     // Catch:{ all -> 0x0032 }
            java.lang.Object r6 = ul.d.c()     // Catch:{ all -> 0x0032 }
            if (r4 != r6) goto L_0x0072
            kotlin.coroutines.jvm.internal.h.c(r0)     // Catch:{ all -> 0x0032 }
        L_0x0072:
            if (r4 != r1) goto L_0x0075
            return r1
        L_0x0075:
            r5.a()
            pl.x r4 = pl.x.f30437a
            return r4
        L_0x007b:
            r5.a()
            throw r4
        L_0x007f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "awaitClose() can only be invoked from the producer context"
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: nm.p.a(nm.r, bm.a, tl.d):java.lang.Object");
    }

    public static final t b(d0 d0Var, g gVar, int i10, a aVar, f0 f0Var, l lVar, bm.p pVar) {
        q qVar = new q(z.d(d0Var, gVar), g.b(i10, aVar, (l) null, 4, (Object) null));
        if (lVar != null) {
            qVar.o(lVar);
        }
        qVar.L0(f0Var, qVar, pVar);
        return qVar;
    }

    public static /* synthetic */ t c(d0 d0Var, g gVar, int i10, a aVar, f0 f0Var, l lVar, bm.p pVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            gVar = h.f31683e;
        }
        g gVar2 = gVar;
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        int i12 = i10;
        if ((i11 & 4) != 0) {
            aVar = a.SUSPEND;
        }
        a aVar2 = aVar;
        if ((i11 & 8) != 0) {
            f0Var = f0.DEFAULT;
        }
        f0 f0Var2 = f0Var;
        if ((i11 & 16) != 0) {
            lVar = null;
        }
        return b(d0Var, gVar2, i12, aVar2, f0Var2, lVar, pVar);
    }
}
