package ze;

import cm.l;
import com.nic.mparivahan.VahanServices.FancyServices.AllotmentLetterServices.AllotmentLetterRetrofitServices;
import retrofit2.Call;
import um.c0;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final AllotmentLetterRetrofitServices f33158a;

    public b(AllotmentLetterRetrofitServices allotmentLetterRetrofitServices) {
        l.f(allotmentLetterRetrofitServices, "retrofitService");
        this.f33158a = allotmentLetterRetrofitServices;
    }

    public final Call a(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f33158a.allotmentLetter(c0Var, str);
    }
}
