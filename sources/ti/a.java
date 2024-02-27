package ti;

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

public final class a {
    private String A;
    private String B;
    private String C;
    private String D;
    private String E;
    private final a0 F = new a0();

    /* renamed from: a  reason: collision with root package name */
    private Application f31426a;

    /* renamed from: b  reason: collision with root package name */
    private String f31427b;

    /* renamed from: c  reason: collision with root package name */
    private String f31428c;

    /* renamed from: d  reason: collision with root package name */
    private String f31429d;

    /* renamed from: e  reason: collision with root package name */
    private String f31430e;

    /* renamed from: f  reason: collision with root package name */
    private String f31431f;

    /* renamed from: g  reason: collision with root package name */
    private String f31432g;

    /* renamed from: h  reason: collision with root package name */
    private String f31433h;

    /* renamed from: i  reason: collision with root package name */
    private String f31434i;

    /* renamed from: j  reason: collision with root package name */
    private String f31435j;

    /* renamed from: k  reason: collision with root package name */
    private String f31436k;

    /* renamed from: l  reason: collision with root package name */
    private String f31437l;

    /* renamed from: m  reason: collision with root package name */
    private String f31438m;

    /* renamed from: n  reason: collision with root package name */
    private String f31439n;

    /* renamed from: o  reason: collision with root package name */
    private String f31440o;

    /* renamed from: p  reason: collision with root package name */
    private String f31441p;

    /* renamed from: q  reason: collision with root package name */
    private String f31442q;

    /* renamed from: r  reason: collision with root package name */
    private String f31443r;

    /* renamed from: s  reason: collision with root package name */
    private String f31444s;

    /* renamed from: t  reason: collision with root package name */
    private String f31445t;

    /* renamed from: u  reason: collision with root package name */
    private String f31446u;

    /* renamed from: v  reason: collision with root package name */
    private String f31447v;

    /* renamed from: w  reason: collision with root package name */
    private String f31448w;

    /* renamed from: x  reason: collision with root package name */
    private String f31449x;

    /* renamed from: y  reason: collision with root package name */
    private String f31450y;

    /* renamed from: z  reason: collision with root package name */
    private String f31451z;

    /* renamed from: ti.a$a  reason: collision with other inner class name */
    static final class C0355a extends l implements p {

        /* renamed from: f  reason: collision with root package name */
        int f31452f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ a f31453g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0355a(a aVar, d dVar) {
            super(2, dVar);
            this.f31453g = aVar;
        }

        /* renamed from: b */
        public final Object h(d0 d0Var, d dVar) {
            return ((C0355a) create(d0Var, dVar)).invokeSuspend(x.f30437a);
        }

