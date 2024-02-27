package om;

import bm.p;
import kotlin.coroutines.jvm.internal.d;
import nm.r;
import tl.g;
import tl.h;

final class a extends b {

    /* renamed from: e  reason: collision with root package name */
    private final p f30145e;

    /* renamed from: om.a$a  reason: collision with other inner class name */
    static final class C0329a extends d {

        /* renamed from: e  reason: collision with root package name */
        Object f30146e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f30147f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ a f30148g;

        /* renamed from: h  reason: collision with root package name */
        int f30149h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0329a(a aVar, tl.d dVar) {
            super(dVar);
            this.f30148g = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f30147f = obj;
            this.f30149h |= Integer.MIN_VALUE;
            return this.f30148g.e((r) null, this);
        }
    }

    public a(p pVar, g gVar, int i10, nm.a aVar) {
        super(pVar, gVar, i10, aVar);
        this.f30145e = pVar;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object e(nm.r r5, tl.d r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof om.a.C0329a
            if (r0 == 0) goto L_0x0013
            r0 = r6
            om.a$a r0 = (om.a.C0329a) r0
            int r1 = r0.f30149h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f30149h = r1
            goto L_0x0018
        L_0x0013:
            om.a$a r0 = new om.a$a
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f30147f
            java.lang.Object r1 = ul.d.c()
            int r2 = r0.f30149h
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r5 = r0.f30146e
            nm.r r5 = (nm.r) r5
            pl.q.b(r6)
            goto L_0x0043
        L_0x002d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0035:
            pl.q.b(r6)
            r0.f30146e = r5
            r0.f30149h = r3
            java.lang.Object r6 = super.e(r5, r0)
            if (r6 != r1) goto L_0x0043
            return r1
        L_0x0043:
            boolean r5 = r5.p()
            if (r5 == 0) goto L_0x004c
            pl.x r5 = pl.x.f30437a
            return r5
        L_0x004c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: om.a.e(nm.r, tl.d):java.lang.Object");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(p pVar, g gVar, int i10, nm.a aVar, int i11, cm.g gVar2) {
        this(pVar, (i11 & 2) != 0 ? h.f31683e : gVar, (i11 & 4) != 0 ? -2 : i10, (i11 & 8) != 0 ? nm.a.SUSPEND : aVar);
    }
}
