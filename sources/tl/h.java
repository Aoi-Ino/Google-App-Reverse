package tl;

import bm.p;
import cm.l;
import java.io.Serializable;
import tl.g;

public final class h implements g, Serializable {

    /* renamed from: e  reason: collision with root package name */
    public static final h f31683e = new h();

    private h() {
    }

    public Object X(Object obj, p pVar) {
        l.f(pVar, "operation");
        return obj;
    }

    public g.b f(g.c cVar) {
        l.f(cVar, "key");
        return null;
    }

    public g g(g.c cVar) {
        l.f(cVar, "key");
        return this;
    }

    public int hashCode() {
        return 0;
    }

    public g l(g gVar) {
        l.f(gVar, "context");
        return gVar;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }
}
