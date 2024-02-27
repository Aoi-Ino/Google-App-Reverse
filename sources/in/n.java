package in;

import cm.l;
import java.io.IOException;
import java.io.InputStream;

final class n implements a0 {

    /* renamed from: e  reason: collision with root package name */
    private final InputStream f24483e;

    /* renamed from: f  reason: collision with root package name */
    private final b0 f24484f;

    public n(InputStream inputStream, b0 b0Var) {
        l.f(inputStream, "input");
        l.f(b0Var, "timeout");
        this.f24483e = inputStream;
        this.f24484f = b0Var;
    }

    public void close() {
        this.f24483e.close();
    }

    public long read(e eVar, long j10) {
        l.f(eVar, "sink");
        int i10 = (j10 > 0 ? 1 : (j10 == 0 ? 0 : -1));
        if (i10 == 0) {
            return 0;
        }
        if (i10 >= 0) {
            try {
                this.f24484f.f();
                v K0 = eVar.K0(1);
                int read = this.f24483e.read(K0.f24499a, K0.f24501c, (int) Math.min(j10, (long) (8192 - K0.f24501c)));
                if (read != -1) {
                    K0.f24501c += read;
                    long j11 = (long) read;
                    eVar.G0(eVar.H0() + j11);
                    return j11;
                } else if (K0.f24500b != K0.f24501c) {
                    return -1;
                } else {
                    eVar.f24463e = K0.b();
                    w.b(K0);
                    return -1;
                }
            } catch (AssertionError e10) {
                if (o.c(e10)) {
                    throw new IOException(e10);
                }
                throw e10;
            }
        } else {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
    }

    public b0 timeout() {
        return this.f24484f;
    }

    public String toString() {
        return "source(" + this.f24483e + ')';
    }
}
