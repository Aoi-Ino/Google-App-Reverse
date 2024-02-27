package we;

import com.nic.mparivahan.VahanServices.DuplicateFitnessCertificateDownload.DFCService.DFCServices;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

public final /* synthetic */ class b implements HostnameVerifier {
    public final boolean verify(String str, SSLSession sSLSession) {
        return DFCServices.a.c(str, sSLSession);
    }
}
