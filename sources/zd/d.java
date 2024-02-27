package zd;

import com.nic.mparivahan.VahanServices.AlterationOfVehicle.AOVServices.AOVServices;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

public final /* synthetic */ class d implements HostnameVerifier {
    public final boolean verify(String str, SSLSession sSLSession) {
        return AOVServices.a.c(str, sSLSession);
    }
}
