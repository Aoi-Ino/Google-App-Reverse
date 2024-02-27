package v9;

import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import java.util.HashMap;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

public abstract class k {

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

    public static HashMap a() {
        try {
            HashMap hashMap = new HashMap();
            TrustManager[] trustManagerArr = {new a()};
            SSLContext instance = SSLContext.getInstance("SSL");
            instance.init((KeyManager[]) null, trustManagerArr, new SecureRandom());
            hashMap.put("sslSocketFactory", instance.getSocketFactory());
            hashMap.put("trustAllCerts", (X509TrustManager) trustManagerArr[0]);
            return hashMap;
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }
}
