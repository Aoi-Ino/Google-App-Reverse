package rd;

import cm.l;
import com.nic.mparivahan.Tax.PaytaxService;
import retrofit2.Call;
import um.c0;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    private final PaytaxService f31030a;

    public h(PaytaxService paytaxService) {
        l.f(paytaxService, "retrofitService");
        this.f31030a = paytaxService;
    }

    public final Call a(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f31030a.beforepayment(c0Var, str);
    }

    public final Call b(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f31030a.getafterpayment(c0Var, str);
    }

    public final Call c(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f31030a.gettaxModeListener(c0Var, str);
    }

    public final Call d(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f31030a.getvahancapi(c0Var, str);
    }
}
