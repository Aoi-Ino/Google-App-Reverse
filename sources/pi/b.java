package pi;

import cm.l;
import com.nic.mparivahan.dlservices.DupChangeAdd.DupChangeAddInterface;
import retrofit2.Call;
import um.c0;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final DupChangeAddInterface f30365a;

    public b(DupChangeAddInterface dupChangeAddInterface) {
        l.f(dupChangeAddInterface, "retrofitService");
        this.f30365a = dupChangeAddInterface;
    }

    public final Call a(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f30365a.DupChangeAdd(c0Var, str);
    }
}
