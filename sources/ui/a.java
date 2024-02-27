package ui;

import android.app.Application;
import android.util.Log;
import androidx.lifecycle.a0;
import bm.p;
import com.nic.mparivahan.dlservices.data.model.duplicatedl.DuplicateDlRequest;
import com.nic.mparivahan.dlservices.data.model.duplicatedl.DuplicateSelectedDLSerList;
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
    private final Application f31774a;

    /* renamed from: b  reason: collision with root package name */
    private String f31775b;

    /* renamed from: c  reason: collision with root package name */
    private String f31776c;

    /* renamed from: d  reason: collision with root package name */
    private String f31777d;

    /* renamed from: e  reason: collision with root package name */
    private String f31778e;

    /* renamed from: f  reason: collision with root package name */
    private String f31779f;

    /* renamed from: g  reason: collision with root package name */
    private String f31780g;

    /* renamed from: h  reason: collision with root package name */
    private String f31781h;

    /* renamed from: i  reason: collision with root package name */
    private String f31782i;

    /* renamed from: j  reason: collision with root package name */
    private String f31783j;

    /* renamed from: k  reason: collision with root package name */
    private String f31784k;

    /* renamed from: l  reason: collision with root package name */
    private String f31785l;

    /* renamed from: m  reason: collision with root package name */
    private String f31786m;

    /* renamed from: n  reason: collision with root package name */
    public String f31787n;

    /* renamed from: o  reason: collision with root package name */
    private final a0 f31788o = new a0();

    /* renamed from: ui.a$a  reason: collision with other inner class name */
    static final class C0360a extends l implements p {

        /* renamed from: f  reason: collision with root package name */
        int f31789f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ a f31790g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0360a(a aVar, d dVar) {
            super(2, dVar);
            this.f31790g = aVar;
        }

        /* renamed from: b */
        public final Object h(d0 d0Var, d dVar) {
            return ((C0360a) create(d0Var, dVar)).invokeSuspend(x.f30437a);
        }

        public final d create(Object obj, d dVar) {
            return new C0360a(this.f31790g, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object c10 = d.c();
            int i10 = this.f31789f;
            if (i10 == 0) {
                q.b(obj);
                a aVar = this.f31790g;
                this.f31789f = 1;
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
        Object f31791e;

        /* renamed from: f  reason: collision with root package name */
        Object f31792f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f31793g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ a f31794h;

        /* renamed from: i  reason: collision with root package name */
        int f31795i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar, d dVar) {
            super(dVar);
            this.f31794h = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f31793g = obj;
            this.f31795i |= Integer.MIN_VALUE;
            return this.f31794h.a(this);
        }
    }

    public a(Application application, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        cm.l.f(application, "app");
        this.f31774a = application;
        this.f31775b = str;
        this.f31776c = str2;
        this.f31777d = str3;
        this.f31778e = str4;
        this.f31779f = str5;
        this.f31780g = str6;
        this.f31781h = str7;
        this.f31782i = str8;
        this.f31783j = str9;
        this.f31784k = str10;
        this.f31785l = str11;
        this.f31786m = str12;
        k1 unused = g.d(e0.a(q0.b()), (g) null, (f0) null, new C0360a(this, (d) null), 3, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x007c A[SYNTHETIC, Splitter:B:28:0x007c] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x009f A[Catch:{ Exception -> 0x009d }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(tl.d r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof ui.a.b
            if (r0 == 0) goto L_0x0013
            r0 = r8
            ui.a$b r0 = (ui.a.b) r0
            int r1 = r0.f31795i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f31795i = r1
            goto L_0x0018
        L_0x0013:
            ui.a$b r0 = new ui.a$b
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f31793g
            java.lang.Object r1 = ul.d.c()
            int r2 = r0.f31795i
            r3 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r1 = r0.f31792f
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.f31791e
            ui.a r0 = (ui.a) r0
            pl.q.b(r8)     // Catch:{ Exception -> 0x00f8 }
            goto L_0x0072
        L_0x0031:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x0039:
            pl.q.b(r8)
            si.b$a r8 = si.b.f31257a
            android.app.Application r2 = r7.f31774a
            boolean r8 = r8.a(r2)
            if (r8 == 0) goto L_0x010f
            long r4 = java.lang.System.currentTimeMillis()
            java.lang.String r8 = java.lang.String.valueOf(r4)
            si.a$a r2 = si.a.f31253a
            android.app.Application r4 = r7.f31774a
            retrofit2.Retrofit r2 = r2.a(r4)
            java.lang.Class<com.nic.mparivahan.dlservices.data.network.DlExtraService> r4 = com.nic.mparivahan.dlservices.data.network.DlExtraService.class
            java.lang.Object r2 = r2.create(r4)
            com.nic.mparivahan.dlservices.data.network.DlExtraService r2 = (com.nic.mparivahan.dlservices.data.network.DlExtraService) r2
            com.nic.mparivahan.dlservices.data.model.duplicatedl.DuplicateDlRequest r4 = r7.d()     // Catch:{ Exception -> 0x00f7 }
            r0.f31791e = r7     // Catch:{ Exception -> 0x00f7 }
            r0.f31792f = r8     // Catch:{ Exception -> 0x00f7 }
            r0.f31795i = r3     // Catch:{ Exception -> 0x00f7 }
            java.lang.Object r0 = r2.getAckDetForGivenDLNumber(r4, r8, r0)     // Catch:{ Exception -> 0x00f7 }
            if (r0 != r1) goto L_0x006f
            return r1
        L_0x006f:
            r1 = r8
            r8 = r0
            r0 = r7
        L_0x0072:
            com.nic.mparivahan.Security.SecModle.SecurityModle r8 = (com.nic.mparivahan.Security.SecModle.SecurityModle) r8     // Catch:{ Exception -> 0x00f8 }
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x009d }
            r3 = 26
            java.lang.String r4 = "decode(...)"
            if (r2 < r3) goto L_0x009f
            id.c$a r2 = id.c.f12675a     // Catch:{ Exception -> 0x009d }
            j$.util.Base64$Decoder r3 = j$.util.Base64.getDecoder()     // Catch:{ Exception -> 0x009d }
            java.lang.String r8 = r8.getData()     // Catch:{ Exception -> 0x009d }
            byte[] r8 = r3.decode((java.lang.String) r8)     // Catch:{ Exception -> 0x009d }
            cm.l.e(r8, r4)     // Catch:{ Exception -> 0x009d }
            java.lang.String r3 = new java.lang.String     // Catch:{ Exception -> 0x009d }
            java.nio.charset.Charset r4 = km.d.f24740b     // Catch:{ Exception -> 0x009d }
            r3.<init>(r8, r4)     // Catch:{ Exception -> 0x009d }
            java.lang.String r8 = r2.a(r1, r3)     // Catch:{ Exception -> 0x009d }
        L_0x0098:
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ Exception -> 0x009d }
            goto L_0x00b9
        L_0x009d:
            r8 = move-exception
            goto L_0x00dc
        L_0x009f:
            id.c$a r2 = id.c.f12675a     // Catch:{ Exception -> 0x009d }
            java.lang.String r8 = r8.getData()     // Catch:{ Exception -> 0x009d }
            r3 = 0
            byte[] r8 = android.util.Base64.decode(r8, r3)     // Catch:{ Exception -> 0x009d }
            cm.l.e(r8, r4)     // Catch:{ Exception -> 0x009d }
            java.lang.String r3 = new java.lang.String     // Catch:{ Exception -> 0x009d }
            java.nio.charset.Charset r4 = km.d.f24740b     // Catch:{ Exception -> 0x009d }
            r3.<init>(r8, r4)     // Catch:{ Exception -> 0x009d }
            java.lang.String r8 = r2.a(r1, r3)     // Catch:{ Exception -> 0x009d }
            goto L_0x0098
        L_0x00b9:
            r0.e(r8)     // Catch:{ Exception -> 0x009d }
            java.lang.String r8 = "DuplicateDlResp"
            java.lang.String r1 = r0.b()     // Catch:{ Exception -> 0x009d }
            android.util.Log.d(r8, r1)     // Catch:{ Exception -> 0x009d }
            i7.d r8 = new i7.d     // Catch:{ Exception -> 0x009d }
            r8.<init>()     // Catch:{ Exception -> 0x009d }
            java.lang.String r1 = r0.b()     // Catch:{ Exception -> 0x009d }
            java.lang.Class<com.nic.mparivahan.dlservices.data.model.duplicatedl.GetAckDetForGivenDLNumberResponse> r2 = com.nic.mparivahan.dlservices.data.model.duplicatedl.GetAckDetForGivenDLNumberResponse.class
            java.lang.Object r8 = r8.j(r1, r2)     // Catch:{ Exception -> 0x009d }
            com.nic.mparivahan.dlservices.data.model.duplicatedl.GetAckDetForGivenDLNumberResponse r8 = (com.nic.mparivahan.dlservices.data.model.duplicatedl.GetAckDetForGivenDLNumberResponse) r8     // Catch:{ Exception -> 0x009d }
            androidx.lifecycle.a0 r1 = r0.f31788o     // Catch:{ Exception -> 0x009d }
            r1.k(r8)     // Catch:{ Exception -> 0x009d }
            goto L_0x010f
        L_0x00dc:
            r8.printStackTrace()     // Catch:{ Exception -> 0x00f8 }
            com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog$a r1 = com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog.f20957k     // Catch:{ Exception -> 0x00f8 }
            android.app.Application r2 = r0.f31774a     // Catch:{ Exception -> 0x00f8 }
            v9.d$a r8 = v9.d.f17494a     // Catch:{ Exception -> 0x00f8 }
            java.lang.String r3 = r8.t()     // Catch:{ Exception -> 0x00f8 }
            java.lang.String r4 = "getAckDetForGivenDLNumber"
            java.lang.String r5 = r8.v()     // Catch:{ Exception -> 0x00f8 }
            java.lang.String r6 = r8.w()     // Catch:{ Exception -> 0x00f8 }
            r1.a(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x00f8 }
            goto L_0x010f
        L_0x00f7:
            r0 = r7
        L_0x00f8:
            com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog$a r1 = com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog.f20957k
            android.app.Application r2 = r0.f31774a
            v9.d$a r8 = v9.d.f17494a
            java.lang.String r3 = r8.t()
            java.lang.String r4 = "getAckDetForGivenDLNumber"
            java.lang.String r5 = r8.v()
            java.lang.String r6 = r8.w()
            r1.a(r2, r3, r4, r5, r6)
        L_0x010f:
            pl.x r8 = pl.x.f30437a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ui.a.a(tl.d):java.lang.Object");
    }

    public final String b() {
        String str = this.f31787n;
        if (str != null) {
            return str;
        }
        cm.l.v("decryptedString");
        return null;
    }

    public final a0 c() {
        return this.f31788o;
    }

    public final DuplicateDlRequest d() {
        Integer num = null;
        DuplicateSelectedDLSerList duplicateSelectedDLSerList = new DuplicateSelectedDLSerList((String) null, 1, (cm.g) null);
        duplicateSelectedDLSerList.setJsonMember513("Issue of Duplicate DL");
        DuplicateDlRequest duplicateDlRequest = new DuplicateDlRequest((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (DuplicateSelectedDLSerList) null, (String) null, (String) null, (String) null, (String) null, 131071, (cm.g) null);
        duplicateDlRequest.setDlno(this.f31775b);
        duplicateDlRequest.setDob(this.f31776c);
        duplicateDlRequest.setRtoCodeDLTr(this.f31777d);
        duplicateDlRequest.setWilltoDonateOrgans(this.f31780g);
        duplicateDlRequest.setSelectedDLSerList(duplicateSelectedDLSerList);
        String str = this.f31778e;
        if (str != null) {
            num = Integer.valueOf(Integer.parseInt(str));
        }
        duplicateDlRequest.setDupDlReasonCode(num);
        duplicateDlRequest.setDupDlReasonName(this.f31779f);
        duplicateDlRequest.setDlHolderAltMobMum(this.f31781h);
        duplicateDlRequest.setMobileNumber(this.f31782i);
        Log.e("dl_renewal_loggingpar", duplicateDlRequest.toString());
        return duplicateDlRequest;
    }

    public final void e(String str) {
        cm.l.f(str, "<set-?>");
        this.f31787n = str;
    }
}
