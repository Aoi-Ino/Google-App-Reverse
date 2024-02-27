package rj;

import android.os.Build;
import android.util.Log;
import androidx.lifecycle.a0;
import androidx.lifecycle.t0;
import cm.l;
import com.nic.mparivahan.Account.Model.OtpVerifyResult;
import com.nic.mparivahan.Account.Model.ResendOtp;
import com.nic.mparivahan.Account.Model.SendOtpResult;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.nic.mparivahan.ServiceWithdrawnScreen.Modal.AppliedServiceListModal;
import com.nic.mparivahan.ServiceWithdrawnScreen.Modal.CheckApplicationEligibilityModal;
import com.nic.mparivahan.ServiceWithdrawnScreen.Modal.ReasonModal;
import com.nic.mparivahan.ServiceWithdrawnScreen.Modal.ValidateWithDrawanServiceModal;
import i7.j;
import id.c;
import j$.util.Base64;
import org.json.JSONObject;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import um.c0;
import um.x;

public final class d extends t0 {

    /* renamed from: d  reason: collision with root package name */
    private final c f31085d;

    /* renamed from: e  reason: collision with root package name */
    private final a0 f31086e = new a0();

    /* renamed from: f  reason: collision with root package name */
    private final a0 f31087f = new a0();

    /* renamed from: g  reason: collision with root package name */
    private final a0 f31088g = new a0();

    /* renamed from: h  reason: collision with root package name */
    private final a0 f31089h = new a0();

    /* renamed from: i  reason: collision with root package name */
    private final a0 f31090i = new a0();

    /* renamed from: j  reason: collision with root package name */
    private final a0 f31091j = new a0();

    /* renamed from: k  reason: collision with root package name */
    private final a0 f31092k = new a0();

    /* renamed from: l  reason: collision with root package name */
    private final a0 f31093l = new a0();

    /* renamed from: m  reason: collision with root package name */
    private final a0 f31094m = new a0();

    /* renamed from: n  reason: collision with root package name */
    private final a0 f31095n = new a0();

    public static final class a implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f31096a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f31097b;

        a(String str, d dVar) {
            this.f31096a = str;
            this.f31097b = dVar;
        }

