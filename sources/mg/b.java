package mg;

import com.nic.mparivahan.VahanServices.RenewalOfPermit.RPSaveToDraftService.RPSaveToDraftService;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

public final /* synthetic */ class b implements HostnameVerifier {
    public final boolean verify(String str, SSLSession sSLSession) {
        return RPSaveToDraftService.a.c(str, sSLSession);
    }
}
