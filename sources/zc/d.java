package zc;

import com.nic.mparivahan.RC.RcInterface.RcImpoundService;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

public final /* synthetic */ class d implements HostnameVerifier {
    public final boolean verify(String str, SSLSession sSLSession) {
        return RcImpoundService.a.c(str, sSLSession);
    }
}
