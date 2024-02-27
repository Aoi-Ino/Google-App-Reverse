package g6;

import java.security.SecureRandom;

public abstract class u {

    /* renamed from: a  reason: collision with root package name */
    private static final ThreadLocal f11710a = new a();

    class a extends ThreadLocal {
        a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public SecureRandom initialValue() {
            return u.b();
        }
    }

    /* access modifiers changed from: private */
    public static SecureRandom b() {
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextLong();
        return secureRandom;
    }

    public static byte[] c(int i10) {
        byte[] bArr = new byte[i10];
        ((SecureRandom) f11710a.get()).nextBytes(bArr);
        return bArr;
    }
}
