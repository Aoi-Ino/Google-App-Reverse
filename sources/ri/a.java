package ri;

import cm.l;
import com.nic.mparivahan.dlservices.ReplacementCOA.RepCOAInterface;
import retrofit2.Call;
import um.c0;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final RepCOAInterface f31062a;

    public a(RepCOAInterface repCOAInterface) {
        l.f(repCOAInterface, "retrofitService");
        this.f31062a = repCOAInterface;
    }

    public final Call a(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f31062a.repCOAInterface(c0Var, str);
    }
}
