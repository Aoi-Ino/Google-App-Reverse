package o6;

import java.io.UnsupportedEncodingException;

public abstract class b {
    public static byte[] a(String str, String str2) {
        a.b(str, "Input");
        a.a(str2, "Charset");
        try {
            return str.getBytes(str2);
        } catch (UnsupportedEncodingException unused) {
            return str.getBytes();
        }
    }
}
