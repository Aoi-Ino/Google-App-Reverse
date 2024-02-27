package fi;

import android.os.Build;
import androidx.lifecycle.a0;
import androidx.lifecycle.t0;
import cm.l;
import cm.u;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import com.nic.mparivahan.VahanServices.updateMobileNo.UpdateMobileNumber.MobileUpdateModel.UpdateModelVehDetails;
import com.nic.mparivahan.VahanServices.updateMobileNo.UpdateMobileNumber.MobileViewModel.AadharrValidateForMobileRes;
import com.nic.mparivahan.VahanServices.updateMobileNo.UpdateMobileNumber.MobileViewModel.UpdateRegisterResponse;
import i7.d;
import id.c;
import j$.util.Base64;
import org.json.JSONObject;
import pb.a;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import um.c0;
import um.x;

public final class b extends t0 {

    /* renamed from: d  reason: collision with root package name */
    private final a f23513d;

    /* renamed from: e  reason: collision with root package name */
    private final a0 f23514e = new a0();

    /* renamed from: f  reason: collision with root package name */
    private final a0 f23515f = new a0();

    /* renamed from: g  reason: collision with root package name */
    private final a0 f23516g = new a0();

    /* renamed from: h  reason: collision with root package name */
    private a0 f23517h = new a0();

    /* renamed from: i  reason: collision with root package name */
    private final a0 f23518i = new a0();

    /* renamed from: j  reason: collision with root package name */
    private final a0 f23519j = new a0();

    public static final class a implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f23520a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f23521b;

        a(String str, b bVar) {
            this.f23520a = str;
            this.f23521b = bVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f23521b.g().k("Service temporarily unavailable. Please try again later.");
        }

        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception e10) {
                    this.f23521b.g().k("Unable to Update the mobile no.");
                    e10.printStackTrace();
                    return;
                }
            } else {
                securityModle = null;
            }
            a.C0201a aVar = pb.a.f14908a;
            String str = this.f23520a;
            l.c(securityModle);
            String data = securityModle.getData();
            l.c(data);
            String a10 = aVar.a(str, data);
            JSONObject jSONObject = new JSONObject(a10).getJSONObject("apiMessage");
            if (jSONObject.getInt("statusCode") == 400) {
                this.f23521b.g().k(jSONObject.getString("developerMessage"));
                return;
            }
            Object j10 = new d().j(a10, UpdateModelVehDetails.class);
            l.e(j10, "fromJson(...)");
            this.f23521b.h().k((UpdateModelVehDetails) j10);
        }
    }

    /* renamed from: fi.b$b  reason: collision with other inner class name */
    public static final class C0291b implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f23522a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f23523b;

        C0291b(u uVar, b bVar) {
            this.f23522a = uVar;
            this.f23523b = bVar;
        }

        public void onFailure(Call call, Throwable th2) {
            l.f(call, "call");
            l.f(th2, "t");
            this.f23523b.i().k("Error");
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
                    str = (String) this.f23522a.f20234e;
                    Base64.Decoder decoder = Base64.getDecoder();
                    if (securityModle != null) {
                        str3 = securityModle.getData();
                    }
                    byte[] decode = decoder.decode(str3);
                    l.e(decode, "decode(...)");
                    str2 = new String(decode, km.d.f24740b);
                } else {
                    aVar = id.c.f12675a;
                    str = (String) this.f23522a.f20234e;
                    if (securityModle != null) {
                        str3 = securityModle.getData();
                    }
                    byte[] decode2 = android.util.Base64.decode(str3, 0);
                    l.e(decode2, "decode(...)");
                    str2 = new String(decode2, km.d.f24740b);
                }
                String valueOf = String.valueOf(aVar.a(str, str2));
                JSONObject jSONObject = new JSONObject(valueOf);
                if (!jSONObject.has("errorcode")) {
                    Object j10 = new d().j(valueOf, UpdateRegisterResponse.class);
                    l.e(j10, "fromJson(...)");
                    this.f23523b.j().k((UpdateRegisterResponse) j10);
                } else if (jSONObject.getInt("errorcode") == 400) {
                    this.f23523b.i().k(jSONObject.getString("errorDesc"));
                }
            } catch (Exception unused) {
                this.f23523b.i().k("Error");
            }
        }
    }

    public static final class c implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f23524a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f23525b;

        c(u uVar, b bVar) {
            this.f23524a = uVar;
            this.f23525b = bVar;
        }

        public void onFailure(Call call, Throwable th2) {
            l.f(call, "call");
            l.f(th2, "t");
            this.f23525b.l().k("Unable to update the mobile no, Please try after some time!");
        }

        public void onResponse(Call call, Response response) {
            l.f(call, "call");
            l.f(response, "response");
            try {
                if (response.code() == 200) {
                    SecurityModle securityModle = (SecurityModle) response.body();
                    l.c(securityModle);
                    String data = securityModle.getData();
                    l.c(data);
                    String a10 = pb.a.f14908a.a((String) this.f23524a.f20234e, data);
                    JSONObject jSONObject = new JSONObject(a10);
                    if (jSONObject.has("apiMessage")) {
                        JSONObject jSONObject2 = jSONObject.getJSONObject("apiMessage");
                        if (!jSONObject2.has("statusCode")) {
                            return;
                        }
                        if (jSONObject2.getInt("statusCode") == 200) {
                            Object j10 = new d().j(a10, AadharrValidateForMobileRes.class);
                            l.e(j10, "fromJson(...)");
                            this.f23525b.m().k((AadharrValidateForMobileRes) j10);
                            return;
                        }
                        this.f23525b.l().k(jSONObject2.getString("developerMessage"));
                    }
                }
            } catch (Exception unused) {
                this.f23525b.l().k("Unable to update the mobile no, Please try after some time!");
            }
        }
    }

    public b(a aVar) {
        l.f(aVar, "repository");
        this.f23513d = aVar;
    }

    public final a0 g() {
        return this.f23515f;
    }

    public final a0 h() {
        return this.f23514e;
    }

    public final a0 i() {
        return this.f23519j;
    }

    public final a0 j() {
        return this.f23518i;
    }

    public final void k(String str, String str2, String str3, String str4, String str5) {
        l.f(str, "regNo");
        l.f(str2, "chasiNo");
        l.f(str3, "engineNo");
        l.f(str4, "regnDate");
        l.f(str5, "regnUpto");
        String valueOf = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject = VUtility.Companion.a0(str, str2, str3, str4, str5).toString();
        l.e(jSONObject, "toString(...)");
        this.f23513d.a(aVar.f(b10, jSONObject), valueOf).enqueue(new a(valueOf, this));
    }

    public final a0 l() {
        return this.f23517h;
    }

    public final a0 m() {
        return this.f23516g;
    }

    public final void n(JSONObject jSONObject) {
        l.f(jSONObject, "requestObj");
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject2 = jSONObject.toString();
        l.e(jSONObject2, "toString(...)");
        this.f23513d.b(aVar.f(b10, jSONObject2), (String) uVar.f20234e).enqueue(new C0291b(uVar, this));
    }

    public final void o(JSONObject jSONObject) {
        l.f(jSONObject, "requestObj");
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject2 = jSONObject.toString();
        l.e(jSONObject2, "toString(...)");
        this.f23513d.c(aVar.f(b10, jSONObject2), (String) uVar.f20234e).enqueue(new c(uVar, this));
    }
}
