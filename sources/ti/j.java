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

public final class j {

    /* renamed from: a  reason: collision with root package name */
    private Application f31561a;

    /* renamed from: b  reason: collision with root package name */
    private String f31562b;

    /* renamed from: c  reason: collision with root package name */
    private String f31563c;

    /* renamed from: d  reason: collision with root package name */
    private String f31564d;

    /* renamed from: e  reason: collision with root package name */
    private String f31565e;

    /* renamed from: f  reason: collision with root package name */
    private int f31566f;

    /* renamed from: g  reason: collision with root package name */
    private String f31567g;

    /* renamed from: h  reason: collision with root package name */
    private final a0 f31568h;

    static final class a extends l implements p {

        /* renamed from: f  reason: collision with root package name */
        int f31569f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ j f31570g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(j jVar, d dVar) {
            super(2, dVar);
            this.f31570g = jVar;
        }

        /* renamed from: b */
        public final Object h(d0 d0Var, d dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(x.f30437a);
        }

        public final d create(Object obj, d dVar) {
            return new a(this.f31570g, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object c10 = d.c();
            int i10 = this.f31569f;
            if (i10 == 0) {
                q.b(obj);
                j jVar = this.f31570g;
                this.f31569f = 1;
                if (jVar.a(this) == c10) {
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
        Object f31571e;

        /* renamed from: f  reason: collision with root package name */
        Object f31572f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f31573g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ j f31574h;

        /* renamed from: i  reason: collision with root package name */
        int f31575i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(j jVar, d dVar) {
            super(dVar);
            this.f31574h = jVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f31573g = obj;
            this.f31575i |= Integer.MIN_VALUE;
            return this.f31574h.a(this);
        }
    }

    public j(Application application, String str, String str2, String str3, String str4, int i10, String str5) {
        cm.l.f(application, "mApp");
        cm.l.f(str, "applNo");
        cm.l.f(str2, "transCode");
        cm.l.f(str3, "stateCode");
        cm.l.f(str4, "rtoCode");
        cm.l.f(str5, "acStatus");
        this.f31561a = application;
        this.f31562b = str;
        this.f31563c = str2;
        this.f31564d = str3;
        this.f31565e = str4;
        this.f31566f = i10;
        this.f31567g = str5;
        this.f31568h = new a0();
        k1 unused = g.d(e0.a(q0.b()), (g) null, (f0) null, new a(this, (d) null), 3, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0092 A[SYNTHETIC, Splitter:B:28:0x0092] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b5 A[Catch:{ Exception -> 0x00b3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(tl.d r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof ti.j.b
            if (r0 == 0) goto L_0x0013
            r0 = r13
            ti.j$b r0 = (ti.j.b) r0
            int r1 = r0.f31575i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f31575i = r1
            goto L_0x0018
        L_0x0013:
            ti.j$b r0 = new ti.j$b
            r0.<init>(r12, r13)
        L_0x0018:
            java.lang.Object r13 = r0.f31573g
            java.lang.Object r1 = ul.d.c()
            int r2 = r0.f31575i
            r3 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r1 = r0.f31572f
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.f31571e
            ti.j r0 = (ti.j) r0
            pl.q.b(r13)     // Catch:{ Exception -> 0x00fe }
            goto L_0x007f
        L_0x0031:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L_0x0039:
            pl.q.b(r13)
            si.b$a r13 = si.b.f31257a
            android.app.Application r2 = r12.f31561a
            boolean r13 = r13.a(r2)
            if (r13 == 0) goto L_0x0115
            si.a$a r13 = si.a.f31253a
            android.app.Application r2 = r12.f31561a
            retrofit2.Retrofit r13 = r13.a(r2)
            java.lang.Class<com.nic.mparivahan.dlservices.data.network.DlRenewalServicesStatus> r2 = com.nic.mparivahan.dlservices.data.network.DlRenewalServicesStatus.class
            java.lang.Object r13 = r13.create(r2)
            com.nic.mparivahan.dlservices.data.network.DlRenewalServicesStatus r13 = (com.nic.mparivahan.dlservices.data.network.DlRenewalServicesStatus) r13
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x00fd }
            java.lang.String r2 = java.lang.String.valueOf(r4)     // Catch:{ Exception -> 0x00fd }
            com.nic.mparivahan.dlservices.data.model.DlRenewalUploadDocFlow r11 = new com.nic.mparivahan.dlservices.data.model.DlRenewalUploadDocFlow     // Catch:{ Exception -> 0x00fd }
            java.lang.String r5 = r12.f31562b     // Catch:{ Exception -> 0x00fd }
            java.lang.String r6 = r12.f31563c     // Catch:{ Exception -> 0x00fd }
            java.lang.String r7 = r12.f31564d     // Catch:{ Exception -> 0x00fd }
            java.lang.String r8 = r12.f31565e     // Catch:{ Exception -> 0x00fd }
            int r9 = r12.f31566f     // Catch:{ Exception -> 0x00fd }
            java.lang.String r10 = r12.f31567g     // Catch:{ Exception -> 0x00fd }
            r4 = r11
            r4.<init>(r5, r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x00fd }
            r0.f31571e = r12     // Catch:{ Exception -> 0x00fd }
            r0.f31572f = r2     // Catch:{ Exception -> 0x00fd }
            r0.f31575i = r3     // Catch:{ Exception -> 0x00fd }
            java.lang.Object r13 = r13.uploadDlDocFlow(r11, r2, r0)     // Catch:{ Exception -> 0x00fd }
            if (r13 != r1) goto L_0x007d
            return r1
        L_0x007d:
            r0 = r12
            r1 = r2
        L_0x007f:
            com.nic.mparivahan.Security.SecModle.SecurityModle r13 = (com.nic.mparivahan.Security.SecModle.SecurityModle) r13     // Catch:{ Exception -> 0x00fe }
            java.lang.String r2 = "Result--> flo"
            java.lang.String r3 = r13.toString()     // Catch:{ Exception -> 0x00fe }
            android.util.Log.e(r2, r3)     // Catch:{ Exception -> 0x00fe }
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x00b3 }
            r3 = 26
            java.lang.String r4 = "decode(...)"
            if (r2 < r3) goto L_0x00b5
            id.c$a r2 = id.c.f12675a     // Catch:{ Exception -> 0x00b3 }
            j$.util.Base64$Decoder r3 = j$.util.Base64.getDecoder()     // Catch:{ Exception -> 0x00b3 }
            java.lang.String r13 = r13.getData()     // Catch:{ Exception -> 0x00b3 }
            byte[] r13 = r3.decode((java.lang.String) r13)     // Catch:{ Exception -> 0x00b3 }
            cm.l.e(r13, r4)     // Catch:{ Exception -> 0x00b3 }
            java.lang.String r3 = new java.lang.String     // Catch:{ Exception -> 0x00b3 }
            java.nio.charset.Charset r4 = km.d.f24740b     // Catch:{ Exception -> 0x00b3 }
            r3.<init>(r13, r4)     // Catch:{ Exception -> 0x00b3 }
            java.lang.String r13 = r2.a(r1, r3)     // Catch:{ Exception -> 0x00b3 }
        L_0x00ae:
            java.lang.String r13 = java.lang.String.valueOf(r13)     // Catch:{ Exception -> 0x00b3 }
            goto L_0x00cf
        L_0x00b3:
            r13 = move-exception
            goto L_0x00e2
        L_0x00b5:
            id.c$a r2 = id.c.f12675a     // Catch:{ Exception -> 0x00b3 }
            java.lang.String r13 = r13.getData()     // Catch:{ Exception -> 0x00b3 }
            r3 = 0
            byte[] r13 = android.util.Base64.decode(r13, r3)     // Catch:{ Exception -> 0x00b3 }
            cm.l.e(r13, r4)     // Catch:{ Exception -> 0x00b3 }
            java.lang.String r3 = new java.lang.String     // Catch:{ Exception -> 0x00b3 }
            java.nio.charset.Charset r4 = km.d.f24740b     // Catch:{ Exception -> 0x00b3 }
            r3.<init>(r13, r4)     // Catch:{ Exception -> 0x00b3 }
            java.lang.String r13 = r2.a(r1, r3)     // Catch:{ Exception -> 0x00b3 }
            goto L_0x00ae
        L_0x00cf:
            i7.d r1 = new i7.d     // Catch:{ Exception -> 0x00b3 }
            r1.<init>()     // Catch:{ Exception -> 0x00b3 }
            java.lang.Class<com.nic.mparivahan.dlservices.data.model.UploadDocFlowResponse> r2 = com.nic.mparivahan.dlservices.data.model.UploadDocFlowResponse.class
            java.lang.Object r13 = r1.j(r13, r2)     // Catch:{ Exception -> 0x00b3 }
            com.nic.mparivahan.dlservices.data.model.UploadDocFlowResponse r13 = (com.nic.mparivahan.dlservices.data.model.UploadDocFlowResponse) r13     // Catch:{ Exception -> 0x00b3 }
            androidx.lifecycle.a0 r1 = r0.f31568h     // Catch:{ Exception -> 0x00b3 }
            r1.k(r13)     // Catch:{ Exception -> 0x00b3 }
            goto L_0x0115
        L_0x00e2:
            r13.printStackTrace()     // Catch:{ Exception -> 0x00fe }
            com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog$a r1 = com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog.f20957k     // Catch:{ Exception -> 0x00fe }
            android.app.Application r2 = r0.f31561a     // Catch:{ Exception -> 0x00fe }
            v9.d$a r13 = v9.d.f17494a     // Catch:{ Exception -> 0x00fe }
            java.lang.String r3 = r13.t()     // Catch:{ Exception -> 0x00fe }
            java.lang.String r4 = "updateUploadFlow"
            java.lang.String r5 = r13.v()     // Catch:{ Exception -> 0x00fe }
            java.lang.String r6 = r13.w()     // Catch:{ Exception -> 0x00fe }
            r1.a(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x00fe }
            goto L_0x0115
        L_0x00fd:
            r0 = r12
        L_0x00fe:
            com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog$a r1 = com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog.f20957k
            android.app.Application r2 = r0.f31561a
            v9.d$a r13 = v9.d.f17494a
            java.lang.String r3 = r13.t()
            java.lang.String r4 = "updateUploadFlow"
            java.lang.String r5 = r13.v()
            java.lang.String r6 = r13.w()
            r1.a(r2, r3, r4, r5, r6)
        L_0x0115:
            pl.x r13 = pl.x.f30437a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: ti.j.a(tl.d):java.lang.Object");
    }

    public final a0 b() {
        return this.f31568h;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(Application application, String str, String str2, String str3, String str4, int i10, String str5, int i11, cm.g gVar) {
        this(application, str, str2, str3, str4, (i11 & 32) != 0 ? 123 : i10, (i11 & 64) != 0 ? "C" : str5);
    }
}
