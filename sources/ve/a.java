package ve;

import cm.l;
import com.nic.mparivahan.VahanServices.DuplicateFitnessCertificateDownload.DFCService.DFCServices;
import retrofit2.Call;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final DFCServices f32268a;

    public a(DFCServices dFCServices) {
        l.f(dFCServices, "retrofitService");
        this.f32268a = dFCServices;
    }

    public final Call a(String str) {
        l.f(str, "applNo");
        return this.f32268a.validateDownloadReceipt(str);
    }
}
