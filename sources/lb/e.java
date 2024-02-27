package lb;

import cm.l;
import com.nic.mparivahan.FetchChallanLog.FetchChallanAssets.FetchChallaInterface;
import retrofit2.Call;
import um.c0;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final FetchChallaInterface f13470a;

    public e(FetchChallaInterface fetchChallaInterface) {
        l.f(fetchChallaInterface, "mFetchChallaInterface");
        this.f13470a = fetchChallaInterface;
    }

    public final Call a(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f13470a.dltChallanTransaction(c0Var, str);
    }

    public final Call b(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f13470a.fetchChallanInter(c0Var, str);
    }
}
