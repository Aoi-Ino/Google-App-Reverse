package xg;

import com.nic.mparivahan.VahanServices.VahanService.VahanServiceConnection;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

public final /* synthetic */ class g implements HostnameVerifier {
    public final boolean verify(String str, SSLSession sSLSession) {
        return VahanServiceConnection.a.c(str, sSLSession);
    }
}
