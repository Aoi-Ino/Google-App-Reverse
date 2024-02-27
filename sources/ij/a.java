package ij;

import android.app.Application;
import android.util.Log;
import androidx.lifecycle.a0;
import bm.p;
import com.nic.mparivahan.dlservices.ui.changeName.ChangeNameDLSerList;
import com.nic.mparivahan.dlservices.ui.changeName.ChangeOfNameRequest;
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
    private final a0 A = new a0();

    /* renamed from: a  reason: collision with root package name */
    private final Application f24364a;

    /* renamed from: b  reason: collision with root package name */
    private String f24365b;

    /* renamed from: c  reason: collision with root package name */
    private String f24366c;

    /* renamed from: d  reason: collision with root package name */
    private String f24367d;

    /* renamed from: e  reason: collision with root package name */
    private String f24368e;

    /* renamed from: f  reason: collision with root package name */
    private String f24369f;

    /* renamed from: g  reason: collision with root package name */
    private String f24370g;

    /* renamed from: h  reason: collision with root package name */
    private String f24371h;

    /* renamed from: i  reason: collision with root package name */
    private int f24372i;

    /* renamed from: j  reason: collision with root package name */
    private String f24373j;

    /* renamed from: k  reason: collision with root package name */
    private String f24374k;

    /* renamed from: l  reason: collision with root package name */
    private String f24375l;

    /* renamed from: m  reason: collision with root package name */
    private String f24376m;

    /* renamed from: n  reason: collision with root package name */
    private String f24377n;

    /* renamed from: o  reason: collision with root package name */
    private String f24378o;

    /* renamed from: p  reason: collision with root package name */
    private String f24379p;

    /* renamed from: q  reason: collision with root package name */
    private String f24380q;

    /* renamed from: r  reason: collision with root package name */
    private String f24381r;

    /* renamed from: s  reason: collision with root package name */
    private String f24382s;

    /* renamed from: t  reason: collision with root package name */
    private String f24383t;

    /* renamed from: u  reason: collision with root package name */
    private String f24384u;

    /* renamed from: v  reason: collision with root package name */
    private String f24385v;

    /* renamed from: w  reason: collision with root package name */
    private String f24386w;

    /* renamed from: x  reason: collision with root package name */
    private String f24387x;

    /* renamed from: y  reason: collision with root package name */
    private String f24388y;

    /* renamed from: z  reason: collision with root package name */
    public String f24389z;

    /* renamed from: ij.a$a  reason: collision with other inner class name */
    static final class C0307a extends l implements p {

        /* renamed from: f  reason: collision with root package name */
        int f24390f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ a f24391g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0307a(a aVar, d dVar) {
            super(2, dVar);
            this.f24391g = aVar;
        }

        /* renamed from: b */
        public final Object h(d0 d0Var, d dVar) {
            return ((C0307a) create(d0Var, dVar)).invokeSuspend(x.f30437a);
        }

        public final d create(Object obj, d dVar) {
            return new C0307a(this.f24391g, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object c10 = d.c();
            int i10 = this.f24390f;
            if (i10 == 0) {
                q.b(obj);
                a aVar = this.f24391g;
                this.f24390f = 1;
                if (aVar.a(this) == c10) {
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
        Object f24392e;

        /* renamed from: f  reason: collision with root package name */
        Object f24393f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f24394g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ a f24395h;

        /* renamed from: i  reason: collision with root package name */
        int f24396i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar, d dVar) {
            super(dVar);
            this.f24395h = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f24394g = obj;
            this.f24396i |= Integer.MIN_VALUE;
            return this.f24395h.a(this);
        }
    }

    public a(Application application, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i10, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23) {
        Application application2 = application;
        String str24 = str10;
        String str25 = str13;
        String str26 = str14;
        String str27 = str15;
        String str28 = str16;
        String str29 = str17;
        String str30 = str18;
        String str31 = str19;
        String str32 = str20;
        String str33 = str21;
        String str34 = str22;
        String str35 = str23;
        cm.l.f(application2, "app");
        cm.l.f(str24, "conEffdate");
        cm.l.f(str25, "relFirstName");
        cm.l.f(str26, "relLastName");
        cm.l.f(str27, "mobileNumber");
        cm.l.f(str28, "agentId");
        cm.l.f(str29, "agentPwd");
        cm.l.f(str30, "agentIpAddress");
        cm.l.f(str31, "agentServiceName");
        cm.l.f(str32, "eKYCId");
        cm.l.f(str33, "eKYCOpted");
        cm.l.f(str34, "eKYCGender");
        cm.l.f(str35, "eKYCPhoto");
        this.f24364a = application2;
        this.f24365b = str;
        this.f24366c = str2;
        this.f24367d = str3;
        this.f24368e = str4;
        this.f24369f = str5;
        this.f24370g = str6;
        this.f24371h = str7;
        this.f24372i = i10;
        this.f24373j = str8;
        this.f24374k = str9;
        this.f24375l = str24;
        this.f24376m = str11;
        this.f24377n = str12;
        this.f24378o = str25;
        this.f24379p = str26;
        this.f24380q = str27;
        this.f24381r = str28;
        this.f24382s = str29;
        this.f24383t = str30;
        this.f24384u = str31;
        this.f24385v = str32;
        this.f24386w = str33;
        this.f24387x = str34;
        this.f24388y = str35;
        k1 unused = g.d(e0.a(q0.b()), (g) null, (f0) null, new C0307a(this, (d) null), 3, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007f A[SYNTHETIC, Splitter:B:29:0x007f] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a2 A[Catch:{ Exception -> 0x00a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(tl.d r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof ij.a.b
            if (r0 == 0) goto L_0x0013
            r0 = r9
            ij.a$b r0 = (ij.a.b) r0
            int r1 = r0.f24396i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f24396i = r1
            goto L_0x0018
        L_0x0013:
            ij.a$b r0 = new ij.a$b
            r0.<init>(r8, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f24394g
            java.lang.Object r1 = ul.d.c()
            int r2 = r0.f24396i
            r3 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 != r3) goto L_0x0034
            java.lang.Object r1 = r0.f24393f
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.f24392e
            ij.a r0 = (ij.a) r0
            pl.q.b(r9)     // Catch:{ Exception -> 0x0031 }
            goto L_0x0075
        L_0x0031:
            r9 = move-exception
            goto L_0x0106
        L_0x0034:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x003c:
            pl.q.b(r9)
            si.b$a r9 = si.b.f31257a
            android.app.Application r2 = r8.f24364a
            boolean r9 = r9.a(r2)
            if (r9 == 0) goto L_0x0135
            long r4 = java.lang.System.currentTimeMillis()
            java.lang.String r9 = java.lang.String.valueOf(r4)
            si.a$a r2 = si.a.f31253a
            android.app.Application r4 = r8.f24364a
            retrofit2.Retrofit r2 = r2.a(r4)
            java.lang.Class<com.nic.mparivahan.dlservices.data.network.DlExtraService> r4 = com.nic.mparivahan.dlservices.data.network.DlExtraService.class
            java.lang.Object r2 = r2.create(r4)
            com.nic.mparivahan.dlservices.data.network.DlExtraService r2 = (com.nic.mparivahan.dlservices.data.network.DlExtraService) r2
            com.nic.mparivahan.dlservices.ui.changeName.ChangeOfNameRequest r4 = r8.d()     // Catch:{ Exception -> 0x0104 }
            r0.f24392e = r8     // Catch:{ Exception -> 0x0104 }
            r0.f24393f = r9     // Catch:{ Exception -> 0x0104 }
            r0.f24396i = r3     // Catch:{ Exception -> 0x0104 }
            java.lang.Object r0 = r2.nameRequest(r4, r9, r0)     // Catch:{ Exception -> 0x0104 }
            if (r0 != r1) goto L_0x0072
            return r1
        L_0x0072:
            r1 = r9
            r9 = r0
            r0 = r8
        L_0x0075:
            com.nic.mparivahan.Security.SecModle.SecurityModle r9 = (com.nic.mparivahan.Security.SecModle.SecurityModle) r9     // Catch:{ Exception -> 0x0031 }
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x00a0 }
            r3 = 26
            java.lang.String r4 = "decode(...)"
            if (r2 < r3) goto L_0x00a2
            id.c$a r2 = id.c.f12675a     // Catch:{ Exception -> 0x00a0 }
            j$.util.Base64$Decoder r3 = j$.util.Base64.getDecoder()     // Catch:{ Exception -> 0x00a0 }
            java.lang.String r9 = r9.getData()     // Catch:{ Exception -> 0x00a0 }
            byte[] r9 = r3.decode((java.lang.String) r9)     // Catch:{ Exception -> 0x00a0 }
            cm.l.e(r9, r4)     // Catch:{ Exception -> 0x00a0 }
            java.lang.String r3 = new java.lang.String     // Catch:{ Exception -> 0x00a0 }
            java.nio.charset.Charset r4 = km.d.f24740b     // Catch:{ Exception -> 0x00a0 }
            r3.<init>(r9, r4)     // Catch:{ Exception -> 0x00a0 }
            java.lang.String r9 = r2.a(r1, r3)     // Catch:{ Exception -> 0x00a0 }
        L_0x009b:
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ Exception -> 0x00a0 }
            goto L_0x00bc
        L_0x00a0:
            r9 = move-exception
            goto L_0x00e9
        L_0x00a2:
            id.c$a r2 = id.c.f12675a     // Catch:{ Exception -> 0x00a0 }
            java.lang.String r9 = r9.getData()     // Catch:{ Exception -> 0x00a0 }
            r3 = 0
            byte[] r9 = android.util.Base64.decode(r9, r3)     // Catch:{ Exception -> 0x00a0 }
            cm.l.e(r9, r4)     // Catch:{ Exception -> 0x00a0 }
            java.lang.String r3 = new java.lang.String     // Catch:{ Exception -> 0x00a0 }
            java.nio.charset.Charset r4 = km.d.f24740b     // Catch:{ Exception -> 0x00a0 }
            r3.<init>(r9, r4)     // Catch:{ Exception -> 0x00a0 }
            java.lang.String r9 = r2.a(r1, r3)     // Catch:{ Exception -> 0x00a0 }
            goto L_0x009b
        L_0x00bc:
            r0.e(r9)     // Catch:{ Exception -> 0x00a0 }
            i7.d r9 = new i7.d     // Catch:{ Exception -> 0x00a0 }
            r9.<init>()     // Catch:{ Exception -> 0x00a0 }
            java.lang.String r1 = r0.b()     // Catch:{ Exception -> 0x00a0 }
            java.lang.Class<com.nic.mparivahan.dlservices.data.model.duplicatedl.GetAckDetForGivenDLNumberResponse> r2 = com.nic.mparivahan.dlservices.data.model.duplicatedl.GetAckDetForGivenDLNumberResponse.class
            java.lang.Object r9 = r9.j(r1, r2)     // Catch:{ Exception -> 0x00a0 }
            com.nic.mparivahan.dlservices.data.model.duplicatedl.GetAckDetForGivenDLNumberResponse r9 = (com.nic.mparivahan.dlservices.data.model.duplicatedl.GetAckDetForGivenDLNumberResponse) r9     // Catch:{ Exception -> 0x00a0 }
            androidx.lifecycle.a0 r1 = r0.A     // Catch:{ Exception -> 0x00a0 }
            r1.k(r9)     // Catch:{ Exception -> 0x00a0 }
            com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog$a r2 = com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog.f20957k     // Catch:{ Exception -> 0x00a0 }
            android.app.Application r3 = r0.f24364a     // Catch:{ Exception -> 0x00a0 }
            v9.d$a r9 = v9.d.f17494a     // Catch:{ Exception -> 0x00a0 }
            java.lang.String r4 = r9.t()     // Catch:{ Exception -> 0x00a0 }
            java.lang.String r5 = "getAckDetForGivenDLNumber"
            java.lang.String r6 = "200"
            java.lang.String r7 = "OK"
            r2.a(r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x00a0 }
            goto L_0x0135
        L_0x00e9:
            r9.printStackTrace()     // Catch:{ Exception -> 0x0031 }
            com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog$a r1 = com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog.f20957k     // Catch:{ Exception -> 0x0031 }
            android.app.Application r2 = r0.f24364a     // Catch:{ Exception -> 0x0031 }
            v9.d$a r9 = v9.d.f17494a     // Catch:{ Exception -> 0x0031 }
            java.lang.String r3 = r9.t()     // Catch:{ Exception -> 0x0031 }
            java.lang.String r4 = "getAckDetForGivenDLNumber"
            java.lang.String r5 = r9.v()     // Catch:{ Exception -> 0x0031 }
            java.lang.String r6 = r9.w()     // Catch:{ Exception -> 0x0031 }
            r1.a(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x0031 }
            goto L_0x0135
        L_0x0104:
            r9 = move-exception
            r0 = r8
        L_0x0106:
            java.lang.String r1 = "changeNameRespErr"
            java.lang.String r2 = r9.getLocalizedMessage()
            android.util.Log.d(r1, r2)
            java.lang.String r9 = r9.getMessage()
            if (r9 == 0) goto L_0x011e
            java.lang.String r1 = "dl_renewal_logginga"
            int r9 = android.util.Log.e(r1, r9)
            kotlin.coroutines.jvm.internal.b.b(r9)
        L_0x011e:
            com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog$a r1 = com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog.f20957k
            android.app.Application r2 = r0.f24364a
            v9.d$a r9 = v9.d.f17494a
            java.lang.String r3 = r9.t()
            java.lang.String r4 = "getAckDetForGivenDLNumber"
            java.lang.String r5 = r9.v()
            java.lang.String r6 = r9.w()
            r1.a(r2, r3, r4, r5, r6)
        L_0x0135:
            pl.x r9 = pl.x.f30437a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ij.a.a(tl.d):java.lang.Object");
    }

    public final String b() {
        String str = this.f24389z;
        if (str != null) {
            return str;
        }
        cm.l.v("decryptedString");
        return null;
    }

    public final a0 c() {
        return this.A;
    }

    public final ChangeOfNameRequest d() {
        ChangeNameDLSerList changeNameDLSerList = new ChangeNameDLSerList((String) null, 1, (cm.g) null);
        changeNameDLSerList.setJsonMember526("Change Of Name in DL");
        ChangeOfNameRequest changeOfNameRequest = new ChangeOfNameRequest((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (ChangeNameDLSerList) null, (String) null, (String) null, (String) null, (String) null, 33554431, (cm.g) null);
        changeOfNameRequest.setApplcatgDLserReq(this.f24365b);
        changeOfNameRequest.setDlHolderAltMobMum(this.f24366c);
        changeOfNameRequest.setDlno(this.f24367d);
        changeOfNameRequest.setDob(this.f24368e);
        changeOfNameRequest.setRtoCodeDLTr(this.f24369f);
        changeOfNameRequest.setWilltoDonateOrgans(this.f24370g);
        changeOfNameRequest.setRelationType(this.f24371h);
        changeOfNameRequest.setConDlReasonCode(Integer.valueOf(this.f24372i));
        changeOfNameRequest.setConDlReasonName(this.f24373j);
        changeOfNameRequest.setDlHolderNaturalName(this.f24374k);
        changeOfNameRequest.setConEffdate(this.f24375l);
        changeOfNameRequest.setApplFirstName(this.f24376m);
        changeOfNameRequest.setApplLastName(this.f24377n);
        changeOfNameRequest.setRelFirstName(this.f24378o);
        changeOfNameRequest.setRelLastName(this.f24379p);
        changeOfNameRequest.setMobileNumber(this.f24380q);
        changeOfNameRequest.setAgentId("mobSARATHI");
        changeOfNameRequest.setAgentIpAddress("657d1c758e2e95af0014e16f5109f933");
        changeOfNameRequest.setAgentPwd("10.248.210.8");
        changeOfNameRequest.setAgentServiceName("sarathiservice");
        changeOfNameRequest.setSelectedDLSerList(changeNameDLSerList);
        Log.d("_adhr", changeOfNameRequest.toString());
        return changeOfNameRequest;
    }

    public final void e(String str) {
        cm.l.f(str, "<set-?>");
        this.f24389z = str;
    }
}
