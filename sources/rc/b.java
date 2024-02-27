package rc;

import cm.l;
import com.nic.mparivahan.PushNoti.NotInterface;
import retrofit2.Call;
import um.c0;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final NotInterface f15629a;

    public b(NotInterface notInterface) {
        l.f(notInterface, "mNotInterface");
        this.f15629a = notInterface;
    }

    public final Call a(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f15629a.notInterfaceFun(c0Var, str);
    }
}
