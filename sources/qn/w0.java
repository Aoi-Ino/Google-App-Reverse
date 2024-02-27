package qn;

import cp.a;
import java.io.IOException;
import java.io.InputStream;

public class w0 implements w {

    /* renamed from: e  reason: collision with root package name */
    private e0 f31013e;

    w0(e0 e0Var) {
        this.f31013e = e0Var;
    }

    static v0 a(e0 e0Var) {
        return new v0(a.c(new e1(e0Var)));
    }

    public InputStream l() {
        return new e1(this.f31013e);
    }

    public z n() {
        try {
            return r();
        } catch (IOException e10) {
            throw new y("IOException converting stream to byte array: " + e10.getMessage(), e10);
        }
    }

    public z r() {
        return a(this.f31013e);
    }
}