        public final d create(Object obj, d dVar) {
            return new C0355a(this.f31453g, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object c10 = d.c();
            int i10 = this.f31452f;
            if (i10 == 0) {
                q.b(obj);
                a aVar = this.f31453g;
                this.f31452f = 1;
                if (aVar.c(this) == c10) {
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
        Object f31454e;

        /* renamed from: f  reason: collision with root package name */
        Object f31455f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f31456g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ a f31457h;

        /* renamed from: i  reason: collision with root package name */
        int f31458i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar, d dVar) {
            super(dVar);
            this.f31457h = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f31456g = obj;
            this.f31458i |= Integer.MIN_VALUE;
            return this.f31457h.c(this);
        }
    }

    public a(Application application, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30) {
        Application application2 = application;
        String str31 = str;
        String str32 = str2;
        String str33 = str3;
        String str34 = str4;
        String str35 = str5;
        String str36 = str6;
        String str37 = str7;
        String str38 = str8;
        String str39 = str9;
        String str40 = str10;
        String str41 = str11;
        String str42 = str12;
        String str43 = str13;
        String str44 = str15;
        cm.l.f(application2, "mApp");
        cm.l.f(str31, "dlno");
        cm.l.f(str32, "dob");
        cm.l.f(str33, "rtoCodeDLTr");
        cm.l.f(str34, "applcatgDLserReq");
        cm.l.f(str35, "changeOfAddReq");
        cm.l.f(str36, "perHouseNo");
        cm.l.f(str37, "perStreet");
        cm.l.f(str38, "perLocation");
        cm.l.f(str39, "permVillageOrTown");
        cm.l.f(str40, "perSubDistrict");
        cm.l.f(str41, "perDistrict");
        cm.l.f(str42, "perState");
        cm.l.f(str43, "perPinCode");
        cm.l.f(str14, "presHouseNo");
        cm.l.f(str15, "presStreet");
        cm.l.f(str16, "presLocation");
        cm.l.f(str17, "presVillageOrTown");
        cm.l.f(str18, "presSubDistrict");
        cm.l.f(str19, "presDistrict");
        cm.l.f(str20, "presState");
        cm.l.f(str21, "presPincode");
        cm.l.f(str22, "agentId");
        cm.l.f(str23, "agentIpAddress");
        cm.l.f(str24, "agentPwd");
        cm.l.f(str25, "agentServiceName");
        cm.l.f(str26, "mobileNumber");
        cm.l.f(str27, "eKYCId");
        cm.l.f(str28, "eKYCOpted");
        cm.l.f(str29, "eKYCGender");
        cm.l.f(str30, "eKYCPhoto");
        this.f31426a = application2;
        this.f31427b = str31;
        this.f31428c = str32;
        this.f31429d = str33;
        this.f31430e = str34;
        this.f31431f = str35;
        this.f31432g = str36;
        this.f31433h = str37;
        this.f31434i = str38;
        this.f31435j = str39;
        this.f31436k = str40;
        this.f31437l = str41;
        this.f31438m = str42;
        this.f31439n = str43;
        this.f31440o = str14;
        this.f31441p = str15;
        this.f31442q = str16;
        this.f31443r = str17;
        this.f31444s = str18;
        this.f31445t = str19;
        this.f31446u = str20;
        this.f31447v = str21;
        this.f31448w = str22;
        this.f31449x = str23;
        this.f31450y = str24;
        this.f31451z = str25;
        this.A = str26;
        this.B = str27;
        this.C = str28;
        this.D = str29;
        this.E = str30;
        k1 unused = g.d(e0.a(q0.b()), (g) null, (f0) null, new C0355a(this, (d) null), 3, (Object) null);
    }

    public final a0 a() {
        return this.F;
    }

    public final kj.b b() {
        kj.a aVar = new kj.a((String) null, 1, (cm.g) null);
        aVar.a("Change of Address in DL");
        kj.b bVar = new kj.b((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (kj.a) null, (String) null, (String) null, (String) null, (String) null, Integer.MAX_VALUE, (cm.g) null);
        bVar.g(this.f31427b);
        bVar.h(this.f31428c);
        bVar.z(this.f31429d);
        bVar.e(this.f31430e);
        bVar.f(this.f31431f);
        bVar.k(this.f31432g);
        bVar.o(this.f31433h);
        bVar.l(this.f31434i);
        bVar.q(this.f31435j);
        bVar.p(this.f31436k);
        bVar.j(this.f31437l);
        bVar.n(this.f31438m);
        bVar.m(this.f31439n);
        bVar.s(this.f31440o);
        bVar.w(this.f31441p);
        bVar.t(this.f31442q);
        bVar.y(this.f31443r);
        bVar.x(this.f31444s);
        bVar.r(this.f31445t);
        bVar.v(this.f31446u);
        bVar.u(this.f31447v);
        bVar.a(this.f31448w);
        bVar.b(this.f31449x);
        bVar.c(this.f31450y);
        bVar.d(this.f31451z);
        bVar.i(this.A);
        bVar.A(aVar);
        Log.d("Coa Request", bVar.toString());
        return bVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0075 A[SYNTHETIC, Splitter:B:27:0x0075] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0098 A[Catch:{ Exception -> 0x0096 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(tl.d r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof ti.a.b
            if (r0 == 0) goto L_0x0013
            r0 = r9
            ti.a$b r0 = (ti.a.b) r0
            int r1 = r0.f31458i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f31458i = r1
            goto L_0x0018
        L_0x0013:
            ti.a$b r0 = new ti.a$b
            r0.<init>(r8, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f31456g
            java.lang.Object r1 = ul.d.c()
            int r2 = r0.f31458i
            r3 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 != r3) goto L_0x0034
            java.lang.Object r1 = r0.f31455f
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.f31454e
            ti.a r0 = (ti.a) r0
            pl.q.b(r9)     // Catch:{ Exception -> 0x0031 }
            goto L_0x006b
        L_0x0031:
            r9 = move-exception
            goto L_0x00f0
        L_0x0034:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x003c:
            pl.q.b(r9)
            long r4 = java.lang.System.currentTimeMillis()
            java.lang.String r9 = java.lang.String.valueOf(r4)
            si.a$a r2 = si.a.f31253a
            android.app.Application r4 = r8.f31426a
            retrofit2.Retrofit r2 = r2.a(r4)
            java.lang.Class<com.nic.mparivahan.dlservices.data.network.DlRenewalServices> r4 = com.nic.mparivahan.dlservices.data.network.DlRenewalServices.class
            java.lang.Object r2 = r2.create(r4)
            com.nic.mparivahan.dlservices.data.network.DlRenewalServices r2 = (com.nic.mparivahan.dlservices.data.network.DlRenewalServices) r2
            kj.b r4 = r8.b()     // Catch:{ Exception -> 0x00ee }
            r0.f31454e = r8     // Catch:{ Exception -> 0x00ee }
            r0.f31455f = r9     // Catch:{ Exception -> 0x00ee }
            r0.f31458i = r3     // Catch:{ Exception -> 0x00ee }
            java.lang.Object r0 = r2.saveCOA(r4, r9, r0)     // Catch:{ Exception -> 0x00ee }
            if (r0 != r1) goto L_0x0068
            return r1
        L_0x0068:
            r1 = r9
            r9 = r0
            r0 = r8
        L_0x006b:
            com.nic.mparivahan.Security.SecModle.SecurityModle r9 = (com.nic.mparivahan.Security.SecModle.SecurityModle) r9     // Catch:{ Exception -> 0x0031 }
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0096 }
            r3 = 26
            java.lang.String r4 = "decode(...)"
            if (r2 < r3) goto L_0x0098
            id.c$a r2 = id.c.f12675a     // Catch:{ Exception -> 0x0096 }
            j$.util.Base64$Decoder r3 = j$.util.Base64.getDecoder()     // Catch:{ Exception -> 0x0096 }
            java.lang.String r9 = r9.getData()     // Catch:{ Exception -> 0x0096 }
            byte[] r9 = r3.decode((java.lang.String) r9)     // Catch:{ Exception -> 0x0096 }
            cm.l.e(r9, r4)     // Catch:{ Exception -> 0x0096 }
            java.lang.String r3 = new java.lang.String     // Catch:{ Exception -> 0x0096 }
            java.nio.charset.Charset r4 = km.d.f24740b     // Catch:{ Exception -> 0x0096 }
            r3.<init>(r9, r4)     // Catch:{ Exception -> 0x0096 }
            java.lang.String r9 = r2.a(r1, r3)     // Catch:{ Exception -> 0x0096 }
        L_0x0091:
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ Exception -> 0x0096 }
            goto L_0x00b2
        L_0x0096:
            r9 = move-exception
            goto L_0x00ca
        L_0x0098:
            id.c$a r2 = id.c.f12675a     // Catch:{ Exception -> 0x0096 }
            java.lang.String r9 = r9.getData()     // Catch:{ Exception -> 0x0096 }
            r3 = 0
            byte[] r9 = android.util.Base64.decode(r9, r3)     // Catch:{ Exception -> 0x0096 }
            cm.l.e(r9, r4)     // Catch:{ Exception -> 0x0096 }
            java.lang.String r3 = new java.lang.String     // Catch:{ Exception -> 0x0096 }
            java.nio.charset.Charset r4 = km.d.f24740b     // Catch:{ Exception -> 0x0096 }
            r3.<init>(r9, r4)     // Catch:{ Exception -> 0x0096 }
            java.lang.String r9 = r2.a(r1, r3)     // Catch:{ Exception -> 0x0096 }
            goto L_0x0091
        L_0x00b2:
            java.lang.String r1 = "coa_resp"
            android.util.Log.d(r1, r9)     // Catch:{ Exception -> 0x0096 }
            i7.d r1 = new i7.d     // Catch:{ Exception -> 0x0096 }
            r1.<init>()     // Catch:{ Exception -> 0x0096 }
            java.lang.Class<com.nic.mparivahan.dlservices.data.model.DlRenewalSaveDto> r2 = com.nic.mparivahan.dlservices.data.model.DlRenewalSaveDto.class
            java.lang.Object r9 = r1.j(r9, r2)     // Catch:{ Exception -> 0x0096 }
            com.nic.mparivahan.dlservices.data.model.DlRenewalSaveDto r9 = (com.nic.mparivahan.dlservices.data.model.DlRenewalSaveDto) r9     // Catch:{ Exception -> 0x0096 }
            androidx.lifecycle.a0 r1 = r0.F     // Catch:{ Exception -> 0x0096 }
            r1.k(r9)     // Catch:{ Exception -> 0x0096 }
            goto L_0x0116
        L_0x00ca:
            r9.printStackTrace()     // Catch:{ Exception -> 0x0031 }
            java.lang.String r1 = "coa_resp_error"
            java.lang.String r9 = r9.getLocalizedMessage()     // Catch:{ Exception -> 0x0031 }
            android.util.Log.d(r1, r9)     // Catch:{ Exception -> 0x0031 }
            com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog$a r2 = com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog.f20957k     // Catch:{ Exception -> 0x0031 }
            android.app.Application r3 = r0.f31426a     // Catch:{ Exception -> 0x0031 }
            v9.d$a r9 = v9.d.f17494a     // Catch:{ Exception -> 0x0031 }
            java.lang.String r4 = r9.t()     // Catch:{ Exception -> 0x0031 }
            java.lang.String r5 = "getAckDetForGivenDLNumber"
            java.lang.String r6 = r9.v()     // Catch:{ Exception -> 0x0031 }
            java.lang.String r7 = r9.w()     // Catch:{ Exception -> 0x0031 }
            r2.a(r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x0031 }
            goto L_0x0116
        L_0x00ee:
            r9 = move-exception
            r0 = r8
        L_0x00f0:
            java.lang.String r9 = r9.getMessage()
            if (r9 == 0) goto L_0x00ff
            java.lang.String r1 = "dl_renewal_logginga"
            int r9 = android.util.Log.e(r1, r9)
            kotlin.coroutines.jvm.internal.b.b(r9)
        L_0x00ff:
            com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog$a r1 = com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog.f20957k
            android.app.Application r2 = r0.f31426a
            v9.d$a r9 = v9.d.f17494a
            java.lang.String r3 = r9.t()
            java.lang.String r4 = "getAckDetForGivenDLNumber"
            java.lang.String r5 = r9.v()
            java.lang.String r6 = r9.w()
            r1.a(r2, r3, r4, r5, r6)
        L_0x0116:
            pl.x r9 = pl.x.f30437a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ti.a.c(tl.d):java.lang.Object");
    }
}
