package v8;

import android.os.Build;
import androidx.lifecycle.a0;
import androidx.lifecycle.t0;
import cm.l;
import cm.u;
import com.nic.mparivahan.Account.Model.GetCitizenDetails;
import com.nic.mparivahan.Account.Model.SendOtpResult;
import com.nic.mparivahan.Account.Model.StateMaster;
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
    private final s8.a f17379d;

    /* renamed from: e  reason: collision with root package name */
    private final a0 f17380e = new a0();

    /* renamed from: f  reason: collision with root package name */
    private final a0 f17381f = new a0();

    /* renamed from: g  reason: collision with root package name */
    private final a0 f17382g = new a0();

    /* renamed from: h  reason: collision with root package name */
    private final a0 f17383h = new a0();

    /* renamed from: i  reason: collision with root package name */
    private final a0 f17384i = new a0();

    /* renamed from: j  reason: collision with root package name */
    private final a0 f17385j = new a0();

    /* renamed from: k  reason: collision with root package name */
    private final a0 f17386k = new a0();

    /* renamed from: l  reason: collision with root package name */
    private final a0 f17387l = new a0();

    public static final class a implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f17388a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f17389b;

        a(u uVar, b bVar) {
            this.f17388a = uVar;
            this.f17389b = bVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f17389b.l().k(th2 != null ? th2.toString() : null);
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
                    this.f17389b.l().k("error");
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                aVar = id.c.f12675a;
                str = (String) this.f17388a.f20234e;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode = decoder.decode(str3);
                l.e(decode, "decode(...)");
                str2 = new String(decode, km.d.f24740b);
            } else {
                aVar = id.c.f12675a;
                str = (String) this.f17388a.f20234e;
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str3, 0);
                l.e(decode2, "decode(...)");
                str2 = new String(decode2, km.d.f24740b);
            }
            Object j10 = new i7.d().j(String.valueOf(aVar.a(str, str2)), GetCitizenDetails.class);
            l.e(j10, "fromJson(...)");
            this.f17389b.m().k((GetCitizenDetails) j10);
        }
    }

    /* renamed from: v8.b$b  reason: collision with other inner class name */
    public static final class C0230b implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f17390a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f17391b;

        C0230b(u uVar, b bVar) {
            this.f17390a = uVar;
            this.f17391b = bVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f17391b.j().k(th2 != null ? th2.toString() : null);
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
                    this.f17391b.j().k("error");
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                aVar = id.c.f12675a;
                str = (String) this.f17390a.f20234e;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode = decoder.decode(str3);
                l.e(decode, "decode(...)");
                str2 = new String(decode, km.d.f24740b);
            } else {
                aVar = id.c.f12675a;
                str = (String) this.f17390a.f20234e;
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str3, 0);
                l.e(decode2, "decode(...)");
                str2 = new String(decode2, km.d.f24740b);
            }
            Object j10 = new i7.d().j(String.valueOf(aVar.a(str, str2)), GetCitizenDetails.class);
            l.e(j10, "fromJson(...)");
            this.f17391b.k().k((GetCitizenDetails) j10);
        }
    }

    public static final class c implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f17392a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f17393b;

        c(u uVar, b bVar) {
            this.f17392a = uVar;
            this.f17393b = bVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f17393b.i().k(th2 != null ? th2.getMessage() : null);
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
                    this.f17393b.i().k("error");
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                aVar = id.c.f12675a;
                str = (String) this.f17392a.f20234e;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode = decoder.decode(str3);
                l.e(decode, "decode(...)");
                str2 = new String(decode, km.d.f24740b);
            } else {
                aVar = id.c.f12675a;
                str = (String) this.f17392a.f20234e;
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str3, 0);
                l.e(decode2, "decode(...)");
                str2 = new String(decode2, km.d.f24740b);
            }
            Object j10 = new i7.d().j(String.valueOf(aVar.a(str, str2)), SendOtpResult.class);
            l.e(j10, "fromJson(...)");
            this.f17393b.n().k((SendOtpResult) j10);
        }
    }

    public static final class d implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f17394a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f17395b;

        d(u uVar, b bVar) {
            this.f17394a = uVar;
            this.f17395b = bVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f17395b.s().k(th2 != null ? th2.toString() : null);
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
                    this.f17395b.s().k("error");
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                aVar = id.c.f12675a;
                str = (String) this.f17394a.f20234e;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode = decoder.decode(str3);
                l.e(decode, "decode(...)");
                str2 = new String(decode, km.d.f24740b);
            } else {
                aVar = id.c.f12675a;
                str = (String) this.f17394a.f20234e;
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str3, 0);
                l.e(decode2, "decode(...)");
                str2 = new String(decode2, km.d.f24740b);
            }
            Object j10 = new i7.d().j(String.valueOf(aVar.a(str, str2)), StateMaster.class);
            l.e(j10, "fromJson(...)");
            this.f17395b.p().k((StateMaster) j10);
        }
    }

    public static final class e implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f17396a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f17397b;

        e(u uVar, b bVar) {
            this.f17396a = uVar;
            this.f17397b = bVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f17397b.s().k(th2 != null ? th2.toString() : null);
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
                    this.f17397b.s().k("error");
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                aVar = id.c.f12675a;
                str = (String) this.f17396a.f20234e;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode = decoder.decode(str3);
                l.e(decode, "decode(...)");
                str2 = new String(decode, km.d.f24740b);
            } else {
                aVar = id.c.f12675a;
                str = (String) this.f17396a.f20234e;
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str3, 0);
                l.e(decode2, "decode(...)");
                str2 = new String(decode2, km.d.f24740b);
            }
            Object j10 = new i7.d().j(String.valueOf(aVar.a(str, str2)), StateMaster.class);
            l.e(j10, "fromJson(...)");
            this.f17397b.p().k((StateMaster) j10);
        }
    }

    public b(s8.a aVar) {
        l.f(aVar, "repository");
        this.f17379d = aVar;
    }

    public final void g(String str) {
        l.f(str, "mobile_no");
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject = t8.c.f16582a.g(str).toString();
        l.e(jSONObject, "toString(...)");
        this.f17379d.d(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new a(uVar, this));
    }

    public final void h(String str) {
        l.f(str, "mobile_no");
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject = t8.c.f16582a.g(str).toString();
        l.e(jSONObject, "toString(...)");
        this.f17379d.d(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new C0230b(uVar, this));
    }

    public final a0 i() {
        return this.f17381f;
    }

    public final a0 j() {
        return this.f17387l;
    }

    public final a0 k() {
        return this.f17386k;
    }

    public final a0 l() {
        return this.f17383h;
    }

    public final a0 m() {
        return this.f17382g;
    }

    public final a0 n() {
        return this.f17380e;
    }

    public final void o(String str, int i10) {
        l.f(str, "mobile_no");
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject = t8.c.f16582a.m(str, i10).toString();
        l.e(jSONObject, "toString(...)");
        this.f17379d.b(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new c(uVar, this));
    }

    public final a0 p() {
        return this.f17384i;
    }

    public final void q() {
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject = t8.c.f16582a.l().toString();
        l.e(jSONObject, "toString(...)");
        this.f17379d.c(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new d(uVar, this));
    }

    public final void r() {
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject = t8.c.f16582a.k().toString();
        l.e(jSONObject, "toString(...)");
        this.f17379d.c(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new e(uVar, this));
    }

    public final a0 s() {
        return this.f17385j;
    }
}
