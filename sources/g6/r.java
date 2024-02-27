package g6;

import e6.a;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public final class r implements a {

    /* renamed from: a  reason: collision with root package name */
    private final SecretKey f11700a;

    /* renamed from: b  reason: collision with root package name */
    private byte[] f11701b;

    /* renamed from: c  reason: collision with root package name */
    private byte[] f11702c;

    public r(byte[] bArr) {
        w.a(bArr.length);
        this.f11700a = new SecretKeySpec(bArr, "AES");
        b();
    }

    private void b() {
        Cipher c10 = c();
        c10.init(1, this.f11700a);
        byte[] b10 = e.b(c10.doFinal(new byte[16]));
        this.f11701b = b10;
        this.f11702c = e.b(b10);
    }

    private static Cipher c() {
        return (Cipher) m.f11690f.a("AES/ECB/NoPadding");
    }

    public byte[] a(byte[] bArr, int i10) {
        if (i10 <= 16) {
            Cipher c10 = c();
            c10.init(1, this.f11700a);
            int max = Math.max(1, (int) Math.ceil(((double) bArr.length) / 16.0d));
            byte[] d10 = max * 16 == bArr.length ? g.d(bArr, (max - 1) * 16, this.f11701b, 0, 16) : g.e(e.a(Arrays.copyOfRange(bArr, (max - 1) * 16, bArr.length)), this.f11702c);
            byte[] bArr2 = new byte[16];
            for (int i11 = 0; i11 < max - 1; i11++) {
                bArr2 = c10.doFinal(g.d(bArr2, 0, bArr, i11 * 16, 16));
            }
            return Arrays.copyOf(c10.doFinal(g.e(d10, bArr2)), i10);
        }
        throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
    }
}
