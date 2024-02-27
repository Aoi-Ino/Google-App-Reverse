package pl;

import cm.l;
import java.io.Serializable;

public final class o implements Serializable {

    /* renamed from: e  reason: collision with root package name */
    private final Object f30424e;

    /* renamed from: f  reason: collision with root package name */
    private final Object f30425f;

    public o(Object obj, Object obj2) {
        this.f30424e = obj;
        this.f30425f = obj2;
    }

    public final Object a() {
        return this.f30424e;
    }

    public final Object b() {
        return this.f30425f;
    }

    public final Object c() {
        return this.f30424e;
    }

    public final Object d() {
        return this.f30425f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return l.a(this.f30424e, oVar.f30424e) && l.a(this.f30425f, oVar.f30425f);
    }

    public int hashCode() {
        Object obj = this.f30424e;
        int i10 = 0;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f30425f;
        if (obj2 != null) {
            i10 = obj2.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        return '(' + this.f30424e + ", " + this.f30425f + ')';
    }
}
