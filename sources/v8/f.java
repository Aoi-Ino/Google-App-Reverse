package v8;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.util.Log;
import androidx.lifecycle.a0;
import androidx.lifecycle.t0;
import bm.p;
import cm.r;
import cm.u;
import com.nic.mparivahan.Account.Model.OtpVerifyResult;
import com.nic.mparivahan.Account.Model.ResendOtp;
import com.nic.mparivahan.Account.Model.UserLoginModel;
import com.nic.mparivahan.DB.DatabaseHelper;
import com.nic.mparivahan.RC.Model.GetVirtualDocDetails;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import id.c;
import j$.util.Base64;
import kotlin.coroutines.jvm.internal.l;
import ld.g;
import lm.d0;
import lm.d1;
import lm.f0;
import lm.k1;
import pl.q;
import pl.x;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import t8.c;
import um.c0;

public final class f extends t0 {

    /* renamed from: d  reason: collision with root package name */
    private final s8.b f17409d;

    /* renamed from: e  reason: collision with root package name */
    private final a0 f17410e = new a0();

    /* renamed from: f  reason: collision with root package name */
    private final a0 f17411f = new a0();

    /* renamed from: g  reason: collision with root package name */
    private final a0 f17412g = new a0();

    /* renamed from: h  reason: collision with root package name */
    private final a0 f17413h = new a0();

    /* renamed from: i  reason: collision with root package name */
    private final a0 f17414i = new a0();

    /* renamed from: j  reason: collision with root package name */
    private final a0 f17415j = new a0();

    /* renamed from: k  reason: collision with root package name */
    private final a0 f17416k = new a0();

    /* renamed from: l  reason: collision with root package name */
    private final a0 f17417l = new a0();

    /* renamed from: m  reason: collision with root package name */
    private final a0 f17418m = new a0();

    /* renamed from: n  reason: collision with root package name */
    private final a0 f17419n = new a0();

    /* renamed from: o  reason: collision with root package name */
    private final a0 f17420o = new a0();

    static final class a extends l implements p {

        /* renamed from: f  reason: collision with root package name */
        Object f17421f;

        /* renamed from: g  reason: collision with root package name */
        int f17422g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ r f17423h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ f f17424i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ Context f17425j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(r rVar, f fVar, Context context, tl.d dVar) {
            super(2, dVar);
            this.f17423h = rVar;
            this.f17424i = fVar;
            this.f17425j = context;
        }

        /* renamed from: b */
        public final Object h(d0 d0Var, tl.d dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(x.f30437a);
        }

