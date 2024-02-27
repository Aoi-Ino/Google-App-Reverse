package lm;

public class n1 extends r1 implements s {

    /* renamed from: g  reason: collision with root package name */
    private final boolean f24985g = I0();

    public n1(k1 k1Var) {
        super(true);
        e0(k1Var);
    }

    private final boolean I0() {
        r1 y10;
        p W = W();
        q qVar = W instanceof q ? (q) W : null;
        if (!(qVar == null || (y10 = qVar.y()) == null)) {
            while (!y10.T()) {
                p W2 = y10.W();
                q qVar2 = W2 instanceof q ? (q) W2 : null;
                if (qVar2 != null) {
                    y10 = qVar2.y();
                    if (y10 == null) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public boolean T() {
        return this.f24985g;
    }

    public boolean U() {
        return true;
    }
}
