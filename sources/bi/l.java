package bi;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.util.Log;
import androidx.lifecycle.a0;
import androidx.lifecycle.t0;
import cm.u;
import com.nic.mparivahan.Account.Model.SendOtpResult;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog;
import com.nic.mparivahan.VahanServices.VahanModel.OwnerDetailPuccPermit;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import id.c;
import j$.util.Base64;
import ld.g;
import org.json.JSONObject;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import um.c0;
import um.x;
import v9.d;
import wg.e;

public final class l extends t0 {

    /* renamed from: d  reason: collision with root package name */
    private final e f19732d;

    /* renamed from: e  reason: collision with root package name */
    private final a0 f19733e = new a0();

    /* renamed from: f  reason: collision with root package name */
    private final a0 f19734f = new a0();

    /* renamed from: g  reason: collision with root package name */
    private final a0 f19735g = new a0();

    /* renamed from: h  reason: collision with root package name */
    private final a0 f19736h = new a0();

    /* renamed from: i  reason: collision with root package name */
    private a0 f19737i = new a0();

    /* renamed from: j  reason: collision with root package name */
    private a0 f19738j = new a0();

    public static final class a implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f19739a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ u f19740b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ l f19741c;

        a(Context context, u uVar, l lVar) {
            this.f19739a = context;
            this.f19740b = uVar;
            this.f19741c = lVar;
        }

        public void onFailure(Call call, Throwable th2) {
            ApiMonitorLog.a aVar = ApiMonitorLog.f20957k;
            Context context = this.f19739a;
            d.a aVar2 = d.f17494a;
            aVar.a(context, aVar2.z(), "ownerinformationforinsurancepuccpermit", aVar2.v(), "Connection time out");
            this.f19741c.k().k(th2 != null ? th2.getMessage() : null);
        }

