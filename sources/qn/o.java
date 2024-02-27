package qn;

import cp.a;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class o extends FilterInputStream {

    /* renamed from: e  reason: collision with root package name */
    private final int f30962e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f30963f;

    /* renamed from: g  reason: collision with root package name */
    private final byte[][] f30964g;

    public o(InputStream inputStream, int i10) {
        this(inputStream, i10, false);
    }

    static z g(int i10, o2 o2Var, byte[][] bArr) {
        switch (i10) {
            case 1:
                return e.i0(l(o2Var, bArr));
            case 2:
                return p.i0(o2Var.h());
            case 3:
                return c.i0(o2Var.h());
            case 4:
                return v.i0(o2Var.h());
            case 5:
                return q.i0(o2Var.h());
            case 6:
                return u.j0(l(o2Var, bArr), true);
            case 7:
                return t.i0(o2Var.h());
            case 10:
                return h.i0(l(o2Var, bArr), true);
            case 12:
                return k0.i0(o2Var.h());
            case 13:
                return b0.i0(o2Var.h(), false);
            case 18:
                return r.i0(o2Var.h());
            case 19:
                return a0.i0(o2Var.h());
            case 20:
                return f0.i0(o2Var.h());
            case 21:
                return o0.i0(o2Var.h());
            case 22:
                return n.i0(o2Var.h());
            case 23:
                return j0.i0(o2Var.h());
            case 24:
                return l.i0(o2Var.h());
            case 25:
                return m.i0(o2Var.h());
            case 26:
                return p0.i0(o2Var.h());
            case 27:
                return k.i0(o2Var.h());
            case 28:
                return l0.i0(o2Var.h());
            case 30:
                return b.j0(h(o2Var));
            default:
                throw new IOException("unknown tag " + i10 + " encountered");
        }
    }

    private static char[] h(o2 o2Var) {
        int f10 = o2Var.f();
        if ((f10 & 1) == 0) {
            int i10 = f10 / 2;
            char[] cArr = new char[i10];
            byte[] bArr = new byte[8];
            int i11 = 0;
            int i12 = 0;
            while (f10 >= 8) {
                if (a.d(o2Var, bArr, 0, 8) == 8) {
                    cArr[i12] = (char) ((bArr[0] << 8) | (bArr[1] & 255));
                    cArr[i12 + 1] = (char) ((bArr[2] << 8) | (bArr[3] & 255));
                    cArr[i12 + 2] = (char) ((bArr[4] << 8) | (bArr[5] & 255));
                    cArr[i12 + 3] = (char) ((bArr[6] << 8) | (bArr[7] & 255));
                    i12 += 4;
                    f10 -= 8;
                } else {
                    throw new EOFException("EOF encountered in middle of BMPString");
                }
            }
            if (f10 > 0) {
                if (a.d(o2Var, bArr, 0, f10) == f10) {
                    do {
                        int i13 = i11 + 1;
                        i11 += 2;
                        cArr[i12] = (char) ((bArr[i13] & 255) | (bArr[i11] << 8));
                        i12++;
                    } while (i11 < f10);
                } else {
                    throw new EOFException("EOF encountered in middle of BMPString");
                }
            }
            if (o2Var.f() == 0 && i10 == i12) {
                return cArr;
            }
            throw new IllegalStateException();
        }
        throw new IOException("malformed BMPString encoding encountered");
    }

    private static byte[] l(o2 o2Var, byte[][] bArr) {
        int f10 = o2Var.f();
        if (f10 >= bArr.length) {
            return o2Var.h();
        }
        byte[] bArr2 = bArr[f10];
        if (bArr2 == null) {
            bArr2 = new byte[f10];
            bArr[f10] = bArr2;
        }
        o2Var.g(bArr2);
        return bArr2;
    }

    static int o(InputStream inputStream, int i10, boolean z10) {
        int read = inputStream.read();
        if ((read >>> 7) == 0) {
            return read;
        }
        if (128 == read) {
            return -1;
        }
        if (read < 0) {
            throw new EOFException("EOF found when length expected");
        } else if (255 != read) {
            int i11 = read & 127;
            int i12 = 0;
            int i13 = 0;
            do {
                int read2 = inputStream.read();
                if (read2 < 0) {
                    throw new EOFException("EOF found reading length");
                } else if ((i12 >>> 23) == 0) {
                    i12 = (i12 << 8) + read2;
                    i13++;
                } else {
                    throw new IOException("long form definite-length more than 31 bits");
                }
            } while (i13 < i11);
            if (i12 < i10 || z10) {
                return i12;
            }
            throw new IOException("corrupted stream - out of bounds length found: " + i12 + " >= " + i10);
        } else {
            throw new IOException("invalid long form definite-length 0xFF");
        }
    }

    static int y(InputStream inputStream, int i10) {
        int i11 = i10 & 31;
        if (i11 != 31) {
            return i11;
        }
        int read = inputStream.read();
        if (read < 31) {
            if (read < 0) {
                throw new EOFException("EOF found inside tag value.");
            }
            throw new IOException("corrupted stream - high tag number < 31 found");
        } else if ((read & 127) != 0) {
            int i12 = 0;
            while ((read & 128) != 0) {
                if ((i12 >>> 24) == 0) {
                    i12 = ((read & 127) | i12) << 7;
                    read = inputStream.read();
                    if (read < 0) {
                        throw new EOFException("EOF found inside tag value.");
                    }
                } else {
                    throw new IOException("Tag number more than 31 bits");
                }
            }
            return i12 | (read & 127);
        } else {
            throw new IOException("corrupted stream - invalid high tag number found");
        }
    }

    /* access modifiers changed from: package-private */
    public z B(int i10, int i11, boolean z10, o2 o2Var) {
        return !z10 ? h0.l0(i10, i11, o2Var.h()) : h0.j0(i10, i11, H(o2Var));
    }

    /* access modifiers changed from: package-private */
    public g E() {
        z s10 = s();
        if (s10 == null) {
            return new g(0);
        }
        g gVar = new g();
        do {
            gVar.a(s10);
            s10 = s();
        } while (s10 != null);
        return gVar;
    }

    /* access modifiers changed from: package-private */
    public g H(o2 o2Var) {
        int f10 = o2Var.f();
        return f10 < 1 ? new g(0) : new o(o2Var, f10, this.f30963f, this.f30964g).E();
    }

    /* access modifiers changed from: package-private */
    public c c(g gVar) {
        int f10 = gVar.f();
        c[] cVarArr = new c[f10];
        int i10 = 0;
        while (i10 != f10) {
            f d10 = gVar.d(i10);
            if (d10 instanceof c) {
                cVarArr[i10] = (c) d10;
                i10++;
            } else {
                throw new i("unknown object encountered in constructed BIT STRING: " + d10.getClass());
            }
        }
        return new s0(cVarArr);
    }

    /* access modifiers changed from: package-private */
    public v e(g gVar) {
        int f10 = gVar.f();
        v[] vVarArr = new v[f10];
        int i10 = 0;
        while (i10 != f10) {
            f d10 = gVar.d(i10);
            if (d10 instanceof v) {
                vVarArr[i10] = (v) d10;
                i10++;
            } else {
                throw new i("unknown object encountered in constructed OCTET STRING: " + d10.getClass());
            }
        }
        return new v0(vVarArr);
    }

    /* access modifiers changed from: protected */
    public z f(int i10, int i11, int i12) {
        o2 o2Var = new o2(this, i12, this.f30962e);
        if ((i10 & 224) == 0) {
            return g(i11, o2Var, this.f30964g);
        }
        int i13 = i10 & 192;
        boolean z10 = true;
        if (i13 != 0) {
            if ((i10 & 32) == 0) {
                z10 = false;
            }
            return B(i13, i11, z10, o2Var);
        } else if (i11 == 3) {
            return c(H(o2Var));
        } else {
            if (i11 == 4) {
                return e(H(o2Var));
            }
            if (i11 == 8) {
                return g2.a(H(o2Var)).o0();
            }
            if (i11 != 16) {
                if (i11 == 17) {
                    return g2.b(H(o2Var));
                }
                throw new IOException("unknown tag " + i11 + " encountered");
            } else if (o2Var.f() < 1) {
                return g2.f30922a;
            } else {
                return this.f30963f ? new s2(o2Var.h()) : g2.a(H(o2Var));
            }
        }
    }

    /* access modifiers changed from: protected */
    public int n() {
        return o(this, this.f30962e, false);
    }

    public z s() {
        int read = read();
        if (read > 0) {
            int y10 = y(this, read);
            int n10 = n();
            if (n10 >= 0) {
                try {
                    return f(read, y10, n10);
                } catch (IllegalArgumentException e10) {
                    throw new i("corrupted stream detected", e10);
                }
            } else if ((read & 32) != 0) {
                e0 e0Var = new e0(new q2(this, this.f30962e), this.f30962e, this.f30964g);
                int i10 = read & 192;
                if (i10 != 0) {
                    return e0Var.c(i10, y10);
                }
                if (y10 == 3) {
                    return t0.a(e0Var);
                }
                if (y10 == 4) {
                    return w0.a(e0Var);
                }
                if (y10 == 8) {
                    return j1.a(e0Var);
                }
                if (y10 == 16) {
                    return y0.a(e0Var);
                }
                if (y10 == 17) {
                    return a1.a(e0Var);
                }
                throw new IOException("unknown BER object encountered");
            } else {
                throw new IOException("indefinite-length primitive encoding encountered");
            }
        } else if (read != 0) {
            return null;
        } else {
            throw new IOException("unexpected end-of-contents marker");
        }
    }

    public o(InputStream inputStream, int i10, boolean z10) {
        this(inputStream, i10, z10, new byte[11][]);
    }

    private o(InputStream inputStream, int i10, boolean z10, byte[][] bArr) {
        super(inputStream);
        this.f30962e = i10;
        this.f30963f = z10;
        this.f30964g = bArr;
    }

    public o(byte[] bArr) {
        this((InputStream) new ByteArrayInputStream(bArr), bArr.length);
    }

    public o(byte[] bArr, boolean z10) {
        this(new ByteArrayInputStream(bArr), bArr.length, z10);
    }
}
