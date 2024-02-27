package xg;

import com.nic.mparivahan.VahanServices.VahanService.DownloadReceiptService;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

public final /* synthetic */ class c implements HostnameVerifier {
    public final boolean verify(String str, SSLSession sSLSession) {
        return DownloadReceiptService.a.c(str, sSLSession);
    }
}
