package ti;

import android.app.Application;
import android.util.Log;
import androidx.lifecycle.a0;
import bm.p;
import com.nic.mparivahan.dlservices.data.model.DlRenewalSerList;
import com.nic.mparivahan.dlservices.data.model.DlRequestForSaveRequest;
import java.util.Map;
import kotlin.coroutines.jvm.internal.l;
import lm.d0;
import lm.e0;
import lm.f0;
import lm.k1;
import lm.q0;
import pl.q;
import pl.x;
import tl.d;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    private Application f31520a;

    /* renamed from: b  reason: collision with root package name */
    private String f31521b;

    /* renamed from: c  reason: collision with root package name */
    private String f31522c;

    /* renamed from: d  reason: collision with root package name */
    private String f31523d;

    /* renamed from: e  reason: collision with root package name */
    private Map f31524e;

    /* renamed from: f  reason: collision with root package name */
    private String f31525f;

    /* renamed from: g  reason: collision with root package name */
    private String f31526g;

    /* renamed from: h  reason: collision with root package name */
    private String f31527h;

    /* renamed from: i  reason: collision with root package name */
    private String f31528i;

    /* renamed from: j  reason: collision with root package name */
    private String f31529j;

    /* renamed from: k  reason: collision with root package name */
    private String f31530k;

    /* renamed from: l  reason: collision with root package name */
    private final a0 f31531l = new a0();

    static final class a extends l implements p {

        /* renamed from: f  reason: collision with root package name */
        int f31532f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ g f31533g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(g gVar, d dVar) {
            super(2, dVar);
            this.f31533g = gVar;
        }

        /* renamed from: b */
        public final Object h(d0 d0Var, d dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(x.f30437a);
        }

        public final d create(Object obj, d dVar) {
            return new a(this.f31533g, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object c10 = d.c();
            int i10 = this.f31532f;
            if (i10 == 0) {
                q.b(obj);
                g gVar = this.f31533g;
                this.f31532f = 1;
                if (gVar.a(this) == c10) {
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
        Object f31534e;

        /* renamed from: f  reason: collision with root package name */
        Object f31535f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f31536g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ g f31537h;

        /* renamed from: i  reason: collision with root package name */
        int f31538i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(g gVar, d dVar) {
            super(dVar);
            this.f31537h = gVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f31536g = obj;
            this.f31538i |= Integer.MIN_VALUE;
            return this.f31537h.a(this);
        }
    }

    public g(Application application, String str, String str2, String str3, Map map, String str4, String str5, String str6, String str7, String str8, String str9) {
        cm.l.f(application, "mApp");
        cm.l.f(str, "dlNumber");
        cm.l.f(str2, "dob");
        cm.l.f(str3, "rtoCode");
        cm.l.f(str4, "applcatgDLserReq");
        cm.l.f(str5, "mobileNumber");
        cm.l.f(str6, "eKYCId");
        cm.l.f(str7, "eKYCOpted");
        cm.l.f(str8, "eKYCGender");
        cm.l.f(str9, "eKYCPhoto");
        this.f31520a = application;
        this.f31521b = str;
        this.f31522c = str2;
        this.f31523d = str3;
        this.f31524e = map;
        this.f31525f = str4;
        this.f31526g = str5;
        this.f31527h = str6;
        this.f31528i = str7;
        this.f31529j = str8;
        this.f31530k = str9;
        k1 unused = g.d(e0.a(q0.b()), (tl.g) null, (f0) null, new a(this, (d) null), 3, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007f A[SYNTHETIC, Splitter:B:29:0x007f] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a2 A[Catch:{ Exception -> 0x00a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(tl.d r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof ti.g.b
            if (r0 == 0) goto L_0x0013
            r0 = r9
            ti.g$b r0 = (ti.g.b) r0
            int r1 = r0.f31538i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f31538i = r1
            goto L_0x0018
        L_0x0013:
            ti.g$b r0 = new ti.g$b
            r0.<init>(r8, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f31536g
            java.lang.Object r1 = ul.d.c()
            int r2 = r0.f31538i
            r3 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 != r3) goto L_0x0034
            java.lang.Object r1 = r0.f31535f
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.f31534e
            ti.g r0 = (ti.g) r0
            pl.q.b(r9)     // Catch:{ Exception -> 0x0031 }
            goto L_0x0075
        L_0x0031:
            r9 = move-exception
            goto L_0x00fa
        L_0x0034:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x003c:
            pl.q.b(r9)
            si.b$a r9 = si.b.f31257a
            android.app.Application r2 = r8.f31520a
            boolean r9 = r9.a(r2)
            if (r9 == 0) goto L_0x0120
            long r4 = java.lang.System.currentTimeMillis()
            java.lang.String r9 = java.lang.String.valueOf(r4)
            si.a$a r2 = si.a.f31253a
            android.app.Application r4 = r8.f31520a
            retrofit2.Retrofit r2 = r2.a(r4)
            java.lang.Class<com.nic.mparivahan.dlservices.data.network.DlRenewalServices> r4 = com.nic.mparivahan.dlservices.data.network.DlRenewalServices.class
            java.lang.Object r2 = r2.create(r4)
            com.nic.mparivahan.dlservices.data.network.DlRenewalServices r2 = (com.nic.mparivahan.dlservices.data.network.DlRenewalServices) r2
            com.nic.mparivahan.dlservices.data.model.DlRequestForSaveRequest r4 = r8.c()     // Catch:{ Exception -> 0x00f8 }
            r0.f31534e = r8     // Catch:{ Exception -> 0x00f8 }
            r0.f31535f = r9     // Catch:{ Exception -> 0x00f8 }
            r0.f31538i = r3     // Catch:{ Exception -> 0x00f8 }
            java.lang.Object r0 = r2.saveDlRenewalDetails(r4, r9, r0)     // Catch:{ Exception -> 0x00f8 }
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
            goto L_0x00d4
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
            java.lang.String r1 = "renewal_response"
            android.util.Log.d(r1, r9)     // Catch:{ Exception -> 0x00a0 }
            i7.d r1 = new i7.d     // Catch:{ Exception -> 0x00a0 }
            r1.<init>()     // Catch:{ Exception -> 0x00a0 }
            java.lang.Class<com.nic.mparivahan.dlservices.data.model.DlRenewalSaveDto> r2 = com.nic.mparivahan.dlservices.data.model.DlRenewalSaveDto.class
            java.lang.Object r9 = r1.j(r9, r2)     // Catch:{ Exception -> 0x00a0 }
            com.nic.mparivahan.dlservices.data.model.DlRenewalSaveDto r9 = (com.nic.mparivahan.dlservices.data.model.DlRenewalSaveDto) r9     // Catch:{ Exception -> 0x00a0 }
            androidx.lifecycle.a0 r1 = r0.f31531l     // Catch:{ Exception -> 0x00a0 }
            r1.k(r9)     // Catch:{ Exception -> 0x00a0 }
            goto L_0x0120
        L_0x00d4:
            r9.printStackTrace()     // Catch:{ Exception -> 0x0031 }
            java.lang.String r1 = "DecRes-"
            java.lang.String r9 = r9.getLocalizedMessage()     // Catch:{ Exception -> 0x0031 }
            android.util.Log.d(r1, r9)     // Catch:{ Exception -> 0x0031 }
            com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog$a r2 = com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog.f20957k     // Catch:{ Exception -> 0x0031 }
            android.app.Application r3 = r0.f31520a     // Catch:{ Exception -> 0x0031 }
            v9.d$a r9 = v9.d.f17494a     // Catch:{ Exception -> 0x0031 }
            java.lang.String r4 = r9.t()     // Catch:{ Exception -> 0x0031 }
            java.lang.String r5 = "getAckDetForGivenDLNumber"
            java.lang.String r6 = r9.v()     // Catch:{ Exception -> 0x0031 }
            java.lang.String r7 = r9.w()     // Catch:{ Exception -> 0x0031 }
            r2.a(r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x0031 }
            goto L_0x0120
        L_0x00f8:
            r9 = move-exception
            r0 = r8
        L_0x00fa:
            java.lang.String r9 = r9.getMessage()
            if (r9 == 0) goto L_0x0109
            java.lang.String r1 = "dl_renewal_logginga"
            int r9 = android.util.Log.e(r1, r9)
            kotlin.coroutines.jvm.internal.b.b(r9)
        L_0x0109:
            com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog$a r1 = com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog.f20957k
            android.app.Application r2 = r0.f31520a
            v9.d$a r9 = v9.d.f17494a
            java.lang.String r3 = r9.t()
            java.lang.String r4 = "getAckDetForGivenDLNumber"
            java.lang.String r5 = r9.v()
            java.lang.String r6 = r9.w()
            r1.a(r2, r3, r4, r5, r6)
        L_0x0120:
            pl.x r9 = pl.x.f30437a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ti.g.a(tl.d):java.lang.Object");
    }

    public final a0 b() {
        return this.f31531l;
    }

    public final DlRequestForSaveRequest c() {
        DlRenewalSerList dlRenewalSerList = new DlRenewalSerList((String) null, 1, (cm.g) null);
        dlRenewalSerList.setJsonMember514("Renewal of DL");
        DlRequestForSaveRequest dlRequestForSaveRequest = new DlRequestForSaveRequest((String) null, (String) null, (String) null, (String) null, (String) null, (DlRenewalSerList) null, (String) null, (String) null, (String) null, (String) null, 1023, (cm.g) null);
        dlRequestForSaveRequest.setRtoCodeDLTr(this.f31523d);
        dlRequestForSaveRequest.setDlno(this.f31521b);
        dlRequestForSaveRequest.setDob(this.f31522c);
        dlRequestForSaveRequest.setApplcatgDLserReq(this.f31525f);
        dlRequestForSaveRequest.setMobileNumber(this.f31526g);
        dlRequestForSaveRequest.setMDlRenewalSerList(dlRenewalSerList);
        Log.e("dl_renewal_loggingpar", dlRequestForSaveRequest.toString());
        return dlRequestForSaveRequest;
    }
}
