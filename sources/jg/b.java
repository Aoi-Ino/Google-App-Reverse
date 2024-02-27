package jg;

import com.nic.mparivahan.VahanServices.RenewalOfPermit.RPDataServices.RPDataService;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

public final /* synthetic */ class b implements HostnameVerifier {
    public final boolean verify(String str, SSLSession sSLSession) {
        return RPDataService.a.c(str, sSLSession);
    }
}
