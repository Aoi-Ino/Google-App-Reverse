package of;

import android.os.Build;
import android.util.Log;
import androidx.lifecycle.a0;
import androidx.lifecycle.t0;
import cm.l;
import cm.u;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.nic.mparivahan.VahanServices.HPA.HPAResModle;
import com.nic.mparivahan.VahanServices.HPTModel.HTPModel.HtpTypeModle;
import com.nic.mparivahan.VahanServices.VahanModel.DistictModle;
import com.nic.mparivahan.VahanServices.VahanModel.VahanStateModle;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import id.c;
import j$.util.Base64;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import um.c0;
import um.x;

public final class b extends t0 {

    /* renamed from: d  reason: collision with root package name */
    private final qf.a f29982d;

    /* renamed from: e  reason: collision with root package name */
    private final a0 f29983e = new a0();

    /* renamed from: f  reason: collision with root package name */
    private final a0 f29984f = new a0();

    /* renamed from: g  reason: collision with root package name */
    private final a0 f29985g = new a0();

    /* renamed from: h  reason: collision with root package name */
    private final a0 f29986h = new a0();

    /* renamed from: i  reason: collision with root package name */
    private final a0 f29987i = new a0();

    /* renamed from: j  reason: collision with root package name */
    private final a0 f29988j = new a0();

    /* renamed from: k  reason: collision with root package name */
    private final a0 f29989k = new a0();

    /* renamed from: l  reason: collision with root package name */
    private final a0 f29990l = new a0();

    /* renamed from: m  reason: collision with root package name */
    private final a0 f29991m = new a0();

    /* renamed from: n  reason: collision with root package name */
    private final a0 f29992n = new a0();

    /* renamed from: o  reason: collision with root package name */
    private final a0 f29993o = new a0();

    /* renamed from: p  reason: collision with root package name */
    private final a0 f29994p = new a0();

    /* renamed from: q  reason: collision with root package name */
    private final a0 f29995q = new a0();

    /* renamed from: r  reason: collision with root package name */
    private final a0 f29996r = new a0();

    public static final class a implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f29997a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f29998b;

