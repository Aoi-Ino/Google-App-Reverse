package w9;

import cm.l;
import com.nic.mparivahan.DLServicesAuth.CheckEligibility.FromEligCheck;
import retrofit2.Call;
import um.c0;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final FromEligCheck f17967a;

    public a(FromEligCheck fromEligCheck) {
        l.f(fromEligCheck, "retrofitService");
        this.f17967a = fromEligCheck;
    }

    public final Call a(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f17967a.FormOneInter(c0Var, str);
    }

    public final Call b(c0 c0Var, String str) {
        l.f(c0Var, "request");
        l.f(str, "currentTime");
        return this.f17967a.ServiceCheck(c0Var, str);
    }
}
