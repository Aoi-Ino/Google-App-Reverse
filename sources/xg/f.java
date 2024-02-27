package xg;

import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

public final /* synthetic */ class f implements HostnameVerifier {
    public final boolean verify(String str, SSLSession sSLSession) {
        return VahanProService.a.c(str, sSLSession);
    }
}
