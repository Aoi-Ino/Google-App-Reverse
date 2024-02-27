package oh;

import cm.l;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.TOCommonService.TOCommonService;
import retrofit2.Call;
import um.c0;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final TOCommonService f30096a;

    public a(TOCommonService tOCommonService) {
        l.f(tOCommonService, "retrofitService");
        this.f30096a = tOCommonService;
    }

    public final Call a(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f30096a.getTOCommonServices(c0Var, str);
    }
}
