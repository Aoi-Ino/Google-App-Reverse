package b9;

import cm.l;
import com.nic.mparivahan.Checkpost.CheckPostRepository.CheckPostService;
import retrofit2.Call;
import um.c0;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final CheckPostService f4487a;

    public a(CheckPostService checkPostService) {
        l.f(checkPostService, "retrofitService");
        this.f4487a = checkPostService;
    }

    public final Call a(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f4487a.getDetailsCheckPost(c0Var, str);
    }

    public final Call b(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f4487a.getDetailsCheckPostVehicle(c0Var, str);
    }
}
