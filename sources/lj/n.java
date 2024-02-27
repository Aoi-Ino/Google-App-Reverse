package lj;

import android.app.Application;
import android.util.Log;
import androidx.lifecycle.a0;
import bm.p;
import com.nic.mparivahan.dlservices.ui.dlextract.DlExRequest;
import com.nic.mparivahan.dlservices.ui.dlextract.SelectedDLList;
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
    private final Application f24878a;

    /* renamed from: b  reason: collision with root package name */
    private String f24879b;

    /* renamed from: c  reason: collision with root package name */
    private String f24880c;

    /* renamed from: d  reason: collision with root package name */
    private String f24881d;

    /* renamed from: e  reason: collision with root package name */
    private String f24882e;

    /* renamed from: f  reason: collision with root package name */
    private String f24883f;

    /* renamed from: g  reason: collision with root package name */
    private String f24884g;

    /* renamed from: h  reason: collision with root package name */
    private String f24885h;

    /* renamed from: i  reason: collision with root package name */
    private String f24886i;

    /* renamed from: j  reason: collision with root package name */
    private String f24887j;

    /* renamed from: k  reason: collision with root package name */
    private String f24888k;

    /* renamed from: l  reason: collision with root package name */
    private String f24889l;

    /* renamed from: m  reason: collision with root package name */
    private String f24890m;

    /* renamed from: n  reason: collision with root package name */
    private final a0 f24891n = new a0();

    static final class a extends l implements p {

        /* renamed from: f  reason: collision with root package name */
        int f24892f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ n f24893g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(n nVar, d dVar) {
            super(2, dVar);
            this.f24893g = nVar;
        }

        /* renamed from: b */
        public final Object h(d0 d0Var, d dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(x.f30437a);
        }

        public final d create(Object obj, d dVar) {
            return new a(this.f24893g, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object c10 = d.c();
            int i10 = this.f24892f;
            if (i10 == 0) {
                q.b(obj);
                n nVar = this.f24893g;
                this.f24892f = 1;
                if (nVar.a(this) == c10) {
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
        Object f24894e;

        /* renamed from: f  reason: collision with root package name */
        Object f24895f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f24896g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ n f24897h;

        /* renamed from: i  reason: collision with root package name */
        int f24898i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(n nVar, d dVar) {
            super(dVar);
            this.f24897h = nVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f24896g = obj;
            this.f24898i |= Integer.MIN_VALUE;
            return this.f24897h.a(this);
        }
    }

    public n(Application application, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        cm.l.f(application, "app");
        cm.l.f(str9, "eKYCId");
        cm.l.f(str10, "eKYCOpted");
        cm.l.f(str11, "eKYCGender");
        cm.l.f(str12, "eKYCPhoto");
        this.f24878a = application;
        this.f24879b = str;
        this.f24880c = str2;
        this.f24881d = str3;
        this.f24882e = str4;
        this.f24883f = str5;
        this.f24884g = str6;
        this.f24885h = str7;
        this.f24886i = str8;
        this.f24887j = str9;
        this.f24888k = str10;
        this.f24889l = str11;
        this.f24890m = str12;
        k1 unused = g.d(e0.a(q0.b()), (g) null, (f0) null, new a(this, (d) null), 3, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0088 A[SYNTHETIC, Splitter:B:29:0x0088] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ab A[Catch:{ Exception -> 0x00a9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(tl.d r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof lj.n.b
            if (r0 == 0) goto L_0x0013
            r0 = r9
            lj.n$b r0 = (lj.n.b) r0
            int r1 = r0.f24898i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f24898i = r1
            goto L_0x0018
        L_0x0013:
            lj.n$b r0 = new lj.n$b
            r0.<init>(r8, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f24896g
            java.lang.Object r1 = ul.d.c()
            int r2 = r0.f24898i
            r3 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 != r3) goto L_0x0034
            java.lang.Object r1 = r0.f24895f
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.f24894e
            lj.n r0 = (lj.n) r0
            pl.q.b(r9)     // Catch:{ Exception -> 0x0031 }
            goto L_0x0075
        L_0x0031:
            r9 = move-exception
            goto L_0x0103
        L_0x0034:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x003c:
            pl.q.b(r9)
            si.b$a r9 = si.b.f31257a
            android.app.Application r2 = r8.f24878a
            boolean r9 = r9.a(r2)
            if (r9 == 0) goto L_0x0129
            long r4 = java.lang.System.currentTimeMillis()
            java.lang.String r9 = java.lang.String.valueOf(r4)
            si.a$a r2 = si.a.f31253a
            android.app.Application r4 = r8.f24878a
            retrofit2.Retrofit r2 = r2.a(r4)
            java.lang.Class<com.nic.mparivahan.dlservices.data.network.DlExtraService> r4 = com.nic.mparivahan.dlservices.data.network.DlExtraService.class
            java.lang.Object r2 = r2.create(r4)
            com.nic.mparivahan.dlservices.data.network.DlExtraService r2 = (com.nic.mparivahan.dlservices.data.network.DlExtraService) r2
            com.nic.mparivahan.dlservices.ui.dlextract.DlExRequest r4 = r8.c()     // Catch:{ Exception -> 0x0101 }
            r0.f24894e = r8     // Catch:{ Exception -> 0x0101 }
            r0.f24895f = r9     // Catch:{ Exception -> 0x0101 }
            r0.f24898i = r3     // Catch:{ Exception -> 0x0101 }
            java.lang.Object r0 = r2.getAckDlExtract(r4, r9, r0)     // Catch:{ Exception -> 0x0101 }
            if (r0 != r1) goto L_0x0072
            return r1
        L_0x0072:
            r1 = r9
            r9 = r0
            r0 = r8
        L_0x0075:
            com.nic.mparivahan.Security.SecModle.SecurityModle r9 = (com.nic.mparivahan.Security.SecModle.SecurityModle) r9     // Catch:{ Exception -> 0x0031 }
            java.lang.String r2 = "_update"
            java.lang.String r3 = r9.toString()     // Catch:{ Exception -> 0x0031 }
            android.util.Log.d(r2, r3)     // Catch:{ Exception -> 0x0031 }
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x00a9 }
            r3 = 26
            java.lang.String r4 = "decode(...)"
            if (r2 < r3) goto L_0x00ab
            id.c$a r2 = id.c.f12675a     // Catch:{ Exception -> 0x00a9 }
            j$.util.Base64$Decoder r3 = j$.util.Base64.getDecoder()     // Catch:{ Exception -> 0x00a9 }
            java.lang.String r9 = r9.getData()     // Catch:{ Exception -> 0x00a9 }
            byte[] r9 = r3.decode((java.lang.String) r9)     // Catch:{ Exception -> 0x00a9 }
            cm.l.e(r9, r4)     // Catch:{ Exception -> 0x00a9 }
            java.lang.String r3 = new java.lang.String     // Catch:{ Exception -> 0x00a9 }
            java.nio.charset.Charset r4 = km.d.f24740b     // Catch:{ Exception -> 0x00a9 }
            r3.<init>(r9, r4)     // Catch:{ Exception -> 0x00a9 }
            java.lang.String r9 = r2.a(r1, r3)     // Catch:{ Exception -> 0x00a9 }
        L_0x00a4:
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ Exception -> 0x00a9 }
            goto L_0x00c5
        L_0x00a9:
            r9 = move-exception
            goto L_0x00dd
        L_0x00ab:
            id.c$a r2 = id.c.f12675a     // Catch:{ Exception -> 0x00a9 }
            java.lang.String r9 = r9.getData()     // Catch:{ Exception -> 0x00a9 }
            r3 = 0
            byte[] r9 = android.util.Base64.decode(r9, r3)     // Catch:{ Exception -> 0x00a9 }
            cm.l.e(r9, r4)     // Catch:{ Exception -> 0x00a9 }
            java.lang.String r3 = new java.lang.String     // Catch:{ Exception -> 0x00a9 }
            java.nio.charset.Charset r4 = km.d.f24740b     // Catch:{ Exception -> 0x00a9 }
            r3.<init>(r9, r4)     // Catch:{ Exception -> 0x00a9 }
            java.lang.String r9 = r2.a(r1, r3)     // Catch:{ Exception -> 0x00a9 }
            goto L_0x00a4
        L_0x00c5:
            java.lang.String r1 = "DlExtractResp"
            android.util.Log.d(r1, r9)     // Catch:{ Exception -> 0x00a9 }
            i7.d r1 = new i7.d     // Catch:{ Exception -> 0x00a9 }
            r1.<init>()     // Catch:{ Exception -> 0x00a9 }
            java.lang.Class<com.nic.mparivahan.dlservices.data.model.duplicatedl.GetAckDetEx> r2 = com.nic.mparivahan.dlservices.data.model.duplicatedl.GetAckDetEx.class
            java.lang.Object r9 = r1.j(r9, r2)     // Catch:{ Exception -> 0x00a9 }
            com.nic.mparivahan.dlservices.data.model.duplicatedl.GetAckDetEx r9 = (com.nic.mparivahan.dlservices.data.model.duplicatedl.GetAckDetEx) r9     // Catch:{ Exception -> 0x00a9 }
            androidx.lifecycle.a0 r1 = r0.f24891n     // Catch:{ Exception -> 0x00a9 }
            r1.k(r9)     // Catch:{ Exception -> 0x00a9 }
            goto L_0x0129
        L_0x00dd:
            r9.printStackTrace()     // Catch:{ Exception -> 0x0031 }
            java.lang.String r1 = "DlExtractErr"
            java.lang.String r9 = r9.getLocalizedMessage()     // Catch:{ Exception -> 0x0031 }
            android.util.Log.d(r1, r9)     // Catch:{ Exception -> 0x0031 }
            com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog$a r2 = com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog.f20957k     // Catch:{ Exception -> 0x0031 }
            android.app.Application r3 = r0.f24878a     // Catch:{ Exception -> 0x0031 }
            v9.d$a r9 = v9.d.f17494a     // Catch:{ Exception -> 0x0031 }
            java.lang.String r4 = r9.t()     // Catch:{ Exception -> 0x0031 }
            java.lang.String r5 = "applStatus"
            java.lang.String r6 = r9.v()     // Catch:{ Exception -> 0x0031 }
            java.lang.String r7 = r9.w()     // Catch:{ Exception -> 0x0031 }
            r2.a(r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x0031 }
            goto L_0x0129
        L_0x0101:
            r9 = move-exception
            r0 = r8
        L_0x0103:
            java.lang.String r9 = r9.getMessage()
            if (r9 == 0) goto L_0x0112
            java.lang.String r1 = "dl_renewal_logginga"
            int r9 = android.util.Log.e(r1, r9)
            kotlin.coroutines.jvm.internal.b.b(r9)
        L_0x0112:
            com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog$a r1 = com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog.f20957k
            android.app.Application r2 = r0.f24878a
            v9.d$a r9 = v9.d.f17494a
            java.lang.String r3 = r9.t()
            java.lang.String r4 = "applStatus"
            java.lang.String r5 = r9.v()
            java.lang.String r6 = r9.w()
            r1.a(r2, r3, r4, r5, r6)
        L_0x0129:
            pl.x r9 = pl.x.f30437a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: lj.n.a(tl.d):java.lang.Object");
    }

    public final a0 b() {
        return this.f24891n;
    }

    public final DlExRequest c() {
        Integer num = null;
        SelectedDLList selectedDLList = new SelectedDLList((String) null, 1, (cm.g) null);
        selectedDLList.setJsonMember523("DL Extract");
        DlExRequest dlExRequest = new DlExRequest((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (String) null, (String) null, (String) null, (SelectedDLList) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 131071, (cm.g) null);
        dlExRequest.setDlno(this.f24879b);
        dlExRequest.setDob(this.f24880c);
        dlExRequest.setRtoCodeDLTr(this.f24881d);
        dlExRequest.setWilltoDonateOrgans(this.f24884g);
        dlExRequest.setSelectedDLSerList(selectedDLList);
        String str = this.f24882e;
        if (str != null) {
            num = Integer.valueOf(Integer.parseInt(str));
        }
        dlExRequest.setDupDlReasonCode(num);
        dlExRequest.setDupDlReasonName(this.f24883f);
        dlExRequest.setDlHolderAltMobMum(this.f24885h);
        dlExRequest.setMobileNumber(this.f24886i);
        Log.d("extract_req", dlExRequest.toString());
        return dlExRequest;
    }
}
