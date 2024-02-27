package mh;

import androidx.lifecycle.a0;
import androidx.lifecycle.t0;
import cm.l;
import cm.u;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.SellerResponse;
import i7.d;
import nh.b;
import org.json.JSONObject;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import um.c0;
import um.x;

public final class a extends t0 {

    /* renamed from: d  reason: collision with root package name */
    private final b f25087d;

    /* renamed from: e  reason: collision with root package name */
    private final a0 f25088e = new a0();

    /* renamed from: f  reason: collision with root package name */
    private final a0 f25089f = new a0();

    /* renamed from: mh.a$a  reason: collision with other inner class name */
    public static final class C0321a implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f25090a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f25091b;

        C0321a(u uVar, a aVar) {
            this.f25090a = uVar;
            this.f25091b = aVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f25091b.g().k(th2 != null ? th2.getMessage() : null);
        }

        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            a0 g10;
            Object string;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception e10) {
                    this.f25091b.g().k("Error");
                    e10.printStackTrace();
                    return;
                }
            } else {
                securityModle = null;
            }
            if (response != null && response.code() == 200) {
                l.c(securityModle);
                String data = securityModle.getData();
                l.c(data);
                String a10 = pb.a.f14908a.a((String) this.f25090a.f20234e, data);
                JSONObject jSONObject = new JSONObject(a10);
                if (jSONObject.has("apiMessage")) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("apiMessage");
                    if (jSONObject2.getInt("statusCode") == 200) {
                        Object j10 = new d().j(a10, SellerResponse.class);
                        l.e(j10, "fromJson(...)");
                        string = (SellerResponse) j10;
                        g10 = this.f25091b.h();
                    } else {
                        g10 = this.f25091b.g();
                        string = jSONObject2.getString("developerMessage");
                    }
                    g10.k(string);
                }
            }
        }
    }

    public a(b bVar) {
        l.f(bVar, "repository");
        this.f25087d = bVar;
    }

    public final a0 g() {
        return this.f25089f;
    }

    public final a0 h() {
        return this.f25088e;
    }

    public final void i(String str) {
        l.f(str, "request");
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        this.f25087d.a(c0.Companion.f(x.f32156g.b("application/json"), str), (String) uVar.f20234e).enqueue(new C0321a(uVar, this));
    }
}
