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
import tl.g;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final Application f32615a;

    /* renamed from: b  reason: collision with root package name */
    private String f32616b;

    /* renamed from: c  reason: collision with root package name */
    private String f32617c;

    /* renamed from: d  reason: collision with root package name */
    private String f32618d;

    /* renamed from: e  reason: collision with root package name */
    private String f32619e;

    /* renamed from: f  reason: collision with root package name */
    private final a0 f32620f;

    static final class a extends l implements p {

        /* renamed from: f  reason: collision with root package name */
        int f32621f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ d f32622g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(d dVar, tl.d dVar2) {
            super(2, dVar2);
            this.f32622g = dVar;
        }

        /* renamed from: b */
        public final Object h(d0 d0Var, tl.d dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(x.f30437a);
        }

        public final tl.d create(Object obj, tl.d dVar) {
            return new a(this.f32622g, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object c10 = d.c();
            int i10 = this.f32621f;
            if (i10 == 0) {
                q.b(obj);
                d dVar = this.f32622g;
                this.f32621f = 1;
                if (dVar.a(this) == c10) {
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
        Object f32623e;

        /* renamed from: f  reason: collision with root package name */
        Object f32624f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f32625g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ d f32626h;

        /* renamed from: i  reason: collision with root package name */
        int f32627i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(d dVar, tl.d dVar2) {
            super(dVar2);
            this.f32626h = dVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f32625g = obj;
            this.f32627i |= Integer.MIN_VALUE;
            return this.f32626h.a(this);
        }
    }

    public d(Application application, String str, String str2, String str3, String str4) {
        cm.l.f(application, "app");
        cm.l.f(str, "agentId");
        cm.l.f(str2, "agentPwd");
        cm.l.f(str3, "agentIpAddress");
        cm.l.f(str4, "agentServiceName");
        this.f32615a = application;
        this.f32616b = str;
        this.f32617c = str2;
        this.f32618d = str3;
        this.f32619e = str4;
        this.f32620f = new a0();
        k1 unused = g.d(e0.a(q0.b()), (g) null, (f0) null, new a(this, (tl.d) null), 3, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0088 A[SYNTHETIC, Splitter:B:29:0x0088] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ab A[Catch:{ Exception -> 0x00a9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(tl.d r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof wi.d.b
            if (r0 == 0) goto L_0x0013
            r0 = r8
            wi.d$b r0 = (wi.d.b) r0
            int r1 = r0.f32627i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f32627i = r1
            goto L_0x0018
        L_0x0013:
            wi.d$b r0 = new wi.d$b
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f32625g
            java.lang.Object r1 = ul.d.c()
            int r2 = r0.f32627i
            r3 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 != r3) goto L_0x0034
            java.lang.Object r1 = r0.f32624f
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.f32623e
            wi.d r0 = (wi.d) r0
            pl.q.b(r8)     // Catch:{ Exception -> 0x0031 }
            goto L_0x0075
        L_0x0031:
            r8 = move-exception
            goto L_0x00fa
        L_0x0034:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x003c:
            pl.q.b(r8)
            si.b$a r8 = si.b.f31257a
            android.app.Application r2 = r7.f32615a
            boolean r8 = r8.a(r2)
            if (r8 == 0) goto L_0x0120
            long r4 = java.lang.System.currentTimeMillis()
            java.lang.String r8 = java.lang.String.valueOf(r4)
            si.a$a r2 = si.a.f31253a
            android.app.Application r4 = r7.f32615a
            retrofit2.Retrofit r2 = r2.a(r4)
            java.lang.Class<com.nic.mparivahan.dlservices.data.network.DlExtraService> r4 = com.nic.mparivahan.dlservices.data.network.DlExtraService.class
            java.lang.Object r2 = r2.create(r4)
            com.nic.mparivahan.dlservices.data.network.DlExtraService r2 = (com.nic.mparivahan.dlservices.data.network.DlExtraService) r2
            com.nic.mparivahan.dlservices.data.model.idp.IdpRequestGetNations r4 = r7.c()     // Catch:{ Exception -> 0x00f8 }
            r0.f32623e = r7     // Catch:{ Exception -> 0x00f8 }
            r0.f32624f = r8     // Catch:{ Exception -> 0x00f8 }
            r0.f32627i = r3     // Catch:{ Exception -> 0x00f8 }
            java.lang.Object r0 = r2.getNationsToApplyFor(r4, r8, r0)     // Catch:{ Exception -> 0x00f8 }
            if (r0 != r1) goto L_0x0072
            return r1
        L_0x0072:
            r1 = r8
            r8 = r0
            r0 = r7
        L_0x0075:
            com.nic.mparivahan.Security.SecModle.SecurityModle r8 = (com.nic.mparivahan.Security.SecModle.SecurityModle) r8     // Catch:{ Exception -> 0x0031 }
            java.lang.String r2 = "_update"
            java.lang.String r3 = r8.toString()     // Catch:{ Exception -> 0x0031 }
            android.util.Log.d(r2, r3)     // Catch:{ Exception -> 0x0031 }
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x00a9 }
            r3 = 26
            java.lang.String r4 = "decode(...)"
            if (r2 < r3) goto L_0x00ab
            id.c$a r2 = id.c.f12675a     // Catch:{ Exception -> 0x00a9 }
            j$.util.Base64$Decoder r3 = j$.util.Base64.getDecoder()     // Catch:{ Exception -> 0x00a9 }
            java.lang.String r8 = r8.getData()     // Catch:{ Exception -> 0x00a9 }
            byte[] r8 = r3.decode((java.lang.String) r8)     // Catch:{ Exception -> 0x00a9 }
            cm.l.e(r8, r4)     // Catch:{ Exception -> 0x00a9 }
            java.lang.String r3 = new java.lang.String     // Catch:{ Exception -> 0x00a9 }
            java.nio.charset.Charset r4 = km.d.f24740b     // Catch:{ Exception -> 0x00a9 }
            r3.<init>(r8, r4)     // Catch:{ Exception -> 0x00a9 }
            java.lang.String r8 = r2.a(r1, r3)     // Catch:{ Exception -> 0x00a9 }
        L_0x00a4:
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ Exception -> 0x00a9 }
            goto L_0x00c5
        L_0x00a9:
            r8 = move-exception
            goto L_0x00dd
        L_0x00ab:
            id.c$a r2 = id.c.f12675a     // Catch:{ Exception -> 0x00a9 }
            java.lang.String r8 = r8.getData()     // Catch:{ Exception -> 0x00a9 }
            r3 = 0
            byte[] r8 = android.util.Base64.decode(r8, r3)     // Catch:{ Exception -> 0x00a9 }
            cm.l.e(r8, r4)     // Catch:{ Exception -> 0x00a9 }
            java.lang.String r3 = new java.lang.String     // Catch:{ Exception -> 0x00a9 }
            java.nio.charset.Charset r4 = km.d.f24740b     // Catch:{ Exception -> 0x00a9 }
            r3.<init>(r8, r4)     // Catch:{ Exception -> 0x00a9 }
            java.lang.String r8 = r2.a(r1, r3)     // Catch:{ Exception -> 0x00a9 }
            goto L_0x00a4
        L_0x00c5:
            java.lang.String r1 = "DecRes-"
            android.util.Log.d(r1, r8)     // Catch:{ Exception -> 0x00a9 }
            i7.d r1 = new i7.d     // Catch:{ Exception -> 0x00a9 }
            r1.<init>()     // Catch:{ Exception -> 0x00a9 }
            java.lang.Class<com.nic.mparivahan.dlservices.data.model.idp.GetNationsToApplyForResponse> r2 = com.nic.mparivahan.dlservices.data.model.idp.GetNationsToApplyForResponse.class
            java.lang.Object r8 = r1.j(r8, r2)     // Catch:{ Exception -> 0x00a9 }
            com.nic.mparivahan.dlservices.data.model.idp.GetNationsToApplyForResponse r8 = (com.nic.mparivahan.dlservices.data.model.idp.GetNationsToApplyForResponse) r8     // Catch:{ Exception -> 0x00a9 }
            androidx.lifecycle.a0 r1 = r0.f32620f     // Catch:{ Exception -> 0x00a9 }
            r1.k(r8)     // Catch:{ Exception -> 0x00a9 }
            goto L_0x0120
        L_0x00dd:
            r8.printStackTrace()     // Catch:{ Exception -> 0x0031 }
            com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog$a r1 = com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog.f20957k     // Catch:{ Exception -> 0x0031 }
            android.app.Application r2 = r0.f32615a     // Catch:{ Exception -> 0x0031 }
            v9.d$a r8 = v9.d.f17494a     // Catch:{ Exception -> 0x0031 }
            java.lang.String r3 = r8.t()     // Catch:{ Exception -> 0x0031 }
            java.lang.String r4 = "getNationsToApplyFor"
            java.lang.String r5 = r8.v()     // Catch:{ Exception -> 0x0031 }
            java.lang.String r6 = r8.w()     // Catch:{ Exception -> 0x0031 }
            r1.a(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x0031 }
            goto L_0x0120
        L_0x00f8:
            r8 = move-exception
            r0 = r7
        L_0x00fa:
            java.lang.String r8 = r8.getMessage()
            if (r8 == 0) goto L_0x0109
            java.lang.String r1 = "dl_renewal_logginga"
            int r8 = android.util.Log.e(r1, r8)
            kotlin.coroutines.jvm.internal.b.b(r8)
        L_0x0109:
            com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog$a r1 = com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog.f20957k
            android.app.Application r2 = r0.f32615a
            v9.d$a r8 = v9.d.f17494a
            java.lang.String r3 = r8.t()
            java.lang.String r4 = "getNationsToApplyFor"
            java.lang.String r5 = r8.v()
            java.lang.String r6 = r8.w()
            r1.a(r2, r3, r4, r5, r6)
        L_0x0120:
            pl.x r8 = pl.x.f30437a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: wi.d.a(tl.d):java.lang.Object");
    }

    public final a0 b() {
        return this.f32620f;
    }

    public final IdpRequestGetNations c() {
        return new IdpRequestGetNations();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Application application, String str, String str2, String str3, String str4, int i10, cm.g gVar) {
        this(application, (i10 & 2) != 0 ? "sakalaHR" : str, (i10 & 4) != 0 ? "975867c068a4e3e043058b5aaeebbeb5" : str2, (i10 & 8) != 0 ? "10.248.213.244" : str3, (i10 & 16) != 0 ? "SarathiMobileService" : str4);
    }
}
