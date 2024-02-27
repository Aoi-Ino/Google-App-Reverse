package in;

import cm.l;
import java.io.IOException;

public abstract class j implements a0 {
    private final a0 delegate;

    public j(a0 a0Var) {
        l.f(a0Var, "delegate");
        this.delegate = a0Var;
    }

    /* renamed from: -deprecated_delegate  reason: not valid java name */
    public final a0 m15deprecated_delegate() {
        return this.delegate;
    }

    public void close() throws IOException {
        this.delegate.close();
    }

    public final a0 delegate() {
        return this.delegate;
    }

    public long read(e eVar, long j10) {
        l.f(eVar, "sink");
        return this.delegate.read(eVar, j10);
    }

    public b0 timeout() {
        return this.delegate.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }
}
