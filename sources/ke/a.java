package ke;

import com.nic.mparivahan.VahanServices.DMS.DInterface.DMSService;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

public final /* synthetic */ class a implements HostnameVerifier {
    public final boolean verify(String str, SSLSession sSLSession) {
        return DMSService.a.c(str, sSLSession);
    }
}
