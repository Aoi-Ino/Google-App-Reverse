package ji;

import cm.l;
import com.nic.mparivahan.Welcome.VersionService;
import hc.a;
import retrofit2.Call;
import um.c0;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final VersionService f24573a;

    public c(VersionService versionService) {
        l.f(versionService, "retrofitService");
        this.f24573a = versionService;
    }

    public final Call a(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f24573a.getServiceEnabledStates(c0Var, str);
    }

    public final Call b(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f24573a.getStateMasterList(c0Var, str);
    }

    public final Call c(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        VersionService versionService = this.f24573a;
        return versionService.getVersion(a.f12073a.f() + "mparivahan/version/service/getVersion", c0Var, str);
    }
}
