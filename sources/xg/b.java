package xg;

import com.nic.mparivahan.VahanServices.VahanService.ApplicationServiceOtp;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

public final /* synthetic */ class b implements HostnameVerifier {
    public final boolean verify(String str, SSLSession sSLSession) {
        return ApplicationServiceOtp.a.c(str, sSLSession);
    }
}
