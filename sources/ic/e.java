package ic;

import android.os.Build;
import android.support.v4.media.session.b;
import androidx.lifecycle.a0;
import androidx.lifecycle.t0;
import cm.l;
import cm.u;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import id.c;
import j$.util.Base64;
import km.d;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import um.c0;
import um.x;

public final class e extends t0 {

    /* renamed from: d  reason: collision with root package name */
    private final b f12669d;

    /* renamed from: e  reason: collision with root package name */
    private a0 f12670e = new a0();

    /* renamed from: f  reason: collision with root package name */
    private final a0 f12671f = new a0();

    public static final class a implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f12672a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f12673b;

        a(u uVar, e eVar) {
            this.f12672a = uVar;
            this.f12673b = eVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f12673b.g().k(th2 != null ? th2.getMessage() : null);
        }

        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            c.a aVar;
            String str;
            String str2;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception unused) {
                    this.f12673b.g().k("Error");
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                aVar = c.f12675a;
                str = (String) this.f12672a.f20234e;
                byte[] decode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
                l.e(decode, "decode(...)");
                str2 = new String(decode, d.f24740b);
            } else {
                aVar = c.f12675a;
                str = (String) this.f12672a.f20234e;
                byte[] decode2 = android.util.Base64.decode(securityModle != null ? securityModle.getData() : null, 0);
                l.e(decode2, "decode(...)");
                str2 = new String(decode2, d.f24740b);
            }
            Object j10 = new i7.d().j(String.valueOf(aVar.a(str, str2)), c.class);
            l.e(j10, "fromJson(...)");
            b.a(j10);
            this.f12673b.h().k((Object) null);
        }
    }

    public e(b bVar) {
        l.f(bVar, "repository");
        this.f12669d = bVar;
    }

    public final a0 g() {
        return this.f12671f;
    }

    public final a0 h() {
        return this.f12670e;
    }

    public final void i(int i10, String str) {
        l.f(str, "disticId");
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject = d.f12668a.a(i10, str).toString();
        l.e(jSONObject, "toString(...)");
        c0 f10 = aVar.f(b10, jSONObject);
        u uVar = new u();
        String valueOf = String.valueOf(System.currentTimeMillis());
        uVar.f20234e = valueOf;
        this.f12669d.a(f10, valueOf).enqueue(new a(uVar, this));
    }
}
