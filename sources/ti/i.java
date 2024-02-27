package ti;

import android.app.Application;
import androidx.lifecycle.a0;
import bm.p;
import com.nic.mparivahan.dlservices.data.model.DlStatusRequest;
import com.nic.mparivahan.dlservices.utilities.e;
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

public final class i {

    /* renamed from: a  reason: collision with root package name */
    private final Application f31550a;

    /* renamed from: b  reason: collision with root package name */
    private final DlStatusRequest f31551b;

    /* renamed from: c  reason: collision with root package name */
    private final a0 f31552c = new a0();

    /* renamed from: d  reason: collision with root package name */
    private final int f31553d = e.p(9999.0d, 99999.0d);

    static final class a extends l implements p {

        /* renamed from: f  reason: collision with root package name */
        int f31554f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ i f31555g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(i iVar, d dVar) {
            super(2, dVar);
            this.f31555g = iVar;
        }

        /* renamed from: b */
        public final Object h(d0 d0Var, d dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(x.f30437a);
        }

        public final d create(Object obj, d dVar) {
            return new a(this.f31555g, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object c10 = d.c();
            int i10 = this.f31554f;
            if (i10 == 0) {
                q.b(obj);
                i iVar = this.f31555g;
                this.f31554f = 1;
                if (iVar.a(this) == c10) {
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
        Object f31556e;

        /* renamed from: f  reason: collision with root package name */
        Object f31557f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f31558g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ i f31559h;

        /* renamed from: i  reason: collision with root package name */
        int f31560i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(i iVar, d dVar) {
            super(dVar);
            this.f31559h = iVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f31558g = obj;
            this.f31560i |= Integer.MIN_VALUE;
            return this.f31559h.a(this);
        }
    }

    public i(Application application, DlStatusRequest dlStatusRequest) {
        cm.l.f(application, "app");
        cm.l.f(dlStatusRequest, "request");
        this.f31550a = application;
        this.f31551b = dlStatusRequest;
        k1 unused = g.d(e0.a(q0.b()), (g) null, (f0) null, new a(this, (d) null), 3, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0083 A[SYNTHETIC, Splitter:B:28:0x0083] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a6 A[Catch:{ Exception -> 0x00a4, all -> 0x00ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(tl.d r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof ti.i.b
            if (r0 == 0) goto L_0x0013
            r0 = r9
            ti.i$b r0 = (ti.i.b) r0
            int r1 = r0.f31560i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f31560i = r1
            goto L_0x0018
        L_0x0013:
            ti.i$b r0 = new ti.i$b
            r0.<init>(r8, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f31558g
            java.lang.Object r1 = ul.d.c()
            int r2 = r0.f31560i
            r3 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r1 = r0.f31557f
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.f31556e
            ti.i r0 = (ti.i) r0
            pl.q.b(r9)     // Catch:{ all -> 0x00ef }
            goto L_0x0070
        L_0x0031:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x0039:
            pl.q.b(r9)
            si.b$a r9 = si.b.f31257a
            android.app.Application r2 = r8.f31550a
            boolean r9 = r9.a(r2)
            if (r9 == 0) goto L_0x0118
            long r4 = java.lang.System.currentTimeMillis()
            java.lang.String r9 = java.lang.String.valueOf(r4)
            si.a$a r2 = si.a.f31253a
            android.app.Application r4 = r8.f31550a
            retrofit2.Retrofit r2 = r2.a(r4)
            java.lang.Class<com.nic.mparivahan.dlservices.ui.acknow.DlApplStatusService> r4 = com.nic.mparivahan.dlservices.ui.acknow.DlApplStatusService.class
            java.lang.Object r2 = r2.create(r4)
            com.nic.mparivahan.dlservices.ui.acknow.DlApplStatusService r2 = (com.nic.mparivahan.dlservices.ui.acknow.DlApplStatusService) r2
            com.nic.mparivahan.dlservices.data.model.DlStatusRequest r4 = r8.f31551b     // Catch:{ all -> 0x00ee }
            r0.f31556e = r8     // Catch:{ all -> 0x00ee }
            r0.f31557f = r9     // Catch:{ all -> 0x00ee }
            r0.f31560i = r3     // Catch:{ all -> 0x00ee }
            java.lang.Object r0 = r2.getDlStatus(r4, r9, r0)     // Catch:{ all -> 0x00ee }
            if (r0 != r1) goto L_0x006d
            return r1
        L_0x006d:
            r1 = r9
            r9 = r0
            r0 = r8
        L_0x0070:
            com.nic.mparivahan.Security.SecModle.SecurityModle r9 = (com.nic.mparivahan.Security.SecModle.SecurityModle) r9     // Catch:{ all -> 0x00ef }
            java.lang.String r2 = "_update"
            java.lang.String r3 = r9.toString()     // Catch:{ all -> 0x00ef }
            android.util.Log.d(r2, r3)     // Catch:{ all -> 0x00ef }
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x00a4 }
            r3 = 26
            java.lang.String r4 = "decode(...)"
            if (r2 < r3) goto L_0x00a6
            id.c$a r2 = id.c.f12675a     // Catch:{ Exception -> 0x00a4 }
            j$.util.Base64$Decoder r3 = j$.util.Base64.getDecoder()     // Catch:{ Exception -> 0x00a4 }
            java.lang.String r9 = r9.getData()     // Catch:{ Exception -> 0x00a4 }
            byte[] r9 = r3.decode((java.lang.String) r9)     // Catch:{ Exception -> 0x00a4 }
            cm.l.e(r9, r4)     // Catch:{ Exception -> 0x00a4 }
            java.lang.String r3 = new java.lang.String     // Catch:{ Exception -> 0x00a4 }
            java.nio.charset.Charset r4 = km.d.f24740b     // Catch:{ Exception -> 0x00a4 }
            r3.<init>(r9, r4)     // Catch:{ Exception -> 0x00a4 }
            java.lang.String r9 = r2.a(r1, r3)     // Catch:{ Exception -> 0x00a4 }
        L_0x009f:
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ Exception -> 0x00a4 }
            goto L_0x00c0
        L_0x00a4:
            r9 = move-exception
            goto L_0x00d3
        L_0x00a6:
            id.c$a r2 = id.c.f12675a     // Catch:{ Exception -> 0x00a4 }
            java.lang.String r9 = r9.getData()     // Catch:{ Exception -> 0x00a4 }
            r3 = 0
            byte[] r9 = android.util.Base64.decode(r9, r3)     // Catch:{ Exception -> 0x00a4 }
            cm.l.e(r9, r4)     // Catch:{ Exception -> 0x00a4 }
            java.lang.String r3 = new java.lang.String     // Catch:{ Exception -> 0x00a4 }
            java.nio.charset.Charset r4 = km.d.f24740b     // Catch:{ Exception -> 0x00a4 }
            r3.<init>(r9, r4)     // Catch:{ Exception -> 0x00a4 }
            java.lang.String r9 = r2.a(r1, r3)     // Catch:{ Exception -> 0x00a4 }
            goto L_0x009f
        L_0x00c0:
            i7.d r1 = new i7.d     // Catch:{ Exception -> 0x00a4 }
            r1.<init>()     // Catch:{ Exception -> 0x00a4 }
            java.lang.Class<com.nic.mparivahan.dlservices.data.model.DlApplStatusDto> r2 = com.nic.mparivahan.dlservices.data.model.DlApplStatusDto.class
            java.lang.Object r9 = r1.j(r9, r2)     // Catch:{ Exception -> 0x00a4 }
            com.nic.mparivahan.dlservices.data.model.DlApplStatusDto r9 = (com.nic.mparivahan.dlservices.data.model.DlApplStatusDto) r9     // Catch:{ Exception -> 0x00a4 }
            androidx.lifecycle.a0 r1 = r0.f31552c     // Catch:{ Exception -> 0x00a4 }
            r1.k(r9)     // Catch:{ Exception -> 0x00a4 }
            goto L_0x0118
        L_0x00d3:
            r9.printStackTrace()     // Catch:{ all -> 0x00ef }
            com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog$a r1 = com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog.f20957k     // Catch:{ all -> 0x00ef }
            android.app.Application r2 = r0.f31550a     // Catch:{ all -> 0x00ef }
            v9.d$a r9 = v9.d.f17494a     // Catch:{ all -> 0x00ef }
            java.lang.String r3 = r9.t()     // Catch:{ all -> 0x00ef }
            java.lang.String r4 = "applStatus"
            java.lang.String r5 = r9.v()     // Catch:{ all -> 0x00ef }
            java.lang.String r6 = r9.w()     // Catch:{ all -> 0x00ef }
            r1.a(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x00ef }
            goto L_0x0118
        L_0x00ee:
            r0 = r8
        L_0x00ef:
            com.nic.mparivahan.dlservices.data.model.DlApplStatusDto r9 = new com.nic.mparivahan.dlservices.data.model.DlApplStatusDto
            java.lang.String r2 = "500"
            java.lang.String r3 = "Server Exception"
            r4 = 0
            r5 = 4
            r6 = 0
            r1 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            androidx.lifecycle.a0 r1 = r0.f31552c
            r1.k(r9)
            com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog$a r2 = com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog.f20957k
            android.app.Application r3 = r0.f31550a
            v9.d$a r9 = v9.d.f17494a
            java.lang.String r4 = r9.t()
            java.lang.String r5 = "applStatus"
            java.lang.String r6 = r9.v()
            java.lang.String r7 = r9.w()
            r2.a(r3, r4, r5, r6, r7)
        L_0x0118:
            pl.x r9 = pl.x.f30437a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ti.i.a(tl.d):java.lang.Object");
    }

    public final a0 b() {
        return this.f31552c;
    }
}
