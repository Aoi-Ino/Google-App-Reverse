package jb;

import android.os.Build;
import android.util.Log;
import androidx.lifecycle.a0;
import androidx.lifecycle.t0;
import cm.l;
import com.nic.mparivahan.Echallan.Echallan.Model.PaymentEtransPgi;
import com.nic.mparivahan.Echallan.Model.SearchChallanModel;
import com.nic.mparivahan.Echallan.Model.VerifyPaymentModel;
import com.nic.mparivahan.Echallan.Model.VirtualChallanDetailsModel;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import id.c;
import j$.util.Base64;
import org.json.JSONObject;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import um.c0;
import um.x;

public final class c extends t0 {

    /* renamed from: d  reason: collision with root package name */
    private final a f12802d;

    /* renamed from: e  reason: collision with root package name */
    private final a0 f12803e = new a0();

    /* renamed from: f  reason: collision with root package name */
    private final a0 f12804f = new a0();

    /* renamed from: g  reason: collision with root package name */
    private final a0 f12805g = new a0();

    /* renamed from: h  reason: collision with root package name */
    private final a0 f12806h = new a0();

    /* renamed from: i  reason: collision with root package name */
    private final a0 f12807i = new a0();

    /* renamed from: j  reason: collision with root package name */
    private final a0 f12808j = new a0();

    /* renamed from: k  reason: collision with root package name */
    private final a0 f12809k = new a0();

    /* renamed from: l  reason: collision with root package name */
    private final a0 f12810l = new a0();

    /* renamed from: m  reason: collision with root package name */
    private final a0 f12811m = new a0();

    /* renamed from: n  reason: collision with root package name */
    private final a0 f12812n = new a0();

    /* renamed from: o  reason: collision with root package name */
    private final a0 f12813o = new a0();

    /* renamed from: p  reason: collision with root package name */
    private final a0 f12814p = new a0();

    public static final class a implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f12815a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f12816b;

        a(String str, c cVar) {
            this.f12815a = str;
            this.f12816b = cVar;
        }

        public void onFailure(Call call, Throwable th2) {
            l.f(call, "call");
            l.f(th2, "t");
            this.f12816b.h().k("error");
        }

