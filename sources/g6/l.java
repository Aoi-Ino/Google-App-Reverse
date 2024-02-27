package g6;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import y5.a;
import y5.o;

public final class l implements a {

    /* renamed from: a  reason: collision with root package name */
    private final p f11685a;

    /* renamed from: b  reason: collision with root package name */
    private final o f11686b;

    /* renamed from: c  reason: collision with root package name */
    private final int f11687c;

    public l(p pVar, o oVar, int i10) {
        this.f11685a = pVar;
        this.f11686b = oVar;
        this.f11687c = i10;
    }

    public byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] a10 = this.f11685a.a(bArr);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] copyOf = Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8);
        return g.a(a10, this.f11686b.b(g.a(bArr2, a10, copyOf)));
    }

    public byte[] b(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i10 = this.f11687c;
        if (length >= i10) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length - i10);
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, bArr.length - this.f11687c, bArr.length);
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            byte[] copyOf = Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8);
            this.f11686b.a(copyOfRange2, g.a(bArr2, copyOfRange, copyOf));
            return this.f11685a.b(copyOfRange);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
