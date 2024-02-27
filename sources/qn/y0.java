package qn;

import java.io.IOException;

public class y0 implements f, p2 {

    /* renamed from: e  reason: collision with root package name */
    private e0 f31016e;

    y0(e0 e0Var) {
        this.f31016e = e0Var;
    }

    static x0 a(e0 e0Var) {
        return new x0(e0Var.h());
    }

    public z n() {
        try {
            return r();
        } catch (IOException e10) {
            throw new IllegalStateException(e10.getMessage());
        }
    }

    public z r() {
        return a(this.f31016e);
    }
}
