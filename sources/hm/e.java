package hm;

import cm.l;

abstract class e {
    public static final void a(boolean z10, Number number) {
        l.f(number, "step");
        if (!z10) {
            throw new IllegalArgumentException("Step must be positive, was: " + number + '.');
        }
    }
}
