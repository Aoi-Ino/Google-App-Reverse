package xg;

import com.nic.mparivahan.VahanServices.VahanService.UpdateMobileUpdated;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

public final /* synthetic */ class e implements HostnameVerifier {
    public final boolean verify(String str, SSLSession sSLSession) {
        return UpdateMobileUpdated.a.c(str, sSLSession);
    }
}
