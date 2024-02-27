package in;

import cm.l;
import km.d;

public abstract class b {
    public static final byte[] a(String str) {
        l.f(str, "$this$asUtf8ToByteArray");
        byte[] bytes = str.getBytes(d.f24740b);
        l.e(bytes, "(this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    public static final String b(byte[] bArr) {
        l.f(bArr, "$this$toUtf8String");
        return new String(bArr, d.f24740b);
    }
}
