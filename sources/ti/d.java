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
import tl.g;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    private Application f31485a;

    /* renamed from: b  reason: collision with root package name */
    private String f31486b;

    /* renamed from: c  reason: collision with root package name */
    private String f31487c;

    /* renamed from: d  reason: collision with root package name */
    private String f31488d;

    /* renamed from: e  reason: collision with root package name */
    private String f31489e;

    /* renamed from: f  reason: collision with root package name */
    public String f31490f;

    /* renamed from: g  reason: collision with root package name */
    private final a0 f31491g = new a0();

    static final class a extends l implements p {

        /* renamed from: f  reason: collision with root package name */
        int f31492f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ d f31493g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(d dVar, tl.d dVar2) {
            super(2, dVar2);
            this.f31493g = dVar;
        }

        /* renamed from: b */
        public final Object h(d0 d0Var, tl.d dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(x.f30437a);
        }

        public final tl.d create(Object obj, tl.d dVar) {
            return new a(this.f31493g, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object c10 = d.c();
            int i10 = this.f31492f;
            if (i10 == 0) {
                q.b(obj);
                d dVar = this.f31493g;
                this.f31492f = 1;
                if (dVar.b(this) == c10) {
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
        Object f31494e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f31495f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ d f31496g;

        /* renamed from: h  reason: collision with root package name */
        int f31497h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(d dVar, tl.d dVar2) {
            super(dVar2);
            this.f31496g = dVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f31495f = obj;
            this.f31497h |= Integer.MIN_VALUE;
            return this.f31496g.b(this);
        }
    }

    public d(Application application, String str, String str2, String str3, String str4) {
        cm.l.f(application, "mApp");
        cm.l.f(str, "applicationNumber");
        cm.l.f(str2, "stateCd");
        cm.l.f(str3, "serviceCode");
        cm.l.f(str4, "apdApplicant");
        this.f31485a = application;
        this.f31486b = str;
        this.f31487c = str2;
        this.f31488d = str3;
        this.f31489e = str4;
        k1 unused = g.d(e0.a(q0.b()), (g) null, (f0) null, new a(this, (tl.d) null), 3, (Object) null);
    }

    public final String a() {
        String str = this.f31490f;
        if (str != null) {
            return str;
        }
        cm.l.v("currentTime");
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0084 A[SYNTHETIC, Splitter:B:28:0x0084] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ab A[Catch:{ Exception -> 0x00a9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(tl.d r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof ti.d.b
            if (r0 == 0) goto L_0x0013
            r0 = r9
            ti.d$b r0 = (ti.d.b) r0
            int r1 = r0.f31497h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f31497h = r1
            goto L_0x0018
        L_0x0013:
            ti.d$b r0 = new ti.d$b
            r0.<init>(r8, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f31495f
            java.lang.Object r1 = ul.d.c()
            int r2 = r0.f31497h
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r0 = r0.f31494e
            ti.d r0 = (ti.d) r0
            pl.q.b(r9)     // Catch:{ Exception -> 0x00f8 }
            goto L_0x007a
        L_0x002d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x0035:
            pl.q.b(r9)
            long r4 = java.lang.System.currentTimeMillis()
            java.lang.String r9 = java.lang.String.valueOf(r4)
            r8.d(r9)
            si.b$a r9 = si.b.f31257a
            android.app.Application r2 = r8.f31485a
            boolean r9 = r9.a(r2)
            if (r9 == 0) goto L_0x010f
            si.a$a r9 = si.a.f31253a
            android.app.Application r2 = r8.f31485a
            retrofit2.Retrofit r9 = r9.a(r2)
            java.lang.Class<com.nic.mparivahan.dlservices.data.network.DlRenewalServicesStatus> r2 = com.nic.mparivahan.dlservices.data.network.DlRenewalServicesStatus.class
            java.lang.Object r9 = r9.create(r2)
            com.nic.mparivahan.dlservices.data.network.DlRenewalServicesStatus r9 = (com.nic.mparivahan.dlservices.data.network.DlRenewalServicesStatus) r9
            com.nic.mparivahan.dlservices.ui.dms.GetDocRequest r2 = new com.nic.mparivahan.dlservices.ui.dms.GetDocRequest     // Catch:{ Exception -> 0x00f7 }
            java.lang.String r4 = r8.f31488d     // Catch:{ Exception -> 0x00f7 }
            java.lang.String r5 = r8.f31486b     // Catch:{ Exception -> 0x00f7 }
            java.lang.String r6 = r8.f31487c     // Catch:{ Exception -> 0x00f7 }
            java.lang.String r7 = "A"
            r2.<init>(r4, r5, r6, r7)     // Catch:{ Exception -> 0x00f7 }
            java.lang.String r4 = r8.a()     // Catch:{ Exception -> 0x00f7 }
            r0.f31494e = r8     // Catch:{ Exception -> 0x00f7 }
            r0.f31497h = r3     // Catch:{ Exception -> 0x00f7 }
            java.lang.Object r9 = r9.getDlUploadDoc(r2, r4, r0)     // Catch:{ Exception -> 0x00f7 }
            if (r9 != r1) goto L_0x0079
            return r1
        L_0x0079:
            r0 = r8
        L_0x007a:
            com.nic.mparivahan.Security.SecModle.SecurityModle r9 = (com.nic.mparivahan.Security.SecModle.SecurityModle) r9     // Catch:{ Exception -> 0x00f8 }
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x00a9 }
            r2 = 26
            java.lang.String r3 = "decode(...)"
            if (r1 < r2) goto L_0x00ab
            id.c$a r1 = id.c.f12675a     // Catch:{ Exception -> 0x00a9 }
            java.lang.String r2 = r0.a()     // Catch:{ Exception -> 0x00a9 }
            j$.util.Base64$Decoder r4 = j$.util.Base64.getDecoder()     // Catch:{ Exception -> 0x00a9 }
            java.lang.String r9 = r9.getData()     // Catch:{ Exception -> 0x00a9 }
            byte[] r9 = r4.decode((java.lang.String) r9)     // Catch:{ Exception -> 0x00a9 }
            cm.l.e(r9, r3)     // Catch:{ Exception -> 0x00a9 }
            java.lang.String r3 = new java.lang.String     // Catch:{ Exception -> 0x00a9 }
            java.nio.charset.Charset r4 = km.d.f24740b     // Catch:{ Exception -> 0x00a9 }
            r3.<init>(r9, r4)     // Catch:{ Exception -> 0x00a9 }
            java.lang.String r9 = r1.a(r2, r3)     // Catch:{ Exception -> 0x00a9 }
        L_0x00a4:
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ Exception -> 0x00a9 }
            goto L_0x00c9
        L_0x00a9:
            r9 = move-exception
            goto L_0x00dc
        L_0x00ab:
            id.c$a r1 = id.c.f12675a     // Catch:{ Exception -> 0x00a9 }
            java.lang.String r2 = r0.a()     // Catch:{ Exception -> 0x00a9 }
            java.lang.String r9 = r9.getData()     // Catch:{ Exception -> 0x00a9 }
            r4 = 0
            byte[] r9 = android.util.Base64.decode(r9, r4)     // Catch:{ Exception -> 0x00a9 }
            cm.l.e(r9, r3)     // Catch:{ Exception -> 0x00a9 }
            java.lang.String r3 = new java.lang.String     // Catch:{ Exception -> 0x00a9 }
            java.nio.charset.Charset r4 = km.d.f24740b     // Catch:{ Exception -> 0x00a9 }
            r3.<init>(r9, r4)     // Catch:{ Exception -> 0x00a9 }
            java.lang.String r9 = r1.a(r2, r3)     // Catch:{ Exception -> 0x00a9 }
            goto L_0x00a4
        L_0x00c9:
            i7.d r1 = new i7.d     // Catch:{ Exception -> 0x00a9 }
            r1.<init>()     // Catch:{ Exception -> 0x00a9 }
            java.lang.Class<com.nic.mparivahan.dlservices.data.model.temp.UploadDocListResponse> r2 = com.nic.mparivahan.dlservices.data.model.temp.UploadDocListResponse.class
            java.lang.Object r9 = r1.j(r9, r2)     // Catch:{ Exception -> 0x00a9 }
            com.nic.mparivahan.dlservices.data.model.temp.UploadDocListResponse r9 = (com.nic.mparivahan.dlservices.data.model.temp.UploadDocListResponse) r9     // Catch:{ Exception -> 0x00a9 }
            androidx.lifecycle.a0 r1 = r0.f31491g     // Catch:{ Exception -> 0x00a9 }
            r1.k(r9)     // Catch:{ Exception -> 0x00a9 }
            goto L_0x010f
        L_0x00dc:
            r9.printStackTrace()     // Catch:{ Exception -> 0x00f8 }
            com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog$a r1 = com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog.f20957k     // Catch:{ Exception -> 0x00f8 }
            android.app.Application r2 = r0.f31485a     // Catch:{ Exception -> 0x00f8 }
            v9.d$a r9 = v9.d.f17494a     // Catch:{ Exception -> 0x00f8 }
            java.lang.String r3 = r9.t()     // Catch:{ Exception -> 0x00f8 }
            java.lang.String r4 = "documents"
            java.lang.String r5 = r9.v()     // Catch:{ Exception -> 0x00f8 }
            java.lang.String r6 = r9.w()     // Catch:{ Exception -> 0x00f8 }
            r1.a(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x00f8 }
            goto L_0x010f
        L_0x00f7:
            r0 = r8
        L_0x00f8:
            com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog$a r1 = com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog.f20957k
            android.app.Application r2 = r0.f31485a
            v9.d$a r9 = v9.d.f17494a
            java.lang.String r3 = r9.t()
            java.lang.String r4 = "documents"
            java.lang.String r5 = r9.v()
            java.lang.String r6 = r9.w()
            r1.a(r2, r3, r4, r5, r6)
        L_0x010f:
            pl.x r9 = pl.x.f30437a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ti.d.b(tl.d):java.lang.Object");
    }

    public final a0 c() {
        return this.f31491g;
    }

    public final void d(String str) {
        cm.l.f(str, "<set-?>");
        this.f31490f = str;
    }
}
