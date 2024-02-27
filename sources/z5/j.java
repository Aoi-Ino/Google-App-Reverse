package z5;

import f6.a0;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import y5.a;
import y5.r;

public final class j implements a {

    /* renamed from: c  reason: collision with root package name */
    private static final byte[] f18902c = new byte[0];

    /* renamed from: a  reason: collision with root package name */
    private final a0 f18903a;

    /* renamed from: b  reason: collision with root package name */
    private final a f18904b;

    public j(a0 a0Var, a aVar) {
        this.f18903a = a0Var;
        this.f18904b = aVar;
    }

    private byte[] c(byte[] bArr, byte[] bArr2) {
        return ByteBuffer.allocate(bArr.length + 4 + bArr2.length).putInt(bArr.length).put(bArr).put(bArr2).array();
    }

    public byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] d10 = r.o(this.f18903a).d();
        return c(this.f18904b.a(d10, f18902c), ((a) r.i(this.f18903a.R(), d10, a.class)).a(bArr, bArr2));
    }

    public byte[] b(byte[] bArr, byte[] bArr2) {
        try {
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            int i10 = wrap.getInt();
            if (i10 <= 0 || i10 > bArr.length - 4) {
                throw new GeneralSecurityException("invalid ciphertext");
            }
            byte[] bArr3 = new byte[i10];
            wrap.get(bArr3, 0, i10);
            byte[] bArr4 = new byte[wrap.remaining()];
            wrap.get(bArr4, 0, wrap.remaining());
            return ((a) r.i(this.f18903a.R(), this.f18904b.b(bArr3, f18902c), a.class)).b(bArr4, bArr2);
        } catch (IndexOutOfBoundsException e10) {
            e = e10;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (BufferUnderflowException e11) {
            e = e11;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (NegativeArraySizeException e12) {
            e = e12;
            throw new GeneralSecurityException("invalid ciphertext", e);
        }
    }
}
