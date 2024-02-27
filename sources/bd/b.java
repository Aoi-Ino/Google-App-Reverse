package bd;

import cm.l;
import com.nic.mparivahan.RC.RcInterface.RcService;
import hc.a;
import retrofit2.Call;
import um.c0;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final RcService f4550a;

    public b(RcService rcService) {
        l.f(rcService, "retrofitService");
        this.f4550a = rcService;
    }

    public final Call a(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f4550a.UpdateVirtualRC(c0Var, str);
    }

    public final Call b(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        RcService rcService = this.f4550a;
        return rcService.deletMyDoc(a.f12073a.r() + "service/deactivateVirtualDocs", c0Var, str);
    }

    public final Call c(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        RcService rcService = this.f4550a;
        return rcService.deletSharedDoc(a.f12073a.r() + "service/deleteSharedDoc", c0Var, str);
    }

    public final Call d(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f4550a.getRcValues(c0Var, str);
    }

    public final Call e(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        RcService rcService = this.f4550a;
        return rcService.getSharedDoc(a.f12073a.r() + "service/getSharedDocList", c0Var, str);
    }

    public final Call f(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f4550a.getUserDetails(a.f12073a.z(), c0Var, str);
    }

    public final Call g(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        RcService rcService = this.f4550a;
        return rcService.getVirtualDocDetails(a.f12073a.r() + "service/getVirtualDocs", c0Var, str);
    }

    public final Call h(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        RcService rcService = this.f4550a;
        return rcService.sharedDoc(a.f12073a.r() + "service/createSharedDoc", c0Var, str);
    }

    public final Call i(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        RcService rcService = this.f4550a;
        return rcService.updateVirtualDoc(a.f12073a.r() + "service/updateVirtualDocs", c0Var, str);
    }

    public final Call j(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f4550a.validateRc(c0Var, str);
    }
}
