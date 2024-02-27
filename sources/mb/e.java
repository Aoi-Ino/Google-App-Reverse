package mb;

import cm.l;
import com.nic.mparivahan.FetchVahanLog.FetchVahanLog.VahanInterface;
import retrofit2.Call;
import um.c0;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final VahanInterface f14003a;

    public e(VahanInterface vahanInterface) {
        l.f(vahanInterface, "mVahanInterface");
        this.f14003a = vahanInterface;
    }

    public final Call a(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f14003a.dltVahanTransaction(c0Var, str);
    }

    public final Call b(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f14003a.fetchVahanLogDetails(c0Var, str);
    }
}
