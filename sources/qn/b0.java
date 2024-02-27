package qn;

import java.io.ByteArrayOutputStream;
import java.math.BigInteger;

public class b0 extends z {

    /* renamed from: g  reason: collision with root package name */
    static final m0 f30880g = new a(b0.class, 13);

    /* renamed from: e  reason: collision with root package name */
    private final String f30881e;

    /* renamed from: f  reason: collision with root package name */
    private byte[] f30882f;

    static class a extends m0 {
        a(Class cls, int i10) {
            super(cls, i10);
        }

        /* access modifiers changed from: package-private */
        public z d(q1 q1Var) {
            return b0.i0(q1Var.l0(), false);
        }
    }

    private b0(byte[] bArr, boolean z10) {
        byte[] bArr2 = bArr;
        StringBuffer stringBuffer = new StringBuffer();
        boolean z11 = true;
        BigInteger bigInteger = null;
        long j10 = 0;
        for (int i10 = 0; i10 != bArr2.length; i10++) {
            byte b10 = bArr2[i10];
            if (j10 <= 72057594037927808L) {
                long j11 = j10 + ((long) (b10 & Byte.MAX_VALUE));
                if ((b10 & 128) == 0) {
                    if (z11) {
                        z11 = false;
                    } else {
                        stringBuffer.append('.');
                    }
                    stringBuffer.append(j11);
                } else {
                    j10 = j11 << 7;
                }
            } else {
                BigInteger or = (bigInteger == null ? BigInteger.valueOf(j10) : bigInteger).or(BigInteger.valueOf((long) (b10 & Byte.MAX_VALUE)));
                if ((b10 & 128) == 0) {
                    if (z11) {
                        z11 = false;
                    } else {
                        stringBuffer.append('.');
                    }
                    stringBuffer.append(or);
                    bigInteger = null;
                } else {
                    bigInteger = or.shiftLeft(7);
                }
            }
            j10 = 0;
        }
        this.f30881e = stringBuffer.toString();
        this.f30882f = z10 ? ap.a.d(bArr) : bArr2;
    }

    static b0 i0(byte[] bArr, boolean z10) {
        return new b0(bArr, z10);
    }

    private void j0(ByteArrayOutputStream byteArrayOutputStream) {
        u2 u2Var = new u2(this.f30881e);
        while (u2Var.a()) {
            String b10 = u2Var.b();
            if (b10.length() <= 18) {
                n0(byteArrayOutputStream, Long.parseLong(b10));
            } else {
                o0(byteArrayOutputStream, new BigInteger(b10));
            }
        }
    }

    private synchronized byte[] k0() {
        try {
            if (this.f30882f == null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                j0(byteArrayOutputStream);
                this.f30882f = byteArrayOutputStream.toByteArray();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f30882f;
    }

    static boolean m0(String str, int i10) {
        int length = str.length();
        int i11 = 0;
        while (true) {
            int i12 = length - 1;
            if (i12 < i10) {
                return i11 != 0 && (i11 <= 1 || str.charAt(length) != '0');
            }
            char charAt = str.charAt(i12);
            if (charAt == '.') {
                if (i11 == 0 || (i11 > 1 && str.charAt(length) == '0')) {
                    return false;
                }
                i11 = 0;
            } else if ('0' > charAt || charAt > '9') {
                return false;
            } else {
                i11++;
            }
            length = i12;
        }
        return false;
    }

    static void n0(ByteArrayOutputStream byteArrayOutputStream, long j10) {
        byte[] bArr = new byte[9];
        int i10 = 8;
        bArr[8] = (byte) (((int) j10) & 127);
        while (j10 >= 128) {
            j10 >>= 7;
            i10--;
            bArr[i10] = (byte) (((int) j10) | 128);
        }
        byteArrayOutputStream.write(bArr, i10, 9 - i10);
    }

    static void o0(ByteArrayOutputStream byteArrayOutputStream, BigInteger bigInteger) {
        int bitLength = (bigInteger.bitLength() + 6) / 7;
        if (bitLength == 0) {
            byteArrayOutputStream.write(0);
            return;
        }
        byte[] bArr = new byte[bitLength];
        int i10 = bitLength - 1;
        for (int i11 = i10; i11 >= 0; i11--) {
            bArr[i11] = (byte) (bigInteger.intValue() | 128);
            bigInteger = bigInteger.shiftRight(7);
        }
        bArr[i10] = (byte) (bArr[i10] & Byte.MAX_VALUE);
        byteArrayOutputStream.write(bArr, 0, bitLength);
    }

    /* access modifiers changed from: package-private */
    public void B(x xVar, boolean z10) {
        xVar.o(z10, 13, k0());
    }

    /* access modifiers changed from: package-private */
    public boolean E() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public int T(boolean z10) {
        return x.g(z10, k0().length);
    }

    public int hashCode() {
        return this.f30881e.hashCode();
    }

    public String l0() {
        return this.f30881e;
    }

    public String toString() {
        return l0();
    }

    /* access modifiers changed from: package-private */
    public boolean y(z zVar) {
        if (this == zVar) {
            return true;
        }
        if (!(zVar instanceof b0)) {
            return false;
        }
        return this.f30881e.equals(((b0) zVar).f30881e);
    }
}
