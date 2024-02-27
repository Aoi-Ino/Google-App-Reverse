package ee;

import androidx.lifecycle.a0;
import androidx.lifecycle.t0;
import cm.l;
import cm.u;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.nic.mparivahan.VahanServices.Checkpost.CheckpostTaxReceipt.CheckpostTaxReceiptModel.CheckpostTaxReceiptDownload;
import i7.d;
import org.json.JSONObject;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import um.c0;
import um.x;

public final class a extends t0 {

    /* renamed from: d  reason: collision with root package name */
    private final ce.a f22945d;

    /* renamed from: e  reason: collision with root package name */
    private final a0 f22946e = new a0();

    /* renamed from: f  reason: collision with root package name */
    private final a0 f22947f = new a0();

    /* renamed from: ee.a$a  reason: collision with other inner class name */
    public static final class C0286a implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f22948a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f22949b;

        C0286a(u uVar, a aVar) {
            this.f22948a = uVar;
            this.f22949b = aVar;
        }

        public void onFailure(Call call, Throwable th2) {
            l.f(call, "call");
            l.f(th2, "t");
            this.f22949b.h().k("error");
        }

        public void onResponse(Call call, Response response) {
            l.f(call, "call");
            l.f(response, "response");
            try {
                SecurityModle securityModle = (SecurityModle) response.body();
                l.c(securityModle);
                String data = securityModle.getData();
                l.c(data);
                Object j10 = new d().j(pb.a.f14908a.a((String) this.f22948a.f20234e, data).toString(), CheckpostTaxReceiptDownload.class);
                l.e(j10, "fromJson(...)");
                CheckpostTaxReceiptDownload checkpostTaxReceiptDownload = (CheckpostTaxReceiptDownload) j10;
                if (checkpostTaxReceiptDownload.isEmpty()) {
                    this.f22949b.h().k("error");
                    return;
                }
                this.f22949b.h().k("SUCCESS");
                this.f22949b.g().k(checkpostTaxReceiptDownload);
            } catch (Exception e10) {
                e10.printStackTrace();
                this.f22949b.h().k("error");
            }
        }
    }

    public a(ce.a aVar) {
        l.f(aVar, "repository");
        this.f22945d = aVar;
    }

    public final a0 g() {
        return this.f22946e;
    }

    public final a0 h() {
        return this.f22947f;
    }

    public final void i(String str, String str2) {
        l.f(str, "stateCode");
        l.f(str2, "regnNo");
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("stateCd", (Object) str);
        jSONObject.put("regnNo", (Object) str2);
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject2 = jSONObject.toString();
        l.e(jSONObject2, "toString(...)");
        this.f22945d.a(aVar.f(b10, jSONObject2), (String) uVar.f20234e).enqueue(new C0286a(uVar, this));
    }
}
