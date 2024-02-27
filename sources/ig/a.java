package ig;

import cm.l;
import com.nic.mparivahan.VahanServices.RenewalOfPermit.RPDataServices.RPDataService;
import retrofit2.Call;
import um.c0;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final RPDataService f24339a;

    public a(RPDataService rPDataService) {
        l.f(rPDataService, "retrofitService");
        this.f24339a = rPDataService;
    }

    public final Call a(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f24339a.sendReqDupList(c0Var, str);
    }
}
