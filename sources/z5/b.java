package z5;

import g6.g;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Logger;
import y5.p;
import y5.q;
import y5.r;

public class b implements q {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final Logger f18893a = Logger.getLogger(b.class.getName());

    /* renamed from: z5.b$b  reason: collision with other inner class name */
    private static class C0250b implements y5.a {

        /* renamed from: a  reason: collision with root package name */
        private final p f18894a;

        private C0250b(p pVar) {
            this.f18894a = pVar;
        }

        public byte[] a(byte[] bArr, byte[] bArr2) {
            return g.a(this.f18894a.b().a(), ((y5.a) this.f18894a.b().c()).a(bArr, bArr2));
        }

        public byte[] b(byte[] bArr, byte[] bArr2) {
            if (bArr.length > 5) {
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 5);
                byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 5, bArr.length);
                for (p.b c10 : this.f18894a.c(copyOfRange)) {
                    try {
                        return ((y5.a) c10.c()).b(copyOfRange2, bArr2);
                    } catch (GeneralSecurityException e10) {
                        Logger d10 = b.f18893a;
                        d10.info("ciphertext prefix matches a key, but cannot decrypt: " + e10.toString());
                    }
                }
            }
            for (p.b c11 : this.f18894a.e()) {
                try {
                    return ((y5.a) c11.c()).b(bArr, bArr2);
                } catch (GeneralSecurityException unused) {
                }
            }
            throw new GeneralSecurityException("decryption failed");
        }
    }

    b() {
    }

    public static void e() {
        r.r(new b());
    }

    public Class a() {
        return y5.a.class;
    }

    public Class c() {
        return y5.a.class;
    }

    /* renamed from: f */
    public y5.a b(p pVar) {
        return new C0250b(pVar);
    }
}
