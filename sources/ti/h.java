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

public final class h {

    /* renamed from: a  reason: collision with root package name */
    private Application f31539a;

    /* renamed from: b  reason: collision with root package name */
    private final String f31540b;

    /* renamed from: c  reason: collision with root package name */
    private final String f31541c;

    /* renamed from: d  reason: collision with root package name */
    private final a0 f31542d = new a0();

    static final class a extends l implements p {

        /* renamed from: f  reason: collision with root package name */
        int f31543f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ h f31544g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(h hVar, d dVar) {
            super(2, dVar);
            this.f31544g = hVar;
        }

        /* renamed from: b */
        public final Object h(d0 d0Var, d dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(x.f30437a);
        }

        public final d create(Object obj, d dVar) {
            return new a(this.f31544g, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object c10 = d.c();
            int i10 = this.f31543f;
            if (i10 == 0) {
                q.b(obj);
                h hVar = this.f31544g;
                this.f31543f = 1;
                if (hVar.a(this) == c10) {
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
        Object f31545e;

        /* renamed from: f  reason: collision with root package name */
        Object f31546f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f31547g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ h f31548h;

        /* renamed from: i  reason: collision with root package name */
        int f31549i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(h hVar, d dVar) {
            super(dVar);
            this.f31548h = hVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f31547g = obj;
            this.f31549i |= Integer.MIN_VALUE;
            return this.f31548h.a(this);
        }
    }

    public h(Application application, String str, String str2) {
        cm.l.f(application, "mApp");
        this.f31539a = application;
        this.f31540b = str;
        this.f31541c = str2;
        k1 unused = g.d(e0.a(q0.b()), (g) null, (f0) null, new a(this, (d) null), 3, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x008d A[SYNTHETIC, Splitter:B:33:0x008d] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b0 A[Catch:{ Exception -> 0x00ae }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(tl.d r9) {
        /*
            r8 = this;
            java.lang.String r0 = "DecRes-"
            boolean r1 = r9 instanceof ti.h.b
            if (r1 == 0) goto L_0x0015
            r1 = r9
            ti.h$b r1 = (ti.h.b) r1
            int r2 = r1.f31549i
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0015
            int r2 = r2 - r3
            r1.f31549i = r2
            goto L_0x001a
        L_0x0015:
            ti.h$b r1 = new ti.h$b
            r1.<init>(r8, r9)
        L_0x001a:
            java.lang.Object r9 = r1.f31547g
            java.lang.Object r2 = ul.d.c()
            int r3 = r1.f31549i
            r4 = 1
            if (r3 == 0) goto L_0x003b
            if (r3 != r4) goto L_0x0033
            java.lang.Object r2 = r1.f31546f
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r1.f31545e
            ti.h r1 = (ti.h) r1
            pl.q.b(r9)     // Catch:{ Exception -> 0x00ea }
            goto L_0x0083
        L_0x0033:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x003b:
            pl.q.b(r9)
            long r5 = java.lang.System.currentTimeMillis()
            java.lang.String r9 = java.lang.String.valueOf(r5)
            si.a$a r3 = si.a.f31253a
            android.app.Application r5 = r8.f31539a
            retrofit2.Retrofit r3 = r3.a(r5)
            java.lang.Class<com.nic.mparivahan.dlservices.data.network.DlRenewalServicesStatus> r5 = com.nic.mparivahan.dlservices.data.network.DlRenewalServicesStatus.class
            java.lang.Object r3 = r3.create(r5)
            com.nic.mparivahan.dlservices.data.network.DlRenewalServicesStatus r3 = (com.nic.mparivahan.dlservices.data.network.DlRenewalServicesStatus) r3
            java.lang.String r5 = r8.f31540b     // Catch:{ Exception -> 0x00ea }
            if (r5 == 0) goto L_0x00ea
            int r5 = r5.length()     // Catch:{ Exception -> 0x00ea }
            if (r5 <= 0) goto L_0x00ea
            java.lang.String r5 = r8.f31541c     // Catch:{ Exception -> 0x00ea }
            if (r5 == 0) goto L_0x00ea
            int r5 = r5.length()     // Catch:{ Exception -> 0x00ea }
            if (r5 <= 0) goto L_0x00ea
            com.nic.mparivahan.dlservices.ui.dms.GetDocProofRequest r5 = new com.nic.mparivahan.dlservices.ui.dms.GetDocProofRequest     // Catch:{ Exception -> 0x00ea }
            java.lang.String r6 = r8.f31541c     // Catch:{ Exception -> 0x00ea }
            java.lang.String r7 = r8.f31540b     // Catch:{ Exception -> 0x00ea }
            r5.<init>(r6, r7)     // Catch:{ Exception -> 0x00ea }
            r1.f31545e = r8     // Catch:{ Exception -> 0x00ea }
            r1.f31546f = r9     // Catch:{ Exception -> 0x00ea }
            r1.f31549i = r4     // Catch:{ Exception -> 0x00ea }
            java.lang.Object r1 = r3.getDlListOfDoc(r5, r9, r1)     // Catch:{ Exception -> 0x00ea }
            if (r1 != r2) goto L_0x0080
            return r2
        L_0x0080:
            r2 = r9
            r9 = r1
            r1 = r8
        L_0x0083:
            com.nic.mparivahan.Security.SecModle.SecurityModle r9 = (com.nic.mparivahan.Security.SecModle.SecurityModle) r9     // Catch:{ Exception -> 0x00ea }
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x00ae }
            r4 = 26
            java.lang.String r5 = "decode(...)"
            if (r3 < r4) goto L_0x00b0
            id.c$a r3 = id.c.f12675a     // Catch:{ Exception -> 0x00ae }
            j$.util.Base64$Decoder r4 = j$.util.Base64.getDecoder()     // Catch:{ Exception -> 0x00ae }
            java.lang.String r9 = r9.getData()     // Catch:{ Exception -> 0x00ae }
            byte[] r9 = r4.decode((java.lang.String) r9)     // Catch:{ Exception -> 0x00ae }
            cm.l.e(r9, r5)     // Catch:{ Exception -> 0x00ae }
            java.lang.String r4 = new java.lang.String     // Catch:{ Exception -> 0x00ae }
            java.nio.charset.Charset r5 = km.d.f24740b     // Catch:{ Exception -> 0x00ae }
            r4.<init>(r9, r5)     // Catch:{ Exception -> 0x00ae }
            java.lang.String r9 = r3.a(r2, r4)     // Catch:{ Exception -> 0x00ae }
        L_0x00a9:
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ Exception -> 0x00ae }
            goto L_0x00ca
        L_0x00ae:
            r9 = move-exception
            goto L_0x00e0
        L_0x00b0:
            id.c$a r3 = id.c.f12675a     // Catch:{ Exception -> 0x00ae }
            java.lang.String r9 = r9.getData()     // Catch:{ Exception -> 0x00ae }
            r4 = 0
            byte[] r9 = android.util.Base64.decode(r9, r4)     // Catch:{ Exception -> 0x00ae }
            cm.l.e(r9, r5)     // Catch:{ Exception -> 0x00ae }
            java.lang.String r4 = new java.lang.String     // Catch:{ Exception -> 0x00ae }
            java.nio.charset.Charset r5 = km.d.f24740b     // Catch:{ Exception -> 0x00ae }
            r4.<init>(r9, r5)     // Catch:{ Exception -> 0x00ae }
            java.lang.String r9 = r3.a(r2, r4)     // Catch:{ Exception -> 0x00ae }
            goto L_0x00a9
        L_0x00ca:
            android.util.Log.d(r0, r9)     // Catch:{ Exception -> 0x00ae }
            i7.d r2 = new i7.d     // Catch:{ Exception -> 0x00ae }
            r2.<init>()     // Catch:{ Exception -> 0x00ae }
            java.lang.Class<com.nic.mparivahan.dlservices.data.model.temp.UploadDocListResponse> r3 = com.nic.mparivahan.dlservices.data.model.temp.UploadDocListResponse.class
            java.lang.Object r9 = r2.j(r9, r3)     // Catch:{ Exception -> 0x00ae }
            com.nic.mparivahan.dlservices.data.model.temp.UploadDocListResponse r9 = (com.nic.mparivahan.dlservices.data.model.temp.UploadDocListResponse) r9     // Catch:{ Exception -> 0x00ae }
            androidx.lifecycle.a0 r1 = r1.f31542d     // Catch:{ Exception -> 0x00ae }
            r1.k(r9)     // Catch:{ Exception -> 0x00ae }
            goto L_0x00ea
        L_0x00e0:
            r9.printStackTrace()     // Catch:{ Exception -> 0x00ea }
            java.lang.String r9 = r9.getLocalizedMessage()     // Catch:{ Exception -> 0x00ea }
            android.util.Log.d(r0, r9)     // Catch:{ Exception -> 0x00ea }
        L_0x00ea:
            pl.x r9 = pl.x.f30437a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ti.h.a(tl.d):java.lang.Object");
    }

    public final a0 b() {
        return this.f31542d;
    }
}
