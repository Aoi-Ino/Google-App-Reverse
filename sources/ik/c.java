package ik;

import android.app.Application;
import androidx.lifecycle.a0;
import bm.p;
import kotlin.coroutines.jvm.internal.l;
import lm.d0;
import lm.e0;
import lm.f0;
import lm.k1;
import lm.q0;
import pl.q;
import pl.x;
import tl.d;
import tl.g;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private Application f24433a;

    /* renamed from: b  reason: collision with root package name */
    private String f24434b;

    /* renamed from: c  reason: collision with root package name */
    private String f24435c;

    /* renamed from: d  reason: collision with root package name */
    private String f24436d;

    /* renamed from: e  reason: collision with root package name */
    private final a0 f24437e = new a0();

    static final class a extends l implements p {

        /* renamed from: f  reason: collision with root package name */
        int f24438f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ c f24439g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(c cVar, d dVar) {
            super(2, dVar);
            this.f24439g = cVar;
        }

        /* renamed from: b */
        public final Object h(d0 d0Var, d dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(x.f30437a);
        }

        public final d create(Object obj, d dVar) {
            return new a(this.f24439g, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object c10 = d.c();
            int i10 = this.f24438f;
            if (i10 == 0) {
                q.b(obj);
                c cVar = this.f24439g;
                this.f24438f = 1;
                if (cVar.a(this) == c10) {
                    return c10;
                }
            } else if (i10 == 1) {
                q.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return x.f30437a;
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: e  reason: collision with root package name */
        Object f24440e;

        /* renamed from: f  reason: collision with root package name */
        Object f24441f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f24442g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ c f24443h;

        /* renamed from: i  reason: collision with root package name */
        int f24444i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(c cVar, d dVar) {
            super(dVar);
            this.f24443h = cVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f24442g = obj;
            this.f24444i |= Integer.MIN_VALUE;
            return this.f24443h.a(this);
        }
    }

    public c(Application application, String str, String str2, String str3) {
        cm.l.f(application, "mApp");
        cm.l.f(str, "rtocd");
        cm.l.f(str2, "campid");
        cm.l.f(str3, "campcd");
        this.f24433a = application;
        this.f24434b = str;
        this.f24435c = str2;
        this.f24436d = str3;
        k1 unused = g.d(e0.a(q0.b()), (g) null, (f0) null, new a(this, (d) null), 3, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x008c A[SYNTHETIC, Splitter:B:28:0x008c] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00af A[Catch:{ Exception -> 0x00ad }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(tl.d r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof ik.c.b
            if (r0 == 0) goto L_0x0013
            r0 = r9
            ik.c$b r0 = (ik.c.b) r0
            int r1 = r0.f24444i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f24444i = r1
            goto L_0x0018
        L_0x0013:
            ik.c$b r0 = new ik.c$b
            r0.<init>(r8, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f24442g
            java.lang.Object r1 = ul.d.c()
            int r2 = r0.f24444i
            r3 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r1 = r0.f24441f
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.f24440e
            ik.c r0 = (ik.c) r0
            pl.q.b(r9)     // Catch:{ Exception -> 0x00f0 }
            goto L_0x0079
        L_0x0031:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x0039:
            pl.q.b(r9)
            si.b$a r9 = si.b.f31257a
            android.app.Application r2 = r8.f24433a
            boolean r9 = r9.a(r2)
            if (r9 == 0) goto L_0x0107
            long r4 = java.lang.System.currentTimeMillis()
            java.lang.String r9 = java.lang.String.valueOf(r4)
            si.a$a r2 = si.a.f31253a
            android.app.Application r4 = r8.f24433a
            retrofit2.Retrofit r2 = r2.a(r4)
            java.lang.Class<com.nic.mparivahan.dlservices.ui.slots.DlSlotsService> r4 = com.nic.mparivahan.dlservices.ui.slots.DlSlotsService.class
            java.lang.Object r2 = r2.create(r4)
            com.nic.mparivahan.dlservices.ui.slots.DlSlotsService r2 = (com.nic.mparivahan.dlservices.ui.slots.DlSlotsService) r2
            com.nic.mparivahan.dlservices.ui.slots.model.SlotsDetRequest r4 = new com.nic.mparivahan.dlservices.ui.slots.model.SlotsDetRequest     // Catch:{ Exception -> 0x00ef }
            java.lang.String r5 = r8.f24434b     // Catch:{ Exception -> 0x00ef }
            java.lang.String r6 = r8.f24435c     // Catch:{ Exception -> 0x00ef }
            java.lang.String r7 = r8.f24436d     // Catch:{ Exception -> 0x00ef }
            r4.<init>(r5, r6, r7)     // Catch:{ Exception -> 0x00ef }
            r0.f24440e = r8     // Catch:{ Exception -> 0x00ef }
            r0.f24441f = r9     // Catch:{ Exception -> 0x00ef }
            r0.f24444i = r3     // Catch:{ Exception -> 0x00ef }
            java.lang.Object r0 = r2.getSlotDet(r4, r9, r0)     // Catch:{ Exception -> 0x00ef }
            if (r0 != r1) goto L_0x0076
            return r1
        L_0x0076:
            r1 = r9
            r9 = r0
            r0 = r8
        L_0x0079:
            com.nic.mparivahan.Security.SecModle.SecurityModle r9 = (com.nic.mparivahan.Security.SecModle.SecurityModle) r9     // Catch:{ Exception -> 0x00f0 }
            java.lang.String r2 = "_update"
            java.lang.String r3 = r9.toString()     // Catch:{ Exception -> 0x00f0 }
            android.util.Log.d(r2, r3)     // Catch:{ Exception -> 0x00f0 }
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x00ad }
            r3 = 26
            java.lang.String r4 = "decode(...)"
            if (r2 < r3) goto L_0x00af
            id.c$a r2 = id.c.f12675a     // Catch:{ Exception -> 0x00ad }
            j$.util.Base64$Decoder r3 = j$.util.Base64.getDecoder()     // Catch:{ Exception -> 0x00ad }
            java.lang.String r9 = r9.getData()     // Catch:{ Exception -> 0x00ad }
            byte[] r9 = r3.decode((java.lang.String) r9)     // Catch:{ Exception -> 0x00ad }
            cm.l.e(r9, r4)     // Catch:{ Exception -> 0x00ad }
            java.lang.String r3 = new java.lang.String     // Catch:{ Exception -> 0x00ad }
            java.nio.charset.Charset r4 = km.d.f24740b     // Catch:{ Exception -> 0x00ad }
            r3.<init>(r9, r4)     // Catch:{ Exception -> 0x00ad }
            java.lang.String r9 = r2.a(r1, r3)     // Catch:{ Exception -> 0x00ad }
        L_0x00a8:
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ Exception -> 0x00ad }
            goto L_0x00c9
        L_0x00ad:
            r9 = move-exception
            goto L_0x00d4
        L_0x00af:
            id.c$a r2 = id.c.f12675a     // Catch:{ Exception -> 0x00ad }
            java.lang.String r9 = r9.getData()     // Catch:{ Exception -> 0x00ad }
            r3 = 0
            byte[] r9 = android.util.Base64.decode(r9, r3)     // Catch:{ Exception -> 0x00ad }
            cm.l.e(r9, r4)     // Catch:{ Exception -> 0x00ad }
            java.lang.String r3 = new java.lang.String     // Catch:{ Exception -> 0x00ad }
            java.nio.charset.Charset r4 = km.d.f24740b     // Catch:{ Exception -> 0x00ad }
            r3.<init>(r9, r4)     // Catch:{ Exception -> 0x00ad }
            java.lang.String r9 = r2.a(r1, r3)     // Catch:{ Exception -> 0x00ad }
            goto L_0x00a8
        L_0x00c9:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x00ad }
            r1.<init>((java.lang.String) r9)     // Catch:{ Exception -> 0x00ad }
            androidx.lifecycle.a0 r9 = r0.f24437e     // Catch:{ Exception -> 0x00ad }
            r9.k(r1)     // Catch:{ Exception -> 0x00ad }
            goto L_0x0107
        L_0x00d4:
            r9.printStackTrace()     // Catch:{ Exception -> 0x00f0 }
            com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog$a r1 = com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog.f20957k     // Catch:{ Exception -> 0x00f0 }
            android.app.Application r2 = r0.f24433a     // Catch:{ Exception -> 0x00f0 }
            v9.d$a r9 = v9.d.f17494a     // Catch:{ Exception -> 0x00f0 }
            java.lang.String r3 = r9.t()     // Catch:{ Exception -> 0x00f0 }
            java.lang.String r4 = "insSltDet"
            java.lang.String r5 = r9.v()     // Catch:{ Exception -> 0x00f0 }
            java.lang.String r6 = r9.w()     // Catch:{ Exception -> 0x00f0 }
            r1.a(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x00f0 }
            goto L_0x0107
        L_0x00ef:
            r0 = r8
        L_0x00f0:
            com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog$a r1 = com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog.f20957k
            android.app.Application r2 = r0.f24433a
            v9.d$a r9 = v9.d.f17494a
            java.lang.String r3 = r9.t()
            java.lang.String r4 = "insSltDet"
            java.lang.String r5 = r9.v()
            java.lang.String r6 = r9.w()
            r1.a(r2, r3, r4, r5, r6)
        L_0x0107:
            pl.x r9 = pl.x.f30437a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ik.c.a(tl.d):java.lang.Object");
    }

    public final a0 b() {
        return this.f24437e;
    }
}
