package ui;

import android.app.Application;
import androidx.lifecycle.a0;
import bm.p;
import com.nic.mparivahan.dlservices.data.model.duplicatedl.GetReasonsTransWiseRequest;
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
    private final Application f31796a;

    /* renamed from: b  reason: collision with root package name */
    private String f31797b;

    /* renamed from: c  reason: collision with root package name */
    private String f31798c;

    /* renamed from: d  reason: collision with root package name */
    private String f31799d;

    /* renamed from: e  reason: collision with root package name */
    private String f31800e;

    /* renamed from: f  reason: collision with root package name */
    private String f31801f;

    /* renamed from: g  reason: collision with root package name */
    private final a0 f31802g;

    static final class a extends l implements p {

        /* renamed from: f  reason: collision with root package name */
        int f31803f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ b f31804g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar, d dVar) {
            super(2, dVar);
            this.f31804g = bVar;
        }

        /* renamed from: b */
        public final Object h(d0 d0Var, d dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(x.f30437a);
        }

        public final d create(Object obj, d dVar) {
            return new a(this.f31804g, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object c10 = d.c();
            int i10 = this.f31803f;
            if (i10 == 0) {
                q.b(obj);
                b bVar = this.f31804g;
                this.f31803f = 1;
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

    /* renamed from: ui.b$b  reason: collision with other inner class name */
    static final class C0361b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: e  reason: collision with root package name */
        Object f31805e;

        /* renamed from: f  reason: collision with root package name */
        Object f31806f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f31807g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ b f31808h;

        /* renamed from: i  reason: collision with root package name */
        int f31809i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0361b(b bVar, d dVar) {
            super(dVar);
            this.f31808h = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f31807g = obj;
            this.f31809i |= Integer.MIN_VALUE;
            return this.f31808h.a(this);
        }
    }

    public b(Application application, String str, String str2, String str3, String str4, String str5) {
        cm.l.f(application, "app");
        cm.l.f(str, "transCode");
        cm.l.f(str2, "agentId");
        cm.l.f(str3, "agentPwd");
        cm.l.f(str4, "agentIpAddress");
        cm.l.f(str5, "agentServiceName");
        this.f31796a = application;
        this.f31797b = str;
        this.f31798c = str2;
        this.f31799d = str3;
        this.f31800e = str4;
        this.f31801f = str5;
        this.f31802g = new a0();
        k1 unused = g.d(e0.a(q0.b()), (g) null, (f0) null, new a(this, (d) null), 3, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007f A[SYNTHETIC, Splitter:B:29:0x007f] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a2 A[Catch:{ Exception -> 0x00a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(tl.d r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof ui.b.C0361b
            if (r0 == 0) goto L_0x0013
            r0 = r8
            ui.b$b r0 = (ui.b.C0361b) r0
            int r1 = r0.f31809i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f31809i = r1
            goto L_0x0018
        L_0x0013:
            ui.b$b r0 = new ui.b$b
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f31807g
            java.lang.Object r1 = ul.d.c()
            int r2 = r0.f31809i
            r3 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 != r3) goto L_0x0034
            java.lang.Object r1 = r0.f31806f
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.f31805e
            ui.b r0 = (ui.b) r0
            pl.q.b(r8)     // Catch:{ Exception -> 0x0031 }
            goto L_0x0075
        L_0x0031:
            r8 = move-exception
            goto L_0x00ec
        L_0x0034:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x003c:
            pl.q.b(r8)
            si.b$a r8 = si.b.f31257a
            android.app.Application r2 = r7.f31796a
            boolean r8 = r8.a(r2)
            if (r8 == 0) goto L_0x0112
            long r4 = java.lang.System.currentTimeMillis()
            java.lang.String r8 = java.lang.String.valueOf(r4)
            si.a$a r2 = si.a.f31253a
            android.app.Application r4 = r7.f31796a
            retrofit2.Retrofit r2 = r2.a(r4)
            java.lang.Class<com.nic.mparivahan.dlservices.data.network.DlExtraService> r4 = com.nic.mparivahan.dlservices.data.network.DlExtraService.class
            java.lang.Object r2 = r2.create(r4)
            com.nic.mparivahan.dlservices.data.network.DlExtraService r2 = (com.nic.mparivahan.dlservices.data.network.DlExtraService) r2
            com.nic.mparivahan.dlservices.data.model.duplicatedl.GetReasonsTransWiseRequest r4 = r7.c()     // Catch:{ Exception -> 0x00ea }
            r0.f31805e = r7     // Catch:{ Exception -> 0x00ea }
            r0.f31806f = r8     // Catch:{ Exception -> 0x00ea }
            r0.f31809i = r3     // Catch:{ Exception -> 0x00ea }
            java.lang.Object r0 = r2.getReasonsTransWise(r4, r8, r0)     // Catch:{ Exception -> 0x00ea }
            if (r0 != r1) goto L_0x0072
            return r1
        L_0x0072:
            r1 = r8
            r8 = r0
            r0 = r7
        L_0x0075:
            com.nic.mparivahan.Security.SecModle.SecurityModle r8 = (com.nic.mparivahan.Security.SecModle.SecurityModle) r8     // Catch:{ Exception -> 0x0031 }
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x00a0 }
            r3 = 26
            java.lang.String r4 = "decode(...)"
            if (r2 < r3) goto L_0x00a2
            id.c$a r2 = id.c.f12675a     // Catch:{ Exception -> 0x00a0 }
            j$.util.Base64$Decoder r3 = j$.util.Base64.getDecoder()     // Catch:{ Exception -> 0x00a0 }
            java.lang.String r8 = r8.getData()     // Catch:{ Exception -> 0x00a0 }
            byte[] r8 = r3.decode((java.lang.String) r8)     // Catch:{ Exception -> 0x00a0 }
            cm.l.e(r8, r4)     // Catch:{ Exception -> 0x00a0 }
            java.lang.String r3 = new java.lang.String     // Catch:{ Exception -> 0x00a0 }
            java.nio.charset.Charset r4 = km.d.f24740b     // Catch:{ Exception -> 0x00a0 }
            r3.<init>(r8, r4)     // Catch:{ Exception -> 0x00a0 }
            java.lang.String r8 = r2.a(r1, r3)     // Catch:{ Exception -> 0x00a0 }
        L_0x009b:
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ Exception -> 0x00a0 }
            goto L_0x00bc
        L_0x00a0:
            r8 = move-exception
            goto L_0x00cf
        L_0x00a2:
            id.c$a r2 = id.c.f12675a     // Catch:{ Exception -> 0x00a0 }
            java.lang.String r8 = r8.getData()     // Catch:{ Exception -> 0x00a0 }
            r3 = 0
            byte[] r8 = android.util.Base64.decode(r8, r3)     // Catch:{ Exception -> 0x00a0 }
            cm.l.e(r8, r4)     // Catch:{ Exception -> 0x00a0 }
            java.lang.String r3 = new java.lang.String     // Catch:{ Exception -> 0x00a0 }
            java.nio.charset.Charset r4 = km.d.f24740b     // Catch:{ Exception -> 0x00a0 }
            r3.<init>(r8, r4)     // Catch:{ Exception -> 0x00a0 }
            java.lang.String r8 = r2.a(r1, r3)     // Catch:{ Exception -> 0x00a0 }
            goto L_0x009b
        L_0x00bc:
            i7.d r1 = new i7.d     // Catch:{ Exception -> 0x00a0 }
            r1.<init>()     // Catch:{ Exception -> 0x00a0 }
            java.lang.Class<com.nic.mparivahan.dlservices.data.model.duplicatedl.GetReasonsTransWiseResponse> r2 = com.nic.mparivahan.dlservices.data.model.duplicatedl.GetReasonsTransWiseResponse.class
            java.lang.Object r8 = r1.j(r8, r2)     // Catch:{ Exception -> 0x00a0 }
            com.nic.mparivahan.dlservices.data.model.duplicatedl.GetReasonsTransWiseResponse r8 = (com.nic.mparivahan.dlservices.data.model.duplicatedl.GetReasonsTransWiseResponse) r8     // Catch:{ Exception -> 0x00a0 }
            androidx.lifecycle.a0 r1 = r0.f31802g     // Catch:{ Exception -> 0x00a0 }
            r1.k(r8)     // Catch:{ Exception -> 0x00a0 }
            goto L_0x0112
        L_0x00cf:
            r8.printStackTrace()     // Catch:{ Exception -> 0x0031 }
            com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog$a r1 = com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog.f20957k     // Catch:{ Exception -> 0x0031 }
            android.app.Application r2 = r0.f31796a     // Catch:{ Exception -> 0x0031 }
            v9.d$a r8 = v9.d.f17494a     // Catch:{ Exception -> 0x0031 }
            java.lang.String r3 = r8.t()     // Catch:{ Exception -> 0x0031 }
            java.lang.String r4 = "getReasonsTransWise"
            java.lang.String r5 = r8.v()     // Catch:{ Exception -> 0x0031 }
            java.lang.String r6 = r8.w()     // Catch:{ Exception -> 0x0031 }
            r1.a(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x0031 }
            goto L_0x0112
        L_0x00ea:
            r8 = move-exception
            r0 = r7
        L_0x00ec:
            com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog$a r1 = com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog.f20957k
            android.app.Application r2 = r0.f31796a
            v9.d$a r0 = v9.d.f17494a
            java.lang.String r3 = r0.t()
            java.lang.String r4 = "getReasonsTransWise"
            java.lang.String r5 = r0.v()
            java.lang.String r6 = r0.w()
            r1.a(r2, r3, r4, r5, r6)
            java.lang.String r8 = r8.getMessage()
            if (r8 == 0) goto L_0x0112
            java.lang.String r0 = "dl_renewal_logginga"
            int r8 = android.util.Log.e(r0, r8)
            kotlin.coroutines.jvm.internal.b.b(r8)
        L_0x0112:
            pl.x r8 = pl.x.f30437a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ui.b.a(tl.d):java.lang.Object");
    }

    public final a0 b() {
        return this.f31802g;
    }

    public final GetReasonsTransWiseRequest c() {
        return new GetReasonsTransWiseRequest(this.f31797b);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Application application, String str, String str2, String str3, String str4, String str5, int i10, cm.g gVar) {
        this(application, str, (i10 & 4) != 0 ? "sakalaHR" : str2, (i10 & 8) != 0 ? "975867c068a4e3e043058b5aaeebbeb5" : str3, (i10 & 16) != 0 ? "10.248.213.244" : str4, (i10 & 32) != 0 ? "SarathiMobileService" : str5);
    }
}
