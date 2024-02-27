package za;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.util.Log;
import androidx.lifecycle.a0;
import androidx.lifecycle.t0;
import cm.l;
import cm.u;
import com.nic.mparivahan.Dl.DLServiceWithoutDobModel.DLWithoutdobModel;
import com.nic.mparivahan.Dl.Model.DLServiceResponseModleV1;
import com.nic.mparivahan.Dl.Model.UpdateDocSuccessResponse;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import id.c;
import j$.util.Base64;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import um.c0;
import um.x;
import xa.a;

public final class a extends t0 {

    /* renamed from: d  reason: collision with root package name */
    private final ya.a f18948d;

    /* renamed from: e  reason: collision with root package name */
    private a0 f18949e = new a0();

    /* renamed from: f  reason: collision with root package name */
    private final a0 f18950f = new a0();

    /* renamed from: g  reason: collision with root package name */
    private a0 f18951g = new a0();

    /* renamed from: h  reason: collision with root package name */
    private a0 f18952h = new a0();

    /* renamed from: i  reason: collision with root package name */
    private final a0 f18953i = new a0();

    /* renamed from: j  reason: collision with root package name */
    private final a0 f18954j = new a0();

    /* renamed from: k  reason: collision with root package name */
    private final a0 f18955k = new a0();

    /* renamed from: l  reason: collision with root package name */
    private final a0 f18956l = new a0();

    /* renamed from: m  reason: collision with root package name */
    private final a0 f18957m = new a0();

    /* renamed from: n  reason: collision with root package name */
    private final a0 f18958n = new a0();

    /* renamed from: o  reason: collision with root package name */
    private final a0 f18959o = new a0();

    /* renamed from: p  reason: collision with root package name */
    private final a0 f18960p = new a0();

    /* renamed from: q  reason: collision with root package name */
    private final a0 f18961q = new a0();

    /* renamed from: r  reason: collision with root package name */
    private final a0 f18962r = new a0();

    /* renamed from: s  reason: collision with root package name */
    private final a0 f18963s = new a0();

    /* renamed from: t  reason: collision with root package name */
    private final a0 f18964t = new a0();

    /* renamed from: u  reason: collision with root package name */
    private final a0 f18965u = new a0();

    /* renamed from: v  reason: collision with root package name */
    private final a0 f18966v = new a0();

    /* renamed from: w  reason: collision with root package name */
    private final a0 f18967w = new a0();

    /* renamed from: x  reason: collision with root package name */
    private final a0 f18968x = new a0();

    /* renamed from: za.a$a  reason: collision with other inner class name */
    public static final class C0252a implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f18969a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f18970b;

