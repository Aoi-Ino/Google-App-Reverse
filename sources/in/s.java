package in;

import cm.l;
import java.io.OutputStream;

final class s implements y {

    /* renamed from: e  reason: collision with root package name */
    private final OutputStream f24489e;

    /* renamed from: f  reason: collision with root package name */
    private final b0 f24490f;

    public s(OutputStream outputStream, b0 b0Var) {
        l.f(outputStream, "out");
        l.f(b0Var, "timeout");
        this.f24489e = outputStream;
        this.f24490f = b0Var;
    }

    public void b0(e eVar, long j10) {
        l.f(eVar, "source");
        c.b(eVar.H0(), 0, j10);
        while (j10 > 0) {
            this.f24490f.f();
            v vVar = eVar.f24463e;
            l.c(vVar);
            int min = (int) Math.min(j10, (long) (vVar.f24501c - vVar.f24500b));
            this.f24489e.write(vVar.f24499a, vVar.f24500b, min);
            vVar.f24500b += min;
            long j11 = (long) min;
            j10 -= j11;
            eVar.G0(eVar.H0() - j11);
            if (vVar.f24500b == vVar.f24501c) {
                eVar.f24463e = vVar.b();
                w.b(vVar);
            }
        }
    }

    public void close() {
        this.f24489e.close();
    }

    public void flush() {
        this.f24489e.flush();
    }

    public b0 timeout() {
        return this.f24490f;
    }

    public String toString() {
        return "sink(" + this.f24489e + ')';
    }
}
