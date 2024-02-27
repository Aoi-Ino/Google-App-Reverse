package ed;

import cm.l;
import com.nic.mparivahan.Sarathithreeservices.network.GetApplStatusService;
import retrofit2.Call;
import um.c0;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final GetApplStatusService f11170a;

    public a(GetApplStatusService getApplStatusService) {
        l.f(getApplStatusService, "getAppInfoService");
        this.f11170a = getApplStatusService;
    }

    public final Call a(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f11170a.getAppInfoCall(c0Var, str);
    }

    public final Call b(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f11170a.getAppStatus(c0Var, str);
    }

    public final Call c(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f11170a.getSlotPdf(c0Var, str);
    }
}
