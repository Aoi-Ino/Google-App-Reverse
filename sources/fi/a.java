package fi;

import cm.l;
import com.nic.mparivahan.VahanServices.VahanService.UpdateMobileUpdated;
import retrofit2.Call;
import um.c0;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final UpdateMobileUpdated f23512a;

    public a(UpdateMobileUpdated updateMobileUpdated) {
        l.f(updateMobileUpdated, "retrofit");
        this.f23512a = updateMobileUpdated;
    }

    public final Call a(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f23512a.getMobileRelatDetails(c0Var, str);
    }

    public final Call b(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f23512a.submitUpdateNo(c0Var, str);
    }

    public final Call c(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f23512a.validateAadharDetails(c0Var, str);
    }
}
