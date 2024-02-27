package zd;

import com.nic.mparivahan.VahanServices.AlterationOfVehicle.AOVServices.AOVSaveToDraftService;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

public final /* synthetic */ class c implements HostnameVerifier {
    public final boolean verify(String str, SSLSession sSLSession) {
        return AOVSaveToDraftService.a.c(str, sSLSession);
    }
}
