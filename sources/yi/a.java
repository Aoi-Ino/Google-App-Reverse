package yi;

import android.app.Application;
import android.util.Log;
import androidx.lifecycle.a0;
import bm.p;
import com.nic.mparivahan.dlservices.data.model.duplicatedl.ReplacementDlRequest;
import com.nic.mparivahan.dlservices.data.model.duplicatedl.ReplacementSelectedDLSerList;
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

    /* renamed from: a  reason: collision with root package name */
    private final Application f33032a;

    /* renamed from: b  reason: collision with root package name */
    private String f33033b;

    /* renamed from: c  reason: collision with root package name */
    private String f33034c;

    /* renamed from: d  reason: collision with root package name */
    private String f33035d;

    /* renamed from: e  reason: collision with root package name */
    private String f33036e;

    /* renamed from: f  reason: collision with root package name */
    private String f33037f;

    /* renamed from: g  reason: collision with root package name */
    private String f33038g;

    /* renamed from: h  reason: collision with root package name */
    private String f33039h;

    /* renamed from: i  reason: collision with root package name */
    private String f33040i;

    /* renamed from: j  reason: collision with root package name */
    private String f33041j;

    /* renamed from: k  reason: collision with root package name */
    private String f33042k;

    /* renamed from: l  reason: collision with root package name */
    private String f33043l;

    /* renamed from: m  reason: collision with root package name */
    private String f33044m;

    /* renamed from: n  reason: collision with root package name */
    private final a0 f33045n = new a0();

    /* renamed from: yi.a$a  reason: collision with other inner class name */
    static final class C0386a extends l implements p {

        /* renamed from: f  reason: collision with root package name */
        int f33046f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ a f33047g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0386a(a aVar, d dVar) {
            super(2, dVar);
            this.f33047g = aVar;
        }

        /* renamed from: b */
        public final Object h(d0 d0Var, d dVar) {
            return ((C0386a) create(d0Var, dVar)).invokeSuspend(x.f30437a);
        }

        public final d create(Object obj, d dVar) {
            return new C0386a(this.f33047g, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object c10 = d.c();
            int i10 = this.f33046f;
            if (i10 == 0) {
                q.b(obj);
                a aVar = this.f33047g;
                this.f33046f = 1;
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
        Object f33048e;

        /* renamed from: f  reason: collision with root package name */
        Object f33049f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f33050g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ a f33051h;

        /* renamed from: i  reason: collision with root package name */
        int f33052i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar, d dVar) {
            super(dVar);
            this.f33051h = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f33050g = obj;
            this.f33052i |= Integer.MIN_VALUE;
            return this.f33051h.a(this);
        }
    }

    public a(Application application, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        cm.l.f(application, "app");
        cm.l.f(str9, "eKYCId");
        cm.l.f(str10, "eKYCOpted");
        cm.l.f(str11, "eKYCGender");
        cm.l.f(str12, "eKYCPhoto");
        this.f33032a = application;
        this.f33033b = str;
        this.f33034c = str2;
        this.f33035d = str3;
        this.f33036e = str4;
        this.f33037f = str5;
        this.f33038g = str6;
        this.f33039h = str7;
        this.f33040i = str8;
        this.f33041j = str9;
        this.f33042k = str10;
        this.f33043l = str11;
        this.f33044m = str12;
        k1 unused = g.d(e0.a(q0.b()), (g) null, (f0) null, new C0386a(this, (d) null), 3, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007f A[SYNTHETIC, Splitter:B:29:0x007f] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a2 A[Catch:{ Exception -> 0x00a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(tl.d r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof yi.a.b
            if (r0 == 0) goto L_0x0013
            r0 = r8
            yi.a$b r0 = (yi.a.b) r0
            int r1 = r0.f33052i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f33052i = r1
            goto L_0x0018
        L_0x0013:
            yi.a$b r0 = new yi.a$b
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f33050g
            java.lang.Object r1 = ul.d.c()
            int r2 = r0.f33052i
            r3 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 != r3) goto L_0x0034
            java.lang.Object r1 = r0.f33049f
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.f33048e
            yi.a r0 = (yi.a) r0
            pl.q.b(r8)     // Catch:{ Exception -> 0x0031 }
            goto L_0x0075
        L_0x0031:
            r8 = move-exception
            goto L_0x00ec
        L_0x0034:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x003c:
            pl.q.b(r8)
            si.b$a r8 = si.b.f31257a
            android.app.Application r2 = r7.f33032a
            boolean r8 = r8.a(r2)
            if (r8 == 0) goto L_0x0112
            long r4 = java.lang.System.currentTimeMillis()
            java.lang.String r8 = java.lang.String.valueOf(r4)
            si.a$a r2 = si.a.f31253a
            android.app.Application r4 = r7.f33032a
            retrofit2.Retrofit r2 = r2.a(r4)
            java.lang.Class<com.nic.mparivahan.dlservices.data.network.DlExtraService> r4 = com.nic.mparivahan.dlservices.data.network.DlExtraService.class
            java.lang.Object r2 = r2.create(r4)
            com.nic.mparivahan.dlservices.data.network.DlExtraService r2 = (com.nic.mparivahan.dlservices.data.network.DlExtraService) r2
            com.nic.mparivahan.dlservices.data.model.duplicatedl.ReplacementDlRequest r4 = r7.c()     // Catch:{ Exception -> 0x00ea }
            r0.f33048e = r7     // Catch:{ Exception -> 0x00ea }
            r0.f33049f = r8     // Catch:{ Exception -> 0x00ea }
            r0.f33052i = r3     // Catch:{ Exception -> 0x00ea }
            java.lang.Object r0 = r2.getAckDetForGivenDLNumberReplacment(r4, r8, r0)     // Catch:{ Exception -> 0x00ea }
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
            goto L_0x00cf
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
            i7.d r1 = new i7.d     // Catch:{ Exception -> 0x00a0 }
            r1.<init>()     // Catch:{ Exception -> 0x00a0 }
            java.lang.Class<com.nic.mparivahan.dlservices.data.model.duplicatedl.GetAckDetForGivenDLNumberResponse> r2 = com.nic.mparivahan.dlservices.data.model.duplicatedl.GetAckDetForGivenDLNumberResponse.class
            java.lang.Object r8 = r1.j(r8, r2)     // Catch:{ Exception -> 0x00a0 }
            com.nic.mparivahan.dlservices.data.model.duplicatedl.GetAckDetForGivenDLNumberResponse r8 = (com.nic.mparivahan.dlservices.data.model.duplicatedl.GetAckDetForGivenDLNumberResponse) r8     // Catch:{ Exception -> 0x00a0 }
            androidx.lifecycle.a0 r1 = r0.f33045n     // Catch:{ Exception -> 0x00a0 }
            r1.k(r8)     // Catch:{ Exception -> 0x00a0 }
            goto L_0x0112
        L_0x00cf:
            r8.printStackTrace()     // Catch:{ Exception -> 0x0031 }
            com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog$a r1 = com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog.f20957k     // Catch:{ Exception -> 0x0031 }
            android.app.Application r2 = r0.f33032a     // Catch:{ Exception -> 0x0031 }
            v9.d$a r8 = v9.d.f17494a     // Catch:{ Exception -> 0x0031 }
            java.lang.String r3 = r8.t()     // Catch:{ Exception -> 0x0031 }
            java.lang.String r4 = "getAckDetForGivenDLNumber"
            java.lang.String r5 = r8.v()     // Catch:{ Exception -> 0x0031 }
            java.lang.String r6 = r8.w()     // Catch:{ Exception -> 0x0031 }
            r1.a(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x0031 }
            goto L_0x0112
        L_0x00ea:
            r8 = move-exception
            r0 = r7
        L_0x00ec:
            java.lang.String r8 = r8.getMessage()
            if (r8 == 0) goto L_0x00fb
            java.lang.String r1 = "dl_renewal_logginga"
            int r8 = android.util.Log.e(r1, r8)
            kotlin.coroutines.jvm.internal.b.b(r8)
        L_0x00fb:
            com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog$a r1 = com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog.f20957k
            android.app.Application r2 = r0.f33032a
            v9.d$a r8 = v9.d.f17494a
            java.lang.String r3 = r8.t()
            java.lang.String r4 = "getAckDetForGivenDLNumber"
            java.lang.String r5 = r8.v()
            java.lang.String r6 = r8.w()
            r1.a(r2, r3, r4, r5, r6)
        L_0x0112:
            pl.x r8 = pl.x.f30437a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: yi.a.a(tl.d):java.lang.Object");
    }

    public final a0 b() {
        return this.f33045n;
    }

    public final ReplacementDlRequest c() {
        Integer num = null;
        ReplacementSelectedDLSerList replacementSelectedDLSerList = new ReplacementSelectedDLSerList((String) null, 1, (cm.g) null);
        replacementSelectedDLSerList.setJsonMember516("Replacement of DL");
        ReplacementDlRequest replacementDlRequest = new ReplacementDlRequest((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (ReplacementSelectedDLSerList) null, (String) null, (String) null, (String) null, (String) null, 131071, (cm.g) null);
        replacementDlRequest.setDlno(this.f33033b);
        replacementDlRequest.setDob(this.f33034c);
        replacementDlRequest.setRtoCodeDLTr(this.f33035d);
        replacementDlRequest.setWilltoDonateOrgans(this.f33038g);
        replacementDlRequest.setSelectedDLSerList(replacementSelectedDLSerList);
        String str = this.f33036e;
        if (str != null) {
            num = Integer.valueOf(Integer.parseInt(str));
        }
        replacementDlRequest.setDupDlReasonCode(num);
        replacementDlRequest.setDupDlReasonName(this.f33037f);
        replacementDlRequest.setDlHolderAltMobMum(this.f33039h);
        replacementDlRequest.setMobileNumber(this.f33040i);
        Log.e("dl_renewal_loggingpar", replacementDlRequest.toString());
        return replacementDlRequest;
    }
}
