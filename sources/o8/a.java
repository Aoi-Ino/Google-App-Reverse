package o8;

import com.nic.mparivahan.Account.CreateAccountServices;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

public final /* synthetic */ class a implements HostnameVerifier {
    public final boolean verify(String str, SSLSession sSLSession) {
        return CreateAccountServices.a.d(str, sSLSession);
    }
}
