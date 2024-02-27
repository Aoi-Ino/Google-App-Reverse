package cf;

import androidx.lifecycle.a0;
import androidx.lifecycle.t0;
import bf.b;
import cm.l;
import cm.u;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.nic.mparivahan.VahanServices.FancyServices.AuctionStatusModel.AuctionStatusModel;
import i7.d;
import org.json.JSONObject;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import um.c0;
import um.x;

public final class a extends t0 {

    /* renamed from: d  reason: collision with root package name */
    private final b f20040d;

    /* renamed from: e  reason: collision with root package name */
    private final a0 f20041e = new a0();

    /* renamed from: f  reason: collision with root package name */
    private final a0 f20042f = new a0();

    /* renamed from: cf.a$a  reason: collision with other inner class name */
    public static final class C0266a implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f20043a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f20044b;

        C0266a(u uVar, a aVar) {
            this.f20043a = uVar;
            this.f20044b = aVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f20044b.g().k(String.valueOf(th2));
        }

        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            a0 g10;
            Object obj;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception unused) {
                    this.f20044b.g().k("Please try after some time!");
                    return;
                }
            } else {
                securityModle = null;
            }
            l.c(securityModle);
            String data = securityModle.getData();
            l.c(data);
            Object j10 = new d().j(pb.a.f14908a.a((String) this.f20043a.f20234e, data), AuctionStatusModel.class);
            l.e(j10, "fromJson(...)");
            AuctionStatusModel auctionStatusModel = (AuctionStatusModel) j10;
            if (p.p(auctionStatusModel.getMessage(), "Record found.", false, 2, (Object) null)) {
                g10 = this.f20044b.h();
                obj = auctionStatusModel;
            } else {
                g10 = this.f20044b.g();
                Object message = auctionStatusModel.getMessage();
                l.c(message);
                obj = message;
            }
            g10.k(obj);
        }
    }

    public a(b bVar) {
        l.f(bVar, "repository");
        this.f20040d = bVar;
    }

    public final a0 g() {
        return this.f20042f;
    }

    public final a0 h() {
        return this.f20041e;
    }

    public final void i(String str) {
        l.f(str, "ackNumber");
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("ackNo", (Object) str);
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject2 = jSONObject.toString();
        l.e(jSONObject2, "toString(...)");
        this.f20040d.a(aVar.f(b10, jSONObject2), (String) uVar.f20234e).enqueue(new C0266a(uVar, this));
    }
}
