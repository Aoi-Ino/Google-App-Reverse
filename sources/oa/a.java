package oa;

import cm.l;
import com.nic.mparivahan.Dashboard.EnabledServices.Interfaces.ESInterface;
import retrofit2.Call;
import um.c0;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final ESInterface f14459a;

    public a(ESInterface eSInterface) {
        l.f(eSInterface, "mESInterface");
        this.f14459a = eSInterface;
    }

    public final Call a(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f14459a.getEnableService(c0Var, str);
    }
}
