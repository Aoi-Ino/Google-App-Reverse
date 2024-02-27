package ea;

import com.nic.mparivahan.DLServicesAuth.eKyc.AdharKyc.AdrInterface;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

public final /* synthetic */ class c implements HostnameVerifier {
    public final boolean verify(String str, SSLSession sSLSession) {
        return AdrInterface.a.c(str, sSLSession);
    }
}
