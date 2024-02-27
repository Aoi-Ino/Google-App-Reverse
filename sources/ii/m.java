package ii;

import com.nic.mparivahan.Welcome.VersionService;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

public final /* synthetic */ class m implements HostnameVerifier {
    public final boolean verify(String str, SSLSession sSLSession) {
        return VersionService.a.e(str, sSLSession);
    }
}
