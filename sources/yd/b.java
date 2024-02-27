package yd;

import cm.l;
import com.nic.mparivahan.VahanServices.AlterationOfVehicle.AOVServices.AOVSaveToDraftService;
import retrofit2.Call;
import um.c0;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final AOVSaveToDraftService f32827a;

    public b(AOVSaveToDraftService aOVSaveToDraftService) {
        l.f(aOVSaveToDraftService, "retrofitService");
        this.f32827a = aOVSaveToDraftService;
    }

    public final Call a(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f32827a.savetoDraftAOV(c0Var, str);
    }
}
