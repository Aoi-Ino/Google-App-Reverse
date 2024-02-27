package mc;

import com.nic.mparivahan.ProfileDetails.ProfileInterface.UserBloodDetails;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

public final /* synthetic */ class a implements HostnameVerifier {
    public final boolean verify(String str, SSLSession sSLSession) {
        return UserBloodDetails.a.d(str, sSLSession);
    }
}
