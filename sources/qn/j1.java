package qn;

import java.io.IOException;

public class j1 implements f, p2 {

    /* renamed from: e  reason: collision with root package name */
    private e0 f30943e;

    public j1(e0 e0Var) {
        this.f30943e = e0Var;
    }

    static f2 a(e0 e0Var) {
        try {
            return new f2(e0Var.h());
        } catch (IllegalArgumentException e10) {
            throw new i(e10.getMessage(), e10);
        }
    }

    public z n() {
        try {
            return r();
        } catch (IOException e10) {
            throw new y("unable to get DER object", e10);
        } catch (IllegalArgumentException e11) {
            throw new y("unable to get DER object", e11);
        }
    }

    public z r() {
        return a(this.f30943e);
    }
}
