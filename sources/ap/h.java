package ap;

import java.security.AccessController;
import java.security.PrivilegedAction;

public abstract class h {

    /* renamed from: a  reason: collision with root package name */
    private static String f19427a;

    static class a implements PrivilegedAction {
        a() {
        }

        /* renamed from: a */
        public String run() {
            return System.getProperty("line.separator");
        }
    }

    static {
        try {
            f19427a = (String) AccessController.doPrivileged(new a());
        } catch (Exception unused) {
            try {
                f19427a = String.format("%n", new Object[0]);
            } catch (Exception unused2) {
                f19427a = "\n";
            }
        }
    }

    public static char[] a(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length];
        for (int i10 = 0; i10 != length; i10++) {
            cArr[i10] = (char) (bArr[i10] & 255);
        }
        return cArr;
    }

    public static String b(byte[] bArr) {
        return new String(a(bArr));
    }

    public static String c(byte[] bArr) {
        char[] cArr = new char[bArr.length];
        int b10 = bp.h.b(bArr, cArr);
        if (b10 >= 0) {
            return new String(cArr, 0, b10);
        }
        throw new IllegalArgumentException("Invalid UTF-8 input");
    }

    public static byte[] d(String str) {
        int length = str.length();
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 != length; i10++) {
            bArr[i10] = (byte) str.charAt(i10);
        }
        return bArr;
    }

    public static String e(String str) {
        char[] charArray = str.toCharArray();
        boolean z10 = false;
        for (int i10 = 0; i10 != charArray.length; i10++) {
            char c10 = charArray[i10];
            if ('A' <= c10 && 'Z' >= c10) {
                charArray[i10] = (char) (c10 + ' ');
                z10 = true;
            }
        }
        return z10 ? new String(charArray) : str;
    }
}
