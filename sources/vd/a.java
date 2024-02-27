package vd;

import cm.l;
import com.nic.mparivahan.VahanEkyc.EkYCService;
import retrofit2.Call;
import um.c0;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final EkYCService f32251a;

    public a(EkYCService ekYCService) {
        l.f(ekYCService, "retrofitService");
        this.f32251a = ekYCService;
    }

    public final Call a(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f32251a.ekycRequest(c0Var, str);
    }

    public final Call b(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f32251a.ekycVerifyOtp(c0Var, str);
    }
}
