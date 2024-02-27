package qn;

import cp.a;
import java.io.IOException;
import java.io.InputStream;

public class t0 implements d {

    /* renamed from: e  reason: collision with root package name */
    private e0 f30992e;

    /* renamed from: f  reason: collision with root package name */
    private d1 f30993f;

    t0(e0 e0Var) {
        this.f30992e = e0Var;
    }

    static s0 a(e0 e0Var) {
        d1 d1Var = new d1(e0Var, false);
        return new s0(a.c(d1Var), d1Var.e());
    }

    public z n() {
        try {
            return r();
        } catch (IOException e10) {
            throw new y("IOException converting stream to byte array: " + e10.getMessage(), e10);
        }
    }

    public int o() {
        return this.f30993f.e();
    }

    public z r() {
        return a(this.f30992e);
    }

    public InputStream s() {
        d1 d1Var = new d1(this.f30992e, false);
        this.f30993f = d1Var;
        return d1Var;
    }
}
