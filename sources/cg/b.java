package cg;

import cm.l;
import com.nic.mparivahan.VahanServices.RenewalOfNpAuthorizationPermit.RenewalOfNPAPermitService.RenewalOfNPARepositorySaveToDraftService;
import retrofit2.Call;
import um.c0;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final RenewalOfNPARepositorySaveToDraftService f20046a;

    public b(RenewalOfNPARepositorySaveToDraftService renewalOfNPARepositorySaveToDraftService) {
        l.f(renewalOfNPARepositorySaveToDraftService, "retrofitService");
        this.f20046a = renewalOfNPARepositorySaveToDraftService;
    }

    public final Call a(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f20046a.savetoDraftPermit(c0Var, str);
    }
}
