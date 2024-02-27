package hp;

import java.util.Iterator;
import java.util.LinkedHashMap;

class p extends LinkedHashMap implements y {

    /* renamed from: e  reason: collision with root package name */
    private final o f24305e;

    protected p(o oVar) {
        this.f24305e = oVar;
    }

    private void r(f fVar) {
        Iterator it = fVar.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            m mVar = new m(this.f24305e, aVar);
            if (!aVar.c()) {
                put(mVar.getName(), mVar);
            }
        }
    }

    /* renamed from: F */
    public o P(String str, String str2) {
        m mVar = new m(this.f24305e, str, str2);
        if (str != null) {
            put(str, mVar);
        }
        return mVar;
    }

    /* renamed from: T */
    public o remove(String str) {
        return (o) super.remove(str);
    }

    public Iterator iterator() {
        return keySet().iterator();
    }

    /* renamed from: v */
    public o i(String str) {
        return (o) super.get(str);
    }

    public p(o oVar, f fVar) {
        this.f24305e = oVar;
        r(fVar);
    }
}
