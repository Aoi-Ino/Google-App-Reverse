package o8;

import com.nic.mparivahan.Account.SignService;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

public final /* synthetic */ class c implements HostnameVerifier {
    public final boolean verify(String str, SSLSession sSLSession) {
        return SignService.a.d(str, sSLSession);
    }
}
