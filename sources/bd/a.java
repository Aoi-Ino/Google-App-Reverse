package bd;

import cm.l;
import com.nic.mparivahan.RC.RcInterface.RcImpoundService;
import retrofit2.Call;
import um.c0;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final RcImpoundService f4549a;

    public a(RcImpoundService rcImpoundService) {
        l.f(rcImpoundService, "retrofitService");
        this.f4549a = rcImpoundService;
    }

    public final Call a(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f4549a.checkImpoundDl(c0Var, str);
    }

    public final Call b(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f4549a.checkImpoundRc(c0Var, str);
    }
}
