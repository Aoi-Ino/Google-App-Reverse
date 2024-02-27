package qn;

import java.io.IOException;

public class l2 implements f, p2 {

    /* renamed from: e  reason: collision with root package name */
    private e0 f30955e;

    l2(e0 e0Var) {
        this.f30955e = e0Var;
    }

    public z n() {
        try {
            return r();
        } catch (IOException e10) {
            throw new y(e10.getMessage(), e10);
        }
    }

    public z r() {
        return g2.b(this.f30955e.h());
    }
}
