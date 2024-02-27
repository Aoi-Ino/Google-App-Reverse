package ze;

import com.nic.mparivahan.VahanServices.FancyServices.AllotmentLetterServices.AllotmentLetterRetrofitServices;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

public final /* synthetic */ class c implements HostnameVerifier {
    public final boolean verify(String str, SSLSession sSLSession) {
        return AllotmentLetterRetrofitServices.a.c(str, sSLSession);
    }
}
