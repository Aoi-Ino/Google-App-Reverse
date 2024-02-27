package wg;

import cm.l;
import com.nic.mparivahan.VahanServices.VahanService.UpdateMobileNoService;
import retrofit2.Call;
import um.c0;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final UpdateMobileNoService f32568a;

    public c(UpdateMobileNoService updateMobileNoService) {
        l.f(updateMobileNoService, "retrofit");
        this.f32568a = updateMobileNoService;
    }

    public final Call a(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f32568a.getUserDetails(c0Var, str);
    }

    public final Call b(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f32568a.submitUpdateNo(c0Var, str);
    }

    public final Call c(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f32568a.validateAadharDetails(c0Var, str);
    }
}
