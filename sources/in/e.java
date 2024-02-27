package in;

import cm.l;
import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import km.d;

public final class e implements g, f, Cloneable, ByteChannel {

    /* renamed from: e  reason: collision with root package name */
    public v f24463e;

    /* renamed from: f  reason: collision with root package name */
    private long f24464f;

    public static final class a extends InputStream {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ e f24465e;

        a(e eVar) {
            this.f24465e = eVar;
        }

        public int available() {
            return (int) Math.min(this.f24465e.H0(), (long) Integer.MAX_VALUE);
        }

        public void close() {
        }

        public int read() {
            if (this.f24465e.H0() > 0) {
                return this.f24465e.readByte() & 255;
            }
            return -1;
        }

        public String toString() {
            return this.f24465e + ".inputStream()";
        }

        public int read(byte[] bArr, int i10, int i11) {
            l.f(bArr, "sink");
            return this.f24465e.read(bArr, i10, i11);
        }
    }

    public static final class b extends OutputStream {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ e f24466e;

        b(e eVar) {
            this.f24466e = eVar;
        }

        public void close() {
        }

        public void flush() {
        }

        public String toString() {
            return this.f24466e + ".outputStream()";
        }

        public void write(int i10) {
            this.f24466e.Q(i10);
        }

        public void write(byte[] bArr, int i10, int i11) {
            l.f(bArr, "data");
            this.f24466e.a(bArr, i10, i11);
        }
    }

    public boolean A(long j10) {
        return this.f24464f >= j10;
    }

    public int A0() {
        return c.c(readInt());
    }

    public short B0() {
        return c.d(readShort());
    }

    public String C0(long j10, Charset charset) {
        l.f(charset, "charset");
        int i10 = (j10 > 0 ? 1 : (j10 == 0 ? 0 : -1));
        if (!(i10 >= 0 && j10 <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(("byteCount: " + j10).toString());
        } else if (this.f24464f < j10) {
            throw new EOFException();
        } else if (i10 == 0) {
            return "";
        } else {
            v vVar = this.f24463e;
            l.c(vVar);
            int i11 = vVar.f24500b;
            if (((long) i11) + j10 > ((long) vVar.f24501c)) {
                return new String(S(j10), charset);
            }
            int i12 = (int) j10;
            String str = new String(vVar.f24499a, i11, i12, charset);
            int i13 = vVar.f24500b + i12;
            vVar.f24500b = i13;
            this.f24464f -= j10;
            if (i13 == vVar.f24501c) {
                this.f24463e = vVar.b();
                w.b(vVar);
            }
            return str;
        }
    }

    public String D0() {
        return C0(this.f24464f, d.f24740b);
    }

    public String E0(long j10) {
        return C0(j10, d.f24740b);
    }

    public int F0() {
        byte b10;
        int i10;
        byte b11;
        if (H0() != 0) {
            byte R = R(0);
            int i11 = 1;
            if ((R & 128) == 0) {
                b11 = R & Byte.MAX_VALUE;
                b10 = 0;
                i10 = 1;
            } else if ((R & 224) == 192) {
                b11 = R & 31;
                i10 = 2;
                b10 = 128;
            } else if ((R & 240) == 224) {
                b11 = R & 15;
                i10 = 3;
                b10 = 2048;
            } else if ((R & 248) == 240) {
                b11 = R & 7;
                i10 = 4;
                b10 = 65536;
            } else {
                skip(1);
                return 65533;
            }
            long j10 = (long) i10;
            if (H0() >= j10) {
                while (i11 < i10) {
                    long j11 = (long) i11;
                    byte R2 = R(j11);
                    if ((R2 & 192) == 128) {
                        b11 = (b11 << 6) | (R2 & 63);
                        i11++;
                    } else {
                        skip(j11);
                        return 65533;
                    }
                }
                skip(j10);
                if (b11 > 1114111) {
                    return 65533;
                }
                if ((55296 <= b11 && 57343 >= b11) || b11 < b10) {
                    return 65533;
                }
                return b11;
            }
            throw new EOFException("size < " + i10 + ": " + H0() + " (to read code point prefixed 0x" + c.e(R) + ')');
        }
        throw new EOFException();
    }

    public final void G0(long j10) {
        this.f24464f = j10;
    }

    public final long H0() {
        return this.f24464f;
    }

    public int I(r rVar) {
        l.f(rVar, "options");
        int d10 = jn.a.d(this, rVar, false, 2, (Object) null);
        if (d10 == -1) {
            return -1;
        }
        skip((long) rVar.r()[d10].q());
        return d10;
    }

    public final h I0() {
        if (H0() <= ((long) Integer.MAX_VALUE)) {
            return J0((int) H0());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + H0()).toString());
    }

    public String J() {
        return e0(Long.MAX_VALUE);
    }

