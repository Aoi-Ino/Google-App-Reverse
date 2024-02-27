package zi;

import cm.l;
import java.nio.charset.Charset;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import km.d;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f33201a = new a();

    private a() {
    }

    public final String a(String str, String str2) {
        byte[] bArr;
        l.f(str, "input");
        l.f(str2, "key");
        try {
            Charset charset = d.f24740b;
            byte[] bytes = str2.getBytes(charset);
            l.e(bytes, "this as java.lang.String).getBytes(charset)");
            SecretKeySpec secretKeySpec = new SecretKeySpec(bytes, "AES");
            Cipher instance = Cipher.getInstance("AES/ECB/PKCS5Padding");
            instance.init(1, secretKeySpec);
            byte[] bytes2 = str.getBytes(charset);
            l.e(bytes2, "this as java.lang.String).getBytes(charset)");
            bArr = instance.doFinal(bytes2);
        } catch (Exception e10) {
            System.out.println(e10.toString());
            bArr = null;
        }
        byte[] n10 = ln.a.n(bArr);
        l.e(n10, "encodeBase64(...)");
        return new String(n10, d.f24740b);
    }
}
