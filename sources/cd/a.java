package cd;

import android.os.Build;
import androidx.lifecycle.a0;
import androidx.lifecycle.t0;
import cm.l;
import com.nic.mparivahan.RC.Model.ImpoundDlSuccessModel;
import com.nic.mparivahan.RC.Model.ImpoundRcSuccessModel;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import id.c;
import j$.util.Base64;
import km.d;
import org.json.JSONObject;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import um.c0;
import um.x;

public final class a extends t0 {

    /* renamed from: d  reason: collision with root package name */
    private final bd.a f4963d;

    /* renamed from: e  reason: collision with root package name */
    private a0 f4964e = new a0();

    /* renamed from: f  reason: collision with root package name */
    private a0 f4965f = new a0();

    /* renamed from: g  reason: collision with root package name */
    private a0 f4966g = new a0();

    /* renamed from: h  reason: collision with root package name */
    private a0 f4967h = new a0();

    /* renamed from: cd.a$a  reason: collision with other inner class name */
    public static final class C0093a implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f4968a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f4969b;

        C0093a(String str, a aVar) {
            this.f4968a = str;
            this.f4969b = aVar;
        }

        public void onFailure(Call call, Throwable th2) {
            l.f(call, "call");
            l.f(th2, "t");
            this.f4969b.g().k("Error");
        }

        public void onResponse(Call call, Response response) {
            String a10;
            l.f(call, "call");
            l.f(response, "response");
            try {
                SecurityModle securityModle = (SecurityModle) response.body();
                String str = null;
                if (Build.VERSION.SDK_INT >= 26) {
                    c.a aVar = c.f12675a;
                    String str2 = this.f4968a;
                    Base64.Decoder decoder = Base64.getDecoder();
                    if (securityModle != null) {
                        str = securityModle.getData();
                    }
                    byte[] decode = decoder.decode(str);
                    l.e(decode, "decode(...)");
                    a10 = aVar.a(str2, new String(decode, d.f24740b));
                } else {
                    c.a aVar2 = c.f12675a;
                    String str3 = this.f4968a;
                    if (securityModle != null) {
                        str = securityModle.getData();
                    }
                    byte[] decode2 = android.util.Base64.decode(str, 0);
                    l.e(decode2, "decode(...)");
                    a10 = aVar2.a(str3, new String(decode2, d.f24740b));
                }
                Object j10 = new i7.d().j(String.valueOf(a10), ImpoundDlSuccessModel.class);
                l.e(j10, "fromJson(...)");
                this.f4969b.h().k((ImpoundDlSuccessModel) j10);
            } catch (Exception e10) {
                e10.printStackTrace();
                this.f4969b.g().k("Error");
            }
        }
    }

    public static final class b implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f4970a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f4971b;

        b(String str, a aVar) {
            this.f4970a = str;
            this.f4971b = aVar;
        }

        public void onFailure(Call call, Throwable th2) {
            l.f(call, "call");
            l.f(th2, "t");
            this.f4971b.k().k("Error");
        }

        public void onResponse(Call call, Response response) {
            String a10;
            l.f(call, "call");
            l.f(response, "response");
            try {
                SecurityModle securityModle = (SecurityModle) response.body();
                String str = null;
                if (Build.VERSION.SDK_INT >= 26) {
                    c.a aVar = c.f12675a;
                    String str2 = this.f4970a;
                    Base64.Decoder decoder = Base64.getDecoder();
                    if (securityModle != null) {
                        str = securityModle.getData();
                    }
                    byte[] decode = decoder.decode(str);
                    l.e(decode, "decode(...)");
                    a10 = aVar.a(str2, new String(decode, d.f24740b));
                } else {
                    c.a aVar2 = c.f12675a;
                    String str3 = this.f4970a;
                    if (securityModle != null) {
                        str = securityModle.getData();
                    }
                    byte[] decode2 = android.util.Base64.decode(str, 0);
                    l.e(decode2, "decode(...)");
                    a10 = aVar2.a(str3, new String(decode2, d.f24740b));
                }
                Object j10 = new i7.d().j(String.valueOf(a10), ImpoundRcSuccessModel.class);
                l.e(j10, "fromJson(...)");
                this.f4971b.l().k((ImpoundRcSuccessModel) j10);
            } catch (Exception e10) {
                e10.printStackTrace();
                this.f4971b.k().k("Error");
            }
        }
    }

    public a(bd.a aVar) {
        l.f(aVar, "repository");
        this.f4963d = aVar;
    }

    public final a0 g() {
        return this.f4967h;
    }

    public final a0 h() {
        return this.f4966g;
    }

    public final void i(JSONObject jSONObject) {
        l.f(jSONObject, "jsonObject");
        String valueOf = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject2 = jSONObject.toString();
        l.e(jSONObject2, "toString(...)");
        this.f4963d.a(aVar.f(b10, jSONObject2), valueOf).enqueue(new C0093a(valueOf, this));
    }

    public final void j(JSONObject jSONObject) {
        l.f(jSONObject, "jsonObject");
        String valueOf = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject2 = jSONObject.toString();
        l.e(jSONObject2, "toString(...)");
        this.f4963d.b(aVar.f(b10, jSONObject2), valueOf).enqueue(new b(valueOf, this));
    }

    public final a0 k() {
        return this.f4965f;
    }

    public final a0 l() {
        return this.f4964e;
    }
}
