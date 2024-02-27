package pc;

import cm.l;
import com.nic.mparivahan.ProfileDetails.ProfileInterface.UserBloodDetails;
import retrofit2.Call;
import um.c0;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final UserBloodDetails f14909a;

    public a(UserBloodDetails userBloodDetails) {
        l.f(userBloodDetails, "retrofitService");
        this.f14909a = userBloodDetails;
    }

    public final Call a(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "timeStamp");
        UserBloodDetails userBloodDetails = this.f14909a;
        return userBloodDetails.getBloodDetails(hc.a.f12073a.q() + "service/getBloodGroupMast", c0Var, str);
    }

    public final Call b(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "timeStamp");
        return this.f14909a.getCitizenProfile(c0Var, str);
    }

    public final Call c(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "timeStamp");
        return this.f14909a.updatestateInterface(c0Var, str);
    }
}
