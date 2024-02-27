package gf;

import androidx.lifecycle.a0;
import androidx.lifecycle.t0;
import cm.l;
import cm.u;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.nic.mparivahan.VahanServices.FancyServices.AvailableFancyModel.AvailableFancyModel;
import ef.b;
import i7.d;
import org.json.JSONObject;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import um.c0;
import um.x;

public final class a extends t0 {

    /* renamed from: d  reason: collision with root package name */
    private final b f23697d;

    /* renamed from: e  reason: collision with root package name */
    private final a0 f23698e = new a0();

    /* renamed from: f  reason: collision with root package name */
    private final a0 f23699f = new a0();

    /* renamed from: gf.a$a  reason: collision with other inner class name */
    public static final class C0292a implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f23700a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f23701b;

        C0292a(u uVar, a aVar) {
            this.f23700a = uVar;
            this.f23701b = aVar;
        }

        public void onFailure(Call call, Throwable th2) {
            l.f(call, "call");
            l.f(th2, "t");
            this.f23701b.h().k("error");
        }

        public void onResponse(Call call, Response response) {
            a0 h10;
            String message;
            l.f(call, "call");
            l.f(response, "response");
            try {
                SecurityModle securityModle = (SecurityModle) response.body();
                l.c(securityModle);
                String data = securityModle.getData();
                l.c(data);
                Object j10 = new d().j(pb.a.f14908a.a((String) this.f23700a.f20234e, data).toString(), AvailableFancyModel.class);
                l.e(j10, "fromJson(...)");
                AvailableFancyModel availableFancyModel = (AvailableFancyModel) j10;
                if (availableFancyModel.getStatus().equals("SUCCESS")) {
                    this.f23701b.g().k(availableFancyModel);
                    h10 = this.f23701b.h();
                    message = availableFancyModel.getStatus();
                } else {
                    h10 = this.f23701b.h();
                    message = availableFancyModel.getMessage();
                }
                h10.k(message);
            } catch (Exception e10) {
                e10.printStackTrace();
                this.f23701b.h().k("error");
            }
        }
    }

    public a(b bVar) {
        l.f(bVar, "repository");
        this.f23697d = bVar;
    }

    public final a0 g() {
        return this.f23698e;
    }

    public final a0 h() {
        return this.f23699f;
    }

    public final void i(String str, String str2, String str3, String str4) {
        l.f(str, "stateCode");
        l.f(str2, "rtoCode");
        l.f(str3, "pageSize");
        l.f(str4, "page");
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("stateCode", (Object) str);
        jSONObject.put("rtoCode", (Object) str2);
        jSONObject.put("pageSize", (Object) str3);
        jSONObject.put("pageNumber", (Object) str4);
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject2 = jSONObject.toString();
        l.e(jSONObject2, "toString(...)");
        this.f23697d.a(aVar.f(b10, jSONObject2), (String) uVar.f20234e).enqueue(new C0292a(uVar, this));
    }
}
