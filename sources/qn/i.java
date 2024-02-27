package qn;

import java.io.IOException;

public class i extends IOException {

    /* renamed from: e  reason: collision with root package name */
    private Throwable f30932e;

    i(String str) {
        super(str);
    }

    public Throwable getCause() {
        return this.f30932e;
    }

    i(String str, Throwable th2) {
        super(str);
        this.f30932e = th2;
    }
}
