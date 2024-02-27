package cg;

import cm.l;
import com.nic.mparivahan.VahanServices.RenewalOfNpAuthorizationPermit.RenewalOfNPAPermitService.RenewalOfNPAPermitService;
import retrofit2.Call;
import um.c0;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final RenewalOfNPAPermitService f20045a;

    public a(RenewalOfNPAPermitService renewalOfNPAPermitService) {
        l.f(renewalOfNPAPermitService, "retrofitService");
        this.f20045a = renewalOfNPAPermitService;
    }

    public final Call a(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f20045a.getNPAPermitResponse(c0Var, str);
    }
}
