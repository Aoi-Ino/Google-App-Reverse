package he;

import cm.l;
import com.nic.mparivahan.VahanServices.CompoundingFee.CompoundFeeServices;
import retrofit2.Call;
import um.c0;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final CompoundFeeServices f24070a;

    public b(CompoundFeeServices compoundFeeServices) {
        l.f(compoundFeeServices, "retrofitService");
        this.f24070a = compoundFeeServices;
    }

    public final Call a(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f24070a.addnomineedraft(c0Var, str);
    }

    public final Call b(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f24070a.compoundfeedl(c0Var, str);
    }

    public final Call c(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f24070a.compoundfeeothers(c0Var, str);
    }

    public final Call d(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f24070a.nomineerelation(c0Var, str);
    }
}
