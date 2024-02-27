package s8;

import cm.l;
import com.nic.mparivahan.Account.SignService;
import hc.a;
import retrofit2.Call;
import um.c0;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final SignService f16065a;

    public b(SignService signService) {
        l.f(signService, "retrofitService");
        this.f16065a = signService;
    }

    public final Call a(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f16065a.getResendOtp(c0Var, str);
    }

    public final Call b(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f16065a.getSendOtpRes(c0Var, str);
    }

    public final Call c(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f16065a.getUserDetails(a.f12073a.z(), c0Var, str);
    }

    public final Call d(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        SignService signService = this.f16065a;
        return signService.getUserLogin(a.f12073a.p() + "service/userLogin", c0Var, str);
    }

    public final Call e(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        SignService signService = this.f16065a;
        return signService.getUserLogout(a.f12073a.p() + "service/userLogout", c0Var, str);
    }

    public final Call f(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        SignService signService = this.f16065a;
        return signService.getVirtualDocDetails(a.f12073a.r() + "service/getVirtualDocs", c0Var, str);
    }

    public final Call g(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f16065a.verifyOtpDetails(c0Var, str);
    }
}
