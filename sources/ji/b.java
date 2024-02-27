package ji;

import cm.l;
import com.nic.mparivahan.Welcome.NapixService;
import hc.a;
import retrofit2.Call;
import v9.j;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final NapixService f24572a;

    public b(NapixService napixService) {
        l.f(napixService, "retrofitService");
        this.f24572a = napixService;
    }

    public final Call a(String str, String str2) {
        l.f(str, "grant_type");
        l.f(str2, "scope");
        NapixService napixService = this.f24572a;
        j.a aVar = j.f17579a;
        a.C0155a aVar2 = a.f12073a;
        return napixService.getToken(str, str2, String.valueOf(aVar.a(aVar2.l()).get("KEY")), String.valueOf(aVar.a(aVar2.h()).get("KEY")));
    }
}
