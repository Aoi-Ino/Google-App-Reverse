package ga;

import android.os.Build;
import androidx.lifecycle.a0;
import androidx.lifecycle.t0;
import cm.l;
import com.nic.mparivahan.DPTNotice.DataClass.DTPVerifyPaymentModal;
import com.nic.mparivahan.DPTNotice.DataClass.NoticeListModel;
import com.nic.mparivahan.DPTNotice.DataClass.NoticeVirtualCourtModel;
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
    private final a f11741d;

    /* renamed from: e  reason: collision with root package name */
    private final a0 f11742e = new a0();

    /* renamed from: f  reason: collision with root package name */
    private final a0 f11743f = new a0();

    /* renamed from: g  reason: collision with root package name */
    private final a0 f11744g = new a0();

    /* renamed from: h  reason: collision with root package name */
    private final a0 f11745h = new a0();

    public static final class a implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f11746a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f11747b;

        a(String str, c cVar) {
            this.f11746a = str;
            this.f11747b = cVar;
        }

        public void onFailure(Call call, Throwable th2) {
            l.f(call, "call");
            l.f(th2, "t");
            this.f11747b.g().k("error");
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
                    String str2 = this.f11746a;
                    Base64.Decoder decoder = Base64.getDecoder();
                    if (securityModle != null) {
                        str = securityModle.getData();
                    }
                    byte[] decode = decoder.decode(str);
                    l.e(decode, "decode(...)");
                    a10 = aVar.a(str2, new String(decode, km.d.f24740b));
                } else {
                    c.a aVar2 = id.c.f12675a;
                    String str3 = this.f11746a;
                    if (securityModle != null) {
                        str = securityModle.getData();
                    }
                    byte[] decode2 = android.util.Base64.decode(str, 0);
                    l.e(decode2, "decode(...)");
                    a10 = aVar2.a(str3, new String(decode2, km.d.f24740b));
                }
                Object j10 = new i7.d().j(String.valueOf(a10), NoticeListModel.class);
                l.e(j10, "fromJson(...)");
                this.f11747b.h().k((NoticeListModel) j10);
            } catch (Exception e10) {
                e10.printStackTrace();
                this.f11747b.g().k("error");
            }
        }
    }

    public static final class b implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f11748a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f11749b;

        b(String str, c cVar) {
            this.f11748a = str;
            this.f11749b = cVar;
        }

        public void onFailure(Call call, Throwable th2) {
            l.f(call, "call");
            l.f(th2, "t");
            this.f11749b.g().k("error");
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
                    String str2 = this.f11748a;
                    Base64.Decoder decoder = Base64.getDecoder();
                    if (securityModle != null) {
                        str = securityModle.getData();
                    }
                    byte[] decode = decoder.decode(str);
                    l.e(decode, "decode(...)");
                    a10 = aVar.a(str2, new String(decode, km.d.f24740b));
                } else {
                    c.a aVar2 = id.c.f12675a;
                    String str3 = this.f11748a;
                    if (securityModle != null) {
                        str = securityModle.getData();
                    }
                    byte[] decode2 = android.util.Base64.decode(str, 0);
                    l.e(decode2, "decode(...)");
                    a10 = aVar2.a(str3, new String(decode2, km.d.f24740b));
                }
                Object j10 = new i7.d().j(String.valueOf(a10), NoticeListModel.class);
                l.e(j10, "fromJson(...)");
                this.f11749b.h().k((NoticeListModel) j10);
            } catch (Exception e10) {
                e10.printStackTrace();
                this.f11749b.g().k("error");
            }
        }
    }

    /* renamed from: ga.c$c  reason: collision with other inner class name */
    public static final class C0152c implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f11750a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f11751b;

        C0152c(String str, c cVar) {
            this.f11750a = str;
            this.f11751b = cVar;
        }

        public void onFailure(Call call, Throwable th2) {
            l.f(call, "call");
            l.f(th2, "t");
            this.f11751b.g().k("error");
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
                    String str2 = this.f11750a;
                    Base64.Decoder decoder = Base64.getDecoder();
                    if (securityModle != null) {
                        str = securityModle.getData();
                    }
                    byte[] decode = decoder.decode(str);
                    l.e(decode, "decode(...)");
                    a10 = aVar.a(str2, new String(decode, km.d.f24740b));
                } else {
                    c.a aVar2 = id.c.f12675a;
                    String str3 = this.f11750a;
                    if (securityModle != null) {
                        str = securityModle.getData();
                    }
                    byte[] decode2 = android.util.Base64.decode(str, 0);
                    l.e(decode2, "decode(...)");
                    a10 = aVar2.a(str3, new String(decode2, km.d.f24740b));
                }
                Object j10 = new i7.d().j(String.valueOf(a10), DTPVerifyPaymentModal.class);
                l.e(j10, "fromJson(...)");
                this.f11751b.i().k((DTPVerifyPaymentModal) j10);
            } catch (Exception e10) {
                e10.printStackTrace();
                this.f11751b.g().k("error");
            }
        }
    }

    public static final class d implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f11752a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f11753b;

        d(String str, c cVar) {
            this.f11752a = str;
            this.f11753b = cVar;
        }

        public void onFailure(Call call, Throwable th2) {
            l.f(call, "call");
            l.f(th2, "t");
            this.f11753b.g().k("error");
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
                    String str2 = this.f11752a;
                    Base64.Decoder decoder = Base64.getDecoder();
                    if (securityModle != null) {
                        str = securityModle.getData();
                    }
                    byte[] decode = decoder.decode(str);
                    l.e(decode, "decode(...)");
                    a10 = aVar.a(str2, new String(decode, km.d.f24740b));
                } else {
                    c.a aVar2 = id.c.f12675a;
                    String str3 = this.f11752a;
                    if (securityModle != null) {
                        str = securityModle.getData();
                    }
                    byte[] decode2 = android.util.Base64.decode(str, 0);
                    l.e(decode2, "decode(...)");
                    a10 = aVar2.a(str3, new String(decode2, km.d.f24740b));
                }
                Object j10 = new i7.d().j(String.valueOf(a10), NoticeVirtualCourtModel.class);
                l.e(j10, "fromJson(...)");
                this.f11753b.j().k((NoticeVirtualCourtModel) j10);
            } catch (Exception e10) {
                e10.printStackTrace();
                this.f11753b.g().k("error");
            }
        }
    }

    public c(a aVar) {
        l.f(aVar, "repository");
        this.f11741d = aVar;
    }

    public final a0 g() {
        return this.f11743f;
    }

    public final a0 h() {
        return this.f11742e;
    }

    public final a0 i() {
        return this.f11745h;
    }

    public final a0 j() {
        return this.f11744g;
    }

    public final void k(String str, String str2) {
        l.f(str, "inputType");
        l.f(str2, "inputValue");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("entity_type", (Object) str);
            jSONObject.put("entity_value", (Object) str2);
            String valueOf = String.valueOf(System.currentTimeMillis());
            c0.a aVar = c0.Companion;
            x b10 = x.f32156g.b("application/json");
            String jSONObject2 = jSONObject.toString();
            l.e(jSONObject2, "toString(...)");
            this.f11741d.c(aVar.f(b10, jSONObject2), valueOf).enqueue(new a(valueOf, this));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final void l(String str, String str2) {
        l.f(str, "inputType");
        l.f(str2, "inputValue");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("entity_type", (Object) str);
            jSONObject.put("entity_value", (Object) str2);
            String valueOf = String.valueOf(System.currentTimeMillis());
            c0.a aVar = c0.Companion;
            x b10 = x.f32156g.b("application/json");
            String jSONObject2 = jSONObject.toString();
            l.e(jSONObject2, "toString(...)");
            this.f11741d.d(aVar.f(b10, jSONObject2), valueOf).enqueue(new b(valueOf, this));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final void m(String str) {
        l.f(str, "challanNo");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("notice_no", (Object) str);
            String valueOf = String.valueOf(System.currentTimeMillis());
            c0.a aVar = c0.Companion;
            x b10 = x.f32156g.b("application/json");
            String jSONObject2 = jSONObject.toString();
            l.e(jSONObject2, "toString(...)");
            this.f11741d.a(aVar.f(b10, jSONObject2), valueOf).enqueue(new C0152c(valueOf, this));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final void n(String str) {
        l.f(str, "challanNo");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("challan_no", (Object) str);
            String valueOf = String.valueOf(System.currentTimeMillis());
            c0.a aVar = c0.Companion;
            x b10 = x.f32156g.b("application/json");
            String jSONObject2 = jSONObject.toString();
            l.e(jSONObject2, "toString(...)");
            this.f11741d.b(aVar.f(b10, jSONObject2), valueOf).enqueue(new d(valueOf, this));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
