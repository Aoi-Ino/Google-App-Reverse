package eg;

import androidx.lifecycle.a0;
import androidx.lifecycle.t0;
import cm.l;
import cm.u;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.nic.mparivahan.VahanServices.RenewalOfNpAuthorizationPermit.RenewalOfNPAPermitModel.NPAPermitResponseModel;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import i7.d;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import um.c0;
import um.x;

public final class a extends t0 {

    /* renamed from: d  reason: collision with root package name */
    private final cg.a f22952d;

    /* renamed from: e  reason: collision with root package name */
    private final a0 f22953e = new a0();

    /* renamed from: f  reason: collision with root package name */
    private final a0 f22954f = new a0();

    /* renamed from: eg.a$a  reason: collision with other inner class name */
    public static final class C0287a implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f22955a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f22956b;

        C0287a(u uVar, a aVar) {
            this.f22955a = uVar;
            this.f22956b = aVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f22956b.g().k("Error");
        }

        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception unused) {
                    this.f22956b.g().k("Error");
                    return;
                }
            } else {
                securityModle = null;
            }
            l.c(securityModle);
            String data = securityModle.getData();
            l.c(data);
            Object j10 = new d().j(pb.a.f14908a.a((String) this.f22955a.f20234e, data), NPAPermitResponseModel.class);
            l.e(j10, "fromJson(...)");
            this.f22956b.h().k((NPAPermitResponseModel) j10);
        }
    }

    public a(cg.a aVar) {
        l.f(aVar, "repository");
        this.f22952d = aVar;
    }

    public final a0 g() {
        return this.f22954f;
    }

    public final a0 h() {
        return this.f22953e;
    }

    public final void i(String str, String str2, String str3) {
        l.f(str, "regnNo");
        l.f(str2, "stateCode");
        l.f(str3, "officeCode");
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        this.f22952d.a(c0.Companion.f(x.f32156g.b("application/json"), VUtility.Companion.M(str, str2, str3)), (String) uVar.f20234e).enqueue(new C0287a(uVar, this));
    }
}
