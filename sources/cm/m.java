package cm;

import java.io.Serializable;

public abstract class m implements i, Serializable {
    private final int arity;

    public m(int i10) {
        this.arity = i10;
    }

    public int getArity() {
        return this.arity;
    }

    public String toString() {
        String f10 = v.f(this);
        l.e(f10, "renderLambdaToString(this)");
        return f10;
    }
}
