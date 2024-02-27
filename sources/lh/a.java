package lh;

import android.util.Log;
import androidx.lifecycle.a0;
import androidx.lifecycle.t0;
import cm.l;
import cm.u;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.TOBuyerApplication.TOBuyerApplicantModel.TOFetchApplicationDetails;
import i7.d;
import org.json.JSONObject;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import um.c0;
import um.x;

public final class a extends t0 {

    /* renamed from: d  reason: collision with root package name */
    private final jh.a f24824d;

    /* renamed from: e  reason: collision with root package name */
    private a0 f24825e = new a0();

    /* renamed from: f  reason: collision with root package name */
    private a0 f24826f = new a0();

    /* renamed from: lh.a$a  reason: collision with other inner class name */
    public static final class C0317a implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f24827a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f24828b;

        C0317a(u uVar, a aVar) {
            this.f24827a = uVar;
            this.f24828b = aVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f24828b.i().k("Error");
            Log.e("applicantDetailError", "something went wrong");
        }

        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            a0 i10;
            Object string;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception e10) {
                    Log.e("applicantDetailError", e10.toString());
                    this.f24828b.i().k("Error");
                    return;
                }
            } else {
                securityModle = null;
            }
            if (response != null && response.code() == 200) {
                l.c(securityModle);
                String data = securityModle.getData();
                l.c(data);
                String a10 = pb.a.f14908a.a((String) this.f24827a.f20234e, data);
                JSONObject jSONObject = new JSONObject(a10);
                if (jSONObject.has("apiMessage")) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("apiMessage");
                    if (jSONObject2.getInt("statusCode") == 200) {
                        Object j10 = new d().j(a10, TOFetchApplicationDetails.class);
                        l.e(j10, "fromJson(...)");
                        string = (TOFetchApplicationDetails) j10;
                        i10 = this.f24828b.h();
                    } else {
                        i10 = this.f24828b.i();
                        string = jSONObject2.getString("developerMessage");
                    }
                    i10.k(string);
                }
            }
        }
    }

    public a(jh.a aVar) {
        l.f(aVar, "repository");
        this.f24824d = aVar;
    }

    public final void g(String str, boolean z10, String str2, String str3) {
        Call call;
        l.f(str, "applNo");
        l.f(str2, "reg");
        l.f(str3, "chassi");
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        if (z10) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("chassisNo", (Object) str3);
            jSONObject.put("regnNo", (Object) str2);
            c0.a aVar = c0.Companion;
            x b10 = x.f32156g.b("application/json");
            String jSONObject2 = jSONObject.toString();
            l.e(jSONObject2, "toString(...)");
            call = this.f24824d.b(aVar.f(b10, jSONObject2), (String) uVar.f20234e);
        } else {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("applNo", (Object) str);
            c0.a aVar2 = c0.Companion;
            x b11 = x.f32156g.b("application/json");
            String jSONObject4 = jSONObject3.toString();
            l.e(jSONObject4, "toString(...)");
            call = this.f24824d.a(aVar2.f(b11, jSONObject4), (String) uVar.f20234e);
        }
        if (call != null) {
            call.enqueue(new C0317a(uVar, this));
        }
    }

    public final a0 h() {
        return this.f24825e;
    }

    public final a0 i() {
        return this.f24826f;
    }
}
