package kg;

import androidx.lifecycle.a0;
import androidx.lifecycle.t0;
import cm.l;
import cm.u;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.nic.mparivahan.VahanServices.RenewalOfPermit.RPDataModel.RPDataModel;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import i7.d;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import um.c0;
import um.x;

public final class a extends t0 {

    /* renamed from: d  reason: collision with root package name */
    private final ig.a f24672d;

    /* renamed from: e  reason: collision with root package name */
    private final a0 f24673e = new a0();

    /* renamed from: f  reason: collision with root package name */
    private final a0 f24674f = new a0();

    /* renamed from: kg.a$a  reason: collision with other inner class name */
    public static final class C0315a implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f24675a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f24676b;

        C0315a(u uVar, a aVar) {
            this.f24675a = uVar;
            this.f24676b = aVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f24676b.h().k(th2 != null ? th2.getMessage() : null);
        }

        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception e10) {
                    this.f24676b.h().k("Error");
                    e10.printStackTrace();
                    return;
                }
            } else {
                securityModle = null;
            }
            l.c(securityModle);
            String data = securityModle.getData();
            l.c(data);
            Object j10 = new d().j(pb.a.f14908a.a((String) this.f24675a.f20234e, data), RPDataModel.class);
            l.e(j10, "fromJson(...)");
            this.f24676b.i().k((RPDataModel) j10);
        }
    }

    public a(ig.a aVar) {
        l.f(aVar, "repository");
        this.f24672d = aVar;
    }

    public final void g(String str, String str2, String str3) {
        l.f(str, "regNo");
        l.f(str2, "stateCd");
        l.f(str3, "offCode");
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        this.f24672d.a(c0.Companion.f(x.f32156g.b("application/json"), VUtility.Companion.V(str, str2, str3)), (String) uVar.f20234e).enqueue(new C0315a(uVar, this));
    }

    public final a0 h() {
        return this.f24674f;
    }

    public final a0 i() {
        return this.f24673e;
    }
}
