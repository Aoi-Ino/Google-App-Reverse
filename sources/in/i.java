package in;

import cm.l;

public abstract class i implements y {

    /* renamed from: e  reason: collision with root package name */
    private final y f24472e;

    public i(y yVar) {
        l.f(yVar, "delegate");
        this.f24472e = yVar;
    }

    public void b0(e eVar, long j10) {
        l.f(eVar, "source");
        this.f24472e.b0(eVar, j10);
    }

    public void close() {
        this.f24472e.close();
    }

    public void flush() {
        this.f24472e.flush();
    }

    public b0 timeout() {
        return this.f24472e.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.f24472e + ')';
    }
}
