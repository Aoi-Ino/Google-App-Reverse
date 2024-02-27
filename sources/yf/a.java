package yf;

import cm.l;
import com.nic.mparivahan.VahanServices.PUCCCertificatesDownload.PUCCertificateServices.PUCCertifiateServices;
import retrofit2.Call;
import um.c0;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final PUCCertifiateServices f32868a;

    public a(PUCCertifiateServices pUCCertifiateServices) {
        l.f(pUCCertifiateServices, "retrofitService");
        this.f32868a = pUCCertifiateServices;
    }

    public final Call a(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f32868a.validateDownloadReceipt(c0Var, str);
    }
}
