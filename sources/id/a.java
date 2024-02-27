package id;

import android.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    private static final byte[] f12674a = b();

    public static String a(String str, String str2) {
        byte[] bArr;
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes(), "AES");
            Cipher instance = Cipher.getInstance("AES/ECB/PKCS5Padding");
            instance.init(1, secretKeySpec);
            bArr = instance.doFinal(str.getBytes());
        } catch (Exception e10) {
            System.out.println(e10.toString());
            bArr = null;
        }
        return new String(Base64.encodeToString(bArr, 0));
    }

    private static byte[] b() {
        byte[] bArr = new byte[128];
        for (int i10 = 0; i10 < 128; i10++) {
            bArr[i10] = -1;
        }
        for (int i11 = 65; i11 <= 90; i11++) {
            bArr[i11] = (byte) (i11 - 65);
        }
        for (int i12 = 97; i12 <= 122; i12++) {
            bArr[i12] = (byte) (i12 - 71);
        }
        for (int i13 = 48; i13 <= 57; i13++) {
            bArr[i13] = (byte) (i13 + 4);
        }
        bArr[43] = 62;
        bArr[47] = 63;
        bArr[61] = Byte.MAX_VALUE;
        return bArr;
    }
}
