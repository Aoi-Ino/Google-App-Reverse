package mf;

import android.util.Log;
import androidx.lifecycle.a0;
import androidx.lifecycle.t0;
import cm.l;
import cm.u;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import i7.d;
import lf.b;
import org.json.JSONObject;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import um.c0;
import um.x;

public final class a extends t0 {

    /* renamed from: d  reason: collision with root package name */
    private final b f25081d;

    /* renamed from: e  reason: collision with root package name */
    private final a0 f25082e = new a0();

    /* renamed from: f  reason: collision with root package name */
    private final a0 f25083f = new a0();

    /* renamed from: mf.a$a  reason: collision with other inner class name */
    public static final class C0320a implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f25084a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f25085b;

        C0320a(u uVar, a aVar) {
            this.f25084a = uVar;
            this.f25085b = aVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f25085b.g().k(String.valueOf(th2));
            Log.e("Error3", "Error");
        }

        public void onResponse(Call call, Response response) {
            SecurityModle securityModle = response != null ? (SecurityModle) response.body() : null;
            l.c(securityModle);
            String data = securityModle.getData();
            l.c(data);
            Object j10 = new d().j(pb.a.f14908a.a((String) this.f25084a.f20234e, data), kf.a.class);
            l.e(j10, "fromJson(...)");
            android.support.v4.media.session.b.a(j10);
            throw null;
        }
    }

    public a(b bVar) {
        l.f(bVar, "repository");
        this.f25081d = bVar;
    }

    public final a0 g() {
        return this.f25083f;
    }

    public final a0 h() {
        return this.f25082e;
    }

    public final void i(String str, String str2) {
        l.f(str, "stateCode");
        l.f(str2, "rtoCode");
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("stateCode", (Object) str);
        jSONObject.put("rtoCode", (Object) str2);
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject2 = jSONObject.toString();
        l.e(jSONObject2, "toString(...)");
        this.f25081d.a(aVar.f(b10, jSONObject2), (String) uVar.f20234e).enqueue(new C0320a(uVar, this));
    }
}
