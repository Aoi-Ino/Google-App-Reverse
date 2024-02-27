package g6;

import e6.a;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import y5.o;

public class t implements o {

    /* renamed from: a  reason: collision with root package name */
    private final a f11708a;

    /* renamed from: b  reason: collision with root package name */
    private final int f11709b;

    public t(a aVar, int i10) {
        this.f11708a = aVar;
        this.f11709b = i10;
        if (i10 >= 10) {
            aVar.a(new byte[0], i10);
            return;
        }
        throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
    }

    public void a(byte[] bArr, byte[] bArr2) {
        if (!g.b(b(bArr2), bArr)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }

    public byte[] b(byte[] bArr) {
        return this.f11708a.a(bArr, this.f11709b);
    }
}
