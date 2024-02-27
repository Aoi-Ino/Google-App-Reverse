package bi;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import androidx.lifecycle.a0;
import androidx.lifecycle.t0;
import cm.l;
import cm.u;
import com.nic.mparivahan.Account.Model.OtpVerifyResult;
import com.nic.mparivahan.Account.Model.ResendOtp;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.nic.mparivahan.VahanServices.ApplicationStatusModel.AppliByRcModle;
import com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog;
import com.nic.mparivahan.VahanServices.VahanModel.ApiMessage;
import com.nic.mparivahan.VahanServices.VahanModel.ApplicationStatusSuccessModel;
import com.nic.mparivahan.VahanServices.VahanModel.NocDownload;
import id.c;
import j$.util.Base64;
import java.io.File;
import org.json.JSONObject;
import pl.n;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import um.c0;
import um.x;
import v9.d;

public final class a extends t0 {

    /* renamed from: d  reason: collision with root package name */
    private final wg.a f19469d;

    /* renamed from: e  reason: collision with root package name */
    private final a0 f19470e = new a0();

    /* renamed from: f  reason: collision with root package name */
    private final a0 f19471f = new a0();

    /* renamed from: g  reason: collision with root package name */
    private a0 f19472g = new a0();

    /* renamed from: h  reason: collision with root package name */
    private a0 f19473h = new a0();

    /* renamed from: i  reason: collision with root package name */
    private a0 f19474i = new a0();

    /* renamed from: j  reason: collision with root package name */
    private a0 f19475j = new a0();

    /* renamed from: k  reason: collision with root package name */
    private a0 f19476k = new a0();

    /* renamed from: l  reason: collision with root package name */
    private a0 f19477l = new a0();

    /* renamed from: m  reason: collision with root package name */
    private a0 f19478m = new a0();

    /* renamed from: n  reason: collision with root package name */
    private a0 f19479n = new a0();

    /* renamed from: o  reason: collision with root package name */
    private a0 f19480o = new a0();

    /* renamed from: p  reason: collision with root package name */
    private a0 f19481p = new a0();

    /* renamed from: bi.a$a  reason: collision with other inner class name */
    public static final class C0260a implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f19482a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ u f19483b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f19484c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ a f19485d;

        C0260a(Context context, u uVar, String str, a aVar) {
            this.f19482a = context;
            this.f19483b = uVar;
            this.f19484c = str;
            this.f19485d = aVar;
        }

        public void onFailure(Call call, Throwable th2) {
            ApiMonitorLog.a aVar = ApiMonitorLog.f20957k;
            Context context = this.f19482a;
            d.a aVar2 = v9.d.f17494a;
            aVar.a(context, aVar2.z(), "getreprintreceiptdetails", aVar2.v(), aVar2.w());
            this.f19485d.j().k("Error");
        }

