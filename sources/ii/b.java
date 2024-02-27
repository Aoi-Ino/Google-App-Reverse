package ii;

import com.nic.mparivahan.Welcome.NapixService;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

public final /* synthetic */ class b implements HostnameVerifier {
    public final boolean verify(String str, SSLSession sSLSession) {
        return NapixService.a.d(str, sSLSession);
    }
}
