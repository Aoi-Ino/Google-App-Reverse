package ne;

import cm.l;
import com.nic.mparivahan.VahanServices.VahanService.DownloadReceiptService;
import retrofit2.Call;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final DownloadReceiptService f25127a;

    public a(DownloadReceiptService downloadReceiptService) {
        l.f(downloadReceiptService, "retrofitService");
        this.f25127a = downloadReceiptService;
    }

    public final Call a(String str, String str2, String str3) {
        l.f(str, "application_no");
        l.f(str2, "rc_number");
        l.f(str3, "chassi");
        return this.f25127a.validateDownloadReceipt(str, str2, str3);
    }
}
