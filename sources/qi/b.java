package qi;

import cm.l;
import com.nic.mparivahan.dlservices.RenewalCOA.RenCOAInterface;
import retrofit2.Call;
import um.c0;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final RenCOAInterface f30612a;

    public b(RenCOAInterface renCOAInterface) {
        l.f(renCOAInterface, "retrofitService");
        this.f30612a = renCOAInterface;
    }

    public final Call a(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f30612a.renewalDlCOAInterface(c0Var, str);
    }
}
