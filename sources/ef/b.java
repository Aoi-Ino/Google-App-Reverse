package ef;

import cm.l;
import com.nic.mparivahan.VahanServices.FancyServices.AvailableFancyService.AvailableFancyService;
import retrofit2.Call;
import um.c0;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final AvailableFancyService f22951a;

    public b(AvailableFancyService availableFancyService) {
        l.f(availableFancyService, "retrofitService");
        this.f22951a = availableFancyService;
    }

    public final Call a(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f22951a.searchAvailbaleFancy(c0Var, str);
    }
}
