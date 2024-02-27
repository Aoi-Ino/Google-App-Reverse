package kotlin.coroutines.jvm.internal;

import cm.i;
import cm.l;
import cm.v;
import tl.d;

public abstract class k extends j implements i {

    /* renamed from: e  reason: collision with root package name */
    private final int f24784e;

    public k(int i10, d dVar) {
        super(dVar);
        this.f24784e = i10;
    }

    public int getArity() {
        return this.f24784e;
    }

    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String e10 = v.e(this);
        l.e(e10, "renderLambdaToString(this)");
        return e10;
    }
}
