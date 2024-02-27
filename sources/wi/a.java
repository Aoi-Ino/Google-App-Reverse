package wi;

import android.app.Application;
import android.util.Log;
import androidx.lifecycle.a0;
import bm.p;
import com.nic.mparivahan.dlservices.data.model.idp.IdpGenSubmit;
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

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final Application f32574a;

    /* renamed from: b  reason: collision with root package name */
    private final IdpGenSubmit f32575b;

    /* renamed from: c  reason: collision with root package name */
    private String f32576c;

    /* renamed from: d  reason: collision with root package name */
    private String f32577d;

    /* renamed from: e  reason: collision with root package name */
    private String f32578e;

    /* renamed from: f  reason: collision with root package name */
    private String f32579f;

    /* renamed from: g  reason: collision with root package name */
    private final a0 f32580g;

    /* renamed from: wi.a$a  reason: collision with other inner class name */
    static final class C0373a extends l implements p {

        /* renamed from: f  reason: collision with root package name */
        int f32581f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ a f32582g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0373a(a aVar, d dVar) {
            super(2, dVar);
            this.f32582g = aVar;
        }

        /* renamed from: b */
        public final Object h(d0 d0Var, d dVar) {
            return ((C0373a) create(d0Var, dVar)).invokeSuspend(x.f30437a);
        }

        public final d create(Object obj, d dVar) {
            return new C0373a(this.f32582g, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object c10 = d.c();
            int i10 = this.f32581f;
            if (i10 == 0) {
                q.b(obj);
                a aVar = this.f32582g;
                this.f32581f = 1;
                if (aVar.a(this) == c10) {
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
        Object f32583e;

        /* renamed from: f  reason: collision with root package name */
        Object f32584f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f32585g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ a f32586h;

        /* renamed from: i  reason: collision with root package name */
        int f32587i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar, d dVar) {
            super(dVar);
            this.f32586h = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f32585g = obj;
            this.f32587i |= Integer.MIN_VALUE;
            return this.f32586h.a(this);
        }
    }

    public a(Application application, IdpGenSubmit idpGenSubmit, String str, String str2, String str3, String str4) {
        cm.l.f(application, "app");
        cm.l.f(idpGenSubmit, "reqObj");
        cm.l.f(str, "agentId");
        cm.l.f(str2, "agentPwd");
        cm.l.f(str3, "agentIpAddress");
        cm.l.f(str4, "agentServiceName");
        this.f32574a = application;
        this.f32575b = idpGenSubmit;
        this.f32576c = str;
        this.f32577d = str2;
        this.f32578e = str3;
        this.f32579f = str4;
        this.f32580g = new a0();
        k1 unused = g.d(e0.a(q0.b()), (g) null, (f0) null, new C0373a(this, (d) null), 3, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x009a A[SYNTHETIC, Splitter:B:29:0x009a] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00bd A[Catch:{ Exception -> 0x00bb }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(tl.d r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof wi.a.b
            if (r0 == 0) goto L_0x0013
            r0 = r8
            wi.a$b r0 = (wi.a.b) r0
            int r1 = r0.f32587i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f32587i = r1
            goto L_0x0018
        L_0x0013:
            wi.a$b r0 = new wi.a$b
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f32585g
            java.lang.Object r1 = ul.d.c()
            int r2 = r0.f32587i
            r3 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 != r3) goto L_0x0034
            java.lang.Object r1 = r0.f32584f
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.f32583e
            wi.a r0 = (wi.a) r0
            pl.q.b(r8)     // Catch:{ Exception -> 0x0031 }
            goto L_0x0087
        L_0x0031:
            r8 = move-exception
            goto L_0x010c
        L_0x0034:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x003c:
            pl.q.b(r8)
            si.b$a r8 = si.b.f31257a
            android.app.Application r2 = r7.f32574a
            boolean r8 = r8.a(r2)
            if (r8 == 0) goto L_0x0132
            long r4 = java.lang.System.currentTimeMillis()
            java.lang.String r8 = java.lang.String.valueOf(r4)
            si.a$a r2 = si.a.f31253a
            android.app.Application r4 = r7.f32574a
            retrofit2.Retrofit r2 = r2.a(r4)
            java.lang.Class<com.nic.mparivahan.dlservices.data.network.DlExtraService> r4 = com.nic.mparivahan.dlservices.data.network.DlExtraService.class
            java.lang.Object r2 = r2.create(r4)
            com.nic.mparivahan.dlservices.data.network.DlExtraService r2 = (com.nic.mparivahan.dlservices.data.network.DlExtraService) r2
            um.c0$a r4 = um.c0.Companion     // Catch:{ Exception -> 0x010a }
            um.x$a r5 = um.x.f32156g     // Catch:{ Exception -> 0x010a }
            java.lang.String r6 = "application/json"
            um.x r5 = r5.b(r6)     // Catch:{ Exception -> 0x010a }
            java.lang.String r6 = r7.c()     // Catch:{ Exception -> 0x010a }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x010a }
            um.c0 r4 = r4.f(r5, r6)     // Catch:{ Exception -> 0x010a }
            r0.f32583e = r7     // Catch:{ Exception -> 0x010a }
            r0.f32584f = r8     // Catch:{ Exception -> 0x010a }
            r0.f32587i = r3     // Catch:{ Exception -> 0x010a }
            java.lang.Object r0 = r2.getAckDetForGivenDLNumberIdp(r4, r8, r0)     // Catch:{ Exception -> 0x010a }
            if (r0 != r1) goto L_0x0084
            return r1
        L_0x0084:
            r1 = r8
            r8 = r0
            r0 = r7
        L_0x0087:
            com.nic.mparivahan.Security.SecModle.SecurityModle r8 = (com.nic.mparivahan.Security.SecModle.SecurityModle) r8     // Catch:{ Exception -> 0x0031 }
            java.lang.String r2 = "_update"
            java.lang.String r3 = r8.toString()     // Catch:{ Exception -> 0x0031 }
            android.util.Log.d(r2, r3)     // Catch:{ Exception -> 0x0031 }
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x00bb }
            r3 = 26
            java.lang.String r4 = "decode(...)"
            if (r2 < r3) goto L_0x00bd
            id.c$a r2 = id.c.f12675a     // Catch:{ Exception -> 0x00bb }
            j$.util.Base64$Decoder r3 = j$.util.Base64.getDecoder()     // Catch:{ Exception -> 0x00bb }
            java.lang.String r8 = r8.getData()     // Catch:{ Exception -> 0x00bb }
            byte[] r8 = r3.decode((java.lang.String) r8)     // Catch:{ Exception -> 0x00bb }
            cm.l.e(r8, r4)     // Catch:{ Exception -> 0x00bb }
            java.lang.String r3 = new java.lang.String     // Catch:{ Exception -> 0x00bb }
            java.nio.charset.Charset r4 = km.d.f24740b     // Catch:{ Exception -> 0x00bb }
            r3.<init>(r8, r4)     // Catch:{ Exception -> 0x00bb }
            java.lang.String r8 = r2.a(r1, r3)     // Catch:{ Exception -> 0x00bb }
        L_0x00b6:
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ Exception -> 0x00bb }
            goto L_0x00d7
        L_0x00bb:
            r8 = move-exception
            goto L_0x00ef
        L_0x00bd:
            id.c$a r2 = id.c.f12675a     // Catch:{ Exception -> 0x00bb }
            java.lang.String r8 = r8.getData()     // Catch:{ Exception -> 0x00bb }
            r3 = 0
            byte[] r8 = android.util.Base64.decode(r8, r3)     // Catch:{ Exception -> 0x00bb }
            cm.l.e(r8, r4)     // Catch:{ Exception -> 0x00bb }
            java.lang.String r3 = new java.lang.String     // Catch:{ Exception -> 0x00bb }
            java.nio.charset.Charset r4 = km.d.f24740b     // Catch:{ Exception -> 0x00bb }
            r3.<init>(r8, r4)     // Catch:{ Exception -> 0x00bb }
            java.lang.String r8 = r2.a(r1, r3)     // Catch:{ Exception -> 0x00bb }
            goto L_0x00b6
        L_0x00d7:
            java.lang.String r1 = "DecRes-"
            android.util.Log.d(r1, r8)     // Catch:{ Exception -> 0x00bb }
            i7.d r1 = new i7.d     // Catch:{ Exception -> 0x00bb }
            r1.<init>()     // Catch:{ Exception -> 0x00bb }
            java.lang.Class<com.nic.mparivahan.dlservices.data.model.duplicatedl.GetAckDetForGivenDLNumberResponse> r2 = com.nic.mparivahan.dlservices.data.model.duplicatedl.GetAckDetForGivenDLNumberResponse.class
            java.lang.Object r8 = r1.j(r8, r2)     // Catch:{ Exception -> 0x00bb }
            com.nic.mparivahan.dlservices.data.model.duplicatedl.GetAckDetForGivenDLNumberResponse r8 = (com.nic.mparivahan.dlservices.data.model.duplicatedl.GetAckDetForGivenDLNumberResponse) r8     // Catch:{ Exception -> 0x00bb }
            androidx.lifecycle.a0 r1 = r0.f32580g     // Catch:{ Exception -> 0x00bb }
            r1.k(r8)     // Catch:{ Exception -> 0x00bb }
            goto L_0x0132
        L_0x00ef:
            r8.printStackTrace()     // Catch:{ Exception -> 0x0031 }
            com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog$a r1 = com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog.f20957k     // Catch:{ Exception -> 0x0031 }
            android.app.Application r2 = r0.f32574a     // Catch:{ Exception -> 0x0031 }
            v9.d$a r8 = v9.d.f17494a     // Catch:{ Exception -> 0x0031 }
            java.lang.String r3 = r8.t()     // Catch:{ Exception -> 0x0031 }
            java.lang.String r4 = "getAckDetForGivenDLNumber"
            java.lang.String r5 = r8.v()     // Catch:{ Exception -> 0x0031 }
            java.lang.String r6 = r8.w()     // Catch:{ Exception -> 0x0031 }
            r1.a(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x0031 }
            goto L_0x0132
        L_0x010a:
            r8 = move-exception
            r0 = r7
        L_0x010c:
            java.lang.String r8 = r8.getMessage()
            if (r8 == 0) goto L_0x011b
            java.lang.String r1 = "dl_renewal_logginga"
            int r8 = android.util.Log.e(r1, r8)
            kotlin.coroutines.jvm.internal.b.b(r8)
        L_0x011b:
            com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog$a r1 = com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog.f20957k
            android.app.Application r2 = r0.f32574a
            v9.d$a r8 = v9.d.f17494a
            java.lang.String r3 = r8.t()
            java.lang.String r4 = "getAckDetForGivenDLNumber"
            java.lang.String r5 = r8.v()
            java.lang.String r6 = r8.w()
            r1.a(r2, r3, r4, r5, r6)
        L_0x0132:
            pl.x r8 = pl.x.f30437a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: wi.a.a(tl.d):java.lang.Object");
    }

    public final a0 b() {
        return this.f32580g;
    }

    public final String c() {
        String t10 = new i7.d().t(this.f32575b);
        Log.e("dl_renewal_loggingpar", this.f32575b.toString());
        cm.l.c(t10);
        return t10;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Application application, IdpGenSubmit idpGenSubmit, String str, String str2, String str3, String str4, int i10, cm.g gVar) {
        this(application, idpGenSubmit, (i10 & 4) != 0 ? "sakalaHR" : str, (i10 & 8) != 0 ? "975867c068a4e3e043058b5aaeebbeb5" : str2, (i10 & 16) != 0 ? "10.248.213.244" : str3, (i10 & 32) != 0 ? "SarathiMobileService" : str4);
    }
}
