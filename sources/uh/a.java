package uh;

import androidx.lifecycle.a0;
import androidx.lifecycle.t0;
import cm.l;
import cm.u;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.TOPurposeData.TOPurposeResponseData.TOPurposeResponseData;
import i7.d;
import org.json.JSONObject;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import um.c0;
import um.x;

public final class a extends t0 {

    /* renamed from: d  reason: collision with root package name */
    private final sh.a f31769d;

    /* renamed from: e  reason: collision with root package name */
    private final a0 f31770e = new a0();

    /* renamed from: f  reason: collision with root package name */
    private final a0 f31771f = new a0();

    /* renamed from: uh.a$a  reason: collision with other inner class name */
    public static final class C0359a implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f31772a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f31773b;

        C0359a(u uVar, a aVar) {
            this.f31772a = uVar;
            this.f31773b = aVar;
        }

        public void onFailure(Call call, Throwable th2) {
        }

        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception unused) {
                    return;
                }
            } else {
                securityModle = null;
            }
            l.c(securityModle);
            String data = securityModle.getData();
            l.c(data);
            Object j10 = new d().j(pb.a.f14908a.a((String) this.f31772a.f20234e, data), TOPurposeResponseData.class);
            l.e(j10, "fromJson(...)");
            this.f31773b.h().k((TOPurposeResponseData) j10);
        }
    }

    public a(sh.a aVar) {
        l.f(aVar, "repository");
        this.f31769d = aVar;
    }

    public final void g(String str) {
        l.f(str, "stateCode");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("stateCode", (Object) str);
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject2 = jSONObject.toString();
        l.e(jSONObject2, "toString(...)");
        this.f31769d.a(aVar.f(b10, jSONObject2), (String) uVar.f20234e).enqueue(new C0359a(uVar, this));
    }

    public final a0 h() {
        return this.f31770e;
    }
}