        a(u uVar, b bVar) {
            this.f29997a = uVar;
            this.f29998b = bVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f29998b.j().k(th2 != null ? th2.toString() : null);
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
                    this.f29998b.j().k("Error");
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                aVar = id.c.f12675a;
                str = (String) this.f29997a.f20234e;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode = decoder.decode(str3);
                l.e(decode, "decode(...)");
                str2 = new String(decode, km.d.f24740b);
            } else {
                aVar = id.c.f12675a;
                str = (String) this.f29997a.f20234e;
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str3, 0);
                l.e(decode2, "decode(...)");
                str2 = new String(decode2, km.d.f24740b);
            }
            String valueOf = String.valueOf(aVar.a(str, str2));
            Log.d("RequestForHpa", valueOf);
            Object j10 = new i7.d().j(valueOf, HtpTypeModle.class);
            l.e(j10, "fromJson(...)");
            this.f29998b.i().k((HtpTypeModle) j10);
        }
    }

    /* renamed from: of.b$b  reason: collision with other inner class name */
    public static final class C0328b implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f29999a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f30000b;

        C0328b(u uVar, b bVar) {
            this.f29999a = uVar;
            this.f30000b = bVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f30000b.p().k(th2 != null ? th2.getMessage() : null);
        }

        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            String a10;
            String str = null;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception e10) {
                    Log.d("getdist_error+", e10.getLocalizedMessage());
                    e10.printStackTrace();
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                c.a aVar = id.c.f12675a;
                String str2 = (String) this.f29999a.f20234e;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str = securityModle.getData();
                }
                byte[] decode = decoder.decode(str);
                l.e(decode, "decode(...)");
                a10 = aVar.a(str2, new String(decode, km.d.f24740b));
            } else {
                c.a aVar2 = id.c.f12675a;
                String str3 = (String) this.f29999a.f20234e;
                if (securityModle != null) {
                    str = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str, 0);
                l.e(decode2, "decode(...)");
                a10 = aVar2.a(str3, new String(decode2, km.d.f24740b));
            }
            String valueOf = String.valueOf(a10);
            Log.d("getdist", valueOf);
            Object j10 = new i7.d().j(valueOf, VahanStateModle.class);
            l.e(j10, "fromJson(...)");
            this.f30000b.n().k((VahanStateModle) j10);
        }
    }

    public static final class c implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f30001a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f30002b;

        c(u uVar, b bVar) {
            this.f30001a = uVar;
            this.f30002b = bVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f30002b.h().k(th2 != null ? th2.getMessage() : null);
        }

        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            String a10;
            String str = null;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception e10) {
                    Log.d("getdist_error+", e10.getLocalizedMessage());
                    e10.printStackTrace();
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                c.a aVar = id.c.f12675a;
                String str2 = (String) this.f30001a.f20234e;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str = securityModle.getData();
                }
                byte[] decode = decoder.decode(str);
                l.e(decode, "decode(...)");
                a10 = aVar.a(str2, new String(decode, km.d.f24740b));
            } else {
                c.a aVar2 = id.c.f12675a;
                String str3 = (String) this.f30001a.f20234e;
                if (securityModle != null) {
                    str = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str, 0);
                l.e(decode2, "decode(...)");
                a10 = aVar2.a(str3, new String(decode2, km.d.f24740b));
            }
            String valueOf = String.valueOf(a10);
            Log.d("getdist", valueOf);
            Object j10 = new i7.d().j(valueOf, DistictModle.class);
            l.e(j10, "fromJson(...)");
            this.f30002b.g().k((DistictModle) j10);
        }
    }

    public static final class d implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f30003a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f30004b;

        d(u uVar, b bVar) {
            this.f30003a = uVar;
            this.f30004b = bVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f30004b.l().k("error");
        }

        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            String a10;
            String str = null;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception e10) {
                    this.f30004b.l().k("error");
                    Log.d("RequestForHpa-", e10.getLocalizedMessage());
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                c.a aVar = id.c.f12675a;
                String str2 = (String) this.f30003a.f20234e;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str = securityModle.getData();
                }
                byte[] decode = decoder.decode(str);
                l.e(decode, "decode(...)");
                a10 = aVar.a(str2, new String(decode, km.d.f24740b));
            } else {
                c.a aVar2 = id.c.f12675a;
                String str3 = (String) this.f30003a.f20234e;
                if (securityModle != null) {
                    str = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str, 0);
                l.e(decode2, "decode(...)");
                a10 = aVar2.a(str3, new String(decode2, km.d.f24740b));
            }
            String valueOf = String.valueOf(a10);
            Log.d("RequestForHpa", valueOf);
            Object j10 = new i7.d().j(valueOf, HPAResModle.class);
            l.e(j10, "fromJson(...)");
            this.f30004b.k().k((HPAResModle) j10);
        }
    }

    public b(qf.a aVar) {
        l.f(aVar, "repository");
        this.f29982d = aVar;
    }

    public final a0 g() {
        return this.f29985g;
    }

    public final a0 h() {
        return this.f29986h;
    }

    public final a0 i() {
        return this.f29995q;
    }

    public final a0 j() {
        return this.f29996r;
    }

    public final a0 k() {
        return this.f29993o;
    }

    public final a0 l() {
        return this.f29994p;
    }

    public final void m() {
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject = VUtility.Companion.g0().toString();
        l.e(jSONObject, "toString(...)");
        this.f29982d.b(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new a(uVar, this));
    }

    public final a0 n() {
        return this.f29983e;
    }

    public final void o() {
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject = VUtility.Companion.X().toString();
        l.e(jSONObject, "toString(...)");
        this.f29982d.c(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new C0328b(uVar, this));
    }

    public final a0 p() {
        return this.f29984f;
    }

    public final void q(String str) {
        l.f(str, "state_code");
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject = VUtility.Companion.b0(str).toString();
        l.e(jSONObject, "toString(...)");
        this.f29982d.d(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new c(uVar, this));
    }

    public final void r(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13) {
        l.f(str, "fncr_add1");
        String str14 = str2;
        l.f(str14, "fncr_add2");
        String str15 = str3;
        l.f(str15, "fncr_add3");
        String str16 = str4;
        l.f(str16, "dis_code");
        String str17 = str5;
        l.f(str17, "fncr_name");
        String str18 = str6;
        l.f(str18, "fncr_pincode");
        String str19 = str7;
        l.f(str19, "fncr_state");
        String str20 = str8;
        l.f(str20, "from_dt");
        String str21 = str9;
        l.f(str21, "op_dt");
        String str22 = str10;
        l.f(str22, "state_cd");
        String str23 = str11;
        l.f(str23, "regn_no");
        String str24 = str12;
        l.f(str24, "off_code");
        String str25 = str13;
        l.f(str25, "htpCode");
        String jSONObject = nf.a.f25133a.a(str, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25).toString();
        l.e(jSONObject, "toString(...)");
        c0 f10 = c0.Companion.f(x.f32156g.b("application/json"), jSONObject);
        u uVar = new u();
        String valueOf = String.valueOf(System.currentTimeMillis());
        uVar.f20234e = valueOf;
        this.f29982d.a(f10, valueOf).enqueue(new d(uVar, this));
    }
}
