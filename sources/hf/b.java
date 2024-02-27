package hf;

import cm.l;
import com.nic.mparivahan.VahanServices.FancyServices.FancyFeesRepository.FancyFeesServices;
import retrofit2.Call;
import um.c0;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final FancyFeesServices f24087a;

    public b(FancyFeesServices fancyFeesServices) {
        l.f(fancyFeesServices, "retrofitService");
        this.f24087a = fancyFeesServices;
    }

    public final Call a(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f24087a.validateDownloadReceipt(c0Var, str);
    }
}