        public void onFailure(Call call, Throwable th2) {
            l.f(call, "call");
            l.f(th2, "t");
            this.f31097b.m().k("error");
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
                    str = this.f31096a;
                    Base64.Decoder decoder = Base64.getDecoder();
                    if (securityModle != null) {
                        str3 = securityModle.getData();
                    }
                    byte[] decode = decoder.decode(str3);
                    l.e(decode, "decode(...)");
                    str2 = new String(decode, km.d.f24740b);
                } else {
                    aVar = id.c.f12675a;
                    str = this.f31096a;
                    if (securityModle != null) {
                        str3 = securityModle.getData();
                    }
                    byte[] decode2 = android.util.Base64.decode(str3, 0);
                    l.e(decode2, "decode(...)");
                    str2 = new String(decode2, km.d.f24740b);
                }
                String valueOf = String.valueOf(aVar.a(str, str2));
                Log.d("Response", valueOf);
                Object j10 = new i7.d().j(valueOf, CheckApplicationEligibilityModal.class);
                l.e(j10, "fromJson(...)");
                this.f31097b.k().k((CheckApplicationEligibilityModal) j10);
            } catch (Exception unused) {
                this.f31097b.m().k("error");
            }
        }
    }

    public static final class b implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f31098a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f31099b;

        b(String str, d dVar) {
            this.f31098a = str;
            this.f31099b = dVar;
        }

        public void onFailure(Call call, Throwable th2) {
            l.f(call, "call");
            l.f(th2, "t");
            this.f31099b.m().k("error");
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
                    str = this.f31098a;
                    Base64.Decoder decoder = Base64.getDecoder();
                    if (securityModle != null) {
                        str3 = securityModle.getData();
                    }
                    byte[] decode = decoder.decode(str3);
                    l.e(decode, "decode(...)");
                    str2 = new String(decode, km.d.f24740b);
                } else {
                    aVar = id.c.f12675a;
                    str = this.f31098a;
                    if (securityModle != null) {
                        str3 = securityModle.getData();
                    }
                    byte[] decode2 = android.util.Base64.decode(str3, 0);
                    l.e(decode2, "decode(...)");
                    str2 = new String(decode2, km.d.f24740b);
                }
                String valueOf = String.valueOf(aVar.a(str, str2));
                Log.d("Response", valueOf);
                Object j10 = new i7.d().j(valueOf, AppliedServiceListModal.class);
                l.e(j10, "fromJson(...)");
                this.f31099b.i().k((AppliedServiceListModal) j10);
            } catch (Exception unused) {
                this.f31099b.m().k("error");
            }
        }
    }

    public static final class c implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f31100a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f31101b;

        c(String str, d dVar) {
            this.f31100a = str;
            this.f31101b = dVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f31101b.o().k(th2 != null ? th2.getMessage() : null);
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
                    this.f31101b.m().k("error");
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                aVar = id.c.f12675a;
                str = this.f31100a;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode = decoder.decode(str3);
                l.e(decode, "decode(...)");
                str2 = new String(decode, km.d.f24740b);
            } else {
                aVar = id.c.f12675a;
                str = this.f31100a;
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str3, 0);
                l.e(decode2, "decode(...)");
                str2 = new String(decode2, km.d.f24740b);
            }
            Object j10 = new i7.d().j(String.valueOf(aVar.a(str, str2)), ResendOtp.class);
            l.e(j10, "fromJson(...)");
            this.f31101b.p().k((ResendOtp) j10);
        }
    }

    /* renamed from: rj.d$d  reason: collision with other inner class name */
    public static final class C0344d implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f31102a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f31103b;

        C0344d(String str, d dVar) {
            this.f31102a = str;
            this.f31103b = dVar;
        }

        public void onFailure(Call call, Throwable th2) {
            l.f(call, "call");
            l.f(th2, "t");
            this.f31103b.m().k("error");
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
                    str = this.f31102a;
                    Base64.Decoder decoder = Base64.getDecoder();
                    if (securityModle != null) {
                        str3 = securityModle.getData();
                    }
                    byte[] decode = decoder.decode(str3);
                    l.e(decode, "decode(...)");
                    str2 = new String(decode, km.d.f24740b);
                } else {
                    aVar = id.c.f12675a;
                    str = this.f31102a;
                    if (securityModle != null) {
                        str3 = securityModle.getData();
                    }
                    byte[] decode2 = android.util.Base64.decode(str3, 0);
                    l.e(decode2, "decode(...)");
                    str2 = new String(decode2, km.d.f24740b);
                }
                String valueOf = String.valueOf(aVar.a(str, str2));
                Log.d("Response", valueOf);
                Object j10 = new i7.d().j(valueOf, ReasonModal.class);
                l.e(j10, "fromJson(...)");
                this.f31103b.s().k((ReasonModal) j10);
            } catch (Exception unused) {
                this.f31103b.m().k("error");
            }
        }
    }

    public static final class e implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f31104a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f31105b;

        e(String str, d dVar) {
            this.f31104a = str;
            this.f31105b = dVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f31105b.m().k(th2 != null ? th2.getMessage() : null);
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
                    this.f31105b.m().k("error");
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                aVar = id.c.f12675a;
                str = this.f31104a;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode = decoder.decode(str3);
                l.e(decode, "decode(...)");
                str2 = new String(decode, km.d.f24740b);
            } else {
                aVar = id.c.f12675a;
                str = this.f31104a;
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str3, 0);
                l.e(decode2, "decode(...)");
                str2 = new String(decode2, km.d.f24740b);
            }
            Object j10 = new i7.d().j(String.valueOf(aVar.a(str, str2)), SendOtpResult.class);
            l.e(j10, "fromJson(...)");
            this.f31105b.n().k((SendOtpResult) j10);
        }
    }

    public static final class f implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f31106a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f31107b;

        f(String str, d dVar) {
            this.f31106a = str;
            this.f31107b = dVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f31107b.m().k(th2 != null ? th2.getMessage() : null);
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
                } catch (Error unused) {
                    this.f31107b.m().k("Error");
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                aVar = id.c.f12675a;
                str = this.f31106a;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode = decoder.decode(str3);
                l.e(decode, "decode(...)");
                str2 = new String(decode, km.d.f24740b);
            } else {
                aVar = id.c.f12675a;
                str = this.f31106a;
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str3, 0);
                l.e(decode2, "decode(...)");
                str2 = new String(decode2, km.d.f24740b);
            }
            Object j10 = new i7.d().j(String.valueOf(aVar.a(str, str2)), OtpVerifyResult.class);
            l.e(j10, "fromJson(...)");
            this.f31107b.r().k((OtpVerifyResult) j10);
        }
    }

    public static final class g implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f31108a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f31109b;

        g(String str, d dVar) {
            this.f31108a = str;
            this.f31109b = dVar;
        }

        public void onFailure(Call call, Throwable th2) {
            l.f(call, "call");
            l.f(th2, "t");
            this.f31109b.m().k("error");
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
                    str = this.f31108a;
                    Base64.Decoder decoder = Base64.getDecoder();
                    if (securityModle != null) {
                        str3 = securityModle.getData();
                    }
                    byte[] decode = decoder.decode(str3);
                    l.e(decode, "decode(...)");
                    str2 = new String(decode, km.d.f24740b);
                } else {
                    aVar = id.c.f12675a;
                    str = this.f31108a;
                    if (securityModle != null) {
                        str3 = securityModle.getData();
                    }
                    byte[] decode2 = android.util.Base64.decode(str3, 0);
                    l.e(decode2, "decode(...)");
                    str2 = new String(decode2, km.d.f24740b);
                }
                String valueOf = String.valueOf(aVar.a(str, str2));
                Log.d("Response", valueOf);
                Object j10 = new i7.d().j(valueOf, ValidateWithDrawanServiceModal.class);
                l.e(j10, "fromJson(...)");
                this.f31109b.v().k((ValidateWithDrawanServiceModal) j10);
            } catch (Exception unused) {
                this.f31109b.m().k("error");
            }
        }
    }

    public static final class h implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f31110a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f31111b;

        h(String str, d dVar) {
            this.f31110a = str;
            this.f31111b = dVar;
        }

        public void onFailure(Call call, Throwable th2) {
            l.f(call, "call");
            l.f(th2, "t");
            this.f31111b.m().k("error");
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
                    str = this.f31110a;
                    Base64.Decoder decoder = Base64.getDecoder();
                    if (securityModle != null) {
                        str3 = securityModle.getData();
                    }
                    byte[] decode = decoder.decode(str3);
                    l.e(decode, "decode(...)");
                    str2 = new String(decode, km.d.f24740b);
                } else {
                    aVar = id.c.f12675a;
                    str = this.f31110a;
                    if (securityModle != null) {
                        str3 = securityModle.getData();
                    }
                    byte[] decode2 = android.util.Base64.decode(str3, 0);
                    l.e(decode2, "decode(...)");
                    str2 = new String(decode2, km.d.f24740b);
                }
                String valueOf = String.valueOf(aVar.a(str, str2));
                Log.d("Response", valueOf);
                Object j10 = new i7.d().j(valueOf, ValidateWithDrawanServiceModal.class);
                l.e(j10, "fromJson(...)");
                this.f31111b.w().k((ValidateWithDrawanServiceModal) j10);
            } catch (Exception unused) {
                this.f31111b.m().k("error");
            }
        }
    }

    public d(c cVar) {
        l.f(cVar, "repository");
        this.f31085d = cVar;
    }

    public final void g(String str, String str2) {
        l.f(str, "applNo");
        l.f(str2, "dob");
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject = l(str, str2).toString();
        l.e(jSONObject, "toString(...)");
        c0 f10 = aVar.f(b10, jSONObject);
        String valueOf = String.valueOf(System.currentTimeMillis());
        this.f31085d.a(f10, valueOf).enqueue(new a(valueOf, this));
    }

    public final void h(String str) {
        l.f(str, "applNo");
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject = j(str).toString();
        l.e(jSONObject, "toString(...)");
        c0 f10 = aVar.f(b10, jSONObject);
        String valueOf = String.valueOf(System.currentTimeMillis());
        this.f31085d.d(f10, valueOf).enqueue(new b(valueOf, this));
    }

    public final a0 i() {
        return this.f31091j;
    }

    public final JSONObject j(String str) {
        l.f(str, "applNo");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("applicationNumber", (Object) str);
            jSONObject.put("agentId", (Object) "mparivahanDL");
            jSONObject.put("agentIpAddress", (Object) "10.26.61.108");
            jSONObject.put("agentServiceName", (Object) "sarathiservice");
            jSONObject.put("agentPwd", (Object) "1A010F7286F6562342A022AD23B21EE9");
            return jSONObject;
        } catch (Exception e10) {
            e10.printStackTrace();
            return new JSONObject();
        }
    }

    public final a0 k() {
        return this.f31086e;
    }

    public final JSONObject l(String str, String str2) {
        l.f(str, "applNo");
        l.f(str2, "dob");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("applicationNumber", (Object) str);
            jSONObject.put("dateOfBirth", (Object) str2);
            jSONObject.put("agentId", (Object) "mparivahanDL");
            jSONObject.put("agentIpAddress", (Object) "10.26.61.108");
            jSONObject.put("agentServiceName", (Object) "sarathiservice");
            jSONObject.put("agentPwd", (Object) "1A010F7286F6562342A022AD23B21EE9");
            return jSONObject;
        } catch (Exception e10) {
            e10.printStackTrace();
            return new JSONObject();
        }
    }

    public final a0 m() {
        return this.f31095n;
    }

    public final a0 n() {
        return this.f31087f;
    }

    public final a0 o() {
        return this.f31089h;
    }

    public final a0 p() {
        return this.f31088g;
    }

    public final void q(String str) {
        l.f(str, "smsId");
        String valueOf = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject = com.nic.mparivahan.dlservices.utilities.c.f22374a.h(str).toString();
        l.e(jSONObject, "toString(...)");
        this.f31085d.f(aVar.f(b10, jSONObject), valueOf).enqueue(new c(valueOf, this));
    }

    public final a0 r() {
        return this.f31090i;
    }

    public final a0 s() {
        return this.f31094m;
    }

    public final void t() {
        String valueOf = String.valueOf(System.currentTimeMillis());
        this.f31085d.e(new j(), valueOf).enqueue(new C0344d(valueOf, this));
    }

    public final void u(String str, String str2) {
        l.f(str, "mobile_no");
        l.f(str2, "smsId");
        String valueOf = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject = com.nic.mparivahan.dlservices.utilities.c.f22374a.j(str, str2).toString();
        l.e(jSONObject, "toString(...)");
        this.f31085d.g(aVar.f(b10, jSONObject), valueOf).enqueue(new e(valueOf, this));
    }

    public final a0 v() {
        return this.f31093l;
    }

    public final a0 w() {
        return this.f31092k;
    }

    public final void x(String str, String str2) {
        l.f(str, "otp");
        l.f(str2, "otpid");
        String valueOf = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject = com.nic.mparivahan.dlservices.utilities.c.f22374a.i(str, str2).toString();
        l.e(jSONObject, "toString(...)");
        this.f31085d.h(aVar.f(b10, jSONObject), valueOf).enqueue(new f(valueOf, this));
    }

    public final void y(String str, String str2, i7.g gVar) {
        l.f(str, "validateService");
        l.f(str2, "applNo");
        l.f(gVar, "selectedList");
        j jVar = new j();
        jVar.E("applicationNumber", str2);
        jVar.E("agentId", "mparivahanDL");
        jVar.E("agentIpAddress", "10.26.61.108");
        jVar.E("agentServiceName", "sarathiservice");
        jVar.E("agentPwd", "1A010F7286F6562342A022AD23B21EE9");
        jVar.B("selectedListOfServices", gVar);
        jVar.E("validateService", str);
        String valueOf = String.valueOf(System.currentTimeMillis());
        this.f31085d.c(jVar, valueOf).enqueue(new g(valueOf, this));
    }

    public final void z(String str, String str2, i7.g gVar) {
        l.f(str, "validateService");
        l.f(str2, "applNo");
        l.f(gVar, "selectedList");
        j jVar = new j();
        jVar.E("applicationNumber", str2);
        jVar.E("agentId", "mparivahanDL");
        jVar.E("agentIpAddress", "10.26.61.108");
        jVar.E("agentServiceName", "sarathiservice");
        jVar.E("agentPwd", "1A010F7286F6562342A022AD23B21EE9");
        jVar.E("validateService", str);
        jVar.B("selectedListOfServices", gVar);
        String valueOf = String.valueOf(System.currentTimeMillis());
        this.f31085d.b(jVar, valueOf).enqueue(new h(valueOf, this));
    }
}
