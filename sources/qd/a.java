package qd;

import android.os.Build;
import android.util.Log;
import androidx.lifecycle.a0;
import androidx.lifecycle.t0;
import cm.l;
import cm.u;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.nic.mparivahan.Sos.SModle.ContactSaveSucess;
import com.nic.mparivahan.Sos.SModle.ContactUpdate;
import com.nic.mparivahan.Sos.SModle.DeletResult;
import com.nic.mparivahan.Sos.SModle.GetRelationMaster;
import id.c;
import j$.util.Base64;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import um.c0;
import um.x;

public final class a extends t0 {

    /* renamed from: d  reason: collision with root package name */
    private final pd.a f15382d;

    /* renamed from: e  reason: collision with root package name */
    private a0 f15383e = new a0();

    /* renamed from: f  reason: collision with root package name */
    private a0 f15384f = new a0();

    /* renamed from: g  reason: collision with root package name */
    private a0 f15385g = new a0();

    /* renamed from: h  reason: collision with root package name */
    private a0 f15386h = new a0();

    /* renamed from: i  reason: collision with root package name */
    private a0 f15387i = new a0();

    /* renamed from: j  reason: collision with root package name */
    private a0 f15388j = new a0();

    /* renamed from: k  reason: collision with root package name */
    private a0 f15389k = new a0();

    /* renamed from: l  reason: collision with root package name */
    private a0 f15390l = new a0();

    /* renamed from: m  reason: collision with root package name */
    private a0 f15391m = new a0();

    /* renamed from: n  reason: collision with root package name */
    private a0 f15392n = new a0();

    /* renamed from: qd.a$a  reason: collision with other inner class name */
    public static final class C0207a implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f15393a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f15394b;

