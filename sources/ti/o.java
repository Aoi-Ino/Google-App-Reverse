package ti;

import android.app.Application;
import androidx.lifecycle.a0;
import bm.p;
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

public final class o {

    /* renamed from: a  reason: collision with root package name */
    private final Application f31640a;

    /* renamed from: b  reason: collision with root package name */
    private final String f31641b;

    /* renamed from: c  reason: collision with root package name */
    private final String f31642c;

    /* renamed from: d  reason: collision with root package name */
    private final String f31643d;

    /* renamed from: e  reason: collision with root package name */
    private final String f31644e;

    /* renamed from: f  reason: collision with root package name */
    private final String f31645f;

    /* renamed from: g  reason: collision with root package name */
    private final int f31646g;

    /* renamed from: h  reason: collision with root package name */
    private final a0 f31647h = new a0();

    /* renamed from: i  reason: collision with root package name */
    private final int f31648i = e.p(9999.0d, 99999.0d);

    static final class a extends l implements p {

        /* renamed from: f  reason: collision with root package name */
        int f31649f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ o f31650g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(o oVar, d dVar) {
            super(2, dVar);
            this.f31650g = oVar;
        }

        /* renamed from: b */
        public final Object h(d0 d0Var, d dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(x.f30437a);
        }

        public final d create(Object obj, d dVar) {
            return new a(this.f31650g, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object c10 = d.c();
            int i10 = this.f31649f;
            if (i10 == 0) {
                q.b(obj);
                o oVar = this.f31650g;
                this.f31649f = 1;
                if (oVar.a(this) == c10) {
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
        Object f31651e;

        /* renamed from: f  reason: collision with root package name */
        Object f31652f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f31653g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ o f31654h;

        /* renamed from: i  reason: collision with root package name */
        int f31655i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(o oVar, d dVar) {
            super(dVar);
            this.f31654h = oVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f31653g = obj;
            this.f31655i |= Integer.MIN_VALUE;
            return this.f31654h.a(this);
        }
    }

    public o(Application application, String str, String str2, String str3, String str4, String str5, int i10) {
        cm.l.f(application, "mApp");
        cm.l.f(str, "mApplNo");
        cm.l.f(str2, "mApplDob");
        cm.l.f(str3, "stateCode");
        cm.l.f(str4, "photoImg");
        cm.l.f(str5, "signImg");
        this.f31640a = application;
        this.f31641b = str;
        this.f31642c = str2;
        this.f31643d = str3;
        this.f31644e = str4;
        this.f31645f = str5;
        this.f31646g = i10;
        k1 unused = g.d(e0.a(q0.b()), (g) null, (f0) null, new a(this, (d) null), 3, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0088 A[SYNTHETIC, Splitter:B:28:0x0088] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ab A[Catch:{ Exception -> 0x00a9, all -> 0x00f9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(tl.d r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof ti.o.b
            if (r0 == 0) goto L_0x0013
            r0 = r12
            ti.o$b r0 = (ti.o.b) r0
            int r1 = r0.f31655i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f31655i = r1
            goto L_0x0018
        L_0x0013:
            ti.o$b r0 = new ti.o$b
            r0.<init>(r11, r12)
        L_0x0018:
            java.lang.Object r12 = r0.f31653g
            java.lang.Object r1 = ul.d.c()
            int r2 = r0.f31655i
            r3 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r1 = r0.f31652f
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.f31651e
            ti.o r0 = (ti.o) r0
            pl.q.b(r12)     // Catch:{ all -> 0x00f9 }
            goto L_0x007e
        L_0x0031:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L_0x0039:
            pl.q.b(r12)
            si.b$a r12 = si.b.f31257a
            android.app.Application r2 = r11.f31640a
            boolean r12 = r12.a(r2)
            if (r12 == 0) goto L_0x0110
            long r4 = java.lang.System.currentTimeMillis()
            java.lang.String r12 = java.lang.String.valueOf(r4)
            si.a$a r2 = si.a.f31253a
            android.app.Application r4 = r11.f31640a
            retrofit2.Retrofit r2 = r2.a(r4)
            java.lang.Class<com.nic.mparivahan.dlservices.data.network.DlRenewalServicesStatus> r4 = com.nic.mparivahan.dlservices.data.network.DlRenewalServicesStatus.class
            java.lang.Object r2 = r2.create(r4)
            com.nic.mparivahan.dlservices.data.network.DlRenewalServicesStatus r2 = (com.nic.mparivahan.dlservices.data.network.DlRenewalServicesStatus) r2
            com.nic.mparivahan.dlservices.data.model.UploadPhotoSignReqeust r10 = new com.nic.mparivahan.dlservices.data.model.UploadPhotoSignReqeust     // Catch:{ all -> 0x00f8 }
            java.lang.String r5 = r11.f31641b     // Catch:{ all -> 0x00f8 }
            java.lang.String r6 = r11.f31642c     // Catch:{ all -> 0x00f8 }
            java.lang.String r7 = r11.f31643d     // Catch:{ all -> 0x00f8 }
            java.lang.String r8 = r11.f31644e     // Catch:{ all -> 0x00f8 }
            java.lang.String r9 = r11.f31645f     // Catch:{ all -> 0x00f8 }
            r4 = r10
            r4.<init>(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x00f8 }
            r0.f31651e = r11     // Catch:{ all -> 0x00f8 }
            r0.f31652f = r12     // Catch:{ all -> 0x00f8 }
            r0.f31655i = r3     // Catch:{ all -> 0x00f8 }
            java.lang.Object r0 = r2.uploadDlPhotoSign(r10, r12, r0)     // Catch:{ all -> 0x00f8 }
            if (r0 != r1) goto L_0x007b
            return r1
        L_0x007b:
            r1 = r12
            r12 = r0
            r0 = r11
        L_0x007e:
            com.nic.mparivahan.Security.SecModle.SecurityModle r12 = (com.nic.mparivahan.Security.SecModle.SecurityModle) r12     // Catch:{ all -> 0x00f9 }
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x00a9 }
            r3 = 26
            java.lang.String r4 = "decode(...)"
            if (r2 < r3) goto L_0x00ab
            id.c$a r2 = id.c.f12675a     // Catch:{ Exception -> 0x00a9 }
            j$.util.Base64$Decoder r3 = j$.util.Base64.getDecoder()     // Catch:{ Exception -> 0x00a9 }
            java.lang.String r12 = r12.getData()     // Catch:{ Exception -> 0x00a9 }
            byte[] r12 = r3.decode((java.lang.String) r12)     // Catch:{ Exception -> 0x00a9 }
            cm.l.e(r12, r4)     // Catch:{ Exception -> 0x00a9 }
            java.lang.String r3 = new java.lang.String     // Catch:{ Exception -> 0x00a9 }
            java.nio.charset.Charset r4 = km.d.f24740b     // Catch:{ Exception -> 0x00a9 }
            r3.<init>(r12, r4)     // Catch:{ Exception -> 0x00a9 }
            java.lang.String r12 = r2.a(r1, r3)     // Catch:{ Exception -> 0x00a9 }
        L_0x00a4:
            java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch:{ Exception -> 0x00a9 }
            goto L_0x00c5
        L_0x00a9:
            r12 = move-exception
            goto L_0x00dd
        L_0x00ab:
            id.c$a r2 = id.c.f12675a     // Catch:{ Exception -> 0x00a9 }
            java.lang.String r12 = r12.getData()     // Catch:{ Exception -> 0x00a9 }
            r3 = 0
            byte[] r12 = android.util.Base64.decode(r12, r3)     // Catch:{ Exception -> 0x00a9 }
            cm.l.e(r12, r4)     // Catch:{ Exception -> 0x00a9 }
            java.lang.String r3 = new java.lang.String     // Catch:{ Exception -> 0x00a9 }
            java.nio.charset.Charset r4 = km.d.f24740b     // Catch:{ Exception -> 0x00a9 }
            r3.<init>(r12, r4)     // Catch:{ Exception -> 0x00a9 }
            java.lang.String r12 = r2.a(r1, r3)     // Catch:{ Exception -> 0x00a9 }
            goto L_0x00a4
        L_0x00c5:
            java.lang.String r1 = "DecRes-"
            android.util.Log.d(r1, r12)     // Catch:{ Exception -> 0x00a9 }
            i7.d r1 = new i7.d     // Catch:{ Exception -> 0x00a9 }
            r1.<init>()     // Catch:{ Exception -> 0x00a9 }
            java.lang.Class<com.nic.mparivahan.dlservices.data.model.temp.PhotoDto> r2 = com.nic.mparivahan.dlservices.data.model.temp.PhotoDto.class
            java.lang.Object r12 = r1.j(r12, r2)     // Catch:{ Exception -> 0x00a9 }
            com.nic.mparivahan.dlservices.data.model.temp.PhotoDto r12 = (com.nic.mparivahan.dlservices.data.model.temp.PhotoDto) r12     // Catch:{ Exception -> 0x00a9 }
            androidx.lifecycle.a0 r1 = r0.f31647h     // Catch:{ Exception -> 0x00a9 }
            r1.k(r12)     // Catch:{ Exception -> 0x00a9 }
            goto L_0x0110
        L_0x00dd:
            r12.printStackTrace()     // Catch:{ all -> 0x00f9 }
            com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog$a r1 = com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog.f20957k     // Catch:{ all -> 0x00f9 }
            android.app.Application r2 = r0.f31640a     // Catch:{ all -> 0x00f9 }
            v9.d$a r12 = v9.d.f17494a     // Catch:{ all -> 0x00f9 }
            java.lang.String r3 = r12.t()     // Catch:{ all -> 0x00f9 }
            java.lang.String r4 = "saveBiomtrics"
            java.lang.String r5 = r12.v()     // Catch:{ all -> 0x00f9 }
            java.lang.String r6 = r12.w()     // Catch:{ all -> 0x00f9 }
            r1.a(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x00f9 }
            goto L_0x0110
        L_0x00f8:
            r0 = r11
        L_0x00f9:
            com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog$a r1 = com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog.f20957k
            android.app.Application r2 = r0.f31640a
            v9.d$a r12 = v9.d.f17494a
            java.lang.String r3 = r12.t()
            java.lang.String r4 = "saveBiomtrics"
            java.lang.String r5 = r12.v()
            java.lang.String r6 = r12.w()
            r1.a(r2, r3, r4, r5, r6)
        L_0x0110:
            pl.x r12 = pl.x.f30437a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: ti.o.a(tl.d):java.lang.Object");
    }

    public final a0 b() {
        return this.f31647h;
    }
}
