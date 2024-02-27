package jh;

import cm.l;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.TOBuyer.TOBuyerApplication.TOBuyerApplicationService.TOBuyerApplicationService;
import retrofit2.Call;
import um.c0;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final TOBuyerApplicationService f24570a;

    public a(TOBuyerApplicationService tOBuyerApplicationService) {
        l.f(tOBuyerApplicationService, "retrofitService");
        this.f24570a = tOBuyerApplicationService;
    }

    public final Call a(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f24570a.getApplicantDetail(c0Var, str);
    }

    public final Call b(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f24570a.getSelledetailsByRcChassis(c0Var, str);
    }
}
