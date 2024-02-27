package ae;

import androidx.lifecycle.a0;
import androidx.lifecycle.t0;
import cm.l;
import cm.u;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.nic.mparivahan.VahanServices.AlterationOfVehicle.AOVSaveToDraftModel.AOVSaveToDraftReponse;
import com.nic.mparivahan.VahanServices.AlterationOfVehicle.AOVSaveToDraftModel.AOVSaveToDraftRequest;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import i7.d;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import um.c0;
import um.x;
import yd.b;

public final class a extends t0 {

    /* renamed from: d  reason: collision with root package name */
    private final b f19032d;

    /* renamed from: e  reason: collision with root package name */
    private final a0 f19033e = new a0();

    /* renamed from: f  reason: collision with root package name */
    private final a0 f19034f = new a0();

    /* renamed from: ae.a$a  reason: collision with other inner class name */
    public static final class C0254a implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f19035a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f19036b;

        C0254a(u uVar, a aVar) {
            this.f19035a = uVar;
            this.f19036b = aVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f19036b.h().k(th2 != null ? th2.getMessage() : null);
        }

        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception e10) {
                    this.f19036b.h().k("Error");
                    e10.printStackTrace();
                    return;
                }
            } else {
                securityModle = null;
            }
            l.c(securityModle);
            String data = securityModle.getData();
            l.c(data);
            Object j10 = new d().j(pb.a.f14908a.a((String) this.f19035a.f20234e, data), AOVSaveToDraftReponse.class);
            l.e(j10, "fromJson(...)");
            this.f19036b.i().k((AOVSaveToDraftReponse) j10);
        }
    }

    public a(b bVar) {
        l.f(bVar, "repository");
        this.f19032d = bVar;
    }

    public final void g(AOVSaveToDraftRequest aOVSaveToDraftRequest) {
        l.f(aOVSaveToDraftRequest, "aov");
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        this.f19032d.a(c0.Companion.f(x.f32156g.b("application/json"), VUtility.Companion.D(aOVSaveToDraftRequest)), (String) uVar.f20234e).enqueue(new C0254a(uVar, this));
    }

    public final a0 h() {
        return this.f19034f;
    }

    public final a0 i() {
        return this.f19033e;
    }
}