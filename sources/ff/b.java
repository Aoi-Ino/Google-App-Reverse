package ff;

import com.nic.mparivahan.VahanServices.FancyServices.AvailableFancyService.AvailableFancyService;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

public final /* synthetic */ class b implements HostnameVerifier {
    public final boolean verify(String str, SSLSession sSLSession) {
        return AvailableFancyService.a.e(str, sSLSession);
    }
}
