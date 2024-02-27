package pf;

import com.nic.mparivahan.VahanServices.HPA.Network.HServices;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

public final /* synthetic */ class a implements HostnameVerifier {
    public final boolean verify(String str, SSLSession sSLSession) {
        return HServices.a.c(str, sSLSession);
    }
}
