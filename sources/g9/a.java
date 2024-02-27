package g9;

import com.nic.mparivahan.Citizen.Interfaces.OffenceInterface;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

public final /* synthetic */ class a implements HostnameVerifier {
    public final boolean verify(String str, SSLSession sSLSession) {
        return OffenceInterface.a.c(str, sSLSession);
    }
}
