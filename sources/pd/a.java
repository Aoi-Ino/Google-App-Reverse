package pd;

import cm.l;
import com.nic.mparivahan.Sos.NetworkServices.SOSService;
import retrofit2.Call;
import um.c0;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final SOSService f14910a;

    public a(SOSService sOSService) {
        l.f(sOSService, "sosService");
        this.f14910a = sOSService;
    }

    public final Call a(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f14910a.deletContact(c0Var, str);
    }

    public final Call b(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f14910a.getContactList(c0Var, str);
    }

    public final Call c(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        SOSService sOSService = this.f14910a;
        return sOSService.getRelationMaster(hc.a.f12073a.q() + "service/getRelationMast", c0Var, str);
    }

    public final Call d(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f14910a.saveEmgContact(c0Var, str);
    }

    public final Call e(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f14910a.updatesos(c0Var, str);
    }
}
