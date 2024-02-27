package li;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import androidx.lifecycle.a0;
import androidx.lifecycle.t0;
import cm.l;
import cm.u;
import com.nic.mparivahan.Account.Model.GetEnableStateModel;
import com.nic.mparivahan.Account.Model.StateMaster;
import com.nic.mparivahan.DB.DatabaseHelper;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import id.c;
import j$.util.Base64;
import km.d;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import um.c0;
import um.x;

public final class e extends t0 {

    /* renamed from: d  reason: collision with root package name */
    private final ji.c f24836d;

    /* renamed from: e  reason: collision with root package name */
    private final a0 f24837e = new a0();

    /* renamed from: f  reason: collision with root package name */
    private final a0 f24838f = new a0();

    /* renamed from: g  reason: collision with root package name */
    private final a0 f24839g = new a0();

    /* renamed from: h  reason: collision with root package name */
    private final a0 f24840h = new a0();

    /* renamed from: i  reason: collision with root package name */
    private final a0 f24841i = new a0();

    /* renamed from: j  reason: collision with root package name */
    private final a0 f24842j = new a0();

    /* renamed from: k  reason: collision with root package name */
    private final a0 f24843k = new a0();

    /* renamed from: l  reason: collision with root package name */
    private final a0 f24844l = new a0();

    public static final class a implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f24845a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f24846b;

        a(u uVar, e eVar) {
            this.f24845a = uVar;
            this.f24846b = eVar;
        }

        public void onFailure(Call call, Throwable th2) {
            l.f(call, "call");
            l.f(th2, "t");
            this.f24846b.m().k(th2.getMessage());
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
                    String str2 = (String) this.f24845a.f20234e;
                    Base64.Decoder decoder = Base64.getDecoder();
                    if (securityModle != null) {
                        str = securityModle.getData();
                    }
                    byte[] decode = decoder.decode(str);
                    l.e(decode, "decode(...)");
                    a10 = aVar.a(str2, new String(decode, d.f24740b));
                } else {
                    c.a aVar2 = id.c.f12675a;
                    String str3 = (String) this.f24845a.f20234e;
                    if (securityModle != null) {
                        str = securityModle.getData();
                    }
                    byte[] decode2 = android.util.Base64.decode(str, 0);
                    l.e(decode2, "decode(...)");
                    a10 = aVar2.a(str3, new String(decode2, d.f24740b));
                }
                String valueOf = String.valueOf(a10);
                Log.d("en_state-", valueOf);
                Object j10 = new i7.d().j(valueOf, GetEnableStateModel.class);
                l.e(j10, "fromJson(...)");
                this.f24846b.l().k((GetEnableStateModel) j10);
            } catch (Exception e10) {
                Log.d("en_state-", e10.getLocalizedMessage());
                this.f24846b.m().k("Error");
            }
        }
    }

    public static final class b implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f24847a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f24848b;

        b(u uVar, e eVar) {
            this.f24847a = uVar;
            this.f24848b = eVar;
        }

        public void onFailure(Call call, Throwable th2) {
            l.f(call, "call");
            l.f(th2, "t");
            this.f24848b.k().k(th2.getMessage());
        }

        public void onResponse(Call call, Response response) {
            String a10;
            l.f(call, "call");
            l.f(response, "response");
            if (response.isSuccessful()) {
                SecurityModle securityModle = (SecurityModle) response.body();
                if (securityModle != null) {
                    try {
                        if (Build.VERSION.SDK_INT >= 26) {
                            byte[] decode = Base64.getDecoder().decode(securityModle.getData());
                            l.e(decode, "decode(...)");
                            a10 = id.c.f12675a.a((String) this.f24847a.f20234e, new String(decode, d.f24740b));
                        } else {
                            byte[] decode2 = android.util.Base64.decode(securityModle.getData(), 0);
                            l.e(decode2, "decode(...)");
                            a10 = id.c.f12675a.a((String) this.f24847a.f20234e, new String(decode2, d.f24740b));
                        }
                        this.f24848b.r().k(ki.a.f24678a.b(String.valueOf(a10)));
                    } catch (Exception e10) {
                        e10.printStackTrace();
                        Log.d("DecRes-", e10.getLocalizedMessage());
                    }
                }
            } else {
                this.f24848b.k().k("Error");
            }
        }
    }

    public static final class c implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f24849a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f24850b;

        c(u uVar, e eVar) {
            this.f24849a = uVar;
            this.f24850b = eVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f24850b.q().k(th2 != null ? th2.toString() : null);
        }

        public void onResponse(Call call, Response response) {
            a0 q10;
            String str;
            SecurityModle securityModle;
            String a10;
            String str2 = null;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (NullPointerException unused) {
                    q10 = this.f24850b.q();
                    str = "Error";
                    q10.k(str);
                    return;
                } catch (Exception e10) {
                    e10.printStackTrace();
                    q10 = this.f24850b.q();
                    str = "401";
                    q10.k(str);
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                c.a aVar = id.c.f12675a;
                String str3 = (String) this.f24849a.f20234e;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str2 = securityModle.getData();
                }
                byte[] decode = decoder.decode(str2);
                l.e(decode, "decode(...)");
                a10 = aVar.a(str3, new String(decode, d.f24740b));
            } else {
                c.a aVar2 = id.c.f12675a;
                String str4 = (String) this.f24849a.f20234e;
                if (securityModle != null) {
                    str2 = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str2, 0);
                l.e(decode2, "decode(...)");
                a10 = aVar2.a(str4, new String(decode2, d.f24740b));
            }
            Object j10 = new i7.d().j(String.valueOf(a10), StateMaster.class);
            l.e(j10, "fromJson(...)");
            this.f24850b.o().k((StateMaster) j10);
        }
    }

    public e(ji.c cVar) {
        l.f(cVar, "repository");
        this.f24836d = cVar;
    }

    public final void g(Context context) {
        l.f(context, "context");
        DatabaseHelper A0 = DatabaseHelper.A0(context);
        if (A0.o() != null && A0.o().size() > 0) {
            try {
                this.f24843k.k(A0.o());
                return;
            } catch (Exception unused) {
            }
        }
        this.f24844l.k("error");
    }

    public final a0 h() {
        return this.f24843k;
    }

    public final a0 i() {
        return this.f24844l;
    }

    public final void j(String str) {
        l.f(str, "requestParam");
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        this.f24836d.a(c0.Companion.f(x.f32156g.b("application/json"), str), (String) uVar.f20234e).enqueue(new a(uVar, this));
    }

    public final a0 k() {
        return this.f24838f;
    }

    public final a0 l() {
        return this.f24839g;
    }

    public final a0 m() {
        return this.f24840h;
    }

    public final void n() {
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject = ki.a.f24678a.a().toString();
        l.e(jSONObject, "toString(...)");
        this.f24836d.c(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new b(uVar, this));
    }

    public final a0 o() {
        return this.f24841i;
    }

    public final void p() {
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject = t8.c.f16582a.l().toString();
        l.e(jSONObject, "toString(...)");
        this.f24836d.b(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new c(uVar, this));
    }

    public final a0 q() {
        return this.f24842j;
    }

    public final a0 r() {
        return this.f24837e;
    }
}
