package wi;

import android.app.Application;
import androidx.lifecycle.a0;
import bm.p;
import com.nic.mparivahan.dlservices.data.model.idp.IdpRequestGetNations;
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
    private final Application f32602a;

    /* renamed from: b  reason: collision with root package name */
    private String f32603b;

    /* renamed from: c  reason: collision with root package name */
    private String f32604c;

    /* renamed from: d  reason: collision with root package name */
    private String f32605d;

    /* renamed from: e  reason: collision with root package name */
    private String f32606e;

    /* renamed from: f  reason: collision with root package name */
    private final a0 f32607f;

    static final class a extends l implements p {

        /* renamed from: f  reason: collision with root package name */
        int f32608f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ c f32609g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(c cVar, d dVar) {
            super(2, dVar);
            this.f32609g = cVar;
        }

        /* renamed from: b */
        public final Object h(d0 d0Var, d dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(x.f30437a);
        }

        public final d create(Object obj, d dVar) {
            return new a(this.f32609g, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object c10 = d.c();
            int i10 = this.f32608f;
            if (i10 == 0) {
                q.b(obj);
                c cVar = this.f32609g;
                this.f32608f = 1;
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
        Object f32610e;

        /* renamed from: f  reason: collision with root package name */
        Object f32611f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f32612g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ c f32613h;

        /* renamed from: i  reason: collision with root package name */
        int f32614i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(c cVar, d dVar) {
            super(dVar);
            this.f32613h = cVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f32612g = obj;
            this.f32614i |= Integer.MIN_VALUE;
            return this.f32613h.a(this);
        }
    }

    public c(Application application, String str, String str2, String str3, String str4) {
        cm.l.f(application, "app");
        cm.l.f(str, "agentId");
        cm.l.f(str2, "agentPwd");
        cm.l.f(str3, "agentIpAddress");
        cm.l.f(str4, "agentServiceName");
        this.f32602a = application;
        this.f32603b = str;
        this.f32604c = str2;
        this.f32605d = str3;
        this.f32606e = str4;
        this.f32607f = new a0();
        k1 unused = g.d(e0.a(q0.b()), (g) null, (f0) null, new a(this, (d) null), 3, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0088 A[SYNTHETIC, Splitter:B:29:0x0088] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ab A[Catch:{ Exception -> 0x00a9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(tl.d r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof wi.c.b
            if (r0 == 0) goto L_0x0013
            r0 = r9
            wi.c$b r0 = (wi.c.b) r0
            int r1 = r0.f32614i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f32614i = r1
            goto L_0x0018
        L_0x0013:
            wi.c$b r0 = new wi.c$b
            r0.<init>(r8, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f32612g
            java.lang.Object r1 = ul.d.c()
            int r2 = r0.f32614i
            r3 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 != r3) goto L_0x0034
            java.lang.Object r1 = r0.f32611f
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.f32610e
            wi.c r0 = (wi.c) r0
            pl.q.b(r9)     // Catch:{ Exception -> 0x0031 }
            goto L_0x0075
        L_0x0031:
            r9 = move-exception
            goto L_0x00fe
        L_0x0034:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x003c:
            pl.q.b(r9)
            si.b$a r9 = si.b.f31257a
            android.app.Application r2 = r8.f32602a
            boolean r9 = r9.a(r2)
            if (r9 == 0) goto L_0x0124
            long r4 = java.lang.System.currentTimeMillis()
            java.lang.String r9 = java.lang.String.valueOf(r4)
            si.a$a r2 = si.a.f31253a
            android.app.Application r4 = r8.f32602a
            retrofit2.Retrofit r2 = r2.a(r4)
            java.lang.Class<com.nic.mparivahan.dlservices.data.network.DlExtraService> r4 = com.nic.mparivahan.dlservices.data.network.DlExtraService.class
            java.lang.Object r2 = r2.create(r4)
            com.nic.mparivahan.dlservices.data.network.DlExtraService r2 = (com.nic.mparivahan.dlservices.data.network.DlExtraService) r2
            com.nic.mparivahan.dlservices.data.model.idp.IdpRequestGetNations r4 = r8.c()     // Catch:{ Exception -> 0x00fc }
            r0.f32610e = r8     // Catch:{ Exception -> 0x00fc }
            r0.f32611f = r9     // Catch:{ Exception -> 0x00fc }
            r0.f32614i = r3     // Catch:{ Exception -> 0x00fc }
            java.lang.Object r0 = r2.getIdpCovGrades(r4, r9, r0)     // Catch:{ Exception -> 0x00fc }
            if (r0 != r1) goto L_0x0072
            return r1
        L_0x0072:
            r1 = r9
            r9 = r0
            r0 = r8
        L_0x0075:
            com.nic.mparivahan.Security.SecModle.SecurityModle r9 = (com.nic.mparivahan.Security.SecModle.SecurityModle) r9     // Catch:{ Exception -> 0x0031 }
            java.lang.String r2 = "_update"
            java.lang.String r3 = r9.toString()     // Catch:{ Exception -> 0x0031 }
            android.util.Log.d(r2, r3)     // Catch:{ Exception -> 0x0031 }
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x00a9 }
            r3 = 26
            java.lang.String r4 = "decode(...)"
            if (r2 < r3) goto L_0x00ab
            id.c$a r2 = id.c.f12675a     // Catch:{ Exception -> 0x00a9 }
            j$.util.Base64$Decoder r3 = j$.util.Base64.getDecoder()     // Catch:{ Exception -> 0x00a9 }
            java.lang.String r9 = r9.getData()     // Catch:{ Exception -> 0x00a9 }
            byte[] r9 = r3.decode((java.lang.String) r9)     // Catch:{ Exception -> 0x00a9 }
            cm.l.e(r9, r4)     // Catch:{ Exception -> 0x00a9 }
            java.lang.String r3 = new java.lang.String     // Catch:{ Exception -> 0x00a9 }
            java.nio.charset.Charset r4 = km.d.f24740b     // Catch:{ Exception -> 0x00a9 }
            r3.<init>(r9, r4)     // Catch:{ Exception -> 0x00a9 }
            java.lang.String r9 = r2.a(r1, r3)     // Catch:{ Exception -> 0x00a9 }
        L_0x00a4:
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ Exception -> 0x00a9 }
            goto L_0x00c5
        L_0x00a9:
            r9 = move-exception
            goto L_0x00d8
        L_0x00ab:
            id.c$a r2 = id.c.f12675a     // Catch:{ Exception -> 0x00a9 }
            java.lang.String r9 = r9.getData()     // Catch:{ Exception -> 0x00a9 }
            r3 = 0
            byte[] r9 = android.util.Base64.decode(r9, r3)     // Catch:{ Exception -> 0x00a9 }
            cm.l.e(r9, r4)     // Catch:{ Exception -> 0x00a9 }
            java.lang.String r3 = new java.lang.String     // Catch:{ Exception -> 0x00a9 }
            java.nio.charset.Charset r4 = km.d.f24740b     // Catch:{ Exception -> 0x00a9 }
            r3.<init>(r9, r4)     // Catch:{ Exception -> 0x00a9 }
            java.lang.String r9 = r2.a(r1, r3)     // Catch:{ Exception -> 0x00a9 }
            goto L_0x00a4
        L_0x00c5:
            i7.d r1 = new i7.d     // Catch:{ Exception -> 0x00a9 }
            r1.<init>()     // Catch:{ Exception -> 0x00a9 }
            java.lang.Class<com.nic.mparivahan.dlservices.data.model.idp.GetIdpCovGradesResponse> r2 = com.nic.mparivahan.dlservices.data.model.idp.GetIdpCovGradesResponse.class
            java.lang.Object r9 = r1.j(r9, r2)     // Catch:{ Exception -> 0x00a9 }
            com.nic.mparivahan.dlservices.data.model.idp.GetIdpCovGradesResponse r9 = (com.nic.mparivahan.dlservices.data.model.idp.GetIdpCovGradesResponse) r9     // Catch:{ Exception -> 0x00a9 }
            androidx.lifecycle.a0 r1 = r0.f32607f     // Catch:{ Exception -> 0x00a9 }
            r1.k(r9)     // Catch:{ Exception -> 0x00a9 }
            goto L_0x0124
        L_0x00d8:
            r9.printStackTrace()     // Catch:{ Exception -> 0x0031 }
            java.lang.String r1 = "DecRes-"
            java.lang.String r9 = r9.getLocalizedMessage()     // Catch:{ Exception -> 0x0031 }
            android.util.Log.d(r1, r9)     // Catch:{ Exception -> 0x0031 }
            com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog$a r2 = com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog.f20957k     // Catch:{ Exception -> 0x0031 }
            android.app.Application r3 = r0.f32602a     // Catch:{ Exception -> 0x0031 }
            v9.d$a r9 = v9.d.f17494a     // Catch:{ Exception -> 0x0031 }
            java.lang.String r4 = r9.t()     // Catch:{ Exception -> 0x0031 }
            java.lang.String r5 = "getIdpCovGrades"
            java.lang.String r6 = r9.v()     // Catch:{ Exception -> 0x0031 }
            java.lang.String r7 = r9.w()     // Catch:{ Exception -> 0x0031 }
            r2.a(r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x0031 }
            goto L_0x0124
        L_0x00fc:
            r9 = move-exception
            r0 = r8
        L_0x00fe:
            java.lang.String r9 = r9.getMessage()
            if (r9 == 0) goto L_0x010d
            java.lang.String r1 = "dl_renewal_logginga"
            int r9 = android.util.Log.e(r1, r9)
            kotlin.coroutines.jvm.internal.b.b(r9)
        L_0x010d:
            com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog$a r1 = com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog.f20957k
            android.app.Application r2 = r0.f32602a
            v9.d$a r9 = v9.d.f17494a
            java.lang.String r3 = r9.t()
            java.lang.String r4 = "getIdpCovGrades"
            java.lang.String r5 = r9.v()
            java.lang.String r6 = r9.w()
            r1.a(r2, r3, r4, r5, r6)
        L_0x0124:
            pl.x r9 = pl.x.f30437a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: wi.c.a(tl.d):java.lang.Object");
    }

    public final a0 b() {
        return this.f32607f;
    }

    public final IdpRequestGetNations c() {
        return new IdpRequestGetNations();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Application application, String str, String str2, String str3, String str4, int i10, cm.g gVar) {
        this(application, (i10 & 2) != 0 ? "sakalaHR" : str, (i10 & 4) != 0 ? "975867c068a4e3e043058b5aaeebbeb5" : str2, (i10 & 8) != 0 ? "10.248.213.244" : str3, (i10 & 16) != 0 ? "SarathiMobileService" : str4);
    }
}
