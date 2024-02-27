package nd;

import com.nic.mparivahan.Sos.NetworkServices.SOSService;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

public final /* synthetic */ class a implements HostnameVerifier {
    public final boolean verify(String str, SSLSession sSLSession) {
        return SOSService.a.c(str, sSLSession);
    }
}
