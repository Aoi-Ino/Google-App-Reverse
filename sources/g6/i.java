package g6;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

abstract class i implements p {

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f11680c = m(new byte[]{101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107});

    /* renamed from: a  reason: collision with root package name */
    int[] f11681a;

    /* renamed from: b  reason: collision with root package name */
    private final int f11682b;

    i(byte[] bArr, int i10) {
        if (bArr.length == 32) {
            this.f11681a = m(bArr);
            this.f11682b = i10;
            return;
        }
        throw new InvalidKeyException("The key length in bytes must be 32.");
    }

    private void h(byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        int remaining = byteBuffer2.remaining();
        int i10 = remaining / 64;
        int i11 = i10 + 1;
        for (int i12 = 0; i12 < i11; i12++) {
            ByteBuffer c10 = c(bArr, this.f11682b + i12);
            int i13 = 64;
            if (i12 == i10) {
                i13 = remaining % 64;
            }
            g.c(byteBuffer, byteBuffer2, c10, i13);
        }
    }

    static void i(int[] iArr, int i10, int i11, int i12, int i13) {
        int i14 = iArr[i10] + iArr[i11];
        iArr[i10] = i14;
        int j10 = j(i14 ^ iArr[i13], 16);
        iArr[i13] = j10;
        int i15 = iArr[i12] + j10;
        iArr[i12] = i15;
        int j11 = j(iArr[i11] ^ i15, 12);
        iArr[i11] = j11;
        int i16 = iArr[i10] + j11;
        iArr[i10] = i16;
        int j12 = j(iArr[i13] ^ i16, 8);
        iArr[i13] = j12;
        int i17 = iArr[i12] + j12;
        iArr[i12] = i17;
        iArr[i11] = j(iArr[i11] ^ i17, 7);
    }

    private static int j(int i10, int i11) {
        return (i10 >>> (-i11)) | (i10 << i11);
    }

    static void k(int[] iArr, int[] iArr2) {
        int[] iArr3 = f11680c;
        System.arraycopy(iArr3, 0, iArr, 0, iArr3.length);
        System.arraycopy(iArr2, 0, iArr, iArr3.length, 8);
    }

    static void l(int[] iArr) {
        int[] iArr2 = iArr;
        for (int i10 = 0; i10 < 10; i10++) {
            i(iArr2, 0, 4, 8, 12);
            i(iArr2, 1, 5, 9, 13);
            i(iArr2, 2, 6, 10, 14);
            i(iArr2, 3, 7, 11, 15);
            i(iArr2, 0, 5, 10, 15);
            i(iArr2, 1, 6, 11, 12);
            i(iArr2, 2, 7, 8, 13);
            i(iArr2, 3, 4, 9, 14);
        }
    }

    static int[] m(byte[] bArr) {
        IntBuffer asIntBuffer = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] iArr = new int[asIntBuffer.remaining()];
        asIntBuffer.get(iArr);
        return iArr;
    }

    public byte[] a(byte[] bArr) {
        if (bArr.length <= Integer.MAX_VALUE - g()) {
            ByteBuffer allocate = ByteBuffer.allocate(g() + bArr.length);
            f(allocate, bArr);
            return allocate.array();
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    public byte[] b(byte[] bArr) {
        return e(ByteBuffer.wrap(bArr));
    }

    /* access modifiers changed from: package-private */
    public ByteBuffer c(byte[] bArr, int i10) {
        int[] d10 = d(m(bArr), i10);
        int[] iArr = (int[]) d10.clone();
        l(iArr);
        for (int i11 = 0; i11 < d10.length; i11++) {
            d10[i11] = d10[i11] + iArr[i11];
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(d10, 0, 16);
        return order;
    }

    /* access modifiers changed from: package-private */
    public abstract int[] d(int[] iArr, int i10);

    /* access modifiers changed from: package-private */
    public byte[] e(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() >= g()) {
            byte[] bArr = new byte[g()];
            byteBuffer.get(bArr);
            ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
            h(bArr, allocate, byteBuffer);
            return allocate.array();
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    /* access modifiers changed from: package-private */
    public void f(ByteBuffer byteBuffer, byte[] bArr) {
        if (byteBuffer.remaining() - g() >= bArr.length) {
            byte[] c10 = u.c(g());
            byteBuffer.put(c10);
            h(c10, byteBuffer, ByteBuffer.wrap(bArr));
            return;
        }
        throw new IllegalArgumentException("Given ByteBuffer output is too small");
    }

    /* access modifiers changed from: package-private */
    public abstract int g();
}
