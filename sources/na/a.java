package na;

import com.nic.mparivahan.Dashboard.EnabledServices.Interfaces.ESInterface;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

public final /* synthetic */ class a implements HostnameVerifier {
    public final boolean verify(String str, SSLSession sSLSession) {
        return ESInterface.a.d(str, sSLSession);
    }
}
