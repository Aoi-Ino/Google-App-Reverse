package wb;

import cm.l;
import com.nic.mparivahan.LLServices.editlearnerlicence.Service.EditLearnerServices;
import retrofit2.Call;
import um.c0;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final EditLearnerServices f17977a;

    public a(EditLearnerServices editLearnerServices) {
        l.f(editLearnerServices, "retrofitService");
        this.f17977a = editLearnerServices;
    }

    public final Call a(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f17977a.finalSubmit(c0Var, str);
    }

    public final Call b(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f17977a.getOtp(c0Var, str);
    }

    public final Call c(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f17977a.getEditLearnerInfo(c0Var, str);
    }
}
