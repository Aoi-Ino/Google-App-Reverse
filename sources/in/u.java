package in;

import cm.l;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public final class u implements g {

    /* renamed from: e  reason: collision with root package name */
    public final e f24494e = new e();

    /* renamed from: f  reason: collision with root package name */
    public boolean f24495f;

    /* renamed from: g  reason: collision with root package name */
    public final a0 f24496g;

    public static final class a extends InputStream {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ u f24497e;

        a(u uVar) {
            this.f24497e = uVar;
        }

        public int available() {
            u uVar = this.f24497e;
            if (!uVar.f24495f) {
                return (int) Math.min(uVar.f24494e.H0(), (long) Integer.MAX_VALUE);
            }
            throw new IOException("closed");
        }

        public void close() {
            this.f24497e.close();
        }

        public int read() {
            u uVar = this.f24497e;
            if (!uVar.f24495f) {
                if (uVar.f24494e.H0() == 0) {
                    u uVar2 = this.f24497e;
                    if (uVar2.f24496g.read(uVar2.f24494e, (long) 8192) == -1) {
                        return -1;
                    }
                }
                return this.f24497e.f24494e.readByte() & 255;
            }
            throw new IOException("closed");
        }

        public String toString() {
            return this.f24497e + ".inputStream()";
        }

        public int read(byte[] bArr, int i10, int i11) {
            l.f(bArr, "data");
            if (!this.f24497e.f24495f) {
                c.b((long) bArr.length, (long) i10, (long) i11);
                if (this.f24497e.f24494e.H0() == 0) {
                    u uVar = this.f24497e;
                    if (uVar.f24496g.read(uVar.f24494e, (long) 8192) == -1) {
                        return -1;
                    }
                }
                return this.f24497e.f24494e.read(bArr, i10, i11);
            }
            throw new IOException("closed");
        }
    }

    public u(a0 a0Var) {
        l.f(a0Var, "source");
        this.f24496g = a0Var;
    }

    public boolean A(long j10) {
        if (!(j10 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        } else if (!this.f24495f) {
            while (this.f24494e.H0() < j10) {
                if (this.f24496g.read(this.f24494e, (long) 8192) == -1) {
                    return false;
                }
            }
            return true;
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    public int I(r rVar) {
        l.f(rVar, "options");
        if (!this.f24495f) {
            while (true) {
                int c10 = jn.a.c(this.f24494e, rVar, true);
                if (c10 == -2) {
                    if (this.f24496g.read(this.f24494e, (long) 8192) == -1) {
                        break;
                    }
                } else if (c10 != -1) {
                    this.f24494e.skip((long) rVar.r()[c10].q());
                    return c10;
                }
            }
            return -1;
        }
        throw new IllegalStateException("closed".toString());
    }

    public String J() {
        return e0(Long.MAX_VALUE);
    }

    public long L(y yVar) {
        l.f(yVar, "sink");
        long j10 = 0;
        while (this.f24496g.read(this.f24494e, (long) 8192) != -1) {
            long f10 = this.f24494e.f();
            if (f10 > 0) {
                j10 += f10;
                yVar.b0(this.f24494e, f10);
            }
        }
        if (this.f24494e.H0() <= 0) {
            return j10;
        }
        long H0 = j10 + this.f24494e.H0();
        e eVar = this.f24494e;
        yVar.b0(eVar, eVar.H0());
        return H0;
    }

    public byte[] M() {
        this.f24494e.q0(this.f24496g);
        return this.f24494e.M();
    }

    public boolean P() {
        if (!this.f24495f) {
            return this.f24494e.P() && this.f24496g.read(this.f24494e, (long) 8192) == -1;
        }
        throw new IllegalStateException("closed".toString());
    }

    public byte[] S(long j10) {
        p0(j10);
        return this.f24494e.S(j10);
    }

    public long c(byte b10) {
        return e(b10, 0, Long.MAX_VALUE);
    }

    public void close() {
        if (!this.f24495f) {
            this.f24495f = true;
            this.f24496g.close();
            this.f24494e.c();
        }
    }

    public e d() {
        return this.f24494e;
    }

    public long e(byte b10, long j10, long j11) {
        boolean z10 = true;
        if (!this.f24495f) {
            if (0 > j10 || j11 < j10) {
                z10 = false;
            }
            if (z10) {
                while (j10 < j11) {
                    long X = this.f24494e.X(b10, j10, j11);
                    if (X != -1) {
                        return X;
                    }
                    long H0 = this.f24494e.H0();
                    if (H0 >= j11 || this.f24496g.read(this.f24494e, (long) 8192) == -1) {
                        return -1;
                    }
                    j10 = Math.max(j10, H0);
                }
                return -1;
            }
            throw new IllegalArgumentException(("fromIndex=" + j10 + " toIndex=" + j11).toString());
        }
        throw new IllegalStateException("closed".toString());
    }

    public String e0(long j10) {
        if (j10 >= 0) {
            long j11 = j10 == Long.MAX_VALUE ? Long.MAX_VALUE : j10 + 1;
            byte b10 = (byte) 10;
            long e10 = e(b10, 0, j11);
            if (e10 != -1) {
                return jn.a.b(this.f24494e, e10);
            }
            if (j11 < Long.MAX_VALUE && A(j11) && this.f24494e.R(j11 - 1) == ((byte) 13) && A(1 + j11) && this.f24494e.R(j11) == b10) {
                return jn.a.b(this.f24494e, j11);
            }
            e eVar = new e();
            e eVar2 = this.f24494e;
            eVar2.h(eVar, 0, Math.min((long) 32, eVar2.H0()));
            throw new EOFException("\\n not found: limit=" + Math.min(this.f24494e.H0(), j10) + " content=" + eVar.u().i() + "…");
        }
        throw new IllegalArgumentException(("limit < 0: " + j10).toString());
    }

    public int f() {
        p0(4);
        return this.f24494e.A0();
    }

    public short g() {
        p0(2);
        return this.f24494e.B0();
    }

    public boolean isOpen() {
        return !this.f24495f;
    }

    public void p0(long j10) {
        if (!A(j10)) {
            throw new EOFException();
        }
    }

    public int read(ByteBuffer byteBuffer) {
        l.f(byteBuffer, "sink");
        if (this.f24494e.H0() == 0 && this.f24496g.read(this.f24494e, (long) 8192) == -1) {
            return -1;
        }
        return this.f24494e.read(byteBuffer);
    }

    public byte readByte() {
        p0(1);
        return this.f24494e.readByte();
    }

    public int readInt() {
        p0(4);
        return this.f24494e.readInt();
    }

    public short readShort() {
        p0(2);
        return this.f24494e.readShort();
    }

    public void skip(long j10) {
        if (!this.f24495f) {
            while (j10 > 0) {
                if (this.f24494e.H0() == 0 && this.f24496g.read(this.f24494e, (long) 8192) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j10, this.f24494e.H0());
                this.f24494e.skip(min);
                j10 -= min;
            }
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    public b0 timeout() {
        return this.f24496g.timeout();
    }

    public String toString() {
        return "buffer(" + this.f24496g + ')';
    }

    public h u() {
        this.f24494e.q0(this.f24496g);
        return this.f24494e.u();
    }

    public h v(long j10) {
        p0(j10);
        return this.f24494e.v(j10);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long x0() {
        /*
            r5 = this;
            r0 = 1
            r5.p0(r0)
            r0 = 0
        L_0x0006:
            int r1 = r0 + 1
            long r2 = (long) r1
            boolean r2 = r5.A(r2)
            if (r2 == 0) goto L_0x0064
            in.e r2 = r5.f24494e
            long r3 = (long) r0
            byte r2 = r2.R(r3)
            r3 = 48
            byte r3 = (byte) r3
            if (r2 < r3) goto L_0x0020
            r3 = 57
            byte r3 = (byte) r3
            if (r2 <= r3) goto L_0x0035
        L_0x0020:
            r3 = 97
            byte r3 = (byte) r3
            if (r2 < r3) goto L_0x002a
            r3 = 102(0x66, float:1.43E-43)
            byte r3 = (byte) r3
            if (r2 <= r3) goto L_0x0035
        L_0x002a:
            r3 = 65
            byte r3 = (byte) r3
            if (r2 < r3) goto L_0x0037
            r3 = 70
            byte r3 = (byte) r3
            if (r2 <= r3) goto L_0x0035
            goto L_0x0037
        L_0x0035:
            r0 = r1
            goto L_0x0006
        L_0x0037:
            if (r0 == 0) goto L_0x003a
            goto L_0x0064
        L_0x003a:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.append(r3)
            r3 = 16
            int r3 = km.b.a(r3)
            int r3 = km.b.a(r3)
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            java.lang.String r3 = "java.lang.Integer.toStri…(this, checkRadix(radix))"
            cm.l.e(r2, r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0064:
            in.e r0 = r5.f24494e
            long r0 = r0.x0()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: in.u.x0():long");
    }

    public String y0(Charset charset) {
        l.f(charset, "charset");
        this.f24494e.q0(this.f24496g);
        return this.f24494e.y0(charset);
    }

    public InputStream z0() {
        return new a(this);
    }

    public long read(e eVar, long j10) {
        l.f(eVar, "sink");
        if (!(j10 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        } else if (!(!this.f24495f)) {
            throw new IllegalStateException("closed".toString());
        } else if (this.f24494e.H0() == 0 && this.f24496g.read(this.f24494e, (long) 8192) == -1) {
            return -1;
        } else {
            return this.f24494e.read(eVar, Math.min(j10, this.f24494e.H0()));
        }
    }
}
