package tl;

import bm.p;
import cm.l;
import cm.m;
import java.io.Serializable;
import tl.g;

public final class c implements g, Serializable {

    /* renamed from: e  reason: collision with root package name */
    private final g f31677e;

    /* renamed from: f  reason: collision with root package name */
    private final g.b f31678f;

    static final class a extends m implements p {

        /* renamed from: e  reason: collision with root package name */
        public static final a f31679e = new a();

        a() {
            super(2);
        }

        /* renamed from: b */
        public final String h(String str, g.b bVar) {
            l.f(str, "acc");
            l.f(bVar, "element");
            if (str.length() == 0) {
                return bVar.toString();
            }
            return str + ", " + bVar;
        }
    }

    public c(g gVar, g.b bVar) {
        l.f(gVar, "left");
        l.f(bVar, "element");
        this.f31677e = gVar;
        this.f31678f = bVar;
    }

    private final boolean a(g.b bVar) {
        return l.a(f(bVar.getKey()), bVar);
    }

    private final boolean b(c cVar) {
        while (a(cVar.f31678f)) {
            g gVar = cVar.f31677e;
            if (gVar instanceof c) {
                cVar = (c) gVar;
            } else {
                l.d(gVar, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                return a((g.b) gVar);
            }
        }
        return false;
    }

    private final int d() {
        int i10 = 2;
        c cVar = this;
        while (true) {
            g gVar = cVar.f31677e;
            cVar = gVar instanceof c ? (c) gVar : null;
            if (cVar == null) {
                return i10;
            }
            i10++;
        }
    }

    public Object X(Object obj, p pVar) {
        l.f(pVar, "operation");
        return pVar.h(this.f31677e.X(obj, pVar), this.f31678f);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (cVar.d() != d() || !cVar.b(this)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public g.b f(g.c cVar) {
        l.f(cVar, "key");
        c cVar2 = this;
        while (true) {
            g.b f10 = cVar2.f31678f.f(cVar);
            if (f10 != null) {
                return f10;
            }
            g gVar = cVar2.f31677e;
            if (!(gVar instanceof c)) {
                return gVar.f(cVar);
            }
            cVar2 = (c) gVar;
        }
    }

    public g g(g.c cVar) {
        l.f(cVar, "key");
        if (this.f31678f.f(cVar) != null) {
            return this.f31677e;
        }
        g g10 = this.f31677e.g(cVar);
        if (g10 == this.f31677e) {
            return this;
        }
        return g10 == h.f31683e ? this.f31678f : new c(g10, this.f31678f);
    }

    public int hashCode() {
        return this.f31677e.hashCode() + this.f31678f.hashCode();
    }

    public g l(g gVar) {
        return g.a.a(this, gVar);
    }

    public String toString() {
        return '[' + ((String) X("", a.f31679e)) + ']';
    }
}
