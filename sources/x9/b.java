package x9;

import cm.l;
import com.nic.mparivahan.DLServicesAuth.Forms.FormsInterface;
import retrofit2.Call;
import um.c0;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final FormsInterface f18242a;

    public b(FormsInterface formsInterface) {
        l.f(formsInterface, "retrofitService");
        this.f18242a = formsInterface;
    }

    public final Call a(c0 c0Var, String str, String str2) {
        l.f(c0Var, "requestBody");
        l.f(str, "apl");
        l.f(str2, "db");
        return this.f18242a.getForm1AData(str, str2);
    }

    public final Call b(c0 c0Var, String str, String str2) {
        l.f(c0Var, "requestBody");
        l.f(str, "apl");
        l.f(str2, "db");
        return this.f18242a.getForm2Data(str, str2);
    }
}
