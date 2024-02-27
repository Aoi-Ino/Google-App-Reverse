package ge;

import com.nic.mparivahan.VahanServices.CompoundingFee.CompoundFeeServices;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

public final /* synthetic */ class a implements HostnameVerifier {
    public final boolean verify(String str, SSLSession sSLSession) {
        return CompoundFeeServices.a.c(str, sSLSession);
    }
}
