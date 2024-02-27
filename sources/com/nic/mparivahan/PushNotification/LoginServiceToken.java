package com.nic.mparivahan.PushNotification;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.util.Log;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.c;
import cm.g;
import cm.l;
import cm.u;
import com.nic.mparivahan.Account.Model.UserLoginModel;
import com.nic.mparivahan.Account.SignService;
import com.nic.mparivahan.DB.DatabaseHelper;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import id.c;
import j$.util.Base64;
import m1.d;
import m1.n;
import m1.p;
import m1.y;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import t8.c;
import um.c0;
import um.x;

public final class LoginServiceToken extends Worker {

    /* renamed from: k  reason: collision with root package name */
    public static final a f9432k = new a((g) null);

    /* renamed from: j  reason: collision with root package name */
    private Context f9433j;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final void a(Context context) {
            l.f(context, "context");
            d a10 = new d.a().b(n.CONNECTED).a();
            y.c(context).b((p) ((p.a) new p.a(LoginServiceToken.class).h(a10)).a());
        }
    }

    public static final class b implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f9434a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ LoginServiceToken f9435b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ u f9436c;

        b(u uVar, LoginServiceToken loginServiceToken, u uVar2) {
            this.f9434a = uVar;
            this.f9435b = loginServiceToken;
            this.f9436c = uVar2;
        }

        public void onFailure(Call call, Throwable th2) {
            ld.g gVar = new ld.g(this.f9435b.r());
            if (gVar.t()) {
                gVar.u();
                DatabaseHelper A0 = DatabaseHelper.A0(this.f9435b.r());
                l.e(A0, "getInstance(...)");
                A0.R();
                A0.close();
                new ld.a(this.f9435b.r()).e();
                NaxpToKenService.f9438k.a(this.f9435b.r());
            }
        }

        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            String a10;
            String str = null;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception e10) {
                    Log.d("loginToken-", e10.getLocalizedMessage());
                    e10.printStackTrace();
                    ld.g gVar = new ld.g(this.f9435b.r());
                    if (gVar.t()) {
                        gVar.u();
                        DatabaseHelper A0 = DatabaseHelper.A0(this.f9435b.r());
                        l.e(A0, "getInstance(...)");
                        A0.R();
                        A0.close();
                        new ld.a(this.f9435b.r()).e();
                        NaxpToKenService.f9438k.a(this.f9435b.r());
                        return;
                    }
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                c.a aVar = c.f12675a;
                String str2 = (String) this.f9434a.f20234e;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str = securityModle.getData();
                }
                byte[] decode = decoder.decode(str);
                l.e(decode, "decode(...)");
                a10 = aVar.a(str2, new String(decode, km.d.f24740b));
            } else {
                c.a aVar2 = c.f12675a;
                String str3 = (String) this.f9434a.f20234e;
                if (securityModle != null) {
                    str = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str, 0);
                l.e(decode2, "decode(...)");
                a10 = aVar2.a(str3, new String(decode2, km.d.f24740b));
            }
            Object j10 = new i7.d().j(String.valueOf(a10), UserLoginModel.class);
            l.e(j10, "fromJson(...)");
            String token = ((UserLoginModel) j10).getToken();
            if (token != null) {
                ((ld.g) this.f9436c.f20234e).x(token);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoginServiceToken(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        l.f(context, "context");
        l.f(workerParameters, "workerParams");
        this.f9433j = context;
    }

    public c.a p() {
        try {
            s();
        } catch (Exception unused) {
        }
        c.a c10 = c.a.c();
        l.e(c10, "success(...)");
        return c10;
    }

    public final Context r() {
        return this.f9433j;
    }

    public final void s() {
        String string = Settings.Secure.getString(this.f9433j.getContentResolver(), "android_id");
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        u uVar2 = new u();
        uVar2.f20234e = new ld.g(this.f9433j);
        SignService c10 = SignService.f7644a.c(this.f9433j);
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        c.a aVar2 = t8.c.f16582a;
        String k10 = ((ld.g) uVar2.f20234e).k();
        String l10 = ((ld.g) uVar2.f20234e).l();
        l.c(string);
        String jSONObject = aVar2.B(k10, l10, string, ((ld.g) uVar2.f20234e).m()).toString();
        l.e(jSONObject, "toString(...)");
        c0 f10 = aVar.f(b10, jSONObject);
        c10.getUserLogin(hc.a.f12073a.p() + "service/userLogin", f10, (String) uVar.f20234e).enqueue(new b(uVar, this, uVar2));
    }
}