        public void onResponse(Call call, Response response) {
            String a10;
            l.f(call, "call");
            l.f(response, "response");
            try {
                SecurityModle securityModle = (SecurityModle) response.body();
                String str = null;
                if (Build.VERSION.SDK_INT >= 26) {
                    c.a aVar = id.c.f12675a;
                    String str2 = this.f12815a;
                    Base64.Decoder decoder = Base64.getDecoder();
                    if (securityModle != null) {
                        str = securityModle.getData();
                    }
                    byte[] decode = decoder.decode(str);
                    l.e(decode, "decode(...)");
                    a10 = aVar.a(str2, new String(decode, km.d.f24740b));
                } else {
                    c.a aVar2 = id.c.f12675a;
                    String str3 = this.f12815a;
                    if (securityModle != null) {
                        str = securityModle.getData();
                    }
                    byte[] decode2 = android.util.Base64.decode(str, 0);
                    l.e(decode2, "decode(...)");
                    a10 = aVar2.a(str3, new String(decode2, km.d.f24740b));
                }
                String valueOf = String.valueOf(a10);
                Log.e("app", valueOf);
                Object j10 = new i7.d().j(valueOf, SearchChallanModel.class);
                l.e(j10, "fromJson(...)");
                this.f12816b.i().k((SearchChallanModel) j10);
            } catch (Exception e10) {
                e10.printStackTrace();
                this.f12816b.h().k("error");
            }
        }
    }

    public static final class b implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f12817a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f12818b;

        b(String str, c cVar) {
            this.f12817a = str;
            this.f12818b = cVar;
        }

        public void onFailure(Call call, Throwable th2) {
            l.f(call, "call");
            l.f(th2, "t");
            this.f12818b.m().k("error");
        }

        public void onResponse(Call call, Response response) {
            String a10;
            l.f(call, "call");
            l.f(response, "response");
            try {
                SecurityModle securityModle = (SecurityModle) response.body();
                String str = null;
                if (Build.VERSION.SDK_INT >= 26) {
                    c.a aVar = id.c.f12675a;
                    String str2 = this.f12817a;
                    Base64.Decoder decoder = Base64.getDecoder();
                    if (securityModle != null) {
                        str = securityModle.getData();
                    }
                    byte[] decode = decoder.decode(str);
                    l.e(decode, "decode(...)");
                    a10 = aVar.a(str2, new String(decode, km.d.f24740b));
                } else {
                    c.a aVar2 = id.c.f12675a;
                    String str3 = this.f12817a;
                    if (securityModle != null) {
                        str = securityModle.getData();
                    }
                    byte[] decode2 = android.util.Base64.decode(str, 0);
                    l.e(decode2, "decode(...)");
                    a10 = aVar2.a(str3, new String(decode2, km.d.f24740b));
                }
                String valueOf = String.valueOf(a10);
                Log.d("Disposed", valueOf);
                Object j10 = new i7.d().j(valueOf, SearchChallanModel.class);
                l.e(j10, "fromJson(...)");
                this.f12818b.n().k((SearchChallanModel) j10);
            } catch (Exception e10) {
                e10.printStackTrace();
                this.f12818b.m().k("error");
            }
        }
    }

    /* renamed from: jb.c$c  reason: collision with other inner class name */
    public static final class C0166c implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f12819a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f12820b;

        C0166c(String str, c cVar) {
            this.f12819a = str;
            this.f12820b = cVar;
        }

        public void onFailure(Call call, Throwable th2) {
            l.f(call, "call");
            l.f(th2, "t");
            this.f12820b.v().k("error");
        }

        public void onResponse(Call call, Response response) {
            String a10;
            l.f(call, "call");
            l.f(response, "response");
            try {
                SecurityModle securityModle = (SecurityModle) response.body();
                String str = null;
                if (Build.VERSION.SDK_INT >= 26) {
                    c.a aVar = id.c.f12675a;
                    String str2 = this.f12819a;
                    Base64.Decoder decoder = Base64.getDecoder();
                    if (securityModle != null) {
                        str = securityModle.getData();
                    }
                    byte[] decode = decoder.decode(str);
                    l.e(decode, "decode(...)");
                    a10 = aVar.a(str2, new String(decode, km.d.f24740b));
                } else {
                    c.a aVar2 = id.c.f12675a;
                    String str3 = this.f12819a;
                    if (securityModle != null) {
                        str = securityModle.getData();
                    }
                    byte[] decode2 = android.util.Base64.decode(str, 0);
                    l.e(decode2, "decode(...)");
                    a10 = aVar2.a(str3, new String(decode2, km.d.f24740b));
                }
                String valueOf = String.valueOf(a10);
                Log.d("Disposed", valueOf);
                Object j10 = new i7.d().j(valueOf, VirtualChallanDetailsModel.class);
                l.e(j10, "fromJson(...)");
                this.f12820b.w().k((VirtualChallanDetailsModel) j10);
            } catch (Exception e10) {
                e10.printStackTrace();
                this.f12820b.v().k("error");
            }
        }
    }

    public static final class d implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f12821a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f12822b;

        d(String str, c cVar) {
            this.f12821a = str;
            this.f12822b = cVar;
        }

        public void onFailure(Call call, Throwable th2) {
            l.f(call, "call");
            l.f(th2, "t");
            this.f12822b.p().k("error");
        }

        public void onResponse(Call call, Response response) {
            String a10;
            l.f(call, "call");
            l.f(response, "response");
            try {
                SecurityModle securityModle = (SecurityModle) response.body();
                String str = null;
                if (Build.VERSION.SDK_INT >= 26) {
                    c.a aVar = id.c.f12675a;
                    String str2 = this.f12821a;
                    Base64.Decoder decoder = Base64.getDecoder();
                    if (securityModle != null) {
                        str = securityModle.getData();
                    }
                    byte[] decode = decoder.decode(str);
                    l.e(decode, "decode(...)");
                    a10 = aVar.a(str2, new String(decode, km.d.f24740b));
                } else {
                    c.a aVar2 = id.c.f12675a;
                    String str3 = this.f12821a;
                    if (securityModle != null) {
                        str = securityModle.getData();
                    }
                    byte[] decode2 = android.util.Base64.decode(str, 0);
                    l.e(decode2, "decode(...)");
                    a10 = aVar2.a(str3, new String(decode2, km.d.f24740b));
                }
                String valueOf = String.valueOf(a10);
                Log.d("Disposed", valueOf);
                Object j10 = new i7.d().j(valueOf, PaymentEtransPgi.class);
                l.e(j10, "fromJson(...)");
                this.f12822b.r().k((PaymentEtransPgi) j10);
            } catch (Exception e10) {
                e10.printStackTrace();
                this.f12822b.p().k("error");
            }
        }
    }

    public static final class e implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f12823a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f12824b;

        e(String str, c cVar) {
            this.f12823a = str;
            this.f12824b = cVar;
        }

        public void onFailure(Call call, Throwable th2) {
            l.f(call, "call");
            l.f(th2, "t");
            this.f12824b.t().k("error");
        }

        public void onResponse(Call call, Response response) {
            String a10;
            l.f(call, "call");
            l.f(response, "response");
            try {
                SecurityModle securityModle = (SecurityModle) response.body();
                String str = null;
                if (Build.VERSION.SDK_INT >= 26) {
                    c.a aVar = id.c.f12675a;
                    String str2 = this.f12823a;
                    Base64.Decoder decoder = Base64.getDecoder();
                    if (securityModle != null) {
                        str = securityModle.getData();
                    }
                    byte[] decode = decoder.decode(str);
                    l.e(decode, "decode(...)");
                    a10 = aVar.a(str2, new String(decode, km.d.f24740b));
                } else {
                    c.a aVar2 = id.c.f12675a;
                    String str3 = this.f12823a;
                    if (securityModle != null) {
                        str = securityModle.getData();
                    }
                    byte[] decode2 = android.util.Base64.decode(str, 0);
                    l.e(decode2, "decode(...)");
                    a10 = aVar2.a(str3, new String(decode2, km.d.f24740b));
                }
                String valueOf = String.valueOf(a10);
                Log.v("Pending", valueOf);
                Object j10 = new i7.d().j(valueOf, SearchChallanModel.class);
                l.e(j10, "fromJson(...)");
                this.f12824b.u().k((SearchChallanModel) j10);
            } catch (Exception e10) {
                e10.printStackTrace();
                this.f12824b.t().k("error");
            }
        }
    }

    public static final class f implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f12825a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f12826b;

        f(String str, c cVar) {
            this.f12825a = str;
            this.f12826b = cVar;
        }

        public void onFailure(Call call, Throwable th2) {
            l.f(call, "call");
            l.f(th2, "t");
            this.f12826b.p().k("error");
        }

        public void onResponse(Call call, Response response) {
            String a10;
            l.f(call, "call");
            l.f(response, "response");
            try {
                SecurityModle securityModle = (SecurityModle) response.body();
                String str = null;
                if (Build.VERSION.SDK_INT >= 26) {
                    c.a aVar = id.c.f12675a;
                    String str2 = this.f12825a;
                    Base64.Decoder decoder = Base64.getDecoder();
                    if (securityModle != null) {
                        str = securityModle.getData();
                    }
                    byte[] decode = decoder.decode(str);
                    l.e(decode, "decode(...)");
                    a10 = aVar.a(str2, new String(decode, km.d.f24740b));
                } else {
                    c.a aVar2 = id.c.f12675a;
                    String str3 = this.f12825a;
                    if (securityModle != null) {
                        str = securityModle.getData();
                    }
                    byte[] decode2 = android.util.Base64.decode(str, 0);
                    l.e(decode2, "decode(...)");
                    a10 = aVar2.a(str3, new String(decode2, km.d.f24740b));
                }
                String valueOf = String.valueOf(a10);
                Log.d("Disposed", valueOf);
                Object j10 = new i7.d().j(valueOf, PaymentEtransPgi.class);
                l.e(j10, "fromJson(...)");
                this.f12826b.r().k((PaymentEtransPgi) j10);
            } catch (Exception e10) {
                e10.printStackTrace();
                this.f12826b.p().k("error");
            }
        }
    }

    public static final class g implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f12827a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f12828b;

        g(String str, c cVar) {
            this.f12827a = str;
            this.f12828b = cVar;
        }

        public void onFailure(Call call, Throwable th2) {
            l.f(call, "call");
            l.f(th2, "t");
            this.f12828b.j().k("error");
        }

        public void onResponse(Call call, Response response) {
            String a10;
            l.f(call, "call");
            l.f(response, "response");
            try {
                SecurityModle securityModle = (SecurityModle) response.body();
                String str = null;
                if (Build.VERSION.SDK_INT >= 26) {
                    c.a aVar = id.c.f12675a;
                    String str2 = this.f12827a;
                    Base64.Decoder decoder = Base64.getDecoder();
                    if (securityModle != null) {
                        str = securityModle.getData();
                    }
                    byte[] decode = decoder.decode(str);
                    l.e(decode, "decode(...)");
                    a10 = aVar.a(str2, new String(decode, km.d.f24740b));
                } else {
                    c.a aVar2 = id.c.f12675a;
                    String str3 = this.f12827a;
                    if (securityModle != null) {
                        str = securityModle.getData();
                    }
                    byte[] decode2 = android.util.Base64.decode(str, 0);
                    l.e(decode2, "decode(...)");
                    a10 = aVar2.a(str3, new String(decode2, km.d.f24740b));
                }
                String valueOf = String.valueOf(a10);
                Log.d("Disposed", valueOf);
                Object j10 = new i7.d().j(valueOf, VerifyPaymentModel.class);
                l.e(j10, "fromJson(...)");
                this.f12828b.k().k((VerifyPaymentModel) j10);
            } catch (Exception e10) {
                e10.printStackTrace();
                this.f12828b.j().k("error");
            }
        }
    }

    public c(a aVar) {
        l.f(aVar, "repository");
        this.f12802d = aVar;
    }

    public final void g(String str, String str2, int i10) {
        l.f(str, "inputType");
        l.f(str2, "inputValue");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("entity_type", (Object) str);
            jSONObject.put("entity_value", (Object) str2);
            jSONObject.put("offset", i10);
            String valueOf = String.valueOf(System.currentTimeMillis());
            c0.a aVar = c0.Companion;
            x b10 = x.f32156g.b("application/json");
            String jSONObject2 = jSONObject.toString();
            l.e(jSONObject2, "toString(...)");
            this.f12802d.c(aVar.f(b10, jSONObject2), valueOf).enqueue(new a(valueOf, this));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final a0 h() {
        return this.f12804f;
    }

    public final a0 i() {
        return this.f12803e;
    }

    public final a0 j() {
        return this.f12810l;
    }

    public final a0 k() {
        return this.f12809k;
    }

    public final void l(String str, String str2, int i10, int i11) {
        l.f(str, "inputType");
        l.f(str2, "inputValue");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("entity_type", (Object) str);
            jSONObject.put("entity_value", (Object) str2);
            jSONObject.put("offset", i10);
            jSONObject.put("status", i11);
            String valueOf = String.valueOf(System.currentTimeMillis());
            c0.a aVar = c0.Companion;
            x b10 = x.f32156g.b("application/json");
            String jSONObject2 = jSONObject.toString();
            l.e(jSONObject2, "toString(...)");
            this.f12802d.e(aVar.f(b10, jSONObject2), valueOf).enqueue(new b(valueOf, this));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final a0 m() {
        return this.f12808j;
    }

    public final a0 n() {
        return this.f12807i;
    }

    public final void o(String str) {
        l.f(str, "challanNo");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("challan_no", (Object) str);
            String valueOf = String.valueOf(System.currentTimeMillis());
            c0.a aVar = c0.Companion;
            x b10 = x.f32156g.b("application/json");
            String jSONObject2 = jSONObject.toString();
            l.e(jSONObject2, "toString(...)");
            this.f12802d.b(aVar.f(b10, jSONObject2), valueOf).enqueue(new C0166c(valueOf, this));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final a0 p() {
        return this.f12814p;
    }

    public final void q(String str, String str2) {
        l.f(str, "challanNo");
        l.f(str2, "mobileNo");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("challan_no", (Object) str);
            jSONObject.put("mobile_no", (Object) str2);
            c0.a aVar = c0.Companion;
            x b10 = x.f32156g.b("application/json");
            String jSONObject2 = jSONObject.toString();
            l.e(jSONObject2, "toString(...)");
            c0 f10 = aVar.f(b10, jSONObject2);
            String valueOf = String.valueOf(System.currentTimeMillis());
            this.f12802d.a(f10, valueOf).enqueue(new d(valueOf, this));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final a0 r() {
        return this.f12813o;
    }

    public final void s(String str, String str2, int i10, int i11) {
        l.f(str, "inputType");
        l.f(str2, "inputValue");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("entity_type", (Object) str);
            jSONObject.put("entity_value", (Object) str2);
            jSONObject.put("offset", i10);
            jSONObject.put("status", i11);
            String valueOf = String.valueOf(System.currentTimeMillis());
            c0.a aVar = c0.Companion;
            x b10 = x.f32156g.b("application/json");
            String jSONObject2 = jSONObject.toString();
            l.e(jSONObject2, "toString(...)");
            this.f12802d.d(aVar.f(b10, jSONObject2), valueOf).enqueue(new e(valueOf, this));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final a0 t() {
        return this.f12806h;
    }

    public final a0 u() {
        return this.f12805g;
    }

    public final a0 v() {
        return this.f12812n;
    }

    public final a0 w() {
        return this.f12811m;
    }

    public final void x(String str, String str2, String str3, String str4, String str5) {
        l.f(str, "challanNo");
        l.f(str2, "vehicleNo");
        l.f(str3, "challanAmt");
        l.f(str4, "status");
        l.f(str5, "stateCd");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("vehicle_number", (Object) str2);
            jSONObject.put("challan_number", (Object) str);
            jSONObject.put("challan_amt", (Object) str3);
            jSONObject.put("status", (Object) str4);
            jSONObject.put("state_code", (Object) str5);
            String valueOf = String.valueOf(System.currentTimeMillis());
            c0.a aVar = c0.Companion;
            x b10 = x.f32156g.b("application/json");
            String jSONObject2 = jSONObject.toString();
            l.e(jSONObject2, "toString(...)");
            this.f12802d.f(aVar.f(b10, jSONObject2), valueOf).enqueue(new f(valueOf, this));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final void y(String str, String str2, String str3, String str4, String str5) {
        l.f(str, "challanNo");
        l.f(str2, "stateCd");
        l.f(str3, "vehicleNo");
        l.f(str4, "challanAmt");
        l.f(str5, "challanStatus");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("status", (Object) str5);
            jSONObject.put("challan_number", (Object) str);
            jSONObject.put("state_code", (Object) str2);
            jSONObject.put("vehicle_number", (Object) str3);
            jSONObject.put("challan_amt", (Object) str4);
            String valueOf = String.valueOf(System.currentTimeMillis());
            c0.a aVar = c0.Companion;
            x b10 = x.f32156g.b("application/json");
            String jSONObject2 = jSONObject.toString();
            l.e(jSONObject2, "toString(...)");
            this.f12802d.g(aVar.f(b10, jSONObject2), valueOf).enqueue(new g(valueOf, this));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
