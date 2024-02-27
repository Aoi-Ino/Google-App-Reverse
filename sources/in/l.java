package in;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

public final class l implements a0 {

    /* renamed from: e  reason: collision with root package name */
    private byte f24474e;

    /* renamed from: f  reason: collision with root package name */
    private final u f24475f;

    /* renamed from: g  reason: collision with root package name */
    private final Inflater f24476g;

    /* renamed from: h  reason: collision with root package name */
    private final m f24477h;

    /* renamed from: i  reason: collision with root package name */
    private final CRC32 f24478i = new CRC32();

    public l(a0 a0Var) {
        cm.l.f(a0Var, "source");
        u uVar = new u(a0Var);
        this.f24475f = uVar;
        Inflater inflater = new Inflater(true);
        this.f24476g = inflater;
        this.f24477h = new m(uVar, inflater);
    }

    private final void c(String str, int i10, int i11) {
        if (i11 != i10) {
            String format = String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i11), Integer.valueOf(i10)}, 3));
            cm.l.e(format, "java.lang.String.format(this, *args)");
            throw new IOException(format);
        }
    }

    private final void e() {
        this.f24475f.p0(10);
        byte R = this.f24475f.f24494e.R(3);
        boolean z10 = ((R >> 1) & 1) == 1;
        if (z10) {
            g(this.f24475f.f24494e, 0, 10);
        }
        c("ID1ID2", 8075, this.f24475f.readShort());
        this.f24475f.skip(8);
        if (((R >> 2) & 1) == 1) {
            this.f24475f.p0(2);
            if (z10) {
                g(this.f24475f.f24494e, 0, 2);
            }
            long B0 = (long) this.f24475f.f24494e.B0();
            this.f24475f.p0(B0);
            if (z10) {
                g(this.f24475f.f24494e, 0, B0);
            }
            this.f24475f.skip(B0);
        }
        if (((R >> 3) & 1) == 1) {
            long c10 = this.f24475f.c((byte) 0);
            if (c10 != -1) {
                if (z10) {
                    g(this.f24475f.f24494e, 0, c10 + 1);
                }
                this.f24475f.skip(c10 + 1);
            } else {
                throw new EOFException();
            }
        }
        if (((R >> 4) & 1) == 1) {
            long c11 = this.f24475f.c((byte) 0);
            if (c11 != -1) {
                if (z10) {
                    g(this.f24475f.f24494e, 0, c11 + 1);
                }
                this.f24475f.skip(c11 + 1);
            } else {
                throw new EOFException();
            }
        }
        if (z10) {
            c("FHCRC", this.f24475f.g(), (short) ((int) this.f24478i.getValue()));
            this.f24478i.reset();
        }
    }

    private final void f() {
        c("CRC", this.f24475f.f(), (int) this.f24478i.getValue());
        c("ISIZE", this.f24475f.f(), (int) this.f24476g.getBytesWritten());
    }

    private final void g(e eVar, long j10, long j11) {
        v vVar = eVar.f24463e;
        while (true) {
            cm.l.c(vVar);
            int i10 = vVar.f24501c;
            int i11 = vVar.f24500b;
            if (j10 < ((long) (i10 - i11))) {
                break;
            }
            j10 -= (long) (i10 - i11);
            vVar = vVar.f24504f;
        }
        while (j11 > 0) {
            int i12 = (int) (((long) vVar.f24500b) + j10);
            int min = (int) Math.min((long) (vVar.f24501c - i12), j11);
            this.f24478i.update(vVar.f24499a, i12, min);
            j11 -= (long) min;
            vVar = vVar.f24504f;
            cm.l.c(vVar);
            j10 = 0;
        }
    }

    public void close() {
        this.f24477h.close();
    }

    public long read(e eVar, long j10) {
        cm.l.f(eVar, "sink");
        int i10 = (j10 > 0 ? 1 : (j10 == 0 ? 0 : -1));
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        } else if (i10 == 0) {
            return 0;
        } else {
            if (this.f24474e == 0) {
                e();
                this.f24474e = 1;
            }
            if (this.f24474e == 1) {
                long H0 = eVar.H0();
                long read = this.f24477h.read(eVar, j10);
                if (read != -1) {
                    g(eVar, H0, read);
                    return read;
                }
                this.f24474e = 2;
            }
            if (this.f24474e == 2) {
                f();
                this.f24474e = 3;
                if (!this.f24475f.P()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1;
        }
    }

    public b0 timeout() {
        return this.f24475f.timeout();
    }
}
