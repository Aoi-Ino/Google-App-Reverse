package uf;

import androidx.lifecycle.a0;
import androidx.lifecycle.t0;
import cm.l;
import cm.u;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.nic.mparivahan.VahanServices.MiscellaneousFeePayment.MFPModel.MFPRequestModel;
import com.nic.mparivahan.VahanServices.MiscellaneousFeePayment.MFPModel.MFPResponseModel;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import i7.d;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import um.c0;
import um.x;

public final class a extends t0 {

    /* renamed from: d  reason: collision with root package name */
    private final sf.a f31749d;

    /* renamed from: e  reason: collision with root package name */
    private final a0 f31750e = new a0();

    /* renamed from: f  reason: collision with root package name */
    private final a0 f31751f = new a0();

    /* renamed from: uf.a$a  reason: collision with other inner class name */
    public static final class C0358a implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f31752a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f31753b;

        C0358a(u uVar, a aVar) {
            this.f31752a = uVar;
            this.f31753b = aVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f31753b.g().k(th2 != null ? th2.getMessage() : null);
        }

        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception e10) {
                    this.f31753b.g().k("Error");
                    e10.printStackTrace();
                    return;
                }
            } else {
                securityModle = null;
            }
            l.c(securityModle);
            String data = securityModle.getData();
            l.c(data);
            Object j10 = new d().j(pb.a.f14908a.a((String) this.f31752a.f20234e, data), MFPResponseModel.class);
            l.e(j10, "fromJson(...)");
            this.f31753b.h().k((MFPResponseModel) j10);
        }
    }

    public a(sf.a aVar) {
        l.f(aVar, "repository");
        this.f31749d = aVar;
    }

    public final a0 g() {
        return this.f31751f;
    }

    public final a0 h() {
        return this.f31750e;
    }

    public final void i(MFPRequestModel mFPRequestModel) {
        l.f(mFPRequestModel, "mfp");
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        this.f31749d.a(c0.Companion.f(x.f32156g.b("application/json"), VUtility.Companion.K(mFPRequestModel)), (String) uVar.f20234e).enqueue(new C0358a(uVar, this));
    }
}
