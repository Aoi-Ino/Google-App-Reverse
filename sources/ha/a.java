package ha;

import com.nic.mparivahan.DPTNotice.Services.NoticeService;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

public final /* synthetic */ class a implements HostnameVerifier {
    public final boolean verify(String str, SSLSession sSLSession) {
        return NoticeService.a.d(str, sSLSession);
    }
}
