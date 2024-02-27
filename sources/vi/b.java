package vi;

import android.app.Application;
import android.util.Log;
import androidx.lifecycle.a0;
import bm.p;
import com.nic.mparivahan.dlservices.data.repo.hillpackage.HillRequest;
import com.nic.mparivahan.dlservices.data.repo.hillpackage.HillSelectedList;
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

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final Application f32348a;

    /* renamed from: b  reason: collision with root package name */
    private String f32349b;

    /* renamed from: c  reason: collision with root package name */
    private String f32350c;

    /* renamed from: d  reason: collision with root package name */
    private String f32351d;

    /* renamed from: e  reason: collision with root package name */
    private String f32352e;

    /* renamed from: f  reason: collision with root package name */
    private String f32353f;

    /* renamed from: g  reason: collision with root package name */
    private String f32354g;

    /* renamed from: h  reason: collision with root package name */
    private String f32355h;

    /* renamed from: i  reason: collision with root package name */
    private String f32356i;

    /* renamed from: j  reason: collision with root package name */
    private String f32357j;

    /* renamed from: k  reason: collision with root package name */
    private String f32358k;

    /* renamed from: l  reason: collision with root package name */
    private String f32359l;

    /* renamed from: m  reason: collision with root package name */
    private String f32360m;

    /* renamed from: n  reason: collision with root package name */
    private String f32361n;

    /* renamed from: o  reason: collision with root package name */
    private String f32362o;

    /* renamed from: p  reason: collision with root package name */
    private String f32363p;

    /* renamed from: q  reason: collision with root package name */
    private String f32364q;

    /* renamed from: r  reason: collision with root package name */
    private String f32365r;

    /* renamed from: s  reason: collision with root package name */
    private String f32366s;

    /* renamed from: t  reason: collision with root package name */
    private String f32367t;

    /* renamed from: u  reason: collision with root package name */
    private String f32368u;

    /* renamed from: v  reason: collision with root package name */
    private String f32369v;

    /* renamed from: w  reason: collision with root package name */
    private String f32370w;

    /* renamed from: x  reason: collision with root package name */
    public String f32371x;

    /* renamed from: y  reason: collision with root package name */
    private final a0 f32372y = new a0();

    static final class a extends l implements p {

        /* renamed from: f  reason: collision with root package name */
        int f32373f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ b f32374g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar, d dVar) {
            super(2, dVar);
            this.f32374g = bVar;
        }

        /* renamed from: b */
        public final Object h(d0 d0Var, d dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(x.f30437a);
        }

        public final d create(Object obj, d dVar) {
            return new a(this.f32374g, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object c10 = d.c();
            int i10 = this.f32373f;
            if (i10 == 0) {
                q.b(obj);
                b bVar = this.f32374g;
                this.f32373f = 1;
                if (bVar.a(this) == c10) {
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

    /* renamed from: vi.b$b  reason: collision with other inner class name */
    static final class C0370b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: e  reason: collision with root package name */
        Object f32375e;

        /* renamed from: f  reason: collision with root package name */
        Object f32376f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f32377g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ b f32378h;

        /* renamed from: i  reason: collision with root package name */
        int f32379i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0370b(b bVar, d dVar) {
            super(dVar);
            this.f32378h = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f32377g = obj;
            this.f32379i |= Integer.MIN_VALUE;
            return this.f32378h.a(this);
        }
    }

    public b(Application application, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22) {
        String str23 = str19;
        String str24 = str20;
        String str25 = str21;
        String str26 = str22;
        cm.l.f(application, "app");
        cm.l.f(str23, "eKYCId");
        cm.l.f(str24, "eKYCOpted");
        cm.l.f(str25, "eKYCGender");
        cm.l.f(str26, "eKYCPhoto");
        this.f32348a = application;
        this.f32349b = str;
        this.f32350c = str2;
        this.f32351d = str3;
        this.f32352e = str4;
        this.f32353f = str5;
        this.f32354g = str6;
        this.f32355h = str7;
        this.f32356i = str8;
        this.f32357j = str9;
        this.f32358k = str10;
        this.f32359l = str11;
        this.f32360m = str12;
        this.f32361n = str13;
        this.f32362o = str14;
        this.f32363p = str15;
        this.f32364q = str16;
        this.f32365r = str17;
        this.f32366s = str18;
        this.f32367t = str23;
        this.f32368u = str24;
        this.f32369v = str25;
        this.f32370w = str26;
        k1 unused = g.d(e0.a(q0.b()), (g) null, (f0) null, new a(this, (d) null), 3, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007f A[SYNTHETIC, Splitter:B:29:0x007f] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a2 A[Catch:{ Exception -> 0x00a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(tl.d r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof vi.b.C0370b
            if (r0 == 0) goto L_0x0013
            r0 = r8
            vi.b$b r0 = (vi.b.C0370b) r0
            int r1 = r0.f32379i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f32379i = r1
            goto L_0x0018
        L_0x0013:
            vi.b$b r0 = new vi.b$b
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f32377g
            java.lang.Object r1 = ul.d.c()
            int r2 = r0.f32379i
            r3 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 != r3) goto L_0x0034
            java.lang.Object r1 = r0.f32376f
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.f32375e
            vi.b r0 = (vi.b) r0
            pl.q.b(r8)     // Catch:{ Exception -> 0x0031 }
            goto L_0x0075
        L_0x0031:
            r8 = move-exception
            goto L_0x00fe
        L_0x0034:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x003c:
            pl.q.b(r8)
            si.b$a r8 = si.b.f31257a
            android.app.Application r2 = r7.f32348a
            boolean r8 = r8.a(r2)
            if (r8 == 0) goto L_0x0124
            long r4 = java.lang.System.currentTimeMillis()
            java.lang.String r8 = java.lang.String.valueOf(r4)
            si.a$a r2 = si.a.f31253a
            android.app.Application r4 = r7.f32348a
            retrofit2.Retrofit r2 = r2.a(r4)
            java.lang.Class<com.nic.mparivahan.dlservices.data.network.DlExtraService> r4 = com.nic.mparivahan.dlservices.data.network.DlExtraService.class
            java.lang.Object r2 = r2.create(r4)
            com.nic.mparivahan.dlservices.data.network.DlExtraService r2 = (com.nic.mparivahan.dlservices.data.network.DlExtraService) r2
            com.nic.mparivahan.dlservices.data.repo.hillpackage.HillRequest r4 = r7.d()     // Catch:{ Exception -> 0x00fc }
            r0.f32375e = r7     // Catch:{ Exception -> 0x00fc }
            r0.f32376f = r8     // Catch:{ Exception -> 0x00fc }
            r0.f32379i = r3     // Catch:{ Exception -> 0x00fc }
            java.lang.Object r0 = r2.hillRequest(r4, r8, r0)     // Catch:{ Exception -> 0x00fc }
            if (r0 != r1) goto L_0x0072
            return r1
        L_0x0072:
            r1 = r8
            r8 = r0
            r0 = r7
        L_0x0075:
            com.nic.mparivahan.Security.SecModle.SecurityModle r8 = (com.nic.mparivahan.Security.SecModle.SecurityModle) r8     // Catch:{ Exception -> 0x0031 }
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x00a0 }
            r3 = 26
            java.lang.String r4 = "decode(...)"
            if (r2 < r3) goto L_0x00a2
            id.c$a r2 = id.c.f12675a     // Catch:{ Exception -> 0x00a0 }
            j$.util.Base64$Decoder r3 = j$.util.Base64.getDecoder()     // Catch:{ Exception -> 0x00a0 }
            java.lang.String r8 = r8.getData()     // Catch:{ Exception -> 0x00a0 }
            byte[] r8 = r3.decode((java.lang.String) r8)     // Catch:{ Exception -> 0x00a0 }
            cm.l.e(r8, r4)     // Catch:{ Exception -> 0x00a0 }
            java.lang.String r3 = new java.lang.String     // Catch:{ Exception -> 0x00a0 }
            java.nio.charset.Charset r4 = km.d.f24740b     // Catch:{ Exception -> 0x00a0 }
            r3.<init>(r8, r4)     // Catch:{ Exception -> 0x00a0 }
            java.lang.String r8 = r2.a(r1, r3)     // Catch:{ Exception -> 0x00a0 }
        L_0x009b:
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ Exception -> 0x00a0 }
            goto L_0x00bc
        L_0x00a0:
            r8 = move-exception
            goto L_0x00e1
        L_0x00a2:
            id.c$a r2 = id.c.f12675a     // Catch:{ Exception -> 0x00a0 }
            java.lang.String r8 = r8.getData()     // Catch:{ Exception -> 0x00a0 }
            r3 = 0
            byte[] r8 = android.util.Base64.decode(r8, r3)     // Catch:{ Exception -> 0x00a0 }
            cm.l.e(r8, r4)     // Catch:{ Exception -> 0x00a0 }
            java.lang.String r3 = new java.lang.String     // Catch:{ Exception -> 0x00a0 }
            java.nio.charset.Charset r4 = km.d.f24740b     // Catch:{ Exception -> 0x00a0 }
            r3.<init>(r8, r4)     // Catch:{ Exception -> 0x00a0 }
            java.lang.String r8 = r2.a(r1, r3)     // Catch:{ Exception -> 0x00a0 }
            goto L_0x009b
        L_0x00bc:
            r0.e(r8)     // Catch:{ Exception -> 0x00a0 }
            java.lang.String r8 = "hillResponse"
            java.lang.String r1 = r0.b()     // Catch:{ Exception -> 0x00a0 }
            android.util.Log.d(r8, r1)     // Catch:{ Exception -> 0x00a0 }
            i7.d r8 = new i7.d     // Catch:{ Exception -> 0x00a0 }
            r8.<init>()     // Catch:{ Exception -> 0x00a0 }
            java.lang.String r1 = r0.b()     // Catch:{ Exception -> 0x00a0 }
            java.lang.Class<vi.c> r2 = vi.c.class
            java.lang.Object r8 = r8.j(r1, r2)     // Catch:{ Exception -> 0x00a0 }
            android.support.v4.media.session.b.a(r8)     // Catch:{ Exception -> 0x00a0 }
            androidx.lifecycle.a0 r8 = r0.f32372y     // Catch:{ Exception -> 0x00a0 }
            r1 = 0
            r8.k(r1)     // Catch:{ Exception -> 0x00a0 }
            goto L_0x0124
        L_0x00e1:
            r8.printStackTrace()     // Catch:{ Exception -> 0x0031 }
            com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog$a r1 = com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog.f20957k     // Catch:{ Exception -> 0x0031 }
            android.app.Application r2 = r0.f32348a     // Catch:{ Exception -> 0x0031 }
            v9.d$a r8 = v9.d.f17494a     // Catch:{ Exception -> 0x0031 }
            java.lang.String r3 = r8.t()     // Catch:{ Exception -> 0x0031 }
            java.lang.String r4 = "getAckDetForGivenDLNumber"
            java.lang.String r5 = r8.v()     // Catch:{ Exception -> 0x0031 }
            java.lang.String r6 = r8.w()     // Catch:{ Exception -> 0x0031 }
            r1.a(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x0031 }
            goto L_0x0124
        L_0x00fc:
            r8 = move-exception
            r0 = r7
        L_0x00fe:
            java.lang.String r8 = r8.getMessage()
            if (r8 == 0) goto L_0x010d
            java.lang.String r1 = "dl_renewal_logginga"
            int r8 = android.util.Log.e(r1, r8)
            kotlin.coroutines.jvm.internal.b.b(r8)
        L_0x010d:
            com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog$a r1 = com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog.f20957k
            android.app.Application r2 = r0.f32348a
            v9.d$a r8 = v9.d.f17494a
            java.lang.String r3 = r8.t()
            java.lang.String r4 = "getAckDetForGivenDLNumber"
            java.lang.String r5 = r8.v()
            java.lang.String r6 = r8.w()
            r1.a(r2, r3, r4, r5, r6)
        L_0x0124:
            pl.x r8 = pl.x.f30437a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: vi.b.a(tl.d):java.lang.Object");
    }

    public final String b() {
        String str = this.f32371x;
        if (str != null) {
            return str;
        }
        cm.l.v("decryptedString");
        return null;
    }

    public final a0 c() {
        return this.f32372y;
    }

    public final HillRequest d() {
        HillSelectedList hillSelectedList = new HillSelectedList((String) null, 1, (cm.g) null);
        hillSelectedList.setJsonMember513("ENDORSEMENT TO DRIVE IN HILL REGION");
        HillRequest hillRequest = new HillRequest((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (HillSelectedList) null, (String) null, (String) null, (String) null, (String) null, 8388607, (cm.g) null);
        hillRequest.setDlno(this.f32349b);
        hillRequest.setDob(this.f32350c);
        hillRequest.setRtoCodeDLTr(this.f32351d);
        hillRequest.setApplcatgDLserReq(this.f32352e);
        hillRequest.setDlHolderAltMobMum(this.f32353f);
        hillRequest.setWilltoDonateOrgans(this.f32354g);
        hillRequest.setMobileNumber(this.f32355h);
        hillRequest.setDeclaringcheck(this.f32356i);
        hillRequest.setHillcertificate(this.f32357j);
        hillRequest.setHillissueDate(this.f32358k);
        hillRequest.setHillvalidFrom(this.f32359l);
        hillRequest.setHillvalidTo(this.f32360m);
        hillRequest.setHilldrivingschool(this.f32361n);
        hillRequest.setHillissby(this.f32362o);
        hillRequest.setAgentId(this.f32363p);
        hillRequest.setAgentIpAddress(this.f32364q);
        hillRequest.setAgentPwd(this.f32365r);
        hillRequest.setAgentServiceName(this.f32366s);
        hillRequest.setSelectedDLSerList(hillSelectedList);
        Log.e("dl_renewal_loggingpar", hillRequest.toString());
        return hillRequest;
    }

    public final void e(String str) {
        cm.l.f(str, "<set-?>");
        this.f32371x = str;
    }
}
