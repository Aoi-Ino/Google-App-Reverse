package y8;

import cm.l;
import com.nic.mparivahan.CheckFormOne.SubmitFormOne.Other.SubmitInterface;
import retrofit2.Call;
import um.c0;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final SubmitInterface f18619a;

    public b(SubmitInterface submitInterface) {
        l.f(submitInterface, "retrofitService");
        this.f18619a = submitInterface;
    }

    public final Call a(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f18619a.SubmitFunction(c0Var, str);
    }
}
