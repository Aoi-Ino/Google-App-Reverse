package qa;

import android.os.Build;
import android.util.Log;
import androidx.lifecycle.a0;
import androidx.lifecycle.t0;
import cm.l;
import cm.u;
import com.nic.mparivahan.Dashboard.EnabledServices.PojoClasses.EnableServiceResponse;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import id.c;
import j$.util.Base64;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import um.c0;
import um.x;

public final class b extends t0 {

    /* renamed from: d  reason: collision with root package name */
    private final oa.a f15274d;

    /* renamed from: e  reason: collision with root package name */
    private final a0 f15275e = new a0();

    /* renamed from: f  reason: collision with root package name */
    private final a0 f15276f = new a0();

    /* renamed from: g  reason: collision with root package name */
    private final a0 f15277g = new a0();

    /* renamed from: h  reason: collision with root package name */
    private final a0 f15278h = new a0();

    /* renamed from: i  reason: collision with root package name */
    private final a0 f15279i = new a0();

    /* renamed from: j  reason: collision with root package name */
    private final a0 f15280j = new a0();

    /* renamed from: k  reason: collision with root package name */
    private final a0 f15281k = new a0();

    /* renamed from: l  reason: collision with root package name */
    private final a0 f15282l = new a0();

    /* renamed from: m  reason: collision with root package name */
    private final a0 f15283m = new a0();

    /* renamed from: n  reason: collision with root package name */
    private final a0 f15284n = new a0();

    /* renamed from: o  reason: collision with root package name */
    private final a0 f15285o = new a0();

    /* renamed from: p  reason: collision with root package name */
    private final a0 f15286p = new a0();

    public static final class a implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f15287a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f15288b;

