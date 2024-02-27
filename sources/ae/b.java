package ae;

import androidx.lifecycle.a0;
import androidx.lifecycle.t0;
import cm.l;
import cm.u;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.nic.mparivahan.VahanServices.AlterationOfVehicle.AOVModel.AOVModel;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import i7.d;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import um.c0;
import um.x;

public final class b extends t0 {

    /* renamed from: d  reason: collision with root package name */
    private final yd.a f19037d;

    /* renamed from: e  reason: collision with root package name */
    private final a0 f19038e = new a0();

    /* renamed from: f  reason: collision with root package name */
    private final a0 f19039f = new a0();

    public static final class a implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f19040a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f19041b;

        a(u uVar, b bVar) {
            this.f19040a = uVar;
            this.f19041b = bVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f19041b.g().k(th2 != null ? th2.getMessage() : null);
        }

        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception e10) {
                    this.f19041b.g().k("Error");
                    e10.printStackTrace();
                    return;
                }
            } else {
                securityModle = null;
            }
            l.c(securityModle);
            String data = securityModle.getData();
            l.c(data);
            Object j10 = new d().j(pb.a.f14908a.a((String) this.f19040a.f20234e, data), AOVModel.class);
            l.e(j10, "fromJson(...)");
            this.f19041b.h().k((AOVModel) j10);
        }
    }

    public b(yd.a aVar) {
        l.f(aVar, "repository");
        this.f19037d = aVar;
    }

    public final a0 g() {
        return this.f19039f;
    }

    public final a0 h() {
        return this.f19038e;
    }

    public final void i(String str, String str2, String str3, String str4) {
        l.f(str, "regNo");
        l.f(str2, "offCd");
        l.f(str3, "purCd");
        l.f(str4, "stateCd");
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        this.f19037d.a(c0.Companion.f(x.f32156g.b("application/json"), VUtility.Companion.S(str, str2, str3, str4)), (String) uVar.f20234e).enqueue(new a(uVar, this));
    }
}
