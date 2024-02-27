package ti;

import android.app.Application;
import androidx.lifecycle.a0;
import bm.p;
import com.nic.mparivahan.dlservices.data.model.DlVillageOrTown;
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

public final class m {

    /* renamed from: a  reason: collision with root package name */
    private final Application f31604a;

    /* renamed from: b  reason: collision with root package name */
    private String f31605b;

    /* renamed from: c  reason: collision with root package name */
    private String f31606c;

    /* renamed from: d  reason: collision with root package name */
    private String f31607d;

    /* renamed from: e  reason: collision with root package name */
    private String f31608e;

    /* renamed from: f  reason: collision with root package name */
    private String f31609f;

    /* renamed from: g  reason: collision with root package name */
    private String f31610g;

    /* renamed from: h  reason: collision with root package name */
    private String f31611h;

    /* renamed from: i  reason: collision with root package name */
    private String f31612i;

    /* renamed from: j  reason: collision with root package name */
    private final a0 f31613j;

    static final class a extends l implements p {

        /* renamed from: f  reason: collision with root package name */
        int f31614f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ m f31615g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(m mVar, d dVar) {
            super(2, dVar);
            this.f31615g = mVar;
        }

        /* renamed from: b */
        public final Object h(d0 d0Var, d dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(x.f30437a);
        }