        public void onResponse(Call call, Response response) {
            c.a aVar;
            String str;
            String str2;
            try {
                String str3 = null;
                ApiMonitorLog.f20957k.a(this.f19482a, v9.d.f17494a.z(), "getreprintreceiptdetails", String.valueOf(response != null ? Integer.valueOf(response.code()) : null), String.valueOf(response != null ? response.message() : null));
                SecurityModle securityModle = response != null ? (SecurityModle) response.body() : null;
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 26) {
                    aVar = id.c.f12675a;
                    str = (String) this.f19483b.f20234e;
                    byte[] decode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
                    l.e(decode, "decode(...)");
                    str2 = new String(decode, km.d.f24740b);
                } else {
                    aVar = id.c.f12675a;
                    str = (String) this.f19483b.f20234e;
                    byte[] decode2 = android.util.Base64.decode(securityModle != null ? securityModle.getData() : null, 0);
                    l.e(decode2, "decode(...)");
                    str2 = new String(decode2, km.d.f24740b);
                }
                Object j10 = new i7.d().j(String.valueOf(aVar.a(str, str2)), NocDownload.class);
                l.e(j10, "fromJson(...)");
                NocDownload nocDownload = (NocDownload) j10;
                ApiMessage apiMessage = nocDownload.getApiMessage();
                if (apiMessage == null || apiMessage.getStatusCode() != 200 || ka.c.f13158a.m(nocDownload.getData())) {
                    a0 j11 = this.f19485d.j();
                    ApiMessage apiMessage2 = nocDownload.getApiMessage();
                    if (apiMessage2 != null) {
                        str3 = apiMessage2.getDeveloperMessage();
                    }
                    j11.k(String.valueOf(str3));
                    return;
                }
                byte[] decode3 = Base64.getDecoder().decode(nocDownload.getData());
                l.e(decode3, "decode(...)");
                if (i10 >= 26) {
                    String str4 = this.f19484c + '_' + System.currentTimeMillis();
                    if (this.f19485d.w(decode3, str4)) {
                        this.f19485d.i().k(str4.toString());
                        return;
                    }
                    return;
                }
                throw new n("An operation is not implemented: " + "VERSION.SDK_INT < O");
            } catch (Exception unused) {
                this.f19485d.i().k("Error");
            }
        }
    }

    public static final class b implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f19486a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ u f19487b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ a f19488c;

        b(Context context, u uVar, a aVar) {
            this.f19486a = context;
            this.f19487b = uVar;
            this.f19488c = aVar;
        }

        public void onFailure(Call call, Throwable th2) {
            l.f(call, "call");
            l.f(th2, "t");
            ApiMonitorLog.a aVar = ApiMonitorLog.f20957k;
            Context context = this.f19486a;
            d.a aVar2 = v9.d.f17494a;
            aVar.a(context, aVar2.z(), "fetchyourApplDetails", aVar2.v(), aVar2.w());
            this.f19488c.k().k("error");
        }

        public void onResponse(Call call, Response response) {
            String a10;
            l.f(call, "call");
            l.f(response, "response");
            try {
                ApiMonitorLog.f20957k.a(this.f19486a, v9.d.f17494a.z(), "fetchyourApplDetails", String.valueOf(Integer.valueOf(response.code())), String.valueOf(response.message()));
                SecurityModle securityModle = (SecurityModle) response.body();
                String str = null;
                if (Build.VERSION.SDK_INT >= 26) {
                    c.a aVar = id.c.f12675a;
                    String str2 = (String) this.f19487b.f20234e;
                    Base64.Decoder decoder = Base64.getDecoder();
                    if (securityModle != null) {
                        str = securityModle.getData();
                    }
                    byte[] decode = decoder.decode(str);
                    l.e(decode, "decode(...)");
                    a10 = aVar.a(str2, new String(decode, km.d.f24740b));
                } else {
                    c.a aVar2 = id.c.f12675a;
                    String str3 = (String) this.f19487b.f20234e;
                    if (securityModle != null) {
                        str = securityModle.getData();
                    }
                    byte[] decode2 = android.util.Base64.decode(str, 0);
                    l.e(decode2, "decode(...)");
                    a10 = aVar2.a(str3, new String(decode2, km.d.f24740b));
                }
                Object j10 = new i7.d().j(String.valueOf(a10), ApplicationStatusSuccessModel.class);
                l.e(j10, "fromJson(...)");
                this.f19488c.n().k((ApplicationStatusSuccessModel) j10);
            } catch (Exception e10) {
                e10.printStackTrace();
                this.f19488c.k().k("error");
            }
        }
    }

    public static final class c implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f19489a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ u f19490b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ a f19491c;

        c(Context context, u uVar, a aVar) {
            this.f19489a = context;
            this.f19490b = uVar;
            this.f19491c = aVar;
        }

        public void onFailure(Call call, Throwable th2) {
            l.f(call, "call");
            l.f(th2, "t");
            ApiMonitorLog.a aVar = ApiMonitorLog.f20957k;
            Context context = this.f19489a;
            d.a aVar2 = v9.d.f17494a;
            aVar.a(context, aVar2.z(), "fetchyourRegnDetails", aVar2.v(), aVar2.w());
            this.f19491c.l().k("error");
        }

        public void onResponse(Call call, Response response) {
            String a10;
            l.f(call, "call");
            l.f(response, "response");
            try {
                ApiMonitorLog.f20957k.a(this.f19489a, v9.d.f17494a.z(), "fetchyourRegnDetails", String.valueOf(Integer.valueOf(response.code())), String.valueOf(response.message()));
                SecurityModle securityModle = (SecurityModle) response.body();
                String str = null;
                if (Build.VERSION.SDK_INT >= 26) {
                    c.a aVar = id.c.f12675a;
                    String str2 = (String) this.f19490b.f20234e;
                    Base64.Decoder decoder = Base64.getDecoder();
                    if (securityModle != null) {
                        str = securityModle.getData();
                    }
                    byte[] decode = decoder.decode(str);
                    l.e(decode, "decode(...)");
                    a10 = aVar.a(str2, new String(decode, km.d.f24740b));
                } else {
                    c.a aVar2 = id.c.f12675a;
                    String str3 = (String) this.f19490b.f20234e;
                    if (securityModle != null) {
                        str = securityModle.getData();
                    }
                    byte[] decode2 = android.util.Base64.decode(str, 0);
                    l.e(decode2, "decode(...)");
                    a10 = aVar2.a(str3, new String(decode2, km.d.f24740b));
                }
                Object j10 = new i7.d().j(String.valueOf(a10), AppliByRcModle.class);
                l.e(j10, "fromJson(...)");
                this.f19491c.m().k((AppliByRcModle) j10);
            } catch (Exception e10) {
                e10.printStackTrace();
                this.f19491c.l().k("error");
            }
        }
    }

    public static final class d implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f19492a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ u f19493b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ a f19494c;

        d(Context context, u uVar, a aVar) {
            this.f19492a = context;
            this.f19493b = uVar;
            this.f19494c = aVar;
        }

        public void onFailure(Call call, Throwable th2) {
            ApiMonitorLog.a aVar = ApiMonitorLog.f20957k;
            Context context = this.f19492a;
            d.a aVar2 = v9.d.f17494a;
            aVar.a(context, aVar2.s(), "reSendSMSAlerts", aVar2.v(), aVar2.w());
            this.f19494c.q().k(th2 != null ? th2.getMessage() : null);
        }

        public void onResponse(Call call, Response response) {
            c.a aVar;
            String str;
            String str2;
            try {
                String str3 = null;
                ApiMonitorLog.f20957k.a(this.f19492a, v9.d.f17494a.s(), "reSendSMSAlerts", String.valueOf(response != null ? Integer.valueOf(response.code()) : null), String.valueOf(response != null ? response.message() : null));
                SecurityModle securityModle = response != null ? (SecurityModle) response.body() : null;
                if (Build.VERSION.SDK_INT >= 26) {
                    aVar = id.c.f12675a;
                    str = (String) this.f19493b.f20234e;
                    Base64.Decoder decoder = Base64.getDecoder();
                    if (securityModle != null) {
                        str3 = securityModle.getData();
                    }
                    byte[] decode = decoder.decode(str3);
                    l.e(decode, "decode(...)");
                    str2 = new String(decode, km.d.f24740b);
                } else {
                    aVar = id.c.f12675a;
                    str = (String) this.f19493b.f20234e;
                    if (securityModle != null) {
                        str3 = securityModle.getData();
                    }
                    byte[] decode2 = android.util.Base64.decode(str3, 0);
                    l.e(decode2, "decode(...)");
                    str2 = new String(decode2, km.d.f24740b);
                }
                Object j10 = new i7.d().j(String.valueOf(aVar.a(str, str2)), ResendOtp.class);
                l.e(j10, "fromJson(...)");
                this.f19494c.r().k((ResendOtp) j10);
            } catch (Exception unused) {
                this.f19494c.q().k("ERROR");
            }
        }
    }

    public static final class e implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f19495a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ u f19496b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ a f19497c;

        e(Context context, u uVar, a aVar) {
            this.f19495a = context;
            this.f19496b = uVar;
            this.f19497c = aVar;
        }

        public void onFailure(Call call, Throwable th2) {
            ApiMonitorLog.a aVar = ApiMonitorLog.f20957k;
            Context context = this.f19495a;
            d.a aVar2 = v9.d.f17494a;
            aVar.a(context, aVar2.s(), "verifySMSOtp", aVar2.v(), aVar2.w());
            this.f19497c.t().k(th2 != null ? th2.getMessage() : null);
        }

        public void onResponse(Call call, Response response) {
            c.a aVar;
            String str;
            String str2;
            try {
                String str3 = null;
                ApiMonitorLog.f20957k.a(this.f19495a, v9.d.f17494a.s(), "verifySMSOtp", String.valueOf(response != null ? Integer.valueOf(response.code()) : null), String.valueOf(response != null ? response.message() : null));
                SecurityModle securityModle = response != null ? (SecurityModle) response.body() : null;
                if (Build.VERSION.SDK_INT >= 26) {
                    aVar = id.c.f12675a;
                    str = (String) this.f19496b.f20234e;
                    Base64.Decoder decoder = Base64.getDecoder();
                    if (securityModle != null) {
                        str3 = securityModle.getData();
                    }
                    byte[] decode = decoder.decode(str3);
                    l.e(decode, "decode(...)");
                    str2 = new String(decode, km.d.f24740b);
                } else {
                    aVar = id.c.f12675a;
                    str = (String) this.f19496b.f20234e;
                    if (securityModle != null) {
                        str3 = securityModle.getData();
                    }
                    byte[] decode2 = android.util.Base64.decode(str3, 0);
                    l.e(decode2, "decode(...)");
                    str2 = new String(decode2, km.d.f24740b);
                }
                Object j10 = new i7.d().j(String.valueOf(aVar.a(str, str2)), OtpVerifyResult.class);
                l.e(j10, "fromJson(...)");
                this.f19497c.u().k((OtpVerifyResult) j10);
            } catch (Exception unused) {
                this.f19497c.t().k("error");
            }
        }
    }

    public a(wg.a aVar) {
        l.f(aVar, "repository");
        this.f19469d = aVar;
    }

    /* access modifiers changed from: private */
    public final boolean w(byte[] bArr, String str) {
        try {
            File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).toString() + '/' + (str + ".pdf"));
            if (file.exists()) {
                file.delete();
            }
            x(bArr, file);
            return true;
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x001b A[SYNTHETIC, Splitter:B:12:0x001b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void x(byte[] r3, java.io.File r4) {
        /*
            r2 = this;
            r0 = 0
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ all -> 0x0018 }
            r1.<init>(r4)     // Catch:{ all -> 0x0018 }
            java.io.BufferedOutputStream r4 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x0018 }
            r4.<init>(r1)     // Catch:{ all -> 0x0018 }
            r4.write(r3)     // Catch:{ all -> 0x0015 }
            r4.flush()     // Catch:{ Exception -> 0x0014 }
            r4.close()     // Catch:{ Exception -> 0x0014 }
        L_0x0014:
            return
        L_0x0015:
            r3 = move-exception
            r0 = r4
            goto L_0x0019
        L_0x0018:
            r3 = move-exception
        L_0x0019:
            if (r0 == 0) goto L_0x0021
            r0.flush()     // Catch:{ Exception -> 0x0021 }
            r0.close()     // Catch:{ Exception -> 0x0021 }
        L_0x0021:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: bi.a.x(byte[], java.io.File):void");
    }

    public final void h(Context context, String str) {
        l.f(context, "context");
        l.f(str, "application_no");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("applNo", (Object) str);
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject2 = jSONObject.toString();
        l.e(jSONObject2, "toString(...)");
        this.f19469d.a(aVar.f(b10, jSONObject2), (String) uVar.f20234e).enqueue(new C0260a(context, uVar, str, this));
    }

    public final a0 i() {
        return this.f19480o;
    }

    public final a0 j() {
        return this.f19481p;
    }

    public final a0 k() {
        return this.f19477l;
    }

    public final a0 l() {
        return this.f19479n;
    }

    public final a0 m() {
        return this.f19478m;
    }

    public final a0 n() {
        return this.f19476k;
    }

    public final void o(Context context, String str, String str2) {
        l.f(context, "context");
        l.f(str, "applNo");
        l.f(str2, "appStateCd");
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("applNumber", (Object) str);
            jSONObject.put("stateCode", (Object) str2);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject2 = jSONObject.toString();
        l.e(jSONObject2, "toString(...)");
        this.f19469d.b(aVar.f(b10, jSONObject2), (String) uVar.f20234e).enqueue(new b(context, uVar, this));
    }

    public final void p(Context context, String str, String str2) {
        l.f(context, "context");
        l.f(str, "rcNo");
        l.f(str2, "chassisNo");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("regNo", (Object) str);
            jSONObject.put("chasiNo", (Object) str2);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject2 = jSONObject.toString();
        l.e(jSONObject2, "toString(...)");
        this.f19469d.c(aVar.f(b10, jSONObject2), (String) uVar.f20234e).enqueue(new c(context, uVar, this));
    }

    public final a0 q() {
        return this.f19473h;
    }

    public final a0 r() {
        return this.f19472g;
    }

    public final void s(Context context, String str) {
        l.f(context, "context");
        l.f(str, "smsId");
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject = t8.c.f16582a.o(str).toString();
        l.e(jSONObject, "toString(...)");
        this.f19469d.d(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new d(context, uVar, this));
    }

    public final a0 t() {
        return this.f19475j;
    }

    public final a0 u() {
        return this.f19474i;
    }

    public final void v(Context context, String str, String str2) {
        l.f(context, "context");
        l.f(str, "otp");
        l.f(str2, "otpid");
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject = t8.c.f16582a.t(str, str2).toString();
        l.e(jSONObject, "toString(...)");
        this.f19469d.e(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new e(context, uVar, this));
    }
}
