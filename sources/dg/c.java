package dg;

import com.nic.mparivahan.VahanServices.RenewalOfNpAuthorizationPermit.RenewalOfNPAPermitService.RenewalOfNPARepositorySaveToDraftService;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

public final /* synthetic */ class c implements HostnameVerifier {
    public final boolean verify(String str, SSLSession sSLSession) {
        return RenewalOfNPARepositorySaveToDraftService.a.c(str, sSLSession);
    }
}
