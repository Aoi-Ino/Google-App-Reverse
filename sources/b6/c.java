package b6;

import g6.g;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Logger;
import y5.d;
import y5.p;
import y5.q;
import y5.r;

public class c implements q {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final Logger f4450a = Logger.getLogger(c.class.getName());

    private static class a implements d {

        /* renamed from: a  reason: collision with root package name */
        private p f4451a;

        public a(p pVar) {
            this.f4451a = pVar;
        }

        public byte[] a(byte[] bArr, byte[] bArr2) {
            return g.a(this.f4451a.b().a(), ((d) this.f4451a.b().c()).a(bArr, bArr2));
        }

        public byte[] b(byte[] bArr, byte[] bArr2) {
            if (bArr.length > 5) {
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 5);
                byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 5, bArr.length);
                for (p.b c10 : this.f4451a.c(copyOfRange)) {
                    try {
                        return ((d) c10.c()).b(copyOfRange2, bArr2);
                    } catch (GeneralSecurityException e10) {
                        Logger d10 = c.f4450a;
                        d10.info("ciphertext prefix matches a key, but cannot decrypt: " + e10.toString());
                    }
                }
            }
            for (p.b c11 : this.f4451a.e()) {
                try {
                    return ((d) c11.c()).b(bArr, bArr2);
                } catch (GeneralSecurityException unused) {
                }
            }
            throw new GeneralSecurityException("decryption failed");
        }
    }

    c() {
    }

    public static void e() {
        r.r(new c());
    }

    public Class a() {
        return d.class;
    }

    public Class c() {
        return d.class;
    }

    /* renamed from: f */
    public d b(p pVar) {
        return new a(pVar);
    }
}
