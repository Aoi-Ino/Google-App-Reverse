package pj;

import android.app.Application;
import android.util.Log;
import androidx.lifecycle.a0;
import bm.p;
import com.nic.mparivahan.dlservices.ui.dobChange.Repository.ChangeDobRequest;
import com.nic.mparivahan.dlservices.ui.dobChange.Repository.ChangeOfDobSelectedServiceList;
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
    private final Application f30377a;

    /* renamed from: b  reason: collision with root package name */
    private String f30378b;

    /* renamed from: c  reason: collision with root package name */
    private String f30379c;

    /* renamed from: d  reason: collision with root package name */
    private String f30380d;

    /* renamed from: e  reason: collision with root package name */
    private String f30381e;

    /* renamed from: f  reason: collision with root package name */
    private String f30382f;

    /* renamed from: g  reason: collision with root package name */
    private String f30383g;

    /* renamed from: h  reason: collision with root package name */
    private String f30384h;

    /* renamed from: i  reason: collision with root package name */
    private String f30385i;

    /* renamed from: j  reason: collision with root package name */
    private String f30386j;

    /* renamed from: k  reason: collision with root package name */
    private String f30387k;

    /* renamed from: l  reason: collision with root package name */
    private String f30388l;

    /* renamed from: m  reason: collision with root package name */
    private String f30389m;

    /* renamed from: n  reason: collision with root package name */
    private String f30390n;

    /* renamed from: o  reason: collision with root package name */
    private String f30391o;

    /* renamed from: p  reason: collision with root package name */
    public String f30392p;

    /* renamed from: q  reason: collision with root package name */
    private final a0 f30393q = new a0();

    /* renamed from: pj.a$a  reason: collision with other inner class name */
    static final class C0332a extends l implements p {

        /* renamed from: f  reason: collision with root package name */
        int f30394f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ a f30395g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0332a(a aVar, d dVar) {
            super(2, dVar);
            this.f30395g = aVar;
        }

        /* renamed from: b */
        public final Object h(d0 d0Var, d dVar) {
            return ((C0332a) create(d0Var, dVar)).invokeSuspend(x.f30437a);
        }

        public final d create(Object obj, d dVar) {
            return new C0332a(this.f30395g, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object c10 = d.c();
            int i10 = this.f30394f;
            if (i10 == 0) {
                q.b(obj);
                a aVar = this.f30395g;
                this.f30394f = 1;
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
        Object f30396e;

        /* renamed from: f  reason: collision with root package name */
        Object f30397f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f30398g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ a f30399h;

        /* renamed from: i  reason: collision with root package name */
        int f30400i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar, d dVar) {
            super(dVar);
            this.f30399h = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f30398g = obj;
            this.f30400i |= Integer.MIN_VALUE;
            return this.f30399h.a(this);
        }
    }

    public a(Application application, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
        cm.l.f(application, "app");
        this.f30377a = application;
        this.f30378b = str;
        this.f30379c = str2;
        this.f30380d = str3;
        this.f30381e = str4;
        this.f30382f = str5;
        this.f30383g = str6;
        this.f30384h = str7;
        this.f30385i = str8;
        this.f30386j = str9;
        this.f30387k = str10;
        this.f30388l = str11;
        this.f30389m = str12;
        this.f30390n = str13;
        this.f30391o = str14;
        k1 unused = g.d(e0.a(q0.b()), (g) null, (f0) null, new C0332a(this, (d) null), 3, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0081 A[SYNTHETIC, Splitter:B:29:0x0081] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a4 A[Catch:{ Exception -> 0x00a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(tl.d r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof pj.a.b
            if (r0 == 0) goto L_0x0013
            r0 = r11
            pj.a$b r0 = (pj.a.b) r0
            int r1 = r0.f30400i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f30400i = r1
            goto L_0x0018
        L_0x0013:
            pj.a$b r0 = new pj.a$b
            r0.<init>(r10, r11)
        L_0x0018:
            java.lang.Object r11 = r0.f30398g
            java.lang.Object r1 = ul.d.c()
            int r2 = r0.f30400i
            java.lang.String r3 = "DuplicateDlRespErr"
            r4 = 1
            if (r2 == 0) goto L_0x003e
            if (r2 != r4) goto L_0x0036
            java.lang.Object r1 = r0.f30397f
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.f30396e
            pj.a r0 = (pj.a) r0
            pl.q.b(r11)     // Catch:{ Exception -> 0x0033 }
            goto L_0x0077
        L_0x0033:
            r11 = move-exception
            goto L_0x0118
        L_0x0036:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L_0x003e:
            pl.q.b(r11)
            si.b$a r11 = si.b.f31257a
            android.app.Application r2 = r10.f30377a
            boolean r11 = r11.a(r2)
            if (r11 == 0) goto L_0x0145
            long r5 = java.lang.System.currentTimeMillis()
            java.lang.String r11 = java.lang.String.valueOf(r5)
            si.a$a r2 = si.a.f31253a
            android.app.Application r5 = r10.f30377a
            retrofit2.Retrofit r2 = r2.a(r5)
            java.lang.Class<com.nic.mparivahan.dlservices.ui.dobChange.Service.DobChangesService> r5 = com.nic.mparivahan.dlservices.ui.dobChange.Service.DobChangesService.class
            java.lang.Object r2 = r2.create(r5)
            com.nic.mparivahan.dlservices.ui.dobChange.Service.DobChangesService r2 = (com.nic.mparivahan.dlservices.ui.dobChange.Service.DobChangesService) r2
            com.nic.mparivahan.dlservices.ui.dobChange.Repository.ChangeDobRequest r5 = r10.d()     // Catch:{ Exception -> 0x0116 }
            r0.f30396e = r10     // Catch:{ Exception -> 0x0116 }
            r0.f30397f = r11     // Catch:{ Exception -> 0x0116 }
            r0.f30400i = r4     // Catch:{ Exception -> 0x0116 }
            java.lang.Object r0 = r2.changeDobForGivenDLNumber(r5, r11, r0)     // Catch:{ Exception -> 0x0116 }
            if (r0 != r1) goto L_0x0074
            return r1
        L_0x0074:
            r1 = r11
            r11 = r0
            r0 = r10
        L_0x0077:
            com.nic.mparivahan.Security.SecModle.SecurityModle r11 = (com.nic.mparivahan.Security.SecModle.SecurityModle) r11     // Catch:{ Exception -> 0x0033 }
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x00a2 }
            r4 = 26
            java.lang.String r5 = "decode(...)"
            if (r2 < r4) goto L_0x00a4
            id.c$a r2 = id.c.f12675a     // Catch:{ Exception -> 0x00a2 }
            j$.util.Base64$Decoder r4 = j$.util.Base64.getDecoder()     // Catch:{ Exception -> 0x00a2 }
            java.lang.String r11 = r11.getData()     // Catch:{ Exception -> 0x00a2 }
            byte[] r11 = r4.decode((java.lang.String) r11)     // Catch:{ Exception -> 0x00a2 }
            cm.l.e(r11, r5)     // Catch:{ Exception -> 0x00a2 }
            java.lang.String r4 = new java.lang.String     // Catch:{ Exception -> 0x00a2 }
            java.nio.charset.Charset r5 = km.d.f24740b     // Catch:{ Exception -> 0x00a2 }
            r4.<init>(r11, r5)     // Catch:{ Exception -> 0x00a2 }
            java.lang.String r11 = r2.a(r1, r4)     // Catch:{ Exception -> 0x00a2 }
        L_0x009d:
            java.lang.String r11 = java.lang.String.valueOf(r11)     // Catch:{ Exception -> 0x00a2 }
            goto L_0x00be
        L_0x00a2:
            r11 = move-exception
            goto L_0x00f4
        L_0x00a4:
            id.c$a r2 = id.c.f12675a     // Catch:{ Exception -> 0x00a2 }
            java.lang.String r11 = r11.getData()     // Catch:{ Exception -> 0x00a2 }
            r4 = 0
            byte[] r11 = android.util.Base64.decode(r11, r4)     // Catch:{ Exception -> 0x00a2 }
            cm.l.e(r11, r5)     // Catch:{ Exception -> 0x00a2 }
            java.lang.String r4 = new java.lang.String     // Catch:{ Exception -> 0x00a2 }
            java.nio.charset.Charset r5 = km.d.f24740b     // Catch:{ Exception -> 0x00a2 }
            r4.<init>(r11, r5)     // Catch:{ Exception -> 0x00a2 }
            java.lang.String r11 = r2.a(r1, r4)     // Catch:{ Exception -> 0x00a2 }
            goto L_0x009d
        L_0x00be:
            r0.e(r11)     // Catch:{ Exception -> 0x00a2 }
            java.lang.String r11 = "DuplicateDlResp"
            java.lang.String r1 = r0.b()     // Catch:{ Exception -> 0x00a2 }
            android.util.Log.d(r11, r1)     // Catch:{ Exception -> 0x00a2 }
            i7.d r11 = new i7.d     // Catch:{ Exception -> 0x00a2 }
            r11.<init>()     // Catch:{ Exception -> 0x00a2 }
            java.lang.String r1 = r0.b()     // Catch:{ Exception -> 0x00a2 }
            java.lang.Class<com.nic.mparivahan.dlservices.data.model.duplicatedl.GetAckDetForGivenDLNumberResponse> r2 = com.nic.mparivahan.dlservices.data.model.duplicatedl.GetAckDetForGivenDLNumberResponse.class
            java.lang.Object r11 = r11.j(r1, r2)     // Catch:{ Exception -> 0x00a2 }
            com.nic.mparivahan.dlservices.data.model.duplicatedl.GetAckDetForGivenDLNumberResponse r11 = (com.nic.mparivahan.dlservices.data.model.duplicatedl.GetAckDetForGivenDLNumberResponse) r11     // Catch:{ Exception -> 0x00a2 }
            androidx.lifecycle.a0 r1 = r0.f30393q     // Catch:{ Exception -> 0x00a2 }
            r1.k(r11)     // Catch:{ Exception -> 0x00a2 }
            com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog$a r4 = com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog.f20957k     // Catch:{ Exception -> 0x00a2 }
            android.app.Application r5 = r0.f30377a     // Catch:{ Exception -> 0x00a2 }
            v9.d$a r11 = v9.d.f17494a     // Catch:{ Exception -> 0x00a2 }
            java.lang.String r6 = r11.t()     // Catch:{ Exception -> 0x00a2 }
            java.lang.String r7 = "getAckDetForGivenDLNumber"
            java.lang.String r8 = "200"
            java.lang.String r9 = "OK"
            r4.a(r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x00a2 }
            goto L_0x0145
        L_0x00f4:
            r11.printStackTrace()     // Catch:{ Exception -> 0x0033 }
            java.lang.String r11 = r0.b()     // Catch:{ Exception -> 0x0033 }
            android.util.Log.d(r3, r11)     // Catch:{ Exception -> 0x0033 }
            com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog$a r4 = com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog.f20957k     // Catch:{ Exception -> 0x0033 }
            android.app.Application r5 = r0.f30377a     // Catch:{ Exception -> 0x0033 }
            v9.d$a r11 = v9.d.f17494a     // Catch:{ Exception -> 0x0033 }
            java.lang.String r6 = r11.t()     // Catch:{ Exception -> 0x0033 }
            java.lang.String r7 = "getAckDetForGivenDLNumber"
            java.lang.String r8 = r11.v()     // Catch:{ Exception -> 0x0033 }
            java.lang.String r9 = r11.w()     // Catch:{ Exception -> 0x0033 }
            r4.a(r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x0033 }
            goto L_0x0145
        L_0x0116:
            r11 = move-exception
            r0 = r10
        L_0x0118:
            java.lang.String r1 = r11.getLocalizedMessage()
            android.util.Log.d(r3, r1)
            java.lang.String r11 = r11.getMessage()
            if (r11 == 0) goto L_0x012e
            java.lang.String r1 = "dl_renewal_logginga"
            int r11 = android.util.Log.e(r1, r11)
            kotlin.coroutines.jvm.internal.b.b(r11)
        L_0x012e:
            com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog$a r1 = com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog.f20957k
            android.app.Application r2 = r0.f30377a
            v9.d$a r11 = v9.d.f17494a
            java.lang.String r3 = r11.t()
            java.lang.String r4 = "getAckDetForGivenDLNumber"
            java.lang.String r5 = r11.v()
            java.lang.String r6 = r11.w()
            r1.a(r2, r3, r4, r5, r6)
        L_0x0145:
            pl.x r11 = pl.x.f30437a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: pj.a.a(tl.d):java.lang.Object");
    }

    public final String b() {
        String str = this.f30392p;
        if (str != null) {
            return str;
        }
        cm.l.v("decryptedString");
        return null;
    }

    public final a0 c() {
        return this.f30393q;
    }

    public final ChangeDobRequest d() {
        ChangeOfDobSelectedServiceList changeOfDobSelectedServiceList = new ChangeOfDobSelectedServiceList((String) null, 1, (cm.g) null);
        changeOfDobSelectedServiceList.setJsonMember513("CHANGE OF DATE OF BIRTH IN DL");
        ChangeDobRequest changeDobRequest = new ChangeDobRequest((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (ChangeOfDobSelectedServiceList) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 524287, (cm.g) null);
        changeDobRequest.setDlno(this.f30378b);
        changeDobRequest.setDob(this.f30379c);
        changeDobRequest.setRtoCodeDLTr(this.f30380d);
        changeDobRequest.setWilltoDonateOrgans(this.f30381e);
        changeDobRequest.setSelectedDLSerList(changeOfDobSelectedServiceList);
        changeDobRequest.setApplcatgDLserReq(this.f30384h);
        changeDobRequest.setApplDateOfBirth(this.f30385i);
        changeDobRequest.setCodobDlReasonName(this.f30386j);
        changeDobRequest.setCodobDlReasonCode(this.f30387k);
        changeDobRequest.setDlHolderAltMobMum(this.f30382f);
        changeDobRequest.setMobileNumber(this.f30383g);
        Log.e("dl_renewal_loggingpar", changeDobRequest.toString());
        return changeDobRequest;
    }

    public final void e(String str) {
        cm.l.f(str, "<set-?>");
        this.f30392p = str;
    }
}
