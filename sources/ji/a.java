package ji;

import cm.l;
import com.nic.mparivahan.Language.LanguageService;
import retrofit2.Call;
import um.c0;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final LanguageService f24571a;

    public a(LanguageService languageService) {
        l.f(languageService, "retrofitService");
        this.f24571a = languageService;
    }

    public final Call a(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f24571a.getLanguageDetails(c0Var, str);
    }

    public final Call b(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f24571a.getLanguageValRepo(c0Var, str);
    }
}
