package ti;

import android.app.Application;
import androidx.lifecycle.a0;
import bm.p;
import com.nic.mparivahan.dlservices.data.model.DlState;
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

public final class k {

    /* renamed from: a  reason: collision with root package name */
    private final Application f31576a;

    /* renamed from: b  reason: collision with root package name */
    private String f31577b;

    /* renamed from: c  reason: collision with root package name */
    private String f31578c;

    /* renamed from: d  reason: collision with root package name */
    private String f31579d;

    /* renamed from: e  reason: collision with root package name */
    private String f31580e;

    /* renamed from: f  reason: collision with root package name */
    private final a0 f31581f;

    static final class a extends l implements p {

        /* renamed from: f  reason: collision with root package name */
        int f31582f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ k f31583g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(k kVar, d dVar) {
            super(2, dVar);
            this.f31583g = kVar;
        }

        /* renamed from: b */
        public final Object h(d0 d0Var, d dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(x.f30437a);
        }

        public final d create(Object obj, d dVar) {
            return new a(this.f31583g, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object c10 = d.c();
            int i10 = this.f31582f;
            if (i10 == 0) {
                q.b(obj);
                k kVar = this.f31583g;
                this.f31582f = 1;
                if (kVar.a(this) == c10) {
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
        Object f31584e;

        /* renamed from: f  reason: collision with root package name */
        Object f31585f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f31586g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ k f31587h;

        /* renamed from: i  reason: collision with root package name */
        int f31588i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(k kVar, d dVar) {
            super(dVar);
            this.f31587h = kVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f31586g = obj;
            this.f31588i |= Integer.MIN_VALUE;
            return this.f31587h.a(this);
        }
    }

    public k(Application application, String str, String str2, String str3, String str4) {
        cm.l.f(application, "app");
        cm.l.f(str, "agentId");
        cm.l.f(str2, "agentPwd");
        cm.l.f(str3, "agentIpAddress");
        cm.l.f(str4, "agentServiceName");
        this.f31576a = application;
        this.f31577b = str;
        this.f31578c = str2;
        this.f31579d = str3;
        this.f31580e = str4;
        this.f31581f = new a0();
        k1 unused = g.d(e0.a(q0.b()), (g) null, (f0) null, new a(this, (d) null), 3, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x008a A[SYNTHETIC, Splitter:B:29:0x008a] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ad A[Catch:{ Exception -> 0x00ab }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(tl.d r9) {
        /*
            r8 = this;
            java.lang.String r0 = "DecRes-"
            boolean r1 = r9 instanceof ti.k.b
            if (r1 == 0) goto L_0x0015
            r1 = r9
            ti.k$b r1 = (ti.k.b) r1
            int r2 = r1.f31588i
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0015
            int r2 = r2 - r3
            r1.f31588i = r2
            goto L_0x001a
        L_0x0015:
            ti.k$b r1 = new ti.k$b
            r1.<init>(r8, r9)
        L_0x001a:
            java.lang.Object r9 = r1.f31586g
            java.lang.Object r2 = ul.d.c()
            int r3 = r1.f31588i
            r4 = 1
            if (r3 == 0) goto L_0x003e
            if (r3 != r4) goto L_0x0036
            java.lang.Object r2 = r1.f31585f
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r1.f31584e
            ti.k r1 = (ti.k) r1
            pl.q.b(r9)     // Catch:{ Exception -> 0x0033 }
            goto L_0x0077
        L_0x0033:
            r9 = move-exception
            goto L_0x0101
        L_0x0036:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x003e:
            pl.q.b(r9)
            si.b$a r9 = si.b.f31257a
            android.app.Application r3 = r8.f31576a
            boolean r9 = r9.a(r3)
            if (r9 == 0) goto L_0x0127
            long r5 = java.lang.System.currentTimeMillis()
            java.lang.String r9 = java.lang.String.valueOf(r5)
            si.a$a r3 = si.a.f31253a
            android.app.Application r5 = r8.f31576a
            retrofit2.Retrofit r3 = r3.a(r5)
            java.lang.Class<com.nic.mparivahan.dlservices.data.network.DlOtherService> r5 = com.nic.mparivahan.dlservices.data.network.DlOtherService.class
            java.lang.Object r3 = r3.create(r5)
            com.nic.mparivahan.dlservices.data.network.DlOtherService r3 = (com.nic.mparivahan.dlservices.data.network.DlOtherService) r3
            com.nic.mparivahan.dlservices.data.model.DlState r5 = r8.c()     // Catch:{ Exception -> 0x00ff }
            r1.f31584e = r8     // Catch:{ Exception -> 0x00ff }
            r1.f31585f = r9     // Catch:{ Exception -> 0x00ff }
            r1.f31588i = r4     // Catch:{ Exception -> 0x00ff }
            java.lang.Object r1 = r3.getState(r5, r9, r1)     // Catch:{ Exception -> 0x00ff }
            if (r1 != r2) goto L_0x0074
            return r2
        L_0x0074:
            r2 = r9
            r9 = r1
            r1 = r8
        L_0x0077:
            com.nic.mparivahan.Security.SecModle.SecurityModle r9 = (com.nic.mparivahan.Security.SecModle.SecurityModle) r9     // Catch:{ Exception -> 0x0033 }
            java.lang.String r3 = "_update"
            java.lang.String r4 = r9.toString()     // Catch:{ Exception -> 0x0033 }
            android.util.Log.d(r3, r4)     // Catch:{ Exception -> 0x0033 }
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x00ab }
            r4 = 26
            java.lang.String r5 = "decode(...)"
            if (r3 < r4) goto L_0x00ad
            id.c$a r3 = id.c.f12675a     // Catch:{ Exception -> 0x00ab }
            j$.util.Base64$Decoder r4 = j$.util.Base64.getDecoder()     // Catch:{ Exception -> 0x00ab }
            java.lang.String r9 = r9.getData()     // Catch:{ Exception -> 0x00ab }
            byte[] r9 = r4.decode((java.lang.String) r9)     // Catch:{ Exception -> 0x00ab }
            cm.l.e(r9, r5)     // Catch:{ Exception -> 0x00ab }
            java.lang.String r4 = new java.lang.String     // Catch:{ Exception -> 0x00ab }
            java.nio.charset.Charset r5 = km.d.f24740b     // Catch:{ Exception -> 0x00ab }
            r4.<init>(r9, r5)     // Catch:{ Exception -> 0x00ab }
            java.lang.String r9 = r3.a(r2, r4)     // Catch:{ Exception -> 0x00ab }
        L_0x00a6:
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ Exception -> 0x00ab }
            goto L_0x00c7
        L_0x00ab:
            r9 = move-exception
            goto L_0x00dd
        L_0x00ad:
            id.c$a r3 = id.c.f12675a     // Catch:{ Exception -> 0x00ab }
            java.lang.String r9 = r9.getData()     // Catch:{ Exception -> 0x00ab }
            r4 = 0
            byte[] r9 = android.util.Base64.decode(r9, r4)     // Catch:{ Exception -> 0x00ab }
            cm.l.e(r9, r5)     // Catch:{ Exception -> 0x00ab }
            java.lang.String r4 = new java.lang.String     // Catch:{ Exception -> 0x00ab }
            java.nio.charset.Charset r5 = km.d.f24740b     // Catch:{ Exception -> 0x00ab }
            r4.<init>(r9, r5)     // Catch:{ Exception -> 0x00ab }
            java.lang.String r9 = r3.a(r2, r4)     // Catch:{ Exception -> 0x00ab }
            goto L_0x00a6
        L_0x00c7:
            android.util.Log.d(r0, r9)     // Catch:{ Exception -> 0x00ab }
            i7.d r2 = new i7.d     // Catch:{ Exception -> 0x00ab }
            r2.<init>()     // Catch:{ Exception -> 0x00ab }
            java.lang.Class<com.nic.mparivahan.dlservices.data.model.StateResponse> r3 = com.nic.mparivahan.dlservices.data.model.StateResponse.class
            java.lang.Object r9 = r2.j(r9, r3)     // Catch:{ Exception -> 0x00ab }
            com.nic.mparivahan.dlservices.data.model.StateResponse r9 = (com.nic.mparivahan.dlservices.data.model.StateResponse) r9     // Catch:{ Exception -> 0x00ab }
            androidx.lifecycle.a0 r2 = r1.f31581f     // Catch:{ Exception -> 0x00ab }
            r2.k(r9)     // Catch:{ Exception -> 0x00ab }
            goto L_0x0127
        L_0x00dd:
            r9.printStackTrace()     // Catch:{ Exception -> 0x0033 }
            java.lang.String r9 = r9.getLocalizedMessage()     // Catch:{ Exception -> 0x0033 }
            android.util.Log.d(r0, r9)     // Catch:{ Exception -> 0x0033 }
            com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog$a r2 = com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog.f20957k     // Catch:{ Exception -> 0x0033 }
            android.app.Application r3 = r1.f31576a     // Catch:{ Exception -> 0x0033 }
            v9.d$a r9 = v9.d.f17494a     // Catch:{ Exception -> 0x0033 }
            java.lang.String r4 = r9.t()     // Catch:{ Exception -> 0x0033 }
            java.lang.String r5 = "stateMast"
            java.lang.String r6 = r9.v()     // Catch:{ Exception -> 0x0033 }
            java.lang.String r7 = r9.w()     // Catch:{ Exception -> 0x0033 }
            r2.a(r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x0033 }
            goto L_0x0127
        L_0x00ff:
            r9 = move-exception
            r1 = r8
        L_0x0101:
            java.lang.String r9 = r9.getMessage()
            if (r9 == 0) goto L_0x0110
            java.lang.String r0 = "dl_renewal_logginga"
            int r9 = android.util.Log.e(r0, r9)
            kotlin.coroutines.jvm.internal.b.b(r9)
        L_0x0110:
            com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog$a r2 = com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog.f20957k
            android.app.Application r3 = r1.f31576a
            v9.d$a r9 = v9.d.f17494a
            java.lang.String r4 = r9.t()
            java.lang.String r5 = "stateMast"
            java.lang.String r6 = r9.v()
            java.lang.String r7 = r9.w()
            r2.a(r3, r4, r5, r6, r7)
        L_0x0127:
            pl.x r9 = pl.x.f30437a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ti.k.a(tl.d):java.lang.Object");
    }

    public final a0 b() {
        return this.f31581f;
    }

    public final DlState c() {
        return new DlState(this.f31577b, this.f31578c, this.f31579d, this.f31580e);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(Application application, String str, String str2, String str3, String str4, int i10, cm.g gVar) {
        this(application, (i10 & 2) != 0 ? "DelhTrans" : str, (i10 & 4) != 0 ? "d9fe1613399b0883e4ecf3f710e18317" : str2, (i10 & 8) != 0 ? "164.100.161.142" : str3, (i10 & 16) != 0 ? "sarathiservice" : str4);
    }
}
