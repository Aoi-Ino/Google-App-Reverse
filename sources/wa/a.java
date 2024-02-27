package wa;

import com.nic.mparivahan.Dl.DlInterface.DlService;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

public final /* synthetic */ class a implements HostnameVerifier {
    public final boolean verify(String str, SSLSession sSLSession) {
        return DlService.a.d(str, sSLSession);
    }
}
