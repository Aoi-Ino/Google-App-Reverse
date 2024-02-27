package ib;

import com.nic.mparivahan.Echallan.Networking.SearchChallanService;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

public final /* synthetic */ class b implements HostnameVerifier {
    public final boolean verify(String str, SSLSession sSLSession) {
        return SearchChallanService.a.f(str, sSLSession);
    }
}
