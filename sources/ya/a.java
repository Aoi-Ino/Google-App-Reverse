package ya;

import cm.l;
import com.nic.mparivahan.Dl.DlInterface.DlService;
import retrofit2.Call;
import um.c0;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final DlService f18645a;

    public a(DlService dlService) {
        l.f(dlService, "retrofitService");
        this.f18645a = dlService;
    }

    public final Call a(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f18645a.dldetailWithOutDob(c0Var, str);
    }

    public final Call b(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f18645a.getDlDetails_new(c0Var, str);
    }

    public final Call c(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        DlService dlService = this.f18645a;
        return dlService.updateVirtualDl(hc.a.f12073a.r() + "service/updateVirtualDocs", c0Var, str);
    }
}
