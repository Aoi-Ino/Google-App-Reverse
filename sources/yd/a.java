package yd;

import cm.l;
import com.nic.mparivahan.VahanServices.AlterationOfVehicle.AOVServices.AOVServices;
import retrofit2.Call;
import um.c0;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final AOVServices f32826a;

    public a(AOVServices aOVServices) {
        l.f(aOVServices, "retrofitService");
        this.f32826a = aOVServices;
    }

    public final Call a(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f32826a.getAOVData(c0Var, str);
    }
}