        C0207a(u uVar, a aVar) {
            this.f15393a = uVar;
            this.f15394b = aVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f15394b.l().k(th2 != null ? th2.toString() : null);
        }

        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            String a10;
            String str = null;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception e10) {
                    Log.d("dltResult", e10.toString());
                    this.f15394b.l().k("error");
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                c.a aVar = id.c.f12675a;
                String str2 = (String) this.f15393a.f20234e;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str = securityModle.getData();
                }
                byte[] decode = decoder.decode(str);
                l.e(decode, "decode(...)");
                a10 = aVar.a(str2, new String(decode, km.d.f24740b));
            } else {
                c.a aVar2 = id.c.f12675a;
                String str3 = (String) this.f15393a.f20234e;
                if (securityModle != null) {
                    str = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str, 0);
                l.e(decode2, "decode(...)");
                a10 = aVar2.a(str3, new String(decode2, km.d.f24740b));
            }
            Object j10 = new i7.d().j(String.valueOf(a10), DeletResult.class);
            l.e(j10, "fromJson(...)");
            this.f15394b.k().k((DeletResult) j10);
        }
    }

    public static final class b implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f15395a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f15396b;

        b(u uVar, a aVar) {
            this.f15395a = uVar;
            this.f15396b = aVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f15396b.n().k(th2 != null ? th2.toString() : null);
        }

        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            String a10;
            String str = null;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception e10) {
                    this.f15396b.n().k("error");
                    Log.d("getContact", e10.getLocalizedMessage());
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                c.a aVar = id.c.f12675a;
                String str2 = (String) this.f15395a.f20234e;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str = securityModle.getData();
                }
                byte[] decode = decoder.decode(str);
                l.e(decode, "decode(...)");
                a10 = aVar.a(str2, new String(decode, km.d.f24740b));
            } else {
                c.a aVar2 = id.c.f12675a;
                String str3 = (String) this.f15395a.f20234e;
                if (securityModle != null) {
                    str = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str, 0);
                l.e(decode2, "decode(...)");
                a10 = aVar2.a(str3, new String(decode2, km.d.f24740b));
            }
            this.f15396b.m().k(String.valueOf(a10));
        }
    }

    public static final class c implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f15397a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f15398b;

        c(u uVar, a aVar) {
            this.f15397a = uVar;
            this.f15398b = aVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f15398b.p().k(th2 != null ? th2.toString() : null);
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
                    this.f15398b.p().k("error");
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                aVar = id.c.f12675a;
                str = (String) this.f15397a.f20234e;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode = decoder.decode(str3);
                l.e(decode, "decode(...)");
                str2 = new String(decode, km.d.f24740b);
            } else {
                aVar = id.c.f12675a;
                str = (String) this.f15397a.f20234e;
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str3, 0);
                l.e(decode2, "decode(...)");
                str2 = new String(decode2, km.d.f24740b);
            }
            Object j10 = new i7.d().j(String.valueOf(aVar.a(str, str2)), GetRelationMaster.class);
            l.e(j10, "fromJson(...)");
            this.f15398b.o().k((GetRelationMaster) j10);
        }
    }

    public static final class d implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f15399a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f15400b;

        d(u uVar, a aVar) {
            this.f15399a = uVar;
            this.f15400b = aVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f15400b.i().k(th2 != null ? th2.toString() : null);
        }

        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            String a10;
            String str = null;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception e10) {
                    this.f15400b.i().k("error");
                    Log.d("saveContact-", e10.getLocalizedMessage());
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                c.a aVar = id.c.f12675a;
                String str2 = (String) this.f15399a.f20234e;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str = securityModle.getData();
                }
                byte[] decode = decoder.decode(str);
                l.e(decode, "decode(...)");
                a10 = aVar.a(str2, new String(decode, km.d.f24740b));
            } else {
                c.a aVar2 = id.c.f12675a;
                String str3 = (String) this.f15399a.f20234e;
                if (securityModle != null) {
                    str = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str, 0);
                l.e(decode2, "decode(...)");
                a10 = aVar2.a(str3, new String(decode2, km.d.f24740b));
            }
            Object j10 = new i7.d().j(String.valueOf(a10), ContactSaveSucess.class);
            l.e(j10, "fromJson(...)");
            this.f15400b.j().k((ContactSaveSucess) j10);
        }
    }

    public static final class e implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f15401a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f15402b;

        e(u uVar, a aVar) {
            this.f15401a = uVar;
            this.f15402b = aVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f15402b.s().k(th2 != null ? th2.toString() : null);
        }

        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            String a10;
            String str = null;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception e10) {
                    this.f15402b.s().k("error");
                    Log.d("updateContact-", e10.getLocalizedMessage());
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                c.a aVar = id.c.f12675a;
                String str2 = (String) this.f15401a.f20234e;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str = securityModle.getData();
                }
                byte[] decode = decoder.decode(str);
                l.e(decode, "decode(...)");
                a10 = aVar.a(str2, new String(decode, km.d.f24740b));
            } else {
                c.a aVar2 = id.c.f12675a;
                String str3 = (String) this.f15401a.f20234e;
                if (securityModle != null) {
                    str = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str, 0);
                l.e(decode2, "decode(...)");
                a10 = aVar2.a(str3, new String(decode2, km.d.f24740b));
            }
            Object j10 = new i7.d().j(String.valueOf(a10), ContactUpdate.class);
            l.e(j10, "fromJson(...)");
            this.f15402b.r().k((ContactUpdate) j10);
        }
    }

    public a(pd.a aVar) {
        l.f(aVar, "repository");
        this.f15382d = aVar;
    }

    public final void g(String str) {
        l.f(str, "soscRecordId");
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject = md.x.f14046a.e(str).toString();
        l.e(jSONObject, "toString(...)");
        this.f15382d.a(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new C0207a(uVar, this));
    }

    public final void h(long j10) {
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject = md.x.f14046a.c(j10).toString();
        l.e(jSONObject, "toString(...)");
        this.f15382d.b(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new b(uVar, this));
    }

    public final a0 i() {
        return this.f15388j;
    }

    public final a0 j() {
        return this.f15387i;
    }

    public final a0 k() {
        return this.f15391m;
    }

    public final a0 l() {
        return this.f15392n;
    }

    public final a0 m() {
        return this.f15385g;
    }

    public final a0 n() {
        return this.f15386h;
    }

    public final a0 o() {
        return this.f15383e;
    }

    public final a0 p() {
        return this.f15384f;
    }

    public final void q() {
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject = md.x.f14046a.b().toString();
        l.e(jSONObject, "toString(...)");
        this.f15382d.c(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new c(uVar, this));
    }

    public final a0 r() {
        return this.f15389k;
    }

    public final a0 s() {
        return this.f15390l;
    }

    public final void t(long j10, String str, String str2, String str3) {
        l.f(str, "name");
        l.f(str2, "number");
        l.f(str3, "relation_id");
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject = md.x.f14046a.d(j10, str2, str, str3).toString();
        l.e(jSONObject, "toString(...)");
        this.f15382d.d(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new d(uVar, this));
    }

    public final void u(long j10, long j11, String str, String str2, String str3) {
        String str4 = str;
        l.f(str4, "mobile");
        String str5 = str2;
        l.f(str5, "name");
        String str6 = str3;
        l.f(str6, "sosrelation");
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject = md.x.f14046a.a(j10, j11, str4, str5, str6).toString();
        l.e(jSONObject, "toString(...)");
        this.f15382d.e(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new e(uVar, this));
    }
}
