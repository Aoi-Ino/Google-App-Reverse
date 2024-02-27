package di;

import android.os.Build;
import androidx.lifecycle.a0;
import androidx.lifecycle.t0;
import cm.l;
import cm.u;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import com.nic.mparivahan.VahanServices.updateMobileNo.UpdateMobileUserDetails;
import id.c;
import j$.util.Base64;
import ka.c;
import km.d;
import org.json.JSONObject;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import um.c0;
import um.x;

public final class a extends t0 {

    /* renamed from: d  reason: collision with root package name */
    private final wg.c f22843d;

    /* renamed from: e  reason: collision with root package name */
    private final a0 f22844e = new a0();

    /* renamed from: f  reason: collision with root package name */
    private final a0 f22845f = new a0();

    /* renamed from: g  reason: collision with root package name */
    private final a0 f22846g = new a0();

    /* renamed from: h  reason: collision with root package name */
    private a0 f22847h = new a0();

    /* renamed from: i  reason: collision with root package name */
    private final a0 f22848i = new a0();

    /* renamed from: j  reason: collision with root package name */
    private final a0 f22849j = new a0();

    /* renamed from: di.a$a  reason: collision with other inner class name */
    public static final class C0283a implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f22850a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f22851b;

        C0283a(String str, a aVar) {
            this.f22850a = str;
            this.f22851b = aVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f22851b.g().k("Service temporarily unavailable. Please try again later.");
        }

        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            String a10;
            a0 h10;
            Object obj;
            String str = null;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception e10) {
                    this.f22851b.g().k("Unable to Update the mobile no.");
                    e10.printStackTrace();
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                c.a aVar = id.c.f12675a;
                String str2 = this.f22850a;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str = securityModle.getData();
                }
                byte[] decode = decoder.decode(str);
                l.e(decode, "decode(...)");
                a10 = aVar.a(str2, new String(decode, d.f24740b));
            } else {
                c.a aVar2 = id.c.f12675a;
                String str3 = this.f22850a;
                if (securityModle != null) {
                    str = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str, 0);
                l.e(decode2, "decode(...)");
                a10 = aVar2.a(str3, new String(decode2, d.f24740b));
            }
            Object j10 = new i7.d().j(String.valueOf(a10), UpdateMobileUserDetails.class);
            l.e(j10, "fromJson(...)");
            UpdateMobileUserDetails updateMobileUserDetails = (UpdateMobileUserDetails) j10;
            c.a aVar3 = ka.c.f13158a;
            if (aVar3.m(updateMobileUserDetails.getErrorcode())) {
                h10 = this.f22851b.h();
                obj = updateMobileUserDetails;
            } else if (aVar3.m(updateMobileUserDetails.getErrorDesc())) {
                this.f22851b.g().k("Unable to update the mobile no.");
                return;
            } else {
                h10 = this.f22851b.g();
                obj = String.valueOf(updateMobileUserDetails.getErrorDesc());
            }
            h10.k(obj);
        }
    }

    public static final class b implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f22852a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f22853b;

        b(u uVar, a aVar) {
            this.f22852a = uVar;
            this.f22853b = aVar;
        }

        public void onFailure(Call call, Throwable th2) {
            l.f(call, "call");
            l.f(th2, "t");
            this.f22853b.i().k("Error");
        }

        public void onResponse(Call call, Response response) {
            c.a aVar;
            String str;
            String str2;
            l.f(call, "call");
            l.f(response, "response");
            try {
                SecurityModle securityModle = (SecurityModle) response.body();
                String str3 = null;
                if (Build.VERSION.SDK_INT >= 26) {
                    aVar = id.c.f12675a;
                    str = (String) this.f22852a.f20234e;
                    Base64.Decoder decoder = Base64.getDecoder();
                    if (securityModle != null) {
                        str3 = securityModle.getData();
                    }
                    byte[] decode = decoder.decode(str3);
                    l.e(decode, "decode(...)");
                    str2 = new String(decode, d.f24740b);
                } else {
                    aVar = id.c.f12675a;
                    str = (String) this.f22852a.f20234e;
                    if (securityModle != null) {
                        str3 = securityModle.getData();
                    }
                    byte[] decode2 = android.util.Base64.decode(str3, 0);
                    l.e(decode2, "decode(...)");
                    str2 = new String(decode2, d.f24740b);
                }
                String valueOf = String.valueOf(aVar.a(str, str2));
                JSONObject jSONObject = new JSONObject(valueOf);
                if (!jSONObject.has("errorcode")) {
                    this.f22853b.j().k(valueOf);
                } else if (jSONObject.getInt("errorcode") == 400) {
                    this.f22853b.j().k(jSONObject.getString("errorDesc"));
                }
            } catch (Exception unused) {
                this.f22853b.i().k("Error");
            }
        }
    }

    public static final class c implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f22854a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f22855b;

        c(u uVar, a aVar) {
            this.f22854a = uVar;
            this.f22855b = aVar;
        }

        public void onFailure(Call call, Throwable th2) {
            l.f(call, "call");
            l.f(th2, "t");
            this.f22855b.l().k("Unable to update the mobile no, Please try after some time!");
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(3:22|23|30) */
        /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
            r7 = new i7.d().j(r7, java.lang.Boolean.TYPE);
            cm.l.e(r7, "fromJson(...)");
            r6.f22855b.m().k(java.lang.Boolean.valueOf(((java.lang.Boolean) r7).booleanValue()));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
            return;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0091 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onResponse(retrofit2.Call r7, retrofit2.Response r8) {
            /*
                r6 = this;
                java.lang.String r0 = "Unable to update the mobile no, Please try after some time!"
                java.lang.String r1 = "errorcode"
                java.lang.String r2 = "call"
                cm.l.f(r7, r2)
                java.lang.String r7 = "response"
                cm.l.f(r8, r7)
                java.lang.Object r7 = r8.body()     // Catch:{ Exception -> 0x00b5 }
                com.nic.mparivahan.Security.SecModle.SecurityModle r7 = (com.nic.mparivahan.Security.SecModle.SecurityModle) r7     // Catch:{ Exception -> 0x00b5 }
                int r8 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x00b5 }
                r2 = 26
                java.lang.String r3 = "decode(...)"
                r4 = 0
                if (r8 < r2) goto L_0x0046
                id.c$a r8 = id.c.f12675a     // Catch:{ Exception -> 0x00b5 }
                cm.u r2 = r6.f22854a     // Catch:{ Exception -> 0x00b5 }
                java.lang.Object r2 = r2.f20234e     // Catch:{ Exception -> 0x00b5 }
                java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b5 }
                j$.util.Base64$Decoder r5 = j$.util.Base64.getDecoder()     // Catch:{ Exception -> 0x00b5 }
                if (r7 == 0) goto L_0x002f
                java.lang.String r4 = r7.getData()     // Catch:{ Exception -> 0x00b5 }
            L_0x002f:
                byte[] r7 = r5.decode((java.lang.String) r4)     // Catch:{ Exception -> 0x00b5 }
                cm.l.e(r7, r3)     // Catch:{ Exception -> 0x00b5 }
                java.lang.String r3 = new java.lang.String     // Catch:{ Exception -> 0x00b5 }
                java.nio.charset.Charset r4 = km.d.f24740b     // Catch:{ Exception -> 0x00b5 }
                r3.<init>(r7, r4)     // Catch:{ Exception -> 0x00b5 }
            L_0x003d:
                java.lang.String r7 = r8.a(r2, r3)     // Catch:{ Exception -> 0x00b5 }
                java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ Exception -> 0x00b5 }
                goto L_0x0064
            L_0x0046:
                id.c$a r8 = id.c.f12675a     // Catch:{ Exception -> 0x00b5 }
                cm.u r2 = r6.f22854a     // Catch:{ Exception -> 0x00b5 }
                java.lang.Object r2 = r2.f20234e     // Catch:{ Exception -> 0x00b5 }
                java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b5 }
                if (r7 == 0) goto L_0x0054
                java.lang.String r4 = r7.getData()     // Catch:{ Exception -> 0x00b5 }
            L_0x0054:
                r7 = 0
                byte[] r7 = android.util.Base64.decode(r4, r7)     // Catch:{ Exception -> 0x00b5 }
                cm.l.e(r7, r3)     // Catch:{ Exception -> 0x00b5 }
                java.lang.String r3 = new java.lang.String     // Catch:{ Exception -> 0x00b5 }
                java.nio.charset.Charset r4 = km.d.f24740b     // Catch:{ Exception -> 0x00b5 }
                r3.<init>(r7, r4)     // Catch:{ Exception -> 0x00b5 }
                goto L_0x003d
            L_0x0064:
                org.json.JSONObject r8 = new org.json.JSONObject     // Catch:{ Exception -> 0x0091 }
                r8.<init>((java.lang.String) r7)     // Catch:{ Exception -> 0x0091 }
                boolean r2 = r8.has(r1)     // Catch:{ Exception -> 0x0091 }
                if (r2 == 0) goto L_0x00be
                int r1 = r8.getInt(r1)     // Catch:{ Exception -> 0x0091 }
                r2 = 400(0x190, float:5.6E-43)
                if (r1 != r2) goto L_0x0087
                di.a r1 = r6.f22855b     // Catch:{ Exception -> 0x0091 }
                androidx.lifecycle.a0 r1 = r1.l()     // Catch:{ Exception -> 0x0091 }
                java.lang.String r2 = "errorDesc"
                java.lang.String r8 = r8.getString(r2)     // Catch:{ Exception -> 0x0091 }
                r1.k(r8)     // Catch:{ Exception -> 0x0091 }
                goto L_0x00be
            L_0x0087:
                di.a r8 = r6.f22855b     // Catch:{ Exception -> 0x0091 }
                androidx.lifecycle.a0 r8 = r8.l()     // Catch:{ Exception -> 0x0091 }
                r8.k(r0)     // Catch:{ Exception -> 0x0091 }
                goto L_0x00be
            L_0x0091:
                i7.d r8 = new i7.d     // Catch:{ Exception -> 0x00b5 }
                r8.<init>()     // Catch:{ Exception -> 0x00b5 }
                java.lang.Class r1 = java.lang.Boolean.TYPE     // Catch:{ Exception -> 0x00b5 }
                java.lang.Object r7 = r8.j(r7, r1)     // Catch:{ Exception -> 0x00b5 }
                java.lang.String r8 = "fromJson(...)"
                cm.l.e(r7, r8)     // Catch:{ Exception -> 0x00b5 }
                java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch:{ Exception -> 0x00b5 }
                boolean r7 = r7.booleanValue()     // Catch:{ Exception -> 0x00b5 }
                di.a r8 = r6.f22855b     // Catch:{ Exception -> 0x00b5 }
                androidx.lifecycle.a0 r8 = r8.m()     // Catch:{ Exception -> 0x00b5 }
                java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)     // Catch:{ Exception -> 0x00b5 }
                r8.k(r7)     // Catch:{ Exception -> 0x00b5 }
                goto L_0x00be
            L_0x00b5:
                di.a r7 = r6.f22855b
                androidx.lifecycle.a0 r7 = r7.l()
                r7.k(r0)
            L_0x00be:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: di.a.c.onResponse(retrofit2.Call, retrofit2.Response):void");
        }
    }

    public a(wg.c cVar) {
        l.f(cVar, "repository");
        this.f22843d = cVar;
    }

    public final a0 g() {
        return this.f22845f;
    }

    public final a0 h() {
        return this.f22844e;
    }

    public final a0 i() {
        return this.f22849j;
    }

    public final a0 j() {
        return this.f22848i;
    }

    public final void k(String str, String str2, String str3, String str4, String str5) {
        l.f(str, "regNo");
        l.f(str2, "chasiNo");
        l.f(str3, "engineNo");
        l.f(str4, "regnDate");
        l.f(str5, "regnUpto");
        String valueOf = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject = VUtility.Companion.a0(str, str2, str3, str4, str5).toString();
        l.e(jSONObject, "toString(...)");
        this.f22843d.a(aVar.f(b10, jSONObject), valueOf).enqueue(new C0283a(valueOf, this));
    }

    public final a0 l() {
        return this.f22847h;
    }

    public final a0 m() {
        return this.f22846g;
    }

    public final void n(JSONObject jSONObject) {
        l.f(jSONObject, "requestObj");
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject2 = jSONObject.toString();
        l.e(jSONObject2, "toString(...)");
        this.f22843d.b(aVar.f(b10, jSONObject2), (String) uVar.f20234e).enqueue(new b(uVar, this));
    }

    public final void o(JSONObject jSONObject) {
        l.f(jSONObject, "requestObj");
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject2 = jSONObject.toString();
        l.e(jSONObject2, "toString(...)");
        this.f22843d.c(aVar.f(b10, jSONObject2), (String) uVar.f20234e).enqueue(new c(uVar, this));
    }
}
