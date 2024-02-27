package s8;

import cm.l;
import com.nic.mparivahan.Account.CreateAccountServices;
import retrofit2.Call;
import um.c0;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final CreateAccountServices f16064a;

    public a(CreateAccountServices createAccountServices) {
        l.f(createAccountServices, "retrofitService");
        this.f16064a = createAccountServices;
    }

    public final Call a(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f16064a.getResendOtp(c0Var, str);
    }

    public final Call b(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f16064a.getSendOtpRes(c0Var, str);
    }

    public final Call c(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        CreateAccountServices createAccountServices = this.f16064a;
        return createAccountServices.getStateMasterList(hc.a.f12073a.q() + "service/getStateMaster", c0Var, str);
    }

    public final Call d(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f16064a.getUserDetails(hc.a.f12073a.z(), c0Var, str);
    }

    public final Call e(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f16064a.verifyOtpDetails(c0Var, str);
    }
}
