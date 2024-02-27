package eg;

import androidx.lifecycle.a0;
import androidx.lifecycle.t0;
import cm.l;
import cm.u;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.nic.mparivahan.VahanServices.RenewalOfNpAuthorizationPermit.RenewalOfPermitSaveToDraftModel.RenewalOfPermitSaveToDraftResponse;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import i7.d;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import um.c0;
import um.x;

public final class b extends t0 {

    /* renamed from: d  reason: collision with root package name */
    private final cg.b f22957d;

    /* renamed from: e  reason: collision with root package name */
    private final a0 f22958e = new a0();

    /* renamed from: f  reason: collision with root package name */
    private final a0 f22959f = new a0();

    public static final class a implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f22960a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f22961b;

        a(u uVar, b bVar) {
            this.f22960a = uVar;
            this.f22961b = bVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f22961b.g().k(th2 != null ? th2.getMessage() : null);
        }

        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception e10) {
                    this.f22961b.g().k("Error");
                    e10.printStackTrace();
                    return;
                }
            } else {
                securityModle = null;
            }
            l.c(securityModle);
            String data = securityModle.getData();
            l.c(data);
            Object j10 = new d().j(pb.a.f14908a.a((String) this.f22960a.f20234e, data), RenewalOfPermitSaveToDraftResponse.class);
            l.e(j10, "fromJson(...)");
            this.f22961b.h().k((RenewalOfPermitSaveToDraftResponse) j10);
        }
    }

    public b(cg.b bVar) {
        l.f(bVar, "repository");
        this.f22957d = bVar;
    }

    public final a0 g() {
        return this.f22959f;
    }

    public final a0 h() {
        return this.f22958e;
    }

    public final void i(fg.a aVar) {
        l.f(aVar, "renewal");
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        this.f22957d.a(c0.Companion.f(x.f32156g.b("application/json"), VUtility.Companion.R(aVar)), (String) uVar.f20234e).enqueue(new a(uVar, this));
    }
}
