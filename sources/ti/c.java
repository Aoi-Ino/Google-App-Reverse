package ti;

import android.app.Application;
import android.util.Log;
import androidx.lifecycle.a0;
import bm.p;
import com.nic.mparivahan.dlservices.ui.dms.GetCustomRequest;
import java.util.ArrayList;
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
    private Application f31473a;

    /* renamed from: b  reason: collision with root package name */
    private String f31474b;

    /* renamed from: c  reason: collision with root package name */
    private String f31475c;

    /* renamed from: d  reason: collision with root package name */
    private String f31476d;

    /* renamed from: e  reason: collision with root package name */
    private final a0 f31477e = new a0();

    static final class a extends l implements p {

        /* renamed from: f  reason: collision with root package name */
        int f31478f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ c f31479g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(c cVar, d dVar) {
            super(2, dVar);
            this.f31479g = cVar;
        }

        /* renamed from: b */
        public final Object h(d0 d0Var, d dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(x.f30437a);
        }

        public final d create(Object obj, d dVar) {
            return new a(this.f31479g, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object c10 = d.c();
            int i10 = this.f31478f;
            if (i10 == 0) {
                q.b(obj);
                c cVar = this.f31479g;
                this.f31478f = 1;
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
        Object f31480e;

        /* renamed from: f  reason: collision with root package name */
        Object f31481f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f31482g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ c f31483h;

        /* renamed from: i  reason: collision with root package name */
        int f31484i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(c cVar, d dVar) {
            super(dVar);
            this.f31483h = cVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f31482g = obj;
            this.f31484i |= Integer.MIN_VALUE;
            return this.f31483h.a(this);
        }
    }

    public c(Application application, String str, String str2, String str3) {
        cm.l.f(application, "mApp");
        cm.l.f(str, "applicationNumber");
        cm.l.f(str2, "stateCd");
        cm.l.f(str3, "serviceCode");
        this.f31473a = application;
        this.f31474b = str;
        this.f31475c = str2;
        this.f31476d = str3;
        k1 unused = g.d(e0.a(q0.b()), (g) null, (f0) null, new a(this, (d) null), 3, (Object) null);
    }

    private final GetCustomRequest b(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(this.f31476d));
        GetCustomRequest getCustomRequest = new GetCustomRequest(str, str2, arrayList);
        Log.d("custom_doc_req", getCustomRequest.toString());
        return getCustomRequest;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0080 A[SYNTHETIC, Splitter:B:28:0x0080] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a3 A[Catch:{ Exception -> 0x00a1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(tl.d r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof ti.c.b
            if (r0 == 0) goto L_0x0013
            r0 = r8
            ti.c$b r0 = (ti.c.b) r0
            int r1 = r0.f31484i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f31484i = r1
            goto L_0x0018
        L_0x0013:
            ti.c$b r0 = new ti.c$b
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f31482g
            java.lang.Object r1 = ul.d.c()
            int r2 = r0.f31484i
            r3 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r1 = r0.f31481f
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.f31480e
            ti.c r0 = (ti.c) r0
            pl.q.b(r8)     // Catch:{ Exception -> 0x00ec }
            goto L_0x0076
        L_0x0031:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x0039:
            pl.q.b(r8)
            si.b$a r8 = si.b.f31257a
            android.app.Application r2 = r7.f31473a
            boolean r8 = r8.a(r2)
            if (r8 == 0) goto L_0x0103
            long r4 = java.lang.System.currentTimeMillis()
            java.lang.String r8 = java.lang.String.valueOf(r4)
            si.a$a r2 = si.a.f31253a
            android.app.Application r4 = r7.f31473a
            retrofit2.Retrofit r2 = r2.a(r4)
            java.lang.Class<com.nic.mparivahan.dlservices.data.network.DlRenewalServicesStatus> r4 = com.nic.mparivahan.dlservices.data.network.DlRenewalServicesStatus.class
            java.lang.Object r2 = r2.create(r4)
            com.nic.mparivahan.dlservices.data.network.DlRenewalServicesStatus r2 = (com.nic.mparivahan.dlservices.data.network.DlRenewalServicesStatus) r2
            java.lang.String r4 = r7.f31474b     // Catch:{ Exception -> 0x00eb }
            java.lang.String r5 = r7.f31475c     // Catch:{ Exception -> 0x00eb }
            com.nic.mparivahan.dlservices.ui.dms.GetCustomRequest r4 = r7.b(r4, r5)     // Catch:{ Exception -> 0x00eb }
            r0.f31480e = r7     // Catch:{ Exception -> 0x00eb }
            r0.f31481f = r8     // Catch:{ Exception -> 0x00eb }
            r0.f31484i = r3     // Catch:{ Exception -> 0x00eb }
            java.lang.Object r0 = r2.getDlCustomUploadDoc(r4, r8, r0)     // Catch:{ Exception -> 0x00eb }
            if (r0 != r1) goto L_0x0073
            return r1
        L_0x0073:
            r1 = r8
            r8 = r0
            r0 = r7
        L_0x0076:
            com.nic.mparivahan.Security.SecModle.SecurityModle r8 = (com.nic.mparivahan.Security.SecModle.SecurityModle) r8     // Catch:{ Exception -> 0x00ec }
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x00a1 }
            r3 = 26
            java.lang.String r4 = "decode(...)"
            if (r2 < r3) goto L_0x00a3
            id.c$a r2 = id.c.f12675a     // Catch:{ Exception -> 0x00a1 }
            j$.util.Base64$Decoder r3 = j$.util.Base64.getDecoder()     // Catch:{ Exception -> 0x00a1 }
            java.lang.String r8 = r8.getData()     // Catch:{ Exception -> 0x00a1 }
            byte[] r8 = r3.decode((java.lang.String) r8)     // Catch:{ Exception -> 0x00a1 }
            cm.l.e(r8, r4)     // Catch:{ Exception -> 0x00a1 }
            java.lang.String r3 = new java.lang.String     // Catch:{ Exception -> 0x00a1 }
            java.nio.charset.Charset r4 = km.d.f24740b     // Catch:{ Exception -> 0x00a1 }
            r3.<init>(r8, r4)     // Catch:{ Exception -> 0x00a1 }
            java.lang.String r8 = r2.a(r1, r3)     // Catch:{ Exception -> 0x00a1 }
        L_0x009c:
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ Exception -> 0x00a1 }
            goto L_0x00bd
        L_0x00a1:
            r8 = move-exception
            goto L_0x00d0
        L_0x00a3:
            id.c$a r2 = id.c.f12675a     // Catch:{ Exception -> 0x00a1 }
            java.lang.String r8 = r8.getData()     // Catch:{ Exception -> 0x00a1 }
            r3 = 0
            byte[] r8 = android.util.Base64.decode(r8, r3)     // Catch:{ Exception -> 0x00a1 }
            cm.l.e(r8, r4)     // Catch:{ Exception -> 0x00a1 }
            java.lang.String r3 = new java.lang.String     // Catch:{ Exception -> 0x00a1 }
            java.nio.charset.Charset r4 = km.d.f24740b     // Catch:{ Exception -> 0x00a1 }
            r3.<init>(r8, r4)     // Catch:{ Exception -> 0x00a1 }
            java.lang.String r8 = r2.a(r1, r3)     // Catch:{ Exception -> 0x00a1 }
            goto L_0x009c
        L_0x00bd:
            i7.d r1 = new i7.d     // Catch:{ Exception -> 0x00a1 }
            r1.<init>()     // Catch:{ Exception -> 0x00a1 }
            java.lang.Class<com.nic.mparivahan.dlservices.data.model.temp.UploadDocListResponse> r2 = com.nic.mparivahan.dlservices.data.model.temp.UploadDocListResponse.class
            java.lang.Object r8 = r1.j(r8, r2)     // Catch:{ Exception -> 0x00a1 }
            com.nic.mparivahan.dlservices.data.model.temp.UploadDocListResponse r8 = (com.nic.mparivahan.dlservices.data.model.temp.UploadDocListResponse) r8     // Catch:{ Exception -> 0x00a1 }
            androidx.lifecycle.a0 r1 = r0.f31477e     // Catch:{ Exception -> 0x00a1 }
            r1.k(r8)     // Catch:{ Exception -> 0x00a1 }
            goto L_0x0103
        L_0x00d0:
            r8.printStackTrace()     // Catch:{ Exception -> 0x00ec }
            com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog$a r1 = com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog.f20957k     // Catch:{ Exception -> 0x00ec }
            android.app.Application r2 = r0.f31473a     // Catch:{ Exception -> 0x00ec }
            v9.d$a r8 = v9.d.f17494a     // Catch:{ Exception -> 0x00ec }
            java.lang.String r3 = r8.t()     // Catch:{ Exception -> 0x00ec }
            java.lang.String r4 = "getCustomDocList"
            java.lang.String r5 = r8.v()     // Catch:{ Exception -> 0x00ec }
            java.lang.String r6 = r8.w()     // Catch:{ Exception -> 0x00ec }
            r1.a(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x00ec }
            goto L_0x0103
        L_0x00eb:
            r0 = r7
        L_0x00ec:
            com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog$a r1 = com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog.f20957k
            android.app.Application r2 = r0.f31473a
            v9.d$a r8 = v9.d.f17494a
            java.lang.String r3 = r8.t()
            java.lang.String r4 = "getCustomDocList"
            java.lang.String r5 = r8.v()
            java.lang.String r6 = r8.w()
            r1.a(r2, r3, r4, r5, r6)
        L_0x0103:
            pl.x r8 = pl.x.f30437a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ti.c.a(tl.d):java.lang.Object");
    }

    public final a0 c() {
        return this.f31477e;
    }
}
