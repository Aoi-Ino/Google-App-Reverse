package lm;

public abstract class v1 extends a0 {
    public abstract v1 E0();

    /* access modifiers changed from: protected */
    public final String F0() {
        v1 v1Var;
        v1 c10 = q0.c();
        if (this == c10) {
            return "Dispatchers.Main";
        }
        try {
            v1Var = c10.E0();
        } catch (UnsupportedOperationException unused) {
            v1Var = null;
        }
        if (this == v1Var) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }
}
