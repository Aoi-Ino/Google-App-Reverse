package hf;

import com.nic.mparivahan.VahanServices.FancyServices.FancyFeesRepository.FancyFeesServices;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

public final /* synthetic */ class c implements HostnameVerifier {
    public final boolean verify(String str, SSLSession sSLSession) {
        return FancyFeesServices.a.c(str, sSLSession);
    }
}
