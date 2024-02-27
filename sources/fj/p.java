package fj;

import android.app.Application;
import androidx.lifecycle.a0;
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

public final class p {

    /* renamed from: a  reason: collision with root package name */
    private Application f23548a;

    /* renamed from: b  reason: collision with root package name */
    private String f23549b;

    /* renamed from: c  reason: collision with root package name */
    private String f23550c;

    /* renamed from: d  reason: collision with root package name */
    private final a0 f23551d = new a0();

    static final class a extends l implements bm.p {

        /* renamed from: f  reason: collision with root package name */
        int f23552f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ p f23553g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(p pVar, d dVar) {
            super(2, dVar);
            this.f23553g = pVar;
        }

        /* renamed from: b */
        public final Object h(d0 d0Var, d dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(x.f30437a);
        }

        public final d create(Object obj, d dVar) {
            return new a(this.f23553g, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object c10 = d.c();
            int i10 = this.f23552f;
            if (i10 == 0) {
                q.b(obj);
                p pVar = this.f23553g;
                this.f23552f = 1;
                if (pVar.a(this) == c10) {
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
        Object f23554e;

        /* renamed from: f  reason: collision with root package name */
        Object f23555f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f23556g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ p f23557h;

        /* renamed from: i  reason: collision with root package name */
        int f23558i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(p pVar, d dVar) {
            super(dVar);
            this.f23557h = pVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f23556g = obj;
            this.f23558i |= Integer.MIN_VALUE;
            return this.f23557h.a(this);
        }
    }

    public p(Application application, String str, String str2) {
        cm.l.f(application, "mApp");
        cm.l.f(str, "applNo");
        cm.l.f(str2, "dob");
        this.f23548a = application;
        this.f23549b = str;
        this.f23550c = str2;
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
            boolean r0 = r8 instanceof fj.p.b
            if (r0 == 0) goto L_0x0013
            r0 = r8
            fj.p$b r0 = (fj.p.b) r0
            int r1 = r0.f23558i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f23558i = r1
            goto L_0x0018
        L_0x0013:
            fj.p$b r0 = new fj.p$b
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f23556g
            java.lang.Object r1 = ul.d.c()
            int r2 = r0.f23558i
            r3 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r1 = r0.f23555f
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.f23554e
            fj.p r0 = (fj.p) r0
            pl.q.b(r8)     // Catch:{ Exception -> 0x00f6 }
            goto L_0x0077
        L_0x0031:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x0039:
            pl.q.b(r8)
            si.b$a r8 = si.b.f31257a
            android.app.Application r2 = r7.f23548a
            boolean r8 = r8.a(r2)
            if (r8 == 0) goto L_0x010d
            long r4 = java.lang.System.currentTimeMillis()
            java.lang.String r8 = java.lang.String.valueOf(r4)
            si.a$a r2 = si.a.f31253a
            android.app.Application r4 = r7.f23548a
            retrofit2.Retrofit r2 = r2.a(r4)
            java.lang.Class<com.nic.mparivahan.dlservices.ui.acknow.DlApplStatusService> r4 = com.nic.mparivahan.dlservices.ui.acknow.DlApplStatusService.class
            java.lang.Object r2 = r2.create(r4)
            com.nic.mparivahan.dlservices.ui.acknow.DlApplStatusService r2 = (com.nic.mparivahan.dlservices.ui.acknow.DlApplStatusService) r2
            com.nic.mparivahan.dlservices.ui.acknow.DlApplStatusRequest r4 = new com.nic.mparivahan.dlservices.ui.acknow.DlApplStatusRequest     // Catch:{ Exception -> 0x00f5 }
            java.lang.String r5 = r7.f23549b     // Catch:{ Exception -> 0x00f5 }
            java.lang.String r6 = r7.f23550c     // Catch:{ Exception -> 0x00f5 }
            r4.<init>(r5, r6)     // Catch:{ Exception -> 0x00f5 }
            r0.f23554e = r7     // Catch:{ Exception -> 0x00f5 }
            r0.f23555f = r8     // Catch:{ Exception -> 0x00f5 }
            r0.f23558i = r3     // Catch:{ Exception -> 0x00f5 }
            java.lang.Object r0 = r2.getApplicationStatus(r4, r8, r0)     // Catch:{ Exception -> 0x00f5 }
            if (r0 != r1) goto L_0x0074
            return r1
        L_0x0074:
            r1 = r8
            r8 = r0
            r0 = r7
        L_0x0077:
            com.nic.mparivahan.Security.SecModle.SecurityModle r8 = (com.nic.mparivahan.Security.SecModle.SecurityModle) r8     // Catch:{ Exception -> 0x00f6 }
            java.lang.String r2 = "_update"
            java.lang.String r3 = r8.toString()     // Catch:{ Exception -> 0x00f6 }
            android.util.Log.d(r2, r3)     // Catch:{ Exception -> 0x00f6 }
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
            goto L_0x00da
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
            i7.d r1 = new i7.d     // Catch:{ Exception -> 0x00ab }
            r1.<init>()     // Catch:{ Exception -> 0x00ab }
            java.lang.Class<com.nic.mparivahan.dlservices.ui.acknow.DlApplStatusResponse> r2 = com.nic.mparivahan.dlservices.ui.acknow.DlApplStatusResponse.class
            java.lang.Object r8 = r1.j(r8, r2)     // Catch:{ Exception -> 0x00ab }
            com.nic.mparivahan.dlservices.ui.acknow.DlApplStatusResponse r8 = (com.nic.mparivahan.dlservices.ui.acknow.DlApplStatusResponse) r8     // Catch:{ Exception -> 0x00ab }
            androidx.lifecycle.a0 r1 = r0.f23551d     // Catch:{ Exception -> 0x00ab }
            r1.k(r8)     // Catch:{ Exception -> 0x00ab }
            goto L_0x010d
        L_0x00da:
            r8.printStackTrace()     // Catch:{ Exception -> 0x00f6 }
            com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog$a r1 = com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog.f20957k     // Catch:{ Exception -> 0x00f6 }
            android.app.Application r2 = r0.f23548a     // Catch:{ Exception -> 0x00f6 }
            v9.d$a r8 = v9.d.f17494a     // Catch:{ Exception -> 0x00f6 }
            java.lang.String r3 = r8.t()     // Catch:{ Exception -> 0x00f6 }
            java.lang.String r4 = "getApplicationInfo"
            java.lang.String r5 = r8.v()     // Catch:{ Exception -> 0x00f6 }
            java.lang.String r6 = r8.w()     // Catch:{ Exception -> 0x00f6 }
            r1.a(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x00f6 }
            goto L_0x010d
        L_0x00f5:
            r0 = r7
        L_0x00f6:
            com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog$a r1 = com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog.f20957k
            android.app.Application r2 = r0.f23548a
            v9.d$a r8 = v9.d.f17494a
            java.lang.String r3 = r8.t()
            java.lang.String r4 = "getApplicationInfo"
            java.lang.String r5 = r8.v()
            java.lang.String r6 = r8.w()
            r1.a(r2, r3, r4, r5, r6)
        L_0x010d:
            pl.x r8 = pl.x.f30437a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: fj.p.a(tl.d):java.lang.Object");
    }

    public final a0 b() {
        return this.f23551d;
    }
}