        C0252a(u uVar, a aVar) {
            this.f18969a = uVar;
            this.f18970b = aVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f18970b.w().k(th2 != null ? th2.getMessage() : null);
        }

        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            String a10;
            String str = null;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception e10) {
                    Log.d("DlDetails", e10.getLocalizedMessage());
                    this.f18970b.w().k("Error");
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                c.a aVar = id.c.f12675a;
                String str2 = (String) this.f18969a.f20234e;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str = securityModle.getData();
                }
                byte[] decode = decoder.decode(str);
                l.e(decode, "decode(...)");
                a10 = aVar.a(str2, new String(decode, km.d.f24740b));
            } else {
                c.a aVar2 = id.c.f12675a;
                String str3 = (String) this.f18969a.f20234e;
                if (securityModle != null) {
                    str = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str, 0);
                l.e(decode2, "decode(...)");
                a10 = aVar2.a(str3, new String(decode2, km.d.f24740b));
            }
            Object j10 = new i7.d().j(String.valueOf(a10), DLServiceResponseModleV1.class);
            l.e(j10, "fromJson(...)");
            this.f18970b.v().k((DLServiceResponseModleV1) j10);
        }
    }

    public static final class b implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f18971a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f18972b;

        b(u uVar, a aVar) {
            this.f18971a = uVar;
            this.f18972b = aVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f18972b.m().k(th2 != null ? th2.getMessage() : null);
        }

        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            String a10;
            String str = null;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception e10) {
                    Log.d("DlDetails", e10.getLocalizedMessage());
                    this.f18972b.m().k("Error");
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                c.a aVar = id.c.f12675a;
                String str2 = (String) this.f18971a.f20234e;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str = securityModle.getData();
                }
                byte[] decode = decoder.decode(str);
                l.e(decode, "decode(...)");
                a10 = aVar.a(str2, new String(decode, km.d.f24740b));
            } else {
                c.a aVar2 = id.c.f12675a;
                String str3 = (String) this.f18971a.f20234e;
                if (securityModle != null) {
                    str = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str, 0);
                l.e(decode2, "decode(...)");
                a10 = aVar2.a(str3, new String(decode2, km.d.f24740b));
            }
            Object j10 = new i7.d().j(String.valueOf(a10), DLServiceResponseModleV1.class);
            l.e(j10, "fromJson(...)");
            this.f18972b.l().k((DLServiceResponseModleV1) j10);
        }
    }

    public static final class c implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f18973a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f18974b;

        c(u uVar, a aVar) {
            this.f18973a = uVar;
            this.f18974b = aVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f18974b.s().k(th2 != null ? th2.getMessage() : null);
        }

        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            String a10;
            String str = null;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception e10) {
                    Log.d("DlDetails", e10.getLocalizedMessage());
                    this.f18974b.s().k("Error");
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                c.a aVar = id.c.f12675a;
                String str2 = (String) this.f18973a.f20234e;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str = securityModle.getData();
                }
                byte[] decode = decoder.decode(str);
                l.e(decode, "decode(...)");
                a10 = aVar.a(str2, new String(decode, km.d.f24740b));
            } else {
                c.a aVar2 = id.c.f12675a;
                String str3 = (String) this.f18973a.f20234e;
                if (securityModle != null) {
                    str = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str, 0);
                l.e(decode2, "decode(...)");
                a10 = aVar2.a(str3, new String(decode2, km.d.f24740b));
            }
            Object j10 = new i7.d().j(String.valueOf(a10), DLServiceResponseModleV1.class);
            l.e(j10, "fromJson(...)");
            this.f18974b.r().k((DLServiceResponseModleV1) j10);
        }
    }

    public static final class d implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f18975a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f18976b;

        d(u uVar, a aVar) {
            this.f18975a = uVar;
            this.f18976b = aVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f18976b.o().k(th2 != null ? th2.getMessage() : null);
        }

        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            String a10;
            String str = null;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception e10) {
                    Log.d("DlDetails", e10.getLocalizedMessage());
                    this.f18976b.o().k("Error");
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                c.a aVar = id.c.f12675a;
                String str2 = (String) this.f18975a.f20234e;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str = securityModle.getData();
                }
                byte[] decode = decoder.decode(str);
                l.e(decode, "decode(...)");
                a10 = aVar.a(str2, new String(decode, km.d.f24740b));
            } else {
                c.a aVar2 = id.c.f12675a;
                String str3 = (String) this.f18975a.f20234e;
                if (securityModle != null) {
                    str = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str, 0);
                l.e(decode2, "decode(...)");
                a10 = aVar2.a(str3, new String(decode2, km.d.f24740b));
            }
            Object j10 = new i7.d().j(String.valueOf(a10), DLServiceResponseModleV1.class);
            l.e(j10, "fromJson(...)");
            this.f18976b.n().k((DLServiceResponseModleV1) j10);
        }
    }

    public static final class e implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f18977a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f18978b;

        e(u uVar, a aVar) {
            this.f18977a = uVar;
            this.f18978b = aVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f18978b.u().k(th2 != null ? th2.getMessage() : null);
        }

        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            String a10;
            String str = null;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception e10) {
                    e10.printStackTrace();
                    this.f18978b.u().k("Error");
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                c.a aVar = id.c.f12675a;
                String str2 = (String) this.f18977a.f20234e;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str = securityModle.getData();
                }
                byte[] decode = decoder.decode(str);
                l.e(decode, "decode(...)");
                a10 = aVar.a(str2, new String(decode, km.d.f24740b));
            } else {
                c.a aVar2 = id.c.f12675a;
                String str3 = (String) this.f18977a.f20234e;
                if (securityModle != null) {
                    str = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str, 0);
                l.e(decode2, "decode(...)");
                a10 = aVar2.a(str3, new String(decode2, km.d.f24740b));
            }
            Object j10 = new i7.d().j(String.valueOf(a10), DLServiceResponseModleV1.class);
            l.e(j10, "fromJson(...)");
            this.f18978b.t().k((DLServiceResponseModleV1) j10);
        }
    }

    public static final class f implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f18979a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f18980b;

        f(u uVar, a aVar) {
            this.f18979a = uVar;
            this.f18980b = aVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f18980b.A().k(th2 != null ? th2.getMessage() : null);
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
                    this.f18980b.A().k("Error");
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                aVar = id.c.f12675a;
                str = (String) this.f18979a.f20234e;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode = decoder.decode(str3);
                l.e(decode, "decode(...)");
                str2 = new String(decode, km.d.f24740b);
            } else {
                aVar = id.c.f12675a;
                str = (String) this.f18979a.f20234e;
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str3, 0);
                l.e(decode2, "decode(...)");
                str2 = new String(decode2, km.d.f24740b);
            }
            Object j10 = new i7.d().j(String.valueOf(aVar.a(str, str2)), DLWithoutdobModel.class);
            l.e(j10, "fromJson(...)");
            this.f18980b.z().k((DLWithoutdobModel) j10);
        }
    }

    public static final class g implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f18981a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f18982b;

        g(u uVar, a aVar) {
            this.f18981a = uVar;
            this.f18982b = aVar;
        }

        public void onFailure(Call call, Throwable th2) {
            l.f(call, "call");
            l.f(th2, "t");
            this.f18982b.x().k("error");
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
                    str = (String) this.f18981a.f20234e;
                    Base64.Decoder decoder = Base64.getDecoder();
                    if (securityModle != null) {
                        str3 = securityModle.getData();
                    }
                    byte[] decode = decoder.decode(str3);
                    l.e(decode, "decode(...)");
                    str2 = new String(decode, km.d.f24740b);
                } else {
                    aVar = id.c.f12675a;
                    str = (String) this.f18981a.f20234e;
                    if (securityModle != null) {
                        str3 = securityModle.getData();
                    }
                    byte[] decode2 = android.util.Base64.decode(str3, 0);
                    l.e(decode2, "decode(...)");
                    str2 = new String(decode2, km.d.f24740b);
                }
                Object j10 = new i7.d().j(String.valueOf(aVar.a(str, str2)), UpdateDocSuccessResponse.class);
                l.e(j10, "fromJson(...)");
                this.f18982b.y().k((UpdateDocSuccessResponse) j10);
            } catch (Exception unused) {
                this.f18982b.x().k("error");
            }
        }
    }

    public a(ya.a aVar) {
        l.f(aVar, "repository");
        this.f18948d = aVar;
    }

    public final a0 A() {
        return this.f18964t;
    }

    public final a0 B() {
        return this.f18951g;
    }

    public final a0 C() {
        return this.f18952h;
    }

    public final void D(String str, String str2, Context context) {
        l.f(str, "dl");
        l.f(context, "context");
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        ld.g gVar = new ld.g(context);
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        a.C0238a aVar2 = xa.a.f18250a;
        l.c(string);
        String jSONObject = aVar2.c(str, (String) null, context, string, gVar.l()).toString();
        l.e(jSONObject, "toString(...)");
        this.f18948d.a(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new f(uVar, this));
    }

    public final void E(String str, String str2, String str3, Context context) {
        l.f(str, "docId");
        l.f(str2, "docType");
        l.f(str3, "docDob");
        l.f(context, "context");
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        ld.g gVar = new ld.g(context);
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        a.C0238a aVar2 = xa.a.f18250a;
        l.c(string);
        String jSONObject = aVar2.a(str, str2, str3, string, gVar.l(), gVar.e()).toString();
        l.e(jSONObject, "toString(...)");
        this.f18948d.c(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new g(uVar, this));
    }

    public final void g(String str, String str2, Context context) {
        l.f(str, "dl");
        l.f(str2, "dob");
        l.f(context, "context");
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        ld.g gVar = new ld.g(context);
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        a.C0238a aVar2 = xa.a.f18250a;
        l.c(string);
        String jSONObject = aVar2.c(str, str2, context, string, gVar.l()).toString();
        l.e(jSONObject, "toString(...)");
        this.f18948d.b(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new C0252a(uVar, this));
    }

    public final void h(String str, String str2, Context context) {
        l.f(str, "dl");
        l.f(str2, "dob");
        l.f(context, "context");
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        ld.g gVar = new ld.g(context);
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        a.C0238a aVar2 = xa.a.f18250a;
        l.c(string);
        String jSONObject = aVar2.c(str, str2, context, string, gVar.l()).toString();
        l.e(jSONObject, "toString(...)");
        this.f18948d.b(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new b(uVar, this));
    }

    public final void i(String str, String str2, Context context) {
        l.f(str, "dl");
        l.f(str2, "dob");
        l.f(context, "context");
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        ld.g gVar = new ld.g(context);
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        a.C0238a aVar2 = xa.a.f18250a;
        l.c(string);
        String jSONObject = aVar2.c(str, str2, context, string, gVar.l()).toString();
        l.e(jSONObject, "toString(...)");
        this.f18948d.b(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new c(uVar, this));
    }

    public final void j(String str, String str2, Context context) {
        l.f(str, "dl");
        l.f(str2, "dob");
        l.f(context, "context");
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        ld.g gVar = new ld.g(context);
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        a.C0238a aVar2 = xa.a.f18250a;
        l.c(string);
        String jSONObject = aVar2.c(str, str2, context, string, gVar.l()).toString();
        l.e(jSONObject, "toString(...)");
        this.f18948d.b(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new d(uVar, this));
    }

    public final void k(String str, String str2, Context context) {
        l.f(str, "dl");
        l.f(str2, "dob");
        l.f(context, "context");
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        ld.g gVar = new ld.g(context);
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        a.C0238a aVar2 = xa.a.f18250a;
        l.c(string);
        String jSONObject = aVar2.c(str, str2, context, string, gVar.l()).toString();
        l.e(jSONObject, "toString(...)");
        this.f18948d.b(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new e(uVar, this));
    }

    public final a0 l() {
        return this.f18957m;
    }

    public final a0 m() {
        return this.f18958n;
    }

    public final a0 n() {
        return this.f18961q;
    }

    public final a0 o() {
        return this.f18962r;
    }

    public final a0 p() {
        return this.f18959o;
    }

    public final a0 q() {
        return this.f18960p;
    }

    public final a0 r() {
        return this.f18955k;
    }

    public final a0 s() {
        return this.f18956l;
    }

    public final a0 t() {
        return this.f18965u;
    }

    public final a0 u() {
        return this.f18966v;
    }

    public final a0 v() {
        return this.f18953i;
    }

    public final a0 w() {
        return this.f18954j;
    }

    public final a0 x() {
        return this.f18968x;
    }

    public final a0 y() {
        return this.f18967w;
    }

    public final a0 z() {
        return this.f18963s;
    }
}
