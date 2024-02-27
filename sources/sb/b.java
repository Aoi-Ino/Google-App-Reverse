package sb;

import cm.l;
import com.nic.mparivahan.LLServices.LlInterface;
import retrofit2.Call;
import um.c0;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final LlInterface f16125a;

    public b(LlInterface llInterface) {
        l.f(llInterface, "retrofitService");
        this.f16125a = llInterface;
    }

    public final Call a(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f16125a.getLlData(c0Var, str);
    }

    public final Call b(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f16125a.submitLlAPI(c0Var, str);
    }
}
