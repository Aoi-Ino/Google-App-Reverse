package i7;

import java.util.Set;
import k7.h;

public final class j extends g {

    /* renamed from: e  reason: collision with root package name */
    private final h f12548e = new h(false);

    public void B(String str, g gVar) {
        h hVar = this.f12548e;
        if (gVar == null) {
            gVar = i.f12547e;
        }
        hVar.put(str, gVar);
    }

    public void E(String str, String str2) {
        B(str, str2 == null ? i.f12547e : new l(str2));
    }

    public Set F() {
        return this.f12548e.entrySet();
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof j) && ((j) obj).f12548e.equals(this.f12548e));
    }

    public int hashCode() {
        return this.f12548e.hashCode();
    }
}
