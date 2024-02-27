package wh;

import cm.l;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.TOSaveToDraftRepository.TOSaveToDraftService;
import retrofit2.Call;
import um.c0;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final TOSaveToDraftService f32573a;

    public b(TOSaveToDraftService tOSaveToDraftService) {
        l.f(tOSaveToDraftService, "retrofitService");
        this.f32573a = tOSaveToDraftService;
    }

    public final Call a(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f32573a.savetoDrfatTO(c0Var, str);
    }
}
