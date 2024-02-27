package v8;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.util.Log;
import androidx.lifecycle.a0;
import androidx.lifecycle.t0;
import cm.l;
import cm.u;
import com.nic.mparivahan.Account.Model.OtpVerifyResult;
import com.nic.mparivahan.Account.Model.ResendOtp;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import id.c;
import j$.util.Base64;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import t8.c;
import um.c0;
import um.x;

public final class d extends t0 {

    /* renamed from: d  reason: collision with root package name */
    private final s8.b f17399d;

    /* renamed from: e  reason: collision with root package name */
    private final a0 f17400e = new a0();

    /* renamed from: f  reason: collision with root package name */
    private final a0 f17401f = new a0();

    /* renamed from: g  reason: collision with root package name */
    private final a0 f17402g = new a0();

    /* renamed from: h  reason: collision with root package name */
    private final a0 f17403h = new a0();

    public static final class a implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f17404a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f17405b;

        a(u uVar, d dVar) {
            this.f17404a = uVar;
            this.f17405b = dVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f17405b.h().k(th2 != null ? th2.getMessage() : null);
        }

        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            String a10;
            String str = null;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception e10) {
                    this.f17405b.h().k("Error");
                    Log.d("OtpResend_error", e10.getLocalizedMessage());
                    e10.printStackTrace();
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                c.a aVar = c.f12675a;
                String str2 = (String) this.f17404a.f20234e;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str = securityModle.getData();
                }
                byte[] decode = decoder.decode(str);
                l.e(decode, "decode(...)");
                a10 = aVar.a(str2, new String(decode, km.d.f24740b));
            } else {
                c.a aVar2 = c.f12675a;
                String str3 = (String) this.f17404a.f20234e;
                if (securityModle != null) {
                    str = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str, 0);
                l.e(decode2, "decode(...)");
                a10 = aVar2.a(str3, new String(decode2, km.d.f24740b));
            }
            Object j10 = new i7.d().j(String.valueOf(a10), ResendOtp.class);
            l.e(j10, "fromJson(...)");
            this.f17405b.i().k((ResendOtp) j10);
        }
    }

    public static final class b implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f17406a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f17407b;

        b(u uVar, d dVar) {
            this.f17406a = uVar;
            this.f17407b = dVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f17407b.g().k(th2 != null ? th2.getMessage() : null);
        }

        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            String a10;
            String str = null;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception e10) {
                    this.f17407b.g().k("Error");
                    Log.d("OtpVerify_error+", e10.getLocalizedMessage());
                    e10.printStackTrace();
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                c.a aVar = c.f12675a;
                String str2 = (String) this.f17406a.f20234e;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str = securityModle.getData();
                }
                byte[] decode = decoder.decode(str);
                l.e(decode, "decode(...)");
                a10 = aVar.a(str2, new String(decode, km.d.f24740b));
            } else {
                c.a aVar2 = c.f12675a;
                String str3 = (String) this.f17406a.f20234e;
                if (securityModle != null) {
                    str = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str, 0);
                l.e(decode2, "decode(...)");
                a10 = aVar2.a(str3, new String(decode2, km.d.f24740b));
            }
            Object j10 = new i7.d().j(String.valueOf(a10), OtpVerifyResult.class);
            l.e(j10, "fromJson(...)");
            this.f17407b.k().k((OtpVerifyResult) j10);
        }
    }

    public d(s8.b bVar) {
        l.f(bVar, "repository");
        this.f17399d = bVar;
    }

    public final a0 g() {
        return this.f17401f;
    }

    public final a0 h() {
        return this.f17403h;
    }

    public final a0 i() {
        return this.f17402g;
    }

    public final void j(String str) {
        l.f(str, "smsId");
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject = t8.c.f16582a.o(str).toString();
        l.e(jSONObject, "toString(...)");
        this.f17399d.a(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new a(uVar, this));
    }

    public final a0 k() {
        return this.f17400e;
    }

    public final void l(String str, String str2, String str3, Context context) {
        l.f(str, "otp");
        l.f(str2, "otpid");
        l.f(str3, "mobile_number");
        l.f(context, "context");
        ld.b bVar = new ld.b(context);
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        c.a aVar2 = t8.c.f16582a;
        String a10 = bVar.a();
        l.c(string);
        String jSONObject = aVar2.s(str, str2, str3, a10, string).toString();
        l.e(jSONObject, "toString(...)");
        this.f17399d.g(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new b(uVar, this));
    }
}
