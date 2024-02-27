package mk;

import cm.l;
import com.nic.mparivahan.fetchSarathiLog.FetchSarathiAssets.SarathiInterface;
import retrofit2.Call;
import um.c0;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final SarathiInterface f25112a;

    public e(SarathiInterface sarathiInterface) {
        l.f(sarathiInterface, "mSarathiInterface");
        this.f25112a = sarathiInterface;
    }

    public final Call a(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f25112a.dltSarathiTransaction(c0Var, str);
    }

    public final Call b(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f25112a.fetchSarathiinterface(c0Var, str);
    }
}
