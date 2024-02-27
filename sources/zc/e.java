package zc;

import com.nic.mparivahan.RC.RcInterface.RcService;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

public final /* synthetic */ class e implements HostnameVerifier {
    public final boolean verify(String str, SSLSession sSLSession) {
        return RcService.a.d(str, sSLSession);
    }
}
