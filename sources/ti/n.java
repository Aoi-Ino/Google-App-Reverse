package ti;

import android.app.Application;
import androidx.lifecycle.a0;
import bm.p;
import com.nic.mparivahan.dlservices.data.model.DlPhotoStatus;
import com.nic.mparivahan.dlservices.data.model.DlPhotoStatusFinalReqeust;
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

public final class n {

    /* renamed from: a  reason: collision with root package name */
    private Application f31621a;

    /* renamed from: b  reason: collision with root package name */
    private String f31622b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public String f31623c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public String f31624d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public boolean f31625e;

    /* renamed from: f  reason: collision with root package name */
    private final a0 f31626f;

    /* renamed from: g  reason: collision with root package name */
    private final int f31627g;

    static final class a extends l implements p {

        /* renamed from: f  reason: collision with root package name */
        int f31628f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ n f31629g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(n nVar, d dVar) {
            super(2, dVar);
            this.f31629g = nVar;
        }

        /* renamed from: b */
        public final Object h(d0 d0Var, d dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(x.f30437a);
        }

        public final d create(Object obj, d dVar) {
            return new a(this.f31629g, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object c10 = d.c();
            int i10 = this.f31628f;
            if (i10 == 0) {
                q.b(obj);
                if (this.f31629g.f31625e) {
                    n nVar = this.f31629g;
                    String b10 = nVar.f31623c;
                    String c11 = this.f31629g.f31624d;
                    this.f31628f = 1;
                    if (nVar.d(b10, c11, this) == c10) {
                        return c10;
                    }
                } else {
                    n nVar2 = this.f31629g;
                    this.f31628f = 2;
                    if (nVar2.e(this) == c10) {
                        return c10;
                    }
                }
            } else if (i10 == 1 || i10 == 2) {
                q.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return x.f30437a;
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: e  reason: collision with root package name */
        Object f31630e;

        /* renamed from: f  reason: collision with root package name */
        Object f31631f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f31632g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ n f31633h;

        /* renamed from: i  reason: collision with root package name */
        int f31634i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(n nVar, d dVar) {
            super(dVar);
            this.f31633h = nVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f31632g = obj;
            this.f31634i |= Integer.MIN_VALUE;
            return this.f31633h.d((String) null, (String) null, this);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: e  reason: collision with root package name */
        Object f31635e;

        /* renamed from: f  reason: collision with root package name */
        Object f31636f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f31637g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ n f31638h;

        /* renamed from: i  reason: collision with root package name */
        int f31639i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(n nVar, d dVar) {
            super(dVar);
            this.f31638h = nVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f31637g = obj;
            this.f31639i |= Integer.MIN_VALUE;
            return this.f31638h.e(this);
        }
    }

    public n(Application application, String str) {
        cm.l.f(application, "mApp");
        cm.l.f(str, "mApplNo");
        this.f31621a = application;
        this.f31622b = str;
        this.f31623c = "";
        this.f31624d = "";
        this.f31626f = new a0();
        this.f31627g = e.p(9999.0d, 99999.0d);
        k1 unused = g.d(e0.a(q0.b()), (g) null, (f0) null, new a(this, (d) null), 3, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0086 A[SYNTHETIC, Splitter:B:28:0x0086] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a9 A[Catch:{ Exception -> 0x00a7, all -> 0x00f7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object d(java.lang.String r8, java.lang.String r9, tl.d r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof ti.n.b
            if (r0 == 0) goto L_0x0013
            r0 = r10
            ti.n$b r0 = (ti.n.b) r0
            int r1 = r0.f31634i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f31634i = r1
            goto L_0x0018
        L_0x0013:
            ti.n$b r0 = new ti.n$b
            r0.<init>(r7, r10)
        L_0x0018:
            java.lang.Object r10 = r0.f31632g
            java.lang.Object r1 = ul.d.c()
            int r2 = r0.f31634i
            r3 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r8 = r0.f31631f
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r9 = r0.f31630e
            ti.n r9 = (ti.n) r9
            pl.q.b(r10)     // Catch:{ all -> 0x00f7 }
            goto L_0x0073
        L_0x0031:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0039:
            pl.q.b(r10)
            si.b$a r10 = si.b.f31257a
            android.app.Application r2 = r7.f31621a
            boolean r10 = r10.a(r2)
            if (r10 == 0) goto L_0x010e
            long r4 = java.lang.System.currentTimeMillis()
            java.lang.String r10 = java.lang.String.valueOf(r4)
            si.a$a r2 = si.a.f31253a
            android.app.Application r4 = r7.f31621a
            retrofit2.Retrofit r2 = r2.a(r4)
            java.lang.Class<com.nic.mparivahan.dlservices.data.network.DlRenewalServicesStatus> r4 = com.nic.mparivahan.dlservices.data.network.DlRenewalServicesStatus.class
            java.lang.Object r2 = r2.create(r4)
            com.nic.mparivahan.dlservices.data.network.DlRenewalServicesStatus r2 = (com.nic.mparivahan.dlservices.data.network.DlRenewalServicesStatus) r2
            com.nic.mparivahan.dlservices.data.model.DlPhotoStatusFinalReqeust r8 = r7.g(r8, r9)     // Catch:{ all -> 0x00f6 }
            r0.f31630e = r7     // Catch:{ all -> 0x00f6 }
            r0.f31631f = r10     // Catch:{ all -> 0x00f6 }
            r0.f31634i = r3     // Catch:{ all -> 0x00f6 }
            java.lang.Object r8 = r2.getDlStatusPhotoSign(r8, r10, r0)     // Catch:{ all -> 0x00f6 }
            if (r8 != r1) goto L_0x006f
            return r1
        L_0x006f:
            r9 = r7
            r6 = r10
            r10 = r8
            r8 = r6
        L_0x0073:
            com.nic.mparivahan.Security.SecModle.SecurityModle r10 = (com.nic.mparivahan.Security.SecModle.SecurityModle) r10     // Catch:{ all -> 0x00f7 }
            java.lang.String r0 = "dl_renewal_logging"
            java.lang.String r1 = r10.toString()     // Catch:{ all -> 0x00f7 }
            android.util.Log.e(r0, r1)     // Catch:{ all -> 0x00f7 }
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x00a7 }
            r1 = 26
            java.lang.String r2 = "decode(...)"
            if (r0 < r1) goto L_0x00a9
            id.c$a r0 = id.c.f12675a     // Catch:{ Exception -> 0x00a7 }
            j$.util.Base64$Decoder r1 = j$.util.Base64.getDecoder()     // Catch:{ Exception -> 0x00a7 }
            java.lang.String r10 = r10.getData()     // Catch:{ Exception -> 0x00a7 }
            byte[] r10 = r1.decode((java.lang.String) r10)     // Catch:{ Exception -> 0x00a7 }
            cm.l.e(r10, r2)     // Catch:{ Exception -> 0x00a7 }
            java.lang.String r1 = new java.lang.String     // Catch:{ Exception -> 0x00a7 }
            java.nio.charset.Charset r2 = km.d.f24740b     // Catch:{ Exception -> 0x00a7 }
            r1.<init>(r10, r2)     // Catch:{ Exception -> 0x00a7 }
            java.lang.String r8 = r0.a(r8, r1)     // Catch:{ Exception -> 0x00a7 }
        L_0x00a2:
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ Exception -> 0x00a7 }
            goto L_0x00c3
        L_0x00a7:
            r8 = move-exception
            goto L_0x00db
        L_0x00a9:
            id.c$a r0 = id.c.f12675a     // Catch:{ Exception -> 0x00a7 }
            java.lang.String r10 = r10.getData()     // Catch:{ Exception -> 0x00a7 }
            r1 = 0
            byte[] r10 = android.util.Base64.decode(r10, r1)     // Catch:{ Exception -> 0x00a7 }
            cm.l.e(r10, r2)     // Catch:{ Exception -> 0x00a7 }
            java.lang.String r1 = new java.lang.String     // Catch:{ Exception -> 0x00a7 }
            java.nio.charset.Charset r2 = km.d.f24740b     // Catch:{ Exception -> 0x00a7 }
            r1.<init>(r10, r2)     // Catch:{ Exception -> 0x00a7 }
            java.lang.String r8 = r0.a(r8, r1)     // Catch:{ Exception -> 0x00a7 }
            goto L_0x00a2
        L_0x00c3:
            java.lang.String r10 = "DecRes-"
            android.util.Log.d(r10, r8)     // Catch:{ Exception -> 0x00a7 }
            i7.d r10 = new i7.d     // Catch:{ Exception -> 0x00a7 }
            r10.<init>()     // Catch:{ Exception -> 0x00a7 }
            java.lang.Class<com.nic.mparivahan.dlservices.data.model.DlPhotoStatusDycryResponse> r0 = com.nic.mparivahan.dlservices.data.model.DlPhotoStatusDycryResponse.class
            java.lang.Object r8 = r10.j(r8, r0)     // Catch:{ Exception -> 0x00a7 }
            com.nic.mparivahan.dlservices.data.model.DlPhotoStatusDycryResponse r8 = (com.nic.mparivahan.dlservices.data.model.DlPhotoStatusDycryResponse) r8     // Catch:{ Exception -> 0x00a7 }
            androidx.lifecycle.a0 r10 = r9.f31626f     // Catch:{ Exception -> 0x00a7 }
            r10.k(r8)     // Catch:{ Exception -> 0x00a7 }
            goto L_0x010e
        L_0x00db:
            r8.printStackTrace()     // Catch:{ all -> 0x00f7 }
            com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog$a r0 = com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog.f20957k     // Catch:{ all -> 0x00f7 }
            android.app.Application r1 = r9.f31621a     // Catch:{ all -> 0x00f7 }
            v9.d$a r8 = v9.d.f17494a     // Catch:{ all -> 0x00f7 }
            java.lang.String r2 = r8.t()     // Catch:{ all -> 0x00f7 }
            java.lang.String r3 = "getDetails"
            java.lang.String r4 = r8.v()     // Catch:{ all -> 0x00f7 }
            java.lang.String r5 = r8.w()     // Catch:{ all -> 0x00f7 }
            r0.a(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x00f7 }
            goto L_0x010e
        L_0x00f6:
            r9 = r7
        L_0x00f7:
            com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog$a r0 = com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog.f20957k
            android.app.Application r1 = r9.f31621a
            v9.d$a r8 = v9.d.f17494a
            java.lang.String r2 = r8.t()
            java.lang.String r3 = "getDetails"
            java.lang.String r4 = r8.v()
            java.lang.String r5 = r8.w()
            r0.a(r1, r2, r3, r4, r5)
        L_0x010e:
            pl.x r8 = pl.x.f30437a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ti.n.d(java.lang.String, java.lang.String, tl.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0088 A[SYNTHETIC, Splitter:B:28:0x0088] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ab A[Catch:{ Exception -> 0x00a9, all -> 0x00f9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object e(tl.d r10) {
        /*
            r9 = this;
            java.lang.String r0 = ""
            boolean r1 = r10 instanceof ti.n.c
            if (r1 == 0) goto L_0x0015
            r1 = r10
            ti.n$c r1 = (ti.n.c) r1
            int r2 = r1.f31639i
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0015
            int r2 = r2 - r3
            r1.f31639i = r2
            goto L_0x001a
        L_0x0015:
            ti.n$c r1 = new ti.n$c
            r1.<init>(r9, r10)
        L_0x001a:
            java.lang.Object r10 = r1.f31637g
            java.lang.Object r2 = ul.d.c()
            int r3 = r1.f31639i
            r4 = 1
            if (r3 == 0) goto L_0x003b
            if (r3 != r4) goto L_0x0033
            java.lang.Object r0 = r1.f31636f
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r1 = r1.f31635e
            ti.n r1 = (ti.n) r1
            pl.q.b(r10)     // Catch:{ all -> 0x00f9 }
            goto L_0x0075
        L_0x0033:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x003b:
            pl.q.b(r10)
            si.b$a r10 = si.b.f31257a
            android.app.Application r3 = r9.f31621a
            boolean r10 = r10.a(r3)
            if (r10 == 0) goto L_0x0110
            long r5 = java.lang.System.currentTimeMillis()
            java.lang.String r10 = java.lang.String.valueOf(r5)
            si.a$a r3 = si.a.f31253a
            android.app.Application r5 = r9.f31621a
            retrofit2.Retrofit r3 = r3.a(r5)
            java.lang.Class<com.nic.mparivahan.dlservices.data.network.DlRenewalServicesStatus> r5 = com.nic.mparivahan.dlservices.data.network.DlRenewalServicesStatus.class
            java.lang.Object r3 = r3.create(r5)
            com.nic.mparivahan.dlservices.data.network.DlRenewalServicesStatus r3 = (com.nic.mparivahan.dlservices.data.network.DlRenewalServicesStatus) r3
            com.nic.mparivahan.dlservices.data.model.DlPhotoStatusFinalReqeust r0 = r9.g(r0, r0)     // Catch:{ all -> 0x00f8 }
            r1.f31635e = r9     // Catch:{ all -> 0x00f8 }
            r1.f31636f = r10     // Catch:{ all -> 0x00f8 }
            r1.f31639i = r4     // Catch:{ all -> 0x00f8 }
            java.lang.Object r0 = r3.getDlUploadPhotoSign(r0, r10, r1)     // Catch:{ all -> 0x00f8 }
            if (r0 != r2) goto L_0x0071
            return r2
        L_0x0071:
            r1 = r9
            r8 = r0
            r0 = r10
            r10 = r8
        L_0x0075:
            com.nic.mparivahan.Security.SecModle.SecurityModle r10 = (com.nic.mparivahan.Security.SecModle.SecurityModle) r10     // Catch:{ all -> 0x00f9 }
            java.lang.String r2 = "_update"
            java.lang.String r3 = r10.toString()     // Catch:{ all -> 0x00f9 }
            android.util.Log.d(r2, r3)     // Catch:{ all -> 0x00f9 }
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x00a9 }
            r3 = 26
            java.lang.String r4 = "decode(...)"
            if (r2 < r3) goto L_0x00ab
            id.c$a r2 = id.c.f12675a     // Catch:{ Exception -> 0x00a9 }
            j$.util.Base64$Decoder r3 = j$.util.Base64.getDecoder()     // Catch:{ Exception -> 0x00a9 }
            java.lang.String r10 = r10.getData()     // Catch:{ Exception -> 0x00a9 }
            byte[] r10 = r3.decode((java.lang.String) r10)     // Catch:{ Exception -> 0x00a9 }
            cm.l.e(r10, r4)     // Catch:{ Exception -> 0x00a9 }
            java.lang.String r3 = new java.lang.String     // Catch:{ Exception -> 0x00a9 }
            java.nio.charset.Charset r4 = km.d.f24740b     // Catch:{ Exception -> 0x00a9 }
            r3.<init>(r10, r4)     // Catch:{ Exception -> 0x00a9 }
            java.lang.String r10 = r2.a(r0, r3)     // Catch:{ Exception -> 0x00a9 }
        L_0x00a4:
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch:{ Exception -> 0x00a9 }
            goto L_0x00c5
        L_0x00a9:
            r10 = move-exception
            goto L_0x00dd
        L_0x00ab:
            id.c$a r2 = id.c.f12675a     // Catch:{ Exception -> 0x00a9 }
            java.lang.String r10 = r10.getData()     // Catch:{ Exception -> 0x00a9 }
            r3 = 0
            byte[] r10 = android.util.Base64.decode(r10, r3)     // Catch:{ Exception -> 0x00a9 }
            cm.l.e(r10, r4)     // Catch:{ Exception -> 0x00a9 }
            java.lang.String r3 = new java.lang.String     // Catch:{ Exception -> 0x00a9 }
            java.nio.charset.Charset r4 = km.d.f24740b     // Catch:{ Exception -> 0x00a9 }
            r3.<init>(r10, r4)     // Catch:{ Exception -> 0x00a9 }
            java.lang.String r10 = r2.a(r0, r3)     // Catch:{ Exception -> 0x00a9 }
            goto L_0x00a4
        L_0x00c5:
            java.lang.String r0 = "DecRes-"
            android.util.Log.d(r0, r10)     // Catch:{ Exception -> 0x00a9 }
            i7.d r0 = new i7.d     // Catch:{ Exception -> 0x00a9 }
            r0.<init>()     // Catch:{ Exception -> 0x00a9 }
            java.lang.Class<com.nic.mparivahan.dlservices.data.model.DlPhotoStatusDycryResponse> r2 = com.nic.mparivahan.dlservices.data.model.DlPhotoStatusDycryResponse.class
            java.lang.Object r10 = r0.j(r10, r2)     // Catch:{ Exception -> 0x00a9 }
            com.nic.mparivahan.dlservices.data.model.DlPhotoStatusDycryResponse r10 = (com.nic.mparivahan.dlservices.data.model.DlPhotoStatusDycryResponse) r10     // Catch:{ Exception -> 0x00a9 }
            androidx.lifecycle.a0 r0 = r1.f31626f     // Catch:{ Exception -> 0x00a9 }
            r0.k(r10)     // Catch:{ Exception -> 0x00a9 }
            goto L_0x0110
        L_0x00dd:
            r10.printStackTrace()     // Catch:{ all -> 0x00f9 }
            com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog$a r2 = com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog.f20957k     // Catch:{ all -> 0x00f9 }
            android.app.Application r3 = r1.f31621a     // Catch:{ all -> 0x00f9 }
            v9.d$a r10 = v9.d.f17494a     // Catch:{ all -> 0x00f9 }
            java.lang.String r4 = r10.t()     // Catch:{ all -> 0x00f9 }
            java.lang.String r5 = "getImage"
            java.lang.String r6 = r10.v()     // Catch:{ all -> 0x00f9 }
            java.lang.String r7 = r10.w()     // Catch:{ all -> 0x00f9 }
            r2.a(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x00f9 }
            goto L_0x0110
        L_0x00f8:
            r1 = r9
        L_0x00f9:
            com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog$a r2 = com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog.f20957k
            android.app.Application r3 = r1.f31621a
            v9.d$a r10 = v9.d.f17494a
            java.lang.String r4 = r10.t()
            java.lang.String r5 = "getImage"
            java.lang.String r6 = r10.v()
            java.lang.String r7 = r10.w()
            r2.a(r3, r4, r5, r6, r7)
        L_0x0110:
            pl.x r10 = pl.x.f30437a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ti.n.e(tl.d):java.lang.Object");
    }

    public final a0 f() {
        return this.f31626f;
    }

    public final DlPhotoStatusFinalReqeust g(String str, String str2) {
        cm.l.f(str, "mApplDob");
        cm.l.f(str2, "mApplRtoCd");
        String h10 = e.h((this.f31625e ? new DlPhotoStatus(this.f31622b, str, str2) : new DlPhotoStatus(this.f31622b)).toString(), h());
        String i10 = e.i(this.f31627g);
        if (h10 == null) {
            h10 = "";
        }
        if (i10 == null) {
            i10 = "";
        }
        return new DlPhotoStatusFinalReqeust(h10, i10);
    }

    public final String h() {
        return e.l(this.f31627g);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public n(Application application, String str, String str2, String str3) {
        this(application, str);
        cm.l.f(application, "mApp");
        cm.l.f(str, "mApplNo");
        cm.l.f(str2, "mApplDob");
        cm.l.f(str3, "mApplRtoCd");
        this.f31623c = str2;
        this.f31624d = str3;
        this.f31625e = true;
    }
}
