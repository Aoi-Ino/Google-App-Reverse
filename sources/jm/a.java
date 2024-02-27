package jm;

import cm.l;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

public final class a implements g {

    /* renamed from: a  reason: collision with root package name */
    private final AtomicReference f24629a;

    public a(g gVar) {
        l.f(gVar, "sequence");
        this.f24629a = new AtomicReference(gVar);
    }

    public Iterator iterator() {
        g gVar = (g) this.f24629a.getAndSet((Object) null);
        if (gVar != null) {
            return gVar.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
