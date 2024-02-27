package om;

import kotlin.coroutines.jvm.internal.d;
import nm.t;
import pl.x;

abstract /* synthetic */ class h {

    static final class a extends d {

        /* renamed from: e  reason: collision with root package name */
        Object f30160e;

        /* renamed from: f  reason: collision with root package name */
        Object f30161f;

        /* renamed from: g  reason: collision with root package name */
        Object f30162g;

        /* renamed from: h  reason: collision with root package name */
        boolean f30163h;

        /* renamed from: i  reason: collision with root package name */
        /* synthetic */ Object f30164i;

        /* renamed from: j  reason: collision with root package name */
        int f30165j;

        a(tl.d dVar) {
            super(dVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f30164i = obj;
            this.f30165j |= Integer.MIN_VALUE;
            return h.c((e) null, (t) null, false, this);
        }
    }

    public static final Object b(e eVar, t tVar, tl.d dVar) {
        Object c10 = c(eVar, tVar, true, dVar);
        return c10 == d.c() ? c10 : x.f30437a;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x009e, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x009f, code lost:
        if (r8 != false) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a1, code lost:
        nm.k.a(r7, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a4, code lost:
        throw r9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0072 A[Catch:{ all -> 0x009e }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0073 A[Catch:{ all -> 0x009e }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007f A[Catch:{ all -> 0x009e }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object c(om.e r6, nm.t r7, boolean r8, tl.d r9) {
        /*
            boolean r0 = r9 instanceof om.h.a
            if (r0 == 0) goto L_0x0013
            r0 = r9
            om.h$a r0 = (om.h.a) r0
            int r1 = r0.f30165j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f30165j = r1
            goto L_0x0018
        L_0x0013:
            om.h$a r0 = new om.h$a
            r0.<init>(r9)
        L_0x0018:
            java.lang.Object r9 = r0.f30164i
            java.lang.Object r1 = ul.d.c()
            int r2 = r0.f30165j
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0058
            if (r2 == r4) goto L_0x0046
            if (r2 != r3) goto L_0x003e
            boolean r8 = r0.f30163h
            java.lang.Object r6 = r0.f30162g
            nm.f r6 = (nm.f) r6
            java.lang.Object r7 = r0.f30161f
            nm.t r7 = (nm.t) r7
            java.lang.Object r2 = r0.f30160e
            om.e r2 = (om.e) r2
            pl.q.b(r9)     // Catch:{ all -> 0x003c }
        L_0x0039:
            r9 = r6
            r6 = r2
            goto L_0x0062
        L_0x003c:
            r6 = move-exception
            goto L_0x009d
        L_0x003e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0046:
            boolean r8 = r0.f30163h
            java.lang.Object r6 = r0.f30162g
            nm.f r6 = (nm.f) r6
            java.lang.Object r7 = r0.f30161f
            nm.t r7 = (nm.t) r7
            java.lang.Object r2 = r0.f30160e
            om.e r2 = (om.e) r2
            pl.q.b(r9)     // Catch:{ all -> 0x003c }
            goto L_0x0077
        L_0x0058:
            pl.q.b(r9)
            om.f.f(r6)
            nm.f r9 = r7.iterator()     // Catch:{ all -> 0x003c }
        L_0x0062:
            r0.f30160e = r6     // Catch:{ all -> 0x003c }
            r0.f30161f = r7     // Catch:{ all -> 0x003c }
            r0.f30162g = r9     // Catch:{ all -> 0x003c }
            r0.f30163h = r8     // Catch:{ all -> 0x003c }
            r0.f30165j = r4     // Catch:{ all -> 0x003c }
            java.lang.Object r2 = r9.b(r0)     // Catch:{ all -> 0x003c }
            if (r2 != r1) goto L_0x0073
            return r1
        L_0x0073:
            r5 = r2
            r2 = r6
            r6 = r9
            r9 = r5
        L_0x0077:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch:{ all -> 0x003c }
            boolean r9 = r9.booleanValue()     // Catch:{ all -> 0x003c }
            if (r9 == 0) goto L_0x0094
            java.lang.Object r9 = r6.next()     // Catch:{ all -> 0x003c }
            r0.f30160e = r2     // Catch:{ all -> 0x003c }
            r0.f30161f = r7     // Catch:{ all -> 0x003c }
            r0.f30162g = r6     // Catch:{ all -> 0x003c }
            r0.f30163h = r8     // Catch:{ all -> 0x003c }
            r0.f30165j = r3     // Catch:{ all -> 0x003c }
            java.lang.Object r9 = r2.c(r9, r0)     // Catch:{ all -> 0x003c }
            if (r9 != r1) goto L_0x0039
            return r1
        L_0x0094:
            if (r8 == 0) goto L_0x009a
            r6 = 0
            nm.k.a(r7, r6)
        L_0x009a:
            pl.x r6 = pl.x.f30437a
            return r6
        L_0x009d:
            throw r6     // Catch:{ all -> 0x009e }
        L_0x009e:
            r9 = move-exception
            if (r8 == 0) goto L_0x00a4
            nm.k.a(r7, r6)
        L_0x00a4:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: om.h.c(om.e, nm.t, boolean, tl.d):java.lang.Object");
    }
}
