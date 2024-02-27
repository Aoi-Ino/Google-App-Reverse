package ph;

import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.TOCommonService.TOCommonService;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

public final /* synthetic */ class a implements HostnameVerifier {
    public final boolean verify(String str, SSLSession sSLSession) {
        return TOCommonService.a.c(str, sSLSession);
    }
}
