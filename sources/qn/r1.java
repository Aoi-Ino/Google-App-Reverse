package qn;

import java.io.IOException;
import java.io.InputStream;

public class r1 implements w {

    /* renamed from: e  reason: collision with root package name */
    private o2 f30984e;

    r1(o2 o2Var) {
        this.f30984e = o2Var;
    }

    public InputStream l() {
        return this.f30984e;
    }

    public z n() {
        try {
            return r();
        } catch (IOException e10) {
            throw new y("IOException converting stream to byte array: " + e10.getMessage(), e10);
        }
    }

    public z r() {
        return new q1(this.f30984e.h());
    }
}
