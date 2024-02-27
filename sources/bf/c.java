package bf;

import com.nic.mparivahan.VahanServices.FancyServices.AuctionStatusServices.AuctionStatusRetrofitServices;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

public final /* synthetic */ class c implements HostnameVerifier {
    public final boolean verify(String str, SSLSession sSLSession) {
        return AuctionStatusRetrofitServices.a.c(str, sSLSession);
    }
}
