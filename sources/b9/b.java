package b9;

import com.nic.mparivahan.Checkpost.CheckPostRepository.CheckPostService;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

public final /* synthetic */ class b implements HostnameVerifier {
    public final boolean verify(String str, SSLSession sSLSession) {
        return CheckPostService.a.c(str, sSLSession);
    }
}
