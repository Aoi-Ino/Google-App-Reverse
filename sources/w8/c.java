package w8;

import cm.l;
import com.nic.mparivahan.AddCov.AddCovInterface;
import retrofit2.Call;
import um.c0;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final AddCovInterface f17966a;

    public c(AddCovInterface addCovInterface) {
        l.f(addCovInterface, "retrofitService");
        this.f17966a = addCovInterface;
    }

    public final Call a(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f17966a.dataRequest(c0Var, str);
    }

    public final Call b(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f17966a.dataSubmitRequest(c0Var, str);
    }
}
