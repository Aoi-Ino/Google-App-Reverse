package si;

import hn.a;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import um.z;

public abstract class c {

    class a implements X509TrustManager {
        a() {
        }

        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        }

        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        }

        public X509Certificate[] getAcceptedIssuers() {
            return new X509Certificate[0];
        }
    }

    class b implements HostnameVerifier {
        b() {
        }

        public boolean verify(String str, SSLSession sSLSession) {
            return true;
        }
    }

    public static z a() {
        try {
            hn.a d10 = new hn.a().d(a.C0302a.BODY);
            TrustManager[] trustManagerArr = {new a()};
            SSLContext instance = SSLContext.getInstance("SSL");
            instance.init((KeyManager[]) null, trustManagerArr, new SecureRandom());
            SSLSocketFactory socketFactory = instance.getSocketFactory();
            z.a aVar = new z.a();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            z.a M = aVar.d(15, timeUnit).J(15, timeUnit).M(15, timeUnit);
            M.L(socketFactory, (X509TrustManager) trustManagerArr[0]);
            M.a(d10);
            M.I(new b());
            return M.c();
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }
}
