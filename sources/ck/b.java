package ck;

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

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final Application f20189a;

    /* renamed from: b  reason: collision with root package name */
    private final a f20190b;

    /* renamed from: c  reason: collision with root package name */
    private String f20191c;

    /* renamed from: d  reason: collision with root package name */
    private String f20192d;

    /* renamed from: e  reason: collision with root package name */
    private String f20193e;

    /* renamed from: f  reason: collision with root package name */
    private String f20194f;

    /* renamed from: g  reason: collision with root package name */
    private final a0 f20195g;

    static final class a extends l implements p {

        /* renamed from: f  reason: collision with root package name */
        int f20196f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ b f20197g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar, d dVar) {
            super(2, dVar);
            this.f20197g = bVar;
        }

        /* renamed from: b */
        public final Object h(d0 d0Var, d dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(x.f30437a);
        }

        public final d create(Object obj, d dVar) {
            return new a(this.f20197g, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object c10 = d.c();
            int i10 = this.f20196f;
            if (i10 == 0) {
                q.b(obj);
                b bVar = this.f20197g;
                this.f20196f = 1;
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

    /* renamed from: ck.b$b  reason: collision with other inner class name */
    static final class C0267b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: e  reason: collision with root package name */
        Object f20198e;

        /* renamed from: f  reason: collision with root package name */
        Object f20199f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f20200g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ b f20201h;

        /* renamed from: i  reason: collision with root package name */
        int f20202i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0267b(b bVar, d dVar) {
            super(dVar);
            this.f20201h = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f20200g = obj;
            this.f20202i |= Integer.MIN_VALUE;
            return this.f20201h.a(this);
        }
    }

    public b(Application application, a aVar, String str, String str2, String str3, String str4) {
        cm.l.f(application, "app");
        cm.l.f(aVar, "reqObj");
        cm.l.f(str, "agentId");
        cm.l.f(str2, "agentPwd");
        cm.l.f(str3, "agentIpAddress");
        cm.l.f(str4, "agentServiceName");
        this.f20189a = application;
        this.f20190b = aVar;
        this.f20191c = str;
        this.f20192d = str2;
        this.f20193e = str3;
        this.f20194f = str4;
        this.f20195g = new a0();
        k1 unused = g.d(e0.a(q0.c()), (g) null, (f0) null, new a(this, (d) null), 3, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0099 A[SYNTHETIC, Splitter:B:28:0x0099] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00bc A[Catch:{ Exception -> 0x00ba }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(tl.d r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof ck.b.C0267b
            if (r0 == 0) goto L_0x0013
            r0 = r9
            ck.b$b r0 = (ck.b.C0267b) r0
            int r1 = r0.f20202i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f20202i = r1
            goto L_0x0018
        L_0x0013:
            ck.b$b r0 = new ck.b$b
            r0.<init>(r8, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f20200g
            java.lang.Object r1 = ul.d.c()
            int r2 = r0.f20202i
            java.lang.Class<com.nic.mparivahan.dlservices.data.model.duplicatedl.GetAckDetForGivenDLNumberResponse> r3 = com.nic.mparivahan.dlservices.data.model.duplicatedl.GetAckDetForGivenDLNumberResponse.class
            r4 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r4) goto L_0x0033
            java.lang.Object r1 = r0.f20199f
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.f20198e
            ck.b r0 = (ck.b) r0
            pl.q.b(r9)     // Catch:{ Exception -> 0x00fa }
            goto L_0x0086
        L_0x0033:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x003b:
            pl.q.b(r9)
            si.b$a r9 = si.b.f31257a
            android.app.Application r2 = r8.f20189a
            boolean r9 = r9.a(r2)
            if (r9 == 0) goto L_0x010c
            long r5 = java.lang.System.currentTimeMillis()
            java.lang.String r9 = java.lang.String.valueOf(r5)
            si.a$a r2 = si.a.f31253a
            android.app.Application r5 = r8.f20189a
            retrofit2.Retrofit r2 = r2.a(r5)
            java.lang.Class<com.nic.mparivahan.dlservices.data.network.DlExtraService> r5 = com.nic.mparivahan.dlservices.data.network.DlExtraService.class
            java.lang.Object r2 = r2.create(r5)
            com.nic.mparivahan.dlservices.data.network.DlExtraService r2 = (com.nic.mparivahan.dlservices.data.network.DlExtraService) r2
            um.c0$a r5 = um.c0.Companion     // Catch:{ Exception -> 0x00f9 }
            um.x$a r6 = um.x.f32156g     // Catch:{ Exception -> 0x00f9 }
            java.lang.String r7 = "application/json"
            um.x r6 = r6.b(r7)     // Catch:{ Exception -> 0x00f9 }
            java.lang.String r7 = r8.c()     // Catch:{ Exception -> 0x00f9 }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x00f9 }
            um.c0 r5 = r5.f(r6, r7)     // Catch:{ Exception -> 0x00f9 }
            r0.f20198e = r8     // Catch:{ Exception -> 0x00f9 }
            r0.f20199f = r9     // Catch:{ Exception -> 0x00f9 }
            r0.f20202i = r4     // Catch:{ Exception -> 0x00f9 }
            java.lang.Object r0 = r2.getAckDetForGivenDLNumberRenewal(r5, r9, r0)     // Catch:{ Exception -> 0x00f9 }
            if (r0 != r1) goto L_0x0083
            return r1
        L_0x0083:
            r1 = r9
            r9 = r0
            r0 = r8
        L_0x0086:
            com.nic.mparivahan.Security.SecModle.SecurityModle r9 = (com.nic.mparivahan.Security.SecModle.SecurityModle) r9     // Catch:{ Exception -> 0x00fa }
            java.lang.String r2 = "_update"
            java.lang.String r4 = r9.toString()     // Catch:{ Exception -> 0x00fa }
            android.util.Log.d(r2, r4)     // Catch:{ Exception -> 0x00fa }
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x00ba }
            r4 = 26
            java.lang.String r5 = "decode(...)"
            if (r2 < r4) goto L_0x00bc
            id.c$a r2 = id.c.f12675a     // Catch:{ Exception -> 0x00ba }
            j$.util.Base64$Decoder r4 = j$.util.Base64.getDecoder()     // Catch:{ Exception -> 0x00ba }
            java.lang.String r9 = r9.getData()     // Catch:{ Exception -> 0x00ba }
            byte[] r9 = r4.decode((java.lang.String) r9)     // Catch:{ Exception -> 0x00ba }
            cm.l.e(r9, r5)     // Catch:{ Exception -> 0x00ba }
            java.lang.String r4 = new java.lang.String     // Catch:{ Exception -> 0x00ba }
            java.nio.charset.Charset r5 = km.d.f24740b     // Catch:{ Exception -> 0x00ba }
            r4.<init>(r9, r5)     // Catch:{ Exception -> 0x00ba }
            java.lang.String r9 = r2.a(r1, r4)     // Catch:{ Exception -> 0x00ba }
        L_0x00b5:
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ Exception -> 0x00ba }
            goto L_0x00d6
        L_0x00ba:
            r9 = move-exception
            goto L_0x00ec
        L_0x00bc:
            id.c$a r2 = id.c.f12675a     // Catch:{ Exception -> 0x00ba }
            java.lang.String r9 = r9.getData()     // Catch:{ Exception -> 0x00ba }
            r4 = 0
            byte[] r9 = android.util.Base64.decode(r9, r4)     // Catch:{ Exception -> 0x00ba }
            cm.l.e(r9, r5)     // Catch:{ Exception -> 0x00ba }
            java.lang.String r4 = new java.lang.String     // Catch:{ Exception -> 0x00ba }
            java.nio.charset.Charset r5 = km.d.f24740b     // Catch:{ Exception -> 0x00ba }
            r4.<init>(r9, r5)     // Catch:{ Exception -> 0x00ba }
            java.lang.String r9 = r2.a(r1, r4)     // Catch:{ Exception -> 0x00ba }
            goto L_0x00b5
        L_0x00d6:
            java.lang.String r1 = "renewal_response"
            android.util.Log.d(r1, r9)     // Catch:{ Exception -> 0x00ba }
            i7.d r1 = new i7.d     // Catch:{ Exception -> 0x00ba }
            r1.<init>()     // Catch:{ Exception -> 0x00ba }
            java.lang.Object r9 = r1.j(r9, r3)     // Catch:{ Exception -> 0x00ba }
            com.nic.mparivahan.dlservices.data.model.duplicatedl.GetAckDetForGivenDLNumberResponse r9 = (com.nic.mparivahan.dlservices.data.model.duplicatedl.GetAckDetForGivenDLNumberResponse) r9     // Catch:{ Exception -> 0x00ba }
            androidx.lifecycle.a0 r1 = r0.f20195g     // Catch:{ Exception -> 0x00ba }
            r1.k(r9)     // Catch:{ Exception -> 0x00ba }
            goto L_0x010c
        L_0x00ec:
            r9.printStackTrace()     // Catch:{ Exception -> 0x00fa }
            java.lang.String r1 = "renewal_response_err"
            java.lang.String r9 = r9.getLocalizedMessage()     // Catch:{ Exception -> 0x00fa }
            android.util.Log.d(r1, r9)     // Catch:{ Exception -> 0x00fa }
            goto L_0x010c
        L_0x00f9:
            r0 = r8
        L_0x00fa:
            i7.d r9 = new i7.d
            r9.<init>()
            java.lang.String r1 = "{\n  \"result\": {\n    \"status_code\": \"05\",\n    \"status_desc\": \"success\",\n    \"ReqStatus\": \"\",\n    \"Result\": [\n    ]\n  }\n}"
            java.lang.Object r9 = r9.j(r1, r3)
            com.nic.mparivahan.dlservices.data.model.duplicatedl.GetAckDetForGivenDLNumberResponse r9 = (com.nic.mparivahan.dlservices.data.model.duplicatedl.GetAckDetForGivenDLNumberResponse) r9
            androidx.lifecycle.a0 r0 = r0.f20195g
            r0.k(r9)
        L_0x010c:
            pl.x r9 = pl.x.f30437a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ck.b.a(tl.d):java.lang.Object");
    }

    public final a0 b() {
        return this.f20195g;
    }

    public final String c() {
        String t10 = new i7.d().t(this.f20190b);
        Log.d("par_val", this.f20190b.toString());
        cm.l.c(t10);
        return t10;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Application application, a aVar, String str, String str2, String str3, String str4, int i10, cm.g gVar) {
        this(application, aVar, (i10 & 4) != 0 ? "sakalaHR" : str, (i10 & 8) != 0 ? "975867c068a4e3e043058b5aaeebbeb5" : str2, (i10 & 16) != 0 ? "10.248.213.244" : str3, (i10 & 32) != 0 ? "SarathiMobileService" : str4);
    }
}
