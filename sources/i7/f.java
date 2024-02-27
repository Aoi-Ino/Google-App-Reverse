package i7;

import java.util.ArrayList;
import java.util.Iterator;

public final class f extends g implements Iterable {

    /* renamed from: e  reason: collision with root package name */
    private final ArrayList f12546e = new ArrayList();

    public void B(g gVar) {
        if (gVar == null) {
            gVar = i.f12547e;
        }
        this.f12546e.add(gVar);
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof f) && ((f) obj).f12546e.equals(this.f12546e));
    }

    public int hashCode() {
        return this.f12546e.hashCode();
    }

    public Iterator iterator() {
        return this.f12546e.iterator();
    }
}
