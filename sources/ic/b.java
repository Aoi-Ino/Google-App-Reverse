package ic;

import cm.l;
import com.nic.mparivahan.Notifications.LocationNotiication;
import retrofit2.Call;
import um.c0;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final LocationNotiication f12667a;

    public b(LocationNotiication locationNotiication) {
        l.f(locationNotiication, "retrofitService");
        this.f12667a = locationNotiication;
    }

    public final Call a(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "timeStamp");
        return this.f12667a.getNotificationLocation(c0Var, str);
    }
}
