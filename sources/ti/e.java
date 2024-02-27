package ti;

import android.app.Application;
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

public final class e {

    /* renamed from: a  reason: collision with root package name */
    private Application f31498a;

    /* renamed from: b  reason: collision with root package name */
    private String f31499b;

    /* renamed from: c  reason: collision with root package name */
    private String f31500c;

    /* renamed from: d  reason: collision with root package name */
    private final a0 f31501d = new a0();

    static final class a extends l implements p {

        /* renamed from: f  reason: collision with root package name */
        int f31502f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ e f31503g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(e eVar, d dVar) {
            super(2, dVar);
            this.f31503g = eVar;
        }

        /* renamed from: b */
        public final Object h(d0 d0Var, d dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(x.f30437a);
        }

        public final d create(Object obj, d dVar) {
            return new a(this.f31503g, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object c10 = d.c();
            int i10 = this.f31502f;
            if (i10 == 0) {
                q.b(obj);
                e eVar = this.f31503g;
                this.f31502f = 1;
                if (eVar.a(this) == c10) {
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
        Object f31504e;

        /* renamed from: f  reason: collision with root package name */
        Object f31505f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f31506g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ e f31507h;

        /* renamed from: i  reason: collision with root package name */
        int f31508i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(e eVar, d dVar) {
            super(dVar);
            this.f31507h = eVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f31506g = obj;
            this.f31508i |= Integer.MIN_VALUE;
            return this.f31507h.a(this);
        }
    }

    public e(Application application, String str, String str2) {
        cm.l.f(application, "mApp");
        cm.l.f(str, "applicationNumber");
        cm.l.f(str2, "stateCd");
        this.f31498a = application;
        this.f31499b = str;
        this.f31500c = str2;
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
            boolean r0 = r8 instanceof ti.e.b
            if (r0 == 0) goto L_0x0013
            r0 = r8
            ti.e$b r0 = (ti.e.b) r0
            int r1 = r0.f31508i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f31508i = r1
            goto L_0x0018
        L_0x0013:
            ti.e$b r0 = new ti.e$b
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f31506g
            java.lang.Object r1 = ul.d.c()
            int r2 = r0.f31508i
            r3 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r1 = r0.f31505f
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.f31504e
            ti.e r0 = (ti.e) r0
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
            android.app.Application r2 = r7.f31498a
            boolean r8 = r8.a(r2)
            if (r8 == 0) goto L_0x010d
            long r4 = java.lang.System.currentTimeMillis()
            java.lang.String r8 = java.lang.String.valueOf(r4)
            si.a$a r2 = si.a.f31253a
            android.app.Application r4 = r7.f31498a
            retrofit2.Retrofit r2 = r2.a(r4)
            java.lang.Class<com.nic.mparivahan.dlservices.data.network.DlRenewalServicesStatus> r4 = com.nic.mparivahan.dlservices.data.network.DlRenewalServicesStatus.class
            java.lang.Object r2 = r2.create(r4)
            com.nic.mparivahan.dlservices.data.network.DlRenewalServicesStatus r2 = (com.nic.mparivahan.dlservices.data.network.DlRenewalServicesStatus) r2
            com.nic.mparivahan.dlservices.data.model.DlRenewalInsertDocUpload r4 = new com.nic.mparivahan.dlservices.data.model.DlRenewalInsertDocUpload     // Catch:{ Exception -> 0x00f5 }
            java.lang.String r5 = r7.f31499b     // Catch:{ Exception -> 0x00f5 }
            java.lang.String r6 = r7.f31500c     // Catch:{ Exception -> 0x00f5 }
            r4.<init>(r5, r6)     // Catch:{ Exception -> 0x00f5 }
            r0.f31504e = r7     // Catch:{ Exception -> 0x00f5 }
            r0.f31505f = r8     // Catch:{ Exception -> 0x00f5 }
            r0.f31508i = r3     // Catch:{ Exception -> 0x00f5 }
            java.lang.Object r0 = r2.getDlInsertedUploadDoc(r4, r8, r0)     // Catch:{ Exception -> 0x00f5 }
            if (r0 != r1) goto L_0x0074
            return r1
        L_0x0074:
            r1 = r8
            r8 = r0
            r0 = r7
        L_0x0077:
            com.nic.mparivahan.Security.SecModle.SecurityModle r8 = (com.nic.mparivahan.Security.SecModle.SecurityModle) r8     // Catch:{ Exception -> 0x00f6 }
            java.lang.String r2 = "ins_doc_res"
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
            java.lang.Class<com.nic.mparivahan.dlservices.data.model.temp.InsertedUploadDocResponse> r2 = com.nic.mparivahan.dlservices.data.model.temp.InsertedUploadDocResponse.class
            java.lang.Object r8 = r1.j(r8, r2)     // Catch:{ Exception -> 0x00ab }
            com.nic.mparivahan.dlservices.data.model.temp.InsertedUploadDocResponse r8 = (com.nic.mparivahan.dlservices.data.model.temp.InsertedUploadDocResponse) r8     // Catch:{ Exception -> 0x00ab }
            androidx.lifecycle.a0 r1 = r0.f31501d     // Catch:{ Exception -> 0x00ab }
            r1.k(r8)     // Catch:{ Exception -> 0x00ab }
            goto L_0x010d
        L_0x00da:
            r8.printStackTrace()     // Catch:{ Exception -> 0x00f6 }
            com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog$a r1 = com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog.f20957k     // Catch:{ Exception -> 0x00f6 }
            android.app.Application r2 = r0.f31498a     // Catch:{ Exception -> 0x00f6 }
            v9.d$a r8 = v9.d.f17494a     // Catch:{ Exception -> 0x00f6 }
            java.lang.String r3 = r8.t()     // Catch:{ Exception -> 0x00f6 }
            java.lang.String r4 = "getInsertedDocs"
            java.lang.String r5 = r8.v()     // Catch:{ Exception -> 0x00f6 }
            java.lang.String r6 = r8.w()     // Catch:{ Exception -> 0x00f6 }
            r1.a(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x00f6 }
            goto L_0x010d
        L_0x00f5:
            r0 = r7
        L_0x00f6:
            com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog$a r1 = com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog.f20957k
            android.app.Application r2 = r0.f31498a
            v9.d$a r8 = v9.d.f17494a
            java.lang.String r3 = r8.t()
            java.lang.String r4 = "getInsertedDocs"
            java.lang.String r5 = r8.v()
            java.lang.String r6 = r8.w()
            r1.a(r2, r3, r4, r5, r6)
        L_0x010d:
            pl.x r8 = pl.x.f30437a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ti.e.a(tl.d):java.lang.Object");
    }

    public final a0 b() {
        return this.f31501d;
    }
}
