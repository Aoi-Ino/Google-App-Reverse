package ab;

import cm.l;
import com.nic.mparivahan.DlCombineServices.CombineServiceInterface;
import retrofit2.Call;
import um.c0;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final CombineServiceInterface f391a;

    public a(CombineServiceInterface combineServiceInterface) {
        l.f(combineServiceInterface, "retrofitService");
        this.f391a = combineServiceInterface;
    }

    public final Call a(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "timeStamp");
        return this.f391a.getAckDetForGivenDLNumber(c0Var, str);
    }
}
