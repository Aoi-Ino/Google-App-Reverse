package e8;

import a8.e;
import b8.a;
import java.io.OutputStream;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class f extends OutputStream {

    /* renamed from: g  reason: collision with root package name */
    private static int f10655g;

    /* renamed from: h  reason: collision with root package name */
    private static byte[][] f10656h = new byte[0][];

    /* renamed from: i  reason: collision with root package name */
    private static final char[] f10657i = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

    /* renamed from: j  reason: collision with root package name */
    private static final byte[] f10658j = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    /* renamed from: k  reason: collision with root package name */
    public static boolean f10659k = false;

    /* renamed from: l  reason: collision with root package name */
    private static final DecimalFormatSymbols f10660l = new DecimalFormatSymbols(Locale.US);

    /* renamed from: e  reason: collision with root package name */
    protected int f10661e;

    /* renamed from: f  reason: collision with root package name */
    protected byte[] f10662f;

    public f() {
        this(128);
    }

    public static String E(double d10) {
        return H(d10, (f) null);
    }

    public static String H(double d10, f fVar) {
        boolean z10;
        byte[] bArr;
        double d11 = d10;
        f fVar2 = fVar;
        if (f10659k) {
            String format = new DecimalFormat("0.######", f10660l).format(d11);
            if (fVar2 == null) {
                return format;
            }
            fVar2.n(format);
            return null;
        } else if (Math.abs(d10) >= 1.5E-5d) {
            int i10 = 0;
            if (d11 < 0.0d) {
                d11 = -d11;
                z10 = true;
            } else {
                z10 = false;
            }
            int i11 = 100000;
            if (d11 < 1.0d) {
                double d12 = d11 + 5.0E-6d;
                if (d12 >= 1.0d) {
                    if (z10) {
                        if (fVar2 == null) {
                            return "-1";
                        }
                        fVar2.c((byte) 45);
                        fVar2.c((byte) 49);
                        return null;
                    } else if (fVar2 == null) {
                        return "1";
                    } else {
                        fVar2.c((byte) 49);
                        return null;
                    }
                } else if (fVar2 != null) {
                    int i12 = (int) (d12 * 100000.0d);
                    if (z10) {
                        fVar2.c((byte) 45);
                    }
                    fVar2.c((byte) 48);
                    fVar2.c((byte) 46);
                    fVar2.c((byte) ((i12 / 10000) + 48));
                    if (i12 % 10000 != 0) {
                        fVar2.c((byte) (((i12 / 1000) % 10) + 48));
                        if (i12 % 1000 != 0) {
                            fVar2.c((byte) (((i12 / 100) % 10) + 48));
                            if (i12 % 100 != 0) {
                                fVar2.c((byte) (((i12 / 10) % 10) + 48));
                                int i13 = i12 % 10;
                                if (i13 != 0) {
                                    fVar2.c((byte) (i13 + 48));
                                }
                            }
                        }
                    }
                    return null;
                } else {
                    int i14 = (int) (d12 * ((double) 100000));
                    StringBuffer stringBuffer = new StringBuffer();
                    if (z10) {
                        stringBuffer.append('-');
                    }
                    stringBuffer.append("0.");
                    while (true) {
                        i11 /= 10;
                        if (i14 >= i11) {
                            break;
                        }
                        stringBuffer.append('0');
                    }
                    stringBuffer.append(i14);
                    int length = stringBuffer.length() - 1;
                    while (stringBuffer.charAt(length) == '0') {
                        length--;
                    }
                    stringBuffer.setLength(length + 1);
                    return stringBuffer.toString();
                }
            } else if (d11 <= 32767.0d) {
                int i15 = (int) ((d11 + 0.005d) * 100.0d);
                int i16 = f10655g;
                if (i15 >= i16 || (bArr = f10656h[i15]) == null) {
                    if (fVar2 != null) {
                        if (i15 < i16) {
                            int i17 = i15 >= 1000000 ? 5 : i15 >= 100000 ? 4 : i15 >= 10000 ? 3 : i15 >= 1000 ? 2 : i15 >= 100 ? 1 : 0;
                            int i18 = i15 % 100;
                            if (i18 != 0) {
                                i17 += 2;
                            }
                            int i19 = i15 % 10;
                            if (i19 != 0) {
                                i17++;
                            }
                            byte[] bArr2 = new byte[i17];
                            if (i15 >= 1000000) {
                                bArr2[0] = f10658j[i15 / 1000000];
                                i10 = 1;
                            }
                            if (i15 >= 100000) {
                                bArr2[i10] = f10658j[(i15 / 100000) % 10];
                                i10++;
                            }
                            if (i15 >= 10000) {
                                bArr2[i10] = f10658j[(i15 / 10000) % 10];
                                i10++;
                            }
                            if (i15 >= 1000) {
                                bArr2[i10] = f10658j[(i15 / 1000) % 10];
                                i10++;
                            }
                            if (i15 >= 100) {
                                bArr2[i10] = f10658j[(i15 / 100) % 10];
                                i10++;
                            }
                            if (i18 != 0) {
                                int i20 = i10 + 1;
                                bArr2[i10] = 46;
                                int i21 = i10 + 2;
                                byte[] bArr3 = f10658j;
                                bArr2[i20] = bArr3[(i15 / 10) % 10];
                                if (i19 != 0) {
                                    bArr2[i21] = bArr3[i19];
                                }
                            }
                            f10656h[i15] = bArr2;
                        }
                        if (z10) {
                            fVar2.c((byte) 45);
                        }
                        if (i15 >= 1000000) {
                            fVar2.c(f10658j[i15 / 1000000]);
                        }
                        if (i15 >= 100000) {
                            fVar2.c(f10658j[(i15 / 100000) % 10]);
                        }
                        if (i15 >= 10000) {
                            fVar2.c(f10658j[(i15 / 10000) % 10]);
                        }
                        if (i15 >= 1000) {
                            fVar2.c(f10658j[(i15 / 1000) % 10]);
                        }
                        if (i15 >= 100) {
                            fVar2.c(f10658j[(i15 / 100) % 10]);
                        }
                        if (i15 % 100 == 0) {
                            return null;
                        }
                        fVar2.c((byte) 46);
                        byte[] bArr4 = f10658j;
                        fVar2.c(bArr4[(i15 / 10) % 10]);
                        int i22 = i15 % 10;
                        if (i22 == 0) {
                            return null;
                        }
                        fVar2.c(bArr4[i22]);
                        return null;
                    }
                    StringBuffer stringBuffer2 = new StringBuffer();
                    if (z10) {
                        stringBuffer2.append('-');
                    }
                    if (i15 >= 1000000) {
                        stringBuffer2.append(f10657i[i15 / 1000000]);
                    }
                    if (i15 >= 100000) {
                        stringBuffer2.append(f10657i[(i15 / 100000) % 10]);
                    }
                    if (i15 >= 10000) {
                        stringBuffer2.append(f10657i[(i15 / 10000) % 10]);
                    }
                    if (i15 >= 1000) {
                        stringBuffer2.append(f10657i[(i15 / 1000) % 10]);
                    }
                    if (i15 >= 100) {
                        stringBuffer2.append(f10657i[(i15 / 100) % 10]);
                    }
                    if (i15 % 100 != 0) {
                        stringBuffer2.append('.');
                        char[] cArr = f10657i;
                        stringBuffer2.append(cArr[(i15 / 10) % 10]);
                        int i23 = i15 % 10;
                        if (i23 != 0) {
                            stringBuffer2.append(cArr[i23]);
                        }
                    }
                    return stringBuffer2.toString();
                } else if (fVar2 != null) {
                    if (z10) {
                        fVar2.c((byte) 45);
                    }
                    fVar2.o(f10656h[i15]);
                    return null;
                } else {
                    String d13 = o0.d(bArr, (String) null);
                    if (!z10) {
                        return d13;
                    }
                    return "-" + d13;
                }
            } else {
                StringBuffer stringBuffer3 = new StringBuffer();
                if (z10) {
                    stringBuffer3.append('-');
                }
                stringBuffer3.append((long) (d11 + 0.5d));
                return stringBuffer3.toString();
            }
        } else if (fVar2 == null) {
            return "0";
        } else {
            fVar2.c((byte) 48);
            return null;
        }
    }

    public f B(int i10) {
        int i11 = this.f10661e + 1;
        byte[] bArr = this.f10662f;
        if (i11 > bArr.length) {
            byte[] bArr2 = new byte[Math.max(bArr.length << 1, i11)];
            System.arraycopy(this.f10662f, 0, bArr2, 0, this.f10661e);
            this.f10662f = bArr2;
        }
        this.f10662f[this.f10661e] = (byte) i10;
        this.f10661e = i11;
        return this;
    }

    public void R() {
        this.f10661e = 0;
    }

    public void X(int i10) {
        if (i10 > this.f10661e || i10 < 0) {
            throw new IndexOutOfBoundsException(a.b("the.new.size.must.be.positive.and.lt.eq.of.the.current.size", new Object[0]));
        }
        this.f10661e = i10;
    }

    public int Y() {
        return this.f10661e;
    }

    public byte[] Z() {
        int i10 = this.f10661e;
        byte[] bArr = new byte[i10];
        System.arraycopy(this.f10662f, 0, bArr, 0, i10);
        return bArr;
    }

    public f c(byte b10) {
        return B(b10);
    }

    public void c0(OutputStream outputStream) {
        outputStream.write(this.f10662f, 0, this.f10661e);
    }

    public f e(char c10) {
        return B(c10);
    }

    public f f(double d10) {
        n(H(d10, this));
        return this;
    }

    public f g(float f10) {
        return f((double) f10);
    }

    public f h(int i10) {
        return f((double) i10);
    }

    public f l(f fVar) {
        return s(fVar.f10662f, 0, fVar.f10661e);
    }

    public f n(String str) {
        return str != null ? o(e.f(str)) : this;
    }

    public f o(byte[] bArr) {
        return s(bArr, 0, bArr.length);
    }

    public f s(byte[] bArr, int i10, int i11) {
        int i12;
        if (i10 >= 0 && i10 <= bArr.length && i11 >= 0 && (i12 = i10 + i11) <= bArr.length && i12 >= 0 && i11 != 0) {
            int i13 = this.f10661e + i11;
            byte[] bArr2 = this.f10662f;
            if (i13 > bArr2.length) {
                byte[] bArr3 = new byte[Math.max(bArr2.length << 1, i13)];
                System.arraycopy(this.f10662f, 0, bArr3, 0, this.f10661e);
                this.f10662f = bArr3;
            }
            System.arraycopy(bArr, i10, this.f10662f, this.f10661e, i11);
            this.f10661e = i13;
        }
        return this;
    }

    public String toString() {
        return new String(this.f10662f, 0, this.f10661e);
    }

    public void write(int i10) {
        c((byte) i10);
    }

    public f y(byte b10) {
        byte[] bArr = f10658j;
        c(bArr[(b10 >> 4) & 15]);
        return c(bArr[b10 & 15]);
    }

    public f(int i10) {
        this.f10662f = new byte[(i10 < 1 ? 128 : i10)];
    }

    public void write(byte[] bArr, int i10, int i11) {
        s(bArr, i10, i11);
    }
}
