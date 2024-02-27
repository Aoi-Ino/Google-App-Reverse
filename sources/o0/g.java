package o0;

import androidx.fragment.app.i;
import cm.l;

public abstract class g extends RuntimeException {

    /* renamed from: e  reason: collision with root package name */
    private final i f14336e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(i iVar, String str) {
        super(str);
        l.f(iVar, "fragment");
        this.f14336e = iVar;
    }

    public final i a() {
        return this.f14336e;
    }
}