        public final tl.d create(Object obj, tl.d dVar) {
            return new a(this.f17423h, this.f17424i, this.f17425j, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            r rVar;
            Object c10 = d.c();
            int i10 = this.f17422g;
            if (i10 == 0) {
                q.b(obj);
                r rVar2 = this.f17423h;
                f fVar = this.f17424i;
                Context context = this.f17425j;
                this.f17421f = rVar2;
                this.f17422g = 1;
                Object h10 = fVar.h(context, this);
                if (h10 == c10) {
                    return c10;
                }
                rVar = rVar2;
                obj = h10;
            } else if (i10 == 1) {
                rVar = (r) this.f17421f;
                q.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            rVar.f20231e = ((Boolean) obj).booleanValue();
            return x.f30437a;
        }
    }

    public static final class b implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f17426a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f f17427b;

        b(u uVar, f fVar) {
            this.f17426a = uVar;
            this.f17427b = fVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f17427b.l().k(th2 != null ? th2.getMessage() : null);
        }

        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            String a10;
            String str = null;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception e10) {
                    this.f17427b.l().k("ERROR");
                    Log.d("getOtpResend", e10.getLocalizedMessage());
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                c.a aVar = id.c.f12675a;
                String str2 = (String) this.f17426a.f20234e;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str = securityModle.getData();
                }
                byte[] decode = decoder.decode(str);
                cm.l.e(decode, "decode(...)");
                a10 = aVar.a(str2, new String(decode, km.d.f24740b));
            } else {
                c.a aVar2 = id.c.f12675a;
                String str3 = (String) this.f17426a.f20234e;
                if (securityModle != null) {
                    str = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str, 0);
                cm.l.e(decode2, "decode(...)");
                a10 = aVar2.a(str3, new String(decode2, km.d.f24740b));
            }
            Object j10 = new i7.d().j(String.valueOf(a10), ResendOtp.class);
            cm.l.e(j10, "fromJson(...)");
            this.f17427b.m().k((ResendOtp) j10);
        }
    }

    public static final class c implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f17428a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f f17429b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ u f17430c;

        c(u uVar, f fVar, u uVar2) {
            this.f17428a = uVar;
            this.f17429b = fVar;
            this.f17430c = uVar2;
        }

        public void onFailure(Call call, Throwable th2) {
            cm.l.f(call, "call");
            cm.l.f(th2, "t");
            this.f17429b.q().k("Error");
        }

        public void onResponse(Call call, Response response) {
            String a10;
            cm.l.f(call, "call");
            cm.l.f(response, "response");
            try {
                SecurityModle securityModle = (SecurityModle) response.body();
                String str = null;
                if (Build.VERSION.SDK_INT >= 26) {
                    c.a aVar = id.c.f12675a;
                    String str2 = (String) this.f17428a.f20234e;
                    Base64.Decoder decoder = Base64.getDecoder();
                    if (securityModle != null) {
                        str = securityModle.getData();
                    }
                    byte[] decode = decoder.decode(str);
                    cm.l.e(decode, "decode(...)");
                    a10 = aVar.a(str2, new String(decode, km.d.f24740b));
                } else {
                    c.a aVar2 = id.c.f12675a;
                    String str3 = (String) this.f17428a.f20234e;
                    if (securityModle != null) {
                        str = securityModle.getData();
                    }
                    byte[] decode2 = android.util.Base64.decode(str, 0);
                    cm.l.e(decode2, "decode(...)");
                    a10 = aVar2.a(str3, new String(decode2, km.d.f24740b));
                }
                Object j10 = new i7.d().j(String.valueOf(a10), UserLoginModel.class);
                cm.l.e(j10, "fromJson(...)");
                UserLoginModel userLoginModel = (UserLoginModel) j10;
                this.f17429b.r().k(userLoginModel);
                String token = userLoginModel.getToken();
                if (token != null) {
                    ((g) this.f17430c.f20234e).x(token);
                }
            } catch (Exception e10) {
                Log.d("VirtualRcDetails-", e10.getLocalizedMessage());
                this.f17429b.q().k("error-->");
            }
        }
    }

    public static final class d implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f17431a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f f17432b;

        d(u uVar, f fVar) {
            this.f17431a = uVar;
            this.f17432b = fVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f17432b.k().k(th2 != null ? th2.toString() : null);
        }

        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            String a10;
            String str = null;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception e10) {
                    Log.d("VirtualRcDetails-", e10.getLocalizedMessage());
                    this.f17432b.k().k("error-->");
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                c.a aVar = id.c.f12675a;
                String str2 = (String) this.f17431a.f20234e;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str = securityModle.getData();
                }
                byte[] decode = decoder.decode(str);
                cm.l.e(decode, "decode(...)");
                a10 = aVar.a(str2, new String(decode, km.d.f24740b));
            } else {
                c.a aVar2 = id.c.f12675a;
                String str3 = (String) this.f17431a.f20234e;
                if (securityModle != null) {
                    str = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str, 0);
                cm.l.e(decode2, "decode(...)");
                a10 = aVar2.a(str3, new String(decode2, km.d.f24740b));
            }
            Object j10 = new i7.d().j(String.valueOf(a10), GetVirtualDocDetails.class);
            cm.l.e(j10, "fromJson(...)");
            this.f17432b.j().k((GetVirtualDocDetails) j10);
        }
    }

    public static final class e implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f17433a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f f17434b;

        e(u uVar, f fVar) {
            this.f17433a = uVar;
            this.f17434b = fVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f17434b.i().k(th2 != null ? th2.getMessage() : null);
        }

        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            String a10;
            String str = null;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception e10) {
                    this.f17434b.i().k("Error");
                    Log.d("OtpVerify_error+", e10.getLocalizedMessage());
                    e10.printStackTrace();
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                c.a aVar = id.c.f12675a;
                String str2 = (String) this.f17433a.f20234e;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str = securityModle.getData();
                }
                byte[] decode = decoder.decode(str);
                cm.l.e(decode, "decode(...)");
                a10 = aVar.a(str2, new String(decode, km.d.f24740b));
            } else {
                c.a aVar2 = id.c.f12675a;
                String str3 = (String) this.f17433a.f20234e;
                if (securityModle != null) {
                    str = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str, 0);
                cm.l.e(decode2, "decode(...)");
                a10 = aVar2.a(str3, new String(decode2, km.d.f24740b));
            }
            Object j10 = new i7.d().j(String.valueOf(a10), OtpVerifyResult.class);
            cm.l.e(j10, "fromJson(...)");
            this.f17434b.o().k((OtpVerifyResult) j10);
        }
    }

    public f(s8.b bVar) {
        cm.l.f(bVar, "repository");
        this.f17409d = bVar;
    }

    public final boolean g(Context context) {
        cm.l.f(context, "context");
        r rVar = new r();
        k1 unused = g.d(d1.f24949e, (tl.g) null, (f0) null, new a(rVar, this, context, (tl.d) null), 3, (Object) null);
        return rVar.f20231e;
    }

    public final Object h(Context context, tl.d dVar) {
        return kotlin.coroutines.jvm.internal.b.a(new DatabaseHelper(context).B0() > 0);
    }

    public final a0 i() {
        return this.f17411f;
    }

    public final a0 j() {
        return this.f17416k;
    }

    public final a0 k() {
        return this.f17417l;
    }

    public final a0 l() {
        return this.f17415j;
    }

    public final a0 m() {
        return this.f17414i;
    }

    public final void n(String str) {
        cm.l.f(str, "smsId");
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        um.x b10 = um.x.f32156g.b("application/json");
        String jSONObject = t8.c.f16582a.o(str).toString();
        cm.l.e(jSONObject, "toString(...)");
        this.f17409d.a(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new b(uVar, this));
    }

    public final a0 o() {
        return this.f17410e;
    }

    public final void p(Context context) {
        cm.l.f(context, "con");
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        u uVar2 = new u();
        uVar2.f20234e = new g(context);
        c0.a aVar = c0.Companion;
        um.x b10 = um.x.f32156g.b("application/json");
        c.a aVar2 = t8.c.f16582a;
        String k10 = ((g) uVar2.f20234e).k();
        String l10 = ((g) uVar2.f20234e).l();
        cm.l.c(string);
        String jSONObject = aVar2.B(k10, l10, string, ((g) uVar2.f20234e).m()).toString();
        cm.l.e(jSONObject, "toString(...)");
        this.f17409d.d(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new c(uVar, this, uVar2));
    }

    public final a0 q() {
        return this.f17419n;
    }

    public final a0 r() {
        return this.f17418m;
    }

    public final void s(String str, Context context) {
        cm.l.f(str, "citizenId");
        cm.l.f(context, "con");
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        g gVar = new g(context);
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        um.x b10 = um.x.f32156g.b("application/json");
        c.a aVar2 = t8.c.f16582a;
        cm.l.c(string);
        String jSONObject = aVar2.h(str, string, gVar.l(), gVar.e()).toString();
        cm.l.e(jSONObject, "toString(...)");
        this.f17409d.f(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new d(uVar, this));
    }

    public final void t(String str, String str2) {
        cm.l.f(str, "otp");
        cm.l.f(str2, "otpid");
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        um.x b10 = um.x.f32156g.b("application/json");
        String jSONObject = t8.c.f16582a.t(str, str2).toString();
        cm.l.e(jSONObject, "toString(...)");
        this.f17409d.g(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new e(uVar, this));
    }
}
