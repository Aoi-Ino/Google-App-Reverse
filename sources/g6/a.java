package g6;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class a implements p {

    /* renamed from: d  reason: collision with root package name */
    private static final ThreadLocal f11646d = new C0150a();

    /* renamed from: a  reason: collision with root package name */
    private final SecretKeySpec f11647a;

    /* renamed from: b  reason: collision with root package name */
    private final int f11648b;

    /* renamed from: c  reason: collision with root package name */
    private final int f11649c;

    /* renamed from: g6.a$a  reason: collision with other inner class name */
    class C0150a extends ThreadLocal {
        C0150a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Cipher initialValue() {
            try {
                return (Cipher) m.f11690f.a("AES/CTR/NoPadding");
            } catch (GeneralSecurityException e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    public a(byte[] bArr, int i10) {
        w.a(bArr.length);
        this.f11647a = new SecretKeySpec(bArr, "AES");
        int blockSize = ((Cipher) f11646d.get()).getBlockSize();
        this.f11649c = blockSize;
        if (i10 < 12 || i10 > blockSize) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.f11648b = i10;
    }

    private void c(byte[] bArr, int i10, int i11, byte[] bArr2, int i12, byte[] bArr3, boolean z10) {
        Cipher cipher = (Cipher) f11646d.get();
        byte[] bArr4 = new byte[this.f11649c];
        System.arraycopy(bArr3, 0, bArr4, 0, this.f11648b);
        cipher.init(z10 ? 1 : 2, this.f11647a, new IvParameterSpec(bArr4));
        if (cipher.doFinal(bArr, i10, i11, bArr2, i12) != i11) {
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
    }

    public byte[] a(byte[] bArr) {
        int length = bArr.length;
        int i10 = this.f11648b;
        if (length <= Integer.MAX_VALUE - i10) {
            byte[] bArr2 = new byte[(bArr.length + i10)];
            byte[] c10 = u.c(i10);
            System.arraycopy(c10, 0, bArr2, 0, this.f11648b);
            c(bArr, 0, bArr.length, bArr2, this.f11648b, c10, true);
            return bArr2;
        }
        throw new GeneralSecurityException("plaintext length can not exceed " + (Integer.MAX_VALUE - this.f11648b));
    }

    public byte[] b(byte[] bArr) {
        int length = bArr.length;
        int i10 = this.f11648b;
        if (length >= i10) {
            byte[] bArr2 = new byte[i10];
            System.arraycopy(bArr, 0, bArr2, 0, i10);
            int length2 = bArr.length;
            int i11 = this.f11648b;
            byte[] bArr3 = new byte[(length2 - i11)];
            c(bArr, i11, bArr.length - i11, bArr3, 0, bArr2, false);
            return bArr3;
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
