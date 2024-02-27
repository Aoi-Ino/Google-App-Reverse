package bi;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import androidx.lifecycle.a0;
import androidx.lifecycle.t0;
import cm.l;
import cm.u;
import com.nic.mparivahan.Account.Model.OtpVerifyResult;
import com.nic.mparivahan.Account.Model.ResendOtp;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog;
import id.c;
import j$.util.Base64;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import um.c0;
import um.x;
import v9.d;
import wg.e;

public final class j extends t0 {

    /* renamed from: d  reason: collision with root package name */
    private final e f19716d;

    /* renamed from: e  reason: collision with root package name */
    private final a0 f19717e = new a0();

    /* renamed from: f  reason: collision with root package name */
    private final a0 f19718f = new a0();

    /* renamed from: g  reason: collision with root package name */
    private final a0 f19719g = new a0();

    /* renamed from: h  reason: collision with root package name */
    private final a0 f19720h = new a0();

    /* renamed from: i  reason: collision with root package name */
    private final a0 f19721i = new a0();

    /* renamed from: j  reason: collision with root package name */
    private final a0 f19722j = new a0();

    /* renamed from: k  reason: collision with root package name */
    private final a0 f19723k = new a0();

    /* renamed from: l  reason: collision with root package name */
    private final a0 f19724l = new a0();

    public static final class a implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f19725a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ u f19726b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ j f19727c;

        a(Context context, u uVar, j jVar) {
            this.f19725a = context;
            this.f19726b = uVar;
            this.f19727c = jVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f19727c.h().k(th2 != null ? th2.getMessage() : null);
        }

        public void onResponse(Call call, Response response) {
            c.a aVar;
            String str;
            String str2;
            try {
                String str3 = null;
                ApiMonitorLog.f20957k.a(this.f19725a, d.f17494a.s(), "reSendSMSAlerts", String.valueOf(response != null ? Integer.valueOf(response.code()) : null), String.valueOf(response != null ? response.message() : null));
                SecurityModle securityModle = response != null ? (SecurityModle) response.body() : null;
                if (Build.VERSION.SDK_INT >= 26) {
                    aVar = c.f12675a;
                    str = (String) this.f19726b.f20234e;
                    Base64.Decoder decoder = Base64.getDecoder();
                    if (securityModle != null) {
                        str3 = securityModle.getData();
                    }
                    byte[] decode = decoder.decode(str3);
                    l.e(decode, "decode(...)");
                    str2 = new String(decode, km.d.f24740b);
                } else {
                    aVar = c.f12675a;
                    str = (String) this.f19726b.f20234e;
                    if (securityModle != null) {
                        str3 = securityModle.getData();
                    }
                    byte[] decode2 = android.util.Base64.decode(str3, 0);
                    l.e(decode2, "decode(...)");
                    str2 = new String(decode2, km.d.f24740b);
                }
                String valueOf = String.valueOf(aVar.a(str, str2));
                Log.e("CitizenDetail", valueOf);
                Object j10 = new i7.d().j(valueOf, ResendOtp.class);
                l.e(j10, "fromJson(...)");
                this.f19727c.i().k((ResendOtp) j10);
            } catch (Exception unused) {
                this.f19727c.h().k("ERROR");
            }
        }
    }

    public static final class b implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f19728a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ u f19729b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ j f19730c;

        b(Context context, u uVar, j jVar) {
            this.f19728a = context;
            this.f19729b = uVar;
            this.f19730c = jVar;
        }

        public void onFailure(Call call, Throwable th2) {
            ApiMonitorLog.a aVar = ApiMonitorLog.f20957k;
            Context context = this.f19728a;
            d.a aVar2 = d.f17494a;
            aVar.a(context, aVar2.s(), "verifySMSOtp", aVar2.v(), aVar2.w());
            this.f19730c.g().k(th2 != null ? th2.getMessage() : null);
        }

        public void onResponse(Call call, Response response) {
            c.a aVar;
            String str;
            String str2;
            try {
                String str3 = null;
                ApiMonitorLog.f20957k.a(this.f19728a, d.f17494a.s(), "verifySMSOtp", String.valueOf(response != null ? Integer.valueOf(response.code()) : null), String.valueOf(response != null ? response.message() : null));
                SecurityModle securityModle = response != null ? (SecurityModle) response.body() : null;
                if (Build.VERSION.SDK_INT >= 26) {
                    aVar = c.f12675a;
                    str = (String) this.f19729b.f20234e;
                    Base64.Decoder decoder = Base64.getDecoder();
                    if (securityModle != null) {
                        str3 = securityModle.getData();
                    }
                    byte[] decode = decoder.decode(str3);
                    l.e(decode, "decode(...)");
                    str2 = new String(decode, km.d.f24740b);
                } else {
                    aVar = c.f12675a;
                    str = (String) this.f19729b.f20234e;
                    if (securityModle != null) {
                        str3 = securityModle.getData();
                    }
                    byte[] decode2 = android.util.Base64.decode(str3, 0);
                    l.e(decode2, "decode(...)");
                    str2 = new String(decode2, km.d.f24740b);
                }
                String valueOf = String.valueOf(aVar.a(str, str2));
                Log.e("CitizenDetail", valueOf);
                Object j10 = new i7.d().j(valueOf, OtpVerifyResult.class);
                l.e(j10, "fromJson(...)");
                this.f19730c.k().k((OtpVerifyResult) j10);
            } catch (Exception unused) {
                this.f19730c.g().k("error");
            }
        }
    }

    public j(e eVar) {
        l.f(eVar, "repository");
        this.f19716d = eVar;
    }

    public final a0 g() {
        return this.f19718f;
    }

    public final a0 h() {
        return this.f19722j;
    }

    public final a0 i() {
        return this.f19721i;
    }

    public final void j(Context context, String str) {
        l.f(context, "context");
        l.f(str, "smsId");
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject = t8.c.f16582a.o(str).toString();
        l.e(jSONObject, "toString(...)");
        this.f19716d.b(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new a(context, uVar, this));
    }

    public final a0 k() {
        return this.f19717e;
    }

    public final void l(Context context, String str, String str2) {
        l.f(context, "context");
        l.f(str, "otp");
        l.f(str2, "otpid");
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject = t8.c.f16582a.t(str, str2).toString();
        l.e(jSONObject, "toString(...)");
        this.f19716d.d(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new b(context, uVar, this));
    }
}
