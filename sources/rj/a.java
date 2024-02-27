package rj;

import cm.l;
import com.nic.mparivahan.dlservices.ui.editlearnerlicence.Service.NewDLService;
import retrofit2.Call;
import um.c0;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final NewDLService f31072a;

    public a(NewDLService newDLService) {
        l.f(newDLService, "retrofitService");
        this.f31072a = newDLService;
    }

    public final Call a(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f31072a.checkLLExitOrNot(c0Var, str);
    }

    public final Call b(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f31072a.getDrivingSchoolList(c0Var, str);
    }

    public final Call c(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f31072a.submitDlRequest(c0Var, str);
    }
}