    public final h J0(int i10) {
        if (i10 == 0) {
            return h.f24467h;
        }
        c.b(H0(), 0, (long) i10);
        v vVar = this.f24463e;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            l.c(vVar);
            int i14 = vVar.f24501c;
            int i15 = vVar.f24500b;
            if (i14 != i15) {
                i12 += i14 - i15;
                i13++;
                vVar = vVar.f24504f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        byte[][] bArr = new byte[i13][];
        int[] iArr = new int[(i13 * 2)];
        v vVar2 = this.f24463e;
        int i16 = 0;
        while (i11 < i10) {
            l.c(vVar2);
            bArr[i16] = vVar2.f24499a;
            i11 += vVar2.f24501c - vVar2.f24500b;
            iArr[i16] = Math.min(i11, i10);
            iArr[i16 + i13] = vVar2.f24500b;
            vVar2.f24502d = true;
            i16++;
            vVar2 = vVar2.f24504f;
        }
        return new x(bArr, iArr);
    }

    public final v K0(int i10) {
        boolean z10 = true;
        if (i10 < 1 || i10 > 8192) {
            z10 = false;
        }
        if (z10) {
            v vVar = this.f24463e;
            if (vVar == null) {
                v c10 = w.c();
                this.f24463e = c10;
                c10.f24505g = c10;
                c10.f24504f = c10;
                return c10;
            }
            l.c(vVar);
            v vVar2 = vVar.f24505g;
            l.c(vVar2);
            return (vVar2.f24501c + i10 > 8192 || !vVar2.f24503e) ? vVar2.c(w.c()) : vVar2;
        }
        throw new IllegalArgumentException("unexpected capacity".toString());
    }

    public long L(y yVar) {
        l.f(yVar, "sink");
        long H0 = H0();
        if (H0 > 0) {
            yVar.b0(this, H0);
        }
        return H0;
    }

    /* renamed from: L0 */
    public e N(h hVar) {
        l.f(hVar, "byteString");
        hVar.u(this, 0, hVar.q());
        return this;
    }

    public byte[] M() {
        return S(H0());
    }

    /* renamed from: M0 */
    public e W(byte[] bArr) {
        l.f(bArr, "source");
        return a(bArr, 0, bArr.length);
    }

    /* renamed from: N0 */
    public e a(byte[] bArr, int i10, int i11) {
        l.f(bArr, "source");
        long j10 = (long) i11;
        c.b((long) bArr.length, (long) i10, j10);
        int i12 = i11 + i10;
        while (i10 < i12) {
            v K0 = K0(1);
            int min = Math.min(i12 - i10, 8192 - K0.f24501c);
            int i13 = i10 + min;
            byte[] unused = l.d(bArr, K0.f24499a, K0.f24501c, i10, i13);
            K0.f24501c += min;
            i10 = i13;
        }
        G0(H0() + j10);
        return this;
    }

    /* renamed from: O0 */
    public e Q(int i10) {
        v K0 = K0(1);
        byte[] bArr = K0.f24499a;
        int i11 = K0.f24501c;
        K0.f24501c = i11 + 1;
        bArr[i11] = (byte) i10;
        G0(H0() + 1);
        return this;
    }

    public boolean P() {
        return this.f24464f == 0;
    }

    /* renamed from: P0 */
    public e t0(long j10) {
        boolean z10;
        int i10 = (j10 > 0 ? 1 : (j10 == 0 ? 0 : -1));
        if (i10 == 0) {
            return Q(48);
        }
        int i11 = 1;
        if (i10 < 0) {
            j10 = -j10;
            if (j10 < 0) {
                return r0("-9223372036854775808");
            }
            z10 = true;
        } else {
            z10 = false;
        }
        if (j10 >= 100000000) {
            i11 = j10 < 1000000000000L ? j10 < 10000000000L ? j10 < 1000000000 ? 9 : 10 : j10 < 100000000000L ? 11 : 12 : j10 < 1000000000000000L ? j10 < 10000000000000L ? 13 : j10 < 100000000000000L ? 14 : 15 : j10 < 100000000000000000L ? j10 < 10000000000000000L ? 16 : 17 : j10 < 1000000000000000000L ? 18 : 19;
        } else if (j10 >= 10000) {
            i11 = j10 < 1000000 ? j10 < 100000 ? 5 : 6 : j10 < 10000000 ? 7 : 8;
        } else if (j10 >= 100) {
            i11 = j10 < 1000 ? 3 : 4;
        } else if (j10 >= 10) {
            i11 = 2;
        }
        if (z10) {
            i11++;
        }
        v K0 = K0(i11);
        byte[] bArr = K0.f24499a;
        int i12 = K0.f24501c + i11;
        while (j10 != 0) {
            long j11 = (long) 10;
            i12--;
            bArr[i12] = jn.a.a()[(int) (j10 % j11)];
            j10 /= j11;
        }
        if (z10) {
            bArr[i12 - 1] = (byte) 45;
        }
        K0.f24501c += i11;
        G0(H0() + ((long) i11));
        return this;
    }

    /* renamed from: Q0 */
    public e q(long j10) {
        if (j10 == 0) {
            return Q(48);
        }
        long j11 = (j10 >>> 1) | j10;
        long j12 = j11 | (j11 >>> 2);
        long j13 = j12 | (j12 >>> 4);
        long j14 = j13 | (j13 >>> 8);
        long j15 = j14 | (j14 >>> 16);
        long j16 = j15 | (j15 >>> 32);
        long j17 = j16 - ((j16 >>> 1) & 6148914691236517205L);
        long j18 = ((j17 >>> 2) & 3689348814741910323L) + (j17 & 3689348814741910323L);
        long j19 = ((j18 >>> 4) + j18) & 1085102592571150095L;
        long j20 = j19 + (j19 >>> 8);
        long j21 = j20 + (j20 >>> 16);
        int i10 = (int) ((((j21 & 63) + ((j21 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
        v K0 = K0(i10);
        byte[] bArr = K0.f24499a;
        int i11 = K0.f24501c;
        for (int i12 = (i11 + i10) - 1; i12 >= i11; i12--) {
            bArr[i12] = jn.a.a()[(int) (15 & j10)];
            j10 >>>= 4;
        }
        K0.f24501c += i10;
        G0(H0() + ((long) i10));
        return this;
    }

    public final byte R(long j10) {
        c.b(H0(), j10, 1);
        v vVar = this.f24463e;
        if (vVar == null) {
            l.c((Object) null);
            throw null;
        } else if (H0() - j10 < j10) {
            long H0 = H0();
            while (H0 > j10) {
                vVar = vVar.f24505g;
                l.c(vVar);
                H0 -= (long) (vVar.f24501c - vVar.f24500b);
            }
            l.c(vVar);
            return vVar.f24499a[(int) ((((long) vVar.f24500b) + j10) - H0)];
        } else {
            long j11 = 0;
            while (true) {
                long j12 = ((long) (vVar.f24501c - vVar.f24500b)) + j11;
                if (j12 > j10) {
                    l.c(vVar);
                    return vVar.f24499a[(int) ((((long) vVar.f24500b) + j10) - j11)];
                }
                vVar = vVar.f24504f;
                l.c(vVar);
                j11 = j12;
            }
        }
    }

    /* renamed from: R0 */
    public e writeInt(int i10) {
        v K0 = K0(4);
        byte[] bArr = K0.f24499a;
        int i11 = K0.f24501c;
        bArr[i11] = (byte) ((i10 >>> 24) & 255);
        bArr[i11 + 1] = (byte) ((i10 >>> 16) & 255);
        bArr[i11 + 2] = (byte) ((i10 >>> 8) & 255);
        bArr[i11 + 3] = (byte) (i10 & 255);
        K0.f24501c = i11 + 4;
        G0(H0() + 4);
        return this;
    }

    public byte[] S(long j10) {
        if (!(j10 >= 0 && j10 <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(("byteCount: " + j10).toString());
        } else if (H0() >= j10) {
            byte[] bArr = new byte[((int) j10)];
            s0(bArr);
            return bArr;
        } else {
            throw new EOFException();
        }
    }

    /* renamed from: S0 */
    public e z(int i10) {
        v K0 = K0(2);
        byte[] bArr = K0.f24499a;
        int i11 = K0.f24501c;
        bArr[i11] = (byte) ((i10 >>> 8) & 255);
        bArr[i11 + 1] = (byte) (i10 & 255);
        K0.f24501c = i11 + 2;
        G0(H0() + 2);
        return this;
    }

    public e T0(String str, int i10, int i11, Charset charset) {
        l.f(str, "string");
        l.f(charset, "charset");
        boolean z10 = true;
        if (i10 >= 0) {
            if (i11 >= i10) {
                if (i11 > str.length()) {
                    z10 = false;
                }
                if (!z10) {
                    throw new IllegalArgumentException(("endIndex > string.length: " + i11 + " > " + str.length()).toString());
                } else if (l.a(charset, d.f24740b)) {
                    return W0(str, i10, i11);
                } else {
                    String substring = str.substring(i10, i11);
                    l.e(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    if (substring != null) {
                        byte[] bytes = substring.getBytes(charset);
                        l.e(bytes, "(this as java.lang.String).getBytes(charset)");
                        return a(bytes, 0, bytes.length);
                    }
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
            } else {
                throw new IllegalArgumentException(("endIndex < beginIndex: " + i11 + " < " + i10).toString());
            }
        } else {
            throw new IllegalArgumentException(("beginIndex < 0: " + i10).toString());
        }
    }

    public e U0(String str, Charset charset) {
        l.f(str, "string");
        l.f(charset, "charset");
        return T0(str, 0, str.length(), charset);
    }

    /* renamed from: V0 */
    public e r0(String str) {
        l.f(str, "string");
        return W0(str, 0, str.length());
    }

    public e W0(String str, int i10, int i11) {
        long H0;
        long j10;
        l.f(str, "string");
        if (i10 >= 0) {
            if (i11 >= i10) {
                if (i11 <= str.length()) {
                    while (i10 < i11) {
                        char charAt = str.charAt(i10);
                        if (charAt < 128) {
                            v K0 = K0(1);
                            byte[] bArr = K0.f24499a;
                            int i12 = K0.f24501c - i10;
                            int min = Math.min(i11, 8192 - i12);
                            int i13 = i10 + 1;
                            bArr[i10 + i12] = (byte) charAt;
                            while (i13 < min) {
                                char charAt2 = str.charAt(i13);
                                if (charAt2 >= 128) {
                                    break;
                                }
                                bArr[i13 + i12] = (byte) charAt2;
                                i13++;
                            }
                            int i14 = K0.f24501c;
                            int i15 = (i12 + i13) - i14;
                            K0.f24501c = i14 + i15;
                            G0(H0() + ((long) i15));
                            i10 = i13;
                        } else {
                            if (charAt < 2048) {
                                v K02 = K0(2);
                                byte[] bArr2 = K02.f24499a;
                                int i16 = K02.f24501c;
                                bArr2[i16] = (byte) ((charAt >> 6) | 192);
                                bArr2[i16 + 1] = (byte) ((charAt & '?') | 128);
                                K02.f24501c = i16 + 2;
                                H0 = H0();
                                j10 = 2;
                            } else if (charAt < 55296 || charAt > 57343) {
                                v K03 = K0(3);
                                byte[] bArr3 = K03.f24499a;
                                int i17 = K03.f24501c;
                                bArr3[i17] = (byte) ((charAt >> 12) | 224);
                                bArr3[i17 + 1] = (byte) ((63 & (charAt >> 6)) | 128);
                                bArr3[i17 + 2] = (byte) ((charAt & '?') | 128);
                                K03.f24501c = i17 + 3;
                                H0 = H0();
                                j10 = 3;
                            } else {
                                int i18 = i10 + 1;
                                char charAt3 = i18 < i11 ? str.charAt(i18) : 0;
                                if (charAt > 56319 || 56320 > charAt3 || 57343 < charAt3) {
                                    Q(63);
                                    i10 = i18;
                                } else {
                                    int i19 = (((charAt & 1023) << 10) | (charAt3 & 1023)) + 0;
                                    v K04 = K0(4);
                                    byte[] bArr4 = K04.f24499a;
                                    int i20 = K04.f24501c;
                                    bArr4[i20] = (byte) ((i19 >> 18) | 240);
                                    bArr4[i20 + 1] = (byte) (((i19 >> 12) & 63) | 128);
                                    bArr4[i20 + 2] = (byte) (((i19 >> 6) & 63) | 128);
                                    bArr4[i20 + 3] = (byte) ((i19 & 63) | 128);
                                    K04.f24501c = i20 + 4;
                                    G0(H0() + 4);
                                    i10 += 2;
                                }
                            }
                            G0(H0 + j10);
                            i10++;
                        }
                    }
                    return this;
                }
                throw new IllegalArgumentException(("endIndex > string.length: " + i11 + " > " + str.length()).toString());
            }
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i11 + " < " + i10).toString());
        }
        throw new IllegalArgumentException(("beginIndex < 0: " + i10).toString());
    }

    public long X(byte b10, long j10, long j11) {
        v vVar;
        long j12;
        int i10;
        long j13 = 0;
        if (0 <= j10 && j11 >= j10) {
            if (j11 > H0()) {
                j11 = H0();
            }
            if (j10 == j11 || (vVar = this.f24463e) == null) {
                return -1;
            }
            if (H0() - j10 < j10) {
                j12 = H0();
                while (j12 > j10) {
                    vVar = vVar.f24505g;
                    l.c(vVar);
                    j12 -= (long) (vVar.f24501c - vVar.f24500b);
                }
                while (j12 < j11) {
                    byte[] bArr = vVar.f24499a;
                    int min = (int) Math.min((long) vVar.f24501c, (((long) vVar.f24500b) + j11) - j12);
                    i10 = (int) ((((long) vVar.f24500b) + j10) - j12);
                    while (i10 < min) {
                        if (bArr[i10] != b10) {
                            i10++;
                        }
                    }
                    j12 += (long) (vVar.f24501c - vVar.f24500b);
                    vVar = vVar.f24504f;
                    l.c(vVar);
                    j10 = j12;
                }
                return -1;
            }
            while (true) {
                long j14 = ((long) (vVar.f24501c - vVar.f24500b)) + j13;
                if (j14 > j10) {
                    break;
                }
                vVar = vVar.f24504f;
                l.c(vVar);
                j13 = j14;
            }
            while (j12 < j11) {
                byte[] bArr2 = vVar.f24499a;
                int min2 = (int) Math.min((long) vVar.f24501c, (((long) vVar.f24500b) + j11) - j12);
                int i11 = (int) ((((long) vVar.f24500b) + j10) - j12);
                while (i10 < min2) {
                    if (bArr2[i10] != b10) {
                        i11 = i10 + 1;
                    }
                }
                j13 = j12 + ((long) (vVar.f24501c - vVar.f24500b));
                vVar = vVar.f24504f;
                l.c(vVar);
                j10 = j13;
            }
            return -1;
            return ((long) (i10 - vVar.f24500b)) + j12;
        }
        throw new IllegalArgumentException(("size=" + H0() + " fromIndex=" + j10 + " toIndex=" + j11).toString());
    }

    public e X0(int i10) {
        long H0;
        long j10;
        if (i10 < 128) {
            Q(i10);
        } else {
            if (i10 < 2048) {
                v K0 = K0(2);
                byte[] bArr = K0.f24499a;
                int i11 = K0.f24501c;
                bArr[i11] = (byte) ((i10 >> 6) | 192);
                bArr[i11 + 1] = (byte) ((i10 & 63) | 128);
                K0.f24501c = i11 + 2;
                H0 = H0();
                j10 = 2;
            } else if (55296 <= i10 && 57343 >= i10) {
                Q(63);
            } else if (i10 < 65536) {
                v K02 = K0(3);
                byte[] bArr2 = K02.f24499a;
                int i12 = K02.f24501c;
                bArr2[i12] = (byte) ((i10 >> 12) | 224);
                bArr2[i12 + 1] = (byte) (((i10 >> 6) & 63) | 128);
                bArr2[i12 + 2] = (byte) ((i10 & 63) | 128);
                K02.f24501c = i12 + 3;
                H0 = H0();
                j10 = 3;
            } else if (i10 <= 1114111) {
                v K03 = K0(4);
                byte[] bArr3 = K03.f24499a;
                int i13 = K03.f24501c;
                bArr3[i13] = (byte) ((i10 >> 18) | 240);
                bArr3[i13 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                bArr3[i13 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                bArr3[i13 + 3] = (byte) ((i10 & 63) | 128);
                K03.f24501c = i13 + 4;
                H0 = H0();
                j10 = 4;
            } else {
                throw new IllegalArgumentException("Unexpected code point: 0x" + c.f(i10));
            }
            G0(H0 + j10);
        }
        return this;
    }

    public long Y(h hVar) {
        l.f(hVar, "targetBytes");
        return Z(hVar, 0);
    }

    public long Z(h hVar, long j10) {
        long j11;
        int i10;
        l.f(hVar, "targetBytes");
        long j12 = 0;
        if (j10 >= 0) {
            v vVar = this.f24463e;
            if (vVar == null) {
                return -1;
            }
            if (H0() - j10 < j10) {
                j11 = H0();
                while (j11 > j10) {
                    vVar = vVar.f24505g;
                    l.c(vVar);
                    j11 -= (long) (vVar.f24501c - vVar.f24500b);
                }
                if (hVar.q() == 2) {
                    byte d10 = hVar.d(0);
                    byte d11 = hVar.d(1);
                    while (j11 < H0()) {
                        byte[] bArr = vVar.f24499a;
                        i10 = (int) ((((long) vVar.f24500b) + j10) - j11);
                        int i11 = vVar.f24501c;
                        while (i10 < i11) {
                            byte b10 = bArr[i10];
                            if (!(b10 == d10 || b10 == d11)) {
                                i10++;
                            }
                        }
                        j11 += (long) (vVar.f24501c - vVar.f24500b);
                        vVar = vVar.f24504f;
                        l.c(vVar);
                        j10 = j11;
                    }
                    return -1;
                }
                byte[] j13 = hVar.j();
                while (j11 < H0()) {
                    byte[] bArr2 = vVar.f24499a;
                    int i12 = (int) ((((long) vVar.f24500b) + j10) - j11);
                    int i13 = vVar.f24501c;
                    while (i10 < i13) {
                        byte b11 = bArr2[i10];
                        int length = j13.length;
                        int i14 = 0;
                        while (i14 < length) {
                            if (b11 != j13[i14]) {
                                i14++;
                            }
                        }
                        i12 = i10 + 1;
                    }
                    j11 += (long) (vVar.f24501c - vVar.f24500b);
                    vVar = vVar.f24504f;
                    l.c(vVar);
                    j10 = j11;
                }
                return -1;
            }
            while (true) {
                long j14 = ((long) (vVar.f24501c - vVar.f24500b)) + j12;
                if (j14 > j10) {
                    break;
                }
                vVar = vVar.f24504f;
                l.c(vVar);
                j12 = j14;
            }
            if (hVar.q() == 2) {
                byte d12 = hVar.d(0);
                byte d13 = hVar.d(1);
                while (j11 < H0()) {
                    byte[] bArr3 = vVar.f24499a;
                    int i15 = (int) ((((long) vVar.f24500b) + j10) - j11);
                    int i16 = vVar.f24501c;
                    while (i10 < i16) {
                        byte b12 = bArr3[i10];
                        if (!(b12 == d12 || b12 == d13)) {
                            i15 = i10 + 1;
                        }
                    }
                    j12 = j11 + ((long) (vVar.f24501c - vVar.f24500b));
                    vVar = vVar.f24504f;
                    l.c(vVar);
                    j10 = j12;
                }
                return -1;
            }
            byte[] j15 = hVar.j();
            while (j11 < H0()) {
                byte[] bArr4 = vVar.f24499a;
                int i17 = (int) ((((long) vVar.f24500b) + j10) - j11);
                int i18 = vVar.f24501c;
                while (i10 < i18) {
                    byte b13 = bArr4[i10];
                    int length2 = j15.length;
                    int i19 = 0;
                    while (i19 < length2) {
                        if (b13 != j15[i19]) {
                            i19++;
                        }
                    }
                    i17 = i10 + 1;
                }
                j12 = j11 + ((long) (vVar.f24501c - vVar.f24500b));
                vVar = vVar.f24504f;
                l.c(vVar);
                j10 = j12;
            }
            return -1;
            return ((long) (i10 - vVar.f24500b)) + j11;
        }
        throw new IllegalArgumentException(("fromIndex < 0: " + j10).toString());
    }

    public void b0(e eVar, long j10) {
        v vVar;
        l.f(eVar, "source");
        if (eVar != this) {
            c.b(eVar.H0(), 0, j10);
            while (j10 > 0) {
                v vVar2 = eVar.f24463e;
                l.c(vVar2);
                int i10 = vVar2.f24501c;
                v vVar3 = eVar.f24463e;
                l.c(vVar3);
                if (j10 < ((long) (i10 - vVar3.f24500b))) {
                    v vVar4 = this.f24463e;
                    if (vVar4 != null) {
                        l.c(vVar4);
                        vVar = vVar4.f24505g;
                    } else {
                        vVar = null;
                    }
                    if (vVar != null && vVar.f24503e) {
                        if ((((long) vVar.f24501c) + j10) - ((long) (vVar.f24502d ? 0 : vVar.f24500b)) <= ((long) 8192)) {
                            v vVar5 = eVar.f24463e;
                            l.c(vVar5);
                            vVar5.f(vVar, (int) j10);
                            eVar.G0(eVar.H0() - j10);
                            G0(H0() + j10);
                            return;
                        }
                    }
                    v vVar6 = eVar.f24463e;
                    l.c(vVar6);
                    eVar.f24463e = vVar6.e((int) j10);
                }
                v vVar7 = eVar.f24463e;
                l.c(vVar7);
                long j11 = (long) (vVar7.f24501c - vVar7.f24500b);
                eVar.f24463e = vVar7.b();
                v vVar8 = this.f24463e;
                if (vVar8 == null) {
                    this.f24463e = vVar7;
                    vVar7.f24505g = vVar7;
                    vVar7.f24504f = vVar7;
                } else {
                    l.c(vVar8);
                    v vVar9 = vVar8.f24505g;
                    l.c(vVar9);
                    vVar9.c(vVar7).a();
                }
                eVar.G0(eVar.H0() - j11);
                G0(H0() + j11);
                j10 -= j11;
            }
            return;
        }
        throw new IllegalArgumentException("source == this".toString());
    }

    public final void c() {
        skip(H0());
    }

    public OutputStream c0() {
        return new b(this);
    }

    public void close() {
    }

    public e d() {
        return this;
    }

    /* renamed from: e */
    public e clone() {
        return g();
    }

    public String e0(long j10) {
        if (j10 >= 0) {
            long j11 = Long.MAX_VALUE;
            if (j10 != Long.MAX_VALUE) {
                j11 = j10 + 1;
            }
            byte b10 = (byte) 10;
            long X = X(b10, 0, j11);
            if (X != -1) {
                return jn.a.b(this, X);
            }
            if (j11 < H0() && R(j11 - 1) == ((byte) 13) && R(j11) == b10) {
                return jn.a.b(this, j11);
            }
            e eVar = new e();
            h(eVar, 0, Math.min((long) 32, H0()));
            throw new EOFException("\\n not found: limit=" + Math.min(H0(), j10) + " content=" + eVar.u().i() + 8230);
        }
        throw new IllegalArgumentException(("limit < 0: " + j10).toString());
    }

    /* JADX WARNING: type inference failed for: r19v0, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = 1
            if (r0 != r1) goto L_0x0009
            goto L_0x0081
        L_0x0009:
            boolean r3 = r1 instanceof in.e
            r4 = 0
            if (r3 != 0) goto L_0x0011
        L_0x000e:
            r2 = r4
            goto L_0x0081
        L_0x0011:
            long r5 = r18.H0()
            in.e r1 = (in.e) r1
            long r7 = r1.H0()
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x0020
            goto L_0x000e
        L_0x0020:
            long r5 = r18.H0()
            r7 = 0
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 != 0) goto L_0x002b
            goto L_0x0081
        L_0x002b:
            in.v r3 = r0.f24463e
            cm.l.c(r3)
            in.v r1 = r1.f24463e
            cm.l.c(r1)
            int r5 = r3.f24500b
            int r6 = r1.f24500b
            r9 = r7
        L_0x003a:
            long r11 = r18.H0()
            int r11 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r11 >= 0) goto L_0x0081
            int r11 = r3.f24501c
            int r11 = r11 - r5
            int r12 = r1.f24501c
            int r12 = r12 - r6
            int r11 = java.lang.Math.min(r11, r12)
            long r11 = (long) r11
            r13 = r7
        L_0x004e:
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 >= 0) goto L_0x0069
            byte[] r15 = r3.f24499a
            int r16 = r5 + 1
            byte r5 = r15[r5]
            byte[] r15 = r1.f24499a
            int r17 = r6 + 1
            byte r6 = r15[r6]
            if (r5 == r6) goto L_0x0061
            goto L_0x000e
        L_0x0061:
            r5 = 1
            long r13 = r13 + r5
            r5 = r16
            r6 = r17
            goto L_0x004e
        L_0x0069:
            int r13 = r3.f24501c
            if (r5 != r13) goto L_0x0074
            in.v r3 = r3.f24504f
            cm.l.c(r3)
            int r5 = r3.f24500b
        L_0x0074:
            int r13 = r1.f24501c
            if (r6 != r13) goto L_0x007f
            in.v r1 = r1.f24504f
            cm.l.c(r1)
            int r6 = r1.f24500b
        L_0x007f:
            long r9 = r9 + r11
            goto L_0x003a
        L_0x0081:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: in.e.equals(java.lang.Object):boolean");
    }

    public final long f() {
        long H0 = H0();
        if (H0 == 0) {
            return 0;
        }
        v vVar = this.f24463e;
        l.c(vVar);
        v vVar2 = vVar.f24505g;
        l.c(vVar2);
        int i10 = vVar2.f24501c;
        if (i10 < 8192 && vVar2.f24503e) {
            H0 -= (long) (i10 - vVar2.f24500b);
        }
        return H0;
    }

    public void flush() {
    }

    public final e g() {
        e eVar = new e();
        if (H0() != 0) {
            v vVar = this.f24463e;
            l.c(vVar);
            v d10 = vVar.d();
            eVar.f24463e = d10;
            d10.f24505g = d10;
            d10.f24504f = d10;
            for (v vVar2 = vVar.f24504f; vVar2 != vVar; vVar2 = vVar2.f24504f) {
                v vVar3 = d10.f24505g;
                l.c(vVar3);
                l.c(vVar2);
                vVar3.c(vVar2.d());
            }
            eVar.G0(H0());
        }
        return eVar;
    }

    public final e h(e eVar, long j10, long j11) {
        l.f(eVar, "out");
        c.b(H0(), j10, j11);
        if (j11 != 0) {
            eVar.G0(eVar.H0() + j11);
            v vVar = this.f24463e;
            while (true) {
                l.c(vVar);
                int i10 = vVar.f24501c;
                int i11 = vVar.f24500b;
                if (j10 < ((long) (i10 - i11))) {
                    break;
                }
                j10 -= (long) (i10 - i11);
                vVar = vVar.f24504f;
            }
            while (j11 > 0) {
                l.c(vVar);
                v d10 = vVar.d();
                int i12 = d10.f24500b + ((int) j10);
                d10.f24500b = i12;
                d10.f24501c = Math.min(i12 + ((int) j11), d10.f24501c);
                v vVar2 = eVar.f24463e;
                if (vVar2 == null) {
                    d10.f24505g = d10;
                    d10.f24504f = d10;
                    eVar.f24463e = d10;
                } else {
                    l.c(vVar2);
                    v vVar3 = vVar2.f24505g;
                    l.c(vVar3);
                    vVar3.c(d10);
                }
                j11 -= (long) (d10.f24501c - d10.f24500b);
                vVar = vVar.f24504f;
                j10 = 0;
            }
        }
        return this;
    }

    public int hashCode() {
        v vVar = this.f24463e;
        if (vVar == null) {
            return 0;
        }
        int i10 = 1;
        do {
            int i11 = vVar.f24501c;
            for (int i12 = vVar.f24500b; i12 < i11; i12++) {
                i10 = (i10 * 31) + vVar.f24499a[i12];
            }
            vVar = vVar.f24504f;
            l.c(vVar);
        } while (vVar != this.f24463e);
        return i10;
    }

    public boolean isOpen() {
        return true;
    }

    public void p0(long j10) {
        if (this.f24464f < j10) {
            throw new EOFException();
        }
    }

    public long q0(a0 a0Var) {
        l.f(a0Var, "source");
        long j10 = 0;
        while (true) {
            long read = a0Var.read(this, (long) 8192);
            if (read == -1) {
                return j10;
            }
            j10 += read;
        }
    }

    public int read(ByteBuffer byteBuffer) {
        l.f(byteBuffer, "sink");
        v vVar = this.f24463e;
        if (vVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), vVar.f24501c - vVar.f24500b);
        byteBuffer.put(vVar.f24499a, vVar.f24500b, min);
        int i10 = vVar.f24500b + min;
        vVar.f24500b = i10;
        this.f24464f -= (long) min;
        if (i10 == vVar.f24501c) {
            this.f24463e = vVar.b();
            w.b(vVar);
        }
        return min;
    }

    public byte readByte() {
        if (H0() != 0) {
            v vVar = this.f24463e;
            l.c(vVar);
            int i10 = vVar.f24500b;
            int i11 = vVar.f24501c;
            int i12 = i10 + 1;
            byte b10 = vVar.f24499a[i10];
            G0(H0() - 1);
            if (i12 == i11) {
                this.f24463e = vVar.b();
                w.b(vVar);
            } else {
                vVar.f24500b = i12;
            }
            return b10;
        }
        throw new EOFException();
    }

    public int readInt() {
        if (H0() >= 4) {
            v vVar = this.f24463e;
            l.c(vVar);
            int i10 = vVar.f24500b;
            int i11 = vVar.f24501c;
            if (((long) (i11 - i10)) < 4) {
                return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
            }
            byte[] bArr = vVar.f24499a;
            byte b10 = ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10] & 255) << 24);
            int i12 = i10 + 3;
            int i13 = i10 + 4;
            byte b11 = (bArr[i12] & 255) | b10 | ((bArr[i10 + 2] & 255) << 8);
            G0(H0() - 4);
            if (i13 == i11) {
                this.f24463e = vVar.b();
                w.b(vVar);
            } else {
                vVar.f24500b = i13;
            }
            return b11;
        }
        throw new EOFException();
    }

    public short readShort() {
        if (H0() >= 2) {
            v vVar = this.f24463e;
            l.c(vVar);
            int i10 = vVar.f24500b;
            int i11 = vVar.f24501c;
            if (i11 - i10 < 2) {
                return (short) (((readByte() & 255) << 8) | (readByte() & 255));
            }
            byte[] bArr = vVar.f24499a;
            int i12 = i10 + 1;
            int i13 = i10 + 2;
            byte b10 = (bArr[i12] & 255) | ((bArr[i10] & 255) << 8);
            G0(H0() - 2);
            if (i13 == i11) {
                this.f24463e = vVar.b();
                w.b(vVar);
            } else {
                vVar.f24500b = i13;
            }
            return (short) b10;
        }
        throw new EOFException();
    }

    public void s0(byte[] bArr) {
        l.f(bArr, "sink");
        int i10 = 0;
        while (i10 < bArr.length) {
            int read = read(bArr, i10, bArr.length - i10);
            if (read != -1) {
                i10 += read;
            } else {
                throw new EOFException();
            }
        }
    }

    public void skip(long j10) {
        while (j10 > 0) {
            v vVar = this.f24463e;
            if (vVar != null) {
                int min = (int) Math.min(j10, (long) (vVar.f24501c - vVar.f24500b));
                long j11 = (long) min;
                G0(H0() - j11);
                j10 -= j11;
                int i10 = vVar.f24500b + min;
                vVar.f24500b = i10;
                if (i10 == vVar.f24501c) {
                    this.f24463e = vVar.b();
                    w.b(vVar);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    public b0 timeout() {
        return b0.f24447d;
    }

    public String toString() {
        return I0().toString();
    }

    public h u() {
        return v(H0());
    }

    public h v(long j10) {
        if (!(j10 >= 0 && j10 <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(("byteCount: " + j10).toString());
        } else if (H0() < j10) {
            throw new EOFException();
        } else if (j10 < ((long) 4096)) {
            return new h(S(j10));
        } else {
            h J0 = J0((int) j10);
            skip(j10);
            return J0;
        }
    }

    public int write(ByteBuffer byteBuffer) {
        l.f(byteBuffer, "source");
        int remaining = byteBuffer.remaining();
        int i10 = remaining;
        while (i10 > 0) {
            v K0 = K0(1);
            int min = Math.min(i10, 8192 - K0.f24501c);
            byteBuffer.get(K0.f24499a, K0.f24501c, min);
            i10 -= min;
            K0.f24501c += min;
        }
        this.f24464f += (long) remaining;
        return remaining;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x009a, code lost:
        if (r8 != r9) goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x009c, code lost:
        r14.f24463e = r6.b();
        in.w.b(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a6, code lost:
        r6.f24500b = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a8, code lost:
        if (r1 != false) goto L_0x00ae;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x007f A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long x0() {
        /*
            r14 = this;
            long r0 = r14.H0()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x00b8
            r0 = 0
            r1 = r0
            r4 = r2
        L_0x000d:
            in.v r6 = r14.f24463e
            cm.l.c(r6)
            byte[] r7 = r6.f24499a
            int r8 = r6.f24500b
            int r9 = r6.f24501c
        L_0x0018:
            if (r8 >= r9) goto L_0x009a
            byte r10 = r7[r8]
            r11 = 48
            byte r11 = (byte) r11
            if (r10 < r11) goto L_0x0029
            r12 = 57
            byte r12 = (byte) r12
            if (r10 > r12) goto L_0x0029
            int r11 = r10 - r11
            goto L_0x0043
        L_0x0029:
            r11 = 97
            byte r11 = (byte) r11
            if (r10 < r11) goto L_0x0038
            r12 = 102(0x66, float:1.43E-43)
            byte r12 = (byte) r12
            if (r10 > r12) goto L_0x0038
        L_0x0033:
            int r11 = r10 - r11
            int r11 = r11 + 10
            goto L_0x0043
        L_0x0038:
            r11 = 65
            byte r11 = (byte) r11
            if (r10 < r11) goto L_0x007b
            r12 = 70
            byte r12 = (byte) r12
            if (r10 > r12) goto L_0x007b
            goto L_0x0033
        L_0x0043:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L_0x0053
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L_0x0018
        L_0x0053:
            in.e r0 = new in.e
            r0.<init>()
            in.e r0 = r0.q(r4)
            in.e r0 = r0.Q(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Number too large: "
            r2.append(r3)
            java.lang.String r0 = r0.D0()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x007b:
            if (r0 == 0) goto L_0x007f
            r1 = 1
            goto L_0x009a
        L_0x007f:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.append(r2)
            java.lang.String r2 = in.c.e(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x009a:
            if (r8 != r9) goto L_0x00a6
            in.v r7 = r6.b()
            r14.f24463e = r7
            in.w.b(r6)
            goto L_0x00a8
        L_0x00a6:
            r6.f24500b = r8
        L_0x00a8:
            if (r1 != 0) goto L_0x00ae
            in.v r6 = r14.f24463e
            if (r6 != 0) goto L_0x000d
        L_0x00ae:
            long r1 = r14.H0()
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.G0(r1)
            return r4
        L_0x00b8:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: in.e.x0():long");
    }

    public String y0(Charset charset) {
        l.f(charset, "charset");
        return C0(this.f24464f, charset);
    }

    public InputStream z0() {
        return new a(this);
    }

    public int read(byte[] bArr, int i10, int i11) {
        l.f(bArr, "sink");
        c.b((long) bArr.length, (long) i10, (long) i11);
        v vVar = this.f24463e;
        if (vVar == null) {
            return -1;
        }
        int min = Math.min(i11, vVar.f24501c - vVar.f24500b);
        byte[] bArr2 = vVar.f24499a;
        int i12 = vVar.f24500b;
        byte[] unused = l.d(bArr2, bArr, i10, i12, i12 + min);
        vVar.f24500b += min;
        G0(H0() - ((long) min));
        if (vVar.f24500b != vVar.f24501c) {
            return min;
        }
        this.f24463e = vVar.b();
        w.b(vVar);
        return min;
    }

    public long read(e eVar, long j10) {
        l.f(eVar, "sink");
        if (!(j10 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        } else if (H0() == 0) {
            return -1;
        } else {
            if (j10 > H0()) {
                j10 = H0();
            }
            eVar.b0(this, j10);
            return j10;
        }
    }
}
