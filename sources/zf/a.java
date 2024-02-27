package zf;

import com.nic.mparivahan.VahanServices.PUCCCertificatesDownload.PUCCertificateServices.PUCCertifiateServices;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

public final /* synthetic */ class a implements HostnameVerifier {
    public final boolean verify(String str, SSLSession sSLSession) {
        return PUCCertifiateServices.a.c(str, sSLSession);
    }
}
