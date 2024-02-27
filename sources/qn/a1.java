package qn;

import java.io.IOException;

public class a1 implements f, p2 {

    /* renamed from: e  reason: collision with root package name */
    private e0 f30877e;

    a1(e0 e0Var) {
        this.f30877e = e0Var;
    }

    static z0 a(e0 e0Var) {
        return new z0(e0Var.h());
    }

    public z n() {
        try {
            return r();
        } catch (IOException e10) {
            throw new y(e10.getMessage(), e10);
        }
    }

    public z r() {
        return a(this.f30877e);
    }
}
