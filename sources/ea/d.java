package ea;

import cm.l;
import com.nic.mparivahan.DLServicesAuth.eKyc.AdharKyc.AdrInterface;
import retrofit2.Call;
import um.c0;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final AdrInterface f11129a;

    public d(AdrInterface adrInterface) {
        l.f(adrInterface, "retrofitService");
        this.f11129a = adrInterface;
    }

    public final Call a(c0 c0Var) {
        l.f(c0Var, "requestBody");
        return this.f11129a.doSarAadhaarRequest(c0Var);
    }
}
