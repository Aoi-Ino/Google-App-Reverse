package d6;

import f6.i0;
import g6.g;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Logger;
import y5.o;
import y5.p;
import y5.q;
import y5.r;

class d implements q {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final Logger f9776a = Logger.getLogger(d.class.getName());

    private static class b implements o {

        /* renamed from: a  reason: collision with root package name */
        private final p f9777a;

        /* renamed from: b  reason: collision with root package name */
        private final byte[] f9778b;

        private b(p pVar) {
            this.f9778b = new byte[]{0};
            this.f9777a = pVar;
        }

        public void a(byte[] bArr, byte[] bArr2) {
            if (bArr.length > 5) {
                byte[] copyOf = Arrays.copyOf(bArr, 5);
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
                for (p.b bVar : this.f9777a.c(copyOf)) {
                    try {
                        if (bVar.b().equals(i0.LEGACY)) {
                            ((o) bVar.c()).a(copyOfRange, g.a(bArr2, this.f9778b));
                            return;
                        }
                        ((o) bVar.c()).a(copyOfRange, bArr2);
                        return;
                    } catch (GeneralSecurityException e10) {
                        Logger d10 = d.f9776a;
                        d10.info("tag prefix matches a key, but cannot verify: " + e10);
                    }
                }
                for (p.b c10 : this.f9777a.e()) {
                    try {
                        ((o) c10.c()).a(bArr, bArr2);
                        return;
                    } catch (GeneralSecurityException unused) {
                    }
                }
                throw new GeneralSecurityException("invalid MAC");
            }
            throw new GeneralSecurityException("tag too short");
        }

        public byte[] b(byte[] bArr) {
            if (this.f9777a.b().b().equals(i0.LEGACY)) {
                return g.a(this.f9777a.b().a(), ((o) this.f9777a.b().c()).b(g.a(bArr, this.f9778b)));
            }
            return g.a(this.f9777a.b().a(), ((o) this.f9777a.b().c()).b(bArr));
        }
    }

    d() {
    }

    public static void e() {
        r.r(new d());
    }

    public Class a() {
        return o.class;
    }

    public Class c() {
        return o.class;
    }

    /* renamed from: f */
    public o b(p pVar) {
        return new b(pVar);
    }
}
