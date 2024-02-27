package bk;

import android.app.Application;
import android.util.Log;
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

public final class n {

    /* renamed from: a  reason: collision with root package name */
    private final Application f19971a;

    /* renamed from: b  reason: collision with root package name */
    private final m f19972b;

    /* renamed from: c  reason: collision with root package name */
    private String f19973c;

    /* renamed from: d  reason: collision with root package name */
    private String f19974d;

    /* renamed from: e  reason: collision with root package name */
    private String f19975e;

    /* renamed from: f  reason: collision with root package name */
    private String f19976f;

    /* renamed from: g  reason: collision with root package name */
    private final a0 f19977g;

    static final class a extends l implements p {

        /* renamed from: f  reason: collision with root package name */
        int f19978f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ n f19979g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(n nVar, d dVar) {
            super(2, dVar);
            this.f19979g = nVar;
        }

        /* renamed from: b */
        public final Object h(d0 d0Var, d dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(x.f30437a);
        }

        public final d create(Object obj, d dVar) {
            return new a(this.f19979g, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object c10 = d.c();
            int i10 = this.f19978f;
            if (i10 == 0) {
                q.b(obj);
                n nVar = this.f19979g;
                this.f19978f = 1;
                if (nVar.a(this) == c10) {
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
        Object f19980e;

        /* renamed from: f  reason: collision with root package name */
        Object f19981f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f19982g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ n f19983h;

        /* renamed from: i  reason: collision with root package name */
        int f19984i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(n nVar, d dVar) {
            super(dVar);
            this.f19983h = nVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f19982g = obj;
            this.f19984i |= Integer.MIN_VALUE;
            return this.f19983h.a(this);
        }
    }

    public n(Application application, m mVar, String str, String str2, String str3, String str4) {
        cm.l.f(application, "app");
        cm.l.f(mVar, "reqObj");
        cm.l.f(str, "agentId");
        cm.l.f(str2, "agentPwd");
        cm.l.f(str3, "agentIpAddress");
        cm.l.f(str4, "agentServiceName");
        this.f19971a = application;
        this.f19972b = mVar;
        this.f19973c = str;
        this.f19974d = str2;
        this.f19975e = str3;
        this.f19976f = str4;
        this.f19977g = new a0();
        k1 unused = g.d(e0.a(q0.c()), (g) null, (f0) null, new a(this, (d) null), 3, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0099 A[SYNTHETIC, Splitter:B:28:0x0099] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00bc A[Catch:{ Exception -> 0x00ba }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(tl.d r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof bk.n.b
            if (r0 == 0) goto L_0x0013
            r0 = r11
            bk.n$b r0 = (bk.n.b) r0
            int r1 = r0.f19984i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f19984i = r1
            goto L_0x0018
        L_0x0013:
            bk.n$b r0 = new bk.n$b
            r0.<init>(r10, r11)
        L_0x0018:
            java.lang.Object r11 = r0.f19982g
            java.lang.Object r1 = ul.d.c()
            int r2 = r0.f19984i
            java.lang.Class<com.nic.mparivahan.dlservices.data.model.duplicatedl.GetAckDetForGivenDLNumberResponse> r3 = com.nic.mparivahan.dlservices.data.model.duplicatedl.GetAckDetForGivenDLNumberResponse.class
            r4 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r4) goto L_0x0033
            java.lang.Object r1 = r0.f19981f
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.f19980e
            bk.n r0 = (bk.n) r0
            pl.q.b(r11)     // Catch:{ Exception -> 0x0108 }
            goto L_0x0086
        L_0x0033:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L_0x003b:
            pl.q.b(r11)
            si.b$a r11 = si.b.f31257a
            android.app.Application r2 = r10.f19971a
            boolean r11 = r11.a(r2)
            if (r11 == 0) goto L_0x0131
            long r5 = java.lang.System.currentTimeMillis()
            java.lang.String r11 = java.lang.String.valueOf(r5)
            si.a$a r2 = si.a.f31253a
            android.app.Application r5 = r10.f19971a
            retrofit2.Retrofit r2 = r2.a(r5)
            java.lang.Class<com.nic.mparivahan.dlservices.data.network.DlExtraService> r5 = com.nic.mparivahan.dlservices.data.network.DlExtraService.class
            java.lang.Object r2 = r2.create(r5)
            com.nic.mparivahan.dlservices.data.network.DlExtraService r2 = (com.nic.mparivahan.dlservices.data.network.DlExtraService) r2
            um.c0$a r5 = um.c0.Companion     // Catch:{ Exception -> 0x0107 }
            um.x$a r6 = um.x.f32156g     // Catch:{ Exception -> 0x0107 }
            java.lang.String r7 = "application/json"
            um.x r6 = r6.b(r7)     // Catch:{ Exception -> 0x0107 }
            java.lang.String r7 = r10.c()     // Catch:{ Exception -> 0x0107 }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x0107 }
            um.c0 r5 = r5.f(r6, r7)     // Catch:{ Exception -> 0x0107 }
            r0.f19980e = r10     // Catch:{ Exception -> 0x0107 }
            r0.f19981f = r11     // Catch:{ Exception -> 0x0107 }
            r0.f19984i = r4     // Catch:{ Exception -> 0x0107 }
            java.lang.Object r0 = r2.getAckDetForGivenDLNumberRenewal(r5, r11, r0)     // Catch:{ Exception -> 0x0107 }
            if (r0 != r1) goto L_0x0083
            return r1
        L_0x0083:
            r1 = r11
            r11 = r0
            r0 = r10
        L_0x0086:
            com.nic.mparivahan.Security.SecModle.SecurityModle r11 = (com.nic.mparivahan.Security.SecModle.SecurityModle) r11     // Catch:{ Exception -> 0x0108 }
            java.lang.String r2 = "_update"
            java.lang.String r4 = r11.toString()     // Catch:{ Exception -> 0x0108 }
            android.util.Log.d(r2, r4)     // Catch:{ Exception -> 0x0108 }
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x00ba }
            r4 = 26
            java.lang.String r5 = "decode(...)"
            if (r2 < r4) goto L_0x00bc
            id.c$a r2 = id.c.f12675a     // Catch:{ Exception -> 0x00ba }
            j$.util.Base64$Decoder r4 = j$.util.Base64.getDecoder()     // Catch:{ Exception -> 0x00ba }
            java.lang.String r11 = r11.getData()     // Catch:{ Exception -> 0x00ba }
            byte[] r11 = r4.decode((java.lang.String) r11)     // Catch:{ Exception -> 0x00ba }
            cm.l.e(r11, r5)     // Catch:{ Exception -> 0x00ba }
            java.lang.String r4 = new java.lang.String     // Catch:{ Exception -> 0x00ba }
            java.nio.charset.Charset r5 = km.d.f24740b     // Catch:{ Exception -> 0x00ba }
            r4.<init>(r11, r5)     // Catch:{ Exception -> 0x00ba }
            java.lang.String r11 = r2.a(r1, r4)     // Catch:{ Exception -> 0x00ba }
        L_0x00b5:
            java.lang.String r11 = java.lang.String.valueOf(r11)     // Catch:{ Exception -> 0x00ba }
            goto L_0x00d6
        L_0x00ba:
            r11 = move-exception
            goto L_0x00ec
        L_0x00bc:
            id.c$a r2 = id.c.f12675a     // Catch:{ Exception -> 0x00ba }
            java.lang.String r11 = r11.getData()     // Catch:{ Exception -> 0x00ba }
            r4 = 0
            byte[] r11 = android.util.Base64.decode(r11, r4)     // Catch:{ Exception -> 0x00ba }
            cm.l.e(r11, r5)     // Catch:{ Exception -> 0x00ba }
            java.lang.String r4 = new java.lang.String     // Catch:{ Exception -> 0x00ba }
            java.nio.charset.Charset r5 = km.d.f24740b     // Catch:{ Exception -> 0x00ba }
            r4.<init>(r11, r5)     // Catch:{ Exception -> 0x00ba }
            java.lang.String r11 = r2.a(r1, r4)     // Catch:{ Exception -> 0x00ba }
            goto L_0x00b5
        L_0x00d6:
            java.lang.String r1 = "renewal_response"
            android.util.Log.d(r1, r11)     // Catch:{ Exception -> 0x00ba }
            i7.d r1 = new i7.d     // Catch:{ Exception -> 0x00ba }
            r1.<init>()     // Catch:{ Exception -> 0x00ba }
            java.lang.Object r11 = r1.j(r11, r3)     // Catch:{ Exception -> 0x00ba }
            com.nic.mparivahan.dlservices.data.model.duplicatedl.GetAckDetForGivenDLNumberResponse r11 = (com.nic.mparivahan.dlservices.data.model.duplicatedl.GetAckDetForGivenDLNumberResponse) r11     // Catch:{ Exception -> 0x00ba }
            androidx.lifecycle.a0 r1 = r0.f19977g     // Catch:{ Exception -> 0x00ba }
            r1.k(r11)     // Catch:{ Exception -> 0x00ba }
            goto L_0x0131
        L_0x00ec:
            r11.printStackTrace()     // Catch:{ Exception -> 0x0108 }
            com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog$a r4 = com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog.f20957k     // Catch:{ Exception -> 0x0108 }
            android.app.Application r5 = r0.f19971a     // Catch:{ Exception -> 0x0108 }
            v9.d$a r11 = v9.d.f17494a     // Catch:{ Exception -> 0x0108 }
            java.lang.String r6 = r11.t()     // Catch:{ Exception -> 0x0108 }
            java.lang.String r7 = "getAckDetForGivenDLNumber"
            java.lang.String r8 = r11.v()     // Catch:{ Exception -> 0x0108 }
            java.lang.String r9 = r11.w()     // Catch:{ Exception -> 0x0108 }
            r4.a(r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x0108 }
            goto L_0x0131
        L_0x0107:
            r0 = r10
        L_0x0108:
            com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog$a r4 = com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog.f20957k
            android.app.Application r5 = r0.f19971a
            v9.d$a r11 = v9.d.f17494a
            java.lang.String r6 = r11.t()
            java.lang.String r7 = "getAckDetForGivenDLNumber"
            java.lang.String r8 = r11.v()
            java.lang.String r9 = r11.w()
            r4.a(r5, r6, r7, r8, r9)
            i7.d r11 = new i7.d
            r11.<init>()
            java.lang.String r1 = "{\n  \"result\": {\n    \"status_code\": \"05\",\n    \"status_desc\": \"success\",\n    \"ReqStatus\": \"\",\n    \"Result\": [\n    ]\n  }\n}"
            java.lang.Object r11 = r11.j(r1, r3)
            com.nic.mparivahan.dlservices.data.model.duplicatedl.GetAckDetForGivenDLNumberResponse r11 = (com.nic.mparivahan.dlservices.data.model.duplicatedl.GetAckDetForGivenDLNumberResponse) r11
            androidx.lifecycle.a0 r0 = r0.f19977g
            r0.k(r11)
        L_0x0131:
            pl.x r11 = pl.x.f30437a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: bk.n.a(tl.d):java.lang.Object");
    }

    public final a0 b() {
        return this.f19977g;
    }

    public final String c() {
        String t10 = new i7.d().t(this.f19972b);
        Log.d("par_val", this.f19972b.toString());
        cm.l.c(t10);
        return t10;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(Application application, m mVar, String str, String str2, String str3, String str4, int i10, cm.g gVar) {
        this(application, mVar, (i10 & 4) != 0 ? "sakalaHR" : str, (i10 & 8) != 0 ? "975867c068a4e3e043058b5aaeebbeb5" : str2, (i10 & 16) != 0 ? "10.248.213.244" : str3, (i10 & 32) != 0 ? "SarathiMobileService" : str4);
    }
}
