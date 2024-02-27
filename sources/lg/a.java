package lg;

import cm.l;
import com.nic.mparivahan.VahanServices.RenewalOfPermit.RPSaveToDraftService.RPSaveToDraftService;
import retrofit2.Call;
import um.c0;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final RPSaveToDraftService f24823a;

    public a(RPSaveToDraftService rPSaveToDraftService) {
        l.f(rPSaveToDraftService, "retrofitService");
        this.f24823a = rPSaveToDraftService;
    }

    public final Call a(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f24823a.savetoDrfatRP(c0Var, str);
    }
}
