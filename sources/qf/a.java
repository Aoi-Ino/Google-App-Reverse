package qf;

import cm.l;
import com.nic.mparivahan.VahanServices.HPA.Network.HServices;
import retrofit2.Call;
import um.c0;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final HServices f30599a;

    public a(HServices hServices) {
        l.f(hServices, "retrofitService");
        this.f30599a = hServices;
    }

    public final Call a(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f30599a.RequestForHpa(c0Var, str);
    }

    public final Call b(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f30599a.getHtpType(c0Var, str);
    }

    public final Call c(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f30599a.getStateMasterList(c0Var, str);
    }

    public final Call d(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f30599a.getdistict(c0Var, str);
    }
}
