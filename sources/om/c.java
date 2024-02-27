package om;

import bm.l;
import bm.p;
import cm.u;
import kotlin.coroutines.jvm.internal.d;
import pl.x;
import pm.h;

final class c implements d {

    /* renamed from: a  reason: collision with root package name */
    private final d f30151a;

    /* renamed from: b  reason: collision with root package name */
    public final l f30152b;

    /* renamed from: c  reason: collision with root package name */
    public final p f30153c;

    static final class a implements e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f30154a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ u f30155b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ e f30156c;

        /* renamed from: om.c$a$a  reason: collision with other inner class name */
        static final class C0330a extends d {

            /* renamed from: e  reason: collision with root package name */
            /* synthetic */ Object f30157e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ a f30158f;

            /* renamed from: g  reason: collision with root package name */
            int f30159g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0330a(a aVar, tl.d dVar) {
                super(dVar);
                this.f30158f = aVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f30157e = obj;
                this.f30159g |= Integer.MIN_VALUE;
                return this.f30158f.c((Object) null, this);
            }
        }

        a(c cVar, u uVar, e eVar) {
            this.f30154a = cVar;
            this.f30155b = uVar;
            this.f30156c = eVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object c(java.lang.Object r6, tl.d r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof om.c.a.C0330a
                if (r0 == 0) goto L_0x0013
                r0 = r7
                om.c$a$a r0 = (om.c.a.C0330a) r0
                int r1 = r0.f30159g
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f30159g = r1
                goto L_0x0018
            L_0x0013:
                om.c$a$a r0 = new om.c$a$a
                r0.<init>(r5, r7)
            L_0x0018:
                java.lang.Object r7 = r0.f30157e
                java.lang.Object r1 = ul.d.c()
                int r2 = r0.f30159g
                r3 = 1
                if (r2 == 0) goto L_0x0031
                if (r2 != r3) goto L_0x0029
                pl.q.b(r7)
                goto L_0x0067
            L_0x0029:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L_0x0031:
                pl.q.b(r7)
                om.c r7 = r5.f30154a
                bm.l r7 = r7.f30152b
                java.lang.Object r7 = r7.invoke(r6)
                cm.u r2 = r5.f30155b
                java.lang.Object r2 = r2.f20234e
                qm.h0 r4 = pm.h.f30474a
                if (r2 == r4) goto L_0x0058
                om.c r4 = r5.f30154a
                bm.p r4 = r4.f30153c
                java.lang.Object r2 = r4.h(r2, r7)
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 != 0) goto L_0x0055
                goto L_0x0058
            L_0x0055:
                pl.x r6 = pl.x.f30437a
                return r6
            L_0x0058:
                cm.u r2 = r5.f30155b
                r2.f20234e = r7
                om.e r7 = r5.f30156c
                r0.f30159g = r3
                java.lang.Object r6 = r7.c(r6, r0)
                if (r6 != r1) goto L_0x0067
                return r1
            L_0x0067:
                pl.x r6 = pl.x.f30437a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: om.c.a.c(java.lang.Object, tl.d):java.lang.Object");
        }
    }

    public c(d dVar, l lVar, p pVar) {
        this.f30151a = dVar;
        this.f30152b = lVar;
        this.f30153c = pVar;
    }

    public Object a(e eVar, tl.d dVar) {
        u uVar = new u();
        uVar.f20234e = h.f30474a;
        Object a10 = this.f30151a.a(new a(this, uVar, eVar), dVar);
        return a10 == d.c() ? a10 : x.f30437a;
    }
}
