package bi;

import androidx.lifecycle.a0;
import androidx.lifecycle.t0;
import cm.l;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.DmsUrlModle;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import wg.f;

public final class o extends t0 {

    /* renamed from: d  reason: collision with root package name */
    private final f f19747d;

    /* renamed from: e  reason: collision with root package name */
    private final a0 f19748e = new a0();

    /* renamed from: f  reason: collision with root package name */
    private final a0 f19749f = new a0();

    public static final class a implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o f19750a;

        a(o oVar) {
            this.f19750a = oVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f19750a.h().k(th2 != null ? th2.getMessage() : null);
        }

        public void onResponse(Call call, Response response) {
            a0 i10 = this.f19750a.i();
            DmsUrlModle dmsUrlModle = response != null ? (DmsUrlModle) response.body() : null;
            l.c(dmsUrlModle);
            i10.k(dmsUrlModle);
        }
    }

    public o(f fVar) {
        l.f(fVar, "repository");
        this.f19747d = fVar;
    }

    public final void g(String str, String str2, String str3, String str4) {
        l.f(str, "state_code");
        l.f(str2, "appl_no");
        l.f(str3, "rc_no");
        l.f(str4, VContant.PURPOSE_CODE);
        this.f19747d.a(str, str2, str3, str4).enqueue(new a(this));
    }

    public final a0 h() {
        return this.f19749f;
    }

    public final a0 i() {
        return this.f19748e;
    }
}
