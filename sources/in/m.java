package in;

import cm.l;
import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

public final class m implements a0 {

    /* renamed from: e  reason: collision with root package name */
    private int f24479e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f24480f;

    /* renamed from: g  reason: collision with root package name */
    private final g f24481g;

    /* renamed from: h  reason: collision with root package name */
    private final Inflater f24482h;

    public m(g gVar, Inflater inflater) {
        l.f(gVar, "source");
        l.f(inflater, "inflater");
        this.f24481g = gVar;
        this.f24482h = inflater;
    }

    private final void f() {
        int i10 = this.f24479e;
        if (i10 != 0) {
            int remaining = i10 - this.f24482h.getRemaining();
            this.f24479e -= remaining;
            this.f24481g.skip((long) remaining);
        }
    }

    public final long c(e eVar, long j10) {
        l.f(eVar, "sink");
        int i10 = (j10 > 0 ? 1 : (j10 == 0 ? 0 : -1));
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        } else if (!(!this.f24480f)) {
            throw new IllegalStateException("closed".toString());
        } else if (i10 == 0) {
            return 0;
        } else {
            try {
                v K0 = eVar.K0(1);
                e();
                int inflate = this.f24482h.inflate(K0.f24499a, K0.f24501c, (int) Math.min(j10, (long) (8192 - K0.f24501c)));
                f();
                if (inflate > 0) {
                    K0.f24501c += inflate;
                    long j11 = (long) inflate;
                    eVar.G0(eVar.H0() + j11);
                    return j11;
                }
                if (K0.f24500b == K0.f24501c) {
                    eVar.f24463e = K0.b();
                    w.b(K0);
                }
                return 0;
            } catch (DataFormatException e10) {
                throw new IOException(e10);
            }
        }
    }

    public void close() {
        if (!this.f24480f) {
            this.f24482h.end();
            this.f24480f = true;
            this.f24481g.close();
        }
    }

    public final boolean e() {
        if (!this.f24482h.needsInput()) {
            return false;
        }
        if (this.f24481g.P()) {
            return true;
        }
        v vVar = this.f24481g.d().f24463e;
        l.c(vVar);
        int i10 = vVar.f24501c;
        int i11 = vVar.f24500b;
        int i12 = i10 - i11;
        this.f24479e = i12;
        this.f24482h.setInput(vVar.f24499a, i11, i12);
        return false;
    }

    public long read(e eVar, long j10) {
        l.f(eVar, "sink");
        do {
            long c10 = c(eVar, j10);
            if (c10 > 0) {
                return c10;
            }
            if (this.f24482h.finished() || this.f24482h.needsDictionary()) {
                return -1;
            }
        } while (!this.f24481g.P());
        throw new EOFException("source exhausted prematurely");
    }

    public b0 timeout() {
        return this.f24481g.timeout();
    }
}
