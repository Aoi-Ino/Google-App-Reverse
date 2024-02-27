package sf;

import cm.l;
import com.nic.mparivahan.VahanServices.MiscellaneousFeePayment.MFPService.MFPService;
import retrofit2.Call;
import um.c0;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final MFPService f31223a;

    public a(MFPService mFPService) {
        l.f(mFPService, "retrofitService");
        this.f31223a = mFPService;
    }

    public final Call a(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f31223a.savetoDraftMFP(c0Var, str);
    }
}