        public void onResponse(Call call, Response response) {
            String a10;
            Object obj;
            a0 l10;
            try {
                String str = null;
                ApiMonitorLog.f20957k.a(this.f19739a, d.f17494a.z(), "ownerinformationforinsurancepuccpermit", String.valueOf(response != null ? Integer.valueOf(response.code()) : null), String.valueOf(response != null ? response.message() : null));
                SecurityModle securityModle = response != null ? (SecurityModle) response.body() : null;
                if (Build.VERSION.SDK_INT >= 26) {
                    c.a aVar = c.f12675a;
                    String str2 = (String) this.f19740b.f20234e;
                    Base64.Decoder decoder = Base64.getDecoder();
                    if (securityModle != null) {
                        str = securityModle.getData();
                    }
                    byte[] decode = decoder.decode(str);
                    cm.l.e(decode, "decode(...)");
                    a10 = aVar.a(str2, new String(decode, km.d.f24740b));
                } else {
                    c.a aVar2 = c.f12675a;
                    String str3 = (String) this.f19740b.f20234e;
                    if (securityModle != null) {
                        str = securityModle.getData();
                    }
                    byte[] decode2 = android.util.Base64.decode(str, 0);
                    cm.l.e(decode2, "decode(...)");
                    a10 = aVar2.a(str3, new String(decode2, km.d.f24740b));
                }
                String valueOf = String.valueOf(a10);
                Class<OwnerDetailPuccPermit> cls = OwnerDetailPuccPermit.class;
                if (response != null) {
                    if (response.code() == 200) {
                        JSONObject jSONObject = new JSONObject(valueOf);
                        if (jSONObject.has("errorDesc")) {
                            l10 = this.f19741c.k();
                            obj = jSONObject.getString("errorDesc").toString();
                        } else {
                            Object j10 = new i7.e().b().j(jSONObject.getJSONObject("data").toString(), cls);
                            cm.l.e(j10, "fromJson(...)");
                            obj = (OwnerDetailPuccPermit) j10;
                            l10 = this.f19741c.l();
                        }
                        l10.k(obj);
                        return;
                    }
                }
                if (response == null || response.code() != 400) {
                    Object j11 = new i7.e().b().j(valueOf, cls);
                    cm.l.e(j11, "fromJson(...)");
                    obj = (OwnerDetailPuccPermit) j11;
                    l10 = this.f19741c.l();
                    l10.k(obj);
                    return;
                }
                JSONObject jSONObject2 = new JSONObject(valueOf);
                if (jSONObject2.has("errorDesc")) {
                    l10 = this.f19741c.k();
                    obj = jSONObject2.getString("errorDesc").toString();
                    l10.k(obj);
                    return;
                }
                this.f19741c.k().k("error");
            } catch (Exception e10) {
                e10.printStackTrace();
                this.f19741c.k().k("error");
            }
        }
    }

    public static final class b implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f19742a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ u f19743b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ l f19744c;

        b(Context context, u uVar, l lVar) {
            this.f19742a = context;
            this.f19743b = uVar;
            this.f19744c = lVar;
        }

        public void onFailure(Call call, Throwable th2) {
            ApiMonitorLog.a aVar = ApiMonitorLog.f20957k;
            Context context = this.f19742a;
            d.a aVar2 = d.f17494a;
            aVar.a(context, aVar2.s(), "sendSMSAlerts", aVar2.v(), aVar2.w());
            this.f19744c.g().k(th2 != null ? th2.getMessage() : null);
        }

        public void onResponse(Call call, Response response) {
            String a10;
            try {
                String str = null;
                ApiMonitorLog.f20957k.a(this.f19742a, d.f17494a.s(), "sendSMSAlerts", String.valueOf(response != null ? Integer.valueOf(response.code()) : null), String.valueOf(response != null ? response.message() : null));
                SecurityModle securityModle = response != null ? (SecurityModle) response.body() : null;
                if (Build.VERSION.SDK_INT >= 26) {
                    c.a aVar = c.f12675a;
                    String str2 = (String) this.f19743b.f20234e;
                    Base64.Decoder decoder = Base64.getDecoder();
                    if (securityModle != null) {
                        str = securityModle.getData();
                    }
                    byte[] decode = decoder.decode(str);
                    cm.l.e(decode, "decode(...)");
                    a10 = aVar.a(str2, new String(decode, km.d.f24740b));
                } else {
                    c.a aVar2 = c.f12675a;
                    String str3 = (String) this.f19743b.f20234e;
                    if (securityModle != null) {
                        str = securityModle.getData();
                    }
                    byte[] decode2 = android.util.Base64.decode(str, 0);
                    cm.l.e(decode2, "decode(...)");
                    a10 = aVar2.a(str3, new String(decode2, km.d.f24740b));
                }
                Object j10 = new i7.d().j(String.valueOf(a10), SendOtpResult.class);
                cm.l.e(j10, "fromJson(...)");
                this.f19744c.i().k((SendOtpResult) j10);
            } catch (Exception e10) {
                Log.d("SendOtp-", e10.getLocalizedMessage());
                this.f19744c.g().k("Error");
            }
        }
    }

    public l(e eVar) {
        cm.l.f(eVar, "repository");
        this.f19732d = eVar;
    }

    public final a0 g() {
        return this.f19734f;
    }

    public final a0 h() {
        return this.f19735g;
    }

    public final a0 i() {
        return this.f19733e;
    }

    public final void j(Context context, String str, String str2, String str3, String str4) {
        Context context2 = context;
        cm.l.f(context, "context");
        String str5 = str;
        cm.l.f(str5, "rc");
        String str6 = str2;
        cm.l.f(str6, "state_code");
        cm.l.f(str3, "pcode");
        String str7 = str4;
        cm.l.f(str7, "chassi_no");
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        g gVar = new g(context);
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        VUtility.a aVar2 = VUtility.Companion;
        String k10 = gVar.k();
        cm.l.c(string);
        String jSONObject = aVar2.T(str5, str6, k10, string, gVar.l(), gVar.e(), str7).toString();
        cm.l.e(jSONObject, "toString(...)");
        this.f19732d.a(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new a(context, uVar, this));
    }

    public final a0 k() {
        return this.f19738j;
    }

    public final a0 l() {
        return this.f19737i;
    }

    public final void m(Context context, String str, String str2) {
        cm.l.f(context, "context");
        cm.l.f(str, "mobile_no");
        cm.l.f(str2, "record_id");
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject = VUtility.Companion.U(str, str2).toString();
        cm.l.e(jSONObject, "toString(...)");
        this.f19732d.c(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new b(context, uVar, this));
    }
}
