package pe;

import cm.l;
import com.nic.mparivahan.VahanServices.DuplicateFitness.DuplicateFitnessService;
import retrofit2.Call;
import um.c0;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final DuplicateFitnessService f30352a;

    public a(DuplicateFitnessService duplicateFitnessService) {
        l.f(duplicateFitnessService, "retrofitService");
        this.f30352a = duplicateFitnessService;
    }

    public final Call a(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f30352a.calculateValidupto(c0Var, str);
    }

    public final Call b(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f30352a.getPermitFees(c0Var, str);
    }

    public final Call c(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f30352a.searchgoodstype(c0Var, str);
    }

    public final Call d(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f30352a.sendReqDupList(c0Var, str);
    }

    public final Call e(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f30352a.sendReqForDFC(c0Var, str);
    }

    public final Call f(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f30352a.sendReqForDP(c0Var, str);
    }

    public final Call g(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f30352a.sendReqForRCC(c0Var, str);
    }

    public final Call h(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f30352a.sendReqForRCR(c0Var, str);
    }

    public final Call i(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f30352a.sendReqForRCS(c0Var, str);
    }

    public final Call j(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f30352a.sendReqTemPermit(c0Var, str);
    }

    public final Call k(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f30352a.temPermit(c0Var, str);
    }
}
