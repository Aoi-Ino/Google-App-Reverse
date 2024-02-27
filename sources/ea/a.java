package ea;

import android.util.Log;
import androidx.lifecycle.a0;
import androidx.lifecycle.t0;
import cm.l;
import retrofit2.Call;
import retrofit2.Callback;
import um.c0;
import um.x;

public final class a extends t0 {

    /* renamed from: d  reason: collision with root package name */
    private final d f11118d;

    /* renamed from: e  reason: collision with root package name */
    private a0 f11119e = new a0();

    /* renamed from: f  reason: collision with root package name */
    private a0 f11120f = new a0();

    /* renamed from: g  reason: collision with root package name */
    private a0 f11121g = new a0();

    /* renamed from: h  reason: collision with root package name */
    private final a0 f11122h = new a0();

    /* renamed from: i  reason: collision with root package name */
    private final a0 f11123i = new a0();

    /* renamed from: j  reason: collision with root package name */
    private final a0 f11124j = new a0();

    /* renamed from: k  reason: collision with root package name */
    private final a0 f11125k = new a0();

    /* renamed from: ea.a$a  reason: collision with other inner class name */
    public static final class C0142a implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f11126a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f11127b;

        C0142a(a aVar, boolean z10) {
            this.f11126a = aVar;
            this.f11127b = z10;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f11126a.i().k("Error");
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(5:15|16|17|18|19) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0031 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onResponse(retrofit2.Call r5, retrofit2.Response r6) {
            /*
                r4 = this;
                java.lang.String r5 = "Error"
                if (r6 == 0) goto L_0x00ad
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Error -> 0x00a4 }
                r0.<init>()     // Catch:{ Error -> 0x00a4 }
                r1 = 0
                java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0031 }
                java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x0031 }
                java.lang.Object r6 = r6.body()     // Catch:{ Exception -> 0x0031 }
                um.e0 r6 = (um.e0) r6     // Catch:{ Exception -> 0x0031 }
                if (r6 == 0) goto L_0x001b
                java.io.InputStream r6 = r6.byteStream()     // Catch:{ Exception -> 0x0031 }
                goto L_0x001c
            L_0x001b:
                r6 = r1
            L_0x001c:
                r3.<init>(r6)     // Catch:{ Exception -> 0x0031 }
                r2.<init>(r3)     // Catch:{ Exception -> 0x0031 }
            L_0x0022:
                java.lang.String r6 = r2.readLine()     // Catch:{ IOException -> 0x002c }
                if (r6 == 0) goto L_0x003a
                r0.append(r6)     // Catch:{ IOException -> 0x002c }
                goto L_0x0022
            L_0x002c:
                r6 = move-exception
                r6.printStackTrace()     // Catch:{ Exception -> 0x0031 }
                goto L_0x003a
            L_0x0031:
                ea.a r6 = r4.f11126a     // Catch:{ Error -> 0x00a4 }
                androidx.lifecycle.a0 r6 = r6.i()     // Catch:{ Error -> 0x00a4 }
                r6.k(r5)     // Catch:{ Error -> 0x00a4 }
            L_0x003a:
                java.lang.String r6 = r0.toString()     // Catch:{ Error -> 0x00a4 }
                java.lang.String r0 = "toString(...)"
                cm.l.e(r6, r0)     // Catch:{ Error -> 0x00a4 }
                java.lang.String r0 = "result"
                android.util.Log.e(r0, r6)     // Catch:{ Error -> 0x00a4 }
                org.json.JSONObject r1 = org.json.XML.toJSONObject(r6)     // Catch:{ JSONException -> 0x004d }
                goto L_0x005e
            L_0x004d:
                r6 = move-exception
                java.lang.String r0 = "JSON exception"
                java.lang.String r2 = r6.getMessage()     // Catch:{ Error -> 0x00a4 }
                java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ Error -> 0x00a4 }
                android.util.Log.e(r0, r2)     // Catch:{ Error -> 0x00a4 }
                r6.printStackTrace()     // Catch:{ Error -> 0x00a4 }
            L_0x005e:
                i7.d r6 = new i7.d     // Catch:{ Error -> 0x00a4 }
                r6.<init>()     // Catch:{ Error -> 0x00a4 }
                boolean r0 = r4.f11127b     // Catch:{ Error -> 0x00a4 }
                java.lang.String r2 = "fromJson(...)"
                java.lang.String r3 = "calling-12-"
                if (r0 != 0) goto L_0x0089
                java.lang.String r0 = "1"
                android.util.Log.d(r3, r0)     // Catch:{ Error -> 0x00a4 }
                java.lang.String r0 = java.lang.String.valueOf(r1)     // Catch:{ Error -> 0x00a4 }
                java.lang.Class<com.nic.mparivahan.VahanEkyc.AadarkycVerify$Response> r1 = com.nic.mparivahan.VahanEkyc.AadarkycVerify.Response.class
                java.lang.Object r6 = r6.j(r0, r1)     // Catch:{ Error -> 0x00a4 }
                cm.l.e(r6, r2)     // Catch:{ Error -> 0x00a4 }
                com.nic.mparivahan.VahanEkyc.AadarkycVerify$Response r6 = (com.nic.mparivahan.VahanEkyc.AadarkycVerify.Response) r6     // Catch:{ Error -> 0x00a4 }
                ea.a r0 = r4.f11126a     // Catch:{ Error -> 0x00a4 }
                androidx.lifecycle.a0 r0 = r0.h()     // Catch:{ Error -> 0x00a4 }
            L_0x0085:
                r0.k(r6)     // Catch:{ Error -> 0x00a4 }
                goto L_0x00ad
            L_0x0089:
                java.lang.String r0 = "2"
                android.util.Log.d(r3, r0)     // Catch:{ Error -> 0x00a4 }
                java.lang.String r0 = java.lang.String.valueOf(r1)     // Catch:{ Error -> 0x00a4 }
                java.lang.Class<com.nic.mparivahan.VahanEkyc.Aadarkyc$Response> r1 = com.nic.mparivahan.VahanEkyc.Aadarkyc.Response.class
                java.lang.Object r6 = r6.j(r0, r1)     // Catch:{ Error -> 0x00a4 }
                cm.l.e(r6, r2)     // Catch:{ Error -> 0x00a4 }
                com.nic.mparivahan.VahanEkyc.Aadarkyc$Response r6 = (com.nic.mparivahan.VahanEkyc.Aadarkyc.Response) r6     // Catch:{ Error -> 0x00a4 }
                ea.a r0 = r4.f11126a     // Catch:{ Error -> 0x00a4 }
                androidx.lifecycle.a0 r0 = r0.j()     // Catch:{ Error -> 0x00a4 }
                goto L_0x0085
            L_0x00a4:
                ea.a r6 = r4.f11126a
                androidx.lifecycle.a0 r6 = r6.i()
                r6.k(r5)
            L_0x00ad:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ea.a.C0142a.onResponse(retrofit2.Call, retrofit2.Response):void");
        }
    }

    public a(d dVar) {
        l.f(dVar, "repository");
        this.f11118d = dVar;
    }

    public final void g(String str, boolean z10, boolean z11, boolean z12, boolean z13, String str2, String str3, String str4, boolean z14) {
        String str5;
        l.f(str, "aadhaar_no");
        l.f(str2, "random_number");
        l.f(str3, "trans_no");
        l.f(str4, "otp");
        if (z14) {
            str5 = "<doAadhaarRequest>\n    <aadhaar_no>" + q.B0(str).toString() + "</aadhaar_no>\n    <isAuth>" + z10 + "</isAuth>\n    <isDemo>" + z11 + "</isDemo>\n    <isEkyc>" + z12 + "</isEkyc>\n    <isOTP>" + z13 + "</isOTP>\n    <otp>" + str4 + "</otp>\n    <txNo>" + str3 + "</txNo>\n</doAadhaarRequest>";
        } else {
            str5 = "<doAadhaarRequest>\n    <aadhaar_no>" + q.B0(str).toString() + "</aadhaar_no>\n    <isAuth>" + z10 + "</isAuth>\n    <isDemo>" + z11 + "</isDemo>\n    <isEkyc>" + z12 + "</isEkyc>\n    <isOTP>" + z13 + "</isOTP>\n    <randomnumber>" + str2 + "</randomnumber>\n</doAadhaarRequest>";
        }
        Log.e("request_value", str5.toString());
        this.f11118d.a(c0.Companion.f(x.f32156g.b("application/xml"), str5)).enqueue(new C0142a(this, z14));
    }

    public final a0 h() {
        return this.f11123i;
    }

    public final a0 i() {
        return this.f11124j;
    }

    public final a0 j() {
        return this.f11125k;
    }
}
