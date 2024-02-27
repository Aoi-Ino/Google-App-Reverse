package retrofit2;

import cm.l;
import kotlin.coroutines.jvm.internal.h;
import lm.k;
import tl.d;

public final class KotlinExtensions {
    public static final <T> Object await(Call<T> call, d dVar) {
        k kVar = new k(c.b(dVar), 1);
        kVar.i(new KotlinExtensions$await$$inlined$suspendCancellableCoroutine$lambda$1(call));
        call.enqueue(new KotlinExtensions$await$2$2(kVar));
        Object v10 = kVar.v();
        if (v10 == d.c()) {
            h.c(dVar);
        }
        return v10;
    }

    public static final <T> Object awaitNullable(Call<T> call, d dVar) {
        k kVar = new k(c.b(dVar), 1);
        kVar.i(new KotlinExtensions$await$$inlined$suspendCancellableCoroutine$lambda$2(call));
        call.enqueue(new KotlinExtensions$await$4$2(kVar));
        Object v10 = kVar.v();
        if (v10 == d.c()) {
            h.c(dVar);
        }
        return v10;
    }

    public static final <T> Object awaitResponse(Call<T> call, d dVar) {
        k kVar = new k(c.b(dVar), 1);
        kVar.i(new KotlinExtensions$awaitResponse$$inlined$suspendCancellableCoroutine$lambda$1(call));
        call.enqueue(new KotlinExtensions$awaitResponse$2$2(kVar));
        Object v10 = kVar.v();
        if (v10 == d.c()) {
            h.c(dVar);
        }
        return v10;
    }

    public static final /* synthetic */ <T> T create(Retrofit retrofit) {
        l.g(retrofit, "$this$create");
        l.j(4, "T");
        return retrofit.create(Object.class);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object suspendAndThrow(java.lang.Exception r4, tl.d r5) {
        /*
            boolean r0 = r5 instanceof retrofit2.KotlinExtensions$suspendAndThrow$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            retrofit2.KotlinExtensions$suspendAndThrow$1 r0 = (retrofit2.KotlinExtensions$suspendAndThrow$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            retrofit2.KotlinExtensions$suspendAndThrow$1 r0 = new retrofit2.KotlinExtensions$suspendAndThrow$1
            r0.<init>(r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = ul.d.c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r4 = r0.L$0
            java.lang.Exception r4 = (java.lang.Exception) r4
            pl.q.b(r5)
            goto L_0x005c
        L_0x002d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0035:
            pl.q.b(r5)
            r0.L$0 = r4
            r0.label = r3
            lm.a0 r5 = lm.q0.a()
            tl.g r2 = r0.getContext()
            retrofit2.KotlinExtensions$suspendAndThrow$$inlined$suspendCoroutineUninterceptedOrReturn$lambda$1 r3 = new retrofit2.KotlinExtensions$suspendAndThrow$$inlined$suspendCoroutineUninterceptedOrReturn$lambda$1
            r3.<init>(r0, r4)
            r5.A0(r2, r3)
            java.lang.Object r4 = ul.d.c()
            java.lang.Object r5 = ul.d.c()
            if (r4 != r5) goto L_0x0059
            kotlin.coroutines.jvm.internal.h.c(r0)
        L_0x0059:
            if (r4 != r1) goto L_0x005c
            return r1
        L_0x005c:
            pl.x r4 = pl.x.f30437a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: retrofit2.KotlinExtensions.suspendAndThrow(java.lang.Exception, tl.d):java.lang.Object");
    }
}
