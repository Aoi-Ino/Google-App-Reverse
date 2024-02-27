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

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private Application f24422a;

    /* renamed from: b  reason: collision with root package name */
    private String f24423b;

    /* renamed from: c  reason: collision with root package name */
    private String f24424c;

    /* renamed from: d  reason: collision with root package name */
    private final a0 f24425d = new a0();

    static final class a extends l implements p {

        /* renamed from: f  reason: collision with root package name */
        int f24426f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ b f24427g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar, d dVar) {
            super(2, dVar);
            this.f24427g = bVar;
        }

        /* renamed from: b */
        public final Object h(d0 d0Var, d dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(x.f30437a);
        }

        public final d create(Object obj, d dVar) {
            return new a(this.f24427g, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object c10 = d.c();
            int i10 = this.f24426f;
            if (i10 == 0) {
                q.b(obj);
                b bVar = this.f24427g;
                this.f24426f = 1;
                if (bVar.a(this) == c10) {
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

    /* renamed from: ik.b$b  reason: collision with other inner class name */
    static final class C0309b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: e  reason: collision with root package name */
        Object f24428e;

        /* renamed from: f  reason: collision with root package name */
        Object f24429f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f24430g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ b f24431h;

        /* renamed from: i  reason: collision with root package name */
        int f24432i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0309b(b bVar, d dVar) {
            super(dVar);
            this.f24431h = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f24430g = obj;
            this.f24432i |= Integer.MIN_VALUE;
            return this.f24431h.a(this);
        }
    }

    public b(Application application, String str, String str2) {
        cm.l.f(application, "mApp");
        cm.l.f(str, "applNo");
        cm.l.f(str2, "dob");
        this.f24422a = application;
        this.f24423b = str;
        this.f24424c = str2;
        k1 unused = g.d(e0.a(q0.b()), (g) null, (f0) null, new a(this, (d) null), 3, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x008a A[SYNTHETIC, Splitter:B:28:0x008a] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ad A[Catch:{ Exception -> 0x00ab }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(tl.d r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof ik.b.C0309b
            if (r0 == 0) goto L_0x0013
            r0 = r8
            ik.b$b r0 = (ik.b.C0309b) r0
            int r1 = r0.f24432i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f24432i = r1
            goto L_0x0018
        L_0x0013:
            ik.b$b r0 = new ik.b$b
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f24430g
            java.lang.Object r1 = ul.d.c()
            int r2 = r0.f24432i
            r3 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r1 = r0.f24429f
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.f24428e
            ik.b r0 = (ik.b) r0
            pl.q.b(r8)     // Catch:{ Exception -> 0x00f3 }
            goto L_0x0077
        L_0x0031:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x0039:
            pl.q.b(r8)
            si.b$a r8 = si.b.f31257a
            android.app.Application r2 = r7.f24422a
            boolean r8 = r8.a(r2)
            if (r8 == 0) goto L_0x010a
            long r4 = java.lang.System.currentTimeMillis()
            java.lang.String r8 = java.lang.String.valueOf(r4)
            si.a$a r2 = si.a.f31253a
            android.app.Application r4 = r7.f24422a
            retrofit2.Retrofit r2 = r2.a(r4)
            java.lang.Class<com.nic.mparivahan.dlservices.ui.slots.DlSlotsService> r4 = com.nic.mparivahan.dlservices.ui.slots.DlSlotsService.class
            java.lang.Object r2 = r2.create(r4)
            com.nic.mparivahan.dlservices.ui.slots.DlSlotsService r2 = (com.nic.mparivahan.dlservices.ui.slots.DlSlotsService) r2
            com.nic.mparivahan.dlservices.ui.slots.model.SlotsRequest r4 = new com.nic.mparivahan.dlservices.ui.slots.model.SlotsRequest     // Catch:{ Exception -> 0x00f2 }
            java.lang.String r5 = r7.f24424c     // Catch:{ Exception -> 0x00f2 }
            java.lang.String r6 = r7.f24423b     // Catch:{ Exception -> 0x00f2 }
            r4.<init>(r5, r6)     // Catch:{ Exception -> 0x00f2 }
            r0.f24428e = r7     // Catch:{ Exception -> 0x00f2 }
            r0.f24429f = r8     // Catch:{ Exception -> 0x00f2 }
            r0.f24432i = r3     // Catch:{ Exception -> 0x00f2 }
            java.lang.Object r0 = r2.getApplDtDetSlots(r4, r8, r0)     // Catch:{ Exception -> 0x00f2 }
            if (r0 != r1) goto L_0x0074
            return r1
        L_0x0074:
            r1 = r8
            r8 = r0
            r0 = r7
        L_0x0077:
            com.nic.mparivahan.Security.SecModle.SecurityModle r8 = (com.nic.mparivahan.Security.SecModle.SecurityModle) r8     // Catch:{ Exception -> 0x00f3 }
            java.lang.String r2 = "_update"
            java.lang.String r3 = r8.toString()     // Catch:{ Exception -> 0x00f3 }
            android.util.Log.d(r2, r3)     // Catch:{ Exception -> 0x00f3 }
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x00ab }
            r3 = 26
            java.lang.String r4 = "decode(...)"
            if (r2 < r3) goto L_0x00ad
            id.c$a r2 = id.c.f12675a     // Catch:{ Exception -> 0x00ab }
            j$.util.Base64$Decoder r3 = j$.util.Base64.getDecoder()     // Catch:{ Exception -> 0x00ab }
            java.lang.String r8 = r8.getData()     // Catch:{ Exception -> 0x00ab }
            byte[] r8 = r3.decode((java.lang.String) r8)     // Catch:{ Exception -> 0x00ab }
            cm.l.e(r8, r4)     // Catch:{ Exception -> 0x00ab }
            java.lang.String r3 = new java.lang.String     // Catch:{ Exception -> 0x00ab }
            java.nio.charset.Charset r4 = km.d.f24740b     // Catch:{ Exception -> 0x00ab }
            r3.<init>(r8, r4)     // Catch:{ Exception -> 0x00ab }
            java.lang.String r8 = r2.a(r1, r3)     // Catch:{ Exception -> 0x00ab }
        L_0x00a6:
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ Exception -> 0x00ab }
            goto L_0x00c7
        L_0x00ab:
            r8 = move-exception
            goto L_0x00d7
        L_0x00ad:
            id.c$a r2 = id.c.f12675a     // Catch:{ Exception -> 0x00ab }
            java.lang.String r8 = r8.getData()     // Catch:{ Exception -> 0x00ab }
            r3 = 0
            byte[] r8 = android.util.Base64.decode(r8, r3)     // Catch:{ Exception -> 0x00ab }
            cm.l.e(r8, r4)     // Catch:{ Exception -> 0x00ab }
            java.lang.String r3 = new java.lang.String     // Catch:{ Exception -> 0x00ab }
            java.nio.charset.Charset r4 = km.d.f24740b     // Catch:{ Exception -> 0x00ab }
            r3.<init>(r8, r4)     // Catch:{ Exception -> 0x00ab }
            java.lang.String r8 = r2.a(r1, r3)     // Catch:{ Exception -> 0x00ab }
            goto L_0x00a6
        L_0x00c7:
            java.lang.String r1 = "CheckSlot-"
            android.util.Log.d(r1, r8)     // Catch:{ Exception -> 0x00ab }
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x00ab }
            r1.<init>((java.lang.String) r8)     // Catch:{ Exception -> 0x00ab }
            androidx.lifecycle.a0 r8 = r0.f24425d     // Catch:{ Exception -> 0x00ab }
            r8.k(r1)     // Catch:{ Exception -> 0x00ab }
            goto L_0x010a
        L_0x00d7:
            r8.printStackTrace()     // Catch:{ Exception -> 0x00f3 }
            com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog$a r1 = com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog.f20957k     // Catch:{ Exception -> 0x00f3 }
            android.app.Application r2 = r0.f24422a     // Catch:{ Exception -> 0x00f3 }
            v9.d$a r8 = v9.d.f17494a     // Catch:{ Exception -> 0x00f3 }
            java.lang.String r3 = r8.t()     // Catch:{ Exception -> 0x00f3 }
            java.lang.String r4 = "getSlotDet"
            java.lang.String r5 = r8.v()     // Catch:{ Exception -> 0x00f3 }
            java.lang.String r6 = r8.w()     // Catch:{ Exception -> 0x00f3 }
            r1.a(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x00f3 }
            goto L_0x010a
        L_0x00f2:
            r0 = r7
        L_0x00f3:
            com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog$a r1 = com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog.f20957k
            android.app.Application r2 = r0.f24422a
            v9.d$a r8 = v9.d.f17494a
            java.lang.String r3 = r8.t()
            java.lang.String r4 = "getSlotDet"
            java.lang.String r5 = r8.v()
            java.lang.String r6 = r8.w()
            r1.a(r2, r3, r4, r5, r6)
        L_0x010a:
            pl.x r8 = pl.x.f30437a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ik.b.a(tl.d):java.lang.Object");
    }

    public final a0 b() {
        return this.f24425d;
    }
}