        a(u uVar, b bVar) {
            this.f15287a = uVar;
            this.f15288b = bVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f15288b.s().k(th2 != null ? th2.getMessage() : null);
        }

        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            c.a aVar;
            String str;
            String str2;
            String str3 = null;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception unused) {
                    this.f15288b.s().k("Error");
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                aVar = id.c.f12675a;
                str = (String) this.f15287a.f20234e;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode = decoder.decode(str3);
                l.e(decode, "decode(...)");
                str2 = new String(decode, km.d.f24740b);
            } else {
                aVar = id.c.f12675a;
                str = (String) this.f15287a.f20234e;
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str3, 0);
                l.e(decode2, "decode(...)");
                str2 = new String(decode2, km.d.f24740b);
            }
            String valueOf = String.valueOf(aVar.a(str, str2));
            Log.e("Notice Challan_details -", valueOf);
            Object j10 = new i7.d().j(valueOf, EnableServiceResponse.class);
            l.e(j10, "fromJson(...)");
            this.f15288b.r().k((EnableServiceResponse) j10);
        }
    }

    /* renamed from: qa.b$b  reason: collision with other inner class name */
    public static final class C0205b implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f15289a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f15290b;

        C0205b(u uVar, b bVar) {
            this.f15289a = uVar;
            this.f15290b = bVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f15290b.q().k(th2 != null ? th2.getMessage() : null);
        }

        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            c.a aVar;
            String str;
            String str2;
            String str3 = null;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception unused) {
                    this.f15290b.q().k("Error");
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                aVar = id.c.f12675a;
                str = (String) this.f15289a.f20234e;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode = decoder.decode(str3);
                l.e(decode, "decode(...)");
                str2 = new String(decode, km.d.f24740b);
            } else {
                aVar = id.c.f12675a;
                str = (String) this.f15289a.f20234e;
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str3, 0);
                l.e(decode2, "decode(...)");
                str2 = new String(decode2, km.d.f24740b);
            }
            Object j10 = new i7.d().j(String.valueOf(aVar.a(str, str2)), EnableServiceResponse.class);
            l.e(j10, "fromJson(...)");
            this.f15290b.n().k((EnableServiceResponse) j10);
        }
    }

    public static final class c implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f15291a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f15292b;

        c(u uVar, b bVar) {
            this.f15291a = uVar;
            this.f15292b = bVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f15292b.w().k("Error");
        }

        public void onResponse(Call call, Response response) {
            a0 w10;
            String str;
            SecurityModle securityModle;
            c.a aVar;
            String str2;
            String str3;
            String str4 = null;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception unused) {
                    if (response == null || response.code() != 401 || !response.message().toString().equals(v9.d.f17494a.y())) {
                        w10 = this.f15292b.w();
                        str = "Error";
                    } else {
                        w10 = this.f15292b.w();
                        str = "401";
                    }
                    w10.k(str);
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                aVar = id.c.f12675a;
                str2 = (String) this.f15291a.f20234e;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str4 = securityModle.getData();
                }
                byte[] decode = decoder.decode(str4);
                l.e(decode, "decode(...)");
                str3 = new String(decode, km.d.f24740b);
            } else {
                aVar = id.c.f12675a;
                str2 = (String) this.f15291a.f20234e;
                if (securityModle != null) {
                    str4 = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str4, 0);
                l.e(decode2, "decode(...)");
                str3 = new String(decode2, km.d.f24740b);
            }
            Object j10 = new i7.d().j(String.valueOf(aVar.a(str2, str3)), EnableServiceResponse.class);
            l.e(j10, "fromJson(...)");
            this.f15292b.t().k((EnableServiceResponse) j10);
        }
    }

    public static final class d implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f15293a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f15294b;

        d(u uVar, b bVar) {
            this.f15293a = uVar;
            this.f15294b = bVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f15294b.v().k("Error");
        }

        public void onResponse(Call call, Response response) {
            a0 v10;
            String str;
            SecurityModle securityModle;
            c.a aVar;
            String str2;
            String str3;
            String str4 = null;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception unused) {
                    if (response == null || response.code() != 401 || !response.message().toString().equals(v9.d.f17494a.y())) {
                        v10 = this.f15294b.v();
                        str = "Error";
                    } else {
                        v10 = this.f15294b.v();
                        str = "401";
                    }
                    v10.k(str);
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                aVar = id.c.f12675a;
                str2 = (String) this.f15293a.f20234e;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str4 = securityModle.getData();
                }
                byte[] decode = decoder.decode(str4);
                l.e(decode, "decode(...)");
                str3 = new String(decode, km.d.f24740b);
            } else {
                aVar = id.c.f12675a;
                str2 = (String) this.f15293a.f20234e;
                if (securityModle != null) {
                    str4 = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str4, 0);
                l.e(decode2, "decode(...)");
                str3 = new String(decode2, km.d.f24740b);
            }
            Object j10 = new i7.d().j(String.valueOf(aVar.a(str2, str3)), EnableServiceResponse.class);
            l.e(j10, "fromJson(...)");
            this.f15294b.u().k((EnableServiceResponse) j10);
        }
    }

    public static final class e implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f15295a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f15296b;

        e(u uVar, b bVar) {
            this.f15295a = uVar;
            this.f15296b = bVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f15296b.p().k(th2 != null ? th2.getMessage() : null);
        }

        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            c.a aVar;
            String str;
            String str2;
            String str3 = null;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception unused) {
                    this.f15296b.p().k("Error");
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                aVar = id.c.f12675a;
                str = (String) this.f15295a.f20234e;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode = decoder.decode(str3);
                l.e(decode, "decode(...)");
                str2 = new String(decode, km.d.f24740b);
            } else {
                aVar = id.c.f12675a;
                str = (String) this.f15295a.f20234e;
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str3, 0);
                l.e(decode2, "decode(...)");
                str2 = new String(decode2, km.d.f24740b);
            }
            String valueOf = String.valueOf(aVar.a(str, str2));
            Log.e("Challan_details -", valueOf);
            Object j10 = new i7.d().j(valueOf, EnableServiceResponse.class);
            l.e(j10, "fromJson(...)");
            this.f15296b.o().k((EnableServiceResponse) j10);
        }
    }

    public static final class f implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f15297a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f15298b;

        f(u uVar, b bVar) {
            this.f15297a = uVar;
            this.f15298b = bVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f15298b.m().k(th2 != null ? th2.getMessage() : null);
        }

        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            c.a aVar;
            String str;
            String str2;
            String str3 = null;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception unused) {
                    this.f15298b.m().k("Error");
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                aVar = id.c.f12675a;
                str = (String) this.f15297a.f20234e;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode = decoder.decode(str3);
                l.e(decode, "decode(...)");
                str2 = new String(decode, km.d.f24740b);
            } else {
                aVar = id.c.f12675a;
                str = (String) this.f15297a.f20234e;
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str3, 0);
                l.e(decode2, "decode(...)");
                str2 = new String(decode2, km.d.f24740b);
            }
            Object j10 = new i7.d().j(String.valueOf(aVar.a(str, str2)), EnableServiceResponse.class);
            l.e(j10, "fromJson(...)");
            this.f15298b.l().k((EnableServiceResponse) j10);
        }
    }

    public b(oa.a aVar) {
        l.f(aVar, "repository");
        this.f15274d = aVar;
    }

    public final void g(String str) {
        l.f(str, "servStateCd");
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject = pa.a.f14907a.c(str).toString();
        l.e(jSONObject, "toString(...)");
        this.f15274d.a(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new a(uVar, this));
    }

    public final void h(String str) {
        l.f(str, "servStateCd");
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject = pa.a.f14907a.a(str).toString();
        l.e(jSONObject, "toString(...)");
        this.f15274d.a(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new C0205b(uVar, this));
    }

    public final void i(String str) {
        l.f(str, "servStateCd");
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject = pa.a.f14907a.d(str).toString();
        l.e(jSONObject, "toString(...)");
        this.f15274d.a(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new c(uVar, this));
    }

    public final void j(String str) {
        l.f(str, "servStateCd");
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject = pa.a.f14907a.d(str).toString();
        l.e(jSONObject, "toString(...)");
        this.f15274d.a(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new d(uVar, this));
    }

    public final void k(String str) {
        l.f(str, "servStateCd");
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject = pa.a.f14907a.b(str).toString();
        l.e(jSONObject, "toString(...)");
        this.f15274d.a(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new e(uVar, this));
    }

    public final a0 l() {
        return this.f15277g;
    }

    public final a0 m() {
        return this.f15278h;
    }

    public final a0 n() {
        return this.f15275e;
    }

    public final a0 o() {
        return this.f15281k;
    }

    public final a0 p() {
        return this.f15282l;
    }

    public final a0 q() {
        return this.f15276f;
    }

    public final a0 r() {
        return this.f15283m;
    }

    public final a0 s() {
        return this.f15284n;
    }

    public final a0 t() {
        return this.f15279i;
    }

    public final a0 u() {
        return this.f15285o;
    }

    public final a0 v() {
        return this.f15286p;
    }

    public final a0 w() {
        return this.f15280j;
    }

    public final void x(String str) {
        l.f(str, "servStateCd");
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject = pa.a.f14907a.a(str).toString();
        l.e(jSONObject, "toString(...)");
        this.f15274d.a(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new f(uVar, this));
    }
}
