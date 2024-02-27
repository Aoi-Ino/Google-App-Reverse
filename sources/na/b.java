package na;

import com.nic.mparivahan.Dashboard.EnabledServices.Interfaces.ESInterface;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

public final /* synthetic */ class b implements HostnameVerifier {
    public final boolean verify(String str, SSLSession sSLSession) {
        return ESInterface.a.e(str, sSLSession);
    }
}
