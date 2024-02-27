package xg;

import com.nic.mparivahan.VahanServices.VahanService.ApplicationService;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

public final /* synthetic */ class a implements HostnameVerifier {
    public final boolean verify(String str, SSLSession sSLSession) {
        return ApplicationService.a.c(str, sSLSession);
    }
}
