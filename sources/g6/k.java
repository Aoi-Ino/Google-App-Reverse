package g6;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import javax.crypto.AEADBadTagException;
import y5.a;

abstract class k implements a {

    /* renamed from: a  reason: collision with root package name */
    private final i f11683a;

    /* renamed from: b  reason: collision with root package name */
    private final i f11684b;

    public k(byte[] bArr) {
        this.f11683a = g(bArr, 1);
        this.f11684b = g(bArr, 0);
    }

    private byte[] c(ByteBuffer byteBuffer, byte[] bArr) {
        if (byteBuffer.remaining() >= this.f11683a.g() + 16) {
            int position = byteBuffer.position();
            byte[] bArr2 = new byte[16];
            byteBuffer.position(byteBuffer.limit() - 16);
            byteBuffer.get(bArr2);
            byteBuffer.position(position);
            byteBuffer.limit(byteBuffer.limit() - 16);
            byte[] bArr3 = new byte[this.f11683a.g()];
            byteBuffer.get(bArr3);
            if (bArr == null) {
                bArr = new byte[0];
            }
            try {
                q.f(e(bArr3), f(bArr, byteBuffer), bArr2);
                byteBuffer.position(position);
                return this.f11683a.e(byteBuffer);
            } catch (GeneralSecurityException e10) {
                throw new AEADBadTagException(e10.toString());
            }
        } else {
            throw new GeneralSecurityException("ciphertext too short");
        }
    }

    private void d(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) {
        if (byteBuffer.remaining() >= bArr.length + this.f11683a.g() + 16) {
            int position = byteBuffer.position();
            this.f11683a.f(byteBuffer, bArr);
            byteBuffer.position(position);
            byte[] bArr3 = new byte[this.f11683a.g()];
            byteBuffer.get(bArr3);
            byteBuffer.limit(byteBuffer.limit() - 16);
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            byte[] a10 = q.a(e(bArr3), f(bArr2, byteBuffer));
            byteBuffer.limit(byteBuffer.limit() + 16);
            byteBuffer.put(a10);
            return;
        }
        throw new IllegalArgumentException("Given ByteBuffer output is too small");
    }

    private byte[] e(byte[] bArr) {
        byte[] bArr2 = new byte[32];
        this.f11684b.c(bArr, 0).get(bArr2);
        return bArr2;
    }

    private static byte[] f(byte[] bArr, ByteBuffer byteBuffer) {
        int length = bArr.length % 16 == 0 ? bArr.length : (bArr.length + 16) - (bArr.length % 16);
        int remaining = byteBuffer.remaining();
        int i10 = remaining % 16;
        int i11 = (i10 == 0 ? remaining : (remaining + 16) - i10) + length;
        ByteBuffer order = ByteBuffer.allocate(i11 + 16).order(ByteOrder.LITTLE_ENDIAN);
        order.put(bArr);
        order.position(length);
        order.put(byteBuffer);
        order.position(i11);
        order.putLong((long) bArr.length);
        order.putLong((long) remaining);
        return order.array();
    }

    public byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr.length <= 2147483631 - this.f11683a.g()) {
            ByteBuffer allocate = ByteBuffer.allocate(bArr.length + this.f11683a.g() + 16);
            d(allocate, bArr, bArr2);
            return allocate.array();
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    public byte[] b(byte[] bArr, byte[] bArr2) {
        return c(ByteBuffer.wrap(bArr), bArr2);
    }

    /* access modifiers changed from: package-private */
    public abstract i g(byte[] bArr, int i10);
}
