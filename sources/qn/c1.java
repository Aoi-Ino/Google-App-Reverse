package qn;

import java.io.IOException;

public class c1 implements f, p2 {

    /* renamed from: e  reason: collision with root package name */
    final int f30890e;

    /* renamed from: f  reason: collision with root package name */
    final int f30891f;

    /* renamed from: g  reason: collision with root package name */
    final e0 f30892g;

    c1(int i10, int i11, e0 e0Var) {
        this.f30890e = i10;
        this.f30891f = i11;
        this.f30892g = e0Var;
    }

    public z n() {
        try {
            return r();
        } catch (IOException e10) {
            throw new y(e10.getMessage());
        }
    }

    public z r() {
        return this.f30892g.c(this.f30890e, this.f30891f);
    }
}
