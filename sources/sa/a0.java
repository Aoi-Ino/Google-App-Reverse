package sa;

import bm.a;
import cm.h;
import cm.l;
import pl.c;
import w0.d;

public final /* synthetic */ class a0 implements d.b, h {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ a f16076a;

    public a0(a aVar) {
        l.f(aVar, "function");
        this.f16076a = aVar;
    }

    public final c a() {
        return this.f16076a;
    }

    public final /* synthetic */ boolean b() {
        return ((Boolean) this.f16076a.a()).booleanValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d.b) || !(obj instanceof h)) {
            return false;
        }
        return l.a(a(), ((h) obj).a());
    }

    public final int hashCode() {
        return a().hashCode();
    }
}
