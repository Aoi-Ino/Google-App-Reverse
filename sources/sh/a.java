package sh;

import cm.l;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.TOPurposeData.TOPurposeService.TOPurposeService;
import retrofit2.Call;
import um.c0;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final TOPurposeService f31252a;

    public a(TOPurposeService tOPurposeService) {
        l.f(tOPurposeService, "retrofitService");
        this.f31252a = tOPurposeService;
    }

    public final Call a(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f31252a.getTOPuroposeData(c0Var, str);
    }
}
