package xg;

import com.nic.mparivahan.VahanServices.VahanService.UpdateMobileNoService;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

public final /* synthetic */ class d implements HostnameVerifier {
    public final boolean verify(String str, SSLSession sSLSession) {
        return UpdateMobileNoService.a.c(str, sSLSession);
    }
}
