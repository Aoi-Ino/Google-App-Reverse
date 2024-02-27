package tf;

import com.nic.mparivahan.VahanServices.MiscellaneousFeePayment.MFPService.MFPService;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

public final /* synthetic */ class b implements HostnameVerifier {
    public final boolean verify(String str, SSLSession sSLSession) {
        return MFPService.a.c(str, sSLSession);
    }
}