        public final d create(Object obj, d dVar) {
            return new a(this.f31615g, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object c10 = d.c();
            int i10 = this.f31614f;
            if (i10 == 0) {
                q.b(obj);
                m mVar = this.f31615g;
                this.f31614f = 1;
                if (mVar.a(this) == c10) {
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
        Object f31616e;

        /* renamed from: f  reason: collision with root package name */
        Object f31617f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f31618g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ m f31619h;

        /* renamed from: i  reason: collision with root package name */
        int f31620i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(m mVar, d dVar) {
            super(dVar);
            this.f31619h = mVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f31618g = obj;
            this.f31620i |= Integer.MIN_VALUE;
            return this.f31619h.a(this);
        }
    }

    public m(Application application, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        cm.l.f(application, "app");
        cm.l.f(str, "stCode");
        cm.l.f(str2, "distCode");
        cm.l.f(str3, "subDistCode");
        cm.l.f(str4, "villageOrTown");
        cm.l.f(str5, "agentId");
        cm.l.f(str6, "agentPwd");
        cm.l.f(str7, "agentIpAddress");
        cm.l.f(str8, "agentServiceName");
        this.f31604a = application;
        this.f31605b = str;
        this.f31606c = str2;
        this.f31607d = str3;
        this.f31608e = str4;
        this.f31609f = str5;
        this.f31610g = str6;
        this.f31611h = str7;
        this.f31612i = str8;
        this.f31613j = new a0();
        k1 unused = g.d(e0.a(q0.b()), (g) null, (f0) null, new a(this, (d) null), 3, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x008a A[SYNTHETIC, Splitter:B:29:0x008a] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ad A[Catch:{ Exception -> 0x00ab }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(tl.d r9) {
        /*
            r8 = this;
            java.lang.String r0 = "DecRes-"
            boolean r1 = r9 instanceof ti.m.b
            if (r1 == 0) goto L_0x0015
            r1 = r9
            ti.m$b r1 = (ti.m.b) r1
            int r2 = r1.f31620i
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0015
            int r2 = r2 - r3
            r1.f31620i = r2
            goto L_0x001a
        L_0x0015:
            ti.m$b r1 = new ti.m$b
            r1.<init>(r8, r9)
        L_0x001a:
            java.lang.Object r9 = r1.f31618g
            java.lang.Object r2 = ul.d.c()
            int r3 = r1.f31620i
            r4 = 1
            if (r3 == 0) goto L_0x003e
            if (r3 != r4) goto L_0x0036
            java.lang.Object r2 = r1.f31617f
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r1.f31616e
            ti.m r1 = (ti.m) r1
            pl.q.b(r9)     // Catch:{ Exception -> 0x0033 }
            goto L_0x0077
        L_0x0033:
            r9 = move-exception
            goto L_0x0101
        L_0x0036:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x003e:
            pl.q.b(r9)
            si.b$a r9 = si.b.f31257a
            android.app.Application r3 = r8.f31604a
            boolean r9 = r9.a(r3)
            if (r9 == 0) goto L_0x0127
            long r5 = java.lang.System.currentTimeMillis()
            java.lang.String r9 = java.lang.String.valueOf(r5)
            si.a$a r3 = si.a.f31253a
            android.app.Application r5 = r8.f31604a
            retrofit2.Retrofit r3 = r3.a(r5)
            java.lang.Class<com.nic.mparivahan.dlservices.data.network.DlOtherService> r5 = com.nic.mparivahan.dlservices.data.network.DlOtherService.class
            java.lang.Object r3 = r3.create(r5)
            com.nic.mparivahan.dlservices.data.network.DlOtherService r3 = (com.nic.mparivahan.dlservices.data.network.DlOtherService) r3
            com.nic.mparivahan.dlservices.data.model.DlVillageOrTown r5 = r8.c()     // Catch:{ Exception -> 0x00ff }
            r1.f31616e = r8     // Catch:{ Exception -> 0x00ff }
            r1.f31617f = r9     // Catch:{ Exception -> 0x00ff }
            r1.f31620i = r4     // Catch:{ Exception -> 0x00ff }
            java.lang.Object r1 = r3.getVillageOrTown(r5, r9, r1)     // Catch:{ Exception -> 0x00ff }
            if (r1 != r2) goto L_0x0074
            return r2
        L_0x0074:
            r2 = r9
            r9 = r1
            r1 = r8
        L_0x0077:
            com.nic.mparivahan.Security.SecModle.SecurityModle r9 = (com.nic.mparivahan.Security.SecModle.SecurityModle) r9     // Catch:{ Exception -> 0x0033 }
            java.lang.String r3 = "_update"
            java.lang.String r4 = r9.toString()     // Catch:{ Exception -> 0x0033 }
            android.util.Log.d(r3, r4)     // Catch:{ Exception -> 0x0033 }
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x00ab }
            r4 = 26
            java.lang.String r5 = "decode(...)"
            if (r3 < r4) goto L_0x00ad
            id.c$a r3 = id.c.f12675a     // Catch:{ Exception -> 0x00ab }
            j$.util.Base64$Decoder r4 = j$.util.Base64.getDecoder()     // Catch:{ Exception -> 0x00ab }
            java.lang.String r9 = r9.getData()     // Catch:{ Exception -> 0x00ab }
            byte[] r9 = r4.decode((java.lang.String) r9)     // Catch:{ Exception -> 0x00ab }
            cm.l.e(r9, r5)     // Catch:{ Exception -> 0x00ab }
            java.lang.String r4 = new java.lang.String     // Catch:{ Exception -> 0x00ab }
            java.nio.charset.Charset r5 = km.d.f24740b     // Catch:{ Exception -> 0x00ab }
            r4.<init>(r9, r5)     // Catch:{ Exception -> 0x00ab }
            java.lang.String r9 = r3.a(r2, r4)     // Catch:{ Exception -> 0x00ab }
        L_0x00a6:
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ Exception -> 0x00ab }
            goto L_0x00c7
        L_0x00ab:
            r9 = move-exception
            goto L_0x00dd
        L_0x00ad:
            id.c$a r3 = id.c.f12675a     // Catch:{ Exception -> 0x00ab }
            java.lang.String r9 = r9.getData()     // Catch:{ Exception -> 0x00ab }
            r4 = 0
            byte[] r9 = android.util.Base64.decode(r9, r4)     // Catch:{ Exception -> 0x00ab }
            cm.l.e(r9, r5)     // Catch:{ Exception -> 0x00ab }
            java.lang.String r4 = new java.lang.String     // Catch:{ Exception -> 0x00ab }
            java.nio.charset.Charset r5 = km.d.f24740b     // Catch:{ Exception -> 0x00ab }
            r4.<init>(r9, r5)     // Catch:{ Exception -> 0x00ab }
            java.lang.String r9 = r3.a(r2, r4)     // Catch:{ Exception -> 0x00ab }
            goto L_0x00a6
        L_0x00c7:
            android.util.Log.d(r0, r9)     // Catch:{ Exception -> 0x00ab }
            i7.d r2 = new i7.d     // Catch:{ Exception -> 0x00ab }
            r2.<init>()     // Catch:{ Exception -> 0x00ab }
            java.lang.Class<com.nic.mparivahan.dlservices.data.model.VillageOrTownResponse> r3 = com.nic.mparivahan.dlservices.data.model.VillageOrTownResponse.class
            java.lang.Object r9 = r2.j(r9, r3)     // Catch:{ Exception -> 0x00ab }
            com.nic.mparivahan.dlservices.data.model.VillageOrTownResponse r9 = (com.nic.mparivahan.dlservices.data.model.VillageOrTownResponse) r9     // Catch:{ Exception -> 0x00ab }
            androidx.lifecycle.a0 r2 = r1.f31613j     // Catch:{ Exception -> 0x00ab }
            r2.k(r9)     // Catch:{ Exception -> 0x00ab }
            goto L_0x0127
        L_0x00dd:
            r9.printStackTrace()     // Catch:{ Exception -> 0x0033 }
            java.lang.String r9 = r9.getLocalizedMessage()     // Catch:{ Exception -> 0x0033 }
            android.util.Log.d(r0, r9)     // Catch:{ Exception -> 0x0033 }
            com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog$a r2 = com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog.f20957k     // Catch:{ Exception -> 0x0033 }
            android.app.Application r3 = r1.f31604a     // Catch:{ Exception -> 0x0033 }
            v9.d$a r9 = v9.d.f17494a     // Catch:{ Exception -> 0x0033 }
            java.lang.String r4 = r9.t()     // Catch:{ Exception -> 0x0033 }
            java.lang.String r5 = "villageOrTownMast"
            java.lang.String r6 = r9.v()     // Catch:{ Exception -> 0x0033 }
            java.lang.String r7 = r9.w()     // Catch:{ Exception -> 0x0033 }
            r2.a(r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x0033 }
            goto L_0x0127
        L_0x00ff:
            r9 = move-exception
            r1 = r8
        L_0x0101:
            java.lang.String r9 = r9.getMessage()
            if (r9 == 0) goto L_0x0110
            java.lang.String r0 = "dl_renewal_logginga"
            int r9 = android.util.Log.e(r0, r9)
            kotlin.coroutines.jvm.internal.b.b(r9)
        L_0x0110:
            com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog$a r2 = com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog.f20957k
            android.app.Application r3 = r1.f31604a
            v9.d$a r9 = v9.d.f17494a
            java.lang.String r4 = r9.t()
            java.lang.String r5 = "villageOrTownMast"
            java.lang.String r6 = r9.v()
            java.lang.String r7 = r9.w()
            r2.a(r3, r4, r5, r6, r7)
        L_0x0127:
            pl.x r9 = pl.x.f30437a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ti.m.a(tl.d):java.lang.Object");
    }

    public final a0 b() {
        return this.f31613j;
    }

    public final DlVillageOrTown c() {
        return new DlVillageOrTown(this.f31609f, this.f31610g, this.f31611h, this.f31612i, this.f31605b, this.f31606c, this.f31607d, this.f31608e);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ m(android.app.Application r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, int r22, cm.g r23) {
        /*
            r12 = this;
            r0 = r22
            r1 = r0 & 32
            if (r1 == 0) goto L_0x000a
            java.lang.String r1 = "DelhTrans"
            r8 = r1
            goto L_0x000c
        L_0x000a:
            r8 = r18
        L_0x000c:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0014
            java.lang.String r1 = "d9fe1613399b0883e4ecf3f710e18317"
            r9 = r1
            goto L_0x0016
        L_0x0014:
            r9 = r19
        L_0x0016:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x001e
            java.lang.String r1 = "164.100.161.142"
            r10 = r1
            goto L_0x0020
        L_0x001e:
            r10 = r20
        L_0x0020:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0028
            java.lang.String r0 = "sarathiservice"
            r11 = r0
            goto L_0x002a
        L_0x0028:
            r11 = r21
        L_0x002a:
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ti.m.<init>(android.app.Application, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, cm.g):void");
    }
}
