package je;

import cm.l;
import com.nic.mparivahan.VahanServices.DMS.DInterface.DMSService;
import retrofit2.Call;
import um.c0;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final DMSService f24542a;

    public a(DMSService dMSService) {
        l.f(dMSService, "retrofitService");
        this.f24542a = dMSService;
    }

    public final Call a(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "timeStamp");
        return this.f24542a.UpdateDoc(c0Var, str);
    }

    public final Call b(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "timeStamp");
        return this.f24542a.dmsConfig(c0Var, str);
    }

    public final Call c(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "timeStamp");
        return this.f24542a.uploadDMS(c0Var, str);
    }

    public final Call d(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "timeStamp");
        return this.f24542a.viewUplDoc(c0Var, str);
    }
}
