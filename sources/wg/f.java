package wg;

import cm.l;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanService.VahanXmlService;
import retrofit2.Call;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    private final VahanXmlService f32571a;

    public f(VahanXmlService vahanXmlService) {
        l.f(vahanXmlService, "retrofitService");
        this.f32571a = vahanXmlService;
    }

    public final Call a(String str, String str2, String str3, String str4) {
        l.f(str, "state_code");
        l.f(str2, "appl_no");
        l.f(str3, "rc_no");
        l.f(str4, VContant.PURPOSE_CODE);
        return this.f32571a.getDmsUrl(str, str2, str3, str4);
    }
}
