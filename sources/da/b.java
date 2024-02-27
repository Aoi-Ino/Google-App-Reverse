package da;

import cm.l;
import com.nic.mparivahan.DLServicesAuth.eKyc.AadharInterface;
import retrofit2.Call;
import um.c0;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final AadharInterface f9873a;

    public b(AadharInterface aadharInterface) {
        l.f(aadharInterface, "retrofitService");
        this.f9873a = aadharInterface;
    }

    public final Call a(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f9873a.adharFinalApi(c0Var, str);
    }

    public final Call b(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f9873a.adharInter(c0Var, str);
    }
}
