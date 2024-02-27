package kotlin.coroutines.jvm.internal;

import cm.i;
import cm.v;
import tl.d;

public abstract class l extends d implements i {

    /* renamed from: e  reason: collision with root package name */
    private final int f24785e;

    public l(int i10, d dVar) {
        super(dVar);
        this.f24785e = i10;
    }

    public int getArity() {
        return this.f24785e;
    }

    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String e10 = v.e(this);
        cm.l.e(e10, "renderLambdaToString(this)");
        return e10;
    }
}
