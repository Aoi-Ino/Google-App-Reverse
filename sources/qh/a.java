package qh;

import android.util.Log;
import androidx.lifecycle.a0;
import androidx.lifecycle.t0;
import cm.l;
import cm.u;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.ToCommonModel2.ToCommonModel2;
import i7.d;
import org.json.JSONObject;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import um.c0;
import um.x;

public final class a extends t0 {

    /* renamed from: d  reason: collision with root package name */
    private final oh.a f30606d;

    /* renamed from: e  reason: collision with root package name */
    private final a0 f30607e = new a0();

    /* renamed from: f  reason: collision with root package name */
    private final a0 f30608f = new a0();

    /* renamed from: qh.a$a  reason: collision with other inner class name */
    public static final class C0339a implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f30609a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f30610b;

        C0339a(u uVar, a aVar) {
            this.f30609a = uVar;
            this.f30610b = aVar;
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
            String a10 = pb.a.f14908a.a((String) this.f30609a.f20234e, data);
            Log.e("comman date", a10.toString());
            Object j10 = new d().j(a10, ToCommonModel2.class);
            l.e(j10, "fromJson(...)");
            this.f30610b.i().k((ToCommonModel2) j10);
        }
    }

    public a(oh.a aVar) {
        l.f(aVar, "repository");
        this.f30606d = aVar;
    }

    public final void g() {
        JSONObject jSONObject = new JSONObject();
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject2 = jSONObject.toString();
        l.e(jSONObject2, "toString(...)");
        this.f30606d.a(aVar.f(b10, jSONObject2), (String) uVar.f20234e).enqueue(new C0339a(uVar, this));
    }

    public final a0 h() {
        return this.f30608f;
    }

    public final a0 i() {
        return this.f30607e;
    }
}
