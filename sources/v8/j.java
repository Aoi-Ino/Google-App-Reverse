package v8;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.util.Log;
import androidx.lifecycle.a0;
import androidx.lifecycle.t0;
import cm.l;
import cm.u;
import com.nic.mparivahan.Account.Model.ResendOtp;
import com.nic.mparivahan.Account.Model.otpRegistartionResult;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import id.c;
import j$.util.Base64;
import km.d;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import t8.c;
import um.c0;
import um.x;

public final class j extends t0 {

    /* renamed from: d  reason: collision with root package name */
    private final s8.a f17476d;

    /* renamed from: e  reason: collision with root package name */
    private final a0 f17477e = new a0();

    /* renamed from: f  reason: collision with root package name */
    private final a0 f17478f = new a0();

    /* renamed from: g  reason: collision with root package name */
    private final a0 f17479g = new a0();

    /* renamed from: h  reason: collision with root package name */
    private final a0 f17480h = new a0();

    /* renamed from: i  reason: collision with root package name */
    private final a0 f17481i = new a0();

    /* renamed from: j  reason: collision with root package name */
    private final a0 f17482j = new a0();

    /* renamed from: k  reason: collision with root package name */
    private final a0 f17483k = new a0();

    /* renamed from: l  reason: collision with root package name */
    private final a0 f17484l = new a0();

    public static final class a implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f17485a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ j f17486b;

        a(u uVar, j jVar) {
            this.f17485a = uVar;
            this.f17486b = jVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f17486b.i().k(th2 != null ? th2.getMessage() : null);
        }

        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            String a10;
            String str = null;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception e10) {
                    this.f17486b.i().k("Error");
                    Log.d("OtpResend_error", e10.getLocalizedMessage());
                    e10.printStackTrace();
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                c.a aVar = c.f12675a;
                String str2 = (String) this.f17485a.f20234e;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str = securityModle.getData();
                }
                byte[] decode = decoder.decode(str);
                l.e(decode, "decode(...)");
                a10 = aVar.a(str2, new String(decode, d.f24740b));
            } else {
                c.a aVar2 = c.f12675a;
                String str3 = (String) this.f17485a.f20234e;
                if (securityModle != null) {
                    str = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str, 0);
                l.e(decode2, "decode(...)");
                a10 = aVar2.a(str3, new String(decode2, d.f24740b));
            }
            Object j10 = new i7.d().j(String.valueOf(a10), ResendOtp.class);
            l.e(j10, "fromJson(...)");
            this.f17486b.j().k((ResendOtp) j10);
        }
    }

    public static final class b implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f17487a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ j f17488b;

        b(u uVar, j jVar) {
            this.f17487a = uVar;
            this.f17488b = jVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f17488b.g().k(th2 != null ? th2.getMessage() : null);
        }

        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            String a10;
            String str = null;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception e10) {
                    this.f17488b.g().k("error");
                    Log.d("OtpVerify_error+", e10.getLocalizedMessage());
                    e10.printStackTrace();
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                c.a aVar = c.f12675a;
                String str2 = (String) this.f17487a.f20234e;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str = securityModle.getData();
                }
                byte[] decode = decoder.decode(str);
                l.e(decode, "decode(...)");
                a10 = aVar.a(str2, new String(decode, d.f24740b));
            } else {
                c.a aVar2 = c.f12675a;
                String str3 = (String) this.f17487a.f20234e;
                if (securityModle != null) {
                    str = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str, 0);
                l.e(decode2, "decode(...)");
                a10 = aVar2.a(str3, new String(decode2, d.f24740b));
            }
            Object j10 = new i7.d().j(String.valueOf(a10), otpRegistartionResult.class);
            l.e(j10, "fromJson(...)");
            this.f17488b.l().k((otpRegistartionResult) j10);
        }
    }

    public j(s8.a aVar) {
        l.f(aVar, "repository");
        this.f17476d = aVar;
    }

    public final a0 g() {
        return this.f17478f;
    }

    public final a0 h() {
        return this.f17484l;
    }

    public final a0 i() {
        return this.f17482j;
    }

    public final a0 j() {
        return this.f17481i;
    }

    public final void k(String str) {
        l.f(str, "smsId");
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject = t8.c.f16582a.o(str).toString();
        l.e(jSONObject, "toString(...)");
        this.f17476d.a(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new a(uVar, this));
    }

    public final a0 l() {
        return this.f17477e;
    }

    public final a0 m() {
        return this.f17480h;
    }

    public final a0 n() {
        return this.f17479g;
    }

    public final void o(String str, String str2, String str3, String str4, String str5, String str6, String str7, Context context) {
        Context context2 = context;
        String str8 = str;
        l.f(str8, "otp");
        String str9 = str2;
        l.f(str9, "otpid");
        String str10 = str3;
        l.f(str10, "mobile_number");
        String str11 = str4;
        l.f(str11, "ctzDispName");
        String str12 = str5;
        l.f(str12, "ctzEmail");
        String str13 = str6;
        l.f(str13, "mpin");
        String str14 = str7;
        l.f(str14, "state");
        l.f(context2, "context");
        ld.b bVar = new ld.b(context2);
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        c.a aVar2 = t8.c.f16582a;
        l.c(string);
        String jSONObject = aVar2.v(str8, str9, str10, str11, str12, str13, str14, string, bVar.a()).toString();
        l.e(jSONObject, "toString(...)");
        this.f17476d.e(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new b(uVar, this));
    }
}
