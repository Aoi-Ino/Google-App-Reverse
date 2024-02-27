package wi;

import android.app.Application;
import android.util.Log;
import androidx.lifecycle.a0;
import bm.p;
import com.nic.mparivahan.dlservices.data.model.idp.IdpSubmitRequest;
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
    private final Application f32588a;

    /* renamed from: b  reason: collision with root package name */
    private final IdpSubmitRequest f32589b;

    /* renamed from: c  reason: collision with root package name */
    private String f32590c;

    /* renamed from: d  reason: collision with root package name */
    private String f32591d;

    /* renamed from: e  reason: collision with root package name */
    private String f32592e;

    /* renamed from: f  reason: collision with root package name */
    private String f32593f;

    /* renamed from: g  reason: collision with root package name */
    private final a0 f32594g;

    static final class a extends l implements p {

        /* renamed from: f  reason: collision with root package name */
        int f32595f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ b f32596g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar, d dVar) {
            super(2, dVar);
            this.f32596g = bVar;
        }

        /* renamed from: b */
        public final Object h(d0 d0Var, d dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(x.f30437a);
        }

        public final d create(Object obj, d dVar) {
            return new a(this.f32596g, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object c10 = d.c();
            int i10 = this.f32595f;
            if (i10 == 0) {
                q.b(obj);
                b bVar = this.f32596g;
                this.f32595f = 1;
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

    /* renamed from: wi.b$b  reason: collision with other inner class name */
    static final class C0374b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: e  reason: collision with root package name */
        Object f32597e;

        /* renamed from: f  reason: collision with root package name */
        Object f32598f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f32599g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ b f32600h;

        /* renamed from: i  reason: collision with root package name */
        int f32601i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0374b(b bVar, d dVar) {
            super(dVar);
            this.f32600h = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f32599g = obj;
            this.f32601i |= Integer.MIN_VALUE;
            return this.f32600h.a(this);
        }
    }

    public b(Application application, IdpSubmitRequest idpSubmitRequest, String str, String str2, String str3, String str4) {
        cm.l.f(application, "app");
        cm.l.f(idpSubmitRequest, "reqObj");
        cm.l.f(str, "agentId");
        cm.l.f(str2, "agentPwd");
        cm.l.f(str3, "agentIpAddress");
        cm.l.f(str4, "agentServiceName");
        this.f32588a = application;
        this.f32589b = idpSubmitRequest;
        this.f32590c = str;
        this.f32591d = str2;
        this.f32592e = str3;
        this.f32593f = str4;
        this.f32594g = new a0();
        k1 unused = g.d(e0.a(q0.b()), (g) null, (f0) null, new a(this, (d) null), 3, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0097 A[SYNTHETIC, Splitter:B:28:0x0097] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ba A[Catch:{ Exception -> 0x00b8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(tl.d r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof wi.b.C0374b
            if (r0 == 0) goto L_0x0013
            r0 = r8
            wi.b$b r0 = (wi.b.C0374b) r0
            int r1 = r0.f32601i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f32601i = r1
            goto L_0x0018
        L_0x0013:
            wi.b$b r0 = new wi.b$b
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f32599g
            java.lang.Object r1 = ul.d.c()
            int r2 = r0.f32601i
            r3 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r1 = r0.f32598f
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.f32597e
            wi.b r0 = (wi.b) r0
            pl.q.b(r8)     // Catch:{ Exception -> 0x0108 }
            goto L_0x0084
        L_0x0031:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x0039:
            pl.q.b(r8)
            si.b$a r8 = si.b.f31257a
            android.app.Application r2 = r7.f32588a
            boolean r8 = r8.a(r2)
            if (r8 == 0) goto L_0x011f
            long r4 = java.lang.System.currentTimeMillis()
            java.lang.String r8 = java.lang.String.valueOf(r4)
            si.a$a r2 = si.a.f31253a
            android.app.Application r4 = r7.f32588a
            retrofit2.Retrofit r2 = r2.a(r4)
            java.lang.Class<com.nic.mparivahan.dlservices.data.network.DlExtraService> r4 = com.nic.mparivahan.dlservices.data.network.DlExtraService.class
            java.lang.Object r2 = r2.create(r4)
            com.nic.mparivahan.dlservices.data.network.DlExtraService r2 = (com.nic.mparivahan.dlservices.data.network.DlExtraService) r2
            um.c0$a r4 = um.c0.Companion     // Catch:{ Exception -> 0x0107 }
            um.x$a r5 = um.x.f32156g     // Catch:{ Exception -> 0x0107 }
            java.lang.String r6 = "application/json"
            um.x r5 = r5.b(r6)     // Catch:{ Exception -> 0x0107 }
            java.lang.String r6 = r7.c()     // Catch:{ Exception -> 0x0107 }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x0107 }
            um.c0 r4 = r4.f(r5, r6)     // Catch:{ Exception -> 0x0107 }
            r0.f32597e = r7     // Catch:{ Exception -> 0x0107 }
            r0.f32598f = r8     // Catch:{ Exception -> 0x0107 }
            r0.f32601i = r3     // Catch:{ Exception -> 0x0107 }
            java.lang.Object r0 = r2.getAckDetForGivenDLNumberIdp(r4, r8, r0)     // Catch:{ Exception -> 0x0107 }
            if (r0 != r1) goto L_0x0081
            return r1
        L_0x0081:
            r1 = r8
            r8 = r0
            r0 = r7
        L_0x0084:
            com.nic.mparivahan.Security.SecModle.SecurityModle r8 = (com.nic.mparivahan.Security.SecModle.SecurityModle) r8     // Catch:{ Exception -> 0x0108 }
            java.lang.String r2 = "_update"
            java.lang.String r3 = r8.toString()     // Catch:{ Exception -> 0x0108 }
            android.util.Log.d(r2, r3)     // Catch:{ Exception -> 0x0108 }
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x00b8 }
            r3 = 26
            java.lang.String r4 = "decode(...)"
            if (r2 < r3) goto L_0x00ba
            id.c$a r2 = id.c.f12675a     // Catch:{ Exception -> 0x00b8 }
            j$.util.Base64$Decoder r3 = j$.util.Base64.getDecoder()     // Catch:{ Exception -> 0x00b8 }
            java.lang.String r8 = r8.getData()     // Catch:{ Exception -> 0x00b8 }
            byte[] r8 = r3.decode((java.lang.String) r8)     // Catch:{ Exception -> 0x00b8 }
            cm.l.e(r8, r4)     // Catch:{ Exception -> 0x00b8 }
            java.lang.String r3 = new java.lang.String     // Catch:{ Exception -> 0x00b8 }
            java.nio.charset.Charset r4 = km.d.f24740b     // Catch:{ Exception -> 0x00b8 }
            r3.<init>(r8, r4)     // Catch:{ Exception -> 0x00b8 }
            java.lang.String r8 = r2.a(r1, r3)     // Catch:{ Exception -> 0x00b8 }
        L_0x00b3:
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ Exception -> 0x00b8 }
            goto L_0x00d4
        L_0x00b8:
            r8 = move-exception
            goto L_0x00ec
        L_0x00ba:
            id.c$a r2 = id.c.f12675a     // Catch:{ Exception -> 0x00b8 }
            java.lang.String r8 = r8.getData()     // Catch:{ Exception -> 0x00b8 }
            r3 = 0
            byte[] r8 = android.util.Base64.decode(r8, r3)     // Catch:{ Exception -> 0x00b8 }
            cm.l.e(r8, r4)     // Catch:{ Exception -> 0x00b8 }
            java.lang.String r3 = new java.lang.String     // Catch:{ Exception -> 0x00b8 }
            java.nio.charset.Charset r4 = km.d.f24740b     // Catch:{ Exception -> 0x00b8 }
            r3.<init>(r8, r4)     // Catch:{ Exception -> 0x00b8 }
            java.lang.String r8 = r2.a(r1, r3)     // Catch:{ Exception -> 0x00b8 }
            goto L_0x00b3
        L_0x00d4:
            java.lang.String r1 = "DecRes-"
            android.util.Log.d(r1, r8)     // Catch:{ Exception -> 0x00b8 }
            i7.d r1 = new i7.d     // Catch:{ Exception -> 0x00b8 }
            r1.<init>()     // Catch:{ Exception -> 0x00b8 }
            java.lang.Class<com.nic.mparivahan.dlservices.data.model.duplicatedl.GetAckDetForGivenDLNumberResponse> r2 = com.nic.mparivahan.dlservices.data.model.duplicatedl.GetAckDetForGivenDLNumberResponse.class
            java.lang.Object r8 = r1.j(r8, r2)     // Catch:{ Exception -> 0x00b8 }
            com.nic.mparivahan.dlservices.data.model.duplicatedl.GetAckDetForGivenDLNumberResponse r8 = (com.nic.mparivahan.dlservices.data.model.duplicatedl.GetAckDetForGivenDLNumberResponse) r8     // Catch:{ Exception -> 0x00b8 }
            androidx.lifecycle.a0 r1 = r0.f32594g     // Catch:{ Exception -> 0x00b8 }
            r1.k(r8)     // Catch:{ Exception -> 0x00b8 }
            goto L_0x011f
        L_0x00ec:
            r8.printStackTrace()     // Catch:{ Exception -> 0x0108 }
            com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog$a r1 = com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog.f20957k     // Catch:{ Exception -> 0x0108 }
            android.app.Application r2 = r0.f32588a     // Catch:{ Exception -> 0x0108 }
            v9.d$a r8 = v9.d.f17494a     // Catch:{ Exception -> 0x0108 }
            java.lang.String r3 = r8.t()     // Catch:{ Exception -> 0x0108 }
            java.lang.String r4 = "getAckDetForGivenDLNumber"
            java.lang.String r5 = r8.v()     // Catch:{ Exception -> 0x0108 }
            java.lang.String r6 = r8.w()     // Catch:{ Exception -> 0x0108 }
            r1.a(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x0108 }
            goto L_0x011f
        L_0x0107:
            r0 = r7
        L_0x0108:
            com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog$a r1 = com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog.f20957k
            android.app.Application r2 = r0.f32588a
            v9.d$a r8 = v9.d.f17494a
            java.lang.String r3 = r8.t()
            java.lang.String r4 = "getAckDetForGivenDLNumber"
            java.lang.String r5 = r8.v()
            java.lang.String r6 = r8.w()
            r1.a(r2, r3, r4, r5, r6)
        L_0x011f:
            pl.x r8 = pl.x.f30437a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: wi.b.a(tl.d):java.lang.Object");
    }

    public final a0 b() {
        return this.f32594g;
    }

    public final String c() {
        String t10 = new i7.d().t(this.f32589b);
        Log.e("dl_renewal_loggingpar", this.f32589b.toString());
        cm.l.c(t10);
        return t10;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Application application, IdpSubmitRequest idpSubmitRequest, String str, String str2, String str3, String str4, int i10, cm.g gVar) {
        this(application, idpSubmitRequest, (i10 & 4) != 0 ? "sakalaHR" : str, (i10 & 8) != 0 ? "975867c068a4e3e043058b5aaeebbeb5" : str2, (i10 & 16) != 0 ? "10.248.213.244" : str3, (i10 & 32) != 0 ? "SarathiMobileService" : str4);
    }
}
