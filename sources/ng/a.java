package ng;

import androidx.lifecycle.a0;
import androidx.lifecycle.t0;
import cm.l;
import cm.u;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.nic.mparivahan.VahanServices.RenewalOfPermit.RPSaveToDraftModel.RPSaveToDraftModel;
import com.nic.mparivahan.VahanServices.RenewalOfPermit.RPSaveToDraftModel.RPSaveToDraftResponse;
import i7.d;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import um.c0;
import um.x;

public final class a extends t0 {

    /* renamed from: d  reason: collision with root package name */
    private final lg.a f25135d;

    /* renamed from: e  reason: collision with root package name */
    private final a0 f25136e = new a0();

    /* renamed from: f  reason: collision with root package name */
    private final a0 f25137f = new a0();

    /* renamed from: ng.a$a  reason: collision with other inner class name */
    public static final class C0325a implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f25138a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f25139b;

        C0325a(u uVar, a aVar) {
            this.f25138a = uVar;
            this.f25139b = aVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f25139b.g().k(th2 != null ? th2.getMessage() : null);
        }

        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception e10) {
                    this.f25139b.g().k("Error");
                    e10.printStackTrace();
                    return;
                }
            } else {
                securityModle = null;
            }
            l.c(securityModle);
            String data = securityModle.getData();
            l.c(data);
            Object j10 = new d().j(pb.a.f14908a.a((String) this.f25138a.f20234e, data), RPSaveToDraftResponse.class);
            l.e(j10, "fromJson(...)");
            this.f25139b.h().k((RPSaveToDraftResponse) j10);
        }
    }

    public a(lg.a aVar) {
        l.f(aVar, "repository");
        this.f25135d = aVar;
    }

    public final a0 g() {
        return this.f25137f;
    }

    public final a0 h() {
        return this.f25136e;
    }

    public final void i(RPSaveToDraftModel rPSaveToDraftModel) {
        l.f(rPSaveToDraftModel, "rpSaveToDraftModel");
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        this.f25135d.a(c0.Companion.f(x.f32156g.b("application/json"), new d().t(rPSaveToDraftModel).toString()), (String) uVar.f20234e).enqueue(new C0325a(uVar, this));
    }
}
