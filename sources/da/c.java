package da;

import android.os.Build;
import android.util.Log;
import androidx.lifecycle.a0;
import androidx.lifecycle.t0;
import cm.l;
import com.nic.mparivahan.DLServicesAuth.eKyc.Pojo.CheckByState;
import com.nic.mparivahan.DLServicesAuth.eKyc.Pojo.SubmitAdharApi;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import id.c;
import j$.util.Base64;
import km.d;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import um.c0;
import um.x;

public final class c extends t0 {

    /* renamed from: d  reason: collision with root package name */
    private final b f9874d;

    /* renamed from: e  reason: collision with root package name */
    private a0 f9875e = new a0();

    /* renamed from: f  reason: collision with root package name */
    private a0 f9876f = new a0();

    /* renamed from: g  reason: collision with root package name */
    private a0 f9877g = new a0();

    /* renamed from: h  reason: collision with root package name */
    private final a0 f9878h = new a0();

    /* renamed from: i  reason: collision with root package name */
    private a0 f9879i = new a0();

    public static final class a implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f9880a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f9881b;

        a(String str, c cVar) {
            this.f9880a = str;
            this.f9881b = cVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f9881b.i().k("error");
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
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                aVar = id.c.f12675a;
                str = this.f9880a;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode = decoder.decode(str3);
                l.e(decode, "decode(...)");
                str2 = new String(decode, d.f24740b);
            } else {
                aVar = id.c.f12675a;
                str = this.f9880a;
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str3, 0);
                l.e(decode2, "decode(...)");
                str2 = new String(decode2, d.f24740b);
            }
            String valueOf = String.valueOf(aVar.a(str, str2));
            Log.d("checkByState_response", valueOf);
            Object j10 = new i7.d().j(valueOf, CheckByState.class);
            l.e(j10, "fromJson(...)");
            this.f9881b.j().k((CheckByState) j10);
        }
    }

    public static final class b implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f9882a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f9883b;

        b(String str, c cVar) {
            this.f9882a = str;
            this.f9883b = cVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f9883b.h().k("error");
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
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                aVar = id.c.f12675a;
                str = this.f9882a;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode = decoder.decode(str3);
                l.e(decode, "decode(...)");
                str2 = new String(decode, d.f24740b);
            } else {
                aVar = id.c.f12675a;
                str = this.f9882a;
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str3, 0);
                l.e(decode2, "decode(...)");
                str2 = new String(decode2, d.f24740b);
            }
            String valueOf = String.valueOf(aVar.a(str, str2));
            Log.d("checkByState_response", valueOf);
            Object j10 = new i7.d().j(valueOf, SubmitAdharApi.class);
            l.e(j10, "fromJson(...)");
            this.f9883b.l().k((SubmitAdharApi) j10);
        }
    }

    public c(b bVar) {
        l.f(bVar, "repository");
        this.f9874d = bVar;
    }

    public final void g(String str, int i10, String str2) {
        l.f(str, "state");
        l.f(str2, "adharRtoCode");
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject = o9.a.f14458a.e(str, i10, str2).toString();
        l.e(jSONObject, "toString(...)");
        c0 f10 = aVar.f(b10, jSONObject);
        String valueOf = String.valueOf(System.currentTimeMillis());
        this.f9874d.b(f10, valueOf).enqueue(new a(valueOf, this));
    }

    public final a0 h() {
        return this.f9877g;
    }

    public final a0 i() {
        return this.f9878h;
    }

    public final a0 j() {
        return this.f9875e;
    }

    public final a0 k() {
        return this.f9879i;
    }

    public final a0 l() {
        return this.f9876f;
    }

    public final void m(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, int i10, String str23, String str24, String str25, String str26) {
        l.f(str, "aadhaarNo");
        l.f(str2, "careOf");
        l.f(str3, "code");
        l.f(str4, "dist");
        l.f(str5, "dobAdhar");
        l.f(str6, "gender");
        l.f(str7, "house");
        l.f(str8, "landMark");
        l.f(str9, "localityIfAny");
        l.f(str10, "name");
        l.f(str11, "phone");
        l.f(str12, "pht");
        l.f(str13, "pincode");
        l.f(str14, "state");
        l.f(str15, "adharStatus");
        l.f(str16, "street");
        l.f(str17, "villageTownCity");
        l.f(str18, "xmlUID");
        l.f(str19, "dlNo");
        l.f(str20, "dlOwnerName");
        l.f(str21, "dob");
        l.f(str22, "dlOwnerRelationFullName");
        l.f(str23, "status");
        l.f(str24, "txNo");
        l.f(str25, "uid");
        l.f(str26, "stateCd");
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject = o9.a.f14458a.k(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, i10, str23, str24, str25, str26).toString();
        l.e(jSONObject, "toString(...)");
        c0 f10 = aVar.f(b10, jSONObject);
        String valueOf = String.valueOf(System.currentTimeMillis());
        this.f9874d.a(f10, valueOf).enqueue(new b(valueOf, this));
    }
}
